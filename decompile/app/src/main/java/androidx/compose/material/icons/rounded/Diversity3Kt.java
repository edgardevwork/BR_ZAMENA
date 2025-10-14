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

/* compiled from: Diversity3.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_diversity3", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Diversity3", "Landroidx/compose/material/icons/Icons$Rounded;", "getDiversity3", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDiversity3.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Diversity3.kt\nandroidx/compose/material/icons/rounded/Diversity3Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,95:1\n212#2,12:96\n233#2,18:109\n253#2:146\n233#2,18:147\n253#2:184\n233#2,18:185\n253#2:222\n233#2,18:223\n253#2:260\n233#2,18:261\n253#2:298\n174#3:108\n705#4,2:127\n717#4,2:129\n719#4,11:135\n705#4,2:165\n717#4,2:167\n719#4,11:173\n705#4,2:203\n717#4,2:205\n719#4,11:211\n705#4,2:241\n717#4,2:243\n719#4,11:249\n705#4,2:279\n717#4,2:281\n719#4,11:287\n72#5,4:131\n72#5,4:169\n72#5,4:207\n72#5,4:245\n72#5,4:283\n*S KotlinDebug\n*F\n+ 1 Diversity3.kt\nandroidx/compose/material/icons/rounded/Diversity3Kt\n*L\n29#1:96,12\n30#1:109,18\n30#1:146\n40#1:147,18\n40#1:184\n49#1:185,18\n49#1:222\n58#1:223,18\n58#1:260\n66#1:261,18\n66#1:298\n29#1:108\n30#1:127,2\n30#1:129,2\n30#1:135,11\n40#1:165,2\n40#1:167,2\n40#1:173,11\n49#1:203,2\n49#1:205,2\n49#1:211,11\n58#1:241,2\n58#1:243,2\n58#1:249,11\n66#1:279,2\n66#1:281,2\n66#1:287,11\n30#1:131,4\n40#1:169,4\n49#1:207,4\n58#1:245,4\n66#1:283,4\n*E\n"})
/* loaded from: classes4.dex */
public final class Diversity3Kt {

    @Nullable
    private static ImageVector _diversity3;

    @NotNull
    public static final ImageVector getDiversity3(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _diversity3;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Diversity3", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.32f, 13.01f);
        pathBuilder.curveToRelative(0.96f, 0.02f, 1.85f, 0.5f, 2.45f, 1.34f);
        pathBuilder.curveTo(9.5f, 15.38f, 10.71f, 16.0f, 12.0f, 16.0f);
        pathBuilder.curveToRelative(1.29f, 0.0f, 2.5f, -0.62f, 3.23f, -1.66f);
        pathBuilder.curveToRelative(0.6f, -0.84f, 1.49f, -1.32f, 2.45f, -1.34f);
        pathBuilder.curveTo(16.96f, 11.78f, 14.08f, 11.0f, 12.0f, 11.0f);
        pathBuilder.curveTo(9.93f, 11.0f, 7.04f, 11.78f, 6.32f, 13.01f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(4.0f, 13.0f);
        pathBuilder2.lineTo(4.0f, 13.0f);
        pathBuilder2.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder2.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder2.reflectiveCurveToRelative(-3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilder2.curveTo(1.0f, 11.66f, 2.34f, 13.0f, 4.0f, 13.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(20.0f, 13.0f);
        pathBuilder3.lineTo(20.0f, 13.0f);
        pathBuilder3.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder3.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder3.reflectiveCurveToRelative(-3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilder3.curveTo(17.0f, 11.66f, 18.34f, 13.0f, 20.0f, 13.0f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(12.0f, 10.0f);
        pathBuilder4.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder4.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder4.reflectiveCurveTo(9.0f, 5.34f, 9.0f, 7.0f);
        pathBuilder4.curveTo(9.0f, 8.66f, 10.34f, 10.0f, 12.0f, 10.0f);
        pathBuilder4.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(21.0f, 14.0f);
        pathBuilder5.horizontalLineToRelative(-3.27f);
        pathBuilder5.curveToRelative(-0.77f, 0.0f, -1.35f, 0.45f, -1.68f, 0.92f);
        pathBuilder5.curveTo(16.01f, 14.98f, 14.69f, 17.0f, 12.0f, 17.0f);
        pathBuilder5.curveToRelative(-1.43f, 0.0f, -3.03f, -0.64f, -4.05f, -2.08f);
        pathBuilder5.curveTo(7.56f, 14.37f, 6.95f, 14.0f, 6.27f, 14.0f);
        pathBuilder5.lineTo(3.0f, 14.0f);
        pathBuilder5.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder5.verticalLineToRelative(3.0f);
        pathBuilder5.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder5.horizontalLineToRelative(5.0f);
        pathBuilder5.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder5.verticalLineToRelative(-1.26f);
        pathBuilder5.curveToRelative(1.15f, 0.8f, 2.54f, 1.26f, 4.0f, 1.26f);
        pathBuilder5.reflectiveCurveToRelative(2.85f, -0.46f, 4.0f, -1.26f);
        pathBuilder5.verticalLineTo(19.0f);
        pathBuilder5.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder5.horizontalLineToRelative(5.0f);
        pathBuilder5.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder5.verticalLineToRelative(-3.0f);
        pathBuilder5.curveTo(23.0f, 14.9f, 22.1f, 14.0f, 21.0f, 14.0f);
        pathBuilder5.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw5, iM11702getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _diversity3 = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
