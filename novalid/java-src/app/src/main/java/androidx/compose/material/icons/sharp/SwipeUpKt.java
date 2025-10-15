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

/* compiled from: SwipeUp.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_swipeUp", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SwipeUp", "Landroidx/compose/material/icons/Icons$Sharp;", "getSwipeUp", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSwipeUp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeUp.kt\nandroidx/compose/material/icons/sharp/SwipeUpKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,63:1\n212#2,12:64\n233#2,18:77\n253#2:114\n174#3:76\n705#4,2:95\n717#4,2:97\n719#4,11:103\n72#5,4:99\n*S KotlinDebug\n*F\n+ 1 SwipeUp.kt\nandroidx/compose/material/icons/sharp/SwipeUpKt\n*L\n29#1:64,12\n30#1:77,18\n30#1:114\n29#1:76\n30#1:95,2\n30#1:97,2\n30#1:103,11\n30#1:99,4\n*E\n"})
/* loaded from: classes3.dex */
public final class SwipeUpKt {

    @Nullable
    private static ImageVector _swipeUp;

    @NotNull
    public static final ImageVector getSwipeUp(@NotNull Icons.Sharp sharp) {
        ImageVector imageVector = _swipeUp;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SwipeUp", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.06f, 5.56f);
        pathBuilder.lineTo(1.0f, 4.5f);
        pathBuilder.lineTo(4.5f, 1.0f);
        pathBuilder.lineTo(8.0f, 4.5f);
        pathBuilder.lineTo(6.94f, 5.56f);
        pathBuilder.lineTo(5.32f, 3.94f);
        pathBuilder.curveTo(5.11f, 4.76f, 5.0f, 5.62f, 5.0f, 6.5f);
        pathBuilder.curveToRelative(0.0f, 2.42f, 0.82f, 4.65f, 2.2f, 6.43f);
        pathBuilder.lineTo(6.13f, 14.0f);
        pathBuilder.curveTo(4.49f, 11.95f, 3.5f, 9.34f, 3.5f, 6.5f);
        pathBuilder.curveToRelative(0.0f, -0.92f, 0.1f, -1.82f, 0.3f, -2.68f);
        pathBuilder.lineTo(2.06f, 5.56f);
        pathBuilder.close();
        pathBuilder.moveTo(21.71f, 11.18f);
        pathBuilder.lineToRelative(2.09f, 7.39f);
        pathBuilder.lineToRelative(-8.23f, 3.65f);
        pathBuilder.lineToRelative(-6.84f, -2.85f);
        pathBuilder.lineToRelative(0.61f, -1.62f);
        pathBuilder.lineToRelative(3.8f, -0.75f);
        pathBuilder.lineTo(8.79f, 7.17f);
        pathBuilder.curveToRelative(-0.34f, -0.76f, 0.0f, -1.64f, 0.76f, -1.98f);
        pathBuilder.curveToRelative(0.76f, -0.34f, 1.64f, 0.0f, 1.98f, 0.76f);
        pathBuilder.lineToRelative(2.43f, 5.49f);
        pathBuilder.lineToRelative(1.26f, -0.56f);
        pathBuilder.lineTo(21.71f, 11.18f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeUp = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
