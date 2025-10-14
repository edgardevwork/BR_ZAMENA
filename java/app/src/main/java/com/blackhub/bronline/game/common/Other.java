package com.blackhub.bronline.game.common;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Other.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class Other {
    public static long timer;

    @NotNull
    public static final Other INSTANCE = new Other();
    public static final int $stable = 8;

    public final long getTimer() {
        return timer;
    }

    public final void setTimer(long j) {
        timer = j;
    }
}

