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

/* compiled from: Rocket.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_rocket", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Rocket", "Landroidx/compose/material/icons/Icons$TwoTone;", "getRocket", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nRocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rocket.kt\nandroidx/compose/material/icons/twotone/RocketKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,102:1\n212#2,12:103\n233#2,18:116\n253#2:153\n233#2,18:154\n253#2:191\n174#3:115\n705#4,2:134\n717#4,2:136\n719#4,11:142\n705#4,2:172\n717#4,2:174\n719#4,11:180\n72#5,4:138\n72#5,4:176\n*S KotlinDebug\n*F\n+ 1 Rocket.kt\nandroidx/compose/material/icons/twotone/RocketKt\n*L\n29#1:103,12\n30#1:116,18\n30#1:153\n57#1:154,18\n57#1:191\n29#1:115\n30#1:134,2\n30#1:136,2\n30#1:142,11\n57#1:172,2\n57#1:174,2\n57#1:180,11\n30#1:138,4\n57#1:176,4\n*E\n"})
/* loaded from: classes4.dex */
public final class RocketKt {

    @Nullable
    private static ImageVector _rocket;

    @NotNull
    public static final ImageVector getRocket(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _rocket;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Rocket", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.98f, 18.25f);
        pathBuilder.curveToRelative(-0.29f, -0.9f, -0.57f, -1.94f, -0.76f, -3.0f);
        pathBuilder.lineTo(6.0f, 16.07f);
        pathBuilder.verticalLineToRelative(2.98f);
        pathBuilder.lineTo(7.98f, 18.25f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 4.36f);
        pathBuilder.curveToRelative(0.0f, 0.0f, -3.0f, 2.02f, -3.0f, 8.64f);
        pathBuilder.curveToRelative(0.0f, 2.25f, 1.0f, 5.0f, 1.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 1.0f, -2.75f, 1.0f, -5.0f);
        pathBuilder.curveTo(15.0f, 6.38f, 12.0f, 4.36f, 12.0f, 4.36f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 13.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.curveTo(14.0f, 12.1f, 13.1f, 13.0f, 12.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 19.05f);
        pathBuilder.verticalLineToRelative(-2.98f);
        pathBuilder.lineToRelative(-1.22f, -0.81f);
        pathBuilder.curveToRelative(-0.19f, 1.05f, -0.47f, 2.1f, -0.76f, 3.0f);
        pathBuilder.lineTo(18.0f, 19.05f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(14.0f, 11.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder2.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.reflectiveCurveTo(14.0f, 12.1f, 14.0f, 11.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(7.98f, 18.25f);
        pathBuilder2.curveToRelative(-0.29f, -0.9f, -0.57f, -1.94f, -0.76f, -3.0f);
        pathBuilder2.lineTo(6.0f, 16.07f);
        pathBuilder2.verticalLineToRelative(2.98f);
        pathBuilder2.lineTo(7.98f, 18.25f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 2.0f);
        pathBuilder2.curveToRelative(0.0f, 0.0f, 5.0f, 2.0f, 5.0f, 11.0f);
        pathBuilder2.lineToRelative(2.11f, 1.41f);
        pathBuilder2.curveToRelative(0.56f, 0.37f, 0.89f, 1.0f, 0.89f, 1.66f);
        pathBuilder2.verticalLineTo(22.0f);
        pathBuilder2.lineToRelative(-5.0f, -2.0f);
        pathBuilder2.horizontalLineTo(9.0f);
        pathBuilder2.lineToRelative(-5.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(-5.93f);
        pathBuilder2.curveToRelative(0.0f, -0.67f, 0.33f, -1.29f, 0.89f, -1.66f);
        pathBuilder2.lineTo(7.0f, 13.0f);
        pathBuilder2.curveTo(7.0f, 4.0f, 12.0f, 2.0f, 12.0f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 4.36f);
        pathBuilder2.curveToRelative(0.0f, 0.0f, -3.0f, 2.02f, -3.0f, 8.64f);
        pathBuilder2.curveToRelative(0.0f, 2.25f, 1.0f, 5.0f, 1.0f, 5.0f);
        pathBuilder2.horizontalLineToRelative(4.0f);
        pathBuilder2.curveToRelative(0.0f, 0.0f, 1.0f, -2.75f, 1.0f, -5.0f);
        pathBuilder2.curveTo(15.0f, 6.38f, 12.0f, 4.36f, 12.0f, 4.36f);
        pathBuilder2.close();
        pathBuilder2.moveTo(18.0f, 19.05f);
        pathBuilder2.verticalLineToRelative(-2.98f);
        pathBuilder2.lineToRelative(-1.22f, -0.81f);
        pathBuilder2.curveToRelative(-0.19f, 1.05f, -0.47f, 2.1f, -0.76f, 3.0f);
        pathBuilder2.lineTo(18.0f, 19.05f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rocket = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
