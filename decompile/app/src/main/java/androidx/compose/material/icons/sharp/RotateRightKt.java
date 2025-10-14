package androidx.compose.material.icons.sharp;

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

/* compiled from: RotateRight.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7105d2 = {"_rotateRight", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RotateRight", "Landroidx/compose/material/icons/Icons$Sharp;", "getRotateRight$annotations", "(Landroidx/compose/material/icons/Icons$Sharp;)V", "getRotateRight", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nRotateRight.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RotateRight.kt\nandroidx/compose/material/icons/sharp/RotateRightKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,72:1\n212#2,12:73\n233#2,18:86\n253#2:123\n174#3:85\n705#4,2:104\n717#4,2:106\n719#4,11:112\n72#5,4:108\n*S KotlinDebug\n*F\n+ 1 RotateRight.kt\nandroidx/compose/material/icons/sharp/RotateRightKt\n*L\n35#1:73,12\n36#1:86,18\n36#1:123\n35#1:85\n36#1:104,2\n36#1:106,2\n36#1:112,11\n36#1:108,4\n*E\n"})
/* loaded from: classes4.dex */
public final class RotateRightKt {

    @Nullable
    private static ImageVector _rotateRight;

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.Sharp.RotateRight", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.Sharp.RotateRight", imports = {"androidx.compose.material.icons.automirrored.sharp.RotateRight"}))
    public static /* synthetic */ void getRotateRight$annotations(Icons.Sharp sharp) {
    }

    @NotNull
    public static final ImageVector getRotateRight(@NotNull Icons.Sharp sharp) {
        ImageVector imageVector = _rotateRight;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.RotateRight", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.55f, 5.55f);
        pathBuilder.lineTo(11.0f, 1.0f);
        pathBuilder.verticalLineToRelative(3.07f);
        pathBuilder.curveTo(7.06f, 4.56f, 4.0f, 7.92f, 4.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(3.05f, 7.44f, 7.0f, 7.93f);
        pathBuilder.verticalLineToRelative(-2.02f);
        pathBuilder.curveToRelative(-2.84f, -0.48f, -5.0f, -2.94f, -5.0f, -5.91f);
        pathBuilder.reflectiveCurveToRelative(2.16f, -5.43f, 5.0f, -5.91f);
        pathBuilder.lineTo(11.0f, 10.0f);
        pathBuilder.lineToRelative(4.55f, -4.45f);
        pathBuilder.close();
        pathBuilder.moveTo(19.93f, 11.0f);
        pathBuilder.curveToRelative(-0.17f, -1.39f, -0.72f, -2.73f, -1.62f, -3.89f);
        pathBuilder.lineToRelative(-1.42f, 1.42f);
        pathBuilder.curveToRelative(0.54f, 0.75f, 0.88f, 1.6f, 1.02f, 2.47f);
        pathBuilder.horizontalLineToRelative(2.02f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 17.9f);
        pathBuilder.verticalLineToRelative(2.02f);
        pathBuilder.curveToRelative(1.39f, -0.17f, 2.74f, -0.71f, 3.9f, -1.61f);
        pathBuilder.lineToRelative(-1.44f, -1.44f);
        pathBuilder.curveToRelative(-0.75f, 0.54f, -1.59f, 0.89f, -2.46f, 1.03f);
        pathBuilder.close();
        pathBuilder.moveTo(16.89f, 15.48f);
        pathBuilder.lineToRelative(1.42f, 1.41f);
        pathBuilder.curveToRelative(0.9f, -1.16f, 1.45f, -2.5f, 1.62f, -3.89f);
        pathBuilder.horizontalLineToRelative(-2.02f);
        pathBuilder.curveToRelative(-0.14f, 0.87f, -0.48f, 1.72f, -1.02f, 2.48f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rotateRight = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
