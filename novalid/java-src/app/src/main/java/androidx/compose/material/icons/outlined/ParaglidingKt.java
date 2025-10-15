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

/* compiled from: Paragliding.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_paragliding", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Paragliding", "Landroidx/compose/material/icons/Icons$Outlined;", "getParagliding", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nParagliding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Paragliding.kt\nandroidx/compose/material/icons/outlined/ParaglidingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,94:1\n212#2,12:95\n233#2,18:108\n253#2:145\n174#3:107\n705#4,2:126\n717#4,2:128\n719#4,11:134\n72#5,4:130\n*S KotlinDebug\n*F\n+ 1 Paragliding.kt\nandroidx/compose/material/icons/outlined/ParaglidingKt\n*L\n29#1:95,12\n30#1:108,18\n30#1:145\n29#1:107\n30#1:126,2\n30#1:128,2\n30#1:134,11\n30#1:130,4\n*E\n"})
/* loaded from: classes.dex */
public final class ParaglidingKt {

    @Nullable
    private static ImageVector _paragliding;

    @NotNull
    public static final ImageVector getParagliding(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _paragliding;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Paragliding", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 17.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.curveTo(14.0f, 16.1f, 13.1f, 17.0f, 12.0f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.48f, 17.94f);
        pathBuilder.curveTo(14.68f, 18.54f, 14.0f, 19.0f, 12.0f, 19.0f);
        pathBuilder.reflectiveCurveToRelative(-2.68f, -0.46f, -3.48f, -1.06f);
        pathBuilder.curveTo(8.04f, 17.55f, 7.0f, 16.76f, 7.0f, 14.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveToRelative(0.0f, 2.7f, 0.93f, 4.41f, 2.3f, 5.5f);
        pathBuilder.curveToRelative(0.5f, 0.4f, 1.1f, 0.7f, 1.7f, 0.9f);
        pathBuilder.verticalLineTo(24.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(-3.6f);
        pathBuilder.curveToRelative(0.6f, -0.2f, 1.2f, -0.5f, 1.7f, -0.9f);
        pathBuilder.curveToRelative(1.37f, -1.09f, 2.3f, -2.8f, 2.3f, -5.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveTo(17.0f, 16.76f, 15.96f, 17.55f, 15.48f, 17.94f);
        pathBuilder.close();
        pathBuilder.moveTo(23.0f, 4.25f);
        pathBuilder.verticalLineToRelative(3.49f);
        pathBuilder.curveToRelative(0.0f, 0.8f, -0.88f, 1.26f, -1.56f, 0.83f);
        pathBuilder.curveTo(21.3f, 8.48f, 21.16f, 8.39f, 21.0f, 8.31f);
        pathBuilder.lineTo(19.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.lineToRelative(-1.5f, -6.28f);
        pathBuilder.curveTo(14.4f, 6.58f, 13.22f, 6.5f, 12.0f, 6.5f);
        pathBuilder.reflectiveCurveTo(9.6f, 6.58f, 8.5f, 6.72f);
        pathBuilder.lineTo(7.0f, 13.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.lineTo(3.0f, 8.31f);
        pathBuilder.curveTo(2.84f, 8.39f, 2.7f, 8.48f, 2.56f, 8.57f);
        pathBuilder.curveTo(1.88f, 9.0f, 1.0f, 8.55f, 1.0f, 7.74f);
        pathBuilder.verticalLineTo(4.25f);
        pathBuilder.curveTo(1.0f, 1.9f, 5.92f, 0.0f, 12.0f, 0.0f);
        pathBuilder.reflectiveCurveTo(23.0f, 1.9f, 23.0f, 4.25f);
        pathBuilder.close();
        pathBuilder.moveTo(6.9f, 6.98f);
        pathBuilder.curveTo(5.97f, 7.17f, 5.12f, 7.41f, 4.37f, 7.69f);
        pathBuilder.lineToRelative(1.51f, 3.55f);
        pathBuilder.lineTo(6.9f, 6.98f);
        pathBuilder.close();
        pathBuilder.moveTo(19.63f, 7.69f);
        pathBuilder.curveToRelative(-0.75f, -0.28f, -1.6f, -0.52f, -2.53f, -0.71f);
        pathBuilder.lineToRelative(1.02f, 4.25f);
        pathBuilder.lineTo(19.63f, 7.69f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 4.31f);
        pathBuilder.curveTo(20.65f, 3.63f, 17.57f, 2.0f, 12.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(3.35f, 3.63f, 3.0f, 4.31f);
        pathBuilder.verticalLineToRelative(1.77f);
        pathBuilder.curveTo(5.34f, 5.07f, 8.56f, 4.5f, 12.0f, 4.5f);
        pathBuilder.reflectiveCurveToRelative(6.66f, 0.57f, 9.0f, 1.58f);
        pathBuilder.verticalLineTo(4.31f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _paragliding = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
