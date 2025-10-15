package androidx.compose.foundation.gestures;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.modifier.ModifierLocalMap;
import androidx.compose.p003ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p003ui.modifier.ModifierLocalModifierNodeKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Scrollable.kt */
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m7105d2 = {"Landroidx/compose/foundation/gestures/ModifierLocalScrollableContainerProvider;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "enabled", "", "(Z)V", "getEnabled", "()Z", "setEnabled", "modifierLocalMap", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "providedValues", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class ModifierLocalScrollableContainerProvider extends Modifier.Node implements ModifierLocalModifierNode {
    public boolean enabled;

    @NotNull
    public final ModifierLocalMap modifierLocalMap = ModifierLocalModifierNodeKt.modifierLocalMapOf(TuplesKt.m7112to(ScrollableKt.getModifierLocalScrollableContainer(), Boolean.TRUE));

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public ModifierLocalScrollableContainerProvider(boolean z) {
        this.enabled = z;
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalModifierNode
    @NotNull
    public ModifierLocalMap getProvidedValues() {
        if (this.enabled) {
            return this.modifierLocalMap;
        }
        return ModifierLocalModifierNodeKt.modifierLocalMapOf();
    }
}
