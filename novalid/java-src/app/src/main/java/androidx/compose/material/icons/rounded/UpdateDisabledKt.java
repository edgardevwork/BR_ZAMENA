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

/* compiled from: UpdateDisabled.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_updateDisabled", "Landroidx/compose/ui/graphics/vector/ImageVector;", "UpdateDisabled", "Landroidx/compose/material/icons/Icons$Rounded;", "getUpdateDisabled", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nUpdateDisabled.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateDisabled.kt\nandroidx/compose/material/icons/rounded/UpdateDisabledKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,86:1\n212#2,12:87\n233#2,18:100\n253#2:137\n174#3:99\n705#4,2:118\n717#4,2:120\n719#4,11:126\n72#5,4:122\n*S KotlinDebug\n*F\n+ 1 UpdateDisabled.kt\nandroidx/compose/material/icons/rounded/UpdateDisabledKt\n*L\n29#1:87,12\n30#1:100,18\n30#1:137\n29#1:99\n30#1:118,2\n30#1:120,2\n30#1:126,11\n30#1:122,4\n*E\n"})
/* loaded from: classes4.dex */
public final class UpdateDisabledKt {

    @Nullable
    private static ImageVector _updateDisabled;

    @NotNull
    public static final ImageVector getUpdateDisabled(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _updateDisabled;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.UpdateDisabled", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.49f, 20.49f);
        pathBuilder.lineTo(3.51f, 3.51f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(2.31f, 2.31f);
        pathBuilder.curveTo(3.57f, 8.56f, 3.05f, 10.09f, 3.0f, 11.74f);
        pathBuilder.curveTo(2.86f, 16.83f, 6.94f, 21.0f, 12.0f, 21.0f);
        pathBuilder.curveToRelative(1.76f, 0.0f, 3.39f, -0.52f, 4.78f, -1.39f);
        pathBuilder.lineToRelative(2.29f, 2.29f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(20.88f, 21.51f, 20.88f, 20.88f, 20.49f, 20.49f);
        pathBuilder.close();
        pathBuilder.moveTo(10.72f, 18.89f);
        pathBuilder.curveToRelative(-2.78f, -0.49f, -5.04f, -2.71f, -5.58f, -5.47f);
        pathBuilder.curveToRelative(-0.34f, -1.72f, -0.03f, -3.36f, 0.72f, -4.73f);
        pathBuilder.lineToRelative(9.46f, 9.46f);
        pathBuilder.curveTo(13.98f, 18.87f, 12.4f, 19.18f, 10.72f, 18.89f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 8.0f);
        pathBuilder.verticalLineToRelative(2.17f);
        pathBuilder.lineToRelative(-2.0f, -2.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveTo(13.0f, 7.45f, 13.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.72f, 14.23f);
        pathBuilder.curveToRelative(-0.23f, 0.92f, -0.61f, 1.77f, -1.1f, 2.55f);
        pathBuilder.lineToRelative(-1.47f, -1.47f);
        pathBuilder.curveToRelative(0.27f, -0.5f, 0.49f, -1.03f, 0.63f, -1.59f);
        pathBuilder.curveTo(18.89f, 13.3f, 19.29f, 13.0f, 19.73f, 13.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(20.38f, 13.0f, 20.88f, 13.61f, 20.72f, 14.23f);
        pathBuilder.close();
        pathBuilder.moveTo(7.24f, 4.41f);
        pathBuilder.curveToRelative(1.46f, -0.93f, 3.18f, -1.45f, 5.0f, -1.41f);
        pathBuilder.curveToRelative(2.65f, 0.07f, 5.0f, 1.28f, 6.6f, 3.16f);
        pathBuilder.lineToRelative(1.31f, -1.31f);
        pathBuilder.curveTo(20.46f, 4.54f, 21.0f, 4.76f, 21.0f, 5.21f);
        pathBuilder.verticalLineTo(9.5f);
        pathBuilder.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilder.horizontalLineToRelative(-4.29f);
        pathBuilder.curveToRelative(-0.45f, 0.0f, -0.67f, -0.54f, -0.35f, -0.85f);
        pathBuilder.lineToRelative(1.55f, -1.55f);
        pathBuilder.curveTo(16.12f, 6.02f, 14.18f, 5.0f, 12.0f, 5.0f);
        pathBuilder.curveToRelative(-1.2f, 0.0f, -2.33f, 0.31f, -3.32f, 0.85f);
        pathBuilder.lineTo(7.24f, 4.41f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _updateDisabled = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
