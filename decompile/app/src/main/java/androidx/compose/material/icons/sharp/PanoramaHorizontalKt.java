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

/* compiled from: PanoramaHorizontal.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_panoramaHorizontal", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PanoramaHorizontal", "Landroidx/compose/material/icons/Icons$Sharp;", "getPanoramaHorizontal", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPanoramaHorizontal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PanoramaHorizontal.kt\nandroidx/compose/material/icons/sharp/PanoramaHorizontalKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,56:1\n212#2,12:57\n233#2,18:70\n253#2:107\n174#3:69\n705#4,2:88\n717#4,2:90\n719#4,11:96\n72#5,4:92\n*S KotlinDebug\n*F\n+ 1 PanoramaHorizontal.kt\nandroidx/compose/material/icons/sharp/PanoramaHorizontalKt\n*L\n29#1:57,12\n30#1:70,18\n30#1:107\n29#1:69\n30#1:88,2\n30#1:90,2\n30#1:96,11\n30#1:92,4\n*E\n"})
/* loaded from: classes2.dex */
public final class PanoramaHorizontalKt {

    @Nullable
    private static ImageVector _panoramaHorizontal;

    @NotNull
    public static final ImageVector getPanoramaHorizontal(@NotNull Icons.Sharp sharp) {
        ImageVector imageVector = _panoramaHorizontal;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PanoramaHorizontal", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.0f, 6.55f);
        pathBuilder.curveToRelative(2.6f, 0.77f, 5.28f, 1.16f, 8.0f, 1.16f);
        pathBuilder.curveToRelative(2.72f, 0.0f, 5.41f, -0.39f, 8.0f, -1.16f);
        pathBuilder.verticalLineToRelative(10.91f);
        pathBuilder.curveToRelative(-2.6f, -0.77f, -5.28f, -1.16f, -8.0f, -1.16f);
        pathBuilder.curveToRelative(-2.72f, 0.0f, -5.41f, 0.39f, -8.0f, 1.16f);
        pathBuilder.verticalLineTo(6.55f);
        pathBuilder.moveTo(2.0f, 3.77f);
        pathBuilder.verticalLineToRelative(16.47f);
        pathBuilder.reflectiveCurveToRelative(0.77f, -0.26f, 0.88f, -0.3f);
        pathBuilder.curveTo(5.82f, 18.85f, 8.91f, 18.3f, 12.0f, 18.3f);
        pathBuilder.curveToRelative(3.09f, 0.0f, 6.18f, 0.55f, 9.12f, 1.64f);
        pathBuilder.curveToRelative(0.11f, 0.04f, 0.88f, 0.3f, 0.88f, 0.3f);
        pathBuilder.verticalLineTo(3.77f);
        pathBuilder.reflectiveCurveToRelative(-0.77f, 0.26f, -0.88f, 0.3f);
        pathBuilder.curveTo(18.18f, 5.15f, 15.09f, 5.71f, 12.0f, 5.71f);
        pathBuilder.reflectiveCurveToRelative(-6.18f, -0.56f, -9.12f, -1.64f);
        pathBuilder.curveToRelative(-0.11f, -0.05f, -0.88f, -0.3f, -0.88f, -0.3f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panoramaHorizontal = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
