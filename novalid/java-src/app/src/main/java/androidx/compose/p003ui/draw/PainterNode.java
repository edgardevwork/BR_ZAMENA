package androidx.compose.p003ui.draw;

import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.layout.ScaleFactorKt;
import androidx.compose.p003ui.node.DrawModifierNode;
import androidx.compose.p003ui.node.LayoutModifierNode;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PainterModifier.kt */
@Metadata(m7104d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B?\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u001a\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.H\u0002ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u001a\u00102\u001a\u0002032\u0006\u00104\u001a\u000203H\u0002ø\u0001\u0000¢\u0006\u0004\b5\u00101J\b\u00106\u001a\u000207H\u0016J\f\u00108\u001a\u000209*\u00020:H\u0016J\u0016\u0010;\u001a\u00020\u0007*\u00020.H\u0002ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u0016\u0010>\u001a\u00020\u0007*\u00020.H\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010=J\u001c\u0010@\u001a\u00020A*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020AH\u0016J\u001c\u0010F\u001a\u00020A*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010G\u001a\u00020AH\u0016J&\u0010H\u001a\u00020I*\u00020J2\u0006\u0010C\u001a\u00020K2\u0006\u00104\u001a\u000203H\u0016ø\u0001\u0000¢\u0006\u0004\bL\u0010MJ\u001c\u0010N\u001a\u00020A*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020AH\u0016J\u001c\u0010O\u001a\u00020A*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010G\u001a\u00020AH\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010'\"\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006P"}, m7105d2 = {"Landroidx/compose/ui/draw/PainterNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "sizeToIntrinsics", "", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "(Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "getAlignment", "()Landroidx/compose/ui/Alignment;", "setAlignment", "(Landroidx/compose/ui/Alignment;)V", "getAlpha", "()F", "setAlpha", "(F)V", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "setContentScale", "(Landroidx/compose/ui/layout/ContentScale;)V", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "setPainter", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "shouldAutoInvalidate", "getShouldAutoInvalidate", "()Z", "getSizeToIntrinsics", "setSizeToIntrinsics", "(Z)V", "useIntrinsicSize", "getUseIntrinsicSize", "calculateScaledSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "calculateScaledSize-E7KxVPU", "(J)J", "modifyConstraints", "Landroidx/compose/ui/unit/Constraints;", "constraints", "modifyConstraints-ZezNO4M", "toString", "", "draw", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "hasSpecifiedAndFiniteHeight", "hasSpecifiedAndFiniteHeight-uvyYCjk", "(J)Z", "hasSpecifiedAndFiniteWidth", "hasSpecifiedAndFiniteWidth-uvyYCjk", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPainterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PainterModifier.kt\nandroidx/compose/ui/draw/PainterNode\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,361:1\n152#2:362\n121#3,4:363\n*S KotlinDebug\n*F\n+ 1 PainterModifier.kt\nandroidx/compose/ui/draw/PainterNode\n*L\n162#1:362\n340#1:363,4\n*E\n"})
/* renamed from: androidx.compose.ui.draw.PainterNode, reason: from toString */
/* loaded from: classes3.dex */
public final class PainterModifier extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {

    @NotNull
    public Alignment alignment;
    public float alpha;

    @Nullable
    public ColorFilter colorFilter;

    @NotNull
    public ContentScale contentScale;

    @NotNull
    public Painter painter;
    public boolean sizeToIntrinsics;

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @NotNull
    public final Painter getPainter() {
        return this.painter;
    }

    public final void setPainter(@NotNull Painter painter) {
        this.painter = painter;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    public final void setSizeToIntrinsics(boolean z) {
        this.sizeToIntrinsics = z;
    }

    public /* synthetic */ PainterModifier(Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(painter, z, (i & 4) != 0 ? Alignment.INSTANCE.getCenter() : alignment, (i & 8) != 0 ? ContentScale.INSTANCE.getInside() : contentScale, (i & 16) != 0 ? 1.0f : f, (i & 32) != 0 ? null : colorFilter);
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final void setAlignment(@NotNull Alignment alignment) {
        this.alignment = alignment;
    }

    @NotNull
    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    public final void setContentScale(@NotNull ContentScale contentScale) {
        this.contentScale = contentScale;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    @Nullable
    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    public PainterModifier(@NotNull Painter painter, boolean z, @NotNull Alignment alignment, @NotNull ContentScale contentScale, float f, @Nullable ColorFilter colorFilter) {
        this.painter = painter;
        this.sizeToIntrinsics = z;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f;
        this.colorFilter = colorFilter;
    }

    public final boolean getUseIntrinsicSize() {
        return this.sizeToIntrinsics && this.painter.getIntrinsicSize() != Size.INSTANCE.m11176getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo7650measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j) {
        final Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(m11010modifyConstraintsZezNO4M(j));
        return MeasureScope.layout$default(measureScope, placeableMo12610measureBRTryo0.getWidth(), placeableMo12610measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.draw.PainterNode$measure$1
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

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (getUseIntrinsicSize()) {
            long jM11010modifyConstraintsZezNO4M = m11010modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
            return Math.max(Constraints.m13624getMinWidthimpl(jM11010modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicWidth(i));
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (getUseIntrinsicSize()) {
            long jM11010modifyConstraintsZezNO4M = m11010modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
            return Math.max(Constraints.m13624getMinWidthimpl(jM11010modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicWidth(i));
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (getUseIntrinsicSize()) {
            long jM11010modifyConstraintsZezNO4M = m11010modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
            return Math.max(Constraints.m13623getMinHeightimpl(jM11010modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicHeight(i));
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (getUseIntrinsicSize()) {
            long jM11010modifyConstraintsZezNO4M = m11010modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
            return Math.max(Constraints.m13623getMinHeightimpl(jM11010modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicHeight(i));
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    /* renamed from: calculateScaledSize-E7KxVPU */
    public final long m11007calculateScaledSizeE7KxVPU(long dstSize) {
        float fM11168getWidthimpl;
        float fM11165getHeightimpl;
        if (!getUseIntrinsicSize()) {
            return dstSize;
        }
        if (!m11009hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.getIntrinsicSize())) {
            fM11168getWidthimpl = Size.m11168getWidthimpl(dstSize);
        } else {
            fM11168getWidthimpl = Size.m11168getWidthimpl(this.painter.getIntrinsicSize());
        }
        if (!m11008hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.getIntrinsicSize())) {
            fM11165getHeightimpl = Size.m11165getHeightimpl(dstSize);
        } else {
            fM11165getHeightimpl = Size.m11165getHeightimpl(this.painter.getIntrinsicSize());
        }
        long jSize = SizeKt.Size(fM11168getWidthimpl, fM11165getHeightimpl);
        if (Size.m11168getWidthimpl(dstSize) != 0.0f && Size.m11165getHeightimpl(dstSize) != 0.0f) {
            return ScaleFactorKt.m12695timesUQTWf7w(jSize, this.contentScale.mo12601computeScaleFactorH7hwNQA(jSize, dstSize));
        }
        return Size.INSTANCE.m11177getZeroNHjbRc();
    }

    /* renamed from: modifyConstraints-ZezNO4M */
    public final long m11010modifyConstraintsZezNO4M(long constraints) {
        int iM13624getMinWidthimpl;
        int iM13623getMinHeightimpl;
        boolean z = false;
        boolean z2 = Constraints.m13618getHasBoundedWidthimpl(constraints) && Constraints.m13617getHasBoundedHeightimpl(constraints);
        if (Constraints.m13620getHasFixedWidthimpl(constraints) && Constraints.m13619getHasFixedHeightimpl(constraints)) {
            z = true;
        }
        if ((!getUseIntrinsicSize() && z2) || z) {
            return Constraints.m13613copyZbe2FdA$default(constraints, Constraints.m13622getMaxWidthimpl(constraints), 0, Constraints.m13621getMaxHeightimpl(constraints), 0, 10, null);
        }
        long intrinsicSize = this.painter.getIntrinsicSize();
        if (m11009hasSpecifiedAndFiniteWidthuvyYCjk(intrinsicSize)) {
            iM13624getMinWidthimpl = MathKt__MathJVMKt.roundToInt(Size.m11168getWidthimpl(intrinsicSize));
        } else {
            iM13624getMinWidthimpl = Constraints.m13624getMinWidthimpl(constraints);
        }
        if (m11008hasSpecifiedAndFiniteHeightuvyYCjk(intrinsicSize)) {
            iM13623getMinHeightimpl = MathKt__MathJVMKt.roundToInt(Size.m11165getHeightimpl(intrinsicSize));
        } else {
            iM13623getMinHeightimpl = Constraints.m13623getMinHeightimpl(constraints);
        }
        long jM11007calculateScaledSizeE7KxVPU = m11007calculateScaledSizeE7KxVPU(SizeKt.Size(ConstraintsKt.m13636constrainWidthK40F9xA(constraints, iM13624getMinWidthimpl), ConstraintsKt.m13635constrainHeightK40F9xA(constraints, iM13623getMinHeightimpl)));
        return Constraints.m13613copyZbe2FdA$default(constraints, ConstraintsKt.m13636constrainWidthK40F9xA(constraints, MathKt__MathJVMKt.roundToInt(Size.m11168getWidthimpl(jM11007calculateScaledSizeE7KxVPU))), 0, ConstraintsKt.m13635constrainHeightK40F9xA(constraints, MathKt__MathJVMKt.roundToInt(Size.m11165getHeightimpl(jM11007calculateScaledSizeE7KxVPU))), 0, 10, null);
    }

    @Override // androidx.compose.p003ui.node.DrawModifierNode
    public void draw(@NotNull ContentDrawScope contentDrawScope) {
        float fM11168getWidthimpl;
        float fM11165getHeightimpl;
        long jM11177getZeroNHjbRc;
        long intrinsicSize = this.painter.getIntrinsicSize();
        if (m11009hasSpecifiedAndFiniteWidthuvyYCjk(intrinsicSize)) {
            fM11168getWidthimpl = Size.m11168getWidthimpl(intrinsicSize);
        } else {
            fM11168getWidthimpl = Size.m11168getWidthimpl(contentDrawScope.mo11889getSizeNHjbRc());
        }
        if (m11008hasSpecifiedAndFiniteHeightuvyYCjk(intrinsicSize)) {
            fM11165getHeightimpl = Size.m11165getHeightimpl(intrinsicSize);
        } else {
            fM11165getHeightimpl = Size.m11165getHeightimpl(contentDrawScope.mo11889getSizeNHjbRc());
        }
        long jSize = SizeKt.Size(fM11168getWidthimpl, fM11165getHeightimpl);
        if (Size.m11168getWidthimpl(contentDrawScope.mo11889getSizeNHjbRc()) != 0.0f && Size.m11165getHeightimpl(contentDrawScope.mo11889getSizeNHjbRc()) != 0.0f) {
            jM11177getZeroNHjbRc = ScaleFactorKt.m12695timesUQTWf7w(jSize, this.contentScale.mo12601computeScaleFactorH7hwNQA(jSize, contentDrawScope.mo11889getSizeNHjbRc()));
        } else {
            jM11177getZeroNHjbRc = Size.INSTANCE.m11177getZeroNHjbRc();
        }
        long j = jM11177getZeroNHjbRc;
        long jMo10976alignKFBX0sM = this.alignment.mo10976alignKFBX0sM(IntSizeKt.IntSize(MathKt__MathJVMKt.roundToInt(Size.m11168getWidthimpl(j)), MathKt__MathJVMKt.roundToInt(Size.m11165getHeightimpl(j))), IntSizeKt.IntSize(MathKt__MathJVMKt.roundToInt(Size.m11168getWidthimpl(contentDrawScope.mo11889getSizeNHjbRc())), MathKt__MathJVMKt.roundToInt(Size.m11165getHeightimpl(contentDrawScope.mo11889getSizeNHjbRc()))), contentDrawScope.getLayoutDirection());
        float fM13794getXimpl = IntOffset.m13794getXimpl(jMo10976alignKFBX0sM);
        float fM13795getYimpl = IntOffset.m13795getYimpl(jMo10976alignKFBX0sM);
        contentDrawScope.getDrawContext().getTransform().translate(fM13794getXimpl, fM13795getYimpl);
        this.painter.m11965drawx_KDEd0(contentDrawScope, j, this.alpha, this.colorFilter);
        contentDrawScope.getDrawContext().getTransform().translate(-fM13794getXimpl, -fM13795getYimpl);
        contentDrawScope.drawContent();
    }

    /* renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk */
    public final boolean m11009hasSpecifiedAndFiniteWidthuvyYCjk(long j) {
        if (!Size.m11164equalsimpl0(j, Size.INSTANCE.m11176getUnspecifiedNHjbRc())) {
            float fM11168getWidthimpl = Size.m11168getWidthimpl(j);
            if (!Float.isInfinite(fM11168getWidthimpl) && !Float.isNaN(fM11168getWidthimpl)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk */
    public final boolean m11008hasSpecifiedAndFiniteHeightuvyYCjk(long j) {
        if (!Size.m11164equalsimpl0(j, Size.INSTANCE.m11176getUnspecifiedNHjbRc())) {
            float fM11165getHeightimpl = Size.m11165getHeightimpl(j);
            if (!Float.isInfinite(fM11165getHeightimpl) && !Float.isNaN(fM11165getHeightimpl)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }
}
