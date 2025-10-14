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

/* compiled from: ConnectingAirports.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_connectingAirports", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ConnectingAirports", "Landroidx/compose/material/icons/Icons$Rounded;", "getConnectingAirports", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nConnectingAirports.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectingAirports.kt\nandroidx/compose/material/icons/rounded/ConnectingAirportsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,85:1\n212#2,12:86\n233#2,18:99\n253#2:136\n174#3:98\n705#4,2:117\n717#4,2:119\n719#4,11:125\n72#5,4:121\n*S KotlinDebug\n*F\n+ 1 ConnectingAirports.kt\nandroidx/compose/material/icons/rounded/ConnectingAirportsKt\n*L\n29#1:86,12\n30#1:99,18\n30#1:136\n29#1:98\n30#1:117,2\n30#1:119,2\n30#1:125,11\n30#1:121,4\n*E\n"})
/* loaded from: classes.dex */
public final class ConnectingAirportsKt {

    @Nullable
    private static ImageVector _connectingAirports;

    @NotNull
    public static final ImageVector getConnectingAirports(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _connectingAirports;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ConnectingAirports", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.93f, 10.6f);
        pathBuilder.curveToRelative(0.39f, 0.0f, 0.66f, 0.37f, 0.55f, 0.74f);
        pathBuilder.lineTo(15.4f, 15.0f);
        pathBuilder.horizontalLineToRelative(2.85f);
        pathBuilder.lineToRelative(0.59f, -0.78f);
        pathBuilder.curveToRelative(0.1f, -0.14f, 0.26f, -0.22f, 0.43f, -0.22f);
        pathBuilder.curveToRelative(0.36f, 0.0f, 0.62f, 0.35f, 0.52f, 0.7f);
        pathBuilder.lineTo(19.4f, 16.0f);
        pathBuilder.lineToRelative(0.39f, 1.3f);
        pathBuilder.curveToRelative(0.1f, 0.35f, -0.16f, 0.7f, -0.52f, 0.7f);
        pathBuilder.curveToRelative(-0.17f, 0.0f, -0.33f, -0.08f, -0.43f, -0.22f);
        pathBuilder.lineTo(18.25f, 17.0f);
        pathBuilder.horizontalLineTo(15.4f);
        pathBuilder.lineToRelative(1.08f, 3.66f);
        pathBuilder.curveToRelative(0.11f, 0.37f, -0.17f, 0.74f, -0.55f, 0.74f);
        pathBuilder.curveToRelative(-0.2f, 0.0f, -0.39f, -0.11f, -0.5f, -0.28f);
        pathBuilder.lineTo(13.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(-2.97f);
        pathBuilder.curveToRelative(-0.53f, 0.0f, -1.0f, -0.4f, -1.03f, -0.93f);
        pathBuilder.curveTo(8.96f, 15.48f, 9.43f, 15.0f, 10.0f, 15.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.lineToRelative(2.43f, -4.12f);
        pathBuilder.curveTo(15.54f, 10.71f, 15.73f, 10.6f, 15.93f, 10.6f);
        pathBuilder.close();
        pathBuilder.moveTo(8.07f, 2.6f);
        pathBuilder.curveToRelative(-0.39f, 0.0f, -0.66f, 0.37f, -0.55f, 0.74f);
        pathBuilder.lineTo(8.6f, 7.0f);
        pathBuilder.horizontalLineTo(5.75f);
        pathBuilder.lineTo(5.16f, 6.22f);
        pathBuilder.curveTo(5.06f, 6.08f, 4.9f, 6.0f, 4.73f, 6.0f);
        pathBuilder.curveTo(4.37f, 6.0f, 4.11f, 6.35f, 4.21f, 6.7f);
        pathBuilder.lineTo(4.6f, 8.0f);
        pathBuilder.lineTo(4.21f, 9.3f);
        pathBuilder.curveTo(4.11f, 9.65f, 4.37f, 10.0f, 4.73f, 10.0f);
        pathBuilder.curveToRelative(0.17f, 0.0f, 0.33f, -0.08f, 0.43f, -0.22f);
        pathBuilder.lineTo(5.75f, 9.0f);
        pathBuilder.horizontalLineTo(8.6f);
        pathBuilder.lineToRelative(-1.08f, 3.66f);
        pathBuilder.curveToRelative(-0.11f, 0.37f, 0.17f, 0.74f, 0.55f, 0.74f);
        pathBuilder.curveToRelative(0.2f, 0.0f, 0.39f, -0.11f, 0.5f, -0.28f);
        pathBuilder.lineTo(11.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(2.97f);
        pathBuilder.curveToRelative(0.53f, 0.0f, 1.0f, -0.4f, 1.03f, -0.93f);
        pathBuilder.curveTo(15.04f, 7.48f, 14.57f, 7.0f, 14.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.lineTo(8.57f, 2.88f);
        pathBuilder.curveTo(8.46f, 2.71f, 8.27f, 2.6f, 8.07f, 2.6f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _connectingAirports = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
