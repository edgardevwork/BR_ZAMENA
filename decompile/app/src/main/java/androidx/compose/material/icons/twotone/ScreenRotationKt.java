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

/* compiled from: ScreenRotation.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_screenRotation", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ScreenRotation", "Landroidx/compose/material/icons/Icons$TwoTone;", "getScreenRotation", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nScreenRotation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenRotation.kt\nandroidx/compose/material/icons/twotone/ScreenRotationKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,76:1\n212#2,12:77\n233#2,18:90\n253#2:127\n233#2,18:128\n253#2:165\n174#3:89\n705#4,2:108\n717#4,2:110\n719#4,11:116\n705#4,2:146\n717#4,2:148\n719#4,11:154\n72#5,4:112\n72#5,4:150\n*S KotlinDebug\n*F\n+ 1 ScreenRotation.kt\nandroidx/compose/material/icons/twotone/ScreenRotationKt\n*L\n29#1:77,12\n30#1:90,18\n30#1:127\n37#1:128,18\n37#1:165\n29#1:89\n30#1:108,2\n30#1:110,2\n30#1:116,11\n37#1:146,2\n37#1:148,2\n37#1:154,11\n30#1:112,4\n37#1:150,4\n*E\n"})
/* loaded from: classes4.dex */
public final class ScreenRotationKt {

    @Nullable
    private static ImageVector _screenRotation;

    @NotNull
    public static final ImageVector getScreenRotation(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _screenRotation;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ScreenRotation", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.828f, 21.192f);
        pathBuilder.lineTo(2.808f, 9.172f);
        pathBuilder.lineToRelative(6.357f, -6.357f);
        pathBuilder.lineToRelative(12.02f, 12.02f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(16.48f, 2.52f);
        pathBuilder2.curveToRelative(3.27f, 1.55f, 5.61f, 4.72f, 5.97f, 8.48f);
        pathBuilder2.horizontalLineToRelative(1.5f);
        pathBuilder2.curveTo(23.44f, 4.84f, 18.29f, 0.0f, 12.0f, 0.0f);
        pathBuilder2.lineToRelative(-0.66f, 0.03f);
        pathBuilder2.lineToRelative(3.81f, 3.81f);
        pathBuilder2.lineToRelative(1.33f, -1.32f);
        pathBuilder2.close();
        pathBuilder2.moveTo(10.23f, 1.75f);
        pathBuilder2.curveToRelative(-0.59f, -0.59f, -1.54f, -0.59f, -2.12f, 0.0f);
        pathBuilder2.lineTo(1.75f, 8.11f);
        pathBuilder2.curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0.0f, 2.12f);
        pathBuilder2.lineToRelative(12.02f, 12.02f);
        pathBuilder2.curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0.0f);
        pathBuilder2.lineToRelative(6.36f, -6.36f);
        pathBuilder2.curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0.0f, -2.12f);
        pathBuilder2.lineTo(10.23f, 1.75f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.83f, 21.19f);
        pathBuilder2.lineTo(2.81f, 9.17f);
        pathBuilder2.lineToRelative(6.36f, -6.36f);
        pathBuilder2.lineToRelative(12.02f, 12.02f);
        pathBuilder2.lineToRelative(-6.36f, 6.36f);
        pathBuilder2.close();
        pathBuilder2.moveTo(7.52f, 21.48f);
        pathBuilder2.curveTo(4.25f, 19.94f, 1.91f, 16.76f, 1.55f, 13.0f);
        pathBuilder2.lineTo(0.05f, 13.0f);
        pathBuilder2.curveTo(0.56f, 19.16f, 5.71f, 24.0f, 12.0f, 24.0f);
        pathBuilder2.lineToRelative(0.66f, -0.03f);
        pathBuilder2.lineToRelative(-3.81f, -3.81f);
        pathBuilder2.lineToRelative(-1.33f, 1.32f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _screenRotation = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
