package com.blackhub.bronline.game.common.colorpickerview.sliders;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
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
import androidx.annotation.NonNull;
import androidx.appcompat.content.res.AppCompatResources;
import com.blackhub.bronline.C3489R;
import com.blackhub.bronline.game.common.colorpickerview.ColorPickerView;
import com.blackhub.bronline.game.common.colorpickerview.preference.ColorPickerPreferenceManager;
import com.bless.client.R;

/* loaded from: classes3.dex */
public class AlphaSlideBar extends AbstractSlider {
    public Bitmap backgroundBitmap;
    public final AlphaTileDrawable drawable;

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

    public AlphaSlideBar(Context context) {
        super(context);
        this.drawable = new AlphaTileDrawable();
    }

    public AlphaSlideBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.drawable = new AlphaTileDrawable();
    }

    public AlphaSlideBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.drawable = new AlphaTileDrawable();
    }

    public AlphaSlideBar(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.drawable = new AlphaTileDrawable();
    }

    @SuppressLint("ResourceType")
    @Override // com.blackhub.bronline.game.common.colorpickerview.sliders.AbstractSlider
    public void getAttrs(AttributeSet attrs) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R.styleable.AlphaSlideBar);
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

    @Override // android.view.View
    public void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
        super.onSizeChanged(width, height, oldWidth, oldHeight);
        if (width <= 0 || height <= 0) {
            return;
        }
        this.backgroundBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.backgroundBitmap);
        this.drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        this.drawable.draw(canvas);
    }

    @Override // com.blackhub.bronline.game.common.colorpickerview.sliders.AbstractSlider
    public void updatePaint(Paint colorPaint) {
        float[] fArr = new float[3];
        Color.colorToHSV(getColor(), fArr);
        colorPaint.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), getMeasuredHeight(), Color.HSVToColor(0, fArr), Color.HSVToColor(255, fArr), Shader.TileMode.CLAMP));
    }

    @Override // com.blackhub.bronline.game.common.colorpickerview.sliders.AbstractSlider
    public void onInflateFinished() {
        int width = getWidth() - this.selector.getWidth();
        if (getPreferenceName() != null) {
            updateSelectorX(ColorPickerPreferenceManager.getInstance(getContext()).getAlphaSliderPosition(getPreferenceName(), width) + (getSelectorSize() / 2));
        } else {
            this.selector.setX(width);
        }
    }

    @Override // com.blackhub.bronline.game.common.colorpickerview.sliders.AbstractSlider, android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        canvas.drawBitmap(this.backgroundBitmap, 0.0f, 0.0f, (Paint) null);
        super.onDraw(canvas);
    }

    @Override // com.blackhub.bronline.game.common.colorpickerview.sliders.AbstractSlider
    @ColorInt
    public int assembleColor() {
        float[] fArr = new float[3];
        Color.colorToHSV(getColor(), fArr);
        return Color.HSVToColor((int) (this.selectorPosition * 255.0f), fArr);
    }
}

