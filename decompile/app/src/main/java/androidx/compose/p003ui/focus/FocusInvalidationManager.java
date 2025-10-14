package androidx.compose.p003ui.focus;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.node.DelegatableNodeKt;
import androidx.compose.p003ui.node.DelegatingNode;
import androidx.compose.p003ui.node.NodeKind;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: FocusInvalidationManager.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\rJ%\u0010\u000f\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u00110\b2\u0006\u0010\u0010\u001a\u0002H\u0011H\u0002¢\u0006\u0002\u0010\u0012R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m7105d2 = {"Landroidx/compose/ui/focus/FocusInvalidationManager;", "", "onRequestApplyChangesListener", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function1;)V", "focusEventNodes", "", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "focusPropertiesNodes", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "focusTargetNodes", "Landroidx/compose/ui/focus/FocusTargetNode;", "invalidateNodes", "scheduleInvalidation", "node", ExifInterface.GPS_DIRECTION_TRUE, "(Ljava/util/Set;Ljava/lang/Object;)V", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class FocusInvalidationManager {
    public static final int $stable = 8;

    @NotNull
    private final Function1<Function0<Unit>, Unit> onRequestApplyChangesListener;

    @NotNull
    private Set<FocusTargetNode> focusTargetNodes = new LinkedHashSet();

    @NotNull
    private Set<FocusEventModifierNode> focusEventNodes = new LinkedHashSet();

    @NotNull
    private Set<FocusPropertiesModifierNode> focusPropertiesNodes = new LinkedHashSet();

    @NotNull
    private final Function0<Unit> invalidateNodes = new Function0<Unit>() { // from class: androidx.compose.ui.focus.FocusInvalidationManager$invalidateNodes$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            int i;
            int i2;
            FocusState focusState;
            int i3;
            int i4;
            Set set = this.this$0.focusPropertiesNodes;
            FocusInvalidationManager focusInvalidationManager = this.this$0;
            Iterator it = set.iterator();
            while (true) {
                int i5 = 1024;
                int i6 = 16;
                int i7 = 0;
                int i8 = 1;
                if (!it.hasNext()) {
                    this.this$0.focusPropertiesNodes.clear();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Set<FocusEventModifierNode> set2 = this.this$0.focusEventNodes;
                    FocusInvalidationManager focusInvalidationManager2 = this.this$0;
                    for (FocusEventModifierNode focusEventModifierNode : set2) {
                        if (focusEventModifierNode.getNode().getIsAttached()) {
                            int iM12816constructorimpl = NodeKind.m12816constructorimpl(i5);
                            Modifier.Node node = focusEventModifierNode.getNode();
                            int i9 = i7;
                            int i10 = i8;
                            FocusTargetNode focusTargetNode = null;
                            MutableVector mutableVector = null;
                            while (node != null) {
                                if (node instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                                    if (focusTargetNode != null) {
                                        i9 = i8;
                                    }
                                    if (focusInvalidationManager2.focusTargetNodes.contains(focusTargetNode2)) {
                                        linkedHashSet.add(focusTargetNode2);
                                        i10 = i7;
                                    }
                                    focusTargetNode = focusTargetNode2;
                                } else if ((node.getKindSet() & iM12816constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                    Modifier.Node delegate = ((DelegatingNode) node).getDelegate();
                                    int i11 = i7;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iM12816constructorimpl) != 0) {
                                            i11++;
                                            if (i11 == i8) {
                                                node = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[i6], i7);
                                                }
                                                if (node != null) {
                                                    mutableVector.add(node);
                                                    node = null;
                                                }
                                                mutableVector.add(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        i8 = 1;
                                    }
                                    int i12 = i8;
                                    if (i11 == i12) {
                                        i8 = i12;
                                    }
                                }
                                node = DelegatableNodeKt.pop(mutableVector);
                                i8 = 1;
                            }
                            if (!focusEventModifierNode.getNode().getIsAttached()) {
                                throw new IllegalStateException("visitChildren called on an unattached node".toString());
                            }
                            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[i6], i7);
                            Modifier.Node child = focusEventModifierNode.getNode().getChild();
                            if (child == null) {
                                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusEventModifierNode.getNode());
                            } else {
                                mutableVector2.add(child);
                            }
                            while (mutableVector2.isNotEmpty()) {
                                Modifier.Node nodePop = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                                if ((nodePop.getAggregateChildKindSet() & iM12816constructorimpl) == 0) {
                                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, nodePop);
                                } else {
                                    while (nodePop != null) {
                                        if ((nodePop.getKindSet() & iM12816constructorimpl) != 0) {
                                            MutableVector mutableVector3 = null;
                                            while (nodePop != null) {
                                                if (nodePop instanceof FocusTargetNode) {
                                                    FocusTargetNode focusTargetNode3 = (FocusTargetNode) nodePop;
                                                    if (focusTargetNode != null) {
                                                        i9 = 1;
                                                    }
                                                    if (focusInvalidationManager2.focusTargetNodes.contains(focusTargetNode3)) {
                                                        linkedHashSet.add(focusTargetNode3);
                                                        i10 = i7;
                                                    }
                                                    focusTargetNode = focusTargetNode3;
                                                } else {
                                                    if ((nodePop.getKindSet() & iM12816constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                                        Modifier.Node delegate2 = ((DelegatingNode) nodePop).getDelegate();
                                                        int i13 = i7;
                                                        while (delegate2 != null) {
                                                            if ((delegate2.getKindSet() & iM12816constructorimpl) != 0) {
                                                                i13++;
                                                                if (i13 == 1) {
                                                                    nodePop = delegate2;
                                                                    i4 = 0;
                                                                } else {
                                                                    if (mutableVector3 == null) {
                                                                        Modifier.Node[] nodeArr = new Modifier.Node[i6];
                                                                        i4 = 0;
                                                                        mutableVector3 = new MutableVector(nodeArr, 0);
                                                                    } else {
                                                                        i4 = 0;
                                                                    }
                                                                    if (nodePop != null) {
                                                                        mutableVector3.add(nodePop);
                                                                        nodePop = null;
                                                                    }
                                                                    mutableVector3.add(delegate2);
                                                                }
                                                            } else {
                                                                i4 = i7;
                                                            }
                                                            delegate2 = delegate2.getChild();
                                                            i7 = i4;
                                                            i6 = 16;
                                                        }
                                                        i3 = i7;
                                                        if (i13 == 1) {
                                                        }
                                                        i7 = i3;
                                                        i6 = 16;
                                                    }
                                                    nodePop = DelegatableNodeKt.pop(mutableVector3);
                                                    i7 = i3;
                                                    i6 = 16;
                                                }
                                                i3 = i7;
                                                nodePop = DelegatableNodeKt.pop(mutableVector3);
                                                i7 = i3;
                                                i6 = 16;
                                            }
                                        } else {
                                            nodePop = nodePop.getChild();
                                            i7 = i7;
                                            i6 = 16;
                                        }
                                    }
                                }
                                i7 = i7;
                                i6 = 16;
                            }
                            i = i7;
                            i2 = 1;
                            if (i10 != 0) {
                                if (i9 != 0) {
                                    focusState = FocusEventModifierNodeKt.getFocusState(focusEventModifierNode);
                                } else if (focusTargetNode == null || (focusState = focusTargetNode.getFocusState()) == null) {
                                    focusState = FocusStateImpl.Inactive;
                                }
                                focusEventModifierNode.onFocusEvent(focusState);
                            }
                        } else {
                            focusEventModifierNode.onFocusEvent(FocusStateImpl.Inactive);
                            i = i7;
                            i2 = i8;
                        }
                        i8 = i2;
                        i5 = 1024;
                        i7 = i;
                        i6 = 16;
                    }
                    this.this$0.focusEventNodes.clear();
                    for (FocusTargetNode focusTargetNode4 : this.this$0.focusTargetNodes) {
                        if (focusTargetNode4.getIsAttached()) {
                            FocusStateImpl focusState2 = focusTargetNode4.getFocusState();
                            focusTargetNode4.invalidateFocus$ui_release();
                            if (focusState2 != focusTargetNode4.getFocusState() || linkedHashSet.contains(focusTargetNode4)) {
                                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode4);
                            }
                        }
                    }
                    this.this$0.focusTargetNodes.clear();
                    linkedHashSet.clear();
                    if (!this.this$0.focusPropertiesNodes.isEmpty()) {
                        throw new IllegalStateException("Unprocessed FocusProperties nodes".toString());
                    }
                    if (!this.this$0.focusEventNodes.isEmpty()) {
                        throw new IllegalStateException("Unprocessed FocusEvent nodes".toString());
                    }
                    if (!this.this$0.focusTargetNodes.isEmpty()) {
                        throw new IllegalStateException("Unprocessed FocusTarget nodes".toString());
                    }
                    return;
                }
                FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) it.next();
                if (focusPropertiesModifierNode.getNode().getIsAttached()) {
                    int iM12816constructorimpl2 = NodeKind.m12816constructorimpl(1024);
                    Modifier.Node node2 = focusPropertiesModifierNode.getNode();
                    MutableVector mutableVector4 = null;
                    while (node2 != null) {
                        if (node2 instanceof FocusTargetNode) {
                            focusInvalidationManager.focusTargetNodes.add((FocusTargetNode) node2);
                        } else if ((node2.getKindSet() & iM12816constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                            int i14 = 0;
                            for (Modifier.Node delegate3 = ((DelegatingNode) node2).getDelegate(); delegate3 != null; delegate3 = delegate3.getChild()) {
                                if ((delegate3.getKindSet() & iM12816constructorimpl2) != 0) {
                                    i14++;
                                    if (i14 == 1) {
                                        node2 = delegate3;
                                    } else {
                                        if (mutableVector4 == null) {
                                            mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node2 != null) {
                                            mutableVector4.add(node2);
                                            node2 = null;
                                        }
                                        mutableVector4.add(delegate3);
                                    }
                                }
                            }
                            if (i14 == 1) {
                            }
                        }
                        node2 = DelegatableNodeKt.pop(mutableVector4);
                    }
                    if (!focusPropertiesModifierNode.getNode().getIsAttached()) {
                        throw new IllegalStateException("visitChildren called on an unattached node".toString());
                    }
                    MutableVector mutableVector5 = new MutableVector(new Modifier.Node[16], 0);
                    Modifier.Node child2 = focusPropertiesModifierNode.getNode().getChild();
                    if (child2 == null) {
                        DelegatableNodeKt.addLayoutNodeChildren(mutableVector5, focusPropertiesModifierNode.getNode());
                    } else {
                        mutableVector5.add(child2);
                    }
                    while (mutableVector5.isNotEmpty()) {
                        Modifier.Node nodePop2 = (Modifier.Node) mutableVector5.removeAt(mutableVector5.getSize() - 1);
                        if ((nodePop2.getAggregateChildKindSet() & iM12816constructorimpl2) == 0) {
                            DelegatableNodeKt.addLayoutNodeChildren(mutableVector5, nodePop2);
                        } else {
                            while (true) {
                                if (nodePop2 == null) {
                                    break;
                                }
                                if ((nodePop2.getKindSet() & iM12816constructorimpl2) != 0) {
                                    MutableVector mutableVector6 = null;
                                    while (nodePop2 != null) {
                                        if (nodePop2 instanceof FocusTargetNode) {
                                            focusInvalidationManager.focusTargetNodes.add((FocusTargetNode) nodePop2);
                                        } else if ((nodePop2.getKindSet() & iM12816constructorimpl2) != 0 && (nodePop2 instanceof DelegatingNode)) {
                                            int i15 = 0;
                                            for (Modifier.Node delegate4 = ((DelegatingNode) nodePop2).getDelegate(); delegate4 != null; delegate4 = delegate4.getChild()) {
                                                if ((delegate4.getKindSet() & iM12816constructorimpl2) != 0) {
                                                    i15++;
                                                    if (i15 == 1) {
                                                        nodePop2 = delegate4;
                                                    } else {
                                                        if (mutableVector6 == null) {
                                                            mutableVector6 = new MutableVector(new Modifier.Node[16], 0);
                                                        }
                                                        if (nodePop2 != null) {
                                                            mutableVector6.add(nodePop2);
                                                            nodePop2 = null;
                                                        }
                                                        mutableVector6.add(delegate4);
                                                    }
                                                }
                                            }
                                            if (i15 == 1) {
                                            }
                                        }
                                        nodePop2 = DelegatableNodeKt.pop(mutableVector6);
                                    }
                                } else {
                                    nodePop2 = nodePop2.getChild();
                                }
                            }
                        }
                    }
                }
            }
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public FocusInvalidationManager(@NotNull Function1<? super Function0<Unit>, Unit> function1) {
        this.onRequestApplyChangesListener = function1;
    }

    public final void scheduleInvalidation(@NotNull FocusTargetNode node) {
        scheduleInvalidation(this.focusTargetNodes, node);
    }

    public final void scheduleInvalidation(@NotNull FocusEventModifierNode node) {
        scheduleInvalidation(this.focusEventNodes, node);
    }

    public final void scheduleInvalidation(@NotNull FocusPropertiesModifierNode node) {
        scheduleInvalidation(this.focusPropertiesNodes, node);
    }

    private final <T> void scheduleInvalidation(Set<T> set, T t) {
        if (set.add(t) && this.focusTargetNodes.size() + this.focusEventNodes.size() + this.focusPropertiesNodes.size() == 1) {
            this.onRequestApplyChangesListener.invoke(this.invalidateNodes);
        }
    }
}
