package androidx.compose.material.icons.filled;

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

/* compiled from: SoupKitchen.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_soupKitchen", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SoupKitchen", "Landroidx/compose/material/icons/Icons$Filled;", "getSoupKitchen", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSoupKitchen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SoupKitchen.kt\nandroidx/compose/material/icons/filled/SoupKitchenKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,82:1\n212#2,12:83\n233#2,18:96\n253#2:133\n174#3:95\n705#4,2:114\n717#4,2:116\n719#4,11:122\n72#5,4:118\n*S KotlinDebug\n*F\n+ 1 SoupKitchen.kt\nandroidx/compose/material/icons/filled/SoupKitchenKt\n*L\n29#1:83,12\n30#1:96,18\n30#1:133\n29#1:95\n30#1:114,2\n30#1:116,2\n30#1:122,11\n30#1:118,4\n*E\n"})
/* loaded from: classes.dex */
public final class SoupKitchenKt {

    @Nullable
    private static ImageVector _soupKitchen;

    @NotNull
    public static final ImageVector getSoupKitchen(@NotNull Icons.Filled filled) {
        ImageVector imageVector = _soupKitchen;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SoupKitchen", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.4f, 7.0f);
        pathBuilder.curveTo(6.06f, 7.55f, 6.0f, 7.97f, 6.0f, 8.38f);
        pathBuilder.curveTo(6.0f, 9.15f, 7.0f, 11.0f, 7.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 0.95f, -0.4f, 1.5f, -0.4f, 1.5f);
        pathBuilder.horizontalLineTo(5.1f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.4f, -0.55f, 0.4f, -1.5f);
        pathBuilder.curveToRelative(0.0f, -1.0f, -1.0f, -2.85f, -1.0f, -3.62f);
        pathBuilder.curveTo(4.5f, 7.97f, 4.56f, 7.55f, 4.9f, 7.0f);
        pathBuilder.horizontalLineTo(6.4f);
        pathBuilder.close();
        pathBuilder.moveTo(11.4f, 7.0f);
        pathBuilder.curveTo(11.06f, 7.55f, 11.0f, 7.97f, 11.0f, 8.38f);
        pathBuilder.curveTo(11.0f, 9.15f, 12.0f, 11.0f, 12.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 0.95f, -0.4f, 1.5f, -0.4f, 1.5f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.4f, -0.55f, 0.4f, -1.5f);
        pathBuilder.curveToRelative(0.0f, -1.0f, -1.0f, -2.85f, -1.0f, -3.62f);
        pathBuilder.curveToRelative(0.0f, -0.41f, 0.06f, -0.83f, 0.4f, -1.38f);
        pathBuilder.horizontalLineTo(11.4f);
        pathBuilder.close();
        pathBuilder.moveTo(8.15f, 7.0f);
        pathBuilder.curveToRelative(-0.34f, 0.55f, -0.4f, 0.97f, -0.4f, 1.38f);
        pathBuilder.curveToRelative(0.0f, 0.77f, 1.0f, 2.63f, 1.0f, 3.62f);
        pathBuilder.curveToRelative(0.0f, 0.95f, -0.4f, 1.5f, -0.4f, 1.5f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.4f, -0.55f, 0.4f, -1.5f);
        pathBuilder.curveToRelative(0.0f, -1.0f, -1.0f, -2.85f, -1.0f, -3.62f);
        pathBuilder.curveToRelative(0.0f, -0.41f, 0.06f, -0.83f, 0.4f, -1.38f);
        pathBuilder.horizontalLineTo(8.15f);
        pathBuilder.close();
        pathBuilder.moveTo(21.47f, 6.5f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.13f, -1.06f, 0.13f, -1.5f);
        pathBuilder.curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f);
        pathBuilder.curveToRelative(-1.54f, 0.0f, -2.81f, 1.16f, -2.98f, 2.65f);
        pathBuilder.lineTo(14.53f, 15.0f);
        pathBuilder.horizontalLineTo(4.01f);
        pathBuilder.curveToRelative(-0.6f, 0.0f, -1.09f, 0.53f, -1.0f, 1.13f);
        pathBuilder.curveTo(3.53f, 19.46f, 6.39f, 22.0f, 9.75f, 22.0f);
        pathBuilder.curveToRelative(3.48f, 0.0f, 6.34f, -2.73f, 6.71f, -6.23f);
        pathBuilder.lineToRelative(1.15f, -10.87f);
        pathBuilder.curveTo(17.66f, 4.39f, 18.08f, 4.0f, 18.6f, 4.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.curveToRelative(0.0f, 0.3f, -0.1f, 1.25f, -0.1f, 1.25f);
        pathBuilder.lineTo(21.47f, 6.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _soupKitchen = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
