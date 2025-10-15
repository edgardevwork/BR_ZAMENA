package androidx.compose.material.icons.rounded;

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

/* compiled from: SportsSoccer.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_sportsSoccer", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SportsSoccer", "Landroidx/compose/material/icons/Icons$Rounded;", "getSportsSoccer", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSportsSoccer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportsSoccer.kt\nandroidx/compose/material/icons/rounded/SportsSoccerKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,93:1\n212#2,12:94\n233#2,18:107\n253#2:144\n174#3:106\n705#4,2:125\n717#4,2:127\n719#4,11:133\n72#5,4:129\n*S KotlinDebug\n*F\n+ 1 SportsSoccer.kt\nandroidx/compose/material/icons/rounded/SportsSoccerKt\n*L\n29#1:94,12\n30#1:107,18\n30#1:144\n29#1:106\n30#1:125,2\n30#1:127,2\n30#1:133,11\n30#1:129,4\n*E\n"})
/* loaded from: classes.dex */
public final class SportsSoccerKt {

    @Nullable
    private static ImageVector _sportsSoccer;

    @NotNull
    public static final ImageVector getSportsSoccer(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _sportsSoccer;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SportsSoccer", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 5.3f);
        pathBuilder.lineToRelative(1.35f, -0.95f);
        pathBuilder.curveToRelative(1.82f, 0.56f, 3.37f, 1.76f, 4.38f, 3.34f);
        pathBuilder.lineToRelative(-0.39f, 1.34f);
        pathBuilder.lineToRelative(-1.35f, 0.46f);
        pathBuilder.lineTo(13.0f, 6.7f);
        pathBuilder.verticalLineTo(5.3f);
        pathBuilder.close();
        pathBuilder.moveTo(9.65f, 4.35f);
        pathBuilder.lineTo(11.0f, 5.3f);
        pathBuilder.verticalLineToRelative(1.4f);
        pathBuilder.lineTo(7.01f, 9.49f);
        pathBuilder.lineTo(5.66f, 9.03f);
        pathBuilder.lineTo(5.27f, 7.69f);
        pathBuilder.curveTo(6.28f, 6.12f, 7.83f, 4.92f, 9.65f, 4.35f);
        pathBuilder.close();
        pathBuilder.moveTo(7.08f, 17.11f);
        pathBuilder.lineToRelative(-1.14f, 0.1f);
        pathBuilder.curveTo(4.73f, 15.81f, 4.0f, 13.99f, 4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -0.12f, 0.01f, -0.23f, 0.02f, -0.35f);
        pathBuilder.lineToRelative(1.0f, -0.73f);
        pathBuilder.lineTo(6.4f, 11.4f);
        pathBuilder.lineToRelative(1.46f, 4.34f);
        pathBuilder.lineTo(7.08f, 17.11f);
        pathBuilder.close();
        pathBuilder.moveTo(14.5f, 19.59f);
        pathBuilder.curveTo(13.71f, 19.85f, 12.87f, 20.0f, 12.0f, 20.0f);
        pathBuilder.reflectiveCurveToRelative(-1.71f, -0.15f, -2.5f, -0.41f);
        pathBuilder.lineToRelative(-0.69f, -1.49f);
        pathBuilder.lineTo(9.45f, 17.0f);
        pathBuilder.horizontalLineToRelative(5.11f);
        pathBuilder.lineToRelative(0.64f, 1.11f);
        pathBuilder.lineTo(14.5f, 19.59f);
        pathBuilder.close();
        pathBuilder.moveTo(14.27f, 15.0f);
        pathBuilder.horizontalLineTo(9.73f);
        pathBuilder.lineToRelative(-1.35f, -4.02f);
        pathBuilder.lineTo(12.0f, 8.44f);
        pathBuilder.lineToRelative(3.63f, 2.54f);
        pathBuilder.lineTo(14.27f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.06f, 17.21f);
        pathBuilder.lineToRelative(-1.14f, -0.1f);
        pathBuilder.lineToRelative(-0.79f, -1.37f);
        pathBuilder.lineToRelative(1.46f, -4.34f);
        pathBuilder.lineToRelative(1.39f, -0.47f);
        pathBuilder.lineToRelative(1.0f, 0.73f);
        pathBuilder.curveTo(19.99f, 11.77f, 20.0f, 11.88f, 20.0f, 12.0f);
        pathBuilder.curveTo(20.0f, 13.99f, 19.27f, 15.81f, 18.06f, 17.21f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsSoccer = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
