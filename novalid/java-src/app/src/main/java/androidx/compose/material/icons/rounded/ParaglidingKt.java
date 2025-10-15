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

/* compiled from: Paragliding.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_paragliding", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Paragliding", "Landroidx/compose/material/icons/Icons$Rounded;", "getParagliding", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nParagliding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Paragliding.kt\nandroidx/compose/material/icons/rounded/ParaglidingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,88:1\n212#2,12:89\n233#2,18:102\n253#2:139\n174#3:101\n705#4,2:120\n717#4,2:122\n719#4,11:128\n72#5,4:124\n*S KotlinDebug\n*F\n+ 1 Paragliding.kt\nandroidx/compose/material/icons/rounded/ParaglidingKt\n*L\n29#1:89,12\n30#1:102,18\n30#1:139\n29#1:101\n30#1:120,2\n30#1:122,2\n30#1:128,11\n30#1:124,4\n*E\n"})
/* loaded from: classes.dex */
public final class ParaglidingKt {

    @Nullable
    private static ImageVector _paragliding;

    @NotNull
    public static final ImageVector getParagliding(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _paragliding;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Paragliding", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 17.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(13.1f, 17.0f, 12.0f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.95f, 14.0f);
        pathBuilder.curveToRelative(-0.52f, 0.0f, -0.94f, 0.4f, -0.99f, 0.92f);
        pathBuilder.curveToRelative(-0.2f, 2.03f, -1.05f, 2.68f, -1.48f, 3.02f);
        pathBuilder.curveTo(14.68f, 18.54f, 14.0f, 19.0f, 12.0f, 19.0f);
        pathBuilder.reflectiveCurveToRelative(-2.68f, -0.46f, -3.48f, -1.06f);
        pathBuilder.curveToRelative(-0.43f, -0.34f, -1.28f, -0.99f, -1.48f, -3.02f);
        pathBuilder.curveTo(6.99f, 14.4f, 6.57f, 14.0f, 6.05f, 14.0f);
        pathBuilder.curveToRelative(-0.59f, 0.0f, -1.06f, 0.51f, -1.0f, 1.09f);
        pathBuilder.curveToRelative(0.22f, 2.08f, 1.07f, 3.47f, 2.24f, 4.41f);
        pathBuilder.curveToRelative(0.5f, 0.4f, 1.1f, 0.7f, 1.7f, 0.9f);
        pathBuilder.lineTo(9.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(-3.6f);
        pathBuilder.curveToRelative(0.6f, -0.2f, 1.2f, -0.5f, 1.7f, -0.9f);
        pathBuilder.curveToRelative(1.17f, -0.94f, 2.03f, -2.32f, 2.24f, -4.41f);
        pathBuilder.curveTo(19.01f, 14.51f, 18.53f, 14.0f, 17.95f, 14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 0.0f);
        pathBuilder.curveTo(5.92f, 0.0f, 1.0f, 1.9f, 1.0f, 4.25f);
        pathBuilder.verticalLineToRelative(3.49f);
        pathBuilder.curveTo(1.0f, 8.55f, 1.88f, 9.0f, 2.56f, 8.57f);
        pathBuilder.curveTo(2.7f, 8.48f, 2.84f, 8.39f, 3.0f, 8.31f);
        pathBuilder.lineTo(5.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineToRelative(1.5f, -6.28f);
        pathBuilder.curveTo(9.6f, 6.58f, 10.78f, 6.5f, 12.0f, 6.5f);
        pathBuilder.reflectiveCurveToRelative(2.4f, 0.08f, 3.5f, 0.22f);
        pathBuilder.lineTo(17.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineToRelative(2.0f, -4.69f);
        pathBuilder.curveToRelative(0.16f, 0.09f, 0.3f, 0.17f, 0.44f, 0.26f);
        pathBuilder.curveTo(22.12f, 9.0f, 23.0f, 8.55f, 23.0f, 7.74f);
        pathBuilder.verticalLineTo(4.25f);
        pathBuilder.curveTo(23.0f, 1.9f, 18.08f, 0.0f, 12.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.88f, 11.24f);
        pathBuilder.lineTo(4.37f, 7.69f);
        pathBuilder.curveToRelative(0.75f, -0.28f, 1.6f, -0.52f, 2.53f, -0.71f);
        pathBuilder.lineTo(5.88f, 11.24f);
        pathBuilder.close();
        pathBuilder.moveTo(18.12f, 11.24f);
        pathBuilder.lineTo(17.1f, 6.98f);
        pathBuilder.curveToRelative(0.93f, 0.19f, 1.78f, 0.43f, 2.53f, 0.71f);
        pathBuilder.lineTo(18.12f, 11.24f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _paragliding = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
