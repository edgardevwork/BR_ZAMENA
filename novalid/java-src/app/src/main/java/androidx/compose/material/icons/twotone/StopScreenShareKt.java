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

/* compiled from: StopScreenShare.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7105d2 = {"_stopScreenShare", "Landroidx/compose/ui/graphics/vector/ImageVector;", "StopScreenShare", "Landroidx/compose/material/icons/Icons$TwoTone;", "getStopScreenShare$annotations", "(Landroidx/compose/material/icons/Icons$TwoTone;)V", "getStopScreenShare", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nStopScreenShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StopScreenShare.kt\nandroidx/compose/material/icons/twotone/StopScreenShareKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,111:1\n212#2,12:112\n233#2,18:125\n253#2:162\n233#2,18:163\n253#2:200\n233#2,18:201\n253#2:238\n174#3:124\n705#4,2:143\n717#4,2:145\n719#4,11:151\n705#4,2:181\n717#4,2:183\n719#4,11:189\n705#4,2:219\n717#4,2:221\n719#4,11:227\n72#5,4:147\n72#5,4:185\n72#5,4:223\n*S KotlinDebug\n*F\n+ 1 StopScreenShare.kt\nandroidx/compose/material/icons/twotone/StopScreenShareKt\n*L\n35#1:112,12\n36#1:125,18\n36#1:162\n47#1:163,18\n47#1:200\n94#1:201,18\n94#1:238\n35#1:124\n36#1:143,2\n36#1:145,2\n36#1:151,11\n47#1:181,2\n47#1:183,2\n47#1:189,11\n94#1:219,2\n94#1:221,2\n94#1:227,11\n36#1:147,4\n47#1:185,4\n94#1:223,4\n*E\n"})
/* loaded from: classes.dex */
public final class StopScreenShareKt {

    @Nullable
    private static ImageVector _stopScreenShare;

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.TwoTone.StopScreenShare", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.TwoTone.StopScreenShare", imports = {"androidx.compose.material.icons.automirrored.twotone.StopScreenShare"}))
    public static /* synthetic */ void getStopScreenShare$annotations(Icons.TwoTone twoTone) {
    }

    @NotNull
    public static final ImageVector getStopScreenShare(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _stopScreenShare;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.StopScreenShare", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.67f, 12.54f);
        pathBuilder.curveTo(9.13f, 12.92f, 7.96f, 13.71f, 7.0f, 15.0f);
        pathBuilder.curveToRelative(0.31f, -1.48f, 0.94f, -2.93f, 2.08f, -4.05f);
        pathBuilder.lineTo(4.13f, 6.02f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(10.01f);
        pathBuilder.horizontalLineToRelative(10.14f);
        pathBuilder.lineToRelative(-3.47f, -3.49f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(21.79f, 18.0f);
        pathBuilder2.lineToRelative(2.0f, 2.0f);
        pathBuilder2.lineTo(24.0f, 20.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.horizontalLineToRelative(-2.21f);
        pathBuilder2.close();
        pathBuilder2.moveTo(1.11f, 2.98f);
        pathBuilder2.lineToRelative(1.55f, 1.56f);
        pathBuilder2.curveToRelative(-0.41f, 0.37f, -0.66f, 0.89f, -0.66f, 1.48f);
        pathBuilder2.lineTo(2.0f, 16.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.01f, 2.0f);
        pathBuilder2.lineTo(0.0f, 18.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(18.13f);
        pathBuilder2.lineToRelative(2.71f, 2.71f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineTo(2.52f, 1.57f);
        pathBuilder2.lineTo(1.11f, 2.98f);
        pathBuilder2.close();
        pathBuilder2.moveTo(4.0f, 6.02f);
        pathBuilder2.horizontalLineToRelative(0.13f);
        pathBuilder2.lineToRelative(4.95f, 4.93f);
        pathBuilder2.curveTo(7.94f, 12.07f, 7.31f, 13.52f, 7.0f, 15.0f);
        pathBuilder2.curveToRelative(0.96f, -1.29f, 2.13f, -2.08f, 3.67f, -2.46f);
        pathBuilder2.lineToRelative(3.46f, 3.48f);
        pathBuilder2.lineTo(4.0f, 16.02f);
        pathBuilder2.verticalLineToRelative(-10.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.0f, 6.02f);
        pathBuilder2.verticalLineToRelative(10.19f);
        pathBuilder2.lineToRelative(1.3f, 1.3f);
        pathBuilder2.curveToRelative(0.42f, -0.37f, 0.7f, -0.89f, 0.7f, -1.49f);
        pathBuilder2.verticalLineToRelative(-10.0f);
        pathBuilder2.curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.lineTo(7.8f, 4.02f);
        pathBuilder2.lineToRelative(2.0f, 2.0f);
        pathBuilder2.lineTo(20.0f, 6.02f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.93f, 9.15f);
        pathBuilder2.lineToRelative(2.79f, 2.78f);
        pathBuilder2.lineToRelative(1.28f, -1.2f);
        pathBuilder2.lineTo(13.0f, 7.0f);
        pathBuilder2.verticalLineToRelative(2.13f);
        pathBuilder2.lineToRelative(-0.07f, 0.02f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(20.0f, 6.02f);
        pathBuilder3.horizontalLineTo(9.8f);
        pathBuilder3.lineToRelative(3.13f, 3.13f);
        pathBuilder3.curveToRelative(0.02f, 0.0f, 0.04f, -0.01f, 0.07f, -0.02f);
        pathBuilder3.verticalLineTo(7.0f);
        pathBuilder3.lineToRelative(4.0f, 3.73f);
        pathBuilder3.lineToRelative(-1.28f, 1.2f);
        pathBuilder3.lineTo(20.0f, 16.21f);
        pathBuilder3.verticalLineTo(6.02f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stopScreenShare = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
