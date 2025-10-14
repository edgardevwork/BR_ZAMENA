package androidx.compose.material.icons.filled;

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

/* compiled from: BluetoothDrive.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_bluetoothDrive", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BluetoothDrive", "Landroidx/compose/material/icons/Icons$Filled;", "getBluetoothDrive", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBluetoothDrive.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothDrive.kt\nandroidx/compose/material/icons/filled/BluetoothDriveKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,99:1\n212#2,12:100\n233#2,18:113\n253#2:150\n233#2,18:151\n253#2:188\n174#3:112\n705#4,2:131\n717#4,2:133\n719#4,11:139\n705#4,2:169\n717#4,2:171\n719#4,11:177\n72#5,4:135\n72#5,4:173\n*S KotlinDebug\n*F\n+ 1 BluetoothDrive.kt\nandroidx/compose/material/icons/filled/BluetoothDriveKt\n*L\n29#1:100,12\n30#1:113,18\n30#1:150\n66#1:151,18\n66#1:188\n29#1:112\n30#1:131,2\n30#1:133,2\n30#1:139,11\n66#1:169,2\n66#1:171,2\n66#1:177,11\n30#1:135,4\n66#1:173,4\n*E\n"})
/* loaded from: classes3.dex */
public final class BluetoothDriveKt {

    @Nullable
    private static ImageVector _bluetoothDrive;

    @NotNull
    public static final ImageVector getBluetoothDrive(@NotNull Icons.Filled filled) {
        ImageVector imageVector = _bluetoothDrive;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.BluetoothDrive", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.0f, 10.0f);
        pathBuilder.horizontalLineTo(4.81f);
        pathBuilder.lineToRelative(1.04f, -3.0f);
        pathBuilder.horizontalLineTo(15.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineTo(5.5f);
        pathBuilder.curveTo(4.84f, 5.0f, 4.29f, 5.42f, 4.08f, 6.01f);
        pathBuilder.lineTo(2.0f, 12.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.curveTo(15.9f, 12.0f, 15.0f, 11.1f, 15.0f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.5f, 16.0f);
        pathBuilder.curveTo(5.67f, 16.0f, 5.0f, 15.33f, 5.0f, 14.5f);
        pathBuilder.reflectiveCurveTo(5.67f, 13.0f, 6.5f, 13.0f);
        pathBuilder.reflectiveCurveTo(8.0f, 13.67f, 8.0f, 14.5f);
        pathBuilder.reflectiveCurveTo(7.33f, 16.0f, 6.5f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.5f, 16.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(16.33f, 16.0f, 15.5f, 16.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(22.0f, 3.85f);
        pathBuilder2.lineTo(19.15f, 1.0f);
        pathBuilder2.horizontalLineToRelative(-0.5f);
        pathBuilder2.verticalLineToRelative(3.79f);
        pathBuilder2.lineToRelative(-2.3f, -2.29f);
        pathBuilder2.lineToRelative(-0.7f, 0.7f);
        pathBuilder2.lineTo(18.44f, 6.0f);
        pathBuilder2.lineToRelative(-2.79f, 2.79f);
        pathBuilder2.lineToRelative(0.7f, 0.71f);
        pathBuilder2.lineToRelative(2.3f, -2.3f);
        pathBuilder2.verticalLineTo(11.0f);
        pathBuilder2.horizontalLineToRelative(0.5f);
        pathBuilder2.lineTo(22.0f, 8.14f);
        pathBuilder2.lineTo(19.85f, 6.0f);
        pathBuilder2.lineTo(22.0f, 3.85f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.65f, 2.91f);
        pathBuilder2.lineToRelative(0.94f, 0.94f);
        pathBuilder2.lineToRelative(-0.94f, 0.94f);
        pathBuilder2.verticalLineTo(2.91f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.59f, 8.14f);
        pathBuilder2.lineToRelative(-0.94f, 0.94f);
        pathBuilder2.verticalLineTo(7.2f);
        pathBuilder2.lineTo(20.59f, 8.14f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bluetoothDrive = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
