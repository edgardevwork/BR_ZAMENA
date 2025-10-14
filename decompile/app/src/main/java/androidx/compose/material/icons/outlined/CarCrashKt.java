package androidx.compose.material.icons.outlined;

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

/* compiled from: CarCrash.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_carCrash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CarCrash", "Landroidx/compose/material/icons/Icons$Outlined;", "getCarCrash", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCarCrash.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarCrash.kt\nandroidx/compose/material/icons/outlined/CarCrashKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,96:1\n212#2,12:97\n233#2,18:110\n253#2:147\n174#3:109\n705#4,2:128\n717#4,2:130\n719#4,11:136\n72#5,4:132\n*S KotlinDebug\n*F\n+ 1 CarCrash.kt\nandroidx/compose/material/icons/outlined/CarCrashKt\n*L\n29#1:97,12\n30#1:110,18\n30#1:147\n29#1:109\n30#1:128,2\n30#1:130,2\n30#1:136,11\n30#1:132,4\n*E\n"})
/* loaded from: classes2.dex */
public final class CarCrashKt {

    @Nullable
    private static ImageVector _carCrash;

    @NotNull
    public static final ImageVector getCarCrash(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _carCrash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.CarCrash", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 1.0f);
        pathBuilder.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilder.reflectiveCurveTo(20.76f, 1.0f, 18.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.5f, 7.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.5f, 8.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineTo(18.5f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 13.5f);
        pathBuilder.curveTo(6.0f, 12.67f, 6.67f, 12.0f, 7.5f, 12.0f);
        pathBuilder.reflectiveCurveTo(9.0f, 12.67f, 9.0f, 13.5f);
        pathBuilder.reflectiveCurveTo(8.33f, 15.0f, 7.5f, 15.0f);
        pathBuilder.reflectiveCurveTo(6.0f, 14.33f, 6.0f, 13.5f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 12.93f);
        pathBuilder.curveToRelative(0.65f, -0.09f, 1.34f, -0.28f, 2.0f, -0.6f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.lineToRelative(2.08f, -5.99f);
        pathBuilder.curveTo(5.29f, 4.42f, 5.84f, 4.0f, 6.5f, 4.0f);
        pathBuilder.lineToRelative(4.79f, 0.0f);
        pathBuilder.curveTo(11.1f, 4.63f, 11.0f, 5.31f, 11.0f, 6.0f);
        pathBuilder.horizontalLineTo(6.85f);
        pathBuilder.lineTo(5.81f, 9.0f);
        pathBuilder.horizontalLineToRelative(5.86f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.36f, 0.75f, 0.84f, 1.43f, 1.43f, 2.0f);
        pathBuilder.lineTo(5.0f, 11.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.lineTo(19.0f, 12.93f);
        pathBuilder.close();
        pathBuilder.moveTo(17.91f, 13.0f);
        pathBuilder.curveToRelative(-0.89f, -0.01f, -1.74f, -0.19f, -2.53f, -0.51f);
        pathBuilder.curveTo(15.15f, 12.76f, 15.0f, 13.11f, 15.0f, 13.5f);
        pathBuilder.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.curveTo(18.0f, 13.32f, 17.97f, 13.16f, 17.91f, 13.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _carCrash = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
