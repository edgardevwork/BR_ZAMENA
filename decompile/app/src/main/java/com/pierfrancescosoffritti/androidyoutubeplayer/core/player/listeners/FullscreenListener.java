package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: FullscreenListener.kt */
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, m7105d2 = {"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/FullscreenListener;", "", "onEnterFullscreen", "", "fullscreenView", "Landroid/view/View;", "exitFullscreen", "Lkotlin/Function0;", "onExitFullscreen", "core_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public interface FullscreenListener {
    void onEnterFullscreen(@NotNull View fullscreenView, @NotNull Function0<Unit> exitFullscreen);

    void onExitFullscreen();
}
