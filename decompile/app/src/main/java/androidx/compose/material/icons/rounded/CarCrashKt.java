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

/* compiled from: CarCrash.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_carCrash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CarCrash", "Landroidx/compose/material/icons/Icons$Rounded;", "getCarCrash", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCarCrash.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarCrash.kt\nandroidx/compose/material/icons/rounded/CarCrashKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,88:1\n212#2,12:89\n233#2,18:102\n253#2:139\n174#3:101\n705#4,2:120\n717#4,2:122\n719#4,11:128\n72#5,4:124\n*S KotlinDebug\n*F\n+ 1 CarCrash.kt\nandroidx/compose/material/icons/rounded/CarCrashKt\n*L\n29#1:89,12\n30#1:102,18\n30#1:139\n29#1:101\n30#1:120,2\n30#1:122,2\n30#1:128,11\n30#1:124,4\n*E\n"})
/* loaded from: classes3.dex */
public final class CarCrashKt {

    @Nullable
    private static ImageVector _carCrash;

    @NotNull
    public static final ImageVector getCarCrash(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _carCrash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CarCrash", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        pathBuilder.moveTo(18.0f, 7.0f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveTo(17.5f, 3.22f, 17.72f, 3.0f, 18.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.curveTo(18.5f, 6.78f, 18.28f, 7.0f, 18.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.5f, 8.5f);
        pathBuilder.curveTo(18.5f, 8.78f, 18.28f, 9.0f, 18.0f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.reflectiveCurveTo(17.72f, 8.0f, 18.0f, 8.0f);
        pathBuilder.reflectiveCurveTo(18.5f, 8.22f, 18.5f, 8.5f);
        pathBuilder.close();
        pathBuilder.moveTo(19.5f, 20.0f);
        pathBuilder.curveToRelative(0.82f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.verticalLineToRelative(-6.18f);
        pathBuilder.curveToRelative(-1.05f, 0.51f, -2.16f, 0.69f, -3.09f, 0.68f);
        pathBuilder.curveToRelative(0.06f, 0.16f, 0.09f, 0.33f, 0.09f, 0.5f);
        pathBuilder.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(15.0f, 14.33f, 15.0f, 13.5f);
        pathBuilder.curveToRelative(0.0f, -0.39f, 0.15f, -0.74f, 0.39f, -1.01f);
        pathBuilder.curveToRelative(-1.63f, -0.66f, -2.96f, -1.91f, -3.71f, -3.49f);
        pathBuilder.horizontalLineTo(5.81f);
        pathBuilder.lineToRelative(1.04f, -3.0f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.curveToRelative(0.0f, -0.69f, 0.1f, -1.37f, 0.29f, -2.0f);
        pathBuilder.horizontalLineTo(6.5f);
        pathBuilder.curveTo(5.84f, 4.0f, 5.29f, 4.42f, 5.08f, 5.01f);
        pathBuilder.lineToRelative(-1.97f, 5.67f);
        pathBuilder.curveTo(3.04f, 10.89f, 3.0f, 11.11f, 3.0f, 11.34f);
        pathBuilder.verticalLineToRelative(7.16f);
        pathBuilder.curveTo(3.0f, 19.33f, 3.67f, 20.0f, 4.5f, 20.0f);
        pathBuilder.reflectiveCurveTo(6.0f, 19.33f, 6.0f, 18.5f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineToRelative(0.5f);
        pathBuilder.curveTo(18.0f, 19.33f, 18.68f, 20.0f, 19.5f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.5f, 15.0f);
        pathBuilder.curveTo(6.67f, 15.0f, 6.0f, 14.33f, 6.0f, 13.5f);
        pathBuilder.reflectiveCurveTo(6.67f, 12.0f, 7.5f, 12.0f);
        pathBuilder.reflectiveCurveTo(9.0f, 12.67f, 9.0f, 13.5f);
        pathBuilder.reflectiveCurveTo(8.33f, 15.0f, 7.5f, 15.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _carCrash = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
