package io.ktor.client.plugins.cache.storage;

import io.ktor.client.plugins.cache.HttpCacheEntry;
import io.ktor.http.Url;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DisabledCacheStorage.kt */
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, m7105d2 = {"Lio/ktor/client/plugins/cache/storage/DisabledCacheStorage;", "Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "()V", "find", "Lio/ktor/client/plugins/cache/HttpCacheEntry;", "url", "Lio/ktor/http/Url;", "varyKeys", "", "", "findByUrl", "", "store", "", "value", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class DisabledCacheStorage extends HttpCacheStorage {

    @NotNull
    public static final DisabledCacheStorage INSTANCE = new DisabledCacheStorage();

    @Override // io.ktor.client.plugins.cache.storage.HttpCacheStorage
    @Nullable
    public HttpCacheEntry find(@NotNull Url url, @NotNull Map<String, String> varyKeys) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(varyKeys, "varyKeys");
        return null;
    }

    @Override // io.ktor.client.plugins.cache.storage.HttpCacheStorage
    public void store(@NotNull Url url, @NotNull HttpCacheEntry value) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // io.ktor.client.plugins.cache.storage.HttpCacheStorage
    @NotNull
    public Set<HttpCacheEntry> findByUrl(@NotNull Url url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return SetsKt__SetsKt.emptySet();
    }
}
