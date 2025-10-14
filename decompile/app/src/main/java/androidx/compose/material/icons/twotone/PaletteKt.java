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

/* compiled from: Palette.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_palette", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Palette", "Landroidx/compose/material/icons/Icons$TwoTone;", "getPalette", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPalette.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Palette.kt\nandroidx/compose/material/icons/twotone/PaletteKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,120:1\n212#2,12:121\n233#2,18:134\n253#2:171\n233#2,18:172\n253#2:209\n233#2,18:210\n253#2:247\n233#2,18:248\n253#2:285\n233#2,18:286\n253#2:323\n233#2,18:324\n253#2:361\n174#3:133\n705#4,2:152\n717#4,2:154\n719#4,11:160\n705#4,2:190\n717#4,2:192\n719#4,11:198\n705#4,2:228\n717#4,2:230\n719#4,11:236\n705#4,2:266\n717#4,2:268\n719#4,11:274\n705#4,2:304\n717#4,2:306\n719#4,11:312\n705#4,2:342\n717#4,2:344\n719#4,11:350\n72#5,4:156\n72#5,4:194\n72#5,4:232\n72#5,4:270\n72#5,4:308\n72#5,4:346\n*S KotlinDebug\n*F\n+ 1 Palette.kt\nandroidx/compose/material/icons/twotone/PaletteKt\n*L\n29#1:121,12\n30#1:134,18\n30#1:171\n67#1:172,18\n67#1:209\n91#1:210,18\n91#1:247\n97#1:248,18\n97#1:285\n103#1:286,18\n103#1:323\n109#1:324,18\n109#1:361\n29#1:133\n30#1:152,2\n30#1:154,2\n30#1:160,11\n67#1:190,2\n67#1:192,2\n67#1:198,11\n91#1:228,2\n91#1:230,2\n91#1:236,11\n97#1:266,2\n97#1:268,2\n97#1:274,11\n103#1:304,2\n103#1:306,2\n103#1:312,11\n109#1:342,2\n109#1:344,2\n109#1:350,11\n30#1:156,4\n67#1:194,4\n91#1:232,4\n97#1:270,4\n103#1:308,4\n109#1:346,4\n*E\n"})
/* loaded from: classes.dex */
public final class PaletteKt {

    @Nullable
    private static ImageVector _palette;

    @NotNull
    public static final ImageVector getPalette(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _palette;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Palette", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.curveToRelative(-4.41f, 0.0f, -8.0f, 3.59f, -8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(3.59f, 8.0f, 8.0f, 8.0f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilder.curveToRelative(0.0f, -0.16f, -0.08f, -0.28f, -0.14f, -0.35f);
        pathBuilder.curveToRelative(-0.41f, -0.46f, -0.63f, -1.05f, -0.63f, -1.65f);
        pathBuilder.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder.curveTo(20.0f, 7.14f, 16.41f, 4.0f, 12.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.5f, 13.0f);
        pathBuilder.curveTo(5.67f, 13.0f, 5.0f, 12.33f, 5.0f, 11.5f);
        pathBuilder.reflectiveCurveTo(5.67f, 10.0f, 6.5f, 10.0f);
        pathBuilder.reflectiveCurveTo(8.0f, 10.67f, 8.0f, 11.5f);
        pathBuilder.reflectiveCurveTo(7.33f, 13.0f, 6.5f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.5f, 9.0f);
        pathBuilder.curveTo(8.67f, 9.0f, 8.0f, 8.33f, 8.0f, 7.5f);
        pathBuilder.reflectiveCurveTo(8.67f, 6.0f, 9.5f, 6.0f);
        pathBuilder.reflectiveCurveTo(11.0f, 6.67f, 11.0f, 7.5f);
        pathBuilder.reflectiveCurveTo(10.33f, 9.0f, 9.5f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.5f, 9.0f);
        pathBuilder.curveTo(13.67f, 9.0f, 13.0f, 8.33f, 13.0f, 7.5f);
        pathBuilder.reflectiveCurveTo(13.67f, 6.0f, 14.5f, 6.0f);
        pathBuilder.reflectiveCurveTo(16.0f, 6.67f, 16.0f, 7.5f);
        pathBuilder.reflectiveCurveTo(15.33f, 9.0f, 14.5f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 11.5f);
        pathBuilder.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(16.0f, 12.33f, 16.0f, 11.5f);
        pathBuilder.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(19.0f, 10.67f, 19.0f, 11.5f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 2.0f);
        pathBuilder2.curveTo(6.49f, 2.0f, 2.0f, 6.49f, 2.0f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(4.49f, 10.0f, 10.0f, 10.0f);
        pathBuilder2.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilder2.curveToRelative(0.0f, -0.61f, -0.23f, -1.21f, -0.64f, -1.67f);
        pathBuilder2.curveToRelative(-0.08f, -0.09f, -0.13f, -0.21f, -0.13f, -0.33f);
        pathBuilder2.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder2.horizontalLineTo(16.0f);
        pathBuilder2.curveToRelative(3.31f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f);
        pathBuilder2.curveTo(22.0f, 6.04f, 17.51f, 2.0f, 12.0f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.0f, 15.0f);
        pathBuilder2.horizontalLineToRelative(-1.77f);
        pathBuilder2.curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f);
        pathBuilder2.curveToRelative(0.0f, 0.61f, 0.22f, 1.19f, 0.63f, 1.65f);
        pathBuilder2.curveToRelative(0.06f, 0.07f, 0.14f, 0.19f, 0.14f, 0.35f);
        pathBuilder2.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilder2.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilder2.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        pathBuilder2.reflectiveCurveToRelative(8.0f, 3.14f, 8.0f, 7.0f);
        pathBuilder2.curveTo(20.0f, 13.21f, 18.21f, 15.0f, 16.0f, 15.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(6.5f, 11.5f);
        pathBuilder3.moveToRelative(-1.5f, 0.0f);
        pathBuilder3.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        pathBuilder3.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(9.5f, 7.5f);
        pathBuilder4.moveToRelative(-1.5f, 0.0f);
        pathBuilder4.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        pathBuilder4.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(14.5f, 7.5f);
        pathBuilder5.moveToRelative(-1.5f, 0.0f);
        pathBuilder5.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        pathBuilder5.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw5, iM11702getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType6 = VectorKt.getDefaultFillType();
        SolidColor solidColor6 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw6 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk86 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(17.5f, 11.5f);
        pathBuilder6.moveToRelative(-1.5f, 0.0f);
        pathBuilder6.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        pathBuilder6.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder6.getNodes(), defaultFillType6, "", solidColor6, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw6, iM11702getBevelLxFBmk86, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _palette = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
