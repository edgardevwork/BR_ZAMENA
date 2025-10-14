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

/* compiled from: ClosedCaptionDisabled.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_closedCaptionDisabled", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ClosedCaptionDisabled", "Landroidx/compose/material/icons/Icons$TwoTone;", "getClosedCaptionDisabled", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nClosedCaptionDisabled.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClosedCaptionDisabled.kt\nandroidx/compose/material/icons/twotone/ClosedCaptionDisabledKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,143:1\n212#2,12:144\n233#2,18:157\n253#2:194\n233#2,18:195\n253#2:232\n174#3:156\n705#4,2:175\n717#4,2:177\n719#4,11:183\n705#4,2:213\n717#4,2:215\n719#4,11:221\n72#5,4:179\n72#5,4:217\n*S KotlinDebug\n*F\n+ 1 ClosedCaptionDisabled.kt\nandroidx/compose/material/icons/twotone/ClosedCaptionDisabledKt\n*L\n29#1:144,12\n30#1:157,18\n30#1:194\n73#1:195,18\n73#1:232\n29#1:156\n30#1:175,2\n30#1:177,2\n30#1:183,11\n73#1:213,2\n73#1:215,2\n73#1:221,11\n30#1:179,4\n73#1:217,4\n*E\n"})
/* loaded from: classes3.dex */
public final class ClosedCaptionDisabledKt {

    @Nullable
    private static ImageVector _closedCaptionDisabled;

    @NotNull
    public static final ImageVector getClosedCaptionDisabled(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _closedCaptionDisabled;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ClosedCaptionDisabled", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.83f, 6.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.verticalLineToRelative(10.17f);
        pathBuilder.lineToRelative(-1.4f, -1.4f);
        pathBuilder.curveTo(17.84f, 14.59f, 18.0f, 14.32f, 18.0f, 14.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.verticalLineToRelative(0.5f);
        pathBuilder.horizontalLineToRelative(-0.17f);
        pathBuilder.lineToRelative(-1.83f, -1.83f);
        pathBuilder.verticalLineTo(10.5f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(0.17f);
        pathBuilder.lineTo(8.83f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.5f, 13.5f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder.horizontalLineToRelative(0.67f);
        pathBuilder.lineToRelative(-2.5f, -2.5f);
        pathBuilder.horizontalLineTo(7.5f);
        pathBuilder.verticalLineTo(13.5f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 14.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(0.0f, -0.32f, 0.16f, -0.59f, 0.4f, -0.78f);
        pathBuilder.lineTo(5.0f, 7.83f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.horizontalLineToRelative(10.17f);
        pathBuilder.lineTo(11.0f, 13.83f);
        pathBuilder.verticalLineTo(14.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(6.83f, 4.0f);
        pathBuilder2.horizontalLineTo(19.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(12.0f);
        pathBuilder2.curveToRelative(0.0f, 0.05f, -0.01f, 0.1f, -0.02f, 0.16f);
        pathBuilder2.lineTo(19.0f, 16.17f);
        pathBuilder2.verticalLineTo(6.0f);
        pathBuilder2.horizontalLineTo(8.83f);
        pathBuilder2.lineTo(6.83f, 4.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.78f, 22.61f);
        pathBuilder2.lineTo(17.17f, 20.0f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder2.verticalLineTo(6.0f);
        pathBuilder2.curveToRelative(0.0f, -0.05f, 0.02f, -0.1f, 0.02f, -0.15f);
        pathBuilder2.lineTo(1.39f, 4.22f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineTo(18.0f, 18.0f);
        pathBuilder2.lineToRelative(1.82f, 1.82f);
        pathBuilder2.lineToRelative(1.37f, 1.37f);
        pathBuilder2.lineTo(19.78f, 22.61f);
        pathBuilder2.close();
        pathBuilder2.moveTo(7.5f, 13.5f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineTo(13.0f);
        pathBuilder2.horizontalLineToRelative(0.67f);
        pathBuilder2.lineToRelative(-2.5f, -2.5f);
        pathBuilder2.horizontalLineTo(7.5f);
        pathBuilder2.verticalLineTo(13.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.17f, 18.0f);
        pathBuilder2.lineTo(11.0f, 13.83f);
        pathBuilder2.verticalLineTo(14.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder2.horizontalLineTo(7.0f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder2.verticalLineToRelative(-4.0f);
        pathBuilder2.curveToRelative(0.0f, -0.32f, 0.16f, -0.59f, 0.4f, -0.78f);
        pathBuilder2.lineTo(5.0f, 7.83f);
        pathBuilder2.verticalLineTo(18.0f);
        pathBuilder2.horizontalLineTo(15.17f);
        pathBuilder2.close();
        pathBuilder2.moveTo(18.0f, 14.0f);
        pathBuilder2.verticalLineToRelative(-1.0f);
        pathBuilder2.horizontalLineToRelative(-1.5f);
        pathBuilder2.verticalLineToRelative(0.5f);
        pathBuilder2.horizontalLineToRelative(-0.17f);
        pathBuilder2.lineToRelative(1.28f, 1.28f);
        pathBuilder2.curveTo(17.84f, 14.59f, 18.0f, 14.32f, 18.0f, 14.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.5f, 11.67f);
        pathBuilder2.verticalLineTo(10.5f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineTo(11.0f);
        pathBuilder2.horizontalLineTo(18.0f);
        pathBuilder2.verticalLineToRelative(-1.0f);
        pathBuilder2.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder2.horizontalLineToRelative(-3.0f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder2.verticalLineToRelative(0.17f);
        pathBuilder2.lineTo(14.5f, 11.67f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _closedCaptionDisabled = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
