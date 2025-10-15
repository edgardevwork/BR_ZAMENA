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

/* compiled from: VapeFree.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_vapeFree", "Landroidx/compose/ui/graphics/vector/ImageVector;", "VapeFree", "Landroidx/compose/material/icons/Icons$Rounded;", "getVapeFree", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nVapeFree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VapeFree.kt\nandroidx/compose/material/icons/rounded/VapeFreeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,102:1\n212#2,12:103\n233#2,18:116\n253#2:153\n174#3:115\n705#4,2:134\n717#4,2:136\n719#4,11:142\n72#5,4:138\n*S KotlinDebug\n*F\n+ 1 VapeFree.kt\nandroidx/compose/material/icons/rounded/VapeFreeKt\n*L\n29#1:103,12\n30#1:116,18\n30#1:153\n29#1:115\n30#1:134,2\n30#1:136,2\n30#1:142,11\n30#1:138,4\n*E\n"})
/* loaded from: classes4.dex */
public final class VapeFreeKt {

    @Nullable
    private static ImageVector _vapeFree;

    @NotNull
    public static final ImageVector getVapeFree(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _vapeFree;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.VapeFree", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.49f, 21.9f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(-2.9f, -2.9f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineToRelative(5.17f);
        pathBuilder.lineTo(2.1f, 4.93f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(16.97f, 16.97f);
        pathBuilder.curveTo(20.88f, 20.88f, 20.88f, 21.51f, 20.49f, 21.9f);
        pathBuilder.close();
        pathBuilder.moveTo(18.83f, 16.0f);
        pathBuilder.horizontalLineToRelative(1.67f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.curveToRelative(0.0f, 0.46f, -0.21f, 0.87f, -0.53f, 1.14f);
        pathBuilder.lineTo(18.83f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.5f, 17.0f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilder.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilder.reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilder.reflectiveCurveTo(10.78f, 17.0f, 10.5f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.85f, 7.73f);
        pathBuilder.curveToRelative(0.62f, -0.61f, 1.0f, -1.45f, 1.0f, -2.38f);
        pathBuilder.curveToRelative(0.0f, -1.51f, -1.0f, -2.79f, -2.38f, -3.21f);
        pathBuilder.curveTo(16.99f, 2.0f, 16.5f, 2.36f, 16.5f, 2.86f);
        pathBuilder.curveToRelative(0.0f, 0.33f, 0.21f, 0.62f, 0.52f, 0.71f);
        pathBuilder.curveToRelative(0.77f, 0.23f, 1.33f, 0.94f, 1.33f, 1.78f);
        pathBuilder.curveToRelative(0.0f, 0.82f, -0.53f, 1.51f, -1.27f, 1.76f);
        pathBuilder.curveTo(16.75f, 7.22f, 16.5f, 7.5f, 16.5f, 7.85f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.curveToRelative(0.0f, 0.37f, 0.27f, 0.69f, 0.64f, 0.75f);
        pathBuilder.curveToRelative(1.93f, 0.31f, 3.36f, 2.0f, 3.36f, 4.02f);
        pathBuilder.verticalLineToRelative(1.48f);
        pathBuilder.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilder.reflectiveCurveTo(22.0f, 14.66f, 22.0f, 14.25f);
        pathBuilder.verticalLineToRelative(-1.49f);
        pathBuilder.curveTo(22.0f, 10.54f, 20.72f, 8.62f, 18.85f, 7.73f);
        pathBuilder.close();
        pathBuilder.moveTo(14.48f, 11.65f);
        pathBuilder.curveToRelative(0.04f, 0.0f, 0.09f, 0.0f, 0.13f, 0.0f);
        pathBuilder.horizontalLineToRelative(1.42f);
        pathBuilder.curveToRelative(1.05f, 0.0f, 1.97f, 0.74f, 1.97f, 2.05f);
        pathBuilder.verticalLineToRelative(0.55f);
        pathBuilder.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.76f, 0.75f);
        pathBuilder.curveToRelative(0.41f, 0.0f, 0.75f, -0.33f, 0.75f, -0.75f);
        pathBuilder.verticalLineToRelative(-0.89f);
        pathBuilder.curveToRelative(-0.01f, -1.81f, -1.61f, -3.16f, -3.48f, -3.16f);
        pathBuilder.horizontalLineToRelative(-1.3f);
        pathBuilder.curveToRelative(-1.02f, 0.0f, -1.94f, -0.73f, -2.07f, -1.75f);
        pathBuilder.curveToRelative(-0.12f, -0.95f, 0.46f, -1.7f, 1.3f, -1.93f);
        pathBuilder.curveToRelative(0.32f, -0.09f, 0.54f, -0.38f, 0.54f, -0.72f);
        pathBuilder.curveToRelative(0.0f, -0.49f, -0.46f, -0.86f, -0.93f, -0.72f);
        pathBuilder.curveToRelative(-1.41f, 0.41f, -2.43f, 1.71f, -2.42f, 3.24f);
        pathBuilder.lineTo(14.48f, 11.65f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 18.5f);
        pathBuilder.curveToRelative(1.33f, 0.0f, 2.71f, 0.18f, 4.0f, 0.5f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(-1.29f, 0.32f, -2.67f, 0.5f, -4.0f, 0.5f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(2.45f, 18.5f, 3.0f, 18.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _vapeFree = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
