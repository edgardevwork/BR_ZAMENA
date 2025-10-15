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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LogoDev.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_logoDev", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LogoDev", "Landroidx/compose/material/icons/Icons$Outlined;", "getLogoDev", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLogoDev.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LogoDev.kt\nandroidx/compose/material/icons/outlined/LogoDevKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,92:1\n212#2,12:93\n233#2,18:106\n253#2:143\n233#2,18:144\n253#2:181\n174#3:105\n705#4,2:124\n717#4,2:126\n719#4,11:132\n705#4,2:162\n717#4,2:164\n719#4,11:170\n72#5,4:128\n72#5,4:166\n*S KotlinDebug\n*F\n+ 1 LogoDev.kt\nandroidx/compose/material/icons/outlined/LogoDevKt\n*L\n29#1:93,12\n30#1:106,18\n30#1:143\n75#1:144,18\n75#1:181\n29#1:105\n30#1:124,2\n30#1:126,2\n30#1:132,11\n75#1:162,2\n75#1:164,2\n75#1:170,11\n30#1:128,4\n75#1:166,4\n*E\n"})
/* loaded from: classes4.dex */
public final class LogoDevKt {

    @Nullable
    private static ImageVector _logoDev;

    @NotNull
    public static final ImageVector getLogoDev(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _logoDev;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.LogoDev", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 3.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.68f, 14.98f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.horizontalLineToRelative(1.71f);
        pathBuilder.curveToRelative(1.28f, 0.0f, 1.71f, 1.03f, 1.71f, 1.71f);
        pathBuilder.lineToRelative(0.0f, 2.56f);
        pathBuilder.curveTo(9.42f, 13.95f, 9.0f, 14.98f, 7.68f, 14.98f);
        pathBuilder.close();
        pathBuilder.moveTo(12.38f, 11.46f);
        pathBuilder.verticalLineToRelative(1.07f);
        pathBuilder.horizontalLineToRelative(-1.18f);
        pathBuilder.verticalLineToRelative(1.39f);
        pathBuilder.horizontalLineToRelative(1.93f);
        pathBuilder.verticalLineToRelative(1.07f);
        pathBuilder.horizontalLineToRelative(-2.25f);
        pathBuilder.curveToRelative(-0.4f, 0.01f, -0.74f, -0.31f, -0.75f, -0.71f);
        pathBuilder.verticalLineTo(9.75f);
        pathBuilder.curveToRelative(-0.01f, -0.4f, 0.31f, -0.74f, 0.71f, -0.75f);
        pathBuilder.horizontalLineToRelative(2.28f);
        pathBuilder.lineToRelative(0.0f, 1.07f);
        pathBuilder.horizontalLineToRelative(-1.92f);
        pathBuilder.verticalLineToRelative(1.39f);
        pathBuilder.horizontalLineTo(12.38f);
        pathBuilder.close();
        pathBuilder.moveTo(16.88f, 14.23f);
        pathBuilder.curveToRelative(-0.48f, 1.11f, -1.33f, 0.89f, -1.71f, 0.0f);
        pathBuilder.lineTo(13.77f, 9.0f);
        pathBuilder.horizontalLineToRelative(1.18f);
        pathBuilder.lineToRelative(1.07f, 4.11f);
        pathBuilder.lineTo(17.09f, 9.0f);
        pathBuilder.horizontalLineToRelative(1.18f);
        pathBuilder.lineTo(16.88f, 14.23f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(7.77f, 10.12f);
        pathBuilder2.horizontalLineTo(7.14f);
        pathBuilder2.verticalLineToRelative(3.77f);
        pathBuilder2.horizontalLineToRelative(0.63f);
        pathBuilder2.curveToRelative(0.14f, 0.0f, 0.28f, -0.05f, 0.42f, -0.16f);
        pathBuilder2.curveToRelative(0.14f, -0.1f, 0.21f, -0.26f, 0.21f, -0.47f);
        pathBuilder2.verticalLineToRelative(-2.52f);
        pathBuilder2.curveToRelative(0.0f, -0.21f, -0.07f, -0.37f, -0.21f, -0.47f);
        pathBuilder2.curveTo(8.05f, 10.17f, 7.91f, 10.12f, 7.77f, 10.12f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _logoDev = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
