package io.ktor.client.plugins.cache.storage;

import io.ktor.client.plugins.cache.HttpCacheEntry;
import io.ktor.http.Url;
import io.ktor.util.collections.ConcurrentMap;
import io.ktor.util.collections.ConcurrentSetKt;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UnlimitedCacheStorage.kt */
@Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0007H\u0016R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m7105d2 = {"Lio/ktor/client/plugins/cache/storage/UnlimitedCacheStorage;", "Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "()V", "store", "Lio/ktor/util/collections/ConcurrentMap;", "Lio/ktor/http/Url;", "", "Lio/ktor/client/plugins/cache/HttpCacheEntry;", "find", "url", "varyKeys", "", "", "findByUrl", "", "", "value", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nUnlimitedCacheStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnlimitedCacheStorage.kt\nio/ktor/client/plugins/cache/storage/UnlimitedCacheStorage\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,54:1\n167#2,3:55\n*S KotlinDebug\n*F\n+ 1 UnlimitedCacheStorage.kt\nio/ktor/client/plugins/cache/storage/UnlimitedCacheStorage\n*L\n26#1:55,3\n*E\n"})
/* loaded from: classes7.dex */
public final class UnlimitedCacheStorage extends HttpCacheStorage {

    @NotNull
    public final ConcurrentMap<Url, Set<HttpCacheEntry>> store = new ConcurrentMap<>(0, 1, null);

    @Override // io.ktor.client.plugins.cache.storage.HttpCacheStorage
    public void store(@NotNull Url url, @NotNull HttpCacheEntry value) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(value, "value");
        Set<HttpCacheEntry> setComputeIfAbsent = this.store.computeIfAbsent((ConcurrentMap<Url, Set<HttpCacheEntry>>) url, (Function0<? extends Set<HttpCacheEntry>>) new Function0<Set<HttpCacheEntry>>() { // from class: io.ktor.client.plugins.cache.storage.UnlimitedCacheStorage$store$data$1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Set<HttpCacheEntry> invoke() {
                return ConcurrentSetKt.ConcurrentSet();
            }
        });
        if (setComputeIfAbsent.add(value)) {
            return;
        }
        setComputeIfAbsent.remove(value);
        setComputeIfAbsent.add(value);
    }

    @Override // io.ktor.client.plugins.cache.storage.HttpCacheStorage
    @Nullable
    public HttpCacheEntry find(@NotNull Url url, @NotNull Map<String, String> varyKeys) {
        Object next;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(varyKeys, "varyKeys");
        Iterator<T> it = this.store.computeIfAbsent((ConcurrentMap<Url, Set<HttpCacheEntry>>) url, (Function0<? extends Set<HttpCacheEntry>>) new Function0<Set<HttpCacheEntry>>() { // from class: io.ktor.client.plugins.cache.storage.UnlimitedCacheStorage$find$data$1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Set<HttpCacheEntry> invoke() {
                return ConcurrentSetKt.ConcurrentSet();
            }
        }).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            HttpCacheEntry httpCacheEntry = (HttpCacheEntry) next;
            if (!varyKeys.isEmpty()) {
                for (Map.Entry<String, String> entry : varyKeys.entrySet()) {
                    String key = entry.getKey();
                    if (!Intrinsics.areEqual(httpCacheEntry.getVaryKeys().get(key), entry.getValue())) {
                        break;
                    }
                }
                break loop0;
            }
            break;
        }
        return (HttpCacheEntry) next;
    }

    @Override // io.ktor.client.plugins.cache.storage.HttpCacheStorage
    @NotNull
    public Set<HttpCacheEntry> findByUrl(@NotNull Url url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Set<HttpCacheEntry> set = this.store.get(url);
        return set == null ? SetsKt__SetsKt.emptySet() : set;
    }
}
