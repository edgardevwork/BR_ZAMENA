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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DirectionsBike.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7105d2 = {"_directionsBike", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DirectionsBike", "Landroidx/compose/material/icons/Icons$Rounded;", "getDirectionsBike$annotations", "(Landroidx/compose/material/icons/Icons$Rounded;)V", "getDirectionsBike", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDirectionsBike.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DirectionsBike.kt\nandroidx/compose/material/icons/rounded/DirectionsBikeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,94:1\n212#2,12:95\n233#2,18:108\n253#2:145\n174#3:107\n705#4,2:126\n717#4,2:128\n719#4,11:134\n72#5,4:130\n*S KotlinDebug\n*F\n+ 1 DirectionsBike.kt\nandroidx/compose/material/icons/rounded/DirectionsBikeKt\n*L\n35#1:95,12\n36#1:108,18\n36#1:145\n35#1:107\n36#1:126,2\n36#1:128,2\n36#1:134,11\n36#1:130,4\n*E\n"})
/* loaded from: classes4.dex */
public final class DirectionsBikeKt {

    @Nullable
    private static ImageVector _directionsBike;

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.Rounded.DirectionsBike", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.Rounded.DirectionsBike", imports = {"androidx.compose.material.icons.automirrored.rounded.DirectionsBike"}))
    public static /* synthetic */ void getDirectionsBike$annotations(Icons.Rounded rounded) {
    }

    @NotNull
    public static final ImageVector getDirectionsBike(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _directionsBike;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DirectionsBike", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.5f, 5.5f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 12.0f);
        pathBuilder.curveToRelative(-2.8f, 0.0f, -5.0f, 2.2f, -5.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(2.2f, 5.0f, 5.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(5.0f, -2.2f, 5.0f, -5.0f);
        pathBuilder.reflectiveCurveToRelative(-2.2f, -5.0f, -5.0f, -5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 20.5f);
        pathBuilder.curveToRelative(-1.9f, 0.0f, -3.5f, -1.6f, -3.5f, -3.5f);
        pathBuilder.reflectiveCurveToRelative(1.6f, -3.5f, 3.5f, -3.5f);
        pathBuilder.reflectiveCurveToRelative(3.5f, 1.6f, 3.5f, 3.5f);
        pathBuilder.reflectiveCurveToRelative(-1.6f, 3.5f, -3.5f, 3.5f);
        pathBuilder.close();
        pathBuilder.moveTo(10.8f, 10.5f);
        pathBuilder.lineToRelative(2.4f, -2.4f);
        pathBuilder.lineToRelative(0.8f, 0.8f);
        pathBuilder.curveToRelative(1.06f, 1.06f, 2.38f, 1.78f, 3.96f, 2.02f);
        pathBuilder.curveToRelative(0.6f, 0.09f, 1.14f, -0.39f, 1.14f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -0.49f, -0.37f, -0.91f, -0.85f, -0.99f);
        pathBuilder.curveToRelative(-1.11f, -0.18f, -2.02f, -0.71f, -2.75f, -1.43f);
        pathBuilder.lineToRelative(-1.9f, -1.9f);
        pathBuilder.curveToRelative(-0.5f, -0.4f, -1.0f, -0.6f, -1.6f, -0.6f);
        pathBuilder.reflectiveCurveToRelative(-1.1f, 0.2f, -1.4f, 0.6f);
        pathBuilder.lineTo(7.8f, 8.4f);
        pathBuilder.curveToRelative(-0.4f, 0.4f, -0.6f, 0.9f, -0.6f, 1.4f);
        pathBuilder.curveToRelative(0.0f, 0.6f, 0.2f, 1.1f, 0.6f, 1.4f);
        pathBuilder.lineTo(11.0f, 14.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-4.4f);
        pathBuilder.curveToRelative(0.0f, -0.52f, -0.2f, -1.01f, -0.55f, -1.38f);
        pathBuilder.lineTo(10.8f, 10.5f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 12.0f);
        pathBuilder.curveToRelative(-2.8f, 0.0f, -5.0f, 2.2f, -5.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(2.2f, 5.0f, 5.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(5.0f, -2.2f, 5.0f, -5.0f);
        pathBuilder.reflectiveCurveToRelative(-2.2f, -5.0f, -5.0f, -5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 20.5f);
        pathBuilder.curveToRelative(-1.9f, 0.0f, -3.5f, -1.6f, -3.5f, -3.5f);
        pathBuilder.reflectiveCurveToRelative(1.6f, -3.5f, 3.5f, -3.5f);
        pathBuilder.reflectiveCurveToRelative(3.5f, 1.6f, 3.5f, 3.5f);
        pathBuilder.reflectiveCurveToRelative(-1.6f, 3.5f, -3.5f, 3.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _directionsBike = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
