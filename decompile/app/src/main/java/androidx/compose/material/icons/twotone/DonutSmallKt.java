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

/* compiled from: DonutSmall.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_donutSmall", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DonutSmall", "Landroidx/compose/material/icons/Icons$TwoTone;", "getDonutSmall", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDonutSmall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DonutSmall.kt\nandroidx/compose/material/icons/twotone/DonutSmallKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,99:1\n212#2,12:100\n233#2,18:113\n253#2:150\n233#2,18:151\n253#2:188\n174#3:112\n705#4,2:131\n717#4,2:133\n719#4,11:139\n705#4,2:169\n717#4,2:171\n719#4,11:177\n72#5,4:135\n72#5,4:173\n*S KotlinDebug\n*F\n+ 1 DonutSmall.kt\nandroidx/compose/material/icons/twotone/DonutSmallKt\n*L\n29#1:100,12\n30#1:113,18\n30#1:150\n52#1:151,18\n52#1:188\n29#1:112\n30#1:131,2\n30#1:133,2\n30#1:139,11\n52#1:169,2\n52#1:171,2\n52#1:177,11\n30#1:135,4\n52#1:173,4\n*E\n"})
/* loaded from: classes.dex */
public final class DonutSmallKt {

    @Nullable
    private static ImageVector _donutSmall;

    @NotNull
    public static final ImageVector getDonutSmall(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _donutSmall;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.DonutSmall", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.99f, 9.0f);
        pathBuilder.horizontalLineToRelative(3.43f);
        pathBuilder.curveTo(18.6f, 7.0f, 17.0f, 5.4f, 15.0f, 4.58f);
        pathBuilder.verticalLineToRelative(3.43f);
        pathBuilder.curveToRelative(0.37f, 0.28f, 0.71f, 0.62f, 0.99f, 0.99f);
        pathBuilder.close();
        pathBuilder.moveTo(4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 3.35f, 2.04f, 6.24f, 5.0f, 7.42f);
        pathBuilder.verticalLineToRelative(-3.44f);
        pathBuilder.curveToRelative(-1.23f, -0.93f, -2.0f, -2.4f, -2.0f, -3.99f);
        pathBuilder.curveTo(7.0f, 10.4f, 7.77f, 8.93f, 9.0f, 8.0f);
        pathBuilder.lineTo(9.0f, 4.58f);
        pathBuilder.curveTo(6.04f, 5.76f, 4.0f, 8.65f, 4.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 15.99f);
        pathBuilder.verticalLineToRelative(3.43f);
        pathBuilder.curveToRelative(2.0f, -0.82f, 3.6f, -2.42f, 4.42f, -4.42f);
        pathBuilder.horizontalLineToRelative(-3.43f);
        pathBuilder.curveToRelative(-0.28f, 0.37f, -0.62f, 0.71f, -0.99f, 0.99f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(14.82f, 11.0f);
        pathBuilder2.horizontalLineToRelative(7.13f);
        pathBuilder2.curveToRelative(-0.47f, -4.72f, -4.23f, -8.48f, -8.95f, -8.95f);
        pathBuilder2.verticalLineToRelative(7.13f);
        pathBuilder2.curveToRelative(0.85f, 0.31f, 1.51f, 0.97f, 1.82f, 1.82f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.0f, 4.58f);
        pathBuilder2.curveTo(17.0f, 5.4f, 18.6f, 7.0f, 19.42f, 9.0f);
        pathBuilder2.horizontalLineToRelative(-3.43f);
        pathBuilder2.curveToRelative(-0.28f, -0.37f, -0.62f, -0.71f, -0.99f, -0.99f);
        pathBuilder2.lineTo(15.0f, 4.58f);
        pathBuilder2.close();
        pathBuilder2.moveTo(2.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, 5.19f, 3.95f, 9.45f, 9.0f, 9.95f);
        pathBuilder2.verticalLineToRelative(-7.13f);
        pathBuilder2.curveTo(9.84f, 14.4f, 9.0f, 13.3f, 9.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, -1.3f, 0.84f, -2.4f, 2.0f, -2.82f);
        pathBuilder2.lineTo(11.0f, 2.05f);
        pathBuilder2.curveToRelative(-5.05f, 0.5f, -9.0f, 4.76f, -9.0f, 9.95f);
        pathBuilder2.close();
        pathBuilder2.moveTo(9.0f, 4.58f);
        pathBuilder2.verticalLineToRelative(3.44f);
        pathBuilder2.curveToRelative(-1.23f, 0.92f, -2.0f, 2.39f, -2.0f, 3.98f);
        pathBuilder2.curveToRelative(0.0f, 1.59f, 0.77f, 3.06f, 2.0f, 3.99f);
        pathBuilder2.verticalLineToRelative(3.44f);
        pathBuilder2.curveTo(6.04f, 18.24f, 4.0f, 15.35f, 4.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, -3.35f, 2.04f, -6.24f, 5.0f, -7.42f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.0f, 14.82f);
        pathBuilder2.verticalLineToRelative(7.13f);
        pathBuilder2.curveToRelative(4.72f, -0.47f, 8.48f, -4.23f, 8.95f, -8.95f);
        pathBuilder2.horizontalLineToRelative(-7.13f);
        pathBuilder2.curveToRelative(-0.31f, 0.85f, -0.97f, 1.51f, -1.82f, 1.82f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.0f, 15.99f);
        pathBuilder2.curveToRelative(0.37f, -0.28f, 0.71f, -0.61f, 0.99f, -0.99f);
        pathBuilder2.horizontalLineToRelative(3.43f);
        pathBuilder2.curveTo(18.6f, 17.0f, 17.0f, 18.6f, 15.0f, 19.42f);
        pathBuilder2.verticalLineToRelative(-3.43f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _donutSmall = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
