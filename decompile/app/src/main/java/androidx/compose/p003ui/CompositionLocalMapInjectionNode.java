package androidx.compose.p003ui;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.node.DelegatableNodeKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ComposedModifier.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016R$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004¨\u0006\u000b"}, m7105d2 = {"Landroidx/compose/ui/CompositionLocalMapInjectionNode;", "Landroidx/compose/ui/Modifier$Node;", "map", "Landroidx/compose/runtime/CompositionLocalMap;", "(Landroidx/compose/runtime/CompositionLocalMap;)V", "value", "getMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "setMap", "onAttach", "", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class CompositionLocalMapInjectionNode extends Modifier.Node {
    public static final int $stable = 8;

    @NotNull
    private CompositionLocalMap map;

    public CompositionLocalMapInjectionNode(@NotNull CompositionLocalMap compositionLocalMap) {
        this.map = compositionLocalMap;
    }

    @NotNull
    public final CompositionLocalMap getMap() {
        return this.map;
    }

    public final void setMap(@NotNull CompositionLocalMap compositionLocalMap) {
        this.map = compositionLocalMap;
        DelegatableNodeKt.requireLayoutNode(this).setCompositionLocalMap(compositionLocalMap);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        DelegatableNodeKt.requireLayoutNode(this).setCompositionLocalMap(this.map);
    }
}
