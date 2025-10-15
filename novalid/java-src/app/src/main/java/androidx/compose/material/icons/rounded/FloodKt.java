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

/* compiled from: Flood.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_flood", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Flood", "Landroidx/compose/material/icons/Icons$Rounded;", "getFlood", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFlood.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Flood.kt\nandroidx/compose/material/icons/rounded/FloodKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,96:1\n212#2,12:97\n233#2,18:110\n253#2:147\n233#2,18:148\n253#2:185\n174#3:109\n705#4,2:128\n717#4,2:130\n719#4,11:136\n705#4,2:166\n717#4,2:168\n719#4,11:174\n72#5,4:132\n72#5,4:170\n*S KotlinDebug\n*F\n+ 1 Flood.kt\nandroidx/compose/material/icons/rounded/FloodKt\n*L\n29#1:97,12\n30#1:110,18\n30#1:147\n52#1:148,18\n52#1:185\n29#1:109\n30#1:128,2\n30#1:130,2\n30#1:136,11\n52#1:166,2\n52#1:168,2\n52#1:174,11\n30#1:132,4\n52#1:170,4\n*E\n"})
/* loaded from: classes2.dex */
public final class FloodKt {

    @Nullable
    private static ImageVector _flood;

    @NotNull
    public static final ImageVector getFlood(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _flood;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Flood", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.67f, 19.0f);
        pathBuilder.curveToRelative(-1.95f, 0.0f, -2.09f, 1.0f, -3.33f, 1.0f);
        pathBuilder.curveToRelative(-1.19f, 0.0f, -1.42f, -1.0f, -3.33f, -1.0f);
        pathBuilder.curveToRelative(-1.95f, 0.0f, -2.1f, 1.0f, -3.34f, 1.0f);
        pathBuilder.curveToRelative(-1.24f, 0.0f, -1.38f, -1.0f, -3.33f, -1.0f);
        pathBuilder.curveToRelative(-1.54f, 0.0f, -1.96f, 0.62f, -2.67f, 0.88f);
        pathBuilder.curveTo(2.27f, 20.03f, 2.0f, 20.4f, 2.0f, 20.83f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, 0.71f, 0.72f, 1.19f, 1.38f, 0.94f);
        pathBuilder.curveTo(4.15f, 21.48f, 4.49f, 21.0f, 5.34f, 21.0f);
        pathBuilder.curveToRelative(1.24f, 0.0f, 1.38f, 1.0f, 3.33f, 1.0f);
        pathBuilder.curveToRelative(1.95f, 0.0f, 2.1f, -1.0f, 3.34f, -1.0f);
        pathBuilder.curveToRelative(1.22f, 0.0f, 1.4f, 1.0f, 3.33f, 1.0f);
        pathBuilder.curveToRelative(1.93f, 0.0f, 2.1f, -1.0f, 3.33f, -1.0f);
        pathBuilder.curveToRelative(0.84f, 0.0f, 1.18f, 0.47f, 1.95f, 0.77f);
        pathBuilder.curveToRelative(0.66f, 0.26f, 1.38f, -0.23f, 1.38f, -0.94f);
        pathBuilder.verticalLineToRelative(-0.01f);
        pathBuilder.curveToRelative(0.0f, -0.42f, -0.27f, -0.8f, -0.67f, -0.94f);
        pathBuilder.curveTo(20.62f, 19.62f, 20.21f, 19.0f, 18.67f, 19.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(8.68f, 17.5f);
        pathBuilder2.curveToRelative(1.95f, 0.0f, 2.09f, -1.0f, 3.33f, -1.0f);
        pathBuilder2.curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f);
        pathBuilder2.curveToRelative(1.95f, 0.0f, 2.09f, -1.0f, 3.33f, -1.0f);
        pathBuilder2.curveToRelative(0.82f, 0.0f, 1.17f, 0.46f, 1.93f, 0.76f);
        pathBuilder2.curveToRelative(0.66f, 0.26f, 1.38f, -0.23f, 1.38f, -0.94f);
        pathBuilder2.verticalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.0f, -0.42f, -0.26f, -0.79f, -0.65f, -0.94f);
        pathBuilder2.curveToRelative(-0.29f, -0.11f, -0.54f, -0.27f, -0.83f, -0.43f);
        pathBuilder2.lineToRelative(-2.02f, -7.53f);
        pathBuilder2.lineToRelative(1.17f, 0.47f);
        pathBuilder2.curveToRelative(0.51f, 0.21f, 1.09f, -0.04f, 1.29f, -0.55f);
        pathBuilder2.verticalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.21f, -0.51f, -0.05f, -1.1f, -0.57f, -1.29f);
        pathBuilder2.lineToRelative(-9.24f, -3.54f);
        pathBuilder2.curveToRelative(-0.81f, -0.31f, -1.72f, -0.06f, -2.27f, 0.61f);
        pathBuilder2.lineToRelative(-6.23f, 7.7f);
        pathBuilder2.curveToRelative(-0.35f, 0.43f, -0.28f, 1.06f, 0.16f, 1.4f);
        pathBuilder2.lineToRelative(0.0f, 0.0f);
        pathBuilder2.curveToRelative(0.43f, 0.34f, 1.06f, 0.26f, 1.39f, -0.17f);
        pathBuilder2.lineToRelative(0.78f, -1.0f);
        pathBuilder2.lineToRelative(0.93f, 3.48f);
        pathBuilder2.curveToRelative(-0.18f, -0.02f, -0.35f, -0.05f, -0.56f, -0.05f);
        pathBuilder2.curveToRelative(-1.54f, 0.0f, -1.95f, 0.62f, -2.66f, 0.88f);
        pathBuilder2.curveTo(2.27f, 15.53f, 2.0f, 15.91f, 2.0f, 16.33f);
        pathBuilder2.verticalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.0f, 0.7f, 0.69f, 1.19f, 1.35f, 0.95f);
        pathBuilder2.curveToRelative(0.8f, -0.29f, 1.18f, -0.78f, 2.0f, -0.78f);
        pathBuilder2.curveTo(6.54f, 16.5f, 6.77f, 17.5f, 8.68f, 17.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.04f, 10.18f);
        pathBuilder2.lineToRelative(1.42f, 5.31f);
        pathBuilder2.curveToRelative(-1.34f, 0.09f, -1.47f, -0.99f, -3.47f, -0.99f);
        pathBuilder2.curveToRelative(-0.36f, 0.0f, -0.65f, 0.04f, -0.91f, 0.1f);
        pathBuilder2.lineToRelative(-0.91f, -3.39f);
        pathBuilder2.lineTo(14.04f, 10.18f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flood = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
