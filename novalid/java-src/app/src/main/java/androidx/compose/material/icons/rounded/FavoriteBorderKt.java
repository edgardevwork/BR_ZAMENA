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

/* compiled from: FavoriteBorder.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_favoriteBorder", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FavoriteBorder", "Landroidx/compose/material/icons/Icons$Rounded;", "getFavoriteBorder", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFavoriteBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavoriteBorder.kt\nandroidx/compose/material/icons/rounded/FavoriteBorderKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,59:1\n212#2,12:60\n233#2,18:73\n253#2:110\n174#3:72\n705#4,2:91\n717#4,2:93\n719#4,11:99\n72#5,4:95\n*S KotlinDebug\n*F\n+ 1 FavoriteBorder.kt\nandroidx/compose/material/icons/rounded/FavoriteBorderKt\n*L\n29#1:60,12\n30#1:73,18\n30#1:110\n29#1:72\n30#1:91,2\n30#1:93,2\n30#1:99,11\n30#1:95,4\n*E\n"})
/* loaded from: classes2.dex */
public final class FavoriteBorderKt {

    @Nullable
    private static ImageVector _favoriteBorder;

    @NotNull
    public static final ImageVector getFavoriteBorder(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _favoriteBorder;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FavoriteBorder", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.66f, 3.99f);
        pathBuilder.curveToRelative(-2.64f, -1.8f, -5.9f, -0.96f, -7.66f, 1.1f);
        pathBuilder.curveToRelative(-1.76f, -2.06f, -5.02f, -2.91f, -7.66f, -1.1f);
        pathBuilder.curveToRelative(-1.4f, 0.96f, -2.28f, 2.58f, -2.34f, 4.29f);
        pathBuilder.curveToRelative(-0.14f, 3.88f, 3.3f, 6.99f, 8.55f, 11.76f);
        pathBuilder.lineToRelative(0.1f, 0.09f);
        pathBuilder.curveToRelative(0.76f, 0.69f, 1.93f, 0.69f, 2.69f, -0.01f);
        pathBuilder.lineToRelative(0.11f, -0.1f);
        pathBuilder.curveToRelative(5.25f, -4.76f, 8.68f, -7.87f, 8.55f, -11.75f);
        pathBuilder.curveToRelative(-0.06f, -1.7f, -0.94f, -3.32f, -2.34f, -4.28f);
        pathBuilder.close();
        pathBuilder.moveTo(12.1f, 18.55f);
        pathBuilder.lineToRelative(-0.1f, 0.1f);
        pathBuilder.lineToRelative(-0.1f, -0.1f);
        pathBuilder.curveTo(7.14f, 14.24f, 4.0f, 11.39f, 4.0f, 8.5f);
        pathBuilder.curveTo(4.0f, 6.5f, 5.5f, 5.0f, 7.5f, 5.0f);
        pathBuilder.curveToRelative(1.54f, 0.0f, 3.04f, 0.99f, 3.57f, 2.36f);
        pathBuilder.horizontalLineToRelative(1.87f);
        pathBuilder.curveTo(13.46f, 5.99f, 14.96f, 5.0f, 16.5f, 5.0f);
        pathBuilder.curveToRelative(2.0f, 0.0f, 3.5f, 1.5f, 3.5f, 3.5f);
        pathBuilder.curveToRelative(0.0f, 2.89f, -3.14f, 5.74f, -7.9f, 10.05f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _favoriteBorder = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
