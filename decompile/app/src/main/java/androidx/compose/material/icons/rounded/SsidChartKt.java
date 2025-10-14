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

/* compiled from: SsidChart.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_ssidChart", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SsidChart", "Landroidx/compose/material/icons/Icons$Rounded;", "getSsidChart", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSsidChart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SsidChart.kt\nandroidx/compose/material/icons/rounded/SsidChartKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,68:1\n212#2,12:69\n233#2,18:82\n253#2:119\n174#3:81\n705#4,2:100\n717#4,2:102\n719#4,11:108\n72#5,4:104\n*S KotlinDebug\n*F\n+ 1 SsidChart.kt\nandroidx/compose/material/icons/rounded/SsidChartKt\n*L\n29#1:69,12\n30#1:82,18\n30#1:119\n29#1:81\n30#1:100,2\n30#1:102,2\n30#1:108,11\n30#1:104,4\n*E\n"})
/* loaded from: classes3.dex */
public final class SsidChartKt {

    @Nullable
    private static ImageVector _ssidChart;

    @NotNull
    public static final ImageVector getSsidChart(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _ssidChart;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SsidChart", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 9.03f);
        pathBuilder.curveToRelative(0.0f, -0.32f, 0.15f, -0.62f, 0.41f, -0.81f);
        pathBuilder.lineTo(7.14f, 5.5f);
        pathBuilder.curveToRelative(0.4f, -0.29f, 0.95f, -0.25f, 1.3f, 0.1f);
        pathBuilder.lineToRelative(3.78f, 3.78f);
        pathBuilder.lineToRelative(7.2f, -5.23f);
        pathBuilder.curveTo(20.07f, 3.67f, 21.0f, 4.14f, 21.0f, 4.96f);
        pathBuilder.curveToRelative(0.0f, 0.32f, -0.15f, 0.62f, -0.41f, 0.81f);
        pathBuilder.lineToRelative(-7.9f, 5.73f);
        pathBuilder.curveToRelative(-0.4f, 0.29f, -0.95f, 0.25f, -1.29f, -0.1f);
        pathBuilder.lineTo(7.62f, 7.62f);
        pathBuilder.lineTo(4.59f, 9.84f);
        pathBuilder.curveTo(3.93f, 10.32f, 3.0f, 9.85f, 3.0f, 9.03f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 16.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(-3.35f);
        pathBuilder.curveToRelative(-0.23f, 0.0f, -0.45f, 0.08f, -0.62f, 0.22f);
        pathBuilder.lineToRelative(-3.9f, 3.12f);
        pathBuilder.lineTo(6.6f, 12.99f);
        pathBuilder.curveToRelative(-0.35f, -0.34f, -0.88f, -0.38f, -1.27f, -0.1f);
        pathBuilder.lineToRelative(-1.9f, 1.35f);
        pathBuilder.curveTo(3.16f, 14.43f, 3.0f, 14.74f, 3.0f, 15.06f);
        pathBuilder.curveToRelative(0.0f, 0.81f, 0.92f, 1.29f, 1.58f, 0.81f);
        pathBuilder.lineTo(5.8f, 15.0f);
        pathBuilder.lineToRelative(5.57f, 5.39f);
        pathBuilder.curveToRelative(0.36f, 0.35f, 0.93f, 0.38f, 1.32f, 0.06f);
        pathBuilder.lineTo(17.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.curveTo(20.55f, 17.0f, 21.0f, 16.55f, 21.0f, 16.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _ssidChart = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
