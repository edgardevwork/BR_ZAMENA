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

/* compiled from: Pinch.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_pinch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Pinch", "Landroidx/compose/material/icons/Icons$Rounded;", "getPinch", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPinch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pinch.kt\nandroidx/compose/material/icons/rounded/PinchKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,77:1\n212#2,12:78\n233#2,18:91\n253#2:128\n174#3:90\n705#4,2:109\n717#4,2:111\n719#4,11:117\n72#5,4:113\n*S KotlinDebug\n*F\n+ 1 Pinch.kt\nandroidx/compose/material/icons/rounded/PinchKt\n*L\n29#1:78,12\n30#1:91,18\n30#1:128\n29#1:90\n30#1:109,2\n30#1:111,2\n30#1:117,11\n30#1:113,4\n*E\n"})
/* loaded from: classes3.dex */
public final class PinchKt {

    @Nullable
    private static ImageVector _pinch;

    @NotNull
    public static final ImageVector getPinch(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _pinch;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Pinch", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.2f, 17.43f);
        pathBuilder.curveToRelative(0.0f, -0.65f, 0.6f, -1.13f, 1.24f, -0.99f);
        pathBuilder.lineTo(13.0f, 17.24f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.curveTo(13.0f, 5.67f, 13.67f, 5.0f, 14.5f, 5.0f);
        pathBuilder.reflectiveCurveTo(16.0f, 5.67f, 16.0f, 6.5f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(0.91f);
        pathBuilder.curveToRelative(0.31f, 0.0f, 0.62f, 0.07f, 0.89f, 0.21f);
        pathBuilder.lineToRelative(4.09f, 2.04f);
        pathBuilder.curveToRelative(0.77f, 0.38f, 1.21f, 1.22f, 1.09f, 2.07f);
        pathBuilder.lineToRelative(-0.63f, 4.46f);
        pathBuilder.curveTo(22.21f, 22.27f, 21.36f, 23.0f, 20.37f, 23.0f);
        pathBuilder.horizontalLineToRelative(-6.16f);
        pathBuilder.curveToRelative(-0.53f, 0.0f, -1.29f, -0.21f, -1.66f, -0.59f);
        pathBuilder.lineToRelative(-4.07f, -4.29f);
        pathBuilder.curveTo(8.3f, 17.94f, 8.2f, 17.69f, 8.2f, 17.43f);
        pathBuilder.close();
        pathBuilder.moveTo(9.5f, 5.25f);
        pathBuilder.curveTo(9.5f, 5.66f, 9.84f, 6.0f, 10.25f, 6.0f);
        pathBuilder.reflectiveCurveTo(11.0f, 5.66f, 11.0f, 5.25f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineTo(6.75f);
        pathBuilder.curveTo(6.34f, 1.0f, 6.0f, 1.34f, 6.0f, 1.75f);
        pathBuilder.reflectiveCurveTo(6.34f, 2.5f, 6.75f, 2.5f);
        pathBuilder.horizontalLineToRelative(1.69f);
        pathBuilder.lineTo(2.5f, 8.44f);
        pathBuilder.verticalLineTo(6.75f);
        pathBuilder.curveTo(2.5f, 6.34f, 2.16f, 6.0f, 1.75f, 6.0f);
        pathBuilder.reflectiveCurveTo(1.0f, 6.34f, 1.0f, 6.75f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(3.25f);
        pathBuilder.curveTo(5.66f, 11.0f, 6.0f, 10.66f, 6.0f, 10.25f);
        pathBuilder.reflectiveCurveTo(5.66f, 9.5f, 5.25f, 9.5f);
        pathBuilder.horizontalLineTo(3.56f);
        pathBuilder.lineTo(9.5f, 3.56f);
        pathBuilder.verticalLineTo(5.25f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pinch = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
