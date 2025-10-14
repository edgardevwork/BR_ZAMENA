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

