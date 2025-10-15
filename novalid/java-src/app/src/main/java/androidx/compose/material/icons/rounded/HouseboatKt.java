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

/* compiled from: Houseboat.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_houseboat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Houseboat", "Landroidx/compose/material/icons/Icons$Rounded;", "getHouseboat", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHouseboat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Houseboat.kt\nandroidx/compose/material/icons/rounded/HouseboatKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,89:1\n212#2,12:90\n233#2,18:103\n253#2:140\n174#3:102\n705#4,2:121\n717#4,2:123\n719#4,11:129\n72#5,4:125\n*S KotlinDebug\n*F\n+ 1 Houseboat.kt\nandroidx/compose/material/icons/rounded/HouseboatKt\n*L\n29#1:90,12\n30#1:103,18\n30#1:140\n29#1:102\n30#1:121,2\n30#1:123,2\n30#1:129,11\n30#1:125,4\n*E\n"})
/* loaded from: classes.dex */
public final class HouseboatKt {

    @Nullable
    private static ImageVector _houseboat;

    @NotNull
    public static final ImageVector getHouseboat(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _houseboat;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Houseboat", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 17.83f);
        pathBuilder.curveToRelative(0.0f, -0.42f, -0.27f, -0.8f, -0.67f, -0.94f);
        pathBuilder.curveTo(20.62f, 16.62f, 20.21f, 16.0f, 18.67f, 16.0f);
        pathBuilder.curveToRelative(-1.91f, 0.0f, -2.14f, 1.0f, -3.33f, 1.0f);
        pathBuilder.curveToRelative(-1.24f, 0.0f, -1.39f, -1.0f, -3.34f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-2.1f, 1.0f, -3.34f, 1.0f);
        pathBuilder.curveToRelative(-1.19f, 0.0f, -1.42f, -1.0f, -3.33f, -1.0f);
        pathBuilder.curveToRelative(-1.54f, 0.0f, -1.95f, 0.62f, -2.66f, 0.88f);
        pathBuilder.curveTo(2.27f, 17.03f, 2.0f, 17.4f, 2.0f, 17.83f);
        pathBuilder.curveToRelative(0.0f, 0.7f, 0.69f, 1.19f, 1.35f, 0.95f);
        pathBuilder.curveToRelative(0.8f, -0.29f, 1.18f, -0.78f, 2.0f, -0.78f);
        pathBuilder.curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f);
        pathBuilder.curveToRelative(1.95f, 0.0f, 2.08f, -1.0f, 3.32f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.37f, 1.0f, 3.32f, 1.0f);
        pathBuilder.curveToRelative(1.91f, 0.0f, 2.14f, -1.0f, 3.33f, -1.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.21f, 0.49f, 2.0f, 0.78f);
        pathBuilder.curveTo(21.31f, 19.02f, 22.0f, 18.52f, 22.0f, 17.83f);
        pathBuilder.close();
        pathBuilder.moveTo(18.91f, 9.81f);
        pathBuilder.curveToRelative(0.33f, -0.45f, 0.23f, -1.07f, -0.22f, -1.4f);
        pathBuilder.lineToRelative(-6.1f, -4.47f);
        pathBuilder.curveToRelative(-0.35f, -0.26f, -0.83f, -0.26f, -1.18f, 0.0f);
        pathBuilder.lineToRelative(-6.1f, 4.47f);
        pathBuilder.curveToRelative(-0.45f, 0.33f, -0.54f, 0.95f, -0.22f, 1.4f);
        pathBuilder.curveToRelative(0.33f, 0.45f, 0.95f, 0.54f, 1.4f, 0.22f);
        pathBuilder.lineTo(7.0f, 9.65f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder.horizontalLineTo(5.74f);
        pathBuilder.curveToRelative(-0.27f, 0.0f, -0.52f, -0.11f, -0.71f, -0.29f);
        pathBuilder.lineToRelative(-0.66f, -0.66f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(0.66f, 0.66f);
        pathBuilder.curveTo(4.18f, 14.68f, 4.95f, 15.0f, 5.74f, 15.0f);
        pathBuilder.horizontalLineToRelative(12.51f);
        pathBuilder.curveToRelative(0.8f, 0.0f, 1.56f, -0.32f, 2.12f, -0.88f);
        pathBuilder.lineToRelative(0.66f, -0.66f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(-0.66f, 0.66f);
        pathBuilder.curveTo(18.78f, 12.89f, 18.52f, 13.0f, 18.26f, 13.0f);
        pathBuilder.horizontalLineTo(17.0f);
        pathBuilder.verticalLineTo(9.65f);
        pathBuilder.lineToRelative(0.51f, 0.37f);
        pathBuilder.curveTo(17.96f, 10.35f, 18.58f, 10.25f, 18.91f, 9.81f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _houseboat = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
