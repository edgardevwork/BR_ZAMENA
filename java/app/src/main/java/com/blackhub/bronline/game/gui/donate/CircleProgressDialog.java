package com.blackhub.bronline.game.gui.donate;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.DialogNoNavBar;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CircleProgressDialog.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class CircleProgressDialog extends DialogNoNavBar {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleProgressDialog(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setDimAmount(0.4f);
        }
        setCancelable(false);
        setContentView(R.layout.donate_dialog_progress);
    }

    public final void showProgressDialog() {
        show();
        Window window = getWindow();
        UsefulKt.hideSystemUI(window != null ? window.getDecorView() : null);
    }

    public final void closeProgress() {
        dismiss();
    }
}

