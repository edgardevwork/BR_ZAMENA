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

/* compiled from: HdrPlus.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_hdrPlus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HdrPlus", "Landroidx/compose/material/icons/Icons$Rounded;", "getHdrPlus", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHdrPlus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HdrPlus.kt\nandroidx/compose/material/icons/rounded/HdrPlusKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,129:1\n212#2,12:130\n233#2,18:143\n253#2:180\n233#2,18:181\n253#2:218\n233#2,18:219\n253#2:256\n174#3:142\n705#4,2:161\n717#4,2:163\n719#4,11:169\n705#4,2:199\n717#4,2:201\n719#4,11:207\n705#4,2:237\n717#4,2:239\n719#4,11:245\n72#5,4:165\n72#5,4:203\n72#5,4:241\n*S KotlinDebug\n*F\n+ 1 HdrPlus.kt\nandroidx/compose/material/icons/rounded/HdrPlusKt\n*L\n29#1:130,12\n30#1:143,18\n30#1:180\n37#1:181,18\n37#1:218\n44#1:219,18\n44#1:256\n29#1:142\n30#1:161,2\n30#1:163,2\n30#1:169,11\n37#1:199,2\n37#1:201,2\n37#1:207,11\n44#1:237,2\n44#1:239,2\n44#1:245,11\n30#1:165,4\n37#1:203,4\n44#1:241,4\n*E\n"})
/* loaded from: classes.dex */
public final class HdrPlusKt {

    @Nullable
    private static ImageVector _hdrPlus;

    @NotNull
    public static final ImageVector getHdrPlus(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _hdrPlus;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HdrPlus", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.5f, 14.5f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(14.5f, 7.5f);
        pathBuilder2.horizontalLineToRelative(1.5f);
        pathBuilder2.verticalLineToRelative(3.0f);
        pathBuilder2.horizontalLineToRelative(-1.5f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(12.0f, 2.0f);
        pathBuilder3.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder3.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder3.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder3.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.0f, 15.5f);
        pathBuilder3.curveToRelative(0.0f, 0.6f, -0.4f, 1.1f, -0.9f, 1.4f);
        pathBuilder3.lineToRelative(0.49f, 1.13f);
        pathBuilder3.curveToRelative(0.2f, 0.46f, -0.14f, 0.97f, -0.64f, 0.97f);
        pathBuilder3.horizontalLineToRelative(0.0f);
        pathBuilder3.curveToRelative(-0.27f, 0.0f, -0.52f, -0.16f, -0.63f, -0.41f);
        pathBuilder3.lineTo(9.6f, 17.0f);
        pathBuilder3.horizontalLineTo(8.5f);
        pathBuilder3.verticalLineToRelative(1.31f);
        pathBuilder3.curveTo(8.5f, 18.69f, 8.19f, 19.0f, 7.81f, 19.0f);
        pathBuilder3.horizontalLineTo(7.69f);
        pathBuilder3.curveTo(7.31f, 19.0f, 7.0f, 18.69f, 7.0f, 18.31f);
        pathBuilder3.verticalLineTo(14.0f);
        pathBuilder3.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder3.horizontalLineToRelative(2.5f);
        pathBuilder3.curveToRelative(0.82f, 0.0f, 1.5f, 0.68f, 1.5f, 1.5f);
        pathBuilder3.verticalLineTo(15.5f);
        pathBuilder3.close();
        pathBuilder3.moveTo(11.25f, 12.0f);
        pathBuilder3.lineTo(11.25f, 12.0f);
        pathBuilder3.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilder3.verticalLineTo(9.5f);
        pathBuilder3.horizontalLineToRelative(-2.0f);
        pathBuilder3.verticalLineToRelative(1.75f);
        pathBuilder3.curveTo(8.5f, 11.66f, 8.16f, 12.0f, 7.75f, 12.0f);
        pathBuilder3.horizontalLineToRelative(0.0f);
        pathBuilder3.curveTo(7.34f, 12.0f, 7.0f, 11.66f, 7.0f, 11.25f);
        pathBuilder3.verticalLineToRelative(-4.5f);
        pathBuilder3.curveTo(7.0f, 6.34f, 7.34f, 6.0f, 7.75f, 6.0f);
        pathBuilder3.horizontalLineToRelative(0.0f);
        pathBuilder3.curveTo(8.16f, 6.0f, 8.5f, 6.34f, 8.5f, 6.75f);
        pathBuilder3.verticalLineTo(8.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder3.verticalLineTo(6.75f);
        pathBuilder3.curveTo(10.5f, 6.34f, 10.84f, 6.0f, 11.25f, 6.0f);
        pathBuilder3.horizontalLineToRelative(0.0f);
        pathBuilder3.curveTo(11.66f, 6.0f, 12.0f, 6.34f, 12.0f, 6.75f);
        pathBuilder3.verticalLineToRelative(4.5f);
        pathBuilder3.curveTo(12.0f, 11.66f, 11.66f, 12.0f, 11.25f, 12.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(16.75f, 16.0f);
        pathBuilder3.horizontalLineTo(16.0f);
        pathBuilder3.verticalLineToRelative(0.75f);
        pathBuilder3.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilder3.horizontalLineToRelative(0.0f);
        pathBuilder3.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilder3.verticalLineTo(16.0f);
        pathBuilder3.horizontalLineToRelative(-0.75f);
        pathBuilder3.curveTo(13.34f, 16.0f, 13.0f, 15.66f, 13.0f, 15.25f);
        pathBuilder3.verticalLineToRelative(0.0f);
        pathBuilder3.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilder3.horizontalLineToRelative(0.75f);
        pathBuilder3.verticalLineToRelative(-0.75f);
        pathBuilder3.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilder3.horizontalLineToRelative(0.0f);
        pathBuilder3.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilder3.verticalLineToRelative(0.74f);
        pathBuilder3.horizontalLineToRelative(0.75f);
        pathBuilder3.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilder3.verticalLineToRelative(0.01f);
        pathBuilder3.curveTo(17.5f, 15.66f, 17.16f, 16.0f, 16.75f, 16.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(17.5f, 10.5f);
        pathBuilder3.curveToRelative(0.0f, 0.82f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder3.horizontalLineToRelative(-2.5f);
        pathBuilder3.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder3.verticalLineToRelative(-5.0f);
        pathBuilder3.curveTo(13.0f, 6.22f, 13.22f, 6.0f, 13.5f, 6.0f);
        pathBuilder3.horizontalLineTo(16.0f);
        pathBuilder3.curveToRelative(0.83f, 0.0f, 1.5f, 0.68f, 1.5f, 1.5f);
        pathBuilder3.verticalLineTo(10.5f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hdrPlus = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
