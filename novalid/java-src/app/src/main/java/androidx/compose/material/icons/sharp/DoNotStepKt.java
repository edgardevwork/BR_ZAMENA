package androidx.compose.material.icons.sharp;

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

/* compiled from: DoNotStep.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_doNotStep", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DoNotStep", "Landroidx/compose/material/icons/Icons$Sharp;", "getDoNotStep", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDoNotStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoNotStep.kt\nandroidx/compose/material/icons/sharp/DoNotStepKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,70:1\n212#2,12:71\n233#2,18:84\n253#2:121\n174#3:83\n705#4,2:102\n717#4,2:104\n719#4,11:110\n72#5,4:106\n*S KotlinDebug\n*F\n+ 1 DoNotStep.kt\nandroidx/compose/material/icons/sharp/DoNotStepKt\n*L\n29#1:71,12\n30#1:84,18\n30#1:121\n29#1:83\n30#1:102,2\n30#1:104,2\n30#1:110,11\n30#1:106,4\n*E\n"})
/* loaded from: classes2.dex */
public final class DoNotStepKt {

    @Nullable
    private static ImageVector _doNotStep;

    @NotNull
    public static final ImageVector getDoNotStep(@NotNull Icons.Sharp sharp) {
        ImageVector imageVector = _doNotStep;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DoNotStep", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(1.39f, 4.22f);
        pathBuilder.lineToRelative(8.24f, 8.24f);
        pathBuilder.lineToRelative(-0.69f, 0.72f);
        pathBuilder.lineTo(6.87f, 11.1f);
        pathBuilder.curveToRelative(-0.11f, 0.4f, -0.26f, 0.78f, -0.45f, 1.12f);
        pathBuilder.lineToRelative(1.75f, 1.75f);
        pathBuilder.lineToRelative(-0.69f, 0.72f);
        pathBuilder.lineToRelative(-1.63f, -1.63f);
        pathBuilder.curveToRelative(-0.24f, 0.29f, -0.5f, 0.56f, -0.77f, 0.8f);
        pathBuilder.lineToRelative(1.63f, 1.63f);
        pathBuilder.lineToRelative(-0.7f, 0.72f);
        pathBuilder.lineToRelative(-1.74f, -1.74f);
        pathBuilder.curveTo(2.83f, 15.43f, 1.34f, 15.82f, 1.0f, 15.92f);
        pathBuilder.lineTo(1.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(9.5f);
        pathBuilder.lineToRelative(3.33f, -3.33f);
        pathBuilder.lineToRelative(5.94f, 5.94f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(2.81f, 2.81f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.close();
        pathBuilder.moveTo(18.51f, 15.68f);
        pathBuilder.lineToRelative(-1.41f, -1.41f);
        pathBuilder.lineToRelative(4.48f, -4.48f);
        pathBuilder.lineTo(23.0f, 11.2f);
        pathBuilder.lineTo(18.51f, 15.68f);
        pathBuilder.close();
        pathBuilder.moveTo(20.88f, 9.08f);
        pathBuilder.lineToRelative(-4.48f, 4.48f);
        pathBuilder.lineTo(9.3f, 6.47f);
        pathBuilder.lineTo(13.8f, 2.0f);
        pathBuilder.lineTo(20.88f, 9.08f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doNotStep = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
