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

/* compiled from: ReduceCapacity.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_reduceCapacity", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ReduceCapacity", "Landroidx/compose/material/icons/Icons$Rounded;", "getReduceCapacity", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nReduceCapacity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReduceCapacity.kt\nandroidx/compose/material/icons/rounded/ReduceCapacityKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,125:1\n212#2,12:126\n233#2,18:139\n253#2:176\n174#3:138\n705#4,2:157\n717#4,2:159\n719#4,11:165\n72#5,4:161\n*S KotlinDebug\n*F\n+ 1 ReduceCapacity.kt\nandroidx/compose/material/icons/rounded/ReduceCapacityKt\n*L\n29#1:126,12\n30#1:139,18\n30#1:176\n29#1:138\n30#1:157,2\n30#1:159,2\n30#1:165,11\n30#1:161,4\n*E\n"})
/* loaded from: classes2.dex */
public final class ReduceCapacityKt {

    @Nullable
    private static ImageVector _reduceCapacity;

    @NotNull
    public static final ImageVector getReduceCapacity(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _reduceCapacity;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ReduceCapacity", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(16.0f, 5.1f, 16.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.78f, 7.58f);
        pathBuilder.curveTo(19.93f, 7.21f, 18.99f, 7.0f, 18.0f, 7.0f);
        pathBuilder.curveToRelative(-0.67f, 0.0f, -1.31f, 0.1f, -1.92f, 0.28f);
        pathBuilder.curveTo(16.66f, 7.83f, 17.0f, 8.6f, 17.0f, 9.43f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.verticalLineTo(9.43f);
        pathBuilder.curveTo(22.0f, 8.62f, 21.52f, 7.9f, 20.78f, 7.58f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 6.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(7.1f, 2.0f, 6.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(4.0f, 2.9f, 4.0f, 4.0f);
        pathBuilder.reflectiveCurveTo(4.9f, 6.0f, 6.0f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.92f, 7.28f);
        pathBuilder.curveTo(7.31f, 7.1f, 6.67f, 7.0f, 6.0f, 7.0f);
        pathBuilder.curveTo(5.01f, 7.0f, 4.07f, 7.21f, 3.22f, 7.58f);
        pathBuilder.curveTo(2.48f, 7.9f, 2.0f, 8.62f, 2.0f, 9.43f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.verticalLineTo(9.43f);
        pathBuilder.curveTo(7.0f, 8.6f, 7.34f, 7.83f, 7.92f, 7.28f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(10.0f, 5.1f, 10.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 10.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineTo(9.43f);
        pathBuilder.curveTo(8.0f, 8.62f, 8.48f, 7.9f, 9.22f, 7.58f);
        pathBuilder.curveTo(10.07f, 7.21f, 11.01f, 7.0f, 12.0f, 7.0f);
        pathBuilder.curveToRelative(0.99f, 0.0f, 1.93f, 0.21f, 2.78f, 0.58f);
        pathBuilder.curveTo(15.52f, 7.9f, 16.0f, 8.62f, 16.0f, 9.43f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 16.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(15.0f, 17.1f, 15.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 22.0f);
        pathBuilder.horizontalLineToRelative(-8.0f);
        pathBuilder.verticalLineToRelative(-0.57f);
        pathBuilder.curveToRelative(0.0f, -0.81f, 0.48f, -1.53f, 1.22f, -1.85f);
        pathBuilder.curveTo(15.07f, 19.21f, 16.01f, 19.0f, 17.0f, 19.0f);
        pathBuilder.curveToRelative(0.99f, 0.0f, 1.93f, 0.21f, 2.78f, 0.58f);
        pathBuilder.curveTo(20.52f, 19.9f, 21.0f, 20.62f, 21.0f, 21.43f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 16.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(5.0f, 17.1f, 5.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 22.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(-0.57f);
        pathBuilder.curveToRelative(0.0f, -0.81f, 0.48f, -1.53f, 1.22f, -1.85f);
        pathBuilder.curveTo(5.07f, 19.21f, 6.01f, 19.0f, 7.0f, 19.0f);
        pathBuilder.curveToRelative(0.99f, 0.0f, 1.93f, 0.21f, 2.78f, 0.58f);
        pathBuilder.curveTo(10.52f, 19.9f, 11.0f, 20.62f, 11.0f, 21.43f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.79f, 13.0f);
        pathBuilder.horizontalLineToRelative(-1.04f);
        pathBuilder.verticalLineToRelative(-1.25f);
        pathBuilder.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilder.reflectiveCurveToRelative(-0.75f, 0.34f, -0.75f, 0.75f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder.horizontalLineToRelative(-1.04f);
        pathBuilder.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        pathBuilder.lineToRelative(1.79f, 1.79f);
        pathBuilder.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        pathBuilder.lineToRelative(1.79f, -1.79f);
        pathBuilder.curveTo(14.46f, 13.54f, 14.24f, 13.0f, 13.79f, 13.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _reduceCapacity = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
