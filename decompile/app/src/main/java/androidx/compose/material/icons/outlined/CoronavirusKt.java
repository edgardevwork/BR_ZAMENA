package androidx.compose.material.icons.outlined;

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

/* compiled from: Coronavirus.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_coronavirus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Coronavirus", "Landroidx/compose/material/icons/Icons$Outlined;", "getCoronavirus", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCoronavirus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Coronavirus.kt\nandroidx/compose/material/icons/outlined/CoronavirusKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,157:1\n212#2,12:158\n233#2,18:171\n253#2:208\n174#3:170\n705#4,2:189\n717#4,2:191\n719#4,11:197\n72#5,4:193\n*S KotlinDebug\n*F\n+ 1 Coronavirus.kt\nandroidx/compose/material/icons/outlined/CoronavirusKt\n*L\n29#1:158,12\n30#1:171,18\n30#1:208\n29#1:170\n30#1:189,2\n30#1:191,2\n30#1:197,11\n30#1:193,4\n*E\n"})
/* loaded from: classes.dex */
public final class CoronavirusKt {

    @Nullable
    private static ImageVector _coronavirus;

    @NotNull
    public static final ImageVector getCoronavirus(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _coronavirus;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Coronavirus", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.5f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveTo(9.5f, 11.45f, 9.5f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.75f, 10.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(13.2f, 10.0f, 13.75f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.25f, 10.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(9.7f, 10.0f, 10.25f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.25f, 14.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.curveTo(11.25f, 14.45f, 10.8f, 14.0f, 10.25f, 14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 11.25f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilder.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilder.horizontalLineToRelative(-1.54f);
        pathBuilder.curveToRelative(-0.15f, 1.37f, -0.69f, 2.63f, -1.52f, 3.65f);
        pathBuilder.lineToRelative(1.09f, 1.09f);
        pathBuilder.lineToRelative(0.01f, -0.01f);
        pathBuilder.curveToRelative(0.29f, -0.29f, 0.77f, -0.29f, 1.06f, 0.0f);
        pathBuilder.curveToRelative(0.29f, 0.29f, 0.29f, 0.77f, 0.0f, 1.06f);
        pathBuilder.lineToRelative(-1.06f, 1.06f);
        pathBuilder.curveToRelative(-0.29f, 0.29f, -0.77f, 0.29f, -1.06f, 0.0f);
        pathBuilder.curveToRelative(-0.29f, -0.29f, -0.29f, -0.76f, -0.01f, -1.05f);
        pathBuilder.lineToRelative(-1.09f, -1.09f);
        pathBuilder.curveToRelative(-1.02f, 0.82f, -2.27f, 1.36f, -3.64f, 1.51f);
        pathBuilder.verticalLineToRelative(1.54f);
        pathBuilder.horizontalLineToRelative(0.01f);
        pathBuilder.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilder.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilder.curveToRelative(0.0f, -0.41f, 0.33f, -0.74f, 0.74f, -0.75f);
        pathBuilder.verticalLineToRelative(-1.55f);
        pathBuilder.curveToRelative(-1.37f, -0.15f, -2.62f, -0.69f, -3.63f, -1.51f);
        pathBuilder.lineToRelative(-1.09f, 1.09f);
        pathBuilder.lineToRelative(0.01f, 0.01f);
        pathBuilder.curveToRelative(0.29f, 0.29f, 0.29f, 0.77f, 0.0f, 1.06f);
        pathBuilder.curveToRelative(-0.29f, 0.29f, -0.77f, 0.29f, -1.06f, 0.0f);
        pathBuilder.lineTo(4.4f, 18.54f);
        pathBuilder.curveToRelative(-0.29f, -0.29f, -0.29f, -0.77f, 0.0f, -1.06f);
        pathBuilder.curveToRelative(0.29f, -0.29f, 0.76f, -0.29f, 1.05f, -0.01f);
        pathBuilder.lineToRelative(1.09f, -1.09f);
        pathBuilder.curveToRelative(-0.82f, -1.02f, -1.36f, -2.26f, -1.5f, -3.63f);
        pathBuilder.horizontalLineTo(3.5f);
        pathBuilder.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilder.curveTo(2.34f, 13.5f, 2.0f, 13.16f, 2.0f, 12.75f);
        pathBuilder.verticalLineToRelative(-1.5f);
        pathBuilder.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilder.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilder.horizontalLineToRelative(1.54f);
        pathBuilder.curveToRelative(0.15f, -1.37f, 0.69f, -2.61f, 1.5f, -3.63f);
        pathBuilder.lineTo(5.45f, 6.53f);
        pathBuilder.curveTo(5.16f, 6.81f, 4.69f, 6.81f, 4.4f, 6.52f);
        pathBuilder.curveToRelative(-0.29f, -0.29f, -0.29f, -0.77f, 0.0f, -1.06f);
        pathBuilder.lineTo(5.46f, 4.4f);
        pathBuilder.curveToRelative(0.29f, -0.29f, 0.77f, -0.29f, 1.06f, 0.0f);
        pathBuilder.curveToRelative(0.29f, 0.29f, 0.29f, 0.77f, 0.0f, 1.06f);
        pathBuilder.lineTo(6.51f, 5.47f);
        pathBuilder.lineTo(7.6f, 6.56f);
        pathBuilder.curveToRelative(1.02f, -0.82f, 2.26f, -1.36f, 3.63f, -1.51f);
        pathBuilder.verticalLineTo(3.5f);
        pathBuilder.curveToRelative(-0.41f, -0.01f, -0.74f, -0.34f, -0.74f, -0.75f);
        pathBuilder.curveTo(10.5f, 2.34f, 10.84f, 2.0f, 11.25f, 2.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilder.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilder.horizontalLineToRelative(-0.01f);
        pathBuilder.verticalLineToRelative(1.54f);
        pathBuilder.curveToRelative(1.37f, 0.14f, 2.62f, 0.69f, 3.64f, 1.51f);
        pathBuilder.lineToRelative(1.09f, -1.09f);
        pathBuilder.curveToRelative(-0.29f, -0.29f, -0.28f, -0.76f, 0.01f, -1.05f);
        pathBuilder.curveToRelative(0.29f, -0.29f, 0.77f, -0.29f, 1.06f, 0.0f);
        pathBuilder.lineToRelative(1.06f, 1.06f);
        pathBuilder.curveToRelative(0.29f, 0.29f, 0.29f, 0.77f, 0.0f, 1.06f);
        pathBuilder.reflectiveCurveToRelative(-0.77f, 0.29f, -1.06f, 0.0f);
        pathBuilder.lineToRelative(-0.01f, -0.01f);
        pathBuilder.lineTo(17.44f, 7.6f);
        pathBuilder.curveToRelative(0.82f, 1.02f, 1.37f, 2.27f, 1.52f, 3.65f);
        pathBuilder.horizontalLineToRelative(1.54f);
        pathBuilder.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilder.curveTo(21.66f, 10.5f, 22.0f, 10.84f, 22.0f, 11.25f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        pathBuilder.reflectiveCurveToRelative(-5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder.reflectiveCurveTo(17.0f, 14.76f, 17.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 11.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.curveTo(13.0f, 11.45f, 12.55f, 11.0f, 12.0f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.5f, 11.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.curveTo(16.5f, 11.45f, 16.05f, 11.0f, 15.5f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.75f, 14.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.curveTo(14.75f, 14.45f, 14.3f, 14.0f, 13.75f, 14.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _coronavirus = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
