package androidx.compose.p003ui.focus;

import androidx.compose.p003ui.node.DelegatableNodeKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: FocusPropertiesModifierNode.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m7105d2 = {"invalidateFocusProperties", "", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "ui_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class FocusPropertiesModifierNodeKt {
    public static final void invalidateFocusProperties(@NotNull FocusPropertiesModifierNode focusPropertiesModifierNode) {
        DelegatableNodeKt.requireOwner(focusPropertiesModifierNode).getFocusOwner().scheduleInvalidation(focusPropertiesModifierNode);
    }
}
