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

/* compiled from: Person3.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_person3", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Person3", "Landroidx/compose/material/icons/Icons$Outlined;", "getPerson3", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPerson3.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Person3.kt\nandroidx/compose/material/icons/outlined/Person3Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,83:1\n212#2,12:84\n233#2,18:97\n253#2:134\n233#2,18:135\n253#2:172\n174#3:96\n705#4,2:115\n717#4,2:117\n719#4,11:123\n705#4,2:153\n717#4,2:155\n719#4,11:161\n72#5,4:119\n72#5,4:157\n*S KotlinDebug\n*F\n+ 1 Person3.kt\nandroidx/compose/material/icons/outlined/Person3Kt\n*L\n29#1:84,12\n30#1:97,18\n30#1:134\n50#1:135,18\n50#1:172\n29#1:96\n30#1:115,2\n30#1:117,2\n30#1:123,11\n50#1:153,2\n50#1:155,2\n50#1:161,11\n30#1:119,4\n50#1:157,4\n*E\n"})
/* loaded from: classes.dex */
public final class Person3Kt {

    @Nullable
    private static ImageVector _person3;

    @NotNull
    public static final ImageVector getPerson3(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _person3;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Person3", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.39f, 14.56f);
        pathBuilder.curveTo(16.71f, 13.7f, 14.53f, 13.0f, 12.0f, 13.0f);
        pathBuilder.curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f);
        pathBuilder.curveTo(4.61f, 15.07f, 4.0f, 16.1f, 4.0f, 17.22f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineToRelative(-2.78f);
        pathBuilder.curveTo(20.0f, 16.1f, 19.39f, 15.07f, 18.39f, 14.56f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 18.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineToRelative(-0.78f);
        pathBuilder.curveToRelative(0.0f, -0.38f, 0.2f, -0.72f, 0.52f, -0.88f);
        pathBuilder.curveTo(7.71f, 15.73f, 9.63f, 15.0f, 12.0f, 15.0f);
        pathBuilder.curveToRelative(2.37f, 0.0f, 4.29f, 0.73f, 5.48f, 1.34f);
        pathBuilder.curveTo(17.8f, 16.5f, 18.0f, 16.84f, 18.0f, 17.22f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(10.0f, 12.0f);
        pathBuilder2.curveToRelative(0.17f, 0.0f, 3.83f, 0.0f, 4.0f, 0.0f);
        pathBuilder2.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder2.curveToRelative(0.0f, -0.73f, -0.27f, -1.4f, -0.71f, -1.92f);
        pathBuilder2.curveTo(16.42f, 6.75f, 16.5f, 6.38f, 16.5f, 6.0f);
        pathBuilder2.curveToRelative(0.0f, -1.25f, -0.77f, -2.32f, -1.86f, -2.77f);
        pathBuilder2.curveTo(14.0f, 2.48f, 13.06f, 2.0f, 12.0f, 2.0f);
        pathBuilder2.reflectiveCurveToRelative(-2.0f, 0.48f, -2.64f, 1.23f);
        pathBuilder2.curveTo(8.27f, 3.68f, 7.5f, 4.75f, 7.5f, 6.0f);
        pathBuilder2.curveToRelative(0.0f, 0.38f, 0.08f, 0.75f, 0.21f, 1.08f);
        pathBuilder2.curveTo(7.27f, 7.6f, 7.0f, 8.27f, 7.0f, 9.0f);
        pathBuilder2.curveTo(7.0f, 10.66f, 8.34f, 12.0f, 10.0f, 12.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(9.24f, 8.37f);
        pathBuilder2.curveTo(10.11f, 7.33f, 9.5f, 6.37f, 9.5f, 6.0f);
        pathBuilder2.curveToRelative(0.0f, -0.41f, 0.24f, -0.77f, 0.62f, -0.92f);
        pathBuilder2.curveToRelative(0.29f, -0.12f, 0.55f, -0.31f, 0.75f, -0.54f);
        pathBuilder2.curveTo(11.04f, 4.33f, 11.42f, 4.0f, 12.0f, 4.0f);
        pathBuilder2.reflectiveCurveToRelative(0.96f, 0.33f, 1.13f, 0.53f);
        pathBuilder2.curveToRelative(0.2f, 0.24f, 0.46f, 0.42f, 0.75f, 0.54f);
        pathBuilder2.curveTo(14.26f, 5.23f, 14.5f, 5.59f, 14.5f, 6.0f);
        pathBuilder2.curveToRelative(0.0f, 0.37f, -0.61f, 1.33f, 0.26f, 2.37f);
        pathBuilder2.curveTo(15.34f, 9.06f, 14.8f, 10.0f, 14.0f, 10.0f);
        pathBuilder2.horizontalLineToRelative(-4.0f);
        pathBuilder2.curveTo(9.2f, 10.0f, 8.66f, 9.06f, 9.24f, 8.37f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _person3 = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
