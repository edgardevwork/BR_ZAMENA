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

/* compiled from: Umbrella.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_umbrella", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Umbrella", "Landroidx/compose/material/icons/Icons$Rounded;", "getUmbrella", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nUmbrella.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Umbrella.kt\nandroidx/compose/material/icons/rounded/UmbrellaKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,74:1\n212#2,12:75\n233#2,18:88\n253#2:125\n174#3:87\n705#4,2:106\n717#4,2:108\n719#4,11:114\n72#5,4:110\n*S KotlinDebug\n*F\n+ 1 Umbrella.kt\nandroidx/compose/material/icons/rounded/UmbrellaKt\n*L\n29#1:75,12\n30#1:88,18\n30#1:125\n29#1:87\n30#1:106,2\n30#1:108,2\n30#1:114,11\n30#1:110,4\n*E\n"})
/* loaded from: classes2.dex */
public final class UmbrellaKt {

    @Nullable
    private static ImageVector _umbrella;

    @NotNull
    public static final ImageVector getUmbrella(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _umbrella;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Umbrella", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.12f, 6.28f);
        pathBuilder.lineTo(14.5f, 6.92f);
        pathBuilder.lineTo(13.0f, 5.77f);
        pathBuilder.verticalLineTo(3.88f);
        pathBuilder.verticalLineTo(3.4f);
        pathBuilder.curveToRelative(0.0f, -0.26f, 0.22f, -0.48f, 0.5f, -0.48f);
        pathBuilder.curveToRelative(0.23f, 0.0f, 0.43f, 0.16f, 0.49f, 0.36f);
        pathBuilder.curveTo(14.1f, 3.7f, 14.49f, 4.0f, 14.94f, 4.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -0.1f, -0.02f, -0.2f, -0.05f, -0.3f);
        pathBuilder.curveTo(15.59f, 1.72f, 14.63f, 1.0f, 13.5f, 1.0f);
        pathBuilder.curveTo(12.12f, 1.0f, 11.0f, 2.07f, 11.0f, 3.4f);
        pathBuilder.verticalLineToRelative(0.48f);
        pathBuilder.verticalLineToRelative(1.89f);
        pathBuilder.lineTo(9.5f, 6.92f);
        pathBuilder.lineTo(6.88f, 6.28f);
        pathBuilder.curveTo(6.5f, 6.19f, 6.16f, 6.55f, 6.28f, 6.92f);
        pathBuilder.lineToRelative(4.77f, 14.39f);
        pathBuilder.curveTo(11.2f, 21.77f, 11.6f, 22.0f, 12.0f, 22.0f);
        pathBuilder.reflectiveCurveToRelative(0.8f, -0.23f, 0.95f, -0.69f);
        pathBuilder.lineToRelative(4.77f, -14.39f);
        pathBuilder.curveTo(17.84f, 6.55f, 17.5f, 6.19f, 17.12f, 6.28f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 14.8f);
        pathBuilder.lineTo(9.03f, 8.86f);
        pathBuilder.lineToRelative(0.92f, 0.23f);
        pathBuilder.lineToRelative(0.76f, -0.58f);
        pathBuilder.lineTo(11.0f, 8.29f);
        pathBuilder.verticalLineTo(14.8f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 14.8f);
        pathBuilder.verticalLineTo(8.29f);
        pathBuilder.lineToRelative(0.28f, 0.22f);
        pathBuilder.lineToRelative(0.76f, 0.58f);
        pathBuilder.lineToRelative(0.92f, -0.23f);
        pathBuilder.lineTo(13.0f, 14.8f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _umbrella = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
