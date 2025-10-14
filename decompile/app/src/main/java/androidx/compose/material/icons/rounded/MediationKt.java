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

/* compiled from: Mediation.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_mediation", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Mediation", "Landroidx/compose/material/icons/Icons$Rounded;", "getMediation", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMediation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mediation.kt\nandroidx/compose/material/icons/rounded/MediationKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,66:1\n212#2,12:67\n233#2,18:80\n253#2:117\n174#3:79\n705#4,2:98\n717#4,2:100\n719#4,11:106\n72#5,4:102\n*S KotlinDebug\n*F\n+ 1 Mediation.kt\nandroidx/compose/material/icons/rounded/MediationKt\n*L\n29#1:67,12\n30#1:80,18\n30#1:117\n29#1:79\n30#1:98,2\n30#1:100,2\n30#1:106,11\n30#1:102,4\n*E\n"})
/* loaded from: classes2.dex */
public final class MediationKt {

    @Nullable
    private static ImageVector _mediation;

    @NotNull
    public static final ImageVector getMediation(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _mediation;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Mediation", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(-5.06f);
        pathBuilder.curveToRelative(-0.34f, 3.1f, -2.26f, 5.72f, -4.94f, 7.05f);
        pathBuilder.curveToRelative(-0.03f, 1.81f, -1.66f, 3.23f, -3.55f, 2.9f);
        pathBuilder.curveToRelative(-1.2f, -0.21f, -2.19f, -1.2f, -2.4f, -2.4f);
        pathBuilder.curveTo(1.71f, 18.65f, 3.16f, 17.0f, 5.0f, 17.0f);
        pathBuilder.curveToRelative(0.95f, 0.0f, 1.78f, 0.45f, 2.33f, 1.14f);
        pathBuilder.curveToRelative(1.9f, -1.03f, 3.26f, -2.91f, 3.58f, -5.14f);
        pathBuilder.horizontalLineToRelative(-3.1f);
        pathBuilder.curveToRelative(-0.48f, 1.34f, -1.86f, 2.24f, -3.42f, 1.94f);
        pathBuilder.curveToRelative(-1.18f, -0.23f, -2.13f, -1.2f, -2.35f, -2.38f);
        pathBuilder.curveTo(1.7f, 10.66f, 3.16f, 9.0f, 5.0f, 9.0f);
        pathBuilder.curveToRelative(1.3f, 0.0f, 2.4f, 0.84f, 2.82f, 2.0f);
        pathBuilder.horizontalLineToRelative(3.1f);
        pathBuilder.curveTo(10.6f, 8.77f, 9.23f, 6.9f, 7.33f, 5.86f);
        pathBuilder.curveToRelative(-0.64f, 0.8f, -1.67f, 1.28f, -2.81f, 1.1f);
        pathBuilder.curveTo(3.29f, 6.77f, 2.26f, 5.77f, 2.05f, 4.54f);
        pathBuilder.curveTo(1.72f, 2.65f, 3.17f, 1.0f, 5.0f, 1.0f);
        pathBuilder.curveToRelative(1.64f, 0.0f, 2.96f, 1.31f, 2.99f, 2.95f);
        pathBuilder.curveToRelative(2.68f, 1.33f, 4.6f, 3.95f, 4.94f, 7.05f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.verticalLineTo(9.21f);
        pathBuilder.curveToRelative(0.0f, -0.45f, 0.54f, -0.67f, 0.85f, -0.35f);
        pathBuilder.lineToRelative(2.79f, 2.79f);
        pathBuilder.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder.lineToRelative(-2.79f, 2.79f);
        pathBuilder.curveTo(18.54f, 15.46f, 18.0f, 15.24f, 18.0f, 14.79f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mediation = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
