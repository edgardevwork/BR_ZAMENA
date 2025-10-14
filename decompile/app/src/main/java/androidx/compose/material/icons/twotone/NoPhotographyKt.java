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

/* compiled from: NoPhotography.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_noPhotography", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoPhotography", "Landroidx/compose/material/icons/Icons$TwoTone;", "getNoPhotography", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nNoPhotography.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoPhotography.kt\nandroidx/compose/material/icons/twotone/NoPhotographyKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,119:1\n212#2,12:120\n233#2,18:133\n253#2:170\n233#2,18:171\n253#2:208\n174#3:132\n705#4,2:151\n717#4,2:153\n719#4,11:159\n705#4,2:189\n717#4,2:191\n719#4,11:197\n72#5,4:155\n72#5,4:193\n*S KotlinDebug\n*F\n+ 1 NoPhotography.kt\nandroidx/compose/material/icons/twotone/NoPhotographyKt\n*L\n29#1:120,12\n30#1:133,18\n30#1:170\n54#1:171,18\n54#1:208\n29#1:132\n30#1:151,2\n30#1:153,2\n30#1:159,11\n54#1:189,2\n54#1:191,2\n54#1:197,11\n30#1:155,4\n54#1:193,4\n*E\n"})
/* loaded from: classes3.dex */
public final class NoPhotographyKt {

    @Nullable
    private static ImageVector _noPhotography;

    @NotNull
    public static final ImageVector getNoPhotography(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _noPhotography;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.NoPhotography", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.94f, 8.12f);
        pathBuilder.lineTo(8.9f, 6.07f);
        pathBuilder.lineTo(9.88f, 5.0f);
        pathBuilder.horizontalLineToRelative(4.24f);
        pathBuilder.lineToRelative(1.83f, 2.0f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.verticalLineToRelative(10.17f);
        pathBuilder.lineToRelative(-3.12f, -3.12f);
        pathBuilder.curveTo(16.96f, 13.71f, 17.0f, 13.36f, 17.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        pathBuilder.curveTo(11.64f, 8.0f, 11.29f, 8.04f, 10.94f, 8.12f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 18.0f);
        pathBuilder.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        pathBuilder.curveToRelative(0.0f, -0.91f, 0.25f, -1.76f, 0.68f, -2.49f);
        pathBuilder.lineTo(4.17f, 7.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.horizontalLineToRelative(12.17f);
        pathBuilder.lineToRelative(-1.68f, -1.68f);
        pathBuilder.curveTo(13.76f, 17.75f, 12.91f, 18.0f, 12.0f, 18.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(8.9f, 6.07f);
        pathBuilder2.lineTo(7.48f, 4.66f);
        pathBuilder2.lineTo(9.0f, 3.0f);
        pathBuilder2.horizontalLineToRelative(6.0f);
        pathBuilder2.lineToRelative(1.83f, 2.0f);
        pathBuilder2.horizontalLineTo(20.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(12.0f);
        pathBuilder2.curveToRelative(0.0f, 0.05f, -0.01f, 0.1f, -0.02f, 0.16f);
        pathBuilder2.lineTo(20.0f, 17.17f);
        pathBuilder2.verticalLineTo(7.0f);
        pathBuilder2.horizontalLineToRelative(-4.05f);
        pathBuilder2.lineToRelative(-1.83f, -2.0f);
        pathBuilder2.horizontalLineTo(9.88f);
        pathBuilder2.lineTo(8.9f, 6.07f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.49f, 23.31f);
        pathBuilder2.lineTo(18.17f, 21.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder2.verticalLineTo(7.0f);
        pathBuilder2.curveToRelative(0.0f, -0.59f, 0.27f, -1.12f, 0.68f, -1.49f);
        pathBuilder2.lineToRelative(-2.0f, -2.0f);
        pathBuilder2.lineTo(2.1f, 2.1f);
        pathBuilder2.lineTo(7.0f, 7.0f);
        pathBuilder2.lineToRelative(2.01f, 2.01f);
        pathBuilder2.lineToRelative(1.43f, 1.43f);
        pathBuilder2.lineToRelative(4.1f, 4.1f);
        pathBuilder2.lineToRelative(1.43f, 1.43f);
        pathBuilder2.lineTo(19.0f, 19.0f);
        pathBuilder2.lineToRelative(1.82f, 1.82f);
        pathBuilder2.lineToRelative(1.08f, 1.08f);
        pathBuilder2.lineTo(20.49f, 23.31f);
        pathBuilder2.close();
        pathBuilder2.moveTo(9.19f, 12.02f);
        pathBuilder2.curveTo(9.08f, 12.33f, 9.0f, 12.65f, 9.0f, 13.0f);
        pathBuilder2.curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f);
        pathBuilder2.curveToRelative(0.35f, 0.0f, 0.67f, -0.08f, 0.98f, -0.19f);
        pathBuilder2.lineTo(9.19f, 12.02f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.17f, 19.0f);
        pathBuilder2.lineToRelative(-1.68f, -1.68f);
        pathBuilder2.curveTo(13.76f, 17.75f, 12.91f, 18.0f, 12.0f, 18.0f);
        pathBuilder2.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        pathBuilder2.curveToRelative(0.0f, -0.91f, 0.25f, -1.76f, 0.68f, -2.49f);
        pathBuilder2.lineTo(4.17f, 7.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.verticalLineToRelative(12.0f);
        pathBuilder2.horizontalLineTo(16.17f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.81f, 11.98f);
        pathBuilder2.lineToRelative(2.08f, 2.08f);
        pathBuilder2.curveTo(16.96f, 13.71f, 17.0f, 13.36f, 17.0f, 13.0f);
        pathBuilder2.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        pathBuilder2.curveToRelative(-0.36f, 0.0f, -0.71f, 0.04f, -1.06f, 0.12f);
        pathBuilder2.lineToRelative(2.08f, 2.08f);
        pathBuilder2.curveTo(13.85f, 10.5f, 14.5f, 11.15f, 14.81f, 11.98f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noPhotography = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
