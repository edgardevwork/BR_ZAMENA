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

/* compiled from: SensorOccupied.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_sensorOccupied", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SensorOccupied", "Landroidx/compose/material/icons/Icons$Rounded;", "getSensorOccupied", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSensorOccupied.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SensorOccupied.kt\nandroidx/compose/material/icons/rounded/SensorOccupiedKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,104:1\n212#2,12:105\n233#2,18:118\n253#2:155\n233#2,18:156\n253#2:193\n233#2,18:194\n253#2:231\n233#2,18:232\n253#2:269\n233#2,18:270\n253#2:307\n233#2,18:308\n253#2:345\n174#3:117\n705#4,2:136\n717#4,2:138\n719#4,11:144\n705#4,2:174\n717#4,2:176\n719#4,11:182\n705#4,2:212\n717#4,2:214\n719#4,11:220\n705#4,2:250\n717#4,2:252\n719#4,11:258\n705#4,2:288\n717#4,2:290\n719#4,11:296\n705#4,2:326\n717#4,2:328\n719#4,11:334\n72#5,4:140\n72#5,4:178\n72#5,4:216\n72#5,4:254\n72#5,4:292\n72#5,4:330\n*S KotlinDebug\n*F\n+ 1 SensorOccupied.kt\nandroidx/compose/material/icons/rounded/SensorOccupiedKt\n*L\n29#1:105,12\n30#1:118,18\n30#1:155\n38#1:156,18\n38#1:193\n51#1:194,18\n51#1:231\n63#1:232,18\n63#1:269\n75#1:270,18\n75#1:307\n87#1:308,18\n87#1:345\n29#1:117\n30#1:136,2\n30#1:138,2\n30#1:144,11\n38#1:174,2\n38#1:176,2\n38#1:182,11\n51#1:212,2\n51#1:214,2\n51#1:220,11\n63#1:250,2\n63#1:252,2\n63#1:258,11\n75#1:288,2\n75#1:290,2\n75#1:296,11\n87#1:326,2\n87#1:328,2\n87#1:334,11\n30#1:140,4\n38#1:178,4\n51#1:216,4\n63#1:254,4\n75#1:292,4\n87#1:330,4\n*E\n"})
/* loaded from: classes4.dex */
public final class SensorOccupiedKt {

    @Nullable
    private static ImageVector _sensorOccupied;

    @NotNull
    public static final ImageVector getSensorOccupied(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _sensorOccupied;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SensorOccupied", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 11.0f);
        pathBuilder.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveTo(9.0f, 6.34f, 9.0f, 8.0f);
        pathBuilder.reflectiveCurveTo(10.34f, 11.0f, 12.0f, 11.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 12.0f);
        pathBuilder2.curveToRelative(-1.84f, 0.0f, -3.56f, 0.5f, -5.03f, 1.37f);
        pathBuilder2.curveTo(6.36f, 13.73f, 6.0f, 14.39f, 6.0f, 15.09f);
        pathBuilder2.lineTo(6.0f, 16.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder2.horizontalLineToRelative(10.0f);
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder2.lineToRelative(0.0f, -0.91f);
        pathBuilder2.curveToRelative(0.0f, -0.7f, -0.36f, -1.36f, -0.97f, -1.72f);
        pathBuilder2.curveTo(15.56f, 12.5f, 13.84f, 12.0f, 12.0f, 12.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(22.11f, 7.79f);
        pathBuilder3.lineTo(22.11f, 7.79f);
        pathBuilder3.curveToRelative(0.55f, -0.23f, 0.78f, -0.88f, 0.5f, -1.41f);
        pathBuilder3.curveToRelative(-1.13f, -2.12f, -2.87f, -3.86f, -4.99f, -4.99f);
        pathBuilder3.curveToRelative(-0.52f, -0.28f, -1.17f, -0.04f, -1.4f, 0.5f);
        pathBuilder3.verticalLineToRelative(0.0f);
        pathBuilder3.curveToRelative(-0.19f, 0.47f, -0.01f, 1.02f, 0.43f, 1.25f);
        pathBuilder3.curveToRelative(1.79f, 0.94f, 3.26f, 2.42f, 4.21f, 4.21f);
        pathBuilder3.curveTo(21.09f, 7.8f, 21.64f, 7.98f, 22.11f, 7.79f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(7.79f, 1.89f);
        pathBuilder4.lineTo(7.79f, 1.89f);
        pathBuilder4.curveToRelative(-0.23f, -0.55f, -0.88f, -0.78f, -1.4f, -0.5f);
        pathBuilder4.curveTo(4.27f, 2.52f, 2.52f, 4.26f, 1.4f, 6.38f);
        pathBuilder4.curveToRelative(-0.28f, 0.52f, -0.05f, 1.18f, 0.5f, 1.41f);
        pathBuilder4.lineToRelative(0.0f, 0.0f);
        pathBuilder4.curveToRelative(0.47f, 0.2f, 1.02f, 0.01f, 1.25f, -0.43f);
        pathBuilder4.curveToRelative(0.94f, -1.79f, 2.42f, -3.26f, 4.21f, -4.21f);
        pathBuilder4.curveTo(7.8f, 2.91f, 7.98f, 2.36f, 7.79f, 1.89f);
        pathBuilder4.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(1.89f, 16.21f);
        pathBuilder5.lineTo(1.89f, 16.21f);
        pathBuilder5.curveToRelative(-0.55f, 0.23f, -0.78f, 0.88f, -0.5f, 1.4f);
        pathBuilder5.curveToRelative(1.13f, 2.12f, 2.87f, 3.87f, 5.0f, 5.0f);
        pathBuilder5.curveToRelative(0.52f, 0.28f, 1.17f, 0.04f, 1.4f, -0.5f);
        pathBuilder5.lineToRelative(0.0f, 0.0f);
        pathBuilder5.curveToRelative(0.19f, -0.47f, 0.01f, -1.02f, -0.43f, -1.25f);
        pathBuilder5.curveToRelative(-1.79f, -0.94f, -3.26f, -2.42f, -4.21f, -4.21f);
        pathBuilder5.curveTo(2.91f, 16.2f, 2.36f, 16.02f, 1.89f, 16.21f);
        pathBuilder5.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw5, iM11702getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType6 = VectorKt.getDefaultFillType();
        SolidColor solidColor6 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw6 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk86 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(16.21f, 22.11f);
        pathBuilder6.lineTo(16.21f, 22.11f);
        pathBuilder6.curveToRelative(0.23f, 0.55f, 0.88f, 0.78f, 1.4f, 0.5f);
        pathBuilder6.curveToRelative(2.12f, -1.13f, 3.87f, -2.87f, 5.0f, -5.0f);
        pathBuilder6.curveToRelative(0.28f, -0.52f, 0.04f, -1.17f, -0.5f, -1.4f);
        pathBuilder6.horizontalLineToRelative(0.0f);
        pathBuilder6.curveToRelative(-0.47f, -0.19f, -1.02f, -0.01f, -1.25f, 0.43f);
        pathBuilder6.curveToRelative(-0.94f, 1.79f, -2.42f, 3.26f, -4.21f, 4.21f);
        pathBuilder6.curveTo(16.2f, 21.09f, 16.02f, 21.64f, 16.21f, 22.11f);
        pathBuilder6.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder6.getNodes(), defaultFillType6, "", solidColor6, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw6, iM11702getBevelLxFBmk86, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sensorOccupied = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
