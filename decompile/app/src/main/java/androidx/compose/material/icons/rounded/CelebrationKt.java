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

/* compiled from: Celebration.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_celebration", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Celebration", "Landroidx/compose/material/icons/Icons$Rounded;", "getCelebration", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCelebration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Celebration.kt\nandroidx/compose/material/icons/rounded/CelebrationKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,109:1\n212#2,12:110\n233#2,18:123\n253#2:160\n233#2,18:161\n253#2:198\n233#2,18:199\n253#2:236\n233#2,18:237\n253#2:274\n233#2,18:275\n253#2:312\n174#3:122\n705#4,2:141\n717#4,2:143\n719#4,11:149\n705#4,2:179\n717#4,2:181\n719#4,11:187\n705#4,2:217\n717#4,2:219\n719#4,11:225\n705#4,2:255\n717#4,2:257\n719#4,11:263\n705#4,2:293\n717#4,2:295\n719#4,11:301\n72#5,4:145\n72#5,4:183\n72#5,4:221\n72#5,4:259\n72#5,4:297\n*S KotlinDebug\n*F\n+ 1 Celebration.kt\nandroidx/compose/material/icons/rounded/CelebrationKt\n*L\n29#1:110,12\n30#1:123,18\n30#1:160\n40#1:161,18\n40#1:198\n56#1:199,18\n56#1:236\n72#1:237,18\n72#1:274\n88#1:275,18\n88#1:312\n29#1:122\n30#1:141,2\n30#1:143,2\n30#1:149,11\n40#1:179,2\n40#1:181,2\n40#1:187,11\n56#1:217,2\n56#1:219,2\n56#1:225,11\n72#1:255,2\n72#1:257,2\n72#1:263,11\n88#1:293,2\n88#1:295,2\n88#1:301,11\n30#1:145,4\n40#1:183,4\n56#1:221,4\n72#1:259,4\n88#1:297,4\n*E\n"})
/* loaded from: classes3.dex */
public final class CelebrationKt {

    @Nullable
    private static ImageVector _celebration;

    @NotNull
    public static final ImageVector getCelebration(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _celebration;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Celebration", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.99f, 21.29f);
        pathBuilder.lineToRelative(9.04f, -3.23f);
        pathBuilder.curveToRelative(1.38f, -0.49f, 1.78f, -2.26f, 0.74f, -3.3f);
        pathBuilder.lineToRelative(-4.53f, -4.53f);
        pathBuilder.curveToRelative(-1.04f, -1.04f, -2.8f, -0.64f, -3.3f, 0.74f);
        pathBuilder.lineToRelative(-3.23f, 9.04f);
        pathBuilder.curveTo(2.43f, 20.81f, 3.19f, 21.57f, 3.99f, 21.29f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(15.06f, 12.0f);
        pathBuilder2.lineToRelative(5.06f, -5.06f);
        pathBuilder2.curveToRelative(0.49f, -0.49f, 1.28f, -0.49f, 1.77f, 0.0f);
        pathBuilder2.lineTo(21.95f, 7.0f);
        pathBuilder2.curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0.0f);
        pathBuilder2.lineToRelative(0.0f, 0.0f);
        pathBuilder2.curveToRelative(0.29f, -0.29f, 0.29f, -0.77f, 0.0f, -1.06f);
        pathBuilder2.lineToRelative(-0.06f, -0.06f);
        pathBuilder2.curveToRelative(-1.07f, -1.07f, -2.82f, -1.07f, -3.89f, 0.0f);
        pathBuilder2.lineTo(14.0f, 10.94f);
        pathBuilder2.curveToRelative(-0.29f, 0.29f, -0.29f, 0.77f, 0.0f, 1.06f);
        pathBuilder2.lineToRelative(0.0f, 0.0f);
        pathBuilder2.curveTo(14.29f, 12.29f, 14.77f, 12.29f, 15.06f, 12.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(10.06f, 6.88f);
        pathBuilder3.lineTo(10.0f, 6.94f);
        pathBuilder3.curveTo(9.71f, 7.23f, 9.71f, 7.71f, 10.0f, 8.0f);
        pathBuilder3.lineToRelative(0.0f, 0.0f);
        pathBuilder3.curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0.0f);
        pathBuilder3.lineToRelative(0.06f, -0.06f);
        pathBuilder3.curveToRelative(1.07f, -1.07f, 1.07f, -2.82f, 0.0f, -3.89f);
        pathBuilder3.lineTo(11.07f, 4.0f);
        pathBuilder3.curveTo(10.77f, 3.7f, 10.29f, 3.7f, 10.0f, 4.0f);
        pathBuilder3.lineToRelative(0.0f, 0.0f);
        pathBuilder3.curveToRelative(-0.29f, 0.29f, -0.29f, 0.77f, 0.0f, 1.06f);
        pathBuilder3.lineToRelative(0.06f, 0.06f);
        pathBuilder3.curveTo(10.54f, 5.6f, 10.54f, 6.4f, 10.06f, 6.88f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(17.06f, 11.88f);
        pathBuilder4.lineTo(16.0f, 12.94f);
        pathBuilder4.curveToRelative(-0.29f, 0.29f, -0.29f, 0.77f, 0.0f, 1.06f);
        pathBuilder4.lineToRelative(0.0f, 0.0f);
        pathBuilder4.curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0.0f);
        pathBuilder4.lineToRelative(1.06f, -1.06f);
        pathBuilder4.curveToRelative(0.49f, -0.49f, 1.28f, -0.49f, 1.77f, 0.0f);
        pathBuilder4.lineToRelative(1.08f, 1.08f);
        pathBuilder4.curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0.0f);
        pathBuilder4.lineToRelative(0.0f, 0.0f);
        pathBuilder4.curveToRelative(0.29f, -0.29f, 0.29f, -0.77f, 0.0f, -1.06f);
        pathBuilder4.lineToRelative(-1.08f, -1.08f);
        pathBuilder4.curveTo(19.87f, 10.81f, 18.13f, 10.81f, 17.06f, 11.88f);
        pathBuilder4.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(15.06f, 5.88f);
        pathBuilder5.lineTo(12.0f, 8.94f);
        pathBuilder5.curveToRelative(-0.29f, 0.29f, -0.29f, 0.77f, 0.0f, 1.06f);
        pathBuilder5.lineToRelative(0.0f, 0.0f);
        pathBuilder5.curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0.0f);
        pathBuilder5.lineToRelative(3.06f, -3.06f);
        pathBuilder5.curveToRelative(1.07f, -1.07f, 1.07f, -2.82f, 0.0f, -3.89f);
        pathBuilder5.lineToRelative(-1.06f, -1.06f);
        pathBuilder5.curveToRelative(-0.29f, -0.29f, -0.77f, -0.29f, -1.06f, 0.0f);
        pathBuilder5.lineToRelative(0.0f, 0.0f);
        pathBuilder5.curveToRelative(-0.29f, 0.29f, -0.29f, 0.77f, 0.0f, 1.06f);
        pathBuilder5.lineToRelative(1.06f, 1.06f);
        pathBuilder5.curveTo(15.54f, 4.6f, 15.54f, 5.4f, 15.06f, 5.88f);
        pathBuilder5.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw5, iM11702getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _celebration = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
