package com.blackhub.bronline.game.common;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* compiled from: TimeChecker.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TimeChecker {
    public static final int $stable = 8;
    public long blockTimer;

    public final boolean ifAccess(long minValueOfTime) {
        if (System.currentTimeMillis() - this.blockTimer <= minValueOfTime) {
            return false;
        }
        this.blockTimer = System.currentTimeMillis();
        return true;
    }
}

