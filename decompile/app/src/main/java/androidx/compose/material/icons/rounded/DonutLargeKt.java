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

/* compiled from: DonutLarge.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_donutLarge", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DonutLarge", "Landroidx/compose/material/icons/Icons$Rounded;", "getDonutLarge", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDonutLarge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DonutLarge.kt\nandroidx/compose/material/icons/rounded/DonutLargeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,68:1\n212#2,12:69\n233#2,18:82\n253#2:119\n174#3:81\n705#4,2:100\n717#4,2:102\n719#4,11:108\n72#5,4:104\n*S KotlinDebug\n*F\n+ 1 DonutLarge.kt\nandroidx/compose/material/icons/rounded/DonutLargeKt\n*L\n29#1:69,12\n30#1:82,18\n30#1:119\n29#1:81\n30#1:100,2\n30#1:102,2\n30#1:108,11\n30#1:104,4\n*E\n"})
/* loaded from: classes3.dex */
public final class DonutLargeKt {

    @Nullable
    private static ImageVector _donutLarge;

    @NotNull
    public static final ImageVector getDonutLarge(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _donutLarge;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DonutLarge", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.07f, 5.32f);
        pathBuilder.curveTo(16.26f, 6.0f, 18.0f, 7.74f, 18.68f, 9.93f);
        pathBuilder.curveToRelative(0.19f, 0.63f, 0.76f, 1.07f, 1.41f, 1.07f);
        pathBuilder.horizontalLineToRelative(0.04f);
        pathBuilder.curveToRelative(1.0f, 0.0f, 1.72f, -0.96f, 1.43f, -1.91f);
        pathBuilder.curveToRelative(-0.97f, -3.18f, -3.48f, -5.69f, -6.66f, -6.66f);
        pathBuilder.curveToRelative(-0.94f, -0.29f, -1.9f, 0.43f, -1.9f, 1.43f);
        pathBuilder.verticalLineToRelative(0.04f);
        pathBuilder.curveToRelative(0.0f, 0.66f, 0.44f, 1.23f, 1.07f, 1.42f);
        pathBuilder.close();
        pathBuilder.moveTo(18.68f, 14.07f);
        pathBuilder.curveToRelative(-0.68f, 2.2f, -2.42f, 3.93f, -4.61f, 4.61f);
        pathBuilder.curveToRelative(-0.63f, 0.19f, -1.07f, 0.76f, -1.07f, 1.41f);
        pathBuilder.verticalLineToRelative(0.04f);
        pathBuilder.curveToRelative(0.0f, 1.0f, 0.96f, 1.72f, 1.91f, 1.43f);
        pathBuilder.curveToRelative(3.18f, -0.97f, 5.69f, -3.48f, 6.66f, -6.66f);
        pathBuilder.curveToRelative(0.29f, -0.95f, -0.43f, -1.91f, -1.42f, -1.91f);
        pathBuilder.horizontalLineToRelative(-0.05f);
        pathBuilder.curveToRelative(-0.66f, 0.01f, -1.23f, 0.45f, -1.42f, 1.08f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 20.11f);
        pathBuilder.curveToRelative(0.0f, -0.67f, -0.45f, -1.24f, -1.09f, -1.44f);
        pathBuilder.curveTo(7.07f, 17.78f, 5.0f, 15.13f, 5.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(2.07f, -5.78f, 4.91f, -6.67f);
        pathBuilder.curveToRelative(0.64f, -0.2f, 1.09f, -0.77f, 1.09f, -1.44f);
        pathBuilder.verticalLineToRelative(-0.01f);
        pathBuilder.curveToRelative(0.0f, -1.0f, -0.97f, -1.74f, -1.93f, -1.44f);
        pathBuilder.curveTo(4.98f, 3.69f, 2.0f, 7.5f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 4.5f, 2.98f, 8.31f, 7.07f, 9.56f);
        pathBuilder.curveToRelative(0.96f, 0.3f, 1.93f, -0.44f, 1.93f, -1.45f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _donutLarge = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
