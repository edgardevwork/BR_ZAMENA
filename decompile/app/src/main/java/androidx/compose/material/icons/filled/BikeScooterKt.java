package androidx.compose.material.icons.filled;

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

/* compiled from: BikeScooter.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_bikeScooter", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BikeScooter", "Landroidx/compose/material/icons/Icons$Filled;", "getBikeScooter", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBikeScooter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BikeScooter.kt\nandroidx/compose/material/icons/filled/BikeScooterKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,98:1\n212#2,12:99\n233#2,18:112\n253#2:149\n233#2,18:150\n253#2:187\n233#2,18:188\n253#2:225\n174#3:111\n705#4,2:130\n717#4,2:132\n719#4,11:138\n705#4,2:168\n717#4,2:170\n719#4,11:176\n705#4,2:206\n717#4,2:208\n719#4,11:214\n72#5,4:134\n72#5,4:172\n72#5,4:210\n*S KotlinDebug\n*F\n+ 1 BikeScooter.kt\nandroidx/compose/material/icons/filled/BikeScooterKt\n*L\n29#1:99,12\n30#1:112,18\n30#1:149\n48#1:150,18\n48#1:187\n79#1:188,18\n79#1:225\n29#1:111\n30#1:130,2\n30#1:132,2\n30#1:138,11\n48#1:168,2\n48#1:170,2\n48#1:176,11\n79#1:206,2\n79#1:208,2\n79#1:214,11\n30#1:134,4\n48#1:172,4\n79#1:210,4\n*E\n"})
/* loaded from: classes2.dex */
public final class BikeScooterKt {

    @Nullable
    private static ImageVector _bikeScooter;

    @NotNull
    public static final ImageVector getBikeScooter(@NotNull Icons.Filled filled) {
        ImageVector imageVector = _bikeScooter;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.BikeScooter", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(0.74f);
        pathBuilder.lineTo(8.82f, 5.56f);
        pathBuilder.curveTo(8.61f, 4.65f, 7.8f, 4.0f, 6.87f, 4.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(3.87f);
        pathBuilder.lineToRelative(1.42f, 6.25f);
        pathBuilder.curveToRelative(0.0f, 0.0f, -0.01f, 0.0f, -0.01f, 0.0f);
        pathBuilder.curveTo(6.12f, 12.9f, 4.47f, 14.73f, 4.09f, 17.0f);
        pathBuilder.horizontalLineTo(0.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.curveTo(6.0f, 15.79f, 7.79f, 14.0f, 10.0f, 14.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(19.0f, 8.0f);
        pathBuilder2.horizontalLineToRelative(-0.82f);
        pathBuilder2.lineToRelative(-1.35f, -3.69f);
        pathBuilder2.curveTo(16.55f, 3.52f, 15.8f, 3.0f, 14.96f, 3.0f);
        pathBuilder2.horizontalLineTo(11.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(3.96f);
        pathBuilder2.lineToRelative(1.1f, 3.0f);
        pathBuilder2.horizontalLineTo(10.4f);
        pathBuilder2.lineToRelative(0.46f, 2.0f);
        pathBuilder2.horizontalLineTo(15.0f);
        pathBuilder2.curveToRelative(-0.43f, 0.58f, -0.75f, 1.25f, -0.9f, 2.0f);
        pathBuilder2.horizontalLineToRelative(-2.79f);
        pathBuilder2.lineToRelative(0.46f, 2.0f);
        pathBuilder2.horizontalLineToRelative(2.33f);
        pathBuilder2.curveToRelative(0.44f, 2.23f, 2.31f, 3.88f, 4.65f, 3.99f);
        pathBuilder2.curveToRelative(2.8f, 0.13f, 5.25f, -2.19f, 5.25f, -5.0f);
        pathBuilder2.curveTo(24.0f, 10.2f, 21.8f, 8.0f, 19.0f, 8.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 16.0f);
        pathBuilder2.curveToRelative(-1.68f, 0.0f, -3.0f, -1.32f, -3.0f, -3.0f);
        pathBuilder2.curveToRelative(0.0f, -0.93f, 0.41f, -1.73f, 1.05f, -2.28f);
        pathBuilder2.lineToRelative(0.96f, 2.64f);
        pathBuilder2.lineToRelative(1.88f, -0.68f);
        pathBuilder2.lineToRelative(-0.97f, -2.67f);
        pathBuilder2.curveToRelative(0.03f, 0.0f, 0.06f, -0.01f, 0.09f, -0.01f);
        pathBuilder2.curveToRelative(1.68f, 0.0f, 3.0f, 1.32f, 3.0f, 3.0f);
        pathBuilder2.reflectiveCurveTo(20.68f, 16.0f, 19.0f, 16.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(10.0f, 15.0f);
        pathBuilder3.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilder3.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder3.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder3.reflectiveCurveTo(11.66f, 15.0f, 10.0f, 15.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(10.0f, 19.0f);
        pathBuilder3.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder3.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder3.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder3.reflectiveCurveTo(10.55f, 19.0f, 10.0f, 19.0f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bikeScooter = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
