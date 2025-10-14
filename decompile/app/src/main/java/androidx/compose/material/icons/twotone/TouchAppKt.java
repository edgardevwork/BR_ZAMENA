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

/* compiled from: TouchApp.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_touchApp", "Landroidx/compose/ui/graphics/vector/ImageVector;", "TouchApp", "Landroidx/compose/material/icons/Icons$TwoTone;", "getTouchApp", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTouchApp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchApp.kt\nandroidx/compose/material/icons/twotone/TouchAppKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,94:1\n212#2,12:95\n233#2,18:108\n253#2:145\n233#2,18:146\n253#2:183\n174#3:107\n705#4,2:126\n717#4,2:128\n719#4,11:134\n705#4,2:164\n717#4,2:166\n719#4,11:172\n72#5,4:130\n72#5,4:168\n*S KotlinDebug\n*F\n+ 1 TouchApp.kt\nandroidx/compose/material/icons/twotone/TouchAppKt\n*L\n29#1:95,12\n30#1:108,18\n30#1:145\n73#1:146,18\n73#1:183\n29#1:107\n30#1:126,2\n30#1:128,2\n30#1:134,11\n73#1:164,2\n73#1:166,2\n73#1:172,11\n30#1:130,4\n73#1:168,4\n*E\n"})
/* loaded from: classes2.dex */
public final class TouchAppKt {

    @Nullable
    private static ImageVector _touchApp;

    @NotNull
    public static final ImageVector getTouchApp(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _touchApp;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.TouchApp", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.19f, 12.44f);
        pathBuilder.lineToRelative(-3.24f, -1.62f);
        pathBuilder.curveToRelative(1.29f, -1.0f, 2.12f, -2.56f, 2.12f, -4.32f);
        pathBuilder.curveToRelative(0.0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f);
        pathBuilder.reflectiveCurveToRelative(-5.5f, 2.47f, -5.5f, 5.5f);
        pathBuilder.curveToRelative(0.0f, 2.13f, 1.22f, 3.98f, 3.0f, 4.89f);
        pathBuilder.verticalLineToRelative(3.26f);
        pathBuilder.curveToRelative(-2.08f, -0.44f, -2.01f, -0.44f, -2.26f, -0.44f);
        pathBuilder.curveToRelative(-0.53f, 0.0f, -1.03f, 0.21f, -1.41f, 0.59f);
        pathBuilder.lineTo(4.0f, 16.22f);
        pathBuilder.lineToRelative(5.09f, 5.09f);
        pathBuilder.curveTo(9.52f, 21.75f, 10.12f, 22.0f, 10.74f, 22.0f);
        pathBuilder.horizontalLineToRelative(6.3f);
        pathBuilder.curveToRelative(0.98f, 0.0f, 1.81f, -0.7f, 1.97f, -1.67f);
        pathBuilder.lineToRelative(0.8f, -4.71f);
        pathBuilder.curveTo(20.03f, 14.32f, 19.38f, 13.04f, 18.19f, 12.44f);
        pathBuilder.close();
        pathBuilder.moveTo(8.07f, 6.5f);
        pathBuilder.curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f);
        pathBuilder.reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f);
        pathBuilder.curveToRelative(0.0f, 0.95f, -0.38f, 1.81f, -1.0f, 2.44f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        pathBuilder.curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f);
        pathBuilder.verticalLineToRelative(2.44f);
        pathBuilder.curveTo(8.45f, 8.31f, 8.07f, 7.45f, 8.07f, 6.5f);
        pathBuilder.close();
        pathBuilder.moveTo(17.84f, 15.29f);
        pathBuilder.lineTo(17.04f, 20.0f);
        pathBuilder.horizontalLineToRelative(-6.3f);
        pathBuilder.curveToRelative(-0.09f, 0.0f, -0.17f, -0.04f, -0.24f, -0.1f);
        pathBuilder.lineToRelative(-3.68f, -3.68f);
        pathBuilder.lineToRelative(4.25f, 0.89f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(1.76f);
        pathBuilder.lineToRelative(3.46f, 1.73f);
        pathBuilder.curveTo(17.69f, 14.43f, 17.91f, 14.86f, 17.84f, 15.29f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(17.3f, 14.23f);
        pathBuilder2.lineToRelative(-3.46f, -1.73f);
        pathBuilder2.horizontalLineToRelative(-1.77f);
        pathBuilder2.verticalLineToRelative(-6.0f);
        pathBuilder2.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilder2.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilder2.verticalLineToRelative(10.61f);
        pathBuilder2.lineToRelative(-4.25f, -0.89f);
        pathBuilder2.lineToRelative(3.68f, 3.68f);
        pathBuilder2.curveToRelative(0.06f, 0.06f, 0.15f, 0.1f, 0.24f, 0.1f);
        pathBuilder2.horizontalLineToRelative(6.3f);
        pathBuilder2.lineToRelative(0.8f, -4.71f);
        pathBuilder2.curveTo(17.91f, 14.86f, 17.69f, 14.43f, 17.3f, 14.23f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _touchApp = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
