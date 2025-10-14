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

/* compiled from: ViewInAr.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_viewInAr", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ViewInAr", "Landroidx/compose/material/icons/Icons$Outlined;", "getViewInAr", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nViewInAr.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInAr.kt\nandroidx/compose/material/icons/outlined/ViewInArKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,119:1\n212#2,12:120\n233#2,18:133\n253#2:170\n233#2,18:171\n253#2:208\n233#2,18:209\n253#2:246\n233#2,18:247\n253#2:284\n233#2,18:285\n253#2:322\n174#3:132\n705#4,2:151\n717#4,2:153\n719#4,11:159\n705#4,2:189\n717#4,2:191\n719#4,11:197\n705#4,2:227\n717#4,2:229\n719#4,11:235\n705#4,2:265\n717#4,2:267\n719#4,11:273\n705#4,2:303\n717#4,2:305\n719#4,11:311\n72#5,4:155\n72#5,4:193\n72#5,4:231\n72#5,4:269\n72#5,4:307\n*S KotlinDebug\n*F\n+ 1 ViewInAr.kt\nandroidx/compose/material/icons/outlined/ViewInArKt\n*L\n29#1:120,12\n30#1:133,18\n30#1:170\n42#1:171,18\n42#1:208\n54#1:209,18\n54#1:246\n66#1:247,18\n66#1:284\n78#1:285,18\n78#1:322\n29#1:132\n30#1:151,2\n30#1:153,2\n30#1:159,11\n42#1:189,2\n42#1:191,2\n42#1:197,11\n54#1:227,2\n54#1:229,2\n54#1:235,11\n66#1:265,2\n66#1:267,2\n66#1:273,11\n78#1:303,2\n78#1:305,2\n78#1:311,11\n30#1:155,4\n42#1:193,4\n54#1:231,4\n66#1:269,4\n78#1:307,4\n*E\n"})
/* loaded from: classes3.dex */
public final class ViewInArKt {

    @Nullable
    private static ImageVector _viewInAr;

    @NotNull
    public static final ImageVector getViewInAr(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _viewInAr;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ViewInAr", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(1.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveTo(2.34f, 1.0f, 1.0f, 2.34f, 1.0f, 4.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(3.0f, 20.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.horizontalLineTo(1.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.curveTo(3.45f, 21.0f, 3.0f, 20.55f, 3.0f, 20.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(20.0f, 1.0f);
        pathBuilder3.horizontalLineToRelative(-2.0f);
        pathBuilder3.verticalLineToRelative(2.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder3.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder3.verticalLineToRelative(2.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder3.verticalLineTo(4.0f);
        pathBuilder3.curveTo(23.0f, 2.34f, 21.66f, 1.0f, 20.0f, 1.0f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(21.0f, 20.0f);
        pathBuilder4.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder4.horizontalLineToRelative(-2.0f);
        pathBuilder4.verticalLineToRelative(2.0f);
        pathBuilder4.horizontalLineToRelative(2.0f);
        pathBuilder4.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder4.verticalLineToRelative(-2.0f);
        pathBuilder4.horizontalLineToRelative(-2.0f);
        pathBuilder4.verticalLineTo(20.0f);
        pathBuilder4.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(19.0f, 14.87f);
        pathBuilder5.verticalLineTo(9.13f);
        pathBuilder5.curveToRelative(0.0f, -0.72f, -0.38f, -1.38f, -1.0f, -1.73f);
        pathBuilder5.lineToRelative(-5.0f, -2.88f);
        pathBuilder5.curveToRelative(-0.31f, -0.18f, -0.65f, -0.27f, -1.0f, -0.27f);
        pathBuilder5.reflectiveCurveToRelative(-0.69f, 0.09f, -1.0f, 0.27f);
        pathBuilder5.lineTo(6.0f, 7.39f);
        pathBuilder5.curveTo(5.38f, 7.75f, 5.0f, 8.41f, 5.0f, 9.13f);
        pathBuilder5.verticalLineToRelative(5.74f);
        pathBuilder5.curveToRelative(0.0f, 0.72f, 0.38f, 1.38f, 1.0f, 1.73f);
        pathBuilder5.lineToRelative(5.0f, 2.88f);
        pathBuilder5.curveToRelative(0.31f, 0.18f, 0.65f, 0.27f, 1.0f, 0.27f);
        pathBuilder5.reflectiveCurveToRelative(0.69f, -0.09f, 1.0f, -0.27f);
        pathBuilder5.lineToRelative(5.0f, -2.88f);
        pathBuilder5.curveTo(18.62f, 16.25f, 19.0f, 15.59f, 19.0f, 14.87f);
        pathBuilder5.close();
        pathBuilder5.moveTo(11.0f, 17.17f);
        pathBuilder5.lineToRelative(-4.0f, -2.3f);
        pathBuilder5.verticalLineToRelative(-4.63f);
        pathBuilder5.lineToRelative(4.0f, 2.33f);
        pathBuilder5.verticalLineTo(17.17f);
        pathBuilder5.close();
        pathBuilder5.moveTo(12.0f, 10.84f);
        pathBuilder5.lineTo(8.04f, 8.53f);
        pathBuilder5.lineTo(12.0f, 6.25f);
        pathBuilder5.lineToRelative(3.96f, 2.28f);
        pathBuilder5.lineTo(12.0f, 10.84f);
        pathBuilder5.close();
        pathBuilder5.moveTo(17.0f, 14.87f);
        pathBuilder5.lineToRelative(-4.0f, 2.3f);
        pathBuilder5.verticalLineToRelative(-4.6f);
        pathBuilder5.lineToRelative(4.0f, -2.33f);
        pathBuilder5.verticalLineTo(14.87f);
        pathBuilder5.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw5, iM11702getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _viewInAr = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
