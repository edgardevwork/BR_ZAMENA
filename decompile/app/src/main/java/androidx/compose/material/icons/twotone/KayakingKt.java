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

/* compiled from: Kayaking.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_kayaking", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Kayaking", "Landroidx/compose/material/icons/Icons$TwoTone;", "getKayaking", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nKayaking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Kayaking.kt\nandroidx/compose/material/icons/twotone/KayakingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,93:1\n212#2,12:94\n233#2,18:107\n253#2:144\n174#3:106\n705#4,2:125\n717#4,2:127\n719#4,11:133\n72#5,4:129\n*S KotlinDebug\n*F\n+ 1 Kayaking.kt\nandroidx/compose/material/icons/twotone/KayakingKt\n*L\n29#1:94,12\n30#1:107,18\n30#1:144\n29#1:106\n30#1:125,2\n30#1:127,2\n30#1:133,11\n30#1:129,4\n*E\n"})
/* loaded from: classes.dex */
public final class KayakingKt {

    @Nullable
    private static ImageVector _kayaking;

    @NotNull
    public static final ImageVector getKayaking(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _kayaking;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Kayaking", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 23.0f);
        pathBuilder.curveToRelative(-1.03f, 0.0f, -2.06f, -0.25f, -3.0f, -0.75f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-1.89f, 1.0f, -4.11f, 1.0f, -6.0f, 0.0f);
        pathBuilder.curveToRelative(-1.89f, 1.0f, -4.11f, 1.0f, -6.0f, 0.0f);
        pathBuilder.curveTo(5.05f, 22.75f, 4.03f, 23.0f, 3.0f, 23.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.lineToRelative(0.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.curveToRelative(1.04f, 0.0f, 2.08f, -0.35f, 3.0f, -1.0f);
        pathBuilder.curveToRelative(1.83f, 1.3f, 4.17f, 1.3f, 6.0f, 0.0f);
        pathBuilder.curveToRelative(1.83f, 1.3f, 4.17f, 1.3f, 6.0f, 0.0f);
        pathBuilder.curveToRelative(0.91f, 0.65f, 1.96f, 1.0f, 3.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(21.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 5.5f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(13.1f, 5.5f, 12.0f, 5.5f);
        pathBuilder.close();
        pathBuilder.moveTo(24.0f, 17.5f);
        pathBuilder.curveToRelative(0.0f, 0.0f, -1.52f, 0.71f, -3.93f, 1.37f);
        pathBuilder.curveToRelative(-0.82f, -0.23f, -1.53f, -0.75f, -2.07f, -1.37f);
        pathBuilder.curveToRelative(-0.73f, 0.84f, -1.8f, 1.5f, -3.0f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(-2.27f, -0.66f, -3.0f, -1.5f);
        pathBuilder.curveToRelative(-0.73f, 0.84f, -1.8f, 1.5f, -3.0f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(-2.27f, -0.66f, -3.0f, -1.5f);
        pathBuilder.curveToRelative(-0.54f, 0.61f, -1.25f, 1.13f, -2.07f, 1.37f);
        pathBuilder.curveTo(1.52f, 18.21f, 0.0f, 17.5f, 0.0f, 17.5f);
        pathBuilder.reflectiveCurveToRelative(2.93f, -1.36f, 7.13f, -2.08f);
        pathBuilder.lineToRelative(1.35f, -4.17f);
        pathBuilder.curveToRelative(0.31f, -0.95f, 1.32f, -1.47f, 2.27f, -1.16f);
        pathBuilder.curveToRelative(0.09f, 0.03f, 0.19f, 0.07f, 0.27f, 0.11f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.lineToRelative(2.47f, 1.3f);
        pathBuilder.lineToRelative(2.84f, -1.5f);
        pathBuilder.lineToRelative(1.65f, -3.71f);
        pathBuilder.lineToRelative(-0.51f, -1.32f);
        pathBuilder.lineTo(18.8f, 2.0f);
        pathBuilder.lineTo(22.0f, 3.43f);
        pathBuilder.lineTo(20.67f, 6.4f);
        pathBuilder.lineToRelative(-1.31f, 0.5f);
        pathBuilder.lineToRelative(-3.72f, 8.34f);
        pathBuilder.curveTo(20.49f, 15.87f, 24.0f, 17.5f, 24.0f, 17.5f);
        pathBuilder.close();
        pathBuilder.moveTo(15.02f, 12.96f);
        pathBuilder.lineToRelative(-1.52f, 0.8f);
        pathBuilder.lineToRelative(-1.75f, -0.92f);
        pathBuilder.lineToRelative(-0.71f, 2.17f);
        pathBuilder.curveTo(11.36f, 15.01f, 11.68f, 15.0f, 12.0f, 15.0f);
        pathBuilder.curveToRelative(0.71f, 0.0f, 1.4f, 0.03f, 2.07f, 0.08f);
        pathBuilder.lineTo(15.02f, 12.96f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _kayaking = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
