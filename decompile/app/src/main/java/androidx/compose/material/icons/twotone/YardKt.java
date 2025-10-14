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

/* compiled from: Yard.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_yard", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Yard", "Landroidx/compose/material/icons/Icons$TwoTone;", "getYard", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nYard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Yard.kt\nandroidx/compose/material/icons/twotone/YardKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,131:1\n212#2,12:132\n233#2,18:145\n253#2:182\n233#2,18:183\n253#2:220\n233#2,18:221\n253#2:258\n233#2,18:259\n253#2:296\n233#2,18:297\n253#2:334\n174#3:144\n705#4,2:163\n717#4,2:165\n719#4,11:171\n705#4,2:201\n717#4,2:203\n719#4,11:209\n705#4,2:239\n717#4,2:241\n719#4,11:247\n705#4,2:277\n717#4,2:279\n719#4,11:285\n705#4,2:315\n717#4,2:317\n719#4,11:323\n72#5,4:167\n72#5,4:205\n72#5,4:243\n72#5,4:281\n72#5,4:319\n*S KotlinDebug\n*F\n+ 1 Yard.kt\nandroidx/compose/material/icons/twotone/YardKt\n*L\n29#1:132,12\n30#1:145,18\n30#1:182\n66#1:183,18\n66#1:220\n96#1:221,18\n96#1:258\n102#1:259,18\n102#1:296\n108#1:297,18\n108#1:334\n29#1:144\n30#1:163,2\n30#1:165,2\n30#1:171,11\n66#1:201,2\n66#1:203,2\n66#1:209,11\n96#1:239,2\n96#1:241,2\n96#1:247,11\n102#1:277,2\n102#1:279,2\n102#1:285,11\n108#1:315,2\n108#1:317,2\n108#1:323,11\n30#1:167,4\n66#1:205,4\n96#1:243,4\n102#1:281,4\n108#1:319,4\n*E\n"})
/* loaded from: classes.dex */
public final class YardKt {

    @Nullable
    private static ImageVector _yard;

    @NotNull
    public static final ImageVector getYard(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _yard;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Yard", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        pathBuilder.moveTo(8.0f, 8.22f);
        pathBuilder.curveToRelative(0.0f, -0.86f, 0.7f, -1.56f, 1.56f, -1.56f);
        pathBuilder.curveToRelative(0.33f, 0.0f, 0.64f, 0.1f, 0.89f, 0.28f);
        pathBuilder.lineToRelative(-0.01f, -0.12f);
        pathBuilder.curveToRelative(0.0f, -0.86f, 0.7f, -1.56f, 1.56f, -1.56f);
        pathBuilder.reflectiveCurveToRelative(1.56f, 0.7f, 1.56f, 1.56f);
        pathBuilder.lineToRelative(-0.01f, 0.12f);
        pathBuilder.curveToRelative(0.26f, -0.18f, 0.56f, -0.28f, 0.89f, -0.28f);
        pathBuilder.curveToRelative(0.86f, 0.0f, 1.56f, 0.7f, 1.56f, 1.56f);
        pathBuilder.curveToRelative(0.0f, 0.62f, -0.37f, 1.16f, -0.89f, 1.4f);
        pathBuilder.curveTo(15.63f, 9.87f, 16.0f, 10.41f, 16.0f, 11.03f);
        pathBuilder.curveToRelative(0.0f, 0.86f, -0.7f, 1.56f, -1.56f, 1.56f);
        pathBuilder.curveToRelative(-0.33f, 0.0f, -0.64f, -0.11f, -0.89f, -0.28f);
        pathBuilder.lineToRelative(0.01f, 0.12f);
        pathBuilder.curveToRelative(0.0f, 0.86f, -0.7f, 1.56f, -1.56f, 1.56f);
        pathBuilder.reflectiveCurveToRelative(-1.56f, -0.7f, -1.56f, -1.56f);
        pathBuilder.lineToRelative(0.01f, -0.12f);
        pathBuilder.curveToRelative(-0.26f, 0.18f, -0.56f, 0.28f, -0.89f, 0.28f);
        pathBuilder.curveTo(8.7f, 12.59f, 8.0f, 11.89f, 8.0f, 11.03f);
        pathBuilder.curveToRelative(0.0f, -0.62f, 0.37f, -1.16f, 0.89f, -1.4f);
        pathBuilder.curveTo(8.37f, 9.38f, 8.0f, 8.84f, 8.0f, 8.22f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 19.0f);
        pathBuilder.curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilder.curveTo(18.0f, 16.31f, 15.31f, 19.0f, 12.0f, 19.0f);
        pathBuilder.reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilder.curveTo(9.31f, 13.0f, 12.0f, 15.69f, 12.0f, 19.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(8.0f, 11.03f);
        pathBuilder2.curveToRelative(0.0f, 0.86f, 0.7f, 1.56f, 1.56f, 1.56f);
        pathBuilder2.curveToRelative(0.33f, 0.0f, 0.63f, -0.1f, 0.89f, -0.28f);
        pathBuilder2.lineToRelative(-0.01f, 0.12f);
        pathBuilder2.curveToRelative(0.0f, 0.86f, 0.7f, 1.56f, 1.56f, 1.56f);
        pathBuilder2.reflectiveCurveToRelative(1.56f, -0.7f, 1.56f, -1.56f);
        pathBuilder2.lineToRelative(-0.01f, -0.12f);
        pathBuilder2.curveToRelative(0.25f, 0.17f, 0.56f, 0.28f, 0.89f, 0.28f);
        pathBuilder2.curveToRelative(0.86f, 0.0f, 1.56f, -0.7f, 1.56f, -1.56f);
        pathBuilder2.curveToRelative(0.0f, -0.62f, -0.37f, -1.16f, -0.89f, -1.41f);
        pathBuilder2.curveTo(15.63f, 9.38f, 16.0f, 8.84f, 16.0f, 8.22f);
        pathBuilder2.curveToRelative(0.0f, -0.86f, -0.7f, -1.56f, -1.56f, -1.56f);
        pathBuilder2.curveToRelative(-0.33f, 0.0f, -0.63f, 0.1f, -0.89f, 0.28f);
        pathBuilder2.lineToRelative(0.01f, -0.12f);
        pathBuilder2.curveToRelative(0.0f, -0.86f, -0.7f, -1.56f, -1.56f, -1.56f);
        pathBuilder2.reflectiveCurveToRelative(-1.56f, 0.7f, -1.56f, 1.56f);
        pathBuilder2.lineToRelative(0.01f, 0.12f);
        pathBuilder2.curveTo(10.2f, 6.76f, 9.89f, 6.66f, 9.56f, 6.66f);
        pathBuilder2.curveTo(8.7f, 6.66f, 8.0f, 7.36f, 8.0f, 8.22f);
        pathBuilder2.curveToRelative(0.0f, 0.62f, 0.37f, 1.16f, 0.89f, 1.41f);
        pathBuilder2.curveTo(8.37f, 9.87f, 8.0f, 10.41f, 8.0f, 11.03f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 8.06f);
        pathBuilder2.curveToRelative(0.86f, 0.0f, 1.56f, 0.7f, 1.56f, 1.56f);
        pathBuilder2.reflectiveCurveToRelative(-0.7f, 1.56f, -1.56f, 1.56f);
        pathBuilder2.reflectiveCurveToRelative(-1.56f, -0.7f, -1.56f, -1.56f);
        pathBuilder2.reflectiveCurveTo(11.14f, 8.06f, 12.0f, 8.06f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(18.0f, 13.0f);
        pathBuilder3.curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f);
        pathBuilder3.curveTo(15.31f, 19.0f, 18.0f, 16.31f, 18.0f, 13.0f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(12.0f, 19.0f);
        pathBuilder4.curveToRelative(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f);
        pathBuilder4.curveTo(6.0f, 16.31f, 8.69f, 19.0f, 12.0f, 19.0f);
        pathBuilder4.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(20.0f, 2.0f);
        pathBuilder5.horizontalLineTo(4.0f);
        pathBuilder5.curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        pathBuilder5.verticalLineToRelative(16.0f);
        pathBuilder5.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder5.horizontalLineToRelative(16.0f);
        pathBuilder5.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder5.verticalLineTo(4.0f);
        pathBuilder5.curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(20.0f, 20.0f);
        pathBuilder5.horizontalLineTo(4.0f);
        pathBuilder5.verticalLineTo(4.0f);
        pathBuilder5.horizontalLineToRelative(16.0f);
        pathBuilder5.verticalLineTo(20.0f);
        pathBuilder5.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw5, iM11702getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _yard = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
