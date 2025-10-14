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

/* compiled from: Hub.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_hub", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Hub", "Landroidx/compose/material/icons/Icons$TwoTone;", "getHub", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHub.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Hub.kt\nandroidx/compose/material/icons/twotone/HubKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,152:1\n212#2,12:153\n233#2,18:166\n253#2:203\n233#2,18:204\n253#2:241\n174#3:165\n705#4,2:184\n717#4,2:186\n719#4,11:192\n705#4,2:222\n717#4,2:224\n719#4,11:230\n72#5,4:188\n72#5,4:226\n*S KotlinDebug\n*F\n+ 1 Hub.kt\nandroidx/compose/material/icons/twotone/HubKt\n*L\n29#1:153,12\n30#1:166,18\n30#1:203\n68#1:204,18\n68#1:241\n29#1:165\n30#1:184,2\n30#1:186,2\n30#1:192,11\n68#1:222,2\n68#1:224,2\n68#1:230,11\n30#1:188,4\n68#1:226,4\n*E\n"})
/* loaded from: classes.dex */
public final class HubKt {

    @Nullable
    private static ImageVector _hub;

    @NotNull
    public static final ImageVector getHub(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _hub;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Hub", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 10.5f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.curveTo(4.0f, 10.05f, 3.55f, 10.5f, 3.0f, 10.5f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 21.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.curveTo(7.0f, 20.55f, 6.55f, 21.0f, 6.0f, 21.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(11.0f, 3.55f, 11.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 15.0f);
        pathBuilder.curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        pathBuilder.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        pathBuilder.reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilder.curveTo(14.5f, 13.88f, 13.38f, 15.0f, 12.0f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 19.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.curveTo(17.0f, 19.45f, 17.45f, 19.0f, 18.0f, 19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 10.5f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.curveTo(22.0f, 10.05f, 21.55f, 10.5f, 21.0f, 10.5f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(21.0f, 6.5f);
        pathBuilder2.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilder2.curveToRelative(0.0f, 0.07f, 0.0f, 0.14f, 0.01f, 0.21f);
        pathBuilder2.lineToRelative(-2.03f, 0.68f);
        pathBuilder2.curveToRelative(-0.64f, -1.21f, -1.82f, -2.09f, -3.22f, -2.32f);
        pathBuilder2.verticalLineTo(5.91f);
        pathBuilder2.curveTo(14.04f, 5.57f, 15.0f, 4.4f, 15.0f, 3.0f);
        pathBuilder2.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder2.reflectiveCurveTo(9.0f, 1.34f, 9.0f, 3.0f);
        pathBuilder2.curveToRelative(0.0f, 1.4f, 0.96f, 2.57f, 2.25f, 2.91f);
        pathBuilder2.verticalLineToRelative(2.16f);
        pathBuilder2.curveToRelative(-1.4f, 0.23f, -2.58f, 1.11f, -3.22f, 2.32f);
        pathBuilder2.lineTo(5.99f, 9.71f);
        pathBuilder2.curveTo(6.0f, 9.64f, 6.0f, 9.57f, 6.0f, 9.5f);
        pathBuilder2.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder2.reflectiveCurveToRelative(-3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilder2.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder2.curveToRelative(1.06f, 0.0f, 1.98f, -0.55f, 2.52f, -1.37f);
        pathBuilder2.lineToRelative(2.03f, 0.68f);
        pathBuilder2.curveToRelative(-0.2f, 1.29f, 0.17f, 2.66f, 1.09f, 3.69f);
        pathBuilder2.lineToRelative(-1.41f, 1.77f);
        pathBuilder2.curveTo(6.85f, 17.09f, 6.44f, 17.0f, 6.0f, 17.0f);
        pathBuilder2.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilder2.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder2.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder2.curveToRelative(0.0f, -0.68f, -0.22f, -1.3f, -0.6f, -1.8f);
        pathBuilder2.lineToRelative(1.41f, -1.77f);
        pathBuilder2.curveToRelative(1.36f, 0.76f, 3.02f, 0.75f, 4.37f, 0.0f);
        pathBuilder2.lineToRelative(1.41f, 1.77f);
        pathBuilder2.curveTo(15.22f, 18.7f, 15.0f, 19.32f, 15.0f, 20.0f);
        pathBuilder2.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder2.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder2.curveToRelative(-0.44f, 0.0f, -0.85f, 0.09f, -1.23f, 0.26f);
        pathBuilder2.lineToRelative(-1.41f, -1.77f);
        pathBuilder2.curveToRelative(0.93f, -1.04f, 1.29f, -2.4f, 1.09f, -3.69f);
        pathBuilder2.lineToRelative(2.03f, -0.68f);
        pathBuilder2.curveToRelative(0.53f, 0.82f, 1.46f, 1.37f, 2.52f, 1.37f);
        pathBuilder2.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder2.reflectiveCurveTo(22.66f, 6.5f, 21.0f, 6.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(3.0f, 10.5f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder2.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder2.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder2.curveTo(4.0f, 10.05f, 3.55f, 10.5f, 3.0f, 10.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(6.0f, 21.0f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder2.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder2.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder2.curveTo(7.0f, 20.55f, 6.55f, 21.0f, 6.0f, 21.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(11.0f, 3.0f);
        pathBuilder2.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder2.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder2.reflectiveCurveTo(11.0f, 3.55f, 11.0f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 15.0f);
        pathBuilder2.curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        pathBuilder2.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        pathBuilder2.reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilder2.curveTo(14.5f, 13.88f, 13.38f, 15.0f, 12.0f, 15.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(18.0f, 19.0f);
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder2.curveTo(17.0f, 19.45f, 17.45f, 19.0f, 18.0f, 19.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(21.0f, 10.5f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder2.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder2.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder2.curveTo(22.0f, 10.05f, 21.55f, 10.5f, 21.0f, 10.5f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hub = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
