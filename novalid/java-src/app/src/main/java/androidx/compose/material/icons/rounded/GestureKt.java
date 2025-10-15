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

/* compiled from: Gesture.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_gesture", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Gesture", "Landroidx/compose/material/icons/Icons$Rounded;", "getGesture", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nGesture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Gesture.kt\nandroidx/compose/material/icons/rounded/GestureKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,70:1\n212#2,12:71\n233#2,18:84\n253#2:121\n174#3:83\n705#4,2:102\n717#4,2:104\n719#4,11:110\n72#5,4:106\n*S KotlinDebug\n*F\n+ 1 Gesture.kt\nandroidx/compose/material/icons/rounded/GestureKt\n*L\n29#1:71,12\n30#1:84,18\n30#1:121\n29#1:83\n30#1:102,2\n30#1:104,2\n30#1:110,11\n30#1:106,4\n*E\n"})
/* loaded from: classes4.dex */
public final class GestureKt {

    @Nullable
    private static ImageVector _gesture;

    @NotNull
    public static final ImageVector getGesture(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _gesture;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Gesture", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.72f, 6.04f);
        pathBuilder.curveToRelative(0.47f, 0.46f, 1.21f, 0.48f, 1.71f, 0.06f);
        pathBuilder.curveToRelative(0.37f, -0.32f, 0.69f, -0.51f, 0.87f, -0.43f);
        pathBuilder.curveToRelative(0.5f, 0.2f, 0.0f, 1.03f, -0.3f, 1.52f);
        pathBuilder.curveToRelative(-0.25f, 0.42f, -2.86f, 3.89f, -2.86f, 6.31f);
        pathBuilder.curveToRelative(0.0f, 1.28f, 0.48f, 2.34f, 1.34f, 2.98f);
        pathBuilder.curveToRelative(0.75f, 0.56f, 1.74f, 0.73f, 2.64f, 0.46f);
        pathBuilder.curveToRelative(1.07f, -0.31f, 1.95f, -1.4f, 3.06f, -2.77f);
        pathBuilder.curveToRelative(1.21f, -1.49f, 2.83f, -3.44f, 4.08f, -3.44f);
        pathBuilder.curveToRelative(1.63f, 0.0f, 1.65f, 1.01f, 1.76f, 1.79f);
        pathBuilder.curveToRelative(-3.78f, 0.64f, -5.38f, 3.67f, -5.38f, 5.37f);
        pathBuilder.curveToRelative(0.0f, 1.7f, 1.44f, 3.09f, 3.21f, 3.09f);
        pathBuilder.curveToRelative(1.63f, 0.0f, 4.29f, -1.33f, 4.69f, -6.1f);
        pathBuilder.horizontalLineToRelative(1.21f);
        pathBuilder.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        pathBuilder.reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f);
        pathBuilder.horizontalLineToRelative(-1.22f);
        pathBuilder.curveToRelative(-0.15f, -1.65f, -1.09f, -4.2f, -4.03f, -4.2f);
        pathBuilder.curveToRelative(-2.25f, 0.0f, -4.18f, 1.91f, -4.94f, 2.84f);
        pathBuilder.curveToRelative(-0.58f, 0.73f, -2.06f, 2.48f, -2.29f, 2.72f);
        pathBuilder.curveToRelative(-0.25f, 0.3f, -0.68f, 0.84f, -1.11f, 0.84f);
        pathBuilder.curveToRelative(-0.45f, 0.0f, -0.72f, -0.83f, -0.36f, -1.92f);
        pathBuilder.curveToRelative(0.35f, -1.09f, 1.4f, -2.86f, 1.85f, -3.52f);
        pathBuilder.curveToRelative(0.78f, -1.14f, 1.3f, -1.92f, 1.3f, -3.28f);
        pathBuilder.curveTo(8.95f, 3.69f, 7.31f, 3.0f, 6.44f, 3.0f);
        pathBuilder.curveToRelative(-1.09f, 0.0f, -2.04f, 0.63f, -2.7f, 1.22f);
        pathBuilder.curveToRelative(-0.53f, 0.48f, -0.53f, 1.32f, -0.02f, 1.82f);
        pathBuilder.close();
        pathBuilder.moveTo(13.88f, 18.55f);
        pathBuilder.curveToRelative(-0.31f, 0.0f, -0.74f, -0.26f, -0.74f, -0.72f);
        pathBuilder.curveToRelative(0.0f, -0.6f, 0.73f, -2.2f, 2.87f, -2.76f);
        pathBuilder.curveToRelative(-0.3f, 2.69f, -1.43f, 3.48f, -2.13f, 3.48f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gesture = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
