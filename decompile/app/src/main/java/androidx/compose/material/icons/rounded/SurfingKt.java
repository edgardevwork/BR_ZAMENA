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

/* compiled from: Surfing.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_surfing", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Surfing", "Landroidx/compose/material/icons/Icons$Rounded;", "getSurfing", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSurfing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surfing.kt\nandroidx/compose/material/icons/rounded/SurfingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,102:1\n212#2,12:103\n233#2,18:116\n253#2:153\n174#3:115\n705#4,2:134\n717#4,2:136\n719#4,11:142\n72#5,4:138\n*S KotlinDebug\n*F\n+ 1 Surfing.kt\nandroidx/compose/material/icons/rounded/SurfingKt\n*L\n29#1:103,12\n30#1:116,18\n30#1:153\n29#1:115\n30#1:134,2\n30#1:136,2\n30#1:142,11\n30#1:138,4\n*E\n"})
/* loaded from: classes3.dex */
public final class SurfingKt {

    @Nullable
    private static ImageVector _surfing;

    @NotNull
    public static final ImageVector getSurfing(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _surfing;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Surfing", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 1.5f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(18.1f, 1.5f, 17.0f, 1.5f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 22.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-1.03f, 0.0f, -2.05f, -0.25f, -3.0f, -0.75f);
        pathBuilder.curveToRelative(-1.92f, 1.02f, -4.18f, 1.0f, -6.09f, -0.05f);
        pathBuilder.curveToRelative(-1.79f, 0.87f, -3.92f, 0.98f, -5.58f, -0.14f);
        pathBuilder.curveTo(5.3f, 22.69f, 4.15f, 23.0f, 3.0f, 23.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.87f, 0.0f, 1.73f, -0.24f, 2.53f, -0.7f);
        pathBuilder.curveToRelative(0.29f, -0.16f, 0.65f, -0.17f, 0.94f, 0.0f);
        pathBuilder.curveToRelative(1.59f, 0.9f, 3.48f, 0.9f, 5.06f, 0.0f);
        pathBuilder.curveToRelative(0.29f, -0.16f, 0.65f, -0.16f, 0.94f, 0.0f);
        pathBuilder.curveToRelative(1.59f, 0.9f, 3.48f, 0.9f, 5.06f, 0.0f);
        pathBuilder.curveToRelative(0.29f, -0.16f, 0.65f, -0.16f, 0.94f, 0.0f);
        pathBuilder.curveTo(19.27f, 20.76f, 20.13f, 21.0f, 21.0f, 21.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(21.55f, 21.0f, 22.0f, 21.45f, 22.0f, 22.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.04f, 18.86f);
        pathBuilder.curveTo(8.35f, 18.95f, 8.67f, 19.0f, 9.0f, 19.0f);
        pathBuilder.curveToRelative(0.9f, 0.0f, 1.72f, -0.37f, 2.39f, -0.91f);
        pathBuilder.curveToRelative(0.35f, -0.28f, 0.87f, -0.28f, 1.22f, 0.0f);
        pathBuilder.curveTo(13.28f, 18.63f, 14.1f, 19.0f, 15.0f, 19.0f);
        pathBuilder.reflectiveCurveToRelative(1.72f, -0.37f, 2.39f, -0.91f);
        pathBuilder.curveToRelative(0.03f, -0.03f, 0.07f, -0.05f, 0.11f, -0.07f);
        pathBuilder.curveToRelative(-0.46f, -0.39f, -0.97f, -0.79f, -1.5f, -1.17f);
        pathBuilder.verticalLineToRelative(-2.87f);
        pathBuilder.curveToRelative(0.0f, -0.61f, -0.28f, -1.19f, -0.77f, -1.57f);
        pathBuilder.lineTo(12.17f, 10.0f);
        pathBuilder.lineToRelative(2.25f, -1.52f);
        pathBuilder.curveToRelative(1.03f, 1.79f, 2.82f, 3.08f, 4.93f, 3.43f);
        pathBuilder.curveToRelative(0.6f, 0.1f, 1.14f, -0.39f, 1.14f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -0.49f, -0.36f, -0.9f, -0.84f, -0.98f);
        pathBuilder.curveToRelative(-1.5f, -0.25f, -2.78f, -1.18f, -3.51f, -2.46f);
        pathBuilder.lineToRelative(-0.88f, -1.55f);
        pathBuilder.curveToRelative(-0.29f, -0.52f, -0.77f, -0.8f, -1.22f, -0.89f);
        pathBuilder.lineTo(9.31f, 4.15f);
        pathBuilder.curveToRelative(-0.52f, -0.1f, -1.06f, 0.02f, -1.5f, 0.32f);
        pathBuilder.lineTo(5.82f, 5.83f);
        pathBuilder.curveTo(5.37f, 6.15f, 5.25f, 6.77f, 5.56f, 7.22f);
        pathBuilder.curveTo(5.88f, 7.68f, 6.5f, 7.8f, 6.96f, 7.49f);
        pathBuilder.lineToRelative(1.99f, -1.37f);
        pathBuilder.lineToRelative(2.0f, 0.37f);
        pathBuilder.lineTo(8.8f, 7.94f);
        pathBuilder.curveTo(8.2f, 8.35f, 7.91f, 9.06f, 8.03f, 9.73f);
        pathBuilder.lineToRelative(0.52f, 3.1f);
        pathBuilder.curveTo(7.13f, 12.31f, 5.83f, 12.0f, 4.85f, 12.0f);
        pathBuilder.curveTo(4.01f, 12.0f, 3.0f, 12.25f, 3.0f, 13.28f);
        pathBuilder.curveTo(3.0f, 14.72f, 5.19f, 16.9f, 8.04f, 18.86f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 14.0f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.curveToRelative(-0.78f, -0.48f, -2.34f, -1.33f, -3.26f, -1.75f);
        pathBuilder.lineTo(10.3f, 11.1f);
        pathBuilder.lineTo(14.0f, 14.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _surfing = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
