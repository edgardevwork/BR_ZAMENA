package com.blackhub.bronline.game.gui.menupausesettingandmap.p016ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blackhub.bronline.databinding.SliderWithThreeDostForNewMenuSettingsGraphicBinding;
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

/* compiled from: CustomSliderWithThreeDots.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u000eH\u0002J\u0018\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u000e\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0007R5\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R5\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/menupausesettingandmap/ui/CustomSliderWithThreeDots;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "addOnChangeListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "value", "", "getAddOnChangeListener", "()Lkotlin/jvm/functions/Function1;", "setAddOnChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "addOnSliderTouchListener", "getAddOnSliderTouchListener", "setAddOnSliderTouchListener", "binding", "Lcom/blackhub/bronline/databinding/SliderWithThreeDostForNewMenuSettingsGraphicBinding;", "getValue", "", "init", "setBackgroundForCurrentCheckCircle", "currentCircle", "Landroid/view/View;", "isChecked", "", "setValue", "progress", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class CustomSliderWithThreeDots extends ConstraintLayout {
    public static final int $stable = 8;
    public Function1<? super Integer, Unit> addOnChangeListener;
    public Function1<? super Integer, Unit> addOnSliderTouchListener;

    @NotNull
    public final SliderWithThreeDostForNewMenuSettingsGraphicBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomSliderWithThreeDots(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomSliderWithThreeDots(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CustomSliderWithThreeDots(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomSliderWithThreeDots(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        SliderWithThreeDostForNewMenuSettingsGraphicBinding sliderWithThreeDostForNewMenuSettingsGraphicBindingBind = SliderWithThreeDostForNewMenuSettingsGraphicBinding.bind(View.inflate(context, R.layout.slider_with_three_dost_for_new_menu_settings_graphic, this));
        Intrinsics.checkNotNullExpressionValue(sliderWithThreeDostForNewMenuSettingsGraphicBindingBind, "bind(...)");
        this.binding = sliderWithThreeDostForNewMenuSettingsGraphicBindingBind;
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
        this.binding.seekBar.addOnSliderTouchListener(new Slider.OnSliderTouchListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.CustomSliderWithThreeDots.init.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStartTrackingTouch(@NotNull Slider slider) {
                Intrinsics.checkNotNullParameter(slider, "slider");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStopTrackingTouch(@NotNull Slider slider) {
                Intrinsics.checkNotNullParameter(slider, "slider");
                CustomSliderWithThreeDots.this.getAddOnSliderTouchListener().invoke(Integer.valueOf((int) slider.getValue()));
            }
        });
        this.binding.seekBar.addOnChangeListener(new Slider.OnChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.CustomSliderWithThreeDots$$ExternalSyntheticLambda0
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnChangeListener, com.google.android.material.slider.BaseOnChangeListener
            public final void onValueChange(Slider slider, float f, boolean z) {
                CustomSliderWithThreeDots.init$lambda$0(this.f$0, slider, f, z);
            }
        });
    }

    public static final void init$lambda$0(CustomSliderWithThreeDots this$0, Slider slider, float f, boolean z) {
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
            return;
        }
        if (i == 1) {
            View progress12 = this$0.binding.progress1;
            Intrinsics.checkNotNullExpressionValue(progress12, "progress1");
            this$0.setBackgroundForCurrentCheckCircle(progress12, true);
            View progress22 = this$0.binding.progress2;
            Intrinsics.checkNotNullExpressionValue(progress22, "progress2");
            this$0.setBackgroundForCurrentCheckCircle(progress22, false);
            return;
        }
        if (i != 2) {
            return;
        }
        View progress13 = this$0.binding.progress1;
        Intrinsics.checkNotNullExpressionValue(progress13, "progress1");
        this$0.setBackgroundForCurrentCheckCircle(progress13, true);
        View progress23 = this$0.binding.progress2;
        Intrinsics.checkNotNullExpressionValue(progress23, "progress2");
        this$0.setBackgroundForCurrentCheckCircle(progress23, true);
    }

    private final void setBackgroundForCurrentCheckCircle(View currentCircle, boolean isChecked) {
        currentCircle.setBackground(AppCompatResources.getDrawable(getContext(), isChecked ? R.drawable.bg_oval_red_2 : R.drawable.bg_oval_white_1));
    }
}
