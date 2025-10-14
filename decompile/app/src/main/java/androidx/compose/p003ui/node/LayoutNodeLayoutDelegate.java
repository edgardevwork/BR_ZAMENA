package androidx.compose.p003ui.node;

import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import androidx.compose.p003ui.layout.AlignmentLine;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.LayoutNode;
import androidx.compose.p003ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LayoutNodeLayoutDelegate.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0000\u0018\u00002\u00020\u0001:\u0002^_B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010I\u001a\u00020DH\u0000¢\u0006\u0002\bJJ\u0006\u0010K\u001a\u00020DJ\u0006\u0010L\u001a\u00020DJ\r\u0010M\u001a\u00020DH\u0000¢\u0006\u0002\bNJ\r\u0010O\u001a\u00020DH\u0000¢\u0006\u0002\bPJ\r\u0010Q\u001a\u00020DH\u0000¢\u0006\u0002\bRJ\r\u0010S\u001a\u00020DH\u0000¢\u0006\u0002\bTJ\u0006\u0010U\u001a\u00020DJ\u001a\u0010V\u001a\u00020D2\u0006\u0010W\u001a\u00020\u001fH\u0002ø\u0001\u0000¢\u0006\u0004\bX\u0010YJ\u001a\u0010Z\u001a\u00020D2\u0006\u0010W\u001a\u00020\u001fH\u0002ø\u0001\u0000¢\u0006\u0004\b[\u0010YJ\u0006\u0010\\\u001a\u00020DJ\u0006\u0010]\u001a\u00020DR\u0014\u0010\u0005\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001e\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\rR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001f8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b \u0010!R\u0019\u0010\"\u001a\u0004\u0018\u00010\u001f8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b#\u0010!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010$\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0013R\u000e\u0010&\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010(\u001a\u00020'2\u0006\u0010\u0019\u001a\u00020'@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010+\u001a\u0004\u0018\u00010\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\bR\u001e\u0010-\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0013R\u000e\u0010/\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u00100\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0013R*\u00103\u001a\b\u0018\u000102R\u00020\u00002\f\u0010\u0019\u001a\b\u0018\u000102R\u00020\u0000@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0018\u00106\u001a\u000607R\u00020\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u001e\u0010:\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u0013R\u000e\u0010<\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010>\u001a\u00020?8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010B\u001a\b\u0012\u0004\u0012\u00020D0CX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010E\u001a\u00020\u001fX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010FR\u0014\u0010G\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006`"}, m7105d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "alignmentLinesOwner", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner$ui_release", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "value", "", "childrenAccessingCoordinatesDuringPlacement", "getChildrenAccessingCoordinatesDuringPlacement", "()I", "setChildrenAccessingCoordinatesDuringPlacement", "(I)V", "", "coordinatesAccessedDuringModifierPlacement", "getCoordinatesAccessedDuringModifierPlacement", "()Z", "setCoordinatesAccessedDuringModifierPlacement", "(Z)V", "coordinatesAccessedDuringPlacement", "getCoordinatesAccessedDuringPlacement", "setCoordinatesAccessedDuringPlacement", "<set-?>", "detachedFromParentLookaheadPass", "getDetachedFromParentLookaheadPass$ui_release", "height", "getHeight$ui_release", "lastConstraints", "Landroidx/compose/ui/unit/Constraints;", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "lastLookaheadConstraints", "getLastLookaheadConstraints-DWUhwKw", "layoutPending", "getLayoutPending$ui_release", "layoutPendingForAlignment", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "layoutState", "getLayoutState$ui_release", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "lookaheadAlignmentLinesOwner", "getLookaheadAlignmentLinesOwner$ui_release", "lookaheadLayoutPending", "getLookaheadLayoutPending$ui_release", "lookaheadLayoutPendingForAlignment", "lookaheadMeasurePending", "getLookaheadMeasurePending$ui_release", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "lookaheadPassDelegate", "getLookaheadPassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "measurePassDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "getMeasurePassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "measurePending", "getMeasurePending$ui_release", "nextChildLookaheadPlaceOrder", "nextChildPlaceOrder", "outerCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "getOuterCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "performMeasureBlock", "Lkotlin/Function0;", "", "performMeasureConstraints", "J", "width", "getWidth$ui_release", "ensureLookaheadDelegateCreated", "ensureLookaheadDelegateCreated$ui_release", "invalidateParentData", "markChildrenDirty", "markLayoutPending", "markLayoutPending$ui_release", "markLookaheadLayoutPending", "markLookaheadLayoutPending$ui_release", "markLookaheadMeasurePending", "markLookaheadMeasurePending$ui_release", "markMeasurePending", "markMeasurePending$ui_release", "onCoordinatesUsed", "performLookaheadMeasure", "constraints", "performLookaheadMeasure-BRTryo0", "(J)V", "performMeasure", "performMeasure-BRTryo0", "resetAlignmentLines", "updateParentData", "LookaheadPassDelegate", "MeasurePassDelegate", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1781:1\n1#2:1782\n*E\n"})
/* loaded from: classes4.dex */
public final class LayoutNodeLayoutDelegate {
    public static final int $stable = 8;
    private int childrenAccessingCoordinatesDuringPlacement;
    private boolean coordinatesAccessedDuringModifierPlacement;
    private boolean coordinatesAccessedDuringPlacement;
    private boolean detachedFromParentLookaheadPass;

    @NotNull
    private final LayoutNode layoutNode;
    private boolean layoutPending;
    private boolean layoutPendingForAlignment;
    private boolean lookaheadLayoutPending;
    private boolean lookaheadLayoutPendingForAlignment;
    private boolean lookaheadMeasurePending;

    @Nullable
    private LookaheadPassDelegate lookaheadPassDelegate;
    private boolean measurePending;
    private int nextChildLookaheadPlaceOrder;
    private int nextChildPlaceOrder;

    @NotNull
    private LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Idle;

    @NotNull
    private final MeasurePassDelegate measurePassDelegate = new MeasurePassDelegate();
    private long performMeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);

    @NotNull
    private final Function0<Unit> performMeasureBlock = new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$performMeasureBlock$1
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
            this.this$0.getOuterCoordinator().mo12610measureBRTryo0(this.this$0.performMeasureConstraints);
        }
    };

    public LayoutNodeLayoutDelegate(@NotNull LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    @NotNull
    public final NodeCoordinator getOuterCoordinator() {
        return this.layoutNode.getNodes().getOuterCoordinator();
    }

    @Nullable
    /* renamed from: getLastConstraints-DWUhwKw */
    public final Constraints m12755getLastConstraintsDWUhwKw() {
        return this.measurePassDelegate.m12761getLastConstraintsDWUhwKw();
    }

    @Nullable
    /* renamed from: getLastLookaheadConstraints-DWUhwKw */
    public final Constraints m12756getLastLookaheadConstraintsDWUhwKw() {
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            return lookaheadPassDelegate.getLookaheadConstraints();
        }
        return null;
    }

    public final int getHeight$ui_release() {
        return this.measurePassDelegate.getHeight();
    }

    public final int getWidth$ui_release() {
        return this.measurePassDelegate.getWidth();
    }

    /* renamed from: getDetachedFromParentLookaheadPass$ui_release, reason: from getter */
    public final boolean getDetachedFromParentLookaheadPass() {
        return this.detachedFromParentLookaheadPass;
    }

    @NotNull
    /* renamed from: getLayoutState$ui_release, reason: from getter */
    public final LayoutNode.LayoutState getLayoutState() {
        return this.layoutState;
    }

    /* renamed from: getMeasurePending$ui_release, reason: from getter */
    public final boolean getMeasurePending() {
        return this.measurePending;
    }

    /* renamed from: getLayoutPending$ui_release, reason: from getter */
    public final boolean getLayoutPending() {
        return this.layoutPending;
    }

    /* renamed from: getLookaheadMeasurePending$ui_release, reason: from getter */
    public final boolean getLookaheadMeasurePending() {
        return this.lookaheadMeasurePending;
    }

    /* renamed from: getLookaheadLayoutPending$ui_release, reason: from getter */
    public final boolean getLookaheadLayoutPending() {
        return this.lookaheadLayoutPending;
    }

    public final void markLayoutPending$ui_release() {
        this.layoutPending = true;
        this.layoutPendingForAlignment = true;
    }

    public final void markMeasurePending$ui_release() {
        this.measurePending = true;
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.lookaheadLayoutPending = true;
        this.lookaheadLayoutPendingForAlignment = true;
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.lookaheadMeasurePending = true;
    }

    @NotNull
    public final AlignmentLinesOwner getAlignmentLinesOwner$ui_release() {
        return this.measurePassDelegate;
    }

    @Nullable
    public final AlignmentLinesOwner getLookaheadAlignmentLinesOwner$ui_release() {
        return this.lookaheadPassDelegate;
    }

    public final boolean getCoordinatesAccessedDuringPlacement() {
        return this.coordinatesAccessedDuringPlacement;
    }

    public final void setCoordinatesAccessedDuringPlacement(boolean z) {
        if (this.coordinatesAccessedDuringPlacement != z) {
            this.coordinatesAccessedDuringPlacement = z;
            if (z && !this.coordinatesAccessedDuringModifierPlacement) {
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else {
                if (z || this.coordinatesAccessedDuringModifierPlacement) {
                    return;
                }
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final boolean getCoordinatesAccessedDuringModifierPlacement() {
        return this.coordinatesAccessedDuringModifierPlacement;
    }

    public final void setCoordinatesAccessedDuringModifierPlacement(boolean z) {
        if (this.coordinatesAccessedDuringModifierPlacement != z) {
            this.coordinatesAccessedDuringModifierPlacement = z;
            if (z && !this.coordinatesAccessedDuringPlacement) {
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else {
                if (z || this.coordinatesAccessedDuringPlacement) {
                    return;
                }
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final int getChildrenAccessingCoordinatesDuringPlacement() {
        return this.childrenAccessingCoordinatesDuringPlacement;
    }

    public final void setChildrenAccessingCoordinatesDuringPlacement(int i) {
        int i2 = this.childrenAccessingCoordinatesDuringPlacement;
        this.childrenAccessingCoordinatesDuringPlacement = i;
        if ((i2 == 0) != (i == 0)) {
            LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
            LayoutNodeLayoutDelegate layoutDelegate = parent$ui_release != null ? parent$ui_release.getLayoutDelegate() : null;
            if (layoutDelegate != null) {
                if (i == 0) {
                    layoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutDelegate.childrenAccessingCoordinatesDuringPlacement - 1);
                } else {
                    layoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutDelegate.childrenAccessingCoordinatesDuringPlacement + 1);
                }
            }
        }
    }

    @NotNull
    /* renamed from: getMeasurePassDelegate$ui_release, reason: from getter */
    public final MeasurePassDelegate getMeasurePassDelegate() {
        return this.measurePassDelegate;
    }

    @Nullable
    /* renamed from: getLookaheadPassDelegate$ui_release, reason: from getter */
    public final LookaheadPassDelegate getLookaheadPassDelegate() {
        return this.lookaheadPassDelegate;
    }

    public final void onCoordinatesUsed() {
        LayoutNode.LayoutState layoutState$ui_release = this.layoutNode.getLayoutState$ui_release();
        if (layoutState$ui_release == LayoutNode.LayoutState.LayingOut || layoutState$ui_release == LayoutNode.LayoutState.LookaheadLayingOut) {
            if (this.measurePassDelegate.getLayingOutChildren()) {
                setCoordinatesAccessedDuringPlacement(true);
            } else {
                setCoordinatesAccessedDuringModifierPlacement(true);
            }
        }
        if (layoutState$ui_release == LayoutNode.LayoutState.LookaheadLayingOut) {
            LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
            if (lookaheadPassDelegate != null && lookaheadPassDelegate.getLayingOutChildren()) {
                setCoordinatesAccessedDuringPlacement(true);
            } else {
                setCoordinatesAccessedDuringModifierPlacement(true);
            }
        }
    }

    /* compiled from: LayoutNodeLayoutDelegate.kt */
    @Metadata(m7104d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0014\u0010W\u001a\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020;0XH\u0016J\b\u0010Z\u001a\u00020)H\u0002J\b\u0010[\u001a\u00020)H\u0002J\u001c\u0010\\\u001a\u00020)2\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020)0'H\u0016J!\u0010^\u001a\u00020)2\u0016\u0010]\u001a\u0012\u0012\b\u0012\u00060\u0000R\u00020\u0007\u0012\u0004\u0012\u00020)0'H\u0082\bJ\u0011\u0010_\u001a\u00020;2\u0006\u0010`\u001a\u00020YH\u0096\u0002J\u000e\u0010a\u001a\u00020)2\u0006\u0010b\u001a\u00020\u0011J\u0006\u0010c\u001a\u00020)J\b\u0010d\u001a\u00020)H\u0016J\r\u0010e\u001a\u00020)H\u0000¢\u0006\u0002\bfJ\b\u0010g\u001a\u00020)H\u0002J\b\u0010h\u001a\u00020)H\u0002J\u0010\u0010i\u001a\u00020;2\u0006\u0010j\u001a\u00020;H\u0016J\u0010\u0010k\u001a\u00020;2\u0006\u0010l\u001a\u00020;H\u0016J\u001a\u0010m\u001a\u00020\u00022\u0006\u0010n\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\bo\u0010pJ\u0006\u0010q\u001a\u00020)J\u0010\u0010r\u001a\u00020;2\u0006\u0010j\u001a\u00020;H\u0016J\u0010\u0010s\u001a\u00020;2\u0006\u0010l\u001a\u00020;H\u0016J\u0006\u0010t\u001a\u00020)J\b\u0010u\u001a\u00020)H\u0002J\b\u0010v\u001a\u00020)H\u0002J\u0006\u0010w\u001a\u00020)J\r\u0010x\u001a\u00020)H\u0000¢\u0006\u0002\byJ=\u0010z\u001a\u00020)2\u0006\u0010{\u001a\u00020,2\u0006\u0010T\u001a\u00020/2\u0019\u0010|\u001a\u0015\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)\u0018\u00010'¢\u0006\u0002\b*H\u0014ø\u0001\u0000¢\u0006\u0004\b}\u0010~J\u0006\u0010\u007f\u001a\u00020)J?\u0010\u0080\u0001\u001a\u00020)2\u0006\u0010{\u001a\u00020,2\u0006\u0010T\u001a\u00020/2\u0019\u0010|\u001a\u0015\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)\u0018\u00010'¢\u0006\u0002\b*H\u0002ø\u0001\u0000¢\u0006\u0005\b\u0081\u0001\u0010~J\u001b\u0010\u0082\u0001\u001a\u00020\u00112\u0006\u0010n\u001a\u00020#ø\u0001\u0000¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0007\u0010\u0085\u0001\u001a\u00020)J\t\u0010\u0086\u0001\u001a\u00020)H\u0016J\t\u0010\u0087\u0001\u001a\u00020)H\u0016J\u0013\u0010\u0088\u0001\u001a\u00020)2\b\u0010\u0089\u0001\u001a\u00030\u008a\u0001H\u0002J\u0007\u0010\u008b\u0001\u001a\u00020\u0011R\u0018\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0000R\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\f\u0012\b\u0012\u00060\u0000R\u00020\u00070\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011@PX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R$\u0010 \u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\u0019\u0010\"\u001a\u0004\u0018\u00010#8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b$\u0010%R!\u0010&\u001a\u0015\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)\u0018\u00010'¢\u0006\u0002\b*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010+\u001a\u00020,X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010-R\u000e\u0010.\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u00100\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0013R\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020)03X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00104\u001a\u000205X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0014\u0010:\u001a\u00020;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u000e\u0010>\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010?\u001a\u00020;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010=R\u000e\u0010A\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010B\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\"\u0010F\u001a\u0004\u0018\u00010E2\b\u0010\u001d\u001a\u0004\u0018\u00010E@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u000e\u0010I\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010J\u001a\u00020;2\u0006\u0010\u001d\u001a\u00020;@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bK\u0010=R\u0014\u0010L\u001a\b\u0012\u0004\u0012\u00020)03X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010M\u001a\u0015\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)\u0018\u00010'¢\u0006\u0002\b*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010N\u001a\u00020,X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010-R\u000e\u0010O\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010Q\u001a\u00020;2\u0006\u0010\u001d\u001a\u00020;@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bR\u0010=R\u000e\u0010S\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010T\u001a\u00020/2\u0006\u0010\u001d\u001a\u00020/@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bU\u0010V\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008c\u0001"}, m7105d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "(Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;)V", "_childDelegates", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "alignmentLines", "Landroidx/compose/ui/node/AlignmentLines;", "getAlignmentLines", "()Landroidx/compose/ui/node/AlignmentLines;", "childDelegates", "", "getChildDelegates$ui_release", "()Ljava/util/List;", "childDelegatesDirty", "", "getChildDelegatesDirty$ui_release", "()Z", "setChildDelegatesDirty$ui_release", "(Z)V", "duringAlignmentLinesQuery", "getDuringAlignmentLinesQuery$ui_release", "setDuringAlignmentLinesQuery$ui_release", "innerCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "getInnerCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "<set-?>", "isPlaced", "setPlaced$ui_release", "isPlacedByParent", "setPlacedByParent$ui_release", "lastConstraints", "Landroidx/compose/ui/unit/Constraints;", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "lastLayerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "lastPosition", "Landroidx/compose/ui/unit/IntOffset;", "J", "lastZIndex", "", "layingOutChildren", "getLayingOutChildren", "layoutChildrenBlock", "Lkotlin/Function0;", "measuredByParent", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getMeasuredByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setMeasuredByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "measuredHeight", "", "getMeasuredHeight", "()I", "measuredOnce", "measuredWidth", "getMeasuredWidth", "onNodePlacedCalled", "parentAlignmentLinesOwner", "getParentAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "", "parentData", "getParentData", "()Ljava/lang/Object;", "parentDataDirty", "placeOrder", "getPlaceOrder$ui_release", "placeOuterCoordinatorBlock", "placeOuterCoordinatorLayerBlock", "placeOuterCoordinatorPosition", "placeOuterCoordinatorZIndex", "placedOnce", "previousPlaceOrder", "getPreviousPlaceOrder$ui_release", "relayoutWithoutParentInProgress", "zIndex", "getZIndex$ui_release", "()F", "calculateAlignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "checkChildrenPlaceOrderForUpdates", "clearPlaceOrder", "forEachChildAlignmentLinesOwner", "block", "forEachChildDelegate", "get", "alignmentLine", "invalidateIntrinsicsParent", "forceRequest", "invalidateParentData", "layoutChildren", "markDetachedFromParentLookaheadPass", "markDetachedFromParentLookaheadPass$ui_release", "markNodeAndSubtreeAsPlaced", "markSubtreeAsNotPlaced", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "constraints", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measureBasedOnLookahead", "minIntrinsicHeight", "minIntrinsicWidth", "notifyChildrenUsingCoordinatesWhilePlacing", "onBeforeLayoutChildren", "onIntrinsicsQueried", "onNodeDetached", "onNodePlaced", "onNodePlaced$ui_release", "placeAt", "position", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeBasedOnLookahead", "placeOuterCoordinator", "placeOuterCoordinator-f8xVGno", "remeasure", "remeasure-BRTryo0", "(J)Z", "replace", "requestLayout", "requestMeasure", "trackMeasurementByParent", "node", "Landroidx/compose/ui/node/LayoutNode;", "updateParentData", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1781:1\n571#1:1820\n572#1,2:1829\n574#1:1835\n571#1:1862\n572#1,2:1871\n574#1:1877\n1187#2,2:1782\n1699#3:1784\n1700#3,6:1793\n1706#3,5:1803\n199#4:1785\n197#4:1808\n197#4:1821\n1247#4,7:1836\n197#4:1843\n1235#4,7:1855\n197#4:1863\n197#4:1878\n197#4:1891\n197#4:1903\n197#4:1915\n476#5,7:1786\n483#5,4:1799\n460#5,11:1809\n460#5,7:1822\n467#5,4:1831\n460#5,11:1844\n460#5,7:1864\n467#5,4:1873\n460#5,11:1879\n460#5,11:1892\n460#5,11:1904\n460#5,11:1916\n1#6:1890\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate\n*L\n437#1:1820\n437#1:1829,2\n437#1:1835\n557#1:1862\n557#1:1871,2\n557#1:1877\n336#1:1782,2\n346#1:1784\n346#1:1793,6\n346#1:1803,5\n346#1:1785\n419#1:1808\n437#1:1821\n456#1:1836,7\n461#1:1843\n511#1:1855,7\n557#1:1863\n571#1:1878\n863#1:1891\n889#1:1903\n925#1:1915\n346#1:1786,7\n346#1:1799,4\n419#1:1809,11\n437#1:1822,7\n437#1:1831,4\n461#1:1844,11\n557#1:1864,7\n557#1:1873,4\n571#1:1879,11\n863#1:1892,11\n889#1:1904,11\n925#1:1916,11\n*E\n"})
    /* loaded from: classes.dex */
    public final class MeasurePassDelegate extends Placeable implements Measurable, AlignmentLinesOwner {

        @NotNull
        private final MutableVector<MeasurePassDelegate> _childDelegates;

        @NotNull
        private final AlignmentLines alignmentLines;
        private boolean childDelegatesDirty;
        private boolean duringAlignmentLinesQuery;
        private boolean isPlaced;
        private boolean isPlacedByParent;

        @Nullable
        private Function1<? super GraphicsLayerScope, Unit> lastLayerBlock;
        private long lastPosition;
        private float lastZIndex;
        private boolean layingOutChildren;

        @NotNull
        private final Function0<Unit> layoutChildrenBlock;
        private boolean measuredOnce;
        private boolean onNodePlacedCalled;

        @Nullable
        private Object parentData;
        private boolean parentDataDirty;

        @NotNull
        private final Function0<Unit> placeOuterCoordinatorBlock;

        @Nullable
        private Function1<? super GraphicsLayerScope, Unit> placeOuterCoordinatorLayerBlock;
        private long placeOuterCoordinatorPosition;
        private float placeOuterCoordinatorZIndex;
        private boolean placedOnce;
        private boolean relayoutWithoutParentInProgress;
        private float zIndex;
        private int previousPlaceOrder = Integer.MAX_VALUE;
        private int placeOrder = Integer.MAX_VALUE;

        @NotNull
        private LayoutNode.UsageByParent measuredByParent = LayoutNode.UsageByParent.NotUsed;

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* loaded from: classes4.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[LayoutNode.LayoutState.values().length];
                try {
                    iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
                try {
                    iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public MeasurePassDelegate() {
            IntOffset.Companion companion = IntOffset.INSTANCE;
            this.lastPosition = companion.m13804getZeronOccac();
            this.parentDataDirty = true;
            this.alignmentLines = new LayoutNodeAlignmentLines(this);
            this._childDelegates = new MutableVector<>(new MeasurePassDelegate[16], 0);
            this.childDelegatesDirty = true;
            this.layoutChildrenBlock = new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildrenBlock$1
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
                    this.this$0.clearPlaceOrder();
                    this.this$0.forEachChildAlignmentLinesOwner(new Function1<AlignmentLinesOwner, Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildrenBlock$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AlignmentLinesOwner alignmentLinesOwner) {
                            invoke2(alignmentLinesOwner);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull AlignmentLinesOwner alignmentLinesOwner) {
                            alignmentLinesOwner.getAlignmentLines().setUsedDuringParentLayout$ui_release(false);
                        }
                    });
                    this.this$0.getInnerCoordinator().getMeasureResult$ui_release().placeChildren();
                    this.this$0.checkChildrenPlaceOrderForUpdates();
                    this.this$0.forEachChildAlignmentLinesOwner(new Function1<AlignmentLinesOwner, Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildrenBlock$1.2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AlignmentLinesOwner alignmentLinesOwner) {
                            invoke2(alignmentLinesOwner);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull AlignmentLinesOwner alignmentLinesOwner) {
                            alignmentLinesOwner.getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(alignmentLinesOwner.getAlignmentLines().getUsedDuringParentLayout());
                        }
                    });
                }
            };
            this.placeOuterCoordinatorPosition = companion.m13804getZeronOccac();
            this.placeOuterCoordinatorBlock = new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$placeOuterCoordinatorBlock$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    Placeable.PlacementScope placementScope;
                    NodeCoordinator wrappedBy = layoutNodeLayoutDelegate.getOuterCoordinator().getWrappedBy();
                    if (wrappedBy == null || (placementScope = wrappedBy.getPlacementScope()) == null) {
                        placementScope = LayoutNodeKt.requireOwner(layoutNodeLayoutDelegate.layoutNode).getPlacementScope();
                    }
                    Placeable.PlacementScope placementScope2 = placementScope;
                    LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = this;
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNodeLayoutDelegate;
                    Function1<? super GraphicsLayerScope, Unit> function1 = measurePassDelegate.placeOuterCoordinatorLayerBlock;
                    if (function1 == null) {
                        placementScope2.m12665place70tqf50(layoutNodeLayoutDelegate.getOuterCoordinator(), measurePassDelegate.placeOuterCoordinatorPosition, measurePassDelegate.placeOuterCoordinatorZIndex);
                    } else {
                        placementScope2.m12670placeWithLayeraW9wM(layoutNodeLayoutDelegate.getOuterCoordinator(), measurePassDelegate.placeOuterCoordinatorPosition, measurePassDelegate.placeOuterCoordinatorZIndex, function1);
                    }
                }
            };
        }

        /* renamed from: getPreviousPlaceOrder$ui_release, reason: from getter */
        public final int getPreviousPlaceOrder() {
            return this.previousPlaceOrder;
        }

        /* renamed from: getPlaceOrder$ui_release, reason: from getter */
        public final int getPlaceOrder() {
            return this.placeOrder;
        }

        @Nullable
        /* renamed from: getLastConstraints-DWUhwKw */
        public final Constraints m12761getLastConstraintsDWUhwKw() {
            if (this.measuredOnce) {
                return Constraints.m13610boximpl(getMeasurementConstraints());
            }
            return null;
        }

        @NotNull
        /* renamed from: getMeasuredByParent$ui_release, reason: from getter */
        public final LayoutNode.UsageByParent getMeasuredByParent() {
            return this.measuredByParent;
        }

        public final void setMeasuredByParent$ui_release(@NotNull LayoutNode.UsageByParent usageByParent) {
            this.measuredByParent = usageByParent;
        }

        /* renamed from: getDuringAlignmentLinesQuery$ui_release, reason: from getter */
        public final boolean getDuringAlignmentLinesQuery() {
            return this.duringAlignmentLinesQuery;
        }

        public final void setDuringAlignmentLinesQuery$ui_release(boolean z) {
            this.duringAlignmentLinesQuery = z;
        }

        @Override // androidx.compose.p003ui.layout.Measured, androidx.compose.p003ui.layout.IntrinsicMeasurable
        @Nullable
        public Object getParentData() {
            return this.parentData;
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        /* renamed from: isPlaced, reason: from getter */
        public boolean getIsPlaced() {
            return this.isPlaced;
        }

        public void setPlaced$ui_release(boolean z) {
            this.isPlaced = z;
        }

        /* renamed from: isPlacedByParent, reason: from getter */
        public final boolean getIsPlacedByParent() {
            return this.isPlacedByParent;
        }

        public final void setPlacedByParent$ui_release(boolean z) {
            this.isPlacedByParent = z;
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        @NotNull
        public NodeCoordinator getInnerCoordinator() {
            return LayoutNodeLayoutDelegate.this.layoutNode.getInnerCoordinator$ui_release();
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        @NotNull
        public AlignmentLines getAlignmentLines() {
            return this.alignmentLines;
        }

        /* renamed from: getChildDelegatesDirty$ui_release, reason: from getter */
        public final boolean getChildDelegatesDirty() {
            return this.childDelegatesDirty;
        }

        public final void setChildDelegatesDirty$ui_release(boolean z) {
            this.childDelegatesDirty = z;
        }

        @NotNull
        public final List<MeasurePassDelegate> getChildDelegates$ui_release() {
            LayoutNodeLayoutDelegate.this.layoutNode.updateChildrenIfDirty$ui_release();
            if (!this.childDelegatesDirty) {
                return this._childDelegates.asMutableList();
            }
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            MutableVector<MeasurePassDelegate> mutableVector = this._childDelegates;
            MutableVector<LayoutNode> mutableVector2 = layoutNode.get_children$ui_release();
            int size = mutableVector2.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector2.getContent();
                int i = 0;
                do {
                    LayoutNode layoutNode2 = content[i];
                    if (mutableVector.getSize() <= i) {
                        mutableVector.add(layoutNode2.getLayoutDelegate().getMeasurePassDelegate());
                    } else {
                        mutableVector.set(i, layoutNode2.getLayoutDelegate().getMeasurePassDelegate());
                    }
                    i++;
                } while (i < size);
            }
            mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
            this.childDelegatesDirty = false;
            return this._childDelegates.asMutableList();
        }

        public final void markDetachedFromParentLookaheadPass$ui_release() {
            LayoutNodeLayoutDelegate.this.detachedFromParentLookaheadPass = true;
        }

        public final boolean getLayingOutChildren() {
            return this.layingOutChildren;
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        public void layoutChildren() {
            this.layingOutChildren = true;
            getAlignmentLines().recalculateQueryOwner();
            if (LayoutNodeLayoutDelegate.this.getLayoutPending()) {
                onBeforeLayoutChildren();
            }
            if (LayoutNodeLayoutDelegate.this.layoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !getInnerCoordinator().getIsPlacingForAlignment() && LayoutNodeLayoutDelegate.this.getLayoutPending())) {
                LayoutNodeLayoutDelegate.this.layoutPending = false;
                LayoutNode.LayoutState layoutState = LayoutNodeLayoutDelegate.this.getLayoutState();
                LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LayingOut;
                LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringPlacement(false);
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                LayoutNodeKt.requireOwner(layoutNode).getSnapshotObserver().observeLayoutSnapshotReads$ui_release(layoutNode, false, this.layoutChildrenBlock);
                LayoutNodeLayoutDelegate.this.layoutState = layoutState;
                if (getInnerCoordinator().getIsPlacingForAlignment() && LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement()) {
                    requestLayout();
                }
                LayoutNodeLayoutDelegate.this.layoutPendingForAlignment = false;
            }
            if (getAlignmentLines().getUsedDuringParentLayout()) {
                getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(true);
            }
            if (getAlignmentLines().getDirty() && getAlignmentLines().getRequired$ui_release()) {
                getAlignmentLines().recalculate();
            }
            this.layingOutChildren = false;
        }

        public final void checkChildrenPlaceOrderForUpdates() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    LayoutNode layoutNode2 = content[i];
                    if (layoutNode2.getMeasurePassDelegate$ui_release().previousPlaceOrder != layoutNode2.getPlaceOrder$ui_release()) {
                        layoutNode.onZSortedChildrenInvalidated$ui_release();
                        layoutNode.invalidateLayer$ui_release();
                        if (layoutNode2.getPlaceOrder$ui_release() == Integer.MAX_VALUE) {
                            layoutNode2.getMeasurePassDelegate$ui_release().markSubtreeAsNotPlaced();
                        }
                    }
                    i++;
                } while (i < size);
            }
        }

        private final void markSubtreeAsNotPlaced() {
            if (getIsPlaced()) {
                int i = 0;
                setPlaced$ui_release(false);
                MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
                int size = mutableVector.getSize();
                if (size > 0) {
                    LayoutNode[] content = mutableVector.getContent();
                    do {
                        content[i].getMeasurePassDelegate$ui_release().markSubtreeAsNotPlaced();
                        i++;
                    } while (i < size);
                }
            }
        }

        private final void markNodeAndSubtreeAsPlaced() {
            boolean isPlaced = getIsPlaced();
            setPlaced$ui_release(true);
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            int i = 0;
            if (!isPlaced) {
                if (layoutNode.getMeasurePending$ui_release()) {
                    LayoutNode.requestRemeasure$ui_release$default(layoutNode, true, false, 2, null);
                } else if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                    LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNode, true, false, 2, null);
                }
            }
            NodeCoordinator wrapped = layoutNode.getInnerCoordinator$ui_release().getWrapped();
            for (NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
                if (outerCoordinator$ui_release.getLastLayerDrawingWasSkipped()) {
                    outerCoordinator$ui_release.invalidateLayer();
                }
            }
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                do {
                    LayoutNode layoutNode2 = content[i];
                    if (layoutNode2.getPlaceOrder$ui_release() != Integer.MAX_VALUE) {
                        layoutNode2.getMeasurePassDelegate$ui_release().markNodeAndSubtreeAsPlaced();
                        layoutNode.rescheduleRemeasureOrRelayout$ui_release(layoutNode2);
                    }
                    i++;
                } while (i < size);
            }
        }

        /* renamed from: getZIndex$ui_release, reason: from getter */
        public final float getZIndex() {
            return this.zIndex;
        }

        public final void onNodePlaced$ui_release() {
            this.onNodePlacedCalled = true;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            float zIndex = getInnerCoordinator().getZIndex();
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release();
            NodeCoordinator innerCoordinator$ui_release = layoutNode.getInnerCoordinator$ui_release();
            while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
                Intrinsics.checkNotNull(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
                zIndex += layoutModifierNodeCoordinator.getZIndex();
                outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped();
            }
            if (zIndex != this.zIndex) {
                this.zIndex = zIndex;
                if (parent$ui_release != null) {
                    parent$ui_release.onZSortedChildrenInvalidated$ui_release();
                }
                if (parent$ui_release != null) {
                    parent$ui_release.invalidateLayer$ui_release();
                }
            }
            if (!getIsPlaced()) {
                if (parent$ui_release != null) {
                    parent$ui_release.invalidateLayer$ui_release();
                }
                markNodeAndSubtreeAsPlaced();
                if (this.relayoutWithoutParentInProgress && parent$ui_release != null) {
                    LayoutNode.requestRelayout$ui_release$default(parent$ui_release, false, 1, null);
                }
            }
            if (parent$ui_release != null) {
                if (!this.relayoutWithoutParentInProgress && parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut) {
                    if (this.placeOrder == Integer.MAX_VALUE) {
                        this.placeOrder = parent$ui_release.getLayoutDelegate().nextChildPlaceOrder;
                        parent$ui_release.getLayoutDelegate().nextChildPlaceOrder++;
                    } else {
                        throw new IllegalStateException("Place was called on a node which was placed already".toString());
                    }
                }
            } else {
                this.placeOrder = 0;
            }
            layoutChildren();
        }

        public final void clearPlaceOrder() {
            LayoutNodeLayoutDelegate.this.nextChildPlaceOrder = 0;
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    MeasurePassDelegate measurePassDelegate$ui_release = content[i].getMeasurePassDelegate$ui_release();
                    measurePassDelegate$ui_release.previousPlaceOrder = measurePassDelegate$ui_release.placeOrder;
                    measurePassDelegate$ui_release.placeOrder = Integer.MAX_VALUE;
                    measurePassDelegate$ui_release.isPlacedByParent = false;
                    if (measurePassDelegate$ui_release.measuredByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                        measurePassDelegate$ui_release.measuredByParent = LayoutNode.UsageByParent.NotUsed;
                    }
                    i++;
                } while (i < size);
            }
        }

        private final void forEachChildDelegate(Function1<? super MeasurePassDelegate, Unit> block) {
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    block.invoke(content[i].getMeasurePassDelegate$ui_release());
                    i++;
                } while (i < size);
            }
        }

        @Override // androidx.compose.p003ui.layout.Measurable
        @NotNull
        /* renamed from: measure-BRTryo0 */
        public Placeable mo12610measureBRTryo0(long constraints) {
            LayoutNode.UsageByParent intrinsicsUsageByParent = LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent();
            LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
            if (intrinsicsUsageByParent == usageByParent) {
                LayoutNodeLayoutDelegate.this.layoutNode.clearSubtreeIntrinsicsUsage$ui_release();
            }
            if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(LayoutNodeLayoutDelegate.this.layoutNode)) {
                LookaheadPassDelegate lookaheadPassDelegate = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate();
                Intrinsics.checkNotNull(lookaheadPassDelegate);
                lookaheadPassDelegate.setMeasuredByParent$ui_release(usageByParent);
                lookaheadPassDelegate.mo12610measureBRTryo0(constraints);
            }
            trackMeasurementByParent(LayoutNodeLayoutDelegate.this.layoutNode);
            m12762remeasureBRTryo0(constraints);
            return this;
        }

        /* renamed from: remeasure-BRTryo0 */
        public final boolean m12762remeasureBRTryo0(long constraints) {
            boolean z = true;
            if (!LayoutNodeLayoutDelegate.this.layoutNode.getIsDeactivated()) {
                Owner ownerRequireOwner = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode);
                LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
                LayoutNodeLayoutDelegate.this.layoutNode.setCanMultiMeasure$ui_release(LayoutNodeLayoutDelegate.this.layoutNode.getCanMultiMeasure() || (parent$ui_release != null && parent$ui_release.getCanMultiMeasure()));
                if (!LayoutNodeLayoutDelegate.this.layoutNode.getMeasurePending$ui_release() && Constraints.m13615equalsimpl0(getMeasurementConstraints(), constraints)) {
                    Owner.forceMeasureTheSubtree$default(ownerRequireOwner, LayoutNodeLayoutDelegate.this.layoutNode, false, 2, null);
                    LayoutNodeLayoutDelegate.this.layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
                    return false;
                }
                getAlignmentLines().setUsedByModifierMeasurement$ui_release(false);
                forEachChildAlignmentLinesOwner(new Function1<AlignmentLinesOwner, Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$remeasure$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AlignmentLinesOwner alignmentLinesOwner) {
                        invoke2(alignmentLinesOwner);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull AlignmentLinesOwner alignmentLinesOwner) {
                        alignmentLinesOwner.getAlignmentLines().setUsedDuringParentMeasurement$ui_release(false);
                    }
                });
                this.measuredOnce = true;
                long jMo12617getSizeYbymL2g = LayoutNodeLayoutDelegate.this.getOuterCoordinator().mo12617getSizeYbymL2g();
                m12660setMeasurementConstraintsBRTryo0(constraints);
                LayoutNodeLayoutDelegate.this.m12754performMeasureBRTryo0(constraints);
                if (IntSize.m13834equalsimpl0(LayoutNodeLayoutDelegate.this.getOuterCoordinator().mo12617getSizeYbymL2g(), jMo12617getSizeYbymL2g) && LayoutNodeLayoutDelegate.this.getOuterCoordinator().getWidth() == getWidth() && LayoutNodeLayoutDelegate.this.getOuterCoordinator().getHeight() == getHeight()) {
                    z = false;
                }
                m12659setMeasuredSizeozmzZPI(IntSizeKt.IntSize(LayoutNodeLayoutDelegate.this.getOuterCoordinator().getWidth(), LayoutNodeLayoutDelegate.this.getOuterCoordinator().getHeight()));
                return z;
            }
            throw new IllegalArgumentException("measure is called on a deactivated node".toString());
        }

        private final void trackMeasurementByParent(LayoutNode node) {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode parent$ui_release = node.getParent$ui_release();
            if (parent$ui_release != null) {
                if (this.measuredByParent != LayoutNode.UsageByParent.NotUsed && !node.getCanMultiMeasure()) {
                    throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()".toString());
                }
                int i = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
                if (i == 1) {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                } else if (i == 2) {
                    usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                } else {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + parent$ui_release.getLayoutState$ui_release());
                }
                this.measuredByParent = usageByParent;
                return;
            }
            this.measuredByParent = LayoutNode.UsageByParent.NotUsed;
        }

        @Override // androidx.compose.p003ui.layout.Placeable, androidx.compose.p003ui.layout.Measured
        public int getMeasuredWidth() {
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().getMeasuredWidth();
        }

        @Override // androidx.compose.p003ui.layout.Placeable, androidx.compose.p003ui.layout.Measured
        public int getMeasuredHeight() {
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().getMeasuredHeight();
        }

        @Override // androidx.compose.p003ui.layout.Measured
        public int get(@NotNull AlignmentLine alignmentLine) {
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if ((parent$ui_release != null ? parent$ui_release.getLayoutState$ui_release() : null) != LayoutNode.LayoutState.Measuring) {
                LayoutNode parent$ui_release2 = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
                if ((parent$ui_release2 != null ? parent$ui_release2.getLayoutState$ui_release() : null) == LayoutNode.LayoutState.LayingOut) {
                    getAlignmentLines().setUsedDuringParentLayout$ui_release(true);
                }
            } else {
                getAlignmentLines().setUsedDuringParentMeasurement$ui_release(true);
            }
            this.duringAlignmentLinesQuery = true;
            int i = LayoutNodeLayoutDelegate.this.getOuterCoordinator().get(alignmentLine);
            this.duringAlignmentLinesQuery = false;
            return i;
        }

        @Override // androidx.compose.p003ui.layout.Placeable
        /* renamed from: placeAt-f8xVGno */
        public void mo12611placeAtf8xVGno(long position, float zIndex, @Nullable Function1<? super GraphicsLayerScope, Unit> layerBlock) {
            Placeable.PlacementScope placementScope;
            this.isPlacedByParent = true;
            if (!IntOffset.m13793equalsimpl0(position, this.lastPosition)) {
                if (LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringModifierPlacement() || LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement()) {
                    LayoutNodeLayoutDelegate.this.layoutPending = true;
                }
                notifyChildrenUsingCoordinatesWhilePlacing();
            }
            boolean z = false;
            if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(LayoutNodeLayoutDelegate.this.layoutNode)) {
                NodeCoordinator wrappedBy = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getWrappedBy();
                if (wrappedBy == null || (placementScope = wrappedBy.getPlacementScope()) == null) {
                    placementScope = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode).getPlacementScope();
                }
                Placeable.PlacementScope placementScope2 = placementScope;
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
                LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.getLookaheadPassDelegate();
                Intrinsics.checkNotNull(lookaheadPassDelegate);
                LayoutNode parent$ui_release = layoutNodeLayoutDelegate.layoutNode.getParent$ui_release();
                if (parent$ui_release != null) {
                    parent$ui_release.getLayoutDelegate().nextChildLookaheadPlaceOrder = 0;
                }
                lookaheadPassDelegate.setPlaceOrder$ui_release(Integer.MAX_VALUE);
                Placeable.PlacementScope.place$default(placementScope2, lookaheadPassDelegate, IntOffset.m13794getXimpl(position), IntOffset.m13795getYimpl(position), 0.0f, 4, null);
            }
            LookaheadPassDelegate lookaheadPassDelegate2 = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate();
            if (lookaheadPassDelegate2 != null && !lookaheadPassDelegate2.getPlacedOnce()) {
                z = true;
            }
            if (!(true ^ z)) {
                throw new IllegalArgumentException("Error: Placement happened before lookahead.".toString());
            }
            m12760placeOuterCoordinatorf8xVGno(position, zIndex, layerBlock);
        }

        /* renamed from: placeOuterCoordinator-f8xVGno */
        private final void m12760placeOuterCoordinatorf8xVGno(long position, float zIndex, Function1<? super GraphicsLayerScope, Unit> layerBlock) {
            if (!(!LayoutNodeLayoutDelegate.this.layoutNode.getIsDeactivated())) {
                throw new IllegalArgumentException("place is called on a deactivated node".toString());
            }
            LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LayingOut;
            this.lastPosition = position;
            this.lastZIndex = zIndex;
            this.lastLayerBlock = layerBlock;
            this.placedOnce = true;
            this.onNodePlacedCalled = false;
            Owner ownerRequireOwner = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode);
            if (!LayoutNodeLayoutDelegate.this.getLayoutPending() && getIsPlaced()) {
                LayoutNodeLayoutDelegate.this.getOuterCoordinator().m12806placeSelfApparentToRealOffsetf8xVGno(position, zIndex, layerBlock);
                onNodePlaced$ui_release();
            } else {
                getAlignmentLines().setUsedByModifierLayout$ui_release(false);
                LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringModifierPlacement(false);
                this.placeOuterCoordinatorLayerBlock = layerBlock;
                this.placeOuterCoordinatorPosition = position;
                this.placeOuterCoordinatorZIndex = zIndex;
                ownerRequireOwner.getSnapshotObserver().observeLayoutModifierSnapshotReads$ui_release(LayoutNodeLayoutDelegate.this.layoutNode, false, this.placeOuterCoordinatorBlock);
                this.placeOuterCoordinatorLayerBlock = null;
            }
            LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.Idle;
        }

        public final void replace() {
            LayoutNode parent$ui_release;
            try {
                this.relayoutWithoutParentInProgress = true;
                if (!this.placedOnce) {
                    throw new IllegalStateException("replace called on unplaced item".toString());
                }
                boolean isPlaced = getIsPlaced();
                m12760placeOuterCoordinatorf8xVGno(this.lastPosition, this.lastZIndex, this.lastLayerBlock);
                if (isPlaced && !this.onNodePlacedCalled && (parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release()) != null) {
                    LayoutNode.requestRelayout$ui_release$default(parent$ui_release, false, 1, null);
                }
            } finally {
                this.relayoutWithoutParentInProgress = false;
            }
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int height) {
            onIntrinsicsQueried();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().minIntrinsicWidth(height);
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int height) {
            onIntrinsicsQueried();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().maxIntrinsicWidth(height);
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int width) {
            onIntrinsicsQueried();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().minIntrinsicHeight(width);
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int width) {
            onIntrinsicsQueried();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().maxIntrinsicHeight(width);
        }

        private final void onIntrinsicsQueried() {
            LayoutNode.UsageByParent intrinsicsUsageByParent;
            LayoutNode.requestRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, false, 3, null);
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release == null || LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent() != LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            int i = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
            if (i == 1) {
                intrinsicsUsageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            } else if (i == 2) {
                intrinsicsUsageByParent = LayoutNode.UsageByParent.InLayoutBlock;
            } else {
                intrinsicsUsageByParent = parent$ui_release.getIntrinsicsUsageByParent();
            }
            layoutNode.setIntrinsicsUsageByParent$ui_release(intrinsicsUsageByParent);
        }

        public final void invalidateParentData() {
            this.parentDataDirty = true;
        }

        public final boolean updateParentData() {
            if ((getParentData() == null && LayoutNodeLayoutDelegate.this.getOuterCoordinator().getParentData() == null) || !this.parentDataDirty) {
                return false;
            }
            this.parentDataDirty = false;
            this.parentData = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getParentData();
            return true;
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        @NotNull
        public Map<AlignmentLine, Integer> calculateAlignmentLines() {
            if (!this.duringAlignmentLinesQuery) {
                if (LayoutNodeLayoutDelegate.this.getLayoutState() == LayoutNode.LayoutState.Measuring) {
                    getAlignmentLines().setUsedByModifierMeasurement$ui_release(true);
                    if (getAlignmentLines().getDirty()) {
                        LayoutNodeLayoutDelegate.this.markLayoutPending$ui_release();
                    }
                } else {
                    getAlignmentLines().setUsedByModifierLayout$ui_release(true);
                }
            }
            getInnerCoordinator().setPlacingForAlignment$ui_release(true);
            layoutChildren();
            getInnerCoordinator().setPlacingForAlignment$ui_release(false);
            return getAlignmentLines().getLastCalculation();
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        @Nullable
        public AlignmentLinesOwner getParentAlignmentLinesOwner() {
            LayoutNodeLayoutDelegate layoutDelegate;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release == null || (layoutDelegate = parent$ui_release.getLayoutDelegate()) == null) {
                return null;
            }
            return layoutDelegate.getAlignmentLinesOwner$ui_release();
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        public void forEachChildAlignmentLinesOwner(@NotNull Function1<? super AlignmentLinesOwner, Unit> block) {
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    block.invoke(content[i].getLayoutDelegate().getAlignmentLinesOwner$ui_release());
                    i++;
                } while (i < size);
            }
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        public void requestLayout() {
            LayoutNode.requestRelayout$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, 1, null);
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        public void requestMeasure() {
            LayoutNode.requestRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, false, 3, null);
        }

        public final void notifyChildrenUsingCoordinatesWhilePlacing() {
            MutableVector<LayoutNode> mutableVector;
            int size;
            if (LayoutNodeLayoutDelegate.this.getChildrenAccessingCoordinatesDuringPlacement() <= 0 || (size = (mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release()).getSize()) <= 0) {
                return;
            }
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = content[i];
                LayoutNodeLayoutDelegate layoutDelegate = layoutNode.getLayoutDelegate();
                if ((layoutDelegate.getCoordinatesAccessedDuringPlacement() || layoutDelegate.getCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate.getLayoutPending()) {
                    LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                }
                layoutDelegate.getMeasurePassDelegate().notifyChildrenUsingCoordinatesWhilePlacing();
                i++;
            } while (i < size);
        }

        private final void onBeforeLayoutChildren() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    LayoutNode layoutNode2 = content[i];
                    if (layoutNode2.getMeasurePending$ui_release() && layoutNode2.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock && LayoutNode.m12738remeasure_Sx5XlM$ui_release$default(layoutNode2, null, 1, null)) {
                        LayoutNode.requestRemeasure$ui_release$default(layoutNodeLayoutDelegate.layoutNode, false, false, 3, null);
                    }
                    i++;
                } while (i < size);
            }
        }

        public final void invalidateIntrinsicsParent(boolean forceRequest) {
            LayoutNode parent$ui_release;
            LayoutNode parent$ui_release2 = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            LayoutNode.UsageByParent intrinsicsUsageByParent = LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent();
            if (parent$ui_release2 == null || intrinsicsUsageByParent == LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            while (parent$ui_release2.getIntrinsicsUsageByParent() == intrinsicsUsageByParent && (parent$ui_release = parent$ui_release2.getParent$ui_release()) != null) {
                parent$ui_release2 = parent$ui_release;
            }
            int i = WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent.ordinal()];
            if (i == 1) {
                LayoutNode.requestRemeasure$ui_release$default(parent$ui_release2, forceRequest, false, 2, null);
            } else {
                if (i == 2) {
                    parent$ui_release2.requestRelayout$ui_release(forceRequest);
                    return;
                }
                throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
            }
        }

        public final void onNodeDetached() {
            this.placeOrder = Integer.MAX_VALUE;
            this.previousPlaceOrder = Integer.MAX_VALUE;
            setPlaced$ui_release(false);
        }

        public final void measureBasedOnLookahead() {
            LookaheadPassDelegate lookaheadPassDelegate = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate();
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release == null) {
                throw new IllegalStateException("layoutNode parent is not set".toString());
            }
            if (lookaheadPassDelegate == null) {
                throw new IllegalStateException("invalid lookaheadDelegate".toString());
            }
            if (lookaheadPassDelegate.getMeasuredByParent() == LayoutNode.UsageByParent.InMeasureBlock && parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.Measuring) {
                Constraints lookaheadConstraints = lookaheadPassDelegate.getLookaheadConstraints();
                Intrinsics.checkNotNull(lookaheadConstraints);
                mo12610measureBRTryo0(lookaheadConstraints.getValue());
            } else if (lookaheadPassDelegate.getMeasuredByParent() == LayoutNode.UsageByParent.InLayoutBlock && parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut) {
                Constraints lookaheadConstraints2 = lookaheadPassDelegate.getLookaheadConstraints();
                Intrinsics.checkNotNull(lookaheadConstraints2);
                mo12610measureBRTryo0(lookaheadConstraints2.getValue());
            }
        }

        public final void placeBasedOnLookahead() {
            LookaheadPassDelegate lookaheadPassDelegate = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate();
            if (lookaheadPassDelegate == null) {
                throw new IllegalStateException("invalid lookaheadDelegate".toString());
            }
            mo12611placeAtf8xVGno(lookaheadPassDelegate.getLastPosition(), lookaheadPassDelegate.getLastZIndex(), lookaheadPassDelegate.getLastLayerBlock$ui_release());
        }
    }

    /* compiled from: LayoutNodeLayoutDelegate.kt */
    @Metadata(m7104d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0014\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020B0[H\u0016J\b\u0010]\u001a\u00020&H\u0002J\b\u0010^\u001a\u00020&H\u0002J\u001c\u0010_\u001a\u00020&2\u0012\u0010`\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020&0$H\u0016J!\u0010a\u001a\u00020&2\u0016\u0010`\u001a\u0012\u0012\b\u0012\u00060\u0000R\u00020\u0007\u0012\u0004\u0012\u00020&0$H\u0082\bJ\u0011\u0010b\u001a\u00020B2\u0006\u0010c\u001a\u00020\\H\u0096\u0002J\u000e\u0010d\u001a\u00020&2\u0006\u0010e\u001a\u00020\u0011J\u0006\u0010f\u001a\u00020&J\b\u0010g\u001a\u00020&H\u0016J\b\u0010h\u001a\u00020&H\u0002J\b\u0010i\u001a\u00020&H\u0002J\u0010\u0010j\u001a\u00020B2\u0006\u0010k\u001a\u00020BH\u0016J\u0010\u0010l\u001a\u00020B2\u0006\u0010m\u001a\u00020BH\u0016J\u001a\u0010n\u001a\u00020\u00012\u0006\u0010o\u001a\u00020 H\u0016ø\u0001\u0000¢\u0006\u0004\bp\u0010qJ\u0010\u0010r\u001a\u00020B2\u0006\u0010k\u001a\u00020BH\u0016J\u0010\u0010s\u001a\u00020B2\u0006\u0010m\u001a\u00020BH\u0016J\u0006\u0010t\u001a\u00020&J\b\u0010u\u001a\u00020&H\u0002J\b\u0010v\u001a\u00020&H\u0002J\u0006\u0010w\u001a\u00020&J\r\u0010x\u001a\u00020&H\u0000¢\u0006\u0002\byJ=\u0010z\u001a\u00020&2\u0006\u0010{\u001a\u00020+2\u0006\u0010|\u001a\u0002002\u0019\u0010}\u001a\u0015\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$¢\u0006\u0002\b'H\u0014ø\u0001\u0000¢\u0006\u0004\b~\u0010\u007fJ\u001b\u0010\u0080\u0001\u001a\u00020\u00112\u0006\u0010o\u001a\u00020 ø\u0001\u0000¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0007\u0010\u0083\u0001\u001a\u00020&J\t\u0010\u0084\u0001\u001a\u00020&H\u0016J\t\u0010\u0085\u0001\u001a\u00020&H\u0016J\u0013\u0010\u0086\u0001\u001a\u00020&2\b\u0010\u0087\u0001\u001a\u00030\u0088\u0001H\u0002J\u0007\u0010\u0089\u0001\u001a\u00020\u0011R\u0018\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0000R\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\f\u0012\b\u0012\u00060\u0000R\u00020\u00070\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u0019\u0010\u001f\u001a\u0004\u0018\u00010 8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b!\u0010\"RD\u0010(\u001a\u0015\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$¢\u0006\u0002\b'2\u0019\u0010#\u001a\u0015\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$¢\u0006\u0002\b'@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R&\u0010,\u001a\u00020+2\u0006\u0010#\u001a\u00020+@BX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u001e\u00101\u001a\u0002002\u0006\u0010#\u001a\u000200@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u001e\u00104\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0013R\u0016\u00106\u001a\u0004\u0018\u00010 X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u0018\u00107\u001a\u000608R\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001a\u0010;\u001a\u00020<X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u000e\u0010E\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010F\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010DR\u000e\u0010H\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010I\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\"\u0010M\u001a\u0004\u0018\u00010L2\b\u0010#\u001a\u0004\u0018\u00010L@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u000e\u0010P\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010Q\u001a\u00020BX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010D\"\u0004\bS\u0010TR\u001a\u0010U\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u0013\"\u0004\bW\u0010\u0015R\u0018\u0010X\u001a\u00020B2\u0006\u0010#\u001a\u00020B@BX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008a\u0001"}, m7105d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "(Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;)V", "_childDelegates", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "alignmentLines", "Landroidx/compose/ui/node/AlignmentLines;", "getAlignmentLines", "()Landroidx/compose/ui/node/AlignmentLines;", "childDelegates", "", "getChildDelegates$ui_release", "()Ljava/util/List;", "childDelegatesDirty", "", "getChildDelegatesDirty$ui_release", "()Z", "setChildDelegatesDirty$ui_release", "(Z)V", "duringAlignmentLinesQuery", "getDuringAlignmentLinesQuery$ui_release", "setDuringAlignmentLinesQuery$ui_release", "innerCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "getInnerCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "isPlaced", "setPlaced", "lastConstraints", "Landroidx/compose/ui/unit/Constraints;", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "<set-?>", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "lastLayerBlock", "getLastLayerBlock$ui_release", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/unit/IntOffset;", "lastPosition", "getLastPosition-nOcc-ac$ui_release", "()J", "J", "", "lastZIndex", "getLastZIndex$ui_release", "()F", "layingOutChildren", "getLayingOutChildren", "lookaheadConstraints", "measurePassDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "getMeasurePassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "measuredByParent", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getMeasuredByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setMeasuredByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "measuredHeight", "", "getMeasuredHeight", "()I", "measuredOnce", "measuredWidth", "getMeasuredWidth", "onNodePlacedCalled", "parentAlignmentLinesOwner", "getParentAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "", "parentData", "getParentData", "()Ljava/lang/Object;", "parentDataDirty", "placeOrder", "getPlaceOrder$ui_release", "setPlaceOrder$ui_release", "(I)V", "placedOnce", "getPlacedOnce$ui_release", "setPlacedOnce$ui_release", "previousPlaceOrder", "relayoutWithoutParentInProgress", "calculateAlignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "checkChildrenPlaceOrderForUpdates", "clearPlaceOrder", "forEachChildAlignmentLinesOwner", "block", "forEachChildDelegate", "get", "alignmentLine", "invalidateIntrinsicsParent", "forceRequest", "invalidateParentData", "layoutChildren", "markNodeAndSubtreeAsPlaced", "markSubtreeAsNotPlaced", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "constraints", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "notifyChildrenUsingCoordinatesWhilePlacing", "onBeforeLayoutChildren", "onIntrinsicsQueried", "onNodeDetached", "onNodePlaced", "onNodePlaced$ui_release", "placeAt", "position", "zIndex", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "remeasure", "remeasure-BRTryo0", "(J)Z", "replace", "requestLayout", "requestMeasure", "trackLookaheadMeasurementByParent", "node", "Landroidx/compose/ui/node/LayoutNode;", "updateParentData", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1781:1\n1078#1:1820\n1079#1,2:1829\n1078#1:1835\n1079#1,2:1844\n1078#1:1874\n1079#1,2:1883\n1187#2,2:1782\n1699#3:1784\n1700#3,6:1793\n1706#3,5:1803\n199#4:1785\n197#4:1808\n197#4:1821\n197#4:1836\n197#4:1850\n197#4:1862\n197#4:1875\n197#4:1889\n197#4:1901\n476#5,7:1786\n483#5,4:1799\n460#5,11:1809\n460#5,7:1822\n467#5,4:1831\n460#5,7:1837\n467#5,4:1846\n460#5,11:1851\n460#5,11:1863\n460#5,7:1876\n467#5,4:1885\n460#5,11:1890\n460#5,11:1902\n1#6:1913\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate\n*L\n1141#1:1820\n1141#1:1829,2\n1156#1:1835\n1156#1:1844,2\n1512#1:1874\n1512#1:1883,2\n1058#1:1782,2\n1067#1:1784\n1067#1:1793,6\n1067#1:1803,5\n1067#1:1785\n1078#1:1808\n1141#1:1821\n1156#1:1836\n1183#1:1850\n1209#1:1862\n1512#1:1875\n1534#1:1889\n1567#1:1901\n1067#1:1786,7\n1067#1:1799,4\n1078#1:1809,11\n1141#1:1822,7\n1141#1:1831,4\n1156#1:1837,7\n1156#1:1846,4\n1183#1:1851,11\n1209#1:1863,11\n1512#1:1876,7\n1512#1:1885,4\n1534#1:1890,11\n1567#1:1902,11\n*E\n"})
    /* loaded from: classes.dex */
    public final class LookaheadPassDelegate extends Placeable implements Measurable, AlignmentLinesOwner {
        private boolean duringAlignmentLinesQuery;
        private boolean isPlaced;

        @Nullable
        private Function1<? super GraphicsLayerScope, Unit> lastLayerBlock;
        private float lastZIndex;
        private boolean layingOutChildren;

        @Nullable
        private Constraints lookaheadConstraints;
        private boolean measuredOnce;
        private boolean onNodePlacedCalled;
        private boolean placedOnce;
        private boolean relayoutWithoutParentInProgress;
        private int previousPlaceOrder = Integer.MAX_VALUE;
        private int placeOrder = Integer.MAX_VALUE;

        @NotNull
        private LayoutNode.UsageByParent measuredByParent = LayoutNode.UsageByParent.NotUsed;
        private long lastPosition = IntOffset.INSTANCE.m13804getZeronOccac();

        @NotNull
        private final AlignmentLines alignmentLines = new LookaheadAlignmentLines(this);

        @NotNull
        private final MutableVector<LookaheadPassDelegate> _childDelegates = new MutableVector<>(new LookaheadPassDelegate[16], 0);
        private boolean childDelegatesDirty = true;
        private boolean parentDataDirty = true;

        @Nullable
        private Object parentData = getMeasurePassDelegate$ui_release().getParentData();

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* loaded from: classes4.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[LayoutNode.LayoutState.values().length];
                try {
                    iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
                try {
                    iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public LookaheadPassDelegate() {
        }

        /* renamed from: getPlaceOrder$ui_release, reason: from getter */
        public final int getPlaceOrder() {
            return this.placeOrder;
        }

        public final void setPlaceOrder$ui_release(int i) {
            this.placeOrder = i;
        }

        @NotNull
        /* renamed from: getMeasuredByParent$ui_release, reason: from getter */
        public final LayoutNode.UsageByParent getMeasuredByParent() {
            return this.measuredByParent;
        }

        public final void setMeasuredByParent$ui_release(@NotNull LayoutNode.UsageByParent usageByParent) {
            this.measuredByParent = usageByParent;
        }

        @NotNull
        public final MeasurePassDelegate getMeasurePassDelegate$ui_release() {
            return LayoutNodeLayoutDelegate.this.getMeasurePassDelegate();
        }

        /* renamed from: getDuringAlignmentLinesQuery$ui_release, reason: from getter */
        public final boolean getDuringAlignmentLinesQuery() {
            return this.duringAlignmentLinesQuery;
        }

        public final void setDuringAlignmentLinesQuery$ui_release(boolean z) {
            this.duringAlignmentLinesQuery = z;
        }

        /* renamed from: getPlacedOnce$ui_release, reason: from getter */
        public final boolean getPlacedOnce() {
            return this.placedOnce;
        }

        public final void setPlacedOnce$ui_release(boolean z) {
            this.placedOnce = z;
        }

        @Nullable
        /* renamed from: getLastConstraints-DWUhwKw, reason: from getter */
        public final Constraints getLookaheadConstraints() {
            return this.lookaheadConstraints;
        }

        /* renamed from: getLastPosition-nOcc-ac$ui_release, reason: from getter */
        public final long getLastPosition() {
            return this.lastPosition;
        }

        /* renamed from: getLastZIndex$ui_release, reason: from getter */
        public final float getLastZIndex() {
            return this.lastZIndex;
        }

        @Nullable
        public final Function1<GraphicsLayerScope, Unit> getLastLayerBlock$ui_release() {
            return this.lastLayerBlock;
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        /* renamed from: isPlaced, reason: from getter */
        public boolean getIsPlaced() {
            return this.isPlaced;
        }

        public void setPlaced(boolean z) {
            this.isPlaced = z;
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        @NotNull
        public NodeCoordinator getInnerCoordinator() {
            return LayoutNodeLayoutDelegate.this.layoutNode.getInnerCoordinator$ui_release();
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        @NotNull
        public AlignmentLines getAlignmentLines() {
            return this.alignmentLines;
        }

        /* renamed from: getChildDelegatesDirty$ui_release, reason: from getter */
        public final boolean getChildDelegatesDirty() {
            return this.childDelegatesDirty;
        }

        public final void setChildDelegatesDirty$ui_release(boolean z) {
            this.childDelegatesDirty = z;
        }

        @NotNull
        public final List<LookaheadPassDelegate> getChildDelegates$ui_release() {
            LayoutNodeLayoutDelegate.this.layoutNode.getChildren$ui_release();
            if (!this.childDelegatesDirty) {
                return this._childDelegates.asMutableList();
            }
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            MutableVector<LookaheadPassDelegate> mutableVector = this._childDelegates;
            MutableVector<LayoutNode> mutableVector2 = layoutNode.get_children$ui_release();
            int size = mutableVector2.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector2.getContent();
                int i = 0;
                do {
                    LayoutNode layoutNode2 = content[i];
                    if (mutableVector.getSize() <= i) {
                        LookaheadPassDelegate lookaheadPassDelegate = layoutNode2.getLayoutDelegate().getLookaheadPassDelegate();
                        Intrinsics.checkNotNull(lookaheadPassDelegate);
                        mutableVector.add(lookaheadPassDelegate);
                    } else {
                        LookaheadPassDelegate lookaheadPassDelegate2 = layoutNode2.getLayoutDelegate().getLookaheadPassDelegate();
                        Intrinsics.checkNotNull(lookaheadPassDelegate2);
                        mutableVector.set(i, lookaheadPassDelegate2);
                    }
                    i++;
                } while (i < size);
            }
            mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
            this.childDelegatesDirty = false;
            return this._childDelegates.asMutableList();
        }

        public final boolean getLayingOutChildren() {
            return this.layingOutChildren;
        }

        private final void forEachChildDelegate(Function1<? super LookaheadPassDelegate, Unit> block) {
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    LookaheadPassDelegate lookaheadPassDelegate = content[i].getLayoutDelegate().getLookaheadPassDelegate();
                    Intrinsics.checkNotNull(lookaheadPassDelegate);
                    block.invoke(lookaheadPassDelegate);
                    i++;
                } while (i < size);
            }
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        public void layoutChildren() {
            this.layingOutChildren = true;
            getAlignmentLines().recalculateQueryOwner();
            if (LayoutNodeLayoutDelegate.this.getLookaheadLayoutPending()) {
                onBeforeLayoutChildren();
            }
            final LookaheadDelegate lookaheadDelegate = getInnerCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            if (LayoutNodeLayoutDelegate.this.lookaheadLayoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !lookaheadDelegate.getIsPlacingForAlignment() && LayoutNodeLayoutDelegate.this.getLookaheadLayoutPending())) {
                LayoutNodeLayoutDelegate.this.lookaheadLayoutPending = false;
                LayoutNode.LayoutState layoutState = LayoutNodeLayoutDelegate.this.getLayoutState();
                LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LookaheadLayingOut;
                Owner ownerRequireOwner = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode);
                LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringPlacement(false);
                OwnerSnapshotObserver snapshotObserver = ownerRequireOwner.getSnapshotObserver();
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                final LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
                OwnerSnapshotObserver.observeLayoutSnapshotReads$ui_release$default(snapshotObserver, layoutNode, false, new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        this.this$0.clearPlaceOrder();
                        this.this$0.forEachChildAlignmentLinesOwner(new Function1<AlignmentLinesOwner, Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1.1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(AlignmentLinesOwner alignmentLinesOwner) {
                                invoke2(alignmentLinesOwner);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull AlignmentLinesOwner alignmentLinesOwner) {
                                alignmentLinesOwner.getAlignmentLines().setUsedDuringParentLayout$ui_release(false);
                            }
                        });
                        LookaheadDelegate lookaheadDelegate2 = this.this$0.getInnerCoordinator().getLookaheadDelegate();
                        if (lookaheadDelegate2 != null) {
                            boolean isPlacingForAlignment = lookaheadDelegate2.getIsPlacingForAlignment();
                            List<LayoutNode> children$ui_release = layoutNodeLayoutDelegate.layoutNode.getChildren$ui_release();
                            int size = children$ui_release.size();
                            for (int i = 0; i < size; i++) {
                                LookaheadDelegate lookaheadDelegate3 = children$ui_release.get(i).getOuterCoordinator$ui_release().getLookaheadDelegate();
                                if (lookaheadDelegate3 != null) {
                                    lookaheadDelegate3.setPlacingForAlignment$ui_release(isPlacingForAlignment);
                                }
                            }
                        }
                        lookaheadDelegate.getMeasureResult$ui_release().placeChildren();
                        LookaheadDelegate lookaheadDelegate4 = this.this$0.getInnerCoordinator().getLookaheadDelegate();
                        if (lookaheadDelegate4 != null) {
                            lookaheadDelegate4.getIsPlacingForAlignment();
                            List<LayoutNode> children$ui_release2 = layoutNodeLayoutDelegate.layoutNode.getChildren$ui_release();
                            int size2 = children$ui_release2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                LookaheadDelegate lookaheadDelegate5 = children$ui_release2.get(i2).getOuterCoordinator$ui_release().getLookaheadDelegate();
                                if (lookaheadDelegate5 != null) {
                                    lookaheadDelegate5.setPlacingForAlignment$ui_release(false);
                                }
                            }
                        }
                        this.this$0.checkChildrenPlaceOrderForUpdates();
                        this.this$0.forEachChildAlignmentLinesOwner(new Function1<AlignmentLinesOwner, Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1.4
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(AlignmentLinesOwner alignmentLinesOwner) {
                                invoke2(alignmentLinesOwner);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull AlignmentLinesOwner alignmentLinesOwner) {
                                alignmentLinesOwner.getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(alignmentLinesOwner.getAlignmentLines().getUsedDuringParentLayout());
                            }
                        });
                    }
                }, 2, null);
                LayoutNodeLayoutDelegate.this.layoutState = layoutState;
                if (LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement() && lookaheadDelegate.getIsPlacingForAlignment()) {
                    requestLayout();
                }
                LayoutNodeLayoutDelegate.this.lookaheadLayoutPendingForAlignment = false;
            }
            if (getAlignmentLines().getUsedDuringParentLayout()) {
                getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(true);
            }
            if (getAlignmentLines().getDirty() && getAlignmentLines().getRequired$ui_release()) {
                getAlignmentLines().recalculate();
            }
            this.layingOutChildren = false;
        }

        private final void markSubtreeAsNotPlaced() {
            if (getIsPlaced()) {
                int i = 0;
                setPlaced(false);
                MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
                int size = mutableVector.getSize();
                if (size > 0) {
                    LayoutNode[] content = mutableVector.getContent();
                    do {
                        LookaheadPassDelegate lookaheadPassDelegate = content[i].getLayoutDelegate().getLookaheadPassDelegate();
                        Intrinsics.checkNotNull(lookaheadPassDelegate);
                        lookaheadPassDelegate.markSubtreeAsNotPlaced();
                        i++;
                    } while (i < size);
                }
            }
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        @NotNull
        public Map<AlignmentLine, Integer> calculateAlignmentLines() {
            if (!this.duringAlignmentLinesQuery) {
                if (LayoutNodeLayoutDelegate.this.getLayoutState() == LayoutNode.LayoutState.LookaheadMeasuring) {
                    getAlignmentLines().setUsedByModifierMeasurement$ui_release(true);
                    if (getAlignmentLines().getDirty()) {
                        LayoutNodeLayoutDelegate.this.markLookaheadLayoutPending$ui_release();
                    }
                } else {
                    getAlignmentLines().setUsedByModifierLayout$ui_release(true);
                }
            }
            LookaheadDelegate lookaheadDelegate = getInnerCoordinator().getLookaheadDelegate();
            if (lookaheadDelegate != null) {
                lookaheadDelegate.setPlacingForAlignment$ui_release(true);
            }
            layoutChildren();
            LookaheadDelegate lookaheadDelegate2 = getInnerCoordinator().getLookaheadDelegate();
            if (lookaheadDelegate2 != null) {
                lookaheadDelegate2.setPlacingForAlignment$ui_release(false);
            }
            return getAlignmentLines().getLastCalculation();
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        @Nullable
        public AlignmentLinesOwner getParentAlignmentLinesOwner() {
            LayoutNodeLayoutDelegate layoutDelegate;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release == null || (layoutDelegate = parent$ui_release.getLayoutDelegate()) == null) {
                return null;
            }
            return layoutDelegate.getLookaheadAlignmentLinesOwner$ui_release();
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        public void forEachChildAlignmentLinesOwner(@NotNull Function1<? super AlignmentLinesOwner, Unit> block) {
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = content[i].getLayoutDelegate().getLookaheadAlignmentLinesOwner$ui_release();
                    Intrinsics.checkNotNull(lookaheadAlignmentLinesOwner$ui_release);
                    block.invoke(lookaheadAlignmentLinesOwner$ui_release);
                    i++;
                } while (i < size);
            }
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        public void requestLayout() {
            LayoutNode.requestLookaheadRelayout$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, 1, null);
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        public void requestMeasure() {
            LayoutNode.requestLookaheadRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, false, 3, null);
        }

        public final void notifyChildrenUsingCoordinatesWhilePlacing() {
            MutableVector<LayoutNode> mutableVector;
            int size;
            if (LayoutNodeLayoutDelegate.this.getChildrenAccessingCoordinatesDuringPlacement() <= 0 || (size = (mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release()).getSize()) <= 0) {
                return;
            }
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = content[i];
                LayoutNodeLayoutDelegate layoutDelegate = layoutNode.getLayoutDelegate();
                if ((layoutDelegate.getCoordinatesAccessedDuringPlacement() || layoutDelegate.getCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate.getLayoutPending()) {
                    LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode, false, 1, null);
                }
                LookaheadPassDelegate lookaheadPassDelegate = layoutDelegate.getLookaheadPassDelegate();
                if (lookaheadPassDelegate != null) {
                    lookaheadPassDelegate.notifyChildrenUsingCoordinatesWhilePlacing();
                }
                i++;
            } while (i < size);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x002b  */
        @Override // androidx.compose.p003ui.layout.Measurable
        @NotNull
        /* renamed from: measure-BRTryo0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Placeable mo12610measureBRTryo0(long constraints) {
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if ((parent$ui_release != null ? parent$ui_release.getLayoutState$ui_release() : null) == LayoutNode.LayoutState.LookaheadMeasuring) {
                LayoutNodeLayoutDelegate.this.detachedFromParentLookaheadPass = false;
            } else {
                LayoutNode parent$ui_release2 = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
                if ((parent$ui_release2 != null ? parent$ui_release2.getLayoutState$ui_release() : null) == LayoutNode.LayoutState.LookaheadLayingOut) {
                }
            }
            trackLookaheadMeasurementByParent(LayoutNodeLayoutDelegate.this.layoutNode);
            if (LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent() == LayoutNode.UsageByParent.NotUsed) {
                LayoutNodeLayoutDelegate.this.layoutNode.clearSubtreeIntrinsicsUsage$ui_release();
            }
            m12759remeasureBRTryo0(constraints);
            return this;
        }

        private final void trackLookaheadMeasurementByParent(LayoutNode node) {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode parent$ui_release = node.getParent$ui_release();
            if (parent$ui_release != null) {
                if (this.measuredByParent != LayoutNode.UsageByParent.NotUsed && !node.getCanMultiMeasure()) {
                    throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()".toString());
                }
                int i = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
                if (i == 1 || i == 2) {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                } else if (i == 3 || i == 4) {
                    usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                } else {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + parent$ui_release.getLayoutState$ui_release());
                }
                this.measuredByParent = usageByParent;
                return;
            }
            this.measuredByParent = LayoutNode.UsageByParent.NotUsed;
        }

        @Override // androidx.compose.p003ui.layout.Measured, androidx.compose.p003ui.layout.IntrinsicMeasurable
        @Nullable
        public Object getParentData() {
            return this.parentData;
        }

        /* renamed from: remeasure-BRTryo0 */
        public final boolean m12759remeasureBRTryo0(long constraints) {
            long jIntSize;
            if (!LayoutNodeLayoutDelegate.this.layoutNode.getIsDeactivated()) {
                LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
                LayoutNodeLayoutDelegate.this.layoutNode.setCanMultiMeasure$ui_release(LayoutNodeLayoutDelegate.this.layoutNode.getCanMultiMeasure() || (parent$ui_release != null && parent$ui_release.getCanMultiMeasure()));
                if (!LayoutNodeLayoutDelegate.this.layoutNode.getLookaheadMeasurePending$ui_release()) {
                    Constraints constraints2 = this.lookaheadConstraints;
                    if (constraints2 == null ? false : Constraints.m13615equalsimpl0(constraints2.getValue(), constraints)) {
                        Owner owner = LayoutNodeLayoutDelegate.this.layoutNode.getOwner();
                        if (owner != null) {
                            owner.forceMeasureTheSubtree(LayoutNodeLayoutDelegate.this.layoutNode, true);
                        }
                        LayoutNodeLayoutDelegate.this.layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
                        return false;
                    }
                }
                this.lookaheadConstraints = Constraints.m13610boximpl(constraints);
                m12660setMeasurementConstraintsBRTryo0(constraints);
                getAlignmentLines().setUsedByModifierMeasurement$ui_release(false);
                forEachChildAlignmentLinesOwner(new Function1<AlignmentLinesOwner, Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$remeasure$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AlignmentLinesOwner alignmentLinesOwner) {
                        invoke2(alignmentLinesOwner);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull AlignmentLinesOwner alignmentLinesOwner) {
                        alignmentLinesOwner.getAlignmentLines().setUsedDuringParentMeasurement$ui_release(false);
                    }
                });
                if (this.measuredOnce) {
                    jIntSize = getMeasuredSize();
                } else {
                    jIntSize = IntSizeKt.IntSize(Integer.MIN_VALUE, Integer.MIN_VALUE);
                }
                this.measuredOnce = true;
                LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
                if (lookaheadDelegate != null) {
                    LayoutNodeLayoutDelegate.this.m12753performLookaheadMeasureBRTryo0(constraints);
                    m12659setMeasuredSizeozmzZPI(IntSizeKt.IntSize(lookaheadDelegate.getWidth(), lookaheadDelegate.getHeight()));
                    return (IntSize.m13836getWidthimpl(jIntSize) == lookaheadDelegate.getWidth() && IntSize.m13835getHeightimpl(jIntSize) == lookaheadDelegate.getHeight()) ? false : true;
                }
                throw new IllegalStateException("Lookahead result from lookaheadRemeasure cannot be null".toString());
            }
            throw new IllegalArgumentException("measure is called on a deactivated node".toString());
        }

        @Override // androidx.compose.p003ui.layout.Placeable
        /* renamed from: placeAt-f8xVGno */
        public void mo12611placeAtf8xVGno(final long position, float zIndex, @Nullable Function1<? super GraphicsLayerScope, Unit> layerBlock) {
            if (!(!LayoutNodeLayoutDelegate.this.layoutNode.getIsDeactivated())) {
                throw new IllegalArgumentException("place is called on a deactivated node".toString());
            }
            LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LookaheadLayingOut;
            this.placedOnce = true;
            this.onNodePlacedCalled = false;
            if (!IntOffset.m13793equalsimpl0(position, this.lastPosition)) {
                if (LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringModifierPlacement() || LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement()) {
                    LayoutNodeLayoutDelegate.this.lookaheadLayoutPending = true;
                }
                notifyChildrenUsingCoordinatesWhilePlacing();
            }
            final Owner ownerRequireOwner = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode);
            if (!LayoutNodeLayoutDelegate.this.getLookaheadLayoutPending() && getIsPlaced()) {
                LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
                Intrinsics.checkNotNull(lookaheadDelegate);
                lookaheadDelegate.m12767placeSelfApparentToRealOffsetgyyYBs$ui_release(position);
                onNodePlaced$ui_release();
            } else {
                LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringModifierPlacement(false);
                getAlignmentLines().setUsedByModifierLayout$ui_release(false);
                OwnerSnapshotObserver snapshotObserver = ownerRequireOwner.getSnapshotObserver();
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                final LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
                OwnerSnapshotObserver.observeLayoutModifierSnapshotReads$ui_release$default(snapshotObserver, layoutNode, false, new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeAt$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        LookaheadDelegate lookaheadDelegate2;
                        Placeable.PlacementScope placementScope = null;
                        if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNodeLayoutDelegate.layoutNode)) {
                            NodeCoordinator wrappedBy = layoutNodeLayoutDelegate.getOuterCoordinator().getWrappedBy();
                            if (wrappedBy != null) {
                                placementScope = wrappedBy.getPlacementScope();
                            }
                        } else {
                            NodeCoordinator wrappedBy2 = layoutNodeLayoutDelegate.getOuterCoordinator().getWrappedBy();
                            if (wrappedBy2 != null && (lookaheadDelegate2 = wrappedBy2.getLookaheadDelegate()) != null) {
                                placementScope = lookaheadDelegate2.getPlacementScope();
                            }
                        }
                        if (placementScope == null) {
                            placementScope = ownerRequireOwner.getPlacementScope();
                        }
                        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNodeLayoutDelegate;
                        long j = position;
                        LookaheadDelegate lookaheadDelegate3 = layoutNodeLayoutDelegate2.getOuterCoordinator().getLookaheadDelegate();
                        Intrinsics.checkNotNull(lookaheadDelegate3);
                        Placeable.PlacementScope.m12661place70tqf50$default(placementScope, lookaheadDelegate3, j, 0.0f, 2, null);
                    }
                }, 2, null);
            }
            this.lastPosition = position;
            this.lastZIndex = zIndex;
            this.lastLayerBlock = layerBlock;
            LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.Idle;
        }

        @Override // androidx.compose.p003ui.layout.Placeable, androidx.compose.p003ui.layout.Measured
        public int getMeasuredWidth() {
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.getMeasuredWidth();
        }

        @Override // androidx.compose.p003ui.layout.Placeable, androidx.compose.p003ui.layout.Measured
        public int getMeasuredHeight() {
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.getMeasuredHeight();
        }

        @Override // androidx.compose.p003ui.layout.Measured
        public int get(@NotNull AlignmentLine alignmentLine) {
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if ((parent$ui_release != null ? parent$ui_release.getLayoutState$ui_release() : null) != LayoutNode.LayoutState.LookaheadMeasuring) {
                LayoutNode parent$ui_release2 = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
                if ((parent$ui_release2 != null ? parent$ui_release2.getLayoutState$ui_release() : null) == LayoutNode.LayoutState.LookaheadLayingOut) {
                    getAlignmentLines().setUsedDuringParentLayout$ui_release(true);
                }
            } else {
                getAlignmentLines().setUsedDuringParentMeasurement$ui_release(true);
            }
            this.duringAlignmentLinesQuery = true;
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            int i = lookaheadDelegate.get(alignmentLine);
            this.duringAlignmentLinesQuery = false;
            return i;
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int height) {
            onIntrinsicsQueried();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.minIntrinsicWidth(height);
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int height) {
            onIntrinsicsQueried();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.maxIntrinsicWidth(height);
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int width) {
            onIntrinsicsQueried();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.minIntrinsicHeight(width);
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int width) {
            onIntrinsicsQueried();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.maxIntrinsicHeight(width);
        }

        private final void onIntrinsicsQueried() {
            LayoutNode.UsageByParent intrinsicsUsageByParent;
            LayoutNode.requestLookaheadRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, false, 3, null);
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release == null || LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent() != LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            int i = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
            if (i == 2) {
                intrinsicsUsageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            } else if (i == 3) {
                intrinsicsUsageByParent = LayoutNode.UsageByParent.InLayoutBlock;
            } else {
                intrinsicsUsageByParent = parent$ui_release.getIntrinsicsUsageByParent();
            }
            layoutNode.setIntrinsicsUsageByParent$ui_release(intrinsicsUsageByParent);
        }

        public final void invalidateIntrinsicsParent(boolean forceRequest) {
            LayoutNode parent$ui_release;
            LayoutNode parent$ui_release2 = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            LayoutNode.UsageByParent intrinsicsUsageByParent = LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent();
            if (parent$ui_release2 == null || intrinsicsUsageByParent == LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            while (parent$ui_release2.getIntrinsicsUsageByParent() == intrinsicsUsageByParent && (parent$ui_release = parent$ui_release2.getParent$ui_release()) != null) {
                parent$ui_release2 = parent$ui_release;
            }
            int i = WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent.ordinal()];
            if (i == 1) {
                if (parent$ui_release2.getLookaheadRoot() != null) {
                    LayoutNode.requestLookaheadRemeasure$ui_release$default(parent$ui_release2, forceRequest, false, 2, null);
                    return;
                } else {
                    LayoutNode.requestRemeasure$ui_release$default(parent$ui_release2, forceRequest, false, 2, null);
                    return;
                }
            }
            if (i == 2) {
                if (parent$ui_release2.getLookaheadRoot() != null) {
                    parent$ui_release2.requestLookaheadRelayout$ui_release(forceRequest);
                    return;
                } else {
                    parent$ui_release2.requestRelayout$ui_release(forceRequest);
                    return;
                }
            }
            throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
        }

        public final void invalidateParentData() {
            this.parentDataDirty = true;
        }

        public final boolean updateParentData() {
            if (getParentData() == null) {
                LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
                Intrinsics.checkNotNull(lookaheadDelegate);
                if (lookaheadDelegate.getParentData() == null) {
                    return false;
                }
            }
            if (!this.parentDataDirty) {
                return false;
            }
            this.parentDataDirty = false;
            LookaheadDelegate lookaheadDelegate2 = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate2);
            this.parentData = lookaheadDelegate2.getParentData();
            return true;
        }

        public final void onNodePlaced$ui_release() {
            this.onNodePlacedCalled = true;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (!getIsPlaced()) {
                markNodeAndSubtreeAsPlaced();
                if (this.relayoutWithoutParentInProgress && parent$ui_release != null) {
                    LayoutNode.requestLookaheadRelayout$ui_release$default(parent$ui_release, false, 1, null);
                }
            }
            if (parent$ui_release != null) {
                if (!this.relayoutWithoutParentInProgress && (parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut || parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadLayingOut)) {
                    if (this.placeOrder == Integer.MAX_VALUE) {
                        this.placeOrder = parent$ui_release.getLayoutDelegate().nextChildLookaheadPlaceOrder;
                        parent$ui_release.getLayoutDelegate().nextChildLookaheadPlaceOrder++;
                    } else {
                        throw new IllegalStateException("Place was called on a node which was placed already".toString());
                    }
                }
            } else {
                this.placeOrder = 0;
            }
            layoutChildren();
        }

        public final void clearPlaceOrder() {
            int i = 0;
            LayoutNodeLayoutDelegate.this.nextChildLookaheadPlaceOrder = 0;
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                do {
                    LookaheadPassDelegate lookaheadPassDelegate = content[i].getLayoutDelegate().getLookaheadPassDelegate();
                    Intrinsics.checkNotNull(lookaheadPassDelegate);
                    lookaheadPassDelegate.previousPlaceOrder = lookaheadPassDelegate.placeOrder;
                    lookaheadPassDelegate.placeOrder = Integer.MAX_VALUE;
                    if (lookaheadPassDelegate.measuredByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                        lookaheadPassDelegate.measuredByParent = LayoutNode.UsageByParent.NotUsed;
                    }
                    i++;
                } while (i < size);
            }
        }

        private final void markNodeAndSubtreeAsPlaced() {
            boolean isPlaced = getIsPlaced();
            setPlaced(true);
            int i = 0;
            if (!isPlaced && LayoutNodeLayoutDelegate.this.getLookaheadMeasurePending()) {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, true, false, 2, null);
            }
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                do {
                    LayoutNode layoutNode = content[i];
                    if (layoutNode.getPlaceOrder$ui_release() != Integer.MAX_VALUE) {
                        LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode.getLookaheadPassDelegate$ui_release();
                        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                        lookaheadPassDelegate$ui_release.markNodeAndSubtreeAsPlaced();
                        layoutNode.rescheduleRemeasureOrRelayout$ui_release(layoutNode);
                    }
                    i++;
                } while (i < size);
            }
        }

        private final void onBeforeLayoutChildren() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    LayoutNode layoutNode2 = content[i];
                    if (layoutNode2.getLookaheadMeasurePending$ui_release() && layoutNode2.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                        LookaheadPassDelegate lookaheadPassDelegate = layoutNode2.getLayoutDelegate().getLookaheadPassDelegate();
                        Intrinsics.checkNotNull(lookaheadPassDelegate);
                        Constraints constraintsM12756getLastLookaheadConstraintsDWUhwKw = layoutNode2.getLayoutDelegate().m12756getLastLookaheadConstraintsDWUhwKw();
                        Intrinsics.checkNotNull(constraintsM12756getLastLookaheadConstraintsDWUhwKw);
                        if (lookaheadPassDelegate.m12759remeasureBRTryo0(constraintsM12756getLastLookaheadConstraintsDWUhwKw.getValue())) {
                            LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNodeLayoutDelegate.layoutNode, false, false, 3, null);
                        }
                    }
                    i++;
                } while (i < size);
            }
        }

        public final void replace() {
            LayoutNode parent$ui_release;
            try {
                this.relayoutWithoutParentInProgress = true;
                if (!this.placedOnce) {
                    throw new IllegalStateException("replace() called on item that was not placed".toString());
                }
                this.onNodePlacedCalled = false;
                boolean isPlaced = getIsPlaced();
                mo12611placeAtf8xVGno(this.lastPosition, 0.0f, null);
                if (isPlaced && !this.onNodePlacedCalled && (parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release()) != null) {
                    LayoutNode.requestLookaheadRelayout$ui_release$default(parent$ui_release, false, 1, null);
                }
            } finally {
                this.relayoutWithoutParentInProgress = false;
            }
        }

        public final void onNodeDetached() {
            this.placeOrder = Integer.MAX_VALUE;
            this.previousPlaceOrder = Integer.MAX_VALUE;
            setPlaced(false);
        }

        public final void checkChildrenPlaceOrderForUpdates() {
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    LookaheadPassDelegate lookaheadPassDelegate = content[i].getLayoutDelegate().getLookaheadPassDelegate();
                    Intrinsics.checkNotNull(lookaheadPassDelegate);
                    int i2 = lookaheadPassDelegate.previousPlaceOrder;
                    int i3 = lookaheadPassDelegate.placeOrder;
                    if (i2 != i3 && i3 == Integer.MAX_VALUE) {
                        lookaheadPassDelegate.markSubtreeAsNotPlaced();
                    }
                    i++;
                } while (i < size);
            }
        }
    }

    /* renamed from: performMeasure-BRTryo0 */
    public final void m12754performMeasureBRTryo0(long constraints) {
        LayoutNode.LayoutState layoutState = this.layoutState;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.Idle;
        if (layoutState != layoutState2) {
            throw new IllegalStateException("layout state is not idle before measure starts".toString());
        }
        LayoutNode.LayoutState layoutState3 = LayoutNode.LayoutState.Measuring;
        this.layoutState = layoutState3;
        this.measurePending = false;
        this.performMeasureConstraints = constraints;
        LayoutNodeKt.requireOwner(this.layoutNode).getSnapshotObserver().observeMeasureSnapshotReads$ui_release(this.layoutNode, false, this.performMeasureBlock);
        if (this.layoutState == layoutState3) {
            markLayoutPending$ui_release();
            this.layoutState = layoutState2;
        }
    }

    /* renamed from: performLookaheadMeasure-BRTryo0 */
    public final void m12753performLookaheadMeasureBRTryo0(final long constraints) {
        this.layoutState = LayoutNode.LayoutState.LookaheadMeasuring;
        this.lookaheadMeasurePending = false;
        OwnerSnapshotObserver.observeMeasureSnapshotReads$ui_release$default(LayoutNodeKt.requireOwner(this.layoutNode).getSnapshotObserver(), this.layoutNode, false, new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$performLookaheadMeasure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                LookaheadDelegate lookaheadDelegate = this.this$0.getOuterCoordinator().getLookaheadDelegate();
                Intrinsics.checkNotNull(lookaheadDelegate);
                lookaheadDelegate.mo12610measureBRTryo0(constraints);
            }
        }, 2, null);
        markLookaheadLayoutPending$ui_release();
        if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(this.layoutNode)) {
            markLayoutPending$ui_release();
        } else {
            markMeasurePending$ui_release();
        }
        this.layoutState = LayoutNode.LayoutState.Idle;
    }

    public final void ensureLookaheadDelegateCreated$ui_release() {
        if (this.lookaheadPassDelegate == null) {
            this.lookaheadPassDelegate = new LookaheadPassDelegate();
        }
    }

    public final void updateParentData() {
        LayoutNode parent$ui_release;
        if (this.measurePassDelegate.updateParentData() && (parent$ui_release = this.layoutNode.getParent$ui_release()) != null) {
            LayoutNode.requestRemeasure$ui_release$default(parent$ui_release, false, false, 3, null);
        }
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate == null || !lookaheadPassDelegate.updateParentData()) {
            return;
        }
        if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(this.layoutNode)) {
            LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
            if (parent$ui_release2 != null) {
                LayoutNode.requestRemeasure$ui_release$default(parent$ui_release2, false, false, 3, null);
                return;
            }
            return;
        }
        LayoutNode parent$ui_release3 = this.layoutNode.getParent$ui_release();
        if (parent$ui_release3 != null) {
            LayoutNode.requestLookaheadRemeasure$ui_release$default(parent$ui_release3, false, false, 3, null);
        }
    }

    public final void invalidateParentData() {
        this.measurePassDelegate.invalidateParentData();
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.invalidateParentData();
        }
    }

    public final void resetAlignmentLines() {
        AlignmentLines alignmentLines;
        this.measurePassDelegate.getAlignmentLines().reset$ui_release();
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate == null || (alignmentLines = lookaheadPassDelegate.getAlignmentLines()) == null) {
            return;
        }
        alignmentLines.reset$ui_release();
    }

    public final void markChildrenDirty() {
        this.measurePassDelegate.setChildDelegatesDirty$ui_release(true);
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.setChildDelegatesDirty$ui_release(true);
        }
    }
}
