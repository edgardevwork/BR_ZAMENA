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

/* compiled from: Toys.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_toys", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Toys", "Landroidx/compose/material/icons/Icons$TwoTone;", "getToys", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nToys.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toys.kt\nandroidx/compose/material/icons/twotone/ToysKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,115:1\n212#2,12:116\n233#2,18:129\n253#2:166\n233#2,18:167\n253#2:204\n174#3:128\n705#4,2:147\n717#4,2:149\n719#4,11:155\n705#4,2:185\n717#4,2:187\n719#4,11:193\n72#5,4:151\n72#5,4:189\n*S KotlinDebug\n*F\n+ 1 Toys.kt\nandroidx/compose/material/icons/twotone/ToysKt\n*L\n29#1:116,12\n30#1:129,18\n30#1:166\n44#1:167,18\n44#1:204\n29#1:128\n30#1:147,2\n30#1:149,2\n30#1:155,11\n44#1:185,2\n44#1:187,2\n44#1:193,11\n30#1:151,4\n44#1:189,4\n*E\n"})
/* loaded from: classes2.dex */
public final class ToysKt {

    @Nullable
    private static ImageVector _toys;

    @NotNull
    public static final ImageVector getToys(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _toys;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Toys", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 12.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.curveToRelative(0.0f, 0.51f, 0.2f, 0.97f, 0.51f, 1.32f);
        pathBuilder.curveTo(5.05f, 14.53f, 5.97f, 14.0f, 7.0f, 14.0f);
        pathBuilder.curveToRelative(1.3f, 0.0f, 2.4f, 0.84f, 2.82f, 2.0f);
        pathBuilder.horizontalLineToRelative(4.37f);
        pathBuilder.curveToRelative(0.41f, -1.16f, 1.51f, -2.0f, 2.82f, -2.0f);
        pathBuilder.curveToRelative(1.03f, 0.0f, 1.95f, 0.53f, 2.49f, 1.32f);
        pathBuilder.curveTo(19.8f, 14.97f, 20.0f, 14.51f, 20.0f, 14.0f);
        pathBuilder.curveTo(20.0f, 12.9f, 19.1f, 12.0f, 18.0f, 12.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(18.75f, 10.08f);
        pathBuilder2.lineTo(17.4f, 6.05f);
        pathBuilder2.curveTo(17.0f, 4.82f, 15.85f, 4.0f, 14.56f, 4.0f);
        pathBuilder2.horizontalLineTo(9.44f);
        pathBuilder2.curveTo(8.15f, 4.0f, 7.0f, 4.82f, 6.6f, 6.05f);
        pathBuilder2.lineTo(5.81f, 8.4f);
        pathBuilder2.lineTo(4.41f, 7.0f);
        pathBuilder2.lineToRelative(0.29f, -0.29f);
        pathBuilder2.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder2.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder2.lineToRelative(-2.0f, 2.0f);
        pathBuilder2.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder2.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder2.lineTo(3.0f, 8.41f);
        pathBuilder2.lineToRelative(1.79f, 1.79f);
        pathBuilder2.curveTo(3.18f, 10.72f, 2.0f, 12.22f, 2.0f, 14.0f);
        pathBuilder2.curveToRelative(0.0f, 1.49f, 0.83f, 2.78f, 2.05f, 3.47f);
        pathBuilder2.curveTo(4.27f, 18.9f, 5.51f, 20.0f, 7.0f, 20.0f);
        pathBuilder2.curveToRelative(1.3f, 0.0f, 2.4f, -0.84f, 2.82f, -2.0f);
        pathBuilder2.horizontalLineToRelative(4.37f);
        pathBuilder2.curveToRelative(0.41f, 1.16f, 1.51f, 2.0f, 2.82f, 2.0f);
        pathBuilder2.curveToRelative(1.49f, 0.0f, 2.73f, -1.1f, 2.95f, -2.53f);
        pathBuilder2.curveTo(21.17f, 16.78f, 22.0f, 15.49f, 22.0f, 14.0f);
        pathBuilder2.curveTo(22.0f, 12.05f, 20.6f, 10.43f, 18.75f, 10.08f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.0f, 6.0f);
        pathBuilder2.horizontalLineToRelative(1.56f);
        pathBuilder2.curveToRelative(0.43f, 0.0f, 0.81f, 0.27f, 0.95f, 0.68f);
        pathBuilder2.lineTo(16.61f, 10.0f);
        pathBuilder2.horizontalLineTo(13.0f);
        pathBuilder2.verticalLineTo(6.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(8.49f, 6.68f);
        pathBuilder2.curveTo(8.63f, 6.27f, 9.01f, 6.0f, 9.44f, 6.0f);
        pathBuilder2.horizontalLineTo(11.0f);
        pathBuilder2.verticalLineToRelative(4.0f);
        pathBuilder2.horizontalLineTo(7.41f);
        pathBuilder2.lineTo(7.39f, 9.98f);
        pathBuilder2.lineTo(8.49f, 6.68f);
        pathBuilder2.close();
        pathBuilder2.moveTo(7.0f, 18.0f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder2.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder2.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder2.reflectiveCurveTo(7.55f, 18.0f, 7.0f, 18.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.0f, 18.0f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder2.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder2.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder2.reflectiveCurveTo(17.55f, 18.0f, 17.0f, 18.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.49f, 15.32f);
        pathBuilder2.curveTo(18.95f, 14.53f, 18.03f, 14.0f, 17.0f, 14.0f);
        pathBuilder2.curveToRelative(-1.3f, 0.0f, -2.4f, 0.84f, -2.82f, 2.0f);
        pathBuilder2.horizontalLineTo(9.82f);
        pathBuilder2.curveTo(9.4f, 14.84f, 8.3f, 14.0f, 7.0f, 14.0f);
        pathBuilder2.curveToRelative(-1.03f, 0.0f, -1.95f, 0.53f, -2.49f, 1.32f);
        pathBuilder2.curveTo(4.2f, 14.97f, 4.0f, 14.51f, 4.0f, 14.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder2.horizontalLineToRelative(12.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder2.curveTo(20.0f, 14.51f, 19.8f, 14.97f, 19.49f, 15.32f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _toys = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
