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

/* compiled from: Water.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_water", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Water", "Landroidx/compose/material/icons/Icons$Rounded;", "getWater", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nWater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Water.kt\nandroidx/compose/material/icons/rounded/WaterKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,95:1\n212#2,12:96\n233#2,18:109\n253#2:146\n174#3:108\n705#4,2:127\n717#4,2:129\n719#4,11:135\n72#5,4:131\n*S KotlinDebug\n*F\n+ 1 Water.kt\nandroidx/compose/material/icons/rounded/WaterKt\n*L\n29#1:96,12\n30#1:109,18\n30#1:146\n29#1:108\n30#1:127,2\n30#1:129,2\n30#1:135,11\n30#1:131,4\n*E\n"})
/* loaded from: classes4.dex */
public final class WaterKt {

    @Nullable
    private static ImageVector _water;

    @NotNull
    public static final ImageVector getWater(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _water;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Water", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.98f, 14.0f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.horizontalLineTo(21.98f);
        pathBuilder.close();
        pathBuilder.moveTo(5.35f, 13.0f);
        pathBuilder.curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f);
        pathBuilder.curveToRelative(1.95f, 0.0f, 2.09f, -1.0f, 3.33f, -1.0f);
        pathBuilder.curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f);
        pathBuilder.curveToRelative(1.95f, 0.0f, 2.09f, -1.0f, 3.33f, -1.0f);
        pathBuilder.curveToRelative(0.93f, 0.0f, 1.05f, 0.45f, 2.01f, 0.79f);
        pathBuilder.curveToRelative(0.63f, 0.22f, 1.3f, -0.24f, 1.3f, -0.91f);
        pathBuilder.curveToRelative(0.0f, -0.52f, -0.23f, -0.83f, -0.64f, -0.97f);
        pathBuilder.curveToRelative(-0.6f, -0.22f, -1.15f, -0.9f, -2.69f, -0.9f);
        pathBuilder.curveToRelative(-1.95f, 0.0f, -2.09f, 1.0f, -3.33f, 1.0f);
        pathBuilder.curveToRelative(-1.19f, 0.0f, -1.42f, -1.0f, -3.33f, -1.0f);
        pathBuilder.curveToRelative(-1.95f, 0.0f, -2.09f, 1.0f, -3.33f, 1.0f);
        pathBuilder.curveToRelative(-1.19f, 0.0f, -1.42f, -1.0f, -3.33f, -1.0f);
        pathBuilder.curveToRelative(-1.54f, 0.0f, -2.13f, 0.71f, -2.68f, 0.91f);
        pathBuilder.curveTo(2.24f, 12.05f, 2.0f, 12.35f, 2.0f, 12.89f);
        pathBuilder.curveToRelative(0.0f, 0.67f, 0.66f, 1.13f, 1.29f, 0.91f);
        pathBuilder.curveTo(4.35f, 13.44f, 4.39f, 13.0f, 5.35f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.67f, 15.0f);
        pathBuilder.curveToRelative(-1.95f, 0.0f, -2.09f, 1.0f, -3.33f, 1.0f);
        pathBuilder.curveToRelative(-1.19f, 0.0f, -1.42f, -1.0f, -3.33f, -1.0f);
        pathBuilder.curveToRelative(-1.95f, 0.0f, -2.1f, 1.0f, -3.34f, 1.0f);
        pathBuilder.curveToRelative(-1.24f, 0.0f, -1.38f, -1.0f, -3.33f, -1.0f);
        pathBuilder.curveToRelative(-1.53f, 0.0f, -2.15f, 0.71f, -2.69f, 0.91f);
        pathBuilder.curveTo(2.24f, 16.05f, 2.0f, 16.36f, 2.0f, 16.89f);
        pathBuilder.curveToRelative(0.0f, 0.67f, 0.66f, 1.13f, 1.3f, 0.91f);
        pathBuilder.curveTo(4.32f, 17.44f, 4.38f, 17.0f, 5.34f, 17.0f);
        pathBuilder.curveToRelative(1.24f, 0.0f, 1.38f, 1.0f, 3.33f, 1.0f);
        pathBuilder.curveToRelative(1.95f, 0.0f, 2.1f, -1.0f, 3.34f, -1.0f);
        pathBuilder.curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f);
        pathBuilder.curveToRelative(1.94f, 0.0f, 2.09f, -1.0f, 3.33f, -1.0f);
        pathBuilder.curveToRelative(0.94f, 0.0f, 1.06f, 0.46f, 2.03f, 0.8f);
        pathBuilder.curveToRelative(0.63f, 0.22f, 1.3f, -0.24f, 1.3f, -0.91f);
        pathBuilder.curveToRelative(0.0f, -0.53f, -0.24f, -0.83f, -0.65f, -0.98f);
        pathBuilder.curveTo(20.82f, 15.72f, 20.21f, 15.0f, 18.67f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.35f, 9.0f);
        pathBuilder.curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f);
        pathBuilder.curveToRelative(1.95f, 0.0f, 2.09f, -1.0f, 3.33f, -1.0f);
        pathBuilder.curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f);
        pathBuilder.curveToRelative(1.95f, 0.0f, 2.09f, -1.0f, 3.33f, -1.0f);
        pathBuilder.curveToRelative(0.93f, 0.0f, 1.05f, 0.45f, 2.01f, 0.79f);
        pathBuilder.curveToRelative(0.63f, 0.22f, 1.3f, -0.24f, 1.3f, -0.91f);
        pathBuilder.curveToRelative(0.0f, -0.52f, -0.23f, -0.83f, -0.64f, -0.97f);
        pathBuilder.curveTo(20.74f, 7.68f, 20.19f, 7.0f, 18.65f, 7.0f);
        pathBuilder.curveToRelative(-1.95f, 0.0f, -2.09f, 1.0f, -3.33f, 1.0f);
        pathBuilder.curveToRelative(-1.19f, 0.0f, -1.42f, -1.0f, -3.33f, -1.0f);
        pathBuilder.curveTo(10.04f, 7.0f, 9.9f, 8.0f, 8.66f, 8.0f);
        pathBuilder.curveTo(7.47f, 8.0f, 7.24f, 7.0f, 5.33f, 7.0f);
        pathBuilder.curveTo(3.79f, 7.0f, 3.2f, 7.71f, 2.65f, 7.91f);
        pathBuilder.curveTo(2.24f, 8.05f, 2.0f, 8.35f, 2.0f, 8.89f);
        pathBuilder.curveToRelative(0.0f, 0.67f, 0.66f, 1.13f, 1.29f, 0.91f);
        pathBuilder.curveTo(4.35f, 9.44f, 4.39f, 9.0f, 5.35f, 9.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _water = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
