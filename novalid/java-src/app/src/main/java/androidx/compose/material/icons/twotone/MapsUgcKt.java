package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.PathFillType;
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

/* compiled from: MapsUgc.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_mapsUgc", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MapsUgc", "Landroidx/compose/material/icons/Icons$TwoTone;", "getMapsUgc", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMapsUgc.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapsUgc.kt\nandroidx/compose/material/icons/twotone/MapsUgcKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,87:1\n212#2,12:88\n233#2,18:101\n253#2:138\n233#2,18:139\n253#2:176\n233#2,18:177\n253#2:214\n174#3:100\n705#4,2:119\n717#4,2:121\n719#4,11:127\n705#4,2:157\n717#4,2:159\n719#4,11:165\n705#4,2:195\n717#4,2:197\n719#4,11:203\n72#5,4:123\n72#5,4:161\n72#5,4:199\n*S KotlinDebug\n*F\n+ 1 MapsUgc.kt\nandroidx/compose/material/icons/twotone/MapsUgcKt\n*L\n30#1:88,12\n31#1:101,18\n31#1:138\n44#1:139,18\n44#1:176\n67#1:177,18\n67#1:214\n30#1:100\n31#1:119,2\n31#1:121,2\n31#1:127,11\n44#1:157,2\n44#1:159,2\n44#1:165,11\n67#1:195,2\n67#1:197,2\n67#1:203,11\n31#1:123,4\n44#1:161,4\n67#1:199,4\n*E\n"})
/* loaded from: classes4.dex */
public final class MapsUgcKt {

    @Nullable
    private static ImageVector _mapsUgc;

    @NotNull
    public static final ImageVector getMapsUgc(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _mapsUgc;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.MapsUgc", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        pathBuilder.curveToRelative(-1.18f, 0.0f, -2.34f, -0.26f, -3.43f, -0.78f);
        pathBuilder.curveToRelative(-0.27f, -0.13f, -0.56f, -0.19f, -0.86f, -0.19f);
        pathBuilder.curveToRelative(-0.19f, 0.0f, -0.38f, 0.03f, -0.56f, 0.08f);
        pathBuilder.lineToRelative(-3.2f, 0.94f);
        pathBuilder.lineToRelative(0.94f, -3.2f);
        pathBuilder.curveToRelative(0.14f, -0.47f, 0.1f, -0.98f, -0.11f, -1.42f);
        pathBuilder.curveTo(4.26f, 14.34f, 4.0f, 13.18f, 4.0f, 12.0f);
        pathBuilder.curveTo(4.0f, 7.59f, 7.59f, 4.0f, 12.0f, 4.0f);
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 4.0f);
        pathBuilder2.curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilder2.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        pathBuilder2.curveToRelative(-1.18f, 0.0f, -2.34f, -0.26f, -3.43f, -0.78f);
        pathBuilder2.curveToRelative(-0.27f, -0.13f, -0.56f, -0.19f, -0.86f, -0.19f);
        pathBuilder2.curveToRelative(-0.19f, 0.0f, -0.38f, 0.03f, -0.56f, 0.08f);
        pathBuilder2.lineToRelative(-3.2f, 0.94f);
        pathBuilder2.lineToRelative(0.94f, -3.2f);
        pathBuilder2.curveToRelative(0.14f, -0.47f, 0.1f, -0.98f, -0.11f, -1.42f);
        pathBuilder2.curveTo(4.26f, 14.34f, 4.0f, 13.18f, 4.0f, 12.0f);
        pathBuilder2.curveTo(4.0f, 7.59f, 7.59f, 4.0f, 12.0f, 4.0f);
        pathBuilder2.moveTo(12.0f, 2.0f);
        pathBuilder2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, 1.54f, 0.36f, 2.98f, 0.97f, 4.29f);
        pathBuilder2.lineTo(1.0f, 23.0f);
        pathBuilder2.lineToRelative(6.71f, -1.97f);
        pathBuilder2.curveTo(9.02f, 21.64f, 10.46f, 22.0f, 12.0f, 22.0f);
        pathBuilder2.curveToRelative(5.52f, 0.0f, 10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder2.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder2.lineTo(12.0f, 2.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int iM11622getEvenOddRgk1Os = PathFillType.INSTANCE.m11622getEvenOddRgk1Os();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(13.0f, 8.0f);
        pathBuilder3.lineToRelative(-2.0f, 0.0f);
        pathBuilder3.lineToRelative(0.0f, 3.0f);
        pathBuilder3.lineToRelative(-3.0f, 0.0f);
        pathBuilder3.lineToRelative(0.0f, 2.0f);
        pathBuilder3.lineToRelative(3.0f, 0.0f);
        pathBuilder3.lineToRelative(0.0f, 3.0f);
        pathBuilder3.lineToRelative(2.0f, 0.0f);
        pathBuilder3.lineToRelative(0.0f, -3.0f);
        pathBuilder3.lineToRelative(3.0f, 0.0f);
        pathBuilder3.lineToRelative(0.0f, -2.0f);
        pathBuilder3.lineToRelative(-3.0f, 0.0f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), iM11622getEvenOddRgk1Os, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mapsUgc = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
