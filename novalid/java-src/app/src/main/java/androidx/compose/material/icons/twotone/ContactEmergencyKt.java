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

/* compiled from: ContactEmergency.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_contactEmergency", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ContactEmergency", "Landroidx/compose/material/icons/Icons$TwoTone;", "getContactEmergency", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nContactEmergency.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactEmergency.kt\nandroidx/compose/material/icons/twotone/ContactEmergencyKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,133:1\n212#2,12:134\n233#2,18:147\n253#2:184\n233#2,18:185\n253#2:222\n233#2,18:223\n253#2:260\n233#2,18:261\n253#2:298\n174#3:146\n705#4,2:165\n717#4,2:167\n719#4,11:173\n705#4,2:203\n717#4,2:205\n719#4,11:211\n705#4,2:241\n717#4,2:243\n719#4,11:249\n705#4,2:279\n717#4,2:281\n719#4,11:287\n72#5,4:169\n72#5,4:207\n72#5,4:245\n72#5,4:283\n*S KotlinDebug\n*F\n+ 1 ContactEmergency.kt\nandroidx/compose/material/icons/twotone/ContactEmergencyKt\n*L\n29#1:134,12\n30#1:147,18\n30#1:184\n67#1:185,18\n67#1:222\n81#1:223,18\n81#1:260\n107#1:261,18\n107#1:298\n29#1:146\n30#1:165,2\n30#1:167,2\n30#1:173,11\n67#1:203,2\n67#1:205,2\n67#1:211,11\n81#1:241,2\n81#1:243,2\n81#1:249,11\n107#1:279,2\n107#1:281,2\n107#1:287,11\n30#1:169,4\n67#1:207,4\n81#1:245,4\n107#1:283,4\n*E\n"})
/* loaded from: classes2.dex */
public final class ContactEmergencyKt {

    @Nullable
    private static ImageVector _contactEmergency;

    @NotNull
    public static final ImageVector getContactEmergency(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _contactEmergency;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ContactEmergency", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(0.08f);
        pathBuilder.curveToRelative(1.38f, -2.39f, 3.96f, -4.0f, 6.92f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(5.54f, 1.61f, 6.92f, 4.0f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.03f, 8.15f);
        pathBuilder.lineToRelative(0.75f, -1.3f);
        pathBuilder.lineToRelative(1.47f, 0.85f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.verticalLineToRelative(1.7f);
        pathBuilder.lineToRelative(1.47f, -0.85f);
        pathBuilder.lineToRelative(0.75f, 1.3f);
        pathBuilder.lineTo(19.5f, 9.0f);
        pathBuilder.lineToRelative(1.47f, 0.85f);
        pathBuilder.lineToRelative(-0.75f, 1.3f);
        pathBuilder.lineToRelative(-1.47f, -0.85f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.verticalLineToRelative(-1.7f);
        pathBuilder.lineToRelative(-1.47f, 0.85f);
        pathBuilder.lineToRelative(-0.75f, -1.3f);
        pathBuilder.lineTo(16.5f, 9.0f);
        pathBuilder.lineTo(15.03f, 8.15f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 8.0f);
        pathBuilder.curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-1.35f, 3.0f, -3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-3.0f, -1.35f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveTo(7.35f, 8.0f, 9.0f, 8.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(9.0f, 14.0f);
        pathBuilder2.curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.35f, -3.0f, -3.0f, -3.0f);
        pathBuilder2.reflectiveCurveToRelative(-3.0f, 1.35f, -3.0f, 3.0f);
        pathBuilder2.reflectiveCurveTo(7.35f, 14.0f, 9.0f, 14.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(9.0f, 10.0f);
        pathBuilder2.curveToRelative(0.54f, 0.0f, 1.0f, 0.46f, 1.0f, 1.0f);
        pathBuilder2.reflectiveCurveToRelative(-0.46f, 1.0f, -1.0f, 1.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.0f, -0.46f, -1.0f, -1.0f);
        pathBuilder2.reflectiveCurveTo(8.46f, 10.0f, 9.0f, 10.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(22.0f, 3.0f);
        pathBuilder3.horizontalLineTo(2.0f);
        pathBuilder3.curveTo(0.9f, 3.0f, 0.0f, 3.9f, 0.0f, 5.0f);
        pathBuilder3.verticalLineToRelative(14.0f);
        pathBuilder3.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder3.horizontalLineToRelative(20.0f);
        pathBuilder3.curveToRelative(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
        pathBuilder3.lineTo(24.0f, 5.0f);
        pathBuilder3.curveTo(24.0f, 3.9f, 23.1f, 3.0f, 22.0f, 3.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(4.54f, 19.0f);
        pathBuilder3.curveToRelative(1.1f, -1.22f, 2.69f, -2.0f, 4.46f, -2.0f);
        pathBuilder3.reflectiveCurveToRelative(3.36f, 0.78f, 4.46f, 2.0f);
        pathBuilder3.horizontalLineTo(4.54f);
        pathBuilder3.close();
        pathBuilder3.moveTo(22.0f, 19.0f);
        pathBuilder3.horizontalLineToRelative(-6.08f);
        pathBuilder3.curveToRelative(-1.38f, -2.39f, -3.96f, -4.0f, -6.92f, -4.0f);
        pathBuilder3.reflectiveCurveToRelative(-5.54f, 1.61f, -6.92f, 4.0f);
        pathBuilder3.horizontalLineTo(2.0f);
        pathBuilder3.verticalLineTo(5.0f);
        pathBuilder3.horizontalLineToRelative(20.0f);
        pathBuilder3.verticalLineTo(19.0f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(15.78f, 11.15f);
        pathBuilder4.lineToRelative(1.47f, -0.85f);
        pathBuilder4.lineToRelative(0.0f, 1.7f);
        pathBuilder4.lineToRelative(1.5f, 0.0f);
        pathBuilder4.lineToRelative(0.0f, -1.7f);
        pathBuilder4.lineToRelative(1.47f, 0.85f);
        pathBuilder4.lineToRelative(0.75f, -1.3f);
        pathBuilder4.lineToRelative(-1.47f, -0.85f);
        pathBuilder4.lineToRelative(1.47f, -0.85f);
        pathBuilder4.lineToRelative(-0.75f, -1.3f);
        pathBuilder4.lineToRelative(-1.47f, 0.85f);
        pathBuilder4.lineToRelative(0.0f, -1.7f);
        pathBuilder4.lineToRelative(-1.5f, 0.0f);
        pathBuilder4.lineToRelative(0.0f, 1.7f);
        pathBuilder4.lineToRelative(-1.47f, -0.85f);
        pathBuilder4.lineToRelative(-0.75f, 1.3f);
        pathBuilder4.lineToRelative(1.47f, 0.85f);
        pathBuilder4.lineToRelative(-1.47f, 0.85f);
        pathBuilder4.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contactEmergency = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
