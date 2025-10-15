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

/* compiled from: FiberNew.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_fiberNew", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FiberNew", "Landroidx/compose/material/icons/Icons$Rounded;", "getFiberNew", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFiberNew.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FiberNew.kt\nandroidx/compose/material/icons/rounded/FiberNewKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,104:1\n212#2,12:105\n233#2,18:118\n253#2:155\n174#3:117\n705#4,2:136\n717#4,2:138\n719#4,11:144\n72#5,4:140\n*S KotlinDebug\n*F\n+ 1 FiberNew.kt\nandroidx/compose/material/icons/rounded/FiberNewKt\n*L\n29#1:105,12\n30#1:118,18\n30#1:155\n29#1:117\n30#1:136,2\n30#1:138,2\n30#1:144,11\n30#1:140,4\n*E\n"})
/* loaded from: classes2.dex */
public final class FiberNewKt {

    @Nullable
    private static ImageVector _fiberNew;

    @NotNull
    public static final ImageVector getFiberNew(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _fiberNew;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FiberNew", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 4.0f);
        pathBuilder.lineTo(4.0f, 4.0f);
        pathBuilder.curveToRelative(-1.11f, 0.0f, -1.99f, 0.89f, -1.99f, 2.0f);
        pathBuilder.lineTo(2.0f, 18.0f);
        pathBuilder.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        pathBuilder.lineTo(22.0f, 6.0f);
        pathBuilder.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.5f, 14.21f);
        pathBuilder.curveToRelative(0.0f, 0.43f, -0.36f, 0.79f, -0.79f, 0.79f);
        pathBuilder.curveToRelative(-0.25f, 0.0f, -0.49f, -0.12f, -0.64f, -0.33f);
        pathBuilder.lineTo(4.75f, 11.5f);
        pathBuilder.verticalLineToRelative(2.88f);
        pathBuilder.curveToRelative(0.0f, 0.35f, -0.28f, 0.62f, -0.62f, 0.62f);
        pathBuilder.reflectiveCurveToRelative(-0.63f, -0.28f, -0.63f, -0.62f);
        pathBuilder.lineTo(3.5f, 9.79f);
        pathBuilder.curveToRelative(0.0f, -0.43f, 0.36f, -0.79f, 0.79f, -0.79f);
        pathBuilder.horizontalLineToRelative(0.05f);
        pathBuilder.curveToRelative(0.26f, 0.0f, 0.5f, 0.12f, 0.65f, 0.33f);
        pathBuilder.lineToRelative(2.26f, 3.17f);
        pathBuilder.lineTo(7.25f, 9.62f);
        pathBuilder.curveToRelative(0.0f, -0.34f, 0.28f, -0.62f, 0.63f, -0.62f);
        pathBuilder.reflectiveCurveToRelative(0.62f, 0.28f, 0.62f, 0.62f);
        pathBuilder.verticalLineToRelative(4.59f);
        pathBuilder.close();
        pathBuilder.moveTo(13.5f, 9.64f);
        pathBuilder.curveToRelative(0.0f, 0.35f, -0.28f, 0.62f, -0.62f, 0.62f);
        pathBuilder.lineTo(11.0f, 10.26f);
        pathBuilder.verticalLineToRelative(1.12f);
        pathBuilder.horizontalLineToRelative(1.88f);
        pathBuilder.curveToRelative(0.35f, 0.0f, 0.62f, 0.28f, 0.62f, 0.62f);
        pathBuilder.verticalLineToRelative(0.01f);
        pathBuilder.curveToRelative(0.0f, 0.35f, -0.28f, 0.62f, -0.62f, 0.62f);
        pathBuilder.lineTo(11.0f, 12.63f);
        pathBuilder.verticalLineToRelative(1.11f);
        pathBuilder.horizontalLineToRelative(1.88f);
        pathBuilder.curveToRelative(0.35f, 0.0f, 0.62f, 0.28f, 0.62f, 0.62f);
        pathBuilder.curveToRelative(0.0f, 0.35f, -0.28f, 0.62f, -0.62f, 0.62f);
        pathBuilder.horizontalLineToRelative(-2.53f);
        pathBuilder.curveToRelative(-0.47f, 0.0f, -0.85f, -0.38f, -0.85f, -0.85f);
        pathBuilder.verticalLineToRelative(-4.3f);
        pathBuilder.curveToRelative(0.0f, -0.45f, 0.38f, -0.83f, 0.85f, -0.83f);
        pathBuilder.horizontalLineToRelative(2.53f);
        pathBuilder.curveToRelative(0.35f, 0.0f, 0.62f, 0.28f, 0.62f, 0.62f);
        pathBuilder.verticalLineToRelative(0.02f);
        pathBuilder.close();
        pathBuilder.moveTo(20.5f, 14.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.lineTo(14.5f, 9.62f);
        pathBuilder.curveToRelative(0.0f, -0.34f, 0.28f, -0.62f, 0.62f, -0.62f);
        pathBuilder.reflectiveCurveToRelative(0.62f, 0.28f, 0.62f, 0.62f);
        pathBuilder.verticalLineToRelative(3.89f);
        pathBuilder.horizontalLineToRelative(1.13f);
        pathBuilder.verticalLineToRelative(-2.9f);
        pathBuilder.curveToRelative(0.0f, -0.35f, 0.28f, -0.62f, 0.62f, -0.62f);
        pathBuilder.reflectiveCurveToRelative(0.62f, 0.28f, 0.62f, 0.62f);
        pathBuilder.verticalLineToRelative(2.89f);
        pathBuilder.horizontalLineToRelative(1.12f);
        pathBuilder.lineTo(19.23f, 9.62f);
        pathBuilder.curveToRelative(0.0f, -0.35f, 0.28f, -0.62f, 0.62f, -0.62f);
        pathBuilder.reflectiveCurveToRelative(0.62f, 0.28f, 0.62f, 0.62f);
        pathBuilder.lineTo(20.47f, 14.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fiberNew = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
