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

/* compiled from: OnlinePrediction.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_onlinePrediction", "Landroidx/compose/ui/graphics/vector/ImageVector;", "OnlinePrediction", "Landroidx/compose/material/icons/Icons$Outlined;", "getOnlinePrediction", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nOnlinePrediction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnlinePrediction.kt\nandroidx/compose/material/icons/outlined/OnlinePredictionKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,82:1\n212#2,12:83\n233#2,18:96\n253#2:133\n174#3:95\n705#4,2:114\n717#4,2:116\n719#4,11:122\n72#5,4:118\n*S KotlinDebug\n*F\n+ 1 OnlinePrediction.kt\nandroidx/compose/material/icons/outlined/OnlinePredictionKt\n*L\n29#1:83,12\n30#1:96,18\n30#1:133\n29#1:95\n30#1:114,2\n30#1:116,2\n30#1:122,11\n30#1:118,4\n*E\n"})
/* loaded from: classes3.dex */
public final class OnlinePredictionKt {

    @Nullable
    private static ImageVector _onlinePrediction;

    @NotNull
    public static final ImageVector getOnlinePrediction(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _onlinePrediction;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.OnlinePrediction", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.5f, 11.5f);
        pathBuilder.curveToRelative(0.0f, 2.0f, -2.5f, 3.5f, -2.5f, 5.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, -1.5f, -2.5f, -3.0f, -2.5f, -5.0f);
        pathBuilder.curveTo(8.5f, 9.57f, 10.07f, 8.0f, 12.0f, 8.0f);
        pathBuilder.reflectiveCurveTo(15.5f, 9.57f, 15.5f, 11.5f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 17.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(17.5f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -2.76f, -1.12f, -5.26f, -2.93f, -7.07f);
        pathBuilder.lineToRelative(-1.06f, 1.06f);
        pathBuilder.curveTo(19.55f, 7.53f, 20.5f, 9.66f, 20.5f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 2.34f, -0.95f, 4.47f, -2.49f, 6.01f);
        pathBuilder.lineToRelative(1.06f, 1.06f);
        pathBuilder.curveTo(20.88f, 17.26f, 22.0f, 14.76f, 22.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.5f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -2.34f, 0.95f, -4.47f, 2.49f, -6.01f);
        pathBuilder.lineTo(4.93f, 4.93f);
        pathBuilder.curveTo(3.12f, 6.74f, 2.0f, 9.24f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 2.76f, 1.12f, 5.26f, 2.93f, 7.07f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.curveTo(4.45f, 16.47f, 3.5f, 14.34f, 3.5f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.5f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.52f, -0.62f, 2.89f, -1.61f, 3.89f);
        pathBuilder.lineToRelative(1.06f, 1.06f);
        pathBuilder.curveTo(18.22f, 15.68f, 19.0f, 13.93f, 19.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.93f, -0.78f, -3.68f, -2.05f, -4.95f);
        pathBuilder.lineToRelative(-1.06f, 1.06f);
        pathBuilder.curveTo(16.88f, 9.11f, 17.5f, 10.48f, 17.5f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.05f, 16.95f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.curveToRelative(-1.0f, -1.0f, -1.61f, -2.37f, -1.61f, -3.89f);
        pathBuilder.curveToRelative(0.0f, -1.52f, 0.62f, -2.89f, 1.61f, -3.89f);
        pathBuilder.lineTo(7.05f, 7.05f);
        pathBuilder.curveTo(5.78f, 8.32f, 5.0f, 10.07f, 5.0f, 12.0f);
        pathBuilder.curveTo(5.0f, 13.93f, 5.78f, 15.68f, 7.05f, 16.95f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _onlinePrediction = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
