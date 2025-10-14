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

/* compiled from: Scale.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_scale", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Scale", "Landroidx/compose/material/icons/Icons$Rounded;", "getScale", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nScale.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scale.kt\nandroidx/compose/material/icons/rounded/ScaleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,68:1\n212#2,12:69\n233#2,18:82\n253#2:119\n174#3:81\n705#4,2:100\n717#4,2:102\n719#4,11:108\n72#5,4:104\n*S KotlinDebug\n*F\n+ 1 Scale.kt\nandroidx/compose/material/icons/rounded/ScaleKt\n*L\n29#1:69,12\n30#1:82,18\n30#1:119\n29#1:81\n30#1:100,2\n30#1:102,2\n30#1:108,11\n30#1:104,4\n*E\n"})
/* loaded from: classes4.dex */
public final class ScaleKt {

    @Nullable
    private static ImageVector _scale;

    @NotNull
    public static final ImageVector getScale(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _scale;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Scale", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.0f, 21.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.lineToRelative(3.43f, 0.0f);
        pathBuilder.curveToRelative(0.87f, 0.0f, 1.58f, -0.75f, 1.5f, -1.62f);
        pathBuilder.curveTo(21.34f, 14.18f, 17.4f, 11.68f, 14.0f, 11.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.curveToRelative(3.31f, -0.42f, 6.03f, -1.86f, 7.27f, -3.73f);
        pathBuilder.curveTo(21.92f, 3.3f, 21.15f, 2.0f, 19.98f, 2.0f);
        pathBuilder.horizontalLineTo(4.02f);
        pathBuilder.curveTo(2.85f, 2.0f, 2.08f, 3.3f, 2.73f, 4.27f);
        pathBuilder.curveTo(3.97f, 6.14f, 6.69f, 7.58f, 10.0f, 8.0f);
        pathBuilder.lineToRelative(0.0f, 3.0f);
        pathBuilder.curveToRelative(-3.4f, 0.68f, -7.34f, 3.18f, -7.93f, 9.38f);
        pathBuilder.curveTo(1.99f, 21.25f, 2.7f, 22.0f, 3.57f, 22.0f);
        pathBuilder.lineTo(7.0f, 22.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineTo(4.13f);
        pathBuilder.curveToRelative(0.93f, -6.83f, 6.65f, -7.2f, 7.87f, -7.2f);
        pathBuilder.reflectiveCurveToRelative(6.94f, 0.37f, 7.87f, 7.2f);
        pathBuilder.horizontalLineTo(17.0f);
        pathBuilder.curveTo(16.45f, 20.0f, 16.0f, 20.45f, 16.0f, 21.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.5f, 21.94f);
        pathBuilder.curveToRelative(-0.7f, -0.17f, -1.27f, -0.74f, -1.44f, -1.44f);
        pathBuilder.curveToRelative(-0.18f, -0.74f, 0.06f, -1.44f, 0.53f, -1.91f);
        pathBuilder.curveToRelative(0.55f, -0.55f, 2.91f, -1.57f, 4.33f, -2.15f);
        pathBuilder.curveToRelative(0.41f, -0.17f, 0.82f, 0.24f, 0.65f, 0.65f);
        pathBuilder.curveToRelative(-0.58f, 1.42f, -1.6f, 3.78f, -2.15f, 4.33f);
        pathBuilder.curveTo(12.95f, 21.88f, 12.25f, 22.12f, 11.5f, 21.94f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _scale = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
