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

/* compiled from: Dining.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_dining", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Dining", "Landroidx/compose/material/icons/Icons$TwoTone;", "getDining", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDining.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dining.kt\nandroidx/compose/material/icons/twotone/DiningKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,129:1\n212#2,12:130\n233#2,18:143\n253#2:180\n233#2,18:181\n253#2:218\n233#2,18:219\n253#2:256\n233#2,18:257\n253#2:294\n174#3:142\n705#4,2:161\n717#4,2:163\n719#4,11:169\n705#4,2:199\n717#4,2:201\n719#4,11:207\n705#4,2:237\n717#4,2:239\n719#4,11:245\n705#4,2:275\n717#4,2:277\n719#4,11:283\n72#5,4:165\n72#5,4:203\n72#5,4:241\n72#5,4:279\n*S KotlinDebug\n*F\n+ 1 Dining.kt\nandroidx/compose/material/icons/twotone/DiningKt\n*L\n29#1:130,12\n30#1:143,18\n30#1:180\n70#1:181,18\n70#1:218\n88#1:219,18\n88#1:256\n111#1:257,18\n111#1:294\n29#1:142\n30#1:161,2\n30#1:163,2\n30#1:169,11\n70#1:199,2\n70#1:201,2\n70#1:207,11\n88#1:237,2\n88#1:239,2\n88#1:245,11\n111#1:275,2\n111#1:277,2\n111#1:283,11\n30#1:165,4\n70#1:203,4\n88#1:241,4\n111#1:279,4\n*E\n"})
/* loaded from: classes.dex */
public final class DiningKt {

    @Nullable
    private static ImageVector _dining;

    @NotNull
    public static final ImageVector getDining(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _dining;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Dining", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.75f, 6.0f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.5f, 1.53f, 2.5f, 3.41f);
        pathBuilder.curveToRelative(0.0f, 1.48f, -0.7f, 2.71f, -1.67f, 3.18f);
        pathBuilder.lineToRelative(-0.08f, 0.03f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineTo(14.0f);
        pathBuilder.verticalLineToRelative(-6.38f);
        pathBuilder.lineToRelative(-0.08f, -0.04f);
        pathBuilder.curveToRelative(-0.97f, -0.47f, -1.67f, -1.7f, -1.67f, -3.18f);
        pathBuilder.curveTo(12.25f, 7.52f, 13.38f, 6.0f, 14.75f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.5f, 6.5f);
        pathBuilder.curveTo(6.5f, 6.22f, 6.72f, 6.0f, 7.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.horizontalLineToRelative(0.75f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.horizontalLineTo(10.0f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.curveTo(10.0f, 6.22f, 10.23f, 6.0f, 10.5f, 6.0f);
        pathBuilder.curveTo(10.78f, 6.0f, 11.0f, 6.22f, 11.0f, 6.5f);
        pathBuilder.verticalLineToRelative(3.8f);
        pathBuilder.curveToRelative(0.0f, 0.93f, -0.64f, 1.71f, -1.5f, 1.93f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineToRelative(-6.77f);
        pathBuilder.curveToRelative(-0.86f, -0.22f, -1.5f, -1.0f, -1.5f, -1.93f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.0f, 2.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        pathBuilder2.verticalLineToRelative(16.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.verticalLineTo(4.0f);
        pathBuilder2.curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.0f, 20.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.verticalLineTo(4.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.verticalLineTo(20.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(8.0f, 12.23f);
        pathBuilder3.verticalLineTo(19.0f);
        pathBuilder3.horizontalLineToRelative(1.5f);
        pathBuilder3.verticalLineToRelative(-6.77f);
        pathBuilder3.curveToRelative(0.86f, -0.22f, 1.5f, -1.0f, 1.5f, -1.93f);
        pathBuilder3.verticalLineTo(6.5f);
        pathBuilder3.curveTo(11.0f, 6.22f, 10.78f, 6.0f, 10.5f, 6.0f);
        pathBuilder3.curveTo(10.23f, 6.0f, 10.0f, 6.22f, 10.0f, 6.5f);
        pathBuilder3.verticalLineTo(9.0f);
        pathBuilder3.horizontalLineTo(9.25f);
        pathBuilder3.verticalLineTo(6.5f);
        pathBuilder3.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilder3.reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilder3.verticalLineTo(9.0f);
        pathBuilder3.horizontalLineTo(7.5f);
        pathBuilder3.verticalLineTo(6.5f);
        pathBuilder3.curveTo(7.5f, 6.22f, 7.28f, 6.0f, 7.0f, 6.0f);
        pathBuilder3.reflectiveCurveTo(6.5f, 6.22f, 6.5f, 6.5f);
        pathBuilder3.verticalLineToRelative(3.8f);
        pathBuilder3.curveTo(6.5f, 11.23f, 7.14f, 12.01f, 8.0f, 12.23f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(13.92f, 12.58f);
        pathBuilder4.lineTo(14.0f, 12.62f);
        pathBuilder4.verticalLineTo(19.0f);
        pathBuilder4.horizontalLineToRelative(1.5f);
        pathBuilder4.verticalLineToRelative(-6.38f);
        pathBuilder4.lineToRelative(0.08f, -0.03f);
        pathBuilder4.curveToRelative(0.97f, -0.47f, 1.67f, -1.7f, 1.67f, -3.18f);
        pathBuilder4.curveToRelative(0.0f, -1.88f, -1.12f, -3.41f, -2.5f, -3.41f);
        pathBuilder4.curveToRelative(-1.37f, 0.0f, -2.5f, 1.52f, -2.5f, 3.4f);
        pathBuilder4.curveTo(12.25f, 10.88f, 12.95f, 12.11f, 13.92f, 12.58f);
        pathBuilder4.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dining = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
