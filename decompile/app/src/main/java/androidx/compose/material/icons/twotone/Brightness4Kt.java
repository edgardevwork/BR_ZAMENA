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

/* compiled from: Brightness4.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_brightness4", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Brightness4", "Landroidx/compose/material/icons/Icons$TwoTone;", "getBrightness4", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBrightness4.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brightness4.kt\nandroidx/compose/material/icons/twotone/Brightness4Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,109:1\n212#2,12:110\n233#2,18:123\n253#2:160\n233#2,18:161\n253#2:198\n174#3:122\n705#4,2:141\n717#4,2:143\n719#4,11:149\n705#4,2:179\n717#4,2:181\n719#4,11:187\n72#5,4:145\n72#5,4:183\n*S KotlinDebug\n*F\n+ 1 Brightness4.kt\nandroidx/compose/material/icons/twotone/Brightness4Kt\n*L\n29#1:110,12\n30#1:123,18\n30#1:160\n58#1:161,18\n58#1:198\n29#1:122\n30#1:141,2\n30#1:143,2\n30#1:149,11\n58#1:179,2\n58#1:181,2\n58#1:187,11\n30#1:145,4\n58#1:183,4\n*E\n"})
/* loaded from: classes4.dex */
public final class Brightness4Kt {

    @Nullable
    private static ImageVector _brightness4;

    @NotNull
    public static final ImageVector getBrightness4(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _brightness4;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Brightness4", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 9.52f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineToRelative(-3.52f);
        pathBuilder.lineTo(12.0f, 3.52f);
        pathBuilder.lineTo(9.52f, 6.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineToRelative(3.52f);
        pathBuilder.lineTo(3.52f, 12.0f);
        pathBuilder.lineTo(6.0f, 14.48f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.horizontalLineToRelative(3.52f);
        pathBuilder.lineTo(12.0f, 20.48f);
        pathBuilder.lineTo(14.48f, 18.0f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.verticalLineToRelative(-3.52f);
        pathBuilder.lineTo(20.48f, 12.0f);
        pathBuilder.lineTo(18.0f, 9.52f);
        pathBuilder.close();
        pathBuilder.moveTo(12.29f, 17.0f);
        pathBuilder.curveToRelative(-0.74f, 0.0f, -1.45f, -0.17f, -2.08f, -0.46f);
        pathBuilder.curveToRelative(1.72f, -0.79f, 2.92f, -2.52f, 2.92f, -4.54f);
        pathBuilder.reflectiveCurveToRelative(-1.2f, -3.75f, -2.92f, -4.54f);
        pathBuilder.curveToRelative(0.63f, -0.29f, 1.34f, -0.46f, 2.08f, -0.46f);
        pathBuilder.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(-2.24f, 5.0f, -5.0f, 5.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.0f, 8.69f);
        pathBuilder2.lineTo(20.0f, 4.0f);
        pathBuilder2.horizontalLineToRelative(-4.69f);
        pathBuilder2.lineTo(12.0f, 0.69f);
        pathBuilder2.lineTo(8.69f, 4.0f);
        pathBuilder2.lineTo(4.0f, 4.0f);
        pathBuilder2.verticalLineToRelative(4.69f);
        pathBuilder2.lineTo(0.69f, 12.0f);
        pathBuilder2.lineTo(4.0f, 15.31f);
        pathBuilder2.lineTo(4.0f, 20.0f);
        pathBuilder2.horizontalLineToRelative(4.69f);
        pathBuilder2.lineTo(12.0f, 23.31f);
        pathBuilder2.lineTo(15.31f, 20.0f);
        pathBuilder2.lineTo(20.0f, 20.0f);
        pathBuilder2.verticalLineToRelative(-4.69f);
        pathBuilder2.lineTo(23.31f, 12.0f);
        pathBuilder2.lineTo(20.0f, 8.69f);
        pathBuilder2.close();
        pathBuilder2.moveTo(18.0f, 14.48f);
        pathBuilder2.lineTo(18.0f, 18.0f);
        pathBuilder2.horizontalLineToRelative(-3.52f);
        pathBuilder2.lineTo(12.0f, 20.48f);
        pathBuilder2.lineTo(9.52f, 18.0f);
        pathBuilder2.lineTo(6.0f, 18.0f);
        pathBuilder2.verticalLineToRelative(-3.52f);
        pathBuilder2.lineTo(3.52f, 12.0f);
        pathBuilder2.lineTo(6.0f, 9.52f);
        pathBuilder2.lineTo(6.0f, 6.0f);
        pathBuilder2.horizontalLineToRelative(3.52f);
        pathBuilder2.lineTo(12.0f, 3.52f);
        pathBuilder2.lineTo(14.48f, 6.0f);
        pathBuilder2.lineTo(18.0f, 6.0f);
        pathBuilder2.verticalLineToRelative(3.52f);
        pathBuilder2.lineTo(20.48f, 12.0f);
        pathBuilder2.lineTo(18.0f, 14.48f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.29f, 7.0f);
        pathBuilder2.curveToRelative(-0.74f, 0.0f, -1.45f, 0.17f, -2.08f, 0.46f);
        pathBuilder2.curveToRelative(1.72f, 0.79f, 2.92f, 2.53f, 2.92f, 4.54f);
        pathBuilder2.reflectiveCurveToRelative(-1.2f, 3.75f, -2.92f, 4.54f);
        pathBuilder2.curveToRelative(0.63f, 0.29f, 1.34f, 0.46f, 2.08f, 0.46f);
        pathBuilder2.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilder2.reflectiveCurveToRelative(-2.24f, -5.0f, -5.0f, -5.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brightness4 = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
