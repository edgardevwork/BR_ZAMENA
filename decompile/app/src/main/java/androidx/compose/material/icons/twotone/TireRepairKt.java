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

/* compiled from: TireRepair.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_tireRepair", "Landroidx/compose/ui/graphics/vector/ImageVector;", "TireRepair", "Landroidx/compose/material/icons/Icons$TwoTone;", "getTireRepair", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTireRepair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TireRepair.kt\nandroidx/compose/material/icons/twotone/TireRepairKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,152:1\n212#2,12:153\n233#2,18:166\n253#2:203\n233#2,18:204\n253#2:241\n174#3:165\n705#4,2:184\n717#4,2:186\n719#4,11:192\n705#4,2:222\n717#4,2:224\n719#4,11:230\n72#5,4:188\n72#5,4:226\n*S KotlinDebug\n*F\n+ 1 TireRepair.kt\nandroidx/compose/material/icons/twotone/TireRepairKt\n*L\n29#1:153,12\n30#1:166,18\n30#1:203\n104#1:204,18\n104#1:241\n29#1:165\n30#1:184,2\n30#1:186,2\n30#1:192,11\n104#1:222,2\n104#1:224,2\n104#1:230,11\n30#1:188,4\n104#1:226,4\n*E\n"})
/* loaded from: classes2.dex */
public final class TireRepairKt {

    @Nullable
    private static ImageVector _tireRepair;

    @NotNull
    public static final ImageVector getTireRepair(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _tireRepair;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.TireRepair", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 8.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.11f, -0.53f, 0.29f, -0.71f);
        pathBuilder.curveToRelative(0.4f, -0.4f, 2.46f, -1.04f, 2.46f, -1.04f);
        pathBuilder.reflectiveCurveToRelative(-0.64f, 2.06f, -1.04f, 2.46f);
        pathBuilder.curveTo(19.53f, 7.89f, 19.28f, 8.0f, 19.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 13.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-3.0f, -1.35f, -3.0f, -3.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(8.17f);
        pathBuilder.curveToRelative(0.31f, -0.11f, 0.65f, -0.17f, 1.0f, -0.17f);
        pathBuilder.curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-5.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.lineToRelative(0.0f, -1.42f);
        pathBuilder.curveToRelative(-1.77f, -0.77f, -3.0f, -2.53f, -3.0f, -4.58f);
        pathBuilder.curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f);
        pathBuilder.reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, 2.05f, -1.23f, 3.81f, -3.0f, 4.58f);
        pathBuilder.lineTo(21.0f, 13.0f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 7.0f);
        pathBuilder.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(-3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveTo(22.0f, 8.66f, 22.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 7.0f);
        pathBuilder.lineTo(8.0f, 9.0f);
        pathBuilder.verticalLineTo(6.17f);
        pathBuilder.lineTo(9.17f, 5.0f);
        pathBuilder.horizontalLineTo(4.83f);
        pathBuilder.lineTo(6.0f, 6.17f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.lineTo(4.0f, 7.0f);
        pathBuilder.verticalLineToRelative(2.17f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.verticalLineTo(14.0f);
        pathBuilder.lineToRelative(-2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(2.17f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.lineToRelative(-2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.lineToRelative(-2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(-2.83f);
        pathBuilder.lineToRelative(2.0f, -2.0f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.lineToRelative(-2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(-2.83f);
        pathBuilder.lineToRelative(2.0f, -2.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(10.0f, 7.0f);
        pathBuilder2.lineTo(8.0f, 9.0f);
        pathBuilder2.verticalLineTo(6.17f);
        pathBuilder2.lineTo(9.17f, 5.0f);
        pathBuilder2.horizontalLineTo(4.83f);
        pathBuilder2.lineTo(6.0f, 6.17f);
        pathBuilder2.verticalLineTo(9.0f);
        pathBuilder2.lineTo(4.0f, 7.0f);
        pathBuilder2.verticalLineToRelative(2.17f);
        pathBuilder2.lineToRelative(2.0f, 2.0f);
        pathBuilder2.verticalLineTo(14.0f);
        pathBuilder2.lineToRelative(-2.0f, -2.0f);
        pathBuilder2.verticalLineToRelative(2.17f);
        pathBuilder2.lineToRelative(2.0f, 2.0f);
        pathBuilder2.verticalLineTo(19.0f);
        pathBuilder2.lineToRelative(-2.0f, -2.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(6.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.lineToRelative(-2.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(-2.83f);
        pathBuilder2.lineToRelative(2.0f, -2.0f);
        pathBuilder2.verticalLineTo(12.0f);
        pathBuilder2.lineToRelative(-2.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(-2.83f);
        pathBuilder2.lineToRelative(2.0f, -2.0f);
        pathBuilder2.verticalLineTo(7.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 4.0f);
        pathBuilder2.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilder2.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder2.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder2.reflectiveCurveTo(20.66f, 4.0f, 19.0f, 4.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.71f, 7.71f);
        pathBuilder2.curveTo(19.53f, 7.89f, 19.28f, 8.0f, 19.0f, 8.0f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder2.curveToRelative(0.0f, -0.28f, 0.11f, -0.53f, 0.29f, -0.71f);
        pathBuilder2.curveToRelative(0.4f, -0.4f, 2.46f, -1.04f, 2.46f, -1.04f);
        pathBuilder2.reflectiveCurveTo(20.11f, 7.31f, 19.71f, 7.71f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tireRepair = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
