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

/* compiled from: SportsTennis.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_sportsTennis", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SportsTennis", "Landroidx/compose/material/icons/Icons$Filled;", "getSportsTennis", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSportsTennis.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportsTennis.kt\nandroidx/compose/material/icons/filled/SportsTennisKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,72:1\n212#2,12:73\n233#2,18:86\n253#2:123\n233#2,18:124\n253#2:161\n174#3:85\n705#4,2:104\n717#4,2:106\n719#4,11:112\n705#4,2:142\n717#4,2:144\n719#4,11:150\n72#5,4:108\n72#5,4:146\n*S KotlinDebug\n*F\n+ 1 SportsTennis.kt\nandroidx/compose/material/icons/filled/SportsTennisKt\n*L\n29#1:73,12\n30#1:86,18\n30#1:123\n49#1:124,18\n49#1:161\n29#1:85\n30#1:104,2\n30#1:106,2\n30#1:112,11\n49#1:142,2\n49#1:144,2\n49#1:150,11\n30#1:108,4\n49#1:146,4\n*E\n"})
/* loaded from: classes2.dex */
public final class SportsTennisKt {

    @Nullable
    private static ImageVector _sportsTennis;

    @NotNull
    public static final ImageVector getSportsTennis(@NotNull Icons.Filled filled) {
        ImageVector imageVector = _sportsTennis;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SportsTennis", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.52f, 2.49f);
        pathBuilder.curveToRelative(-2.34f, -2.34f, -6.62f, -1.87f, -9.55f, 1.06f);
        pathBuilder.curveToRelative(-1.6f, 1.6f, -2.52f, 3.87f, -2.54f, 5.46f);
        pathBuilder.curveToRelative(-0.02f, 1.58f, 0.26f, 3.89f, -1.35f, 5.5f);
        pathBuilder.lineToRelative(-4.24f, 4.24f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        pathBuilder.lineToRelative(4.24f, -4.24f);
        pathBuilder.curveToRelative(1.61f, -1.61f, 3.92f, -1.33f, 5.5f, -1.35f);
        pathBuilder.reflectiveCurveToRelative(3.86f, -0.94f, 5.46f, -2.54f);
        pathBuilder.curveTo(21.38f, 9.11f, 21.86f, 4.83f, 19.52f, 2.49f);
        pathBuilder.close();
        pathBuilder.moveTo(10.32f, 11.68f);
        pathBuilder.curveToRelative(-1.53f, -1.53f, -1.05f, -4.61f, 1.06f, -6.72f);
        pathBuilder.reflectiveCurveToRelative(5.18f, -2.59f, 6.72f, -1.06f);
        pathBuilder.curveToRelative(1.53f, 1.53f, 1.05f, 4.61f, -1.06f, 6.72f);
        pathBuilder.reflectiveCurveTo(11.86f, 13.21f, 10.32f, 11.68f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(18.0f, 17.0f);
        pathBuilder2.curveToRelative(0.53f, 0.0f, 1.04f, 0.21f, 1.41f, 0.59f);
        pathBuilder2.curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilder2.curveTo(19.04f, 20.79f, 18.53f, 21.0f, 18.0f, 21.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.04f, -0.21f, -1.41f, -0.59f);
        pathBuilder2.curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0.0f, -2.83f);
        pathBuilder2.curveTo(16.96f, 17.21f, 17.47f, 17.0f, 18.0f, 17.0f);
        pathBuilder2.moveTo(18.0f, 15.0f);
        pathBuilder2.curveToRelative(-1.02f, 0.0f, -2.05f, 0.39f, -2.83f, 1.17f);
        pathBuilder2.curveToRelative(-1.56f, 1.56f, -1.56f, 4.09f, 0.0f, 5.66f);
        pathBuilder2.curveTo(15.95f, 22.61f, 16.98f, 23.0f, 18.0f, 23.0f);
        pathBuilder2.reflectiveCurveToRelative(2.05f, -0.39f, 2.83f, -1.17f);
        pathBuilder2.curveToRelative(1.56f, -1.56f, 1.56f, -4.09f, 0.0f, -5.66f);
        pathBuilder2.curveTo(20.05f, 15.39f, 19.02f, 15.0f, 18.0f, 15.0f);
        pathBuilder2.lineTo(18.0f, 15.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsTennis = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
