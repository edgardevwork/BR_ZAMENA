package com.blackhub.bronline.game.common;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class DialogNoNavBar extends Dialog {
    public DialogNoNavBar(@NonNull Context context) {
        super(context);
    }

    @Override // android.app.Dialog
    public void show() {
        Window window = getWindow();
        Objects.requireNonNull(window);
        window.setFlags(8, 8);
        super.show();
        super.getWindow().getDecorView().setSystemUiVisibility(4098);
        getWindow().clearFlags(8);
    }
}
