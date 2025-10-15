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

/* compiled from: AirlineSeatFlatAngled.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_airlineSeatFlatAngled", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AirlineSeatFlatAngled", "Landroidx/compose/material/icons/Icons$TwoTone;", "getAirlineSeatFlatAngled", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAirlineSeatFlatAngled.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AirlineSeatFlatAngled.kt\nandroidx/compose/material/icons/twotone/AirlineSeatFlatAngledKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,109:1\n212#2,12:110\n233#2,18:123\n253#2:160\n233#2,18:161\n253#2:198\n174#3:122\n705#4,2:141\n717#4,2:143\n719#4,11:149\n705#4,2:179\n717#4,2:181\n719#4,11:187\n72#5,4:145\n72#5,4:183\n*S KotlinDebug\n*F\n+ 1 AirlineSeatFlatAngled.kt\nandroidx/compose/material/icons/twotone/AirlineSeatFlatAngledKt\n*L\n29#1:110,12\n30#1:123,18\n30#1:160\n54#1:161,18\n54#1:198\n29#1:122\n30#1:141,2\n30#1:143,2\n30#1:149,11\n54#1:179,2\n54#1:181,2\n54#1:187,11\n30#1:145,4\n54#1:183,4\n*E\n"})
/* loaded from: classes3.dex */
public final class AirlineSeatFlatAngledKt {

    @Nullable
    private static ImageVector _airlineSeatFlatAngled;

    @NotNull
    public static final ImageVector getAirlineSeatFlatAngled(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _airlineSeatFlatAngled;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AirlineSeatFlatAngled", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.0f, 16.64f);
        pathBuilder.lineToRelative(-4.0f, -1.45f);
        pathBuilder.lineTo(10.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 8.5f);
        pathBuilder.curveToRelative(0.15f, 0.0f, 0.3f, -0.03f, 0.44f, -0.1f);
        pathBuilder.curveToRelative(0.49f, -0.24f, 0.7f, -0.84f, 0.46f, -1.34f);
        pathBuilder.curveToRelative(-0.19f, -0.41f, -0.59f, -0.56f, -0.9f, -0.56f);
        pathBuilder.curveToRelative(-0.15f, 0.0f, -0.3f, 0.03f, -0.44f, 0.1f);
        pathBuilder.curveToRelative(-0.32f, 0.16f, -0.45f, 0.42f, -0.5f, 0.56f);
        pathBuilder.curveToRelative(-0.05f, 0.15f, -0.12f, 0.44f, 0.04f, 0.77f);
        pathBuilder.curveToRelative(0.2f, 0.42f, 0.59f, 0.57f, 0.9f, 0.57f);
        pathBuilder.close();
        pathBuilder.moveTo(19.16f, 11.02f);
        pathBuilder.lineToRelative(-6.69f, -2.41f);
        pathBuilder.lineToRelative(-0.7f, 1.91f);
        pathBuilder.lineToRelative(8.59f, 3.11f);
        pathBuilder.lineToRelative(0.01f, -0.02f);
        pathBuilder.curveToRelative(0.19f, -0.51f, 0.17f, -1.05f, -0.06f, -1.53f);
        pathBuilder.curveToRelative(-0.23f, -0.5f, -0.63f, -0.87f, -1.15f, -1.06f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(1.5f, 12.14f);
        pathBuilder2.lineTo(8.0f, 14.48f);
        pathBuilder2.lineTo(8.0f, 19.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.verticalLineToRelative(-1.63f);
        pathBuilder2.lineTo(20.52f, 19.0f);
        pathBuilder2.lineToRelative(0.69f, -1.89f);
        pathBuilder2.lineToRelative(-19.02f, -6.86f);
        pathBuilder2.lineToRelative(-0.69f, 1.89f);
        pathBuilder2.close();
        pathBuilder2.moveTo(10.0f, 15.19f);
        pathBuilder2.lineToRelative(4.0f, 1.44f);
        pathBuilder2.lineTo(14.0f, 17.0f);
        pathBuilder2.horizontalLineToRelative(-4.0f);
        pathBuilder2.verticalLineToRelative(-1.81f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.84f, 9.14f);
        pathBuilder2.lineToRelative(-8.56f, -3.09f);
        pathBuilder2.lineToRelative(-2.08f, 5.66f);
        pathBuilder2.lineToRelative(12.36f, 4.47f);
        pathBuilder2.lineToRelative(0.69f, -1.89f);
        pathBuilder2.curveToRelative(0.77f, -2.09f, -0.31f, -4.39f, -2.41f, -5.15f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.37f, 13.6f);
        pathBuilder2.lineToRelative(-0.01f, 0.02f);
        pathBuilder2.lineToRelative(-8.59f, -3.11f);
        pathBuilder2.lineToRelative(0.7f, -1.91f);
        pathBuilder2.lineToRelative(6.69f, 2.41f);
        pathBuilder2.curveToRelative(0.52f, 0.19f, 0.93f, 0.56f, 1.15f, 1.05f);
        pathBuilder2.curveToRelative(0.23f, 0.49f, 0.25f, 1.04f, 0.06f, 1.54f);
        pathBuilder2.close();
        pathBuilder2.moveTo(6.0f, 10.5f);
        pathBuilder2.curveToRelative(0.44f, 0.0f, 0.88f, -0.1f, 1.3f, -0.3f);
        pathBuilder2.curveToRelative(1.49f, -0.72f, 2.12f, -2.51f, 1.41f, -4.0f);
        pathBuilder2.curveTo(8.19f, 5.13f, 7.12f, 4.5f, 6.0f, 4.5f);
        pathBuilder2.curveToRelative(-0.44f, 0.0f, -0.88f, 0.1f, -1.3f, 0.3f);
        pathBuilder2.curveToRelative(-1.49f, 0.71f, -2.12f, 2.5f, -1.4f, 4.0f);
        pathBuilder2.curveToRelative(0.51f, 1.07f, 1.58f, 1.7f, 2.7f, 1.7f);
        pathBuilder2.close();
        pathBuilder2.moveTo(5.06f, 7.16f);
        pathBuilder2.curveToRelative(0.05f, -0.14f, 0.18f, -0.4f, 0.51f, -0.56f);
        pathBuilder2.curveToRelative(0.14f, -0.06f, 0.28f, -0.1f, 0.43f, -0.1f);
        pathBuilder2.curveToRelative(0.31f, 0.0f, 0.7f, 0.15f, 0.9f, 0.56f);
        pathBuilder2.curveToRelative(0.24f, 0.5f, 0.02f, 1.1f, -0.47f, 1.34f);
        pathBuilder2.curveToRelative(-0.14f, 0.06f, -0.28f, 0.1f, -0.43f, 0.1f);
        pathBuilder2.curveToRelative(-0.3f, 0.0f, -0.7f, -0.15f, -0.89f, -0.56f);
        pathBuilder2.curveToRelative(-0.17f, -0.34f, -0.1f, -0.63f, -0.05f, -0.78f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airlineSeatFlatAngled = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
