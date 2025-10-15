package io.ktor.client.plugins.cache.storage;

import io.ktor.http.Url;
import io.ktor.util.collections.ConcurrentMap;
import io.ktor.util.collections.ConcurrentSetKt;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UnlimitedCacheStorage.kt */
@Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J/\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\t\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J!\u0010\u0003\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0013R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m7105d2 = {"Lio/ktor/client/plugins/cache/storage/UnlimitedStorage;", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "()V", "store", "Lio/ktor/util/collections/ConcurrentMap;", "Lio/ktor/http/Url;", "", "Lio/ktor/client/plugins/cache/storage/CachedResponseData;", "find", "url", "varyKeys", "", "", "(Lio/ktor/http/Url;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findAll", "", "(Lio/ktor/http/Url;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "data", "(Lio/ktor/http/Url;Lio/ktor/client/plugins/cache/storage/CachedResponseData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nUnlimitedCacheStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnlimitedCacheStorage.kt\nio/ktor/client/plugins/cache/storage/UnlimitedStorage\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,54:1\n167#2,3:55\n*S KotlinDebug\n*F\n+ 1 UnlimitedCacheStorage.kt\nio/ktor/client/plugins/cache/storage/UnlimitedStorage\n*L\n48#1:55,3\n*E\n"})
/* loaded from: classes7.dex */
public final class UnlimitedStorage implements CacheStorage {

    @NotNull
    public final ConcurrentMap<Url, Set<CachedResponseData>> store = new ConcurrentMap<>(0, 1, null);

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    @Nullable
    public Object store(@NotNull Url url, @NotNull CachedResponseData cachedResponseData, @NotNull Continuation<? super Unit> continuation) {
        Set<CachedResponseData> setComputeIfAbsent = this.store.computeIfAbsent((ConcurrentMap<Url, Set<CachedResponseData>>) url, (Function0<? extends Set<CachedResponseData>>) new Function0<Set<CachedResponseData>>() { // from class: io.ktor.client.plugins.cache.storage.UnlimitedStorage$store$cache$1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Set<CachedResponseData> invoke() {
                return ConcurrentSetKt.ConcurrentSet();
            }
        });
        if (!setComputeIfAbsent.add(cachedResponseData)) {
            setComputeIfAbsent.remove(cachedResponseData);
            setComputeIfAbsent.add(cachedResponseData);
        }
        return Unit.INSTANCE;
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    @Nullable
    public Object find(@NotNull Url url, @NotNull Map<String, String> map, @NotNull Continuation<? super CachedResponseData> continuation) {
        for (Object obj : this.store.computeIfAbsent((ConcurrentMap<Url, Set<CachedResponseData>>) url, (Function0<? extends Set<CachedResponseData>>) new Function0<Set<CachedResponseData>>() { // from class: io.ktor.client.plugins.cache.storage.UnlimitedStorage$find$data$1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Set<CachedResponseData> invoke() {
                return ConcurrentSetKt.ConcurrentSet();
            }
        })) {
            CachedResponseData cachedResponseData = (CachedResponseData) obj;
            if (map.isEmpty()) {
                return obj;
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (!Intrinsics.areEqual(cachedResponseData.getVaryKeys().get(key), entry.getValue())) {
                    break;
                }
            }
            return obj;
        }
        return null;
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    @Nullable
    public Object findAll(@NotNull Url url, @NotNull Continuation<? super Set<CachedResponseData>> continuation) {
        Set<CachedResponseData> set = this.store.get(url);
        return set == null ? SetsKt__SetsKt.emptySet() : set;
    }
}
