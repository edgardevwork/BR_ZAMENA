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

/* compiled from: SportsFootball.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_sportsFootball", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SportsFootball", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSportsFootball", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSportsFootball.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportsFootball.kt\nandroidx/compose/material/icons/twotone/SportsFootballKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,104:1\n212#2,12:105\n233#2,18:118\n253#2:155\n233#2,18:156\n253#2:193\n233#2,18:194\n253#2:231\n233#2,18:232\n253#2:269\n233#2,18:270\n253#2:307\n174#3:117\n705#4,2:136\n717#4,2:138\n719#4,11:144\n705#4,2:174\n717#4,2:176\n719#4,11:182\n705#4,2:212\n717#4,2:214\n719#4,11:220\n705#4,2:250\n717#4,2:252\n719#4,11:258\n705#4,2:288\n717#4,2:290\n719#4,11:296\n72#5,4:140\n72#5,4:178\n72#5,4:216\n72#5,4:254\n72#5,4:292\n*S KotlinDebug\n*F\n+ 1 SportsFootball.kt\nandroidx/compose/material/icons/twotone/SportsFootballKt\n*L\n29#1:105,12\n30#1:118,18\n30#1:155\n38#1:156,18\n38#1:193\n46#1:194,18\n46#1:231\n62#1:232,18\n62#1:269\n92#1:270,18\n92#1:307\n29#1:117\n30#1:136,2\n30#1:138,2\n30#1:144,11\n38#1:174,2\n38#1:176,2\n38#1:182,11\n46#1:212,2\n46#1:214,2\n46#1:220,11\n62#1:250,2\n62#1:252,2\n62#1:258,11\n92#1:288,2\n92#1:290,2\n92#1:296,11\n30#1:140,4\n38#1:178,4\n46#1:216,4\n62#1:254,4\n92#1:292,4\n*E\n"})
/* loaded from: classes.dex */
public final class SportsFootballKt {

    @Nullable
    private static ImageVector _sportsFootball;

    @NotNull
    public static final ImageVector getSportsFootball(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _sportsFootball;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SportsFootball", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.26f, 5.0f);
        pathBuilder.curveToRelative(-0.35f, 0.0f, -0.8f, 0.01f, -1.33f, 0.06f);
        pathBuilder.lineToRelative(4.03f, 4.03f);
        pathBuilder.curveToRelative(0.14f, -1.63f, 0.01f, -3.07f, -0.17f, -3.86f);
        pathBuilder.curveTo(18.28f, 5.12f, 17.4f, 5.0f, 16.26f, 5.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(5.21f, 18.77f);
        pathBuilder2.curveTo(5.72f, 18.88f, 6.6f, 19.0f, 7.74f, 19.0f);
        pathBuilder2.curveToRelative(0.34f, 0.0f, 0.79f, -0.01f, 1.3f, -0.05f);
        pathBuilder2.lineToRelative(-4.01f, -4.01f);
        pathBuilder2.curveTo(4.91f, 16.56f, 5.03f, 17.98f, 5.21f, 18.77f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(7.87f, 7.87f);
        pathBuilder3.curveToRelative(-1.28f, 1.28f, -2.03f, 2.97f, -2.45f, 4.65f);
        pathBuilder3.lineToRelative(6.04f, 6.04f);
        pathBuilder3.curveToRelative(1.6f, -0.39f, 3.33f, -1.11f, 4.66f, -2.44f);
        pathBuilder3.curveToRelative(1.28f, -1.28f, 2.03f, -2.95f, 2.44f, -4.63f);
        pathBuilder3.lineToRelative(-6.05f, -6.05f);
        pathBuilder3.curveTo(10.92f, 5.83f, 9.2f, 6.55f, 7.87f, 7.87f);
        pathBuilder3.close();
        pathBuilder3.moveTo(15.5f, 9.9f);
        pathBuilder3.lineToRelative(-5.6f, 5.6f);
        pathBuilder3.lineToRelative(-1.4f, -1.4f);
        pathBuilder3.lineToRelative(5.6f, -5.6f);
        pathBuilder3.lineTo(15.5f, 9.9f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(20.31f, 3.69f);
        pathBuilder4.curveTo(19.99f, 3.36f, 18.37f, 3.0f, 16.26f, 3.0f);
        pathBuilder4.curveToRelative(-3.03f, 0.0f, -7.09f, 0.75f, -9.8f, 3.46f);
        pathBuilder4.curveTo(1.87f, 11.05f, 2.9f, 19.52f, 3.69f, 20.31f);
        pathBuilder4.curveTo(4.01f, 20.64f, 5.63f, 21.0f, 7.74f, 21.0f);
        pathBuilder4.curveToRelative(3.03f, 0.0f, 7.09f, -0.75f, 9.8f, -3.46f);
        pathBuilder4.curveTo(22.13f, 12.95f, 21.1f, 4.48f, 20.31f, 3.69f);
        pathBuilder4.close();
        pathBuilder4.moveTo(7.74f, 19.0f);
        pathBuilder4.curveToRelative(-1.14f, 0.0f, -2.02f, -0.12f, -2.53f, -0.23f);
        pathBuilder4.curveToRelative(-0.18f, -0.79f, -0.3f, -2.21f, -0.17f, -3.83f);
        pathBuilder4.lineToRelative(4.01f, 4.01f);
        pathBuilder4.curveTo(8.53f, 18.99f, 8.08f, 19.0f, 7.74f, 19.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(16.13f, 16.13f);
        pathBuilder4.curveToRelative(-1.33f, 1.33f, -3.06f, 2.05f, -4.66f, 2.44f);
        pathBuilder4.lineToRelative(-6.04f, -6.04f);
        pathBuilder4.curveToRelative(0.42f, -1.68f, 1.16f, -3.37f, 2.45f, -4.65f);
        pathBuilder4.curveToRelative(1.32f, -1.32f, 3.05f, -2.04f, 4.64f, -2.43f);
        pathBuilder4.lineToRelative(6.05f, 6.05f);
        pathBuilder4.curveTo(18.15f, 13.17f, 17.4f, 14.85f, 16.13f, 16.13f);
        pathBuilder4.close();
        pathBuilder4.moveTo(18.96f, 9.09f);
        pathBuilder4.lineToRelative(-4.03f, -4.03f);
        pathBuilder4.curveTo(15.45f, 5.01f, 15.91f, 5.0f, 16.26f, 5.0f);
        pathBuilder4.curveToRelative(1.14f, 0.0f, 2.02f, 0.12f, 2.53f, 0.23f);
        pathBuilder4.curveTo(18.97f, 6.02f, 19.09f, 7.45f, 18.96f, 9.09f);
        pathBuilder4.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(8.5f, 14.1f);
        pathBuilder5.lineToRelative(5.6f, -5.6f);
        pathBuilder5.lineToRelative(1.4f, 1.4f);
        pathBuilder5.lineToRelative(-5.6f, 5.6f);
        pathBuilder5.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw5, iM11702getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsFootball = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
