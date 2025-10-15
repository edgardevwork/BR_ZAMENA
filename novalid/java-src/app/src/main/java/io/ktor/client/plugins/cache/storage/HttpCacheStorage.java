package io.ktor.client.plugins.cache.storage;

import io.ktor.client.plugins.cache.HttpCacheEntry;
import io.ktor.http.Url;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpCacheStorage.kt */
@Deprecated(message = "Use new [CacheStorage] instead.")
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b'\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H&¨\u0006\u0010"}, m7105d2 = {"Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "", "()V", "find", "Lio/ktor/client/plugins/cache/HttpCacheEntry;", "url", "Lio/ktor/http/Url;", "varyKeys", "", "", "findByUrl", "", "store", "", "value", "Companion", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public abstract class HttpCacheStorage {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Function0<HttpCacheStorage> Unlimited = new Function0<UnlimitedCacheStorage>() { // from class: io.ktor.client.plugins.cache.storage.HttpCacheStorage$Companion$Unlimited$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final UnlimitedCacheStorage invoke() {
            return new UnlimitedCacheStorage();
        }
    };

    @NotNull
    public static final HttpCacheStorage Disabled = DisabledCacheStorage.INSTANCE;

    @Nullable
    public abstract HttpCacheEntry find(@NotNull Url url, @NotNull Map<String, String> varyKeys);

    @NotNull
    public abstract Set<HttpCacheEntry> findByUrl(@NotNull Url url);

    public abstract void store(@NotNull Url url, @NotNull HttpCacheEntry value);

    /* compiled from: HttpCacheStorage.kt */
    @Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m7105d2 = {"Lio/ktor/client/plugins/cache/storage/HttpCacheStorage$Companion;", "", "()V", "Disabled", "Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "getDisabled", "()Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "Unlimited", "Lkotlin/Function0;", "getUnlimited", "()Lkotlin/jvm/functions/Function0;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final Function0<HttpCacheStorage> getUnlimited() {
            return HttpCacheStorage.Unlimited;
        }

        @NotNull
        public final HttpCacheStorage getDisabled() {
            return HttpCacheStorage.Disabled;
        }
    }
}
