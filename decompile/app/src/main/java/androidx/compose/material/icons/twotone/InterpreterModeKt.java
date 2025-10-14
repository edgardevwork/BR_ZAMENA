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

/* compiled from: InterpreterMode.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_interpreterMode", "Landroidx/compose/ui/graphics/vector/ImageVector;", "InterpreterMode", "Landroidx/compose/material/icons/Icons$TwoTone;", "getInterpreterMode", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nInterpreterMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterpreterMode.kt\nandroidx/compose/material/icons/twotone/InterpreterModeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,114:1\n212#2,12:115\n233#2,18:128\n253#2:165\n233#2,18:166\n253#2:203\n174#3:127\n705#4,2:146\n717#4,2:148\n719#4,11:154\n705#4,2:184\n717#4,2:186\n719#4,11:192\n72#5,4:150\n72#5,4:188\n*S KotlinDebug\n*F\n+ 1 InterpreterMode.kt\nandroidx/compose/material/icons/twotone/InterpreterModeKt\n*L\n29#1:115,12\n30#1:128,18\n30#1:165\n46#1:166,18\n46#1:203\n29#1:127\n30#1:146,2\n30#1:148,2\n30#1:154,11\n46#1:184,2\n46#1:186,2\n46#1:192,11\n30#1:150,4\n46#1:188,4\n*E\n"})
/* loaded from: classes.dex */
public final class InterpreterModeKt {

    @Nullable
    private static ImageVector _interpreterMode;

    @NotNull
    public static final ImageVector getInterpreterMode(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _interpreterMode;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.InterpreterMode", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.52f, 15.01f);
        pathBuilder.curveTo(15.35f, 15.0f, 15.18f, 15.0f, 15.0f, 15.0f);
        pathBuilder.curveToRelative(-2.37f, 0.0f, -4.29f, 0.73f, -5.48f, 1.34f);
        pathBuilder.curveTo(9.2f, 16.5f, 9.0f, 16.84f, 9.0f, 17.22f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.lineToRelative(7.17f, 0.0f);
        pathBuilder.curveTo(15.74f, 17.26f, 15.4f, 16.24f, 15.52f, 15.01f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(13.0f, 6.9f, 13.0f, 8.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.5f, 16.5f);
        pathBuilder2.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder2.verticalLineToRelative(-2.5f);
        pathBuilder2.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder2.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder2.verticalLineTo(15.0f);
        pathBuilder2.curveTo(22.0f, 15.83f, 21.33f, 16.5f, 20.5f, 16.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.0f, 20.0f);
        pathBuilder2.horizontalLineToRelative(1.0f);
        pathBuilder2.curveToRelative(0.0f, 0.0f, 0.0f, -1.54f, 0.0f, -1.54f);
        pathBuilder2.curveToRelative(1.69f, -0.24f, 3.0f, -1.7f, 3.0f, -3.46f);
        pathBuilder2.horizontalLineToRelative(-1.0f);
        pathBuilder2.curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f);
        pathBuilder2.reflectiveCurveTo(18.0f, 16.38f, 18.0f, 15.0f);
        pathBuilder2.horizontalLineToRelative(-1.0f);
        pathBuilder2.curveToRelative(0.0f, 1.76f, 1.31f, 3.22f, 3.0f, 3.46f);
        pathBuilder2.curveTo(20.0f, 18.46f, 20.0f, 20.0f, 20.0f, 20.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(9.0f, 12.0f);
        pathBuilder2.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilder2.curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilder2.curveToRelative(0.47f, 0.0f, 0.92f, 0.08f, 1.34f, 0.23f);
        pathBuilder2.curveTo(9.5f, 5.26f, 9.0f, 6.57f, 9.0f, 8.0f);
        pathBuilder2.curveToRelative(0.0f, 1.43f, 0.5f, 2.74f, 1.34f, 3.77f);
        pathBuilder2.curveTo(9.92f, 11.92f, 9.47f, 12.0f, 9.0f, 12.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(7.11f, 13.13f);
        pathBuilder2.curveTo(5.79f, 14.05f, 5.0f, 15.57f, 5.0f, 17.22f);
        pathBuilder2.verticalLineTo(20.0f);
        pathBuilder2.horizontalLineTo(1.0f);
        pathBuilder2.verticalLineToRelative(-2.78f);
        pathBuilder2.curveToRelative(0.0f, -1.12f, 0.61f, -2.15f, 1.61f, -2.66f);
        pathBuilder2.curveTo(3.85f, 13.92f, 5.37f, 13.37f, 7.11f, 13.13f);
        pathBuilder2.close();
        pathBuilder2.moveTo(11.0f, 8.0f);
        pathBuilder2.curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilder2.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilder2.curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f);
        pathBuilder2.reflectiveCurveTo(11.0f, 10.21f, 11.0f, 8.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.0f, 8.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.reflectiveCurveTo(13.0f, 6.9f, 13.0f, 8.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.0f, 15.0f);
        pathBuilder2.curveToRelative(-2.37f, 0.0f, -4.29f, 0.73f, -5.48f, 1.34f);
        pathBuilder2.curveTo(9.2f, 16.5f, 9.0f, 16.84f, 9.0f, 17.22f);
        pathBuilder2.verticalLineTo(18.0f);
        pathBuilder2.lineToRelative(7.17f, 0.0f);
        pathBuilder2.curveToRelative(0.5f, 0.86f, 1.25f, 1.56f, 2.15f, 2.0f);
        pathBuilder2.lineTo(7.0f, 20.0f);
        pathBuilder2.verticalLineToRelative(-2.78f);
        pathBuilder2.curveToRelative(0.0f, -1.12f, 0.61f, -2.15f, 1.61f, -2.66f);
        pathBuilder2.curveTo(10.29f, 13.7f, 12.47f, 13.0f, 15.0f, 13.0f);
        pathBuilder2.curveToRelative(0.39f, 0.0f, 0.77f, 0.02f, 1.14f, 0.05f);
        pathBuilder2.curveToRelative(-0.33f, 0.59f, -0.55f, 1.26f, -0.62f, 1.96f);
        pathBuilder2.curveTo(15.35f, 15.0f, 15.18f, 15.0f, 15.0f, 15.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _interpreterMode = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
