package com.blackhub.bronline.game.common;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Other.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/common/Other;", "", "()V", "timer", "", "getTimer", "()J", "setTimer", "(J)V", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
