package androidx.compose.material.icons.twotone;

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

/* compiled from: Paragliding.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_paragliding", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Paragliding", "Landroidx/compose/material/icons/Icons$TwoTone;", "getParagliding", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nParagliding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Paragliding.kt\nandroidx/compose/material/icons/twotone/ParaglidingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,104:1\n212#2,12:105\n233#2,18:118\n253#2:155\n233#2,18:156\n253#2:193\n174#3:117\n705#4,2:136\n717#4,2:138\n719#4,11:144\n705#4,2:174\n717#4,2:176\n719#4,11:182\n72#5,4:140\n72#5,4:178\n*S KotlinDebug\n*F\n+ 1 Paragliding.kt\nandroidx/compose/material/icons/twotone/ParaglidingKt\n*L\n29#1:105,12\n30#1:118,18\n30#1:155\n40#1:156,18\n40#1:193\n29#1:117\n30#1:136,2\n30#1:138,2\n30#1:144,11\n40#1:174,2\n40#1:176,2\n40#1:182,11\n30#1:140,4\n40#1:178,4\n*E\n"})
/* loaded from: classes.dex */
public final class ParaglidingKt {

    @Nullable
    private static ImageVector _paragliding;

    @NotNull
    public static final ImageVector getParagliding(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _paragliding;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Paragliding", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 4.31f);
        pathBuilder.curveTo(20.65f, 3.63f, 17.57f, 2.0f, 12.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(3.35f, 3.63f, 3.0f, 4.31f);
        pathBuilder.verticalLineToRelative(1.77f);
        pathBuilder.curveTo(5.34f, 5.07f, 8.56f, 4.5f, 12.0f, 4.5f);
        pathBuilder.reflectiveCurveToRelative(6.66f, 0.57f, 9.0f, 1.58f);
        pathBuilder.verticalLineTo(4.31f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 17.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder2.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder2.curveTo(14.0f, 16.1f, 13.1f, 17.0f, 12.0f, 17.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.48f, 17.94f);
        pathBuilder2.curveTo(14.68f, 18.54f, 14.0f, 19.0f, 12.0f, 19.0f);
        pathBuilder2.reflectiveCurveToRelative(-2.68f, -0.46f, -3.48f, -1.06f);
        pathBuilder2.curveTo(8.04f, 17.55f, 7.0f, 16.76f, 7.0f, 14.0f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.curveToRelative(0.0f, 2.7f, 0.93f, 4.41f, 2.3f, 5.5f);
        pathBuilder2.curveToRelative(0.5f, 0.4f, 1.1f, 0.7f, 1.7f, 0.9f);
        pathBuilder2.verticalLineTo(24.0f);
        pathBuilder2.horizontalLineToRelative(6.0f);
        pathBuilder2.verticalLineToRelative(-3.6f);
        pathBuilder2.curveToRelative(0.6f, -0.2f, 1.2f, -0.5f, 1.7f, -0.9f);
        pathBuilder2.curveToRelative(1.37f, -1.09f, 2.3f, -2.8f, 2.3f, -5.5f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.curveTo(17.0f, 16.76f, 15.96f, 17.55f, 15.48f, 17.94f);
        pathBuilder2.close();
        pathBuilder2.moveTo(23.0f, 4.25f);
        pathBuilder2.verticalLineToRelative(3.49f);
        pathBuilder2.curveToRelative(0.0f, 0.8f, -0.88f, 1.26f, -1.56f, 0.83f);
        pathBuilder2.curveTo(21.3f, 8.48f, 21.16f, 8.39f, 21.0f, 8.31f);
        pathBuilder2.lineTo(19.0f, 13.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.lineToRelative(-1.5f, -6.28f);
        pathBuilder2.curveTo(14.4f, 6.58f, 13.22f, 6.5f, 12.0f, 6.5f);
        pathBuilder2.reflectiveCurveTo(9.6f, 6.58f, 8.5f, 6.72f);
        pathBuilder2.lineTo(7.0f, 13.0f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.lineTo(3.0f, 8.31f);
        pathBuilder2.curveTo(2.84f, 8.39f, 2.7f, 8.48f, 2.56f, 8.57f);
        pathBuilder2.curveTo(1.88f, 9.0f, 1.0f, 8.55f, 1.0f, 7.74f);
        pathBuilder2.verticalLineTo(4.25f);
        pathBuilder2.curveTo(1.0f, 1.9f, 5.92f, 0.0f, 12.0f, 0.0f);
        pathBuilder2.reflectiveCurveTo(23.0f, 1.9f, 23.0f, 4.25f);
        pathBuilder2.close();
        pathBuilder2.moveTo(6.9f, 6.98f);
        pathBuilder2.curveTo(5.97f, 7.17f, 5.12f, 7.41f, 4.37f, 7.69f);
        pathBuilder2.lineToRelative(1.51f, 3.55f);
        pathBuilder2.lineTo(6.9f, 6.98f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.63f, 7.69f);
        pathBuilder2.curveToRelative(-0.75f, -0.28f, -1.6f, -0.52f, -2.53f, -0.71f);
        pathBuilder2.lineToRelative(1.02f, 4.25f);
        pathBuilder2.lineTo(19.63f, 7.69f);
        pathBuilder2.close();
        pathBuilder2.moveTo(21.0f, 4.31f);
        pathBuilder2.curveTo(20.65f, 3.63f, 17.57f, 2.0f, 12.0f, 2.0f);
        pathBuilder2.reflectiveCurveTo(3.35f, 3.63f, 3.0f, 4.31f);
        pathBuilder2.verticalLineToRelative(1.77f);
        pathBuilder2.curveTo(5.34f, 5.07f, 8.56f, 4.5f, 12.0f, 4.5f);
        pathBuilder2.reflectiveCurveToRelative(6.66f, 0.57f, 9.0f, 1.58f);
        pathBuilder2.verticalLineTo(4.31f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _paragliding = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
