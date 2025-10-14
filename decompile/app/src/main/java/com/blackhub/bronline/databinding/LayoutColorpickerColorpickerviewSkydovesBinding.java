package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.blackhub.bronline.game.common.colorpickerview.ColorPickerView;
import com.blackhub.bronline.game.common.colorpickerview.sliders.AlphaSlideBar;
import com.blackhub.bronline.game.common.colorpickerview.sliders.BrightnessSlideBar;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class LayoutColorpickerColorpickerviewSkydovesBinding implements ViewBinding {

    @NonNull
    public final AlphaSlideBar alphaSlideBar;

    @NonNull
    public final BrightnessSlideBar brightnessSlideBar;

    @NonNull
    public final ColorPickerView colorPickerView;

    @NonNull
    public final FrameLayout containerAlphaSlideBar;

    @NonNull
    public final FrameLayout containerBrightnessSlideBar;

    @NonNull
    public final FrameLayout containerColorPicker;

    @NonNull
    public final ScrollView rootView;

    @NonNull
    public final Space spaceBottom;

    public LayoutColorpickerColorpickerviewSkydovesBinding(@NonNull ScrollView rootView, @NonNull AlphaSlideBar alphaSlideBar, @NonNull BrightnessSlideBar brightnessSlideBar, @NonNull ColorPickerView colorPickerView, @NonNull FrameLayout containerAlphaSlideBar, @NonNull FrameLayout containerBrightnessSlideBar, @NonNull FrameLayout containerColorPicker, @NonNull Space spaceBottom) {
        this.rootView = rootView;
        this.alphaSlideBar = alphaSlideBar;
        this.brightnessSlideBar = brightnessSlideBar;
        this.colorPickerView = colorPickerView;
        this.containerAlphaSlideBar = containerAlphaSlideBar;
        this.containerBrightnessSlideBar = containerBrightnessSlideBar;
        this.containerColorPicker = containerColorPicker;
        this.spaceBottom = spaceBottom;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ScrollView getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutColorpickerColorpickerviewSkydovesBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutColorpickerColorpickerviewSkydovesBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_colorpicker_colorpickerview_skydoves, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static LayoutColorpickerColorpickerviewSkydovesBinding bind(@NonNull View rootView) {
        int i = R.id.alphaSlideBar;
        AlphaSlideBar alphaSlideBar = (AlphaSlideBar) ViewBindings.findChildViewById(rootView, R.id.alphaSlideBar);
        if (alphaSlideBar != null) {
            i = R.id.brightnessSlideBar;
            BrightnessSlideBar brightnessSlideBar = (BrightnessSlideBar) ViewBindings.findChildViewById(rootView, R.id.brightnessSlideBar);
            if (brightnessSlideBar != null) {
                i = R.id.colorPickerView;
                ColorPickerView colorPickerView = (ColorPickerView) ViewBindings.findChildViewById(rootView, R.id.colorPickerView);
                if (colorPickerView != null) {
                    i = R.id.containerAlphaSlideBar;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.containerAlphaSlideBar);
                    if (frameLayout != null) {
                        i = R.id.containerBrightnessSlideBar;
                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.containerBrightnessSlideBar);
                        if (frameLayout2 != null) {
                            i = R.id.containerColorPicker;
                            FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.containerColorPicker);
                            if (frameLayout3 != null) {
                                i = R.id.space_bottom;
                                Space space = (Space) ViewBindings.findChildViewById(rootView, R.id.space_bottom);
                                if (space != null) {
                                    return new LayoutColorpickerColorpickerviewSkydovesBinding((ScrollView) rootView, alphaSlideBar, brightnessSlideBar, colorPickerView, frameLayout, frameLayout2, frameLayout3, space);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
