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

/* compiled from: RunCircle.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_runCircle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RunCircle", "Landroidx/compose/material/icons/Icons$Rounded;", "getRunCircle", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nRunCircle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunCircle.kt\nandroidx/compose/material/icons/rounded/RunCircleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,82:1\n212#2,12:83\n233#2,18:96\n253#2:133\n174#3:95\n705#4,2:114\n717#4,2:116\n719#4,11:122\n72#5,4:118\n*S KotlinDebug\n*F\n+ 1 RunCircle.kt\nandroidx/compose/material/icons/rounded/RunCircleKt\n*L\n29#1:83,12\n30#1:96,18\n30#1:133\n29#1:95\n30#1:114,2\n30#1:116,2\n30#1:122,11\n30#1:118,4\n*E\n"})
/* loaded from: classes4.dex */
public final class RunCircleKt {

    @Nullable
    private static ImageVector _runCircle;

    @NotNull
    public static final ImageVector getRunCircle(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _runCircle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RunCircle", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.5f, 6.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.curveTo(12.5f, 6.45f, 12.95f, 6.0f, 13.5f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.41f, 11.91f);
        pathBuilder.curveToRelative(-0.71f, -0.2f, -1.63f, -0.74f, -2.32f, -1.66f);
        pathBuilder.lineToRelative(-0.41f, 2.35f);
        pathBuilder.lineToRelative(1.19f, 1.3f);
        pathBuilder.curveTo(13.95f, 13.98f, 14.0f, 14.1f, 14.0f, 14.22f);
        pathBuilder.verticalLineToRelative(3.28f);
        pathBuilder.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.verticalLineToRelative(-3.08f);
        pathBuilder.lineToRelative(-1.11f, -1.21f);
        pathBuilder.lineToRelative(-0.43f, 2.15f);
        pathBuilder.curveToRelative(-0.05f, 0.27f, -0.32f, 0.45f, -0.59f, 0.39f);
        pathBuilder.lineToRelative(-2.78f, -0.57f);
        pathBuilder.curveToRelative(-0.27f, -0.06f, -0.45f, -0.32f, -0.39f, -0.59f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.06f, -0.27f, 0.32f, -0.44f, 0.59f, -0.39f);
        pathBuilder.lineToRelative(2.29f, 0.47f);
        pathBuilder.lineToRelative(0.96f, -4.89f);
        pathBuilder.lineTo(10.0f, 10.35f);
        pathBuilder.verticalLineToRelative(1.15f);
        pathBuilder.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(9.22f, 12.0f, 9.0f, 11.78f, 9.0f, 11.5f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.curveToRelative(0.0f, -0.21f, 0.13f, -0.4f, 0.33f, -0.47f);
        pathBuilder.lineToRelative(2.95f, -1.09f);
        pathBuilder.curveToRelative(0.49f, -0.18f, 1.02f, 0.04f, 1.25f, 0.51f);
        pathBuilder.curveToRelative(0.65f, 1.35f, 1.55f, 1.85f, 2.1f, 2.0f);
        pathBuilder.curveTo(15.85f, 11.0f, 16.0f, 11.18f, 16.0f, 11.4f);
        pathBuilder.verticalLineToRelative(0.04f);
        pathBuilder.curveTo(16.0f, 11.75f, 15.71f, 11.99f, 15.41f, 11.91f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _runCircle = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
