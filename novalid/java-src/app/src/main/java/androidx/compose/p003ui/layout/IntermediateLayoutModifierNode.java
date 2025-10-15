package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.ExperimentalComposeUiApi;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.DelegatableNodeKt;
import androidx.compose.p003ui.node.DelegatingNode;
import androidx.compose.p003ui.node.LayoutModifierNode;
import androidx.compose.p003ui.node.LayoutNode;
import androidx.compose.p003ui.node.LookaheadDelegate;
import androidx.compose.p003ui.node.NodeChain;
import androidx.compose.p003ui.node.NodeCoordinator;
import androidx.compose.p003ui.node.NodeKind;
import androidx.compose.p003ui.node.NodeMeasuringIntrinsics;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: IntermediateLayoutModifierNode.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u000289BH\u0012A\u0010\u0003\u001a=\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\u0002\b\r¢\u0006\u0002\u0010\u000eJ\b\u0010 \u001a\u00020!H\u0016J4\u0010\"\u001a\u00020\f*\u00020#2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u00020)*\u00020*2\u0006\u0010\t\u001a\u00020+2\u0006\u0010,\u001a\u00020)H\u0000¢\u0006\u0002\b-J!\u0010.\u001a\u00020)*\u00020*2\u0006\u0010\t\u001a\u00020+2\u0006\u0010/\u001a\u00020)H\u0000¢\u0006\u0002\b0J&\u00101\u001a\u00020\f*\u00020#2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b2\u00103J!\u00104\u001a\u00020)*\u00020*2\u0006\u0010\t\u001a\u00020+2\u0006\u0010,\u001a\u00020)H\u0000¢\u0006\u0002\b5J!\u00106\u001a\u00020)*\u00020*2\u0006\u0010\t\u001a\u00020+2\u0006\u0010/\u001a\u00020)H\u0000¢\u0006\u0002\b7R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0018\u00010\u0012R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00060\u0014R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\nX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000RU\u0010\u0003\u001a=\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\u0002\b\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006:"}, m7105d2 = {"Landroidx/compose/ui/layout/IntermediateLayoutModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "measureBlock", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/IntermediateMeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Lkotlin/ParameterName;", "name", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function3;)V", "closestLookaheadScope", "Landroidx/compose/ui/layout/LookaheadScope;", "intermediateMeasurable", "Landroidx/compose/ui/layout/IntermediateLayoutModifierNode$IntermediateMeasurablePlaceable;", "intermediateMeasureScope", "Landroidx/compose/ui/layout/IntermediateLayoutModifierNode$IntermediateMeasureScopeImpl;", "isIntermediateChangeActive", "", "()Z", "setIntermediateChangeActive", "(Z)V", "localLookaheadScope", "Landroidx/compose/ui/layout/LookaheadScopeImpl;", "lookaheadConstraints", "getMeasureBlock$ui_release", "()Lkotlin/jvm/functions/Function3;", "setMeasureBlock$ui_release", "onAttach", "", "intermediateMeasure", "Landroidx/compose/ui/layout/MeasureScope;", "lookaheadSize", "Landroidx/compose/ui/unit/IntSize;", "intermediateMeasure-Te-uZzU", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;JJJ)Landroidx/compose/ui/layout/MeasureResult;", "maxIntermediateIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntermediateIntrinsicHeight$ui_release", "maxIntermediateIntrinsicWidth", "height", "maxIntermediateIntrinsicWidth$ui_release", "measure", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntermediateIntrinsicHeight", "minIntermediateIntrinsicHeight$ui_release", "minIntermediateIntrinsicWidth", "minIntermediateIntrinsicWidth$ui_release", "IntermediateMeasurablePlaceable", "IntermediateMeasureScopeImpl", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nIntermediateLayoutModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntermediateLayoutModifierNode.kt\nandroidx/compose/ui/layout/IntermediateLayoutModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,317:1\n1#2:318\n1#2:326\n88#3:319\n230#4,5:320\n58#4:325\n59#4,8:327\n385#4,6:335\n395#4,2:342\n397#4,8:347\n405#4,9:358\n414#4,8:370\n68#4,7:378\n261#5:341\n234#6,3:344\n237#6,3:367\n1208#7:355\n1187#7,2:356\n*S KotlinDebug\n*F\n+ 1 IntermediateLayoutModifierNode.kt\nandroidx/compose/ui/layout/IntermediateLayoutModifierNode\n*L\n99#1:326\n99#1:319\n99#1:320,5\n99#1:325\n99#1:327,8\n99#1:335,6\n99#1:342,2\n99#1:347,8\n99#1:358,9\n99#1:370,8\n99#1:378,7\n99#1:341\n99#1:344,3\n99#1:367,3\n99#1:355\n99#1:356,2\n*E\n"})
/* loaded from: classes3.dex */
public final class IntermediateLayoutModifierNode extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;

    @NotNull
    private LookaheadScope closestLookaheadScope;

    @Nullable
    private IntermediateMeasurablePlaceable intermediateMeasurable;

    @NotNull
    private final IntermediateMeasureScopeImpl intermediateMeasureScope = new IntermediateMeasureScopeImpl();
    private boolean isIntermediateChangeActive;

    @NotNull
    private final LookaheadScopeImpl localLookaheadScope;

    @Nullable
    private Constraints lookaheadConstraints;

    @NotNull
    private Function3<? super IntermediateMeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> measureBlock;

    @NotNull
    public final Function3<IntermediateMeasureScope, Measurable, Constraints, MeasureResult> getMeasureBlock$ui_release() {
        return this.measureBlock;
    }

    public final void setMeasureBlock$ui_release(@NotNull Function3<? super IntermediateMeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> function3) {
        this.measureBlock = function3;
    }

    public IntermediateLayoutModifierNode(@NotNull Function3<? super IntermediateMeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> function3) {
        this.measureBlock = function3;
        LookaheadScopeImpl lookaheadScopeImpl = new LookaheadScopeImpl(new Function0<LayoutCoordinates>() { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$localLookaheadScope$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final LayoutCoordinates invoke() {
                NodeCoordinator coordinator = this.this$0.getCoordinator();
                Intrinsics.checkNotNull(coordinator);
                return coordinator;
            }
        });
        this.localLookaheadScope = lookaheadScopeImpl;
        this.closestLookaheadScope = lookaheadScopeImpl;
        this.isIntermediateChangeActive = true;
    }

    /* renamed from: isIntermediateChangeActive, reason: from getter */
    public final boolean getIsIntermediateChangeActive() {
        return this.isIntermediateChangeActive;
    }

    public final void setIntermediateChangeActive(boolean z) {
        this.isIntermediateChangeActive = z;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        LookaheadScopeImpl lookaheadScopeImpl;
        LookaheadScopeImpl lookaheadScopeImpl2;
        NodeChain nodes;
        LookaheadDelegate lookaheadDelegate;
        NodeCoordinator coordinator = getCoordinator();
        if (((coordinator == null || (lookaheadDelegate = coordinator.getLookaheadDelegate()) == null) ? null : lookaheadDelegate.getLookaheadLayoutCoordinates()) == null) {
            throw new IllegalStateException("could not fetch lookahead coordinates".toString());
        }
        final LayoutNode lookaheadRoot = DelegatableNodeKt.requireLayoutNode(this).getLookaheadRoot();
        if (lookaheadRoot != null && lookaheadRoot.getIsVirtualLookaheadRoot()) {
            lookaheadScopeImpl2 = new LookaheadScopeImpl(new Function0<LayoutCoordinates>() { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode.onAttach.2
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final LayoutCoordinates invoke() {
                    LayoutNode parent$ui_release = lookaheadRoot.getParent$ui_release();
                    Intrinsics.checkNotNull(parent$ui_release);
                    return parent$ui_release.getInnerCoordinator$ui_release().getCoordinates();
                }
            });
        } else {
            int iM12816constructorimpl = NodeKind.m12816constructorimpl(512);
            if (!getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node parent = getNode().getParent();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
            IntermediateLayoutModifierNode intermediateLayoutModifierNode = null;
            while (layoutNodeRequireLayoutNode != null) {
                if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM12816constructorimpl) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iM12816constructorimpl) != 0) {
                            MutableVector mutableVector = null;
                            Modifier.Node nodePop = parent;
                            while (nodePop != null) {
                                if (nodePop instanceof IntermediateLayoutModifierNode) {
                                    intermediateLayoutModifierNode = (IntermediateLayoutModifierNode) nodePop;
                                } else if ((nodePop.getKindSet() & iM12816constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i = 0;
                                    for (Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                        if ((delegate.getKindSet() & iM12816constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
                                                nodePop = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodePop != null) {
                                                    mutableVector.add(nodePop);
                                                    nodePop = null;
                                                }
                                                mutableVector.add(delegate);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                nodePop = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
                parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
            }
            if (intermediateLayoutModifierNode == null || (lookaheadScopeImpl = intermediateLayoutModifierNode.localLookaheadScope) == null) {
                lookaheadScopeImpl = this.localLookaheadScope;
            }
            lookaheadScopeImpl2 = lookaheadScopeImpl;
        }
        this.closestLookaheadScope = lookaheadScopeImpl2;
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo7650measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j) {
        final Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, placeableMo12610measureBRTryo0.getWidth(), placeableMo12610measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$measure$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo12610measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @NotNull
    /* renamed from: intermediateMeasure-Te-uZzU, reason: not valid java name */
    public final MeasureResult m12612intermediateMeasureTeuZzU(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j, long j2, long j3) {
        this.intermediateMeasureScope.m12614setLookaheadSizeozmzZPI(j2);
        this.lookaheadConstraints = Constraints.m13610boximpl(j3);
        IntermediateMeasurablePlaceable intermediateMeasurablePlaceable = this.intermediateMeasurable;
        if (intermediateMeasurablePlaceable == null) {
            intermediateMeasurablePlaceable = new IntermediateMeasurablePlaceable(measurable);
        }
        this.intermediateMeasurable = intermediateMeasurablePlaceable;
        intermediateMeasurablePlaceable.setWrappedMeasurable(measurable);
        return this.measureBlock.invoke(this.intermediateMeasureScope, intermediateMeasurablePlaceable, Constraints.m13610boximpl(j));
    }

    public final int minIntermediateIntrinsicWidth$ui_release(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return NodeMeasuringIntrinsics.INSTANCE.minWidth$ui_release(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$minIntermediateIntrinsicWidth$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            @NotNull
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo12615measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j) {
                return this.this$0.getMeasureBlock$ui_release().invoke(this.this$0.intermediateMeasureScope, measurable, Constraints.m13610boximpl(j));
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    public final int minIntermediateIntrinsicHeight$ui_release(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return NodeMeasuringIntrinsics.INSTANCE.minHeight$ui_release(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$minIntermediateIntrinsicHeight$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            @NotNull
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo12615measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j) {
                return this.this$0.getMeasureBlock$ui_release().invoke(this.this$0.intermediateMeasureScope, measurable, Constraints.m13610boximpl(j));
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    public final int maxIntermediateIntrinsicWidth$ui_release(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui_release(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$maxIntermediateIntrinsicWidth$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            @NotNull
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo12615measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j) {
                return this.this$0.getMeasureBlock$ui_release().invoke(this.this$0.intermediateMeasureScope, measurable, Constraints.m13610boximpl(j));
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    public final int maxIntermediateIntrinsicHeight$ui_release(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui_release(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$maxIntermediateIntrinsicHeight$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            @NotNull
            /* renamed from: measure-3p2s80s, reason: not valid java name */
            public final MeasureResult mo12615measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j) {
                return this.this$0.getMeasureBlock$ui_release().invoke(this.this$0.intermediateMeasureScope, measurable, Constraints.m13610boximpl(j));
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    /* compiled from: IntermediateLayoutModifierNode.kt */
    @Metadata(m7104d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0096\u0002J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H\u0016J\u001a\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0010\u0010 \u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H\u0016J=\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0019\u0010'\u001a\u0015\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\"\u0018\u00010(¢\u0006\u0002\b*H\u0014ø\u0001\u0000¢\u0006\u0004\b+\u0010,R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, m7105d2 = {"Landroidx/compose/ui/layout/IntermediateLayoutModifierNode$IntermediateMeasurablePlaceable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Placeable;", "wrappedMeasurable", "(Landroidx/compose/ui/layout/IntermediateLayoutModifierNode;Landroidx/compose/ui/layout/Measurable;)V", "parentData", "", "getParentData", "()Ljava/lang/Object;", "getWrappedMeasurable", "()Landroidx/compose/ui/layout/Measurable;", "setWrappedMeasurable", "(Landroidx/compose/ui/layout/Measurable;)V", "wrappedPlaceable", "getWrappedPlaceable", "()Landroidx/compose/ui/layout/Placeable;", "setWrappedPlaceable", "(Landroidx/compose/ui/layout/Placeable;)V", "get", "", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "placeAt", "", "position", "Landroidx/compose/ui/unit/IntOffset;", "zIndex", "", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public final class IntermediateMeasurablePlaceable extends Placeable implements Measurable {

        @NotNull
        public Measurable wrappedMeasurable;

        @Nullable
        public Placeable wrappedPlaceable;

        public IntermediateMeasurablePlaceable(@NotNull Measurable measurable) {
            this.wrappedMeasurable = measurable;
        }

        @NotNull
        public final Measurable getWrappedMeasurable() {
            return this.wrappedMeasurable;
        }

        public final void setWrappedMeasurable(@NotNull Measurable measurable) {
            this.wrappedMeasurable = measurable;
        }

        @Nullable
        public final Placeable getWrappedPlaceable() {
            return this.wrappedPlaceable;
        }

        public final void setWrappedPlaceable(@Nullable Placeable placeable) {
            this.wrappedPlaceable = placeable;
        }

        @Override // androidx.compose.p003ui.layout.Measurable
        @NotNull
        /* renamed from: measure-BRTryo0 */
        public Placeable mo12610measureBRTryo0(long constraints) {
            Placeable placeableMo12610measureBRTryo0;
            long lookaheadSize;
            if (IntermediateLayoutModifierNode.this.getIsIntermediateChangeActive()) {
                placeableMo12610measureBRTryo0 = this.wrappedMeasurable.mo12610measureBRTryo0(constraints);
                m12660setMeasurementConstraintsBRTryo0(constraints);
                m12659setMeasuredSizeozmzZPI(IntSizeKt.IntSize(placeableMo12610measureBRTryo0.getWidth(), placeableMo12610measureBRTryo0.getHeight()));
            } else {
                Measurable measurable = this.wrappedMeasurable;
                Constraints constraints2 = IntermediateLayoutModifierNode.this.lookaheadConstraints;
                Intrinsics.checkNotNull(constraints2);
                placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(constraints2.getValue());
                IntermediateLayoutModifierNode intermediateLayoutModifierNode = IntermediateLayoutModifierNode.this;
                Constraints constraints3 = intermediateLayoutModifierNode.lookaheadConstraints;
                Intrinsics.checkNotNull(constraints3);
                m12660setMeasurementConstraintsBRTryo0(constraints3.getValue());
                if (!intermediateLayoutModifierNode.getIsIntermediateChangeActive()) {
                    lookaheadSize = intermediateLayoutModifierNode.intermediateMeasureScope.getLookaheadSize();
                } else {
                    lookaheadSize = IntSizeKt.IntSize(placeableMo12610measureBRTryo0.getWidth(), placeableMo12610measureBRTryo0.getHeight());
                }
                m12659setMeasuredSizeozmzZPI(lookaheadSize);
            }
            this.wrappedPlaceable = placeableMo12610measureBRTryo0;
            return this;
        }

        @Override // androidx.compose.p003ui.layout.Placeable
        /* renamed from: placeAt-f8xVGno */
        public void mo12611placeAtf8xVGno(long position, float zIndex, @Nullable Function1<? super GraphicsLayerScope, Unit> layerBlock) {
            Unit unit;
            if (!IntermediateLayoutModifierNode.this.getIsIntermediateChangeActive()) {
                position = IntOffset.INSTANCE.m13804getZeronOccac();
            }
            NodeCoordinator coordinator = IntermediateLayoutModifierNode.this.getNode().getCoordinator();
            Intrinsics.checkNotNull(coordinator);
            Placeable.PlacementScope placementScope = coordinator.getPlacementScope();
            if (layerBlock != null) {
                Placeable placeable = this.wrappedPlaceable;
                if (placeable != null) {
                    placementScope.m12670placeWithLayeraW9wM(placeable, position, zIndex, layerBlock);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit != null) {
                    return;
                }
            }
            Placeable placeable2 = this.wrappedPlaceable;
            if (placeable2 != null) {
                placementScope.m12665place70tqf50(placeable2, position, zIndex);
                Unit unit2 = Unit.INSTANCE;
            }
        }

        @Override // androidx.compose.p003ui.layout.Measured, androidx.compose.p003ui.layout.IntrinsicMeasurable
        @Nullable
        public Object getParentData() {
            return this.wrappedMeasurable.getParentData();
        }

        @Override // androidx.compose.p003ui.layout.Measured
        public int get(@NotNull AlignmentLine alignmentLine) {
            Placeable placeable = this.wrappedPlaceable;
            Intrinsics.checkNotNull(placeable);
            return placeable.get(alignmentLine);
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int height) {
            return this.wrappedMeasurable.minIntrinsicWidth(height);
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int height) {
            return this.wrappedMeasurable.maxIntrinsicWidth(height);
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int width) {
            return this.wrappedMeasurable.minIntrinsicHeight(width);
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int width) {
            return this.wrappedMeasurable.maxIntrinsicHeight(width);
        }
    }

    /* compiled from: IntermediateLayoutModifierNode.kt */
    @Metadata(m7104d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0083\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003JE\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020$0'2\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020+0*¢\u0006\u0002\b,H\u0016J\f\u0010-\u001a\u00020\u001d*\u00020\u001dH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u00020\u001d*\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, m7105d2 = {"Landroidx/compose/ui/layout/IntermediateLayoutModifierNode$IntermediateMeasureScopeImpl;", "Landroidx/compose/ui/layout/IntermediateMeasureScope;", "Lkotlinx/coroutines/CoroutineScope;", "(Landroidx/compose/ui/layout/IntermediateLayoutModifierNode;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "density", "", "getDensity", "()F", "fontScale", "getFontScale", "isLookingAhead", "", "()Z", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "lookaheadSize", "Landroidx/compose/ui/unit/IntSize;", "getLookaheadSize-YbymL2g", "()J", "setLookaheadSize-ozmzZPI", "(J)V", "J", "lookaheadScopeCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getLookaheadScopeCoordinates", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;", TtmlNode.TAG_LAYOUT, "Landroidx/compose/ui/layout/MeasureResult;", "width", "", "height", "alignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "placementBlock", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "toLookaheadCoordinates", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @ExperimentalComposeUiApi
    @SourceDebugExtension({"SMAP\nIntermediateLayoutModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntermediateLayoutModifierNode.kt\nandroidx/compose/ui/layout/IntermediateLayoutModifierNode$IntermediateMeasureScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n*L\n1#1,317:1\n1#2:318\n120#3,5:319\n*S KotlinDebug\n*F\n+ 1 IntermediateLayoutModifierNode.kt\nandroidx/compose/ui/layout/IntermediateLayoutModifierNode$IntermediateMeasureScopeImpl\n*L\n292#1:319,5\n*E\n"})
    public final class IntermediateMeasureScopeImpl implements IntermediateMeasureScope, CoroutineScope {
        public long lookaheadSize = IntSize.INSTANCE.m13841getZeroYbymL2g();

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            return false;
        }

        public IntermediateMeasureScopeImpl() {
        }

        @Override // androidx.compose.p003ui.layout.IntermediateMeasureScope
        /* renamed from: getLookaheadSize-YbymL2g, reason: not valid java name and from getter */
        public long getLookaheadSize() {
            return this.lookaheadSize;
        }

        /* renamed from: setLookaheadSize-ozmzZPI, reason: not valid java name */
        public void m12614setLookaheadSizeozmzZPI(long j) {
            this.lookaheadSize = j;
        }

        @Override // androidx.compose.p003ui.layout.LookaheadScope
        @NotNull
        public LayoutCoordinates toLookaheadCoordinates(@NotNull LayoutCoordinates layoutCoordinates) {
            return IntermediateLayoutModifierNode.this.closestLookaheadScope.toLookaheadCoordinates(layoutCoordinates);
        }

        @Override // androidx.compose.p003ui.layout.LookaheadScope
        @NotNull
        public LayoutCoordinates getLookaheadScopeCoordinates(@NotNull Placeable.PlacementScope placementScope) {
            return IntermediateLayoutModifierNode.this.closestLookaheadScope.getLookaheadScopeCoordinates(placementScope);
        }

        @Override // androidx.compose.p003ui.layout.MeasureScope
        @NotNull
        public MeasureResult layout(final int width, final int height, @NotNull final Map<AlignmentLine, Integer> alignmentLines, @NotNull final Function1<? super Placeable.PlacementScope, Unit> placementBlock) {
            if ((width & ViewCompat.MEASURED_STATE_MASK) == 0 && ((-16777216) & height) == 0) {
                final IntermediateLayoutModifierNode intermediateLayoutModifierNode = IntermediateLayoutModifierNode.this;
                return new MeasureResult(width, height, alignmentLines, placementBlock, intermediateLayoutModifierNode) { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$IntermediateMeasureScopeImpl$layout$1
                    final /* synthetic */ Function1<Placeable.PlacementScope, Unit> $placementBlock;

                    @NotNull
                    private final Map<AlignmentLine, Integer> alignmentLines;
                    private final int height;
                    final /* synthetic */ IntermediateLayoutModifierNode this$0;
                    private final int width;

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.$placementBlock = placementBlock;
                        this.this$0 = intermediateLayoutModifierNode;
                        this.width = width;
                        this.height = height;
                        this.alignmentLines = alignmentLines;
                    }

                    @Override // androidx.compose.p003ui.layout.MeasureResult
                    public int getWidth() {
                        return this.width;
                    }

                    @Override // androidx.compose.p003ui.layout.MeasureResult
                    public int getHeight() {
                        return this.height;
                    }

                    @Override // androidx.compose.p003ui.layout.MeasureResult
                    @NotNull
                    public Map<AlignmentLine, Integer> getAlignmentLines() {
                        return this.alignmentLines;
                    }

                    @Override // androidx.compose.p003ui.layout.MeasureResult
                    public void placeChildren() {
                        Function1<Placeable.PlacementScope, Unit> function1 = this.$placementBlock;
                        NodeCoordinator coordinator = this.this$0.getCoordinator();
                        Intrinsics.checkNotNull(coordinator);
                        function1.invoke(coordinator.getPlacementScope());
                    }
                };
            }
            throw new IllegalStateException(("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasureScope
        @NotNull
        public LayoutDirection getLayoutDirection() {
            NodeCoordinator coordinator = IntermediateLayoutModifierNode.this.getCoordinator();
            Intrinsics.checkNotNull(coordinator);
            return coordinator.getLayoutDirection();
        }

        @Override // androidx.compose.p003ui.unit.Density
        public float getDensity() {
            NodeCoordinator coordinator = IntermediateLayoutModifierNode.this.getCoordinator();
            Intrinsics.checkNotNull(coordinator);
            return coordinator.getDensity();
        }

        @Override // androidx.compose.p003ui.unit.FontScaling
        public float getFontScale() {
            NodeCoordinator coordinator = IntermediateLayoutModifierNode.this.getCoordinator();
            Intrinsics.checkNotNull(coordinator);
            return coordinator.getFontScale();
        }

        @Override // kotlinx.coroutines.CoroutineScope
        @NotNull
        public CoroutineContext getCoroutineContext() {
            return IntermediateLayoutModifierNode.this.getCoroutineScope().getCoroutineContext();
        }
    }
}
