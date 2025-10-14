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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BatteryUnknown.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7105d2 = {"_batteryUnknown", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BatteryUnknown", "Landroidx/compose/material/icons/Icons$Rounded;", "getBatteryUnknown$annotations", "(Landroidx/compose/material/icons/Icons$Rounded;)V", "getBatteryUnknown", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBatteryUnknown.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BatteryUnknown.kt\nandroidx/compose/material/icons/rounded/BatteryUnknownKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,86:1\n212#2,12:87\n233#2,18:100\n253#2:137\n174#3:99\n705#4,2:118\n717#4,2:120\n719#4,11:126\n72#5,4:122\n*S KotlinDebug\n*F\n+ 1 BatteryUnknown.kt\nandroidx/compose/material/icons/rounded/BatteryUnknownKt\n*L\n35#1:87,12\n36#1:100,18\n36#1:137\n35#1:99\n36#1:118,2\n36#1:120,2\n36#1:126,11\n36#1:122,4\n*E\n"})
/* loaded from: classes2.dex */
public final class BatteryUnknownKt {

    @Nullable
    private static ImageVector _batteryUnknown;

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.Rounded.BatteryUnknown", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.Rounded.BatteryUnknown", imports = {"androidx.compose.material.icons.automirrored.rounded.BatteryUnknown"}))
    public static /* synthetic */ void getBatteryUnknown$annotations(Icons.Rounded rounded) {
    }

    @NotNull
    public static final ImageVector getBatteryUnknown(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _batteryUnknown;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BatteryUnknown", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.67f, 4.0f);
        pathBuilder.lineTo(14.0f, 4.0f);
        pathBuilder.lineTo(14.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.lineTo(8.33f, 4.0f);
        pathBuilder.curveTo(7.6f, 4.0f, 7.0f, 4.6f, 7.0f, 5.33f);
        pathBuilder.verticalLineToRelative(15.33f);
        pathBuilder.curveTo(7.0f, 21.4f, 7.6f, 22.0f, 8.34f, 22.0f);
        pathBuilder.horizontalLineToRelative(7.32f);
        pathBuilder.curveToRelative(0.74f, 0.0f, 1.34f, -0.6f, 1.34f, -1.33f);
        pathBuilder.lineTo(17.0f, 5.33f);
        pathBuilder.curveTo(17.0f, 4.6f, 16.4f, 4.0f, 15.67f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.3f, 12.69f);
        pathBuilder.reflectiveCurveToRelative(-0.38f, 0.42f, -0.67f, 0.71f);
        pathBuilder.curveToRelative(-0.14f, 0.14f, -0.27f, 0.31f, -0.39f, 0.47f);
        pathBuilder.lineToRelative(-0.09f, 0.15f);
        pathBuilder.curveToRelative(-0.08f, 0.12f, -0.14f, 0.25f, -0.19f, 0.37f);
        pathBuilder.curveToRelative(-0.09f, 0.22f, -0.16f, 0.43f, -0.16f, 0.61f);
        pathBuilder.horizontalLineToRelative(-1.6f);
        pathBuilder.curveToRelative(0.0f, -0.42f, 0.12f, -0.8f, 0.29f, -1.13f);
        pathBuilder.curveToRelative(0.06f, -0.11f, 0.13f, -0.21f, 0.2f, -0.31f);
        pathBuilder.curveToRelative(0.03f, -0.05f, 0.06f, -0.11f, 0.1f, -0.16f);
        pathBuilder.curveToRelative(0.11f, -0.14f, 0.23f, -0.28f, 0.34f, -0.4f);
        pathBuilder.lineToRelative(0.93f, -0.94f);
        pathBuilder.curveToRelative(0.27f, -0.27f, 0.44f, -0.65f, 0.44f, -1.06f);
        pathBuilder.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder.curveToRelative(-0.65f, 0.0f, -1.21f, 0.41f, -1.41f, 0.99f);
        pathBuilder.curveToRelative(-0.11f, 0.31f, -0.39f, 0.51f, -0.71f, 0.51f);
        pathBuilder.curveToRelative(-0.52f, 0.0f, -0.88f, -0.52f, -0.71f, -1.01f);
        pathBuilder.curveTo(9.59f, 8.83f, 10.69f, 8.0f, 12.0f, 8.0f);
        pathBuilder.curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, 0.66f, -0.27f, 1.26f, -0.7f, 1.69f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _batteryUnknown = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
