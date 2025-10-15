package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.foundation.text2.input.internal.TextLayoutState;
import androidx.compose.foundation.text2.input.internal.TransformedTextFieldState;
import androidx.compose.p003ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.layout.OnGloballyPositionedModifier;
import androidx.compose.p003ui.node.DelegatingNode;
import androidx.compose.p003ui.node.DrawModifierNode;
import androidx.compose.p003ui.node.SemanticsModifierNode;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextFieldMagnifier.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H&J\f\u0010\u0013\u001a\u00020\u0007*\u00020\u0014H\u0016J\f\u0010\u0015\u001a\u00020\u0007*\u00020\u0016H\u0016¨\u0006\u0017"}, m7105d2 = {"Landroidx/compose/foundation/text2/input/internal/selection/TextFieldMagnifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/layout/OnGloballyPositionedModifier;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "()V", "onGloballyPositioned", "", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "update", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textFieldSelectionState", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "textLayoutState", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "isFocused", "", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public abstract class TextFieldMagnifierNode extends DelegatingNode implements OnGloballyPositionedModifier, DrawModifierNode, SemanticsModifierNode {
    public static final int $stable = 0;

    @Override // androidx.compose.p003ui.node.SemanticsModifierNode
    public void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    @Override // androidx.compose.p003ui.node.DrawModifierNode
    public void draw(@NotNull ContentDrawScope contentDrawScope) {
    }

    @Override // androidx.compose.p003ui.layout.OnGloballyPositionedModifier
    public void onGloballyPositioned(@NotNull LayoutCoordinates coordinates) {
    }

    public abstract void update(@NotNull TransformedTextFieldState textFieldState, @NotNull TextFieldSelectionState textFieldSelectionState, @NotNull TextLayoutState textLayoutState, boolean isFocused);
}
