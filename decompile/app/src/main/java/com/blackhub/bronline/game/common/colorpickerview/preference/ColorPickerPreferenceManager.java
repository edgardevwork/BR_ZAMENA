package com.blackhub.bronline.game.common.colorpickerview.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import com.blackhub.bronline.game.common.colorpickerview.ColorPickerView;

/* loaded from: classes.dex */
public class ColorPickerPreferenceManager {
    public static final String AlphaSlider = "_SLIDER_ALPHA";
    public static final String BrightnessSlider = "_SLIDER_BRIGHTNESS";
    public static final String COLOR = "_COLOR";
    public static final String SelectorX = "_SELECTOR_X";
    public static final String SelectorY = "_SELECTOR_Y";
    public static ColorPickerPreferenceManager colorPickerPreferenceManager;
    public final SharedPreferences sharedPreferences;

    public ColorPickerPreferenceManager(Context context) {
        this.sharedPreferences = context.getSharedPreferences(context.getPackageName(), 0);
    }

    public static ColorPickerPreferenceManager getInstance(Context context) {
        if (colorPickerPreferenceManager == null) {
            colorPickerPreferenceManager = new ColorPickerPreferenceManager(context);
        }
        return colorPickerPreferenceManager;
    }

    public ColorPickerPreferenceManager setColor(String name, int color) {
        this.sharedPreferences.edit().putInt(getColorName(name), color).apply();
        return colorPickerPreferenceManager;
    }

    public int getColor(String name, int defaultColor) {
        return this.sharedPreferences.getInt(getColorName(name), defaultColor);
    }

    public ColorPickerPreferenceManager clearSavedColor(String name) {
        this.sharedPreferences.edit().remove(getColorName(name)).apply();
        return colorPickerPreferenceManager;
    }

    public ColorPickerPreferenceManager setSelectorPosition(String name, Point position) {
        this.sharedPreferences.edit().putInt(getSelectorXName(name), position.x).apply();
        this.sharedPreferences.edit().putInt(getSelectorYName(name), position.y).apply();
        return colorPickerPreferenceManager;
    }

    public Point getSelectorPosition(String name, Point defaultPoint) {
        return new Point(this.sharedPreferences.getInt(getSelectorXName(name), defaultPoint.x), this.sharedPreferences.getInt(getSelectorYName(name), defaultPoint.y));
    }

    public ColorPickerPreferenceManager clearSavedSelectorPosition(String name) {
        this.sharedPreferences.edit().remove(getSelectorXName(name)).apply();
        this.sharedPreferences.edit().remove(getSelectorYName(name)).apply();
        return colorPickerPreferenceManager;
    }

    public ColorPickerPreferenceManager setAlphaSliderPosition(String name, int position) {
        this.sharedPreferences.edit().putInt(getAlphaSliderName(name), position).apply();
        return colorPickerPreferenceManager;
    }

    public int getAlphaSliderPosition(String name, int defaultPosition) {
        return this.sharedPreferences.getInt(getAlphaSliderName(name), defaultPosition);
    }

    public ColorPickerPreferenceManager clearSavedAlphaSliderPosition(String name) {
        this.sharedPreferences.edit().remove(getAlphaSliderName(name)).apply();
        return colorPickerPreferenceManager;
    }

    public ColorPickerPreferenceManager setBrightnessSliderPosition(String name, int position) {
        this.sharedPreferences.edit().putInt(getBrightnessSliderName(name), position).apply();
        return colorPickerPreferenceManager;
    }

    public int getBrightnessSliderPosition(String name, int defaultPosition) {
        return this.sharedPreferences.getInt(getBrightnessSliderName(name), defaultPosition);
    }

    public ColorPickerPreferenceManager clearSavedBrightnessSlider(String name) {
        this.sharedPreferences.edit().remove(getBrightnessSliderName(name)).apply();
        return colorPickerPreferenceManager;
    }

    public void saveColorPickerData(ColorPickerView colorPickerView) {
        if (colorPickerView == null || colorPickerView.getPreferenceName() == null) {
            return;
        }
        String preferenceName = colorPickerView.getPreferenceName();
        setColor(preferenceName, colorPickerView.getColor());
        setSelectorPosition(preferenceName, colorPickerView.getSelectedPoint());
        if (colorPickerView.getAlphaSlideBar() != null) {
            setAlphaSliderPosition(preferenceName, colorPickerView.getAlphaSlideBar().getSelectedX());
        }
        if (colorPickerView.getBrightnessSlider() != null) {
            setBrightnessSliderPosition(preferenceName, colorPickerView.getBrightnessSlider().getSelectedX());
        }
    }

    public void restoreColorPickerData(ColorPickerView colorPickerView) {
        if (colorPickerView == null || colorPickerView.getPreferenceName() == null) {
            return;
        }
        String preferenceName = colorPickerView.getPreferenceName();
        colorPickerView.setPureColor(getColor(preferenceName, -1));
        Point point = new Point(colorPickerView.getWidth() / 2, colorPickerView.getMeasuredHeight() / 2);
        colorPickerView.moveSelectorPoint(getSelectorPosition(preferenceName, point).x, getSelectorPosition(preferenceName, point).y, getColor(preferenceName, -1));
    }

    public ColorPickerPreferenceManager clearSavedAllData() {
        this.sharedPreferences.edit().clear().apply();
        return colorPickerPreferenceManager;
    }

    public String getColorName(String name) {
        return name + COLOR;
    }

    public String getSelectorXName(String name) {
        return name + SelectorX;
    }

    public String getSelectorYName(String name) {
        return name + SelectorY;
    }

    public String getAlphaSliderName(String name) {
        return name + AlphaSlider;
    }

    public String getBrightnessSliderName(String name) {
        return name + BrightnessSlider;
    }
}
