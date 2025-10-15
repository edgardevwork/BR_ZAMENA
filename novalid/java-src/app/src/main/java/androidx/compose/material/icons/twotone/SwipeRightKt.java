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

/* compiled from: SwipeRight.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_swipeRight", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SwipeRight", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSwipeRight", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSwipeRight.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeRight.kt\nandroidx/compose/material/icons/twotone/SwipeRightKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,94:1\n212#2,12:95\n233#2,18:108\n253#2:145\n233#2,18:146\n253#2:183\n174#3:107\n705#4,2:126\n717#4,2:128\n719#4,11:134\n705#4,2:164\n717#4,2:166\n719#4,11:172\n72#5,4:130\n72#5,4:168\n*S KotlinDebug\n*F\n+ 1 SwipeRight.kt\nandroidx/compose/material/icons/twotone/SwipeRightKt\n*L\n29#1:95,12\n30#1:108,18\n30#1:145\n44#1:146,18\n44#1:183\n29#1:107\n30#1:126,2\n30#1:128,2\n30#1:134,11\n44#1:164,2\n44#1:166,2\n44#1:172,11\n30#1:130,4\n44#1:168,4\n*E\n"})
/* loaded from: classes4.dex */
public final class SwipeRightKt {

    @Nullable
    private static ImageVector _swipeRight;

    @NotNull
    public static final ImageVector getSwipeRight(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _swipeRight;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SwipeRight", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.08f, 21.0f);
        pathBuilder.horizontalLineToRelative(-6.55f);
        pathBuilder.lineToRelative(-3.7f, -3.78f);
        pathBuilder.lineTo(11.0f, 18.11f);
        pathBuilder.verticalLineTo(7.5f);
        pathBuilder.curveTo(11.0f, 7.22f, 11.22f, 7.0f, 11.5f, 7.0f);
        pathBuilder.reflectiveCurveTo(12.0f, 7.22f, 12.0f, 7.5f);
        pathBuilder.verticalLineToRelative(6.18f);
        pathBuilder.horizontalLineToRelative(1.76f);
        pathBuilder.lineTo(18.0f, 15.56f);
        pathBuilder.lineTo(17.08f, 21.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(18.89f, 13.77f);
        pathBuilder2.lineToRelative(-3.8f, -1.67f);
        pathBuilder2.curveTo(14.96f, 12.04f, 14.81f, 12.0f, 14.65f, 12.0f);
        pathBuilder2.horizontalLineTo(14.0f);
        pathBuilder2.verticalLineTo(7.5f);
        pathBuilder2.curveTo(14.0f, 6.12f, 12.88f, 5.0f, 11.5f, 5.0f);
        pathBuilder2.reflectiveCurveTo(9.0f, 6.12f, 9.0f, 7.5f);
        pathBuilder2.verticalLineToRelative(8.15f);
        pathBuilder2.lineToRelative(-1.87f, -0.4f);
        pathBuilder2.curveToRelative(-0.19f, -0.03f, -1.02f, -0.15f, -1.73f, 0.56f);
        pathBuilder2.lineTo(4.0f, 17.22f);
        pathBuilder2.lineToRelative(5.12f, 5.19f);
        pathBuilder2.curveTo(9.49f, 22.79f, 10.0f, 23.0f, 10.53f, 23.0f);
        pathBuilder2.horizontalLineToRelative(6.55f);
        pathBuilder2.curveToRelative(0.98f, 0.0f, 1.81f, -0.7f, 1.97f, -1.67f);
        pathBuilder2.lineToRelative(0.92f, -5.44f);
        pathBuilder2.curveTo(20.12f, 15.03f, 19.68f, 14.17f, 18.89f, 13.77f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.08f, 21.0f);
        pathBuilder2.horizontalLineToRelative(-6.55f);
        pathBuilder2.lineToRelative(-3.7f, -3.78f);
        pathBuilder2.lineTo(11.0f, 18.11f);
        pathBuilder2.verticalLineTo(7.5f);
        pathBuilder2.curveTo(11.0f, 7.22f, 11.22f, 7.0f, 11.5f, 7.0f);
        pathBuilder2.reflectiveCurveTo(12.0f, 7.22f, 12.0f, 7.5f);
        pathBuilder2.verticalLineToRelative(6.18f);
        pathBuilder2.horizontalLineToRelative(1.76f);
        pathBuilder2.lineTo(18.0f, 15.56f);
        pathBuilder2.lineTo(17.08f, 21.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 2.5f);
        pathBuilder2.curveTo(7.26f, 2.5f, 4.33f, 5.02f, 3.57f, 7.0f);
        pathBuilder2.horizontalLineTo(2.0f);
        pathBuilder2.curveToRelative(0.73f, -2.88f, 4.51f, -6.0f, 10.0f, -6.0f);
        pathBuilder2.curveToRelative(3.22f, 0.0f, 6.18f, 1.13f, 8.5f, 3.02f);
        pathBuilder2.verticalLineTo(2.0f);
        pathBuilder2.horizontalLineTo(22.0f);
        pathBuilder2.verticalLineToRelative(5.0f);
        pathBuilder2.horizontalLineToRelative(-5.0f);
        pathBuilder2.verticalLineTo(5.5f);
        pathBuilder2.horizontalLineToRelative(2.91f);
        pathBuilder2.curveTo(17.79f, 3.64f, 15.03f, 2.5f, 12.0f, 2.5f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeRight = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
