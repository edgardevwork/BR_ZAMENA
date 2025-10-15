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

/* compiled from: Chalet.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_chalet", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Chalet", "Landroidx/compose/material/icons/Icons$Rounded;", "getChalet", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nChalet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chalet.kt\nandroidx/compose/material/icons/rounded/ChaletKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,122:1\n212#2,12:123\n233#2,18:136\n253#2:173\n174#3:135\n705#4,2:154\n717#4,2:156\n719#4,11:162\n72#5,4:158\n*S KotlinDebug\n*F\n+ 1 Chalet.kt\nandroidx/compose/material/icons/rounded/ChaletKt\n*L\n29#1:123,12\n30#1:136,18\n30#1:173\n29#1:135\n30#1:154,2\n30#1:156,2\n30#1:162,11\n30#1:158,4\n*E\n"})
/* loaded from: classes3.dex */
public final class ChaletKt {

    @Nullable
    private static ImageVector _chalet;

    @NotNull
    public static final ImageVector getChalet(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _chalet;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Chalet", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.0f, 15.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-3.67f);
        pathBuilder.lineToRelative(-0.38f, 0.38f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineToRelative(6.09f, -6.09f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(6.09f, 6.09f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilder.lineTo(15.0f, 15.33f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.curveTo(11.0f, 15.45f, 10.55f, 15.0f, 10.0f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.5f, 7.5f);
        pathBuilder.verticalLineToRelative(0.89f);
        pathBuilder.lineToRelative(-1.08f, 1.08f);
        pathBuilder.curveToRelative(-0.18f, 0.18f, -0.21f, 0.48f, -0.05f, 0.69f);
        pathBuilder.curveToRelative(0.19f, 0.23f, 0.53f, 0.24f, 0.74f, 0.04f);
        pathBuilder.lineToRelative(0.39f, -0.39f);
        pathBuilder.verticalLineToRelative(0.69f);
        pathBuilder.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilder.verticalLineTo(9.81f);
        pathBuilder.lineToRelative(0.39f, 0.39f);
        pathBuilder.curveToRelative(0.21f, 0.21f, 0.55f, 0.19f, 0.74f, -0.04f);
        pathBuilder.curveToRelative(0.17f, -0.2f, 0.14f, -0.5f, -0.05f, -0.69f);
        pathBuilder.lineTo(18.5f, 8.39f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.0f, -0.89f, 0.0f, -0.89f);
        pathBuilder.horizontalLineToRelative(0.89f);
        pathBuilder.lineToRelative(1.08f, 1.08f);
        pathBuilder.curveToRelative(0.18f, 0.18f, 0.48f, 0.21f, 0.69f, 0.05f);
        pathBuilder.curveToRelative(0.23f, -0.19f, 0.24f, -0.53f, 0.04f, -0.74f);
        pathBuilder.lineTo(20.81f, 7.5f);
        pathBuilder.horizontalLineToRelative(0.69f);
        pathBuilder.curveTo(21.78f, 7.5f, 22.0f, 7.28f, 22.0f, 7.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilder.lineToRelative(-0.69f, 0.0f);
        pathBuilder.lineToRelative(0.39f, -0.39f);
        pathBuilder.curveToRelative(0.21f, -0.21f, 0.19f, -0.55f, -0.04f, -0.74f);
        pathBuilder.curveToRelative(-0.2f, -0.17f, -0.5f, -0.14f, -0.69f, 0.05f);
        pathBuilder.lineTo(19.39f, 6.5f);
        pathBuilder.curveToRelative(0.0f, 0.0f, -0.89f, 0.0f, -0.89f, 0.0f);
        pathBuilder.verticalLineTo(5.61f);
        pathBuilder.lineToRelative(1.08f, -1.08f);
        pathBuilder.curveToRelative(0.18f, -0.18f, 0.21f, -0.48f, 0.05f, -0.69f);
        pathBuilder.curveToRelative(-0.19f, -0.23f, -0.53f, -0.24f, -0.74f, -0.04f);
        pathBuilder.lineTo(18.5f, 4.19f);
        pathBuilder.verticalLineTo(3.5f);
        pathBuilder.curveTo(18.5f, 3.22f, 18.28f, 3.0f, 18.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilder.verticalLineToRelative(0.69f);
        pathBuilder.lineTo(17.11f, 3.8f);
        pathBuilder.curveToRelative(-0.21f, -0.21f, -0.55f, -0.19f, -0.74f, 0.04f);
        pathBuilder.curveToRelative(-0.17f, 0.2f, -0.14f, 0.5f, 0.05f, 0.69f);
        pathBuilder.lineToRelative(1.08f, 1.08f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.0f, 0.89f, 0.0f, 0.89f);
        pathBuilder.horizontalLineToRelative(-0.89f);
        pathBuilder.lineToRelative(-1.08f, -1.08f);
        pathBuilder.curveToRelative(-0.18f, -0.18f, -0.48f, -0.21f, -0.69f, -0.05f);
        pathBuilder.curveToRelative(-0.23f, 0.19f, -0.24f, 0.53f, -0.04f, 0.74f);
        pathBuilder.lineToRelative(0.39f, 0.39f);
        pathBuilder.horizontalLineTo(14.5f);
        pathBuilder.curveTo(14.22f, 6.5f, 14.0f, 6.72f, 14.0f, 7.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilder.lineToRelative(0.69f, 0.0f);
        pathBuilder.lineTo(14.8f, 7.89f);
        pathBuilder.curveToRelative(-0.21f, 0.21f, -0.19f, 0.55f, 0.04f, 0.74f);
        pathBuilder.curveToRelative(0.2f, 0.17f, 0.5f, 0.14f, 0.69f, -0.05f);
        pathBuilder.lineToRelative(1.08f, -1.08f);
        pathBuilder.curveTo(16.61f, 7.5f, 17.5f, 7.5f, 17.5f, 7.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _chalet = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
