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

/* compiled from: WavingHand.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_wavingHand", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WavingHand", "Landroidx/compose/material/icons/Icons$TwoTone;", "getWavingHand", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nWavingHand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WavingHand.kt\nandroidx/compose/material/icons/twotone/WavingHandKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,129:1\n212#2,12:130\n233#2,18:143\n253#2:180\n233#2,18:181\n253#2:218\n174#3:142\n705#4,2:161\n717#4,2:163\n719#4,11:169\n705#4,2:199\n717#4,2:201\n719#4,11:207\n72#5,4:165\n72#5,4:203\n*S KotlinDebug\n*F\n+ 1 WavingHand.kt\nandroidx/compose/material/icons/twotone/WavingHandKt\n*L\n29#1:130,12\n30#1:143,18\n30#1:180\n62#1:181,18\n62#1:218\n29#1:142\n30#1:161,2\n30#1:163,2\n30#1:169,11\n62#1:199,2\n62#1:201,2\n62#1:207,11\n30#1:165,4\n62#1:203,4\n*E\n"})
/* loaded from: classes3.dex */
public final class WavingHandKt {

    @Nullable
    private static ImageVector _wavingHand;

    @NotNull
    public static final ImageVector getWavingHand(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _wavingHand;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.WavingHand", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.44f, 6.37f);
        pathBuilder.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        pathBuilder.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder.lineToRelative(-3.18f, 3.18f);
        pathBuilder.curveToRelative(1.17f, 1.17f, 1.17f, 3.07f, 0.0f, 4.24f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.curveToRelative(1.45f, -1.45f, 1.82f, -3.57f, 1.12f, -5.36f);
        pathBuilder.lineToRelative(6.3f, -6.3f);
        pathBuilder.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        pathBuilder.reflectiveCurveToRelative(0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder.lineToRelative(-4.6f, 4.6f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineToRelative(6.01f, -6.01f);
        pathBuilder.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        pathBuilder.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder.lineToRelative(-6.01f, 6.01f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineToRelative(4.95f, -4.95f);
        pathBuilder.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        pathBuilder.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder.lineToRelative(-5.66f, 5.66f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineToRelative(3.54f, -3.54f);
        pathBuilder.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        pathBuilder.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder.lineTo(14.1f, 19.1f);
        pathBuilder.curveToRelative(-2.54f, 2.54f, -6.65f, 2.54f, -9.19f, 0.0f);
        pathBuilder.reflectiveCurveToRelative(-2.54f, -6.65f, 0.0f, -9.19f);
        pathBuilder.lineTo(8.44f, 6.37f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(7.03f, 4.95f);
        pathBuilder2.lineTo(3.49f, 8.49f);
        pathBuilder2.curveToRelative(-3.32f, 3.32f, -3.32f, 8.7f, 0.0f, 12.02f);
        pathBuilder2.reflectiveCurveToRelative(8.7f, 3.32f, 12.02f, 0.0f);
        pathBuilder2.lineToRelative(6.01f, -6.01f);
        pathBuilder2.curveToRelative(0.97f, -0.97f, 0.97f, -2.56f, 0.0f, -3.54f);
        pathBuilder2.curveToRelative(-0.12f, -0.12f, -0.25f, -0.23f, -0.39f, -0.32f);
        pathBuilder2.lineToRelative(0.39f, -0.39f);
        pathBuilder2.curveToRelative(0.97f, -0.97f, 0.97f, -2.56f, 0.0f, -3.54f);
        pathBuilder2.curveToRelative(-0.16f, -0.16f, -0.35f, -0.3f, -0.54f, -0.41f);
        pathBuilder2.curveToRelative(0.4f, -0.92f, 0.23f, -2.02f, -0.52f, -2.77f);
        pathBuilder2.curveToRelative(-0.87f, -0.87f, -2.22f, -0.96f, -3.2f, -0.28f);
        pathBuilder2.curveToRelative(-0.1f, -0.15f, -0.21f, -0.29f, -0.34f, -0.42f);
        pathBuilder2.curveToRelative(-0.97f, -0.97f, -2.56f, -0.97f, -3.54f, 0.0f);
        pathBuilder2.lineToRelative(-2.51f, 2.51f);
        pathBuilder2.curveToRelative(-0.09f, -0.14f, -0.2f, -0.27f, -0.32f, -0.39f);
        pathBuilder2.curveTo(9.58f, 3.98f, 8.0f, 3.98f, 7.03f, 4.95f);
        pathBuilder2.close();
        pathBuilder2.moveTo(8.44f, 6.37f);
        pathBuilder2.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        pathBuilder2.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder2.lineToRelative(-3.18f, 3.18f);
        pathBuilder2.curveToRelative(1.17f, 1.17f, 1.17f, 3.07f, 0.0f, 4.24f);
        pathBuilder2.lineToRelative(1.41f, 1.41f);
        pathBuilder2.curveToRelative(1.45f, -1.45f, 1.82f, -3.57f, 1.12f, -5.36f);
        pathBuilder2.lineToRelative(6.3f, -6.3f);
        pathBuilder2.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        pathBuilder2.reflectiveCurveToRelative(0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder2.lineToRelative(-4.6f, 4.6f);
        pathBuilder2.lineToRelative(1.41f, 1.41f);
        pathBuilder2.lineToRelative(6.01f, -6.01f);
        pathBuilder2.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        pathBuilder2.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder2.lineToRelative(-6.01f, 6.01f);
        pathBuilder2.lineToRelative(1.41f, 1.41f);
        pathBuilder2.lineToRelative(4.95f, -4.95f);
        pathBuilder2.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        pathBuilder2.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder2.lineToRelative(-5.66f, 5.66f);
        pathBuilder2.lineToRelative(1.41f, 1.41f);
        pathBuilder2.lineToRelative(3.54f, -3.54f);
        pathBuilder2.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        pathBuilder2.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder2.lineTo(14.1f, 19.1f);
        pathBuilder2.curveToRelative(-2.54f, 2.54f, -6.65f, 2.54f, -9.19f, 0.0f);
        pathBuilder2.reflectiveCurveToRelative(-2.54f, -6.65f, 0.0f, -9.19f);
        pathBuilder2.lineTo(8.44f, 6.37f);
        pathBuilder2.close();
        pathBuilder2.moveTo(23.0f, 17.0f);
        pathBuilder2.curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilder2.verticalLineToRelative(-1.5f);
        pathBuilder2.curveToRelative(2.48f, 0.0f, 4.5f, -2.02f, 4.5f, -4.5f);
        pathBuilder2.horizontalLineTo(23.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(1.0f, 7.0f);
        pathBuilder2.curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilder2.verticalLineToRelative(1.5f);
        pathBuilder2.curveTo(4.52f, 2.5f, 2.5f, 4.52f, 2.5f, 7.0f);
        pathBuilder2.horizontalLineTo(1.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wavingHand = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
