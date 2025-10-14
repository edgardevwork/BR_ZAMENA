package com.blackhub.bronline.launcher;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CustomEditTextForMainActivity.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes6.dex */
public final class CustomEditTextForMainActivity extends AppCompatEditText {
    public static final int $stable = 8;
    public Function0<Unit> onKeyboardClosed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomEditTextForMainActivity(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final Function0<Unit> getOnKeyboardClosed() {
        Function0<Unit> function0 = this.onKeyboardClosed;
        if (function0 != null) {
            return function0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onKeyboardClosed");
        return null;
    }

    public final void setOnKeyboardClosed(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onKeyboardClosed = function0;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int keyCode, @NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (keyCode == 4 && event.getAction() == 1) {
            getOnKeyboardClosed().invoke();
            return false;
        }
        return super.dispatchKeyEvent(event);
    }
}

