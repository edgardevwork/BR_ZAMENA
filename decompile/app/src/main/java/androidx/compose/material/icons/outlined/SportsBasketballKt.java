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

/* compiled from: SportsBasketball.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_sportsBasketball", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SportsBasketball", "Landroidx/compose/material/icons/Icons$Outlined;", "getSportsBasketball", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSportsBasketball.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportsBasketball.kt\nandroidx/compose/material/icons/outlined/SportsBasketballKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,87:1\n212#2,12:88\n233#2,18:101\n253#2:138\n174#3:100\n705#4,2:119\n717#4,2:121\n719#4,11:127\n72#5,4:123\n*S KotlinDebug\n*F\n+ 1 SportsBasketball.kt\nandroidx/compose/material/icons/outlined/SportsBasketballKt\n*L\n29#1:88,12\n30#1:101,18\n30#1:138\n29#1:100\n30#1:119,2\n30#1:121,2\n30#1:127,11\n30#1:123,4\n*E\n"})
/* loaded from: classes.dex */
public final class SportsBasketballKt {

    @Nullable
    private static ImageVector _sportsBasketball;

    @NotNull
    public static final ImageVector getSportsBasketball(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _sportsBasketball;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SportsBasketball", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.23f, 7.75f);
        pathBuilder.curveTo(6.1f, 8.62f, 6.7f, 9.74f, 6.91f, 11.0f);
        pathBuilder.horizontalLineTo(4.07f);
        pathBuilder.curveTo(4.22f, 9.82f, 4.63f, 8.72f, 5.23f, 7.75f);
        pathBuilder.close();
        pathBuilder.moveTo(4.07f, 13.0f);
        pathBuilder.horizontalLineToRelative(2.84f);
        pathBuilder.curveToRelative(-0.21f, 1.26f, -0.81f, 2.38f, -1.68f, 3.25f);
        pathBuilder.curveTo(4.63f, 15.28f, 4.22f, 14.18f, 4.07f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 19.93f);
        pathBuilder.curveToRelative(-1.73f, -0.22f, -3.29f, -1.0f, -4.49f, -2.14f);
        pathBuilder.curveToRelative(1.3f, -1.24f, 2.19f, -2.91f, 2.42f, -4.79f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.verticalLineTo(19.93f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 11.0f);
        pathBuilder.horizontalLineTo(8.93f);
        pathBuilder.curveTo(8.69f, 9.12f, 7.81f, 7.44f, 6.5f, 6.2f);
        pathBuilder.curveTo(7.71f, 5.06f, 9.27f, 4.29f, 11.0f, 4.07f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.93f, 11.0f);
        pathBuilder.horizontalLineToRelative(-2.84f);
        pathBuilder.curveToRelative(0.21f, -1.26f, 0.81f, -2.38f, 1.68f, -3.25f);
        pathBuilder.curveTo(19.37f, 8.72f, 19.78f, 9.82f, 19.93f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 4.07f);
        pathBuilder.curveToRelative(1.73f, 0.22f, 3.29f, 0.99f, 4.5f, 2.13f);
        pathBuilder.curveToRelative(-1.31f, 1.24f, -2.19f, 2.92f, -2.43f, 4.8f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.verticalLineTo(4.07f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 19.93f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder.horizontalLineToRelative(2.07f);
        pathBuilder.curveToRelative(0.24f, 1.88f, 1.12f, 3.55f, 2.42f, 4.79f);
        pathBuilder.curveTo(16.29f, 18.93f, 14.73f, 19.71f, 13.0f, 19.93f);
        pathBuilder.close();
        pathBuilder.moveTo(18.77f, 16.25f);
        pathBuilder.curveToRelative(-0.87f, -0.86f, -1.46f, -1.99f, -1.68f, -3.25f);
        pathBuilder.horizontalLineToRelative(2.84f);
        pathBuilder.curveTo(19.78f, 14.18f, 19.37f, 15.28f, 18.77f, 16.25f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsBasketball = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
