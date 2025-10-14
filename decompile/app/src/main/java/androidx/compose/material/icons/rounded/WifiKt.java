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

/* compiled from: Wifi.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_wifi", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Wifi", "Landroidx/compose/material/icons/Icons$Rounded;", "getWifi", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nWifi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Wifi.kt\nandroidx/compose/material/icons/rounded/WifiKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,62:1\n212#2,12:63\n233#2,18:76\n253#2:113\n174#3:75\n705#4,2:94\n717#4,2:96\n719#4,11:102\n72#5,4:98\n*S KotlinDebug\n*F\n+ 1 Wifi.kt\nandroidx/compose/material/icons/rounded/WifiKt\n*L\n29#1:63,12\n30#1:76,18\n30#1:113\n29#1:75\n30#1:94,2\n30#1:96,2\n30#1:102,11\n30#1:98,4\n*E\n"})
/* loaded from: classes3.dex */
public final class WifiKt {

    @Nullable
    private static ImageVector _wifi;

    @NotNull
    public static final ImageVector getWifi(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _wifi;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Wifi", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.06f, 10.06f);
        pathBuilder.curveToRelative(0.51f, 0.51f, 1.32f, 0.56f, 1.87f, 0.1f);
        pathBuilder.curveToRelative(4.67f, -3.84f, 11.45f, -3.84f, 16.13f, -0.01f);
        pathBuilder.curveToRelative(0.56f, 0.46f, 1.38f, 0.42f, 1.89f, -0.09f);
        pathBuilder.curveToRelative(0.59f, -0.59f, 0.55f, -1.57f, -0.1f, -2.1f);
        pathBuilder.curveToRelative(-5.71f, -4.67f, -13.97f, -4.67f, -19.69f, 0.0f);
        pathBuilder.curveToRelative(-0.65f, 0.52f, -0.7f, 1.5f, -0.1f, 2.1f);
        pathBuilder.close();
        pathBuilder.moveTo(9.82f, 17.82f);
        pathBuilder.lineToRelative(1.47f, 1.47f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(1.47f, -1.47f);
        pathBuilder.curveToRelative(0.47f, -0.47f, 0.37f, -1.28f, -0.23f, -1.59f);
        pathBuilder.curveToRelative(-1.22f, -0.63f, -2.68f, -0.63f, -3.91f, 0.0f);
        pathBuilder.curveToRelative(-0.57f, 0.31f, -0.68f, 1.12f, -0.21f, 1.59f);
        pathBuilder.close();
        pathBuilder.moveTo(6.09f, 14.09f);
        pathBuilder.curveToRelative(0.49f, 0.49f, 1.26f, 0.54f, 1.83f, 0.13f);
        pathBuilder.curveToRelative(2.44f, -1.73f, 5.72f, -1.73f, 8.16f, 0.0f);
        pathBuilder.curveToRelative(0.57f, 0.4f, 1.34f, 0.36f, 1.83f, -0.13f);
        pathBuilder.lineToRelative(0.01f, -0.01f);
        pathBuilder.curveToRelative(0.6f, -0.6f, 0.56f, -1.62f, -0.13f, -2.11f);
        pathBuilder.curveToRelative(-3.44f, -2.49f, -8.13f, -2.49f, -11.58f, 0.0f);
        pathBuilder.curveToRelative(-0.69f, 0.5f, -0.73f, 1.51f, -0.12f, 2.12f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifi = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
