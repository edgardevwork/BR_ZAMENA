package com.blackhub.bronline.game.core;

import android.os.Build;
import android.widget.EditText;
import com.blackhub.bronline.game.core.preferences.Preferences;


public class JNIHelper {
    public static void fixEditTextForAndroid10Xiaomi(EditText editText) {
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi") && Build.VERSION.SDK_INT == 29) {
            editText.setCursorVisible(false);
        }
    }

    public static int getCurrServer() {
        return Preferences.getInteger(JNIActivity.getContext(), Preferences.USER_SERVER, 0);
    }
}
