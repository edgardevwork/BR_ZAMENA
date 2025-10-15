package androidx.compose.p003ui.node;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.DrawModifier;
import androidx.compose.p003ui.focus.FocusEventModifier;
import androidx.compose.p003ui.focus.FocusEventModifierNode;
import androidx.compose.p003ui.focus.FocusEventModifierNodeKt;
import androidx.compose.p003ui.focus.FocusOrderModifier;
import androidx.compose.p003ui.focus.FocusPropertiesModifierNode;
import androidx.compose.p003ui.focus.FocusPropertiesModifierNodeKt;
import androidx.compose.p003ui.focus.FocusTargetNode;
import androidx.compose.p003ui.focus.FocusTargetNodeKt;
import androidx.compose.p003ui.input.key.KeyInputModifierNode;
import androidx.compose.p003ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.p003ui.input.pointer.PointerInputModifier;
import androidx.compose.p003ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.p003ui.layout.IntermediateLayoutModifierNode;
import androidx.compose.p003ui.layout.LayoutModifier;
import androidx.compose.p003ui.layout.OnGloballyPositionedModifier;
import androidx.compose.p003ui.layout.OnPlacedModifier;
import androidx.compose.p003ui.layout.OnRemeasuredModifier;
import androidx.compose.p003ui.layout.ParentDataModifier;
import androidx.compose.p003ui.modifier.ModifierLocalConsumer;
import androidx.compose.p003ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p003ui.modifier.ModifierLocalProvider;
import androidx.compose.p003ui.semantics.SemanticsModifier;
import androidx.compose.runtime.collection.MutableVector;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: NodeKind.kt */
@Metadata(m7104d1 = {"\u00004\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a \u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0001H\u0000\u001a \u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\u0010\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001aH\u0000\u001a\u0010\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\u0010\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a#\u0010\u001c\u001a\u00020\t*\u00020\u00012\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\nH\u0080\nø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a#\u0010 \u001a\u00020\u0001*\u00020\u00012\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\nH\u0080\fø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\f\u0010$\u001a\u00020\u000e*\u00020%H\u0002\u001a\f\u0010&\u001a\u00020\t*\u00020%H\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003\"\u001c\u0010\b\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, m7105d2 = {"Inserted", "", "getInserted$annotations", "()V", "Removed", "getRemoved$annotations", "Updated", "getUpdated$annotations", "includeSelfInTraversal", "", "Landroidx/compose/ui/node/NodeKind;", "getIncludeSelfInTraversal-H91voCI", "(I)Z", "autoInvalidateInsertedNode", "", "node", "Landroidx/compose/ui/Modifier$Node;", "autoInvalidateNodeIncludingDelegates", "remainingSet", TypedValues.CycleType.S_WAVE_PHASE, "autoInvalidateNodeSelf", "selfKindSet", "autoInvalidateRemovedNode", "autoInvalidateUpdatedNode", "calculateNodeKindSetFrom", "element", "Landroidx/compose/ui/Modifier$Element;", "calculateNodeKindSetFromIncludingDelegates", "contains", "value", "contains-64DMado", "(II)Z", "or", "other", "or-64DMado", "(II)I", "scheduleInvalidationOfAssociatedFocusTargets", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "specifiesCanFocusProperty", "ui_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nNodeKind.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 5 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,342:1\n52#1:346\n52#1:348\n52#1:350\n52#1:352\n52#1:354\n52#1:356\n52#1:358\n52#1:360\n52#1:362\n52#1:364\n52#1:367\n52#1:369\n52#1:371\n52#1:373\n52#1:375\n52#1:377\n52#1:379\n52#1:381\n52#1:383\n52#1:385\n52#1:387\n52#1:389\n52#1:391\n52#1:393\n52#1:395\n52#1:397\n52#1:399\n55#1:408\n55#1:411\n55#1:413\n55#1:415\n55#1:417\n55#1:419\n55#1:421\n55#1:423\n84#2:343\n70#2:344\n72#2:345\n74#2:347\n76#2:349\n78#2:351\n80#2:353\n94#2:355\n92#2:357\n86#2:359\n82#2:361\n84#2:363\n70#2:365\n72#2:366\n74#2:368\n76#2:370\n78#2:372\n80#2:374\n82#2:376\n84#2:378\n86#2:380\n88#2:382\n90#2:384\n92#2:386\n94#2:388\n96#2:390\n98#2:392\n101#2:394\n104#2:396\n106#2:398\n72#2:407\n72#2:409\n86#2:410\n74#2:412\n76#2:414\n82#2:416\n90#2:418\n92#2:420\n94#2:422\n90#2:424\n1#3:400\n1#3:427\n234#4,6:401\n234#4,3:458\n237#4,3:478\n234#4,6:495\n276#5:425\n133#5:426\n134#5:428\n135#5,7:432\n142#5,9:440\n385#5,6:449\n395#5,2:456\n397#5,17:461\n414#5,8:481\n151#5,6:489\n1208#6:429\n1187#6,2:430\n48#7:439\n261#8:455\n*S KotlinDebug\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n*L\n113#1:346\n116#1:348\n119#1:350\n122#1:352\n128#1:354\n132#1:356\n136#1:358\n139#1:360\n142#1:362\n148#1:364\n161#1:367\n164#1:369\n167#1:371\n170#1:373\n173#1:375\n176#1:377\n179#1:379\n182#1:381\n185#1:383\n188#1:385\n191#1:387\n194#1:389\n197#1:391\n200#1:393\n203#1:395\n206#1:397\n209#1:399\n257#1:408\n264#1:411\n267#1:413\n270#1:415\n273#1:417\n276#1:419\n285#1:421\n294#1:423\n62#1:343\n111#1:344\n113#1:345\n116#1:347\n119#1:349\n122#1:351\n128#1:353\n132#1:355\n136#1:357\n139#1:359\n142#1:361\n148#1:363\n159#1:365\n161#1:366\n164#1:368\n167#1:370\n170#1:372\n173#1:374\n176#1:376\n179#1:378\n182#1:380\n185#1:382\n188#1:384\n191#1:386\n194#1:388\n197#1:390\n200#1:392\n203#1:394\n206#1:396\n209#1:398\n257#1:407\n260#1:409\n264#1:410\n267#1:412\n270#1:414\n273#1:416\n276#1:418\n285#1:420\n294#1:422\n300#1:424\n300#1:427\n244#1:401,6\n300#1:458,3\n300#1:478,3\n334#1:495,6\n300#1:425\n300#1:426\n300#1:428\n300#1:432,7\n300#1:440,9\n300#1:449,6\n300#1:456,2\n300#1:461,17\n300#1:481,8\n300#1:489,6\n300#1:429\n300#1:430,2\n300#1:439\n300#1:455\n*E\n"})
/* loaded from: classes4.dex */
public final class NodeKindKt {
    private static final int Inserted = 1;
    private static final int Removed = 2;
    private static final int Updated = 0;

    /* renamed from: contains-64DMado */
    public static final boolean m12824contains64DMado(int i, int i2) {
        return (i & i2) != 0;
    }

    private static /* synthetic */ void getInserted$annotations() {
    }

    private static /* synthetic */ void getRemoved$annotations() {
    }

    private static /* synthetic */ void getUpdated$annotations() {
    }

    /* renamed from: or-64DMado */
    public static final int m12826or64DMado(int i, int i2) {
        return i | i2;
    }

    public static final int calculateNodeKindSetFrom(@NotNull Modifier.Node node) {
        if (node.getKindSet() != 0) {
            return node.getKindSet();
        }
        int iM12816constructorimpl = NodeKind.m12816constructorimpl(1);
        if (node instanceof LayoutModifierNode) {
            iM12816constructorimpl |= NodeKind.m12816constructorimpl(2);
        }
        if (node instanceof DrawModifierNode) {
            iM12816constructorimpl |= NodeKind.m12816constructorimpl(4);
        }
        if (node instanceof SemanticsModifierNode) {
            iM12816constructorimpl |= NodeKind.m12816constructorimpl(8);
        }
        if (node instanceof PointerInputModifierNode) {
            iM12816constructorimpl |= NodeKind.m12816constructorimpl(16);
        }
        if (node instanceof ModifierLocalModifierNode) {
            iM12816constructorimpl |= NodeKind.m12816constructorimpl(32);
        }
        if (node instanceof ParentDataModifierNode) {
            iM12816constructorimpl |= NodeKind.m12816constructorimpl(64);
        }
        if (node instanceof LayoutAwareModifierNode) {
            iM12816constructorimpl |= NodeKind.m12816constructorimpl(128);
        }
        if (node instanceof GlobalPositionAwareModifierNode) {
            iM12816constructorimpl |= NodeKind.m12816constructorimpl(256);
        }
        if (node instanceof IntermediateLayoutModifierNode) {
            iM12816constructorimpl |= NodeKind.m12816constructorimpl(512);
        }
        if (node instanceof FocusTargetNode) {
            iM12816constructorimpl |= NodeKind.m12816constructorimpl(1024);
        }
        if (node instanceof FocusPropertiesModifierNode) {
            iM12816constructorimpl |= NodeKind.m12816constructorimpl(2048);
        }
        if (node instanceof FocusEventModifierNode) {
            iM12816constructorimpl |= NodeKind.m12816constructorimpl(4096);
        }
        if (node instanceof KeyInputModifierNode) {
            iM12816constructorimpl |= NodeKind.m12816constructorimpl(8192);
        }
        if (node instanceof RotaryInputModifierNode) {
            iM12816constructorimpl |= NodeKind.m12816constructorimpl(16384);
        }
        if (node instanceof CompositionLocalConsumerModifierNode) {
            iM12816constructorimpl |= NodeKind.m12816constructorimpl(32768);
        }
        if (node instanceof SoftKeyboardInterceptionModifierNode) {
            iM12816constructorimpl |= NodeKind.m12816constructorimpl(131072);
        }
        return node instanceof TraversableNode ? iM12816constructorimpl | NodeKind.m12816constructorimpl(262144) : iM12816constructorimpl;
    }

    public static final void autoInvalidateRemovedNode(@NotNull Modifier.Node node) {
        if (!node.getIsAttached()) {
            throw new IllegalStateException("autoInvalidateRemovedNode called on unattached node".toString());
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 2);
    }

    public static final void autoInvalidateInsertedNode(@NotNull Modifier.Node node) {
        if (!node.getIsAttached()) {
            throw new IllegalStateException("autoInvalidateInsertedNode called on unattached node".toString());
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 1);
    }

    public static final void autoInvalidateUpdatedNode(@NotNull Modifier.Node node) {
        if (!node.getIsAttached()) {
            throw new IllegalStateException("autoInvalidateUpdatedNode called on unattached node".toString());
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 0);
    }

    public static final void autoInvalidateNodeIncludingDelegates(@NotNull Modifier.Node node, int i, int i2) {
        if (node instanceof DelegatingNode) {
            DelegatingNode delegatingNode = (DelegatingNode) node;
            autoInvalidateNodeSelf(node, delegatingNode.getSelfKindSet() & i, i2);
            int i3 = (~delegatingNode.getSelfKindSet()) & i;
            for (Modifier.Node delegate = delegatingNode.getDelegate(); delegate != null; delegate = delegate.getChild()) {
                autoInvalidateNodeIncludingDelegates(delegate, i3, i2);
            }
            return;
        }
        autoInvalidateNodeSelf(node, i & node.getKindSet(), i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void autoInvalidateNodeSelf(Modifier.Node node, int i, int i2) {
        if (i2 != 0 || node.getShouldAutoInvalidate()) {
            if ((NodeKind.m12816constructorimpl(2) & i) != 0 && (node instanceof LayoutModifierNode)) {
                LayoutModifierNodeKt.invalidateMeasurement((LayoutModifierNode) node);
                if (i2 == 2) {
                    DelegatableNodeKt.m12713requireCoordinator64DMado(node, NodeKind.m12816constructorimpl(2)).onRelease();
                }
            }
            if ((NodeKind.m12816constructorimpl(256) & i) != 0 && (node instanceof GlobalPositionAwareModifierNode)) {
                DelegatableNodeKt.requireLayoutNode(node).invalidateMeasurements$ui_release();
            }
            if ((NodeKind.m12816constructorimpl(4) & i) != 0 && (node instanceof DrawModifierNode)) {
                DrawModifierNodeKt.invalidateDraw((DrawModifierNode) node);
            }
            if ((NodeKind.m12816constructorimpl(8) & i) != 0 && (node instanceof SemanticsModifierNode)) {
                SemanticsModifierNodeKt.invalidateSemantics((SemanticsModifierNode) node);
            }
            if ((NodeKind.m12816constructorimpl(64) & i) != 0 && (node instanceof ParentDataModifierNode)) {
                ParentDataModifierNodeKt.invalidateParentData((ParentDataModifierNode) node);
            }
            if ((NodeKind.m12816constructorimpl(1024) & i) != 0 && (node instanceof FocusTargetNode)) {
                if (i2 == 2) {
                    node.onReset();
                } else {
                    DelegatableNodeKt.requireOwner(node).getFocusOwner().scheduleInvalidation((FocusTargetNode) node);
                }
            }
            if ((NodeKind.m12816constructorimpl(2048) & i) != 0 && (node instanceof FocusPropertiesModifierNode)) {
                FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) node;
                if (specifiesCanFocusProperty(focusPropertiesModifierNode)) {
                    if (i2 == 2) {
                        scheduleInvalidationOfAssociatedFocusTargets(focusPropertiesModifierNode);
                    } else {
                        FocusPropertiesModifierNodeKt.invalidateFocusProperties(focusPropertiesModifierNode);
                    }
                }
            }
            if ((i & NodeKind.m12816constructorimpl(4096)) == 0 || !(node instanceof FocusEventModifierNode)) {
                return;
            }
            FocusEventModifierNodeKt.invalidateFocusEvent((FocusEventModifierNode) node);
        }
    }

    private static final boolean specifiesCanFocusProperty(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        CanFocusChecker canFocusChecker = CanFocusChecker.INSTANCE;
        canFocusChecker.reset();
        focusPropertiesModifierNode.applyFocusProperties(canFocusChecker);
        return canFocusChecker.isCanFocusSet();
    }

    public static final int calculateNodeKindSetFromIncludingDelegates(@NotNull Modifier.Node node) {
        if (node instanceof DelegatingNode) {
            DelegatingNode delegatingNode = (DelegatingNode) node;
            int selfKindSet = delegatingNode.getSelfKindSet();
            for (Modifier.Node delegate = delegatingNode.getDelegate(); delegate != null; delegate = delegate.getChild()) {
                selfKindSet |= calculateNodeKindSetFromIncludingDelegates(delegate);
            }
            return selfKindSet;
        }
        return calculateNodeKindSetFrom(node);
    }

    /* renamed from: getIncludeSelfInTraversal-H91voCI */
    public static final boolean m12825getIncludeSelfInTraversalH91voCI(int i) {
        return (i & NodeKind.m12816constructorimpl(128)) != 0;
    }

    public static final int calculateNodeKindSetFrom(@NotNull Modifier.Element element) {
        int iM12816constructorimpl = NodeKind.m12816constructorimpl(1);
        if (element instanceof LayoutModifier) {
            iM12816constructorimpl |= NodeKind.m12816constructorimpl(2);
        }
        if (element instanceof DrawModifier) {
            iM12816constructorimpl |= NodeKind.m12816constructorimpl(4);
        }
        if (element instanceof SemanticsModifier) {
            iM12816constructorimpl |= NodeKind.m12816constructorimpl(8);
        }
        if (element instanceof PointerInputModifier) {
            iM12816constructorimpl |= NodeKind.m12816constructorimpl(16);
        }
        if ((element instanceof ModifierLocalConsumer) || (element instanceof ModifierLocalProvider)) {
            iM12816constructorimpl |= NodeKind.m12816constructorimpl(32);
        }
        if (element instanceof FocusEventModifier) {
            iM12816constructorimpl |= NodeKind.m12816constructorimpl(4096);
        }
        if (element instanceof FocusOrderModifier) {
            iM12816constructorimpl |= NodeKind.m12816constructorimpl(2048);
        }
        if (element instanceof OnGloballyPositionedModifier) {
            iM12816constructorimpl |= NodeKind.m12816constructorimpl(256);
        }
        if (element instanceof ParentDataModifier) {
            iM12816constructorimpl |= NodeKind.m12816constructorimpl(64);
        }
        return ((element instanceof OnPlacedModifier) || (element instanceof OnRemeasuredModifier)) ? iM12816constructorimpl | NodeKind.m12816constructorimpl(128) : iM12816constructorimpl;
    }

    private static final void scheduleInvalidationOfAssociatedFocusTargets(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        int iM12816constructorimpl = NodeKind.m12816constructorimpl(1024);
        if (!focusPropertiesModifierNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusPropertiesModifierNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusPropertiesModifierNode.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((nodePop.getAggregateChildKindSet() & iM12816constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, nodePop);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet() & iM12816constructorimpl) != 0) {
                        MutableVector mutableVector2 = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                FocusTargetNodeKt.invalidateFocusTarget((FocusTargetNode) nodePop);
                            } else if ((nodePop.getKindSet() & iM12816constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iM12816constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            nodePop = delegate;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                mutableVector2.add(nodePop);
                                                nodePop = null;
                                            }
                                            mutableVector2.add(delegate);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector2);
                        }
                    } else {
                        nodePop = nodePop.getChild();
                    }
                }
            }
        }
    }
}
