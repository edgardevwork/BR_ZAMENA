package androidx.compose.p003ui.node;

import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DensityKt;
import kotlin.Metadata;
import org.apache.ivy.osgi.p063p2.P2CompositeParser;
import org.jetbrains.annotations.NotNull;

/* compiled from: LayoutNode.kt */
@Metadata(m7104d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0000\u001a\f\u0010\n\u001a\u00020\u000b*\u00020\bH\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m7105d2 = {"DebugChanges", "", "getDebugChanges$annotations", "()V", "DefaultDensity", "Landroidx/compose/ui/unit/Density;", "add", "", "Landroidx/compose/ui/node/LayoutNode;", P2CompositeParser.ChildHandler.CHILD, "requireOwner", "Landroidx/compose/ui/node/Owner;", "ui_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class LayoutNodeKt {
    private static final boolean DebugChanges = false;

    @NotNull
    private static final Density DefaultDensity = DensityKt.Density$default(1.0f, 0.0f, 2, null);

    private static /* synthetic */ void getDebugChanges$annotations() {
    }

    @NotNull
    public static final Owner requireOwner(@NotNull LayoutNode layoutNode) {
        Owner owner = layoutNode.getOwner();
        if (owner != null) {
            return owner;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner".toString());
    }

    public static final void add(@NotNull LayoutNode layoutNode, @NotNull LayoutNode layoutNode2) {
        layoutNode.insertAt$ui_release(layoutNode.getChildren$ui_release().size(), layoutNode2);
    }
}
