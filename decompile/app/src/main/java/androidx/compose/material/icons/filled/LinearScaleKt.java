package androidx.compose.material.icons.filled;

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

/* compiled from: LinearScale.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_linearScale", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LinearScale", "Landroidx/compose/material/icons/Icons$Filled;", "getLinearScale", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLinearScale.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinearScale.kt\nandroidx/compose/material/icons/filled/LinearScaleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,55:1\n212#2,12:56\n233#2,18:69\n253#2:106\n174#3:68\n705#4,2:87\n717#4,2:89\n719#4,11:95\n72#5,4:91\n*S KotlinDebug\n*F\n+ 1 LinearScale.kt\nandroidx/compose/material/icons/filled/LinearScaleKt\n*L\n29#1:56,12\n30#1:69,18\n30#1:106\n29#1:68\n30#1:87,2\n30#1:89,2\n30#1:95,11\n30#1:91,4\n*E\n"})
/* loaded from: classes3.dex */
public final class LinearScaleKt {

    @Nullable
    private static ImageVector _linearScale;

    @NotNull
    public static final ImageVector getLinearScale(@NotNull Icons.Filled filled) {
        ImageVector imageVector = _linearScale;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.LinearScale", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.5f, 9.5f);
        pathBuilder.curveToRelative(-1.03f, 0.0f, -1.9f, 0.62f, -2.29f, 1.5f);
        pathBuilder.horizontalLineToRelative(-2.92f);
        pathBuilder.curveTo(13.9f, 10.12f, 13.03f, 9.5f, 12.0f, 9.5f);
        pathBuilder.reflectiveCurveToRelative(-1.9f, 0.62f, -2.29f, 1.5f);
        pathBuilder.horizontalLineTo(6.79f);
        pathBuilder.curveTo(6.4f, 10.12f, 5.53f, 9.5f, 4.5f, 9.5f);
        pathBuilder.curveTo(3.12f, 9.5f, 2.0f, 10.62f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f);
        pathBuilder.curveToRelative(1.03f, 0.0f, 1.9f, -0.62f, 2.29f, -1.5f);
        pathBuilder.horizontalLineToRelative(2.92f);
        pathBuilder.curveToRelative(0.39f, 0.88f, 1.26f, 1.5f, 2.29f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(1.9f, -0.62f, 2.29f, -1.5f);
        pathBuilder.horizontalLineToRelative(2.92f);
        pathBuilder.curveToRelative(0.39f, 0.88f, 1.26f, 1.5f, 2.29f, 1.5f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilder.reflectiveCurveTo(20.88f, 9.5f, 19.5f, 9.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _linearScale = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
