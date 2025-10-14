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

/* compiled from: AlarmOff.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_alarmOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AlarmOff", "Landroidx/compose/material/icons/Icons$Rounded;", "getAlarmOff", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAlarmOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlarmOff.kt\nandroidx/compose/material/icons/rounded/AlarmOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,89:1\n212#2,12:90\n233#2,18:103\n253#2:140\n174#3:102\n705#4,2:121\n717#4,2:123\n719#4,11:129\n72#5,4:125\n*S KotlinDebug\n*F\n+ 1 AlarmOff.kt\nandroidx/compose/material/icons/rounded/AlarmOffKt\n*L\n29#1:90,12\n30#1:103,18\n30#1:140\n29#1:102\n30#1:121,2\n30#1:123,2\n30#1:129,11\n30#1:125,4\n*E\n"})
/* loaded from: classes4.dex */
public final class AlarmOffKt {

    @Nullable
    private static ImageVector _alarmOff;

    @NotNull
    public static final ImageVector getAlarmOff(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _alarmOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AlarmOff", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.04f, 6.29f);
        pathBuilder.curveTo(10.66f, 6.11f, 11.32f, 6.0f, 12.0f, 6.0f);
        pathBuilder.curveToRelative(3.86f, 0.0f, 7.0f, 3.14f, 7.0f, 7.0f);
        pathBuilder.curveToRelative(0.0f, 0.68f, -0.11f, 1.34f, -0.29f, 1.96f);
        pathBuilder.lineToRelative(1.56f, 1.56f);
        pathBuilder.curveToRelative(0.47f, -1.08f, 0.73f, -2.27f, 0.73f, -3.52f);
        pathBuilder.curveToRelative(0.0f, -4.97f, -4.03f, -9.0f, -9.0f, -9.0f);
        pathBuilder.curveToRelative(-1.25f, 0.0f, -2.44f, 0.26f, -3.53f, 0.72f);
        pathBuilder.lineToRelative(1.57f, 1.57f);
        pathBuilder.close();
        pathBuilder.moveTo(3.71f, 2.79f);
        pathBuilder.curveToRelative(-0.38f, -0.38f, -1.0f, -0.38f, -1.39f, 0.0f);
        pathBuilder.lineToRelative(-0.02f, 0.03f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.01f, 0.0f, 1.39f);
        pathBuilder.lineToRelative(0.68f, 0.68f);
        pathBuilder.lineToRelative(-0.17f, 0.14f);
        pathBuilder.curveToRelative(-0.42f, 0.34f, -0.47f, 0.96f, -0.13f, 1.38f);
        pathBuilder.lineToRelative(0.03f, 0.03f);
        pathBuilder.curveToRelative(0.35f, 0.42f, 0.96f, 0.47f, 1.38f, 0.12f);
        pathBuilder.lineToRelative(0.31f, -0.25f);
        pathBuilder.lineToRelative(0.8f, 0.8f);
        pathBuilder.curveTo(3.83f, 8.69f, 3.0f, 10.75f, 3.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, 4.97f, 4.03f, 9.0f, 9.0f, 9.0f);
        pathBuilder.curveToRelative(2.25f, 0.0f, 4.31f, -0.83f, 5.89f, -2.2f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.curveToRelative(0.38f, 0.38f, 1.0f, 0.38f, 1.39f, 0.0f);
        pathBuilder.lineToRelative(0.03f, -0.03f);
        pathBuilder.curveToRelative(0.38f, -0.38f, 0.38f, -1.0f, 0.0f, -1.39f);
        pathBuilder.lineToRelative(-17.01f, -17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f);
        pathBuilder.curveToRelative(0.0f, -1.7f, 0.61f, -3.26f, 1.62f, -4.47f);
        pathBuilder.lineToRelative(9.85f, 9.85f);
        pathBuilder.curveTo(15.26f, 19.39f, 13.7f, 20.0f, 12.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.91f, 6.56f);
        pathBuilder.curveToRelative(0.42f, 0.35f, 1.03f, 0.29f, 1.38f, -0.12f);
        pathBuilder.lineToRelative(0.03f, -0.03f);
        pathBuilder.curveToRelative(0.35f, -0.42f, 0.29f, -1.03f, -0.12f, -1.38f);
        pathBuilder.lineToRelative(-3.1f, -2.59f);
        pathBuilder.curveToRelative(-0.42f, -0.35f, -1.03f, -0.29f, -1.38f, 0.12f);
        pathBuilder.lineToRelative(-0.03f, 0.03f);
        pathBuilder.curveToRelative(-0.35f, 0.42f, -0.29f, 1.03f, 0.12f, 1.38f);
        pathBuilder.lineToRelative(3.1f, 2.59f);
        pathBuilder.close();
        pathBuilder.moveTo(7.43f, 3.68f);
        pathBuilder.curveToRelative(0.18f, -0.34f, 0.15f, -0.77f, -0.11f, -1.09f);
        pathBuilder.lineToRelative(-0.03f, -0.03f);
        pathBuilder.curveToRelative(-0.3f, -0.36f, -0.8f, -0.43f, -1.2f, -0.22f);
        pathBuilder.lineToRelative(1.34f, 1.34f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _alarmOff = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
