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

/* compiled from: Animation.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_animation", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Animation", "Landroidx/compose/material/icons/Icons$TwoTone;", "getAnimation", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animation.kt\nandroidx/compose/material/icons/twotone/AnimationKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,107:1\n212#2,12:108\n233#2,18:121\n253#2:158\n233#2,18:159\n253#2:196\n233#2,18:197\n253#2:234\n233#2,18:235\n253#2:272\n233#2,18:273\n253#2:310\n174#3:120\n705#4,2:139\n717#4,2:141\n719#4,11:147\n705#4,2:177\n717#4,2:179\n719#4,11:185\n705#4,2:215\n717#4,2:217\n719#4,11:223\n705#4,2:253\n717#4,2:255\n719#4,11:261\n705#4,2:291\n717#4,2:293\n719#4,11:299\n72#5,4:143\n72#5,4:181\n72#5,4:219\n72#5,4:257\n72#5,4:295\n*S KotlinDebug\n*F\n+ 1 Animation.kt\nandroidx/compose/material/icons/twotone/AnimationKt\n*L\n29#1:108,12\n30#1:121,18\n30#1:158\n38#1:159,18\n38#1:196\n46#1:197,18\n46#1:234\n56#1:235,18\n56#1:272\n64#1:273,18\n64#1:310\n29#1:120\n30#1:139,2\n30#1:141,2\n30#1:147,11\n38#1:177,2\n38#1:179,2\n38#1:185,11\n46#1:215,2\n46#1:217,2\n46#1:223,11\n56#1:253,2\n56#1:255,2\n56#1:261,11\n64#1:291,2\n64#1:293,2\n64#1:299,11\n30#1:143,4\n38#1:181,4\n46#1:219,4\n56#1:257,4\n64#1:295,4\n*E\n"})
/* loaded from: classes.dex */
public final class AnimationKt {

    @Nullable
    private static ImageVector _animation;

    @NotNull
    public static final ImageVector getAnimation(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _animation;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Animation", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 12.0f);
        pathBuilder.curveToRelative(-0.63f, 0.84f, -1.0f, 1.88f, -1.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder.curveToRelative(1.12f, 0.0f, 2.16f, -0.37f, 3.0f, -1.0f);
        pathBuilder.curveTo(8.13f, 19.0f, 5.0f, 15.87f, 5.0f, 12.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(15.0f, 4.0f);
        pathBuilder2.curveToRelative(-1.13f, 0.0f, -2.16f, 0.37f, -3.0f, 1.0f);
        pathBuilder2.curveToRelative(3.87f, 0.01f, 7.0f, 3.14f, 7.0f, 7.0f);
        pathBuilder2.curveToRelative(0.63f, -0.84f, 1.0f, -1.88f, 1.0f, -3.0f);
        pathBuilder2.curveTo(20.0f, 6.24f, 17.76f, 4.0f, 15.0f, 4.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(12.0f, 7.0f);
        pathBuilder3.curveToRelative(-0.6f, 0.0f, -1.17f, 0.11f, -1.7f, 0.3f);
        pathBuilder3.curveTo(10.11f, 7.83f, 10.0f, 8.4f, 10.0f, 9.0f);
        pathBuilder3.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder3.curveToRelative(0.6f, 0.0f, 1.17f, -0.11f, 1.7f, -0.3f);
        pathBuilder3.curveToRelative(0.19f, -0.53f, 0.3f, -1.1f, 0.3f, -1.7f);
        pathBuilder3.curveTo(17.0f, 9.24f, 14.76f, 7.0f, 12.0f, 7.0f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(8.0f, 9.0f);
        pathBuilder4.curveToRelative(-0.63f, 0.84f, -1.0f, 1.88f, -1.0f, 3.0f);
        pathBuilder4.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder4.curveToRelative(1.12f, 0.0f, 2.16f, -0.37f, 3.0f, -1.0f);
        pathBuilder4.curveTo(11.13f, 15.99f, 8.0f, 12.86f, 8.0f, 9.0f);
        pathBuilder4.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(15.0f, 2.0f);
        pathBuilder5.curveToRelative(-2.71f, 0.0f, -5.05f, 1.54f, -6.22f, 3.78f);
        pathBuilder5.curveToRelative(-1.28f, 0.67f, -2.34f, 1.72f, -3.0f, 3.0f);
        pathBuilder5.curveTo(3.54f, 9.95f, 2.0f, 12.29f, 2.0f, 15.0f);
        pathBuilder5.curveToRelative(0.0f, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f);
        pathBuilder5.curveToRelative(2.71f, 0.0f, 5.05f, -1.54f, 6.22f, -3.78f);
        pathBuilder5.curveToRelative(1.28f, -0.67f, 2.34f, -1.72f, 3.0f, -3.0f);
        pathBuilder5.curveTo(20.46f, 14.05f, 22.0f, 11.71f, 22.0f, 9.0f);
        pathBuilder5.curveTo(22.0f, 5.13f, 18.87f, 2.0f, 15.0f, 2.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(9.0f, 20.0f);
        pathBuilder5.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        pathBuilder5.curveToRelative(0.0f, -1.12f, 0.37f, -2.16f, 1.0f, -3.0f);
        pathBuilder5.curveToRelative(0.0f, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f);
        pathBuilder5.curveTo(11.16f, 19.63f, 10.12f, 20.0f, 9.0f, 20.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(12.0f, 17.0f);
        pathBuilder5.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        pathBuilder5.curveToRelative(0.0f, -1.12f, 0.37f, -2.16f, 1.0f, -3.0f);
        pathBuilder5.curveToRelative(0.0f, 3.86f, 3.13f, 6.99f, 7.0f, 7.0f);
        pathBuilder5.curveTo(14.16f, 16.63f, 13.12f, 17.0f, 12.0f, 17.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(16.7f, 13.7f);
        pathBuilder5.curveTo(16.17f, 13.89f, 15.6f, 14.0f, 15.0f, 14.0f);
        pathBuilder5.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        pathBuilder5.curveToRelative(0.0f, -0.6f, 0.11f, -1.17f, 0.3f, -1.7f);
        pathBuilder5.curveTo(10.83f, 7.11f, 11.4f, 7.0f, 12.0f, 7.0f);
        pathBuilder5.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder5.curveTo(17.0f, 12.6f, 16.89f, 13.17f, 16.7f, 13.7f);
        pathBuilder5.close();
        pathBuilder5.moveTo(19.0f, 12.0f);
        pathBuilder5.curveToRelative(0.0f, -3.86f, -3.13f, -6.99f, -7.0f, -7.0f);
        pathBuilder5.curveToRelative(0.84f, -0.63f, 1.87f, -1.0f, 3.0f, -1.0f);
        pathBuilder5.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder5.curveTo(20.0f, 10.12f, 19.63f, 11.16f, 19.0f, 12.0f);
        pathBuilder5.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw5, iM11702getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _animation = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
