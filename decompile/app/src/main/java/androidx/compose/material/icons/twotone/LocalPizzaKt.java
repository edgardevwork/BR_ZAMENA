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

/* compiled from: LocalPizza.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_localPizza", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LocalPizza", "Landroidx/compose/material/icons/Icons$TwoTone;", "getLocalPizza", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLocalPizza.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalPizza.kt\nandroidx/compose/material/icons/twotone/LocalPizzaKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,81:1\n212#2,12:82\n233#2,18:95\n253#2:132\n233#2,18:133\n253#2:170\n174#3:94\n705#4,2:113\n717#4,2:115\n719#4,11:121\n705#4,2:151\n717#4,2:153\n719#4,11:159\n72#5,4:117\n72#5,4:155\n*S KotlinDebug\n*F\n+ 1 LocalPizza.kt\nandroidx/compose/material/icons/twotone/LocalPizzaKt\n*L\n29#1:82,12\n30#1:95,18\n30#1:132\n50#1:133,18\n50#1:170\n29#1:94\n30#1:113,2\n30#1:115,2\n30#1:121,11\n50#1:151,2\n50#1:153,2\n50#1:159,11\n30#1:117,4\n50#1:155,4\n*E\n"})
/* loaded from: classes2.dex */
public final class LocalPizzaKt {

    @Nullable
    private static ImageVector _localPizza;

    @NotNull
    public static final ImageVector getLocalPizza(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _localPizza;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.LocalPizza", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.51f, 6.36f);
        pathBuilder.lineTo(12.0f, 17.92f);
        pathBuilder.lineToRelative(6.49f, -11.55f);
        pathBuilder.curveTo(16.68f, 4.85f, 14.38f, 4.0f, 12.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(-4.68f, 0.85f, -6.49f, 2.36f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 8.5f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(8.17f, 5.5f, 9.0f, 5.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(9.82f, 8.5f, 9.0f, 8.5f);
        pathBuilder.close();
        pathBuilder.moveTo(13.5f, 13.0f);
        pathBuilder.curveToRelative(0.0f, 0.83f, -0.68f, 1.5f, -1.5f, 1.5f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 2.0f);
        pathBuilder2.curveTo(8.43f, 2.0f, 5.23f, 3.54f, 3.01f, 6.0f);
        pathBuilder2.lineTo(12.0f, 22.0f);
        pathBuilder2.lineToRelative(8.99f, -16.0f);
        pathBuilder2.curveTo(18.78f, 3.55f, 15.57f, 2.0f, 12.0f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 17.92f);
        pathBuilder2.lineTo(5.51f, 6.36f);
        pathBuilder2.curveTo(7.32f, 4.85f, 9.62f, 4.0f, 12.0f, 4.0f);
        pathBuilder2.reflectiveCurveToRelative(4.68f, 0.85f, 6.49f, 2.36f);
        pathBuilder2.lineTo(12.0f, 17.92f);
        pathBuilder2.close();
        pathBuilder2.moveTo(9.0f, 5.5f);
        pathBuilder2.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilder2.reflectiveCurveTo(8.17f, 8.5f, 9.0f, 8.5f);
        pathBuilder2.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder2.reflectiveCurveTo(9.82f, 5.5f, 9.0f, 5.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(10.5f, 13.0f);
        pathBuilder2.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilder2.curveToRelative(0.82f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder2.reflectiveCurveToRelative(-0.68f, -1.5f, -1.5f, -1.5f);
        pathBuilder2.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localPizza = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
