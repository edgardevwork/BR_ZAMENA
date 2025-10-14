package com.blackhub.bronline.game.core.utils;

import android.os.SystemClock;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DebouncedOnClickListener.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public abstract class DebouncedOnClickListener implements View.OnClickListener {
    public static final int $stable = 8;

    @NotNull
    public final Map<View, Long> lastClickMap = new WeakHashMap();
    public final long minimumIntervalMillis;

    public abstract void onDebouncedClick(@Nullable View v);

    public DebouncedOnClickListener(long j) {
        this.minimumIntervalMillis = j;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View clickedView) {
        Intrinsics.checkNotNullParameter(clickedView, "clickedView");
        Long l = this.lastClickMap.get(clickedView);
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.lastClickMap.put(clickedView, Long.valueOf(jUptimeMillis));
        if (l == null || Math.abs(jUptimeMillis - l.longValue()) > this.minimumIntervalMillis) {
            onDebouncedClick(clickedView);
        }
    }
}

