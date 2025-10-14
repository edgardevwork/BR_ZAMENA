package com.blackhub.bronline.game.core.constants;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Constants.kt */
@StabilityInferred(parameters = 1)

public final class NativeGraphicConstants {
    public static final int $stable = 0;

    @NotNull
    public static final String ASTC = "astc";

    @NotNull
    public static final String ASTC_FULL_NAME = "GL_KHR_texture_compression_astc_ldr";

    @NotNull
    public static final String ETC2 = "etc2";

    @NotNull
    public static final String ETC2_FULL_NAME = "OES_compressed_ETC2_RGBA8_texture";

    @NotNull
    public static final String EXTENSION_NOT_FOUND = "error";

    @NotNull
    public static final NativeGraphicConstants INSTANCE = new NativeGraphicConstants();
}

