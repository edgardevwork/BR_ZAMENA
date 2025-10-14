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

/* compiled from: KeyOff.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_keyOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "KeyOff", "Landroidx/compose/material/icons/Icons$TwoTone;", "getKeyOff", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nKeyOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyOff.kt\nandroidx/compose/material/icons/twotone/KeyOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,95:1\n212#2,12:96\n233#2,18:109\n253#2:146\n233#2,18:147\n253#2:184\n174#3:108\n705#4,2:127\n717#4,2:129\n719#4,11:135\n705#4,2:165\n717#4,2:167\n719#4,11:173\n72#5,4:131\n72#5,4:169\n*S KotlinDebug\n*F\n+ 1 KeyOff.kt\nandroidx/compose/material/icons/twotone/KeyOffKt\n*L\n29#1:96,12\n30#1:109,18\n30#1:146\n52#1:147,18\n52#1:184\n29#1:108\n30#1:127,2\n30#1:129,2\n30#1:135,11\n52#1:165,2\n52#1:167,2\n52#1:173,11\n30#1:131,4\n52#1:169,4\n*E\n"})
/* loaded from: classes.dex */
public final class KeyOffKt {

    @Nullable
    private static ImageVector _keyOff;

    @NotNull
    public static final ImageVector getKeyOff(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _keyOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.KeyOff", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.7f, 13.53f);
        pathBuilder.lineToRelative(-1.71f, -1.71f);
        pathBuilder.curveTo(9.0f, 11.88f, 9.0f, 11.94f, 9.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.curveToRelative(0.06f, 0.0f, 0.12f, 0.0f, 0.18f, 0.01f);
        pathBuilder.lineTo(5.47f, 8.3f);
        pathBuilder.curveTo(4.02f, 8.9f, 3.0f, 10.33f, 3.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder.curveTo(8.67f, 16.0f, 10.1f, 14.98f, 10.7f, 13.53f);
        pathBuilder.close();
        pathBuilder.moveTo(16.26f, 13.43f);
        pathBuilder.lineToRelative(1.24f, -0.93f);
        pathBuilder.lineToRelative(1.81f, 1.36f);
        pathBuilder.lineTo(21.17f, 12.0f);
        pathBuilder.lineToRelative(-1.0f, -1.0f);
        pathBuilder.lineToRelative(-6.34f, 0.0f);
        pathBuilder.lineTo(16.26f, 13.43f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(10.7f, 13.53f);
        pathBuilder2.lineToRelative(-1.71f, -1.71f);
        pathBuilder2.curveTo(9.0f, 11.88f, 9.0f, 11.94f, 9.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder2.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder2.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder2.curveToRelative(0.06f, 0.0f, 0.12f, 0.0f, 0.18f, 0.01f);
        pathBuilder2.lineTo(5.47f, 8.3f);
        pathBuilder2.curveTo(4.02f, 8.9f, 3.0f, 10.33f, 3.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder2.curveTo(8.67f, 16.0f, 10.1f, 14.98f, 10.7f, 13.53f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.19f, 15.02f);
        pathBuilder2.curveTo(11.15f, 16.8f, 9.21f, 18.0f, 7.0f, 18.0f);
        pathBuilder2.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilder2.curveToRelative(0.0f, -2.21f, 1.2f, -4.15f, 2.98f, -5.19f);
        pathBuilder2.lineTo(1.39f, 4.22f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineToRelative(18.38f, 18.38f);
        pathBuilder2.lineToRelative(-1.41f, 1.41f);
        pathBuilder2.lineTo(12.19f, 15.02f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.26f, 13.43f);
        pathBuilder2.lineToRelative(1.24f, -0.93f);
        pathBuilder2.lineToRelative(1.81f, 1.36f);
        pathBuilder2.lineTo(21.17f, 12.0f);
        pathBuilder2.lineToRelative(-1.0f, -1.0f);
        pathBuilder2.lineToRelative(-6.34f, 0.0f);
        pathBuilder2.lineToRelative(-2.0f, -2.0f);
        pathBuilder2.lineTo(21.0f, 9.0f);
        pathBuilder2.lineToRelative(0.0f, 0.0f);
        pathBuilder2.lineToRelative(3.0f, 3.0f);
        pathBuilder2.lineToRelative(-4.5f, 4.5f);
        pathBuilder2.lineToRelative(-0.69f, -0.51f);
        pathBuilder2.lineTo(16.26f, 13.43f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _keyOff = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
