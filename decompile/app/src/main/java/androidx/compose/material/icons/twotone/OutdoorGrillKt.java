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

/* compiled from: OutdoorGrill.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_outdoorGrill", "Landroidx/compose/ui/graphics/vector/ImageVector;", "OutdoorGrill", "Landroidx/compose/material/icons/Icons$TwoTone;", "getOutdoorGrill", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nOutdoorGrill.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutdoorGrill.kt\nandroidx/compose/material/icons/twotone/OutdoorGrillKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,113:1\n212#2,12:114\n233#2,18:127\n253#2:164\n233#2,18:165\n253#2:202\n233#2,18:203\n253#2:240\n233#2,18:241\n253#2:278\n233#2,18:279\n253#2:316\n233#2,18:317\n253#2:354\n174#3:126\n705#4,2:145\n717#4,2:147\n719#4,11:153\n705#4,2:183\n717#4,2:185\n719#4,11:191\n705#4,2:221\n717#4,2:223\n719#4,11:229\n705#4,2:259\n717#4,2:261\n719#4,11:267\n705#4,2:297\n717#4,2:299\n719#4,11:305\n705#4,2:335\n717#4,2:337\n719#4,11:343\n72#5,4:149\n72#5,4:187\n72#5,4:225\n72#5,4:263\n72#5,4:301\n72#5,4:339\n*S KotlinDebug\n*F\n+ 1 OutdoorGrill.kt\nandroidx/compose/material/icons/twotone/OutdoorGrillKt\n*L\n29#1:114,12\n30#1:127,18\n30#1:164\n37#1:165,18\n37#1:202\n72#1:203,18\n72#1:240\n78#1:241,18\n78#1:278\n88#1:279,18\n88#1:316\n98#1:317,18\n98#1:354\n29#1:126\n30#1:145,2\n30#1:147,2\n30#1:153,11\n37#1:183,2\n37#1:185,2\n37#1:191,11\n72#1:221,2\n72#1:223,2\n72#1:229,11\n78#1:259,2\n78#1:261,2\n78#1:267,11\n88#1:297,2\n88#1:299,2\n88#1:305,11\n98#1:335,2\n98#1:337,2\n98#1:343,11\n30#1:149,4\n37#1:187,4\n72#1:225,4\n78#1:263,4\n88#1:301,4\n98#1:339,4\n*E\n"})
/* loaded from: classes3.dex */
public final class OutdoorGrillKt {

    @Nullable
    private static ImageVector _outdoorGrill;

    @NotNull
    public static final ImageVector getOutdoorGrill(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _outdoorGrill;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.OutdoorGrill", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.58f, 10.0f);
        pathBuilder.horizontalLineTo(7.42f);
        pathBuilder.curveToRelative(0.77f, 1.76f, 2.54f, 3.0f, 4.58f, 3.0f);
        pathBuilder.reflectiveCurveTo(15.81f, 11.76f, 16.58f, 10.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(17.0f, 22.0f);
        pathBuilder2.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder2.curveToRelative(-1.3f, 0.0f, -2.4f, 0.84f, -2.82f, 2.0f);
        pathBuilder2.horizontalLineTo(9.14f);
        pathBuilder2.lineToRelative(1.99f, -3.06f);
        pathBuilder2.curveTo(11.42f, 14.98f, 11.71f, 15.0f, 12.0f, 15.0f);
        pathBuilder2.reflectiveCurveToRelative(0.58f, -0.02f, 0.87f, -0.06f);
        pathBuilder2.lineToRelative(1.02f, 1.57f);
        pathBuilder2.curveToRelative(0.42f, -0.53f, 0.96f, -0.95f, 1.6f, -1.21f);
        pathBuilder2.lineToRelative(-0.6f, -0.93f);
        pathBuilder2.curveTo(17.31f, 13.27f, 19.0f, 10.84f, 19.0f, 8.0f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.curveToRelative(0.0f, 2.84f, 1.69f, 5.27f, 4.12f, 6.37f);
        pathBuilder2.lineToRelative(-3.95f, 6.08f);
        pathBuilder2.curveToRelative(-0.3f, 0.46f, -0.17f, 1.08f, 0.29f, 1.38f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.46f, 0.3f, 1.08f, 0.17f, 1.38f, -0.29f);
        pathBuilder2.lineToRelative(1.0f, -1.55f);
        pathBuilder2.horizontalLineToRelative(6.34f);
        pathBuilder2.curveTo(14.6f, 21.16f, 15.7f, 22.0f, 17.0f, 22.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.0f, 18.0f);
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder2.curveTo(16.0f, 18.45f, 16.45f, 18.0f, 17.0f, 18.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(7.42f, 10.0f);
        pathBuilder2.horizontalLineToRelative(9.16f);
        pathBuilder2.curveToRelative(-0.77f, 1.76f, -2.54f, 3.0f, -4.58f, 3.0f);
        pathBuilder2.reflectiveCurveTo(8.19f, 11.76f, 7.42f, 10.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(17.0f, 19.0f);
        pathBuilder3.moveToRelative(-1.0f, 0.0f);
        pathBuilder3.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilder3.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(9.41f, 7.0f);
        pathBuilder4.horizontalLineToRelative(1.0f);
        pathBuilder4.curveToRelative(0.15f, -1.15f, 0.23f, -1.64f, -0.89f, -2.96f);
        pathBuilder4.curveTo(9.1f, 3.54f, 8.84f, 3.27f, 9.06f, 2.0f);
        pathBuilder4.horizontalLineTo(8.07f);
        pathBuilder4.curveTo(7.86f, 3.11f, 8.1f, 4.05f, 8.96f, 4.96f);
        pathBuilder4.curveTo(9.18f, 5.2f, 9.75f, 5.63f, 9.41f, 7.0f);
        pathBuilder4.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(11.89f, 7.0f);
        pathBuilder5.horizontalLineToRelative(1.0f);
        pathBuilder5.curveToRelative(0.15f, -1.15f, 0.23f, -1.64f, -0.89f, -2.96f);
        pathBuilder5.curveToRelative(-0.42f, -0.5f, -0.68f, -0.78f, -0.46f, -2.04f);
        pathBuilder5.horizontalLineToRelative(-0.99f);
        pathBuilder5.curveToRelative(-0.21f, 1.11f, 0.03f, 2.05f, 0.89f, 2.96f);
        pathBuilder5.curveTo(11.67f, 5.2f, 12.24f, 5.63f, 11.89f, 7.0f);
        pathBuilder5.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw5, iM11702getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType6 = VectorKt.getDefaultFillType();
        SolidColor solidColor6 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw6 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk86 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(14.41f, 7.0f);
        pathBuilder6.horizontalLineToRelative(1.0f);
        pathBuilder6.curveToRelative(0.15f, -1.15f, 0.23f, -1.64f, -0.89f, -2.96f);
        pathBuilder6.curveTo(14.1f, 3.54f, 13.84f, 3.27f, 14.06f, 2.0f);
        pathBuilder6.horizontalLineToRelative(-0.99f);
        pathBuilder6.curveToRelative(-0.21f, 1.11f, 0.03f, 2.05f, 0.89f, 2.96f);
        pathBuilder6.curveTo(14.18f, 5.2f, 14.75f, 5.63f, 14.41f, 7.0f);
        pathBuilder6.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder6.getNodes(), defaultFillType6, "", solidColor6, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw6, iM11702getBevelLxFBmk86, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _outdoorGrill = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
