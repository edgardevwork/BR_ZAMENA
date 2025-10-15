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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Router.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_router", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Router", "Landroidx/compose/material/icons/Icons$Filled;", "getRouter", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nRouter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Router.kt\nandroidx/compose/material/icons/filled/RouterKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,85:1\n212#2,12:86\n233#2,18:99\n253#2:136\n174#3:98\n705#4,2:117\n717#4,2:119\n719#4,11:125\n72#5,4:121\n*S KotlinDebug\n*F\n+ 1 Router.kt\nandroidx/compose/material/icons/filled/RouterKt\n*L\n29#1:86,12\n30#1:99,18\n30#1:136\n29#1:98\n30#1:117,2\n30#1:119,2\n30#1:125,11\n30#1:121,4\n*E\n"})
/* loaded from: classes3.dex */
public final class RouterKt {

    @Nullable
    private static ImageVector _router;

    @NotNull
    public static final ImageVector getRouter(@NotNull Icons.Filled filled) {
        ImageVector imageVector = _router;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Router", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.2f, 5.9f);
        pathBuilder.lineToRelative(0.8f, -0.8f);
        pathBuilder.curveTo(19.6f, 3.7f, 17.8f, 3.0f, 16.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-3.6f, 0.7f, -5.0f, 2.1f);
        pathBuilder.lineToRelative(0.8f, 0.8f);
        pathBuilder.curveTo(13.0f, 4.8f, 14.5f, 4.2f, 16.0f, 4.2f);
        pathBuilder.reflectiveCurveToRelative(3.0f, 0.6f, 4.2f, 1.7f);
        pathBuilder.close();
        pathBuilder.moveTo(19.3f, 6.7f);
        pathBuilder.curveToRelative(-0.9f, -0.9f, -2.1f, -1.4f, -3.3f, -1.4f);
        pathBuilder.reflectiveCurveToRelative(-2.4f, 0.5f, -3.3f, 1.4f);
        pathBuilder.lineToRelative(0.8f, 0.8f);
        pathBuilder.curveToRelative(0.7f, -0.7f, 1.6f, -1.0f, 2.5f, -1.0f);
        pathBuilder.curveToRelative(0.9f, 0.0f, 1.8f, 0.3f, 2.5f, 1.0f);
        pathBuilder.lineToRelative(0.8f, -0.8f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.lineTo(17.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.lineTo(5.0f, 13.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 18.0f);
        pathBuilder.lineTo(6.0f, 18.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.5f, 18.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _router = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
