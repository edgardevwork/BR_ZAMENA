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

/* compiled from: VapingRooms.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_vapingRooms", "Landroidx/compose/ui/graphics/vector/ImageVector;", "VapingRooms", "Landroidx/compose/material/icons/Icons$TwoTone;", "getVapingRooms", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nVapingRooms.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VapingRooms.kt\nandroidx/compose/material/icons/twotone/VapingRoomsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,90:1\n212#2,12:91\n233#2,18:104\n253#2:141\n233#2,18:142\n253#2:179\n174#3:103\n705#4,2:122\n717#4,2:124\n719#4,11:130\n705#4,2:160\n717#4,2:162\n719#4,11:168\n72#5,4:126\n72#5,4:164\n*S KotlinDebug\n*F\n+ 1 VapingRooms.kt\nandroidx/compose/material/icons/twotone/VapingRoomsKt\n*L\n29#1:91,12\n30#1:104,18\n30#1:141\n36#1:142,18\n36#1:179\n29#1:103\n30#1:122,2\n30#1:124,2\n30#1:130,11\n36#1:160,2\n36#1:162,2\n36#1:168,11\n30#1:126,4\n36#1:164,4\n*E\n"})
/* loaded from: classes2.dex */
public final class VapingRoomsKt {

    @Nullable
    private static ImageVector _vapingRooms;

    @NotNull
    public static final ImageVector getVapingRooms(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _vapingRooms;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.VapingRooms", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.5f, 17.5f);
        pathBuilder.moveToRelative(-0.5f, 0.0f);
        pathBuilder.arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f);
        pathBuilder.arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f);
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(2.0f, 16.5f);
        pathBuilder2.horizontalLineToRelative(1.0f);
        pathBuilder2.curveToRelative(1.33f, 0.0f, 2.71f, -0.18f, 4.0f, -0.5f);
        pathBuilder2.verticalLineToRelative(3.0f);
        pathBuilder2.curveToRelative(-1.29f, -0.32f, -2.67f, -0.5f, -4.0f, -0.5f);
        pathBuilder2.horizontalLineTo(2.0f);
        pathBuilder2.verticalLineTo(16.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(22.0f, 16.0f);
        pathBuilder2.verticalLineToRelative(3.0f);
        pathBuilder2.horizontalLineTo(8.0f);
        pathBuilder2.verticalLineToRelative(-3.0f);
        pathBuilder2.horizontalLineTo(22.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(11.0f, 17.5f);
        pathBuilder2.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilder2.reflectiveCurveTo(10.0f, 17.22f, 10.0f, 17.5f);
        pathBuilder2.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilder2.reflectiveCurveTo(11.0f, 17.78f, 11.0f, 17.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(22.0f, 12.76f);
        pathBuilder2.verticalLineTo(15.0f);
        pathBuilder2.horizontalLineToRelative(-1.5f);
        pathBuilder2.verticalLineToRelative(-2.23f);
        pathBuilder2.curveToRelative(0.0f, -2.24f, -1.76f, -4.07f, -4.0f, -4.07f);
        pathBuilder2.verticalLineTo(7.2f);
        pathBuilder2.curveToRelative(1.02f, 0.0f, 1.85f, -0.83f, 1.85f, -1.85f);
        pathBuilder2.reflectiveCurveTo(17.52f, 3.5f, 16.5f, 3.5f);
        pathBuilder2.verticalLineTo(2.0f);
        pathBuilder2.curveToRelative(1.85f, 0.0f, 3.35f, 1.5f, 3.35f, 3.35f);
        pathBuilder2.curveToRelative(0.0f, 0.93f, -0.38f, 1.77f, -1.0f, 2.38f);
        pathBuilder2.curveTo(20.72f, 8.62f, 22.0f, 10.54f, 22.0f, 12.76f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.5f, 13.36f);
        pathBuilder2.verticalLineTo(15.0f);
        pathBuilder2.horizontalLineTo(18.0f);
        pathBuilder2.verticalLineToRelative(-1.3f);
        pathBuilder2.curveToRelative(0.0f, -1.31f, -0.92f, -2.05f, -1.97f, -2.05f);
        pathBuilder2.horizontalLineTo(14.5f);
        pathBuilder2.curveToRelative(-1.85f, 0.0f, -3.35f, -1.5f, -3.35f, -3.35f);
        pathBuilder2.reflectiveCurveToRelative(1.5f, -3.35f, 3.35f, -3.35f);
        pathBuilder2.verticalLineToRelative(1.5f);
        pathBuilder2.curveToRelative(-1.02f, 0.0f, -1.85f, 0.73f, -1.85f, 1.75f);
        pathBuilder2.reflectiveCurveToRelative(0.83f, 2.0f, 1.85f, 2.0f);
        pathBuilder2.horizontalLineToRelative(1.53f);
        pathBuilder2.curveTo(17.9f, 10.2f, 19.5f, 11.55f, 19.5f, 13.36f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _vapingRooms = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
