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

/* compiled from: BeachAccess.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_beachAccess", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BeachAccess", "Landroidx/compose/material/icons/Icons$TwoTone;", "getBeachAccess", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBeachAccess.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeachAccess.kt\nandroidx/compose/material/icons/twotone/BeachAccessKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,87:1\n212#2,12:88\n233#2,18:101\n253#2:138\n233#2,18:139\n253#2:176\n174#3:100\n705#4,2:119\n717#4,2:121\n719#4,11:127\n705#4,2:157\n717#4,2:159\n719#4,11:165\n72#5,4:123\n72#5,4:161\n*S KotlinDebug\n*F\n+ 1 BeachAccess.kt\nandroidx/compose/material/icons/twotone/BeachAccessKt\n*L\n29#1:88,12\n30#1:101,18\n30#1:138\n50#1:139,18\n50#1:176\n29#1:100\n30#1:119,2\n30#1:121,2\n30#1:127,11\n50#1:157,2\n50#1:159,2\n50#1:165,11\n30#1:123,4\n50#1:161,4\n*E\n"})
/* loaded from: classes4.dex */
public final class BeachAccessKt {

    @Nullable
    private static ImageVector _beachAccess;

    @NotNull
    public static final ImageVector getBeachAccess(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _beachAccess;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.BeachAccess", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.6f, 7.6f);
        pathBuilder.curveToRelative(-0.47f, 2.34f, 0.03f, 4.78f, 1.39f, 6.83f);
        pathBuilder.lineToRelative(5.45f, -5.45f);
        pathBuilder.curveToRelative(-1.53f, -1.02f, -3.28f, -1.56f, -5.08f, -1.56f);
        pathBuilder.curveToRelative(-0.6f, 0.0f, -1.19f, 0.06f, -1.76f, 0.18f);
        pathBuilder.close();
        pathBuilder.moveTo(13.12f, 5.0f);
        pathBuilder.curveToRelative(-0.93f, 0.0f, -1.82f, 0.16f, -2.67f, 0.46f);
        pathBuilder.curveToRelative(1.91f, 0.19f, 3.79f, 0.89f, 5.44f, 2.07f);
        pathBuilder.lineToRelative(1.39f, -1.39f);
        pathBuilder.curveTo(16.03f, 5.4f, 14.61f, 5.0f, 13.12f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 13.12f);
        pathBuilder.curveToRelative(0.0f, 1.49f, 0.4f, 2.91f, 1.14f, 4.15f);
        pathBuilder.lineToRelative(1.39f, -1.39f);
        pathBuilder.curveToRelative(-1.18f, -1.65f, -1.88f, -3.52f, -2.07f, -5.44f);
        pathBuilder.curveToRelative(-0.3f, 0.86f, -0.46f, 1.76f, -0.46f, 2.68f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(13.126f, 14.56f);
        pathBuilder2.lineToRelative(1.428f, -1.428f);
        pathBuilder2.lineToRelative(6.442f, 6.442f);
        pathBuilder2.lineToRelative(-1.43f, 1.428f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.12f, 3.0f);
        pathBuilder2.curveToRelative(-2.58f, 0.0f, -5.16f, 0.98f, -7.14f, 2.95f);
        pathBuilder2.lineToRelative(-0.01f, 0.01f);
        pathBuilder2.curveToRelative(-3.95f, 3.95f, -3.95f, 10.36f, 0.0f, 14.31f);
        pathBuilder2.lineToRelative(14.3f, -14.31f);
        pathBuilder2.curveTo(18.3f, 3.99f, 15.71f, 3.0f, 13.12f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(6.14f, 17.27f);
        pathBuilder2.curveTo(5.4f, 16.03f, 5.0f, 14.61f, 5.0f, 13.12f);
        pathBuilder2.curveToRelative(0.0f, -0.93f, 0.16f, -1.82f, 0.46f, -2.67f);
        pathBuilder2.curveToRelative(0.19f, 1.91f, 0.89f, 3.79f, 2.07f, 5.44f);
        pathBuilder2.lineToRelative(-1.39f, 1.38f);
        pathBuilder2.close();
        pathBuilder2.moveTo(8.98f, 14.43f);
        pathBuilder2.curveTo(7.63f, 12.38f, 7.12f, 9.93f, 7.6f, 7.6f);
        pathBuilder2.curveToRelative(0.58f, -0.12f, 1.16f, -0.18f, 1.75f, -0.18f);
        pathBuilder2.curveToRelative(1.8f, 0.0f, 3.55f, 0.55f, 5.08f, 1.56f);
        pathBuilder2.lineToRelative(-5.45f, 5.45f);
        pathBuilder2.close();
        pathBuilder2.moveTo(10.45f, 5.46f);
        pathBuilder2.curveToRelative(0.85f, -0.3f, 1.74f, -0.46f, 2.67f, -0.46f);
        pathBuilder2.curveToRelative(1.49f, 0.0f, 2.91f, 0.4f, 4.15f, 1.14f);
        pathBuilder2.lineToRelative(-1.39f, 1.39f);
        pathBuilder2.curveToRelative(-1.65f, -1.18f, -3.52f, -1.88f, -5.43f, -2.07f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _beachAccess = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
