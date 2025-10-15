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

/* compiled from: HeatPump.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_heatPump", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HeatPump", "Landroidx/compose/material/icons/Icons$TwoTone;", "getHeatPump", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHeatPump.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeatPump.kt\nandroidx/compose/material/icons/twotone/HeatPumpKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,121:1\n212#2,12:122\n233#2,18:135\n253#2:172\n233#2,18:173\n253#2:210\n233#2,18:211\n253#2:248\n174#3:134\n705#4,2:153\n717#4,2:155\n719#4,11:161\n705#4,2:191\n717#4,2:193\n719#4,11:199\n705#4,2:229\n717#4,2:231\n719#4,11:237\n72#5,4:157\n72#5,4:195\n72#5,4:233\n*S KotlinDebug\n*F\n+ 1 HeatPump.kt\nandroidx/compose/material/icons/twotone/HeatPumpKt\n*L\n29#1:122,12\n30#1:135,18\n30#1:172\n44#1:173,18\n44#1:210\n62#1:211,18\n62#1:248\n29#1:134\n30#1:153,2\n30#1:155,2\n30#1:161,11\n44#1:191,2\n44#1:193,2\n44#1:199,11\n62#1:229,2\n62#1:231,2\n62#1:237,11\n30#1:157,4\n44#1:195,4\n62#1:233,4\n*E\n"})
/* loaded from: classes3.dex */
public final class HeatPumpKt {

    @Nullable
    private static ImageVector _heatPump;

    @NotNull
    public static final ImageVector getHeatPump(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _heatPump;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.HeatPump", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 6.0f);
        pathBuilder.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(-2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilder.reflectiveCurveTo(8.69f, 6.0f, 12.0f, 6.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(19.0f, 3.0f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilder2.verticalLineToRelative(14.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(14.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.verticalLineTo(5.0f);
        pathBuilder2.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 19.0f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.verticalLineTo(5.0f);
        pathBuilder2.horizontalLineToRelative(14.0f);
        pathBuilder2.verticalLineTo(19.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(12.0f, 18.0f);
        pathBuilder3.curveToRelative(3.31f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f);
        pathBuilder3.reflectiveCurveToRelative(-2.69f, -6.0f, -6.0f, -6.0f);
        pathBuilder3.reflectiveCurveToRelative(-6.0f, 2.69f, -6.0f, 6.0f);
        pathBuilder3.reflectiveCurveTo(8.69f, 18.0f, 12.0f, 18.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(11.25f, 15.92f);
        pathBuilder3.curveToRelative(-0.55f, -0.1f, -1.05f, -0.32f, -1.5f, -0.62f);
        pathBuilder3.lineToRelative(1.5f, -1.5f);
        pathBuilder3.verticalLineTo(15.92f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.75f, 15.92f);
        pathBuilder3.verticalLineToRelative(-2.11f);
        pathBuilder3.lineToRelative(1.5f, 1.5f);
        pathBuilder3.curveTo(13.8f, 15.61f, 13.3f, 15.82f, 12.75f, 15.92f);
        pathBuilder3.close();
        pathBuilder3.moveTo(15.31f, 14.25f);
        pathBuilder3.lineToRelative(-1.5f, -1.5f);
        pathBuilder3.horizontalLineToRelative(2.11f);
        pathBuilder3.curveTo(15.82f, 13.3f, 15.61f, 13.8f, 15.31f, 14.25f);
        pathBuilder3.close();
        pathBuilder3.moveTo(15.92f, 11.25f);
        pathBuilder3.horizontalLineToRelative(-2.11f);
        pathBuilder3.lineToRelative(1.5f, -1.5f);
        pathBuilder3.curveTo(15.61f, 10.2f, 15.82f, 10.7f, 15.92f, 11.25f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.75f, 8.08f);
        pathBuilder3.curveToRelative(0.55f, 0.1f, 1.05f, 0.32f, 1.5f, 0.62f);
        pathBuilder3.lineToRelative(-1.5f, 1.5f);
        pathBuilder3.verticalLineTo(8.08f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.0f, 11.0f);
        pathBuilder3.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder3.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder3.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder3.curveTo(11.0f, 11.45f, 11.45f, 11.0f, 12.0f, 11.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(11.25f, 8.08f);
        pathBuilder3.verticalLineToRelative(2.11f);
        pathBuilder3.lineToRelative(-1.5f, -1.5f);
        pathBuilder3.curveTo(10.2f, 8.39f, 10.7f, 8.18f, 11.25f, 8.08f);
        pathBuilder3.close();
        pathBuilder3.moveTo(8.69f, 9.75f);
        pathBuilder3.lineToRelative(1.5f, 1.5f);
        pathBuilder3.horizontalLineTo(8.08f);
        pathBuilder3.curveTo(8.18f, 10.7f, 8.39f, 10.2f, 8.69f, 9.75f);
        pathBuilder3.close();
        pathBuilder3.moveTo(10.19f, 12.75f);
        pathBuilder3.lineToRelative(-1.5f, 1.5f);
        pathBuilder3.curveToRelative(-0.3f, -0.44f, -0.51f, -0.95f, -0.62f, -1.5f);
        pathBuilder3.horizontalLineTo(10.19f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _heatPump = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
