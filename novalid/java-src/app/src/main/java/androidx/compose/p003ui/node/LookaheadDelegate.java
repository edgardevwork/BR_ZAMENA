package androidx.compose.p003ui.node;

import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import androidx.compose.p003ui.layout.AlignmentLine;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.ivy.osgi.p063p2.P2CompositeParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LookaheadDelegate.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b \u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010F\u001a\u00020\u00122\u0006\u0010G\u001a\u00020\u0011H\u0000¢\u0006\u0002\bHJ\u0010\u0010I\u001a\u00020\u00122\u0006\u0010J\u001a\u00020\u0012H\u0016J\u0010\u0010K\u001a\u00020\u00122\u0006\u0010L\u001a\u00020\u0012H\u0016J\u0010\u0010M\u001a\u00020\u00122\u0006\u0010J\u001a\u00020\u0012H\u0016J\u0010\u0010N\u001a\u00020\u00122\u0006\u0010L\u001a\u00020\u0012H\u0016J)\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020R2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00070TH\u0086\bø\u0001\u0000¢\u0006\u0004\bU\u0010VJ=\u0010W\u001a\u00020X2\u0006\u0010?\u001a\u00020@2\u0006\u0010Y\u001a\u00020\u001f2\u0019\u0010Z\u001a\u0015\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020X\u0018\u00010[¢\u0006\u0002\b]H\u0004ø\u0001\u0000¢\u0006\u0004\b^\u0010_J\b\u0010`\u001a\u00020XH\u0014J\u001a\u0010a\u001a\u00020X2\u0006\u0010?\u001a\u00020@H\u0002ø\u0001\u0000¢\u0006\u0004\bb\u0010DJ\u001a\u0010c\u001a\u00020X2\u0006\u0010?\u001a\u00020@H\u0000ø\u0001\u0000¢\u0006\u0004\bd\u0010DJ\u001d\u0010e\u001a\u00020@2\u0006\u0010f\u001a\u00020\u0000H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bg\u0010hJ\r\u0010i\u001a\u00020XH\u0010¢\u0006\u0002\bjR\"\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0014\u0010$\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010'R\u0014\u0010)\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u00101\u001a\u000202¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u001c\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00109\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0017R\u0016\u0010;\u001a\u0004\u0018\u00010<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\"\u0010?\u001a\u00020@X\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006k"}, m7105d2 = {"Landroidx/compose/ui/node/LookaheadDelegate;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "coordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "result", "Landroidx/compose/ui/layout/MeasureResult;", "_measureResult", "set_measureResult", "(Landroidx/compose/ui/layout/MeasureResult;)V", "alignmentLinesOwner", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "cachedAlignmentLinesMap", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "getCachedAlignmentLinesMap", "()Ljava/util/Map;", P2CompositeParser.ChildHandler.CHILD, "getChild", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "density", "", "getDensity", "()F", "fontScale", "getFontScale", "hasMeasureResult", "", "getHasMeasureResult", "()Z", "isLookingAhead", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "lookaheadLayoutCoordinates", "Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "getLookaheadLayoutCoordinates", "()Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "measureResult", "getMeasureResult$ui_release", "()Landroidx/compose/ui/layout/MeasureResult;", "oldAlignmentLines", "parent", "getParent", "parentData", "", "getParentData", "()Ljava/lang/Object;", "position", "Landroidx/compose/ui/unit/IntOffset;", "getPosition-nOcc-ac", "()J", "setPosition--gyyYBs", "(J)V", "J", "getCachedAlignmentLine", "alignmentLine", "getCachedAlignmentLine$ui_release", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "minIntrinsicHeight", "minIntrinsicWidth", "performingMeasure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "block", "Lkotlin/Function0;", "performingMeasure-K40F9xA", "(JLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/layout/Placeable;", "placeAt", "", "zIndex", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeChildren", "placeSelf", "placeSelf--gyyYBs", "placeSelfApparentToRealOffset", "placeSelfApparentToRealOffset--gyyYBs$ui_release", "positionIn", "ancestor", "positionIn-Bjo55l4$ui_release", "(Landroidx/compose/ui/node/LookaheadDelegate;)J", "replace", "replace$ui_release", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLookaheadDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,255:1\n1#2:256\n86#3:257\n86#3:258\n*S KotlinDebug\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n*L\n210#1:257\n249#1:258\n*E\n"})
/* loaded from: classes3.dex */
public abstract class LookaheadDelegate extends LookaheadCapablePlaceable implements Measurable {
    public static final int $stable = 0;

    @Nullable
    private MeasureResult _measureResult;

    @NotNull
    private final NodeCoordinator coordinator;

    @Nullable
    private Map<AlignmentLine, Integer> oldAlignmentLines;
    private long position = IntOffset.INSTANCE.m13804getZeronOccac();

    @NotNull
    private final LookaheadLayoutCoordinates lookaheadLayoutCoordinates = new LookaheadLayoutCoordinates(this);

    @NotNull
    private final Map<AlignmentLine, Integer> cachedAlignmentLinesMap = new LinkedHashMap();

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable, androidx.compose.p003ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return true;
    }

    @NotNull
    public final NodeCoordinator getCoordinator() {
        return this.coordinator;
    }

    public LookaheadDelegate(@NotNull NodeCoordinator nodeCoordinator) {
        this.coordinator = nodeCoordinator;
    }

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable
    @Nullable
    public LookaheadCapablePlaceable getChild() {
        NodeCoordinator wrapped = this.coordinator.getWrapped();
        if (wrapped != null) {
            return wrapped.getLookaheadDelegate();
        }
        return null;
    }

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable
    /* renamed from: getPosition-nOcc-ac, reason: from getter */
    public long getPosition() {
        return this.position;
    }

    /* renamed from: setPosition--gyyYBs */
    public void m12769setPositiongyyYBs(long j) {
        this.position = j;
    }

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable
    @NotNull
    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }

    @Override // androidx.compose.p003ui.layout.IntrinsicMeasureScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // androidx.compose.p003ui.unit.Density
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // androidx.compose.p003ui.unit.FontScaling
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable
    @Nullable
    public LookaheadCapablePlaceable getParent() {
        NodeCoordinator wrappedBy = this.coordinator.getWrappedBy();
        if (wrappedBy != null) {
            return wrappedBy.getLookaheadDelegate();
        }
        return null;
    }

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable, androidx.compose.p003ui.node.MeasureScopeWithLayoutNode
    @NotNull
    public LayoutNode getLayoutNode() {
        return this.coordinator.getLayoutNode();
    }

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable
    @NotNull
    public LayoutCoordinates getCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    @NotNull
    public final LookaheadLayoutCoordinates getLookaheadLayoutCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable
    @NotNull
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = this.coordinator.getLayoutNode().getLayoutDelegate().getLookaheadAlignmentLinesOwner$ui_release();
        Intrinsics.checkNotNull(lookaheadAlignmentLinesOwner$ui_release);
        return lookaheadAlignmentLinesOwner$ui_release;
    }

    public final void set_measureResult(MeasureResult measureResult) {
        Unit unit;
        Map<AlignmentLine, Integer> map;
        if (measureResult != null) {
            m12659setMeasuredSizeozmzZPI(IntSizeKt.IntSize(measureResult.getWidth(), measureResult.getHeight()));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            m12659setMeasuredSizeozmzZPI(IntSize.INSTANCE.m13841getZeroYbymL2g());
        }
        if (!Intrinsics.areEqual(this._measureResult, measureResult) && measureResult != null && ((((map = this.oldAlignmentLines) != null && !map.isEmpty()) || (!measureResult.getAlignmentLines().isEmpty())) && !Intrinsics.areEqual(measureResult.getAlignmentLines(), this.oldAlignmentLines))) {
            getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            Map linkedHashMap = this.oldAlignmentLines;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.oldAlignmentLines = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(measureResult.getAlignmentLines());
        }
        this._measureResult = measureResult;
    }

    @NotNull
    public final Map<AlignmentLine, Integer> getCachedAlignmentLinesMap() {
        return this.cachedAlignmentLinesMap;
    }

    public final int getCachedAlignmentLine$ui_release(@NotNull AlignmentLine alignmentLine) {
        Integer num = this.cachedAlignmentLinesMap.get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        mo12611placeAtf8xVGno(getPosition(), 0.0f, null);
    }

    @Override // androidx.compose.p003ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public final void mo12611placeAtf8xVGno(long position, float zIndex, @Nullable Function1<? super GraphicsLayerScope, Unit> layerBlock) {
        m12765placeSelfgyyYBs(position);
        if (getIsShallowPlacing()) {
            return;
        }
        placeChildren();
    }

    /* renamed from: placeSelf--gyyYBs */
    private final void m12765placeSelfgyyYBs(long position) {
        if (IntOffset.m13793equalsimpl0(getPosition(), position)) {
            return;
        }
        m12769setPositiongyyYBs(position);
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = getLayoutNode().getLayoutDelegate().getLookaheadPassDelegate();
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.notifyChildrenUsingCoordinatesWhilePlacing();
        }
        invalidateAlignmentLinesFromPositionChange(this.coordinator);
    }

    /* renamed from: placeSelfApparentToRealOffset--gyyYBs$ui_release */
    public final void m12767placeSelfApparentToRealOffsetgyyYBs$ui_release(long position) {
        long apparentToRealOffset = getApparentToRealOffset();
        m12765placeSelfgyyYBs(IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(position) + IntOffset.m13794getXimpl(apparentToRealOffset), IntOffset.m13795getYimpl(position) + IntOffset.m13795getYimpl(apparentToRealOffset)));
    }

    public void placeChildren() {
        getMeasureResult$ui_release().placeChildren();
    }

    @NotNull
    /* renamed from: performingMeasure-K40F9xA */
    public final Placeable m12766performingMeasureK40F9xA(long constraints, @NotNull Function0<? extends MeasureResult> block) {
        m12660setMeasurementConstraintsBRTryo0(constraints);
        set_measureResult(block.invoke());
        return this;
    }

    @Override // androidx.compose.p003ui.layout.Measured, androidx.compose.p003ui.layout.IntrinsicMeasurable
    @Nullable
    public Object getParentData() {
        return this.coordinator.getParentData();
    }

    public int minIntrinsicWidth(int height) {
        NodeCoordinator wrapped = this.coordinator.getWrapped();
        Intrinsics.checkNotNull(wrapped);
        LookaheadDelegate lookaheadDelegate = wrapped.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.minIntrinsicWidth(height);
    }

    public int maxIntrinsicWidth(int height) {
        NodeCoordinator wrapped = this.coordinator.getWrapped();
        Intrinsics.checkNotNull(wrapped);
        LookaheadDelegate lookaheadDelegate = wrapped.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.maxIntrinsicWidth(height);
    }

    public int minIntrinsicHeight(int width) {
        NodeCoordinator wrapped = this.coordinator.getWrapped();
        Intrinsics.checkNotNull(wrapped);
        LookaheadDelegate lookaheadDelegate = wrapped.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.minIntrinsicHeight(width);
    }

    public int maxIntrinsicHeight(int width) {
        NodeCoordinator wrapped = this.coordinator.getWrapped();
        Intrinsics.checkNotNull(wrapped);
        LookaheadDelegate lookaheadDelegate = wrapped.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.maxIntrinsicHeight(width);
    }

    /* renamed from: positionIn-Bjo55l4$ui_release */
    public final long m12768positionInBjo55l4$ui_release(@NotNull LookaheadDelegate ancestor) {
        long jM13804getZeronOccac = IntOffset.INSTANCE.m13804getZeronOccac();
        LookaheadDelegate lookaheadDelegate = this;
        while (!Intrinsics.areEqual(lookaheadDelegate, ancestor)) {
            long position = lookaheadDelegate.getPosition();
            jM13804getZeronOccac = IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(jM13804getZeronOccac) + IntOffset.m13794getXimpl(position), IntOffset.m13795getYimpl(jM13804getZeronOccac) + IntOffset.m13795getYimpl(position));
            NodeCoordinator wrappedBy = lookaheadDelegate.coordinator.getWrappedBy();
            Intrinsics.checkNotNull(wrappedBy);
            lookaheadDelegate = wrappedBy.getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
        }
        return jM13804getZeronOccac;
    }
}
