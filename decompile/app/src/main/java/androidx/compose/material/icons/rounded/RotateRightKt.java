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

/* compiled from: RotateRight.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7105d2 = {"_rotateRight", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RotateRight", "Landroidx/compose/material/icons/Icons$Rounded;", "getRotateRight$annotations", "(Landroidx/compose/material/icons/Icons$Rounded;)V", "getRotateRight", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nRotateRight.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RotateRight.kt\nandroidx/compose/material/icons/rounded/RotateRightKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,88:1\n212#2,12:89\n233#2,18:102\n253#2:139\n174#3:101\n705#4,2:120\n717#4,2:122\n719#4,11:128\n72#5,4:124\n*S KotlinDebug\n*F\n+ 1 RotateRight.kt\nandroidx/compose/material/icons/rounded/RotateRightKt\n*L\n35#1:89,12\n36#1:102,18\n36#1:139\n35#1:101\n36#1:120,2\n36#1:122,2\n36#1:128,11\n36#1:124,4\n*E\n"})
/* loaded from: classes2.dex */
public final class RotateRightKt {

    @Nullable
    private static ImageVector _rotateRight;

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.Rounded.RotateRight", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.Rounded.RotateRight", imports = {"androidx.compose.material.icons.automirrored.rounded.RotateRight"}))
    public static /* synthetic */ void getRotateRight$annotations(Icons.Rounded rounded) {
    }

    @NotNull
    public static final ImageVector getRotateRight(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _rotateRight;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RotateRight", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.83f, 4.83f);
        pathBuilder.lineTo(12.7f, 2.7f);
        pathBuilder.curveToRelative(-0.62f, -0.62f, -1.7f, -0.18f, -1.7f, 0.71f);
        pathBuilder.verticalLineToRelative(0.66f);
        pathBuilder.curveTo(7.06f, 4.56f, 4.0f, 7.92f, 4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 3.64f, 2.43f, 6.71f, 5.77f, 7.68f);
        pathBuilder.curveToRelative(0.62f, 0.18f, 1.23f, -0.32f, 1.23f, -0.96f);
        pathBuilder.verticalLineToRelative(-0.03f);
        pathBuilder.curveToRelative(0.0f, -0.43f, -0.27f, -0.82f, -0.68f, -0.94f);
        pathBuilder.curveTo(7.82f, 17.03f, 6.0f, 14.73f, 6.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -2.97f, 2.16f, -5.43f, 5.0f, -5.91f);
        pathBuilder.verticalLineToRelative(1.53f);
        pathBuilder.curveToRelative(0.0f, 0.89f, 1.07f, 1.33f, 1.7f, 0.71f);
        pathBuilder.lineToRelative(2.13f, -2.08f);
        pathBuilder.curveToRelative(0.4f, -0.38f, 0.4f, -1.02f, 0.0f, -1.42f);
        pathBuilder.close();
        pathBuilder.moveTo(19.67f, 9.76f);
        pathBuilder.curveToRelative(-0.16f, -0.55f, -0.38f, -1.08f, -0.66f, -1.59f);
        pathBuilder.curveToRelative(-0.31f, -0.57f, -1.1f, -0.66f, -1.56f, -0.2f);
        pathBuilder.lineToRelative(-0.01f, 0.01f);
        pathBuilder.curveToRelative(-0.31f, 0.31f, -0.38f, 0.78f, -0.17f, 1.16f);
        pathBuilder.curveToRelative(0.2f, 0.37f, 0.36f, 0.76f, 0.48f, 1.16f);
        pathBuilder.curveToRelative(0.12f, 0.42f, 0.51f, 0.7f, 0.94f, 0.7f);
        pathBuilder.horizontalLineToRelative(0.02f);
        pathBuilder.curveToRelative(0.65f, 0.0f, 1.15f, -0.62f, 0.96f, -1.24f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 18.68f);
        pathBuilder.verticalLineToRelative(0.02f);
        pathBuilder.curveToRelative(0.0f, 0.65f, 0.62f, 1.14f, 1.24f, 0.96f);
        pathBuilder.curveToRelative(0.55f, -0.16f, 1.08f, -0.38f, 1.59f, -0.66f);
        pathBuilder.curveToRelative(0.57f, -0.31f, 0.66f, -1.1f, 0.2f, -1.56f);
        pathBuilder.lineToRelative(-0.02f, -0.02f);
        pathBuilder.curveToRelative(-0.31f, -0.31f, -0.78f, -0.38f, -1.16f, -0.17f);
        pathBuilder.curveToRelative(-0.37f, 0.21f, -0.76f, 0.37f, -1.16f, 0.49f);
        pathBuilder.curveToRelative(-0.41f, 0.12f, -0.69f, 0.51f, -0.69f, 0.94f);
        pathBuilder.close();
        pathBuilder.moveTo(17.44f, 16.03f);
        pathBuilder.curveToRelative(0.46f, 0.46f, 1.25f, 0.37f, 1.56f, -0.2f);
        pathBuilder.curveToRelative(0.28f, -0.51f, 0.5f, -1.04f, 0.67f, -1.59f);
        pathBuilder.curveToRelative(0.18f, -0.62f, -0.31f, -1.24f, -0.96f, -1.24f);
        pathBuilder.horizontalLineToRelative(-0.02f);
        pathBuilder.curveToRelative(-0.44f, 0.0f, -0.82f, 0.28f, -0.94f, 0.7f);
        pathBuilder.curveToRelative(-0.12f, 0.4f, -0.28f, 0.79f, -0.48f, 1.17f);
        pathBuilder.curveToRelative(-0.21f, 0.38f, -0.13f, 0.86f, 0.17f, 1.16f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rotateRight = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
