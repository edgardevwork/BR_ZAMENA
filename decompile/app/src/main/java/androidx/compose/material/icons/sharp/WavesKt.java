package androidx.compose.material.icons.sharp;

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

/* compiled from: Waves.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_waves", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Waves", "Landroidx/compose/material/icons/Icons$Sharp;", "getWaves", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nWaves.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Waves.kt\nandroidx/compose/material/icons/sharp/WavesKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,117:1\n212#2,12:118\n233#2,18:131\n253#2:168\n174#3:130\n705#4,2:149\n717#4,2:151\n719#4,11:157\n72#5,4:153\n*S KotlinDebug\n*F\n+ 1 Waves.kt\nandroidx/compose/material/icons/sharp/WavesKt\n*L\n29#1:118,12\n30#1:131,18\n30#1:168\n29#1:130\n30#1:149,2\n30#1:151,2\n30#1:157,11\n30#1:153,4\n*E\n"})
/* loaded from: classes2.dex */
public final class WavesKt {

    @Nullable
    private static ImageVector _waves;

    @NotNull
    public static final ImageVector getWaves(@NotNull Icons.Sharp sharp) {
        ImageVector imageVector = _waves;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Waves", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 16.99f);
        pathBuilder.curveToRelative(-1.35f, 0.0f, -2.2f, 0.42f, -2.95f, 0.8f);
        pathBuilder.curveToRelative(-0.65f, 0.33f, -1.18f, 0.6f, -2.05f, 0.6f);
        pathBuilder.curveToRelative(-0.9f, 0.0f, -1.4f, -0.25f, -2.05f, -0.6f);
        pathBuilder.curveToRelative(-0.75f, -0.38f, -1.57f, -0.8f, -2.95f, -0.8f);
        pathBuilder.reflectiveCurveToRelative(-2.2f, 0.42f, -2.95f, 0.8f);
        pathBuilder.curveToRelative(-0.65f, 0.33f, -1.17f, 0.6f, -2.05f, 0.6f);
        pathBuilder.verticalLineToRelative(1.95f);
        pathBuilder.curveToRelative(1.35f, 0.0f, 2.2f, -0.42f, 2.95f, -0.8f);
        pathBuilder.curveToRelative(0.65f, -0.33f, 1.17f, -0.6f, 2.05f, -0.6f);
        pathBuilder.reflectiveCurveToRelative(1.4f, 0.25f, 2.05f, 0.6f);
        pathBuilder.curveToRelative(0.75f, 0.38f, 1.57f, 0.8f, 2.95f, 0.8f);
        pathBuilder.reflectiveCurveToRelative(2.2f, -0.42f, 2.95f, -0.8f);
        pathBuilder.curveToRelative(0.65f, -0.33f, 1.18f, -0.6f, 2.05f, -0.6f);
        pathBuilder.curveToRelative(0.9f, 0.0f, 1.4f, 0.25f, 2.05f, 0.6f);
        pathBuilder.curveToRelative(0.75f, 0.38f, 1.58f, 0.8f, 2.95f, 0.8f);
        pathBuilder.verticalLineToRelative(-1.95f);
        pathBuilder.curveToRelative(-0.9f, 0.0f, -1.4f, -0.25f, -2.05f, -0.6f);
        pathBuilder.curveToRelative(-0.75f, -0.38f, -1.6f, -0.8f, -2.95f, -0.8f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 12.54f);
        pathBuilder.curveToRelative(-1.35f, 0.0f, -2.2f, 0.43f, -2.95f, 0.8f);
        pathBuilder.curveToRelative(-0.65f, 0.32f, -1.18f, 0.6f, -2.05f, 0.6f);
        pathBuilder.curveToRelative(-0.9f, 0.0f, -1.4f, -0.25f, -2.05f, -0.6f);
        pathBuilder.curveToRelative(-0.75f, -0.38f, -1.57f, -0.8f, -2.95f, -0.8f);
        pathBuilder.reflectiveCurveToRelative(-2.2f, 0.43f, -2.95f, 0.8f);
        pathBuilder.curveToRelative(-0.65f, 0.32f, -1.17f, 0.6f, -2.05f, 0.6f);
        pathBuilder.verticalLineToRelative(1.95f);
        pathBuilder.curveToRelative(1.35f, 0.0f, 2.2f, -0.43f, 2.95f, -0.8f);
        pathBuilder.curveToRelative(0.65f, -0.35f, 1.15f, -0.6f, 2.05f, -0.6f);
        pathBuilder.reflectiveCurveToRelative(1.4f, 0.25f, 2.05f, 0.6f);
        pathBuilder.curveToRelative(0.75f, 0.38f, 1.57f, 0.8f, 2.95f, 0.8f);
        pathBuilder.reflectiveCurveToRelative(2.2f, -0.43f, 2.95f, -0.8f);
        pathBuilder.curveToRelative(0.65f, -0.35f, 1.15f, -0.6f, 2.05f, -0.6f);
        pathBuilder.reflectiveCurveToRelative(1.4f, 0.25f, 2.05f, 0.6f);
        pathBuilder.curveToRelative(0.75f, 0.38f, 1.58f, 0.8f, 2.95f, 0.8f);
        pathBuilder.verticalLineToRelative(-1.95f);
        pathBuilder.curveToRelative(-0.9f, 0.0f, -1.4f, -0.25f, -2.05f, -0.6f);
        pathBuilder.curveToRelative(-0.75f, -0.38f, -1.6f, -0.8f, -2.95f, -0.8f);
        pathBuilder.close();
        pathBuilder.moveTo(19.95f, 4.46f);
        pathBuilder.curveToRelative(-0.75f, -0.38f, -1.58f, -0.8f, -2.95f, -0.8f);
        pathBuilder.reflectiveCurveToRelative(-2.2f, 0.42f, -2.95f, 0.8f);
        pathBuilder.curveToRelative(-0.65f, 0.32f, -1.18f, 0.6f, -2.05f, 0.6f);
        pathBuilder.curveToRelative(-0.9f, 0.0f, -1.4f, -0.25f, -2.05f, -0.6f);
        pathBuilder.curveToRelative(-0.75f, -0.37f, -1.57f, -0.8f, -2.95f, -0.8f);
        pathBuilder.reflectiveCurveToRelative(-2.2f, 0.42f, -2.95f, 0.8f);
        pathBuilder.curveToRelative(-0.65f, 0.33f, -1.17f, 0.6f, -2.05f, 0.6f);
        pathBuilder.verticalLineToRelative(1.93f);
        pathBuilder.curveToRelative(1.35f, 0.0f, 2.2f, -0.43f, 2.95f, -0.8f);
        pathBuilder.curveToRelative(0.65f, -0.33f, 1.17f, -0.6f, 2.05f, -0.6f);
        pathBuilder.reflectiveCurveToRelative(1.4f, 0.25f, 2.05f, 0.6f);
        pathBuilder.curveToRelative(0.75f, 0.38f, 1.57f, 0.8f, 2.95f, 0.8f);
        pathBuilder.reflectiveCurveToRelative(2.2f, -0.43f, 2.95f, -0.8f);
        pathBuilder.curveToRelative(0.65f, -0.32f, 1.18f, -0.6f, 2.05f, -0.6f);
        pathBuilder.curveToRelative(0.9f, 0.0f, 1.4f, 0.25f, 2.05f, 0.6f);
        pathBuilder.curveToRelative(0.75f, 0.38f, 1.58f, 0.8f, 2.95f, 0.8f);
        pathBuilder.lineTo(22.0f, 5.04f);
        pathBuilder.curveToRelative(-0.9f, 0.0f, -1.4f, -0.25f, -2.05f, -0.58f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 8.09f);
        pathBuilder.curveToRelative(-1.35f, 0.0f, -2.2f, 0.43f, -2.95f, 0.8f);
        pathBuilder.curveToRelative(-0.65f, 0.35f, -1.15f, 0.6f, -2.05f, 0.6f);
        pathBuilder.reflectiveCurveToRelative(-1.4f, -0.25f, -2.05f, -0.6f);
        pathBuilder.curveToRelative(-0.75f, -0.38f, -1.57f, -0.8f, -2.95f, -0.8f);
        pathBuilder.reflectiveCurveToRelative(-2.2f, 0.43f, -2.95f, 0.8f);
        pathBuilder.curveToRelative(-0.65f, 0.35f, -1.15f, 0.6f, -2.05f, 0.6f);
        pathBuilder.verticalLineToRelative(1.95f);
        pathBuilder.curveToRelative(1.35f, 0.0f, 2.2f, -0.43f, 2.95f, -0.8f);
        pathBuilder.curveToRelative(0.65f, -0.32f, 1.18f, -0.6f, 2.05f, -0.6f);
        pathBuilder.reflectiveCurveToRelative(1.4f, 0.25f, 2.05f, 0.6f);
        pathBuilder.curveToRelative(0.75f, 0.38f, 1.57f, 0.8f, 2.95f, 0.8f);
        pathBuilder.reflectiveCurveToRelative(2.2f, -0.43f, 2.95f, -0.8f);
        pathBuilder.curveToRelative(0.65f, -0.32f, 1.18f, -0.6f, 2.05f, -0.6f);
        pathBuilder.curveToRelative(0.9f, 0.0f, 1.4f, 0.25f, 2.05f, 0.6f);
        pathBuilder.curveToRelative(0.75f, 0.38f, 1.58f, 0.8f, 2.95f, 0.8f);
        pathBuilder.lineTo(22.0f, 9.49f);
        pathBuilder.curveToRelative(-0.9f, 0.0f, -1.4f, -0.25f, -2.05f, -0.6f);
        pathBuilder.curveToRelative(-0.75f, -0.38f, -1.6f, -0.8f, -2.95f, -0.8f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _waves = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
