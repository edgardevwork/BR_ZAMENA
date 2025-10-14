package androidx.compose.p003ui.node;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: LayoutModifierNode.kt */
@Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0007"}, m7105d2 = {"invalidateLayer", "", "Landroidx/compose/ui/node/LayoutModifierNode;", "invalidateMeasurement", "invalidatePlacement", "remeasureSync", "requestRemeasure", "ui_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLayoutModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNode.kt\nandroidx/compose/ui/node/LayoutModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,309:1\n72#2:310\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNode.kt\nandroidx/compose/ui/node/LayoutModifierNodeKt\n*L\n145#1:310\n*E\n"})
/* loaded from: classes4.dex */
public final class LayoutModifierNodeKt {
    public static final void remeasureSync(@NotNull LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.requireLayoutNode(layoutModifierNode).forceRemeasure();
    }

    public static final void invalidatePlacement(@NotNull LayoutModifierNode layoutModifierNode) {
        LayoutNode.requestRelayout$ui_release$default(DelegatableNodeKt.requireLayoutNode(layoutModifierNode), false, 1, null);
    }

    public static final void invalidateMeasurement(@NotNull LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.requireLayoutNode(layoutModifierNode).invalidateMeasurements$ui_release();
    }

    public static final void requestRemeasure(@NotNull LayoutModifierNode layoutModifierNode) {
        LayoutNode.requestRemeasure$ui_release$default(DelegatableNodeKt.requireLayoutNode(layoutModifierNode), false, false, 3, null);
    }

    public static final void invalidateLayer(@NotNull LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.m12713requireCoordinator64DMado(layoutModifierNode, NodeKind.m12816constructorimpl(2)).invalidateLayer();
    }
}
