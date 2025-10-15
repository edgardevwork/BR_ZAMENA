package com.google.common.eventbus;

import com.google.common.base.Preconditions;
import java.lang.reflect.Method;

@ElementTypesAreNonnullByDefault
/* loaded from: classes7.dex */
public class SubscriberExceptionContext {
    public final Object event;
    public final EventBus eventBus;
    public final Object subscriber;
    public final Method subscriberMethod;

    public SubscriberExceptionContext(EventBus eventBus, Object event, Object subscriber, Method subscriberMethod) {
        this.eventBus = (EventBus) Preconditions.checkNotNull(eventBus);
        this.event = Preconditions.checkNotNull(event);
        this.subscriber = Preconditions.checkNotNull(subscriber);
        this.subscriberMethod = (Method) Preconditions.checkNotNull(subscriberMethod);
    }

    public EventBus getEventBus() {
        return this.eventBus;
    }

    public Object getEvent() {
        return this.event;
    }

    public Object getSubscriber() {
        return this.subscriber;
    }

    public Method getSubscriberMethod() {
        return this.subscriberMethod;
    }
}
