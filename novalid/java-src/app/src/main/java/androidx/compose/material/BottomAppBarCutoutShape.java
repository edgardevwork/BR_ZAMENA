package androidx.compose.material;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.AndroidPath_androidKt;
import androidx.compose.p003ui.graphics.Outline;
import androidx.compose.p003ui.graphics.OutlineKt;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.PathOperation;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppBar.kt */
@Metadata(m7104d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u0001HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J*\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u001c\u0010\u001f\u001a\u00020 *\u00020!2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J4\u0010\"\u001a\u00020 *\u00020!2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$H\u0002R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, m7105d2 = {"Landroidx/compose/material/BottomAppBarCutoutShape;", "Landroidx/compose/ui/graphics/Shape;", "cutoutShape", "fabPlacement", "Landroidx/compose/material/FabPlacement;", "(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/FabPlacement;)V", "getCutoutShape", "()Landroidx/compose/ui/graphics/Shape;", "getFabPlacement", "()Landroidx/compose/material/FabPlacement;", "component1", "component2", "copy", "createOutline", "Landroidx/compose/ui/graphics/Outline;", "size", "Landroidx/compose/ui/geometry/Size;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "equals", "", "other", "", "hashCode", "", "toString", "", "addCutoutShape", "", "Landroidx/compose/ui/graphics/Path;", "addRoundedEdges", "cutoutStartPosition", "", "cutoutEndPosition", "cutoutRadius", "roundedEdgeRadius", "verticalOffset", "material_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/BottomAppBarCutoutShape\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AppBar.kt\nandroidx/compose/material/AppBarKt\n*L\n1#1,758:1\n1#2:759\n632#3:760\n606#3:761\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/BottomAppBarCutoutShape\n*L\n556#1:760\n556#1:761\n*E\n"})
/* loaded from: classes3.dex */
public final /* data */ class BottomAppBarCutoutShape implements Shape {

    @NotNull
    public final Shape cutoutShape;

    @NotNull
    public final FabPlacement fabPlacement;

    public static /* synthetic */ BottomAppBarCutoutShape copy$default(BottomAppBarCutoutShape bottomAppBarCutoutShape, Shape shape, FabPlacement fabPlacement, int i, Object obj) {
        if ((i & 1) != 0) {
            shape = bottomAppBarCutoutShape.cutoutShape;
        }
        if ((i & 2) != 0) {
            fabPlacement = bottomAppBarCutoutShape.fabPlacement;
        }
        return bottomAppBarCutoutShape.copy(shape, fabPlacement);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Shape getCutoutShape() {
        return this.cutoutShape;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final FabPlacement getFabPlacement() {
        return this.fabPlacement;
    }

    @NotNull
    public final BottomAppBarCutoutShape copy(@NotNull Shape cutoutShape, @NotNull FabPlacement fabPlacement) {
        return new BottomAppBarCutoutShape(cutoutShape, fabPlacement);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomAppBarCutoutShape)) {
            return false;
        }
        BottomAppBarCutoutShape bottomAppBarCutoutShape = (BottomAppBarCutoutShape) other;
        return Intrinsics.areEqual(this.cutoutShape, bottomAppBarCutoutShape.cutoutShape) && Intrinsics.areEqual(this.fabPlacement, bottomAppBarCutoutShape.fabPlacement);
    }

    public int hashCode() {
        return (this.cutoutShape.hashCode() * 31) + this.fabPlacement.hashCode();
    }

    @NotNull
    public String toString() {
        return "BottomAppBarCutoutShape(cutoutShape=" + this.cutoutShape + ", fabPlacement=" + this.fabPlacement + ')';
    }

    public BottomAppBarCutoutShape(@NotNull Shape shape, @NotNull FabPlacement fabPlacement) {
        this.cutoutShape = shape;
        this.fabPlacement = fabPlacement;
    }

    @NotNull
    public final Shape getCutoutShape() {
        return this.cutoutShape;
    }

    @NotNull
    public final FabPlacement getFabPlacement() {
        return this.fabPlacement;
    }

    @Override // androidx.compose.p003ui.graphics.Shape
    @NotNull
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo7821createOutlinePq9zytI(long size, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
        Path Path = AndroidPath_androidKt.Path();
        Path.addRect(new Rect(0.0f, 0.0f, Size.m11168getWidthimpl(size), Size.m11165getHeightimpl(size)));
        Path Path2 = AndroidPath_androidKt.Path();
        addCutoutShape(Path2, layoutDirection, density);
        Path2.mo11232opN5in7k0(Path, Path2, PathOperation.INSTANCE.m11631getDifferenceb3I0S0c());
        return new Outline.Generic(Path2);
    }

    public final void addCutoutShape(Path path, LayoutDirection layoutDirection, Density density) {
        float fMo7874toPx0680j_4 = density.mo7874toPx0680j_4(AppBarKt.BottomAppBarCutoutOffset);
        float f = 2 * fMo7874toPx0680j_4;
        long jSize = SizeKt.Size(this.fabPlacement.getWidth() + f, this.fabPlacement.getHeight() + f);
        float left = this.fabPlacement.getLeft() - fMo7874toPx0680j_4;
        float fM11168getWidthimpl = left + Size.m11168getWidthimpl(jSize);
        float fM11165getHeightimpl = Size.m11165getHeightimpl(jSize) / 2.0f;
        OutlineKt.addOutline(path, this.cutoutShape.mo7821createOutlinePq9zytI(jSize, layoutDirection, density));
        path.mo11235translatek4lQ0M(OffsetKt.Offset(left, -fM11165getHeightimpl));
        if (Intrinsics.areEqual(this.cutoutShape, RoundedCornerShapeKt.getCircleShape())) {
            addRoundedEdges(path, left, fM11168getWidthimpl, fM11165getHeightimpl, density.mo7874toPx0680j_4(AppBarKt.BottomAppBarRoundedEdgeRadius), 0.0f);
        }
    }

    public final void addRoundedEdges(Path path, float f, float f2, float f3, float f4, float f5) {
        float f6 = -((float) Math.sqrt((f3 * f3) - (f5 * f5)));
        float f7 = f3 + f6;
        float f8 = f + f7;
        float f9 = f2 - f7;
        Pair<Float, Float> pairCalculateRoundedEdgeIntercept = AppBarKt.calculateRoundedEdgeIntercept(f6 - 1.0f, f5, f3);
        float fFloatValue = pairCalculateRoundedEdgeIntercept.component1().floatValue() + f3;
        float fFloatValue2 = pairCalculateRoundedEdgeIntercept.component2().floatValue() - f5;
        path.moveTo(f8 - f4, 0.0f);
        path.quadraticBezierTo(f8 - 1.0f, 0.0f, f + fFloatValue, fFloatValue2);
        path.lineTo(f2 - fFloatValue, fFloatValue2);
        path.quadraticBezierTo(f9 + 1.0f, 0.0f, f4 + f9, 0.0f);
        path.close();
    }
}
