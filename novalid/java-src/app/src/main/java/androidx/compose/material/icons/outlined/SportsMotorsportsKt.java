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

/* compiled from: SportsMotorsports.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_sportsMotorsports", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SportsMotorsports", "Landroidx/compose/material/icons/Icons$Outlined;", "getSportsMotorsports", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSportsMotorsports.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportsMotorsports.kt\nandroidx/compose/material/icons/outlined/SportsMotorsportsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,68:1\n212#2,12:69\n233#2,18:82\n253#2:119\n174#3:81\n705#4,2:100\n717#4,2:102\n719#4,11:108\n72#5,4:104\n*S KotlinDebug\n*F\n+ 1 SportsMotorsports.kt\nandroidx/compose/material/icons/outlined/SportsMotorsportsKt\n*L\n29#1:69,12\n30#1:82,18\n30#1:119\n29#1:81\n30#1:100,2\n30#1:102,2\n30#1:108,11\n30#1:104,4\n*E\n"})
/* loaded from: classes.dex */
public final class SportsMotorsportsKt {

    @Nullable
    private static ImageVector _sportsMotorsports;

    @NotNull
    public static final ImageVector getSportsMotorsports(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _sportsMotorsports;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SportsMotorsports", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.96f, 11.22f);
        pathBuilder.curveTo(21.57f, 7.01f, 17.76f, 4.0f, 13.56f, 4.0f);
        pathBuilder.curveToRelative(-0.19f, 0.0f, -0.38f, 0.01f, -0.57f, 0.02f);
        pathBuilder.curveTo(2.0f, 4.74f, 2.0f, 17.2f, 2.0f, 17.2f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.curveTo(18.67f, 20.0f, 22.41f, 15.99f, 21.96f, 11.22f);
        pathBuilder.close();
        pathBuilder.moveTo(5.26f, 11.56f);
        pathBuilder.curveToRelative(0.57f, -1.29f, 1.28f, -2.35f, 2.14f, -3.19f);
        pathBuilder.lineToRelative(3.62f, 1.53f);
        pathBuilder.curveToRelative(0.6f, 0.25f, 0.98f, 0.83f, 0.98f, 1.48f);
        pathBuilder.curveToRelative(0.0f, 0.89f, -0.72f, 1.61f, -1.61f, 1.61f);
        pathBuilder.horizontalLineTo(4.72f);
        pathBuilder.curveTo(4.87f, 12.53f, 5.04f, 12.05f, 5.26f, 11.56f);
        pathBuilder.close();
        pathBuilder.moveTo(18.44f, 16.04f);
        pathBuilder.curveTo(17.3f, 17.29f, 15.68f, 18.0f, 14.0f, 18.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(-0.8f);
        pathBuilder.curveToRelative(0.0f, -0.02f, 0.01f, -0.92f, 0.24f, -2.2f);
        pathBuilder.horizontalLineToRelative(6.15f);
        pathBuilder.curveToRelative(1.99f, 0.0f, 3.61f, -1.62f, 3.61f, -3.61f);
        pathBuilder.curveToRelative(0.0f, -1.45f, -0.87f, -2.76f, -2.2f, -3.32f);
        pathBuilder.lineTo(9.3f, 7.01f);
        pathBuilder.curveToRelative(1.1f, -0.57f, 2.37f, -0.9f, 3.82f, -0.99f);
        pathBuilder.curveTo(13.27f, 6.0f, 13.42f, 6.0f, 13.56f, 6.0f);
        pathBuilder.curveToRelative(3.31f, 0.0f, 6.13f, 2.37f, 6.41f, 5.41f);
        pathBuilder.curveTo(20.13f, 13.13f, 19.59f, 14.77f, 18.44f, 16.04f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsMotorsports = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
