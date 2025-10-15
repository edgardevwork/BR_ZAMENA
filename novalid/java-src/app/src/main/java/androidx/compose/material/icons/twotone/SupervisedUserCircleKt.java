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

/* compiled from: SupervisedUserCircle.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_supervisedUserCircle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SupervisedUserCircle", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSupervisedUserCircle", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSupervisedUserCircle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupervisedUserCircle.kt\nandroidx/compose/material/icons/twotone/SupervisedUserCircleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,111:1\n212#2,12:112\n233#2,18:125\n253#2:162\n233#2,18:163\n253#2:200\n233#2,18:201\n253#2:238\n174#3:124\n705#4,2:143\n717#4,2:145\n719#4,11:151\n705#4,2:181\n717#4,2:183\n719#4,11:189\n705#4,2:219\n717#4,2:221\n719#4,11:227\n72#5,4:147\n72#5,4:185\n72#5,4:223\n*S KotlinDebug\n*F\n+ 1 SupervisedUserCircle.kt\nandroidx/compose/material/icons/twotone/SupervisedUserCircleKt\n*L\n29#1:112,12\n30#1:125,18\n30#1:162\n36#1:163,18\n36#1:200\n65#1:201,18\n65#1:238\n29#1:124\n30#1:143,2\n30#1:145,2\n30#1:151,11\n36#1:181,2\n36#1:183,2\n36#1:189,11\n65#1:219,2\n65#1:221,2\n65#1:227,11\n30#1:147,4\n36#1:185,4\n65#1:223,4\n*E\n"})
/* loaded from: classes4.dex */
public final class SupervisedUserCircleKt {

    @Nullable
    private static ImageVector _supervisedUserCircle;

    @NotNull
    public static final ImageVector getSupervisedUserCircle(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _supervisedUserCircle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SupervisedUserCircle", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.5f, 10.0f);
        pathBuilder.moveToRelative(-1.0f, 0.0f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(11.5f, 17.21f);
        pathBuilder2.curveToRelative(0.0f, -1.88f, 2.98f, -2.7f, 4.5f, -2.7f);
        pathBuilder2.curveToRelative(0.88f, 0.0f, 2.24f, 0.27f, 3.24f, 0.87f);
        pathBuilder2.curveToRelative(0.48f, -1.02f, 0.75f, -2.16f, 0.75f, -3.37f);
        pathBuilder2.curveToRelative(0.0f, -4.41f, -3.59f, -8.0f, -8.0f, -8.0f);
        pathBuilder2.reflectiveCurveToRelative(-8.0f, 3.59f, -8.0f, 8.0f);
        pathBuilder2.curveToRelative(0.0f, 1.23f, 0.29f, 2.39f, 0.78f, 3.43f);
        pathBuilder2.curveToRelative(1.34f, -0.98f, 3.43f, -1.43f, 4.73f, -1.43f);
        pathBuilder2.curveToRelative(0.44f, 0.0f, 0.97f, 0.05f, 1.53f, 0.16f);
        pathBuilder2.curveToRelative(-0.63f, 0.57f, -1.06f, 1.22f, -1.3f, 1.86f);
        pathBuilder2.curveToRelative(-0.08f, 0.0f, -0.15f, -0.01f, -0.23f, -0.01f);
        pathBuilder2.curveToRelative(-1.38f, 0.0f, -2.98f, 0.57f, -3.66f, 1.11f);
        pathBuilder2.curveToRelative(1.37f, 1.65f, 3.39f, 2.73f, 5.66f, 2.86f);
        pathBuilder2.verticalLineToRelative(-2.78f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.0f, 9.0f);
        pathBuilder2.curveToRelative(1.11f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f);
        pathBuilder2.curveToRelative(0.0f, 1.11f, -0.89f, 2.0f, -2.0f, 2.0f);
        pathBuilder2.curveToRelative(-1.11f, 0.0f, -2.0f, -0.89f, -2.0f, -2.0f);
        pathBuilder2.curveToRelative(-0.01f, -1.11f, 0.89f, -2.0f, 2.0f, -2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(9.5f, 13.0f);
        pathBuilder2.curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f);
        pathBuilder2.reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f);
        pathBuilder2.reflectiveCurveToRelative(3.0f, 1.35f, 3.0f, 3.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.35f, 3.0f, -3.0f, 3.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(12.5f, 10.0f);
        pathBuilder3.curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f);
        pathBuilder3.reflectiveCurveToRelative(-3.0f, 1.35f, -3.0f, 3.0f);
        pathBuilder3.reflectiveCurveToRelative(1.35f, 3.0f, 3.0f, 3.0f);
        pathBuilder3.reflectiveCurveToRelative(3.0f, -1.35f, 3.0f, -3.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(9.5f, 11.0f);
        pathBuilder3.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder3.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder3.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder3.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(16.0f, 13.0f);
        pathBuilder3.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        pathBuilder3.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        pathBuilder3.curveToRelative(-1.11f, 0.0f, -2.01f, 0.89f, -2.0f, 2.0f);
        pathBuilder3.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(11.99f, 2.01f);
        pathBuilder3.curveToRelative(-5.52f, 0.0f, -10.0f, 4.48f, -10.0f, 10.0f);
        pathBuilder3.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder3.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder3.reflectiveCurveToRelative(-4.48f, -10.0f, -10.0f, -10.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(5.84f, 17.12f);
        pathBuilder3.curveToRelative(0.68f, -0.54f, 2.27f, -1.11f, 3.66f, -1.11f);
        pathBuilder3.curveToRelative(0.07f, 0.0f, 0.15f, 0.01f, 0.23f, 0.01f);
        pathBuilder3.curveToRelative(0.24f, -0.64f, 0.67f, -1.29f, 1.3f, -1.86f);
        pathBuilder3.curveToRelative(-0.56f, -0.1f, -1.09f, -0.16f, -1.53f, -0.16f);
        pathBuilder3.curveToRelative(-1.3f, 0.0f, -3.39f, 0.45f, -4.73f, 1.43f);
        pathBuilder3.curveToRelative(-0.5f, -1.04f, -0.78f, -2.2f, -0.78f, -3.43f);
        pathBuilder3.curveToRelative(0.0f, -4.41f, 3.59f, -8.0f, 8.0f, -8.0f);
        pathBuilder3.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilder3.curveToRelative(0.0f, 1.2f, -0.27f, 2.34f, -0.75f, 3.37f);
        pathBuilder3.curveToRelative(-1.0f, -0.59f, -2.36f, -0.87f, -3.24f, -0.87f);
        pathBuilder3.curveToRelative(-1.52f, 0.0f, -4.5f, 0.81f, -4.5f, 2.7f);
        pathBuilder3.verticalLineToRelative(2.78f);
        pathBuilder3.curveToRelative(-2.27f, -0.13f, -4.29f, -1.21f, -5.66f, -2.86f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _supervisedUserCircle = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
