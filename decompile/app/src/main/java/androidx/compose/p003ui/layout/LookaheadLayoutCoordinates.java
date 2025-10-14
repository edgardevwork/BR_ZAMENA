package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.node.LookaheadDelegate;
import androidx.compose.p003ui.node.NodeCoordinator;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jfrog.build.extractor.clientConfiguration.ClientConfigurationFields;

/* compiled from: LookaheadLayoutCoordinates.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0019H\u0096\u0002J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\nH\u0016J\"\u0010&\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001a\u0010*\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u001a\u0010.\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b/\u0010-J\"\u00100\u001a\u0002012\u0006\u0010$\u001a\u00020\u00012\u0006\u00102\u001a\u000203H\u0016ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u001a\u00106\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b8\u0010-R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, m7105d2 = {"Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "lookaheadDelegate", "Landroidx/compose/ui/node/LookaheadDelegate;", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "coordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "getCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "isAttached", "", "()Z", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "lookaheadOffset", "Landroidx/compose/ui/geometry/Offset;", "getLookaheadOffset-F1C5BW0", "()J", "parentCoordinates", "getParentCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "getParentLayoutCoordinates", "providedAlignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getProvidedAlignmentLines", "()Ljava/util/Set;", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "get", "", "alignmentLine", "localBoundingBoxOf", "Landroidx/compose/ui/geometry/Rect;", "sourceCoordinates", "clipBounds", "localPositionOf", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localToRoot", "relativeToLocal", "localToRoot-MK-Hz9U", "(J)J", "localToWindow", "localToWindow-MK-Hz9U", "transformFrom", "", ClientConfigurationFields.MATRIX, "Landroidx/compose/ui/graphics/Matrix;", "transformFrom-EL8BTi8", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "windowToLocal", "relativeToWindow", "windowToLocal-MK-Hz9U", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLookaheadLayoutCoordinates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinates\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,134:1\n1#2:135\n179#3:136\n157#3:139\n179#3:141\n157#3:144\n86#4:137\n79#4:138\n86#4:140\n86#4:142\n79#4:143\n*S KotlinDebug\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinates\n*L\n83#1:136\n84#1:139\n89#1:141\n95#1:144\n83#1:137\n83#1:138\n88#1:140\n91#1:142\n88#1:143\n*E\n"})
/* loaded from: classes.dex */
public final class LookaheadLayoutCoordinates implements LayoutCoordinates {
    public static final int $stable = 0;

    @NotNull
    private final LookaheadDelegate lookaheadDelegate;

    public LookaheadLayoutCoordinates(@NotNull LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    @NotNull
    public final LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @NotNull
    public final NodeCoordinator getCoordinator() {
        return this.lookaheadDelegate.getCoordinator();
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public long mo12617getSizeYbymL2g() {
        LookaheadDelegate lookaheadDelegate = this.lookaheadDelegate;
        return IntSizeKt.IntSize(lookaheadDelegate.getWidth(), lookaheadDelegate.getHeight());
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    @NotNull
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        return getCoordinator().getProvidedAlignmentLines();
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    @Nullable
    public LayoutCoordinates getParentLayoutCoordinates() {
        LookaheadDelegate lookaheadDelegate;
        if (!isAttached()) {
            throw new IllegalStateException(NodeCoordinator.ExpectAttachedLayoutCoordinates.toString());
        }
        NodeCoordinator wrappedBy = getCoordinator().getLayoutNode().getOuterCoordinator$ui_release().getWrappedBy();
        if (wrappedBy == null || (lookaheadDelegate = wrappedBy.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.getCoordinates();
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    @Nullable
    public LayoutCoordinates getParentCoordinates() {
        LookaheadDelegate lookaheadDelegate;
        if (!isAttached()) {
            throw new IllegalStateException(NodeCoordinator.ExpectAttachedLayoutCoordinates.toString());
        }
        NodeCoordinator wrappedBy = getCoordinator().getWrappedBy();
        if (wrappedBy == null || (lookaheadDelegate = wrappedBy.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.getCoordinates();
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getCoordinator().isAttached();
    }

    /* renamed from: getLookaheadOffset-F1C5BW0 */
    private final long m12627getLookaheadOffsetF1C5BW0() {
        LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
        LayoutCoordinates coordinates = rootLookaheadDelegate.getCoordinates();
        Offset.Companion companion = Offset.INSTANCE;
        return Offset.m11103minusMKHz9U(mo12618localPositionOfR5De75A(coordinates, companion.m11115getZeroF1C5BW0()), getCoordinator().mo12618localPositionOfR5De75A(rootLookaheadDelegate.getCoordinator(), companion.m11115getZeroF1C5BW0()));
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public long mo12622windowToLocalMKHz9U(long relativeToWindow) {
        return Offset.m11104plusMKHz9U(getCoordinator().mo12622windowToLocalMKHz9U(relativeToWindow), m12627getLookaheadOffsetF1C5BW0());
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public long mo12620localToWindowMKHz9U(long relativeToLocal) {
        return getCoordinator().mo12620localToWindowMKHz9U(Offset.m11104plusMKHz9U(relativeToLocal, m12627getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public long mo12619localToRootMKHz9U(long relativeToLocal) {
        return getCoordinator().mo12619localToRootMKHz9U(Offset.m11104plusMKHz9U(relativeToLocal, m12627getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public long mo12618localPositionOfR5De75A(@NotNull LayoutCoordinates sourceCoordinates, long relativeToSource) {
        if (sourceCoordinates instanceof LookaheadLayoutCoordinates) {
            LookaheadDelegate lookaheadDelegate = ((LookaheadLayoutCoordinates) sourceCoordinates).lookaheadDelegate;
            lookaheadDelegate.getCoordinator().onCoordinatesUsed$ui_release();
            LookaheadDelegate lookaheadDelegate2 = getCoordinator().findCommonAncestor$ui_release(lookaheadDelegate.getCoordinator()).getLookaheadDelegate();
            if (lookaheadDelegate2 != null) {
                long jM12768positionInBjo55l4$ui_release = lookaheadDelegate.m12768positionInBjo55l4$ui_release(lookaheadDelegate2);
                long jIntOffset = IntOffsetKt.IntOffset(MathKt__MathJVMKt.roundToInt(Offset.m11099getXimpl(relativeToSource)), MathKt__MathJVMKt.roundToInt(Offset.m11100getYimpl(relativeToSource)));
                long jIntOffset2 = IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(jM12768positionInBjo55l4$ui_release) + IntOffset.m13794getXimpl(jIntOffset), IntOffset.m13795getYimpl(jM12768positionInBjo55l4$ui_release) + IntOffset.m13795getYimpl(jIntOffset));
                long jM12768positionInBjo55l4$ui_release2 = this.lookaheadDelegate.m12768positionInBjo55l4$ui_release(lookaheadDelegate2);
                long jIntOffset3 = IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(jIntOffset2) - IntOffset.m13794getXimpl(jM12768positionInBjo55l4$ui_release2), IntOffset.m13795getYimpl(jIntOffset2) - IntOffset.m13795getYimpl(jM12768positionInBjo55l4$ui_release2));
                return OffsetKt.Offset(IntOffset.m13794getXimpl(jIntOffset3), IntOffset.m13795getYimpl(jIntOffset3));
            }
            LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate);
            long jM12768positionInBjo55l4$ui_release3 = lookaheadDelegate.m12768positionInBjo55l4$ui_release(rootLookaheadDelegate);
            long position = rootLookaheadDelegate.getPosition();
            long jIntOffset4 = IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(jM12768positionInBjo55l4$ui_release3) + IntOffset.m13794getXimpl(position), IntOffset.m13795getYimpl(jM12768positionInBjo55l4$ui_release3) + IntOffset.m13795getYimpl(position));
            long jIntOffset5 = IntOffsetKt.IntOffset(MathKt__MathJVMKt.roundToInt(Offset.m11099getXimpl(relativeToSource)), MathKt__MathJVMKt.roundToInt(Offset.m11100getYimpl(relativeToSource)));
            long jIntOffset6 = IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(jIntOffset4) + IntOffset.m13794getXimpl(jIntOffset5), IntOffset.m13795getYimpl(jIntOffset4) + IntOffset.m13795getYimpl(jIntOffset5));
            LookaheadDelegate lookaheadDelegate3 = this.lookaheadDelegate;
            long jM12768positionInBjo55l4$ui_release4 = lookaheadDelegate3.m12768positionInBjo55l4$ui_release(LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate3));
            long position2 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate3).getPosition();
            long jIntOffset7 = IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(jM12768positionInBjo55l4$ui_release4) + IntOffset.m13794getXimpl(position2), IntOffset.m13795getYimpl(jM12768positionInBjo55l4$ui_release4) + IntOffset.m13795getYimpl(position2));
            long jIntOffset8 = IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(jIntOffset6) - IntOffset.m13794getXimpl(jIntOffset7), IntOffset.m13795getYimpl(jIntOffset6) - IntOffset.m13795getYimpl(jIntOffset7));
            NodeCoordinator wrappedBy = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate).getCoordinator().getWrappedBy();
            Intrinsics.checkNotNull(wrappedBy);
            NodeCoordinator wrappedBy2 = rootLookaheadDelegate.getCoordinator().getWrappedBy();
            Intrinsics.checkNotNull(wrappedBy2);
            return wrappedBy.mo12618localPositionOfR5De75A(wrappedBy2, OffsetKt.Offset(IntOffset.m13794getXimpl(jIntOffset8), IntOffset.m13795getYimpl(jIntOffset8)));
        }
        LookaheadDelegate rootLookaheadDelegate2 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
        return Offset.m11104plusMKHz9U(mo12618localPositionOfR5De75A(rootLookaheadDelegate2.getLookaheadLayoutCoordinates(), relativeToSource), rootLookaheadDelegate2.getCoordinator().getCoordinates().mo12618localPositionOfR5De75A(sourceCoordinates, Offset.INSTANCE.m11115getZeroF1C5BW0()));
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    @NotNull
    public Rect localBoundingBoxOf(@NotNull LayoutCoordinates sourceCoordinates, boolean clipBounds) {
        return getCoordinator().localBoundingBoxOf(sourceCoordinates, clipBounds);
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    /* renamed from: transformFrom-EL8BTi8 */
    public void mo12621transformFromEL8BTi8(@NotNull LayoutCoordinates sourceCoordinates, @NotNull float[] fArr) {
        getCoordinator().mo12621transformFromEL8BTi8(sourceCoordinates, fArr);
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    public int get(@NotNull AlignmentLine alignmentLine) {
        return this.lookaheadDelegate.get(alignmentLine);
    }
}
