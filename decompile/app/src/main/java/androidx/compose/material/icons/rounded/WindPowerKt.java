package androidx.compose.material.icons.rounded;

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

/* compiled from: WindPower.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_windPower", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WindPower", "Landroidx/compose/material/icons/Icons$Rounded;", "getWindPower", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nWindPower.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindPower.kt\nandroidx/compose/material/icons/rounded/WindPowerKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,121:1\n212#2,12:122\n233#2,18:135\n253#2:172\n233#2,18:173\n253#2:210\n233#2,18:211\n253#2:248\n233#2,18:249\n253#2:286\n233#2,18:287\n253#2:324\n233#2,18:325\n253#2:362\n233#2,18:363\n253#2:400\n174#3:134\n705#4,2:153\n717#4,2:155\n719#4,11:161\n705#4,2:191\n717#4,2:193\n719#4,11:199\n705#4,2:229\n717#4,2:231\n719#4,11:237\n705#4,2:267\n717#4,2:269\n719#4,11:275\n705#4,2:305\n717#4,2:307\n719#4,11:313\n705#4,2:343\n717#4,2:345\n719#4,11:351\n705#4,2:381\n717#4,2:383\n719#4,11:389\n72#5,4:157\n72#5,4:195\n72#5,4:233\n72#5,4:271\n72#5,4:309\n72#5,4:347\n72#5,4:385\n*S KotlinDebug\n*F\n+ 1 WindPower.kt\nandroidx/compose/material/icons/rounded/WindPowerKt\n*L\n29#1:122,12\n30#1:135,18\n30#1:172\n42#1:173,18\n42#1:210\n54#1:211,18\n54#1:248\n66#1:249,18\n66#1:286\n78#1:287,18\n78#1:324\n90#1:325,18\n90#1:362\n108#1:363,18\n108#1:400\n29#1:134\n30#1:153,2\n30#1:155,2\n30#1:161,11\n42#1:191,2\n42#1:193,2\n42#1:199,11\n54#1:229,2\n54#1:231,2\n54#1:237,11\n66#1:267,2\n66#1:269,2\n66#1:275,11\n78#1:305,2\n78#1:307,2\n78#1:313,11\n90#1:343,2\n90#1:345,2\n90#1:351,11\n108#1:381,2\n108#1:383,2\n108#1:389,11\n30#1:157,4\n42#1:195,4\n54#1:233,4\n66#1:271,4\n78#1:309,4\n90#1:347,4\n108#1:385,4\n*E\n"})
/* loaded from: classes3.dex */
public final class WindPowerKt {

    @Nullable
    private static ImageVector _windPower;

    @NotNull
    public static final ImageVector getWindPower(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _windPower;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WindPower", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 3.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveTo(4.45f, 3.0f, 4.0f, 3.45f, 4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveTo(10.0f, 3.45f, 9.55f, 3.0f, 9.0f, 3.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(5.0f, 7.0f);
        pathBuilder2.horizontalLineTo(2.0f);
        pathBuilder2.curveTo(1.45f, 7.0f, 1.0f, 7.45f, 1.0f, 8.0f);
        pathBuilder2.verticalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder2.horizontalLineToRelative(3.0f);
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder2.verticalLineToRelative(0.0f);
        pathBuilder2.curveTo(6.0f, 7.45f, 5.55f, 7.0f, 5.0f, 7.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(4.0f, 21.0f);
        pathBuilder3.horizontalLineToRelative(3.0f);
        pathBuilder3.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder3.verticalLineToRelative(0.0f);
        pathBuilder3.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder3.horizontalLineTo(4.0f);
        pathBuilder3.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder3.verticalLineToRelative(0.0f);
        pathBuilder3.curveTo(3.0f, 20.55f, 3.45f, 21.0f, 4.0f, 21.0f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(13.73f, 10.61f);
        pathBuilder4.curveToRelative(0.75f, 0.23f, 1.3f, 0.78f, 1.57f, 1.46f);
        pathBuilder4.lineToRelative(4.27f, -7.11f);
        pathBuilder4.curveToRelative(0.65f, -1.08f, 0.3f, -2.48f, -0.78f, -3.13f);
        pathBuilder4.curveToRelative(-0.87f, -0.52f, -1.99f, -0.41f, -2.73f, 0.29f);
        pathBuilder4.lineToRelative(-3.43f, 3.21f);
        pathBuilder4.curveTo(12.23f, 5.7f, 12.0f, 6.23f, 12.0f, 6.78f);
        pathBuilder4.verticalLineToRelative(3.93f);
        pathBuilder4.curveTo(12.36f, 10.56f, 12.98f, 10.38f, 13.73f, 10.61f);
        pathBuilder4.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(10.61f, 12.27f);
        pathBuilder5.curveToRelative(0.16f, -0.52f, 0.48f, -0.96f, 0.89f, -1.27f);
        pathBuilder5.horizontalLineTo(3.28f);
        pathBuilder5.curveTo(2.02f, 11.0f, 1.0f, 12.02f, 1.0f, 13.28f);
        pathBuilder5.curveToRelative(0.0f, 1.02f, 0.67f, 1.91f, 1.65f, 2.19f);
        pathBuilder5.lineToRelative(4.51f, 1.29f);
        pathBuilder5.curveToRelative(0.53f, 0.15f, 1.1f, 0.08f, 1.58f, -0.21f);
        pathBuilder5.lineToRelative(2.69f, -1.61f);
        pathBuilder5.curveTo(10.66f, 14.32f, 10.3f, 13.27f, 10.61f, 12.27f);
        pathBuilder5.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw5, iM11702getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType6 = VectorKt.getDefaultFillType();
        SolidColor solidColor6 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw6 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk86 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(22.21f, 18.61f);
        pathBuilder6.lineToRelative(-2.28f, -4.1f);
        pathBuilder6.curveToRelative(-0.27f, -0.48f, -0.73f, -0.83f, -1.26f, -0.97f);
        pathBuilder6.lineToRelative(-3.18f, -0.8f);
        pathBuilder6.curveToRelative(0.03f, 0.32f, 0.0f, 0.66f, -0.1f, 0.99f);
        pathBuilder6.curveToRelative(-0.32f, 1.06f, -1.28f, 1.77f, -2.39f, 1.77f);
        pathBuilder6.curveToRelative(-0.61f, 0.0f, -0.99f, -0.22f, -1.0f, -0.22f);
        pathBuilder6.verticalLineTo(21.0f);
        pathBuilder6.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder6.horizontalLineToRelative(6.0f);
        pathBuilder6.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder6.verticalLineToRelative(-4.28f);
        pathBuilder6.lineToRelative(4.61f, 4.61f);
        pathBuilder6.curveToRelative(0.89f, 0.89f, 2.33f, 0.89f, 3.22f, 0.0f);
        pathBuilder6.curveTo(22.55f, 20.61f, 22.71f, 19.5f, 22.21f, 18.61f);
        pathBuilder6.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder6.getNodes(), defaultFillType6, "", solidColor6, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw6, iM11702getBevelLxFBmk86, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType7 = VectorKt.getDefaultFillType();
        SolidColor solidColor7 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw7 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk87 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder7 = new PathBuilder();
        pathBuilder7.moveTo(12.56f, 14.43f);
        pathBuilder7.curveToRelative(0.79f, 0.24f, 1.63f, -0.2f, 1.87f, -1.0f);
        pathBuilder7.curveToRelative(0.24f, -0.79f, -0.2f, -1.63f, -1.0f, -1.87f);
        pathBuilder7.curveToRelative(-0.79f, -0.24f, -1.63f, 0.2f, -1.87f, 1.0f);
        pathBuilder7.curveTo(11.32f, 13.35f, 11.77f, 14.19f, 12.56f, 14.43f);
        pathBuilder7.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder7.getNodes(), defaultFillType7, "", solidColor7, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw7, iM11702getBevelLxFBmk87, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _windPower = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
