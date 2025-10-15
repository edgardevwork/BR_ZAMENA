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

/* compiled from: FlightTakeoff.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_flightTakeoff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FlightTakeoff", "Landroidx/compose/material/icons/Icons$Rounded;", "getFlightTakeoff", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFlightTakeoff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightTakeoff.kt\nandroidx/compose/material/icons/rounded/FlightTakeoffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,62:1\n212#2,12:63\n233#2,18:76\n253#2:113\n174#3:75\n705#4,2:94\n717#4,2:96\n719#4,11:102\n72#5,4:98\n*S KotlinDebug\n*F\n+ 1 FlightTakeoff.kt\nandroidx/compose/material/icons/rounded/FlightTakeoffKt\n*L\n29#1:63,12\n30#1:76,18\n30#1:113\n29#1:75\n30#1:94,2\n30#1:96,2\n30#1:102,11\n30#1:98,4\n*E\n"})
/* loaded from: classes2.dex */
public final class FlightTakeoffKt {

    @Nullable
    private static ImageVector _flightTakeoff;

    @NotNull
    public static final ImageVector getFlightTakeoff(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _flightTakeoff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FlightTakeoff", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.5f, 19.0f);
        pathBuilder.horizontalLineToRelative(-17.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(17.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.07f, 9.64f);
        pathBuilder.curveToRelative(-0.22f, -0.8f, -1.04f, -1.27f, -1.84f, -1.06f);
        pathBuilder.lineTo(14.92f, 10.0f);
        pathBuilder.lineTo(8.46f, 3.98f);
        pathBuilder.curveToRelative(-0.27f, -0.26f, -0.66f, -0.35f, -1.02f, -0.25f);
        pathBuilder.curveToRelative(-0.68f, 0.19f, -1.0f, 0.97f, -0.65f, 1.58f);
        pathBuilder.lineToRelative(3.44f, 5.96f);
        pathBuilder.lineToRelative(-4.97f, 1.33f);
        pathBuilder.lineToRelative(-1.57f, -1.24f);
        pathBuilder.curveToRelative(-0.25f, -0.19f, -0.57f, -0.26f, -0.88f, -0.18f);
        pathBuilder.lineToRelative(-0.33f, 0.09f);
        pathBuilder.curveToRelative(-0.32f, 0.08f, -0.47f, 0.45f, -0.3f, 0.73f);
        pathBuilder.lineToRelative(1.88f, 3.25f);
        pathBuilder.curveToRelative(0.23f, 0.39f, 0.69f, 0.58f, 1.12f, 0.47f);
        pathBuilder.lineTo(21.0f, 11.48f);
        pathBuilder.curveToRelative(0.8f, -0.22f, 1.28f, -1.04f, 1.07f, -1.84f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flightTakeoff = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
