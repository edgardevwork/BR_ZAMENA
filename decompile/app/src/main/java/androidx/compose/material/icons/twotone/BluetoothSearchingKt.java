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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BluetoothSearching.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7105d2 = {"_bluetoothSearching", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BluetoothSearching", "Landroidx/compose/material/icons/Icons$TwoTone;", "getBluetoothSearching$annotations", "(Landroidx/compose/material/icons/Icons$TwoTone;)V", "getBluetoothSearching", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBluetoothSearching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothSearching.kt\nandroidx/compose/material/icons/twotone/BluetoothSearchingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,83:1\n212#2,12:84\n233#2,18:97\n253#2:134\n174#3:96\n705#4,2:115\n717#4,2:117\n719#4,11:123\n72#5,4:119\n*S KotlinDebug\n*F\n+ 1 BluetoothSearching.kt\nandroidx/compose/material/icons/twotone/BluetoothSearchingKt\n*L\n35#1:84,12\n36#1:97,18\n36#1:134\n35#1:96\n36#1:115,2\n36#1:117,2\n36#1:123,11\n36#1:119,4\n*E\n"})
/* loaded from: classes4.dex */
public final class BluetoothSearchingKt {

    @Nullable
    private static ImageVector _bluetoothSearching;

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.TwoTone.BluetoothSearching", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.TwoTone.BluetoothSearching", imports = {"androidx.compose.material.icons.automirrored.twotone.BluetoothSearching"}))
    public static /* synthetic */ void getBluetoothSearching$annotations(Icons.TwoTone twoTone) {
    }

    @NotNull
    public static final ImageVector getBluetoothSearching(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _bluetoothSearching;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.BluetoothSearching", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.24f, 12.01f);
        pathBuilder.lineToRelative(2.32f, 2.32f);
        pathBuilder.curveToRelative(0.28f, -0.72f, 0.44f, -1.51f, 0.44f, -2.33f);
        pathBuilder.reflectiveCurveToRelative(-0.16f, -1.59f, -0.43f, -2.31f);
        pathBuilder.lineToRelative(-2.33f, 2.32f);
        pathBuilder.close();
        pathBuilder.moveTo(19.53f, 6.71f);
        pathBuilder.lineToRelative(-1.26f, 1.26f);
        pathBuilder.curveToRelative(0.63f, 1.21f, 0.98f, 2.57f, 0.98f, 4.02f);
        pathBuilder.reflectiveCurveToRelative(-0.36f, 2.82f, -0.98f, 4.02f);
        pathBuilder.lineToRelative(1.2f, 1.2f);
        pathBuilder.curveToRelative(0.97f, -1.54f, 1.54f, -3.36f, 1.54f, -5.31f);
        pathBuilder.curveToRelative(-0.01f, -1.89f, -0.55f, -3.67f, -1.48f, -5.19f);
        pathBuilder.close();
        pathBuilder.moveTo(15.71f, 7.71f);
        pathBuilder.lineTo(10.0f, 2.0f);
        pathBuilder.lineTo(9.0f, 2.0f);
        pathBuilder.verticalLineToRelative(7.59f);
        pathBuilder.lineTo(4.41f, 5.0f);
        pathBuilder.lineTo(3.0f, 6.41f);
        pathBuilder.lineTo(8.59f, 12.0f);
        pathBuilder.lineTo(3.0f, 17.59f);
        pathBuilder.lineTo(4.41f, 19.0f);
        pathBuilder.lineTo(9.0f, 14.41f);
        pathBuilder.lineTo(9.0f, 22.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.lineToRelative(5.71f, -5.71f);
        pathBuilder.lineToRelative(-4.3f, -4.29f);
        pathBuilder.lineToRelative(4.3f, -4.29f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 5.83f);
        pathBuilder.lineToRelative(1.88f, 1.88f);
        pathBuilder.lineTo(11.0f, 9.59f);
        pathBuilder.lineTo(11.0f, 5.83f);
        pathBuilder.close();
        pathBuilder.moveTo(12.88f, 16.29f);
        pathBuilder.lineTo(11.0f, 18.17f);
        pathBuilder.verticalLineToRelative(-3.76f);
        pathBuilder.lineToRelative(1.88f, 1.88f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bluetoothSearching = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
