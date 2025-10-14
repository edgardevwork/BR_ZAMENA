package com.google.android.material.textfield;

import android.widget.EditText;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class EditTextUtils {
    public static boolean isEditable(@NonNull EditText editText) {
        return editText.getInputType() != 0;
    }
}
