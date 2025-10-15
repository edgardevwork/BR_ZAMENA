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

/* compiled from: PestControlRodent.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_pestControlRodent", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PestControlRodent", "Landroidx/compose/material/icons/Icons$TwoTone;", "getPestControlRodent", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPestControlRodent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PestControlRodent.kt\nandroidx/compose/material/icons/twotone/PestControlRodentKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,108:1\n212#2,12:109\n233#2,18:122\n253#2:159\n233#2,18:160\n253#2:197\n233#2,18:198\n253#2:235\n174#3:121\n705#4,2:140\n717#4,2:142\n719#4,11:148\n705#4,2:178\n717#4,2:180\n719#4,11:186\n705#4,2:216\n717#4,2:218\n719#4,11:224\n72#5,4:144\n72#5,4:182\n72#5,4:220\n*S KotlinDebug\n*F\n+ 1 PestControlRodent.kt\nandroidx/compose/material/icons/twotone/PestControlRodentKt\n*L\n29#1:109,12\n30#1:122,18\n30#1:159\n55#1:160,18\n55#1:197\n61#1:198,18\n61#1:235\n29#1:121\n30#1:140,2\n30#1:142,2\n30#1:148,11\n55#1:178,2\n55#1:180,2\n55#1:186,11\n61#1:216,2\n61#1:218,2\n61#1:224,11\n30#1:144,4\n55#1:182,4\n61#1:220,4\n*E\n"})
/* loaded from: classes.dex */
public final class PestControlRodentKt {

    @Nullable
    private static ImageVector _pestControlRodent;

    @NotNull
    public static final ImageVector getPestControlRodent(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _pestControlRodent;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PestControlRodent", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.65f, 14.75f);
        pathBuilder.curveTo(17.87f, 14.38f, 18.0f, 13.96f, 18.0f, 13.5f);
        pathBuilder.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        pathBuilder.curveToRelative(-1.3f, 0.0f, -2.5f, 1.08f, -2.5f, 2.5f);
        pathBuilder.curveToRelative(0.0f, 0.69f, 0.28f, 1.32f, 0.73f, 1.77f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.curveTo(11.5f, 15.87f, 11.0f, 14.74f, 11.0f, 13.5f);
        pathBuilder.curveToRelative(0.0f, -0.92f, 0.28f, -1.76f, 0.75f, -2.47f);
        pathBuilder.curveToRelative(-0.22f, 0.01f, -0.44f, 0.02f, -0.67f, 0.07f);
        pathBuilder.curveToRelative(-1.48f, 0.32f, -2.68f, 1.53f, -2.99f, 3.01f);
        pathBuilder.curveToRelative(-0.26f, 1.24f, 0.02f, 2.45f, 0.8f, 3.41f);
        pathBuilder.curveTo(9.66f, 18.46f, 10.79f, 19.0f, 12.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(6.53f);
        pathBuilder.curveToRelative(0.81f, 0.0f, 1.47f, -0.66f, 1.47f, -1.47f);
        pathBuilder.curveToRelative(0.0f, -0.41f, -0.17f, -0.81f, -0.48f, -1.09f);
        pathBuilder.lineTo(17.65f, 14.75f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 18.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.curveTo(18.0f, 17.55f, 17.55f, 18.0f, 17.0f, 18.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(17.0f, 17.0f);
        pathBuilder2.moveToRelative(-1.0f, 0.0f);
        pathBuilder2.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilder2.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(20.86f, 14.97f);
        pathBuilder3.lineToRelative(-0.93f, -0.84f);
        pathBuilder3.curveToRelative(0.48f, -3.45f, -2.87f, -6.04f, -6.05f, -4.82f);
        pathBuilder3.curveTo(13.3f, 9.11f, 12.66f, 9.0f, 12.0f, 9.0f);
        pathBuilder3.curveToRelative(-4.26f, 0.0f, -5.65f, 3.58f, -5.89f, 4.85f);
        pathBuilder3.curveTo(4.89f, 13.47f, 4.0f, 12.35f, 4.0f, 11.0f);
        pathBuilder3.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder3.horizontalLineToRelative(2.5f);
        pathBuilder3.curveTo(10.88f, 8.0f, 12.0f, 6.88f, 12.0f, 5.5f);
        pathBuilder3.curveTo(12.0f, 4.12f, 10.88f, 3.0f, 9.5f, 3.0f);
        pathBuilder3.horizontalLineTo(8.0f);
        pathBuilder3.curveTo(7.45f, 3.0f, 7.0f, 3.45f, 7.0f, 4.0f);
        pathBuilder3.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder3.horizontalLineToRelative(1.5f);
        pathBuilder3.curveTo(9.78f, 5.0f, 10.0f, 5.22f, 10.0f, 5.5f);
        pathBuilder3.curveTo(10.0f, 5.78f, 9.78f, 6.0f, 9.5f, 6.0f);
        pathBuilder3.horizontalLineTo(7.0f);
        pathBuilder3.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilder3.curveToRelative(0.0f, 2.44f, 1.76f, 4.47f, 4.07f, 4.91f);
        pathBuilder3.curveTo(6.51f, 18.79f, 8.99f, 21.0f, 12.0f, 21.0f);
        pathBuilder3.horizontalLineToRelative(6.53f);
        pathBuilder3.curveTo(21.64f, 21.0f, 23.23f, 17.11f, 20.86f, 14.97f);
        pathBuilder3.close();
        pathBuilder3.moveTo(18.53f, 19.0f);
        pathBuilder3.horizontalLineTo(12.0f);
        pathBuilder3.curveToRelative(-1.21f, 0.0f, -2.34f, -0.54f, -3.11f, -1.48f);
        pathBuilder3.curveToRelative(-0.78f, -0.95f, -1.06f, -2.16f, -0.8f, -3.41f);
        pathBuilder3.curveToRelative(0.31f, -1.48f, 1.51f, -2.69f, 2.99f, -3.01f);
        pathBuilder3.curveToRelative(0.22f, -0.05f, 0.45f, -0.06f, 0.67f, -0.07f);
        pathBuilder3.curveTo(11.28f, 11.74f, 11.0f, 12.58f, 11.0f, 13.5f);
        pathBuilder3.curveToRelative(0.0f, 1.24f, 0.5f, 2.37f, 1.32f, 3.18f);
        pathBuilder3.lineToRelative(1.41f, -1.41f);
        pathBuilder3.curveTo(13.28f, 14.82f, 13.0f, 14.19f, 13.0f, 13.5f);
        pathBuilder3.curveToRelative(0.0f, -1.42f, 1.2f, -2.5f, 2.5f, -2.5f);
        pathBuilder3.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilder3.curveToRelative(0.0f, 0.46f, -0.13f, 0.88f, -0.35f, 1.25f);
        pathBuilder3.lineToRelative(1.87f, 1.7f);
        pathBuilder3.curveToRelative(0.31f, 0.28f, 0.48f, 0.67f, 0.48f, 1.09f);
        pathBuilder3.curveTo(20.0f, 18.34f, 19.34f, 19.0f, 18.53f, 19.0f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pestControlRodent = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
