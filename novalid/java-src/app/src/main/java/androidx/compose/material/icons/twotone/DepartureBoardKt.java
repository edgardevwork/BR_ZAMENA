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

/* compiled from: DepartureBoard.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_departureBoard", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DepartureBoard", "Landroidx/compose/material/icons/Icons$TwoTone;", "getDepartureBoard", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDepartureBoard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepartureBoard.kt\nandroidx/compose/material/icons/twotone/DepartureBoardKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,138:1\n212#2,12:139\n233#2,18:152\n253#2:189\n233#2,18:190\n253#2:227\n233#2,18:228\n253#2:265\n233#2,18:266\n253#2:303\n174#3:151\n705#4,2:170\n717#4,2:172\n719#4,11:178\n705#4,2:208\n717#4,2:210\n719#4,11:216\n705#4,2:246\n717#4,2:248\n719#4,11:254\n705#4,2:284\n717#4,2:286\n719#4,11:292\n72#5,4:174\n72#5,4:212\n72#5,4:250\n72#5,4:288\n*S KotlinDebug\n*F\n+ 1 DepartureBoard.kt\nandroidx/compose/material/icons/twotone/DepartureBoardKt\n*L\n29#1:139,12\n30#1:152,18\n30#1:189\n61#1:190,18\n61#1:227\n67#1:228,18\n67#1:265\n73#1:266,18\n73#1:303\n29#1:151\n30#1:170,2\n30#1:172,2\n30#1:178,11\n61#1:208,2\n61#1:210,2\n61#1:216,11\n67#1:246,2\n67#1:248,2\n67#1:254,11\n73#1:284,2\n73#1:286,2\n73#1:292,11\n30#1:174,4\n61#1:212,4\n67#1:250,4\n73#1:288,4\n*E\n"})
/* loaded from: classes2.dex */
public final class DepartureBoardKt {

    @Nullable
    private static ImageVector _departureBoard;

    @NotNull
    public static final ImageVector getDepartureBoard(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _departureBoard;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.DepartureBoard", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.29f, 6.0f);
        pathBuilder.lineTo(9.0f, 6.0f);
        pathBuilder.curveToRelative(-3.69f, 0.0f, -5.11f, 0.46f, -5.66f, 0.99f);
        pathBuilder.horizontalLineToRelative(5.74f);
        pathBuilder.curveToRelative(0.05f, -0.33f, 0.12f, -0.67f, 0.21f, -0.99f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 14.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.0f, 0.37f, 0.21f, 0.62f, 0.34f, 0.73f);
        pathBuilder.lineToRelative(0.29f, 0.27f);
        pathBuilder.horizontalLineToRelative(10.74f);
        pathBuilder.lineToRelative(0.29f, -0.27f);
        pathBuilder.curveToRelative(0.13f, -0.11f, 0.34f, -0.36f, 0.34f, -0.73f);
        pathBuilder.verticalLineToRelative(-3.08f);
        pathBuilder.curveToRelative(-0.94f, -0.13f, -1.81f, -0.45f, -2.59f, -0.92f);
        pathBuilder.lineTo(3.0f, 14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.5f, 18.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(4.67f, 15.0f, 5.5f, 15.0f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(6.33f, 18.0f, 5.5f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 16.5f);
        pathBuilder.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(5.5f, 16.5f);
        pathBuilder2.moveToRelative(-1.5f, 0.0f);
        pathBuilder2.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        pathBuilder2.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(12.5f, 16.5f);
        pathBuilder3.moveToRelative(-1.5f, 0.0f);
        pathBuilder3.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        pathBuilder3.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(16.0f, 1.0f);
        pathBuilder4.curveToRelative(-2.39f, 0.0f, -4.49f, 1.2f, -5.75f, 3.02f);
        pathBuilder4.curveTo(9.84f, 4.01f, 9.43f, 4.0f, 9.0f, 4.0f);
        pathBuilder4.curveToRelative(-4.42f, 0.0f, -8.0f, 0.5f, -8.0f, 4.0f);
        pathBuilder4.verticalLineToRelative(10.0f);
        pathBuilder4.curveToRelative(0.0f, 0.88f, 0.39f, 1.67f, 1.0f, 2.22f);
        pathBuilder4.lineTo(2.0f, 22.0f);
        pathBuilder4.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder4.horizontalLineToRelative(1.0f);
        pathBuilder4.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder4.verticalLineToRelative(-1.0f);
        pathBuilder4.horizontalLineToRelative(8.0f);
        pathBuilder4.verticalLineToRelative(1.0f);
        pathBuilder4.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder4.horizontalLineToRelative(1.0f);
        pathBuilder4.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder4.verticalLineToRelative(-1.78f);
        pathBuilder4.curveToRelative(0.61f, -0.55f, 1.0f, -1.34f, 1.0f, -2.22f);
        pathBuilder4.verticalLineToRelative(-3.08f);
        pathBuilder4.curveToRelative(3.39f, -0.49f, 6.0f, -3.39f, 6.0f, -6.92f);
        pathBuilder4.curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(9.0f, 6.0f);
        pathBuilder4.horizontalLineToRelative(0.29f);
        pathBuilder4.curveToRelative(-0.09f, 0.32f, -0.16f, 0.66f, -0.21f, 0.99f);
        pathBuilder4.lineTo(3.34f, 6.99f);
        pathBuilder4.curveTo(3.89f, 6.46f, 5.31f, 6.0f, 9.0f, 6.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(3.0f, 8.99f);
        pathBuilder4.horizontalLineToRelative(6.08f);
        pathBuilder4.curveToRelative(0.16f, 1.11f, 0.57f, 2.13f, 1.18f, 3.01f);
        pathBuilder4.lineTo(3.0f, 12.0f);
        pathBuilder4.lineTo(3.0f, 8.99f);
        pathBuilder4.close();
        pathBuilder4.moveTo(15.0f, 18.0f);
        pathBuilder4.curveToRelative(0.0f, 0.37f, -0.21f, 0.62f, -0.34f, 0.73f);
        pathBuilder4.lineToRelative(-0.29f, 0.27f);
        pathBuilder4.lineTo(3.63f, 19.0f);
        pathBuilder4.lineToRelative(-0.29f, -0.27f);
        pathBuilder4.curveTo(3.21f, 18.62f, 3.0f, 18.37f, 3.0f, 18.0f);
        pathBuilder4.verticalLineToRelative(-4.0f);
        pathBuilder4.horizontalLineToRelative(9.41f);
        pathBuilder4.curveToRelative(0.78f, 0.47f, 1.65f, 0.79f, 2.59f, 0.92f);
        pathBuilder4.lineTo(15.0f, 18.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(16.0f, 13.0f);
        pathBuilder4.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        pathBuilder4.reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f);
        pathBuilder4.reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder4.reflectiveCurveToRelative(-2.24f, 5.0f, -5.0f, 5.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(16.5f, 4.0f);
        pathBuilder4.lineTo(15.0f, 4.0f);
        pathBuilder4.verticalLineToRelative(5.0f);
        pathBuilder4.lineToRelative(3.62f, 2.16f);
        pathBuilder4.lineToRelative(0.75f, -1.23f);
        pathBuilder4.lineToRelative(-2.87f, -1.68f);
        pathBuilder4.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _departureBoard = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
