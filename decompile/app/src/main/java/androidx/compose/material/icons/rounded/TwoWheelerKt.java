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

/* compiled from: TwoWheeler.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_twoWheeler", "Landroidx/compose/ui/graphics/vector/ImageVector;", "TwoWheeler", "Landroidx/compose/material/icons/Icons$Rounded;", "getTwoWheeler", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTwoWheeler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TwoWheeler.kt\nandroidx/compose/material/icons/rounded/TwoWheelerKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,91:1\n212#2,12:92\n233#2,18:105\n253#2:142\n174#3:104\n705#4,2:123\n717#4,2:125\n719#4,11:131\n72#5,4:127\n*S KotlinDebug\n*F\n+ 1 TwoWheeler.kt\nandroidx/compose/material/icons/rounded/TwoWheelerKt\n*L\n29#1:92,12\n30#1:105,18\n30#1:142\n29#1:104\n30#1:123,2\n30#1:125,2\n30#1:131,11\n30#1:127,4\n*E\n"})
/* loaded from: classes2.dex */
public final class TwoWheelerKt {

    @Nullable
    private static ImageVector _twoWheeler;

    @NotNull
    public static final ImageVector getTwoWheeler(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _twoWheeler;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TwoWheeler", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 11.0f);
        pathBuilder.curveToRelative(-0.18f, 0.0f, -0.36f, 0.03f, -0.53f, 0.05f);
        pathBuilder.lineTo(17.41f, 9.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineTo(7.62f);
        pathBuilder.curveToRelative(0.0f, -0.74f, -0.78f, -1.23f, -1.45f, -0.89f);
        pathBuilder.lineToRelative(-2.28f, 1.14f);
        pathBuilder.lineToRelative(-2.57f, -2.57f);
        pathBuilder.curveTo(13.52f, 5.11f, 13.26f, 5.0f, 13.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.curveTo(9.45f, 5.0f, 9.0f, 5.45f, 9.0f, 6.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(2.17f);
        pathBuilder.curveToRelative(0.27f, 0.0f, 0.52f, 0.11f, 0.71f, 0.29f);
        pathBuilder.lineTo(14.59f, 9.0f);
        pathBuilder.horizontalLineToRelative(-3.35f);
        pathBuilder.curveToRelative(-0.16f, 0.0f, -0.31f, 0.04f, -0.45f, 0.11f);
        pathBuilder.lineToRelative(-3.14f, 1.57f);
        pathBuilder.curveToRelative(-0.38f, 0.19f, -0.85f, 0.12f, -1.15f, -0.19f);
        pathBuilder.lineToRelative(-1.2f, -1.2f);
        pathBuilder.curveTo(5.11f, 9.11f, 4.85f, 9.0f, 4.59f, 9.0f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.curveToRelative(-2.52f, 0.0f, -4.49f, 2.32f, -3.89f, 4.94f);
        pathBuilder.curveToRelative(0.33f, 1.45f, 1.5f, 2.62f, 2.95f, 2.95f);
        pathBuilder.curveTo(5.68f, 19.49f, 8.0f, 17.52f, 8.0f, 15.0f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.curveTo(9.79f, 16.79f, 10.3f, 17.0f, 10.83f, 17.0f);
        pathBuilder.horizontalLineToRelative(1.01f);
        pathBuilder.curveToRelative(0.72f, 0.0f, 1.38f, -0.38f, 1.74f, -1.01f);
        pathBuilder.lineToRelative(2.91f, -5.09f);
        pathBuilder.lineToRelative(1.01f, 1.01f);
        pathBuilder.curveToRelative(-1.13f, 0.91f, -1.76f, 2.41f, -1.38f, 4.05f);
        pathBuilder.curveToRelative(0.34f, 1.44f, 1.51f, 2.61f, 2.95f, 2.94f);
        pathBuilder.curveTo(21.68f, 19.49f, 24.0f, 17.51f, 24.0f, 15.0f);
        pathBuilder.curveTo(24.0f, 12.79f, 22.21f, 11.0f, 20.0f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(4.0f, 17.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.curveTo(6.0f, 16.1f, 5.1f, 17.0f, 4.0f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 17.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.curveTo(22.0f, 16.1f, 21.1f, 17.0f, 20.0f, 17.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _twoWheeler = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
