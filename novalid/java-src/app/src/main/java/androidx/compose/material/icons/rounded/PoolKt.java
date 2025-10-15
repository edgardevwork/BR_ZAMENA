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

/* compiled from: Pool.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_pool", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Pool", "Landroidx/compose/material/icons/Icons$Rounded;", "getPool", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pool.kt\nandroidx/compose/material/icons/rounded/PoolKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,125:1\n212#2,12:126\n233#2,18:139\n253#2:176\n233#2,18:177\n253#2:214\n174#3:138\n705#4,2:157\n717#4,2:159\n719#4,11:165\n705#4,2:195\n717#4,2:197\n719#4,11:203\n72#5,4:161\n72#5,4:199\n*S KotlinDebug\n*F\n+ 1 Pool.kt\nandroidx/compose/material/icons/rounded/PoolKt\n*L\n29#1:126,12\n30#1:139,18\n30#1:176\n114#1:177,18\n114#1:214\n29#1:138\n30#1:157,2\n30#1:159,2\n30#1:165,11\n114#1:195,2\n114#1:197,2\n114#1:203,11\n30#1:161,4\n114#1:199,4\n*E\n"})
/* loaded from: classes3.dex */
public final class PoolKt {

    @Nullable
    private static ImageVector _pool;

    @NotNull
    public static final ImageVector getPool(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _pool;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Pool", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.11f, 5.56f);
        pathBuilder.curveTo(7.3f, 5.7f, 8.14f, 6.14f, 9.0f, 7.0f);
        pathBuilder.lineToRelative(1.0f, 1.0f);
        pathBuilder.lineToRelative(-3.25f, 3.25f);
        pathBuilder.curveToRelative(0.31f, 0.12f, 0.56f, 0.27f, 0.77f, 0.39f);
        pathBuilder.curveToRelative(0.37f, 0.23f, 0.59f, 0.36f, 1.15f, 0.36f);
        pathBuilder.reflectiveCurveToRelative(0.78f, -0.13f, 1.15f, -0.36f);
        pathBuilder.curveToRelative(0.46f, -0.27f, 1.08f, -0.64f, 2.19f, -0.64f);
        pathBuilder.reflectiveCurveToRelative(1.73f, 0.37f, 2.18f, 0.64f);
        pathBuilder.curveToRelative(0.37f, 0.22f, 0.6f, 0.36f, 1.15f, 0.36f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 0.78f, -0.13f, 1.15f, -0.36f);
        pathBuilder.curveToRelative(0.12f, -0.07f, 0.26f, -0.15f, 0.41f, -0.23f);
        pathBuilder.lineTo(10.48f, 5.0f);
        pathBuilder.curveTo(9.22f, 3.74f, 8.04f, 3.2f, 6.3f, 3.05f);
        pathBuilder.curveTo(5.6f, 2.99f, 5.0f, 3.56f, 5.0f, 4.26f);
        pathBuilder.verticalLineToRelative(0.09f);
        pathBuilder.curveToRelative(0.0f, 0.63f, 0.49f, 1.13f, 1.11f, 1.21f);
        pathBuilder.close();
        pathBuilder.moveTo(21.35f, 18.91f);
        pathBuilder.curveToRelative(-0.17f, -0.06f, -0.32f, -0.15f, -0.5f, -0.27f);
        pathBuilder.curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f);
        pathBuilder.reflectiveCurveToRelative(-1.73f, 0.37f, -2.18f, 0.64f);
        pathBuilder.curveToRelative(-0.37f, 0.23f, -0.6f, 0.36f, -1.15f, 0.36f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -0.78f, -0.14f, -1.15f, -0.36f);
        pathBuilder.curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f);
        pathBuilder.reflectiveCurveToRelative(-1.73f, 0.37f, -2.19f, 0.64f);
        pathBuilder.curveToRelative(-0.37f, 0.23f, -0.59f, 0.36f, -1.15f, 0.36f);
        pathBuilder.reflectiveCurveToRelative(-0.78f, -0.13f, -1.15f, -0.36f);
        pathBuilder.curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f);
        pathBuilder.reflectiveCurveToRelative(-1.73f, 0.37f, -2.19f, 0.64f);
        pathBuilder.curveToRelative(-0.18f, 0.11f, -0.33f, 0.2f, -0.5f, 0.27f);
        pathBuilder.curveToRelative(-0.38f, 0.13f, -0.65f, 0.45f, -0.65f, 0.85f);
        pathBuilder.verticalLineToRelative(0.12f);
        pathBuilder.curveToRelative(0.0f, 0.67f, 0.66f, 1.13f, 1.3f, 0.91f);
        pathBuilder.curveToRelative(0.37f, -0.13f, 0.65f, -0.3f, 0.89f, -0.44f);
        pathBuilder.curveToRelative(0.37f, -0.22f, 0.6f, -0.35f, 1.15f, -0.35f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 0.78f, 0.13f, 1.15f, 0.36f);
        pathBuilder.curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f);
        pathBuilder.reflectiveCurveToRelative(1.73f, -0.37f, 2.19f, -0.64f);
        pathBuilder.curveToRelative(0.37f, -0.23f, 0.59f, -0.36f, 1.15f, -0.36f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 0.78f, 0.14f, 1.15f, 0.36f);
        pathBuilder.curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f);
        pathBuilder.reflectiveCurveToRelative(1.72f, -0.37f, 2.18f, -0.64f);
        pathBuilder.curveToRelative(0.37f, -0.23f, 0.59f, -0.36f, 1.15f, -0.36f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 0.78f, 0.14f, 1.15f, 0.36f);
        pathBuilder.curveToRelative(0.23f, 0.14f, 0.51f, 0.31f, 0.88f, 0.44f);
        pathBuilder.curveToRelative(0.63f, 0.22f, 1.3f, -0.24f, 1.3f, -0.91f);
        pathBuilder.verticalLineToRelative(-0.12f);
        pathBuilder.curveToRelative(0.0f, -0.41f, -0.27f, -0.73f, -0.65f, -0.86f);
        pathBuilder.close();
        pathBuilder.moveTo(3.11f, 16.35f);
        pathBuilder.curveToRelative(0.47f, -0.13f, 0.81f, -0.33f, 1.09f, -0.49f);
        pathBuilder.curveToRelative(0.37f, -0.23f, 0.6f, -0.36f, 1.15f, -0.36f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 0.78f, 0.14f, 1.15f, 0.36f);
        pathBuilder.curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f);
        pathBuilder.reflectiveCurveToRelative(1.73f, -0.37f, 2.18f, -0.64f);
        pathBuilder.curveToRelative(0.37f, -0.23f, 0.59f, -0.36f, 1.15f, -0.36f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 0.78f, 0.14f, 1.15f, 0.36f);
        pathBuilder.curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f);
        pathBuilder.reflectiveCurveToRelative(1.73f, -0.37f, 2.18f, -0.64f);
        pathBuilder.curveToRelative(0.37f, -0.23f, 0.59f, -0.36f, 1.15f, -0.36f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 0.78f, 0.14f, 1.15f, 0.36f);
        pathBuilder.curveToRelative(0.23f, 0.14f, 0.5f, 0.3f, 0.85f, 0.43f);
        pathBuilder.curveToRelative(0.63f, 0.23f, 1.31f, -0.24f, 1.31f, -0.91f);
        pathBuilder.verticalLineToRelative(-0.12f);
        pathBuilder.curveToRelative(0.0f, -0.4f, -0.27f, -0.72f, -0.64f, -0.86f);
        pathBuilder.curveToRelative(-0.17f, -0.06f, -0.32f, -0.15f, -0.51f, -0.26f);
        pathBuilder.curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f);
        pathBuilder.reflectiveCurveToRelative(-1.73f, 0.37f, -2.18f, 0.64f);
        pathBuilder.curveToRelative(-0.37f, 0.23f, -0.6f, 0.36f, -1.15f, 0.36f);
        pathBuilder.reflectiveCurveToRelative(-0.78f, -0.14f, -1.15f, -0.36f);
        pathBuilder.curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f);
        pathBuilder.reflectiveCurveToRelative(-1.73f, 0.37f, -2.18f, 0.64f);
        pathBuilder.curveToRelative(-0.37f, 0.23f, -0.59f, 0.36f, -1.15f, 0.36f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -0.78f, -0.14f, -1.15f, -0.36f);
        pathBuilder.curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f);
        pathBuilder.reflectiveCurveToRelative(-1.73f, 0.37f, -2.18f, 0.64f);
        pathBuilder.curveToRelative(-0.18f, 0.11f, -0.33f, 0.2f, -0.5f, 0.27f);
        pathBuilder.curveToRelative(-0.38f, 0.13f, -0.65f, 0.45f, -0.65f, 0.85f);
        pathBuilder.verticalLineToRelative(0.23f);
        pathBuilder.curveToRelative(0.0f, 0.58f, 0.55f, 1.02f, 1.11f, 0.86f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(16.5f, 5.5f);
        pathBuilder2.moveToRelative(-2.5f, 0.0f);
        pathBuilder2.arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f);
        pathBuilder2.arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pool = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
