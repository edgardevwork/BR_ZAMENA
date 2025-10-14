package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.graphics.StrokeCap;
import androidx.compose.p003ui.graphics.StrokeJoin;
import androidx.compose.p003ui.graphics.vector.ImageVector;
import androidx.compose.p003ui.graphics.vector.PathBuilder;
import androidx.compose.p003ui.graphics.vector.VectorKt;
import androidx.compose.p003ui.unit.C2046Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PointOfSale.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_pointOfSale", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PointOfSale", "Landroidx/compose/material/icons/Icons$Rounded;", "getPointOfSale", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPointOfSale.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointOfSale.kt\nandroidx/compose/material/icons/rounded/PointOfSaleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,145:1\n212#2,12:146\n233#2,18:159\n253#2:196\n174#3:158\n705#4,2:177\n717#4,2:179\n719#4,11:185\n72#5,4:181\n*S KotlinDebug\n*F\n+ 1 PointOfSale.kt\nandroidx/compose/material/icons/rounded/PointOfSaleKt\n*L\n29#1:146,12\n30#1:159,18\n30#1:196\n29#1:158\n30#1:177,2\n30#1:179,2\n30#1:185,11\n30#1:181,4\n*E\n"})
/* loaded from: classes3.dex */
public final class PointOfSaleKt {

    @Nullable
    private static ImageVector _pointOfSale;

    @NotNull
    public static final ImageVector getPointOfSale(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _pointOfSale;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PointOfSale", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 2.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.curveTo(5.9f, 2.0f, 5.0f, 2.9f, 5.0f, 4.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.curveTo(19.0f, 2.9f, 18.1f, 2.0f, 17.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.5f, 6.0f);
        pathBuilder.horizontalLineToRelative(-9.0f);
        pathBuilder.curveTo(7.22f, 6.0f, 7.0f, 5.78f, 7.0f, 5.5f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.curveTo(7.0f, 4.22f, 7.22f, 4.0f, 7.5f, 4.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.curveTo(16.78f, 4.0f, 17.0f, 4.22f, 17.0f, 4.5f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveTo(17.0f, 5.78f, 16.78f, 6.0f, 16.5f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 22.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveTo(22.0f, 21.1f, 21.1f, 22.0f, 20.0f, 22.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.53f, 10.19f);
        pathBuilder.curveTo(18.21f, 9.47f, 17.49f, 9.0f, 16.7f, 9.0f);
        pathBuilder.horizontalLineTo(7.3f);
        pathBuilder.curveToRelative(-0.79f, 0.0f, -1.51f, 0.47f, -1.83f, 1.19f);
        pathBuilder.lineTo(2.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.lineTo(18.53f, 10.19f);
        pathBuilder.close();
        pathBuilder.moveTo(9.5f, 16.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.curveTo(8.22f, 16.0f, 8.0f, 15.78f, 8.0f, 15.5f);
        pathBuilder.curveTo(8.0f, 15.22f, 8.22f, 15.0f, 8.5f, 15.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.curveTo(10.0f, 15.78f, 9.78f, 16.0f, 9.5f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.5f, 14.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.curveTo(8.22f, 14.0f, 8.0f, 13.78f, 8.0f, 13.5f);
        pathBuilder.curveTo(8.0f, 13.22f, 8.22f, 13.0f, 8.5f, 13.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.curveTo(10.0f, 13.78f, 9.78f, 14.0f, 9.5f, 14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.5f, 12.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.curveTo(8.22f, 12.0f, 8.0f, 11.78f, 8.0f, 11.5f);
        pathBuilder.curveTo(8.0f, 11.22f, 8.22f, 11.0f, 8.5f, 11.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.curveTo(10.0f, 11.78f, 9.78f, 12.0f, 9.5f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.5f, 16.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.curveTo(13.0f, 15.78f, 12.78f, 16.0f, 12.5f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.5f, 14.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.curveTo(13.0f, 13.78f, 12.78f, 14.0f, 12.5f, 14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.5f, 12.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.curveTo(13.0f, 11.78f, 12.78f, 12.0f, 12.5f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.5f, 16.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.curveTo(16.0f, 15.78f, 15.78f, 16.0f, 15.5f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.5f, 14.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.curveTo(16.0f, 13.78f, 15.78f, 14.0f, 15.5f, 14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.5f, 12.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.curveTo(16.0f, 11.78f, 15.78f, 12.0f, 15.5f, 12.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pointOfSale = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
