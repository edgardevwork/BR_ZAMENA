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

/* compiled from: Sensors.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_sensors", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Sensors", "Landroidx/compose/material/icons/Icons$Sharp;", "getSensors", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSensors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sensors.kt\nandroidx/compose/material/icons/sharp/SensorsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,75:1\n212#2,12:76\n233#2,18:89\n253#2:126\n174#3:88\n705#4,2:107\n717#4,2:109\n719#4,11:115\n72#5,4:111\n*S KotlinDebug\n*F\n+ 1 Sensors.kt\nandroidx/compose/material/icons/sharp/SensorsKt\n*L\n29#1:76,12\n30#1:89,18\n30#1:126\n29#1:88\n30#1:107,2\n30#1:109,2\n30#1:115,11\n30#1:111,4\n*E\n"})
/* loaded from: classes4.dex */
public final class SensorsKt {

    @Nullable
    private static ImageVector _sensors;

    @NotNull
    public static final ImageVector getSensors(@NotNull Icons.Sharp sharp) {
        ImageVector imageVector = _sensors;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Sensors", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.76f, 16.24f);
        pathBuilder.curveTo(6.67f, 15.16f, 6.0f, 13.66f, 6.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(0.67f, -3.16f, 1.76f, -4.24f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        pathBuilder.curveTo(8.45f, 9.9f, 8.0f, 10.9f, 8.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.45f, 2.1f, 1.17f, 2.83f);
        pathBuilder.lineTo(7.76f, 16.24f);
        pathBuilder.close();
        pathBuilder.moveTo(16.24f, 16.24f);
        pathBuilder.curveTo(17.33f, 15.16f, 18.0f, 13.66f, 18.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(-0.67f, -3.16f, -1.76f, -4.24f);
        pathBuilder.lineToRelative(-1.42f, 1.42f);
        pathBuilder.curveTo(15.55f, 9.9f, 16.0f, 10.9f, 16.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.45f, 2.1f, -1.17f, 2.83f);
        pathBuilder.lineTo(16.24f, 16.24f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 10.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(13.1f, 10.0f, 12.0f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 2.21f, -0.9f, 4.21f, -2.35f, 5.65f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        pathBuilder.curveTo(20.88f, 17.26f, 22.0f, 14.76f, 22.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(-1.12f, -5.26f, -2.93f, -7.07f);
        pathBuilder.lineToRelative(-1.42f, 1.42f);
        pathBuilder.curveTo(19.1f, 7.79f, 20.0f, 9.79f, 20.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.35f, 6.35f);
        pathBuilder.lineTo(4.93f, 4.93f);
        pathBuilder.curveTo(3.12f, 6.74f, 2.0f, 9.24f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(1.12f, 5.26f, 2.93f, 7.07f);
        pathBuilder.lineToRelative(1.42f, -1.42f);
        pathBuilder.curveTo(4.9f, 16.21f, 4.0f, 14.21f, 4.0f, 12.0f);
        pathBuilder.reflectiveCurveTo(4.9f, 7.79f, 6.35f, 6.35f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sensors = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
