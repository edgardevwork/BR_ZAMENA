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

/* compiled from: VisibilityOff.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_visibilityOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "VisibilityOff", "Landroidx/compose/material/icons/Icons$Rounded;", "getVisibilityOff", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nVisibilityOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VisibilityOff.kt\nandroidx/compose/material/icons/rounded/VisibilityOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,73:1\n212#2,12:74\n233#2,18:87\n253#2:124\n174#3:86\n705#4,2:105\n717#4,2:107\n719#4,11:113\n72#5,4:109\n*S KotlinDebug\n*F\n+ 1 VisibilityOff.kt\nandroidx/compose/material/icons/rounded/VisibilityOffKt\n*L\n29#1:74,12\n30#1:87,18\n30#1:124\n29#1:86\n30#1:105,2\n30#1:107,2\n30#1:113,11\n30#1:109,4\n*E\n"})
/* loaded from: classes4.dex */
public final class VisibilityOffKt {

    @Nullable
    private static ImageVector _visibilityOff;

    @NotNull
    public static final ImageVector getVisibilityOff(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _visibilityOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.VisibilityOff", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 6.5f);
        pathBuilder.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, 0.51f, -0.1f, 1.0f, -0.24f, 1.46f);
        pathBuilder.lineToRelative(3.06f, 3.06f);
        pathBuilder.curveToRelative(1.39f, -1.23f, 2.49f, -2.77f, 3.18f, -4.53f);
        pathBuilder.curveTo(21.27f, 7.11f, 17.0f, 4.0f, 12.0f, 4.0f);
        pathBuilder.curveToRelative(-1.27f, 0.0f, -2.49f, 0.2f, -3.64f, 0.57f);
        pathBuilder.lineToRelative(2.17f, 2.17f);
        pathBuilder.curveToRelative(0.47f, -0.14f, 0.96f, -0.24f, 1.47f, -0.24f);
        pathBuilder.close();
        pathBuilder.moveTo(2.71f, 3.16f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(1.97f, 1.97f);
        pathBuilder.curveTo(3.06f, 7.83f, 1.77f, 9.53f, 1.0f, 11.5f);
        pathBuilder.curveTo(2.73f, 15.89f, 7.0f, 19.0f, 12.0f, 19.0f);
        pathBuilder.curveToRelative(1.52f, 0.0f, 2.97f, -0.3f, 4.31f, -0.82f);
        pathBuilder.lineToRelative(2.72f, 2.72f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineTo(4.13f, 3.16f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 16.5f);
        pathBuilder.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        pathBuilder.curveToRelative(0.0f, -0.77f, 0.18f, -1.5f, 0.49f, -2.14f);
        pathBuilder.lineToRelative(1.57f, 1.57f);
        pathBuilder.curveToRelative(-0.03f, 0.18f, -0.06f, 0.37f, -0.06f, 0.57f);
        pathBuilder.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.curveToRelative(0.2f, 0.0f, 0.38f, -0.03f, 0.57f, -0.07f);
        pathBuilder.lineTo(14.14f, 16.0f);
        pathBuilder.curveToRelative(-0.65f, 0.32f, -1.37f, 0.5f, -2.14f, 0.5f);
        pathBuilder.close();
        pathBuilder.moveTo(14.97f, 11.17f);
        pathBuilder.curveToRelative(-0.15f, -1.4f, -1.25f, -2.49f, -2.64f, -2.64f);
        pathBuilder.lineToRelative(2.64f, 2.64f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _visibilityOff = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
