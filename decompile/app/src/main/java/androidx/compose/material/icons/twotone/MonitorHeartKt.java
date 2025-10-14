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

/* compiled from: MonitorHeart.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_monitorHeart", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MonitorHeart", "Landroidx/compose/material/icons/Icons$TwoTone;", "getMonitorHeart", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMonitorHeart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonitorHeart.kt\nandroidx/compose/material/icons/twotone/MonitorHeartKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,121:1\n212#2,12:122\n233#2,18:135\n253#2:172\n233#2,18:173\n253#2:210\n233#2,18:211\n253#2:248\n233#2,18:249\n253#2:286\n233#2,18:287\n253#2:324\n174#3:134\n705#4,2:153\n717#4,2:155\n719#4,11:161\n705#4,2:191\n717#4,2:193\n719#4,11:199\n705#4,2:229\n717#4,2:231\n719#4,11:237\n705#4,2:267\n717#4,2:269\n719#4,11:275\n705#4,2:305\n717#4,2:307\n719#4,11:313\n72#5,4:157\n72#5,4:195\n72#5,4:233\n72#5,4:271\n72#5,4:309\n*S KotlinDebug\n*F\n+ 1 MonitorHeart.kt\nandroidx/compose/material/icons/twotone/MonitorHeartKt\n*L\n29#1:122,12\n30#1:135,18\n30#1:172\n49#1:173,18\n49#1:210\n67#1:211,18\n67#1:248\n81#1:249,18\n81#1:286\n95#1:287,18\n95#1:324\n29#1:134\n30#1:153,2\n30#1:155,2\n30#1:161,11\n49#1:191,2\n49#1:193,2\n49#1:199,11\n67#1:229,2\n67#1:231,2\n67#1:237,11\n81#1:267,2\n81#1:269,2\n81#1:275,11\n95#1:305,2\n95#1:307,2\n95#1:313,11\n30#1:157,4\n49#1:195,4\n67#1:233,4\n81#1:271,4\n95#1:309,4\n*E\n"})
/* loaded from: classes4.dex */
public final class MonitorHeartKt {

    @Nullable
    private static ImageVector _monitorHeart;

    @NotNull
    public static final ImageVector getMonitorHeart(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _monitorHeart;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.MonitorHeart", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.11f, 12.45f);
        pathBuilder.lineTo(14.0f, 10.24f);
        pathBuilder.lineToRelative(-3.11f, 6.21f);
        pathBuilder.curveTo(10.72f, 16.79f, 10.38f, 17.0f, 10.0f, 17.0f);
        pathBuilder.reflectiveCurveToRelative(-0.72f, -0.21f, -0.89f, -0.55f);
        pathBuilder.lineTo(7.38f, 13.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-6.0f);
        pathBuilder.curveTo(15.62f, 13.0f, 15.28f, 12.79f, 15.11f, 12.45f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.0f, 6.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.verticalLineToRelative(3.0f);
        pathBuilder2.horizontalLineTo(2.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(6.0f);
        pathBuilder2.curveToRelative(0.38f, 0.0f, 0.72f, 0.21f, 0.89f, 0.55f);
        pathBuilder2.lineTo(10.0f, 13.76f);
        pathBuilder2.lineToRelative(3.11f, -6.21f);
        pathBuilder2.curveToRelative(0.34f, -0.68f, 1.45f, -0.68f, 1.79f, 0.0f);
        pathBuilder2.lineTo(16.62f, 11.0f);
        pathBuilder2.horizontalLineTo(22.0f);
        pathBuilder2.verticalLineTo(9.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.verticalLineTo(6.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(20.0f, 4.0f);
        pathBuilder3.horizontalLineTo(4.0f);
        pathBuilder3.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        pathBuilder3.verticalLineToRelative(3.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder3.verticalLineTo(6.0f);
        pathBuilder3.horizontalLineToRelative(16.0f);
        pathBuilder3.verticalLineToRelative(3.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder3.verticalLineTo(6.0f);
        pathBuilder3.curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(20.0f, 18.0f);
        pathBuilder4.horizontalLineTo(4.0f);
        pathBuilder4.verticalLineToRelative(-3.0f);
        pathBuilder4.horizontalLineTo(2.0f);
        pathBuilder4.verticalLineToRelative(3.0f);
        pathBuilder4.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder4.horizontalLineToRelative(16.0f);
        pathBuilder4.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder4.verticalLineToRelative(-3.0f);
        pathBuilder4.horizontalLineToRelative(-2.0f);
        pathBuilder4.verticalLineTo(18.0f);
        pathBuilder4.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(14.89f, 7.55f);
        pathBuilder5.curveToRelative(-0.34f, -0.68f, -1.45f, -0.68f, -1.79f, 0.0f);
        pathBuilder5.lineTo(10.0f, 13.76f);
        pathBuilder5.lineToRelative(-1.11f, -2.21f);
        pathBuilder5.curveTo(8.72f, 11.21f, 8.38f, 11.0f, 8.0f, 11.0f);
        pathBuilder5.horizontalLineTo(2.0f);
        pathBuilder5.verticalLineToRelative(2.0f);
        pathBuilder5.horizontalLineToRelative(5.38f);
        pathBuilder5.lineToRelative(1.72f, 3.45f);
        pathBuilder5.curveTo(9.28f, 16.79f, 9.62f, 17.0f, 10.0f, 17.0f);
        pathBuilder5.reflectiveCurveToRelative(0.72f, -0.21f, 0.89f, -0.55f);
        pathBuilder5.lineTo(14.0f, 10.24f);
        pathBuilder5.lineToRelative(1.11f, 2.21f);
        pathBuilder5.curveTo(15.28f, 12.79f, 15.62f, 13.0f, 16.0f, 13.0f);
        pathBuilder5.horizontalLineToRelative(6.0f);
        pathBuilder5.verticalLineToRelative(-2.0f);
        pathBuilder5.horizontalLineToRelative(-5.38f);
        pathBuilder5.lineTo(14.89f, 7.55f);
        pathBuilder5.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw5, iM11702getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _monitorHeart = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
