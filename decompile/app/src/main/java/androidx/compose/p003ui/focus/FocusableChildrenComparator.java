package androidx.compose.p003ui.focus;

import androidx.compose.p003ui.node.DelegatableNodeKt;
import androidx.compose.p003ui.node.LayoutNode;
import androidx.compose.runtime.collection.MutableVector;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OneDimensionalFocusSearch.kt */
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¨\u0006\r"}, m7105d2 = {"Landroidx/compose/ui/focus/FocusableChildrenComparator;", "Ljava/util/Comparator;", "Landroidx/compose/ui/focus/FocusTargetNode;", "Lkotlin/Comparator;", "()V", "compare", "", "focusTarget1", "focusTarget2", "pathFromRoot", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nOneDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/FocusableChildrenComparator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,266:1\n1#2:267\n48#3:268\n523#3:269\n523#3:270\n1208#4:271\n1187#4,2:272\n*S KotlinDebug\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/FocusableChildrenComparator\n*L\n245#1:268\n249#1:269\n250#1:270\n257#1:271\n257#1:272,2\n*E\n"})
/* loaded from: classes4.dex */
public final class FocusableChildrenComparator implements Comparator<FocusTargetNode> {

    @NotNull
    public static final FocusableChildrenComparator INSTANCE = new FocusableChildrenComparator();

    @Override // java.util.Comparator
    public int compare(@Nullable FocusTargetNode focusTarget1, @Nullable FocusTargetNode focusTarget2) {
        if (focusTarget1 == null) {
            throw new IllegalArgumentException("compare requires non-null focus targets".toString());
        }
        if (focusTarget2 == null) {
            throw new IllegalArgumentException("compare requires non-null focus targets".toString());
        }
        int i = 0;
        if (!FocusTraversalKt.isEligibleForFocusSearch(focusTarget1) || !FocusTraversalKt.isEligibleForFocusSearch(focusTarget2)) {
            if (FocusTraversalKt.isEligibleForFocusSearch(focusTarget1)) {
                return -1;
            }
            return FocusTraversalKt.isEligibleForFocusSearch(focusTarget2) ? 1 : 0;
        }
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTarget1);
        LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(focusTarget2);
        if (Intrinsics.areEqual(layoutNodeRequireLayoutNode, layoutNodeRequireLayoutNode2)) {
            return 0;
        }
        MutableVector<LayoutNode> mutableVectorPathFromRoot = pathFromRoot(layoutNodeRequireLayoutNode);
        MutableVector<LayoutNode> mutableVectorPathFromRoot2 = pathFromRoot(layoutNodeRequireLayoutNode2);
        int iMin = Math.min(mutableVectorPathFromRoot.getSize() - 1, mutableVectorPathFromRoot2.getSize() - 1);
        if (iMin >= 0) {
            while (Intrinsics.areEqual(mutableVectorPathFromRoot.getContent()[i], mutableVectorPathFromRoot2.getContent()[i])) {
                if (i != iMin) {
                    i++;
                }
            }
            return Intrinsics.compare(mutableVectorPathFromRoot.getContent()[i].getPlaceOrder$ui_release(), mutableVectorPathFromRoot2.getContent()[i].getPlaceOrder$ui_release());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
    }

    public final MutableVector<LayoutNode> pathFromRoot(LayoutNode layoutNode) {
        MutableVector<LayoutNode> mutableVector = new MutableVector<>(new LayoutNode[16], 0);
        while (layoutNode != null) {
            mutableVector.add(0, layoutNode);
            layoutNode = layoutNode.getParent$ui_release();
        }
        return mutableVector;
    }
}
