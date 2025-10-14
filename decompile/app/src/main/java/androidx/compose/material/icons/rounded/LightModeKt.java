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

/* compiled from: LightMode.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_lightMode", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LightMode", "Landroidx/compose/material/icons/Icons$Rounded;", "getLightMode", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLightMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LightMode.kt\nandroidx/compose/material/icons/rounded/LightModeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,108:1\n212#2,12:109\n233#2,18:122\n253#2:159\n174#3:121\n705#4,2:140\n717#4,2:142\n719#4,11:148\n72#5,4:144\n*S KotlinDebug\n*F\n+ 1 LightMode.kt\nandroidx/compose/material/icons/rounded/LightModeKt\n*L\n29#1:109,12\n30#1:122,18\n30#1:159\n29#1:121\n30#1:140,2\n30#1:142,2\n30#1:148,11\n30#1:144,4\n*E\n"})
/* loaded from: classes3.dex */
public final class LightModeKt {

    @Nullable
    private static ImageVector _lightMode;

    @NotNull
    public static final ImageVector getLightMode(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _lightMode;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LightMode", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 7.0f);
        pathBuilder.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilder.reflectiveCurveTo(14.76f, 7.0f, 12.0f, 7.0f);
        pathBuilder.lineTo(12.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(2.0f, 13.0f);
        pathBuilder.lineToRelative(2.0f, 0.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.lineToRelative(-2.0f, 0.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(1.45f, 13.0f, 2.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 13.0f);
        pathBuilder.lineToRelative(2.0f, 0.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.lineToRelative(-2.0f, 0.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(19.45f, 13.0f, 20.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveTo(11.0f, 1.45f, 11.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 20.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.curveTo(11.45f, 19.0f, 11.0f, 19.45f, 11.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.99f, 4.58f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.41f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(1.06f, 1.06f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.41f, 0.0f);
        pathBuilder.reflectiveCurveToRelative(0.39f, -1.03f, 0.0f, -1.41f);
        pathBuilder.lineTo(5.99f, 4.58f);
        pathBuilder.close();
        pathBuilder.moveTo(18.36f, 16.95f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.41f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(1.06f, 1.06f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.41f, 0.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.41f);
        pathBuilder.lineTo(18.36f, 16.95f);
        pathBuilder.close();
        pathBuilder.moveTo(19.42f, 5.99f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.41f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(-1.06f, 1.06f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.41f);
        pathBuilder.reflectiveCurveToRelative(1.03f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineTo(19.42f, 5.99f);
        pathBuilder.close();
        pathBuilder.moveTo(7.05f, 18.36f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.41f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(-1.06f, 1.06f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.41f);
        pathBuilder.reflectiveCurveToRelative(1.03f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineTo(7.05f, 18.36f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _lightMode = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
