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

/* compiled from: BluetoothConnected.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_bluetoothConnected", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BluetoothConnected", "Landroidx/compose/material/icons/Icons$Rounded;", "getBluetoothConnected", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBluetoothConnected.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothConnected.kt\nandroidx/compose/material/icons/rounded/BluetoothConnectedKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,83:1\n212#2,12:84\n233#2,18:97\n253#2:134\n174#3:96\n705#4,2:115\n717#4,2:117\n719#4,11:123\n72#5,4:119\n*S KotlinDebug\n*F\n+ 1 BluetoothConnected.kt\nandroidx/compose/material/icons/rounded/BluetoothConnectedKt\n*L\n29#1:84,12\n30#1:97,18\n30#1:134\n29#1:96\n30#1:115,2\n30#1:117,2\n30#1:123,11\n30#1:119,4\n*E\n"})
/* loaded from: classes2.dex */
public final class BluetoothConnectedKt {

    @Nullable
    private static ImageVector _bluetoothConnected;

    @NotNull
    public static final ImageVector getBluetoothConnected(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _bluetoothConnected;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BluetoothConnected", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.0f, 13.0f);
        pathBuilder.curveToRelative(0.55f, -0.55f, 0.55f, -1.44f, 0.0f, -1.99f);
        pathBuilder.lineTo(6.0f, 11.0f);
        pathBuilder.curveToRelative(-0.55f, -0.55f, -1.45f, -0.55f, -2.0f, 0.0f);
        pathBuilder.reflectiveCurveToRelative(-0.55f, 1.45f, 0.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(1.45f, 0.55f, 2.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 11.0f);
        pathBuilder.curveToRelative(-0.56f, -0.56f, -1.45f, -0.56f, -2.0f, -0.01f);
        pathBuilder.lineTo(18.0f, 11.0f);
        pathBuilder.curveToRelative(-0.55f, 0.55f, -0.55f, 1.44f, 0.0f, 1.99f);
        pathBuilder.lineTo(18.0f, 13.0f);
        pathBuilder.curveToRelative(0.55f, 0.55f, 1.44f, 0.55f, 1.99f, 0.0f);
        pathBuilder.lineTo(20.0f, 13.0f);
        pathBuilder.curveToRelative(0.55f, -0.55f, 0.55f, -1.45f, 0.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 7.0f);
        pathBuilder.lineToRelative(-4.29f, -4.29f);
        pathBuilder.curveToRelative(-0.63f, -0.63f, -1.71f, -0.19f, -1.71f, 0.7f);
        pathBuilder.verticalLineToRelative(6.18f);
        pathBuilder.lineTo(7.11f, 5.7f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineTo(10.59f, 12.0f);
        pathBuilder.lineTo(5.7f, 16.89f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineTo(11.0f, 14.41f);
        pathBuilder.verticalLineToRelative(6.18f);
        pathBuilder.curveToRelative(0.0f, 0.89f, 1.08f, 1.34f, 1.71f, 0.71f);
        pathBuilder.lineTo(17.0f, 17.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.42f);
        pathBuilder.lineTo(13.41f, 12.0f);
        pathBuilder.lineTo(17.0f, 8.42f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f);
        pathBuilder.close();
        pathBuilder.moveTo(14.88f, 16.29f);
        pathBuilder.lineTo(13.0f, 18.17f);
        pathBuilder.verticalLineToRelative(-3.76f);
        pathBuilder.lineToRelative(1.88f, 1.88f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 9.59f);
        pathBuilder.lineTo(13.0f, 5.83f);
        pathBuilder.lineToRelative(1.88f, 1.88f);
        pathBuilder.lineTo(13.0f, 9.59f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bluetoothConnected = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
