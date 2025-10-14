package com.blackhub.bronline.game.core.constants;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Constants.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class BuildTypeConstants {
    public static final int $stable = 0;

    @NotNull
    public static final String ALL_SERVERS_TYPE = "allServers";

    @NotNull
    public static final String DEBUG_TYPE = "debug";

    @NotNull
    public static final BuildTypeConstants INSTANCE = new BuildTypeConstants();

    @NotNull
    public static final String MASS_TEST_TYPE = "massTest";

    @NotNull
    public static final String QA_TYPE = "qa";

    @NotNull
    public static final String RELEASE_TYPE = "release";

    @NotNull
    public static final String STAGING_TYPE = "staging";
}

