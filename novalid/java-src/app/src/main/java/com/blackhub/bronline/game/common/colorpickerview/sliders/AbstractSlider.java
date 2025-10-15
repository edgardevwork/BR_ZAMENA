package com.blackhub.bronline.game.common.colorpickerview.sliders;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import com.blackhub.bronline.game.common.colorpickerview.ActionMode;
import com.blackhub.bronline.game.common.colorpickerview.ColorPickerView;

/* loaded from: classes.dex */
public abstract class AbstractSlider extends FrameLayout {
    public int borderColor;
    public Paint borderPaint;
    public int borderSize;
    public int color;
    public Paint colorPaint;
    public ColorPickerView colorPickerView;
    public String preferenceName;
    public int selectedX;
    public ImageView selector;
    public Drawable selectorDrawable;
    public float selectorPosition;

    @ColorInt
    public abstract int assembleColor();

    public abstract void getAttrs(AttributeSet attrs);

    public abstract void onInflateFinished();

    public abstract void updatePaint(Paint colorPaint);

    public AbstractSlider(Context context) {
        super(context);
        this.selectorPosition = 1.0f;
        this.selectedX = 0;
        this.borderSize = 2;
        this.borderColor = ViewCompat.MEASURED_STATE_MASK;
        this.color = -1;
        onCreate();
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.selector.setVisibility(enabled ? 0 : 4);
        setClickable(enabled);
    }

    public AbstractSlider(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.selectorPosition = 1.0f;
        this.selectedX = 0;
        this.borderSize = 2;
        this.borderColor = ViewCompat.MEASURED_STATE_MASK;
        this.color = -1;
        getAttrs(attrs);
        onCreate();
    }

    public AbstractSlider(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.selectorPosition = 1.0f;
        this.selectedX = 0;
        this.borderSize = 2;
        this.borderColor = ViewCompat.MEASURED_STATE_MASK;
        this.color = -1;
        getAttrs(attrs);
        onCreate();
    }

    public AbstractSlider(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.selectorPosition = 1.0f;
        this.selectedX = 0;
        this.borderSize = 2;
        this.borderColor = ViewCompat.MEASURED_STATE_MASK;
        this.color = -1;
        getAttrs(attrs);
        onCreate();
    }

    public final void onCreate() {
        this.colorPaint = new Paint(1);
        Paint paint = new Paint(1);
        this.borderPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.borderPaint.setStrokeWidth(this.borderSize);
        this.borderPaint.setColor(this.borderColor);
        setBackgroundColor(-1);
        this.selector = new ImageView(getContext());
        Drawable drawable = this.selectorDrawable;
        if (drawable != null) {
            setSelectorDrawable(drawable);
        }
        initializeSelector();
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float measuredHeight = getMeasuredHeight();
        canvas.drawRect(0.0f, 0.0f, width, measuredHeight, this.colorPaint);
        canvas.drawRect(0.0f, 0.0f, width, measuredHeight, this.borderPaint);
    }

    public void notifyColor() {
        this.color = this.colorPickerView.getPureColor();
        updatePaint(this.colorPaint);
        invalidate();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) throws Resources.NotFoundException {
        if (isEnabled() && this.colorPickerView != null) {
            int actionMasked = event.getActionMasked();
            if (actionMasked == 0 || actionMasked == 1 || actionMasked == 2) {
                this.selector.setPressed(true);
                if (event.getX() <= getWidth() && event.getX() >= 0.0f) {
                    onTouchReceived(event);
                    return true;
                }
            } else {
                this.selector.setPressed(false);
                return false;
            }
        }
        return false;
    }

    public final void onTouchReceived(MotionEvent event) throws Resources.NotFoundException {
        float x = event.getX();
        float width = this.selector.getWidth() / 2.0f;
        float width2 = getWidth() - width;
        if (x > width2) {
            x = width2;
        }
        float f = (x - width) / (width2 - width);
        this.selectorPosition = f;
        if (f < 0.0f) {
            this.selectorPosition = 0.0f;
        }
        if (this.selectorPosition > 1.0f) {
            this.selectorPosition = 1.0f;
        }
        int boundaryX = (int) getBoundaryX(new Point((int) event.getX(), (int) event.getY()).x);
        this.selectedX = boundaryX;
        this.selector.setX(boundaryX);
        if (this.colorPickerView.getActionMode() != ActionMode.LAST || event.getAction() == 1) {
            this.colorPickerView.fireColorListener(assembleColor(), true);
        }
        if (this.colorPickerView.getFlagView() != null) {
            this.colorPickerView.getFlagView().receiveOnTouchEvent(event);
        }
        float width3 = getWidth() - this.selector.getWidth();
        if (this.selector.getX() >= width3) {
            this.selector.setX(width3);
        }
        if (this.selector.getX() <= 0.0f) {
            this.selector.setX(0.0f);
        }
    }

    public void updateSelectorX(int x) {
        float width = this.selector.getWidth() / 2.0f;
        float f = x;
        float width2 = (f - width) / ((getWidth() - width) - width);
        this.selectorPosition = width2;
        if (width2 < 0.0f) {
            this.selectorPosition = 0.0f;
        }
        if (this.selectorPosition > 1.0f) {
            this.selectorPosition = 1.0f;
        }
        int boundaryX = (int) getBoundaryX(f);
        this.selectedX = boundaryX;
        this.selector.setX(boundaryX);
        this.colorPickerView.fireColorListener(assembleColor(), false);
    }

    public void setSelectorPosition(@FloatRange(from = 0.0d, m9to = 1.0d) float selectorPosition) {
        this.selectorPosition = Math.min(selectorPosition, 1.0f);
        int boundaryX = (int) getBoundaryX(((getWidth() * selectorPosition) - getSelectorSize()) - getBorderHalfSize());
        this.selectedX = boundaryX;
        this.selector.setX(boundaryX);
    }

    public void setSelectorByHalfSelectorPosition(@FloatRange(from = 0.0d, m9to = 1.0d) float selectorPosition) {
        this.selectorPosition = Math.min(selectorPosition, 1.0f);
        int boundaryX = (int) getBoundaryX(((getWidth() * selectorPosition) - (getSelectorSize() * 0.5f)) - getBorderHalfSize());
        this.selectedX = boundaryX;
        this.selector.setX(boundaryX);
    }

    public final float getBoundaryX(float x) {
        float width = getWidth() - (this.selector.getWidth() / 2);
        if (x >= width) {
            return width;
        }
        if (x <= getSelectorSize() / 2.0f) {
            return 0.0f;
        }
        return x - (getSelectorSize() / 2.0f);
    }

    public int getSelectorSize() {
        return this.selector.getWidth();
    }

    public int getBorderHalfSize() {
        return (int) (this.borderSize * 0.5f);
    }

    public final void initializeSelector() {
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.blackhub.bronline.game.common.colorpickerview.sliders.AbstractSlider.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                AbstractSlider.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                AbstractSlider.this.onInflateFinished();
            }
        });
    }

    public void setSelectorDrawable(Drawable drawable) {
        removeView(this.selector);
        this.selectorDrawable = drawable;
        this.selector.setImageDrawable(drawable);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(this.selector, layoutParams);
    }

    public void setSelectorDrawableRes(@DrawableRes int resource) {
        setSelectorDrawable(ResourcesCompat.getDrawable(getContext().getResources(), resource, null));
    }

    public void setBorderColor(@ColorInt int color) {
        this.borderColor = color;
        this.borderPaint.setColor(color);
        invalidate();
    }

    public void setBorderColorRes(@ColorRes int resource) {
        setBorderColor(ContextCompat.getColor(getContext(), resource));
    }

    public void setBorderSize(int borderSize) {
        this.borderSize = borderSize;
        this.borderPaint.setStrokeWidth(borderSize);
        invalidate();
    }

    public void setBorderSizeRes(@DimenRes int resource) {
        setBorderSize((int) getContext().getResources().getDimension(resource));
    }

    public int getColor() {
        return this.color;
    }

    public void attachColorPickerView(ColorPickerView colorPickerView) {
        this.colorPickerView = colorPickerView;
    }

    public float getSelectorPosition() {
        return this.selectorPosition;
    }

    public int getSelectedX() {
        return this.selectedX;
    }

    public String getPreferenceName() {
        return this.preferenceName;
    }

    public void setPreferenceName(String preferenceName) {
        this.preferenceName = preferenceName;
    }
}
