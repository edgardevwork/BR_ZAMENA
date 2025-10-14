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

/* compiled from: EnergySavingsLeaf.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_energySavingsLeaf", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EnergySavingsLeaf", "Landroidx/compose/material/icons/Icons$TwoTone;", "getEnergySavingsLeaf", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nEnergySavingsLeaf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnergySavingsLeaf.kt\nandroidx/compose/material/icons/twotone/EnergySavingsLeafKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,100:1\n212#2,12:101\n233#2,18:114\n253#2:151\n233#2,18:152\n253#2:189\n233#2,18:190\n253#2:227\n174#3:113\n705#4,2:132\n717#4,2:134\n719#4,11:140\n705#4,2:170\n717#4,2:172\n719#4,11:178\n705#4,2:208\n717#4,2:210\n719#4,11:216\n72#5,4:136\n72#5,4:174\n72#5,4:212\n*S KotlinDebug\n*F\n+ 1 EnergySavingsLeaf.kt\nandroidx/compose/material/icons/twotone/EnergySavingsLeafKt\n*L\n29#1:101,12\n30#1:114,18\n30#1:151\n55#1:152,18\n55#1:189\n79#1:190,18\n79#1:227\n29#1:113\n30#1:132,2\n30#1:134,2\n30#1:140,11\n55#1:170,2\n55#1:172,2\n55#1:178,11\n79#1:208,2\n79#1:210,2\n79#1:216,11\n30#1:136,4\n55#1:174,4\n79#1:212,4\n*E\n"})
/* loaded from: classes4.dex */
public final class EnergySavingsLeafKt {

    @Nullable
    private static ImageVector _energySavingsLeaf;

    @NotNull
    public static final ImageVector getEnergySavingsLeaf(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _energySavingsLeaf;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.EnergySavingsLeaf", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.1f, 7.01f);
        pathBuilder.curveTo(5.74f, 8.32f, 5.0f, 10.1f, 5.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 3.86f, 3.14f, 7.0f, 7.0f, 7.0f);
        pathBuilder.curveToRelative(1.87f, 0.0f, 3.63f, -0.73f, 4.95f, -2.05f);
        pathBuilder.curveTo(18.27f, 15.63f, 19.0f, 13.87f, 19.0f, 12.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineToRelative(-7.0f);
        pathBuilder.curveTo(10.16f, 5.0f, 8.42f, 5.71f, 7.1f, 7.01f);
        pathBuilder.close();
        pathBuilder.moveTo(13.88f, 7.12f);
        pathBuilder.curveToRelative(0.14f, 0.14f, 0.16f, 0.36f, 0.04f, 0.52f);
        pathBuilder.lineToRelative(-2.44f, 3.33f);
        pathBuilder.lineToRelative(4.05f, 0.4f);
        pathBuilder.curveToRelative(0.44f, 0.04f, 0.63f, 0.59f, 0.3f, 0.89f);
        pathBuilder.lineToRelative(-5.16f, 4.63f);
        pathBuilder.curveToRelative(-0.16f, 0.15f, -0.41f, 0.14f, -0.56f, -0.01f);
        pathBuilder.curveToRelative(-0.14f, -0.14f, -0.16f, -0.36f, -0.04f, -0.52f);
        pathBuilder.lineToRelative(2.44f, -3.33f);
        pathBuilder.lineToRelative(-4.05f, -0.4f);
        pathBuilder.curveToRelative(-0.44f, -0.04f, -0.63f, -0.59f, -0.3f, -0.89f);
        pathBuilder.lineToRelative(5.16f, -4.63f);
        pathBuilder.curveTo(13.48f, 6.96f, 13.73f, 6.97f, 13.88f, 7.12f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 3.0f);
        pathBuilder2.curveTo(12.0f, 3.0f, 12.0f, 3.0f, 12.0f, 3.0f);
        pathBuilder2.curveToRelative(-4.8f, 0.0f, -9.0f, 3.86f, -9.0f, 9.0f);
        pathBuilder2.curveToRelative(0.0f, 2.12f, 0.74f, 4.07f, 1.97f, 5.61f);
        pathBuilder2.lineTo(3.0f, 19.59f);
        pathBuilder2.lineTo(4.41f, 21.0f);
        pathBuilder2.lineToRelative(1.97f, -1.97f);
        pathBuilder2.curveTo(7.93f, 20.26f, 9.88f, 21.0f, 12.0f, 21.0f);
        pathBuilder2.curveToRelative(2.3f, 0.0f, 4.61f, -0.88f, 6.36f, -2.64f);
        pathBuilder2.curveTo(20.12f, 16.61f, 21.0f, 14.3f, 21.0f, 12.0f);
        pathBuilder2.verticalLineTo(3.0f);
        pathBuilder2.horizontalLineTo(12.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, 1.87f, -0.73f, 3.63f, -2.05f, 4.95f);
        pathBuilder2.curveTo(15.63f, 18.27f, 13.87f, 19.0f, 12.0f, 19.0f);
        pathBuilder2.curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f);
        pathBuilder2.curveToRelative(0.0f, -1.9f, 0.74f, -3.68f, 2.1f, -4.99f);
        pathBuilder2.curveTo(8.42f, 5.71f, 10.16f, 5.0f, 12.0f, 5.0f);
        pathBuilder2.horizontalLineToRelative(7.0f);
        pathBuilder2.verticalLineTo(12.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(8.46f, 12.63f);
        pathBuilder3.lineToRelative(4.05f, 0.4f);
        pathBuilder3.lineToRelative(-2.44f, 3.33f);
        pathBuilder3.curveToRelative(-0.11f, 0.16f, -0.1f, 0.38f, 0.04f, 0.52f);
        pathBuilder3.curveToRelative(0.15f, 0.15f, 0.4f, 0.16f, 0.56f, 0.01f);
        pathBuilder3.lineToRelative(5.16f, -4.63f);
        pathBuilder3.curveToRelative(0.33f, -0.3f, 0.15f, -0.85f, -0.3f, -0.89f);
        pathBuilder3.lineToRelative(-4.05f, -0.4f);
        pathBuilder3.lineToRelative(2.44f, -3.33f);
        pathBuilder3.curveToRelative(0.11f, -0.16f, 0.1f, -0.38f, -0.04f, -0.52f);
        pathBuilder3.curveToRelative(-0.15f, -0.15f, -0.4f, -0.16f, -0.56f, -0.01f);
        pathBuilder3.lineToRelative(-5.16f, 4.63f);
        pathBuilder3.curveTo(7.84f, 12.04f, 8.02f, 12.59f, 8.46f, 12.63f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _energySavingsLeaf = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
