package androidx.compose.material.icons.automirrored.rounded;

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

/* compiled from: StopScreenShare.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_stopScreenShare", "Landroidx/compose/ui/graphics/vector/ImageVector;", "StopScreenShare", "Landroidx/compose/material/icons/Icons$AutoMirrored$Rounded;", "getStopScreenShare", "(Landroidx/compose/material/icons/Icons$AutoMirrored$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nStopScreenShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StopScreenShare.kt\nandroidx/compose/material/icons/automirrored/rounded/StopScreenShareKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,81:1\n223#2:82\n216#2,3:83\n219#2,4:87\n233#2,18:91\n253#2:128\n174#3:86\n705#4,2:109\n717#4,2:111\n719#4,11:117\n72#5,4:113\n*S KotlinDebug\n*F\n+ 1 StopScreenShare.kt\nandroidx/compose/material/icons/automirrored/rounded/StopScreenShareKt\n*L\n29#1:82\n29#1:83,3\n29#1:87,4\n31#1:91,18\n31#1:128\n29#1:86\n31#1:109,2\n31#1:111,2\n31#1:117,11\n31#1:113,4\n*E\n"})
/* loaded from: classes.dex */
public final class StopScreenShareKt {

    @Nullable
    private static ImageVector _stopScreenShare;

    @NotNull
    public static final ImageVector getStopScreenShare(@NotNull Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _stopScreenShare;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.StopScreenShare", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(23.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(-1.2f);
        pathBuilder.lineToRelative(1.79f, 1.79f);
        pathBuilder.curveToRelative(0.24f, -0.18f, 0.41f, -0.46f, 0.41f, -0.79f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.23f, 2.28f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(0.84f, 0.86f);
        pathBuilder.reflectiveCurveToRelative(-0.66f, 0.57f, -0.66f, 1.47f);
        pathBuilder.curveTo(2.0f, 6.92f, 2.0f, 16.0f, 2.0f, 16.0f);
        pathBuilder.lineToRelative(0.01f, 0.01f);
        pathBuilder.curveToRelative(0.0f, 1.09f, 0.88f, 1.98f, 1.97f, 1.99f);
        pathBuilder.lineTo(1.0f, 18.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(17.13f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.reflectiveCurveToRelative(0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineTo(3.23f, 2.28f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 15.0f);
        pathBuilder.curveToRelative(0.31f, -1.48f, 0.94f, -2.93f, 2.08f, -4.05f);
        pathBuilder.lineToRelative(1.59f, 1.59f);
        pathBuilder.curveTo(9.13f, 12.92f, 7.96f, 13.71f, 7.0f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 9.13f);
        pathBuilder.verticalLineToRelative(-0.98f);
        pathBuilder.curveToRelative(0.0f, -0.44f, 0.52f, -0.66f, 0.84f, -0.37f);
        pathBuilder.lineTo(15.0f, 8.87f);
        pathBuilder.lineToRelative(1.61f, 1.5f);
        pathBuilder.curveToRelative(0.21f, 0.2f, 0.21f, 0.53f, 0.0f, 0.73f);
        pathBuilder.lineToRelative(-0.89f, 0.83f);
        pathBuilder.lineToRelative(5.58f, 5.58f);
        pathBuilder.curveToRelative(0.43f, -0.37f, 0.7f, -0.9f, 0.7f, -1.51f);
        pathBuilder.lineTo(22.0f, 6.0f);
        pathBuilder.curveToRelative(0.0f, -1.09f, -0.89f, -1.98f, -1.98f, -1.98f);
        pathBuilder.lineTo(7.8f, 4.02f);
        pathBuilder.lineToRelative(5.14f, 5.13f);
        pathBuilder.curveToRelative(0.02f, -0.01f, 0.04f, -0.02f, 0.06f, -0.02f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stopScreenShare = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
