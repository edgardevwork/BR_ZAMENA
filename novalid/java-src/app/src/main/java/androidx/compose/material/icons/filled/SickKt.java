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

/* compiled from: Sick.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_sick", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Sick", "Landroidx/compose/material/icons/Icons$Filled;", "getSick", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSick.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sick.kt\nandroidx/compose/material/icons/filled/SickKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,84:1\n212#2,12:85\n233#2,18:98\n253#2:135\n174#3:97\n705#4,2:116\n717#4,2:118\n719#4,11:124\n72#5,4:120\n*S KotlinDebug\n*F\n+ 1 Sick.kt\nandroidx/compose/material/icons/filled/SickKt\n*L\n29#1:85,12\n30#1:98,18\n30#1:135\n29#1:97\n30#1:116,2\n30#1:118,2\n30#1:124,11\n30#1:120,4\n*E\n"})
/* loaded from: classes.dex */
public final class SickKt {

    @Nullable
    private static ImageVector _sick;

    @NotNull
    public static final ImageVector getSick(@NotNull Icons.Filled filled) {
        ImageVector imageVector = _sick;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Sick", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 9.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 2.0f, -4.0f, 2.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 2.9f, 2.0f, 4.0f);
        pathBuilder.curveTo(23.0f, 8.1f, 22.1f, 9.0f, 21.0f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.5f, 7.0f);
        pathBuilder.curveToRelative(0.0f, -0.73f, 0.41f, -1.71f, 0.92f, -2.66f);
        pathBuilder.curveTo(16.68f, 2.88f, 14.44f, 2.0f, 11.99f, 2.0f);
        pathBuilder.curveTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 5.52f, 4.47f, 10.0f, 9.99f, 10.0f);
        pathBuilder.curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.06f, -1.09f, -0.14f, -1.62f);
        pathBuilder.curveTo(21.58f, 10.45f, 21.3f, 10.5f, 21.0f, 10.5f);
        pathBuilder.curveTo(19.07f, 10.5f, 17.5f, 8.93f, 17.5f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.62f, 7.38f);
        pathBuilder.lineToRelative(1.06f, 1.06f);
        pathBuilder.lineTo(15.62f, 9.5f);
        pathBuilder.lineToRelative(1.06f, 1.06f);
        pathBuilder.lineToRelative(-1.06f, 1.06f);
        pathBuilder.lineTo(13.5f, 9.5f);
        pathBuilder.lineTo(15.62f, 7.38f);
        pathBuilder.close();
        pathBuilder.moveTo(7.32f, 8.44f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.lineTo(10.5f, 9.5f);
        pathBuilder.lineToRelative(-2.12f, 2.12f);
        pathBuilder.lineToRelative(-1.06f, -1.06f);
        pathBuilder.lineTo(8.38f, 9.5f);
        pathBuilder.lineTo(7.32f, 8.44f);
        pathBuilder.close();
        pathBuilder.moveTo(15.44f, 17.0f);
        pathBuilder.curveToRelative(-0.69f, -1.19f, -1.97f, -2.0f, -3.44f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.75f, 0.81f, -3.44f, 2.0f);
        pathBuilder.horizontalLineTo(6.88f);
        pathBuilder.curveToRelative(0.3f, -0.76f, 0.76f, -1.43f, 1.34f, -1.99f);
        pathBuilder.lineTo(5.24f, 13.3f);
        pathBuilder.curveToRelative(-0.45f, 0.26f, -1.01f, 0.28f, -1.49f, 0.0f);
        pathBuilder.curveToRelative(-0.72f, -0.41f, -0.96f, -1.33f, -0.55f, -2.05f);
        pathBuilder.curveToRelative(0.41f, -0.72f, 1.33f, -0.96f, 2.05f, -0.55f);
        pathBuilder.curveToRelative(0.48f, 0.28f, 0.74f, 0.78f, 0.74f, 1.29f);
        pathBuilder.lineToRelative(3.58f, 2.07f);
        pathBuilder.curveToRelative(0.73f, -0.36f, 1.55f, -0.56f, 2.43f, -0.56f);
        pathBuilder.curveToRelative(2.33f, 0.0f, 4.32f, 1.45f, 5.12f, 3.5f);
        pathBuilder.horizontalLineTo(15.44f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sick = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
