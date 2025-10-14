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

/* compiled from: DoNotTouch.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_doNotTouch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DoNotTouch", "Landroidx/compose/material/icons/Icons$Filled;", "getDoNotTouch", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDoNotTouch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoNotTouch.kt\nandroidx/compose/material/icons/filled/DoNotTouchKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,109:1\n212#2,12:110\n233#2,18:123\n253#2:160\n174#3:122\n705#4,2:141\n717#4,2:143\n719#4,11:149\n72#5,4:145\n*S KotlinDebug\n*F\n+ 1 DoNotTouch.kt\nandroidx/compose/material/icons/filled/DoNotTouchKt\n*L\n29#1:110,12\n30#1:123,18\n30#1:160\n29#1:122\n30#1:141,2\n30#1:143,2\n30#1:149,11\n30#1:145,4\n*E\n"})
/* loaded from: classes2.dex */
public final class DoNotTouchKt {

    @Nullable
    private static ImageVector _doNotTouch;

    @NotNull
    public static final ImageVector getDoNotTouch(@NotNull Icons.Filled filled) {
        ImageVector imageVector = _doNotTouch;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DoNotTouch", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 10.17f);
        pathBuilder.lineToRelative(-2.5f, -2.5f);
        pathBuilder.verticalLineTo(2.25f);
        pathBuilder.curveTo(10.5f, 1.56f, 11.06f, 1.0f, 11.75f, 1.0f);
        pathBuilder.reflectiveCurveTo(13.0f, 1.56f, 13.0f, 2.25f);
        pathBuilder.verticalLineTo(10.17f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 12.75f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.verticalLineTo(5.25f);
        pathBuilder.curveTo(20.0f, 4.56f, 19.44f, 4.0f, 18.75f, 4.0f);
        pathBuilder.reflectiveCurveTo(17.5f, 4.56f, 17.5f, 5.25f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineTo(3.25f);
        pathBuilder.curveTo(16.5f, 2.56f, 15.94f, 2.0f, 15.25f, 2.0f);
        pathBuilder.reflectiveCurveTo(14.0f, 2.56f, 14.0f, 3.25f);
        pathBuilder.verticalLineToRelative(7.92f);
        pathBuilder.lineToRelative(6.0f, 6.0f);
        pathBuilder.verticalLineTo(12.75f);
        pathBuilder.close();
        pathBuilder.moveTo(9.5f, 4.25f);
        pathBuilder.curveTo(9.5f, 3.56f, 8.94f, 3.0f, 8.25f, 3.0f);
        pathBuilder.curveToRelative(-0.67f, 0.0f, -1.2f, 0.53f, -1.24f, 1.18f);
        pathBuilder.lineTo(9.5f, 6.67f);
        pathBuilder.verticalLineTo(4.25f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 10.17f);
        pathBuilder.lineToRelative(-2.5f, -2.5f);
        pathBuilder.verticalLineTo(2.25f);
        pathBuilder.curveTo(10.5f, 1.56f, 11.06f, 1.0f, 11.75f, 1.0f);
        pathBuilder.reflectiveCurveTo(13.0f, 1.56f, 13.0f, 2.25f);
        pathBuilder.verticalLineTo(10.17f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 12.75f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.verticalLineTo(5.25f);
        pathBuilder.curveTo(20.0f, 4.56f, 19.44f, 4.0f, 18.75f, 4.0f);
        pathBuilder.reflectiveCurveTo(17.5f, 4.56f, 17.5f, 5.25f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineTo(3.25f);
        pathBuilder.curveTo(16.5f, 2.56f, 15.94f, 2.0f, 15.25f, 2.0f);
        pathBuilder.reflectiveCurveTo(14.0f, 2.56f, 14.0f, 3.25f);
        pathBuilder.verticalLineToRelative(7.92f);
        pathBuilder.lineToRelative(6.0f, 6.0f);
        pathBuilder.verticalLineTo(12.75f);
        pathBuilder.close();
        pathBuilder.moveTo(9.5f, 4.25f);
        pathBuilder.curveTo(9.5f, 3.56f, 8.94f, 3.0f, 8.25f, 3.0f);
        pathBuilder.curveToRelative(-0.67f, 0.0f, -1.2f, 0.53f, -1.24f, 1.18f);
        pathBuilder.lineTo(9.5f, 6.67f);
        pathBuilder.verticalLineTo(4.25f);
        pathBuilder.close();
        pathBuilder.moveTo(21.19f, 21.19f);
        pathBuilder.lineTo(2.81f, 2.81f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.lineToRelative(5.63f, 5.63f);
        pathBuilder.lineTo(7.0f, 9.83f);
        pathBuilder.verticalLineToRelative(4.3f);
        pathBuilder.curveToRelative(-1.11f, -0.64f, -2.58f, -1.47f, -2.6f, -1.48f);
        pathBuilder.curveToRelative(-0.17f, -0.09f, -0.34f, -0.14f, -0.54f, -0.14f);
        pathBuilder.curveToRelative(-0.26f, 0.0f, -0.5f, 0.09f, -0.7f, 0.26f);
        pathBuilder.curveTo(3.12f, 12.78f, 2.0f, 13.88f, 2.0f, 13.88f);
        pathBuilder.lineToRelative(6.8f, 7.18f);
        pathBuilder.curveToRelative(0.57f, 0.6f, 1.35f, 0.94f, 2.18f, 0.94f);
        pathBuilder.horizontalLineTo(17.0f);
        pathBuilder.curveToRelative(0.62f, 0.0f, 1.18f, -0.19f, 1.65f, -0.52f);
        pathBuilder.lineToRelative(-0.02f, -0.02f);
        pathBuilder.lineToRelative(1.15f, 1.15f);
        pathBuilder.lineTo(21.19f, 21.19f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doNotTouch = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
