package androidx.compose.material.icons.automirrored.filled;

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
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_stopScreenShare", "Landroidx/compose/ui/graphics/vector/ImageVector;", "StopScreenShare", "Landroidx/compose/material/icons/Icons$AutoMirrored$Filled;", "getStopScreenShare", "(Landroidx/compose/material/icons/Icons$AutoMirrored$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nStopScreenShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StopScreenShare.kt\nandroidx/compose/material/icons/automirrored/filled/StopScreenShareKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,74:1\n223#2:75\n216#2,3:76\n219#2,4:80\n233#2,18:84\n253#2:121\n174#3:79\n705#4,2:102\n717#4,2:104\n719#4,11:110\n72#5,4:106\n*S KotlinDebug\n*F\n+ 1 StopScreenShare.kt\nandroidx/compose/material/icons/automirrored/filled/StopScreenShareKt\n*L\n29#1:75\n29#1:76,3\n29#1:80,4\n31#1:84,18\n31#1:121\n29#1:79\n31#1:102,2\n31#1:104,2\n31#1:110,11\n31#1:106,4\n*E\n"})
/* loaded from: classes3.dex */
public final class StopScreenShareKt {

    @Nullable
    private static ImageVector _stopScreenShare;

    @NotNull
    public static final ImageVector getStopScreenShare(@NotNull Icons.AutoMirrored.Filled filled) {
        ImageVector imageVector = _stopScreenShare;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Filled.StopScreenShare", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.22f, 18.02f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.lineTo(24.0f, 20.02f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-2.78f);
        pathBuilder.close();
        pathBuilder.moveTo(21.99f, 16.02f);
        pathBuilder.lineToRelative(0.01f, -10.0f);
        pathBuilder.curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.lineTo(7.22f, 4.02f);
        pathBuilder.lineToRelative(5.23f, 5.23f);
        pathBuilder.curveToRelative(0.18f, -0.04f, 0.36f, -0.07f, 0.55f, -0.1f);
        pathBuilder.lineTo(13.0f, 7.02f);
        pathBuilder.lineToRelative(4.0f, 3.73f);
        pathBuilder.lineToRelative(-1.58f, 1.47f);
        pathBuilder.lineToRelative(5.54f, 5.54f);
        pathBuilder.curveToRelative(0.61f, -0.33f, 1.03f, -0.99f, 1.03f, -1.74f);
        pathBuilder.close();
        pathBuilder.moveTo(2.39f, 1.73f);
        pathBuilder.lineTo(1.11f, 3.0f);
        pathBuilder.lineToRelative(1.54f, 1.54f);
        pathBuilder.curveToRelative(-0.4f, 0.36f, -0.65f, 0.89f, -0.65f, 1.48f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder.lineTo(0.0f, 18.02f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(18.13f);
        pathBuilder.lineToRelative(2.71f, 2.71f);
        pathBuilder.lineToRelative(1.27f, -1.27f);
        pathBuilder.lineTo(2.39f, 1.73f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 15.02f);
        pathBuilder.curveToRelative(0.31f, -1.48f, 0.92f, -2.95f, 2.07f, -4.06f);
        pathBuilder.lineToRelative(1.59f, 1.59f);
        pathBuilder.curveToRelative(-1.54f, 0.38f, -2.7f, 1.18f, -3.66f, 2.47f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stopScreenShare = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
