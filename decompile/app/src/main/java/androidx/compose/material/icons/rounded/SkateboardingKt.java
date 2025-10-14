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

/* compiled from: Skateboarding.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_skateboarding", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Skateboarding", "Landroidx/compose/material/icons/Icons$Rounded;", "getSkateboarding", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSkateboarding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Skateboarding.kt\nandroidx/compose/material/icons/rounded/SkateboardingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,100:1\n212#2,12:101\n233#2,18:114\n253#2:151\n174#3:113\n705#4,2:132\n717#4,2:134\n719#4,11:140\n72#5,4:136\n*S KotlinDebug\n*F\n+ 1 Skateboarding.kt\nandroidx/compose/material/icons/rounded/SkateboardingKt\n*L\n29#1:101,12\n30#1:114,18\n30#1:151\n29#1:113\n30#1:132,2\n30#1:134,2\n30#1:140,11\n30#1:136,4\n*E\n"})
/* loaded from: classes.dex */
public final class SkateboardingKt {

    @Nullable
    private static ImageVector _skateboarding;

    @NotNull
    public static final ImageVector getSkateboarding(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _skateboarding;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Skateboarding", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(13.0f, 4.1f, 13.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.25f, 22.5f);
        pathBuilder.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        pathBuilder.reflectiveCurveTo(6.84f, 24.0f, 7.25f, 24.0f);
        pathBuilder.reflectiveCurveTo(8.0f, 23.66f, 8.0f, 23.25f);
        pathBuilder.reflectiveCurveTo(7.66f, 22.5f, 7.25f, 22.5f);
        pathBuilder.close();
        pathBuilder.moveTo(15.75f, 22.5f);
        pathBuilder.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        pathBuilder.reflectiveCurveTo(15.34f, 24.0f, 15.75f, 24.0f);
        pathBuilder.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilder.reflectiveCurveTo(16.16f, 22.5f, 15.75f, 22.5f);
        pathBuilder.close();
        pathBuilder.moveTo(19.24f, 19.0f);
        pathBuilder.curveToRelative(-0.24f, 0.0f, -0.45f, 0.11f, -0.59f, 0.3f);
        pathBuilder.curveToRelative(-0.55f, 0.73f, -1.42f, 1.2f, -2.4f, 1.2f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.verticalLineToRelative(-4.88f);
        pathBuilder.curveToRelative(0.0f, -0.69f, -0.36f, -1.34f, -0.95f, -1.7f);
        pathBuilder.lineToRelative(-3.37f, -2.08f);
        pathBuilder.lineToRelative(1.8f, -2.89f);
        pathBuilder.curveToRelative(0.96f, 1.53f, 2.54f, 2.64f, 4.39f, 2.96f);
        pathBuilder.curveToRelative(0.6f, 0.11f, 1.13f, -0.39f, 1.13f, -0.99f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, -0.48f, -0.35f, -0.89f, -0.83f, -0.98f);
        pathBuilder.curveToRelative(-1.49f, -0.28f, -2.72f, -1.29f, -3.3f, -2.64f);
        pathBuilder.lineToRelative(-0.52f, -1.21f);
        pathBuilder.curveTo(14.16f, 5.64f, 13.61f, 5.0f, 12.7f, 5.0f);
        pathBuilder.horizontalLineTo(8.11f);
        pathBuilder.curveToRelative(-0.69f, 0.0f, -1.33f, 0.36f, -1.7f, 0.94f);
        pathBuilder.lineTo(5.03f, 8.15f);
        pathBuilder.curveTo(4.74f, 8.62f, 4.88f, 9.24f, 5.35f, 9.53f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.47f, 0.29f, 1.09f, 0.15f, 1.38f, -0.32f);
        pathBuilder.lineTo(8.1f, 7.0f);
        pathBuilder.horizontalLineToRelative(2.35f);
        pathBuilder.lineToRelative(-2.4f, 3.84f);
        pathBuilder.curveToRelative(-0.31f, 0.5f, -0.39f, 1.11f, -0.21f, 1.67f);
        pathBuilder.lineToRelative(1.34f, 4.15f);
        pathBuilder.lineToRelative(-3.12f, 3.76f);
        pathBuilder.curveToRelative(-0.7f, -0.16f, -1.3f, -0.57f, -1.71f, -1.12f);
        pathBuilder.curveTo(4.21f, 19.11f, 3.99f, 19.0f, 3.75f, 19.0f);
        pathBuilder.curveTo(3.31f, 19.0f, 3.0f, 19.36f, 3.0f, 19.75f);
        pathBuilder.curveToRelative(0.0f, 0.15f, 0.05f, 0.31f, 0.15f, 0.45f);
        pathBuilder.curveToRelative(0.82f, 1.1f, 2.13f, 1.8f, 3.6f, 1.8f);
        pathBuilder.horizontalLineToRelative(9.5f);
        pathBuilder.curveToRelative(1.47f, 0.0f, 2.78f, -0.7f, 3.6f, -1.8f);
        pathBuilder.curveToRelative(0.1f, -0.14f, 0.15f, -0.3f, 0.15f, -0.45f);
        pathBuilder.curveTo(20.0f, 19.36f, 19.68f, 19.0f, 19.24f, 19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 20.5f);
        pathBuilder.horizontalLineTo(8.6f);
        pathBuilder.lineToRelative(2.21f, -2.67f);
        pathBuilder.curveToRelative(0.43f, -0.52f, 0.57f, -1.21f, 0.37f, -1.86f);
        pathBuilder.lineTo(10.5f, 13.7f);
        pathBuilder.lineToRelative(3.5f, 2.2f);
        pathBuilder.verticalLineTo(20.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _skateboarding = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
