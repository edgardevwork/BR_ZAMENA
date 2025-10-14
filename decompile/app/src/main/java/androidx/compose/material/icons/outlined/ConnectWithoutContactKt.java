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

/* compiled from: ConnectWithoutContact.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_connectWithoutContact", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ConnectWithoutContact", "Landroidx/compose/material/icons/Icons$Outlined;", "getConnectWithoutContact", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nConnectWithoutContact.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectWithoutContact.kt\nandroidx/compose/material/icons/outlined/ConnectWithoutContactKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,81:1\n212#2,12:82\n233#2,18:95\n253#2:132\n174#3:94\n705#4,2:113\n717#4,2:115\n719#4,11:121\n72#5,4:117\n*S KotlinDebug\n*F\n+ 1 ConnectWithoutContact.kt\nandroidx/compose/material/icons/outlined/ConnectWithoutContactKt\n*L\n29#1:82,12\n30#1:95,18\n30#1:132\n29#1:94\n30#1:113,2\n30#1:115,2\n30#1:121,11\n30#1:117,4\n*E\n"})
/* loaded from: classes.dex */
public final class ConnectWithoutContactKt {

    @Nullable
    private static ImageVector _connectWithoutContact;

    @NotNull
    public static final ImageVector getConnectWithoutContact(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _connectWithoutContact;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ConnectWithoutContact", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 14.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.curveToRelative(0.0f, -4.97f, 4.03f, -9.0f, 9.0f, -9.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveTo(14.13f, 7.0f, 11.0f, 10.13f, 11.0f, 14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 11.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveTo(15.0f, 12.34f, 16.34f, 11.0f, 18.0f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(3.0f, 2.89f, 3.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(7.0f, 5.11f, 7.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.45f, 4.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveTo(9.21f, 5.92f, 7.99f, 7.0f, 6.5f, 7.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.curveTo(2.67f, 7.0f, 2.0f, 7.67f, 2.0f, 8.5f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineTo(8.74f);
        pathBuilder.curveTo(9.86f, 8.15f, 11.25f, 6.51f, 11.45f, 4.5f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 17.0f);
        pathBuilder.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.89f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 0.89f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(17.89f, 17.0f, 19.0f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.5f, 18.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(-1.49f, 0.0f, -2.71f, -1.08f, -2.95f, -2.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.2f, 2.01f, 1.59f, 3.65f, 3.45f, 4.24f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(-2.5f);
        pathBuilder.curveTo(22.0f, 18.67f, 21.33f, 18.0f, 20.5f, 18.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _connectWithoutContact = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
