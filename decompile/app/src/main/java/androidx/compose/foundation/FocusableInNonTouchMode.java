package androidx.compose.foundation;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusProperties;
import androidx.compose.p003ui.focus.FocusPropertiesModifierNode;
import androidx.compose.p003ui.input.InputMode;
import androidx.compose.p003ui.input.InputModeManager;
import androidx.compose.p003ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p003ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Focusable.kt */
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m7105d2 = {"Landroidx/compose/foundation/FocusableInNonTouchMode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "()V", "inputModeManager", "Landroidx/compose/ui/input/InputModeManager;", "getInputModeManager", "()Landroidx/compose/ui/input/InputModeManager;", "applyFocusProperties", "", "focusProperties", "Landroidx/compose/ui/focus/FocusProperties;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class FocusableInNonTouchMode extends Modifier.Node implements CompositionLocalConsumerModifierNode, FocusPropertiesModifierNode {
    private final InputModeManager getInputModeManager() {
        return (InputModeManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalInputModeManager());
    }

    @Override // androidx.compose.p003ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(@NotNull FocusProperties focusProperties) {
        focusProperties.setCanFocus(!InputMode.m12026equalsimpl0(getInputModeManager().mo12032getInputModeaOaMEAU(), InputMode.INSTANCE.m12031getTouchaOaMEAU()));
    }
}
