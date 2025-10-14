package androidx.compose.material.icons.filled;

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

/* compiled from: CrueltyFree.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_crueltyFree", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CrueltyFree", "Landroidx/compose/material/icons/Icons$Filled;", "getCrueltyFree", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCrueltyFree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrueltyFree.kt\nandroidx/compose/material/icons/filled/CrueltyFreeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,83:1\n212#2,12:84\n233#2,18:97\n253#2:134\n174#3:96\n705#4,2:115\n717#4,2:117\n719#4,11:123\n72#5,4:119\n*S KotlinDebug\n*F\n+ 1 CrueltyFree.kt\nandroidx/compose/material/icons/filled/CrueltyFreeKt\n*L\n29#1:84,12\n30#1:97,18\n30#1:134\n29#1:96\n30#1:115,2\n30#1:117,2\n30#1:123,11\n30#1:119,4\n*E\n"})
/* loaded from: classes.dex */
public final class CrueltyFreeKt {

    @Nullable
    private static ImageVector _crueltyFree;

    @NotNull
    public static final ImageVector getCrueltyFree(@NotNull Icons.Filled filled) {
        ImageVector imageVector = _crueltyFree;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.CrueltyFree", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.84f, 14.52f);
        pathBuilder.curveToRelative(-0.26f, -0.19f, -0.62f, -0.63f, -0.79f, -0.84f);
        pathBuilder.curveTo(17.24f, 12.01f, 19.0f, 8.87f, 19.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -1.95f, -0.74f, -3.0f, -2.0f, -3.0f);
        pathBuilder.curveToRelative(-1.54f, 0.0f, -3.96f, 2.06f, -5.0f, 5.97f);
        pathBuilder.curveTo(10.96f, 4.06f, 8.54f, 2.0f, 7.0f, 2.0f);
        pathBuilder.curveTo(5.74f, 2.0f, 5.0f, 3.05f, 5.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, 3.87f, 1.76f, 7.01f, 2.95f, 8.68f);
        pathBuilder.curveToRelative(-0.17f, 0.21f, -0.53f, 0.65f, -0.79f, 0.84f);
        pathBuilder.curveToRelative(-0.5f, 0.41f, -1.66f, 1.37f, -1.66f, 2.98f);
        pathBuilder.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder.curveToRelative(1.55f, 0.0f, 2.5f, -0.56f, 2.5f, -0.56f);
        pathBuilder.reflectiveCurveToRelative(0.95f, 0.56f, 2.5f, 0.56f);
        pathBuilder.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder.curveTo(18.5f, 15.89f, 17.34f, 14.93f, 16.84f, 14.52f);
        pathBuilder.close();
        pathBuilder.moveTo(9.35f, 12.2f);
        pathBuilder.curveTo(8.34f, 10.7f, 7.0f, 8.12f, 7.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -0.49f, 0.06f, -0.8f, 0.12f, -0.97f);
        pathBuilder.curveToRelative(0.94f, 0.31f, 3.24f, 2.71f, 3.38f, 7.64f);
        pathBuilder.curveTo(10.03f, 11.79f, 9.66f, 11.97f, 9.35f, 12.2f);
        pathBuilder.close();
        pathBuilder.moveTo(10.5f, 16.75f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.34f, -0.5f, -0.75f);
        pathBuilder.curveToRelative(0.0f, -0.41f, 0.22f, -0.75f, 0.5f, -0.75f);
        pathBuilder.reflectiveCurveTo(11.0f, 15.59f, 11.0f, 16.0f);
        pathBuilder.curveTo(11.0f, 16.41f, 10.78f, 16.75f, 10.5f, 16.75f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 19.5f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.72f, -1.0f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.45f, -0.5f, 1.0f, -0.5f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.22f, 1.0f, 0.5f);
        pathBuilder.curveTo(13.0f, 18.78f, 12.55f, 19.5f, 12.0f, 19.5f);
        pathBuilder.close();
        pathBuilder.moveTo(13.5f, 16.75f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.34f, -0.5f, -0.75f);
        pathBuilder.curveToRelative(0.0f, -0.41f, 0.22f, -0.75f, 0.5f, -0.75f);
        pathBuilder.reflectiveCurveTo(14.0f, 15.59f, 14.0f, 16.0f);
        pathBuilder.curveTo(14.0f, 16.41f, 13.78f, 16.75f, 13.5f, 16.75f);
        pathBuilder.close();
        pathBuilder.moveTo(13.5f, 11.67f);
        pathBuilder.curveToRelative(0.14f, -4.93f, 2.44f, -7.33f, 3.38f, -7.64f);
        pathBuilder.curveTo(16.94f, 4.2f, 17.0f, 4.51f, 17.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, 3.12f, -1.34f, 5.7f, -2.35f, 7.2f);
        pathBuilder.curveTo(14.34f, 11.97f, 13.97f, 11.79f, 13.5f, 11.67f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _crueltyFree = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
