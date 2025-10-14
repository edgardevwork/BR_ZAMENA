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
@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0012\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H&R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/utils/DebouncedOnClickListener;", "Landroid/view/View$OnClickListener;", "minimumIntervalMillis", "", "(J)V", "lastClickMap", "", "Landroid/view/View;", "onClick", "", "clickedView", "onDebouncedClick", "v", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
