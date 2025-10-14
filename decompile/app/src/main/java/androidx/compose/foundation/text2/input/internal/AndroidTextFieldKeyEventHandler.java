package androidx.compose.foundation.text2.input.internal;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState;
import androidx.compose.p003ui.focus.FocusDirection;
import androidx.compose.p003ui.focus.FocusManager;
import androidx.compose.p003ui.input.key.KeyEventType;
import androidx.compose.p003ui.input.key.KeyEvent_androidKt;
import androidx.compose.p003ui.platform.SoftwareKeyboardController;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.InputDeviceCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextFieldKeyEventHandler.android.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, m7105d2 = {"Landroidx/compose/foundation/text2/input/internal/AndroidTextFieldKeyEventHandler;", "Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler;", "()V", "onPreKeyEvent", "", "event", "Landroidx/compose/ui/input/key/KeyEvent;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textFieldSelectionState", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "keyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "onPreKeyEvent-MyFupTE", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;)Z", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class AndroidTextFieldKeyEventHandler extends TextFieldKeyEventHandler {
    public static final int $stable = 0;

    @Override // androidx.compose.foundation.text2.input.internal.TextFieldKeyEventHandler
    /* renamed from: onPreKeyEvent-MyFupTE, reason: not valid java name */
    public boolean mo8662onPreKeyEventMyFupTE(@NotNull KeyEvent event, @NotNull TransformedTextFieldState textFieldState, @NotNull TextFieldSelectionState textFieldSelectionState, @NotNull FocusManager focusManager, @NotNull SoftwareKeyboardController keyboardController) {
        if (super.mo8662onPreKeyEventMyFupTE(event, textFieldState, textFieldSelectionState, focusManager, keyboardController)) {
            return true;
        }
        InputDevice device = event.getDevice();
        if (device != null && device.supportsSource(InputDeviceCompat.SOURCE_DPAD) && !device.isVirtual() && KeyEventType.m12341equalsimpl0(KeyEvent_androidKt.m12349getTypeZmokQxo(event), KeyEventType.INSTANCE.m12345getKeyDownCS__XNY())) {
            if (TextFieldKeyEventHandler_androidKt.m8693isKeyCodeYhN2O0w(event, 19)) {
                return focusManager.mo11033moveFocus3ESFkO8(FocusDirection.INSTANCE.m11032getUpdhqQ8s());
            }
            if (TextFieldKeyEventHandler_androidKt.m8693isKeyCodeYhN2O0w(event, 20)) {
                return focusManager.mo11033moveFocus3ESFkO8(FocusDirection.INSTANCE.m11025getDowndhqQ8s());
            }
            if (TextFieldKeyEventHandler_androidKt.m8693isKeyCodeYhN2O0w(event, 21)) {
                return focusManager.mo11033moveFocus3ESFkO8(FocusDirection.INSTANCE.m11028getLeftdhqQ8s());
            }
            if (TextFieldKeyEventHandler_androidKt.m8693isKeyCodeYhN2O0w(event, 22)) {
                return focusManager.mo11033moveFocus3ESFkO8(FocusDirection.INSTANCE.m11031getRightdhqQ8s());
            }
            if (TextFieldKeyEventHandler_androidKt.m8693isKeyCodeYhN2O0w(event, 23)) {
                keyboardController.show();
                return true;
            }
        }
        return false;
    }
}
