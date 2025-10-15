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

/* compiled from: MediaBluetoothOff.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_mediaBluetoothOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MediaBluetoothOff", "Landroidx/compose/material/icons/Icons$Rounded;", "getMediaBluetoothOff", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMediaBluetoothOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaBluetoothOff.kt\nandroidx/compose/material/icons/rounded/MediaBluetoothOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,92:1\n212#2,12:93\n233#2,18:106\n253#2:143\n174#3:105\n705#4,2:124\n717#4,2:126\n719#4,11:132\n72#5,4:128\n*S KotlinDebug\n*F\n+ 1 MediaBluetoothOff.kt\nandroidx/compose/material/icons/rounded/MediaBluetoothOffKt\n*L\n29#1:93,12\n30#1:106,18\n30#1:143\n29#1:105\n30#1:124,2\n30#1:126,2\n30#1:132,11\n30#1:128,4\n*E\n"})
/* loaded from: classes2.dex */
public final class MediaBluetoothOffKt {

    @Nullable
    private static ImageVector _mediaBluetoothOff;

    @NotNull
    public static final ImageVector getMediaBluetoothOff(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _mediaBluetoothOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MediaBluetoothOff", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 6.17f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(1.17f);
        pathBuilder.lineTo(9.0f, 6.17f);
        pathBuilder.close();
        pathBuilder.moveTo(19.42f, 15.0f);
        pathBuilder.lineToRelative(2.18f, 2.17f);
        pathBuilder.curveToRelative(0.22f, 0.22f, 0.22f, 0.58f, 0.0f, 0.8f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.22f, 0.22f, -0.58f, 0.22f, -0.8f, 0.0f);
        pathBuilder.lineToRelative(-5.98f, -5.98f);
        pathBuilder.curveToRelative(-0.22f, -0.22f, -0.22f, -0.58f, 0.0f, -0.8f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.22f, -0.22f, 0.58f, -0.22f, 0.8f, 0.0f);
        pathBuilder.lineToRelative(2.35f, 2.35f);
        pathBuilder.verticalLineTo(9.61f);
        pathBuilder.curveToRelative(0.0f, -0.45f, 0.54f, -0.67f, 0.85f, -0.35f);
        pathBuilder.lineToRelative(2.82f, 2.82f);
        pathBuilder.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder.lineTo(19.42f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.17f, 13.55f);
        pathBuilder.lineToRelative(1.13f, -1.13f);
        pathBuilder.lineToRelative(-1.13f, -1.13f);
        pathBuilder.verticalLineTo(13.55f);
        pathBuilder.close();
        pathBuilder.moveTo(20.49f, 20.49f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(-3.28f, -3.28f);
        pathBuilder.lineToRelative(-0.16f, 0.16f);
        pathBuilder.curveToRelative(-0.23f, 0.23f, -0.62f, 0.23f, -0.85f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.23f, -0.23f, -0.23f, -0.62f, 0.0f, -0.85f);
        pathBuilder.lineToRelative(0.16f, -0.16f);
        pathBuilder.lineTo(11.0f, 13.83f);
        pathBuilder.lineToRelative(0.0f, 3.02f);
        pathBuilder.curveToRelative(0.0f, 2.07f, -1.68f, 4.01f, -3.74f, 4.14f);
        pathBuilder.curveTo(4.94f, 21.13f, 3.0f, 19.29f, 3.0f, 17.0f);
        pathBuilder.curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.01f, -4.0f);
        pathBuilder.curveToRelative(0.73f, 0.0f, 1.41f, 0.21f, 2.0f, 0.55f);
        pathBuilder.verticalLineToRelative(-1.72f);
        pathBuilder.lineTo(2.1f, 4.92f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilder.lineTo(20.49f, 20.49f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mediaBluetoothOff = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
