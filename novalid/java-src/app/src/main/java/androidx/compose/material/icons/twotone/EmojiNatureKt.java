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

/* compiled from: EmojiNature.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_emojiNature", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EmojiNature", "Landroidx/compose/material/icons/Icons$TwoTone;", "getEmojiNature", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nEmojiNature.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiNature.kt\nandroidx/compose/material/icons/twotone/EmojiNatureKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,138:1\n212#2,12:139\n233#2,18:152\n253#2:189\n233#2,18:190\n253#2:227\n233#2,18:228\n253#2:265\n233#2,18:266\n253#2:303\n233#2,18:304\n253#2:341\n174#3:151\n705#4,2:170\n717#4,2:172\n719#4,11:178\n705#4,2:208\n717#4,2:210\n719#4,11:216\n705#4,2:246\n717#4,2:248\n719#4,11:254\n705#4,2:284\n717#4,2:286\n719#4,11:292\n705#4,2:322\n717#4,2:324\n719#4,11:330\n72#5,4:174\n72#5,4:212\n72#5,4:250\n72#5,4:288\n72#5,4:326\n*S KotlinDebug\n*F\n+ 1 EmojiNature.kt\nandroidx/compose/material/icons/twotone/EmojiNatureKt\n*L\n29#1:139,12\n30#1:152,18\n30#1:189\n36#1:190,18\n36#1:227\n67#1:228,18\n67#1:265\n75#1:266,18\n75#1:303\n84#1:304,18\n84#1:341\n29#1:151\n30#1:170,2\n30#1:172,2\n30#1:178,11\n36#1:208,2\n36#1:210,2\n36#1:216,11\n67#1:246,2\n67#1:248,2\n67#1:254,11\n75#1:284,2\n75#1:286,2\n75#1:292,11\n84#1:322,2\n84#1:324,2\n84#1:330,11\n30#1:174,4\n36#1:212,4\n67#1:250,4\n75#1:288,4\n84#1:326,4\n*E\n"})
/* loaded from: classes4.dex */
public final class EmojiNatureKt {

    @Nullable
    private static ImageVector _emojiNature;

    @NotNull
    public static final ImageVector getEmojiNature(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _emojiNature;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.EmojiNature", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 6.0f);
        pathBuilder.moveToRelative(-1.0f, 0.0f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(21.94f, 4.88f);
        pathBuilder2.curveTo(21.75f, 4.33f, 21.19f, 3.96f, 20.58f, 4.0f);
        pathBuilder2.horizontalLineTo(19.6f);
        pathBuilder2.lineToRelative(-0.31f, -0.97f);
        pathBuilder2.curveTo(19.15f, 2.43f, 18.61f, 2.0f, 18.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(-0.61f, 0.0f, -1.15f, 0.43f, -1.29f, 1.04f);
        pathBuilder2.lineTo(16.4f, 4.0f);
        pathBuilder2.horizontalLineToRelative(-0.98f);
        pathBuilder2.curveToRelative(-0.61f, -0.04f, -1.16f, 0.32f, -1.35f, 0.88f);
        pathBuilder2.curveToRelative(-0.19f, 0.56f, 0.04f, 1.17f, 0.56f, 1.48f);
        pathBuilder2.lineToRelative(0.87f, 0.52f);
        pathBuilder2.lineTo(15.1f, 8.12f);
        pathBuilder2.curveToRelative(-0.23f, 0.58f, -0.04f, 1.25f, 0.45f, 1.62f);
        pathBuilder2.curveToRelative(0.5f, 0.37f, 1.17f, 0.35f, 1.64f, -0.06f);
        pathBuilder2.lineTo(18.0f, 8.98f);
        pathBuilder2.lineToRelative(0.81f, 0.7f);
        pathBuilder2.curveToRelative(0.47f, 0.4f, 1.15f, 0.43f, 1.64f, 0.06f);
        pathBuilder2.curveToRelative(0.5f, -0.37f, 0.68f, -1.04f, 0.45f, -1.62f);
        pathBuilder2.lineToRelative(-0.39f, -1.24f);
        pathBuilder2.lineToRelative(0.87f, -0.52f);
        pathBuilder2.curveTo(21.89f, 6.05f, 22.12f, 5.44f, 21.94f, 4.88f);
        pathBuilder2.close();
        pathBuilder2.moveTo(18.0f, 7.0f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder2.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder2.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder2.curveTo(19.0f, 6.55f, 18.55f, 7.0f, 18.0f, 7.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(6.1f, 17.9f);
        pathBuilder3.curveToRelative(0.53f, 0.53f, 1.27f, 0.69f, 1.94f, 0.5f);
        pathBuilder3.curveToRelative(-0.03f, -1.19f, 0.35f, -2.37f, 0.92f, -3.36f);
        pathBuilder3.curveToRelative(-1.0f, 0.57f, -2.17f, 0.95f, -3.36f, 0.92f);
        pathBuilder3.curveTo(5.41f, 16.63f, 5.58f, 17.37f, 6.1f, 17.9f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(9.65f, 11.55f);
        pathBuilder4.lineToRelative(1.61f, 0.66f);
        pathBuilder4.curveToRelative(0.25f, 0.1f, 0.44f, 0.3f, 0.54f, 0.54f);
        pathBuilder4.lineToRelative(0.66f, 1.61f);
        pathBuilder4.curveToRelative(0.75f, -0.78f, 0.74f, -2.01f, -0.03f, -2.78f);
        pathBuilder4.curveTo(11.66f, 10.8f, 10.43f, 10.8f, 9.65f, 11.55f);
        pathBuilder4.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(14.86f, 12.0f);
        pathBuilder5.curveToRelative(-0.17f, -0.67f, -0.5f, -1.31f, -1.03f, -1.84f);
        pathBuilder5.curveTo(13.31f, 9.64f, 12.67f, 9.31f, 12.0f, 9.14f);
        pathBuilder5.verticalLineTo(7.0f);
        pathBuilder5.horizontalLineToRelative(-1.0f);
        pathBuilder5.verticalLineToRelative(2.0f);
        pathBuilder5.curveToRelative(-1.01f, 0.01f, -2.02f, 0.39f, -2.79f, 1.16f);
        pathBuilder5.curveToRelative(-0.13f, 0.13f, -0.33f, 0.33f, -0.56f, 0.56f);
        pathBuilder5.lineToRelative(-1.53f, -0.63f);
        pathBuilder5.curveToRelative(-1.52f, -0.63f, -3.27f, 0.1f, -3.89f, 1.62f);
        pathBuilder5.curveToRelative(-0.6f, 1.46f, 0.05f, 3.11f, 1.44f, 3.8f);
        pathBuilder5.curveToRelative(-0.33f, 1.31f, 0.0f, 2.76f, 1.03f, 3.79f);
        pathBuilder5.curveToRelative(1.03f, 1.03f, 2.48f, 1.36f, 3.79f, 1.03f);
        pathBuilder5.curveToRelative(0.69f, 1.39f, 2.34f, 2.04f, 3.8f, 1.44f);
        pathBuilder5.curveToRelative(1.52f, -0.63f, 2.25f, -2.37f, 1.62f, -3.89f);
        pathBuilder5.lineToRelative(-0.63f, -1.53f);
        pathBuilder5.curveToRelative(0.23f, -0.23f, 0.43f, -0.43f, 0.56f, -0.56f);
        pathBuilder5.curveToRelative(0.77f, -0.77f, 1.16f, -1.78f, 1.16f, -2.79f);
        pathBuilder5.horizontalLineToRelative(2.0f);
        pathBuilder5.verticalLineToRelative(-1.0f);
        pathBuilder5.horizontalLineTo(14.86f);
        pathBuilder5.close();
        pathBuilder5.moveTo(4.58f, 13.8f);
        pathBuilder5.curveToRelative(-0.51f, -0.21f, -0.75f, -0.79f, -0.54f, -1.3f);
        pathBuilder5.curveToRelative(0.21f, -0.51f, 0.79f, -0.75f, 1.3f, -0.54f);
        pathBuilder5.lineToRelative(2.92f, 1.2f);
        pathBuilder5.curveTo(7.22f, 13.84f, 5.83f, 14.31f, 4.58f, 13.8f);
        pathBuilder5.close();
        pathBuilder5.moveTo(8.04f, 18.4f);
        pathBuilder5.curveToRelative(-0.67f, 0.19f, -1.41f, 0.02f, -1.94f, -0.5f);
        pathBuilder5.curveToRelative(-0.53f, -0.53f, -0.69f, -1.27f, -0.5f, -1.94f);
        pathBuilder5.curveToRelative(1.19f, 0.03f, 2.37f, -0.35f, 3.36f, -0.92f);
        pathBuilder5.curveTo(8.39f, 16.03f, 8.01f, 17.21f, 8.04f, 18.4f);
        pathBuilder5.close();
        pathBuilder5.moveTo(11.5f, 19.96f);
        pathBuilder5.curveToRelative(-0.51f, 0.21f, -1.09f, -0.03f, -1.3f, -0.54f);
        pathBuilder5.curveToRelative(-0.51f, -1.25f, -0.04f, -2.64f, 0.64f, -3.67f);
        pathBuilder5.lineToRelative(1.2f, 2.92f);
        pathBuilder5.curveTo(12.25f, 19.17f, 12.01f, 19.76f, 11.5f, 19.96f);
        pathBuilder5.close();
        pathBuilder5.moveTo(12.45f, 14.35f);
        pathBuilder5.lineToRelative(-0.66f, -1.61f);
        pathBuilder5.curveToRelative(-0.1f, -0.25f, -0.3f, -0.44f, -0.54f, -0.54f);
        pathBuilder5.lineToRelative(-1.61f, -0.66f);
        pathBuilder5.curveToRelative(0.78f, -0.75f, 2.01f, -0.74f, 2.78f, 0.03f);
        pathBuilder5.curveTo(13.2f, 12.34f, 13.2f, 13.57f, 12.45f, 14.35f);
        pathBuilder5.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw5, iM11702getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emojiNature = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
