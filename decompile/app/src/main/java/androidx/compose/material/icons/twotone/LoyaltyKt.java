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

/* compiled from: Loyalty.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_loyalty", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Loyalty", "Landroidx/compose/material/icons/Icons$TwoTone;", "getLoyalty", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLoyalty.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Loyalty.kt\nandroidx/compose/material/icons/twotone/LoyaltyKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,106:1\n212#2,12:107\n233#2,18:120\n253#2:157\n233#2,18:158\n253#2:195\n233#2,18:196\n253#2:233\n233#2,18:234\n253#2:271\n174#3:119\n705#4,2:138\n717#4,2:140\n719#4,11:146\n705#4,2:176\n717#4,2:178\n719#4,11:184\n705#4,2:214\n717#4,2:216\n719#4,11:222\n705#4,2:252\n717#4,2:254\n719#4,11:260\n72#5,4:142\n72#5,4:180\n72#5,4:218\n72#5,4:256\n*S KotlinDebug\n*F\n+ 1 Loyalty.kt\nandroidx/compose/material/icons/twotone/LoyaltyKt\n*L\n29#1:107,12\n30#1:120,18\n30#1:157\n57#1:158,18\n57#1:195\n81#1:196,18\n81#1:233\n87#1:234,18\n87#1:271\n29#1:119\n30#1:138,2\n30#1:140,2\n30#1:146,11\n57#1:176,2\n57#1:178,2\n57#1:184,11\n81#1:214,2\n81#1:216,2\n81#1:222,11\n87#1:252,2\n87#1:254,2\n87#1:260,11\n30#1:142,4\n57#1:180,4\n81#1:218,4\n87#1:256,4\n*E\n"})
/* loaded from: classes4.dex */
public final class LoyaltyKt {

    @Nullable
    private static ImageVector _loyalty;

    @NotNull
    public static final ImageVector getLoyalty(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _loyalty;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Loyalty", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 4.0f);
        pathBuilder.lineTo(4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.lineToRelative(9.0f, 9.01f);
        pathBuilder.lineTo(20.0f, 13.0f);
        pathBuilder.lineToRelative(-9.0f, -9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.5f, 8.0f);
        pathBuilder.curveTo(5.67f, 8.0f, 5.0f, 7.33f, 5.0f, 6.5f);
        pathBuilder.reflectiveCurveTo(5.67f, 5.0f, 6.5f, 5.0f);
        pathBuilder.reflectiveCurveTo(8.0f, 5.67f, 8.0f, 6.5f);
        pathBuilder.reflectiveCurveTo(7.33f, 8.0f, 6.5f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 11.7f);
        pathBuilder.lineToRelative(0.6f, -0.6f);
        pathBuilder.curveToRelative(0.37f, -0.37f, 0.89f, -0.6f, 1.45f, -0.6f);
        pathBuilder.curveToRelative(1.13f, 0.0f, 2.05f, 0.92f, 2.05f, 2.05f);
        pathBuilder.curveToRelative(0.0f, 0.57f, -0.23f, 1.08f, -0.6f, 1.45f);
        pathBuilder.lineTo(13.0f, 17.5f);
        pathBuilder.lineTo(9.5f, 14.0f);
        pathBuilder.curveToRelative(-0.37f, -0.38f, -0.6f, -0.89f, -0.6f, -1.45f);
        pathBuilder.curveToRelative(0.0f, -1.13f, 0.92f, -2.05f, 2.05f, -2.05f);
        pathBuilder.curveToRelative(0.57f, 0.0f, 1.08f, 0.23f, 1.45f, 0.61f);
        pathBuilder.lineToRelative(0.6f, 0.59f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(21.41f, 11.58f);
        pathBuilder2.lineToRelative(-9.0f, -9.0f);
        pathBuilder2.curveTo(12.05f, 2.22f, 11.55f, 2.0f, 11.0f, 2.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(7.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, 0.22f, 1.05f, 0.59f, 1.42f);
        pathBuilder2.lineToRelative(9.0f, 9.0f);
        pathBuilder2.curveToRelative(0.36f, 0.36f, 0.86f, 0.58f, 1.41f, 0.58f);
        pathBuilder2.reflectiveCurveToRelative(1.05f, -0.22f, 1.41f, -0.59f);
        pathBuilder2.lineToRelative(7.0f, -7.0f);
        pathBuilder2.curveToRelative(0.37f, -0.36f, 0.59f, -0.86f, 0.59f, -1.41f);
        pathBuilder2.reflectiveCurveToRelative(-0.23f, -1.06f, -0.59f, -1.42f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.0f, 20.01f);
        pathBuilder2.lineTo(4.0f, 11.0f);
        pathBuilder2.verticalLineTo(4.0f);
        pathBuilder2.horizontalLineToRelative(7.0f);
        pathBuilder2.verticalLineToRelative(-0.01f);
        pathBuilder2.lineToRelative(9.0f, 9.0f);
        pathBuilder2.lineToRelative(-7.0f, 7.02f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(6.5f, 6.5f);
        pathBuilder3.moveToRelative(-1.5f, 0.0f);
        pathBuilder3.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        pathBuilder3.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(8.9f, 12.55f);
        pathBuilder4.curveToRelative(0.0f, 0.57f, 0.23f, 1.07f, 0.6f, 1.45f);
        pathBuilder4.lineToRelative(3.5f, 3.5f);
        pathBuilder4.lineToRelative(3.5f, -3.5f);
        pathBuilder4.curveToRelative(0.37f, -0.37f, 0.6f, -0.89f, 0.6f, -1.45f);
        pathBuilder4.curveToRelative(0.0f, -1.13f, -0.92f, -2.05f, -2.05f, -2.05f);
        pathBuilder4.curveToRelative(-0.57f, 0.0f, -1.08f, 0.23f, -1.45f, 0.6f);
        pathBuilder4.lineToRelative(-0.6f, 0.6f);
        pathBuilder4.lineToRelative(-0.6f, -0.59f);
        pathBuilder4.curveToRelative(-0.37f, -0.38f, -0.89f, -0.61f, -1.45f, -0.61f);
        pathBuilder4.curveToRelative(-1.13f, 0.0f, -2.05f, 0.92f, -2.05f, 2.05f);
        pathBuilder4.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _loyalty = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
