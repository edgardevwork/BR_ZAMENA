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

/* compiled from: ThermostatAuto.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_thermostatAuto", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ThermostatAuto", "Landroidx/compose/material/icons/Icons$TwoTone;", "getThermostatAuto", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nThermostatAuto.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThermostatAuto.kt\nandroidx/compose/material/icons/twotone/ThermostatAutoKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,93:1\n212#2,12:94\n233#2,18:107\n253#2:144\n233#2,18:145\n253#2:182\n174#3:106\n705#4,2:125\n717#4,2:127\n719#4,11:133\n705#4,2:163\n717#4,2:165\n719#4,11:171\n72#5,4:129\n72#5,4:167\n*S KotlinDebug\n*F\n+ 1 ThermostatAuto.kt\nandroidx/compose/material/icons/twotone/ThermostatAutoKt\n*L\n29#1:94,12\n30#1:107,18\n30#1:144\n43#1:145,18\n43#1:182\n29#1:106\n30#1:125,2\n30#1:127,2\n30#1:133,11\n43#1:163,2\n43#1:165,2\n43#1:171,11\n30#1:129,4\n43#1:167,4\n*E\n"})
/* loaded from: classes4.dex */
public final class ThermostatAutoKt {

    @Nullable
    private static ImageVector _thermostatAuto;

    @NotNull
    public static final ImageVector getThermostatAuto(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _thermostatAuto;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ThermostatAuto", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.8f, 13.6f);
        pathBuilder.lineTo(9.0f, 13.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveTo(7.0f, 5.45f, 7.0f, 6.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.lineToRelative(-0.8f, 0.6f);
        pathBuilder.curveTo(5.45f, 14.16f, 5.0f, 15.06f, 5.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.curveTo(11.0f, 15.06f, 10.55f, 14.17f, 9.8f, 13.6f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(11.0f, 12.0f);
        pathBuilder2.verticalLineTo(6.0f);
        pathBuilder2.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder2.reflectiveCurveTo(5.0f, 4.34f, 5.0f, 6.0f);
        pathBuilder2.verticalLineToRelative(6.0f);
        pathBuilder2.curveToRelative(-1.21f, 0.91f, -2.0f, 2.37f, -2.0f, 4.0f);
        pathBuilder2.curveToRelative(0.0f, 1.12f, 0.38f, 2.14f, 1.0f, 2.97f);
        pathBuilder2.verticalLineTo(19.0f);
        pathBuilder2.horizontalLineToRelative(0.02f);
        pathBuilder2.curveToRelative(0.91f, 1.21f, 2.35f, 2.0f, 3.98f, 2.0f);
        pathBuilder2.reflectiveCurveToRelative(3.06f, -0.79f, 3.98f, -2.0f);
        pathBuilder2.horizontalLineTo(12.0f);
        pathBuilder2.verticalLineToRelative(-0.03f);
        pathBuilder2.curveToRelative(0.62f, -0.83f, 1.0f, -1.85f, 1.0f, -2.97f);
        pathBuilder2.curveTo(13.0f, 14.37f, 12.21f, 12.91f, 11.0f, 12.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(5.0f, 16.0f);
        pathBuilder2.curveToRelative(0.0f, -0.94f, 0.45f, -1.84f, 1.2f, -2.4f);
        pathBuilder2.lineTo(7.0f, 13.0f);
        pathBuilder2.verticalLineTo(6.0f);
        pathBuilder2.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder2.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder2.verticalLineToRelative(7.0f);
        pathBuilder2.lineToRelative(0.8f, 0.6f);
        pathBuilder2.curveToRelative(0.75f, 0.57f, 1.2f, 1.46f, 1.2f, 2.4f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(18.62f, 4.0f);
        pathBuilder2.horizontalLineToRelative(-1.61f);
        pathBuilder2.lineToRelative(-3.38f, 9.0f);
        pathBuilder2.horizontalLineToRelative(1.56f);
        pathBuilder2.lineTo(16.0f, 10.7f);
        pathBuilder2.horizontalLineToRelative(3.63f);
        pathBuilder2.lineToRelative(0.8f, 2.3f);
        pathBuilder2.horizontalLineTo(22.0f);
        pathBuilder2.lineTo(18.62f, 4.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.47f, 9.39f);
        pathBuilder2.lineToRelative(1.31f, -3.72f);
        pathBuilder2.horizontalLineToRelative(0.08f);
        pathBuilder2.lineToRelative(1.31f, 3.72f);
        pathBuilder2.horizontalLineTo(16.47f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thermostatAuto = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
