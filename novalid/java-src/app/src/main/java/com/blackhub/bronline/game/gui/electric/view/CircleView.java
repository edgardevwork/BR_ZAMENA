package com.blackhub.bronline.game.gui.electric.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.C3489R;
import com.blackhub.bronline.game.core.extension.OtherExtensionKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CircleView.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0014R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/electric/view/CircleView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "circleColorFrom", "circleColorTo", "circlePaint", "Landroid/graphics/Paint;", "animateColorChangeStart", "", "doOnEnd", "Lkotlin/Function0;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "Companion", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCircleView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircleView.kt\ncom/blackhub/bronline/game/gui/electric/view/CircleView\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,72:1\n30#2:73\n91#2,14:74\n*S KotlinDebug\n*F\n+ 1 CircleView.kt\ncom/blackhub/bronline/game/gui/electric/view/CircleView\n*L\n65#1:73\n65#1:74,14\n*E\n"})
/* loaded from: classes3.dex */
public final class CircleView extends View {
    public static final long DURATION_ANIMATION = 2000;
    public int circleColorFrom;
    public int circleColorTo;

    @NotNull
    public final Paint circlePaint;
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CircleView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CircleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CircleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CircleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        this.circlePaint = paint;
        this.circleColorFrom = -7829368;
        this.circleColorTo = -16711936;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3489R.styleable.CircleView);
        this.circleColorFrom = typedArrayObtainStyledAttributes.getInt(0, -7829368);
        this.circleColorTo = typedArrayObtainStyledAttributes.getInt(1, -16711936);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.circlePaint.setColor(this.circleColorFrom);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, this.circlePaint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void animateColorChangeStart$default(CircleView circleView, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.electric.view.CircleView.animateColorChangeStart.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        circleView.animateColorChangeStart(function0);
    }

    public final void animateColorChangeStart(@NotNull final Function0<Unit> doOnEnd) {
        Intrinsics.checkNotNullParameter(doOnEnd, "doOnEnd");
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(this.circleColorFrom, this.circleColorTo);
        valueAnimatorOfArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.blackhub.bronline.game.gui.electric.view.CircleView$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircleView.animateColorChangeStart$lambda$1(this.f$0, valueAnimator);
            }
        });
        Intrinsics.checkNotNull(valueAnimatorOfArgb);
        valueAnimatorOfArgb.addListener(new Animator.AnimatorListener() { // from class: com.blackhub.bronline.game.gui.electric.view.CircleView$animateColorChangeStart$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                doOnEnd.invoke();
            }
        });
        valueAnimatorOfArgb.setDuration(2000L);
        OtherExtensionKt.cancelAnimator(valueAnimatorOfArgb);
        valueAnimatorOfArgb.start();
    }

    public static final void animateColorChangeStart$lambda$1(CircleView this$0, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this$0.circleColorFrom = ((Integer) animatedValue).intValue();
        this$0.invalidate();
    }
}
