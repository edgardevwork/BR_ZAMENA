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

/* compiled from: ShutterSpeed.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_shutterSpeed", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ShutterSpeed", "Landroidx/compose/material/icons/Icons$TwoTone;", "getShutterSpeed", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nShutterSpeed.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShutterSpeed.kt\nandroidx/compose/material/icons/twotone/ShutterSpeedKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,136:1\n212#2,12:137\n233#2,18:150\n253#2:187\n233#2,18:188\n253#2:225\n174#3:149\n705#4,2:168\n717#4,2:170\n719#4,11:176\n705#4,2:206\n717#4,2:208\n719#4,11:214\n72#5,4:172\n72#5,4:210\n*S KotlinDebug\n*F\n+ 1 ShutterSpeed.kt\nandroidx/compose/material/icons/twotone/ShutterSpeedKt\n*L\n29#1:137,12\n30#1:150,18\n30#1:187\n73#1:188,18\n73#1:225\n29#1:149\n30#1:168,2\n30#1:170,2\n30#1:176,11\n73#1:206,2\n73#1:208,2\n73#1:214,11\n30#1:172,4\n73#1:210,4\n*E\n"})
/* loaded from: classes3.dex */
public final class ShutterSpeedKt {

    @Nullable
    private static ImageVector _shutterSpeed;

    @NotNull
    public static final ImageVector getShutterSpeed(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _shutterSpeed;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ShutterSpeed", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 6.0f);
        pathBuilder.curveToRelative(-3.87f, 0.0f, -7.0f, 3.13f, -7.0f, 7.0f);
        pathBuilder.reflectiveCurveToRelative(3.13f, 7.0f, 7.0f, 7.0f);
        pathBuilder.reflectiveCurveToRelative(7.0f, -3.13f, 7.0f, -7.0f);
        pathBuilder.reflectiveCurveToRelative(-3.13f, -7.0f, -7.0f, -7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 7.0f);
        pathBuilder.curveToRelative(0.46f, 0.0f, 0.9f, 0.06f, 1.33f, 0.15f);
        pathBuilder.lineToRelative(-2.72f, 4.7f);
        pathBuilder.lineToRelative(-2.32f, -3.56f);
        pathBuilder.curveTo(9.31f, 7.49f, 10.6f, 7.0f, 12.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, -1.54f, 0.59f, -2.95f, 1.55f, -4.01f);
        pathBuilder.lineTo(10.81f, 14.0f);
        pathBuilder.lineTo(6.09f, 14.0f);
        pathBuilder.curveToRelative(-0.05f, -0.33f, -0.09f, -0.66f, -0.09f, -1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.35f, 15.0f);
        pathBuilder.horizontalLineToRelative(5.33f);
        pathBuilder.lineToRelative(-2.03f, 3.5f);
        pathBuilder.lineToRelative(0.11f, 0.06f);
        pathBuilder.curveToRelative(-1.59f, -0.64f, -2.84f, -1.94f, -3.41f, -3.56f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 19.0f);
        pathBuilder.curveToRelative(-0.48f, 0.0f, -0.94f, -0.06f, -1.39f, -0.17f);
        pathBuilder.lineToRelative(2.85f, -4.92f);
        pathBuilder.lineToRelative(2.11f, 3.9f);
        pathBuilder.curveToRelative(-1.0f, 0.74f, -2.23f, 1.19f, -3.57f, 1.19f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, 1.6f, -0.63f, 3.06f, -1.66f, 4.13f);
        pathBuilder.lineTo(13.57f, 12.0f);
        pathBuilder.horizontalLineToRelative(4.34f);
        pathBuilder.curveToRelative(0.05f, 0.33f, 0.09f, 0.66f, 0.09f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.26f, 11.0f);
        pathBuilder.lineToRelative(2.05f, -3.54f);
        pathBuilder.curveToRelative(1.56f, 0.65f, 2.77f, 1.94f, 3.34f, 3.54f);
        pathBuilder.horizontalLineToRelative(-5.39f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(7.55f, 8.99f);
        pathBuilder2.curveTo(6.59f, 10.05f, 6.0f, 11.46f, 6.0f, 13.0f);
        pathBuilder2.curveToRelative(0.0f, 0.34f, 0.04f, 0.67f, 0.09f, 1.0f);
        pathBuilder2.horizontalLineToRelative(4.72f);
        pathBuilder2.lineTo(7.55f, 8.99f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.31f, 7.46f);
        pathBuilder2.lineTo(12.26f, 11.0f);
        pathBuilder2.horizontalLineToRelative(5.39f);
        pathBuilder2.curveToRelative(-0.57f, -1.6f, -1.78f, -2.89f, -3.34f, -3.54f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.33f, 7.15f);
        pathBuilder2.curveTo(12.9f, 7.06f, 12.46f, 7.0f, 12.0f, 7.0f);
        pathBuilder2.curveToRelative(-1.4f, 0.0f, -2.69f, 0.49f, -3.71f, 1.29f);
        pathBuilder2.lineToRelative(2.32f, 3.56f);
        pathBuilder2.lineToRelative(2.72f, -4.7f);
        pathBuilder2.close();
        pathBuilder2.moveTo(11.68f, 15.0f);
        pathBuilder2.lineTo(6.35f, 15.0f);
        pathBuilder2.curveToRelative(0.57f, 1.62f, 1.82f, 2.92f, 3.41f, 3.56f);
        pathBuilder2.lineToRelative(-0.11f, -0.06f);
        pathBuilder2.lineToRelative(2.03f, -3.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.03f, 7.39f);
        pathBuilder2.lineToRelative(1.42f, -1.42f);
        pathBuilder2.curveToRelative(-0.43f, -0.51f, -0.9f, -0.99f, -1.41f, -1.41f);
        pathBuilder2.lineToRelative(-1.42f, 1.42f);
        pathBuilder2.curveTo(16.07f, 4.74f, 14.12f, 4.0f, 12.0f, 4.0f);
        pathBuilder2.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        pathBuilder2.reflectiveCurveToRelative(4.02f, 9.0f, 9.0f, 9.0f);
        pathBuilder2.reflectiveCurveToRelative(9.0f, -4.03f, 9.0f, -9.0f);
        pathBuilder2.curveToRelative(0.0f, -2.12f, -0.74f, -4.07f, -1.97f, -5.61f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 20.0f);
        pathBuilder2.curveToRelative(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        pathBuilder2.reflectiveCurveToRelative(3.13f, -7.0f, 7.0f, -7.0f);
        pathBuilder2.reflectiveCurveToRelative(7.0f, 3.13f, 7.0f, 7.0f);
        pathBuilder2.reflectiveCurveToRelative(-3.13f, 7.0f, -7.0f, 7.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(9.0f, 1.0f);
        pathBuilder2.horizontalLineToRelative(6.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.lineTo(9.0f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.34f, 17.13f);
        pathBuilder2.curveTo(17.37f, 16.06f, 18.0f, 14.6f, 18.0f, 13.0f);
        pathBuilder2.curveToRelative(0.0f, -0.34f, -0.04f, -0.67f, -0.09f, -1.0f);
        pathBuilder2.horizontalLineToRelative(-4.34f);
        pathBuilder2.lineToRelative(2.77f, 5.13f);
        pathBuilder2.close();
        pathBuilder2.moveTo(10.61f, 18.83f);
        pathBuilder2.curveToRelative(0.45f, 0.11f, 0.91f, 0.17f, 1.39f, 0.17f);
        pathBuilder2.curveToRelative(1.34f, 0.0f, 2.57f, -0.45f, 3.57f, -1.19f);
        pathBuilder2.lineToRelative(-2.11f, -3.9f);
        pathBuilder2.lineToRelative(-2.85f, 4.92f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shutterSpeed = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
