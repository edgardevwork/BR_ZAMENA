package com.blackhub.bronline.game.common.colorpickerview.listeners;

import androidx.annotation.ColorInt;

/* loaded from: classes3.dex */
public interface ColorListener extends ColorPickerViewListener {
    void onColorSelected(@ColorInt int color, boolean fromUser);
}
