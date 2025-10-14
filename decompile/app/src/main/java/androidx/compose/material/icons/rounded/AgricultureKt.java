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

/* compiled from: Agriculture.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_agriculture", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Agriculture", "Landroidx/compose/material/icons/Icons$Rounded;", "getAgriculture", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAgriculture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Agriculture.kt\nandroidx/compose/material/icons/rounded/AgricultureKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,129:1\n212#2,12:130\n233#2,18:143\n253#2:180\n233#2,18:181\n253#2:218\n233#2,18:219\n253#2:256\n233#2,18:257\n253#2:294\n174#3:142\n705#4,2:161\n717#4,2:163\n719#4,11:169\n705#4,2:199\n717#4,2:201\n719#4,11:207\n705#4,2:237\n717#4,2:239\n719#4,11:245\n705#4,2:275\n717#4,2:277\n719#4,11:283\n72#5,4:165\n72#5,4:203\n72#5,4:241\n72#5,4:279\n*S KotlinDebug\n*F\n+ 1 Agriculture.kt\nandroidx/compose/material/icons/rounded/AgricultureKt\n*L\n29#1:130,12\n30#1:143,18\n30#1:180\n55#1:181,18\n55#1:218\n69#1:219,18\n69#1:256\n78#1:257,18\n78#1:294\n29#1:142\n30#1:161,2\n30#1:163,2\n30#1:169,11\n55#1:199,2\n55#1:201,2\n55#1:207,11\n69#1:237,2\n69#1:239,2\n69#1:245,11\n78#1:275,2\n78#1:277,2\n78#1:283,11\n30#1:165,4\n55#1:203,4\n69#1:241,4\n78#1:279,4\n*E\n"})
/* loaded from: classes4.dex */
public final class AgricultureKt {

    @Nullable
    private static ImageVector _agriculture;

    @NotNull
    public static final ImageVector getAgriculture(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _agriculture;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Agriculture", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.5f, 11.97f);
        pathBuilder.curveToRelative(0.93f, 0.0f, 1.78f, 0.28f, 2.5f, 0.76f);
        pathBuilder.verticalLineTo(7.97f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(-6.29f);
        pathBuilder.lineToRelative(-1.06f, -1.06f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        pathBuilder.reflectiveCurveToRelative(-0.51f, -0.2f, -0.71f, 0.0f);
        pathBuilder.lineToRelative(-2.83f, 2.83f);
        pathBuilder.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.lineTo(13.0f, 6.68f);
        pathBuilder.verticalLineToRelative(2.29f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(-0.54f);
        pathBuilder.curveToRelative(0.95f, 1.06f, 1.54f, 2.46f, 1.54f, 4.0f);
        pathBuilder.curveToRelative(0.0f, 0.34f, -0.04f, 0.67f, -0.09f, 1.0f);
        pathBuilder.horizontalLineToRelative(3.14f);
        pathBuilder.curveTo(15.3f, 13.73f, 17.19f, 11.97f, 19.5f, 11.97f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(19.5f, 12.97f);
        pathBuilder2.curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f);
        pathBuilder2.reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f);
        pathBuilder2.reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder2.reflectiveCurveTo(21.43f, 12.97f, 19.5f, 12.97f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.5f, 17.97f);
        pathBuilder2.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder2.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder2.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder2.reflectiveCurveTo(20.33f, 17.97f, 19.5f, 17.97f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(4.0f, 8.97f);
        pathBuilder3.horizontalLineToRelative(5.0f);
        pathBuilder3.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder3.horizontalLineTo(4.0f);
        pathBuilder3.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder3.curveTo(3.0f, 8.53f, 3.45f, 8.97f, 4.0f, 8.97f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(9.83f, 13.79f);
        pathBuilder4.lineToRelative(-0.18f, -0.47f);
        pathBuilder4.lineToRelative(0.93f, -0.35f);
        pathBuilder4.curveToRelative(-0.46f, -1.06f, -1.28f, -1.91f, -2.31f, -2.43f);
        pathBuilder4.lineToRelative(-0.4f, 0.89f);
        pathBuilder4.lineToRelative(-0.46f, -0.21f);
        pathBuilder4.lineToRelative(0.4f, -0.9f);
        pathBuilder4.curveTo(7.26f, 10.11f, 6.64f, 9.97f, 6.0f, 9.97f);
        pathBuilder4.curveToRelative(-0.53f, 0.0f, -1.04f, 0.11f, -1.52f, 0.26f);
        pathBuilder4.lineToRelative(0.34f, 0.91f);
        pathBuilder4.lineToRelative(-0.47f, 0.18f);
        pathBuilder4.lineTo(4.0f, 10.4f);
        pathBuilder4.curveToRelative(-1.06f, 0.46f, -1.91f, 1.28f, -2.43f, 2.31f);
        pathBuilder4.lineToRelative(0.89f, 0.4f);
        pathBuilder4.lineToRelative(-0.21f, 0.46f);
        pathBuilder4.lineToRelative(-0.9f, -0.4f);
        pathBuilder4.curveTo(1.13f, 13.72f, 1.0f, 14.33f, 1.0f, 14.97f);
        pathBuilder4.curveToRelative(0.0f, 0.53f, 0.11f, 1.04f, 0.26f, 1.52f);
        pathBuilder4.lineToRelative(0.91f, -0.34f);
        pathBuilder4.lineToRelative(0.18f, 0.47f);
        pathBuilder4.lineToRelative(-0.93f, 0.35f);
        pathBuilder4.curveToRelative(0.46f, 1.06f, 1.28f, 1.91f, 2.31f, 2.43f);
        pathBuilder4.lineToRelative(0.4f, -0.89f);
        pathBuilder4.lineToRelative(0.46f, 0.21f);
        pathBuilder4.lineToRelative(-0.4f, 0.9f);
        pathBuilder4.curveToRelative(0.57f, 0.22f, 1.18f, 0.35f, 1.82f, 0.35f);
        pathBuilder4.curveToRelative(0.53f, 0.0f, 1.04f, -0.11f, 1.52f, -0.26f);
        pathBuilder4.lineTo(7.18f, 18.8f);
        pathBuilder4.lineToRelative(0.47f, -0.18f);
        pathBuilder4.lineTo(8.0f, 19.55f);
        pathBuilder4.curveToRelative(1.06f, -0.46f, 1.91f, -1.28f, 2.43f, -2.31f);
        pathBuilder4.lineToRelative(-0.89f, -0.4f);
        pathBuilder4.lineToRelative(0.21f, -0.46f);
        pathBuilder4.lineToRelative(0.9f, 0.4f);
        pathBuilder4.curveToRelative(0.22f, -0.57f, 0.35f, -1.18f, 0.35f, -1.82f);
        pathBuilder4.curveToRelative(0.0f, -0.53f, -0.11f, -1.04f, -0.26f, -1.52f);
        pathBuilder4.lineTo(9.83f, 13.79f);
        pathBuilder4.close();
        pathBuilder4.moveTo(7.15f, 17.75f);
        pathBuilder4.curveToRelative(-1.53f, 0.63f, -3.29f, -0.09f, -3.92f, -1.62f);
        pathBuilder4.curveToRelative(-0.63f, -1.53f, 0.09f, -3.29f, 1.62f, -3.92f);
        pathBuilder4.curveToRelative(1.53f, -0.63f, 3.29f, 0.09f, 3.92f, 1.62f);
        pathBuilder4.curveTo(9.41f, 15.36f, 8.68f, 17.11f, 7.15f, 17.75f);
        pathBuilder4.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _agriculture = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
