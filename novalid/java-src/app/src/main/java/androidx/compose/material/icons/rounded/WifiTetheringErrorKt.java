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

/* compiled from: WifiTetheringError.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_wifiTetheringError", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WifiTetheringError", "Landroidx/compose/material/icons/Icons$Rounded;", "getWifiTetheringError", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nWifiTetheringError.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WifiTetheringError.kt\nandroidx/compose/material/icons/rounded/WifiTetheringErrorKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,95:1\n212#2,12:96\n233#2,18:109\n253#2:146\n174#3:108\n705#4,2:127\n717#4,2:129\n719#4,11:135\n72#5,4:131\n*S KotlinDebug\n*F\n+ 1 WifiTetheringError.kt\nandroidx/compose/material/icons/rounded/WifiTetheringErrorKt\n*L\n29#1:96,12\n30#1:109,18\n30#1:146\n29#1:108\n30#1:127,2\n30#1:129,2\n30#1:135,11\n30#1:131,4\n*E\n"})
/* loaded from: classes3.dex */
public final class WifiTetheringErrorKt {

    @Nullable
    private static ImageVector _wifiTetheringError;

    @NotNull
    public static final ImageVector getWifiTetheringError(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _wifiTetheringError;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WifiTetheringError", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.66f, 7.14f);
        pathBuilder.curveToRelative(-2.24f, 0.48f, -4.04f, 2.3f, -4.52f, 4.54f);
        pathBuilder.curveToRelative(-0.37f, 1.75f, 0.02f, 3.38f, 0.89f, 4.66f);
        pathBuilder.curveToRelative(0.34f, 0.51f, 1.08f, 0.55f, 1.51f, 0.11f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.35f, -0.35f, 0.37f, -0.88f, 0.1f, -1.28f);
        pathBuilder.curveToRelative(-0.5f, -0.76f, -0.75f, -1.71f, -0.61f, -2.73f);
        pathBuilder.curveToRelative(0.23f, -1.74f, 1.67f, -3.17f, 3.41f, -3.4f);
        pathBuilder.curveTo(13.9f, 8.71f, 16.0f, 10.61f, 16.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, 0.8f, -0.24f, 1.54f, -0.64f, 2.16f);
        pathBuilder.curveToRelative(-0.27f, 0.41f, -0.25f, 0.95f, 0.1f, 1.29f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.43f, 0.43f, 1.17f, 0.4f, 1.51f, -0.11f);
        pathBuilder.curveTo(17.62f, 15.4f, 18.0f, 14.25f, 18.0f, 13.0f);
        pathBuilder.curveTo(18.0f, 9.25f, 14.55f, 6.3f, 10.66f, 7.14f);
        pathBuilder.close();
        pathBuilder.moveTo(10.25f, 3.15f);
        pathBuilder.curveToRelative(-4.05f, 0.69f, -7.19f, 3.69f, -8.03f, 7.72f);
        pathBuilder.curveToRelative(-0.66f, 3.17f, 0.2f, 6.16f, 1.97f, 8.38f);
        pathBuilder.curveToRelative(0.37f, 0.46f, 1.07f, 0.49f, 1.49f, 0.07f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.36f, -0.36f, 0.39f, -0.93f, 0.07f, -1.32f);
        pathBuilder.curveToRelative(-1.34f, -1.67f, -2.03f, -3.9f, -1.66f, -6.28f);
        pathBuilder.curveToRelative(0.55f, -3.47f, 3.42f, -6.24f, 6.92f, -6.65f);
        pathBuilder.curveToRelative(2.76f, -0.33f, 5.27f, 0.74f, 6.93f, 2.59f);
        pathBuilder.curveTo(18.14f, 7.87f, 18.41f, 8.0f, 18.7f, 8.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.85f, 0.0f, 1.34f, -1.01f, 0.77f, -1.65f);
        pathBuilder.curveTo(17.28f, 3.9f, 13.91f, 2.53f, 10.25f, 3.15f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 11.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.23f, 1.05f, 0.59f, 1.41f);
        pathBuilder.curveTo(10.95f, 14.77f, 11.45f, 15.0f, 12.0f, 15.0f);
        pathBuilder.reflectiveCurveToRelative(1.05f, -0.23f, 1.41f, -0.59f);
        pathBuilder.curveTo(13.77f, 14.05f, 14.0f, 13.55f, 14.0f, 13.0f);
        pathBuilder.curveTo(14.0f, 11.9f, 13.1f, 11.0f, 12.0f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 10.0f);
        pathBuilder.lineTo(21.0f, 10.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.curveTo(20.0f, 10.45f, 20.45f, 10.0f, 21.0f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 18.0f);
        pathBuilder.lineTo(21.0f, 18.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveTo(20.0f, 18.45f, 20.45f, 18.0f, 21.0f, 18.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiTetheringError = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
