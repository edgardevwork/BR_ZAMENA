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

/* compiled from: RocketLaunch.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_rocketLaunch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RocketLaunch", "Landroidx/compose/material/icons/Icons$Rounded;", "getRocketLaunch", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nRocketLaunch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RocketLaunch.kt\nandroidx/compose/material/icons/rounded/RocketLaunchKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,79:1\n212#2,12:80\n233#2,18:93\n253#2:130\n174#3:92\n705#4,2:111\n717#4,2:113\n719#4,11:119\n72#5,4:115\n*S KotlinDebug\n*F\n+ 1 RocketLaunch.kt\nandroidx/compose/material/icons/rounded/RocketLaunchKt\n*L\n29#1:80,12\n30#1:93,18\n30#1:130\n29#1:92\n30#1:111,2\n30#1:113,2\n30#1:119,11\n30#1:115,4\n*E\n"})
/* loaded from: classes2.dex */
public final class RocketLaunchKt {

    @Nullable
    private static ImageVector _rocketLaunch;

    @NotNull
    public static final ImageVector getRocketLaunch(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _rocketLaunch;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RocketLaunch", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.19f, 6.35f);
        pathBuilder.curveToRelative(-2.04f, 2.29f, -3.44f, 5.58f, -3.57f, 5.89f);
        pathBuilder.lineToRelative(-2.26f, -0.97f);
        pathBuilder.curveToRelative(-0.65f, -0.28f, -0.81f, -1.13f, -0.31f, -1.63f);
        pathBuilder.lineToRelative(3.01f, -3.01f);
        pathBuilder.curveToRelative(0.47f, -0.47f, 1.15f, -0.68f, 1.81f, -0.55f);
        pathBuilder.lineTo(9.19f, 6.35f);
        pathBuilder.lineTo(9.19f, 6.35f);
        pathBuilder.close();
        pathBuilder.moveTo(10.68f, 16.51f);
        pathBuilder.curveToRelative(0.3f, 0.3f, 0.74f, 0.38f, 1.12f, 0.2f);
        pathBuilder.curveToRelative(1.16f, -0.54f, 3.65f, -1.81f, 5.26f, -3.42f);
        pathBuilder.curveToRelative(4.59f, -4.59f, 4.63f, -8.33f, 4.36f, -9.93f);
        pathBuilder.curveToRelative(-0.07f, -0.4f, -0.39f, -0.72f, -0.79f, -0.79f);
        pathBuilder.curveToRelative(-1.6f, -0.27f, -5.34f, -0.23f, -9.93f, 4.36f);
        pathBuilder.curveToRelative(-1.61f, 1.61f, -2.87f, 4.1f, -3.42f, 5.26f);
        pathBuilder.curveToRelative(-0.18f, 0.38f, -0.09f, 0.83f, 0.2f, 1.12f);
        pathBuilder.lineTo(10.68f, 16.51f);
        pathBuilder.close();
        pathBuilder.moveTo(17.65f, 14.81f);
        pathBuilder.curveToRelative(-2.29f, 2.04f, -5.58f, 3.44f, -5.89f, 3.57f);
        pathBuilder.lineToRelative(0.97f, 2.26f);
        pathBuilder.curveToRelative(0.28f, 0.65f, 1.13f, 0.81f, 1.63f, 0.31f);
        pathBuilder.lineToRelative(3.01f, -3.01f);
        pathBuilder.curveToRelative(0.47f, -0.47f, 0.68f, -1.15f, 0.55f, -1.81f);
        pathBuilder.lineTo(17.65f, 14.81f);
        pathBuilder.lineTo(17.65f, 14.81f);
        pathBuilder.close();
        pathBuilder.moveTo(8.94f, 17.41f);
        pathBuilder.curveToRelative(0.2f, 1.06f, -0.15f, 2.04f, -0.82f, 2.71f);
        pathBuilder.curveToRelative(-0.77f, 0.77f, -3.16f, 1.34f, -4.71f, 1.64f);
        pathBuilder.curveToRelative(-0.69f, 0.13f, -1.3f, -0.48f, -1.17f, -1.17f);
        pathBuilder.curveToRelative(0.3f, -1.55f, 0.86f, -3.94f, 1.64f, -4.71f);
        pathBuilder.curveToRelative(0.67f, -0.67f, 1.65f, -1.02f, 2.71f, -0.82f);
        pathBuilder.curveTo(7.76f, 15.28f, 8.72f, 16.24f, 8.94f, 17.41f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(13.0f, 10.1f, 13.0f, 9.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rocketLaunch = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
