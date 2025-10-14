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

/* compiled from: PanoramaWideAngle.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_panoramaWideAngle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PanoramaWideAngle", "Landroidx/compose/material/icons/Icons$TwoTone;", "getPanoramaWideAngle", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPanoramaWideAngle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PanoramaWideAngle.kt\nandroidx/compose/material/icons/twotone/PanoramaWideAngleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,77:1\n212#2,12:78\n233#2,18:91\n253#2:128\n233#2,18:129\n253#2:166\n174#3:90\n705#4,2:109\n717#4,2:111\n719#4,11:117\n705#4,2:147\n717#4,2:149\n719#4,11:155\n72#5,4:113\n72#5,4:151\n*S KotlinDebug\n*F\n+ 1 PanoramaWideAngle.kt\nandroidx/compose/material/icons/twotone/PanoramaWideAngleKt\n*L\n29#1:78,12\n30#1:91,18\n30#1:128\n42#1:129,18\n42#1:166\n29#1:90\n30#1:109,2\n30#1:111,2\n30#1:117,11\n42#1:147,2\n42#1:149,2\n42#1:155,11\n30#1:113,4\n42#1:151,4\n*E\n"})
/* loaded from: classes.dex */
public final class PanoramaWideAngleKt {

    @Nullable
    private static ImageVector _panoramaWideAngle;

    @NotNull
    public static final ImageVector getPanoramaWideAngle(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _panoramaWideAngle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PanoramaWideAngle", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 6.0f);
        pathBuilder.curveToRelative(-2.45f, 0.0f, -4.71f, 0.2f, -7.29f, 0.64f);
        pathBuilder.curveTo(4.24f, 8.42f, 4.0f, 10.22f, 4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.78f, 0.24f, 3.58f, 0.71f, 5.36f);
        pathBuilder.curveToRelative(2.58f, 0.44f, 4.84f, 0.64f, 7.29f, 0.64f);
        pathBuilder.reflectiveCurveToRelative(4.71f, -0.2f, 7.29f, -0.64f);
        pathBuilder.curveToRelative(0.47f, -1.78f, 0.71f, -3.58f, 0.71f, -5.36f);
        pathBuilder.curveToRelative(0.0f, -1.78f, -0.24f, -3.58f, -0.71f, -5.36f);
        pathBuilder.curveTo(16.71f, 6.2f, 14.45f, 6.0f, 12.0f, 6.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(21.13f, 5.78f);
        pathBuilder2.lineToRelative(-0.25f, -0.89f);
        pathBuilder2.lineToRelative(-0.93f, -0.16f);
        pathBuilder2.curveTo(17.22f, 4.24f, 14.73f, 4.0f, 12.0f, 4.0f);
        pathBuilder2.reflectiveCurveToRelative(-5.22f, 0.24f, -7.95f, 0.72f);
        pathBuilder2.lineToRelative(-0.93f, 0.16f);
        pathBuilder2.lineToRelative(-0.25f, 0.9f);
        pathBuilder2.curveTo(2.29f, 7.85f, 2.0f, 9.93f, 2.0f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(0.29f, 4.15f, 0.87f, 6.22f);
        pathBuilder2.lineToRelative(0.25f, 0.89f);
        pathBuilder2.lineToRelative(0.93f, 0.16f);
        pathBuilder2.curveToRelative(2.73f, 0.49f, 5.22f, 0.73f, 7.95f, 0.73f);
        pathBuilder2.reflectiveCurveToRelative(5.22f, -0.24f, 7.95f, -0.72f);
        pathBuilder2.lineToRelative(0.93f, -0.16f);
        pathBuilder2.lineToRelative(0.25f, -0.89f);
        pathBuilder2.curveToRelative(0.58f, -2.08f, 0.87f, -4.16f, 0.87f, -6.23f);
        pathBuilder2.reflectiveCurveToRelative(-0.29f, -4.15f, -0.87f, -6.22f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.29f, 17.36f);
        pathBuilder2.curveToRelative(-2.58f, 0.44f, -4.84f, 0.64f, -7.29f, 0.64f);
        pathBuilder2.reflectiveCurveToRelative(-4.71f, -0.2f, -7.29f, -0.64f);
        pathBuilder2.curveTo(4.24f, 15.58f, 4.0f, 13.78f, 4.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, -1.78f, 0.24f, -3.58f, 0.71f, -5.36f);
        pathBuilder2.curveTo(7.29f, 6.2f, 9.55f, 6.0f, 12.0f, 6.0f);
        pathBuilder2.reflectiveCurveToRelative(4.71f, 0.2f, 7.29f, 0.64f);
        pathBuilder2.curveToRelative(0.47f, 1.78f, 0.71f, 3.58f, 0.71f, 5.36f);
        pathBuilder2.curveToRelative(0.0f, 1.78f, -0.24f, 3.58f, -0.71f, 5.36f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panoramaWideAngle = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
