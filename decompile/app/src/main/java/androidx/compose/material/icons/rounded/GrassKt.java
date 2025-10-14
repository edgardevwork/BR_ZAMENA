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

/* compiled from: Grass.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_grass", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Grass", "Landroidx/compose/material/icons/Icons$Rounded;", "getGrass", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nGrass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Grass.kt\nandroidx/compose/material/icons/rounded/GrassKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,79:1\n212#2,12:80\n233#2,18:93\n253#2:130\n174#3:92\n705#4,2:111\n717#4,2:113\n719#4,11:119\n72#5,4:115\n*S KotlinDebug\n*F\n+ 1 Grass.kt\nandroidx/compose/material/icons/rounded/GrassKt\n*L\n29#1:80,12\n30#1:93,18\n30#1:130\n29#1:92\n30#1:111,2\n30#1:113,2\n30#1:119,11\n30#1:115,4\n*E\n"})
/* loaded from: classes4.dex */
public final class GrassKt {

    @Nullable
    private static ImageVector _grass;

    @NotNull
    public static final ImageVector getGrass(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _grass;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Grass", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.64f, 11.02f);
        pathBuilder.curveToRelative(0.55f, -1.47f, 1.43f, -2.78f, 2.56f, -3.83f);
        pathBuilder.curveToRelative(0.38f, -0.36f, 0.04f, -1.0f, -0.46f, -0.85f);
        pathBuilder.curveToRelative(-3.32f, 0.98f, -5.75f, 4.05f, -5.74f, 7.69f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder.curveTo(12.95f, 12.75f, 14.2f, 11.72f, 15.64f, 11.02f);
        pathBuilder.close();
        pathBuilder.moveTo(11.42f, 8.85f);
        pathBuilder.curveToRelative(-0.6f, -1.56f, -1.63f, -2.91f, -2.96f, -3.87f);
        pathBuilder.curveTo(8.04f, 4.68f, 7.5f, 5.17f, 7.74f, 5.63f);
        pathBuilder.curveTo(8.54f, 7.15f, 9.0f, 8.88f, 9.0f, 10.71f);
        pathBuilder.curveToRelative(0.0f, 0.21f, -0.03f, 0.41f, -0.04f, 0.61f);
        pathBuilder.curveToRelative(0.43f, 0.24f, 0.83f, 0.52f, 1.22f, 0.82f);
        pathBuilder.curveTo(10.39f, 10.96f, 10.83f, 9.85f, 11.42f, 8.85f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(4.75f);
        pathBuilder.curveToRelative(-0.57f, -2.19f, -2.04f, -4.02f, -4.0f, -5.06f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.16f, -0.08f, -0.26f, -0.25f, -0.26f, -0.44f);
        pathBuilder.curveToRelative(0.0f, -0.27f, 0.22f, -0.49f, 0.49f, -0.5f);
        pathBuilder.curveToRelative(0.01f, 0.0f, 0.02f, 0.0f, 0.02f, 0.0f);
        pathBuilder.curveTo(8.42f, 12.0f, 12.0f, 15.58f, 12.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.26f, 12.94f);
        pathBuilder.lineTo(20.26f, 12.94f);
        pathBuilder.curveToRelative(-1.96f, 1.04f, -3.44f, 2.87f, -4.0f, 5.06f);
        pathBuilder.horizontalLineTo(21.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(-5.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, -0.68f, -0.07f, -1.35f, -0.2f, -2.0f);
        pathBuilder.curveToRelative(-0.15f, -0.72f, -0.38f, -1.42f, -0.67f, -2.07f);
        pathBuilder.curveTo(14.52f, 13.58f, 17.07f, 12.0f, 20.0f, 12.0f);
        pathBuilder.curveToRelative(0.01f, 0.0f, 0.02f, 0.0f, 0.02f, 0.0f);
        pathBuilder.curveToRelative(0.27f, 0.0f, 0.49f, 0.23f, 0.49f, 0.5f);
        pathBuilder.curveTo(20.52f, 12.69f, 20.41f, 12.85f, 20.26f, 12.94f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _grass = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
