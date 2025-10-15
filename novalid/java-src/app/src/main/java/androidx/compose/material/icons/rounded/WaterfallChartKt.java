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

/* compiled from: WaterfallChart.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_waterfallChart", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WaterfallChart", "Landroidx/compose/material/icons/Icons$Rounded;", "getWaterfallChart", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nWaterfallChart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WaterfallChart.kt\nandroidx/compose/material/icons/rounded/WaterfallChartKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,87:1\n212#2,12:88\n233#2,18:101\n253#2:138\n174#3:100\n705#4,2:119\n717#4,2:121\n719#4,11:127\n72#5,4:123\n*S KotlinDebug\n*F\n+ 1 WaterfallChart.kt\nandroidx/compose/material/icons/rounded/WaterfallChartKt\n*L\n29#1:88,12\n30#1:101,18\n30#1:138\n29#1:100\n30#1:119,2\n30#1:121,2\n30#1:127,11\n30#1:123,4\n*E\n"})
/* loaded from: classes4.dex */
public final class WaterfallChartKt {

    @Nullable
    private static ImageVector _waterfallChart;

    @NotNull
    public static final ImageVector getWaterfallChart(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _waterfallChart;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WaterfallChart", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.5f, 4.0f);
        pathBuilder.lineTo(19.5f, 4.0f);
        pathBuilder.curveTo(20.33f, 4.0f, 21.0f, 4.67f, 21.0f, 5.5f);
        pathBuilder.verticalLineToRelative(13.0f);
        pathBuilder.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.verticalLineToRelative(-13.0f);
        pathBuilder.curveTo(18.0f, 4.67f, 18.67f, 4.0f, 19.5f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(4.5f, 13.0f);
        pathBuilder.lineTo(4.5f, 13.0f);
        pathBuilder.curveTo(5.33f, 13.0f, 6.0f, 13.67f, 6.0f, 14.5f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.curveTo(6.0f, 19.33f, 5.33f, 20.0f, 4.5f, 20.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(3.67f, 20.0f, 3.0f, 19.33f, 3.0f, 18.5f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.curveTo(3.0f, 13.67f, 3.67f, 13.0f, 4.5f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.5f, 4.0f);
        pathBuilder.lineTo(15.5f, 4.0f);
        pathBuilder.curveTo(16.33f, 4.0f, 17.0f, 4.67f, 17.0f, 5.5f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveTo(17.0f, 6.33f, 16.33f, 7.0f, 15.5f, 7.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(14.67f, 7.0f, 14.0f, 6.33f, 14.0f, 5.5f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveTo(14.0f, 4.67f, 14.67f, 4.0f, 15.5f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.5f, 5.0f);
        pathBuilder.lineTo(11.5f, 5.0f);
        pathBuilder.curveTo(12.33f, 5.0f, 13.0f, 5.67f, 13.0f, 6.5f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveTo(13.0f, 8.33f, 12.33f, 9.0f, 11.5f, 9.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(10.67f, 9.0f, 10.0f, 8.33f, 10.0f, 7.5f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.curveTo(10.0f, 5.67f, 10.67f, 5.0f, 11.5f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.5f, 10.0f);
        pathBuilder.lineTo(8.5f, 10.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(7.67f, 14.0f, 7.0f, 13.33f, 7.0f, 12.5f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.curveTo(7.0f, 10.67f, 7.67f, 10.0f, 8.5f, 10.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _waterfallChart = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
