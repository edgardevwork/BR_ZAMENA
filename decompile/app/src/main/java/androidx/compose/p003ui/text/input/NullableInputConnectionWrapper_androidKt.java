package androidx.compose.p003ui.text.input;

import android.os.Build;
import android.view.inputmethod.InputConnection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: NullableInputConnectionWrapper.android.kt */
@Metadata(m7104d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¨\u0006\u0007"}, m7105d2 = {"NullableInputConnectionWrapper", "Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;", "delegate", "Landroid/view/inputmethod/InputConnection;", "onConnectionClosed", "Lkotlin/Function0;", "", "ui_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class NullableInputConnectionWrapper_androidKt {
    @NotNull
    public static final NullableInputConnectionWrapper NullableInputConnectionWrapper(@NotNull InputConnection inputConnection, @NotNull Function0<Unit> function0) {
        return Build.VERSION.SDK_INT >= 25 ? new NullableInputConnectionWrapperApi25(inputConnection, function0) : new NullableInputConnectionWrapperApi24(inputConnection, function0);
    }
}
