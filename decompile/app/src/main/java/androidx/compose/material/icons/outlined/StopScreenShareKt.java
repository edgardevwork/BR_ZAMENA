package androidx.compose.material.icons.outlined;

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

/* compiled from: StopScreenShare.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7105d2 = {"_stopScreenShare", "Landroidx/compose/ui/graphics/vector/ImageVector;", "StopScreenShare", "Landroidx/compose/material/icons/Icons$Outlined;", "getStopScreenShare$annotations", "(Landroidx/compose/material/icons/Icons$Outlined;)V", "getStopScreenShare", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nStopScreenShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StopScreenShare.kt\nandroidx/compose/material/icons/outlined/StopScreenShareKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,88:1\n212#2,12:89\n233#2,18:102\n253#2:139\n174#3:101\n705#4,2:120\n717#4,2:122\n719#4,11:128\n72#5,4:124\n*S KotlinDebug\n*F\n+ 1 StopScreenShare.kt\nandroidx/compose/material/icons/outlined/StopScreenShareKt\n*L\n35#1:89,12\n36#1:102,18\n36#1:139\n35#1:101\n36#1:120,2\n36#1:122,2\n36#1:128,11\n36#1:124,4\n*E\n"})
/* loaded from: classes.dex */
public final class StopScreenShareKt {

    @Nullable
    private static ImageVector _stopScreenShare;

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.Outlined.StopScreenShare", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.Outlined.StopScreenShare", imports = {"androidx.compose.material.icons.automirrored.outlined.StopScreenShare"}))
    public static /* synthetic */ void getStopScreenShare$annotations(Icons.Outlined outlined) {
    }

    @NotNull
    public static final ImageVector getStopScreenShare(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _stopScreenShare;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.StopScreenShare", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.79f, 18.0f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.lineTo(24.0f, 20.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-2.21f);
        pathBuilder.close();
        pathBuilder.moveTo(1.11f, 2.98f);
        pathBuilder.lineToRelative(1.55f, 1.56f);
        pathBuilder.curveToRelative(-0.41f, 0.37f, -0.66f, 0.89f, -0.66f, 1.48f);
        pathBuilder.lineTo(2.0f, 16.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.01f, 2.0f);
        pathBuilder.lineTo(0.0f, 18.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(18.13f);
        pathBuilder.lineToRelative(2.71f, 2.71f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(2.52f, 1.57f);
        pathBuilder.lineTo(1.11f, 2.98f);
        pathBuilder.close();
        pathBuilder.moveTo(4.0f, 6.02f);
        pathBuilder.horizontalLineToRelative(0.13f);
        pathBuilder.lineToRelative(4.95f, 4.93f);
        pathBuilder.curveTo(7.94f, 12.07f, 7.31f, 13.52f, 7.0f, 15.0f);
        pathBuilder.curveToRelative(0.96f, -1.29f, 2.13f, -2.08f, 3.67f, -2.46f);
        pathBuilder.lineToRelative(3.46f, 3.48f);
        pathBuilder.lineTo(4.0f, 16.02f);
        pathBuilder.verticalLineToRelative(-10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 6.02f);
        pathBuilder.verticalLineToRelative(10.19f);
        pathBuilder.lineToRelative(1.3f, 1.3f);
        pathBuilder.curveToRelative(0.42f, -0.37f, 0.7f, -0.89f, 0.7f, -1.49f);
        pathBuilder.verticalLineToRelative(-10.0f);
        pathBuilder.curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.lineTo(7.8f, 4.02f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.lineTo(20.0f, 6.02f);
        pathBuilder.close();
        pathBuilder.moveTo(12.93f, 9.15f);
        pathBuilder.lineToRelative(2.79f, 2.78f);
        pathBuilder.lineToRelative(1.28f, -1.2f);
        pathBuilder.lineTo(13.0f, 7.0f);
        pathBuilder.verticalLineToRelative(2.13f);
        pathBuilder.lineToRelative(-0.07f, 0.02f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stopScreenShare = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
