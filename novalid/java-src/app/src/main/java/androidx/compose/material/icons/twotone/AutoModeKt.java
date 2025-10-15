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

/* compiled from: AutoMode.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_autoMode", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AutoMode", "Landroidx/compose/material/icons/Icons$TwoTone;", "getAutoMode", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAutoMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoMode.kt\nandroidx/compose/material/icons/twotone/AutoModeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,93:1\n212#2,12:94\n233#2,18:107\n253#2:144\n233#2,18:145\n253#2:182\n233#2,18:183\n253#2:220\n233#2,18:221\n253#2:258\n233#2,18:259\n253#2:296\n233#2,18:297\n253#2:334\n174#3:106\n705#4,2:125\n717#4,2:127\n719#4,11:133\n705#4,2:163\n717#4,2:165\n719#4,11:171\n705#4,2:201\n717#4,2:203\n719#4,11:209\n705#4,2:239\n717#4,2:241\n719#4,11:247\n705#4,2:277\n717#4,2:279\n719#4,11:285\n705#4,2:315\n717#4,2:317\n719#4,11:323\n72#5,4:129\n72#5,4:167\n72#5,4:205\n72#5,4:243\n72#5,4:281\n72#5,4:319\n*S KotlinDebug\n*F\n+ 1 AutoMode.kt\nandroidx/compose/material/icons/twotone/AutoModeKt\n*L\n29#1:94,12\n30#1:107,18\n30#1:144\n38#1:145,18\n38#1:182\n46#1:183,18\n46#1:220\n54#1:221,18\n54#1:258\n62#1:259,18\n62#1:296\n73#1:297,18\n73#1:334\n29#1:106\n30#1:125,2\n30#1:127,2\n30#1:133,11\n38#1:163,2\n38#1:165,2\n38#1:171,11\n46#1:201,2\n46#1:203,2\n46#1:209,11\n54#1:239,2\n54#1:241,2\n54#1:247,11\n62#1:277,2\n62#1:279,2\n62#1:285,11\n73#1:315,2\n73#1:317,2\n73#1:323,11\n30#1:129,4\n38#1:167,4\n46#1:205,4\n54#1:243,4\n62#1:281,4\n73#1:319,4\n*E\n"})
/* loaded from: classes.dex */
public final class AutoModeKt {

    @Nullable
    private static ImageVector _autoMode;

    @NotNull
    public static final ImageVector getAutoMode(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _autoMode;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AutoMode", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.03f, 3.56f);
        pathBuilder.curveToRelative(-1.67f, -1.39f, -3.74f, -2.3f, -6.03f, -2.51f);
        pathBuilder.verticalLineToRelative(2.01f);
        pathBuilder.curveToRelative(1.73f, 0.19f, 3.31f, 0.88f, 4.61f, 1.92f);
        pathBuilder.lineTo(19.03f, 3.56f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(11.0f, 3.06f);
        pathBuilder2.verticalLineTo(1.05f);
        pathBuilder2.curveTo(8.71f, 1.25f, 6.64f, 2.17f, 4.97f, 3.56f);
        pathBuilder2.lineToRelative(1.42f, 1.42f);
        pathBuilder2.curveTo(7.69f, 3.94f, 9.27f, 3.25f, 11.0f, 3.06f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(4.98f, 6.39f);
        pathBuilder3.lineTo(3.56f, 4.97f);
        pathBuilder3.curveTo(2.17f, 6.64f, 1.26f, 8.71f, 1.05f, 11.0f);
        pathBuilder3.horizontalLineToRelative(2.01f);
        pathBuilder3.curveTo(3.25f, 9.27f, 3.94f, 7.69f, 4.98f, 6.39f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(20.94f, 11.0f);
        pathBuilder4.horizontalLineToRelative(2.01f);
        pathBuilder4.curveToRelative(-0.21f, -2.29f, -1.12f, -4.36f, -2.51f, -6.03f);
        pathBuilder4.lineToRelative(-1.42f, 1.42f);
        pathBuilder4.curveTo(20.06f, 7.69f, 20.75f, 9.27f, 20.94f, 11.0f);
        pathBuilder4.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(7.0f, 12.0f);
        pathBuilder5.lineToRelative(3.44f, 1.56f);
        pathBuilder5.lineToRelative(1.56f, 3.44f);
        pathBuilder5.lineToRelative(1.56f, -3.44f);
        pathBuilder5.lineToRelative(3.44f, -1.56f);
        pathBuilder5.lineToRelative(-3.44f, -1.56f);
        pathBuilder5.lineToRelative(-1.56f, -3.44f);
        pathBuilder5.lineToRelative(-1.56f, 3.44f);
        pathBuilder5.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw5, iM11702getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType6 = VectorKt.getDefaultFillType();
        SolidColor solidColor6 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw6 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk86 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(12.0f, 21.0f);
        pathBuilder6.curveToRelative(-3.11f, 0.0f, -5.85f, -1.59f, -7.46f, -4.0f);
        pathBuilder6.horizontalLineTo(7.0f);
        pathBuilder6.verticalLineToRelative(-2.0f);
        pathBuilder6.horizontalLineTo(1.0f);
        pathBuilder6.verticalLineToRelative(6.0f);
        pathBuilder6.horizontalLineToRelative(2.0f);
        pathBuilder6.verticalLineToRelative(-2.7f);
        pathBuilder6.curveToRelative(1.99f, 2.84f, 5.27f, 4.7f, 9.0f, 4.7f);
        pathBuilder6.curveToRelative(4.87f, 0.0f, 9.0f, -3.17f, 10.44f, -7.56f);
        pathBuilder6.lineToRelative(-1.96f, -0.45f);
        pathBuilder6.curveTo(19.25f, 18.48f, 15.92f, 21.0f, 12.0f, 21.0f);
        pathBuilder6.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder6.getNodes(), defaultFillType6, "", solidColor6, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw6, iM11702getBevelLxFBmk86, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoMode = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
