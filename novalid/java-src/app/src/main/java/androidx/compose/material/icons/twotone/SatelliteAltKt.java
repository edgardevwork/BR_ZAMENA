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

/* compiled from: SatelliteAlt.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_satelliteAlt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SatelliteAlt", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSatelliteAlt", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSatelliteAlt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SatelliteAlt.kt\nandroidx/compose/material/icons/twotone/SatelliteAltKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,145:1\n212#2,12:146\n233#2,18:159\n253#2:196\n233#2,18:197\n253#2:234\n174#3:158\n705#4,2:177\n717#4,2:179\n719#4,11:185\n705#4,2:215\n717#4,2:217\n719#4,11:223\n72#5,4:181\n72#5,4:219\n*S KotlinDebug\n*F\n+ 1 SatelliteAlt.kt\nandroidx/compose/material/icons/twotone/SatelliteAltKt\n*L\n29#1:146,12\n30#1:159,18\n30#1:196\n62#1:197,18\n62#1:234\n29#1:158\n30#1:177,2\n30#1:179,2\n30#1:185,11\n62#1:215,2\n62#1:217,2\n62#1:223,11\n30#1:181,4\n62#1:219,4\n*E\n"})
/* loaded from: classes4.dex */
public final class SatelliteAltKt {

    @Nullable
    private static ImageVector _satelliteAlt;

    @NotNull
    public static final ImageVector getSatelliteAlt(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _satelliteAlt;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SatelliteAlt", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.6f, 19.32f);
        pathBuilder.lineToRelative(-1.06f, 1.06f);
        pathBuilder.lineTo(2.0f, 16.85f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.lineTo(6.6f, 19.32f);
        pathBuilder.close();
        pathBuilder.moveTo(8.72f, 17.2f);
        pathBuilder.lineToRelative(-1.06f, 1.06f);
        pathBuilder.lineToRelative(-3.54f, -3.54f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.lineTo(8.72f, 17.2f);
        pathBuilder.close();
        pathBuilder.moveTo(13.67f, 12.25f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineToRelative(-3.54f, -3.54f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(13.67f, 12.25f);
        pathBuilder.close();
        pathBuilder.moveTo(18.26f, 7.66f);
        pathBuilder.lineTo(17.2f, 8.72f);
        pathBuilder.lineToRelative(-3.54f, -3.54f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.lineTo(18.26f, 7.66f);
        pathBuilder.close();
        pathBuilder.moveTo(20.38f, 5.54f);
        pathBuilder.lineTo(19.32f, 6.6f);
        pathBuilder.lineToRelative(-3.54f, -3.54f);
        pathBuilder.lineTo(16.85f, 2.0f);
        pathBuilder.lineTo(20.38f, 5.54f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(15.44f, 0.59f);
        pathBuilder2.lineToRelative(-3.18f, 3.18f);
        pathBuilder2.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilder2.lineToRelative(1.24f, 1.24f);
        pathBuilder2.lineToRelative(-0.71f, 0.71f);
        pathBuilder2.lineTo(11.55f, 7.3f);
        pathBuilder2.curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        pathBuilder2.lineTo(7.3f, 8.72f);
        pathBuilder2.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilder2.lineToRelative(1.24f, 1.24f);
        pathBuilder2.lineToRelative(-0.71f, 0.71f);
        pathBuilder2.lineTo(6.6f, 12.25f);
        pathBuilder2.curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        pathBuilder2.lineToRelative(-3.18f, 3.18f);
        pathBuilder2.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilder2.lineToRelative(3.54f, 3.54f);
        pathBuilder2.curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        pathBuilder2.lineToRelative(3.18f, -3.18f);
        pathBuilder2.curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        pathBuilder2.lineToRelative(-1.24f, -1.24f);
        pathBuilder2.lineToRelative(0.71f, -0.71f);
        pathBuilder2.lineToRelative(1.24f, 1.24f);
        pathBuilder2.curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        pathBuilder2.lineTo(13.84f, 9.6f);
        pathBuilder2.lineToRelative(0.71f, -0.71f);
        pathBuilder2.lineToRelative(1.24f, 1.24f);
        pathBuilder2.curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        pathBuilder2.lineToRelative(3.18f, -3.18f);
        pathBuilder2.curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        pathBuilder2.lineToRelative(-3.54f, -3.54f);
        pathBuilder2.curveTo(17.48f, -0.2f, 16.22f, -0.2f, 15.44f, 0.59f);
        pathBuilder2.close();
        pathBuilder2.moveTo(6.6f, 19.32f);
        pathBuilder2.lineToRelative(-1.06f, 1.06f);
        pathBuilder2.lineTo(2.0f, 16.85f);
        pathBuilder2.lineToRelative(1.06f, -1.06f);
        pathBuilder2.lineTo(6.6f, 19.32f);
        pathBuilder2.close();
        pathBuilder2.moveTo(8.72f, 17.2f);
        pathBuilder2.lineToRelative(-1.06f, 1.06f);
        pathBuilder2.lineToRelative(-3.54f, -3.54f);
        pathBuilder2.lineToRelative(1.06f, -1.06f);
        pathBuilder2.lineTo(8.72f, 17.2f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.67f, 12.25f);
        pathBuilder2.lineToRelative(-1.41f, 1.41f);
        pathBuilder2.lineToRelative(-3.54f, -3.54f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineTo(13.67f, 12.25f);
        pathBuilder2.close();
        pathBuilder2.moveTo(18.26f, 7.66f);
        pathBuilder2.lineTo(17.2f, 8.72f);
        pathBuilder2.lineToRelative(-3.54f, -3.54f);
        pathBuilder2.lineToRelative(1.06f, -1.06f);
        pathBuilder2.lineTo(18.26f, 7.66f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.38f, 5.54f);
        pathBuilder2.lineTo(19.32f, 6.6f);
        pathBuilder2.lineToRelative(-3.54f, -3.54f);
        pathBuilder2.lineTo(16.85f, 2.0f);
        pathBuilder2.lineTo(20.38f, 5.54f);
        pathBuilder2.close();
        pathBuilder2.moveTo(21.0f, 14.0f);
        pathBuilder2.lineToRelative(2.0f, 0.0f);
        pathBuilder2.curveToRelative(0.0f, 4.97f, -4.03f, 9.0f, -9.0f, 9.0f);
        pathBuilder2.lineToRelative(0.0f, -2.0f);
        pathBuilder2.curveTo(17.87f, 21.0f, 21.0f, 17.87f, 21.0f, 14.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.0f, 14.0f);
        pathBuilder2.lineToRelative(2.0f, 0.0f);
        pathBuilder2.curveToRelative(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f);
        pathBuilder2.lineToRelative(0.0f, -2.0f);
        pathBuilder2.curveTo(15.66f, 17.0f, 17.0f, 15.66f, 17.0f, 14.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _satelliteAlt = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
