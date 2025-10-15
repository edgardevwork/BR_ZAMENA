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

/* compiled from: HdrOffSelect.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_hdrOffSelect", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HdrOffSelect", "Landroidx/compose/material/icons/Icons$Rounded;", "getHdrOffSelect", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHdrOffSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HdrOffSelect.kt\nandroidx/compose/material/icons/rounded/HdrOffSelectKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,143:1\n212#2,12:144\n233#2,18:157\n253#2:194\n174#3:156\n705#4,2:175\n717#4,2:177\n719#4,11:183\n72#5,4:179\n*S KotlinDebug\n*F\n+ 1 HdrOffSelect.kt\nandroidx/compose/material/icons/rounded/HdrOffSelectKt\n*L\n29#1:144,12\n30#1:157,18\n30#1:194\n29#1:156\n30#1:175,2\n30#1:177,2\n30#1:183,11\n30#1:179,4\n*E\n"})
/* loaded from: classes.dex */
public final class HdrOffSelectKt {

    @Nullable
    private static ImageVector _hdrOffSelect;

    @NotNull
    public static final ImageVector getHdrOffSelect(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _hdrOffSelect;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HdrOffSelect", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 18.5f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder.horizontalLineTo(14.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(4.31f);
        pathBuilder.curveToRelative(0.0f, 0.38f, 0.31f, 0.69f, 0.69f, 0.69f);
        pathBuilder.horizontalLineToRelative(0.11f);
        pathBuilder.curveToRelative(0.38f, 0.0f, 0.69f, -0.31f, 0.69f, -0.69f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.horizontalLineToRelative(1.1f);
        pathBuilder.lineToRelative(0.72f, 1.59f);
        pathBuilder.curveToRelative(0.11f, 0.25f, 0.36f, 0.41f, 0.63f, 0.41f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.5f, 0.0f, 0.83f, -0.51f, 0.64f, -0.97f);
        pathBuilder.lineTo(17.1f, 19.9f);
        pathBuilder.curveTo(17.6f, 19.6f, 18.0f, 19.1f, 18.0f, 18.5f);
        pathBuilder.close();
        pathBuilder.moveTo(16.5f, 18.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(18.5f);
        pathBuilder.close();
        pathBuilder.moveTo(3.5f, 18.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-1.25f);
        pathBuilder.curveTo(1.5f, 16.34f, 1.16f, 16.0f, 0.75f, 16.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(0.34f, 16.0f, 0.0f, 16.34f, 0.0f, 16.75f);
        pathBuilder.verticalLineToRelative(4.5f);
        pathBuilder.curveTo(0.0f, 21.66f, 0.34f, 22.0f, 0.75f, 22.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilder.verticalLineTo(19.5f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(1.75f);
        pathBuilder.curveTo(3.5f, 21.66f, 3.84f, 22.0f, 4.25f, 22.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(4.66f, 22.0f, 5.0f, 21.66f, 5.0f, 21.25f);
        pathBuilder.verticalLineToRelative(-4.5f);
        pathBuilder.curveTo(5.0f, 16.34f, 4.66f, 16.0f, 4.25f, 16.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 16.0f);
        pathBuilder.horizontalLineTo(7.5f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineTo(10.0f);
        pathBuilder.curveToRelative(0.82f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveTo(11.5f, 16.67f, 10.82f, 16.0f, 10.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 20.5f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(20.5f);
        pathBuilder.close();
        pathBuilder.moveTo(23.25f, 20.0f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.verticalLineToRelative(1.25f);
        pathBuilder.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.horizontalLineToRelative(-1.25f);
        pathBuilder.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilder.horizontalLineToRelative(1.25f);
        pathBuilder.verticalLineToRelative(-1.25f);
        pathBuilder.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilder.verticalLineToRelative(1.25f);
        pathBuilder.horizontalLineToRelative(1.25f);
        pathBuilder.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(24.0f, 19.66f, 23.66f, 20.0f, 23.25f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.98f, 4.15f);
        pathBuilder.lineTo(9.42f, 2.59f);
        pathBuilder.curveToRelative(5.1f, -2.42f, 10.41f, 2.89f, 7.99f, 7.99f);
        pathBuilder.lineToRelative(-1.56f, -1.56f);
        pathBuilder.curveTo(16.66f, 6.06f, 13.94f, 3.34f, 10.98f, 4.15f);
        pathBuilder.close();
        pathBuilder.moveTo(5.63f, 3.05f);
        pathBuilder.lineTo(5.63f, 3.05f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(0.96f, 0.96f);
        pathBuilder.curveToRelative(-2.42f, 5.1f, 2.88f, 10.41f, 7.99f, 7.99f);
        pathBuilder.lineToRelative(0.95f, 0.95f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineToRelative(-9.9f, -9.91f);
        pathBuilder.curveTo(6.66f, 2.66f, 6.02f, 2.66f, 5.63f, 3.05f);
        pathBuilder.close();
        pathBuilder.moveTo(8.15f, 6.98f);
        pathBuilder.lineToRelative(4.87f, 4.87f);
        pathBuilder.curveTo(10.06f, 12.66f, 7.34f, 9.94f, 8.15f, 6.98f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hdrOffSelect = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
