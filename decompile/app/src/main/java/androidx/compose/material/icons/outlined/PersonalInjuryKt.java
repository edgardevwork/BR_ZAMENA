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

/* compiled from: PersonalInjury.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_personalInjury", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PersonalInjury", "Landroidx/compose/material/icons/Icons$Outlined;", "getPersonalInjury", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPersonalInjury.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonalInjury.kt\nandroidx/compose/material/icons/outlined/PersonalInjuryKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,83:1\n212#2,12:84\n233#2,18:97\n253#2:134\n174#3:96\n705#4,2:115\n717#4,2:117\n719#4,11:123\n72#5,4:119\n*S KotlinDebug\n*F\n+ 1 PersonalInjury.kt\nandroidx/compose/material/icons/outlined/PersonalInjuryKt\n*L\n29#1:84,12\n30#1:97,18\n30#1:134\n29#1:96\n30#1:115,2\n30#1:117,2\n30#1:123,11\n30#1:119,4\n*E\n"})
/* loaded from: classes.dex */
public final class PersonalInjuryKt {

    @Nullable
    private static ImageVector _personalInjury;

    @NotNull
    public static final ImageVector getPersonalInjury(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _personalInjury;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PersonalInjury", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 10.0f);
        pathBuilder.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder.reflectiveCurveTo(8.0f, 3.79f, 8.0f, 6.0f);
        pathBuilder.curveTo(8.0f, 8.21f, 9.79f, 10.0f, 12.0f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.curveTo(10.0f, 4.9f, 10.9f, 4.0f, 12.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.39f, 12.56f);
        pathBuilder.curveTo(16.71f, 11.7f, 14.53f, 11.0f, 12.0f, 11.0f);
        pathBuilder.curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f);
        pathBuilder.curveTo(4.61f, 13.07f, 4.0f, 14.1f, 4.0f, 15.22f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-6.78f);
        pathBuilder.curveToRelative(0.0f, -0.38f, 0.2f, -0.72f, 0.52f, -0.88f);
        pathBuilder.curveTo(7.71f, 13.73f, 9.63f, 13.0f, 12.0f, 13.0f);
        pathBuilder.curveToRelative(0.76f, 0.0f, 1.47f, 0.07f, 2.13f, 0.2f);
        pathBuilder.lineToRelative(-1.55f, 3.3f);
        pathBuilder.horizontalLineTo(9.75f);
        pathBuilder.curveTo(8.23f, 16.5f, 7.0f, 17.73f, 7.0f, 19.25f);
        pathBuilder.curveTo(7.0f, 20.77f, 8.23f, 22.0f, 9.75f, 22.0f);
        pathBuilder.horizontalLineToRelative(2.18f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-4.78f);
        pathBuilder.curveTo(20.0f, 14.1f, 19.39f, 13.07f, 18.39f, 12.56f);
        pathBuilder.close();
        pathBuilder.moveTo(10.94f, 20.0f);
        pathBuilder.horizontalLineTo(9.75f);
        pathBuilder.curveTo(9.34f, 20.0f, 9.0f, 19.66f, 9.0f, 19.25f);
        pathBuilder.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilder.horizontalLineToRelative(1.89f);
        pathBuilder.lineTo(10.94f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(-4.85f);
        pathBuilder.lineToRelative(2.94f, -6.27f);
        pathBuilder.curveToRelative(0.54f, 0.2f, 1.01f, 0.41f, 1.4f, 0.61f);
        pathBuilder.curveTo(17.8f, 14.5f, 18.0f, 14.84f, 18.0f, 15.22f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _personalInjury = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
