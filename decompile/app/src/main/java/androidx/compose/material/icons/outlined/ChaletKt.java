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

/* compiled from: Chalet.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_chalet", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Chalet", "Landroidx/compose/material/icons/Icons$Outlined;", "getChalet", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nChalet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chalet.kt\nandroidx/compose/material/icons/outlined/ChaletKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,105:1\n212#2,12:106\n233#2,18:119\n253#2:156\n174#3:118\n705#4,2:137\n717#4,2:139\n719#4,11:145\n72#5,4:141\n*S KotlinDebug\n*F\n+ 1 Chalet.kt\nandroidx/compose/material/icons/outlined/ChaletKt\n*L\n29#1:106,12\n30#1:119,18\n30#1:156\n29#1:118\n30#1:137,2\n30#1:139,2\n30#1:145,11\n30#1:141,4\n*E\n"})
/* loaded from: classes2.dex */
public final class ChaletKt {

    @Nullable
    private static ImageVector _chalet;

    @NotNull
    public static final ImageVector getChalet(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _chalet;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Chalet", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.5f, 15.0f);
        pathBuilder.lineTo(10.0f, 7.5f);
        pathBuilder.lineTo(2.5f, 15.0f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineTo(5.0f, 15.33f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(-4.67f);
        pathBuilder.lineToRelative(1.09f, 1.09f);
        pathBuilder.lineTo(17.5f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(-4.67f);
        pathBuilder.lineToRelative(3.0f, -3.0f);
        pathBuilder.lineToRelative(3.0f, 3.0f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 7.5f);
        pathBuilder.horizontalLineToRelative(-1.19f);
        pathBuilder.lineToRelative(0.75f, 0.75f);
        pathBuilder.lineToRelative(-0.71f, 0.71f);
        pathBuilder.lineTo(19.39f, 7.5f);
        pathBuilder.horizontalLineTo(18.5f);
        pathBuilder.verticalLineToRelative(0.89f);
        pathBuilder.lineToRelative(1.45f, 1.45f);
        pathBuilder.lineToRelative(-0.71f, 0.71f);
        pathBuilder.lineTo(18.5f, 9.81f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineTo(9.81f);
        pathBuilder.lineToRelative(-0.75f, 0.75f);
        pathBuilder.lineToRelative(-0.71f, -0.71f);
        pathBuilder.lineToRelative(1.45f, -1.45f);
        pathBuilder.verticalLineTo(7.5f);
        pathBuilder.horizontalLineToRelative(-0.89f);
        pathBuilder.lineToRelative(-1.45f, 1.45f);
        pathBuilder.lineToRelative(-0.71f, -0.71f);
        pathBuilder.lineToRelative(0.75f, -0.75f);
        pathBuilder.horizontalLineTo(14.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(1.19f);
        pathBuilder.lineToRelative(-0.75f, -0.75f);
        pathBuilder.lineToRelative(0.71f, -0.71f);
        pathBuilder.lineToRelative(1.45f, 1.45f);
        pathBuilder.horizontalLineToRelative(0.89f);
        pathBuilder.verticalLineTo(5.61f);
        pathBuilder.lineToRelative(-1.45f, -1.45f);
        pathBuilder.lineToRelative(0.71f, -0.71f);
        pathBuilder.lineToRelative(0.75f, 0.75f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineToRelative(1.19f);
        pathBuilder.lineToRelative(0.75f, -0.75f);
        pathBuilder.lineToRelative(0.71f, 0.71f);
        pathBuilder.lineTo(18.5f, 5.61f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.horizontalLineToRelative(0.89f);
        pathBuilder.lineToRelative(1.45f, -1.45f);
        pathBuilder.lineToRelative(0.71f, 0.71f);
        pathBuilder.lineTo(20.81f, 6.5f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.verticalLineTo(7.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _chalet = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
