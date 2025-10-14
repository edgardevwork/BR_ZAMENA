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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AirplaneTicket.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7105d2 = {"_airplaneTicket", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AirplaneTicket", "Landroidx/compose/material/icons/Icons$TwoTone;", "getAirplaneTicket$annotations", "(Landroidx/compose/material/icons/Icons$TwoTone;)V", "getAirplaneTicket", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAirplaneTicket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AirplaneTicket.kt\nandroidx/compose/material/icons/twotone/AirplaneTicketKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,104:1\n212#2,12:105\n233#2,18:118\n253#2:155\n233#2,18:156\n253#2:193\n233#2,18:194\n253#2:231\n174#3:117\n705#4,2:136\n717#4,2:138\n719#4,11:144\n705#4,2:174\n717#4,2:176\n719#4,11:182\n705#4,2:212\n717#4,2:214\n719#4,11:220\n72#5,4:140\n72#5,4:178\n72#5,4:216\n*S KotlinDebug\n*F\n+ 1 AirplaneTicket.kt\nandroidx/compose/material/icons/twotone/AirplaneTicketKt\n*L\n35#1:105,12\n36#1:118,18\n36#1:155\n60#1:156,18\n60#1:193\n84#1:194,18\n84#1:231\n35#1:117\n36#1:136,2\n36#1:138,2\n36#1:144,11\n60#1:174,2\n60#1:176,2\n60#1:182,11\n84#1:212,2\n84#1:214,2\n84#1:220,11\n36#1:140,4\n60#1:178,4\n84#1:216,4\n*E\n"})
/* loaded from: classes3.dex */
public final class AirplaneTicketKt {

    @Nullable
    private static ImageVector _airplaneTicket;

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.TwoTone.AirplaneTicket", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.TwoTone.AirplaneTicket", imports = {"androidx.compose.material.icons.automirrored.twotone.AirplaneTicket"}))
    public static /* synthetic */ void getAirplaneTicket$annotations(Icons.TwoTone twoTone) {
    }

    @NotNull
    public static final ImageVector getAirplaneTicket(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _airplaneTicket;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AirplaneTicket", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.01f, 8.54f);
        pathBuilder.curveTo(5.2f, 9.23f, 6.0f, 10.52f, 6.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.47f, -0.81f, 2.77f, -2.0f, 3.46f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.lineTo(4.01f, 8.54f);
        pathBuilder.close();
        pathBuilder.moveTo(8.14f, 12.53f);
        pathBuilder.lineToRelative(1.26f, 0.99f);
        pathBuilder.lineToRelative(2.39f, -0.64f);
        pathBuilder.lineToRelative(-2.4f, -4.16f);
        pathBuilder.lineToRelative(1.4f, -0.38f);
        pathBuilder.lineToRelative(4.01f, 3.74f);
        pathBuilder.lineToRelative(2.44f, -0.65f);
        pathBuilder.curveToRelative(0.51f, -0.14f, 1.04f, 0.17f, 1.18f, 0.68f);
        pathBuilder.curveToRelative(0.13f, 0.51f, -0.17f, 1.04f, -0.69f, 1.19f);
        pathBuilder.lineToRelative(-8.86f, 2.36f);
        pathBuilder.lineToRelative(-1.66f, -2.88f);
        pathBuilder.lineTo(8.14f, 12.53f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.19f, 4.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.curveTo(2.9f, 4.0f, 2.01f, 4.9f, 2.01f, 6.0f);
        pathBuilder2.verticalLineToRelative(4.0f);
        pathBuilder2.curveTo(3.11f, 10.0f, 4.0f, 10.9f, 4.0f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(4.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.verticalLineTo(6.0f);
        pathBuilder2.curveTo(22.0f, 4.9f, 21.19f, 4.0f, 20.19f, 4.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.0f, 18.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.verticalLineToRelative(-2.54f);
        pathBuilder2.curveToRelative(1.19f, -0.69f, 2.0f, -1.99f, 2.0f, -3.46f);
        pathBuilder2.curveToRelative(0.0f, -1.48f, -0.8f, -2.77f, -1.99f, -3.46f);
        pathBuilder2.lineTo(4.0f, 6.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.verticalLineTo(18.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(17.73f, 13.3f);
        pathBuilder3.curveToRelative(0.52f, -0.15f, 0.82f, -0.68f, 0.69f, -1.19f);
        pathBuilder3.curveToRelative(-0.14f, -0.51f, -0.67f, -0.82f, -1.18f, -0.68f);
        pathBuilder3.lineToRelative(-2.44f, 0.65f);
        pathBuilder3.lineToRelative(-4.01f, -3.74f);
        pathBuilder3.lineToRelative(-1.4f, 0.38f);
        pathBuilder3.lineToRelative(2.4f, 4.16f);
        pathBuilder3.lineTo(9.4f, 13.52f);
        pathBuilder3.lineToRelative(-1.26f, -0.99f);
        pathBuilder3.lineToRelative(-0.93f, 0.25f);
        pathBuilder3.lineToRelative(1.66f, 2.88f);
        pathBuilder3.lineTo(17.73f, 13.3f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airplaneTicket = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
