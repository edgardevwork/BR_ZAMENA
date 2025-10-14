package com.bumptech.glide.load.engine;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.EngineResource;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.request.ResourceCallback;
import com.bumptech.glide.util.Executors;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class EngineJob<R> implements DecodeJob.Callback<R>, FactoryPools.Poolable {
    public static final EngineResourceFactory DEFAULT_FACTORY = new EngineResourceFactory();
    public final GlideExecutor animationExecutor;
    public final ResourceCallbacksAndExecutors cbs;
    public DataSource dataSource;
    public DecodeJob<R> decodeJob;
    public final GlideExecutor diskCacheExecutor;
    public final EngineJobListener engineJobListener;
    public EngineResource<?> engineResource;
    public final EngineResourceFactory engineResourceFactory;
    public GlideException exception;
    public boolean hasLoadFailed;
    public boolean hasResource;
    public boolean isCacheable;
    public volatile boolean isCancelled;
    public boolean isLoadedFromAlternateCacheKey;
    public Key key;
    public boolean onlyRetrieveFromCache;
    public final AtomicInteger pendingCallbacks;
    public final Pools.Pool<EngineJob<?>> pool;
    public Resource<?> resource;
    public final EngineResource.ResourceListener resourceListener;
    public final GlideExecutor sourceExecutor;
    public final GlideExecutor sourceUnlimitedExecutor;
    public final StateVerifier stateVerifier;
    public boolean useAnimationPool;
    public boolean useUnlimitedSourceGeneratorPool;

    public EngineJob(GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, EngineJobListener engineJobListener, EngineResource.ResourceListener resourceListener, Pools.Pool<EngineJob<?>> pool) {
        this(glideExecutor, glideExecutor2, glideExecutor3, glideExecutor4, engineJobListener, resourceListener, pool, DEFAULT_FACTORY);
    }

    @VisibleForTesting
    public EngineJob(GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, EngineJobListener engineJobListener, EngineResource.ResourceListener resourceListener, Pools.Pool<EngineJob<?>> pool, EngineResourceFactory engineResourceFactory) {
        this.cbs = new ResourceCallbacksAndExecutors();
        this.stateVerifier = StateVerifier.newInstance();
        this.pendingCallbacks = new AtomicInteger();
        this.diskCacheExecutor = glideExecutor;
        this.sourceExecutor = glideExecutor2;
        this.sourceUnlimitedExecutor = glideExecutor3;
        this.animationExecutor = glideExecutor4;
        this.engineJobListener = engineJobListener;
        this.resourceListener = resourceListener;
        this.pool = pool;
        this.engineResourceFactory = engineResourceFactory;
    }

    @VisibleForTesting
    public synchronized EngineJob<R> init(Key key, boolean z, boolean z2, boolean z3, boolean z4) {
        this.key = key;
        this.isCacheable = z;
        this.useUnlimitedSourceGeneratorPool = z2;
        this.useAnimationPool = z3;
        this.onlyRetrieveFromCache = z4;
        return this;
    }

    public synchronized void start(DecodeJob<R> decodeJob) {
        try {
            this.decodeJob = decodeJob;
            (decodeJob.willDecodeFromCache() ? this.diskCacheExecutor : getActiveSourceExecutor()).execute(decodeJob);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void addCallback(ResourceCallback resourceCallback, Executor executor) {
        try {
            this.stateVerifier.throwIfRecycled();
            this.cbs.add(resourceCallback, executor);
            if (this.hasResource) {
                incrementPendingCallbacks(1);
                executor.execute(new CallResourceReady(resourceCallback));
            } else if (this.hasLoadFailed) {
                incrementPendingCallbacks(1);
                executor.execute(new CallLoadFailed(resourceCallback));
            } else {
                Preconditions.checkArgument(!this.isCancelled, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @GuardedBy("this")
    public void callCallbackOnResourceReady(ResourceCallback resourceCallback) {
        try {
            resourceCallback.onResourceReady(this.engineResource, this.dataSource, this.isLoadedFromAlternateCacheKey);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    @GuardedBy("this")
    public void callCallbackOnLoadFailed(ResourceCallback resourceCallback) {
        try {
            resourceCallback.onLoadFailed(this.exception);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    public synchronized void removeCallback(ResourceCallback resourceCallback) {
        try {
            this.stateVerifier.throwIfRecycled();
            this.cbs.remove(resourceCallback);
            if (this.cbs.isEmpty()) {
                cancel();
                if (this.hasResource || this.hasLoadFailed) {
                    if (this.pendingCallbacks.get() == 0) {
                        release();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean onlyRetrieveFromCache() {
        return this.onlyRetrieveFromCache;
    }

    public final GlideExecutor getActiveSourceExecutor() {
        if (this.useUnlimitedSourceGeneratorPool) {
            return this.sourceUnlimitedExecutor;
        }
        return this.useAnimationPool ? this.animationExecutor : this.sourceExecutor;
    }

    public void cancel() {
        if (isDone()) {
            return;
        }
        this.isCancelled = true;
        this.decodeJob.cancel();
        this.engineJobListener.onEngineJobCancelled(this, this.key);
    }

    public synchronized boolean isCancelled() {
        return this.isCancelled;
    }

    public final boolean isDone() {
        return this.hasLoadFailed || this.hasResource || this.isCancelled;
    }

    public void notifyCallbacksOfResult() {
        synchronized (this) {
            try {
                this.stateVerifier.throwIfRecycled();
                if (this.isCancelled) {
                    this.resource.recycle();
                    release();
                    return;
                }
                if (this.cbs.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.hasResource) {
                    throw new IllegalStateException("Already have resource");
                }
                this.engineResource = this.engineResourceFactory.build(this.resource, this.isCacheable, this.key, this.resourceListener);
                this.hasResource = true;
                ResourceCallbacksAndExecutors resourceCallbacksAndExecutorsCopy = this.cbs.copy();
                incrementPendingCallbacks(resourceCallbacksAndExecutorsCopy.size() + 1);
                this.engineJobListener.onEngineJobComplete(this, this.key, this.engineResource);
                Iterator<ResourceCallbackAndExecutor> it = resourceCallbacksAndExecutorsCopy.iterator();
                while (it.hasNext()) {
                    ResourceCallbackAndExecutor next = it.next();
                    next.executor.execute(new CallResourceReady(next.f522cb));
                }
                decrementPendingCallbacks();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void incrementPendingCallbacks(int i) {
        EngineResource<?> engineResource;
        Preconditions.checkArgument(isDone(), "Not yet complete!");
        if (this.pendingCallbacks.getAndAdd(i) == 0 && (engineResource = this.engineResource) != null) {
            engineResource.acquire();
        }
    }

    public void decrementPendingCallbacks() {
        EngineResource<?> engineResource;
        synchronized (this) {
            try {
                this.stateVerifier.throwIfRecycled();
                Preconditions.checkArgument(isDone(), "Not yet complete!");
                int iDecrementAndGet = this.pendingCallbacks.decrementAndGet();
                Preconditions.checkArgument(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    engineResource = this.engineResource;
                    release();
                } else {
                    engineResource = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (engineResource != null) {
            engineResource.release();
        }
    }

    private synchronized void release() {
        if (this.key == null) {
            throw new IllegalArgumentException();
        }
        this.cbs.clear();
        this.key = null;
        this.engineResource = null;
        this.resource = null;
        this.hasLoadFailed = false;
        this.isCancelled = false;
        this.hasResource = false;
        this.isLoadedFromAlternateCacheKey = false;
        this.decodeJob.release(false);
        this.decodeJob = null;
        this.exception = null;
        this.dataSource = null;
        this.pool.release(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.DecodeJob.Callback
    public void onResourceReady(Resource<R> resource, DataSource dataSource, boolean z) {
        synchronized (this) {
            this.resource = resource;
            this.dataSource = dataSource;
            this.isLoadedFromAlternateCacheKey = z;
        }
        notifyCallbacksOfResult();
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.Callback
    public void onLoadFailed(GlideException glideException) {
        synchronized (this) {
            this.exception = glideException;
        }
        notifyCallbacksOfException();
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.Callback
    public void reschedule(DecodeJob<?> decodeJob) {
        getActiveSourceExecutor().execute(decodeJob);
    }

    public void notifyCallbacksOfException() {
        synchronized (this) {
            try {
                this.stateVerifier.throwIfRecycled();
                if (this.isCancelled) {
                    release();
                    return;
                }
                if (this.cbs.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.hasLoadFailed) {
                    throw new IllegalStateException("Already failed once");
                }
                this.hasLoadFailed = true;
                Key key = this.key;
                ResourceCallbacksAndExecutors resourceCallbacksAndExecutorsCopy = this.cbs.copy();
                incrementPendingCallbacks(resourceCallbacksAndExecutorsCopy.size() + 1);
                this.engineJobListener.onEngineJobComplete(this, key, null);
                Iterator<ResourceCallbackAndExecutor> it = resourceCallbacksAndExecutorsCopy.iterator();
                while (it.hasNext()) {
                    ResourceCallbackAndExecutor next = it.next();
                    next.executor.execute(new CallLoadFailed(next.f522cb));
                }
                decrementPendingCallbacks();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    @NonNull
    public StateVerifier getVerifier() {
        return this.stateVerifier;
    }

    /* loaded from: classes2.dex */
    public class CallLoadFailed implements Runnable {

        /* renamed from: cb */
        public final ResourceCallback f520cb;

        public CallLoadFailed(ResourceCallback resourceCallback) {
            this.f520cb = resourceCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f520cb.getLock()) {
                synchronized (EngineJob.this) {
                    try {
                        if (EngineJob.this.cbs.contains(this.f520cb)) {
                            EngineJob.this.callCallbackOnLoadFailed(this.f520cb);
                        }
                        EngineJob.this.decrementPendingCallbacks();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class CallResourceReady implements Runnable {

        /* renamed from: cb */
        public final ResourceCallback f521cb;

        public CallResourceReady(ResourceCallback resourceCallback) {
            this.f521cb = resourceCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f521cb.getLock()) {
                synchronized (EngineJob.this) {
                    try {
                        if (EngineJob.this.cbs.contains(this.f521cb)) {
                            EngineJob.this.engineResource.acquire();
                            EngineJob.this.callCallbackOnResourceReady(this.f521cb);
                            EngineJob.this.removeCallback(this.f521cb);
                        }
                        EngineJob.this.decrementPendingCallbacks();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class ResourceCallbacksAndExecutors implements Iterable<ResourceCallbackAndExecutor> {
        public final List<ResourceCallbackAndExecutor> callbacksAndExecutors;

        public ResourceCallbacksAndExecutors() {
            this(new ArrayList(2));
        }

        public ResourceCallbacksAndExecutors(List<ResourceCallbackAndExecutor> list) {
            this.callbacksAndExecutors = list;
        }

        public void add(ResourceCallback resourceCallback, Executor executor) {
            this.callbacksAndExecutors.add(new ResourceCallbackAndExecutor(resourceCallback, executor));
        }

        public void remove(ResourceCallback resourceCallback) {
            this.callbacksAndExecutors.remove(defaultCallbackAndExecutor(resourceCallback));
        }

        public boolean contains(ResourceCallback resourceCallback) {
            return this.callbacksAndExecutors.contains(defaultCallbackAndExecutor(resourceCallback));
        }

        public boolean isEmpty() {
            return this.callbacksAndExecutors.isEmpty();
        }

        public int size() {
            return this.callbacksAndExecutors.size();
        }

        public void clear() {
            this.callbacksAndExecutors.clear();
        }

        public ResourceCallbacksAndExecutors copy() {
            return new ResourceCallbacksAndExecutors(new ArrayList(this.callbacksAndExecutors));
        }

        public static ResourceCallbackAndExecutor defaultCallbackAndExecutor(ResourceCallback resourceCallback) {
            return new ResourceCallbackAndExecutor(resourceCallback, Executors.directExecutor());
        }

        @Override // java.lang.Iterable
        @NonNull
        public Iterator<ResourceCallbackAndExecutor> iterator() {
            return this.callbacksAndExecutors.iterator();
        }
    }

    /* loaded from: classes2.dex */
    public static final class ResourceCallbackAndExecutor {

        /* renamed from: cb */
        public final ResourceCallback f522cb;
        public final Executor executor;

        public ResourceCallbackAndExecutor(ResourceCallback resourceCallback, Executor executor) {
            this.f522cb = resourceCallback;
            this.executor = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ResourceCallbackAndExecutor) {
                return this.f522cb.equals(((ResourceCallbackAndExecutor) obj).f522cb);
            }
            return false;
        }

        public int hashCode() {
            return this.f522cb.hashCode();
        }
    }

    @VisibleForTesting
    /* loaded from: classes2.dex */
    public static class EngineResourceFactory {
        public <R> EngineResource<R> build(Resource<R> resource, boolean z, Key key, EngineResource.ResourceListener resourceListener) {
            return new EngineResource<>(resource, z, true, key, resourceListener);
        }
    }
}
