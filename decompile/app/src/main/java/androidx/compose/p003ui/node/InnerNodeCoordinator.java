package androidx.compose.p003ui.node;

import androidx.compose.p003ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import androidx.compose.p003ui.graphics.Paint;
import androidx.compose.p003ui.graphics.PaintingStyle;
import androidx.compose.p003ui.layout.AlignmentLine;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.LayoutNode;
import androidx.compose.p003ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.p003ui.node.NodeCoordinator;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.ivy.ant.IvyBuildList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InnerNodeCoordinator.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 >2\u00020\u0001:\u0002>?B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J:\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u0013H\u0016J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0013H\u0016J\u001a\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u0013H\u0016J\u0010\u0010/\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0013H\u0016J\u0010\u00100\u001a\u00020\u00172\u0006\u00101\u001a\u000202H\u0016J=\u00103\u001a\u00020\u00172\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0019\u00108\u001a\u0015\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u0017\u0018\u000109¢\u0006\u0002\b;H\u0014ø\u0001\u0000¢\u0006\u0004\b<\u0010=R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@TX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006@"}, m7105d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator;", "Landroidx/compose/ui/node/NodeCoordinator;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "<set-?>", "Landroidx/compose/ui/node/LookaheadDelegate;", "lookaheadDelegate", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", IvyBuildList.OnMissingDescriptor.TAIL, "Landroidx/compose/ui/node/TailModifierNode;", "getTail$annotations", "()V", "getTail", "()Landroidx/compose/ui/node/TailModifierNode;", "calculateAlignmentLine", "", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "ensureLookaheadDelegateCreated", "", "hitTestChild", "hitTestSource", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "isTouchEvent", "", "isInLayer", "hitTestChild-YqVAtuI", "(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "performDraw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "placeAt", "position", "Landroidx/compose/ui/unit/IntOffset;", "zIndex", "", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "Companion", "LookaheadDelegateImpl", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nInnerNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator\n+ 2 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n*L\n1#1,246:1\n286#2,2:247\n197#3:249\n460#4,11:250\n460#4,11:261\n222#4,11:274\n179#5,2:272\n181#5,2:285\n*S KotlinDebug\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator\n*L\n119#1:247,2\n121#1:249\n121#1:250,11\n172#1:261,11\n208#1:274,11\n205#1:272,2\n205#1:285,2\n*E\n"})
/* loaded from: classes3.dex */
public final class InnerNodeCoordinator extends NodeCoordinator {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Paint innerBoundsPaint;

    @Nullable
    private LookaheadDelegate lookaheadDelegate;

    @NotNull
    private final TailModifierNode tail;

    public static /* synthetic */ void getTail$annotations() {
    }

    public InnerNodeCoordinator(@NotNull LayoutNode layoutNode) {
        super(layoutNode);
        this.tail = new TailModifierNode();
        getTail().updateCoordinator$ui_release(this);
        this.lookaheadDelegate = layoutNode.getLookaheadRoot() != null ? new LookaheadDelegateImpl() : null;
    }

    @Override // androidx.compose.p003ui.node.NodeCoordinator
    @NotNull
    public TailModifierNode getTail() {
        return this.tail;
    }

    @Override // androidx.compose.p003ui.node.NodeCoordinator
    @Nullable
    public LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.p003ui.node.NodeCoordinator
    public void setLookaheadDelegate(@Nullable LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    /* compiled from: InnerNodeCoordinator.kt */
    @Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, m7105d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl;", "Landroidx/compose/ui/node/LookaheadDelegate;", "(Landroidx/compose/ui/node/InnerNodeCoordinator;)V", "calculateAlignmentLine", "", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "placeChildren", "", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nInnerNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,246:1\n221#2,2:247\n223#2:261\n197#3:249\n460#4,11:250\n*S KotlinDebug\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl\n*L\n74#1:247,2\n74#1:261\n76#1:249\n76#1:250,11\n*E\n"})
    public final class LookaheadDelegateImpl extends LookaheadDelegate {
        public LookaheadDelegateImpl() {
            super(InnerNodeCoordinator.this);
        }

        @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable
        public int calculateAlignmentLine(@NotNull AlignmentLine alignmentLine) {
            Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
            int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            getCachedAlignmentLinesMap().put(alignmentLine, Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // androidx.compose.p003ui.node.LookaheadDelegate
        public void placeChildren() {
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLayoutNode().getLookaheadPassDelegate$ui_release();
            Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
            lookaheadPassDelegate$ui_release.onNodePlaced$ui_release();
        }

        @Override // androidx.compose.p003ui.node.LookaheadDelegate, androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int height) {
            return getLayoutNode().getIntrinsicsPolicy().minLookaheadIntrinsicWidth(height);
        }

        @Override // androidx.compose.p003ui.node.LookaheadDelegate, androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int width) {
            return getLayoutNode().getIntrinsicsPolicy().minLookaheadIntrinsicHeight(width);
        }

        @Override // androidx.compose.p003ui.node.LookaheadDelegate, androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int height) {
            return getLayoutNode().getIntrinsicsPolicy().maxLookaheadIntrinsicWidth(height);
        }

        @Override // androidx.compose.p003ui.node.LookaheadDelegate, androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int width) {
            return getLayoutNode().getIntrinsicsPolicy().maxLookaheadIntrinsicHeight(width);
        }

        @Override // androidx.compose.p003ui.layout.Measurable
        @NotNull
        /* renamed from: measure-BRTryo0 */
        public Placeable mo12610measureBRTryo0(long constraints) {
            m12660setMeasurementConstraintsBRTryo0(constraints);
            MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = content[i].getLookaheadPassDelegate$ui_release();
                    Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                    lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
                    i++;
                } while (i < size);
            }
            set_measureResult(getLayoutNode().getMeasurePolicy().mo7599measure3p2s80s(this, getLayoutNode().getChildLookaheadMeasurables$ui_release(), constraints));
            return this;
        }
    }

    @Override // androidx.compose.p003ui.node.NodeCoordinator
    public void ensureLookaheadDelegateCreated() {
        if (getLookaheadDelegate() == null) {
            setLookaheadDelegate(new LookaheadDelegateImpl());
        }
    }

    @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int height) {
        return getLayoutNode().getIntrinsicsPolicy().minIntrinsicWidth(height);
    }

    @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int width) {
        return getLayoutNode().getIntrinsicsPolicy().minIntrinsicHeight(width);
    }

    @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int height) {
        return getLayoutNode().getIntrinsicsPolicy().maxIntrinsicWidth(height);
    }

    @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int width) {
        return getLayoutNode().getIntrinsicsPolicy().maxIntrinsicHeight(width);
    }

    @Override // androidx.compose.p003ui.node.NodeCoordinator, androidx.compose.p003ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo12611placeAtf8xVGno(long position, float zIndex, @Nullable Function1<? super GraphicsLayerScope, Unit> layerBlock) {
        super.mo12611placeAtf8xVGno(position, zIndex, layerBlock);
        if (getIsShallowPlacing()) {
            return;
        }
        onPlaced();
        getLayoutNode().getMeasurePassDelegate$ui_release().onNodePlaced$ui_release();
    }

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable
    public int calculateAlignmentLine(@NotNull AlignmentLine alignmentLine) {
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.calculateAlignmentLine(alignmentLine);
        }
        Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.p003ui.node.NodeCoordinator
    public void performDraw(@NotNull Canvas canvas) {
        Owner ownerRequireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        MutableVector<LayoutNode> zSortedChildren = getLayoutNode().getZSortedChildren();
        int size = zSortedChildren.getSize();
        if (size > 0) {
            LayoutNode[] content = zSortedChildren.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = content[i];
                if (layoutNode.isPlaced()) {
                    layoutNode.draw$ui_release(canvas);
                }
                i++;
            } while (i < size);
        }
        if (ownerRequireOwner.getShowLayoutBounds()) {
            drawBorder(canvas, innerBoundsPaint);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    @Override // androidx.compose.p003ui.node.NodeCoordinator
    /* renamed from: hitTestChild-YqVAtuI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo12734hitTestChildYqVAtuI(@NotNull NodeCoordinator.HitTestSource hitTestSource, long pointerPosition, @NotNull HitTestResult hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        boolean z;
        boolean z2 = false;
        if (hitTestSource.shouldHitTestChildren(getLayoutNode())) {
            if (m12810withinLayerBoundsk4lQ0M(pointerPosition)) {
                z = isInLayer;
            } else {
                if (isTouchEvent) {
                    float fM12798distanceInMinimumTouchTargettz77jQw = m12798distanceInMinimumTouchTargettz77jQw(pointerPosition, m12801getMinimumTouchTargetSizeNHjbRc());
                    if (!Float.isInfinite(fM12798distanceInMinimumTouchTargettz77jQw) && !Float.isNaN(fM12798distanceInMinimumTouchTargettz77jQw)) {
                        z = false;
                    }
                }
                z = isInLayer;
            }
            z2 = true;
        } else {
            z = isInLayer;
        }
        if (z2) {
            int i = hitTestResult.hitDepth;
            MutableVector<LayoutNode> zSortedChildren = getLayoutNode().getZSortedChildren();
            int size = zSortedChildren.getSize();
            if (size > 0) {
                LayoutNode[] content = zSortedChildren.getContent();
                int i2 = size - 1;
                do {
                    LayoutNode layoutNode = content[i2];
                    if (layoutNode.isPlaced()) {
                        hitTestSource.mo12811childHitTestYqVAtuI(layoutNode, pointerPosition, hitTestResult, isTouchEvent, z);
                        if (!hitTestResult.hasHit()) {
                            i2--;
                        } else {
                            if (!layoutNode.getOuterCoordinator$ui_release().shouldSharePointerInputWithSiblings()) {
                                break;
                            }
                            hitTestResult.acceptHits();
                            i2--;
                        }
                    }
                } while (i2 >= 0);
            }
            hitTestResult.hitDepth = i;
        }
    }

    /* compiled from: InnerNodeCoordinator.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m7105d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator$Companion;", "", "()V", "innerBoundsPaint", "Landroidx/compose/ui/graphics/Paint;", "getInnerBoundsPaint", "()Landroidx/compose/ui/graphics/Paint;", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final Paint getInnerBoundsPaint() {
            return InnerNodeCoordinator.innerBoundsPaint;
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo11219setColor8_81llA(Color.INSTANCE.m11374getRed0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo11223setStylek9PVt8s(PaintingStyle.INSTANCE.m11608getStrokeTiuSbCo());
        innerBoundsPaint = Paint;
    }

    @Override // androidx.compose.p003ui.layout.Measurable
    @NotNull
    /* renamed from: measure-BRTryo0 */
    public Placeable mo12610measureBRTryo0(long constraints) {
        m12660setMeasurementConstraintsBRTryo0(constraints);
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                content[i].getMeasurePassDelegate$ui_release().setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
                i++;
            } while (i < size);
        }
        setMeasureResult$ui_release(getLayoutNode().getMeasurePolicy().mo7599measure3p2s80s(this, getLayoutNode().getChildMeasurables$ui_release(), constraints));
        onMeasured();
        return this;
    }
}
