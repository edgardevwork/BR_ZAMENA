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

/* compiled from: Savings.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_savings", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Savings", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSavings", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSavings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savings.kt\nandroidx/compose/material/icons/twotone/SavingsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,116:1\n212#2,12:117\n233#2,18:130\n253#2:167\n233#2,18:168\n253#2:205\n174#3:129\n705#4,2:148\n717#4,2:150\n719#4,11:156\n705#4,2:186\n717#4,2:188\n719#4,11:194\n72#5,4:152\n72#5,4:190\n*S KotlinDebug\n*F\n+ 1 Savings.kt\nandroidx/compose/material/icons/twotone/SavingsKt\n*L\n29#1:117,12\n30#1:130,18\n30#1:167\n61#1:168,18\n61#1:205\n29#1:129\n30#1:148,2\n30#1:150,2\n30#1:156,11\n61#1:186,2\n61#1:188,2\n61#1:194,11\n30#1:152,4\n61#1:190,4\n*E\n"})
/* loaded from: classes4.dex */
public final class SavingsKt {

    @Nullable
    private static ImageVector _savings;

    @NotNull
    public static final ImageVector getSavings(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _savings;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Savings", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 9.5f);
        pathBuilder.lineTo(15.5f, 6.0f);
        pathBuilder.curveToRelative(0.0f, -0.65f, 0.09f, -1.29f, 0.26f, -1.91f);
        pathBuilder.curveTo(14.79f, 4.34f, 14.0f, 5.06f, 13.67f, 6.0f);
        pathBuilder.lineTo(7.5f, 6.0f);
        pathBuilder.curveTo(5.57f, 6.0f, 4.0f, 7.57f, 4.0f, 9.5f);
        pathBuilder.curveToRelative(0.0f, 1.88f, 1.22f, 6.65f, 2.01f, 9.5f);
        pathBuilder.lineTo(8.0f, 19.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineToRelative(2.01f, 0.0f);
        pathBuilder.lineToRelative(1.55f, -5.15f);
        pathBuilder.lineTo(20.0f, 13.03f);
        pathBuilder.verticalLineTo(9.5f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 9.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 11.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.curveTo(17.0f, 10.55f, 16.55f, 11.0f, 16.0f, 11.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(15.0f, 10.0f);
        pathBuilder2.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder2.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder2.reflectiveCurveTo(15.0f, 10.55f, 15.0f, 10.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(8.0f, 9.0f);
        pathBuilder2.horizontalLineToRelative(5.0f);
        pathBuilder2.verticalLineTo(7.0f);
        pathBuilder2.horizontalLineTo(8.0f);
        pathBuilder2.verticalLineTo(9.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(22.0f, 7.5f);
        pathBuilder2.verticalLineToRelative(6.97f);
        pathBuilder2.lineToRelative(-2.82f, 0.94f);
        pathBuilder2.lineTo(17.5f, 21.0f);
        pathBuilder2.lineTo(12.0f, 21.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.lineToRelative(-5.5f, 0.0f);
        pathBuilder2.curveTo(4.5f, 21.0f, 2.0f, 12.54f, 2.0f, 9.5f);
        pathBuilder2.reflectiveCurveTo(4.46f, 4.0f, 7.5f, 4.0f);
        pathBuilder2.lineToRelative(5.0f, 0.0f);
        pathBuilder2.curveToRelative(0.91f, -1.21f, 2.36f, -2.0f, 4.0f, -2.0f);
        pathBuilder2.curveTo(17.33f, 2.0f, 18.0f, 2.67f, 18.0f, 3.5f);
        pathBuilder2.curveToRelative(0.0f, 0.21f, -0.04f, 0.4f, -0.12f, 0.58f);
        pathBuilder2.curveToRelative(-0.14f, 0.34f, -0.26f, 0.73f, -0.32f, 1.15f);
        pathBuilder2.lineToRelative(2.27f, 2.27f);
        pathBuilder2.horizontalLineTo(22.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.0f, 9.5f);
        pathBuilder2.horizontalLineToRelative(-1.0f);
        pathBuilder2.lineTo(15.5f, 6.0f);
        pathBuilder2.curveToRelative(0.0f, -0.65f, 0.09f, -1.29f, 0.26f, -1.91f);
        pathBuilder2.curveTo(14.79f, 4.34f, 14.0f, 5.06f, 13.67f, 6.0f);
        pathBuilder2.lineTo(7.5f, 6.0f);
        pathBuilder2.curveTo(5.57f, 6.0f, 4.0f, 7.57f, 4.0f, 9.5f);
        pathBuilder2.curveToRelative(0.0f, 1.88f, 1.22f, 6.65f, 2.01f, 9.5f);
        pathBuilder2.lineTo(8.0f, 19.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.horizontalLineToRelative(6.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.lineToRelative(2.01f, 0.0f);
        pathBuilder2.lineToRelative(1.55f, -5.15f);
        pathBuilder2.lineTo(20.0f, 13.03f);
        pathBuilder2.verticalLineTo(9.5f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _savings = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
