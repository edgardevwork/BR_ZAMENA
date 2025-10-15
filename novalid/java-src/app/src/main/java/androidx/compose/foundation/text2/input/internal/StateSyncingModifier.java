package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.text2.input.TextFieldState;
import androidx.compose.p003ui.node.ModifierNodeElement;
import androidx.compose.p003ui.platform.InspectorInfo;
import androidx.compose.p003ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StateSyncingModifier.kt */
@Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0013\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\f\u0010\u0015\u001a\u00020\t*\u00020\u0016H\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m7105d2 = {"Landroidx/compose/foundation/text2/input/internal/StateSyncingModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text2/input/internal/StateSyncingModifierNode;", "state", "Landroidx/compose/foundation/text2/input/TextFieldState;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChanged", "Lkotlin/Function1;", "", "writeSelectionFromTextFieldValue", "", "(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Z)V", "create", "equals", "other", "", "hashCode", "", "update", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
final class StateSyncingModifier extends ModifierNodeElement<StateSyncingModifierNode> {

    @NotNull
    public final Function1<TextFieldValue, Unit> onValueChanged;

    @NotNull
    public final TextFieldState state;

    @NotNull
    public final TextFieldValue value;
    public final boolean writeSelectionFromTextFieldValue;

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        return false;
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StateSyncingModifier(@NotNull TextFieldState textFieldState, @NotNull TextFieldValue textFieldValue, @NotNull Function1<? super TextFieldValue, Unit> function1, boolean z) {
        this.state = textFieldState;
        this.value = textFieldValue;
        this.onValueChanged = function1;
        this.writeSelectionFromTextFieldValue = z;
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    @NotNull
    public StateSyncingModifierNode create() {
        return new StateSyncingModifierNode(this.state, this.onValueChanged, this.writeSelectionFromTextFieldValue);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void update(@NotNull StateSyncingModifierNode node) {
        node.update(this.value, this.onValueChanged);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public int hashCode() {
        return this.state.hashCode();
    }
}
