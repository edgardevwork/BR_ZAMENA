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

/* compiled from: WavingHand.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_wavingHand", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WavingHand", "Landroidx/compose/material/icons/Icons$Rounded;", "getWavingHand", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nWavingHand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WavingHand.kt\nandroidx/compose/material/icons/rounded/WavingHandKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,93:1\n212#2,12:94\n233#2,18:107\n253#2:144\n174#3:106\n705#4,2:125\n717#4,2:127\n719#4,11:133\n72#5,4:129\n*S KotlinDebug\n*F\n+ 1 WavingHand.kt\nandroidx/compose/material/icons/rounded/WavingHandKt\n*L\n29#1:94,12\n30#1:107,18\n30#1:144\n29#1:106\n30#1:125,2\n30#1:127,2\n30#1:133,11\n30#1:129,4\n*E\n"})
/* loaded from: classes4.dex */
public final class WavingHandKt {

    @Nullable
    private static ImageVector _wavingHand;

    @NotNull
    public static final ImageVector getWavingHand(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _wavingHand;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WavingHand", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.07f, 9.8f);
        pathBuilder.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(1.07f, 1.07f, 1.16f, 2.75f, 0.28f, 3.92f);
        pathBuilder.curveToRelative(-0.15f, 0.2f, -0.12f, 0.47f, 0.05f, 0.65f);
        pathBuilder.curveToRelative(0.22f, 0.22f, 0.57f, 0.19f, 0.76f, -0.05f);
        pathBuilder.curveToRelative(1.07f, -1.43f, 1.06f, -3.43f, -0.04f, -4.85f);
        pathBuilder.lineToRelative(7.62f, -7.62f);
        pathBuilder.curveToRelative(0.49f, -0.49f, 1.28f, -0.49f, 1.77f, 0.0f);
        pathBuilder.reflectiveCurveToRelative(0.49f, 1.28f, 0.0f, 1.77f);
        pathBuilder.lineToRelative(-5.13f, 5.13f);
        pathBuilder.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder.reflectiveCurveToRelative(0.51f, 0.2f, 0.71f, 0.0f);
        pathBuilder.lineToRelative(6.54f, -6.54f);
        pathBuilder.curveToRelative(0.49f, -0.49f, 1.28f, -0.49f, 1.77f, 0.0f);
        pathBuilder.reflectiveCurveToRelative(0.49f, 1.28f, 0.0f, 1.77f);
        pathBuilder.lineToRelative(-6.54f, 6.54f);
        pathBuilder.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder.reflectiveCurveToRelative(0.51f, 0.2f, 0.71f, 0.0f);
        pathBuilder.lineToRelative(5.48f, -5.48f);
        pathBuilder.curveToRelative(0.49f, -0.49f, 1.28f, -0.49f, 1.77f, 0.0f);
        pathBuilder.reflectiveCurveToRelative(0.49f, 1.28f, 0.0f, 1.77f);
        pathBuilder.lineToRelative(-6.19f, 6.19f);
        pathBuilder.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        pathBuilder.lineToRelative(4.07f, -4.07f);
        pathBuilder.curveToRelative(0.49f, -0.49f, 1.28f, -0.49f, 1.77f, 0.0f);
        pathBuilder.curveToRelative(0.49f, 0.49f, 0.49f, 1.28f, 0.0f, 1.77f);
        pathBuilder.lineToRelative(-7.07f, 7.07f);
        pathBuilder.curveToRelative(-3.22f, 3.22f, -8.45f, 3.22f, -11.67f, 0.0f);
        pathBuilder.reflectiveCurveToRelative(-3.22f, -8.45f, 0.0f, -11.67f);
        pathBuilder.lineToRelative(4.6f, -4.6f);
        pathBuilder.curveToRelative(0.49f, -0.49f, 1.28f, -0.49f, 1.77f, 0.0f);
        pathBuilder.curveToRelative(0.49f, 0.49f, 0.49f, 1.28f, 0.0f, 1.77f);
        pathBuilder.lineTo(6.07f, 9.8f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 1.8f);
        pathBuilder.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilder.curveToRelative(-0.04f, 0.0f, -0.07f, 0.0f, -0.11f, 0.01f);
        pathBuilder.curveToRelative(-2.63f, 0.38f, -4.7f, 2.46f, -5.08f, 5.08f);
        pathBuilder.curveToRelative(0.0f, 0.03f, -0.01f, 0.07f, -0.01f, 0.11f);
        pathBuilder.curveTo(1.05f, 6.66f, 1.39f, 7.0f, 1.8f, 7.0f);
        pathBuilder.curveToRelative(0.38f, 0.0f, 0.69f, -0.28f, 0.74f, -0.64f);
        pathBuilder.curveToRelative(0.28f, -1.97f, 1.84f, -3.53f, 3.81f, -3.81f);
        pathBuilder.curveTo(6.72f, 2.49f, 7.0f, 2.18f, 7.0f, 1.8f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 22.2f);
        pathBuilder.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilder.curveToRelative(0.04f, 0.0f, 0.07f, 0.0f, 0.11f, -0.01f);
        pathBuilder.curveToRelative(2.63f, -0.38f, 4.7f, -2.46f, 5.08f, -5.08f);
        pathBuilder.curveToRelative(0.0f, -0.03f, 0.01f, -0.07f, 0.01f, -0.11f);
        pathBuilder.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilder.curveToRelative(-0.38f, 0.0f, -0.69f, 0.28f, -0.74f, 0.64f);
        pathBuilder.curveToRelative(-0.28f, 1.97f, -1.84f, 3.53f, -3.81f, 3.81f);
        pathBuilder.curveTo(17.28f, 21.51f, 17.0f, 21.82f, 17.0f, 22.2f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wavingHand = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
