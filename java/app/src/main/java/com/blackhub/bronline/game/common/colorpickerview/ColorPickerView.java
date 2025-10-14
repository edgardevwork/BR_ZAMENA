package com.blackhub.bronline.game.common.colorpickerview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.blackhub.bronline.C3489R;
import com.blackhub.bronline.game.common.colorpickerview.flag.FlagMode;
import com.blackhub.bronline.game.common.colorpickerview.flag.FlagView;
import com.blackhub.bronline.game.common.colorpickerview.listeners.ColorEnvelopeListener;
import com.blackhub.bronline.game.common.colorpickerview.listeners.ColorListener;
import com.blackhub.bronline.game.common.colorpickerview.listeners.ColorPickerViewListener;
import com.blackhub.bronline.game.common.colorpickerview.preference.ColorPickerPreferenceManager;
import com.blackhub.bronline.game.common.colorpickerview.sliders.AlphaSlideBar;
import com.blackhub.bronline.game.common.colorpickerview.sliders.BrightnessSlideBar;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.bless.client.R;
import java.util.Objects;

/* loaded from: classes3.dex */
public class ColorPickerView extends FrameLayout implements DefaultLifecycleObserver {
    public boolean VISIBLE_FLAG;
    public ActionMode actionMode;
    public AlphaSlideBar alphaSlideBar;
    public BrightnessSlideBar brightnessSlider;
    public ColorPickerViewListener colorListener;
    public long debounceDuration;
    public final Handler debounceHandler;
    public FlagView flagView;

    @FloatRange(from = 0.0d, to = 1.0d)
    public float flag_alpha;
    public boolean flag_isFlipAble;
    public ImageView palette;
    public Drawable paletteDrawable;
    public final ColorPickerPreferenceManager preferenceManager;
    public String preferenceName;

    @ColorInt
    public int selectedColor;
    public Point selectedPoint;

    @ColorInt
    public int selectedPureColor;
    public ImageView selector;
    public Drawable selectorDrawable;

    @Px
    public int selectorSize;

    @FloatRange(from = 0.0d, to = 1.0d)
    public float selector_alpha;

    public ColorPickerView(Context context) {
        super(context);
        this.debounceDuration = 0L;
        this.debounceHandler = new Handler();
        this.actionMode = ActionMode.ALWAYS;
        this.selector_alpha = 1.0f;
        this.flag_alpha = 1.0f;
        this.flag_isFlipAble = true;
        this.selectorSize = 0;
        this.VISIBLE_FLAG = false;
        this.preferenceManager = ColorPickerPreferenceManager.getInstance(getContext());
    }

    public ColorPickerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.debounceDuration = 0L;
        this.debounceHandler = new Handler();
        this.actionMode = ActionMode.ALWAYS;
        this.selector_alpha = 1.0f;
        this.flag_alpha = 1.0f;
        this.flag_isFlipAble = true;
        this.selectorSize = 0;
        this.VISIBLE_FLAG = false;
        this.preferenceManager = ColorPickerPreferenceManager.getInstance(getContext());
        getAttrs(attrs);
        onCreate();
    }

    public ColorPickerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.debounceDuration = 0L;
        this.debounceHandler = new Handler();
        this.actionMode = ActionMode.ALWAYS;
        this.selector_alpha = 1.0f;
        this.flag_alpha = 1.0f;
        this.flag_isFlipAble = true;
        this.selectorSize = 0;
        this.VISIBLE_FLAG = false;
        this.preferenceManager = ColorPickerPreferenceManager.getInstance(getContext());
        getAttrs(attrs);
        onCreate();
    }

    public ColorPickerView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.debounceDuration = 0L;
        this.debounceHandler = new Handler();
        this.actionMode = ActionMode.ALWAYS;
        this.selector_alpha = 1.0f;
        this.flag_alpha = 1.0f;
        this.flag_isFlipAble = true;
        this.selectorSize = 0;
        this.VISIBLE_FLAG = false;
        this.preferenceManager = ColorPickerPreferenceManager.getInstance(getContext());
        getAttrs(attrs);
        onCreate();
    }

    @SuppressLint("ResourceType")
    public final void getAttrs(AttributeSet attrs) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R.styleable.ColorPickerView);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(5)) {
                this.paletteDrawable = typedArrayObtainStyledAttributes.getDrawable(5);
            }
            if (typedArrayObtainStyledAttributes.hasValue(7) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(7, -1)) != -1) {
                this.selectorDrawable = AppCompatResources.getDrawable(getContext(), resourceId);
            }
            if (typedArrayObtainStyledAttributes.hasValue(8)) {
                this.selector_alpha = typedArrayObtainStyledAttributes.getFloat(8, this.selector_alpha);
            }
            if (typedArrayObtainStyledAttributes.hasValue(9)) {
                this.selectorSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, this.selectorSize);
            }
            if (typedArrayObtainStyledAttributes.hasValue(2)) {
                this.flag_alpha = typedArrayObtainStyledAttributes.getFloat(2, this.flag_alpha);
            }
            if (typedArrayObtainStyledAttributes.hasValue(3)) {
                this.flag_isFlipAble = typedArrayObtainStyledAttributes.getBoolean(3, this.flag_isFlipAble);
            }
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                int integer = typedArrayObtainStyledAttributes.getInteger(0, 0);
                if (integer == 0) {
                    this.actionMode = ActionMode.ALWAYS;
                } else if (integer == 1) {
                    this.actionMode = ActionMode.LAST;
                }
            }
            if (typedArrayObtainStyledAttributes.hasValue(1)) {
                this.debounceDuration = typedArrayObtainStyledAttributes.getInteger(1, (int) this.debounceDuration);
            }
            if (typedArrayObtainStyledAttributes.hasValue(6)) {
                this.preferenceName = typedArrayObtainStyledAttributes.getString(6);
            }
            if (typedArrayObtainStyledAttributes.hasValue(4)) {
                setInitialColor(typedArrayObtainStyledAttributes.getColor(4, -1));
            }
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void onCreate() {
        setPadding(0, 0, 0, 0);
        ImageView imageView = new ImageView(getContext());
        this.palette = imageView;
        Drawable drawable = this.paletteDrawable;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.palette, layoutParams);
        ImageView imageView2 = new ImageView(getContext());
        this.selector = imageView2;
        Drawable drawable2 = this.selectorDrawable;
        if (drawable2 != null) {
            imageView2.setImageDrawable(drawable2);
        } else {
            imageView2.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.ic_wheel));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        if (this.selectorSize != 0) {
            layoutParams2.width = SizeUtils.dp2Px(getContext(), this.selectorSize);
            layoutParams2.height = SizeUtils.dp2Px(getContext(), this.selectorSize);
        }
        layoutParams2.gravity = 17;
        addView(this.selector, layoutParams2);
        this.selector.setAlpha(this.selector_alpha);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.blackhub.bronline.game.common.colorpickerview.ColorPickerView.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                ColorPickerView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                ColorPickerView.this.onFinishInflated();
            }
        });
    }

    @Override // android.view.View
    public void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
        super.onSizeChanged(width, height, oldWidth, oldHeight);
        if (this.palette.getDrawable() == null) {
            this.palette.setImageDrawable(new ColorHsvPalette(getResources(), Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)));
        }
    }

    public final void onFinishInflated() {
        if (getParent() != null && (getParent() instanceof ViewGroup)) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
        if (getPreferenceName() != null) {
            this.preferenceManager.restoreColorPickerData(this);
            final int color = this.preferenceManager.getColor(getPreferenceName(), -1);
            if (!(this.palette.getDrawable() instanceof ColorHsvPalette) || color == -1) {
                return;
            }
            post(new Runnable() { // from class: com.blackhub.bronline.game.common.colorpickerview.ColorPickerView$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    lambda$onFinishInflated$0(color);
                }
            });
            return;
        }
        selectCenter();
    }

    public final /* synthetic */ void lambda$onFinishInflated$0(int i) {
        try {
            selectByHsvColor(i);
        } catch (IllegalAccessException e) {
            String message = e.getMessage();
            Objects.requireNonNull(message);
            UtilsKt.crashlyticsRecordNewException(message);
        }
    }

    public void onCreateByBuilder(Builder builder) {
        setLayoutParams(new FrameLayout.LayoutParams(SizeUtils.dp2Px(getContext(), builder.width), SizeUtils.dp2Px(getContext(), builder.height)));
        this.paletteDrawable = builder.paletteDrawable;
        this.selectorDrawable = builder.selectorDrawable;
        this.selector_alpha = builder.selector_alpha;
        this.flag_alpha = builder.flag_alpha;
        this.selectorSize = builder.selectorSize;
        this.debounceDuration = builder.debounceDuration;
        onCreate();
        if (builder.colorPickerViewListener != null) {
            setColorListener(builder.colorPickerViewListener);
        }
        if (builder.alphaSlideBar != null) {
            attachAlphaSlider(builder.alphaSlideBar);
        }
        if (builder.brightnessSlider != null) {
            attachBrightnessSlider(builder.brightnessSlider);
        }
        if (builder.actionMode != null) {
            this.actionMode = builder.actionMode;
        }
        if (builder.flagView != null) {
            setFlagView(builder.flagView);
        }
        if (builder.preferenceName != null) {
            setPreferenceName(builder.preferenceName);
        }
        if (builder.initialColor != 0) {
            setInitialColor(builder.initialColor);
        }
        if (builder.lifecycleOwner != null) {
            setLifecycleOwner(builder.lifecycleOwner);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) throws Resources.NotFoundException {
        if (!isEnabled()) {
            return false;
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0 || actionMasked == 1 || actionMasked == 2) {
            if (getFlagView() != null) {
                getFlagView().receiveOnTouchEvent(event);
            }
            this.selector.setPressed(true);
            return onTouchReceived(event);
        }
        this.selector.setPressed(false);
        return false;
    }

    @MainThread
    public final boolean onTouchReceived(final MotionEvent event) {
        Point colorPoint = PointMapper.getColorPoint(this, new Point((int) event.getX(), (int) event.getY()));
        int colorFromBitmap = getColorFromBitmap(colorPoint.x, colorPoint.y);
        this.selectedPureColor = colorFromBitmap;
        this.selectedColor = colorFromBitmap;
        this.selectedPoint = PointMapper.getColorPoint(this, new Point(colorPoint.x, colorPoint.y));
        setCoordinate(colorPoint.x, colorPoint.y);
        if (this.actionMode == ActionMode.LAST) {
            notifyToFlagView(this.selectedPoint);
            if (event.getAction() == 1) {
                notifyColorChanged();
            }
        } else {
            notifyColorChanged();
        }
        return true;
    }

    public boolean isHuePalette() {
        return this.palette.getDrawable() != null && (this.palette.getDrawable() instanceof ColorHsvPalette);
    }

    public final void notifyColorChanged() {
        this.debounceHandler.removeCallbacksAndMessages(null);
        this.debounceHandler.postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.common.colorpickerview.ColorPickerView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                lambda$notifyColorChanged$1();
            }
        }, this.debounceDuration);
    }

    public final /* synthetic */ void lambda$notifyColorChanged$1() {
        fireColorListener(getColor(), true);
        notifyToFlagView(this.selectedPoint);
    }

    public int getColorFromBitmap(float x, float y) {
        Matrix matrix = new Matrix();
        this.palette.getImageMatrix().invert(matrix);
        float[] fArr = {x, y};
        matrix.mapPoints(fArr);
        if (this.palette.getDrawable() != null && (this.palette.getDrawable() instanceof BitmapDrawable)) {
            float f = fArr[0];
            if (f >= 0.0f && fArr[1] >= 0.0f && f < this.palette.getDrawable().getIntrinsicWidth() && fArr[1] < this.palette.getDrawable().getIntrinsicHeight()) {
                invalidate();
                if (this.palette.getDrawable() instanceof ColorHsvPalette) {
                    float width = x - (getWidth() * 0.5f);
                    float[] fArr2 = {0.0f, 0.0f, 1.0f};
                    fArr2[0] = ((float) ((Math.atan2(y - (getHeight() * 0.5f), -width) / 3.141592653589793d) * 180.0d)) + 180.0f;
                    fArr2[1] = Math.max(0.0f, Math.min(1.0f, (float) (Math.sqrt((width * width) + (13 * 13)) / (Math.min(getWidth(), getHeight()) * 0.5f))));
                    return Color.HSVToColor(fArr2);
                }
                Rect bounds = this.palette.getDrawable().getBounds();
                return ((BitmapDrawable) this.palette.getDrawable()).getBitmap().getPixel((int) ((fArr[0] / bounds.width()) * ((BitmapDrawable) this.palette.getDrawable()).getBitmap().getWidth()), (int) ((fArr[1] / bounds.height()) * ((BitmapDrawable) this.palette.getDrawable()).getBitmap().getHeight()));
            }
        }
        return 0;
    }

    public void setColorListener(ColorPickerViewListener colorListener) {
        this.colorListener = colorListener;
    }

    public void fireColorListener(@ColorInt int color, final boolean fromUser) {
        if (this.colorListener != null) {
            this.selectedColor = color;
            if (getAlphaSlideBar() != null) {
                getAlphaSlideBar().notifyColor();
                this.selectedColor = getAlphaSlideBar().assembleColor();
            }
            if (getBrightnessSlider() != null) {
                getBrightnessSlider().notifyColor();
                this.selectedColor = getBrightnessSlider().assembleColor();
            }
            ColorPickerViewListener colorPickerViewListener = this.colorListener;
            if (colorPickerViewListener instanceof ColorListener) {
                ((ColorListener) colorPickerViewListener).onColorSelected(this.selectedColor, fromUser);
            } else if (colorPickerViewListener instanceof ColorEnvelopeListener) {
                ((ColorEnvelopeListener) this.colorListener).onColorSelected(new ColorEnvelope(this.selectedColor), fromUser);
            }
            FlagView flagView = this.flagView;
            if (flagView != null) {
                flagView.onRefresh(getColorEnvelope());
                invalidate();
            }
            if (this.VISIBLE_FLAG) {
                this.VISIBLE_FLAG = false;
                ImageView imageView = this.selector;
                if (imageView != null) {
                    imageView.setAlpha(this.selector_alpha);
                }
                FlagView flagView2 = this.flagView;
                if (flagView2 != null) {
                    flagView2.setAlpha(this.flag_alpha);
                }
            }
        }
    }

    public final void notifyToSlideBars() {
        AlphaSlideBar alphaSlideBar = this.alphaSlideBar;
        if (alphaSlideBar != null) {
            alphaSlideBar.notifyColor();
        }
        BrightnessSlideBar brightnessSlideBar = this.brightnessSlider;
        if (brightnessSlideBar != null) {
            brightnessSlideBar.notifyColor();
            if (this.brightnessSlider.assembleColor() != -1) {
                this.selectedColor = this.brightnessSlider.assembleColor();
                return;
            }
            AlphaSlideBar alphaSlideBar2 = this.alphaSlideBar;
            if (alphaSlideBar2 != null) {
                this.selectedColor = alphaSlideBar2.assembleColor();
            }
        }
    }

    public final void notifyToFlagView(Point point) {
        Point centerPoint = getCenterPoint(point.x, point.y);
        FlagView flagView = this.flagView;
        if (flagView != null) {
            if (flagView.getFlagMode() == FlagMode.ALWAYS) {
                this.flagView.visible();
            }
            int width = (centerPoint.x - (this.flagView.getWidth() / 2)) + (this.selector.getWidth() / 2);
            if (this.flagView.isFlipAble()) {
                if (centerPoint.y - this.flagView.getHeight() > 0) {
                    this.flagView.setRotation(0.0f);
                    this.flagView.setX(width);
                    this.flagView.setY(centerPoint.y - 1);
                } else {
                    this.flagView.setRotation(180.0f);
                    this.flagView.setX(width);
                    this.flagView.setY((centerPoint.y + 1) - (this.selector.getHeight() * 0.5f));
                }
            } else {
                this.flagView.setRotation(0.0f);
                this.flagView.setX(width);
                this.flagView.setY(centerPoint.y - 1);
            }
            this.flagView.onRefresh(getColorEnvelope());
            if (width < 0) {
                this.flagView.setX(0.0f);
            }
            if (width + this.flagView.getWidth() > getWidth()) {
                this.flagView.setX(getWidth() - this.flagView.getWidth());
            }
        }
    }

    @ColorInt
    public int getColor() {
        return this.selectedColor;
    }

    @Override // android.view.View
    @FloatRange(from = 0.0d, to = 1.0d)
    public float getAlpha() {
        return Color.alpha(getColor()) / 255.0f;
    }

    @ColorInt
    public int getPureColor() {
        return this.selectedPureColor;
    }

    public void setPureColor(@ColorInt int color) {
        this.selectedPureColor = color;
    }

    public ColorEnvelope getColorEnvelope() {
        return new ColorEnvelope(getColor());
    }

    public FlagView getFlagView() {
        return this.flagView;
    }

    public void setFlagView(@NonNull FlagView flagView) {
        flagView.gone();
        addView(flagView);
        this.flagView = flagView;
        flagView.setAlpha(this.flag_alpha);
        flagView.setFlipAble(this.flag_isFlipAble);
    }

    public long getDebounceDuration() {
        return this.debounceDuration;
    }

    public void setDebounceDuration(long debounceDuration) {
        this.debounceDuration = debounceDuration;
    }

    public final Point getCenterPoint(int x, int y) {
        return new Point(x - (this.selector.getWidth() / 2), y - (this.selector.getMeasuredHeight() / 2));
    }

    public ImageView getSelector() {
        return this.selector;
    }

    public float getSelectorX() {
        return this.selector.getX() - (this.selector.getWidth() * 0.5f);
    }

    public float getSelectorY() {
        return this.selector.getY() - (this.selector.getMeasuredHeight() * 0.5f);
    }

    public Point getSelectedPoint() {
        return this.selectedPoint;
    }

    public void setSelectorPoint(int x, int y) {
        Point colorPoint = PointMapper.getColorPoint(this, new Point(x, y));
        int colorFromBitmap = getColorFromBitmap(colorPoint.x, colorPoint.y);
        this.selectedPureColor = colorFromBitmap;
        this.selectedColor = colorFromBitmap;
        this.selectedPoint = new Point(colorPoint.x, colorPoint.y);
        setCoordinate(colorPoint.x, colorPoint.y);
        fireColorListener(getColor(), false);
        notifyToFlagView(this.selectedPoint);
    }

    public void moveSelectorPoint(int x, int y, @ColorInt int color) {
        this.selectedPureColor = color;
        this.selectedColor = color;
        this.selectedPoint = new Point(x, y);
        setCoordinate(x, y);
        fireColorListener(getColor(), false);
        notifyToFlagView(this.selectedPoint);
    }

    public void setCoordinate(int x, int y) {
        this.selector.setX(x - (0 * 0.5f));
        this.selector.setY(y - (4 * 0.5f));
    }

    public void setInitialColor(@ColorInt final int color) {
        if (getPreferenceName() == null || (getPreferenceName() != null && this.preferenceManager.getColor(getPreferenceName(), -1) == -1)) {
            post(new Runnable() { // from class: com.blackhub.bronline.game.common.colorpickerview.ColorPickerView$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    lambda$setInitialColor$2(color);
                }
            });
        }
    }

    public final /* synthetic */ void lambda$setInitialColor$2(int i) {
        try {
            selectByHsvColor(i);
        } catch (IllegalAccessException e) {
            String message = e.getMessage();
            Objects.requireNonNull(message);
            UtilsKt.crashlyticsRecordNewException(message);
        }
    }

    public void setInitialColorRes(@ColorRes final int colorRes) {
        setInitialColor(ContextCompat.getColor(getContext(), colorRes));
    }

    public void selectByHsvColor(@ColorInt int color) throws IllegalAccessException {
        if (this.palette.getDrawable() instanceof ColorHsvPalette) {
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            float width = getWidth() * 0.5f;
            float height = getHeight() * 0.5f;
            Point colorPoint = PointMapper.getColorPoint(this, new Point((int) ((fArr[1] * Math.min(width, height) * Math.cos(Math.toRadians(fArr[0]))) + width), (int) (((-2) * Math.sin(Math.toRadians(fArr[0]))) + height)));
            this.selectedPureColor = color;
            this.selectedColor = color;
            this.selectedPoint = new Point(colorPoint.x, colorPoint.y);
            if (getAlphaSlideBar() != null) {
                getAlphaSlideBar().setSelectorByHalfSelectorPosition(getAlpha());
            }
            if (getBrightnessSlider() != null) {
                getBrightnessSlider().setSelectorByHalfSelectorPosition(fArr[2]);
            }
            setCoordinate(colorPoint.x, colorPoint.y);
            fireColorListener(getColor(), false);
            notifyToFlagView(this.selectedPoint);
            return;
        }
        throw new IllegalAccessException("selectByHsvColor(@ColorInt int color) can be called only when the palette is an instance of ColorHsvPalette. Use setHsvPaletteDrawable();");
    }

    public void selectByHsvColorRes(@ColorRes int resource) throws IllegalAccessException {
        selectByHsvColor(ContextCompat.getColor(getContext(), resource));
    }

    public void setHsvPaletteDrawable() {
        setPaletteDrawable(new ColorHsvPalette(getResources(), Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888)));
    }

    public void setPaletteDrawable(Drawable drawable) {
        removeView(this.palette);
        ImageView imageView = new ImageView(getContext());
        this.palette = imageView;
        this.paletteDrawable = drawable;
        imageView.setImageDrawable(drawable);
        addView(this.palette);
        removeView(this.selector);
        addView(this.selector);
        this.selectedPureColor = -1;
        notifyToSlideBars();
        FlagView flagView = this.flagView;
        if (flagView != null) {
            removeView(flagView);
            addView(this.flagView);
        }
        if (this.VISIBLE_FLAG) {
            return;
        }
        this.VISIBLE_FLAG = true;
        ImageView imageView2 = this.selector;
        if (imageView2 != null) {
            this.selector_alpha = imageView2.getAlpha();
            this.selector.setAlpha(0.0f);
        }
        FlagView flagView2 = this.flagView;
        if (flagView2 != null) {
            this.flag_alpha = flagView2.getAlpha();
            this.flagView.setAlpha(0.0f);
        }
    }

    public void setSelectorDrawable(Drawable drawable) {
        this.selector.setImageDrawable(drawable);
    }

    public void selectCenter() {
        setSelectorPoint(getWidth() / 2, getMeasuredHeight() / 2);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.selector.setVisibility(enabled ? View.VISIBLE : View.INVISIBLE);
        if (getAlphaSlideBar() != null) {
            getAlphaSlideBar().setEnabled(enabled);
        }
        if (getBrightnessSlider() != null) {
            getBrightnessSlider().setEnabled(enabled);
        }
        if (enabled) {
            this.palette.clearColorFilter();
        } else {
            this.palette.setColorFilter(Color.argb(70, 255, 255, 255));
        }
    }

    public ActionMode getActionMode() {
        return this.actionMode;
    }

    public void setActionMode(ActionMode actionMode) {
        this.actionMode = actionMode;
    }

    @Nullable
    public AlphaSlideBar getAlphaSlideBar() {
        return this.alphaSlideBar;
    }

    public void attachAlphaSlider(@NonNull AlphaSlideBar alphaSlideBar) {
        this.alphaSlideBar = alphaSlideBar;
        alphaSlideBar.attachColorPickerView(this);
        alphaSlideBar.notifyColor();
        if (getPreferenceName() != null) {
            alphaSlideBar.setPreferenceName(getPreferenceName());
        }
    }

    @Nullable
    public BrightnessSlideBar getBrightnessSlider() {
        return this.brightnessSlider;
    }

    public void attachBrightnessSlider(@NonNull BrightnessSlideBar brightnessSlider) {
        this.brightnessSlider = brightnessSlider;
        brightnessSlider.attachColorPickerView(this);
        brightnessSlider.notifyColor();
        if (getPreferenceName() != null) {
            brightnessSlider.setPreferenceName(getPreferenceName());
        }
    }

    @Nullable
    public String getPreferenceName() {
        return this.preferenceName;
    }

    public void setPreferenceName(@Nullable String preferenceName) {
        this.preferenceName = preferenceName;
        AlphaSlideBar alphaSlideBar = this.alphaSlideBar;
        if (alphaSlideBar != null) {
            alphaSlideBar.setPreferenceName(preferenceName);
        }
        BrightnessSlideBar brightnessSlideBar = this.brightnessSlider;
        if (brightnessSlideBar != null) {
            brightnessSlideBar.setPreferenceName(preferenceName);
        }
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    public void removeLifecycleOwner(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    public void onDestroy() {
        this.preferenceManager.saveColorPickerData(this);
    }

    /* loaded from: classes.dex */
    public static class Builder {
        public AlphaSlideBar alphaSlideBar;
        public BrightnessSlideBar brightnessSlider;
        public ColorPickerViewListener colorPickerViewListener;
        public final Context context;
        public FlagView flagView;
        public LifecycleOwner lifecycleOwner;
        public Drawable paletteDrawable;
        public String preferenceName;
        public Drawable selectorDrawable;
        public int debounceDuration = 0;
        public ActionMode actionMode = ActionMode.ALWAYS;

        @ColorInt
        public int initialColor = 0;

        @FloatRange(from = 0.0d, to = 1.0d)
        public float selector_alpha = 1.0f;

        @FloatRange(from = 0.0d, to = 1.0d)
        public float flag_alpha = 1.0f;

        @Px
        public int selectorSize = 0;

        @InterfaceC3499Dp
        public int width = -1;

        @InterfaceC3499Dp
        public int height = -1;

        public Builder setFlagIsFlipAble(boolean isFlipAble) {
            return this;
        }

        public Builder(Context context) {
            this.context = context;
        }

        public Builder setColorListener(ColorPickerViewListener colorPickerViewListener) {
            this.colorPickerViewListener = colorPickerViewListener;
            return this;
        }

        public Builder setDebounceDuration(int debounceDuration) {
            this.debounceDuration = debounceDuration;
            return this;
        }

        public Builder setPaletteDrawable(@NonNull Drawable palette) {
            this.paletteDrawable = palette;
            return this;
        }

        public Builder setSelectorDrawable(@NonNull Drawable selector) {
            this.selectorDrawable = selector;
            return this;
        }

        public Builder setFlagView(@NonNull FlagView flagView) {
            this.flagView = flagView;
            return this;
        }

        public Builder setAlphaSlideBar(AlphaSlideBar alphaSlideBar) {
            this.alphaSlideBar = alphaSlideBar;
            return this;
        }

        public Builder setBrightnessSlideBar(BrightnessSlideBar brightnessSlideBar) {
            this.brightnessSlider = brightnessSlideBar;
            return this;
        }

        public Builder setActionMode(ActionMode actionMode) {
            this.actionMode = actionMode;
            return this;
        }

        public Builder setSelectorAlpha(@FloatRange(from = 0.0d, to = 1.0d) float alpha) {
            this.selector_alpha = alpha;
            return this;
        }

        public Builder setFlagAlpha(@FloatRange(from = 0.0d, to = 1.0d) float alpha) {
            this.flag_alpha = alpha;
            return this;
        }

        public Builder setSelectorSize(@Px int size) {
            this.selectorSize = size;
            return this;
        }

        public Builder setWidth(@InterfaceC3499Dp int width) {
            this.width = width;
            return this;
        }

        public Builder setHeight(@InterfaceC3499Dp int height) {
            this.height = height;
            return this;
        }

        public Builder setInitialColor(@ColorInt int initialColor) {
            this.initialColor = initialColor;
            return this;
        }

        public Builder setInitialColorRes(@ColorRes int initialColorRes) {
            this.initialColor = ContextCompat.getColor(this.context, initialColorRes);
            return this;
        }

        public Builder setPreferenceName(@Nullable String preferenceName) {
            this.preferenceName = preferenceName;
            return this;
        }

        public Builder setLifecycleOwner(LifecycleOwner lifecycleOwner) {
            this.lifecycleOwner = lifecycleOwner;
            return this;
        }

        public ColorPickerView build() {
            ColorPickerView colorPickerView = new ColorPickerView(this.context);
            colorPickerView.onCreateByBuilder(this);
            return colorPickerView;
        }
    }
}

