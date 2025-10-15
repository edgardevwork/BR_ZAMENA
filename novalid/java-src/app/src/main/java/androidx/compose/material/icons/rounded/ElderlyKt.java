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

/* compiled from: Elderly.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_elderly", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Elderly", "Landroidx/compose/material/icons/Icons$Rounded;", "getElderly", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nElderly.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Elderly.kt\nandroidx/compose/material/icons/rounded/ElderlyKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,91:1\n212#2,12:92\n233#2,18:105\n253#2:142\n174#3:104\n705#4,2:123\n717#4,2:125\n719#4,11:131\n72#5,4:127\n*S KotlinDebug\n*F\n+ 1 Elderly.kt\nandroidx/compose/material/icons/rounded/ElderlyKt\n*L\n29#1:92,12\n30#1:105,18\n30#1:142\n29#1:104\n30#1:123,2\n30#1:125,2\n30#1:131,11\n30#1:127,4\n*E\n"})
/* loaded from: classes3.dex */
public final class ElderlyKt {

    @Nullable
    private static ImageVector _elderly;

    @NotNull
    public static final ImageVector getElderly(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _elderly;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Elderly", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.5f, 3.5f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(11.5f, 4.6f, 11.5f, 3.5f);
        pathBuilder.close();
        pathBuilder.moveTo(18.53f, 11.0f);
        pathBuilder.curveToRelative(-1.57f, 0.01f, -2.94f, -0.9f, -3.6f, -2.21f);
        pathBuilder.lineToRelative(-0.79f, -1.67f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.17f, -0.35f, -0.44f, -0.65f, -0.8f, -0.85f);
        pathBuilder.curveToRelative(-0.62f, -0.36f, -1.35f, -0.34f, -1.94f, -0.03f);
        pathBuilder.lineToRelative(0.0f, -0.01f);
        pathBuilder.lineTo(7.01f, 8.73f);
        pathBuilder.curveTo(6.39f, 9.08f, 6.0f, 9.74f, 6.0f, 10.46f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-2.54f);
        pathBuilder.lineToRelative(1.5f, -0.85f);
        pathBuilder.curveTo(9.18f, 10.71f, 9.0f, 11.85f, 9.0f, 13.0f);
        pathBuilder.verticalLineToRelative(5.33f);
        pathBuilder.lineTo(7.0f, 21.0f);
        pathBuilder.curveToRelative(-0.33f, 0.44f, -0.24f, 1.07f, 0.2f, 1.4f);
        pathBuilder.curveToRelative(0.44f, 0.33f, 1.07f, 0.24f, 1.4f, -0.2f);
        pathBuilder.lineToRelative(2.04f, -2.72f);
        pathBuilder.curveToRelative(0.23f, -0.31f, 0.37f, -0.69f, 0.4f, -1.08f);
        pathBuilder.lineToRelative(0.18f, -2.94f);
        pathBuilder.lineTo(13.0f, 18.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-4.87f);
        pathBuilder.curveToRelative(0.0f, -0.41f, -0.13f, -0.81f, -0.36f, -1.15f);
        pathBuilder.lineToRelative(-1.6f, -2.29f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.01f);
        pathBuilder.curveToRelative(-0.11f, -1.16f, 0.07f, -2.32f, 0.46f, -3.4f);
        pathBuilder.curveToRelative(0.81f, 1.23f, 2.05f, 2.14f, 3.51f, 2.52f);
        pathBuilder.verticalLineToRelative(0.03f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilder.reflectiveCurveTo(18.0f, 13.28f, 18.0f, 13.0f);
        pathBuilder.verticalLineToRelative(-0.16f);
        pathBuilder.verticalLineTo(12.5f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilder.reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilder.verticalLineToRelative(-10.0f);
        pathBuilder.curveTo(20.0f, 11.68f, 19.34f, 10.99f, 18.53f, 11.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _elderly = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
