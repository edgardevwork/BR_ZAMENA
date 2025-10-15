package io.ktor.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PlatformUtilsJvm.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005\"\u0018\u0010\u0006\u001a\u00020\u0003*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005\"\u0015\u0010\u0007\u001a\u00020\b*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m7105d2 = {"DEVELOPMENT_MODE_KEY", "", "isDevelopmentMode", "", "Lio/ktor/util/PlatformUtils;", "(Lio/ktor/util/PlatformUtils;)Z", "isNewMemoryModel", "platform", "Lio/ktor/util/Platform;", "getPlatform", "(Lio/ktor/util/PlatformUtils;)Lio/ktor/util/Platform;", "ktor-utils"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class PlatformUtilsJvmKt {

    @NotNull
    public static final String DEVELOPMENT_MODE_KEY = "io.ktor.development";

    public static final boolean isNewMemoryModel(@NotNull PlatformUtils platformUtils) {
        Intrinsics.checkNotNullParameter(platformUtils, "<this>");
        return true;
    }

    @NotNull
    public static final Platform getPlatform(@NotNull PlatformUtils platformUtils) {
        Intrinsics.checkNotNullParameter(platformUtils, "<this>");
        return Platform.Jvm;
    }

    public static final boolean isDevelopmentMode(@NotNull PlatformUtils platformUtils) {
        Intrinsics.checkNotNullParameter(platformUtils, "<this>");
        String property = System.getProperty(DEVELOPMENT_MODE_KEY);
        return property != null && Boolean.parseBoolean(property);
    }
}
