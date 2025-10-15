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

/* compiled from: Emergency.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_emergency", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Emergency", "Landroidx/compose/material/icons/Icons$Outlined;", "getEmergency", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nEmergency.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emergency.kt\nandroidx/compose/material/icons/outlined/EmergencyKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,95:1\n212#2,12:96\n233#2,18:109\n253#2:146\n174#3:108\n705#4,2:127\n717#4,2:129\n719#4,11:135\n72#5,4:131\n*S KotlinDebug\n*F\n+ 1 Emergency.kt\nandroidx/compose/material/icons/outlined/EmergencyKt\n*L\n29#1:96,12\n30#1:109,18\n30#1:146\n29#1:108\n30#1:127,2\n30#1:129,2\n30#1:135,11\n30#1:131,4\n*E\n"})
/* loaded from: classes4.dex */
public final class EmergencyKt {

    @Nullable
    private static ImageVector _emergency;

    @NotNull
    public static final ImageVector getEmergency(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _emergency;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Emergency", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.29f, 13.9f);
        pathBuilder.lineTo(18.0f, 12.0f);
        pathBuilder.lineToRelative(3.29f, -1.9f);
        pathBuilder.curveToRelative(0.48f, -0.28f, 0.64f, -0.89f, 0.37f, -1.37f);
        pathBuilder.lineToRelative(-2.0f, -3.46f);
        pathBuilder.curveToRelative(-0.28f, -0.48f, -0.89f, -0.64f, -1.37f, -0.37f);
        pathBuilder.lineTo(15.0f, 6.8f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.curveTo(9.45f, 2.0f, 9.0f, 2.45f, 9.0f, 3.0f);
        pathBuilder.verticalLineToRelative(3.8f);
        pathBuilder.lineTo(5.71f, 4.9f);
        pathBuilder.curveTo(5.23f, 4.63f, 4.62f, 4.79f, 4.34f, 5.27f);
        pathBuilder.lineToRelative(-2.0f, 3.46f);
        pathBuilder.curveTo(2.06f, 9.21f, 2.23f, 9.82f, 2.71f, 10.1f);
        pathBuilder.lineTo(6.0f, 12.0f);
        pathBuilder.lineToRelative(-3.29f, 1.9f);
        pathBuilder.curveToRelative(-0.48f, 0.28f, -0.64f, 0.89f, -0.37f, 1.37f);
        pathBuilder.lineToRelative(2.0f, 3.46f);
        pathBuilder.curveToRelative(0.28f, 0.48f, 0.89f, 0.64f, 1.37f, 0.37f);
        pathBuilder.lineTo(9.0f, 17.2f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-3.8f);
        pathBuilder.lineToRelative(3.29f, 1.9f);
        pathBuilder.curveToRelative(0.48f, 0.28f, 1.09f, 0.11f, 1.37f, -0.37f);
        pathBuilder.lineToRelative(2.0f, -3.46f);
        pathBuilder.curveTo(21.94f, 14.79f, 21.77f, 14.18f, 21.29f, 13.9f);
        pathBuilder.close();
        pathBuilder.moveTo(18.43f, 16.87f);
        pathBuilder.lineToRelative(-4.68f, -2.7f);
        pathBuilder.curveTo(13.42f, 13.97f, 13.0f, 14.21f, 13.0f, 14.6f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-5.4f);
        pathBuilder.curveToRelative(0.0f, -0.38f, -0.42f, -0.63f, -0.75f, -0.43f);
        pathBuilder.lineToRelative(-4.68f, 2.7f);
        pathBuilder.lineToRelative(-1.0f, -1.73f);
        pathBuilder.lineToRelative(4.68f, -2.7f);
        pathBuilder.curveToRelative(0.33f, -0.19f, 0.33f, -0.67f, 0.0f, -0.87f);
        pathBuilder.lineToRelative(-4.68f, -2.7f);
        pathBuilder.lineToRelative(1.0f, -1.73f);
        pathBuilder.lineToRelative(4.68f, 2.7f);
        pathBuilder.curveTo(10.58f, 10.03f, 11.0f, 9.79f, 11.0f, 9.4f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(5.4f);
        pathBuilder.curveToRelative(0.0f, 0.38f, 0.42f, 0.63f, 0.75f, 0.43f);
        pathBuilder.lineToRelative(4.68f, -2.7f);
        pathBuilder.lineToRelative(1.0f, 1.73f);
        pathBuilder.lineToRelative(-4.68f, 2.7f);
        pathBuilder.curveToRelative(-0.33f, 0.19f, -0.33f, 0.67f, 0.0f, 0.87f);
        pathBuilder.lineToRelative(4.68f, 2.7f);
        pathBuilder.lineTo(18.43f, 16.87f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emergency = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
