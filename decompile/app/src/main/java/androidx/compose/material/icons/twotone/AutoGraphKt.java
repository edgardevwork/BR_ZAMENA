package androidx.compose.material.icons.twotone;

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

/* compiled from: AutoGraph.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_autoGraph", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AutoGraph", "Landroidx/compose/material/icons/Icons$TwoTone;", "getAutoGraph", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAutoGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoGraph.kt\nandroidx/compose/material/icons/twotone/AutoGraphKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,77:1\n212#2,12:78\n233#2,18:91\n253#2:128\n174#3:90\n705#4,2:109\n717#4,2:111\n719#4,11:117\n72#5,4:113\n*S KotlinDebug\n*F\n+ 1 AutoGraph.kt\nandroidx/compose/material/icons/twotone/AutoGraphKt\n*L\n29#1:78,12\n30#1:91,18\n30#1:128\n29#1:90\n30#1:109,2\n30#1:111,2\n30#1:117,11\n30#1:113,4\n*E\n"})
/* loaded from: classes.dex */
public final class AutoGraphKt {

    @Nullable
    private static ImageVector _autoGraph;

    @NotNull
    public static final ImageVector getAutoGraph(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _autoGraph;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AutoGraph", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.06f, 9.94f);
        pathBuilder.lineTo(12.0f, 9.0f);
        pathBuilder.lineToRelative(2.06f, -0.94f);
        pathBuilder.lineTo(15.0f, 6.0f);
        pathBuilder.lineToRelative(0.94f, 2.06f);
        pathBuilder.lineTo(18.0f, 9.0f);
        pathBuilder.lineToRelative(-2.06f, 0.94f);
        pathBuilder.lineTo(15.0f, 12.0f);
        pathBuilder.lineTo(14.06f, 9.94f);
        pathBuilder.close();
        pathBuilder.moveTo(4.0f, 14.0f);
        pathBuilder.lineToRelative(0.94f, -2.06f);
        pathBuilder.lineTo(7.0f, 11.0f);
        pathBuilder.lineToRelative(-2.06f, -0.94f);
        pathBuilder.lineTo(4.0f, 8.0f);
        pathBuilder.lineToRelative(-0.94f, 2.06f);
        pathBuilder.lineTo(1.0f, 11.0f);
        pathBuilder.lineToRelative(2.06f, 0.94f);
        pathBuilder.lineTo(4.0f, 14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.5f, 9.0f);
        pathBuilder.lineToRelative(1.09f, -2.41f);
        pathBuilder.lineTo(12.0f, 5.5f);
        pathBuilder.lineTo(9.59f, 4.41f);
        pathBuilder.lineTo(8.5f, 2.0f);
        pathBuilder.lineTo(7.41f, 4.41f);
        pathBuilder.lineTo(5.0f, 5.5f);
        pathBuilder.lineToRelative(2.41f, 1.09f);
        pathBuilder.lineTo(8.5f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(4.5f, 20.5f);
        pathBuilder.lineToRelative(6.0f, -6.01f);
        pathBuilder.lineToRelative(4.0f, 4.0f);
        pathBuilder.lineTo(23.0f, 8.93f);
        pathBuilder.lineToRelative(-1.41f, -1.41f);
        pathBuilder.lineToRelative(-7.09f, 7.97f);
        pathBuilder.lineToRelative(-4.0f, -4.0f);
        pathBuilder.lineTo(3.0f, 19.0f);
        pathBuilder.lineTo(4.5f, 20.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoGraph = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
