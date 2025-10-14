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

/* compiled from: ElectricBike.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_electricBike", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ElectricBike", "Landroidx/compose/material/icons/Icons$Rounded;", "getElectricBike", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nElectricBike.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElectricBike.kt\nandroidx/compose/material/icons/rounded/ElectricBikeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,102:1\n212#2,12:103\n233#2,18:116\n253#2:153\n233#2,18:154\n253#2:191\n174#3:115\n705#4,2:134\n717#4,2:136\n719#4,11:142\n705#4,2:172\n717#4,2:174\n719#4,11:180\n72#5,4:138\n72#5,4:176\n*S KotlinDebug\n*F\n+ 1 ElectricBike.kt\nandroidx/compose/material/icons/rounded/ElectricBikeKt\n*L\n29#1:103,12\n30#1:116,18\n30#1:153\n88#1:154,18\n88#1:191\n29#1:115\n30#1:134,2\n30#1:136,2\n30#1:142,11\n88#1:172,2\n88#1:174,2\n88#1:180,11\n30#1:138,4\n88#1:176,4\n*E\n"})
/* loaded from: classes3.dex */
public final class ElectricBikeKt {

    @Nullable
    private static ImageVector _electricBike;

    @NotNull
    public static final ImageVector getElectricBike(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _electricBike;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ElectricBike", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(-0.82f);
        pathBuilder.lineToRelative(-1.7f, -4.68f);
        pathBuilder.curveTo(16.19f, 1.53f, 15.44f, 1.0f, 14.6f, 1.0f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(1.6f);
        pathBuilder.lineToRelative(1.46f, 4.0f);
        pathBuilder.horizontalLineToRelative(-4.81f);
        pathBuilder.lineToRelative(-0.36f, -1.0f);
        pathBuilder.horizontalLineToRelative(0.09f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.curveTo(7.45f, 4.0f, 7.0f, 4.45f, 7.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(0.75f);
        pathBuilder.lineToRelative(1.82f, 5.0f);
        pathBuilder.horizontalLineTo(9.9f);
        pathBuilder.curveTo(9.46f, 8.77f, 7.59f, 7.12f, 5.25f, 7.01f);
        pathBuilder.curveTo(2.45f, 6.87f, 0.0f, 9.2f, 0.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 2.8f, 2.2f, 5.0f, 5.0f, 5.0f);
        pathBuilder.curveToRelative(2.46f, 0.0f, 4.45f, -1.69f, 4.9f, -4.0f);
        pathBuilder.horizontalLineToRelative(4.2f);
        pathBuilder.curveToRelative(0.44f, 2.23f, 2.31f, 3.88f, 4.65f, 3.99f);
        pathBuilder.curveToRelative(2.8f, 0.13f, 5.25f, -2.19f, 5.25f, -5.0f);
        pathBuilder.curveTo(24.0f, 9.2f, 21.8f, 7.0f, 19.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(1.82f);
        pathBuilder.curveToRelative(-0.42f, 1.23f, -1.6f, 2.08f, -3.02f, 1.99f);
        pathBuilder.curveTo(3.31f, 14.9f, 2.07f, 13.64f, 2.0f, 12.14f);
        pathBuilder.curveTo(1.93f, 10.39f, 3.27f, 9.0f, 5.0f, 9.0f);
        pathBuilder.curveToRelative(1.33f, 0.0f, 2.42f, 0.83f, 2.82f, 2.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.curveTo(5.0f, 12.55f, 5.45f, 13.0f, 6.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.1f, 11.0f);
        pathBuilder.horizontalLineToRelative(-1.4f);
        pathBuilder.lineToRelative(-0.73f, -2.0f);
        pathBuilder.horizontalLineTo(15.0f);
        pathBuilder.curveTo(14.56f, 9.58f, 14.24f, 10.25f, 14.1f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.88f, 15.0f);
        pathBuilder.curveToRelative(-1.54f, -0.06f, -2.84f, -1.37f, -2.88f, -2.92f);
        pathBuilder.curveToRelative(-0.02f, -0.96f, 0.39f, -1.8f, 1.05f, -2.36f);
        pathBuilder.lineToRelative(0.62f, 1.7f);
        pathBuilder.curveToRelative(0.19f, 0.52f, 0.76f, 0.79f, 1.28f, 0.6f);
        pathBuilder.curveToRelative(0.52f, -0.19f, 0.79f, -0.76f, 0.6f, -1.28f);
        pathBuilder.lineToRelative(-0.63f, -1.73f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.01f, -0.01f);
        pathBuilder.curveTo(20.64f, 8.96f, 22.0f, 10.29f, 22.0f, 12.0f);
        pathBuilder.curveTo(22.0f, 13.72f, 20.62f, 15.06f, 18.88f, 15.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(11.0f, 20.0f);
        pathBuilder2.lineToRelative(-4.0f, 0.0f);
        pathBuilder2.lineToRelative(6.0f, 3.0f);
        pathBuilder2.lineToRelative(0.0f, -2.0f);
        pathBuilder2.lineToRelative(4.0f, 0.0f);
        pathBuilder2.lineToRelative(-6.0f, -3.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _electricBike = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
