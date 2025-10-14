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

/* compiled from: VideoSettings.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_videoSettings", "Landroidx/compose/ui/graphics/vector/ImageVector;", "VideoSettings", "Landroidx/compose/material/icons/Icons$TwoTone;", "getVideoSettings", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nVideoSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoSettings.kt\nandroidx/compose/material/icons/twotone/VideoSettingsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,104:1\n212#2,12:105\n233#2,18:118\n253#2:155\n233#2,18:156\n253#2:193\n233#2,18:194\n253#2:231\n174#3:117\n705#4,2:136\n717#4,2:138\n719#4,11:144\n705#4,2:174\n717#4,2:176\n719#4,11:182\n705#4,2:212\n717#4,2:214\n719#4,11:220\n72#5,4:140\n72#5,4:178\n72#5,4:216\n*S KotlinDebug\n*F\n+ 1 VideoSettings.kt\nandroidx/compose/material/icons/twotone/VideoSettingsKt\n*L\n29#1:105,12\n30#1:118,18\n30#1:155\n47#1:156,18\n47#1:193\n53#1:194,18\n53#1:231\n29#1:117\n30#1:136,2\n30#1:138,2\n30#1:144,11\n47#1:174,2\n47#1:176,2\n47#1:182,11\n53#1:212,2\n53#1:214,2\n53#1:220,11\n30#1:140,4\n47#1:178,4\n53#1:216,4\n*E\n"})
/* loaded from: classes2.dex */
public final class VideoSettingsKt {

    @Nullable
    private static ImageVector _videoSettings;

    @NotNull
    public static final ImageVector getVideoSettings(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _videoSettings;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.VideoSettings", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.curveTo(1.9f, 4.0f, 1.0f, 4.9f, 1.0f, 6.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(15.0f, 12.0f);
        pathBuilder2.lineToRelative(-6.0f, -4.0f);
        pathBuilder2.lineToRelative(0.0f, 8.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(22.71f, 18.43f);
        pathBuilder3.curveToRelative(0.03f, -0.29f, 0.04f, -0.58f, 0.01f, -0.86f);
        pathBuilder3.lineToRelative(1.07f, -0.85f);
        pathBuilder3.curveToRelative(0.1f, -0.08f, 0.12f, -0.21f, 0.06f, -0.32f);
        pathBuilder3.lineToRelative(-1.03f, -1.79f);
        pathBuilder3.curveToRelative(-0.06f, -0.11f, -0.19f, -0.15f, -0.31f, -0.11f);
        pathBuilder3.lineTo(21.23f, 15.0f);
        pathBuilder3.curveToRelative(-0.23f, -0.17f, -0.48f, -0.31f, -0.75f, -0.42f);
        pathBuilder3.lineToRelative(-0.2f, -1.36f);
        pathBuilder3.curveTo(20.26f, 13.09f, 20.16f, 13.0f, 20.03f, 13.0f);
        pathBuilder3.horizontalLineToRelative(-2.07f);
        pathBuilder3.curveToRelative(-0.12f, 0.0f, -0.23f, 0.09f, -0.25f, 0.21f);
        pathBuilder3.lineToRelative(-0.2f, 1.36f);
        pathBuilder3.curveToRelative(-0.26f, 0.11f, -0.51f, 0.26f, -0.74f, 0.42f);
        pathBuilder3.lineToRelative(-1.28f, -0.5f);
        pathBuilder3.curveToRelative(-0.12f, -0.05f, -0.25f, 0.0f, -0.31f, 0.11f);
        pathBuilder3.lineToRelative(-1.03f, 1.79f);
        pathBuilder3.curveToRelative(-0.06f, 0.11f, -0.04f, 0.24f, 0.06f, 0.32f);
        pathBuilder3.lineToRelative(1.07f, 0.86f);
        pathBuilder3.curveToRelative(-0.03f, 0.29f, -0.04f, 0.58f, -0.01f, 0.86f);
        pathBuilder3.lineToRelative(-1.07f, 0.85f);
        pathBuilder3.curveToRelative(-0.1f, 0.08f, -0.12f, 0.21f, -0.06f, 0.32f);
        pathBuilder3.lineToRelative(1.03f, 1.79f);
        pathBuilder3.curveToRelative(0.06f, 0.11f, 0.19f, 0.15f, 0.31f, 0.11f);
        pathBuilder3.lineToRelative(1.27f, -0.5f);
        pathBuilder3.curveToRelative(0.23f, 0.17f, 0.48f, 0.31f, 0.75f, 0.42f);
        pathBuilder3.lineToRelative(0.2f, 1.36f);
        pathBuilder3.curveToRelative(0.02f, 0.12f, 0.12f, 0.21f, 0.25f, 0.21f);
        pathBuilder3.horizontalLineToRelative(2.07f);
        pathBuilder3.curveToRelative(0.12f, 0.0f, 0.23f, -0.09f, 0.25f, -0.21f);
        pathBuilder3.lineToRelative(0.2f, -1.36f);
        pathBuilder3.curveToRelative(0.26f, -0.11f, 0.51f, -0.26f, 0.74f, -0.42f);
        pathBuilder3.lineToRelative(1.28f, 0.5f);
        pathBuilder3.curveToRelative(0.12f, 0.05f, 0.25f, 0.0f, 0.31f, -0.11f);
        pathBuilder3.lineToRelative(1.03f, -1.79f);
        pathBuilder3.curveToRelative(0.06f, -0.11f, 0.04f, -0.24f, -0.06f, -0.32f);
        pathBuilder3.lineTo(22.71f, 18.43f);
        pathBuilder3.close();
        pathBuilder3.moveTo(19.0f, 19.5f);
        pathBuilder3.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder3.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder3.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder3.reflectiveCurveTo(19.83f, 19.5f, 19.0f, 19.5f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _videoSettings = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
