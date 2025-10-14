package com.blackhub.bronline.game.common.colorpickerview.sliders;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.appcompat.content.res.AppCompatResources;
import com.blackhub.bronline.C3489R;
import com.blackhub.bronline.game.common.colorpickerview.ColorPickerView;
import com.blackhub.bronline.game.common.colorpickerview.preference.ColorPickerPreferenceManager;
import com.bless.client.R;

/* loaded from: classes3.dex */
public class BrightnessSlideBar extends AbstractSlider {
    @Override // com.blackhub.bronline.game.common.colorpickerview.sliders.AbstractSlider
    public /* bridge */ /* synthetic */ void attachColorPickerView(ColorPickerView colorPickerView) {
        super.attachColorPickerView(colorPickerView);
    }

    @Override // com.blackhub.bronline.game.common.colorpickerview.sliders.AbstractSlider
    public /* bridge */ /* synthetic */ int getColor() {
        return super.getColor();
    }

    @Override // com.blackhub.bronline.game.common.colorpickerview.sliders.AbstractSlider
    public /* bridge */ /* synthetic */ String getPreferenceName() {
        return super.getPreferenceName();
    }

    @Override // com.blackhub.bronline.game.common.colorpickerview.sliders.AbstractSlider
    public /* bridge */ /* synthetic */ int getSelectedX() {
        return super.getSelectedX();
    }

    @Override // com.blackhub.bronline.game.common.colorpickerview.sliders.AbstractSlider
    public /* bridge */ /* synthetic */ void notifyColor() {
        super.notifyColor();
    }

    @Override // com.blackhub.bronline.game.common.colorpickerview.sliders.AbstractSlider, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    @Override // com.blackhub.bronline.game.common.colorpickerview.sliders.AbstractSlider
    public /* bridge */ /* synthetic */ void setBorderColor(@ColorInt int color) {
        super.setBorderColor(color);
    }

    @Override // com.blackhub.bronline.game.common.colorpickerview.sliders.AbstractSlider
    public /* bridge */ /* synthetic */ void setBorderColorRes(@ColorRes int resource) {
        super.setBorderColorRes(resource);
    }

    @Override // com.blackhub.bronline.game.common.colorpickerview.sliders.AbstractSlider
    public /* bridge */ /* synthetic */ void setBorderSize(int borderSize) {
        super.setBorderSize(borderSize);
    }

    @Override // com.blackhub.bronline.game.common.colorpickerview.sliders.AbstractSlider
    public /* bridge */ /* synthetic */ void setBorderSizeRes(@DimenRes int resource) {
        super.setBorderSizeRes(resource);
    }

    @Override // com.blackhub.bronline.game.common.colorpickerview.sliders.AbstractSlider, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
    }

    @Override // com.blackhub.bronline.game.common.colorpickerview.sliders.AbstractSlider
    public /* bridge */ /* synthetic */ void setPreferenceName(String preferenceName) {
        super.setPreferenceName(preferenceName);
    }

    @Override // com.blackhub.bronline.game.common.colorpickerview.sliders.AbstractSlider
    public /* bridge */ /* synthetic */ void setSelectorByHalfSelectorPosition(@FloatRange(from = 0.0d, to = 1.0d) float selectorPosition) {
        super.setSelectorByHalfSelectorPosition(selectorPosition);
    }

    @Override // com.blackhub.bronline.game.common.colorpickerview.sliders.AbstractSlider
    public /* bridge */ /* synthetic */ void setSelectorDrawable(Drawable drawable) {
        super.setSelectorDrawable(drawable);
    }

    @Override // com.blackhub.bronline.game.common.colorpickerview.sliders.AbstractSlider
    public /* bridge */ /* synthetic */ void setSelectorDrawableRes(@DrawableRes int resource) {
        super.setSelectorDrawableRes(resource);
    }

    @Override // com.blackhub.bronline.game.common.colorpickerview.sliders.AbstractSlider
    public /* bridge */ /* synthetic */ void setSelectorPosition(@FloatRange(from = 0.0d, to = 1.0d) float selectorPosition) {
        super.setSelectorPosition(selectorPosition);
    }

    @Override // com.blackhub.bronline.game.common.colorpickerview.sliders.AbstractSlider
    public /* bridge */ /* synthetic */ void updateSelectorX(int x) {
        super.updateSelectorX(x);
    }

    public BrightnessSlideBar(Context context) {
        super(context);
    }

    public BrightnessSlideBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BrightnessSlideBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public BrightnessSlideBar(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @SuppressLint("ResourceType")
    @Override // com.blackhub.bronline.game.common.colorpickerview.sliders.AbstractSlider
    public void getAttrs(AttributeSet attrs) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R.styleable.BrightnessSlideBar);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(2) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(2, -1)) != -1) {
                this.selectorDrawable = AppCompatResources.getDrawable(getContext(), resourceId);
            }
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                this.borderColor = typedArrayObtainStyledAttributes.getColor(0, this.borderColor);
            }
            if (typedArrayObtainStyledAttributes.hasValue(1)) {
                this.borderSize = typedArrayObtainStyledAttributes.getInt(1, this.borderSize);
            }
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // com.blackhub.bronline.game.common.colorpickerview.sliders.AbstractSlider
    public void updatePaint(Paint colorPaint) {
        float[] fArr = {0.0f, 0.0f, 0.0f};
        Color.colorToHSV(getColor(), fArr);
        int iHSVToColor = Color.HSVToColor(fArr);
        fArr[2] = 1.0f;
        colorPaint.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), getHeight(), iHSVToColor, Color.HSVToColor(fArr), Shader.TileMode.CLAMP));
    }

    @Override // com.blackhub.bronline.game.common.colorpickerview.sliders.AbstractSlider
    public void onInflateFinished() {
        this.selector.post(new Runnable() { // from class: com.blackhub.bronline.game.common.colorpickerview.sliders.BrightnessSlideBar$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                lambda$onInflateFinished$0();
            }
        });
    }

    public final /* synthetic */ void lambda$onInflateFinished$0() {
        int width = getWidth() - this.selector.getWidth();
        if (getPreferenceName() != null) {
            updateSelectorX(ColorPickerPreferenceManager.getInstance(getContext()).getBrightnessSliderPosition(getPreferenceName(), width) + (getSelectorSize() / 2));
        } else {
            this.selector.setX(width);
        }
    }

    @Override // com.blackhub.bronline.game.common.colorpickerview.sliders.AbstractSlider
    @ColorInt
    public int assembleColor() {
        float[] fArr = {0.0f, 0.0f, this.selectorPosition};
        Color.colorToHSV(getColor(), fArr);
        ColorPickerView colorPickerView = this.colorPickerView;
        if (colorPickerView != null && colorPickerView.getAlphaSlideBar() != null) {
            return Color.HSVToColor((int) (this.colorPickerView.getAlphaSlideBar().getSelectorPosition() * 255.0f), fArr);
        }
        return Color.HSVToColor(fArr);
    }
}

