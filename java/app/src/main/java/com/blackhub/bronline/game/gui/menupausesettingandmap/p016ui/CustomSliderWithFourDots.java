package com.blackhub.bronline.game.gui.menupausesettingandmap.p016ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blackhub.bronline.databinding.SliderForNewMenuSettingsGraphicBinding;
import com.bless.client.R;
import com.google.android.material.slider.Slider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CustomSliderWithFourDots.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class CustomSliderWithFourDots extends ConstraintLayout {
    public static final int $stable = 8;
    public Function1<? super Integer, Unit> addOnChangeListener;
    public Function1<? super Integer, Unit> addOnSliderTouchListener;

    @NotNull
    public final SliderForNewMenuSettingsGraphicBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomSliderWithFourDots(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomSliderWithFourDots(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CustomSliderWithFourDots(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomSliderWithFourDots(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        SliderForNewMenuSettingsGraphicBinding sliderForNewMenuSettingsGraphicBindingBind = SliderForNewMenuSettingsGraphicBinding.bind(View.inflate(context, R.layout.slider_for_new_menu_settings_graphic, this));
        Intrinsics.checkNotNullExpressionValue(sliderForNewMenuSettingsGraphicBindingBind, "bind(...)");
        this.binding = sliderForNewMenuSettingsGraphicBindingBind;
        init();
    }

    @NotNull
    public final Function1<Integer, Unit> getAddOnChangeListener() {
        Function1 function1 = this.addOnChangeListener;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("addOnChangeListener");
        return null;
    }

    public final void setAddOnChangeListener(@NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.addOnChangeListener = function1;
    }

    @NotNull
    public final Function1<Integer, Unit> getAddOnSliderTouchListener() {
        Function1 function1 = this.addOnSliderTouchListener;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("addOnSliderTouchListener");
        return null;
    }

    public final void setAddOnSliderTouchListener(@NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.addOnSliderTouchListener = function1;
    }

    public final float getValue() {
        return this.binding.seekBar.getValue();
    }

    public final void setValue(int progress) {
        this.binding.seekBar.setValue(progress);
    }

    private final void init() {
        this.binding.seekBar.addOnSliderTouchListener(new Slider.OnSliderTouchListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.CustomSliderWithFourDots.init.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStartTrackingTouch(@NotNull Slider slider) {
                Intrinsics.checkNotNullParameter(slider, "slider");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStopTrackingTouch(@NotNull Slider slider) {
                Intrinsics.checkNotNullParameter(slider, "slider");
                CustomSliderWithFourDots.this.getAddOnSliderTouchListener().invoke(Integer.valueOf((int) slider.getValue()));
            }
        });
        this.binding.seekBar.addOnChangeListener(new Slider.OnChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.CustomSliderWithFourDots$$ExternalSyntheticLambda0
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnChangeListener, com.google.android.material.slider.BaseOnChangeListener
            public final void onValueChange(Slider slider, float f, boolean z) {
                CustomSliderWithFourDots.init$lambda$0(this.f$0, slider, f, z);
            }
        });
    }

    public static final void init$lambda$0(CustomSliderWithFourDots this$0, Slider slider, float f, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(slider, "<anonymous parameter 0>");
        int i = (int) f;
        this$0.getAddOnChangeListener().invoke(Integer.valueOf(i));
        if (i == 0) {
            View progress1 = this$0.binding.progress1;
            Intrinsics.checkNotNullExpressionValue(progress1, "progress1");
            this$0.setBackgroundForCurrentCheckCircle(progress1, false);
            View progress2 = this$0.binding.progress2;
            Intrinsics.checkNotNullExpressionValue(progress2, "progress2");
            this$0.setBackgroundForCurrentCheckCircle(progress2, false);
            View progress3 = this$0.binding.progress3;
            Intrinsics.checkNotNullExpressionValue(progress3, "progress3");
            this$0.setBackgroundForCurrentCheckCircle(progress3, false);
            return;
        }
        if (i == 1) {
            View progress12 = this$0.binding.progress1;
            Intrinsics.checkNotNullExpressionValue(progress12, "progress1");
            this$0.setBackgroundForCurrentCheckCircle(progress12, true);
            View progress22 = this$0.binding.progress2;
            Intrinsics.checkNotNullExpressionValue(progress22, "progress2");
            this$0.setBackgroundForCurrentCheckCircle(progress22, false);
            View progress32 = this$0.binding.progress3;
            Intrinsics.checkNotNullExpressionValue(progress32, "progress3");
            this$0.setBackgroundForCurrentCheckCircle(progress32, false);
            return;
        }
        if (i == 2) {
            View progress13 = this$0.binding.progress1;
            Intrinsics.checkNotNullExpressionValue(progress13, "progress1");
            this$0.setBackgroundForCurrentCheckCircle(progress13, true);
            View progress23 = this$0.binding.progress2;
            Intrinsics.checkNotNullExpressionValue(progress23, "progress2");
            this$0.setBackgroundForCurrentCheckCircle(progress23, true);
            View progress33 = this$0.binding.progress3;
            Intrinsics.checkNotNullExpressionValue(progress33, "progress3");
            this$0.setBackgroundForCurrentCheckCircle(progress33, false);
            return;
        }
        if (i != 3) {
            return;
        }
        View progress14 = this$0.binding.progress1;
        Intrinsics.checkNotNullExpressionValue(progress14, "progress1");
        this$0.setBackgroundForCurrentCheckCircle(progress14, true);
        View progress24 = this$0.binding.progress2;
        Intrinsics.checkNotNullExpressionValue(progress24, "progress2");
        this$0.setBackgroundForCurrentCheckCircle(progress24, true);
        View progress34 = this$0.binding.progress3;
        Intrinsics.checkNotNullExpressionValue(progress34, "progress3");
        this$0.setBackgroundForCurrentCheckCircle(progress34, true);
    }

    public final void setBackgroundForCurrentCheckCircle(View currentCircle, boolean isChecked) {
        currentCircle.setBackground(AppCompatResources.getDrawable(getContext(), isChecked ? R.drawable.bg_oval_red_2 : R.drawable.bg_oval_white_1));
    }
}

