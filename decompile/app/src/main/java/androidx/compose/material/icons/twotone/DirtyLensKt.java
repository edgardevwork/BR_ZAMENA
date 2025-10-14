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

/* compiled from: DirtyLens.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_dirtyLens", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DirtyLens", "Landroidx/compose/material/icons/Icons$TwoTone;", "getDirtyLens", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDirtyLens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DirtyLens.kt\nandroidx/compose/material/icons/twotone/DirtyLensKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,123:1\n212#2,12:124\n233#2,18:137\n253#2:174\n233#2,18:175\n253#2:212\n233#2,18:213\n253#2:250\n174#3:136\n705#4,2:155\n717#4,2:157\n719#4,11:163\n705#4,2:193\n717#4,2:195\n719#4,11:201\n705#4,2:231\n717#4,2:233\n719#4,11:239\n72#5,4:159\n72#5,4:197\n72#5,4:235\n*S KotlinDebug\n*F\n+ 1 DirtyLens.kt\nandroidx/compose/material/icons/twotone/DirtyLensKt\n*L\n29#1:124,12\n30#1:137,18\n30#1:174\n66#1:175,18\n66#1:212\n110#1:213,18\n110#1:250\n29#1:136\n30#1:155,2\n30#1:157,2\n30#1:163,11\n66#1:193,2\n66#1:195,2\n66#1:201,11\n110#1:231,2\n110#1:233,2\n110#1:239,11\n30#1:159,4\n66#1:197,4\n110#1:235,4\n*E\n"})
/* loaded from: classes.dex */
public final class DirtyLensKt {

    @Nullable
    private static ImageVector _dirtyLens;

    @NotNull
    public static final ImageVector getDirtyLens(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _dirtyLens;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.DirtyLens", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.12f, 5.0f);
        pathBuilder.horizontalLineTo(9.88f);
        pathBuilder.lineTo(8.05f, 7.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.horizontalLineToRelative(7.27f);
        pathBuilder.curveToRelative(0.14f, -0.98f, 0.42f, -2.05f, -0.16f, -2.43f);
        pathBuilder.curveToRelative(-0.89f, -0.59f, -1.27f, 2.06f, -2.8f, 1.35f);
        pathBuilder.curveToRelative(-1.39f, -1.12f, 1.05f, -1.29f, 0.5f, -3.27f);
        pathBuilder.curveToRelative(-0.22f, -0.79f, -2.28f, 0.36f, -2.4f, -1.24f);
        pathBuilder.curveToRelative(-0.08f, -1.0f, 1.49f, -0.74f, 1.51f, -1.49f);
        pathBuilder.curveToRelative(0.03f, -0.75f, -1.03f, -1.05f, -0.25f, -1.91f);
        pathBuilder.curveToRelative(0.22f, -0.24f, 0.71f, -0.26f, 0.91f, -0.19f);
        pathBuilder.curveToRelative(0.79f, 0.27f, 1.55f, 1.82f, 2.51f, 1.19f);
        pathBuilder.curveToRelative(1.03f, -0.66f, -1.88f, -2.35f, 0.0f, -2.86f);
        pathBuilder.curveToRelative(1.64f, -0.44f, 1.31f, 2.08f, 2.65f, 2.44f);
        pathBuilder.curveToRelative(1.94f, 0.52f, 2.65f, -4.55f, 4.41f, -2.33f);
        pathBuilder.curveToRelative(1.85f, 2.33f, -3.43f, 2.27f, -2.85f, 4.01f);
        pathBuilder.curveToRelative(0.34f, 1.01f, 2.15f, -1.2f, 2.76f, 0.53f);
        pathBuilder.curveToRelative(0.64f, 1.83f, -3.09f, 0.82f, -3.04f, 1.66f);
        pathBuilder.curveToRelative(0.06f, 0.83f, 2.41f, 0.55f, 1.64f, 2.12f);
        pathBuilder.curveToRelative(-1.14f, 1.86f, -3.0f, -1.03f, -3.81f, 0.09f);
        pathBuilder.curveToRelative(-0.39f, 0.57f, -0.09f, 1.49f, 0.13f, 2.33f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(-4.05f);
        pathBuilder.lineTo(14.12f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 17.15f);
        pathBuilder.curveToRelative(0.0f, 0.48f, -0.38f, 0.86f, -0.86f, 0.86f);
        pathBuilder.curveToRelative(-0.47f, 0.0f, -0.86f, -0.38f, -0.86f, -0.86f);
        pathBuilder.reflectiveCurveToRelative(0.38f, -0.86f, 0.86f, -0.86f);
        pathBuilder.curveTo(18.61f, 16.29f, 19.0f, 16.67f, 19.0f, 17.15f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.0f, 5.0f);
        pathBuilder2.horizontalLineToRelative(-3.17f);
        pathBuilder2.lineTo(15.0f, 3.0f);
        pathBuilder2.horizontalLineTo(9.0f);
        pathBuilder2.lineTo(7.17f, 5.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.curveTo(2.9f, 5.0f, 2.0f, 5.9f, 2.0f, 7.0f);
        pathBuilder2.verticalLineToRelative(12.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.verticalLineTo(7.0f);
        pathBuilder2.curveTo(22.0f, 5.9f, 21.1f, 5.0f, 20.0f, 5.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.0f, 19.0f);
        pathBuilder2.horizontalLineToRelative(-7.02f);
        pathBuilder2.curveToRelative(-0.22f, -0.84f, -0.52f, -1.76f, -0.13f, -2.33f);
        pathBuilder2.curveToRelative(0.81f, -1.12f, 2.67f, 1.77f, 3.81f, -0.09f);
        pathBuilder2.curveToRelative(0.77f, -1.57f, -1.58f, -1.29f, -1.64f, -2.12f);
        pathBuilder2.curveToRelative(-0.05f, -0.84f, 3.68f, 0.17f, 3.04f, -1.66f);
        pathBuilder2.curveToRelative(-0.61f, -1.73f, -2.42f, 0.48f, -2.76f, -0.53f);
        pathBuilder2.curveToRelative(-0.58f, -1.74f, 4.7f, -1.68f, 2.85f, -4.01f);
        pathBuilder2.curveToRelative(-1.76f, -2.22f, -2.47f, 2.85f, -4.41f, 2.33f);
        pathBuilder2.curveToRelative(-1.34f, -0.36f, -1.01f, -2.88f, -2.65f, -2.44f);
        pathBuilder2.curveToRelative(-1.88f, 0.51f, 1.03f, 2.2f, 0.0f, 2.86f);
        pathBuilder2.curveToRelative(-0.96f, 0.63f, -1.72f, -0.92f, -2.51f, -1.19f);
        pathBuilder2.curveToRelative(-0.2f, -0.07f, -0.69f, -0.05f, -0.91f, 0.19f);
        pathBuilder2.curveToRelative(-0.78f, 0.86f, 0.28f, 1.16f, 0.25f, 1.91f);
        pathBuilder2.curveToRelative(-0.02f, 0.75f, -1.59f, 0.49f, -1.51f, 1.49f);
        pathBuilder2.curveToRelative(0.12f, 1.6f, 2.18f, 0.45f, 2.4f, 1.24f);
        pathBuilder2.curveToRelative(0.55f, 1.98f, -1.89f, 2.15f, -0.5f, 3.27f);
        pathBuilder2.curveToRelative(1.53f, 0.71f, 1.91f, -1.94f, 2.8f, -1.35f);
        pathBuilder2.curveToRelative(0.58f, 0.38f, 0.3f, 1.45f, 0.16f, 2.43f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.verticalLineTo(7.0f);
        pathBuilder2.horizontalLineToRelative(4.05f);
        pathBuilder2.lineToRelative(1.83f, -2.0f);
        pathBuilder2.horizontalLineToRelative(4.24f);
        pathBuilder2.lineToRelative(1.83f, 2.0f);
        pathBuilder2.horizontalLineTo(20.0f);
        pathBuilder2.verticalLineTo(19.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(17.28f, 17.15f);
        pathBuilder3.curveToRelative(0.0f, 0.48f, 0.39f, 0.86f, 0.86f, 0.86f);
        pathBuilder3.curveToRelative(0.48f, 0.0f, 0.86f, -0.38f, 0.86f, -0.86f);
        pathBuilder3.reflectiveCurveToRelative(-0.39f, -0.86f, -0.86f, -0.86f);
        pathBuilder3.curveTo(17.66f, 16.29f, 17.28f, 16.67f, 17.28f, 17.15f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dirtyLens = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
