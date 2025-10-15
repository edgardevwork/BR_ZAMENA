package io.ktor.client.plugins.cache.storage;

import io.ktor.http.Url;
import io.ktor.util.collections.ConcurrentMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FileCacheStorage.kt */
@Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J/\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J!\u0010\u0004\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m7105d2 = {"Lio/ktor/client/plugins/cache/storage/CachingCacheStorage;", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "delegate", "(Lio/ktor/client/plugins/cache/storage/CacheStorage;)V", "store", "Lio/ktor/util/collections/ConcurrentMap;", "Lio/ktor/http/Url;", "", "Lio/ktor/client/plugins/cache/storage/CachedResponseData;", "find", "url", "varyKeys", "", "", "(Lio/ktor/http/Url;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findAll", "(Lio/ktor/http/Url;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "data", "(Lio/ktor/http/Url;Lio/ktor/client/plugins/cache/storage/CachedResponseData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFileCacheStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileCacheStorage.kt\nio/ktor/client/plugins/cache/storage/CachingCacheStorage\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,196:1\n167#2,3:197\n*S KotlinDebug\n*F\n+ 1 FileCacheStorage.kt\nio/ktor/client/plugins/cache/storage/CachingCacheStorage\n*L\n47#1:197,3\n*E\n"})
/* loaded from: classes7.dex */
public final class CachingCacheStorage implements CacheStorage {

    @NotNull
    public final CacheStorage delegate;

    @NotNull
    public final ConcurrentMap<Url, Set<CachedResponseData>> store;

    /* compiled from: FileCacheStorage.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", m7120f = "FileCacheStorage.kt", m7121i = {0, 0, 0}, m7122l = {43}, m7123m = "find", m7124n = {"this", "url", "varyKeys"}, m7125s = {"L$0", "L$1", "L$2"})
    /* renamed from: io.ktor.client.plugins.cache.storage.CachingCacheStorage$find$1 */
    public static final class C101671 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C101671(Continuation<? super C101671> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CachingCacheStorage.this.find(null, null, this);
        }
    }

    /* compiled from: FileCacheStorage.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", m7120f = "FileCacheStorage.kt", m7121i = {0, 0}, m7122l = {53}, m7123m = "findAll", m7124n = {"this", "url"}, m7125s = {"L$0", "L$1"})
    /* renamed from: io.ktor.client.plugins.cache.storage.CachingCacheStorage$findAll$1 */
    public static final class C101681 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C101681(Continuation<? super C101681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CachingCacheStorage.this.findAll(null, this);
        }
    }

    /* compiled from: FileCacheStorage.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", m7120f = "FileCacheStorage.kt", m7121i = {0, 0}, m7122l = {37, 38}, m7123m = "store", m7124n = {"this", "url"}, m7125s = {"L$0", "L$1"})
    /* renamed from: io.ktor.client.plugins.cache.storage.CachingCacheStorage$store$1 */
    public static final class C101691 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C101691(Continuation<? super C101691> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CachingCacheStorage.this.store(null, null, this);
        }
    }

    public CachingCacheStorage(@NotNull CacheStorage delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
        this.store = new ConcurrentMap<>(0, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object store(@NotNull Url url, @NotNull CachedResponseData cachedResponseData, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C101691 c101691;
        CachingCacheStorage cachingCacheStorage;
        Map map;
        if (continuation instanceof C101691) {
            c101691 = (C101691) continuation;
            int i = c101691.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101691.label = i - Integer.MIN_VALUE;
            } else {
                c101691 = new C101691(continuation);
            }
        }
        Object obj = c101691.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c101691.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            CacheStorage cacheStorage = this.delegate;
            c101691.L$0 = this;
            c101691.L$1 = url;
            c101691.label = 1;
            if (cacheStorage.store(url, cachedResponseData, c101691) == coroutine_suspended) {
                return coroutine_suspended;
            }
            cachingCacheStorage = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                url = (Url) c101691.L$1;
                map = (Map) c101691.L$0;
                ResultKt.throwOnFailure(obj);
                map.put(url, obj);
                return Unit.INSTANCE;
            }
            url = (Url) c101691.L$1;
            cachingCacheStorage = (CachingCacheStorage) c101691.L$0;
            ResultKt.throwOnFailure(obj);
        }
        ConcurrentMap<Url, Set<CachedResponseData>> concurrentMap = cachingCacheStorage.store;
        CacheStorage cacheStorage2 = cachingCacheStorage.delegate;
        c101691.L$0 = concurrentMap;
        c101691.L$1 = url;
        c101691.label = 2;
        Object objFindAll = cacheStorage2.findAll(url, c101691);
        if (objFindAll == coroutine_suspended) {
            return coroutine_suspended;
        }
        obj = objFindAll;
        map = concurrentMap;
        map.put(url, obj);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object find(@NotNull Url url, @NotNull Map<String, String> map, @NotNull Continuation<? super CachedResponseData> continuation) throws Throwable {
        C101671 c101671;
        CachingCacheStorage cachingCacheStorage;
        Url url2;
        Map<String, String> map2;
        Map map3;
        if (continuation instanceof C101671) {
            c101671 = (C101671) continuation;
            int i = c101671.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101671.label = i - Integer.MIN_VALUE;
            } else {
                c101671 = new C101671(continuation);
            }
        }
        Object obj = c101671.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c101671.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.store.containsKey(url)) {
                ConcurrentMap<Url, Set<CachedResponseData>> concurrentMap = this.store;
                CacheStorage cacheStorage = this.delegate;
                c101671.L$0 = this;
                c101671.L$1 = url;
                c101671.L$2 = map;
                c101671.L$3 = concurrentMap;
                c101671.L$4 = url;
                c101671.label = 1;
                Object objFindAll = cacheStorage.findAll(url, c101671);
                if (objFindAll == coroutine_suspended) {
                    return coroutine_suspended;
                }
                url2 = url;
                map2 = map;
                map3 = concurrentMap;
                obj = objFindAll;
                cachingCacheStorage = this;
            } else {
                cachingCacheStorage = this;
                for (Object obj2 : (Set) MapsKt__MapsKt.getValue(cachingCacheStorage.store, url)) {
                    CachedResponseData cachedResponseData = (CachedResponseData) obj2;
                    if (map.isEmpty()) {
                        return obj2;
                    }
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        String key = entry.getKey();
                        if (!Intrinsics.areEqual(cachedResponseData.getVaryKeys().get(key), entry.getValue())) {
                            break;
                        }
                    }
                    return obj2;
                }
                return null;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            url = (Url) c101671.L$4;
            map3 = (Map) c101671.L$3;
            map2 = (Map) c101671.L$2;
            url2 = (Url) c101671.L$1;
            cachingCacheStorage = (CachingCacheStorage) c101671.L$0;
            ResultKt.throwOnFailure(obj);
        }
        map3.put(url, obj);
        map = map2;
        url = url2;
        while (r6.hasNext()) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object findAll(@NotNull Url url, @NotNull Continuation<? super Set<CachedResponseData>> continuation) throws Throwable {
        C101681 c101681;
        CachingCacheStorage cachingCacheStorage;
        Url url2;
        Map map;
        if (continuation instanceof C101681) {
            c101681 = (C101681) continuation;
            int i = c101681.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101681.label = i - Integer.MIN_VALUE;
            } else {
                c101681 = new C101681(continuation);
            }
        }
        Object obj = c101681.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c101681.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.store.containsKey(url)) {
                ConcurrentMap<Url, Set<CachedResponseData>> concurrentMap = this.store;
                CacheStorage cacheStorage = this.delegate;
                c101681.L$0 = this;
                c101681.L$1 = url;
                c101681.L$2 = concurrentMap;
                c101681.L$3 = url;
                c101681.label = 1;
                Object objFindAll = cacheStorage.findAll(url, c101681);
                if (objFindAll == coroutine_suspended) {
                    return coroutine_suspended;
                }
                url2 = url;
                map = concurrentMap;
                obj = objFindAll;
                cachingCacheStorage = this;
            } else {
                cachingCacheStorage = this;
                return MapsKt__MapsKt.getValue(cachingCacheStorage.store, url);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            url = (Url) c101681.L$3;
            map = (Map) c101681.L$2;
            url2 = (Url) c101681.L$1;
            cachingCacheStorage = (CachingCacheStorage) c101681.L$0;
            ResultKt.throwOnFailure(obj);
        }
        map.put(url, obj);
        url = url2;
        return MapsKt__MapsKt.getValue(cachingCacheStorage.store, url);
    }
}
