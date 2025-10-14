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

/* compiled from: Diamond.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_diamond", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Diamond", "Landroidx/compose/material/icons/Icons$TwoTone;", "getDiamond", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDiamond.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Diamond.kt\nandroidx/compose/material/icons/twotone/DiamondKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,105:1\n212#2,12:106\n233#2,18:119\n253#2:156\n233#2,18:157\n253#2:194\n233#2,18:195\n253#2:232\n233#2,18:233\n253#2:270\n233#2,18:271\n253#2:308\n233#2,18:309\n253#2:346\n174#3:118\n705#4,2:137\n717#4,2:139\n719#4,11:145\n705#4,2:175\n717#4,2:177\n719#4,11:183\n705#4,2:213\n717#4,2:215\n719#4,11:221\n705#4,2:251\n717#4,2:253\n719#4,11:259\n705#4,2:289\n717#4,2:291\n719#4,11:297\n705#4,2:327\n717#4,2:329\n719#4,11:335\n72#5,4:141\n72#5,4:179\n72#5,4:217\n72#5,4:255\n72#5,4:293\n72#5,4:331\n*S KotlinDebug\n*F\n+ 1 Diamond.kt\nandroidx/compose/material/icons/twotone/DiamondKt\n*L\n29#1:106,12\n30#1:119,18\n30#1:156\n37#1:157,18\n37#1:194\n44#1:195,18\n44#1:232\n50#1:233,18\n50#1:270\n56#1:271,18\n56#1:308\n63#1:309,18\n63#1:346\n29#1:118\n30#1:137,2\n30#1:139,2\n30#1:145,11\n37#1:175,2\n37#1:177,2\n37#1:183,11\n44#1:213,2\n44#1:215,2\n44#1:221,11\n50#1:251,2\n50#1:253,2\n50#1:259,11\n56#1:289,2\n56#1:291,2\n56#1:297,11\n63#1:327,2\n63#1:329,2\n63#1:335,11\n30#1:141,4\n37#1:179,4\n44#1:217,4\n50#1:255,4\n56#1:293,4\n63#1:331,4\n*E\n"})
/* loaded from: classes.dex */
public final class DiamondKt {

    @Nullable
    private static ImageVector _diamond;

    @NotNull
    public static final ImageVector getDiamond(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _diamond;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Diamond", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.88f, 5.0f);
        pathBuilder.lineToRelative(-2.64f, 0.0f);
        pathBuilder.lineToRelative(-1.5f, 3.0f);
        pathBuilder.lineToRelative(2.64f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(19.26f, 8.0f);
        pathBuilder2.lineToRelative(-1.5f, -3.0f);
        pathBuilder2.lineToRelative(-2.64f, 0.0f);
        pathBuilder2.lineToRelative(1.5f, 3.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(11.0f, 16.68f);
        pathBuilder3.lineToRelative(0.0f, -6.68f);
        pathBuilder3.lineToRelative(-5.56f, 0.0f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(13.0f, 16.68f);
        pathBuilder4.lineToRelative(5.56f, -6.68f);
        pathBuilder4.lineToRelative(-5.56f, 0.0f);
        pathBuilder4.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(12.88f, 5.0f);
        pathBuilder5.lineToRelative(-1.76f, 0.0f);
        pathBuilder5.lineToRelative(-1.5f, 3.0f);
        pathBuilder5.lineToRelative(4.76f, 0.0f);
        pathBuilder5.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw5, iM11702getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType6 = VectorKt.getDefaultFillType();
        SolidColor solidColor6 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw6 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk86 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(19.0f, 3.0f);
        pathBuilder6.horizontalLineTo(5.0f);
        pathBuilder6.lineTo(2.0f, 9.0f);
        pathBuilder6.lineToRelative(10.0f, 12.0f);
        pathBuilder6.lineTo(22.0f, 9.0f);
        pathBuilder6.lineTo(19.0f, 3.0f);
        pathBuilder6.close();
        pathBuilder6.moveTo(17.76f, 5.0f);
        pathBuilder6.lineToRelative(1.5f, 3.0f);
        pathBuilder6.horizontalLineToRelative(-2.65f);
        pathBuilder6.lineToRelative(-1.5f, -3.0f);
        pathBuilder6.horizontalLineTo(17.76f);
        pathBuilder6.close();
        pathBuilder6.moveTo(6.24f, 5.0f);
        pathBuilder6.horizontalLineToRelative(2.65f);
        pathBuilder6.lineToRelative(-1.5f, 3.0f);
        pathBuilder6.horizontalLineTo(4.74f);
        pathBuilder6.lineTo(6.24f, 5.0f);
        pathBuilder6.close();
        pathBuilder6.moveTo(11.0f, 16.68f);
        pathBuilder6.lineTo(5.44f, 10.0f);
        pathBuilder6.horizontalLineTo(11.0f);
        pathBuilder6.verticalLineTo(16.68f);
        pathBuilder6.close();
        pathBuilder6.moveTo(9.62f, 8.0f);
        pathBuilder6.lineToRelative(1.5f, -3.0f);
        pathBuilder6.horizontalLineToRelative(1.76f);
        pathBuilder6.lineToRelative(1.5f, 3.0f);
        pathBuilder6.horizontalLineTo(9.62f);
        pathBuilder6.close();
        pathBuilder6.moveTo(13.0f, 16.68f);
        pathBuilder6.verticalLineTo(10.0f);
        pathBuilder6.horizontalLineToRelative(5.56f);
        pathBuilder6.lineTo(13.0f, 16.68f);
        pathBuilder6.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder6.getNodes(), defaultFillType6, "", solidColor6, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw6, iM11702getBevelLxFBmk86, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _diamond = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
