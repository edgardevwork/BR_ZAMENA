package com.google.common.eventbus;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.MoreExecutors;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
/* loaded from: classes7.dex */
public class EventBus {
    public static final Logger logger = Logger.getLogger(EventBus.class.getName());
    public final Dispatcher dispatcher;
    public final SubscriberExceptionHandler exceptionHandler;
    public final Executor executor;
    public final String identifier;
    public final SubscriberRegistry subscribers;

    public EventBus() {
        this("default");
    }

    public EventBus(String identifier) {
        this(identifier, MoreExecutors.directExecutor(), Dispatcher.perThreadDispatchQueue(), LoggingHandler.INSTANCE);
    }

    public EventBus(SubscriberExceptionHandler exceptionHandler) {
        this("default", MoreExecutors.directExecutor(), Dispatcher.perThreadDispatchQueue(), exceptionHandler);
    }

    public EventBus(String identifier, Executor executor, Dispatcher dispatcher, SubscriberExceptionHandler exceptionHandler) {
        this.subscribers = new SubscriberRegistry(this);
        this.identifier = (String) Preconditions.checkNotNull(identifier);
        this.executor = (Executor) Preconditions.checkNotNull(executor);
        this.dispatcher = (Dispatcher) Preconditions.checkNotNull(dispatcher);
        this.exceptionHandler = (SubscriberExceptionHandler) Preconditions.checkNotNull(exceptionHandler);
    }

    public final String identifier() {
        return this.identifier;
    }

    public final Executor executor() {
        return this.executor;
    }

    public void handleSubscriberException(Throwable e, SubscriberExceptionContext context) {
        Preconditions.checkNotNull(e);
        Preconditions.checkNotNull(context);
        try {
            this.exceptionHandler.handleException(e, context);
        } catch (Throwable th) {
            logger.log(Level.SEVERE, String.format(Locale.ROOT, "Exception %s thrown while handling exception: %s", th, e), th);
        }
    }

    public void register(Object object) {
        this.subscribers.register(object);
    }

    public void unregister(Object object) {
        this.subscribers.unregister(object);
    }

    public void post(Object event) {
        Iterator<Subscriber> subscribers = this.subscribers.getSubscribers(event);
        if (subscribers.hasNext()) {
            this.dispatcher.dispatch(event, subscribers);
        } else {
            if (event instanceof DeadEvent) {
                return;
            }
            post(new DeadEvent(this, event));
        }
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).addValue(this.identifier).toString();
    }

    /* loaded from: classes8.dex */
    public static final class LoggingHandler implements SubscriberExceptionHandler {
        public static final LoggingHandler INSTANCE = new LoggingHandler();

        @Override // com.google.common.eventbus.SubscriberExceptionHandler
        public void handleException(Throwable exception, SubscriberExceptionContext context) {
            Logger logger = logger(context);
            Level level = Level.SEVERE;
            if (logger.isLoggable(level)) {
                logger.log(level, message(context), exception);
            }
        }

        public static Logger logger(SubscriberExceptionContext context) {
            return Logger.getLogger(EventBus.class.getName() + "." + context.getEventBus().identifier());
        }

        public static String message(SubscriberExceptionContext context) {
            Method subscriberMethod = context.getSubscriberMethod();
            return "Exception thrown by subscriber method " + subscriberMethod.getName() + '(' + subscriberMethod.getParameterTypes()[0].getName() + ") on subscriber " + context.getSubscriber() + " when dispatching event: " + context.getEvent();
        }
    }
}
