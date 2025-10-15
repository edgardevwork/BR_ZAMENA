package androidx.compose.material.icons.outlined;

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

/* compiled from: LocalFlorist.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_localFlorist", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LocalFlorist", "Landroidx/compose/material/icons/Icons$Outlined;", "getLocalFlorist", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLocalFlorist.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalFlorist.kt\nandroidx/compose/material/icons/outlined/LocalFloristKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,119:1\n212#2,12:120\n233#2,18:133\n253#2:170\n174#3:132\n705#4,2:151\n717#4,2:153\n719#4,11:159\n72#5,4:155\n*S KotlinDebug\n*F\n+ 1 LocalFlorist.kt\nandroidx/compose/material/icons/outlined/LocalFloristKt\n*L\n29#1:120,12\n30#1:133,18\n30#1:170\n29#1:132\n30#1:151,2\n30#1:153,2\n30#1:159,11\n30#1:155,4\n*E\n"})
/* loaded from: classes4.dex */
public final class LocalFloristKt {

    @Nullable
    private static ImageVector _localFlorist;

    @NotNull
    public static final ImageVector getLocalFlorist(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _localFlorist;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.LocalFlorist", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.66f, 13.07f);
        pathBuilder.curveToRelative(0.15f, 0.0f, 0.29f, -0.01f, 0.43f, -0.03f);
        pathBuilder.curveTo(9.56f, 14.19f, 10.69f, 15.0f, 12.0f, 15.0f);
        pathBuilder.reflectiveCurveToRelative(2.44f, -0.81f, 2.91f, -1.96f);
        pathBuilder.curveToRelative(0.14f, 0.02f, 0.29f, 0.03f, 0.43f, 0.03f);
        pathBuilder.curveToRelative(1.73f, 0.0f, 3.14f, -1.41f, 3.14f, -3.14f);
        pathBuilder.curveToRelative(0.0f, -0.71f, -0.25f, -1.39f, -0.67f, -1.93f);
        pathBuilder.curveToRelative(0.43f, -0.54f, 0.67f, -1.22f, 0.67f, -1.93f);
        pathBuilder.curveToRelative(0.0f, -1.73f, -1.41f, -3.14f, -3.14f, -3.14f);
        pathBuilder.curveToRelative(-0.15f, 0.0f, -0.29f, 0.01f, -0.43f, 0.03f);
        pathBuilder.curveTo(14.44f, 1.81f, 13.31f, 1.0f, 12.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-2.44f, 0.81f, -2.91f, 1.96f);
        pathBuilder.curveToRelative(-0.14f, -0.02f, -0.29f, -0.03f, -0.43f, -0.03f);
        pathBuilder.curveToRelative(-1.73f, 0.0f, -3.14f, 1.41f, -3.14f, 3.14f);
        pathBuilder.curveToRelative(0.0f, 0.71f, 0.25f, 1.39f, 0.67f, 1.93f);
        pathBuilder.curveToRelative(-0.43f, 0.54f, -0.68f, 1.22f, -0.68f, 1.93f);
        pathBuilder.curveToRelative(0.0f, 1.73f, 1.41f, 3.14f, 3.15f, 3.14f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 13.0f);
        pathBuilder.curveToRelative(-0.62f, 0.0f, -1.12f, -0.49f, -1.14f, -1.1f);
        pathBuilder.lineToRelative(0.12f, -1.09f);
        pathBuilder.curveToRelative(0.32f, 0.12f, 0.66f, 0.19f, 1.02f, 0.19f);
        pathBuilder.reflectiveCurveToRelative(0.71f, -0.07f, 1.03f, -0.19f);
        pathBuilder.lineToRelative(0.11f, 1.09f);
        pathBuilder.curveToRelative(-0.02f, 0.61f, -0.52f, 1.1f, -1.14f, 1.1f);
        pathBuilder.close();
        pathBuilder.moveTo(15.34f, 11.07f);
        pathBuilder.curveToRelative(-0.24f, 0.0f, -0.46f, -0.07f, -0.64f, -0.2f);
        pathBuilder.lineToRelative(-0.81f, -0.57f);
        pathBuilder.curveToRelative(0.55f, -0.45f, 0.94f, -1.09f, 1.06f, -1.83f);
        pathBuilder.lineToRelative(0.88f, 0.42f);
        pathBuilder.curveToRelative(0.4f, 0.19f, 0.66f, 0.59f, 0.66f, 1.03f);
        pathBuilder.curveToRelative(0.0f, 0.64f, -0.52f, 1.15f, -1.15f, 1.15f);
        pathBuilder.close();
        pathBuilder.moveTo(14.69f, 5.13f);
        pathBuilder.curveToRelative(0.2f, -0.13f, 0.42f, -0.2f, 0.65f, -0.2f);
        pathBuilder.curveToRelative(0.63f, 0.0f, 1.14f, 0.51f, 1.14f, 1.14f);
        pathBuilder.curveToRelative(0.0f, 0.44f, -0.25f, 0.83f, -0.66f, 1.03f);
        pathBuilder.lineToRelative(-0.88f, 0.42f);
        pathBuilder.curveToRelative(-0.12f, -0.74f, -0.51f, -1.38f, -1.07f, -1.83f);
        pathBuilder.lineToRelative(0.82f, -0.56f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 3.0f);
        pathBuilder.curveToRelative(0.62f, 0.0f, 1.12f, 0.49f, 1.14f, 1.1f);
        pathBuilder.lineToRelative(-0.11f, 1.09f);
        pathBuilder.curveTo(12.71f, 5.07f, 12.36f, 5.0f, 12.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(-0.7f, 0.07f, -1.02f, 0.19f);
        pathBuilder.lineToRelative(-0.12f, -1.09f);
        pathBuilder.curveToRelative(0.02f, -0.61f, 0.52f, -1.1f, 1.14f, -1.1f);
        pathBuilder.close();
        pathBuilder.moveTo(8.66f, 4.93f);
        pathBuilder.curveToRelative(0.24f, 0.0f, 0.46f, 0.07f, 0.64f, 0.2f);
        pathBuilder.lineToRelative(0.81f, 0.56f);
        pathBuilder.curveToRelative(-0.55f, 0.45f, -0.94f, 1.09f, -1.06f, 1.83f);
        pathBuilder.lineToRelative(-0.88f, -0.42f);
        pathBuilder.curveToRelative(-0.4f, -0.2f, -0.66f, -0.59f, -0.66f, -1.03f);
        pathBuilder.curveToRelative(0.0f, -0.63f, 0.52f, -1.14f, 1.15f, -1.14f);
        pathBuilder.close();
        pathBuilder.moveTo(8.17f, 8.9f);
        pathBuilder.lineToRelative(0.88f, -0.42f);
        pathBuilder.curveToRelative(0.12f, 0.74f, 0.51f, 1.38f, 1.07f, 1.83f);
        pathBuilder.lineToRelative(-0.81f, 0.55f);
        pathBuilder.curveToRelative(-0.2f, 0.13f, -0.42f, 0.2f, -0.65f, 0.2f);
        pathBuilder.curveToRelative(-0.63f, 0.0f, -1.14f, -0.51f, -1.14f, -1.14f);
        pathBuilder.curveToRelative(-0.01f, -0.43f, 0.25f, -0.82f, 0.65f, -1.02f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 22.0f);
        pathBuilder.curveToRelative(4.97f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
        pathBuilder.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.44f, 19.56f);
        pathBuilder.curveToRelative(0.71f, -1.9f, 2.22f, -3.42f, 4.12f, -4.12f);
        pathBuilder.curveToRelative(-0.71f, 1.9f, -2.22f, 3.41f, -4.12f, 4.12f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, 4.97f, 4.03f, 9.0f, 9.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, -4.97f, -4.03f, -9.0f, -9.0f, -9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.44f, 15.44f);
        pathBuilder.curveToRelative(1.9f, 0.71f, 3.42f, 2.22f, 4.12f, 4.12f);
        pathBuilder.curveToRelative(-1.9f, -0.71f, -3.41f, -2.22f, -4.12f, -4.12f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localFlorist = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
