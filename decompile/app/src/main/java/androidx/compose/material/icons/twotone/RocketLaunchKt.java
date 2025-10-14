package androidx.compose.material.icons.twotone;

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
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_rocketLaunch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RocketLaunch", "Landroidx/compose/material/icons/Icons$TwoTone;", "getRocketLaunch", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nRocketLaunch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RocketLaunch.kt\nandroidx/compose/material/icons/twotone/RocketLaunchKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,124:1\n212#2,12:125\n233#2,18:138\n253#2:175\n233#2,18:176\n253#2:213\n174#3:137\n705#4,2:156\n717#4,2:158\n719#4,11:164\n705#4,2:194\n717#4,2:196\n719#4,11:202\n72#5,4:160\n72#5,4:198\n*S KotlinDebug\n*F\n+ 1 RocketLaunch.kt\nandroidx/compose/material/icons/twotone/RocketLaunchKt\n*L\n29#1:125,12\n30#1:138,18\n30#1:175\n64#1:176,18\n64#1:213\n29#1:137\n30#1:156,2\n30#1:158,2\n30#1:164,11\n64#1:194,2\n64#1:196,2\n64#1:202,11\n30#1:160,4\n64#1:198,4\n*E\n"})
/* loaded from: classes4.dex */
public final class RocketLaunchKt {

    @Nullable
    private static ImageVector _rocketLaunch;

    @NotNull
    public static final ImageVector getRocketLaunch(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _rocketLaunch;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.RocketLaunch", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.71f, 18.71f);
        pathBuilder.curveToRelative(-0.28f, 0.28f, -2.17f, 0.76f, -2.17f, 0.76f);
        pathBuilder.reflectiveCurveToRelative(0.47f, -1.88f, 0.76f, -2.17f);
        pathBuilder.curveTo(5.47f, 17.11f, 5.72f, 17.0f, 6.0f, 17.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.curveTo(7.0f, 18.28f, 6.89f, 18.53f, 6.71f, 18.71f);
        pathBuilder.close();
        pathBuilder.moveTo(7.41f, 10.83f);
        pathBuilder.lineTo(5.5f, 10.01f);
        pathBuilder.lineToRelative(1.97f, -1.97f);
        pathBuilder.lineToRelative(1.44f, 0.29f);
        pathBuilder.curveTo(8.34f, 9.16f, 7.83f, 10.03f, 7.41f, 10.83f);
        pathBuilder.close();
        pathBuilder.moveTo(13.99f, 18.5f);
        pathBuilder.lineToRelative(-0.82f, -1.91f);
        pathBuilder.curveToRelative(0.8f, -0.42f, 1.67f, -0.93f, 2.49f, -1.5f);
        pathBuilder.lineToRelative(0.29f, 1.44f);
        pathBuilder.lineTo(13.99f, 18.5f);
        pathBuilder.close();
        pathBuilder.moveTo(19.99f, 4.01f);
        pathBuilder.curveToRelative(0.0f, 0.0f, -3.55f, -0.69f, -8.23f, 3.99f);
        pathBuilder.curveToRelative(-1.32f, 1.32f, -2.4f, 3.38f, -2.73f, 4.04f);
        pathBuilder.lineToRelative(2.93f, 2.93f);
        pathBuilder.curveToRelative(0.65f, -0.32f, 2.71f, -1.4f, 4.04f, -2.73f);
        pathBuilder.curveTo(20.68f, 7.56f, 19.99f, 4.01f, 19.99f, 4.01f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 11.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.curveTo(17.0f, 10.1f, 16.1f, 11.0f, 15.0f, 11.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(6.0f, 15.0f);
        pathBuilder2.curveToRelative(-0.83f, 0.0f, -1.58f, 0.34f, -2.12f, 0.88f);
        pathBuilder2.curveTo(2.7f, 17.06f, 2.0f, 22.0f, 2.0f, 22.0f);
        pathBuilder2.reflectiveCurveToRelative(4.94f, -0.7f, 6.12f, -1.88f);
        pathBuilder2.curveTo(8.66f, 19.58f, 9.0f, 18.83f, 9.0f, 18.0f);
        pathBuilder2.curveTo(9.0f, 16.34f, 7.66f, 15.0f, 6.0f, 15.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(6.71f, 18.71f);
        pathBuilder2.curveToRelative(-0.28f, 0.28f, -2.17f, 0.76f, -2.17f, 0.76f);
        pathBuilder2.reflectiveCurveToRelative(0.47f, -1.88f, 0.76f, -2.17f);
        pathBuilder2.curveTo(5.47f, 17.11f, 5.72f, 17.0f, 6.0f, 17.0f);
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder2.curveTo(7.0f, 18.28f, 6.89f, 18.53f, 6.71f, 18.71f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.42f, 13.65f);
        pathBuilder2.lineTo(17.42f, 13.65f);
        pathBuilder2.curveToRelative(6.36f, -6.36f, 4.24f, -11.31f, 4.24f, -11.31f);
        pathBuilder2.reflectiveCurveToRelative(-4.95f, -2.12f, -11.31f, 4.24f);
        pathBuilder2.lineToRelative(-2.49f, -0.5f);
        pathBuilder2.curveTo(7.21f, 5.95f, 6.53f, 6.16f, 6.05f, 6.63f);
        pathBuilder2.lineTo(2.0f, 10.69f);
        pathBuilder2.lineToRelative(5.0f, 2.14f);
        pathBuilder2.lineTo(11.17f, 17.0f);
        pathBuilder2.lineToRelative(2.14f, 5.0f);
        pathBuilder2.lineToRelative(4.05f, -4.05f);
        pathBuilder2.curveToRelative(0.47f, -0.47f, 0.68f, -1.15f, 0.55f, -1.81f);
        pathBuilder2.lineTo(17.42f, 13.65f);
        pathBuilder2.close();
        pathBuilder2.moveTo(7.41f, 10.83f);
        pathBuilder2.lineTo(5.5f, 10.01f);
        pathBuilder2.lineToRelative(1.97f, -1.97f);
        pathBuilder2.lineToRelative(1.44f, 0.29f);
        pathBuilder2.curveTo(8.34f, 9.16f, 7.83f, 10.03f, 7.41f, 10.83f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.99f, 18.5f);
        pathBuilder2.lineToRelative(-0.82f, -1.91f);
        pathBuilder2.curveToRelative(0.8f, -0.42f, 1.67f, -0.93f, 2.49f, -1.5f);
        pathBuilder2.lineToRelative(0.29f, 1.44f);
        pathBuilder2.lineTo(13.99f, 18.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.0f, 12.24f);
        pathBuilder2.curveToRelative(-1.32f, 1.32f, -3.38f, 2.4f, -4.04f, 2.73f);
        pathBuilder2.lineToRelative(-2.93f, -2.93f);
        pathBuilder2.curveToRelative(0.32f, -0.65f, 1.4f, -2.71f, 2.73f, -4.04f);
        pathBuilder2.curveToRelative(4.68f, -4.68f, 8.23f, -3.99f, 8.23f, -3.99f);
        pathBuilder2.reflectiveCurveTo(20.68f, 7.56f, 16.0f, 12.24f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.0f, 11.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder2.reflectiveCurveTo(13.9f, 11.0f, 15.0f, 11.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rocketLaunch = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
