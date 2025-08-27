package io.cx.platform.events;

import io.cx.platform.events.jobs.JobEvents;
import io.cx.platform.events.resources.ServingResourceEvents;
import io.smallrye.mutiny.Uni;
import io.vertx.core.json.JsonObject;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Optional.ofNullable;

public interface EventsRegistry {

    String EVENT_TYPE = "eventType";
    String INCOMING_EVENTS = "incoming-io.cx.platform.events";
    String OUTGOING_EVENTS = "outgoing-io.cx.platform.events";
    String CODEC_PREFIX = "Codec";

    List<Class<? extends BaseEvent>> events = Stream.of(
                    JobEvents.class,
                    ServingResourceEvents.class)
            .map(Class::getPermittedSubclasses)
            .flatMap(Arrays::stream)
            .map(c -> (Class<? extends BaseEvent>) c)
            .collect(Collectors.toList());

    <V, T extends BaseEvent> void sendAndForget(Class<T> eventClass, V value);

    Uni<Void> convertAndPassOn(JsonObject request);

    default Optional<? extends BaseEvent> toEvent(JsonObject json) {

        return ofNullable(json)
                .map(j -> j.getString(EVENT_TYPE))
                .map(String::trim)
                .map(eventType -> events.stream()
                        .filter(c -> eventType.equalsIgnoreCase(c.getSimpleName()))
                        .map(json::mapTo))
                .flatMap(Stream::findFirst);
    }

    static <V extends BaseEvent> String getCodecName(V event) {
        return getCodecName(event.getClass());
    }

    static <V extends BaseEvent> String getCodecName(Class<V> event) {
        return event.getSimpleName() + CODEC_PREFIX;
    }
}