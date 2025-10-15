package androidx.compose.material.icons.sharp;

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

/* compiled from: Fitbit.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_fitbit", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Fitbit", "Landroidx/compose/material/icons/Icons$Sharp;", "getFitbit", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFitbit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Fitbit.kt\nandroidx/compose/material/icons/sharp/FitbitKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,115:1\n212#2,12:116\n233#2,18:129\n253#2:166\n174#3:128\n705#4,2:147\n717#4,2:149\n719#4,11:155\n72#5,4:151\n*S KotlinDebug\n*F\n+ 1 Fitbit.kt\nandroidx/compose/material/icons/sharp/FitbitKt\n*L\n29#1:116,12\n30#1:129,18\n30#1:166\n29#1:128\n30#1:147,2\n30#1:149,2\n30#1:155,11\n30#1:151,4\n*E\n"})
/* loaded from: classes.dex */
public final class FitbitKt {

    @Nullable
    private static ImageVector _fitbit;

    @NotNull
    public static final ImageVector getFitbit(@NotNull Icons.Sharp sharp) {
        ImageVector imageVector = _fitbit;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Fitbit", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.89f, 13.89f);
        pathBuilder.curveToRelative(1.04f, 0.0f, 1.89f, -0.85f, 1.89f, -1.89f);
        pathBuilder.reflectiveCurveToRelative(-0.85f, -1.89f, -1.89f, -1.89f);
        pathBuilder.curveTo(18.85f, 10.11f, 18.0f, 10.96f, 18.0f, 12.0f);
        pathBuilder.reflectiveCurveTo(18.85f, 13.89f, 19.89f, 13.89f);
        pathBuilder.close();
        pathBuilder.moveTo(15.65f, 13.68f);
        pathBuilder.curveToRelative(0.93f, 0.0f, 1.68f, -0.75f, 1.68f, -1.68f);
        pathBuilder.reflectiveCurveToRelative(-0.75f, -1.68f, -1.68f, -1.68f);
        pathBuilder.curveToRelative(-0.93f, 0.0f, -1.68f, 0.75f, -1.68f, 1.68f);
        pathBuilder.reflectiveCurveTo(14.72f, 13.68f, 15.65f, 13.68f);
        pathBuilder.close();
        pathBuilder.moveTo(15.65f, 9.42f);
        pathBuilder.curveToRelative(0.93f, 0.0f, 1.68f, -0.75f, 1.68f, -1.68f);
        pathBuilder.curveToRelative(0.0f, -0.93f, -0.75f, -1.68f, -1.68f, -1.68f);
        pathBuilder.curveToRelative(-0.93f, 0.0f, -1.68f, 0.75f, -1.68f, 1.68f);
        pathBuilder.curveTo(13.97f, 8.67f, 14.72f, 9.42f, 15.65f, 9.42f);
        pathBuilder.close();
        pathBuilder.moveTo(15.65f, 17.93f);
        pathBuilder.curveToRelative(0.93f, 0.0f, 1.68f, -0.75f, 1.68f, -1.68f);
        pathBuilder.curveToRelative(0.0f, -0.93f, -0.75f, -1.68f, -1.68f, -1.68f);
        pathBuilder.curveToRelative(-0.93f, 0.0f, -1.68f, 0.75f, -1.68f, 1.68f);
        pathBuilder.curveTo(13.97f, 17.17f, 14.72f, 17.93f, 15.65f, 17.93f);
        pathBuilder.close();
        pathBuilder.moveTo(11.41f, 13.47f);
        pathBuilder.curveToRelative(0.81f, 0.0f, 1.47f, -0.66f, 1.47f, -1.47f);
        pathBuilder.reflectiveCurveToRelative(-0.66f, -1.47f, -1.47f, -1.47f);
        pathBuilder.curveToRelative(-0.81f, 0.0f, -1.47f, 0.66f, -1.47f, 1.47f);
        pathBuilder.reflectiveCurveTo(10.59f, 13.47f, 11.41f, 13.47f);
        pathBuilder.close();
        pathBuilder.moveTo(11.41f, 9.21f);
        pathBuilder.curveToRelative(0.81f, 0.0f, 1.47f, -0.66f, 1.47f, -1.47f);
        pathBuilder.reflectiveCurveToRelative(-0.66f, -1.47f, -1.47f, -1.47f);
        pathBuilder.curveToRelative(-0.81f, 0.0f, -1.47f, 0.66f, -1.47f, 1.47f);
        pathBuilder.reflectiveCurveTo(10.59f, 9.21f, 11.41f, 9.21f);
        pathBuilder.close();
        pathBuilder.moveTo(11.41f, 17.73f);
        pathBuilder.curveToRelative(0.81f, 0.0f, 1.47f, -0.66f, 1.47f, -1.47f);
        pathBuilder.curveToRelative(0.0f, -0.81f, -0.66f, -1.47f, -1.47f, -1.47f);
        pathBuilder.curveToRelative(-0.81f, 0.0f, -1.47f, 0.66f, -1.47f, 1.47f);
        pathBuilder.curveTo(9.93f, 17.07f, 10.59f, 17.73f, 11.41f, 17.73f);
        pathBuilder.close();
        pathBuilder.moveTo(11.41f, 22.0f);
        pathBuilder.curveToRelative(0.81f, 0.0f, 1.47f, -0.66f, 1.47f, -1.47f);
        pathBuilder.curveToRelative(0.0f, -0.81f, -0.66f, -1.47f, -1.47f, -1.47f);
        pathBuilder.curveToRelative(-0.81f, 0.0f, -1.47f, 0.66f, -1.47f, 1.47f);
        pathBuilder.curveTo(9.93f, 21.34f, 10.59f, 22.0f, 11.41f, 22.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.41f, 4.94f);
        pathBuilder.curveToRelative(0.81f, 0.0f, 1.47f, -0.66f, 1.47f, -1.47f);
        pathBuilder.reflectiveCurveTo(12.22f, 2.0f, 11.41f, 2.0f);
        pathBuilder.curveToRelative(-0.81f, 0.0f, -1.47f, 0.66f, -1.47f, 1.47f);
        pathBuilder.reflectiveCurveTo(10.59f, 4.94f, 11.41f, 4.94f);
        pathBuilder.close();
        pathBuilder.moveTo(7.16f, 13.26f);
        pathBuilder.curveToRelative(0.7f, 0.0f, 1.26f, -0.57f, 1.26f, -1.26f);
        pathBuilder.reflectiveCurveToRelative(-0.57f, -1.26f, -1.26f, -1.26f);
        pathBuilder.curveToRelative(-0.7f, 0.0f, -1.26f, 0.57f, -1.26f, 1.26f);
        pathBuilder.reflectiveCurveTo(6.46f, 13.26f, 7.16f, 13.26f);
        pathBuilder.close();
        pathBuilder.moveTo(7.16f, 17.51f);
        pathBuilder.curveToRelative(0.7f, 0.0f, 1.26f, -0.57f, 1.26f, -1.26f);
        pathBuilder.curveToRelative(0.0f, -0.7f, -0.57f, -1.26f, -1.26f, -1.26f);
        pathBuilder.curveToRelative(-0.7f, 0.0f, -1.26f, 0.57f, -1.26f, 1.26f);
        pathBuilder.curveTo(5.9f, 16.94f, 6.46f, 17.51f, 7.16f, 17.51f);
        pathBuilder.close();
        pathBuilder.moveTo(7.16f, 9.02f);
        pathBuilder.curveToRelative(0.7f, 0.0f, 1.26f, -0.57f, 1.26f, -1.26f);
        pathBuilder.curveToRelative(0.0f, -0.7f, -0.57f, -1.26f, -1.26f, -1.26f);
        pathBuilder.curveToRelative(-0.7f, 0.0f, -1.26f, 0.57f, -1.26f, 1.26f);
        pathBuilder.curveTo(5.9f, 8.45f, 6.46f, 9.02f, 7.16f, 9.02f);
        pathBuilder.close();
        pathBuilder.moveTo(3.29f, 13.05f);
        pathBuilder.curveToRelative(0.58f, 0.0f, 1.05f, -0.47f, 1.05f, -1.05f);
        pathBuilder.reflectiveCurveToRelative(-0.47f, -1.05f, -1.05f, -1.05f);
        pathBuilder.curveToRelative(-0.58f, 0.0f, -1.05f, 0.47f, -1.05f, 1.05f);
        pathBuilder.reflectiveCurveTo(2.71f, 13.05f, 3.29f, 13.05f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fitbit = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
