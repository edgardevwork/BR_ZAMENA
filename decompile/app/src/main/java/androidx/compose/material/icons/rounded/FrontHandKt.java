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

/* compiled from: FrontHand.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_frontHand", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FrontHand", "Landroidx/compose/material/icons/Icons$Rounded;", "getFrontHand", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFrontHand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrontHand.kt\nandroidx/compose/material/icons/rounded/FrontHandKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,73:1\n212#2,12:74\n233#2,18:87\n253#2:124\n174#3:86\n705#4,2:105\n717#4,2:107\n719#4,11:113\n72#5,4:109\n*S KotlinDebug\n*F\n+ 1 FrontHand.kt\nandroidx/compose/material/icons/rounded/FrontHandKt\n*L\n29#1:74,12\n30#1:87,18\n30#1:124\n29#1:86\n30#1:105,2\n30#1:107,2\n30#1:113,11\n30#1:109,4\n*E\n"})
/* loaded from: classes4.dex */
public final class FrontHandKt {

    @Nullable
    private static ImageVector _frontHand;

    @NotNull
    public static final ImageVector getFrontHand(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _frontHand;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FrontHand", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.5f, 14.5f);
        pathBuilder.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-1.51f, 0.0f, -2.77f, 1.12f, -2.97f, 2.58f);
        pathBuilder.curveTo(15.0f, 17.82f, 14.78f, 18.0f, 14.54f, 18.0f);
        pathBuilder.curveToRelative(-0.3f, 0.0f, -0.54f, -0.27f, -0.5f, -0.57f);
        pathBuilder.curveToRelative(0.26f, -1.77f, 1.68f, -3.17f, 3.46f, -3.4f);
        pathBuilder.lineToRelative(0.0f, -10.78f);
        pathBuilder.curveTo(17.5f, 2.56f, 16.94f, 2.0f, 16.25f, 2.0f);
        pathBuilder.curveTo(15.56f, 2.0f, 15.0f, 2.56f, 15.0f, 3.25f);
        pathBuilder.verticalLineToRelative(7.25f);
        pathBuilder.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilder.reflectiveCurveTo(14.0f, 10.78f, 14.0f, 10.5f);
        pathBuilder.verticalLineTo(1.25f);
        pathBuilder.curveTo(14.0f, 0.56f, 13.44f, 0.0f, 12.75f, 0.0f);
        pathBuilder.reflectiveCurveTo(11.5f, 0.56f, 11.5f, 1.25f);
        pathBuilder.verticalLineToRelative(9.25f);
        pathBuilder.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilder.reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.verticalLineTo(2.75f);
        pathBuilder.curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f);
        pathBuilder.reflectiveCurveTo(8.0f, 2.06f, 8.0f, 2.75f);
        pathBuilder.verticalLineToRelative(8.75f);
        pathBuilder.curveTo(8.0f, 11.78f, 7.78f, 12.0f, 7.5f, 12.0f);
        pathBuilder.reflectiveCurveTo(7.0f, 11.78f, 7.0f, 11.5f);
        pathBuilder.verticalLineTo(5.75f);
        pathBuilder.curveTo(7.0f, 5.06f, 6.44f, 4.5f, 5.75f, 4.5f);
        pathBuilder.reflectiveCurveTo(4.5f, 5.06f, 4.5f, 5.75f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.curveToRelative(0.0f, 4.56f, 3.69f, 8.25f, 8.25f, 8.25f);
        pathBuilder.reflectiveCurveTo(21.0f, 20.31f, 21.0f, 15.75f);
        pathBuilder.verticalLineToRelative(-6.5f);
        pathBuilder.curveTo(21.0f, 8.56f, 20.44f, 8.0f, 19.75f, 8.0f);
        pathBuilder.reflectiveCurveTo(18.5f, 8.56f, 18.5f, 9.25f);
        pathBuilder.verticalLineTo(14.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _frontHand = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
