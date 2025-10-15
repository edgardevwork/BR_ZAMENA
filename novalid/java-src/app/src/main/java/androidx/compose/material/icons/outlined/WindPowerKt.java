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

/* compiled from: WindPower.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_windPower", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WindPower", "Landroidx/compose/material/icons/Icons$Outlined;", "getWindPower", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nWindPower.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindPower.kt\nandroidx/compose/material/icons/outlined/WindPowerKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,120:1\n212#2,12:121\n233#2,18:134\n253#2:171\n233#2,18:172\n253#2:209\n233#2,18:210\n253#2:247\n233#2,18:248\n253#2:285\n174#3:133\n705#4,2:152\n717#4,2:154\n719#4,11:160\n705#4,2:190\n717#4,2:192\n719#4,11:198\n705#4,2:228\n717#4,2:230\n719#4,11:236\n705#4,2:266\n717#4,2:268\n719#4,11:274\n72#5,4:156\n72#5,4:194\n72#5,4:232\n72#5,4:270\n*S KotlinDebug\n*F\n+ 1 WindPower.kt\nandroidx/compose/material/icons/outlined/WindPowerKt\n*L\n29#1:121,12\n30#1:134,18\n30#1:171\n37#1:172,18\n37#1:209\n44#1:210,18\n44#1:247\n51#1:248,18\n51#1:285\n29#1:133\n30#1:152,2\n30#1:154,2\n30#1:160,11\n37#1:190,2\n37#1:192,2\n37#1:198,11\n44#1:228,2\n44#1:230,2\n44#1:236,11\n51#1:266,2\n51#1:268,2\n51#1:274,11\n30#1:156,4\n37#1:194,4\n44#1:232,4\n51#1:270,4\n*E\n"})
/* loaded from: classes3.dex */
public final class WindPowerKt {

    @Nullable
    private static ImageVector _windPower;

    @NotNull
    public static final ImageVector getWindPower(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _windPower;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.WindPower", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        pathBuilder4.moveTo(22.21f, 18.61f);
        pathBuilder4.lineToRelative(-2.28f, -4.1f);
        pathBuilder4.curveToRelative(-0.27f, -0.48f, -0.73f, -0.83f, -1.26f, -0.97f);
        pathBuilder4.lineToRelative(-2.69f, -0.67f);
        pathBuilder4.curveToRelative(-0.02f, -0.47f, -0.14f, -0.92f, -0.37f, -1.33f);
        pathBuilder4.lineToRelative(3.96f, -6.59f);
        pathBuilder4.curveToRelative(0.65f, -1.08f, 0.3f, -2.48f, -0.78f, -3.13f);
        pathBuilder4.curveToRelative(-0.36f, -0.22f, -0.77f, -0.32f, -1.17f, -0.32f);
        pathBuilder4.curveToRelative(-0.56f, 0.0f, -1.12f, 0.21f, -1.56f, 0.62f);
        pathBuilder4.lineToRelative(-3.43f, 3.21f);
        pathBuilder4.curveTo(12.23f, 5.7f, 12.0f, 6.23f, 12.0f, 6.78f);
        pathBuilder4.verticalLineToRelative(3.4f);
        pathBuilder4.curveToRelative(-0.47f, 0.17f, -0.89f, 0.45f, -1.23f, 0.82f);
        pathBuilder4.horizontalLineTo(3.28f);
        pathBuilder4.curveTo(2.02f, 11.0f, 1.0f, 12.02f, 1.0f, 13.28f);
        pathBuilder4.curveToRelative(0.0f, 1.02f, 0.67f, 1.91f, 1.65f, 2.19f);
        pathBuilder4.lineToRelative(4.51f, 1.29f);
        pathBuilder4.curveToRelative(0.18f, 0.05f, 0.37f, 0.08f, 0.55f, 0.08f);
        pathBuilder4.curveToRelative(0.36f, 0.0f, 0.72f, -0.1f, 1.03f, -0.29f);
        pathBuilder4.lineToRelative(2.24f, -1.34f);
        pathBuilder4.curveToRelative(0.29f, 0.26f, 0.63f, 0.47f, 1.02f, 0.61f);
        pathBuilder4.verticalLineTo(21.0f);
        pathBuilder4.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder4.horizontalLineToRelative(6.0f);
        pathBuilder4.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder4.verticalLineToRelative(-4.28f);
        pathBuilder4.lineToRelative(4.61f, 4.61f);
        pathBuilder4.curveToRelative(0.45f, 0.45f, 1.03f, 0.67f, 1.61f, 0.67f);
        pathBuilder4.curveToRelative(0.58f, 0.0f, 1.17f, -0.22f, 1.61f, -0.67f);
        pathBuilder4.horizontalLineToRelative(0.0f);
        pathBuilder4.curveTo(22.55f, 20.61f, 22.71f, 19.5f, 22.21f, 18.61f);
        pathBuilder4.close();
        pathBuilder4.moveTo(7.72f, 14.84f);
        pathBuilder4.lineTo(3.2f, 13.55f);
        pathBuilder4.curveTo(3.08f, 13.52f, 3.0f, 13.4f, 3.0f, 13.28f);
        pathBuilder4.curveTo(3.0f, 13.13f, 3.13f, 13.0f, 3.28f, 13.0f);
        pathBuilder4.horizontalLineToRelative(6.73f);
        pathBuilder4.curveToRelative(0.0f, 0.15f, 0.01f, 0.3f, 0.03f, 0.44f);
        pathBuilder4.lineTo(7.72f, 14.84f);
        pathBuilder4.close();
        pathBuilder4.moveTo(13.0f, 14.0f);
        pathBuilder4.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder4.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder4.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder4.curveTo(14.0f, 13.55f, 13.55f, 14.0f, 13.0f, 14.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(14.0f, 10.14f);
        pathBuilder4.verticalLineTo(6.78f);
        pathBuilder4.lineToRelative(3.43f, -3.21f);
        pathBuilder4.curveToRelative(0.05f, -0.05f, 0.19f, -0.12f, 0.34f, -0.04f);
        pathBuilder4.curveToRelative(0.13f, 0.08f, 0.18f, 0.25f, 0.1f, 0.38f);
        pathBuilder4.lineToRelative(-3.74f, 6.24f);
        pathBuilder4.lineTo(14.0f, 10.14f);
        pathBuilder4.close();
        pathBuilder4.moveTo(20.42f, 19.92f);
        pathBuilder4.curveToRelative(-0.05f, 0.05f, -0.24f, 0.16f, -0.4f, 0.0f);
        pathBuilder4.lineToRelative(-4.85f, -4.85f);
        pathBuilder4.curveToRelative(0.08f, -0.09f, 0.16f, -0.18f, 0.24f, -0.28f);
        pathBuilder4.lineToRelative(2.78f, 0.69f);
        pathBuilder4.lineToRelative(2.28f, 4.1f);
        pathBuilder4.curveTo(20.53f, 19.69f, 20.51f, 19.83f, 20.42f, 19.92f);
        pathBuilder4.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _windPower = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
