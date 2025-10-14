package androidx.compose.material.icons.outlined;

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

/* compiled from: Snowboarding.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_snowboarding", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Snowboarding", "Landroidx/compose/material/icons/Icons$Outlined;", "getSnowboarding", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSnowboarding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snowboarding.kt\nandroidx/compose/material/icons/outlined/SnowboardingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,82:1\n212#2,12:83\n233#2,18:96\n253#2:133\n174#3:95\n705#4,2:114\n717#4,2:116\n719#4,11:122\n72#5,4:118\n*S KotlinDebug\n*F\n+ 1 Snowboarding.kt\nandroidx/compose/material/icons/outlined/SnowboardingKt\n*L\n29#1:83,12\n30#1:96,18\n30#1:133\n29#1:95\n30#1:114,2\n30#1:116,2\n30#1:122,11\n30#1:118,4\n*E\n"})
/* loaded from: classes.dex */
public final class SnowboardingKt {

    @Nullable
    private static ImageVector _snowboarding;

    @NotNull
    public static final ImageVector getSnowboarding(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _snowboarding;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Snowboarding", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(14.0f, 4.1f, 14.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.4f, 20.09f);
        pathBuilder.curveToRelative(-0.23f, -0.05f, -0.46f, 0.02f, -0.64f, 0.17f);
        pathBuilder.curveToRelative(-0.69f, 0.6f, -1.64f, 0.88f, -2.6f, 0.67f);
        pathBuilder.lineTo(17.0f, 20.69f);
        pathBuilder.lineToRelative(-1.0f, -6.19f);
        pathBuilder.lineToRelative(-3.32f, -2.67f);
        pathBuilder.lineToRelative(1.8f, -2.89f);
        pathBuilder.curveTo(15.63f, 10.78f, 17.68f, 12.0f, 20.0f, 12.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(-1.85f, 0.0f, -3.44f, -1.12f, -4.13f, -2.72f);
        pathBuilder.lineToRelative(-0.52f, -1.21f);
        pathBuilder.curveTo(15.16f, 5.64f, 14.61f, 5.0f, 13.7f, 5.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.lineTo(5.5f, 9.0f);
        pathBuilder.lineToRelative(1.7f, 1.06f);
        pathBuilder.lineTo(9.1f, 7.0f);
        pathBuilder.horizontalLineToRelative(2.35f);
        pathBuilder.lineToRelative(-2.51f, 3.99f);
        pathBuilder.curveToRelative(-0.28f, 0.45f, -0.37f, 1.0f, -0.25f, 1.52f);
        pathBuilder.lineTo(9.5f, 16.0f);
        pathBuilder.lineTo(6.0f, 18.35f);
        pathBuilder.lineToRelative(-0.47f, -0.1f);
        pathBuilder.curveToRelative(-0.96f, -0.2f, -1.71f, -0.85f, -2.1f, -1.67f);
        pathBuilder.curveToRelative(-0.1f, -0.21f, -0.28f, -0.37f, -0.51f, -0.42f);
        pathBuilder.curveToRelative(-0.43f, -0.09f, -0.82f, 0.2f, -0.9f, 0.58f);
        pathBuilder.curveTo(1.98f, 16.88f, 2.0f, 17.05f, 2.07f, 17.2f);
        pathBuilder.curveToRelative(0.58f, 1.24f, 1.71f, 2.2f, 3.15f, 2.51f);
        pathBuilder.lineToRelative(12.63f, 2.69f);
        pathBuilder.curveToRelative(1.44f, 0.31f, 2.86f, -0.11f, 3.9f, -1.01f);
        pathBuilder.curveToRelative(0.13f, -0.11f, 0.21f, -0.26f, 0.24f, -0.41f);
        pathBuilder.curveTo(22.06f, 20.6f, 21.83f, 20.18f, 21.4f, 20.09f);
        pathBuilder.close();
        pathBuilder.moveTo(8.73f, 18.93f);
        pathBuilder.lineToRelative(3.02f, -2.03f);
        pathBuilder.lineToRelative(-0.44f, -3.32f);
        pathBuilder.lineToRelative(2.84f, 2.02f);
        pathBuilder.lineToRelative(0.75f, 4.64f);
        pathBuilder.lineTo(8.73f, 18.93f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _snowboarding = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
