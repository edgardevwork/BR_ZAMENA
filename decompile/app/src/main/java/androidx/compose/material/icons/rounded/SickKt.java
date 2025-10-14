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

/* compiled from: Sick.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_sick", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Sick", "Landroidx/compose/material/icons/Icons$Rounded;", "getSick", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSick.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sick.kt\nandroidx/compose/material/icons/rounded/SickKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,94:1\n212#2,12:95\n233#2,18:108\n253#2:145\n174#3:107\n705#4,2:126\n717#4,2:128\n719#4,11:134\n72#5,4:130\n*S KotlinDebug\n*F\n+ 1 Sick.kt\nandroidx/compose/material/icons/rounded/SickKt\n*L\n29#1:95,12\n30#1:108,18\n30#1:145\n29#1:107\n30#1:126,2\n30#1:128,2\n30#1:134,11\n30#1:130,4\n*E\n"})
/* loaded from: classes.dex */
public final class SickKt {

    @Nullable
    private static ImageVector _sick;

    @NotNull
    public static final ImageVector getSick(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _sick;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Sick", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(23.0f, 7.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.curveToRelative(0.0f, -0.78f, 0.99f, -2.44f, 1.58f, -3.36f);
        pathBuilder.curveToRelative(0.2f, -0.31f, 0.64f, -0.31f, 0.84f, 0.0f);
        pathBuilder.curveTo(22.01f, 4.56f, 23.0f, 6.22f, 23.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.86f, 10.38f);
        pathBuilder.curveTo(21.94f, 10.91f, 22.0f, 11.45f, 22.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 5.52f, -4.48f, 10.0f, -10.01f, 10.0f);
        pathBuilder.curveTo(6.47f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f);
        pathBuilder.curveTo(2.0f, 6.48f, 6.47f, 2.0f, 11.99f, 2.0f);
        pathBuilder.curveToRelative(2.45f, 0.0f, 4.69f, 0.88f, 6.43f, 2.34f);
        pathBuilder.curveTo(17.91f, 5.29f, 17.5f, 6.27f, 17.5f, 7.0f);
        pathBuilder.curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f);
        pathBuilder.curveTo(21.3f, 10.5f, 21.58f, 10.45f, 21.86f, 10.38f);
        pathBuilder.close();
        pathBuilder.moveTo(14.03f, 10.03f);
        pathBuilder.lineToRelative(1.06f, 1.06f);
        pathBuilder.curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0.0f);
        pathBuilder.curveToRelative(0.29f, -0.29f, 0.29f, -0.77f, 0.0f, -1.06f);
        pathBuilder.lineTo(15.62f, 9.5f);
        pathBuilder.lineToRelative(0.53f, -0.53f);
        pathBuilder.curveToRelative(0.29f, -0.29f, 0.29f, -0.77f, 0.0f, -1.06f);
        pathBuilder.reflectiveCurveToRelative(-0.77f, -0.29f, -1.06f, 0.0f);
        pathBuilder.lineToRelative(-1.06f, 1.06f);
        pathBuilder.curveTo(13.74f, 9.26f, 13.74f, 9.74f, 14.03f, 10.03f);
        pathBuilder.close();
        pathBuilder.moveTo(8.38f, 9.5f);
        pathBuilder.lineToRelative(-0.53f, 0.53f);
        pathBuilder.curveToRelative(-0.29f, 0.29f, -0.29f, 0.77f, 0.0f, 1.06f);
        pathBuilder.curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0.0f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.curveToRelative(0.29f, -0.29f, 0.29f, -0.77f, 0.0f, -1.06f);
        pathBuilder.lineTo(8.91f, 7.91f);
        pathBuilder.curveToRelative(-0.29f, -0.29f, -0.77f, -0.29f, -1.06f, 0.0f);
        pathBuilder.reflectiveCurveToRelative(-0.29f, 0.77f, 0.0f, 1.06f);
        pathBuilder.lineTo(8.38f, 9.5f);
        pathBuilder.close();
        pathBuilder.moveTo(16.47f, 15.8f);
        pathBuilder.curveToRelative(-1.0f, -1.39f, -2.62f, -2.3f, -4.47f, -2.3f);
        pathBuilder.curveToRelative(-0.87f, 0.0f, -1.69f, 0.2f, -2.43f, 0.56f);
        pathBuilder.lineTo(5.99f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -0.52f, -0.26f, -1.02f, -0.74f, -1.29f);
        pathBuilder.curveToRelative(-0.8f, -0.46f, -1.84f, -0.11f, -2.17f, 0.8f);
        pathBuilder.curveToRelative(-0.21f, 0.57f, -0.03f, 1.25f, 0.44f, 1.64f);
        pathBuilder.curveToRelative(0.52f, 0.44f, 1.2f, 0.45f, 1.72f, 0.16f);
        pathBuilder.lineToRelative(2.97f, 1.72f);
        pathBuilder.curveToRelative(-0.25f, 0.24f, -0.48f, 0.5f, -0.68f, 0.78f);
        pathBuilder.curveTo(7.17f, 16.3f, 7.53f, 17.0f, 8.15f, 17.0f);
        pathBuilder.curveToRelative(0.23f, 0.0f, 0.46f, -0.1f, 0.6f, -0.3f);
        pathBuilder.curveTo(9.47f, 15.68f, 10.65f, 15.0f, 12.0f, 15.0f);
        pathBuilder.reflectiveCurveToRelative(2.53f, 0.68f, 3.25f, 1.7f);
        pathBuilder.curveToRelative(0.14f, 0.19f, 0.36f, 0.3f, 0.6f, 0.3f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(16.47f, 17.0f, 16.83f, 16.3f, 16.47f, 15.8f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sick = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
