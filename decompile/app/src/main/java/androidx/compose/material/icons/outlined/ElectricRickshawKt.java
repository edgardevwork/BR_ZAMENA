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

/* compiled from: ElectricRickshaw.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_electricRickshaw", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ElectricRickshaw", "Landroidx/compose/material/icons/Icons$Outlined;", "getElectricRickshaw", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nElectricRickshaw.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElectricRickshaw.kt\nandroidx/compose/material/icons/outlined/ElectricRickshawKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,111:1\n212#2,12:112\n233#2,18:125\n253#2:162\n233#2,18:163\n253#2:200\n174#3:124\n705#4,2:143\n717#4,2:145\n719#4,11:151\n705#4,2:181\n717#4,2:183\n719#4,11:189\n72#5,4:147\n72#5,4:185\n*S KotlinDebug\n*F\n+ 1 ElectricRickshaw.kt\nandroidx/compose/material/icons/outlined/ElectricRickshawKt\n*L\n29#1:112,12\n30#1:125,18\n30#1:162\n97#1:163,18\n97#1:200\n29#1:124\n30#1:143,2\n30#1:145,2\n30#1:151,11\n97#1:181,2\n97#1:183,2\n97#1:189,11\n30#1:147,4\n97#1:185,4\n*E\n"})
/* loaded from: classes4.dex */
public final class ElectricRickshawKt {

    @Nullable
    private static ImageVector _electricRickshaw;

    @NotNull
    public static final ImageVector getElectricRickshaw(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _electricRickshaw;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ElectricRickshaw", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 11.18f);
        pathBuilder.verticalLineTo(9.72f);
        pathBuilder.curveToRelative(0.0f, -0.47f, -0.16f, -0.92f, -0.46f, -1.28f);
        pathBuilder.lineTo(16.6f, 3.72f);
        pathBuilder.curveTo(16.22f, 3.26f, 15.66f, 3.0f, 15.06f, 3.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.curveTo(1.9f, 3.0f, 1.0f, 3.9f, 1.0f, 5.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(0.18f);
        pathBuilder.curveTo(3.6f, 16.16f, 4.7f, 17.0f, 6.0f, 17.0f);
        pathBuilder.reflectiveCurveToRelative(2.4f, -0.84f, 2.82f, -2.0f);
        pathBuilder.horizontalLineToRelative(8.37f);
        pathBuilder.curveToRelative(0.41f, 1.16f, 1.51f, 2.0f, 2.82f, 2.0f);
        pathBuilder.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder.curveTo(23.0f, 12.7f, 22.16f, 11.6f, 21.0f, 11.18f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 15.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(6.55f, 15.0f, 6.0f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 11.17f);
        pathBuilder.curveTo(6.69f, 11.06f, 6.35f, 11.0f, 6.0f, 11.0f);
        pathBuilder.curveToRelative(-1.3f, 0.0f, -2.42f, 0.84f, -2.83f, 2.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineTo(11.17f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 8.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 13.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 6.12f);
        pathBuilder.lineTo(18.4f, 9.0f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.verticalLineTo(6.12f);
        pathBuilder.close();
        pathBuilder.moveTo(17.17f, 13.0f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(0.17f);
        pathBuilder.curveTo(18.15f, 11.47f, 17.47f, 12.15f, 17.17f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 15.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(20.55f, 15.0f, 20.0f, 15.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(7.0f, 20.0f);
        pathBuilder2.lineToRelative(4.0f, 0.0f);
        pathBuilder2.lineToRelative(0.0f, -2.0f);
        pathBuilder2.lineToRelative(6.0f, 3.0f);
        pathBuilder2.lineToRelative(-4.0f, 0.0f);
        pathBuilder2.lineToRelative(0.0f, 2.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _electricRickshaw = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
