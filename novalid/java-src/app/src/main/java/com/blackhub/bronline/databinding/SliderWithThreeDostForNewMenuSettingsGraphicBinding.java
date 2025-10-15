package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;
import com.google.android.material.slider.Slider;

/* loaded from: classes3.dex */
public final class SliderWithThreeDostForNewMenuSettingsGraphicBinding implements ViewBinding {

    @NonNull
    public final View progress0;

    @NonNull
    public final View progress1;

    @NonNull
    public final View progress2;

    @NonNull
    public final View rootView;

    @NonNull
    public final Slider seekBar;

    public SliderWithThreeDostForNewMenuSettingsGraphicBinding(@NonNull View rootView, @NonNull View progress0, @NonNull View progress1, @NonNull View progress2, @NonNull Slider seekBar) {
        this.rootView = rootView;
        this.progress0 = progress0;
        this.progress1 = progress1;
        this.progress2 = progress2;
        this.seekBar = seekBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static SliderWithThreeDostForNewMenuSettingsGraphicBinding inflate(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        if (parent == null) {
            throw new NullPointerException("parent");
        }
        inflater.inflate(R.layout.slider_with_three_dost_for_new_menu_settings_graphic, parent);
        return bind(parent);
    }

    @NonNull
    public static SliderWithThreeDostForNewMenuSettingsGraphicBinding bind(@NonNull View rootView) {
        int i = R.id.progress_0;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.progress_0);
        if (viewFindChildViewById != null) {
            i = R.id.progress_1;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.progress_1);
            if (viewFindChildViewById2 != null) {
                i = R.id.progress_2;
                View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.progress_2);
                if (viewFindChildViewById3 != null) {
                    i = R.id.seek_bar;
                    Slider slider = (Slider) ViewBindings.findChildViewById(rootView, R.id.seek_bar);
                    if (slider != null) {
                        return new SliderWithThreeDostForNewMenuSettingsGraphicBinding(rootView, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, slider);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
