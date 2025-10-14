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

/* compiled from: SurroundSound.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_surroundSound", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SurroundSound", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSurroundSound", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSurroundSound.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SurroundSound.kt\nandroidx/compose/material/icons/twotone/SurroundSoundKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,117:1\n212#2,12:118\n233#2,18:131\n253#2:168\n233#2,18:169\n253#2:206\n233#2,18:207\n253#2:244\n233#2,18:245\n253#2:282\n233#2,18:283\n253#2:320\n174#3:130\n705#4,2:149\n717#4,2:151\n719#4,11:157\n705#4,2:187\n717#4,2:189\n719#4,11:195\n705#4,2:225\n717#4,2:227\n719#4,11:233\n705#4,2:263\n717#4,2:265\n719#4,11:271\n705#4,2:301\n717#4,2:303\n719#4,11:309\n72#5,4:153\n72#5,4:191\n72#5,4:229\n72#5,4:267\n72#5,4:305\n*S KotlinDebug\n*F\n+ 1 SurroundSound.kt\nandroidx/compose/material/icons/twotone/SurroundSoundKt\n*L\n29#1:118,12\n30#1:131,18\n30#1:168\n60#1:169,18\n60#1:206\n78#1:207,18\n78#1:244\n88#1:245,18\n88#1:282\n102#1:283,18\n102#1:320\n29#1:130\n30#1:149,2\n30#1:151,2\n30#1:157,11\n60#1:187,2\n60#1:189,2\n60#1:195,11\n78#1:225,2\n78#1:227,2\n78#1:233,11\n88#1:263,2\n88#1:265,2\n88#1:271,11\n102#1:301,2\n102#1:303,2\n102#1:309,11\n30#1:153,4\n60#1:191,4\n78#1:229,4\n88#1:267,4\n102#1:305,4\n*E\n"})
/* loaded from: classes4.dex */
public final class SurroundSoundKt {

    @Nullable
    private static ImageVector _surroundSound;

    @NotNull
    public static final ImageVector getSurroundSound(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _surroundSound;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SurroundSound", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.94f, 7.06f);
        pathBuilder.curveTo(18.32f, 8.41f, 19.0f, 10.21f, 19.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(-0.68f, 3.59f, -2.05f, 4.95f);
        pathBuilder.lineToRelative(-1.23f, -1.23f);
        pathBuilder.curveToRelative(1.02f, -1.03f, 1.53f, -2.37f, 1.53f, -3.72f);
        pathBuilder.curveToRelative(0.0f, -1.35f, -0.52f, -2.69f, -1.54f, -3.71f);
        pathBuilder.lineTo(16.94f, 7.06f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 8.5f);
        pathBuilder.curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f);
        pathBuilder.curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f);
        pathBuilder.curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f);
        pathBuilder.curveTo(8.5f, 10.07f, 10.07f, 8.5f, 12.0f, 8.5f);
        pathBuilder.close();
        pathBuilder.moveTo(7.05f, 7.05f);
        pathBuilder.lineToRelative(1.23f, 1.23f);
        pathBuilder.curveTo(7.27f, 9.31f, 6.75f, 10.65f, 6.75f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.35f, 0.52f, 2.69f, 1.54f, 3.71f);
        pathBuilder.lineToRelative(-1.23f, 1.23f);
        pathBuilder.curveTo(5.68f, 15.59f, 5.0f, 13.79f, 5.0f, 12.0f);
        pathBuilder.reflectiveCurveTo(5.68f, 8.41f, 7.05f, 7.05f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.0f, 4.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        pathBuilder2.verticalLineToRelative(12.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.verticalLineTo(6.0f);
        pathBuilder2.curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.0f, 18.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.verticalLineTo(6.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.verticalLineTo(18.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(8.29f, 15.71f);
        pathBuilder3.curveTo(7.27f, 14.69f, 6.75f, 13.35f, 6.75f, 12.0f);
        pathBuilder3.curveToRelative(0.0f, -1.35f, 0.52f, -2.69f, 1.53f, -3.72f);
        pathBuilder3.lineTo(7.05f, 7.05f);
        pathBuilder3.curveTo(5.68f, 8.41f, 5.0f, 10.21f, 5.0f, 12.0f);
        pathBuilder3.reflectiveCurveToRelative(0.68f, 3.59f, 2.06f, 4.94f);
        pathBuilder3.lineTo(8.29f, 15.71f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(12.0f, 15.5f);
        pathBuilder4.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder4.curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f);
        pathBuilder4.curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f);
        pathBuilder4.curveTo(8.5f, 13.93f, 10.07f, 15.5f, 12.0f, 15.5f);
        pathBuilder4.close();
        pathBuilder4.moveTo(12.0f, 10.5f);
        pathBuilder4.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder4.reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder4.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder4.reflectiveCurveTo(11.17f, 10.5f, 12.0f, 10.5f);
        pathBuilder4.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(15.72f, 15.72f);
        pathBuilder5.lineToRelative(1.23f, 1.23f);
        pathBuilder5.curveTo(18.32f, 15.59f, 19.0f, 13.79f, 19.0f, 12.0f);
        pathBuilder5.reflectiveCurveToRelative(-0.68f, -3.59f, -2.06f, -4.94f);
        pathBuilder5.lineToRelative(-1.23f, 1.23f);
        pathBuilder5.curveToRelative(1.02f, 1.02f, 1.54f, 2.36f, 1.54f, 3.71f);
        pathBuilder5.curveTo(17.25f, 13.35f, 16.73f, 14.69f, 15.72f, 15.72f);
        pathBuilder5.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw5, iM11702getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _surroundSound = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
