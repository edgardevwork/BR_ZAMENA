package androidx.compose.material.icons.outlined;

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
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_pool", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Pool", "Landroidx/compose/material/icons/Icons$Outlined;", "getPool", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pool.kt\nandroidx/compose/material/icons/outlined/PoolKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,119:1\n212#2,12:120\n233#2,18:133\n253#2:170\n233#2,18:171\n253#2:208\n174#3:132\n705#4,2:151\n717#4,2:153\n719#4,11:159\n705#4,2:189\n717#4,2:191\n719#4,11:197\n72#5,4:155\n72#5,4:193\n*S KotlinDebug\n*F\n+ 1 Pool.kt\nandroidx/compose/material/icons/outlined/PoolKt\n*L\n29#1:120,12\n30#1:133,18\n30#1:170\n108#1:171,18\n108#1:208\n29#1:132\n30#1:151,2\n30#1:153,2\n30#1:159,11\n108#1:189,2\n108#1:191,2\n108#1:197,11\n30#1:155,4\n108#1:193,4\n*E\n"})
/* loaded from: classes4.dex */
public final class PoolKt {

    @Nullable
    private static ImageVector _pool;

    @NotNull
    public static final ImageVector getPool(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _pool;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Pool", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.0f, 8.0f);
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
        pathBuilder.curveTo(8.93f, 3.45f, 7.5f, 2.99f, 5.0f, 3.0f);
        pathBuilder.verticalLineToRelative(2.5f);
        pathBuilder.curveToRelative(1.82f, -0.01f, 2.89f, 0.39f, 4.0f, 1.5f);
        pathBuilder.lineToRelative(1.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 16.5f);
        pathBuilder.horizontalLineToRelative(-0.02f);
        pathBuilder.horizontalLineToRelative(0.02f);
        pathBuilder.close();
        pathBuilder.moveTo(5.35f, 15.5f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 0.78f, 0.14f, 1.15f, 0.36f);
        pathBuilder.curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f);
        pathBuilder.reflectiveCurveToRelative(1.73f, -0.37f, 2.18f, -0.64f);
        pathBuilder.curveToRelative(0.37f, -0.23f, 0.59f, -0.36f, 1.15f, -0.36f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 0.78f, 0.14f, 1.15f, 0.36f);
        pathBuilder.curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f);
        pathBuilder.reflectiveCurveToRelative(1.73f, -0.37f, 2.18f, -0.64f);
        pathBuilder.curveToRelative(0.37f, -0.23f, 0.59f, -0.36f, 1.15f, -0.36f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 0.78f, 0.14f, 1.15f, 0.36f);
        pathBuilder.curveToRelative(0.45f, 0.27f, 1.06f, 0.63f, 2.16f, 0.64f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -0.78f, -0.14f, -1.15f, -0.36f);
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
        pathBuilder.curveToRelative(-0.37f, 0.23f, -0.59f, 0.36f, -1.15f, 0.36f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveToRelative(1.11f, 0.0f, 1.73f, -0.37f, 2.2f, -0.64f);
        pathBuilder.curveToRelative(0.37f, -0.23f, 0.6f, -0.36f, 1.15f, -0.36f);
        pathBuilder.close();
        pathBuilder.moveTo(18.67f, 18.0f);
        pathBuilder.curveToRelative(-1.11f, 0.0f, -1.73f, 0.37f, -2.18f, 0.64f);
        pathBuilder.curveToRelative(-0.37f, 0.23f, -0.6f, 0.36f, -1.15f, 0.36f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -0.78f, -0.14f, -1.15f, -0.36f);
        pathBuilder.curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f);
        pathBuilder.reflectiveCurveToRelative(-1.73f, 0.37f, -2.19f, 0.64f);
        pathBuilder.curveToRelative(-0.37f, 0.23f, -0.59f, 0.36f, -1.15f, 0.36f);
        pathBuilder.reflectiveCurveToRelative(-0.78f, -0.13f, -1.15f, -0.36f);
        pathBuilder.curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f);
        pathBuilder.reflectiveCurveToRelative(-1.73f, 0.37f, -2.19f, 0.64f);
        pathBuilder.curveToRelative(-0.37f, 0.23f, -0.59f, 0.36f, -1.15f, 0.36f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveToRelative(1.11f, 0.0f, 1.73f, -0.37f, 2.19f, -0.64f);
        pathBuilder.curveToRelative(0.37f, -0.23f, 0.6f, -0.36f, 1.15f, -0.36f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 0.78f, 0.13f, 1.15f, 0.36f);
        pathBuilder.curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f);
        pathBuilder.reflectiveCurveToRelative(1.73f, -0.37f, 2.19f, -0.64f);
        pathBuilder.curveToRelative(0.37f, -0.23f, 0.59f, -0.36f, 1.15f, -0.36f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 0.78f, 0.14f, 1.15f, 0.36f);
        pathBuilder.curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f);
        pathBuilder.reflectiveCurveToRelative(1.72f, -0.37f, 2.18f, -0.64f);
        pathBuilder.curveToRelative(0.37f, -0.23f, 0.59f, -0.36f, 1.15f, -0.36f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 0.78f, 0.14f, 1.15f, 0.36f);
        pathBuilder.curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(-0.56f, 0.0f, -0.78f, -0.13f, -1.15f, -0.36f);
        pathBuilder.curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f);
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
