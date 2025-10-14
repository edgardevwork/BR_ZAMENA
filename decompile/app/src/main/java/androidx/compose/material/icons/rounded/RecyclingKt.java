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

/* compiled from: Recycling.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_recycling", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Recycling", "Landroidx/compose/material/icons/Icons$Rounded;", "getRecycling", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nRecycling.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recycling.kt\nandroidx/compose/material/icons/rounded/RecyclingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,109:1\n212#2,12:110\n233#2,18:123\n253#2:160\n174#3:122\n705#4,2:141\n717#4,2:143\n719#4,11:149\n72#5,4:145\n*S KotlinDebug\n*F\n+ 1 Recycling.kt\nandroidx/compose/material/icons/rounded/RecyclingKt\n*L\n29#1:110,12\n30#1:123,18\n30#1:160\n29#1:122\n30#1:141,2\n30#1:143,2\n30#1:149,11\n30#1:145,4\n*E\n"})
/* loaded from: classes2.dex */
public final class RecyclingKt {

    @Nullable
    private static ImageVector _recycling;

    @NotNull
    public static final ImageVector getRecycling(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _recycling;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Recycling", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.2f, 7.41f);
        pathBuilder.curveTo(5.97f, 7.27f, 5.89f, 6.96f, 6.03f, 6.73f);
        pathBuilder.lineTo(7.2f, 4.78f);
        pathBuilder.lineToRelative(1.03f, -1.71f);
        pathBuilder.curveToRelative(0.39f, -0.65f, 1.33f, -0.65f, 1.72f, 0.0f);
        pathBuilder.lineToRelative(1.48f, 2.46f);
        pathBuilder.lineToRelative(-1.23f, 2.06f);
        pathBuilder.lineToRelative(-0.72f, 1.2f);
        pathBuilder.curveTo(9.32f, 9.02f, 9.01f, 9.1f, 8.77f, 8.96f);
        pathBuilder.lineTo(6.2f, 7.41f);
        pathBuilder.close();
        pathBuilder.moveTo(21.72f, 12.97f);
        pathBuilder.lineToRelative(-1.34f, -2.24f);
        pathBuilder.curveToRelative(-0.14f, -0.23f, -0.44f, -0.31f, -0.68f, -0.18f);
        pathBuilder.lineToRelative(-2.6f, 1.5f);
        pathBuilder.curveToRelative(-0.24f, 0.14f, -0.32f, 0.45f, -0.18f, 0.69f);
        pathBuilder.lineTo(18.87f, 16.0f);
        pathBuilder.lineToRelative(1.09f, 0.0f);
        pathBuilder.curveToRelative(0.61f, 0.0f, 1.2f, -0.26f, 1.59f, -0.73f);
        pathBuilder.curveTo(21.85f, 14.9f, 22.0f, 14.45f, 22.0f, 14.0f);
        pathBuilder.curveTo(22.0f, 13.64f, 21.9f, 13.29f, 21.72f, 12.97f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 21.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.curveToRelative(0.76f, 0.0f, 1.45f, -0.43f, 1.79f, -1.11f);
        pathBuilder.lineTo(20.74f, 17.0f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.verticalLineToRelative(-0.79f);
        pathBuilder.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        pathBuilder.lineToRelative(-2.79f, 2.79f);
        pathBuilder.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder.lineToRelative(2.79f, 2.79f);
        pathBuilder.curveToRelative(0.31f, 0.31f, 0.85f, 0.09f, 0.85f, -0.35f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.5f, 17.0f);
        pathBuilder.horizontalLineTo(5.7f);
        pathBuilder.lineToRelative(-0.84f, 1.41f);
        pathBuilder.curveToRelative(-0.3f, 0.5f, -0.32f, 1.12f, -0.06f, 1.65f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(5.08f, 20.63f, 5.67f, 21.0f, 6.32f, 21.0f);
        pathBuilder.horizontalLineTo(9.5f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveTo(10.0f, 17.22f, 9.78f, 17.0f, 9.5f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.12f, 14.35f);
        pathBuilder.lineToRelative(0.7f, 0.42f);
        pathBuilder.curveToRelative(0.38f, 0.23f, 0.85f, -0.12f, 0.74f, -0.55f);
        pathBuilder.lineTo(6.6f, 10.38f);
        pathBuilder.curveTo(6.54f, 10.12f, 6.27f, 9.95f, 6.0f, 10.02f);
        pathBuilder.lineToRelative(-3.83f, 0.96f);
        pathBuilder.curveToRelative(-0.43f, 0.11f, -0.52f, 0.68f, -0.14f, 0.91f);
        pathBuilder.lineToRelative(0.66f, 0.4f);
        pathBuilder.lineToRelative(-0.41f, 0.69f);
        pathBuilder.curveToRelative(-0.35f, 0.59f, -0.38f, 1.31f, -0.07f, 1.92f);
        pathBuilder.lineToRelative(1.63f, 3.26f);
        pathBuilder.lineTo(6.12f, 14.35f);
        pathBuilder.close();
        pathBuilder.moveTo(17.02f, 5.14f);
        pathBuilder.lineToRelative(-1.3f, -2.17f);
        pathBuilder.curveTo(15.35f, 2.37f, 14.7f, 2.0f, 14.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(-3.53f);
        pathBuilder.lineToRelative(3.12f, 5.2f);
        pathBuilder.lineTo(12.9f, 7.61f);
        pathBuilder.curveToRelative(-0.38f, 0.23f, -0.3f, 0.81f, 0.14f, 0.91f);
        pathBuilder.lineToRelative(3.83f, 0.96f);
        pathBuilder.curveToRelative(0.27f, 0.07f, 0.54f, -0.1f, 0.61f, -0.36f);
        pathBuilder.lineToRelative(0.96f, -3.83f);
        pathBuilder.curveToRelative(0.11f, -0.43f, -0.36f, -0.78f, -0.74f, -0.55f);
        pathBuilder.lineTo(17.02f, 5.14f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _recycling = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
