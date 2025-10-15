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

/* compiled from: Tonality.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_tonality", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Tonality", "Landroidx/compose/material/icons/Icons$Outlined;", "getTonality", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTonality.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tonality.kt\nandroidx/compose/material/icons/outlined/TonalityKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,82:1\n212#2,12:83\n233#2,18:96\n253#2:133\n174#3:95\n705#4,2:114\n717#4,2:116\n719#4,11:122\n72#5,4:118\n*S KotlinDebug\n*F\n+ 1 Tonality.kt\nandroidx/compose/material/icons/outlined/TonalityKt\n*L\n29#1:83,12\n30#1:96,18\n30#1:133\n29#1:95\n30#1:114,2\n30#1:116,2\n30#1:122,11\n30#1:118,4\n*E\n"})
/* loaded from: classes2.dex */
public final class TonalityKt {

    @Nullable
    private static ImageVector _tonality;

    @NotNull
    public static final ImageVector getTonality(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _tonality;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Tonality", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 19.93f);
        pathBuilder.curveToRelative(-3.94f, -0.49f, -7.0f, -3.85f, -7.0f, -7.93f);
        pathBuilder.reflectiveCurveToRelative(3.05f, -7.44f, 7.0f, -7.93f);
        pathBuilder.verticalLineToRelative(15.86f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 4.07f);
        pathBuilder.curveToRelative(1.03f, 0.13f, 2.0f, 0.45f, 2.87f, 0.93f);
        pathBuilder.lineTo(13.0f, 5.0f);
        pathBuilder.verticalLineToRelative(-0.93f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(5.24f);
        pathBuilder.curveToRelative(0.25f, 0.31f, 0.48f, 0.65f, 0.68f, 1.0f);
        pathBuilder.lineTo(13.0f, 8.0f);
        pathBuilder.lineTo(13.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 10.0f);
        pathBuilder.horizontalLineToRelative(6.74f);
        pathBuilder.curveToRelative(0.08f, 0.33f, 0.15f, 0.66f, 0.19f, 1.0f);
        pathBuilder.lineTo(13.0f, 11.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 19.93f);
        pathBuilder.lineTo(13.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(2.87f);
        pathBuilder.curveToRelative(-0.87f, 0.48f, -1.84f, 0.8f, -2.87f, 0.93f);
        pathBuilder.close();
        pathBuilder.moveTo(18.24f, 17.0f);
        pathBuilder.lineTo(13.0f, 17.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(5.92f);
        pathBuilder.curveToRelative(-0.2f, 0.35f, -0.43f, 0.69f, -0.68f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.74f, 14.0f);
        pathBuilder.lineTo(13.0f, 14.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(6.93f);
        pathBuilder.curveToRelative(-0.04f, 0.34f, -0.11f, 0.67f, -0.19f, 1.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tonality = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
