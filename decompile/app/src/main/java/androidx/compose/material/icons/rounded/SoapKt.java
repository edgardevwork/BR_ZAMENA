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

/* compiled from: Soap.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_soap", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Soap", "Landroidx/compose/material/icons/Icons$Rounded;", "getSoap", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSoap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Soap.kt\nandroidx/compose/material/icons/rounded/SoapKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,103:1\n212#2,12:104\n233#2,18:117\n253#2:154\n174#3:116\n705#4,2:135\n717#4,2:137\n719#4,11:143\n72#5,4:139\n*S KotlinDebug\n*F\n+ 1 Soap.kt\nandroidx/compose/material/icons/rounded/SoapKt\n*L\n29#1:104,12\n30#1:117,18\n30#1:154\n29#1:116\n30#1:135,2\n30#1:137,2\n30#1:143,11\n30#1:139,4\n*E\n"})
/* loaded from: classes.dex */
public final class SoapKt {

    @Nullable
    private static ImageVector _soap;

    @NotNull
    public static final ImageVector getSoap(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _soap;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Soap", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.25f, 6.0f);
        pathBuilder.curveTo(14.66f, 6.0f, 15.0f, 6.34f, 15.0f, 6.75f);
        pathBuilder.reflectiveCurveTo(14.66f, 7.5f, 14.25f, 7.5f);
        pathBuilder.reflectiveCurveTo(13.5f, 7.16f, 13.5f, 6.75f);
        pathBuilder.reflectiveCurveTo(13.84f, 6.0f, 14.25f, 6.0f);
        pathBuilder.moveTo(14.25f, 4.5f);
        pathBuilder.curveTo(13.01f, 4.5f, 12.0f, 5.51f, 12.0f, 6.75f);
        pathBuilder.reflectiveCurveTo(13.01f, 9.0f, 14.25f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(2.25f, -1.01f, 2.25f, -2.25f);
        pathBuilder.reflectiveCurveTo(15.49f, 4.5f, 14.25f, 4.5f);
        pathBuilder.lineTo(14.25f, 4.5f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 5.5f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.reflectiveCurveTo(20.28f, 6.5f, 20.0f, 6.5f);
        pathBuilder.reflectiveCurveTo(19.5f, 6.28f, 19.5f, 6.0f);
        pathBuilder.reflectiveCurveTo(19.72f, 5.5f, 20.0f, 5.5f);
        pathBuilder.moveTo(20.0f, 4.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(21.1f, 4.0f, 20.0f, 4.0f);
        pathBuilder.lineTo(20.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 2.5f);
        pathBuilder.curveTo(18.0f, 3.33f, 17.33f, 4.0f, 16.5f, 4.0f);
        pathBuilder.curveTo(15.67f, 4.0f, 15.0f, 3.33f, 15.0f, 2.5f);
        pathBuilder.reflectiveCurveTo(15.67f, 1.0f, 16.5f, 1.0f);
        pathBuilder.curveTo(17.33f, 1.0f, 18.0f, 1.67f, 18.0f, 2.5f);
        pathBuilder.close();
        pathBuilder.moveTo(1.94f, 11.79f);
        pathBuilder.curveTo(1.34f, 12.35f, 1.0f, 13.14f, 1.0f, 13.97f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.lineToRelative(13.68f, 0.0f);
        pathBuilder.curveToRelative(0.65f, 0.0f, 1.25f, -0.47f, 1.32f, -1.12f);
        pathBuilder.curveToRelative(0.08f, -0.75f, -0.51f, -1.38f, -1.24f, -1.38f);
        pathBuilder.horizontalLineTo(12.5f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.lineToRelative(7.18f, 0.0f);
        pathBuilder.curveToRelative(0.65f, 0.0f, 1.25f, -0.47f, 1.32f, -1.12f);
        pathBuilder.curveToRelative(0.08f, -0.75f, -0.51f, -1.38f, -1.24f, -1.38f);
        pathBuilder.horizontalLineTo(12.5f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.lineToRelative(8.18f, 0.0f);
        pathBuilder.curveToRelative(0.65f, 0.0f, 1.25f, -0.47f, 1.32f, -1.12f);
        pathBuilder.curveToRelative(0.08f, -0.75f, -0.51f, -1.38f, -1.24f, -1.38f);
        pathBuilder.horizontalLineTo(12.5f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.lineToRelative(6.18f, 0.0f);
        pathBuilder.curveToRelative(0.65f, 0.0f, 1.25f, -0.47f, 1.32f, -1.12f);
        pathBuilder.curveToRelative(0.08f, -0.75f, -0.51f, -1.38f, -1.24f, -1.38f);
        pathBuilder.horizontalLineTo(8.86f);
        pathBuilder.lineToRelative(1.49f, -2.61f);
        pathBuilder.curveToRelative(0.09f, -0.16f, 0.14f, -0.33f, 0.14f, -0.53f);
        pathBuilder.curveToRelative(0.0f, -0.26f, -0.09f, -0.5f, -0.26f, -0.7f);
        pathBuilder.lineTo(9.81f, 5.71f);
        pathBuilder.curveTo(9.43f, 5.32f, 8.8f, 5.3f, 8.4f, 5.68f);
        pathBuilder.lineTo(1.94f, 11.79f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _soap = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
