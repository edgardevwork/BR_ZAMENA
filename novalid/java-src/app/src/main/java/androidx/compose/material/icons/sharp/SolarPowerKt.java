package androidx.compose.material.icons.sharp;

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

/* compiled from: SolarPower.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_solarPower", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SolarPower", "Landroidx/compose/material/icons/Icons$Sharp;", "getSolarPower", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSolarPower.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SolarPower.kt\nandroidx/compose/material/icons/sharp/SolarPowerKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,105:1\n212#2,12:106\n233#2,18:119\n253#2:156\n233#2,18:157\n253#2:194\n233#2,18:195\n253#2:232\n233#2,18:233\n253#2:270\n233#2,18:271\n253#2:308\n233#2,18:309\n253#2:346\n233#2,18:347\n253#2:384\n233#2,18:385\n253#2:422\n233#2,18:423\n253#2:460\n233#2,18:461\n253#2:498\n174#3:118\n705#4,2:137\n717#4,2:139\n719#4,11:145\n705#4,2:175\n717#4,2:177\n719#4,11:183\n705#4,2:213\n717#4,2:215\n719#4,11:221\n705#4,2:251\n717#4,2:253\n719#4,11:259\n705#4,2:289\n717#4,2:291\n719#4,11:297\n705#4,2:327\n717#4,2:329\n719#4,11:335\n705#4,2:365\n717#4,2:367\n719#4,11:373\n705#4,2:403\n717#4,2:405\n719#4,11:411\n705#4,2:441\n717#4,2:443\n719#4,11:449\n705#4,2:479\n717#4,2:481\n719#4,11:487\n72#5,4:141\n72#5,4:179\n72#5,4:217\n72#5,4:255\n72#5,4:293\n72#5,4:331\n72#5,4:369\n72#5,4:407\n72#5,4:445\n72#5,4:483\n*S KotlinDebug\n*F\n+ 1 SolarPower.kt\nandroidx/compose/material/icons/sharp/SolarPowerKt\n*L\n29#1:106,12\n30#1:119,18\n30#1:156\n37#1:157,18\n37#1:194\n44#1:195,18\n44#1:232\n51#1:233,18\n51#1:270\n58#1:271,18\n58#1:308\n65#1:309,18\n65#1:346\n72#1:347,18\n72#1:384\n79#1:385,18\n79#1:422\n86#1:423,18\n86#1:460\n93#1:461,18\n93#1:498\n29#1:118\n30#1:137,2\n30#1:139,2\n30#1:145,11\n37#1:175,2\n37#1:177,2\n37#1:183,11\n44#1:213,2\n44#1:215,2\n44#1:221,11\n51#1:251,2\n51#1:253,2\n51#1:259,11\n58#1:289,2\n58#1:291,2\n58#1:297,11\n65#1:327,2\n65#1:329,2\n65#1:335,11\n72#1:365,2\n72#1:367,2\n72#1:373,11\n79#1:403,2\n79#1:405,2\n79#1:411,11\n86#1:441,2\n86#1:443,2\n86#1:449,11\n93#1:479,2\n93#1:481,2\n93#1:487,11\n30#1:141,4\n37#1:179,4\n44#1:217,4\n51#1:255,4\n58#1:293,4\n65#1:331,4\n72#1:369,4\n79#1:407,4\n86#1:445,4\n93#1:483,4\n*E\n"})
/* loaded from: classes2.dex */
public final class SolarPowerKt {

    @Nullable
    private static ImageVector _solarPower;

    @NotNull
    public static final ImageVector getSolarPower(@NotNull Icons.Sharp sharp) {
        ImageVector imageVector = _solarPower;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SolarPower", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.33f, 16.0f);
        pathBuilder.lineToRelative(7.67f, 0.0f);
        pathBuilder.lineToRelative(0.0f, -3.0f);
        pathBuilder.lineToRelative(-7.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(13.0f, 16.0f);
        pathBuilder2.lineToRelative(7.67f, 0.0f);
        pathBuilder2.lineToRelative(-0.67f, -3.0f);
        pathBuilder2.lineToRelative(-7.0f, 0.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(21.11f, 18.0f);
        pathBuilder3.lineToRelative(-8.11f, 0.0f);
        pathBuilder3.lineToRelative(0.0f, 4.0f);
        pathBuilder3.lineToRelative(9.0f, 0.0f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(2.0f, 22.0f);
        pathBuilder4.lineToRelative(9.0f, 0.0f);
        pathBuilder4.lineToRelative(0.0f, -4.0f);
        pathBuilder4.lineToRelative(-8.11f, 0.0f);
        pathBuilder4.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(11.0f, 8.0f);
        pathBuilder5.horizontalLineToRelative(2.0f);
        pathBuilder5.verticalLineToRelative(3.0f);
        pathBuilder5.horizontalLineToRelative(-2.0f);
        pathBuilder5.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw5, iM11702getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType6 = VectorKt.getDefaultFillType();
        SolidColor solidColor6 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw6 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk86 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(15.764f, 7.205f);
        pathBuilder6.lineToRelative(1.414f, -1.414f);
        pathBuilder6.lineToRelative(2.121f, 2.121f);
        pathBuilder6.lineToRelative(-1.414f, 1.414f);
        pathBuilder6.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder6.getNodes(), defaultFillType6, "", solidColor6, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw6, iM11702getBevelLxFBmk86, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType7 = VectorKt.getDefaultFillType();
        SolidColor solidColor7 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw7 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk87 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder7 = new PathBuilder();
        pathBuilder7.moveTo(4.705f, 7.913f);
        pathBuilder7.lineToRelative(2.121f, -2.121f);
        pathBuilder7.lineToRelative(1.414f, 1.414f);
        pathBuilder7.lineToRelative(-2.121f, 2.121f);
        pathBuilder7.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder7.getNodes(), defaultFillType7, "", solidColor7, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw7, iM11702getBevelLxFBmk87, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType8 = VectorKt.getDefaultFillType();
        SolidColor solidColor8 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw8 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk88 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder8 = new PathBuilder();
        pathBuilder8.moveTo(3.0f, 2.0f);
        pathBuilder8.horizontalLineToRelative(3.0f);
        pathBuilder8.verticalLineToRelative(2.0f);
        pathBuilder8.horizontalLineToRelative(-3.0f);
        pathBuilder8.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder8.getNodes(), defaultFillType8, "", solidColor8, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw8, iM11702getBevelLxFBmk88, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType9 = VectorKt.getDefaultFillType();
        SolidColor solidColor9 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw9 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk89 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder9 = new PathBuilder();
        pathBuilder9.moveTo(18.0f, 2.0f);
        pathBuilder9.horizontalLineToRelative(3.0f);
        pathBuilder9.verticalLineToRelative(2.0f);
        pathBuilder9.horizontalLineToRelative(-3.0f);
        pathBuilder9.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder9.getNodes(), defaultFillType9, "", solidColor9, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw9, iM11702getBevelLxFBmk89, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType10 = VectorKt.getDefaultFillType();
        SolidColor solidColor10 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw10 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk810 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder10 = new PathBuilder();
        pathBuilder10.moveTo(12.0f, 7.0f);
        pathBuilder10.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilder10.horizontalLineTo(7.0f);
        pathBuilder10.curveTo(7.0f, 4.76f, 9.24f, 7.0f, 12.0f, 7.0f);
        pathBuilder10.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder10.getNodes(), defaultFillType10, "", solidColor10, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw10, iM11702getBevelLxFBmk810, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _solarPower = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
