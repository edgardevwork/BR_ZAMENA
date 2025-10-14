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

/* compiled from: KebabDining.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_kebabDining", "Landroidx/compose/ui/graphics/vector/ImageVector;", "KebabDining", "Landroidx/compose/material/icons/Icons$Filled;", "getKebabDining", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nKebabDining.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KebabDining.kt\nandroidx/compose/material/icons/filled/KebabDiningKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,105:1\n212#2,12:106\n233#2,18:119\n253#2:156\n174#3:118\n705#4,2:137\n717#4,2:139\n719#4,11:145\n72#5,4:141\n*S KotlinDebug\n*F\n+ 1 KebabDining.kt\nandroidx/compose/material/icons/filled/KebabDiningKt\n*L\n29#1:106,12\n30#1:119,18\n30#1:156\n29#1:118\n30#1:137,2\n30#1:139,2\n30#1:145,11\n30#1:141,4\n*E\n"})
/* loaded from: classes2.dex */
public final class KebabDiningKt {

    @Nullable
    private static ImageVector _kebabDining;

    @NotNull
    public static final ImageVector getKebabDining(@NotNull Icons.Filled filled) {
        ImageVector imageVector = _kebabDining;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.KebabDining", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.75f, 8.0f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineTo(7.75f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineTo(8.5f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilder.curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f);
        pathBuilder.horizontalLineTo(7.75f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineTo(5.5f);
        pathBuilder.curveTo(4.12f, 19.0f, 3.0f, 17.88f, 3.0f, 16.5f);
        pathBuilder.curveTo(3.0f, 15.12f, 4.12f, 14.0f, 5.5f, 14.0f);
        pathBuilder.horizontalLineToRelative(0.75f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineToRelative(3.25f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineTo(5.5f);
        pathBuilder.curveTo(4.12f, 7.0f, 3.0f, 5.88f, 3.0f, 4.5f);
        pathBuilder.curveTo(3.0f, 3.12f, 4.12f, 2.0f, 5.5f, 2.0f);
        pathBuilder.horizontalLineToRelative(0.75f);
        pathBuilder.verticalLineTo(1.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineTo(8.5f);
        pathBuilder.curveTo(9.88f, 2.0f, 11.0f, 3.12f, 11.0f, 4.5f);
        pathBuilder.curveTo(11.0f, 5.88f, 9.88f, 7.0f, 8.5f, 7.0f);
        pathBuilder.horizontalLineTo(7.75f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.75f, 7.0f);
        pathBuilder.horizontalLineToRelative(0.75f);
        pathBuilder.curveTo(19.88f, 7.0f, 21.0f, 5.88f, 21.0f, 4.5f);
        pathBuilder.curveTo(21.0f, 3.12f, 19.88f, 2.0f, 18.5f, 2.0f);
        pathBuilder.horizontalLineToRelative(-0.75f);
        pathBuilder.verticalLineTo(1.0f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineTo(15.5f);
        pathBuilder.curveTo(14.12f, 2.0f, 13.0f, 3.12f, 13.0f, 4.5f);
        pathBuilder.curveTo(13.0f, 5.88f, 14.12f, 7.0f, 15.5f, 7.0f);
        pathBuilder.horizontalLineToRelative(0.75f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(3.25f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineTo(15.5f);
        pathBuilder.curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f);
        pathBuilder.curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f);
        pathBuilder.horizontalLineToRelative(0.75f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineToRelative(0.75f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilder.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        pathBuilder.horizontalLineToRelative(-0.75f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineTo(21.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineToRelative(-3.25f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _kebabDining = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
