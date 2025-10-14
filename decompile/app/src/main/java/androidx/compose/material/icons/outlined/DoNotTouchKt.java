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

/* compiled from: DoNotTouch.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_doNotTouch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DoNotTouch", "Landroidx/compose/material/icons/Icons$Outlined;", "getDoNotTouch", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDoNotTouch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoNotTouch.kt\nandroidx/compose/material/icons/outlined/DoNotTouchKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,92:1\n212#2,12:93\n233#2,18:106\n253#2:143\n174#3:105\n705#4,2:124\n717#4,2:126\n719#4,11:132\n72#5,4:128\n*S KotlinDebug\n*F\n+ 1 DoNotTouch.kt\nandroidx/compose/material/icons/outlined/DoNotTouchKt\n*L\n29#1:93,12\n30#1:106,18\n30#1:143\n29#1:105\n30#1:124,2\n30#1:126,2\n30#1:132,11\n30#1:128,4\n*E\n"})
/* loaded from: classes3.dex */
public final class DoNotTouchKt {

    @Nullable
    private static ImageVector _doNotTouch;

    @NotNull
    public static final ImageVector getDoNotTouch(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _doNotTouch;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DoNotTouch", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.81f, 2.81f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.lineTo(7.0f, 9.83f);
        pathBuilder.lineToRelative(0.0f, 4.3f);
        pathBuilder.lineToRelative(-2.6f, -1.48f);
        pathBuilder.curveToRelative(-0.17f, -0.09f, -0.34f, -0.14f, -0.54f, -0.14f);
        pathBuilder.curveToRelative(-0.26f, 0.0f, -0.5f, 0.09f, -0.7f, 0.26f);
        pathBuilder.lineTo(2.0f, 13.88f);
        pathBuilder.lineToRelative(6.8f, 7.18f);
        pathBuilder.curveToRelative(0.57f, 0.6f, 1.35f, 0.94f, 2.18f, 0.94f);
        pathBuilder.horizontalLineTo(17.0f);
        pathBuilder.curveToRelative(0.62f, 0.0f, 1.18f, -0.19f, 1.66f, -0.52f);
        pathBuilder.lineToRelative(1.12f, 1.12f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(2.81f, 2.81f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(-6.0f);
        pathBuilder.curveToRelative(-0.39f, 0.0f, -0.64f, -0.23f, -0.75f, -0.36f);
        pathBuilder.lineTo(6.87f, 16.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.lineToRelative(0.0f, -4.17f);
        pathBuilder.lineToRelative(8.14f, 8.14f);
        pathBuilder.curveTo(17.09f, 19.98f, 17.05f, 20.0f, 17.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.83f, 11.0f);
        pathBuilder.horizontalLineTo(14.0f);
        pathBuilder.verticalLineTo(3.25f);
        pathBuilder.curveTo(14.0f, 2.56f, 14.56f, 2.0f, 15.25f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(5.25f);
        pathBuilder.curveTo(17.5f, 4.56f, 18.06f, 4.0f, 18.75f, 4.0f);
        pathBuilder.reflectiveCurveTo(20.0f, 4.56f, 20.0f, 5.25f);
        pathBuilder.verticalLineToRelative(11.92f);
        pathBuilder.lineToRelative(-2.0f, -2.0f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder.horizontalLineToRelative(-2.17f);
        pathBuilder.lineTo(13.83f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 10.17f);
        pathBuilder.verticalLineTo(2.25f);
        pathBuilder.curveTo(13.0f, 1.56f, 12.44f, 1.0f, 11.75f, 1.0f);
        pathBuilder.reflectiveCurveTo(10.5f, 1.56f, 10.5f, 2.25f);
        pathBuilder.verticalLineToRelative(5.42f);
        pathBuilder.lineTo(13.0f, 10.17f);
        pathBuilder.close();
        pathBuilder.moveTo(9.5f, 6.67f);
        pathBuilder.verticalLineTo(4.25f);
        pathBuilder.curveTo(9.5f, 3.56f, 8.94f, 3.0f, 8.25f, 3.0f);
        pathBuilder.curveToRelative(-0.67f, 0.0f, -1.2f, 0.53f, -1.24f, 1.18f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.lineTo(9.5f, 6.67f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doNotTouch = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
