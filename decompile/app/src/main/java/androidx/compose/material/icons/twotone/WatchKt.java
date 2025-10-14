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

/* compiled from: Watch.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_watch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Watch", "Landroidx/compose/material/icons/Icons$TwoTone;", "getWatch", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nWatch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Watch.kt\nandroidx/compose/material/icons/twotone/WatchKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,85:1\n212#2,12:86\n233#2,18:99\n253#2:136\n233#2,18:137\n253#2:174\n174#3:98\n705#4,2:117\n717#4,2:119\n719#4,11:125\n705#4,2:155\n717#4,2:157\n719#4,11:163\n72#5,4:121\n72#5,4:159\n*S KotlinDebug\n*F\n+ 1 Watch.kt\nandroidx/compose/material/icons/twotone/WatchKt\n*L\n29#1:86,12\n30#1:99,18\n30#1:136\n46#1:137,18\n46#1:174\n29#1:98\n30#1:117,2\n30#1:119,2\n30#1:125,11\n46#1:155,2\n46#1:157,2\n46#1:163,11\n30#1:121,4\n46#1:159,4\n*E\n"})
/* loaded from: classes3.dex */
public final class WatchKt {

    @Nullable
    private static ImageVector _watch;

    @NotNull
    public static final ImageVector getWatch(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _watch;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Watch", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.72f, 4.48f);
        pathBuilder.lineTo(14.31f, 2.0f);
        pathBuilder.horizontalLineTo(9.7f);
        pathBuilder.lineToRelative(-0.41f, 2.47f);
        pathBuilder.curveTo(10.13f, 4.17f, 11.05f, 4.0f, 12.0f, 4.0f);
        pathBuilder.curveToRelative(0.96f, 0.0f, 1.87f, 0.17f, 2.72f, 0.48f);
        pathBuilder.close();
        pathBuilder.moveTo(9.29f, 19.53f);
        pathBuilder.lineTo(9.7f, 22.0f);
        pathBuilder.horizontalLineToRelative(4.61f);
        pathBuilder.lineToRelative(0.41f, -2.48f);
        pathBuilder.curveToRelative(-0.85f, 0.31f, -1.76f, 0.48f, -2.72f, 0.48f);
        pathBuilder.curveToRelative(-0.95f, 0.0f, -1.87f, -0.17f, -2.71f, -0.47f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(16.96f, 5.73f);
        pathBuilder2.lineTo(16.0f, 0.0f);
        pathBuilder2.lineTo(8.0f, 0.0f);
        pathBuilder2.lineToRelative(-0.95f, 5.73f);
        pathBuilder2.curveTo(5.19f, 7.19f, 4.0f, 9.45f, 4.0f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(1.19f, 4.81f, 3.05f, 6.27f);
        pathBuilder2.lineTo(8.0f, 24.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.lineToRelative(0.96f, -5.73f);
        pathBuilder2.curveTo(18.81f, 16.81f, 20.0f, 14.54f, 20.0f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.19f, -4.81f, -3.04f, -6.27f);
        pathBuilder2.close();
        pathBuilder2.moveTo(9.7f, 2.0f);
        pathBuilder2.horizontalLineToRelative(4.61f);
        pathBuilder2.lineToRelative(0.41f, 2.48f);
        pathBuilder2.curveTo(13.87f, 4.17f, 12.96f, 4.0f, 12.0f, 4.0f);
        pathBuilder2.curveToRelative(-0.95f, 0.0f, -1.87f, 0.17f, -2.71f, 0.47f);
        pathBuilder2.lineTo(9.7f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.31f, 22.0f);
        pathBuilder2.lineTo(9.7f, 22.0f);
        pathBuilder2.lineToRelative(-0.41f, -2.47f);
        pathBuilder2.curveToRelative(0.84f, 0.3f, 1.76f, 0.47f, 2.71f, 0.47f);
        pathBuilder2.curveToRelative(0.96f, 0.0f, 1.87f, -0.17f, 2.72f, -0.48f);
        pathBuilder2.lineTo(14.31f, 22.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 18.0f);
        pathBuilder2.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilder2.reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilder2.reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f);
        pathBuilder2.reflectiveCurveToRelative(-2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _watch = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
