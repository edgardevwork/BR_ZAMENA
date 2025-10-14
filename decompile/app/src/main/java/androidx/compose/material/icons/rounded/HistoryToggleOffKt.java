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

/* compiled from: HistoryToggleOff.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_historyToggleOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HistoryToggleOff", "Landroidx/compose/material/icons/Icons$Rounded;", "getHistoryToggleOff", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHistoryToggleOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryToggleOff.kt\nandroidx/compose/material/icons/rounded/HistoryToggleOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,122:1\n212#2,12:123\n233#2,18:136\n253#2:173\n174#3:135\n705#4,2:154\n717#4,2:156\n719#4,11:162\n72#5,4:158\n*S KotlinDebug\n*F\n+ 1 HistoryToggleOff.kt\nandroidx/compose/material/icons/rounded/HistoryToggleOffKt\n*L\n29#1:123,12\n30#1:136,18\n30#1:173\n29#1:135\n30#1:154,2\n30#1:156,2\n30#1:162,11\n30#1:158,4\n*E\n"})
/* loaded from: classes.dex */
public final class HistoryToggleOffKt {

    @Nullable
    private static ImageVector _historyToggleOff;

    @NotNull
    public static final ImageVector getHistoryToggleOff(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _historyToggleOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HistoryToggleOff", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.1f, 19.37f);
        pathBuilder.lineToRelative(1.0f, 1.74f);
        pathBuilder.curveToRelative(-0.96f, 0.44f, -2.01f, 0.73f, -3.1f, 0.84f);
        pathBuilder.verticalLineToRelative(-2.02f);
        pathBuilder.curveTo(13.74f, 19.84f, 14.44f, 19.65f, 15.1f, 19.37f);
        pathBuilder.close();
        pathBuilder.moveTo(4.07f, 13.0f);
        pathBuilder.horizontalLineTo(2.05f);
        pathBuilder.curveToRelative(0.11f, 1.1f, 0.4f, 2.14f, 0.84f, 3.1f);
        pathBuilder.lineToRelative(1.74f, -1.0f);
        pathBuilder.curveTo(4.35f, 14.44f, 4.16f, 13.74f, 4.07f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.1f, 4.63f);
        pathBuilder.lineToRelative(1.0f, -1.74f);
        pathBuilder.curveTo(15.14f, 2.45f, 14.1f, 2.16f, 13.0f, 2.05f);
        pathBuilder.verticalLineToRelative(2.02f);
        pathBuilder.curveTo(13.74f, 4.16f, 14.44f, 4.35f, 15.1f, 4.63f);
        pathBuilder.close();
        pathBuilder.moveTo(19.93f, 11.0f);
        pathBuilder.horizontalLineToRelative(2.02f);
        pathBuilder.curveToRelative(-0.11f, -1.1f, -0.4f, -2.14f, -0.84f, -3.1f);
        pathBuilder.lineToRelative(-1.74f, 1.0f);
        pathBuilder.curveTo(19.65f, 9.56f, 19.84f, 10.26f, 19.93f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.9f, 19.37f);
        pathBuilder.lineToRelative(-1.0f, 1.74f);
        pathBuilder.curveToRelative(0.96f, 0.44f, 2.01f, 0.73f, 3.1f, 0.84f);
        pathBuilder.verticalLineToRelative(-2.02f);
        pathBuilder.curveTo(10.26f, 19.84f, 9.56f, 19.65f, 8.9f, 19.37f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 4.07f);
        pathBuilder.verticalLineTo(2.05f);
        pathBuilder.curveToRelative(-1.1f, 0.11f, -2.14f, 0.4f, -3.1f, 0.84f);
        pathBuilder.lineToRelative(1.0f, 1.74f);
        pathBuilder.curveTo(9.56f, 4.35f, 10.26f, 4.16f, 11.0f, 4.07f);
        pathBuilder.close();
        pathBuilder.moveTo(18.36f, 7.17f);
        pathBuilder.lineToRelative(1.74f, -1.01f);
        pathBuilder.curveToRelative(-0.63f, -0.87f, -1.4f, -1.64f, -2.27f, -2.27f);
        pathBuilder.lineToRelative(-1.01f, 1.74f);
        pathBuilder.curveTo(17.41f, 6.08f, 17.92f, 6.59f, 18.36f, 7.17f);
        pathBuilder.close();
        pathBuilder.moveTo(4.63f, 8.9f);
        pathBuilder.lineToRelative(-1.74f, -1.0f);
        pathBuilder.curveTo(2.45f, 8.86f, 2.16f, 9.9f, 2.05f, 11.0f);
        pathBuilder.horizontalLineToRelative(2.02f);
        pathBuilder.curveTo(4.16f, 10.26f, 4.35f, 9.56f, 4.63f, 8.9f);
        pathBuilder.close();
        pathBuilder.moveTo(19.93f, 13.0f);
        pathBuilder.curveToRelative(-0.09f, 0.74f, -0.28f, 1.44f, -0.56f, 2.1f);
        pathBuilder.lineToRelative(1.74f, 1.0f);
        pathBuilder.curveToRelative(0.44f, -0.96f, 0.73f, -2.01f, 0.84f, -3.1f);
        pathBuilder.horizontalLineTo(19.93f);
        pathBuilder.close();
        pathBuilder.moveTo(16.83f, 18.36f);
        pathBuilder.lineToRelative(1.01f, 1.74f);
        pathBuilder.curveToRelative(0.87f, -0.63f, 1.64f, -1.4f, 2.27f, -2.27f);
        pathBuilder.lineToRelative(-1.74f, -1.01f);
        pathBuilder.curveTo(17.92f, 17.41f, 17.41f, 17.92f, 16.83f, 18.36f);
        pathBuilder.close();
        pathBuilder.moveTo(7.17f, 5.64f);
        pathBuilder.lineTo(6.17f, 3.89f);
        pathBuilder.curveTo(5.29f, 4.53f, 4.53f, 5.29f, 3.9f, 6.17f);
        pathBuilder.lineToRelative(1.74f, 1.01f);
        pathBuilder.curveTo(6.08f, 6.59f, 6.59f, 6.08f, 7.17f, 5.64f);
        pathBuilder.close();
        pathBuilder.moveTo(5.64f, 16.83f);
        pathBuilder.lineTo(3.9f, 17.83f);
        pathBuilder.curveToRelative(0.63f, 0.87f, 1.4f, 1.64f, 2.27f, 2.27f);
        pathBuilder.lineToRelative(1.01f, -1.74f);
        pathBuilder.curveTo(6.59f, 17.92f, 6.08f, 17.41f, 5.64f, 16.83f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 7.0f);
        pathBuilder.lineTo(12.0f, 7.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(3.59f);
        pathBuilder.curveToRelative(0.0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.41f);
        pathBuilder.lineToRelative(3.0f, 3.0f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineToRelative(-3.0f, -3.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.curveTo(13.0f, 7.45f, 12.55f, 7.0f, 12.0f, 7.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _historyToggleOff = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
