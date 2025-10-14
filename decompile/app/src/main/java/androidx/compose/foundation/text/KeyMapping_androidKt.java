package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.p003ui.input.key.Key;
import androidx.compose.p003ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KeyMapping.android.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m7105d2 = {"platformDefaultKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "getPlatformDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class KeyMapping_androidKt {

    @NotNull
    private static final KeyMapping platformDefaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMapping_androidKt$platformDefaultKeyMapping$1
        @Override // androidx.compose.foundation.text.KeyMapping
        @Nullable
        /* renamed from: map-ZmokQxo */
        public KeyCommand mo8420mapZmokQxo(@NotNull KeyEvent event) {
            KeyCommand keyCommand = null;
            if (KeyEvent_androidKt.m12354isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m12351isAltPressedZmokQxo(event)) {
                long jM12348getKeyZmokQxo = KeyEvent_androidKt.m12348getKeyZmokQxo(event);
                MappedKeys mappedKeys = MappedKeys.INSTANCE;
                if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo, mappedKeys.m8442getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_LEFT;
                } else if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo, mappedKeys.m8443getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                } else if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo, mappedKeys.m8444getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_HOME;
                } else if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo, mappedKeys.m8441getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_END;
                }
            } else if (KeyEvent_androidKt.m12351isAltPressedZmokQxo(event)) {
                long jM12348getKeyZmokQxo2 = KeyEvent_androidKt.m12348getKeyZmokQxo(event);
                MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo2, mappedKeys2.m8442getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_LEFT;
                } else if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo2, mappedKeys2.m8443getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_RIGHT;
                } else if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo2, mappedKeys2.m8444getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.HOME;
                } else if (Key.m12040equalsimpl0(jM12348getKeyZmokQxo2, mappedKeys2.m8441getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.END;
                }
            }
            return keyCommand == null ? KeyMappingKt.getDefaultKeyMapping().mo8420mapZmokQxo(event) : keyCommand;
        }
    };

    @NotNull
    public static final KeyMapping getPlatformDefaultKeyMapping() {
        return platformDefaultKeyMapping;
    }
}
