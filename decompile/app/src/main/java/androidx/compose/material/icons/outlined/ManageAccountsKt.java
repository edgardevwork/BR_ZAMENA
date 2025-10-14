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

/* compiled from: ManageAccounts.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_manageAccounts", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ManageAccounts", "Landroidx/compose/material/icons/Icons$Outlined;", "getManageAccounts", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nManageAccounts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageAccounts.kt\nandroidx/compose/material/icons/outlined/ManageAccountsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,101:1\n212#2,12:102\n233#2,18:115\n253#2:152\n233#2,18:153\n253#2:190\n233#2,18:191\n253#2:228\n174#3:114\n705#4,2:133\n717#4,2:135\n719#4,11:141\n705#4,2:171\n717#4,2:173\n719#4,11:179\n705#4,2:209\n717#4,2:211\n719#4,11:217\n72#5,4:137\n72#5,4:175\n72#5,4:213\n*S KotlinDebug\n*F\n+ 1 ManageAccounts.kt\nandroidx/compose/material/icons/outlined/ManageAccountsKt\n*L\n29#1:102,12\n30#1:115,18\n30#1:152\n46#1:153,18\n46#1:190\n60#1:191,18\n60#1:228\n29#1:114\n30#1:133,2\n30#1:135,2\n30#1:141,11\n46#1:171,2\n46#1:173,2\n46#1:179,11\n60#1:209,2\n60#1:211,2\n60#1:217,11\n30#1:137,4\n46#1:175,4\n60#1:213,4\n*E\n"})
/* loaded from: classes2.dex */
public final class ManageAccountsKt {

    @Nullable
    private static ImageVector _manageAccounts;

    @NotNull
    public static final ImageVector getManageAccounts(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _manageAccounts;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ManageAccounts", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.0f, 18.0f);
        pathBuilder.verticalLineToRelative(-0.65f);
        pathBuilder.curveToRelative(0.0f, -0.34f, 0.16f, -0.66f, 0.41f, -0.81f);
        pathBuilder.curveTo(6.1f, 15.53f, 8.03f, 15.0f, 10.0f, 15.0f);
        pathBuilder.curveToRelative(0.03f, 0.0f, 0.05f, 0.0f, 0.08f, 0.01f);
        pathBuilder.curveToRelative(0.1f, -0.7f, 0.3f, -1.37f, 0.59f, -1.98f);
        pathBuilder.curveTo(10.45f, 13.01f, 10.23f, 13.0f, 10.0f, 13.0f);
        pathBuilder.curveToRelative(-2.42f, 0.0f, -4.68f, 0.67f, -6.61f, 1.82f);
        pathBuilder.curveTo(2.51f, 15.34f, 2.0f, 16.32f, 2.0f, 17.35f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.horizontalLineToRelative(9.26f);
        pathBuilder.curveToRelative(-0.42f, -0.6f, -0.75f, -1.28f, -0.97f, -2.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(10.0f, 12.0f);
        pathBuilder2.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder2.curveTo(7.79f, 4.0f, 6.0f, 5.79f, 6.0f, 8.0f);
        pathBuilder2.reflectiveCurveTo(7.79f, 12.0f, 10.0f, 12.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(10.0f, 6.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder2.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder2.reflectiveCurveTo(8.9f, 6.0f, 10.0f, 6.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(20.75f, 16.0f);
        pathBuilder3.curveToRelative(0.0f, -0.22f, -0.03f, -0.42f, -0.06f, -0.63f);
        pathBuilder3.lineToRelative(1.14f, -1.01f);
        pathBuilder3.lineToRelative(-1.0f, -1.73f);
        pathBuilder3.lineToRelative(-1.45f, 0.49f);
        pathBuilder3.curveToRelative(-0.32f, -0.27f, -0.68f, -0.48f, -1.08f, -0.63f);
        pathBuilder3.lineTo(18.0f, 11.0f);
        pathBuilder3.horizontalLineToRelative(-2.0f);
        pathBuilder3.lineToRelative(-0.3f, 1.49f);
        pathBuilder3.curveToRelative(-0.4f, 0.15f, -0.76f, 0.36f, -1.08f, 0.63f);
        pathBuilder3.lineToRelative(-1.45f, -0.49f);
        pathBuilder3.lineToRelative(-1.0f, 1.73f);
        pathBuilder3.lineToRelative(1.14f, 1.01f);
        pathBuilder3.curveToRelative(-0.03f, 0.21f, -0.06f, 0.41f, -0.06f, 0.63f);
        pathBuilder3.reflectiveCurveToRelative(0.03f, 0.42f, 0.06f, 0.63f);
        pathBuilder3.lineToRelative(-1.14f, 1.01f);
        pathBuilder3.lineToRelative(1.0f, 1.73f);
        pathBuilder3.lineToRelative(1.45f, -0.49f);
        pathBuilder3.curveToRelative(0.32f, 0.27f, 0.68f, 0.48f, 1.08f, 0.63f);
        pathBuilder3.lineTo(16.0f, 21.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder3.lineToRelative(0.3f, -1.49f);
        pathBuilder3.curveToRelative(0.4f, -0.15f, 0.76f, -0.36f, 1.08f, -0.63f);
        pathBuilder3.lineToRelative(1.45f, 0.49f);
        pathBuilder3.lineToRelative(1.0f, -1.73f);
        pathBuilder3.lineToRelative(-1.14f, -1.01f);
        pathBuilder3.curveTo(20.72f, 16.42f, 20.75f, 16.22f, 20.75f, 16.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(17.0f, 18.0f);
        pathBuilder3.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder3.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder3.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder3.reflectiveCurveTo(18.1f, 18.0f, 17.0f, 18.0f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _manageAccounts = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
