package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p003ui.text.input.ImeAction;
import androidx.compose.p003ui.text.input.KeyboardCapitalization;
import androidx.compose.p003ui.text.input.KeyboardType;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextFieldDecoratorModifier.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¨\u0006\u0003"}, m7105d2 = {"withDefaultsFrom", "Landroidx/compose/foundation/text/KeyboardOptions;", RemoteConfigComponent.DEFAULTS_FILE_NAME, "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class TextFieldDecoratorModifierKt {
    @NotNull
    public static final KeyboardOptions withDefaultsFrom(@NotNull KeyboardOptions keyboardOptions, @Nullable KeyboardOptions keyboardOptions2) {
        int capitalization;
        int keyboardType;
        int imeAction;
        if (keyboardOptions2 == null) {
            return keyboardOptions;
        }
        if (!KeyboardCapitalization.m13361equalsimpl0(keyboardOptions.getCapitalization(), KeyboardCapitalization.INSTANCE.m13370getNoneIUNYP9k())) {
            capitalization = keyboardOptions.getCapitalization();
        } else {
            capitalization = keyboardOptions2.getCapitalization();
        }
        int i = capitalization;
        boolean z = keyboardOptions.getAutoCorrect() && keyboardOptions2.getAutoCorrect();
        if (!KeyboardType.m13376equalsimpl0(keyboardOptions.getKeyboardType(), KeyboardType.INSTANCE.m13396getTextPjHm6EE())) {
            keyboardType = keyboardOptions.getKeyboardType();
        } else {
            keyboardType = keyboardOptions2.getKeyboardType();
        }
        int i2 = keyboardType;
        if (!ImeAction.m13329equalsimpl0(keyboardOptions.getImeAction(), ImeAction.INSTANCE.m13341getDefaulteUduSuo())) {
            imeAction = keyboardOptions.getImeAction();
        } else {
            imeAction = keyboardOptions2.getImeAction();
        }
        return new KeyboardOptions(i, z, i2, imeAction, null, 16, null);
    }
}
