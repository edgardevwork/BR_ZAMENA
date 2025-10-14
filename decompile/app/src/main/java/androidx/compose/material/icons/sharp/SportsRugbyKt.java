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

/* compiled from: SportsRugby.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_sportsRugby", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SportsRugby", "Landroidx/compose/material/icons/Icons$Sharp;", "getSportsRugby", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSportsRugby.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportsRugby.kt\nandroidx/compose/material/icons/sharp/SportsRugbyKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,57:1\n212#2,12:58\n233#2,18:71\n253#2:108\n174#3:70\n705#4,2:89\n717#4,2:91\n719#4,11:97\n72#5,4:93\n*S KotlinDebug\n*F\n+ 1 SportsRugby.kt\nandroidx/compose/material/icons/sharp/SportsRugbyKt\n*L\n29#1:58,12\n30#1:71,18\n30#1:108\n29#1:70\n30#1:89,2\n30#1:91,2\n30#1:97,11\n30#1:93,4\n*E\n"})
/* loaded from: classes3.dex */
public final class SportsRugbyKt {

    @Nullable
    private static ImageVector _sportsRugby;

    @NotNull
    public static final ImageVector getSportsRugby(@NotNull Icons.Sharp sharp) {
        ImageVector imageVector = _sportsRugby;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SportsRugby", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.49f, 3.51f);
        pathBuilder.curveToRelative(-0.56f, -0.56f, -2.15f, -0.97f, -4.16f, -0.97f);
        pathBuilder.curveToRelative(-3.08f, 0.0f, -7.15f, 0.96f, -9.98f, 3.79f);
        pathBuilder.curveTo(1.66f, 11.03f, 2.1f, 19.07f, 3.51f, 20.49f);
        pathBuilder.curveToRelative(0.56f, 0.56f, 2.15f, 0.97f, 4.16f, 0.97f);
        pathBuilder.curveToRelative(3.08f, 0.0f, 7.15f, -0.96f, 9.98f, -3.79f);
        pathBuilder.curveTo(22.34f, 12.97f, 21.9f, 4.93f, 20.49f, 3.51f);
        pathBuilder.close();
        pathBuilder.moveTo(7.76f, 7.76f);
        pathBuilder.curveToRelative(2.64f, -2.64f, 6.35f, -3.12f, 8.03f, -3.19f);
        pathBuilder.curveToRelative(-2.05f, 0.94f, -4.46f, 2.45f, -6.61f, 4.61f);
        pathBuilder.curveToRelative(-2.16f, 2.16f, -3.67f, 4.58f, -4.61f, 6.63f);
        pathBuilder.curveTo(4.66f, 13.33f, 5.44f, 10.07f, 7.76f, 7.76f);
        pathBuilder.close();
        pathBuilder.moveTo(16.24f, 16.24f);
        pathBuilder.curveToRelative(-2.64f, 2.64f, -6.35f, 3.12f, -8.03f, 3.19f);
        pathBuilder.curveToRelative(2.05f, -0.94f, 4.46f, -2.45f, 6.61f, -4.61f);
        pathBuilder.curveToRelative(2.16f, -2.16f, 3.67f, -4.58f, 4.62f, -6.63f);
        pathBuilder.curveTo(19.34f, 10.67f, 18.56f, 13.93f, 16.24f, 16.24f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsRugby = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
