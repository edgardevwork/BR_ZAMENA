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

/* compiled from: MonitorWeight.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_monitorWeight", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MonitorWeight", "Landroidx/compose/material/icons/Icons$TwoTone;", "getMonitorWeight", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMonitorWeight.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonitorWeight.kt\nandroidx/compose/material/icons/twotone/MonitorWeightKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,114:1\n212#2,12:115\n233#2,18:128\n253#2:165\n233#2,18:166\n253#2:203\n233#2,18:204\n253#2:241\n233#2,18:242\n253#2:279\n233#2,18:280\n253#2:317\n233#2,18:318\n253#2:355\n174#3:127\n705#4,2:146\n717#4,2:148\n719#4,11:154\n705#4,2:184\n717#4,2:186\n719#4,11:192\n705#4,2:222\n717#4,2:224\n719#4,11:230\n705#4,2:260\n717#4,2:262\n719#4,11:268\n705#4,2:298\n717#4,2:300\n719#4,11:306\n705#4,2:336\n717#4,2:338\n719#4,11:344\n72#5,4:150\n72#5,4:188\n72#5,4:226\n72#5,4:264\n72#5,4:302\n72#5,4:340\n*S KotlinDebug\n*F\n+ 1 MonitorWeight.kt\nandroidx/compose/material/icons/twotone/MonitorWeightKt\n*L\n29#1:115,12\n30#1:128,18\n30#1:165\n37#1:166,18\n37#1:203\n44#1:204,18\n44#1:241\n51#1:242,18\n51#1:279\n65#1:280,18\n65#1:317\n91#1:318,18\n91#1:355\n29#1:127\n30#1:146,2\n30#1:148,2\n30#1:154,11\n37#1:184,2\n37#1:186,2\n37#1:192,11\n44#1:222,2\n44#1:224,2\n44#1:230,11\n51#1:260,2\n51#1:262,2\n51#1:268,11\n65#1:298,2\n65#1:300,2\n65#1:306,11\n91#1:336,2\n91#1:338,2\n91#1:344,11\n30#1:150,4\n37#1:188,4\n44#1:226,4\n51#1:264,4\n65#1:302,4\n91#1:340,4\n*E\n"})
/* loaded from: classes4.dex */
public final class MonitorWeightKt {

    @Nullable
    private static ImageVector _monitorWeight;

    @NotNull
    public static final ImageVector getMonitorWeight(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _monitorWeight;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.MonitorWeight", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 8.5f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(10.0f, 8.5f);
        pathBuilder2.horizontalLineToRelative(1.0f);
        pathBuilder2.verticalLineToRelative(1.0f);
        pathBuilder2.horizontalLineToRelative(-1.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(11.5f, 8.5f);
        pathBuilder3.horizontalLineToRelative(1.0f);
        pathBuilder3.verticalLineToRelative(1.0f);
        pathBuilder3.horizontalLineToRelative(-1.0f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(5.0f, 19.0f);
        pathBuilder4.horizontalLineToRelative(14.0f);
        pathBuilder4.verticalLineTo(5.0f);
        pathBuilder4.horizontalLineTo(5.0f);
        pathBuilder4.verticalLineTo(19.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(12.0f, 6.0f);
        pathBuilder4.curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder4.reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f);
        pathBuilder4.reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder4.reflectiveCurveTo(10.34f, 6.0f, 12.0f, 6.0f);
        pathBuilder4.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(12.0f, 12.0f);
        pathBuilder5.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder5.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder5.reflectiveCurveTo(9.0f, 7.34f, 9.0f, 9.0f);
        pathBuilder5.reflectiveCurveTo(10.34f, 12.0f, 12.0f, 12.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(13.0f, 8.5f);
        pathBuilder5.horizontalLineToRelative(1.0f);
        pathBuilder5.verticalLineToRelative(1.0f);
        pathBuilder5.horizontalLineToRelative(-1.0f);
        pathBuilder5.verticalLineTo(8.5f);
        pathBuilder5.close();
        pathBuilder5.moveTo(11.5f, 8.5f);
        pathBuilder5.horizontalLineToRelative(1.0f);
        pathBuilder5.verticalLineToRelative(1.0f);
        pathBuilder5.horizontalLineToRelative(-1.0f);
        pathBuilder5.verticalLineTo(8.5f);
        pathBuilder5.close();
        pathBuilder5.moveTo(10.0f, 8.5f);
        pathBuilder5.horizontalLineToRelative(1.0f);
        pathBuilder5.verticalLineToRelative(1.0f);
        pathBuilder5.horizontalLineToRelative(-1.0f);
        pathBuilder5.verticalLineTo(8.5f);
        pathBuilder5.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw5, iM11702getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType6 = VectorKt.getDefaultFillType();
        SolidColor solidColor6 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw6 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk86 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(19.0f, 3.0f);
        pathBuilder6.horizontalLineTo(5.0f);
        pathBuilder6.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilder6.verticalLineToRelative(14.0f);
        pathBuilder6.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder6.horizontalLineToRelative(14.0f);
        pathBuilder6.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder6.verticalLineTo(5.0f);
        pathBuilder6.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        pathBuilder6.close();
        pathBuilder6.moveTo(19.0f, 19.0f);
        pathBuilder6.horizontalLineTo(5.0f);
        pathBuilder6.verticalLineTo(5.0f);
        pathBuilder6.horizontalLineToRelative(14.0f);
        pathBuilder6.verticalLineTo(19.0f);
        pathBuilder6.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder6.getNodes(), defaultFillType6, "", solidColor6, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw6, iM11702getBevelLxFBmk86, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _monitorWeight = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
