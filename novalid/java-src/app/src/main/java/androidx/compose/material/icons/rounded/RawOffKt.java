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

/* compiled from: RawOff.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_rawOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RawOff", "Landroidx/compose/material/icons/Icons$Rounded;", "getRawOff", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nRawOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RawOff.kt\nandroidx/compose/material/icons/rounded/RawOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,95:1\n212#2,12:96\n233#2,18:109\n253#2:146\n233#2,18:147\n253#2:184\n174#3:108\n705#4,2:127\n717#4,2:129\n719#4,11:135\n705#4,2:165\n717#4,2:167\n719#4,11:173\n72#5,4:131\n72#5,4:169\n*S KotlinDebug\n*F\n+ 1 RawOff.kt\nandroidx/compose/material/icons/rounded/RawOffKt\n*L\n29#1:96,12\n30#1:109,18\n30#1:146\n52#1:147,18\n52#1:184\n29#1:108\n30#1:127,2\n30#1:129,2\n30#1:135,11\n52#1:165,2\n52#1:167,2\n52#1:173,11\n30#1:131,4\n52#1:169,4\n*E\n"})
/* loaded from: classes2.dex */
public final class RawOffKt {

    @Nullable
    private static ImageVector _rawOff;

    @NotNull
    public static final ImageVector getRawOff(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _rawOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RawOff", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.55f, 9.0f);
        pathBuilder.curveToRelative(-0.33f, 0.0f, -0.63f, 0.23f, -0.71f, 0.55f);
        pathBuilder.lineTo(19.24f, 12.0f);
        pathBuilder.lineToRelative(-0.56f, -2.26f);
        pathBuilder.curveTo(18.58f, 9.3f, 18.19f, 9.0f, 17.74f, 9.0f);
        pathBuilder.reflectiveCurveTo(16.9f, 9.3f, 16.8f, 9.74f);
        pathBuilder.lineTo(16.24f, 12.0f);
        pathBuilder.lineToRelative(-0.6f, -2.45f);
        pathBuilder.curveTo(15.56f, 9.23f, 15.27f, 9.0f, 14.93f, 9.0f);
        pathBuilder.curveToRelative(-0.47f, 0.0f, -0.82f, 0.44f, -0.71f, 0.9f);
        pathBuilder.lineToRelative(0.5f, 1.99f);
        pathBuilder.lineToRelative(2.42f, 2.42f);
        pathBuilder.curveToRelative(0.0f, -0.01f, 0.01f, -0.02f, 0.01f, -0.03f);
        pathBuilder.lineToRelative(0.58f, -2.32f);
        pathBuilder.lineToRelative(0.58f, 2.32f);
        pathBuilder.curveTo(18.43f, 14.7f, 18.81f, 15.0f, 19.24f, 15.0f);
        pathBuilder.reflectiveCurveToRelative(0.81f, -0.3f, 0.92f, -0.72f);
        pathBuilder.lineToRelative(1.09f, -4.38f);
        pathBuilder.curveTo(21.37f, 9.44f, 21.02f, 9.0f, 20.55f, 9.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(3.51f, 3.51f);
        pathBuilder2.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder2.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder2.lineTo(6.17f, 9.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder2.verticalLineToRelative(4.31f);
        pathBuilder2.curveTo(3.0f, 14.69f, 3.31f, 15.0f, 3.69f, 15.0f);
        pathBuilder2.horizontalLineToRelative(0.11f);
        pathBuilder2.curveToRelative(0.38f, 0.0f, 0.69f, -0.31f, 0.69f, -0.69f);
        pathBuilder2.verticalLineTo(13.0f);
        pathBuilder2.horizontalLineToRelative(1.1f);
        pathBuilder2.lineToRelative(0.72f, 1.59f);
        pathBuilder2.curveTo(6.43f, 14.84f, 6.68f, 15.0f, 6.95f, 15.0f);
        pathBuilder2.curveToRelative(0.5f, 0.0f, 0.83f, -0.51f, 0.64f, -0.97f);
        pathBuilder2.lineTo(7.1f, 12.9f);
        pathBuilder2.curveTo(7.6f, 12.6f, 8.0f, 12.1f, 8.0f, 11.5f);
        pathBuilder2.verticalLineToRelative(-0.67f);
        pathBuilder2.lineToRelative(1.43f, 1.43f);
        pathBuilder2.lineTo(8.98f, 14.1f);
        pathBuilder2.curveTo(8.86f, 14.56f, 9.21f, 15.0f, 9.68f, 15.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.33f, 0.0f, 0.62f, -0.23f, 0.7f, -0.55f);
        pathBuilder2.lineToRelative(0.24f, -0.95f);
        pathBuilder2.horizontalLineToRelative(0.04f);
        pathBuilder2.lineToRelative(8.4f, 8.4f);
        pathBuilder2.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder2.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder2.lineTo(3.51f, 3.51f);
        pathBuilder2.close();
        pathBuilder2.moveTo(6.5f, 11.5f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.verticalLineToRelative(-1.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineTo(11.5f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rawOff = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
