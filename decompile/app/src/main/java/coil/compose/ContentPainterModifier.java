package coil.compose;

import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.draw.DrawModifier;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.LayoutModifier;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.layout.ScaleFactor;
import androidx.compose.p003ui.layout.ScaleFactorKt;
import androidx.compose.p003ui.platform.InspectableValueKt;
import androidx.compose.p003ui.platform.InspectorInfo;
import androidx.compose.p003ui.platform.InspectorValueInfo;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ContentPainterModifier.kt */
@Metadata(m7104d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B/\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0005HÂ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÂ\u0003J\t\u0010\u0016\u001a\u00020\tHÂ\u0003J\t\u0010\u0017\u001a\u00020\u000bHÂ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\rHÂ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u001d\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010\u0013J\t\u0010$\u001a\u00020%HÖ\u0001J\f\u0010&\u001a\u00020'*\u00020(H\u0016J\u001c\u0010)\u001a\u00020\u001f*\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u001fH\u0016J\u001c\u0010.\u001a\u00020\u001f*\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010/\u001a\u00020\u001fH\u0016J)\u00100\u001a\u000201*\u0002022\u0006\u0010+\u001a\u0002032\u0006\u0010\"\u001a\u00020!H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105J\u001c\u00106\u001a\u00020\u001f*\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u001fH\u0016J\u001c\u00107\u001a\u00020\u001f*\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010/\u001a\u00020\u001fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00068"}, m7105d2 = {"Lcoil/compose/ContentPainterModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "calculateScaledSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "calculateScaledSize-E7KxVPU", "(J)J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "modifyConstraints", "Landroidx/compose/ui/unit/Constraints;", "constraints", "modifyConstraints-ZezNO4M", "toString", "", "draw", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "coil-compose-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nContentPainterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentPainterModifier.kt\ncoil/compose/ContentPainterModifier\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 4 Utils.kt\ncoil/compose/UtilsKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 6 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,205:1\n135#2:206\n152#3:207\n152#3:208\n152#3:209\n152#3:210\n159#3:211\n159#3:214\n87#4:212\n87#4:213\n66#5:215\n70#5:216\n66#5,5:217\n120#6,4:222\n*S KotlinDebug\n*F\n+ 1 ContentPainterModifier.kt\ncoil/compose/ContentPainterModifier\n*L\n38#1:206\n62#1:207\n76#1:208\n90#1:209\n104#1:210\n120#1:211\n147#1:214\n125#1:212\n126#1:213\n165#1:215\n167#1:216\n179#1:217,5\n195#1:222,4\n*E\n"})
/* loaded from: classes.dex */
public final /* data */ class ContentPainterModifier extends InspectorValueInfo implements LayoutModifier, DrawModifier {

    @NotNull
    public final Alignment alignment;
    public final float alpha;

    @Nullable
    public final ColorFilter colorFilter;

    @NotNull
    public final ContentScale contentScale;

    @NotNull
    public final Painter painter;

    /* renamed from: component1, reason: from getter */
    private final Painter getPainter() {
        return this.painter;
    }

    /* renamed from: component4, reason: from getter */
    private final float getAlpha() {
        return this.alpha;
    }

    public static /* synthetic */ ContentPainterModifier copy$default(ContentPainterModifier contentPainterModifier, Painter painter, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            painter = contentPainterModifier.painter;
        }
        if ((i & 2) != 0) {
            alignment = contentPainterModifier.alignment;
        }
        Alignment alignment2 = alignment;
        if ((i & 4) != 0) {
            contentScale = contentPainterModifier.contentScale;
        }
        ContentScale contentScale2 = contentScale;
        if ((i & 8) != 0) {
            f = contentPainterModifier.alpha;
        }
        float f2 = f;
        if ((i & 16) != 0) {
            colorFilter = contentPainterModifier.colorFilter;
        }
        return contentPainterModifier.copy(painter, alignment2, contentScale2, f2, colorFilter);
    }

    /* renamed from: component2, reason: from getter */
    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: component3, reason: from getter */
    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    /* renamed from: component5, reason: from getter */
    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @NotNull
    public final ContentPainterModifier copy(@NotNull Painter painter, @NotNull Alignment alignment, @NotNull ContentScale contentScale, float alpha, @Nullable ColorFilter colorFilter) {
        return new ContentPainterModifier(painter, alignment, contentScale, alpha, colorFilter);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentPainterModifier)) {
            return false;
        }
        ContentPainterModifier contentPainterModifier = (ContentPainterModifier) other;
        return Intrinsics.areEqual(this.painter, contentPainterModifier.painter) && Intrinsics.areEqual(this.alignment, contentPainterModifier.alignment) && Intrinsics.areEqual(this.contentScale, contentPainterModifier.contentScale) && Float.compare(this.alpha, contentPainterModifier.alpha) == 0 && Intrinsics.areEqual(this.colorFilter, contentPainterModifier.colorFilter);
    }

    public int hashCode() {
        int iHashCode = ((((((this.painter.hashCode() * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.hashCode(this.alpha)) * 31;
        ColorFilter colorFilter = this.colorFilter;
        return iHashCode + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    @NotNull
    public String toString() {
        return "ContentPainterModifier(painter=" + this.painter + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo7625measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j) {
        final Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(m14267modifyConstraintsZezNO4M(j));
        return MeasureScope.layout$default(measureScope, placeableMo12610measureBRTryo0.getWidth(), placeableMo12610measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: coil.compose.ContentPainterModifier$measure$1
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
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.painter.getIntrinsicSize() != Size.INSTANCE.m11176getUnspecifiedNHjbRc()) {
            int iMinIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(Constraints.m13621getMaxHeightimpl(m14267modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null))));
            return Math.max(MathKt__MathJVMKt.roundToInt(Size.m11168getWidthimpl(m14266calculateScaledSizeE7KxVPU(SizeKt.Size(iMinIntrinsicWidth, i)))), iMinIntrinsicWidth);
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.painter.getIntrinsicSize() != Size.INSTANCE.m11176getUnspecifiedNHjbRc()) {
            int iMaxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(Constraints.m13621getMaxHeightimpl(m14267modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null))));
            return Math.max(MathKt__MathJVMKt.roundToInt(Size.m11168getWidthimpl(m14266calculateScaledSizeE7KxVPU(SizeKt.Size(iMaxIntrinsicWidth, i)))), iMaxIntrinsicWidth);
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.painter.getIntrinsicSize() != Size.INSTANCE.m11176getUnspecifiedNHjbRc()) {
            int iMinIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(Constraints.m13622getMaxWidthimpl(m14267modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null))));
            return Math.max(MathKt__MathJVMKt.roundToInt(Size.m11165getHeightimpl(m14266calculateScaledSizeE7KxVPU(SizeKt.Size(i, iMinIntrinsicHeight)))), iMinIntrinsicHeight);
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.painter.getIntrinsicSize() != Size.INSTANCE.m11176getUnspecifiedNHjbRc()) {
            int iMaxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(Constraints.m13622getMaxWidthimpl(m14267modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null))));
            return Math.max(MathKt__MathJVMKt.roundToInt(Size.m11165getHeightimpl(m14266calculateScaledSizeE7KxVPU(SizeKt.Size(i, iMaxIntrinsicHeight)))), iMaxIntrinsicHeight);
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    /* renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    private final long m14266calculateScaledSizeE7KxVPU(long dstSize) {
        if (Size.m11170isEmptyimpl(dstSize)) {
            return Size.INSTANCE.m11177getZeroNHjbRc();
        }
        long intrinsicSize = this.painter.getIntrinsicSize();
        if (intrinsicSize == Size.INSTANCE.m11176getUnspecifiedNHjbRc()) {
            return dstSize;
        }
        float fM11168getWidthimpl = Size.m11168getWidthimpl(intrinsicSize);
        if (Float.isInfinite(fM11168getWidthimpl) || Float.isNaN(fM11168getWidthimpl)) {
            fM11168getWidthimpl = Size.m11168getWidthimpl(dstSize);
        }
        float fM11165getHeightimpl = Size.m11165getHeightimpl(intrinsicSize);
        if (Float.isInfinite(fM11165getHeightimpl) || Float.isNaN(fM11165getHeightimpl)) {
            fM11165getHeightimpl = Size.m11165getHeightimpl(dstSize);
        }
        long jSize = SizeKt.Size(fM11168getWidthimpl, fM11165getHeightimpl);
        long jMo12601computeScaleFactorH7hwNQA = this.contentScale.mo12601computeScaleFactorH7hwNQA(jSize, dstSize);
        float fM12680getScaleXimpl = ScaleFactor.m12680getScaleXimpl(jMo12601computeScaleFactorH7hwNQA);
        if (Float.isInfinite(fM12680getScaleXimpl) || Float.isNaN(fM12680getScaleXimpl)) {
            return dstSize;
        }
        float fM12681getScaleYimpl = ScaleFactor.m12681getScaleYimpl(jMo12601computeScaleFactorH7hwNQA);
        return (Float.isInfinite(fM12681getScaleYimpl) || Float.isNaN(fM12681getScaleYimpl)) ? dstSize : ScaleFactorKt.m12696timesmw2e94(jMo12601computeScaleFactorH7hwNQA, jSize);
    }

    /* renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    private final long m14267modifyConstraintsZezNO4M(long constraints) {
        float fM13624getMinWidthimpl;
        int iM13623getMinHeightimpl;
        float fM14287constrainHeightK40F9xA;
        boolean zM13620getHasFixedWidthimpl = Constraints.m13620getHasFixedWidthimpl(constraints);
        boolean zM13619getHasFixedHeightimpl = Constraints.m13619getHasFixedHeightimpl(constraints);
        if (zM13620getHasFixedWidthimpl && zM13619getHasFixedHeightimpl) {
            return constraints;
        }
        boolean z = Constraints.m13618getHasBoundedWidthimpl(constraints) && Constraints.m13617getHasBoundedHeightimpl(constraints);
        long intrinsicSize = this.painter.getIntrinsicSize();
        if (intrinsicSize == Size.INSTANCE.m11176getUnspecifiedNHjbRc()) {
            return z ? Constraints.m13613copyZbe2FdA$default(constraints, Constraints.m13622getMaxWidthimpl(constraints), 0, Constraints.m13621getMaxHeightimpl(constraints), 0, 10, null) : constraints;
        }
        if (z && (zM13620getHasFixedWidthimpl || zM13619getHasFixedHeightimpl)) {
            fM13624getMinWidthimpl = Constraints.m13622getMaxWidthimpl(constraints);
            iM13623getMinHeightimpl = Constraints.m13621getMaxHeightimpl(constraints);
        } else {
            float fM11168getWidthimpl = Size.m11168getWidthimpl(intrinsicSize);
            float fM11165getHeightimpl = Size.m11165getHeightimpl(intrinsicSize);
            fM13624getMinWidthimpl = (Float.isInfinite(fM11168getWidthimpl) || Float.isNaN(fM11168getWidthimpl)) ? Constraints.m13624getMinWidthimpl(constraints) : UtilsKt.m14288constrainWidthK40F9xA(constraints, fM11168getWidthimpl);
            if (Float.isInfinite(fM11165getHeightimpl) || Float.isNaN(fM11165getHeightimpl)) {
                iM13623getMinHeightimpl = Constraints.m13623getMinHeightimpl(constraints);
            } else {
                fM14287constrainHeightK40F9xA = UtilsKt.m14287constrainHeightK40F9xA(constraints, fM11165getHeightimpl);
                long jM14266calculateScaledSizeE7KxVPU = m14266calculateScaledSizeE7KxVPU(SizeKt.Size(fM13624getMinWidthimpl, fM14287constrainHeightK40F9xA));
                return Constraints.m13613copyZbe2FdA$default(constraints, ConstraintsKt.m13636constrainWidthK40F9xA(constraints, MathKt__MathJVMKt.roundToInt(Size.m11168getWidthimpl(jM14266calculateScaledSizeE7KxVPU))), 0, ConstraintsKt.m13635constrainHeightK40F9xA(constraints, MathKt__MathJVMKt.roundToInt(Size.m11165getHeightimpl(jM14266calculateScaledSizeE7KxVPU))), 0, 10, null);
            }
        }
        fM14287constrainHeightK40F9xA = iM13623getMinHeightimpl;
        long jM14266calculateScaledSizeE7KxVPU2 = m14266calculateScaledSizeE7KxVPU(SizeKt.Size(fM13624getMinWidthimpl, fM14287constrainHeightK40F9xA));
        return Constraints.m13613copyZbe2FdA$default(constraints, ConstraintsKt.m13636constrainWidthK40F9xA(constraints, MathKt__MathJVMKt.roundToInt(Size.m11168getWidthimpl(jM14266calculateScaledSizeE7KxVPU2))), 0, ConstraintsKt.m13635constrainHeightK40F9xA(constraints, MathKt__MathJVMKt.roundToInt(Size.m11165getHeightimpl(jM14266calculateScaledSizeE7KxVPU2))), 0, 10, null);
    }

    @Override // androidx.compose.p003ui.draw.DrawModifier
    public void draw(@NotNull ContentDrawScope contentDrawScope) {
        long jM14266calculateScaledSizeE7KxVPU = m14266calculateScaledSizeE7KxVPU(contentDrawScope.mo11889getSizeNHjbRc());
        long jMo10976alignKFBX0sM = this.alignment.mo10976alignKFBX0sM(UtilsKt.m14289toIntSizeuvyYCjk(jM14266calculateScaledSizeE7KxVPU), UtilsKt.m14289toIntSizeuvyYCjk(contentDrawScope.mo11889getSizeNHjbRc()), contentDrawScope.getLayoutDirection());
        float fM13786component1impl = IntOffset.m13786component1impl(jMo10976alignKFBX0sM);
        float fM13787component2impl = IntOffset.m13787component2impl(jMo10976alignKFBX0sM);
        contentDrawScope.getDrawContext().getTransform().translate(fM13786component1impl, fM13787component2impl);
        this.painter.m11965drawx_KDEd0(contentDrawScope, jM14266calculateScaledSizeE7KxVPU, this.alpha, this.colorFilter);
        contentDrawScope.getDrawContext().getTransform().translate(-fM13786component1impl, -fM13787component2impl);
        contentDrawScope.drawContent();
    }

    public ContentPainterModifier(@NotNull final Painter painter, @NotNull final Alignment alignment, @NotNull final ContentScale contentScale, final float f, @Nullable final ColorFilter colorFilter) {
        super(InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: coil.compose.ContentPainterModifier$special$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("content");
                inspectorInfo.getProperties().set("painter", painter);
                inspectorInfo.getProperties().set("alignment", alignment);
                inspectorInfo.getProperties().set("contentScale", contentScale);
                inspectorInfo.getProperties().set("alpha", Float.valueOf(f));
                inspectorInfo.getProperties().set("colorFilter", colorFilter);
            }
        } : InspectableValueKt.getNoInspectorInfo());
        this.painter = painter;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f;
        this.colorFilter = colorFilter;
    }
}
