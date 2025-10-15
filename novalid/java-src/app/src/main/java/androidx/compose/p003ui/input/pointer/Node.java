package androidx.compose.p003ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.pointer.PointerEventType;
import androidx.compose.p003ui.input.pointer.util.PointerIdArray;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.node.DelegatableNodeKt;
import androidx.compose.p003ui.node.DelegatingNode;
import androidx.compose.p003ui.node.NodeKind;
import androidx.compose.p003ui.node.PointerInputModifierNode;
import androidx.compose.p003ui.node.PointerInputModifierNodeKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HitPathTracker.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u001b\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\bH\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010#\u001a\u00020\"H\u0002J\b\u0010$\u001a\u00020\"H\u0016J\u0010\u0010%\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0017\u0010&\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\"0(H\u0082\bJ.\u0010)\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\bH\u0016J\u001a\u0010*\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010\r2\u0006\u0010,\u001a\u00020\rH\u0002J\u0006\u0010-\u001a\u00020\"J\b\u0010.\u001a\u00020/H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, m7105d2 = {"Landroidx/compose/ui/input/pointer/Node;", "Landroidx/compose/ui/input/pointer/NodeParent;", "modifierNode", "Landroidx/compose/ui/Modifier$Node;", "(Landroidx/compose/ui/Modifier$Node;)V", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "hasExited", "", "isIn", "getModifierNode", "()Landroidx/compose/ui/Modifier$Node;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerIds", "Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "getPointerIds", "()Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "relevantChanges", "Landroidx/collection/LongSparseArray;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "vec", "Landroidx/compose/runtime/collection/MutableVector;", "", "getVec", "()Landroidx/compose/runtime/collection/MutableVector;", "wasIn", "buildCache", "changes", "parentCoordinates", "internalPointerEvent", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "isInBounds", "cleanUpHits", "", "clearCache", "dispatchCancel", "dispatchFinalEventPass", "dispatchIfNeeded", "block", "Lkotlin/Function0;", "dispatchMainEventPass", "hasPositionChanged", "oldEvent", "newEvent", "markIsIn", "toString", "", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 9 PointerIdArray.kt\nandroidx/compose/ui/input/pointer/util/PointerIdArray\n*L\n1#1,554:1\n500#1,5:558\n507#1:662\n500#1,5:663\n507#1:723\n1208#2:555\n1187#2,2:556\n1208#2:584\n1187#2,2:585\n1208#2:639\n1187#2,2:640\n1208#2:689\n1187#2,2:690\n1208#2:745\n1187#2,2:746\n1208#2:816\n1187#2,2:817\n78#3:563\n78#3:618\n78#3:668\n78#3:724\n78#3:795\n385#4,6:564\n395#4,2:571\n397#4,8:576\n405#4,9:587\n414#4,8:599\n385#4,6:619\n395#4,2:626\n397#4,8:631\n405#4,9:642\n414#4,8:654\n385#4,6:669\n395#4,2:676\n397#4,8:681\n405#4,9:692\n414#4,8:704\n385#4,6:725\n395#4,2:732\n397#4,8:737\n405#4,9:748\n414#4,8:760\n385#4,6:796\n395#4,2:803\n397#4,8:808\n405#4,9:819\n414#4,8:831\n261#5:570\n261#5:625\n261#5:675\n261#5:731\n261#5:802\n234#6,3:573\n237#6,3:596\n234#6,3:628\n237#6,3:651\n234#6,3:678\n237#6,3:701\n234#6,3:734\n237#6,3:757\n234#6,3:805\n237#6,3:828\n460#7,11:607\n460#7,11:712\n460#7,11:784\n33#8,6:768\n116#8,2:775\n33#8,6:777\n118#8:783\n33#8,6:839\n178#9:774\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n*L\n292#1:558,5\n292#1:662\n330#1:663,5\n330#1:723\n279#1:555\n279#1:556,2\n296#1:584\n296#1:585,2\n316#1:639\n316#1:640,2\n334#1:689\n334#1:690,2\n373#1:745\n373#1:746,2\n519#1:816\n519#1:817,2\n296#1:563\n316#1:618\n334#1:668\n373#1:724\n519#1:795\n296#1:564,6\n296#1:571,2\n296#1:576,8\n296#1:587,9\n296#1:599,8\n316#1:619,6\n316#1:626,2\n316#1:631,8\n316#1:642,9\n316#1:654,8\n334#1:669,6\n334#1:676,2\n334#1:681,8\n334#1:692,9\n334#1:704,8\n373#1:725,6\n373#1:732,2\n373#1:737,8\n373#1:748,9\n373#1:760,8\n519#1:796,6\n519#1:803,2\n519#1:808,8\n519#1:819,9\n519#1:831,8\n296#1:570\n316#1:625\n334#1:675\n373#1:731\n519#1:802\n296#1:573,3\n296#1:596,3\n316#1:628,3\n316#1:651,3\n334#1:678,3\n334#1:701,3\n373#1:734,3\n373#1:757,3\n519#1:805,3\n519#1:828,3\n302#1:607,11\n340#1:712,11\n518#1:784,11\n386#1:768,6\n429#1:775,2\n429#1:777,6\n429#1:783\n535#1:839,6\n417#1:774\n*E\n"})
/* loaded from: classes.dex */
public final class Node extends NodeParent {
    public static final int $stable = 8;

    @Nullable
    private LayoutCoordinates coordinates;

    /* renamed from: modifierNode, reason: from kotlin metadata and from toString */
    @NotNull
    private final Modifier.Node pointerInputFilter;

    @Nullable
    private PointerEvent pointerEvent;
    private boolean wasIn;

    @NotNull
    private final PointerIdArray pointerIds = new PointerIdArray();

    @NotNull
    private final LongSparseArray<PointerInputChange> relevantChanges = new LongSparseArray<>(2);
    private boolean isIn = true;
    private boolean hasExited = true;

    @NotNull
    private final MutableVector<Long> vec = new MutableVector<>(new Long[16], 0);

    public Node(@NotNull Modifier.Node node) {
        this.pointerInputFilter = node;
    }

    @NotNull
    /* renamed from: getModifierNode, reason: from getter */
    public final Modifier.Node getPointerInputFilter() {
        return this.pointerInputFilter;
    }

    @NotNull
    public final PointerIdArray getPointerIds() {
        return this.pointerIds;
    }

    @NotNull
    public final MutableVector<Long> getVec() {
        return this.vec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020e  */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    @Override // androidx.compose.p003ui.input.pointer.NodeParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean buildCache(@NotNull LongSparseArray<PointerInputChange> changes, @NotNull LayoutCoordinates parentCoordinates, @NotNull InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        int i;
        PointerInputChange pointerInputChange;
        boolean z;
        boolean z2;
        int iM12438getExit7fucELk;
        boolean z3;
        int i2;
        boolean zBuildCache = super.buildCache(changes, parentCoordinates, internalPointerEvent, isInBounds);
        if (!this.pointerInputFilter.getIsAttached()) {
            return true;
        }
        DelegatingNode delegatingNodePop = this.pointerInputFilter;
        int iM12816constructorimpl = NodeKind.m12816constructorimpl(16);
        MutableVector mutableVector = null;
        while (true) {
            i = 0;
            if (delegatingNodePop == 0) {
                break;
            }
            if (delegatingNodePop instanceof PointerInputModifierNode) {
                this.coordinates = PointerInputModifierNodeKt.getLayoutCoordinates((PointerInputModifierNode) delegatingNodePop);
            } else if ((delegatingNodePop.getKindSet() & iM12816constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                Modifier.Node delegate = delegatingNodePop.getDelegate();
                int i3 = 0;
                delegatingNodePop = delegatingNodePop;
                while (delegate != null) {
                    if ((delegate.getKindSet() & iM12816constructorimpl) != 0) {
                        i3++;
                        if (i3 == 1) {
                            delegatingNodePop = delegate;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (delegatingNodePop != 0) {
                                mutableVector.add(delegatingNodePop);
                                delegatingNodePop = 0;
                            }
                            mutableVector.add(delegate);
                        }
                    }
                    delegate = delegate.getChild();
                    delegatingNodePop = delegatingNodePop;
                }
                if (i3 == 1) {
                }
            }
            delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
        }
        int size = changes.size();
        int i4 = 0;
        while (i4 < size) {
            long jKeyAt = changes.keyAt(i4);
            PointerInputChange pointerInputChangeValueAt = changes.valueAt(i4);
            if (this.pointerIds.contains(jKeyAt)) {
                ArrayList arrayList = new ArrayList(pointerInputChangeValueAt.getHistorical().size());
                List<HistoricalChange> historical = pointerInputChangeValueAt.getHistorical();
                int size2 = historical.size();
                int i5 = i;
                while (i5 < size2) {
                    HistoricalChange historicalChange = historical.get(i5);
                    long uptimeMillis = historicalChange.getUptimeMillis();
                    LayoutCoordinates layoutCoordinates = this.coordinates;
                    Intrinsics.checkNotNull(layoutCoordinates);
                    arrayList.add(new HistoricalChange(uptimeMillis, layoutCoordinates.mo12618localPositionOfR5De75A(parentCoordinates, historicalChange.getPosition()), historicalChange.getOriginalEventPosition(), null));
                    i5++;
                    zBuildCache = zBuildCache;
                    size = size;
                }
                z3 = zBuildCache;
                i2 = size;
                LongSparseArray<PointerInputChange> longSparseArray = this.relevantChanges;
                LayoutCoordinates layoutCoordinates2 = this.coordinates;
                Intrinsics.checkNotNull(layoutCoordinates2);
                long jMo12618localPositionOfR5De75A = layoutCoordinates2.mo12618localPositionOfR5De75A(parentCoordinates, pointerInputChangeValueAt.getPreviousPosition());
                LayoutCoordinates layoutCoordinates3 = this.coordinates;
                Intrinsics.checkNotNull(layoutCoordinates3);
                longSparseArray.put(jKeyAt, pointerInputChangeValueAt.m12480copyOHpmEuE((731 & 1) != 0 ? pointerInputChangeValueAt.id : 0L, (731 & 2) != 0 ? pointerInputChangeValueAt.uptimeMillis : 0L, (731 & 4) != 0 ? pointerInputChangeValueAt.position : layoutCoordinates3.mo12618localPositionOfR5De75A(parentCoordinates, pointerInputChangeValueAt.getPosition()), (731 & 8) != 0 ? pointerInputChangeValueAt.pressed : false, (731 & 16) != 0 ? pointerInputChangeValueAt.previousUptimeMillis : 0L, (731 & 32) != 0 ? pointerInputChangeValueAt.previousPosition : jMo12618localPositionOfR5De75A, (731 & 64) != 0 ? pointerInputChangeValueAt.previousPressed : false, (731 & 128) != 0 ? pointerInputChangeValueAt.type : 0, arrayList, (731 & 512) != 0 ? pointerInputChangeValueAt.scrollDelta : 0L));
            } else {
                z3 = zBuildCache;
                i2 = size;
            }
            i4++;
            zBuildCache = z3;
            size = i2;
            i = 0;
        }
        boolean z4 = zBuildCache;
        if (this.relevantChanges.isEmpty()) {
            this.pointerIds.clear();
            getChildren().clear();
            return true;
        }
        for (int size3 = this.pointerIds.getSize() - 1; -1 < size3; size3--) {
            if (!changes.containsKey(this.pointerIds.m12579get_I2yYro(size3))) {
                this.pointerIds.removeAt(size3);
            }
        }
        ArrayList arrayList2 = new ArrayList(this.relevantChanges.size());
        int size4 = this.relevantChanges.size();
        for (int i6 = 0; i6 < size4; i6++) {
            arrayList2.add(this.relevantChanges.valueAt(i6));
        }
        PointerEvent pointerEvent = new PointerEvent(arrayList2, internalPointerEvent);
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size5 = changes2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size5) {
                pointerInputChange = null;
                break;
            }
            PointerInputChange pointerInputChange2 = changes2.get(i7);
            if (internalPointerEvent.m12413issuesEnterExitEvent0FcD4WY(pointerInputChange2.getId())) {
                pointerInputChange = pointerInputChange2;
                break;
            }
            i7++;
        }
        PointerInputChange pointerInputChange3 = pointerInputChange;
        if (pointerInputChange3 != null) {
            if (!isInBounds) {
                z = false;
                this.isIn = false;
            } else {
                z = false;
                if (!this.isIn && (pointerInputChange3.getPressed() || pointerInputChange3.getPreviousPressed())) {
                    Intrinsics.checkNotNull(this.coordinates);
                    z2 = true;
                    this.isIn = !PointerEventKt.m12428isOutOfBoundsO0kMr_c(pointerInputChange3, r3.mo12617getSizeYbymL2g());
                }
                if (this.isIn == this.wasIn) {
                    int type = pointerEvent.getType();
                    PointerEventType.Companion companion = PointerEventType.INSTANCE;
                    if (PointerEventType.m12433equalsimpl0(type, companion.m12439getMove7fucELk()) || PointerEventType.m12433equalsimpl0(pointerEvent.getType(), companion.m12437getEnter7fucELk()) || PointerEventType.m12433equalsimpl0(pointerEvent.getType(), companion.m12438getExit7fucELk())) {
                        if (this.isIn) {
                            iM12438getExit7fucELk = companion.m12437getEnter7fucELk();
                        } else {
                            iM12438getExit7fucELk = companion.m12438getExit7fucELk();
                        }
                        pointerEvent.m12427setTypeEhbLWgg$ui_release(iM12438getExit7fucELk);
                    } else {
                        int type2 = pointerEvent.getType();
                        PointerEventType.Companion companion2 = PointerEventType.INSTANCE;
                        if (PointerEventType.m12433equalsimpl0(type2, companion2.m12437getEnter7fucELk()) && this.wasIn && !this.hasExited) {
                            pointerEvent.m12427setTypeEhbLWgg$ui_release(companion2.m12439getMove7fucELk());
                        } else if (PointerEventType.m12433equalsimpl0(pointerEvent.getType(), companion2.m12438getExit7fucELk()) && this.isIn && pointerInputChange3.getPressed()) {
                            pointerEvent.m12427setTypeEhbLWgg$ui_release(companion2.m12439getMove7fucELk());
                        }
                    }
                }
            }
            z2 = true;
            if (this.isIn == this.wasIn) {
            }
        } else {
            z = false;
            z2 = true;
        }
        boolean z5 = (z4 || !PointerEventType.m12433equalsimpl0(pointerEvent.getType(), PointerEventType.INSTANCE.m12439getMove7fucELk()) || hasPositionChanged(this.pointerEvent, pointerEvent)) ? z2 : z;
        this.pointerEvent = pointerEvent;
        return z5;
    }

    private final boolean hasPositionChanged(PointerEvent oldEvent, PointerEvent newEvent) {
        if (oldEvent == null || oldEvent.getChanges().size() != newEvent.getChanges().size()) {
            return true;
        }
        int size = newEvent.getChanges().size();
        for (int i = 0; i < size; i++) {
            if (!Offset.m11096equalsimpl0(oldEvent.getChanges().get(i).getPosition(), newEvent.getChanges().get(i).getPosition())) {
                return true;
            }
        }
        return false;
    }

    private final void clearCache() {
        this.relevantChanges.clear();
        this.coordinates = null;
    }

    private final boolean dispatchIfNeeded(Function0<Unit> block) {
        if (this.relevantChanges.isEmpty() || !this.pointerInputFilter.getIsAttached()) {
            return false;
        }
        block.invoke();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // androidx.compose.p003ui.input.pointer.NodeParent
    public void dispatchCancel() {
        MutableVector<Node> children = getChildren();
        int size = children.getSize();
        if (size > 0) {
            Node[] content = children.getContent();
            int i = 0;
            do {
                content[i].dispatchCancel();
                i++;
            } while (i < size);
        }
        DelegatingNode delegatingNodePop = this.pointerInputFilter;
        int iM12816constructorimpl = NodeKind.m12816constructorimpl(16);
        MutableVector mutableVector = null;
        while (delegatingNodePop != 0) {
            if (delegatingNodePop instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) delegatingNodePop).onCancelPointerInput();
            } else if ((delegatingNodePop.getKindSet() & iM12816constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                Modifier.Node delegate = delegatingNodePop.getDelegate();
                int i2 = 0;
                delegatingNodePop = delegatingNodePop;
                while (delegate != null) {
                    if ((delegate.getKindSet() & iM12816constructorimpl) != 0) {
                        i2++;
                        if (i2 == 1) {
                            delegatingNodePop = delegate;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (delegatingNodePop != 0) {
                                mutableVector.add(delegatingNodePop);
                                delegatingNodePop = 0;
                            }
                            mutableVector.add(delegate);
                        }
                    }
                    delegate = delegate.getChild();
                    delegatingNodePop = delegatingNodePop;
                }
                if (i2 == 1) {
                }
            }
            delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
        }
    }

    public final void markIsIn() {
        this.isIn = true;
    }

    @Override // androidx.compose.p003ui.input.pointer.NodeParent
    public void cleanUpHits(@NotNull InternalPointerEvent internalPointerEvent) {
        super.cleanUpHits(internalPointerEvent);
        PointerEvent pointerEvent = this.pointerEvent;
        if (pointerEvent == null) {
            return;
        }
        this.wasIn = this.isIn;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = changes.get(i);
            if (!pointerInputChange.getPressed() && (!internalPointerEvent.m12413issuesEnterExitEvent0FcD4WY(pointerInputChange.getId()) || !this.isIn)) {
                this.pointerIds.m12580remove0FcD4WY(pointerInputChange.getId());
            }
        }
        this.isIn = false;
        this.hasExited = PointerEventType.m12433equalsimpl0(pointerEvent.getType(), PointerEventType.INSTANCE.m12438getExit7fucELk());
    }

    @NotNull
    public String toString() {
        return "Node(pointerInputFilter=" + this.pointerInputFilter + ", children=" + getChildren() + ", pointerIds=" + this.pointerIds + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r14v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    @Override // androidx.compose.p003ui.input.pointer.NodeParent
    public boolean dispatchMainEventPass(@NotNull LongSparseArray<PointerInputChange> changes, @NotNull LayoutCoordinates parentCoordinates, @NotNull InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        MutableVector<Node> children;
        int size;
        if (this.relevantChanges.isEmpty() || !this.pointerInputFilter.getIsAttached()) {
            return false;
        }
        PointerEvent pointerEvent = this.pointerEvent;
        Intrinsics.checkNotNull(pointerEvent);
        LayoutCoordinates layoutCoordinates = this.coordinates;
        Intrinsics.checkNotNull(layoutCoordinates);
        long jMo12617getSizeYbymL2g = layoutCoordinates.mo12617getSizeYbymL2g();
        DelegatingNode delegatingNodePop = this.pointerInputFilter;
        int iM12816constructorimpl = NodeKind.m12816constructorimpl(16);
        MutableVector mutableVector = null;
        while (delegatingNodePop != 0) {
            if (delegatingNodePop instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) delegatingNodePop).mo7740onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Initial, jMo12617getSizeYbymL2g);
            } else if ((delegatingNodePop.getKindSet() & iM12816constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                Modifier.Node delegate = delegatingNodePop.getDelegate();
                int i = 0;
                delegatingNodePop = delegatingNodePop;
                while (delegate != null) {
                    if ((delegate.getKindSet() & iM12816constructorimpl) != 0) {
                        i++;
                        if (i == 1) {
                            delegatingNodePop = delegate;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (delegatingNodePop != 0) {
                                mutableVector.add(delegatingNodePop);
                                delegatingNodePop = 0;
                            }
                            mutableVector.add(delegate);
                        }
                    }
                    delegate = delegate.getChild();
                    delegatingNodePop = delegatingNodePop;
                }
                if (i == 1) {
                }
            }
            delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
        }
        if (this.pointerInputFilter.getIsAttached() && (size = (children = getChildren()).getSize()) > 0) {
            Node[] content = children.getContent();
            int i2 = 0;
            do {
                Node node = content[i2];
                LongSparseArray<PointerInputChange> longSparseArray = this.relevantChanges;
                LayoutCoordinates layoutCoordinates2 = this.coordinates;
                Intrinsics.checkNotNull(layoutCoordinates2);
                node.dispatchMainEventPass(longSparseArray, layoutCoordinates2, internalPointerEvent, isInBounds);
                i2++;
            } while (i2 < size);
        }
        if (this.pointerInputFilter.getIsAttached()) {
            DelegatingNode delegatingNodePop2 = this.pointerInputFilter;
            int iM12816constructorimpl2 = NodeKind.m12816constructorimpl(16);
            MutableVector mutableVector2 = null;
            while (delegatingNodePop2 != 0) {
                if (delegatingNodePop2 instanceof PointerInputModifierNode) {
                    ((PointerInputModifierNode) delegatingNodePop2).mo7740onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Main, jMo12617getSizeYbymL2g);
                } else if ((delegatingNodePop2.getKindSet() & iM12816constructorimpl2) != 0 && (delegatingNodePop2 instanceof DelegatingNode)) {
                    Modifier.Node delegate2 = delegatingNodePop2.getDelegate();
                    int i3 = 0;
                    delegatingNodePop2 = delegatingNodePop2;
                    while (delegate2 != null) {
                        if ((delegate2.getKindSet() & iM12816constructorimpl2) != 0) {
                            i3++;
                            if (i3 == 1) {
                                delegatingNodePop2 = delegate2;
                            } else {
                                if (mutableVector2 == null) {
                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (delegatingNodePop2 != 0) {
                                    mutableVector2.add(delegatingNodePop2);
                                    delegatingNodePop2 = 0;
                                }
                                mutableVector2.add(delegate2);
                            }
                        }
                        delegate2 = delegate2.getChild();
                        delegatingNodePop2 = delegatingNodePop2;
                    }
                    if (i3 == 1) {
                    }
                }
                delegatingNodePop2 = DelegatableNodeKt.pop(mutableVector2);
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // androidx.compose.p003ui.input.pointer.NodeParent
    public boolean dispatchFinalEventPass(@NotNull InternalPointerEvent internalPointerEvent) {
        MutableVector<Node> children;
        int size;
        boolean z = false;
        int i = 0;
        z = false;
        if (!this.relevantChanges.isEmpty() && this.pointerInputFilter.getIsAttached()) {
            PointerEvent pointerEvent = this.pointerEvent;
            Intrinsics.checkNotNull(pointerEvent);
            LayoutCoordinates layoutCoordinates = this.coordinates;
            Intrinsics.checkNotNull(layoutCoordinates);
            long jMo12617getSizeYbymL2g = layoutCoordinates.mo12617getSizeYbymL2g();
            DelegatingNode delegatingNodePop = this.pointerInputFilter;
            int iM12816constructorimpl = NodeKind.m12816constructorimpl(16);
            MutableVector mutableVector = null;
            while (delegatingNodePop != 0) {
                if (delegatingNodePop instanceof PointerInputModifierNode) {
                    ((PointerInputModifierNode) delegatingNodePop).mo7740onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Final, jMo12617getSizeYbymL2g);
                } else if ((delegatingNodePop.getKindSet() & iM12816constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                    Modifier.Node delegate = delegatingNodePop.getDelegate();
                    int i2 = 0;
                    delegatingNodePop = delegatingNodePop;
                    while (delegate != null) {
                        if ((delegate.getKindSet() & iM12816constructorimpl) != 0) {
                            i2++;
                            if (i2 == 1) {
                                delegatingNodePop = delegate;
                            } else {
                                if (mutableVector == null) {
                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (delegatingNodePop != 0) {
                                    mutableVector.add(delegatingNodePop);
                                    delegatingNodePop = 0;
                                }
                                mutableVector.add(delegate);
                            }
                        }
                        delegate = delegate.getChild();
                        delegatingNodePop = delegatingNodePop;
                    }
                    if (i2 == 1) {
                    }
                }
                delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
            }
            if (this.pointerInputFilter.getIsAttached() && (size = (children = getChildren()).getSize()) > 0) {
                Node[] content = children.getContent();
                do {
                    content[i].dispatchFinalEventPass(internalPointerEvent);
                    i++;
                } while (i < size);
            }
            z = true;
        }
        cleanUpHits(internalPointerEvent);
        clearCache();
        return z;
    }
}
