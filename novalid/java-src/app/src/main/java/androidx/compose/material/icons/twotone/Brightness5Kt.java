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

/* compiled from: Brightness5.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_brightness5", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Brightness5", "Landroidx/compose/material/icons/Icons$TwoTone;", "getBrightness5", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBrightness5.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brightness5.kt\nandroidx/compose/material/icons/twotone/Brightness5Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,111:1\n212#2,12:112\n233#2,18:125\n253#2:162\n233#2,18:163\n253#2:200\n174#3:124\n705#4,2:143\n717#4,2:145\n719#4,11:151\n705#4,2:181\n717#4,2:183\n719#4,11:189\n72#5,4:147\n72#5,4:185\n*S KotlinDebug\n*F\n+ 1 Brightness5.kt\nandroidx/compose/material/icons/twotone/Brightness5Kt\n*L\n29#1:112,12\n30#1:125,18\n30#1:162\n56#1:163,18\n56#1:200\n29#1:124\n30#1:143,2\n30#1:145,2\n30#1:151,11\n56#1:181,2\n56#1:183,2\n56#1:189,11\n30#1:147,4\n56#1:185,4\n*E\n"})
/* loaded from: classes4.dex */
public final class Brightness5Kt {

    @Nullable
    private static ImageVector _brightness5;

    @NotNull
    public static final ImageVector getBrightness5(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _brightness5;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Brightness5", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 9.52f);
        pathBuilder.lineTo(18.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(-3.52f);
        pathBuilder.lineTo(12.0f, 3.52f);
        pathBuilder.lineTo(9.52f, 6.0f);
        pathBuilder.lineTo(6.0f, 6.0f);
        pathBuilder.verticalLineToRelative(3.52f);
        pathBuilder.lineTo(3.52f, 12.0f);
        pathBuilder.lineTo(6.0f, 14.48f);
        pathBuilder.lineTo(6.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(3.52f);
        pathBuilder.lineTo(12.0f, 20.48f);
        pathBuilder.lineTo(14.48f, 18.0f);
        pathBuilder.lineTo(18.0f, 18.0f);
        pathBuilder.verticalLineToRelative(-3.52f);
        pathBuilder.lineTo(20.48f, 12.0f);
        pathBuilder.lineTo(18.0f, 9.52f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 17.5f);
        pathBuilder.curveToRelative(-3.03f, 0.0f, -5.5f, -2.47f, -5.5f, -5.5f);
        pathBuilder.reflectiveCurveTo(8.97f, 6.5f, 12.0f, 6.5f);
        pathBuilder.reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f);
        pathBuilder.reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f);
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
        pathBuilder2.moveTo(12.0f, 6.5f);
        pathBuilder2.curveToRelative(-3.03f, 0.0f, -5.5f, 2.47f, -5.5f, 5.5f);
        pathBuilder2.reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f);
        pathBuilder2.reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f);
        pathBuilder2.reflectiveCurveToRelative(-2.47f, -5.5f, -5.5f, -5.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 15.5f);
        pathBuilder2.curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f);
        pathBuilder2.reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f);
        pathBuilder2.reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f);
        pathBuilder2.reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brightness5 = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
