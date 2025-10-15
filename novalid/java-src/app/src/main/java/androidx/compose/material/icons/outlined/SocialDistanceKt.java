package androidx.compose.material.icons.outlined;

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

/* compiled from: SocialDistance.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_socialDistance", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SocialDistance", "Landroidx/compose/material/icons/Icons$Outlined;", "getSocialDistance", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSocialDistance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocialDistance.kt\nandroidx/compose/material/icons/outlined/SocialDistanceKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,83:1\n212#2,12:84\n233#2,18:97\n253#2:134\n174#3:96\n705#4,2:115\n717#4,2:117\n719#4,11:123\n72#5,4:119\n*S KotlinDebug\n*F\n+ 1 SocialDistance.kt\nandroidx/compose/material/icons/outlined/SocialDistanceKt\n*L\n29#1:84,12\n30#1:97,18\n30#1:134\n29#1:96\n30#1:115,2\n30#1:117,2\n30#1:123,11\n30#1:119,4\n*E\n"})
/* loaded from: classes.dex */
public final class SocialDistanceKt {

    @Nullable
    private static ImageVector _socialDistance;

    @NotNull
    public static final ImageVector getSocialDistance(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _socialDistance;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SocialDistance", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(4.0f, 6.1f, 4.0f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.78f, 8.58f);
        pathBuilder.curveTo(7.93f, 8.21f, 6.99f, 8.0f, 6.0f, 8.0f);
        pathBuilder.reflectiveCurveTo(4.07f, 8.21f, 3.22f, 8.58f);
        pathBuilder.curveTo(2.48f, 8.9f, 2.0f, 9.62f, 2.0f, 10.43f);
        pathBuilder.lineTo(2.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.lineToRelative(0.0f, -0.57f);
        pathBuilder.curveTo(10.0f, 9.62f, 9.52f, 8.9f, 8.78f, 8.58f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 7.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.curveTo(16.0f, 6.1f, 16.9f, 7.0f, 18.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.78f, 8.58f);
        pathBuilder.curveTo(19.93f, 8.21f, 18.99f, 8.0f, 18.0f, 8.0f);
        pathBuilder.curveToRelative(-0.99f, 0.0f, -1.93f, 0.21f, -2.78f, 0.58f);
        pathBuilder.curveTo(14.48f, 8.9f, 14.0f, 9.62f, 14.0f, 10.43f);
        pathBuilder.lineTo(14.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.lineToRelative(0.0f, -0.57f);
        pathBuilder.curveTo(22.0f, 9.62f, 21.52f, 8.9f, 20.78f, 8.58f);
        pathBuilder.close();
        pathBuilder.moveTo(18.01f, 13.01f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineTo(18.17f, 16.0f);
        pathBuilder.horizontalLineTo(5.83f);
        pathBuilder.lineToRelative(1.58f, -1.59f);
        pathBuilder.lineToRelative(-1.41f, -1.41f);
        pathBuilder.lineTo(2.0f, 17.0f);
        pathBuilder.lineToRelative(3.99f, 3.99f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(5.83f, 18.0f);
        pathBuilder.horizontalLineToRelative(12.34f);
        pathBuilder.lineToRelative(-1.58f, 1.58f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineTo(22.0f, 17.0f);
        pathBuilder.lineTo(18.01f, 13.01f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _socialDistance = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
