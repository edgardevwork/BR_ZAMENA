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

/* compiled from: DoNotStep.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_doNotStep", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DoNotStep", "Landroidx/compose/material/icons/Icons$Outlined;", "getDoNotStep", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDoNotStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoNotStep.kt\nandroidx/compose/material/icons/outlined/DoNotStepKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,94:1\n212#2,12:95\n233#2,18:108\n253#2:145\n174#3:107\n705#4,2:126\n717#4,2:128\n719#4,11:134\n72#5,4:130\n*S KotlinDebug\n*F\n+ 1 DoNotStep.kt\nandroidx/compose/material/icons/outlined/DoNotStepKt\n*L\n29#1:95,12\n30#1:108,18\n30#1:145\n29#1:107\n30#1:126,2\n30#1:128,2\n30#1:134,11\n30#1:130,4\n*E\n"})
/* loaded from: classes3.dex */
public final class DoNotStepKt {

    @Nullable
    private static ImageVector _doNotStep;

    @NotNull
    public static final ImageVector getDoNotStep(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _doNotStep;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DoNotStep", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.51f, 15.68f);
        pathBuilder.lineToRelative(-1.41f, -1.41f);
        pathBuilder.lineToRelative(4.48f, -4.48f);
        pathBuilder.lineTo(23.0f, 11.2f);
        pathBuilder.lineTo(18.51f, 15.68f);
        pathBuilder.close();
        pathBuilder.moveTo(14.98f, 12.15f);
        pathBuilder.moveTo(14.98f, 12.15f);
        pathBuilder.lineToRelative(3.07f, -3.07f);
        pathBuilder.lineTo(13.8f, 4.82f);
        pathBuilder.lineToRelative(-3.08f, 3.07f);
        pathBuilder.lineTo(9.3f, 6.47f);
        pathBuilder.lineTo(13.8f, 2.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.lineToRelative(7.08f, 7.08f);
        pathBuilder.lineToRelative(-4.48f, 4.48f);
        pathBuilder.lineTo(14.98f, 12.15f);
        pathBuilder.close();
        pathBuilder.moveTo(21.18f, 21.2f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineToRelative(-5.94f, -5.94f);
        pathBuilder.lineTo(10.5f, 20.0f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.verticalLineToRelative(-2.63f);
        pathBuilder.curveToRelative(0.0f, -0.84f, 0.52f, -1.57f, 1.3f, -1.88f);
        pathBuilder.curveToRelative(0.58f, -0.23f, 1.28f, -0.56f, 1.97f, -1.02f);
        pathBuilder.lineToRelative(1.38f, 1.38f);
        pathBuilder.curveTo(5.74f, 15.95f, 5.87f, 16.0f, 6.0f, 16.0f);
        pathBuilder.reflectiveCurveToRelative(0.26f, -0.05f, 0.36f, -0.15f);
        pathBuilder.curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        pathBuilder.lineToRelative(-1.28f, -1.28f);
        pathBuilder.curveToRelative(0.27f, -0.24f, 0.53f, -0.51f, 0.77f, -0.8f);
        pathBuilder.lineToRelative(1.27f, 1.27f);
        pathBuilder.curveToRelative(0.09f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f);
        pathBuilder.reflectiveCurveToRelative(0.25f, -0.05f, 0.35f, -0.15f);
        pathBuilder.curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        pathBuilder.lineToRelative(-1.4f, -1.4f);
        pathBuilder.curveToRelative(0.19f, -0.34f, 0.34f, -0.72f, 0.45f, -1.12f);
        pathBuilder.lineToRelative(1.71f, 1.72f);
        pathBuilder.curveToRelative(0.09f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f);
        pathBuilder.reflectiveCurveToRelative(0.25f, -0.05f, 0.35f, -0.15f);
        pathBuilder.curveToRelative(0.19f, -0.2f, 0.19f, -0.5f, 0.01f, -0.7f);
        pathBuilder.lineToRelative(-7.9f, -7.9f);
        pathBuilder.lineToRelative(1.42f, -1.41f);
        pathBuilder.lineTo(21.18f, 21.2f);
        pathBuilder.close();
        pathBuilder.moveTo(12.42f, 15.26f);
        pathBuilder.lineToRelative(-1.67f, -1.68f);
        pathBuilder.lineTo(7.42f, 16.9f);
        pathBuilder.curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, -0.01f);
        pathBuilder.lineTo(4.4f, 16.72f);
        pathBuilder.lineToRelative(-0.47f, 0.24f);
        pathBuilder.curveToRelative(-0.29f, 0.14f, -0.59f, 0.27f, -0.89f, 0.39f);
        pathBuilder.lineTo(3.03f, 18.0f);
        pathBuilder.horizontalLineToRelative(6.64f);
        pathBuilder.lineTo(12.42f, 15.26f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doNotStep = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
