package androidx.compose.material.icons.twotone;

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
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_soap", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Soap", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSoap", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSoap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Soap.kt\nandroidx/compose/material/icons/twotone/SoapKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,128:1\n212#2,12:129\n233#2,18:142\n253#2:179\n233#2,18:180\n253#2:217\n174#3:141\n705#4,2:160\n717#4,2:162\n719#4,11:168\n705#4,2:198\n717#4,2:200\n719#4,11:206\n72#5,4:164\n72#5,4:202\n*S KotlinDebug\n*F\n+ 1 Soap.kt\nandroidx/compose/material/icons/twotone/SoapKt\n*L\n29#1:129,12\n30#1:142,18\n30#1:179\n52#1:180,18\n52#1:217\n29#1:141\n30#1:160,2\n30#1:162,2\n30#1:168,11\n52#1:198,2\n52#1:200,2\n52#1:206,11\n30#1:164,4\n52#1:202,4\n*E\n"})
/* loaded from: classes.dex */
public final class SoapKt {

    @Nullable
    private static ImageVector _soap;

    @NotNull
    public static final ImageVector getSoap(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _soap;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Soap", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.25f, 6.0f);
        pathBuilder.curveTo(14.66f, 6.0f, 15.0f, 6.34f, 15.0f, 6.75f);
        pathBuilder.reflectiveCurveTo(14.66f, 7.5f, 14.25f, 7.5f);
        pathBuilder.reflectiveCurveTo(13.5f, 7.16f, 13.5f, 6.75f);
        pathBuilder.reflectiveCurveTo(13.84f, 6.0f, 14.25f, 6.0f);
        pathBuilder.moveTo(20.0f, 5.5f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.reflectiveCurveTo(20.28f, 6.5f, 20.0f, 6.5f);
        pathBuilder.reflectiveCurveTo(19.5f, 6.28f, 19.5f, 6.0f);
        pathBuilder.reflectiveCurveTo(19.72f, 5.5f, 20.0f, 5.5f);
        pathBuilder.moveTo(10.0f, 21.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.curveToRelative(0.0f, -0.39f, 0.23f, -0.64f, 0.36f, -0.75f);
        pathBuilder.lineTo(7.0f, 9.87f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.lineToRelative(3.0f, 0.0f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(14.25f, 6.0f);
        pathBuilder2.curveTo(14.66f, 6.0f, 15.0f, 6.34f, 15.0f, 6.75f);
        pathBuilder2.reflectiveCurveTo(14.66f, 7.5f, 14.25f, 7.5f);
        pathBuilder2.reflectiveCurveTo(13.5f, 7.16f, 13.5f, 6.75f);
        pathBuilder2.reflectiveCurveTo(13.84f, 6.0f, 14.25f, 6.0f);
        pathBuilder2.moveTo(14.25f, 4.5f);
        pathBuilder2.curveTo(13.01f, 4.5f, 12.0f, 5.51f, 12.0f, 6.75f);
        pathBuilder2.reflectiveCurveTo(13.01f, 9.0f, 14.25f, 9.0f);
        pathBuilder2.reflectiveCurveToRelative(2.25f, -1.01f, 2.25f, -2.25f);
        pathBuilder2.reflectiveCurveTo(15.49f, 4.5f, 14.25f, 4.5f);
        pathBuilder2.lineTo(14.25f, 4.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.0f, 5.5f);
        pathBuilder2.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder2.reflectiveCurveTo(20.28f, 6.5f, 20.0f, 6.5f);
        pathBuilder2.reflectiveCurveTo(19.5f, 6.28f, 19.5f, 6.0f);
        pathBuilder2.reflectiveCurveTo(19.72f, 5.5f, 20.0f, 5.5f);
        pathBuilder2.moveTo(20.0f, 4.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder2.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.reflectiveCurveTo(21.1f, 4.0f, 20.0f, 4.0f);
        pathBuilder2.lineTo(20.0f, 4.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.5f, 1.0f);
        pathBuilder2.curveTo(15.67f, 1.0f, 15.0f, 1.67f, 15.0f, 2.5f);
        pathBuilder2.reflectiveCurveTo(15.67f, 4.0f, 16.5f, 4.0f);
        pathBuilder2.curveTo(17.33f, 4.0f, 18.0f, 3.33f, 18.0f, 2.5f);
        pathBuilder2.reflectiveCurveTo(17.33f, 1.0f, 16.5f, 1.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.75f, 16.0f);
        pathBuilder2.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        pathBuilder2.reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f);
        pathBuilder2.horizontalLineTo(12.0f);
        pathBuilder2.verticalLineToRelative(-1.0f);
        pathBuilder2.horizontalLineToRelative(6.75f);
        pathBuilder2.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        pathBuilder2.curveToRelative(0.0f, -0.67f, -0.53f, -1.2f, -1.18f, -1.24f);
        pathBuilder2.lineTo(8.87f, 10.0f);
        pathBuilder2.lineToRelative(1.48f, -2.6f);
        pathBuilder2.curveToRelative(0.09f, -0.17f, 0.14f, -0.34f, 0.14f, -0.54f);
        pathBuilder2.curveToRelative(0.0f, -0.26f, -0.09f, -0.5f, -0.26f, -0.7f);
        pathBuilder2.lineTo(9.12f, 5.0f);
        pathBuilder2.lineToRelative(-7.18f, 6.8f);
        pathBuilder2.curveTo(1.34f, 12.36f, 1.0f, 13.15f, 1.0f, 13.97f);
        pathBuilder2.verticalLineTo(20.0f);
        pathBuilder2.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder2.horizontalLineToRelative(13.75f);
        pathBuilder2.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        pathBuilder2.reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f);
        pathBuilder2.horizontalLineTo(12.0f);
        pathBuilder2.verticalLineToRelative(-1.0f);
        pathBuilder2.horizontalLineToRelative(7.75f);
        pathBuilder2.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        pathBuilder2.reflectiveCurveTo(20.44f, 17.0f, 19.75f, 17.0f);
        pathBuilder2.horizontalLineTo(12.0f);
        pathBuilder2.verticalLineToRelative(-1.0f);
        pathBuilder2.horizontalLineTo(20.75f);
        pathBuilder2.close();
        pathBuilder2.moveTo(10.0f, 21.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder2.verticalLineToRelative(-6.0f);
        pathBuilder2.curveToRelative(0.0f, -0.39f, 0.23f, -0.64f, 0.36f, -0.75f);
        pathBuilder2.lineTo(7.0f, 9.87f);
        pathBuilder2.verticalLineTo(12.0f);
        pathBuilder2.lineToRelative(3.0f, 0.0f);
        pathBuilder2.verticalLineTo(21.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _soap = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
