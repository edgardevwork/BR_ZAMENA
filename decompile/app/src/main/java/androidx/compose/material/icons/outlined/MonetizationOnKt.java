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

/* compiled from: MonetizationOn.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_monetizationOn", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MonetizationOn", "Landroidx/compose/material/icons/Icons$Outlined;", "getMonetizationOn", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMonetizationOn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonetizationOn.kt\nandroidx/compose/material/icons/outlined/MonetizationOnKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,71:1\n212#2,12:72\n233#2,18:85\n253#2:122\n174#3:84\n705#4,2:103\n717#4,2:105\n719#4,11:111\n72#5,4:107\n*S KotlinDebug\n*F\n+ 1 MonetizationOn.kt\nandroidx/compose/material/icons/outlined/MonetizationOnKt\n*L\n29#1:72,12\n30#1:85,18\n30#1:122\n29#1:84\n30#1:103,2\n30#1:105,2\n30#1:111,11\n30#1:107,4\n*E\n"})
/* loaded from: classes2.dex */
public final class MonetizationOnKt {

    @Nullable
    private static ImageVector _monetizationOn;

    @NotNull
    public static final ImageVector getMonetizationOn(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _monetizationOn;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.MonetizationOn", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.31f, 11.14f);
        pathBuilder.curveToRelative(-1.77f, -0.45f, -2.34f, -0.94f, -2.34f, -1.67f);
        pathBuilder.curveToRelative(0.0f, -0.84f, 0.79f, -1.43f, 2.1f, -1.43f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 1.9f, 0.66f, 1.94f, 1.64f);
        pathBuilder.horizontalLineToRelative(1.71f);
        pathBuilder.curveToRelative(-0.05f, -1.34f, -0.87f, -2.57f, -2.49f, -2.97f);
        pathBuilder.lineTo(13.23f, 5.0f);
        pathBuilder.lineTo(10.9f, 5.0f);
        pathBuilder.verticalLineToRelative(1.69f);
        pathBuilder.curveToRelative(-1.51f, 0.32f, -2.72f, 1.3f, -2.72f, 2.81f);
        pathBuilder.curveToRelative(0.0f, 1.79f, 1.49f, 2.69f, 3.66f, 3.21f);
        pathBuilder.curveToRelative(1.95f, 0.46f, 2.34f, 1.15f, 2.34f, 1.87f);
        pathBuilder.curveToRelative(0.0f, 0.53f, -0.39f, 1.39f, -2.1f, 1.39f);
        pathBuilder.curveToRelative(-1.6f, 0.0f, -2.23f, -0.72f, -2.32f, -1.64f);
        pathBuilder.lineTo(8.04f, 14.33f);
        pathBuilder.curveToRelative(0.1f, 1.7f, 1.36f, 2.66f, 2.86f, 2.97f);
        pathBuilder.lineTo(10.9f, 19.0f);
        pathBuilder.horizontalLineToRelative(2.34f);
        pathBuilder.verticalLineToRelative(-1.67f);
        pathBuilder.curveToRelative(1.52f, -0.29f, 2.72f, -1.16f, 2.73f, -2.77f);
        pathBuilder.curveToRelative(-0.01f, -2.2f, -1.9f, -2.96f, -3.66f, -3.42f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _monetizationOn = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
