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

/* compiled from: Kitesurfing.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_kitesurfing", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Kitesurfing", "Landroidx/compose/material/icons/Icons$Rounded;", "getKitesurfing", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nKitesurfing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Kitesurfing.kt\nandroidx/compose/material/icons/rounded/KitesurfingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,102:1\n212#2,12:103\n233#2,18:116\n253#2:153\n174#3:115\n705#4,2:134\n717#4,2:136\n719#4,11:142\n72#5,4:138\n*S KotlinDebug\n*F\n+ 1 Kitesurfing.kt\nandroidx/compose/material/icons/rounded/KitesurfingKt\n*L\n29#1:103,12\n30#1:116,18\n30#1:153\n29#1:115\n30#1:134,2\n30#1:136,2\n30#1:142,11\n30#1:138,4\n*E\n"})
/* loaded from: classes3.dex */
public final class KitesurfingKt {

    @Nullable
    private static ImageVector _kitesurfing;

    @NotNull
    public static final ImageVector getKitesurfing(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _kitesurfing;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Kitesurfing", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(6.0f, 4.1f, 6.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.03f, 3.97f);
        pathBuilder.curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0.0f);
        pathBuilder.lineTo(20.06f, 1.0f);
        pathBuilder.horizontalLineToRelative(-2.12f);
        pathBuilder.lineToRelative(-1.91f, 1.91f);
        pathBuilder.curveTo(15.74f, 3.2f, 15.74f, 3.68f, 16.03f, 3.97f);
        pathBuilder.close();
        pathBuilder.moveTo(19.15f, 12.0f);
        pathBuilder.curveToRelative(-1.29f, 0.0f, -3.11f, 0.53f, -5.06f, 1.38f);
        pathBuilder.lineTo(13.0f, 12.16f);
        pathBuilder.curveToRelative(-0.38f, -0.42f, -0.92f, -0.66f, -1.49f, -0.66f);
        pathBuilder.horizontalLineTo(9.6f);
        pathBuilder.lineToRelative(0.0f, -3.5f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.curveToRelative(1.52f, 0.0f, 2.94f, -0.49f, 4.09f, -1.32f);
        pathBuilder.curveToRelative(0.49f, -0.35f, 0.52f, -1.07f, 0.09f, -1.5f);
        pathBuilder.curveToRelative(-0.35f, -0.35f, -0.9f, -0.38f, -1.3f, -0.09f);
        pathBuilder.curveTo(13.06f, 5.66f, 12.07f, 6.0f, 11.0f, 6.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.curveTo(6.9f, 6.0f, 6.0f, 6.9f, 6.0f, 8.0f);
        pathBuilder.verticalLineToRelative(4.04f);
        pathBuilder.curveToRelative(0.0f, 0.64f, 0.15f, 1.27f, 0.45f, 1.83f);
        pathBuilder.lineTo(8.0f, 16.84f);
        pathBuilder.curveToRelative(-0.53f, 0.38f, -1.03f, 0.78f, -1.49f, 1.17f);
        pathBuilder.curveTo(7.19f, 18.59f, 8.06f, 19.0f, 9.0f, 19.0f);
        pathBuilder.curveToRelative(1.2f, 0.0f, 2.27f, -0.66f, 3.0f, -1.5f);
        pathBuilder.curveToRelative(0.73f, 0.84f, 1.8f, 1.5f, 3.0f, 1.5f);
        pathBuilder.curveToRelative(0.33f, 0.0f, 0.65f, -0.05f, 0.96f, -0.14f);
        pathBuilder.curveTo(18.81f, 16.9f, 21.0f, 14.72f, 21.0f, 13.28f);
        pathBuilder.curveTo(21.0f, 12.25f, 19.99f, 12.0f, 19.15f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.83f, 15.61f);
        pathBuilder.lineTo(9.0f, 13.6f);
        pathBuilder.lineToRelative(2.5f, -0.1f);
        pathBuilder.lineToRelative(0.7f, 0.77f);
        pathBuilder.curveTo(11.64f, 14.55f, 10.42f, 15.23f, 9.83f, 15.61f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 22.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.87f, 0.0f, -1.73f, -0.24f, -2.53f, -0.7f);
        pathBuilder.curveToRelative(-0.29f, -0.16f, -0.65f, -0.17f, -0.94f, 0.0f);
        pathBuilder.curveToRelative(-1.59f, 0.9f, -3.47f, 0.9f, -5.06f, 0.0f);
        pathBuilder.curveToRelative(-0.29f, -0.16f, -0.65f, -0.16f, -0.94f, 0.0f);
        pathBuilder.curveToRelative(-1.59f, 0.9f, -3.47f, 0.9f, -5.06f, 0.0f);
        pathBuilder.curveToRelative(-0.29f, -0.16f, -0.65f, -0.16f, -0.94f, 0.0f);
        pathBuilder.curveTo(4.73f, 20.76f, 3.87f, 21.0f, 3.0f, 21.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(1.15f, 0.0f, 2.3f, -0.31f, 3.33f, -0.94f);
        pathBuilder.curveToRelative(1.66f, 1.11f, 3.78f, 1.01f, 5.58f, 0.14f);
        pathBuilder.curveToRelative(1.91f, 1.05f, 4.17f, 1.07f, 6.09f, 0.05f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.95f, 0.5f, 1.97f, 0.75f, 3.0f, 0.75f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(21.55f, 23.0f, 22.0f, 22.55f, 22.0f, 22.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _kitesurfing = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
