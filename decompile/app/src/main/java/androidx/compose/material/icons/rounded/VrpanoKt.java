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

/* compiled from: Vrpano.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_vrpano", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Vrpano", "Landroidx/compose/material/icons/Icons$Rounded;", "getVrpano", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nVrpano.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vrpano.kt\nandroidx/compose/material/icons/rounded/VrpanoKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,61:1\n212#2,12:62\n233#2,18:75\n253#2:112\n174#3:74\n705#4,2:93\n717#4,2:95\n719#4,11:101\n72#5,4:97\n*S KotlinDebug\n*F\n+ 1 Vrpano.kt\nandroidx/compose/material/icons/rounded/VrpanoKt\n*L\n29#1:62,12\n30#1:75,18\n30#1:112\n29#1:74\n30#1:93,2\n30#1:95,2\n30#1:101,11\n30#1:97,4\n*E\n"})
/* loaded from: classes4.dex */
public final class VrpanoKt {

    @Nullable
    private static ImageVector _vrpano;

    @NotNull
    public static final ImageVector getVrpano(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _vrpano;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Vrpano", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.69f, 4.05f);
        pathBuilder.curveTo(18.66f, 4.73f, 15.86f, 5.5f, 12.0f, 5.5f);
        pathBuilder.curveToRelative(-3.89f, 0.0f, -6.95f, -0.84f, -8.69f, -1.43f);
        pathBuilder.curveTo(2.67f, 3.85f, 2.0f, 4.33f, 2.0f, 5.02f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.curveToRelative(0.0f, 0.68f, 0.66f, 1.17f, 1.31f, 0.95f);
        pathBuilder.curveTo(5.36f, 19.26f, 8.1f, 18.5f, 12.0f, 18.5f);
        pathBuilder.curveToRelative(3.87f, 0.0f, 6.66f, 0.76f, 8.69f, 1.45f);
        pathBuilder.curveTo(21.34f, 20.16f, 22.0f, 19.68f, 22.0f, 19.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.curveTo(22.0f, 4.32f, 21.34f, 3.84f, 20.69f, 4.05f);
        pathBuilder.close();
        pathBuilder.moveTo(17.28f, 15.26f);
        pathBuilder.curveTo(15.62f, 15.1f, 13.84f, 15.0f, 12.0f, 15.0f);
        pathBuilder.curveToRelative(-1.87f, 0.0f, -3.63f, 0.1f, -5.28f, 0.27f);
        pathBuilder.curveTo(6.27f, 15.31f, 6.0f, 14.79f, 6.29f, 14.45f);
        pathBuilder.lineToRelative(2.5f, -3.0f);
        pathBuilder.curveToRelative(0.2f, -0.24f, 0.57f, -0.24f, 0.77f, 0.0f);
        pathBuilder.lineToRelative(1.62f, 1.94f);
        pathBuilder.lineToRelative(2.44f, -2.93f);
        pathBuilder.curveToRelative(0.2f, -0.24f, 0.57f, -0.24f, 0.77f, 0.0f);
        pathBuilder.lineToRelative(3.32f, 3.99f);
        pathBuilder.curveTo(17.99f, 14.79f, 17.72f, 15.31f, 17.28f, 15.26f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _vrpano = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
