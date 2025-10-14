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

/* compiled from: FrontHand.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_frontHand", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FrontHand", "Landroidx/compose/material/icons/Icons$Outlined;", "getFrontHand", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFrontHand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrontHand.kt\nandroidx/compose/material/icons/outlined/FrontHandKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,85:1\n212#2,12:86\n233#2,18:99\n253#2:136\n174#3:98\n705#4,2:117\n717#4,2:119\n719#4,11:125\n72#5,4:121\n*S KotlinDebug\n*F\n+ 1 FrontHand.kt\nandroidx/compose/material/icons/outlined/FrontHandKt\n*L\n29#1:86,12\n30#1:99,18\n30#1:136\n29#1:98\n30#1:117,2\n30#1:119,2\n30#1:125,11\n30#1:121,4\n*E\n"})
/* loaded from: classes3.dex */
public final class FrontHandKt {

    @Nullable
    private static ImageVector _frontHand;

    @NotNull
    public static final ImageVector getFrontHand(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _frontHand;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FrontHand", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.5f, 8.0f);
        pathBuilder.curveToRelative(-0.17f, 0.0f, -0.34f, 0.02f, -0.5f, 0.05f);
        pathBuilder.verticalLineTo(4.5f);
        pathBuilder.curveTo(18.0f, 3.12f, 16.88f, 2.0f, 15.5f, 2.0f);
        pathBuilder.curveToRelative(-0.19f, 0.0f, -0.37f, 0.02f, -0.54f, 0.06f);
        pathBuilder.curveTo(14.75f, 0.89f, 13.73f, 0.0f, 12.5f, 0.0f);
        pathBuilder.curveToRelative(-1.06f, 0.0f, -1.96f, 0.66f, -2.33f, 1.59f);
        pathBuilder.curveTo(9.96f, 1.53f, 9.73f, 1.5f, 9.5f, 1.5f);
        pathBuilder.curveTo(8.12f, 1.5f, 7.0f, 2.62f, 7.0f, 4.0f);
        pathBuilder.verticalLineToRelative(0.55f);
        pathBuilder.curveTo(6.84f, 4.52f, 6.67f, 4.5f, 6.5f, 4.5f);
        pathBuilder.curveTo(5.12f, 4.5f, 4.0f, 5.62f, 4.0f, 7.0f);
        pathBuilder.verticalLineToRelative(8.5f);
        pathBuilder.curveToRelative(0.0f, 4.69f, 3.81f, 8.5f, 8.5f, 8.5f);
        pathBuilder.reflectiveCurveToRelative(8.5f, -3.81f, 8.5f, -8.5f);
        pathBuilder.verticalLineToRelative(-5.0f);
        pathBuilder.curveTo(21.0f, 9.12f, 19.88f, 8.0f, 18.5f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 15.5f);
        pathBuilder.curveToRelative(0.0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f);
        pathBuilder.reflectiveCurveTo(6.0f, 19.09f, 6.0f, 15.5f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.reflectiveCurveTo(7.0f, 6.72f, 7.0f, 7.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.reflectiveCurveTo(10.0f, 3.72f, 10.0f, 4.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(2.5f);
        pathBuilder.curveTo(12.0f, 2.22f, 12.22f, 2.0f, 12.5f, 2.0f);
        pathBuilder.reflectiveCurveTo(13.0f, 2.22f, 13.0f, 2.5f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(4.5f);
        pathBuilder.curveTo(15.0f, 4.22f, 15.22f, 4.0f, 15.5f, 4.0f);
        pathBuilder.reflectiveCurveTo(16.0f, 4.22f, 16.0f, 4.5f);
        pathBuilder.verticalLineToRelative(8.92f);
        pathBuilder.curveToRelative(-1.77f, 0.77f, -3.0f, 2.53f, -3.0f, 4.58f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder.verticalLineToRelative(-4.5f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.verticalLineTo(15.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _frontHand = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
