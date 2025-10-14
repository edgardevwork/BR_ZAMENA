package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.input.pointer.PointerIconKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BasicText.android.kt */
@Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0000¨\u0006\u0004"}, m7105d2 = {"textPointerHoverIcon", "Landroidx/compose/ui/Modifier;", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class BasicText_androidKt {
    @NotNull
    public static final Modifier textPointerHoverIcon(@NotNull Modifier modifier, @Nullable SelectionRegistrar selectionRegistrar) {
        return selectionRegistrar == null ? modifier : PointerIconKt.pointerHoverIcon$default(modifier, TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
    }
}
