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

/* compiled from: SoupKitchen.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_soupKitchen", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SoupKitchen", "Landroidx/compose/material/icons/Icons$Rounded;", "getSoupKitchen", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSoupKitchen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SoupKitchen.kt\nandroidx/compose/material/icons/rounded/SoupKitchenKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,90:1\n212#2,12:91\n233#2,18:104\n253#2:141\n174#3:103\n705#4,2:122\n717#4,2:124\n719#4,11:130\n72#5,4:126\n*S KotlinDebug\n*F\n+ 1 SoupKitchen.kt\nandroidx/compose/material/icons/rounded/SoupKitchenKt\n*L\n29#1:91,12\n30#1:104,18\n30#1:141\n29#1:103\n30#1:122,2\n30#1:124,2\n30#1:130,11\n30#1:126,4\n*E\n"})
/* loaded from: classes.dex */
public final class SoupKitchenKt {

    @Nullable
    private static ImageVector _soupKitchen;

    @NotNull
    public static final ImageVector getSoupKitchen(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _soupKitchen;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SoupKitchen", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.15f, 13.5f);
        pathBuilder.curveToRelative(-0.46f, 0.0f, -0.8f, -0.42f, -0.71f, -0.87f);
        pathBuilder.curveTo(5.48f, 12.45f, 5.5f, 12.24f, 5.5f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.0f, -1.0f, -2.85f, -1.0f, -3.62f);
        pathBuilder.curveToRelative(0.0f, -0.29f, 0.03f, -0.59f, 0.17f, -0.93f);
        pathBuilder.curveTo(4.78f, 7.18f, 5.04f, 7.0f, 5.34f, 7.0f);
        pathBuilder.curveToRelative(0.45f, 0.0f, 0.8f, 0.42f, 0.71f, 0.86f);
        pathBuilder.curveTo(6.01f, 8.04f, 6.0f, 8.21f, 6.0f, 8.38f);
        pathBuilder.curveTo(6.0f, 9.15f, 7.0f, 11.0f, 7.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 0.42f, -0.08f, 0.76f, -0.17f, 1.01f);
        pathBuilder.curveTo(6.73f, 13.31f, 6.46f, 13.5f, 6.15f, 13.5f);
        pathBuilder.close();
        pathBuilder.moveTo(12.65f, 13.5f);
        pathBuilder.curveToRelative(0.31f, 0.0f, 0.58f, -0.19f, 0.68f, -0.49f);
        pathBuilder.curveToRelative(0.09f, -0.25f, 0.17f, -0.59f, 0.17f, -1.01f);
        pathBuilder.curveToRelative(0.0f, -1.0f, -1.0f, -2.85f, -1.0f, -3.62f);
        pathBuilder.curveToRelative(0.0f, -0.17f, 0.01f, -0.34f, 0.04f, -0.51f);
        pathBuilder.curveTo(12.63f, 7.42f, 12.29f, 7.0f, 11.84f, 7.0f);
        pathBuilder.curveToRelative(-0.29f, 0.0f, -0.56f, 0.18f, -0.67f, 0.45f);
        pathBuilder.curveTo(11.03f, 7.79f, 11.0f, 8.08f, 11.0f, 8.38f);
        pathBuilder.curveTo(11.0f, 9.15f, 12.0f, 11.0f, 12.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 0.24f, -0.02f, 0.45f, -0.06f, 0.63f);
        pathBuilder.curveTo(11.85f, 13.08f, 12.19f, 13.5f, 12.65f, 13.5f);
        pathBuilder.close();
        pathBuilder.moveTo(9.4f, 13.5f);
        pathBuilder.curveToRelative(0.31f, 0.0f, 0.58f, -0.19f, 0.68f, -0.49f);
        pathBuilder.curveToRelative(0.09f, -0.25f, 0.17f, -0.59f, 0.17f, -1.01f);
        pathBuilder.curveToRelative(0.0f, -1.0f, -1.0f, -2.85f, -1.0f, -3.62f);
        pathBuilder.curveToRelative(0.0f, -0.17f, 0.01f, -0.34f, 0.04f, -0.51f);
        pathBuilder.curveTo(9.38f, 7.42f, 9.04f, 7.0f, 8.59f, 7.0f);
        pathBuilder.curveTo(8.29f, 7.0f, 8.03f, 7.18f, 7.92f, 7.45f);
        pathBuilder.curveTo(7.78f, 7.79f, 7.75f, 8.08f, 7.75f, 8.38f);
        pathBuilder.curveToRelative(0.0f, 0.77f, 1.0f, 2.63f, 1.0f, 3.62f);
        pathBuilder.curveToRelative(0.0f, 0.24f, -0.02f, 0.45f, -0.06f, 0.63f);
        pathBuilder.curveTo(8.6f, 13.08f, 8.94f, 13.5f, 9.4f, 13.5f);
        pathBuilder.close();
        pathBuilder.moveTo(20.46f, 6.37f);
        pathBuilder.curveToRelative(0.57f, 0.07f, 1.08f, -0.34f, 1.12f, -0.91f);
        pathBuilder.curveTo(21.59f, 5.28f, 21.6f, 5.12f, 21.6f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f);
        pathBuilder.curveToRelative(-1.54f, 0.0f, -2.81f, 1.16f, -2.98f, 2.65f);
        pathBuilder.lineTo(14.53f, 15.0f);
        pathBuilder.horizontalLineTo(3.99f);
        pathBuilder.curveToRelative(-0.6f, 0.0f, -1.07f, 0.54f, -0.98f, 1.14f);
        pathBuilder.curveTo(3.54f, 19.46f, 6.39f, 22.0f, 9.75f, 22.0f);
        pathBuilder.curveToRelative(3.48f, 0.0f, 6.34f, -2.73f, 6.71f, -6.23f);
        pathBuilder.lineToRelative(1.15f, -10.87f);
        pathBuilder.curveTo(17.66f, 4.39f, 18.08f, 4.0f, 18.6f, 4.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.curveToRelative(0.0f, 0.07f, -0.01f, 0.18f, -0.01f, 0.31f);
        pathBuilder.curveTo(19.55f, 5.84f, 19.93f, 6.3f, 20.46f, 6.37f);
        pathBuilder.lineTo(20.46f, 6.37f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _soupKitchen = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
