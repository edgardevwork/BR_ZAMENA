package com.google.common.eventbus;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.j2objc.annotations.Weak;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: classes7.dex */
public class Subscriber {

    @Weak
    public EventBus bus;
    public final Executor executor;
    public final Method method;

    @VisibleForTesting
    public final Object target;

    public /* synthetic */ Subscriber(EventBus eventBus, Object obj, Method method, C74131 c74131) {
        this(eventBus, obj, method);
    }

    public static Subscriber create(EventBus bus, Object listener, Method method) {
        if (isDeclaredThreadSafe(method)) {
            return new Subscriber(bus, listener, method);
        }
        return new SynchronizedSubscriber(bus, listener, method);
    }

    public Subscriber(EventBus bus, Object target, Method method) throws SecurityException {
        this.bus = bus;
        this.target = Preconditions.checkNotNull(target);
        this.method = method;
        method.setAccessible(true);
        this.executor = bus.executor();
    }

    public final void dispatchEvent(final Object event) {
        this.executor.execute(new Runnable() { // from class: com.google.common.eventbus.Subscriber$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, IllegalArgumentException {
                this.f$0.lambda$dispatchEvent$0(event);
            }
        });
    }

    public final /* synthetic */ void lambda$dispatchEvent$0(Object obj) throws IllegalAccessException, IllegalArgumentException {
        try {
            invokeSubscriberMethod(obj);
        } catch (InvocationTargetException e) {
            this.bus.handleSubscriberException(e.getCause(), context(obj));
        }
    }

    @VisibleForTesting
    public void invokeSubscriberMethod(Object event) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.method.invoke(this.target, Preconditions.checkNotNull(event));
        } catch (IllegalAccessException e) {
            throw new Error("Method became inaccessible: " + event, e);
        } catch (IllegalArgumentException e2) {
            throw new Error("Method rejected target/argument: " + event, e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof Error) {
                throw ((Error) e3.getCause());
            }
            throw e3;
        }
    }

    public final SubscriberExceptionContext context(Object event) {
        return new SubscriberExceptionContext(this.bus, event, this.target, this.method);
    }

    public final int hashCode() {
        return ((this.method.hashCode() + 31) * 31) + System.identityHashCode(this.target);
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof Subscriber)) {
            return false;
        }
        Subscriber subscriber = (Subscriber) obj;
        return this.target == subscriber.target && this.method.equals(subscriber.method);
    }

    public static boolean isDeclaredThreadSafe(Method method) {
        return method.getAnnotation(AllowConcurrentEvents.class) != null;
    }

    @VisibleForTesting
    /* loaded from: classes8.dex */
    public static final class SynchronizedSubscriber extends Subscriber {
        public /* synthetic */ SynchronizedSubscriber(EventBus eventBus, Object obj, Method method, C74131 c74131) {
            this(eventBus, obj, method);
        }

        public SynchronizedSubscriber(EventBus bus, Object target, Method method) {
            super(bus, target, method);
        }

        @Override // com.google.common.eventbus.Subscriber
        public void invokeSubscriberMethod(Object event) throws InvocationTargetException {
            synchronized (this) {
                super.invokeSubscriberMethod(event);
            }
        }
    }
}
