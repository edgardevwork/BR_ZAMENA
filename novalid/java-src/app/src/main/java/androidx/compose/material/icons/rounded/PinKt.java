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

/* compiled from: Pin.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_pin", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Pin", "Landroidx/compose/material/icons/Icons$Rounded;", "getPin", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pin.kt\nandroidx/compose/material/icons/rounded/PinKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,107:1\n212#2,12:108\n233#2,18:121\n253#2:158\n174#3:120\n705#4,2:139\n717#4,2:141\n719#4,11:147\n72#5,4:143\n*S KotlinDebug\n*F\n+ 1 Pin.kt\nandroidx/compose/material/icons/rounded/PinKt\n*L\n29#1:108,12\n30#1:121,18\n30#1:158\n29#1:120\n30#1:139,2\n30#1:141,2\n30#1:147,11\n30#1:143,4\n*E\n"})
/* loaded from: classes3.dex */
public final class PinKt {

    @Nullable
    private static ImageVector _pin;

    @NotNull
    public static final ImageVector getPin(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _pin;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Pin", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 4.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.64f, 14.47f);
        pathBuilder.curveTo(7.64f, 14.76f, 7.4f, 15.0f, 7.11f, 15.0f);
        pathBuilder.horizontalLineTo(7.02f);
        pathBuilder.curveToRelative(-0.29f, 0.0f, -0.53f, -0.24f, -0.53f, -0.53f);
        pathBuilder.verticalLineTo(10.5f);
        pathBuilder.lineToRelative(-0.45f, 0.33f);
        pathBuilder.curveToRelative(-0.24f, 0.18f, -0.59f, 0.12f, -0.76f, -0.14f);
        pathBuilder.curveToRelative(-0.15f, -0.24f, -0.1f, -0.55f, 0.13f, -0.72f);
        pathBuilder.lineTo(6.6f, 9.12f);
        pathBuilder.curveTo(6.71f, 9.04f, 6.84f, 9.0f, 6.98f, 9.0f);
        pathBuilder.curveToRelative(0.36f, 0.0f, 0.66f, 0.29f, 0.66f, 0.66f);
        pathBuilder.verticalLineTo(14.47f);
        pathBuilder.close();
        pathBuilder.moveTo(13.01f, 15.0f);
        pathBuilder.horizontalLineToRelative(-2.67f);
        pathBuilder.curveToRelative(-0.4f, 0.0f, -0.72f, -0.32f, -0.72f, -0.72f);
        pathBuilder.curveToRelative(0.0f, -0.19f, 0.08f, -0.38f, 0.21f, -0.51f);
        pathBuilder.curveToRelative(0.95f, -0.95f, 1.58f, -1.58f, 1.92f, -1.94f);
        pathBuilder.curveToRelative(0.4f, -0.42f, 0.54f, -0.69f, 0.54f, -1.06f);
        pathBuilder.curveToRelative(0.0f, -0.4f, -0.31f, -0.72f, -0.81f, -0.72f);
        pathBuilder.curveToRelative(-0.34f, 0.0f, -0.57f, 0.16f, -0.72f, 0.37f);
        pathBuilder.curveToRelative(-0.15f, 0.2f, -0.41f, 0.26f, -0.64f, 0.16f);
        pathBuilder.curveToRelative(-0.34f, -0.14f, -0.45f, -0.57f, -0.22f, -0.85f);
        pathBuilder.curveToRelative(0.15f, -0.19f, 0.37f, -0.38f, 0.67f, -0.53f);
        pathBuilder.curveToRelative(0.69f, -0.33f, 1.48f, -0.2f, 1.95f, 0.03f);
        pathBuilder.curveToRelative(0.86f, 0.44f, 0.91f, 1.24f, 0.91f, 1.48f);
        pathBuilder.curveToRelative(0.0f, 0.64f, -0.31f, 1.26f, -0.92f, 1.86f);
        pathBuilder.curveToRelative(-0.25f, 0.25f, -0.72f, 0.71f, -1.4f, 1.39f);
        pathBuilder.lineToRelative(0.03f, 0.05f);
        pathBuilder.horizontalLineToRelative(1.88f);
        pathBuilder.curveToRelative(0.27f, 0.0f, 0.49f, 0.22f, 0.49f, 0.49f);
        pathBuilder.reflectiveCurveTo(13.28f, 15.0f, 13.01f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.75f, 14.15f);
        pathBuilder.curveTo(18.67f, 14.28f, 18.19f, 15.0f, 16.99f, 15.0f);
        pathBuilder.curveToRelative(-0.03f, 0.0f, -1.23f, 0.06f, -1.83f, -0.98f);
        pathBuilder.curveToRelative(-0.15f, -0.26f, -0.04f, -0.6f, 0.24f, -0.71f);
        pathBuilder.lineToRelative(0.12f, -0.05f);
        pathBuilder.curveToRelative(0.22f, -0.09f, 0.47f, -0.01f, 0.59f, 0.19f);
        pathBuilder.curveToRelative(0.14f, 0.24f, 0.39f, 0.49f, 0.88f, 0.49f);
        pathBuilder.curveToRelative(0.41f, 0.0f, 0.89f, -0.28f, 0.89f, -0.77f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.48f, -0.79f, -1.04f, -0.79f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.27f, 0.0f, -0.49f, -0.23f, -0.49f, -0.5f);
        pathBuilder.curveToRelative(0.0f, -0.26f, 0.2f, -0.47f, 0.45f, -0.49f);
        pathBuilder.lineToRelative(0.0f, -0.01f);
        pathBuilder.curveToRelative(0.33f, 0.0f, 0.88f, -0.14f, 0.88f, -0.72f);
        pathBuilder.curveToRelative(0.0f, -0.39f, -0.31f, -0.65f, -0.75f, -0.65f);
        pathBuilder.curveToRelative(-0.32f, 0.0f, -0.53f, 0.13f, -0.67f, 0.3f);
        pathBuilder.curveToRelative(-0.14f, 0.18f, -0.37f, 0.26f, -0.58f, 0.17f);
        pathBuilder.lineToRelative(-0.08f, -0.03f);
        pathBuilder.curveToRelative(-0.3f, -0.12f, -0.4f, -0.5f, -0.2f, -0.75f);
        pathBuilder.curveTo(15.67f, 9.35f, 16.16f, 9.0f, 16.94f, 9.0f);
        pathBuilder.curveToRelative(1.09f, 0.0f, 1.54f, 0.64f, 1.62f, 0.75f);
        pathBuilder.curveToRelative(0.33f, 0.5f, 0.28f, 1.16f, 0.02f, 1.57f);
        pathBuilder.curveToRelative(-0.15f, 0.22f, -0.32f, 0.38f, -0.52f, 0.48f);
        pathBuilder.verticalLineToRelative(0.07f);
        pathBuilder.curveToRelative(0.28f, 0.11f, 0.51f, 0.28f, 0.68f, 0.52f);
        pathBuilder.curveTo(19.11f, 12.91f, 19.07f, 13.66f, 18.75f, 14.15f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pin = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
