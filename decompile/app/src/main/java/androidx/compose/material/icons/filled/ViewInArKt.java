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

/* compiled from: ViewInAr.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_viewInAr", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ViewInAr", "Landroidx/compose/material/icons/Icons$Filled;", "getViewInAr", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nViewInAr.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInAr.kt\nandroidx/compose/material/icons/filled/ViewInArKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,105:1\n212#2,12:106\n233#2,18:119\n253#2:156\n174#3:118\n705#4,2:137\n717#4,2:139\n719#4,11:145\n72#5,4:141\n*S KotlinDebug\n*F\n+ 1 ViewInAr.kt\nandroidx/compose/material/icons/filled/ViewInArKt\n*L\n29#1:106,12\n30#1:119,18\n30#1:156\n29#1:118\n30#1:137,2\n30#1:139,2\n30#1:145,11\n30#1:141,4\n*E\n"})
/* loaded from: classes3.dex */
public final class ViewInArKt {

    @Nullable
    private static ImageVector _viewInAr;

    @NotNull
    public static final ImageVector getViewInAr(@NotNull Icons.Filled filled) {
        ImageVector imageVector = _viewInAr;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ViewInAr", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.25f, 7.6f);
        pathBuilder.lineToRelative(-5.5f, -3.18f);
        pathBuilder.curveToRelative(-0.46f, -0.27f, -1.04f, -0.27f, -1.5f, 0.0f);
        pathBuilder.lineTo(5.75f, 7.6f);
        pathBuilder.curveToRelative(-0.46f, 0.27f, -0.75f, 0.76f, -0.75f, 1.3f);
        pathBuilder.verticalLineToRelative(6.35f);
        pathBuilder.curveToRelative(0.0f, 0.54f, 0.29f, 1.03f, 0.75f, 1.3f);
        pathBuilder.lineToRelative(5.5f, 3.18f);
        pathBuilder.curveToRelative(0.46f, 0.27f, 1.04f, 0.27f, 1.5f, 0.0f);
        pathBuilder.lineToRelative(5.5f, -3.18f);
        pathBuilder.curveToRelative(0.46f, -0.27f, 0.75f, -0.76f, 0.75f, -1.3f);
        pathBuilder.lineTo(19.0f, 8.9f);
        pathBuilder.curveToRelative(0.0f, -0.54f, -0.29f, -1.03f, -0.75f, -1.3f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 14.96f);
        pathBuilder.verticalLineToRelative(-4.62f);
        pathBuilder.lineToRelative(4.0f, 2.32f);
        pathBuilder.verticalLineToRelative(4.61f);
        pathBuilder.lineToRelative(-4.0f, -2.31f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 10.93f);
        pathBuilder.lineTo(8.0f, 8.61f);
        pathBuilder.lineToRelative(4.0f, -2.31f);
        pathBuilder.lineToRelative(4.0f, 2.31f);
        pathBuilder.lineToRelative(-4.0f, 2.32f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 17.27f);
        pathBuilder.verticalLineToRelative(-4.61f);
        pathBuilder.lineToRelative(4.0f, -2.32f);
        pathBuilder.verticalLineToRelative(4.62f);
        pathBuilder.lineToRelative(-4.0f, 2.31f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 2.0f);
        pathBuilder.lineTo(3.5f, 2.0f);
        pathBuilder.curveTo(2.67f, 2.0f, 2.0f, 2.67f, 2.0f, 3.5f);
        pathBuilder.lineTo(2.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineTo(4.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.lineTo(7.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(3.5f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.lineTo(22.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.lineTo(20.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.lineTo(17.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 22.0f);
        pathBuilder.lineTo(3.5f, 22.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.lineTo(2.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 22.0f);
        pathBuilder.horizontalLineToRelative(3.5f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.lineTo(22.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _viewInAr = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
