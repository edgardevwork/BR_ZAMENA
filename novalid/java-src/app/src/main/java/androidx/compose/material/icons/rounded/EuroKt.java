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

/* compiled from: Euro.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_euro", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Euro", "Landroidx/compose/material/icons/Icons$Rounded;", "getEuro", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nEuro.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Euro.kt\nandroidx/compose/material/icons/rounded/EuroKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,77:1\n212#2,12:78\n233#2,18:91\n253#2:128\n174#3:90\n705#4,2:109\n717#4,2:111\n719#4,11:117\n72#5,4:113\n*S KotlinDebug\n*F\n+ 1 Euro.kt\nandroidx/compose/material/icons/rounded/EuroKt\n*L\n29#1:78,12\n30#1:91,18\n30#1:128\n29#1:90\n30#1:109,2\n30#1:111,2\n30#1:117,11\n30#1:113,4\n*E\n"})
/* loaded from: classes3.dex */
public final class EuroKt {

    @Nullable
    private static ImageVector _euro;

    @NotNull
    public static final ImageVector getEuro(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _euro;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Euro", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.0f, 18.5f);
        pathBuilder.curveToRelative(-2.51f, 0.0f, -4.68f, -1.42f, -5.76f, -3.5f);
        pathBuilder.horizontalLineToRelative(5.14f);
        pathBuilder.curveToRelative(0.38f, 0.0f, 0.73f, -0.21f, 0.89f, -0.55f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.33f, -0.66f, -0.15f, -1.45f, -0.89f, -1.45f);
        pathBuilder.horizontalLineToRelative(-5.8f);
        pathBuilder.curveToRelative(-0.05f, -0.33f, -0.08f, -0.66f, -0.08f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.03f, -0.67f, 0.08f, -1.0f);
        pathBuilder.horizontalLineToRelative(5.8f);
        pathBuilder.curveToRelative(0.38f, 0.0f, 0.73f, -0.21f, 0.89f, -0.55f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(15.61f, 9.78f, 15.13f, 9.0f, 14.38f, 9.0f);
        pathBuilder.horizontalLineTo(9.24f);
        pathBuilder.curveTo(10.32f, 6.92f, 12.5f, 5.5f, 15.0f, 5.5f);
        pathBuilder.curveToRelative(1.25f, 0.0f, 2.42f, 0.36f, 3.42f, 0.97f);
        pathBuilder.curveToRelative(0.5f, 0.31f, 1.15f, 0.26f, 1.57f, -0.16f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.58f, -0.58f, 0.45f, -1.53f, -0.25f, -1.96f);
        pathBuilder.curveTo(18.36f, 3.5f, 16.73f, 3.0f, 15.0f, 3.0f);
        pathBuilder.curveToRelative(-3.92f, 0.0f, -7.24f, 2.51f, -8.48f, 6.0f);
        pathBuilder.horizontalLineToRelative(-2.9f);
        pathBuilder.curveTo(3.24f, 9.0f, 2.89f, 9.21f, 2.72f, 9.55f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(2.39f, 10.22f, 2.87f, 11.0f, 3.62f, 11.0f);
        pathBuilder.horizontalLineToRelative(2.44f);
        pathBuilder.curveTo(6.02f, 11.33f, 6.0f, 11.66f, 6.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(0.02f, 0.67f, 0.06f, 1.0f);
        pathBuilder.horizontalLineTo(3.62f);
        pathBuilder.curveToRelative(-0.38f, 0.0f, -0.73f, 0.21f, -0.89f, 0.55f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(2.39f, 14.22f, 2.87f, 15.0f, 3.62f, 15.0f);
        pathBuilder.horizontalLineToRelative(2.9f);
        pathBuilder.curveToRelative(1.24f, 3.49f, 4.56f, 6.0f, 8.48f, 6.0f);
        pathBuilder.curveToRelative(1.74f, 0.0f, 3.36f, -0.49f, 4.74f, -1.35f);
        pathBuilder.curveToRelative(0.69f, -0.43f, 0.82f, -1.39f, 0.24f, -1.97f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.42f, -0.42f, -1.07f, -0.47f, -1.57f, -0.15f);
        pathBuilder.curveTo(17.42f, 18.15f, 16.26f, 18.5f, 15.0f, 18.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _euro = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
