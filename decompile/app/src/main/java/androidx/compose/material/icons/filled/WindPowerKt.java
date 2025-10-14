package androidx.compose.material.icons.filled;

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
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_windPower", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WindPower", "Landroidx/compose/material/icons/Icons$Filled;", "getWindPower", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nWindPower.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindPower.kt\nandroidx/compose/material/icons/filled/WindPowerKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,106:1\n212#2,12:107\n233#2,18:120\n253#2:157\n233#2,18:158\n253#2:195\n233#2,18:196\n253#2:233\n233#2,18:234\n253#2:271\n233#2,18:272\n253#2:309\n233#2,18:310\n253#2:347\n233#2,18:348\n253#2:385\n174#3:119\n705#4,2:138\n717#4,2:140\n719#4,11:146\n705#4,2:176\n717#4,2:178\n719#4,11:184\n705#4,2:214\n717#4,2:216\n719#4,11:222\n705#4,2:252\n717#4,2:254\n719#4,11:260\n705#4,2:290\n717#4,2:292\n719#4,11:298\n705#4,2:328\n717#4,2:330\n719#4,11:336\n705#4,2:366\n717#4,2:368\n719#4,11:374\n72#5,4:142\n72#5,4:180\n72#5,4:218\n72#5,4:256\n72#5,4:294\n72#5,4:332\n72#5,4:370\n*S KotlinDebug\n*F\n+ 1 WindPower.kt\nandroidx/compose/material/icons/filled/WindPowerKt\n*L\n29#1:107,12\n30#1:120,18\n30#1:157\n37#1:158,18\n37#1:195\n44#1:196,18\n44#1:233\n51#1:234,18\n51#1:271\n63#1:272,18\n63#1:309\n75#1:310,18\n75#1:347\n93#1:348,18\n93#1:385\n29#1:119\n30#1:138,2\n30#1:140,2\n30#1:146,11\n37#1:176,2\n37#1:178,2\n37#1:184,11\n44#1:214,2\n44#1:216,2\n44#1:222,11\n51#1:252,2\n51#1:254,2\n51#1:260,11\n63#1:290,2\n63#1:292,2\n63#1:298,11\n75#1:328,2\n75#1:330,2\n75#1:336,11\n93#1:366,2\n93#1:368,2\n93#1:374,11\n30#1:142,4\n37#1:180,4\n44#1:218,4\n51#1:256,4\n63#1:294,4\n75#1:332,4\n93#1:370,4\n*E\n"})
/* loaded from: classes.dex */
public final class WindPowerKt {

    @Nullable
    private static ImageVector _windPower;

    @NotNull
    public static final ImageVector getWindPower(@NotNull Icons.Filled filled) {
        ImageVector imageVector = _windPower;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.WindPower", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-6.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(1.0f, 7.0f);
        pathBuilder2.horizontalLineToRelative(5.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(-5.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(3.0f, 19.0f);
        pathBuilder3.horizontalLineToRelative(5.0f);
        pathBuilder3.verticalLineToRelative(2.0f);
        pathBuilder3.horizontalLineToRelative(-5.0f);
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
