package io.ktor.client.utils;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: CacheControl.kt */
@Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m7105d2 = {"Lio/ktor/client/utils/CacheControl;", "", "()V", "MAX_AGE", "", "MAX_STALE", "MIN_FRESH", "MUST_REVALIDATE", "NO_CACHE", "NO_STORE", "NO_TRANSFORM", "ONLY_IF_CACHED", "PRIVATE", "PROXY_REVALIDATE", "PUBLIC", "S_MAX_AGE", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class CacheControl {

    @NotNull
    public static final CacheControl INSTANCE = new CacheControl();

    @NotNull
    public static final String MAX_AGE = "max-age";

    @NotNull
    public static final String MAX_STALE = "max-stale";

    @NotNull
    public static final String MIN_FRESH = "min-fresh";

    @NotNull
    public static final String MUST_REVALIDATE = "must-revalidate";

    @NotNull
    public static final String NO_CACHE = "no-cache";

    @NotNull
    public static final String NO_STORE = "no-store";

    @NotNull
    public static final String NO_TRANSFORM = "no-transform";

    @NotNull
    public static final String ONLY_IF_CACHED = "only-if-cached";

    @NotNull
    public static final String PRIVATE = "private";

    @NotNull
    public static final String PROXY_REVALIDATE = "proxy-revalidate";

    @NotNull
    public static final String PUBLIC = "public";

    @NotNull
    public static final String S_MAX_AGE = "s-maxage";
}
