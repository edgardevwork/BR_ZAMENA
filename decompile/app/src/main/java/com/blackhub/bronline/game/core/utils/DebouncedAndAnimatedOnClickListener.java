package com.blackhub.bronline.game.core.utils;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.bless.client.R;
import com.caverock.androidsvg.SVG;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DebouncedAndAnimatedOnClickListener.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0012\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H&R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/utils/DebouncedAndAnimatedOnClickListener;", "Landroid/view/View$OnClickListener;", "minimumIntervalMillis", "", "(J)V", "lastClickMap", "", "Landroid/view/View;", "onClick", "", "clickedView", "onDebouncedClick", SVG.View.NODE_NAME, "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public abstract class DebouncedAndAnimatedOnClickListener implements View.OnClickListener {
    public static final int $stable = 8;

    @NotNull
    public final Map<View, Long> lastClickMap = new WeakHashMap();
    public final long minimumIntervalMillis;

    public abstract void onDebouncedClick(@Nullable View view);

    public DebouncedAndAnimatedOnClickListener(long j) {
        this.minimumIntervalMillis = j;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull final View clickedView) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(clickedView, "clickedView");
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(clickedView.getContext(), R.anim.button_click);
        Long l = this.lastClickMap.get(clickedView);
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.lastClickMap.put(clickedView, Long.valueOf(jUptimeMillis));
        if (l == null || Math.abs(jUptimeMillis - l.longValue()) > this.minimumIntervalMillis) {
            Intrinsics.checkNotNull(animationLoadAnimation);
            AnyExtensionKt.setActionOnAnimationEnd(animationLoadAnimation, new Function0<Unit>() { // from class: com.blackhub.bronline.game.core.utils.DebouncedAndAnimatedOnClickListener.onClick.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    DebouncedAndAnimatedOnClickListener.this.onDebouncedClick(clickedView);
                }
            });
            clickedView.startAnimation(animationLoadAnimation);
        }
    }
}
