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

/* compiled from: Whatshot.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_whatshot", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Whatshot", "Landroidx/compose/material/icons/Icons$TwoTone;", "getWhatshot", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nWhatshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Whatshot.kt\nandroidx/compose/material/icons/twotone/WhatshotKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,79:1\n212#2,12:80\n233#2,18:93\n253#2:130\n233#2,18:131\n253#2:168\n174#3:92\n705#4,2:111\n717#4,2:113\n719#4,11:119\n705#4,2:149\n717#4,2:151\n719#4,11:157\n72#5,4:115\n72#5,4:153\n*S KotlinDebug\n*F\n+ 1 Whatshot.kt\nandroidx/compose/material/icons/twotone/WhatshotKt\n*L\n29#1:80,12\n30#1:93,18\n30#1:130\n47#1:131,18\n47#1:168\n29#1:92\n30#1:111,2\n30#1:113,2\n30#1:119,11\n47#1:149,2\n47#1:151,2\n47#1:157,11\n30#1:115,4\n47#1:153,4\n*E\n"})
/* loaded from: classes3.dex */
public final class WhatshotKt {

    @Nullable
    private static ImageVector _whatshot;

    @NotNull
    public static final ImageVector getWhatshot(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _whatshot;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Whatshot", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.11f, 6.77f);
        pathBuilder.curveToRelative(-0.53f, 2.6f, -2.62f, 4.43f, -5.28f, 4.43f);
        pathBuilder.curveToRelative(-1.56f, 0.0f, -2.96f, -0.62f, -3.97f, -1.63f);
        pathBuilder.curveTo(6.3f, 10.96f, 6.0f, 12.47f, 6.0f, 14.0f);
        pathBuilder.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f);
        pathBuilder.curveToRelative(0.0f, -2.56f, -0.66f, -5.03f, -1.89f, -7.23f);
        pathBuilder.close();
        pathBuilder.moveTo(11.89f, 17.99f);
        pathBuilder.curveToRelative(-1.37f, 0.0f, -2.49f, -1.08f, -2.49f, -2.42f);
        pathBuilder.curveToRelative(0.0f, -1.25f, 0.81f, -2.13f, 2.17f, -2.41f);
        pathBuilder.curveToRelative(1.37f, -0.28f, 2.78f, -0.93f, 3.57f, -1.99f);
        pathBuilder.curveToRelative(0.3f, 1.0f, 0.46f, 2.05f, 0.46f, 3.12f);
        pathBuilder.curveToRelative(0.0f, 2.04f, -1.66f, 3.7f, -3.71f, 3.7f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(11.57f, 13.16f);
        pathBuilder2.curveToRelative(-1.36f, 0.28f, -2.17f, 1.16f, -2.17f, 2.41f);
        pathBuilder2.curveToRelative(0.0f, 1.34f, 1.11f, 2.42f, 2.49f, 2.42f);
        pathBuilder2.curveToRelative(2.05f, 0.0f, 3.71f, -1.66f, 3.71f, -3.71f);
        pathBuilder2.curveToRelative(0.0f, -1.07f, -0.15f, -2.12f, -0.46f, -3.12f);
        pathBuilder2.curveToRelative(-0.79f, 1.07f, -2.2f, 1.72f, -3.57f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.5f, 0.67f);
        pathBuilder2.reflectiveCurveToRelative(0.74f, 2.65f, 0.74f, 4.8f);
        pathBuilder2.curveToRelative(0.0f, 2.06f, -1.35f, 3.73f, -3.41f, 3.73f);
        pathBuilder2.curveToRelative(-2.07f, 0.0f, -3.63f, -1.67f, -3.63f, -3.73f);
        pathBuilder2.lineToRelative(0.03f, -0.36f);
        pathBuilder2.curveTo(5.21f, 7.51f, 4.0f, 10.62f, 4.0f, 14.0f);
        pathBuilder2.curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        pathBuilder2.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        pathBuilder2.curveTo(20.0f, 8.61f, 17.41f, 3.8f, 13.5f, 0.67f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 20.0f);
        pathBuilder2.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilder2.curveToRelative(0.0f, -1.53f, 0.3f, -3.04f, 0.86f, -4.43f);
        pathBuilder2.curveToRelative(1.01f, 1.01f, 2.41f, 1.63f, 3.97f, 1.63f);
        pathBuilder2.curveToRelative(2.66f, 0.0f, 4.75f, -1.83f, 5.28f, -4.43f);
        pathBuilder2.curveTo(17.34f, 8.97f, 18.0f, 11.44f, 18.0f, 14.0f);
        pathBuilder2.curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _whatshot = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
