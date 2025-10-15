package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.text2.input.TextFieldState;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: StateSyncingModifier.kt */
@Metadata(m7104d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a8\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0000¨\u0006\u000b"}, m7105d2 = {"syncTextFieldState", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/text2/input/TextFieldState;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChanged", "Lkotlin/Function1;", "", "writeSelectionFromTextFieldValue", "", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class StateSyncingModifierKt {
    @NotNull
    public static final Modifier syncTextFieldState(@NotNull Modifier modifier, @NotNull TextFieldState textFieldState, @NotNull TextFieldValue textFieldValue, @NotNull Function1<? super TextFieldValue, Unit> function1, boolean z) {
        return modifier.then(new StateSyncingModifier(textFieldState, textFieldValue, function1, z));
    }
}
