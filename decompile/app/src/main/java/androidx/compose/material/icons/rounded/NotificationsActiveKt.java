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

/* compiled from: NotificationsActive.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_notificationsActive", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NotificationsActive", "Landroidx/compose/material/icons/Icons$Rounded;", "getNotificationsActive", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nNotificationsActive.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationsActive.kt\nandroidx/compose/material/icons/rounded/NotificationsActiveKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,73:1\n212#2,12:74\n233#2,18:87\n253#2:124\n174#3:86\n705#4,2:105\n717#4,2:107\n719#4,11:113\n72#5,4:109\n*S KotlinDebug\n*F\n+ 1 NotificationsActive.kt\nandroidx/compose/material/icons/rounded/NotificationsActiveKt\n*L\n29#1:74,12\n30#1:87,18\n30#1:124\n29#1:86\n30#1:105,2\n30#1:107,2\n30#1:113,11\n30#1:109,4\n*E\n"})
/* loaded from: classes.dex */
public final class NotificationsActiveKt {

    @Nullable
    private static ImageVector _notificationsActive;

    @NotNull
    public static final ImageVector getNotificationsActive(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _notificationsActive;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NotificationsActive", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 16.0f);
        pathBuilder.verticalLineToRelative(-5.0f);
        pathBuilder.curveToRelative(0.0f, -3.07f, -1.64f, -5.64f, -4.5f, -6.32f);
        pathBuilder.lineTo(13.5f, 4.0f);
        pathBuilder.curveToRelative(0.0f, -0.83f, -0.68f, -1.5f, -1.51f, -1.5f);
        pathBuilder.reflectiveCurveTo(10.5f, 3.17f, 10.5f, 4.0f);
        pathBuilder.verticalLineToRelative(0.68f);
        pathBuilder.curveTo(7.63f, 5.36f, 6.0f, 7.92f, 6.0f, 11.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.lineToRelative(-1.3f, 1.29f);
        pathBuilder.curveToRelative(-0.63f, 0.63f, -0.19f, 1.71f, 0.7f, 1.71f);
        pathBuilder.horizontalLineToRelative(13.17f);
        pathBuilder.curveToRelative(0.89f, 0.0f, 1.34f, -1.08f, 0.71f, -1.71f);
        pathBuilder.lineTo(18.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.99f, 22.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.77f, 4.73f);
        pathBuilder.curveToRelative(0.42f, -0.38f, 0.43f, -1.03f, 0.03f, -1.43f);
        pathBuilder.curveToRelative(-0.38f, -0.38f, -1.0f, -0.39f, -1.39f, -0.02f);
        pathBuilder.curveTo(3.7f, 4.84f, 2.52f, 6.96f, 2.14f, 9.34f);
        pathBuilder.curveToRelative(-0.09f, 0.61f, 0.38f, 1.16f, 1.0f, 1.16f);
        pathBuilder.curveToRelative(0.48f, 0.0f, 0.9f, -0.35f, 0.98f, -0.83f);
        pathBuilder.curveToRelative(0.3f, -1.94f, 1.26f, -3.67f, 2.65f, -4.94f);
        pathBuilder.close();
        pathBuilder.moveTo(18.6f, 3.28f);
        pathBuilder.curveToRelative(-0.4f, -0.37f, -1.02f, -0.36f, -1.4f, 0.02f);
        pathBuilder.curveToRelative(-0.4f, 0.4f, -0.38f, 1.04f, 0.03f, 1.42f);
        pathBuilder.curveToRelative(1.38f, 1.27f, 2.35f, 3.0f, 2.65f, 4.94f);
        pathBuilder.curveToRelative(0.07f, 0.48f, 0.49f, 0.83f, 0.98f, 0.83f);
        pathBuilder.curveToRelative(0.61f, 0.0f, 1.09f, -0.55f, 0.99f, -1.16f);
        pathBuilder.curveToRelative(-0.38f, -2.37f, -1.55f, -4.48f, -3.25f, -6.05f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notificationsActive = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
