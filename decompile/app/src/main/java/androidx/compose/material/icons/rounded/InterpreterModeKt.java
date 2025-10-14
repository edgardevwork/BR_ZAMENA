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

/* compiled from: InterpreterMode.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_interpreterMode", "Landroidx/compose/ui/graphics/vector/ImageVector;", "InterpreterMode", "Landroidx/compose/material/icons/Icons$Rounded;", "getInterpreterMode", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nInterpreterMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterpreterMode.kt\nandroidx/compose/material/icons/rounded/InterpreterModeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,90:1\n212#2,12:91\n233#2,18:104\n253#2:141\n174#3:103\n705#4,2:122\n717#4,2:124\n719#4,11:130\n72#5,4:126\n*S KotlinDebug\n*F\n+ 1 InterpreterMode.kt\nandroidx/compose/material/icons/rounded/InterpreterModeKt\n*L\n29#1:91,12\n30#1:104,18\n30#1:141\n29#1:103\n30#1:122,2\n30#1:124,2\n30#1:130,11\n30#1:126,4\n*E\n"})
/* loaded from: classes3.dex */
public final class InterpreterModeKt {

    @Nullable
    private static ImageVector _interpreterMode;

    @NotNull
    public static final ImageVector getInterpreterMode(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _interpreterMode;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.InterpreterMode", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.5f, 16.5f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.verticalLineToRelative(-2.5f);
        pathBuilder.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.verticalLineTo(15.0f);
        pathBuilder.curveTo(22.0f, 15.83f, 21.33f, 16.5f, 20.5f, 16.5f);
        pathBuilder.close();
        pathBuilder.moveTo(20.5f, 20.0f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilder.curveToRelative(0.0f, -0.45f, 0.0f, -1.04f, 0.0f, -1.04f);
        pathBuilder.curveToRelative(1.51f, -0.22f, 2.71f, -1.4f, 2.95f, -2.89f);
        pathBuilder.curveTo(24.0f, 15.27f, 23.76f, 15.0f, 23.46f, 15.0f);
        pathBuilder.curveToRelative(-0.24f, 0.0f, -0.45f, 0.17f, -0.49f, 0.41f);
        pathBuilder.curveToRelative(-0.2f, 1.18f, -1.23f, 2.09f, -2.47f, 2.09f);
        pathBuilder.reflectiveCurveToRelative(-2.27f, -0.9f, -2.47f, -2.09f);
        pathBuilder.curveTo(17.99f, 15.17f, 17.78f, 15.0f, 17.54f, 15.0f);
        pathBuilder.curveToRelative(-0.3f, 0.0f, -0.54f, 0.27f, -0.5f, 0.57f);
        pathBuilder.curveToRelative(0.25f, 1.5f, 1.45f, 2.68f, 2.95f, 2.89f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.0f, 0.59f, 0.0f, 1.04f);
        pathBuilder.curveTo(20.0f, 19.78f, 20.22f, 20.0f, 20.5f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 12.0f);
        pathBuilder.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilder.curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilder.curveToRelative(0.47f, 0.0f, 0.92f, 0.08f, 1.34f, 0.23f);
        pathBuilder.curveTo(9.5f, 5.26f, 9.0f, 6.57f, 9.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, 1.43f, 0.5f, 2.74f, 1.34f, 3.77f);
        pathBuilder.curveTo(9.92f, 11.92f, 9.47f, 12.0f, 9.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.11f, 13.13f);
        pathBuilder.curveTo(5.79f, 14.05f, 5.0f, 15.57f, 5.0f, 17.22f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.verticalLineToRelative(-2.78f);
        pathBuilder.curveToRelative(0.0f, -1.12f, 0.61f, -2.15f, 1.61f, -2.66f);
        pathBuilder.curveTo(3.85f, 13.92f, 5.37f, 13.37f, 7.11f, 13.13f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f);
        pathBuilder.reflectiveCurveTo(11.0f, 10.21f, 11.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.32f, 20.0f);
        pathBuilder.curveToRelative(-1.67f, -0.81f, -2.82f, -2.52f, -2.82f, -4.5f);
        pathBuilder.curveToRelative(0.0f, -0.89f, 0.23f, -1.73f, 0.64f, -2.45f);
        pathBuilder.curveTo(15.77f, 13.02f, 15.39f, 13.0f, 15.0f, 13.0f);
        pathBuilder.curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f);
        pathBuilder.curveTo(7.61f, 15.07f, 7.0f, 16.1f, 7.0f, 17.22f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.lineTo(18.32f, 20.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _interpreterMode = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
