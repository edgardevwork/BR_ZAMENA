package androidx.compose.material.icons.filled;

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

/* compiled from: AltRoute.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7105d2 = {"_altRoute", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AltRoute", "Landroidx/compose/material/icons/Icons$Filled;", "getAltRoute$annotations", "(Landroidx/compose/material/icons/Icons$Filled;)V", "getAltRoute", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAltRoute.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AltRoute.kt\nandroidx/compose/material/icons/filled/AltRouteKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,77:1\n212#2,12:78\n233#2,18:91\n253#2:128\n174#3:90\n705#4,2:109\n717#4,2:111\n719#4,11:117\n72#5,4:113\n*S KotlinDebug\n*F\n+ 1 AltRoute.kt\nandroidx/compose/material/icons/filled/AltRouteKt\n*L\n35#1:78,12\n36#1:91,18\n36#1:128\n35#1:90\n36#1:109,2\n36#1:111,2\n36#1:117,11\n36#1:113,4\n*E\n"})
/* loaded from: classes.dex */
public final class AltRouteKt {

    @Nullable
    private static ImageVector _altRoute;

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.Filled.AltRoute", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.Filled.AltRoute", imports = {"androidx.compose.material.icons.automirrored.filled.AltRoute"}))
    public static /* synthetic */ void getAltRoute$annotations(Icons.Filled filled) {
    }

    @NotNull
    public static final ImageVector getAltRoute(@NotNull Icons.Filled filled) {
        ImageVector imageVector = _altRoute;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AltRoute", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.78f, 11.16f);
        pathBuilder.lineToRelative(-1.42f, 1.42f);
        pathBuilder.curveToRelative(-0.68f, -0.69f, -1.34f, -1.58f, -1.79f, -2.94f);
        pathBuilder.lineToRelative(1.94f, -0.49f);
        pathBuilder.curveTo(8.83f, 10.04f, 9.28f, 10.65f, 9.78f, 11.16f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 6.0f);
        pathBuilder.lineTo(7.0f, 2.0f);
        pathBuilder.lineTo(3.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(3.02f);
        pathBuilder.curveTo(6.04f, 6.81f, 6.1f, 7.54f, 6.21f, 8.17f);
        pathBuilder.lineToRelative(1.94f, -0.49f);
        pathBuilder.curveTo(8.08f, 7.2f, 8.03f, 6.63f, 8.02f, 6.0f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 6.0f);
        pathBuilder.lineToRelative(-4.0f, -4.0f);
        pathBuilder.lineToRelative(-4.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(2.99f);
        pathBuilder.curveToRelative(-0.1f, 3.68f, -1.28f, 4.75f, -2.54f, 5.88f);
        pathBuilder.curveToRelative(-0.5f, 0.44f, -1.01f, 0.92f, -1.45f, 1.55f);
        pathBuilder.curveToRelative(-0.34f, -0.49f, -0.73f, -0.88f, -1.13f, -1.24f);
        pathBuilder.lineTo(9.46f, 13.6f);
        pathBuilder.curveTo(10.39f, 14.45f, 11.0f, 15.14f, 11.0f, 17.0f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-5.0f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, -2.02f, 0.71f, -2.66f, 1.79f, -3.63f);
        pathBuilder.curveToRelative(1.38f, -1.24f, 3.08f, -2.78f, 3.2f, -7.37f);
        pathBuilder.horizontalLineTo(21.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _altRoute = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
