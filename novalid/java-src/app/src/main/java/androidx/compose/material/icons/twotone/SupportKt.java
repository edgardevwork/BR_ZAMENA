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

/* compiled from: Support.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_support", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Support", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSupport", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Support.kt\nandroidx/compose/material/icons/twotone/SupportKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,105:1\n212#2,12:106\n233#2,18:119\n253#2:156\n233#2,18:157\n253#2:194\n233#2,18:195\n253#2:232\n233#2,18:233\n253#2:270\n233#2,18:271\n253#2:308\n174#3:118\n705#4,2:137\n717#4,2:139\n719#4,11:145\n705#4,2:175\n717#4,2:177\n719#4,11:183\n705#4,2:213\n717#4,2:215\n719#4,11:221\n705#4,2:251\n717#4,2:253\n719#4,11:259\n705#4,2:289\n717#4,2:291\n719#4,11:297\n72#5,4:141\n72#5,4:179\n72#5,4:217\n72#5,4:255\n72#5,4:293\n*S KotlinDebug\n*F\n+ 1 Support.kt\nandroidx/compose/material/icons/twotone/SupportKt\n*L\n29#1:106,12\n30#1:119,18\n30#1:156\n38#1:157,18\n38#1:194\n46#1:195,18\n46#1:232\n54#1:233,18\n54#1:270\n62#1:271,18\n62#1:308\n29#1:118\n30#1:137,2\n30#1:139,2\n30#1:145,11\n38#1:175,2\n38#1:177,2\n38#1:183,11\n46#1:213,2\n46#1:215,2\n46#1:221,11\n54#1:251,2\n54#1:253,2\n54#1:259,11\n62#1:289,2\n62#1:291,2\n62#1:297,11\n30#1:141,4\n38#1:179,4\n46#1:217,4\n54#1:255,4\n62#1:293,4\n*E\n"})
/* loaded from: classes4.dex */
public final class SupportKt {

    @Nullable
    private static ImageVector _support;

    @NotNull
    public static final ImageVector getSupport(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _support;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Support", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.3f, 7.32f);
        pathBuilder.lineTo(9.13f, 4.54f);
        pathBuilder.curveTo(7.02f, 5.35f, 5.35f, 7.02f, 4.54f, 9.13f);
        pathBuilder.lineToRelative(2.78f, 1.15f);
        pathBuilder.curveTo(7.83f, 8.9f, 8.92f, 7.82f, 10.3f, 7.32f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(7.32f, 13.72f);
        pathBuilder2.lineToRelative(-2.78f, 1.15f);
        pathBuilder2.curveToRelative(0.81f, 2.1f, 2.48f, 3.78f, 4.59f, 4.59f);
        pathBuilder2.lineToRelative(1.17f, -2.78f);
        pathBuilder2.curveTo(8.91f, 16.18f, 7.83f, 15.09f, 7.32f, 13.72f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(16.67f, 10.27f);
        pathBuilder3.lineToRelative(2.78f, -1.15f);
        pathBuilder3.curveToRelative(-0.81f, -2.1f, -2.48f, -3.77f, -4.58f, -4.58f);
        pathBuilder3.lineToRelative(-1.15f, 2.78f);
        pathBuilder3.curveTo(15.09f, 7.83f, 16.17f, 8.9f, 16.67f, 10.27f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(16.68f, 13.71f);
        pathBuilder4.curveToRelative(-0.5f, 1.37f, -1.58f, 2.46f, -2.95f, 2.97f);
        pathBuilder4.lineToRelative(1.15f, 2.78f);
        pathBuilder4.curveToRelative(2.1f, -0.81f, 3.77f, -2.48f, 4.58f, -4.58f);
        pathBuilder4.lineTo(16.68f, 13.71f);
        pathBuilder4.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(12.0f, 2.0f);
        pathBuilder5.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder5.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder5.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder5.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(14.87f, 4.54f);
        pathBuilder5.curveToRelative(2.1f, 0.81f, 3.77f, 2.48f, 4.58f, 4.58f);
        pathBuilder5.lineToRelative(-2.78f, 1.15f);
        pathBuilder5.curveToRelative(-0.51f, -1.36f, -1.58f, -2.44f, -2.95f, -2.94f);
        pathBuilder5.lineTo(14.87f, 4.54f);
        pathBuilder5.close();
        pathBuilder5.moveTo(9.13f, 4.54f);
        pathBuilder5.lineToRelative(1.17f, 2.78f);
        pathBuilder5.curveToRelative(-1.38f, 0.5f, -2.47f, 1.59f, -2.98f, 2.97f);
        pathBuilder5.lineTo(4.54f, 9.13f);
        pathBuilder5.curveTo(5.35f, 7.02f, 7.02f, 5.35f, 9.13f, 4.54f);
        pathBuilder5.close();
        pathBuilder5.moveTo(9.13f, 19.46f);
        pathBuilder5.curveToRelative(-2.1f, -0.81f, -3.78f, -2.48f, -4.59f, -4.59f);
        pathBuilder5.lineToRelative(2.78f, -1.15f);
        pathBuilder5.curveToRelative(0.51f, 1.38f, 1.59f, 2.46f, 2.97f, 2.96f);
        pathBuilder5.lineTo(9.13f, 19.46f);
        pathBuilder5.close();
        pathBuilder5.moveTo(9.0f, 12.0f);
        pathBuilder5.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder5.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder5.reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f);
        pathBuilder5.reflectiveCurveTo(9.0f, 13.66f, 9.0f, 12.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(14.88f, 19.46f);
        pathBuilder5.lineToRelative(-1.15f, -2.78f);
        pathBuilder5.curveToRelative(1.37f, -0.51f, 2.45f, -1.59f, 2.95f, -2.97f);
        pathBuilder5.lineToRelative(2.78f, 1.17f);
        pathBuilder5.curveTo(18.65f, 16.98f, 16.98f, 18.65f, 14.88f, 19.46f);
        pathBuilder5.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw5, iM11702getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _support = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
