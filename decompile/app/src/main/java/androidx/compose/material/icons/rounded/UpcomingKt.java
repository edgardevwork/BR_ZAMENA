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

/* compiled from: Upcoming.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_upcoming", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Upcoming", "Landroidx/compose/material/icons/Icons$Rounded;", "getUpcoming", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nUpcoming.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Upcoming.kt\nandroidx/compose/material/icons/rounded/UpcomingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,87:1\n212#2,12:88\n233#2,18:101\n253#2:138\n233#2,18:139\n253#2:176\n233#2,18:177\n253#2:214\n233#2,18:215\n253#2:252\n174#3:100\n705#4,2:119\n717#4,2:121\n719#4,11:127\n705#4,2:157\n717#4,2:159\n719#4,11:165\n705#4,2:195\n717#4,2:197\n719#4,11:203\n705#4,2:233\n717#4,2:235\n719#4,11:241\n72#5,4:123\n72#5,4:161\n72#5,4:199\n72#5,4:237\n*S KotlinDebug\n*F\n+ 1 Upcoming.kt\nandroidx/compose/material/icons/rounded/UpcomingKt\n*L\n29#1:88,12\n30#1:101,18\n30#1:138\n42#1:139,18\n42#1:176\n54#1:177,18\n54#1:214\n66#1:215,18\n66#1:252\n29#1:100\n30#1:119,2\n30#1:121,2\n30#1:127,11\n42#1:157,2\n42#1:159,2\n42#1:165,11\n54#1:195,2\n54#1:197,2\n54#1:203,11\n66#1:233,2\n66#1:235,2\n66#1:241,11\n30#1:123,4\n42#1:161,4\n54#1:199,4\n66#1:237,4\n*E\n"})
/* loaded from: classes2.dex */
public final class UpcomingKt {

    @Nullable
    private static ImageVector _upcoming;

    @NotNull
    public static final ImageVector getUpcoming(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _upcoming;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Upcoming", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.45f, 6.55f);
        pathBuilder.lineTo(20.45f, 6.55f);
        pathBuilder.curveToRelative(-0.38f, -0.38f, -1.01f, -0.38f, -1.39f, 0.0f);
        pathBuilder.lineTo(16.89f, 8.7f);
        pathBuilder.curveToRelative(-0.39f, 0.38f, -0.39f, 1.01f, 0.0f, 1.39f);
        pathBuilder.lineToRelative(0.01f, 0.01f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.01f, 0.39f, 1.4f, 0.0f);
        pathBuilder.curveToRelative(0.62f, -0.63f, 1.52f, -1.54f, 2.15f, -2.17f);
        pathBuilder.curveTo(20.83f, 7.55f, 20.83f, 6.93f, 20.45f, 6.55f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.02f, 3.0f);
        pathBuilder2.horizontalLineToRelative(-0.03f);
        pathBuilder2.curveTo(11.44f, 3.0f, 11.0f, 3.44f, 11.0f, 3.98f);
        pathBuilder2.verticalLineToRelative(3.03f);
        pathBuilder2.curveTo(11.0f, 7.56f, 11.44f, 8.0f, 11.98f, 8.0f);
        pathBuilder2.horizontalLineToRelative(0.03f);
        pathBuilder2.curveTo(12.56f, 8.0f, 13.0f, 7.56f, 13.0f, 7.02f);
        pathBuilder2.verticalLineTo(3.98f);
        pathBuilder2.curveTo(13.0f, 3.44f, 12.56f, 3.0f, 12.02f, 3.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(7.1f, 10.11f);
        pathBuilder3.lineToRelative(0.01f, -0.01f);
        pathBuilder3.curveToRelative(0.38f, -0.38f, 0.38f, -1.01f, 0.0f, -1.39f);
        pathBuilder3.lineTo(4.96f, 6.54f);
        pathBuilder3.curveToRelative(-0.38f, -0.39f, -1.01f, -0.39f, -1.39f, 0.0f);
        pathBuilder3.lineTo(3.55f, 6.55f);
        pathBuilder3.curveToRelative(-0.39f, 0.39f, -0.39f, 1.01f, 0.0f, 1.39f);
        pathBuilder3.curveToRelative(0.63f, 0.62f, 1.53f, 1.54f, 2.15f, 2.17f);
        pathBuilder3.curveTo(6.09f, 10.49f, 6.72f, 10.49f, 7.1f, 10.11f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(12.0f, 15.0f);
        pathBuilder4.curveToRelative(-1.24f, 0.0f, -2.31f, -0.75f, -2.76f, -1.83f);
        pathBuilder4.curveTo(8.92f, 12.43f, 8.14f, 12.0f, 7.34f, 12.0f);
        pathBuilder4.lineTo(4.0f, 12.0f);
        pathBuilder4.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder4.lineToRelative(0.0f, 5.0f);
        pathBuilder4.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder4.horizontalLineToRelative(16.0f);
        pathBuilder4.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder4.verticalLineToRelative(-5.0f);
        pathBuilder4.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder4.lineToRelative(-3.34f, 0.0f);
        pathBuilder4.curveToRelative(-0.8f, 0.0f, -1.58f, 0.43f, -1.9f, 1.17f);
        pathBuilder4.curveTo(14.31f, 14.25f, 13.24f, 15.0f, 12.0f, 15.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _upcoming = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
