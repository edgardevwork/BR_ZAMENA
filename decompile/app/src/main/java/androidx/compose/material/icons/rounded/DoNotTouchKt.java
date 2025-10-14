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

/* compiled from: DoNotTouch.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_doNotTouch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DoNotTouch", "Landroidx/compose/material/icons/Icons$Rounded;", "getDoNotTouch", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDoNotTouch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoNotTouch.kt\nandroidx/compose/material/icons/rounded/DoNotTouchKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,88:1\n212#2,12:89\n233#2,18:102\n253#2:139\n174#3:101\n705#4,2:120\n717#4,2:122\n719#4,11:128\n72#5,4:124\n*S KotlinDebug\n*F\n+ 1 DoNotTouch.kt\nandroidx/compose/material/icons/rounded/DoNotTouchKt\n*L\n29#1:89,12\n30#1:102,18\n30#1:139\n29#1:101\n30#1:120,2\n30#1:122,2\n30#1:128,11\n30#1:124,4\n*E\n"})
/* loaded from: classes4.dex */
public final class DoNotTouchKt {

    @Nullable
    private static ImageVector _doNotTouch;

    @NotNull
    public static final ImageVector getDoNotTouch(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _doNotTouch;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DoNotTouch", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 10.17f);
        pathBuilder.lineToRelative(-2.5f, -2.5f);
        pathBuilder.verticalLineTo(2.25f);
        pathBuilder.curveTo(10.5f, 1.56f, 11.06f, 1.0f, 11.75f, 1.0f);
        pathBuilder.curveTo(12.44f, 1.0f, 13.0f, 1.56f, 13.0f, 2.25f);
        pathBuilder.verticalLineTo(10.17f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 5.32f);
        pathBuilder.curveToRelative(0.0f, -0.65f, -0.47f, -1.25f, -1.12f, -1.32f);
        pathBuilder.curveToRelative(-0.75f, -0.08f, -1.38f, 0.51f, -1.38f, 1.24f);
        pathBuilder.verticalLineToRelative(5.25f);
        pathBuilder.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.lineToRelative(0.0f, -7.18f);
        pathBuilder.curveToRelative(0.0f, -0.65f, -0.47f, -1.25f, -1.12f, -1.32f);
        pathBuilder.curveTo(14.63f, 1.93f, 14.0f, 2.52f, 14.0f, 3.25f);
        pathBuilder.verticalLineToRelative(7.92f);
        pathBuilder.lineToRelative(6.0f, 6.0f);
        pathBuilder.lineTo(20.0f, 5.32f);
        pathBuilder.close();
        pathBuilder.moveTo(9.5f, 4.25f);
        pathBuilder.curveTo(9.5f, 3.56f, 8.94f, 3.0f, 8.25f, 3.0f);
        pathBuilder.curveToRelative(-0.67f, 0.0f, -1.2f, 0.53f, -1.24f, 1.18f);
        pathBuilder.lineTo(9.5f, 6.67f);
        pathBuilder.verticalLineTo(4.25f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 22.0f);
        pathBuilder.curveToRelative(0.62f, 0.0f, 1.18f, -0.19f, 1.65f, -0.52f);
        pathBuilder.lineToRelative(-0.02f, -0.02f);
        pathBuilder.lineToRelative(0.44f, 0.44f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineTo(3.51f, 3.51f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(4.92f, 4.92f);
        pathBuilder.lineTo(7.0f, 9.83f);
        pathBuilder.verticalLineToRelative(4.3f);
        pathBuilder.lineToRelative(-2.6f, -1.48f);
        pathBuilder.curveToRelative(-0.17f, -0.09f, -0.34f, -0.14f, -0.54f, -0.14f);
        pathBuilder.curveToRelative(-0.26f, 0.0f, -0.5f, 0.09f, -0.7f, 0.26f);
        pathBuilder.lineTo(2.0f, 13.88f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.lineToRelative(6.8f, 7.18f);
        pathBuilder.curveToRelative(0.57f, 0.6f, 1.35f, 0.94f, 2.18f, 0.94f);
        pathBuilder.lineTo(17.0f, 22.0f);
        pathBuilder.lineTo(17.0f, 22.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doNotTouch = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
