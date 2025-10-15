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

/* compiled from: Kayaking.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_kayaking", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Kayaking", "Landroidx/compose/material/icons/Icons$Rounded;", "getKayaking", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nKayaking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Kayaking.kt\nandroidx/compose/material/icons/rounded/KayakingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,108:1\n212#2,12:109\n233#2,18:122\n253#2:159\n174#3:121\n705#4,2:140\n717#4,2:142\n719#4,11:148\n72#5,4:144\n*S KotlinDebug\n*F\n+ 1 Kayaking.kt\nandroidx/compose/material/icons/rounded/KayakingKt\n*L\n29#1:109,12\n30#1:122,18\n30#1:159\n29#1:121\n30#1:140,2\n30#1:142,2\n30#1:148,11\n30#1:144,4\n*E\n"})
/* loaded from: classes3.dex */
public final class KayakingKt {

    @Nullable
    private static ImageVector _kayaking;

    @NotNull
    public static final ImageVector getKayaking(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _kayaking;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Kayaking", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.0f, 22.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.87f, 0.0f, 1.73f, -0.24f, 2.53f, -0.7f);
        pathBuilder.curveToRelative(0.29f, -0.16f, 0.65f, -0.17f, 0.94f, 0.0f);
        pathBuilder.curveToRelative(1.59f, 0.9f, 3.48f, 0.9f, 5.06f, 0.0f);
        pathBuilder.curveToRelative(0.29f, -0.16f, 0.65f, -0.16f, 0.94f, 0.0f);
        pathBuilder.curveToRelative(1.59f, 0.9f, 3.48f, 0.9f, 5.06f, 0.0f);
        pathBuilder.curveToRelative(0.29f, -0.16f, 0.65f, -0.16f, 0.94f, 0.0f);
        pathBuilder.curveTo(19.27f, 20.76f, 20.13f, 21.0f, 21.0f, 21.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-1.03f, 0.0f, -2.06f, -0.25f, -3.0f, -0.75f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-1.92f, 1.02f, -4.18f, 1.0f, -6.09f, -0.05f);
        pathBuilder.curveToRelative(-1.79f, 0.87f, -3.92f, 0.98f, -5.58f, -0.14f);
        pathBuilder.curveTo(5.3f, 22.69f, 4.15f, 23.0f, 3.0f, 23.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(2.45f, 23.0f, 2.0f, 22.55f, 2.0f, 22.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 5.5f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(13.1f, 5.5f, 12.0f, 5.5f);
        pathBuilder.close();
        pathBuilder.moveTo(21.47f, 18.45f);
        pathBuilder.curveToRelative(-0.42f, 0.14f, -0.9f, 0.28f, -1.41f, 0.42f);
        pathBuilder.curveToRelative(-0.53f, -0.15f, -1.03f, -0.43f, -1.45f, -0.77f);
        pathBuilder.curveToRelative(-0.35f, -0.29f, -0.87f, -0.29f, -1.23f, 0.0f);
        pathBuilder.curveTo(16.72f, 18.63f, 15.9f, 19.0f, 15.0f, 19.0f);
        pathBuilder.reflectiveCurveToRelative(-1.72f, -0.37f, -2.39f, -0.91f);
        pathBuilder.curveToRelative(-0.35f, -0.28f, -0.87f, -0.28f, -1.22f, 0.0f);
        pathBuilder.curveTo(10.72f, 18.63f, 9.9f, 19.0f, 9.0f, 19.0f);
        pathBuilder.reflectiveCurveToRelative(-1.72f, -0.37f, -2.39f, -0.91f);
        pathBuilder.curveToRelative(-0.35f, -0.29f, -0.87f, -0.28f, -1.23f, 0.0f);
        pathBuilder.curveToRelative(-0.43f, 0.35f, -0.92f, 0.62f, -1.45f, 0.77f);
        pathBuilder.curveToRelative(-0.51f, -0.14f, -0.98f, -0.28f, -1.4f, -0.42f);
        pathBuilder.curveToRelative(-0.92f, -0.3f, -0.92f, -1.6f, 0.0f, -1.9f);
        pathBuilder.curveToRelative(1.21f, -0.39f, 2.79f, -0.82f, 4.6f, -1.13f);
        pathBuilder.lineToRelative(1.35f, -4.17f);
        pathBuilder.curveToRelative(0.31f, -0.95f, 1.32f, -1.47f, 2.27f, -1.16f);
        pathBuilder.curveToRelative(0.09f, 0.03f, 0.19f, 0.07f, 0.27f, 0.11f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.lineToRelative(2.47f, 1.3f);
        pathBuilder.lineToRelative(2.84f, -1.5f);
        pathBuilder.lineToRelative(1.65f, -3.71f);
        pathBuilder.lineToRelative(-0.36f, -0.93f);
        pathBuilder.curveToRelative(-0.1f, -0.25f, -0.09f, -0.52f, 0.02f, -0.76f);
        pathBuilder.lineToRelative(0.74f, -1.68f);
        pathBuilder.curveToRelative(0.22f, -0.51f, 0.82f, -0.73f, 1.32f, -0.51f);
        pathBuilder.lineToRelative(1.37f, 0.61f);
        pathBuilder.curveToRelative(0.5f, 0.23f, 0.73f, 0.82f, 0.5f, 1.32f);
        pathBuilder.lineToRelative(-0.75f, 1.68f);
        pathBuilder.curveToRelative(-0.11f, 0.24f, -0.31f, 0.43f, -0.56f, 0.53f);
        pathBuilder.lineTo(19.36f, 6.9f);
        pathBuilder.lineToRelative(-3.72f, 8.34f);
        pathBuilder.curveToRelative(2.33f, 0.3f, 4.35f, 0.84f, 5.82f, 1.31f);
        pathBuilder.curveTo(22.39f, 16.85f, 22.4f, 18.15f, 21.47f, 18.45f);
        pathBuilder.close();
        pathBuilder.moveTo(15.02f, 12.96f);
        pathBuilder.lineToRelative(-0.59f, 0.31f);
        pathBuilder.curveToRelative(-0.58f, 0.31f, -1.28f, 0.31f, -1.86f, 0.0f);
        pathBuilder.lineToRelative(-0.81f, -0.43f);
        pathBuilder.lineToRelative(-0.71f, 2.17f);
        pathBuilder.curveTo(11.36f, 15.01f, 11.68f, 15.0f, 12.0f, 15.0f);
        pathBuilder.curveToRelative(0.71f, 0.0f, 1.4f, 0.03f, 2.07f, 0.08f);
        pathBuilder.lineTo(15.02f, 12.96f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _kayaking = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
