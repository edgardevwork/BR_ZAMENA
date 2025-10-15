package androidx.compose.material.icons.rounded;

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

/* compiled from: ControlCamera.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_controlCamera", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ControlCamera", "Landroidx/compose/material/icons/Icons$Rounded;", "getControlCamera", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nControlCamera.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ControlCamera.kt\nandroidx/compose/material/icons/rounded/ControlCameraKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,87:1\n212#2,12:88\n233#2,18:101\n253#2:138\n233#2,18:139\n253#2:176\n174#3:100\n705#4,2:119\n717#4,2:121\n719#4,11:127\n705#4,2:157\n717#4,2:159\n719#4,11:165\n72#5,4:123\n72#5,4:161\n*S KotlinDebug\n*F\n+ 1 ControlCamera.kt\nandroidx/compose/material/icons/rounded/ControlCameraKt\n*L\n29#1:88,12\n30#1:101,18\n30#1:138\n76#1:139,18\n76#1:176\n29#1:100\n30#1:119,2\n30#1:121,2\n30#1:127,11\n76#1:157,2\n76#1:159,2\n76#1:165,11\n30#1:123,4\n76#1:161,4\n*E\n"})
/* loaded from: classes.dex */
public final class ControlCameraKt {

    @Nullable
    private static ImageVector _controlCamera;

    @NotNull
    public static final ImageVector getControlCamera(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _controlCamera;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ControlCamera", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.65f, 9.35f);
        pathBuilder.lineTo(2.7f, 11.3f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(1.95f, 1.95f);
        pathBuilder.curveToRelative(0.49f, 0.49f, 1.28f, 0.49f, 1.77f, 0.0f);
        pathBuilder.curveToRelative(0.48f, -0.49f, 0.48f, -1.27f, 0.0f, -1.76f);
        pathBuilder.lineToRelative(-0.88f, -0.9f);
        pathBuilder.lineToRelative(0.88f, -0.89f);
        pathBuilder.curveToRelative(0.48f, -0.49f, 0.48f, -1.27f, 0.0f, -1.76f);
        pathBuilder.reflectiveCurveToRelative(-1.28f, -0.49f, -1.77f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.58f, 9.35f);
        pathBuilder.curveToRelative(-0.48f, 0.49f, -0.48f, 1.27f, 0.0f, 1.76f);
        pathBuilder.lineToRelative(0.88f, 0.89f);
        pathBuilder.lineToRelative(-0.88f, 0.89f);
        pathBuilder.curveToRelative(-0.48f, 0.49f, -0.48f, 1.27f, 0.0f, 1.76f);
        pathBuilder.curveToRelative(0.49f, 0.49f, 1.28f, 0.49f, 1.77f, 0.0f);
        pathBuilder.lineToRelative(1.95f, -1.95f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineToRelative(-1.95f, -1.95f);
        pathBuilder.curveToRelative(-0.49f, -0.48f, -1.29f, -0.48f, -1.77f, 0.01f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 18.46f);
        pathBuilder.lineToRelative(-0.89f, -0.88f);
        pathBuilder.curveToRelative(-0.49f, -0.48f, -1.27f, -0.48f, -1.76f, 0.0f);
        pathBuilder.curveToRelative(-0.49f, 0.49f, -0.49f, 1.28f, 0.0f, 1.77f);
        pathBuilder.lineToRelative(1.95f, 1.95f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(1.95f, -1.95f);
        pathBuilder.curveToRelative(0.49f, -0.49f, 0.49f, -1.28f, 0.0f, -1.77f);
        pathBuilder.curveToRelative(-0.49f, -0.48f, -1.27f, -0.48f, -1.76f, 0.0f);
        pathBuilder.lineToRelative(-0.9f, 0.88f);
        pathBuilder.close();
        pathBuilder.moveTo(9.35f, 6.42f);
        pathBuilder.curveToRelative(0.49f, 0.48f, 1.27f, 0.48f, 1.76f, 0.0f);
        pathBuilder.lineToRelative(0.89f, -0.88f);
        pathBuilder.lineToRelative(0.89f, 0.88f);
        pathBuilder.curveToRelative(0.49f, 0.48f, 1.27f, 0.48f, 1.76f, 0.0f);
        pathBuilder.curveToRelative(0.49f, -0.49f, 0.49f, -1.28f, 0.0f, -1.77f);
        pathBuilder.lineTo(12.7f, 2.7f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineTo(9.35f, 4.65f);
        pathBuilder.curveToRelative(-0.49f, 0.49f, -0.49f, 1.29f, 0.0f, 1.77f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 12.0f);
        pathBuilder2.moveToRelative(-3.0f, 0.0f);
        pathBuilder2.arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f);
        pathBuilder2.arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _controlCamera = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
