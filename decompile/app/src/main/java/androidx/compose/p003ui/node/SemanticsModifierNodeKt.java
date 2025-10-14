package androidx.compose.p003ui.node;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.layout.LayoutCoordinatesKt;
import androidx.compose.p003ui.semantics.SemanticsActions;
import androidx.compose.p003ui.semantics.SemanticsConfiguration;
import androidx.compose.p003ui.semantics.SemanticsConfigurationKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: SemanticsModifierNode.kt */
@Metadata(m7104d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007\u001a\u0014\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u0000\u001a\u00020\u0001H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, m7105d2 = {"useMinimumTouchTarget", "", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getUseMinimumTouchTarget", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Z", "invalidateSemantics", "", "Landroidx/compose/ui/node/SemanticsModifierNode;", "touchBoundsInRoot", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSemanticsModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsModifierNode.kt\nandroidx/compose/ui/node/SemanticsModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,107:1\n76#2:108\n76#2:109\n*S KotlinDebug\n*F\n+ 1 SemanticsModifierNode.kt\nandroidx/compose/ui/node/SemanticsModifierNodeKt\n*L\n102#1:108\n105#1:109\n*E\n"})
/* loaded from: classes2.dex */
public final class SemanticsModifierNodeKt {
    public static final void invalidateSemantics(@NotNull SemanticsModifierNode semanticsModifierNode) {
        DelegatableNodeKt.requireLayoutNode(semanticsModifierNode).invalidateSemantics$ui_release();
    }

    public static final boolean getUseMinimumTouchTarget(@NotNull SemanticsConfiguration semanticsConfiguration) {
        return SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.getOnClick()) != null;
    }

    @NotNull
    public static final Rect touchBoundsInRoot(@NotNull Modifier.Node node, boolean z) {
        if (!node.getNode().getIsAttached()) {
            return Rect.INSTANCE.getZero();
        }
        if (!z) {
            return LayoutCoordinatesKt.boundsInRoot(DelegatableNodeKt.m12713requireCoordinator64DMado(node, NodeKind.m12816constructorimpl(8)));
        }
        return DelegatableNodeKt.m12713requireCoordinator64DMado(node, NodeKind.m12816constructorimpl(8)).touchBoundsInRoot();
    }
}
