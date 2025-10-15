package com.sdkit.paylib.paylibnative.p033ui.common.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import ru.rustore.sdk.billingclient.C11403R;

@Metadata(m7104d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 42\u00020\u00012\u00020\u0002:\u0001\rB\u0017\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\r\u001a\u00020\u0005H\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J(\u0010\r\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00132\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J(\u0010\u0017\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00132\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0002R\u0016\u0010\u0019\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR$\u0010%\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00038\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010(\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00038\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b&\u0010\"\"\u0004\b'\u0010$R\u0014\u0010+\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*¨\u00065"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/ui/common/view/PaylibToggleButton;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", "", "checked", "", "setCheckedManually", "Landroid/view/View;", "v", "onClick", "enabled", "setEnabled", "setChecked", "a", "Landroid/animation/AnimatorSet;", SVG.View.NODE_NAME, "", "alphaFrom", "alphaTo", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "translationXFrom", "translationXTo", "b", "Landroid/view/View;", "thumb", "trackUnchecked", "c", "trackChecked", "d", "Landroid/animation/AnimatorSet;", "animatorSet", "value", "e", "Z", "setToggleIsEnabled", "(Z)V", "toggleIsEnabled", "f", "setToggleIsChecked", "toggleIsChecked", "g", "F", "translationXChecked", "h", "translationXUnchecked", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", SegmentConstantPool.INITSTRING, "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "i", "com-sdkit-assistant_paylib_native"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class PaylibToggleButton extends FrameLayout implements View.OnClickListener {

    /* renamed from: a, reason: from kotlin metadata */
    public View thumb;

    /* renamed from: b, reason: from kotlin metadata */
    public View trackUnchecked;

    /* renamed from: c, reason: from kotlin metadata */
    public View trackChecked;

    /* renamed from: d, reason: from kotlin metadata */
    public AnimatorSet animatorSet;

    /* renamed from: e, reason: from kotlin metadata */
    public boolean toggleIsEnabled;

    /* renamed from: f, reason: from kotlin metadata */
    public boolean toggleIsChecked;

    /* renamed from: g, reason: from kotlin metadata */
    public final float translationXChecked;

    /* renamed from: h, reason: from kotlin metadata */
    public final float translationXUnchecked;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.PaylibToggleButton$b */
    public static final class C8120b implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ View f1910a;

        /* renamed from: b */
        public final /* synthetic */ float f1911b;

        public C8120b(View view, float f) {
            this.f1910a = view;
            this.f1911b = f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.f1910a.setAlpha(this.f1911b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.PaylibToggleButton$c */
    public static final class C8121c implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ View f1912a;

        /* renamed from: b */
        public final /* synthetic */ float f1913b;

        public C8121c(View view, float f) {
            this.f1912a = view;
            this.f1913b = f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.f1912a.setAlpha(this.f1913b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.PaylibToggleButton$d */
    public static final class C8122d implements Animator.AnimatorListener {
        public C8122d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            View view = PaylibToggleButton.this.thumb;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("thumb");
                view = null;
            }
            view.setScaleX(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.PaylibToggleButton$e */
    public static final class C8123e implements Animator.AnimatorListener {
        public C8123e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            View view = PaylibToggleButton.this.thumb;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("thumb");
                view = null;
            }
            view.setScaleX(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.PaylibToggleButton$f */
    public static final class C8124f implements Animator.AnimatorListener {

        /* renamed from: b */
        public final /* synthetic */ boolean f1917b;

        /* renamed from: c */
        public final /* synthetic */ boolean f1918c;

        public C8124f(boolean z, PaylibToggleButton paylibToggleButton, boolean z2) {
            this.f1917b = z;
            this.f1918c = z2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            PaylibToggleButton.this.setToggleIsChecked(this.f1918c);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            PaylibToggleButton.this.setToggleIsChecked(this.f1917b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.PaylibToggleButton$g */
    public static final class C8125g implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ View f1919a;

        /* renamed from: b */
        public final /* synthetic */ float f1920b;

        public C8125g(View view, float f) {
            this.f1919a = view;
            this.f1920b = f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.f1919a.setTranslationX(this.f1920b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.PaylibToggleButton$h */
    public static final class C8126h implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ View f1921a;

        /* renamed from: b */
        public final /* synthetic */ float f1922b;

        public C8126h(View view, float f) {
            this.f1921a = view;
            this.f1922b = f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.f1921a.setTranslationX(this.f1922b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaylibToggleButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.toggleIsEnabled = true;
        View.inflate(context, C11403R.layout.paylib_native_toggle_button, this);
        m1963a();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, C11403R.styleable.PaylibToggleButton, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.theme.obtainStyl…\n            0,\n        )");
        setCheckedManually(typedArrayObtainStyledAttributes.getBoolean(C11403R.styleable.PaylibToggleButton_android_checked, false));
        setToggleIsEnabled(typedArrayObtainStyledAttributes.getBoolean(C11403R.styleable.PaylibToggleButton_android_enabled, true));
        int color = typedArrayObtainStyledAttributes.getColor(C11403R.styleable.PaylibToggleButton_track_unchecked_tint, ContextCompat.getColor(context, C11403R.color.paylib_design_color_liquid_30_dark));
        View view = this.trackUnchecked;
        View view2 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trackUnchecked");
            view = null;
        }
        view.setBackgroundTintList(ColorStateList.valueOf(color));
        int color2 = typedArrayObtainStyledAttributes.getColor(C11403R.styleable.PaylibToggleButton_track_checked_tint, ContextCompat.getColor(context, C11403R.color.paylib_design_color_solid_brand_dark));
        View view3 = this.trackChecked;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trackChecked");
        } else {
            view2 = view3;
        }
        view2.setBackgroundTintList(ColorStateList.valueOf(color2));
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
        this.translationXChecked = context.getResources().getDimension(C11403R.dimen.paylib_design_toggle_button_thumb_translationx_checked);
        this.translationXUnchecked = context.getResources().getDimension(C11403R.dimen.paylib_design_toggle_button_thumb_translationx_unchecked);
    }

    private final void setCheckedManually(boolean checked) {
        float f;
        View view = null;
        View view2 = this.trackChecked;
        if (checked) {
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("trackChecked");
                view2 = null;
            }
            view2.setAlpha(1.0f);
            View view3 = this.trackUnchecked;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("trackUnchecked");
                view3 = null;
            }
            view3.setAlpha(0.0f);
            View view4 = this.thumb;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("thumb");
            } else {
                view = view4;
            }
            f = this.translationXChecked;
        } else {
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("trackChecked");
                view2 = null;
            }
            view2.setAlpha(0.0f);
            View view5 = this.trackUnchecked;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("trackUnchecked");
                view5 = null;
            }
            view5.setAlpha(1.0f);
            View view6 = this.thumb;
            if (view6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("thumb");
            } else {
                view = view6;
            }
            f = this.translationXUnchecked;
        }
        view.setTranslationX(f);
        setToggleIsChecked(checked);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setToggleIsChecked(boolean z) {
        this.toggleIsChecked = z;
    }

    private final void setToggleIsEnabled(boolean z) {
        this.toggleIsEnabled = z;
        if (z) {
            setAlpha(1.0f);
            setOnClickListener(this);
        } else {
            setAlpha(0.4f);
            setOnClickListener(null);
        }
    }

    /* renamed from: a */
    public final AnimatorSet m1961a(boolean checked) {
        ValueAnimator valueAnimatorM1962a;
        ValueAnimator valueAnimatorM1962a2;
        float f;
        float f2;
        View view = null;
        View view2 = this.trackUnchecked;
        if (checked) {
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("trackUnchecked");
                view2 = null;
            }
            valueAnimatorM1962a = m1962a(view2, 1.0f, 0.0f);
        } else {
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("trackUnchecked");
                view2 = null;
            }
            valueAnimatorM1962a = m1962a(view2, 0.0f, 1.0f);
        }
        View view3 = this.trackChecked;
        if (checked) {
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("trackChecked");
                view3 = null;
            }
            valueAnimatorM1962a2 = m1962a(view3, 0.0f, 1.0f);
        } else {
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("trackChecked");
                view3 = null;
            }
            valueAnimatorM1962a2 = m1962a(view3, 1.0f, 0.0f);
        }
        View view4 = this.thumb;
        if (checked) {
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("thumb");
            } else {
                view = view4;
            }
            f = this.translationXUnchecked;
            f2 = this.translationXChecked;
        } else {
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("thumb");
            } else {
                view = view4;
            }
            f = this.translationXChecked;
            f2 = this.translationXUnchecked;
        }
        ValueAnimator valueAnimatorM1964b = m1964b(view, f, f2);
        ValueAnimator getAnimatorSet$lambda$5 = ValueAnimator.ofFloat(1.0f, 1.25f, 1.0f);
        getAnimatorSet$lambda$5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sdkit.paylib.paylibnative.ui.common.view.PaylibToggleButton$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PaylibToggleButton.m1958a(this.f$0, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(getAnimatorSet$lambda$5, "getAnimatorSet$lambda$5");
        getAnimatorSet$lambda$5.addListener(new C8123e());
        getAnimatorSet$lambda$5.addListener(new C8122d());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new C8124f(checked, this, checked));
        animatorSet.setDuration(200L);
        animatorSet.playTogether(valueAnimatorM1962a2, valueAnimatorM1962a, valueAnimatorM1964b, getAnimatorSet$lambda$5);
        return animatorSet;
    }

    /* renamed from: b */
    public final ValueAnimator m1964b(final View view, float translationXFrom, float translationXTo) {
        ValueAnimator getTranslationAnimator$lambda$16 = ValueAnimator.ofFloat(translationXFrom, translationXTo);
        getTranslationAnimator$lambda$16.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sdkit.paylib.paylibnative.ui.common.view.PaylibToggleButton$$ExternalSyntheticLambda2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PaylibToggleButton.m1960b(view, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(getTranslationAnimator$lambda$16, "getTranslationAnimator$lambda$16");
        getTranslationAnimator$lambda$16.addListener(new C8126h(view, translationXTo));
        getTranslationAnimator$lambda$16.addListener(new C8125g(view, translationXTo));
        return getTranslationAnimator$lambda$16;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        if (this.toggleIsEnabled) {
            AnimatorSet animatorSet = this.animatorSet;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSetM1961a = m1961a(!this.toggleIsChecked);
            animatorSetM1961a.start();
            this.animatorSet = animatorSetM1961a;
        }
    }

    public final void setChecked(boolean checked) {
        setCheckedManually(checked);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        setToggleIsEnabled(enabled);
    }

    /* renamed from: b */
    public static final void m1960b(View view, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(view, "$view");
        Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view.setTranslationX(((Float) animatedValue).floatValue());
    }

    /* renamed from: a */
    public final ValueAnimator m1962a(final View view, float alphaFrom, float alphaTo) {
        ValueAnimator getAlphaAnimator$lambda$12 = ValueAnimator.ofFloat(alphaFrom, alphaTo);
        getAlphaAnimator$lambda$12.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sdkit.paylib.paylibnative.ui.common.view.PaylibToggleButton$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PaylibToggleButton.m1957a(view, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(getAlphaAnimator$lambda$12, "getAlphaAnimator$lambda$12");
        getAlphaAnimator$lambda$12.addListener(new C8121c(view, alphaTo));
        getAlphaAnimator$lambda$12.addListener(new C8120b(view, alphaTo));
        return getAlphaAnimator$lambda$12;
    }

    /* renamed from: a */
    public final void m1963a() {
        View viewFindViewById = findViewById(C11403R.id.thumb);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.thumb)");
        this.thumb = viewFindViewById;
        View viewFindViewById2 = findViewById(C11403R.id.track_unchecked);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.track_unchecked)");
        this.trackUnchecked = viewFindViewById2;
        View viewFindViewById3 = findViewById(C11403R.id.track_checked);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.track_checked)");
        this.trackChecked = viewFindViewById3;
    }

    /* renamed from: a */
    public static final void m1957a(View view, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(view, "$view");
        Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view.setAlpha(((Float) animatedValue).floatValue());
    }

    /* renamed from: a */
    public static final void m1958a(PaylibToggleButton this$0, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        View view = this$0.thumb;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("thumb");
            view = null;
        }
        view.setScaleX(fFloatValue);
    }
}
