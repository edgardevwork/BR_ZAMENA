package androidx.compose.material.icons.outlined;

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

/* compiled from: Landslide.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_landslide", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Landslide", "Landroidx/compose/material/icons/Icons$Outlined;", "getLandslide", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLandslide.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Landslide.kt\nandroidx/compose/material/icons/outlined/LandslideKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,103:1\n212#2,12:104\n233#2,18:117\n253#2:154\n233#2,18:155\n253#2:192\n233#2,18:193\n253#2:230\n174#3:116\n705#4,2:135\n717#4,2:137\n719#4,11:143\n705#4,2:173\n717#4,2:175\n719#4,11:181\n705#4,2:211\n717#4,2:213\n719#4,11:219\n72#5,4:139\n72#5,4:177\n72#5,4:215\n*S KotlinDebug\n*F\n+ 1 Landslide.kt\nandroidx/compose/material/icons/outlined/LandslideKt\n*L\n29#1:104,12\n30#1:117,18\n30#1:154\n62#1:155,18\n62#1:192\n80#1:193,18\n80#1:230\n29#1:116\n30#1:135,2\n30#1:137,2\n30#1:143,11\n62#1:173,2\n62#1:175,2\n62#1:181,11\n80#1:211,2\n80#1:213,2\n80#1:219,11\n30#1:139,4\n62#1:177,4\n80#1:215,4\n*E\n"})
/* loaded from: classes4.dex */
public final class LandslideKt {

    @Nullable
    private static ImageVector _landslide;

    @NotNull
    public static final ImageVector getLandslide(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _landslide;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Landslide", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 12.0f);
        pathBuilder.lineTo(8.0f, 8.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.lineToRelative(-6.0f, -8.0f);
        pathBuilder.lineTo(11.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.53f, 14.77f);
        pathBuilder.lineTo(6.0f, 16.95f);
        pathBuilder.lineToRelative(-2.0f, -0.67f);
        pathBuilder.verticalLineToRelative(-1.89f);
        pathBuilder.lineToRelative(2.0f, 0.67f);
        pathBuilder.lineToRelative(3.95f, -1.32f);
        pathBuilder.lineTo(12.53f, 14.77f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 10.0f);
        pathBuilder.lineToRelative(1.57f, 2.09f);
        pathBuilder.lineTo(6.0f, 12.95f);
        pathBuilder.lineToRelative(-2.0f, -0.67f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(4.0f, 20.0f);
        pathBuilder.verticalLineToRelative(-1.61f);
        pathBuilder.lineToRelative(2.0f, 0.67f);
        pathBuilder.lineToRelative(9.03f, -3.01f);
        pathBuilder.lineTo(18.0f, 20.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(17.0f, 6.0f);
        pathBuilder2.verticalLineTo(1.0f);
        pathBuilder2.lineToRelative(-5.0f, -1.0f);
        pathBuilder2.lineTo(9.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(4.0f);
        pathBuilder2.lineToRelative(3.0f, 2.0f);
        pathBuilder2.lineTo(17.0f, 6.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(11.0f, 3.07f);
        pathBuilder2.lineToRelative(1.42f, -0.95f);
        pathBuilder2.lineTo(15.0f, 2.64f);
        pathBuilder2.verticalLineToRelative(2.01f);
        pathBuilder2.lineToRelative(-2.77f, 1.11f);
        pathBuilder2.lineTo(11.0f, 4.93f);
        pathBuilder2.verticalLineTo(3.07f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(18.5f, 7.0f);
        pathBuilder3.lineTo(16.0f, 9.0f);
        pathBuilder3.verticalLineToRelative(3.0f);
        pathBuilder3.lineToRelative(2.5f, 2.0f);
        pathBuilder3.lineToRelative(4.5f, -2.0f);
        pathBuilder3.verticalLineTo(8.0f);
        pathBuilder3.lineTo(18.5f, 7.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(21.0f, 10.7f);
        pathBuilder3.lineToRelative(-2.2f, 0.98f);
        pathBuilder3.lineTo(18.0f, 11.04f);
        pathBuilder3.verticalLineTo(9.96f);
        pathBuilder3.lineToRelative(1.0f, -0.8f);
        pathBuilder3.lineToRelative(2.0f, 0.44f);
        pathBuilder3.verticalLineTo(10.7f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _landslide = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
