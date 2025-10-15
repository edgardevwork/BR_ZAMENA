package com.google.android.material.color;

import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: classes4.dex */
public class ColorContrastOptions {

    @StyleRes
    public final int highContrastThemeOverlayResourceId;

    @StyleRes
    public final int mediumContrastThemeOverlayResourceId;

    public ColorContrastOptions(Builder builder) {
        this.mediumContrastThemeOverlayResourceId = builder.mediumContrastThemeOverlayResourceId;
        this.highContrastThemeOverlayResourceId = builder.highContrastThemeOverlayResourceId;
    }

    @StyleRes
    public int getMediumContrastThemeOverlay() {
        return this.mediumContrastThemeOverlayResourceId;
    }

    @StyleRes
    public int getHighContrastThemeOverlay() {
        return this.highContrastThemeOverlayResourceId;
    }

    public static class Builder {

        @StyleRes
        public int highContrastThemeOverlayResourceId;

        @StyleRes
        public int mediumContrastThemeOverlayResourceId;

        @NonNull
        @CanIgnoreReturnValue
        public Builder setMediumContrastThemeOverlay(@StyleRes int i) {
            this.mediumContrastThemeOverlayResourceId = i;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setHighContrastThemeOverlay(@StyleRes int i) {
            this.highContrastThemeOverlayResourceId = i;
            return this;
        }

        @NonNull
        public ColorContrastOptions build() {
            return new ColorContrastOptions(this);
        }
    }
}
