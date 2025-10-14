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

/* compiled from: Flood.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_flood", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Flood", "Landroidx/compose/material/icons/Icons$TwoTone;", "getFlood", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFlood.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Flood.kt\nandroidx/compose/material/icons/twotone/FloodKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,102:1\n212#2,12:103\n233#2,18:116\n253#2:153\n233#2,18:154\n253#2:191\n233#2,18:192\n253#2:229\n174#3:115\n705#4,2:134\n717#4,2:136\n719#4,11:142\n705#4,2:172\n717#4,2:174\n719#4,11:180\n705#4,2:210\n717#4,2:212\n719#4,11:218\n72#5,4:138\n72#5,4:176\n72#5,4:214\n*S KotlinDebug\n*F\n+ 1 Flood.kt\nandroidx/compose/material/icons/twotone/FloodKt\n*L\n29#1:103,12\n30#1:116,18\n30#1:153\n44#1:154,18\n44#1:191\n62#1:192,18\n62#1:229\n29#1:115\n30#1:134,2\n30#1:136,2\n30#1:142,11\n44#1:172,2\n44#1:174,2\n44#1:180,11\n62#1:210,2\n62#1:212,2\n62#1:218,11\n30#1:138,4\n44#1:176,4\n62#1:214,4\n*E\n"})
/* loaded from: classes2.dex */
public final class FloodKt {

    @Nullable
    private static ImageVector _flood;

    @NotNull
    public static final ImageVector getFlood(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _flood;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Flood", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.66f, 15.5f);
        pathBuilder.curveToRelative(1.01f, 0.0f, 1.3f, -0.65f, 2.42f, -0.9f);
        pathBuilder.lineToRelative(-0.91f, -3.39f);
        pathBuilder.lineToRelative(3.86f, -1.04f);
        pathBuilder.lineToRelative(1.42f, 5.31f);
        pathBuilder.curveToRelative(1.03f, -0.07f, 1.3f, -0.85f, 2.85f, -0.96f);
        pathBuilder.lineTo(16.16f, 6.5f);
        pathBuilder.lineToRelative(-5.74f, -2.09f);
        pathBuilder.lineTo(6.5f, 9.09f);
        pathBuilder.lineToRelative(1.7f, 6.36f);
        pathBuilder.curveTo(8.33f, 15.48f, 8.48f, 15.5f, 8.66f, 15.5f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(18.67f, 19.0f);
        pathBuilder2.curveToRelative(-1.95f, 0.0f, -2.09f, 1.0f, -3.33f, 1.0f);
        pathBuilder2.curveToRelative(-1.19f, 0.0f, -1.42f, -1.0f, -3.33f, -1.0f);
        pathBuilder2.curveToRelative(-1.95f, 0.0f, -2.1f, 1.0f, -3.34f, 1.0f);
        pathBuilder2.curveToRelative(-1.24f, 0.0f, -1.38f, -1.0f, -3.33f, -1.0f);
        pathBuilder2.curveToRelative(-1.95f, 0.0f, -2.1f, 1.0f, -3.34f, 1.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.curveToRelative(1.95f, 0.0f, 2.11f, -1.0f, 3.34f, -1.0f);
        pathBuilder2.curveToRelative(1.24f, 0.0f, 1.38f, 1.0f, 3.33f, 1.0f);
        pathBuilder2.curveToRelative(1.95f, 0.0f, 2.1f, -1.0f, 3.34f, -1.0f);
        pathBuilder2.curveToRelative(1.22f, 0.0f, 1.4f, 1.0f, 3.33f, 1.0f);
        pathBuilder2.curveToRelative(1.93f, 0.0f, 2.1f, -1.0f, 3.33f, -1.0f);
        pathBuilder2.curveToRelative(1.22f, 0.0f, 1.4f, 1.0f, 3.33f, 1.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.curveTo(20.76f, 20.0f, 20.62f, 19.0f, 18.67f, 19.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(8.68f, 17.5f);
        pathBuilder3.curveToRelative(1.95f, 0.0f, 2.09f, -1.0f, 3.33f, -1.0f);
        pathBuilder3.curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f);
        pathBuilder3.curveToRelative(1.95f, 0.0f, 2.09f, -1.0f, 3.33f, -1.0f);
        pathBuilder3.curveToRelative(1.19f, 0.0f, 1.4f, 0.98f, 3.31f, 1.0f);
        pathBuilder3.verticalLineToRelative(-2.0f);
        pathBuilder3.curveToRelative(-0.63f, 0.0f, -1.0f, -0.28f, -1.48f, -0.55f);
        pathBuilder3.lineToRelative(-2.02f, -7.53f);
        pathBuilder3.lineToRelative(2.09f, 0.85f);
        pathBuilder3.lineToRelative(0.74f, -1.86f);
        pathBuilder3.lineTo(9.78f, 2.0f);
        pathBuilder3.lineTo(2.0f, 11.61f);
        pathBuilder3.lineToRelative(1.57f, 1.23f);
        pathBuilder3.lineToRelative(1.39f, -1.78f);
        pathBuilder3.lineToRelative(0.93f, 3.48f);
        pathBuilder3.curveToRelative(-0.18f, -0.02f, -0.35f, -0.05f, -0.56f, -0.05f);
        pathBuilder3.curveToRelative(-1.95f, 0.0f, -2.09f, 1.0f, -3.33f, 1.0f);
        pathBuilder3.verticalLineToRelative(2.0f);
        pathBuilder3.curveToRelative(1.9f, 0.0f, 2.17f, -1.0f, 3.35f, -1.0f);
        pathBuilder3.curveTo(6.54f, 16.5f, 6.77f, 17.5f, 8.68f, 17.5f);
        pathBuilder3.close();
        pathBuilder3.moveTo(10.42f, 4.41f);
        pathBuilder3.lineToRelative(5.74f, 2.09f);
        pathBuilder3.lineToRelative(2.15f, 8.02f);
        pathBuilder3.curveToRelative(-1.54f, 0.11f, -1.82f, 0.89f, -2.85f, 0.96f);
        pathBuilder3.lineToRelative(-1.42f, -5.31f);
        pathBuilder3.lineToRelative(-3.86f, 1.04f);
        pathBuilder3.lineToRelative(0.91f, 3.39f);
        pathBuilder3.curveToRelative(-1.12f, 0.25f, -1.41f, 0.9f, -2.42f, 0.9f);
        pathBuilder3.curveToRelative(-0.18f, 0.0f, -0.33f, -0.02f, -0.45f, -0.05f);
        pathBuilder3.lineTo(6.5f, 9.09f);
        pathBuilder3.lineTo(10.42f, 4.41f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flood = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
