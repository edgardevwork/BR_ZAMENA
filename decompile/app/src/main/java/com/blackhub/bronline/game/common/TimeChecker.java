package com.blackhub.bronline.game.common;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* compiled from: TimeChecker.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, m7105d2 = {"Lcom/blackhub/bronline/game/common/TimeChecker;", "", "()V", "blockTimer", "", "ifAccess", "", "minValueOfTime", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
