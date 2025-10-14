package androidx.compose.foundation.text;

import android.view.InputDevice;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusDirection;
import androidx.compose.p003ui.focus.FocusManager;
import androidx.compose.p003ui.input.key.KeyEvent;
import androidx.compose.p003ui.input.key.KeyEventType;
import androidx.compose.p003ui.input.key.KeyEvent_androidKt;
import androidx.compose.p003ui.input.key.KeyInputModifierKt;
import androidx.compose.p003ui.input.key.Key_androidKt;
import androidx.compose.p003ui.platform.SoftwareKeyboardController;
import androidx.core.view.InputDeviceCompat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextFieldFocusModifier.android.kt */
@Metadata(m7104d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, m7105d2 = {"interceptDPadAndMoveFocus", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/text/TextFieldState;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "isKeyCode", "", "Landroidx/compose/ui/input/key/KeyEvent;", "keyCode", "", "isKeyCode-YhN2O0w", "(Landroid/view/KeyEvent;I)Z", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class TextFieldFocusModifier_androidKt {
    @NotNull
    public static final Modifier interceptDPadAndMoveFocus(@NotNull Modifier modifier, @NotNull final TextFieldState textFieldState, @NotNull final FocusManager focusManager) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m8476invokeZmokQxo(keyEvent.m12337unboximpl());
            }

            @NotNull
            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m8476invokeZmokQxo(@NotNull android.view.KeyEvent keyEvent) {
                InputDevice device = keyEvent.getDevice();
                boolean zMo11033moveFocus3ESFkO8 = false;
                if (device != null && device.supportsSource(InputDeviceCompat.SOURCE_DPAD) && !device.isVirtual() && KeyEventType.m12341equalsimpl0(KeyEvent_androidKt.m12349getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m12345getKeyDownCS__XNY())) {
                    if (TextFieldFocusModifier_androidKt.m8475isKeyCodeYhN2O0w(keyEvent, 19)) {
                        zMo11033moveFocus3ESFkO8 = focusManager.mo11033moveFocus3ESFkO8(FocusDirection.INSTANCE.m11032getUpdhqQ8s());
                    } else if (TextFieldFocusModifier_androidKt.m8475isKeyCodeYhN2O0w(keyEvent, 20)) {
                        zMo11033moveFocus3ESFkO8 = focusManager.mo11033moveFocus3ESFkO8(FocusDirection.INSTANCE.m11025getDowndhqQ8s());
                    } else if (TextFieldFocusModifier_androidKt.m8475isKeyCodeYhN2O0w(keyEvent, 21)) {
                        zMo11033moveFocus3ESFkO8 = focusManager.mo11033moveFocus3ESFkO8(FocusDirection.INSTANCE.m11028getLeftdhqQ8s());
                    } else if (TextFieldFocusModifier_androidKt.m8475isKeyCodeYhN2O0w(keyEvent, 22)) {
                        zMo11033moveFocus3ESFkO8 = focusManager.mo11033moveFocus3ESFkO8(FocusDirection.INSTANCE.m11031getRightdhqQ8s());
                    } else if (TextFieldFocusModifier_androidKt.m8475isKeyCodeYhN2O0w(keyEvent, 23)) {
                        SoftwareKeyboardController keyboardController = textFieldState.getKeyboardController();
                        if (keyboardController != null) {
                            keyboardController.show();
                        }
                        zMo11033moveFocus3ESFkO8 = true;
                    }
                }
                return Boolean.valueOf(zMo11033moveFocus3ESFkO8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isKeyCode-YhN2O0w, reason: not valid java name */
    public static final boolean m8475isKeyCodeYhN2O0w(android.view.KeyEvent keyEvent, int i) {
        return Key_androidKt.m12355getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m12348getKeyZmokQxo(keyEvent)) == i;
    }
}
