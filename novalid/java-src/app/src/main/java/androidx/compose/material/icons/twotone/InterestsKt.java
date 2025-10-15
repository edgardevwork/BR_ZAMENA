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

/* compiled from: Interests.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_interests", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Interests", "Landroidx/compose/material/icons/Icons$TwoTone;", "getInterests", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nInterests.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Interests.kt\nandroidx/compose/material/icons/twotone/InterestsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,118:1\n212#2,12:119\n233#2,18:132\n253#2:169\n233#2,18:170\n253#2:207\n174#3:131\n705#4,2:150\n717#4,2:152\n719#4,11:158\n705#4,2:188\n717#4,2:190\n719#4,11:196\n72#5,4:154\n72#5,4:192\n*S KotlinDebug\n*F\n+ 1 Interests.kt\nandroidx/compose/material/icons/twotone/InterestsKt\n*L\n29#1:119,12\n30#1:132,18\n30#1:169\n59#1:170,18\n59#1:207\n29#1:131\n30#1:150,2\n30#1:152,2\n30#1:158,11\n59#1:188,2\n59#1:190,2\n59#1:196,11\n30#1:154,4\n59#1:192,4\n*E\n"})
/* loaded from: classes.dex */
public final class InterestsKt {

    @Nullable
    private static ImageVector _interests;

    @NotNull
    public static final ImageVector getInterests(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _interests;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Interests", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.02f, 19.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(8.12f, 19.0f, 7.02f, 19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 6.12f);
        pathBuilder.lineTo(8.6f, 9.0f);
        pathBuilder.horizontalLineTo(5.4f);
        pathBuilder.lineTo(7.0f, 6.12f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 8.35f);
        pathBuilder.curveToRelative(-1.45f, -1.22f, -3.0f, -2.4f, -3.0f, -3.1f);
        pathBuilder.curveToRelative(0.0f, -0.43f, 0.35f, -0.75f, 0.75f, -0.75f);
        pathBuilder.curveToRelative(0.31f, 0.0f, 0.52f, 0.17f, 0.73f, 0.37f);
        pathBuilder.lineTo(17.0f, 6.3f);
        pathBuilder.lineToRelative(1.52f, -1.43f);
        pathBuilder.curveToRelative(0.21f, -0.2f, 0.42f, -0.37f, 0.73f, -0.37f);
        pathBuilder.curveToRelative(0.4f, 0.0f, 0.75f, 0.32f, 0.75f, 0.75f);
        pathBuilder.curveTo(20.0f, 5.95f, 18.45f, 7.13f, 17.0f, 8.35f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(7.02f, 13.0f);
        pathBuilder2.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilder2.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder2.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder2.reflectiveCurveTo(9.23f, 13.0f, 7.02f, 13.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(7.02f, 19.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder2.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder2.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder2.reflectiveCurveTo(8.12f, 19.0f, 7.02f, 19.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.0f, 13.0f);
        pathBuilder2.verticalLineToRelative(8.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.verticalLineToRelative(-8.0f);
        pathBuilder2.horizontalLineTo(13.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 19.0f);
        pathBuilder2.horizontalLineToRelative(-4.0f);
        pathBuilder2.verticalLineToRelative(-4.0f);
        pathBuilder2.horizontalLineToRelative(4.0f);
        pathBuilder2.verticalLineTo(19.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(7.0f, 2.0f);
        pathBuilder2.lineToRelative(-5.0f, 9.0f);
        pathBuilder2.horizontalLineToRelative(10.0f);
        pathBuilder2.lineTo(7.0f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(7.0f, 6.12f);
        pathBuilder2.lineTo(8.6f, 9.0f);
        pathBuilder2.horizontalLineTo(5.4f);
        pathBuilder2.lineTo(7.0f, 6.12f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.25f, 2.5f);
        pathBuilder2.curveToRelative(-1.06f, 0.0f, -1.81f, 0.56f, -2.25f, 1.17f);
        pathBuilder2.curveToRelative(-0.44f, -0.61f, -1.19f, -1.17f, -2.25f, -1.17f);
        pathBuilder2.curveTo(13.19f, 2.5f, 12.0f, 3.78f, 12.0f, 5.25f);
        pathBuilder2.curveToRelative(0.0f, 2.0f, 2.42f, 3.42f, 5.0f, 5.75f);
        pathBuilder2.curveToRelative(2.58f, -2.33f, 5.0f, -3.75f, 5.0f, -5.75f);
        pathBuilder2.curveTo(22.0f, 3.78f, 20.81f, 2.5f, 19.25f, 2.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.0f, 8.35f);
        pathBuilder2.curveToRelative(-1.45f, -1.22f, -3.0f, -2.4f, -3.0f, -3.1f);
        pathBuilder2.curveToRelative(0.0f, -0.43f, 0.35f, -0.75f, 0.75f, -0.75f);
        pathBuilder2.curveToRelative(0.31f, 0.0f, 0.52f, 0.17f, 0.73f, 0.37f);
        pathBuilder2.lineTo(17.0f, 6.3f);
        pathBuilder2.lineToRelative(1.52f, -1.43f);
        pathBuilder2.curveToRelative(0.21f, -0.2f, 0.42f, -0.37f, 0.73f, -0.37f);
        pathBuilder2.curveToRelative(0.4f, 0.0f, 0.75f, 0.32f, 0.75f, 0.75f);
        pathBuilder2.curveTo(20.0f, 5.95f, 18.45f, 7.13f, 17.0f, 8.35f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _interests = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
