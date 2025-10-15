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

/* compiled from: WbAuto.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_wbAuto", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WbAuto", "Landroidx/compose/material/icons/Icons$TwoTone;", "getWbAuto", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nWbAuto.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WbAuto.kt\nandroidx/compose/material/icons/twotone/WbAutoKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,105:1\n212#2,12:106\n233#2,18:119\n253#2:156\n233#2,18:157\n253#2:194\n174#3:118\n705#4,2:137\n717#4,2:139\n719#4,11:145\n705#4,2:175\n717#4,2:177\n719#4,11:183\n72#5,4:141\n72#5,4:179\n*S KotlinDebug\n*F\n+ 1 WbAuto.kt\nandroidx/compose/material/icons/twotone/WbAutoKt\n*L\n29#1:106,12\n30#1:119,18\n30#1:156\n54#1:157,18\n54#1:194\n29#1:118\n30#1:137,2\n30#1:139,2\n30#1:145,11\n54#1:175,2\n54#1:177,2\n54#1:183,11\n30#1:141,4\n54#1:179,4\n*E\n"})
/* loaded from: classes3.dex */
public final class WbAutoKt {

    @Nullable
    private static ImageVector _wbAuto;

    @NotNull
    public static final ImageVector getWbAuto(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _wbAuto;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.WbAuto", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.0f, 6.0f);
        pathBuilder.curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilder.curveToRelative(2.35f, 0.0f, 4.38f, -1.36f, 5.36f, -3.32f);
        pathBuilder.lineToRelative(0.01f, -0.01f);
        pathBuilder.curveToRelative(0.4f, -0.81f, 0.63f, -1.71f, 0.63f, -2.67f);
        pathBuilder.curveToRelative(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.3f, 16.0f);
        pathBuilder.lineToRelative(-0.7f, -2.0f);
        pathBuilder.lineTo(6.4f, 14.0f);
        pathBuilder.lineToRelative(-0.7f, 2.0f);
        pathBuilder.lineTo(3.8f, 16.0f);
        pathBuilder.lineTo(7.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineToRelative(3.2f, 9.0f);
        pathBuilder.horizontalLineToRelative(-1.9f);
        pathBuilder.close();
        pathBuilder.moveTo(6.85f, 12.65f);
        pathBuilder.horizontalLineToRelative(2.3f);
        pathBuilder.lineTo(8.0f, 9.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(7.0f, 7.0f);
        pathBuilder2.lineToRelative(-3.2f, 9.0f);
        pathBuilder2.horizontalLineToRelative(1.9f);
        pathBuilder2.lineToRelative(0.7f, -2.0f);
        pathBuilder2.horizontalLineToRelative(3.2f);
        pathBuilder2.lineToRelative(0.7f, 2.0f);
        pathBuilder2.horizontalLineToRelative(1.9f);
        pathBuilder2.lineTo(9.0f, 7.0f);
        pathBuilder2.lineTo(7.0f, 7.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(6.85f, 12.65f);
        pathBuilder2.lineTo(8.0f, 9.0f);
        pathBuilder2.lineToRelative(1.15f, 3.65f);
        pathBuilder2.horizontalLineToRelative(-2.3f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.8f, 13.29f);
        pathBuilder2.lineTo(19.3f, 7.0f);
        pathBuilder2.horizontalLineToRelative(-1.6f);
        pathBuilder2.lineToRelative(-1.49f, 6.29f);
        pathBuilder2.lineTo(15.0f, 7.0f);
        pathBuilder2.horizontalLineToRelative(-0.76f);
        pathBuilder2.lineToRelative(-0.01f, 0.01f);
        pathBuilder2.curveTo(12.76f, 5.18f, 10.53f, 4.0f, 8.0f, 4.0f);
        pathBuilder2.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        pathBuilder2.reflectiveCurveToRelative(3.58f, 8.0f, 8.0f, 8.0f);
        pathBuilder2.curveToRelative(2.96f, 0.0f, 5.55f, -1.61f, 6.93f, -4.0f);
        pathBuilder2.curveToRelative(0.03f, -0.06f, 0.05f, -0.12f, 0.08f, -0.18f);
        pathBuilder2.curveToRelative(0.05f, -0.08f, 0.09f, -0.17f, 0.14f, -0.25f);
        pathBuilder2.lineToRelative(0.1f, 0.43f);
        pathBuilder2.lineTo(17.0f, 16.0f);
        pathBuilder2.lineToRelative(1.5f, -6.1f);
        pathBuilder2.lineTo(20.0f, 16.0f);
        pathBuilder2.horizontalLineToRelative(1.75f);
        pathBuilder2.lineToRelative(2.05f, -9.0f);
        pathBuilder2.lineTo(22.0f, 7.0f);
        pathBuilder2.lineToRelative(-1.2f, 6.29f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.37f, 14.67f);
        pathBuilder2.curveTo(12.38f, 16.64f, 10.35f, 18.0f, 8.0f, 18.0f);
        pathBuilder2.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilder2.reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilder2.reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f);
        pathBuilder2.curveToRelative(0.0f, 0.96f, -0.23f, 1.86f, -0.63f, 2.67f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wbAuto = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
