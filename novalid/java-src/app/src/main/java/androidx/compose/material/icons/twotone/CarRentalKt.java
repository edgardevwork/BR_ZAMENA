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

/* compiled from: CarRental.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_carRental", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CarRental", "Landroidx/compose/material/icons/Icons$TwoTone;", "getCarRental", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCarRental.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarRental.kt\nandroidx/compose/material/icons/twotone/CarRentalKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,129:1\n212#2,12:130\n233#2,18:143\n253#2:180\n233#2,18:181\n253#2:218\n233#2,18:219\n253#2:256\n233#2,18:257\n253#2:294\n233#2,18:295\n253#2:332\n174#3:142\n705#4,2:161\n717#4,2:163\n719#4,11:169\n705#4,2:199\n717#4,2:201\n719#4,11:207\n705#4,2:237\n717#4,2:239\n719#4,11:245\n705#4,2:275\n717#4,2:277\n719#4,11:283\n705#4,2:313\n717#4,2:315\n719#4,11:321\n72#5,4:165\n72#5,4:203\n72#5,4:241\n72#5,4:279\n72#5,4:317\n*S KotlinDebug\n*F\n+ 1 CarRental.kt\nandroidx/compose/material/icons/twotone/CarRentalKt\n*L\n29#1:130,12\n30#1:143,18\n30#1:180\n52#1:181,18\n52#1:218\n58#1:219,18\n58#1:256\n64#1:257,18\n64#1:294\n103#1:295,18\n103#1:332\n29#1:142\n30#1:161,2\n30#1:163,2\n30#1:169,11\n52#1:199,2\n52#1:201,2\n52#1:207,11\n58#1:237,2\n58#1:239,2\n58#1:245,11\n64#1:275,2\n64#1:277,2\n64#1:283,11\n103#1:313,2\n103#1:315,2\n103#1:321,11\n30#1:165,4\n52#1:203,4\n58#1:241,4\n64#1:279,4\n103#1:317,4\n*E\n"})
/* loaded from: classes3.dex */
public final class CarRentalKt {

    @Nullable
    private static ImageVector _carRental;

    @NotNull
    public static final ImageVector getCarRental(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _carRental;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CarRental", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.0f, 15.01f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(-2.99f);
        pathBuilder.verticalLineTo(15.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineTo(15.01f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 15.5f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveTo(14.45f, 15.5f, 15.0f, 15.5f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 15.5f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveTo(8.45f, 15.5f, 9.0f, 15.5f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(9.0f, 16.5f);
        pathBuilder2.moveToRelative(-1.0f, 0.0f);
        pathBuilder2.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilder2.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(15.0f, 16.5f);
        pathBuilder3.moveToRelative(-1.0f, 0.0f);
        pathBuilder3.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilder3.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(17.25f, 9.6f);
        pathBuilder4.curveToRelative(-0.02f, -0.02f, -0.03f, -0.04f, -0.05f, -0.07f);
        pathBuilder4.curveTo(16.82f, 9.01f, 16.28f, 9.0f, 16.28f, 9.0f);
        pathBuilder4.horizontalLineTo(7.72f);
        pathBuilder4.curveToRelative(0.0f, 0.0f, -0.54f, 0.01f, -0.92f, 0.54f);
        pathBuilder4.curveTo(6.78f, 9.56f, 6.77f, 9.58f, 6.75f, 9.6f);
        pathBuilder4.curveTo(6.68f, 9.71f, 6.61f, 9.84f, 6.56f, 10.0f);
        pathBuilder4.curveTo(6.34f, 10.66f, 5.82f, 12.22f, 5.0f, 14.69f);
        pathBuilder4.verticalLineToRelative(6.5f);
        pathBuilder4.curveTo(5.0f, 21.64f, 5.35f, 22.0f, 5.78f, 22.0f);
        pathBuilder4.horizontalLineToRelative(0.44f);
        pathBuilder4.curveTo(6.65f, 22.0f, 7.0f, 21.64f, 7.0f, 21.19f);
        pathBuilder4.verticalLineTo(20.0f);
        pathBuilder4.horizontalLineToRelative(10.0f);
        pathBuilder4.verticalLineToRelative(1.19f);
        pathBuilder4.curveToRelative(0.0f, 0.45f, 0.34f, 0.81f, 0.78f, 0.81f);
        pathBuilder4.horizontalLineToRelative(0.44f);
        pathBuilder4.curveToRelative(0.43f, 0.0f, 0.78f, -0.36f, 0.78f, -0.81f);
        pathBuilder4.verticalLineToRelative(-6.5f);
        pathBuilder4.curveToRelative(-0.82f, -2.46f, -1.34f, -4.03f, -1.56f, -4.69f);
        pathBuilder4.curveTo(17.39f, 9.84f, 17.32f, 9.71f, 17.25f, 9.6f);
        pathBuilder4.close();
        pathBuilder4.moveTo(8.33f, 11.0f);
        pathBuilder4.horizontalLineToRelative(7.34f);
        pathBuilder4.lineToRelative(0.23f, 0.69f);
        pathBuilder4.lineTo(16.33f, 13.0f);
        pathBuilder4.horizontalLineTo(7.67f);
        pathBuilder4.lineTo(8.33f, 11.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(17.0f, 15.01f);
        pathBuilder4.verticalLineTo(18.0f);
        pathBuilder4.horizontalLineTo(7.0f);
        pathBuilder4.verticalLineToRelative(-2.99f);
        pathBuilder4.verticalLineTo(15.0f);
        pathBuilder4.horizontalLineToRelative(10.0f);
        pathBuilder4.verticalLineTo(15.01f);
        pathBuilder4.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(10.83f, 3.0f);
        pathBuilder5.curveTo(10.41f, 1.83f, 9.3f, 1.0f, 8.0f, 1.0f);
        pathBuilder5.curveTo(6.34f, 1.0f, 5.0f, 2.34f, 5.0f, 4.0f);
        pathBuilder5.curveToRelative(0.0f, 1.65f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder5.curveToRelative(1.3f, 0.0f, 2.41f, -0.84f, 2.83f, -2.0f);
        pathBuilder5.horizontalLineTo(16.0f);
        pathBuilder5.verticalLineToRelative(2.0f);
        pathBuilder5.horizontalLineToRelative(2.0f);
        pathBuilder5.verticalLineTo(5.0f);
        pathBuilder5.horizontalLineToRelative(1.0f);
        pathBuilder5.verticalLineTo(3.0f);
        pathBuilder5.horizontalLineTo(10.83f);
        pathBuilder5.close();
        pathBuilder5.moveTo(8.0f, 5.0f);
        pathBuilder5.curveTo(7.45f, 5.0f, 7.0f, 4.55f, 7.0f, 4.0f);
        pathBuilder5.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder5.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder5.reflectiveCurveTo(8.55f, 5.0f, 8.0f, 5.0f);
        pathBuilder5.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw5, iM11702getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _carRental = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
