package com.blackhub.bronline.game.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.blackhub.bronline.game.core.JNIHelper;

/* loaded from: classes3.dex */
public class CustomEditTextWithBackPressEvent extends AppCompatEditText {
    public MyEditTextListener onBackPressListener;

    /* loaded from: classes.dex */
    public interface MyEditTextListener {
        void callback();
    }

    public CustomEditTextWithBackPressEvent(Context context, AttributeSet attrs) {
        super(context, attrs);
        JNIHelper.fixEditTextForAndroid10Xiaomi(this);
    }

    public void setOnBackPressListener(MyEditTextListener onBackPressListener) {
        this.onBackPressListener = onBackPressListener;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int keyCode, KeyEvent event) {
        MyEditTextListener myEditTextListener;
        if (!isFocused()) {
            requestFocus();
        }
        if (keyCode == 4 && event.getAction() == 1) {
            WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(getRootView());
            if (rootWindowInsets == null || !rootWindowInsets.isVisible(WindowInsetsCompat.Type.ime()) || (myEditTextListener = this.onBackPressListener) == null) {
                return false;
            }
            myEditTextListener.callback();
            return false;
        }
        return super.dispatchKeyEvent(event);
    }
}
