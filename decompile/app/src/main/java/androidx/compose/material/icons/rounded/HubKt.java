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

/* compiled from: Hub.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_hub", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Hub", "Landroidx/compose/material/icons/Icons$Rounded;", "getHub", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHub.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Hub.kt\nandroidx/compose/material/icons/rounded/HubKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,78:1\n212#2,12:79\n233#2,18:92\n253#2:129\n174#3:91\n705#4,2:110\n717#4,2:112\n719#4,11:118\n72#5,4:114\n*S KotlinDebug\n*F\n+ 1 Hub.kt\nandroidx/compose/material/icons/rounded/HubKt\n*L\n29#1:79,12\n30#1:92,18\n30#1:129\n29#1:91\n30#1:110,2\n30#1:112,2\n30#1:118,11\n30#1:114,4\n*E\n"})
/* loaded from: classes.dex */
public final class HubKt {

    @Nullable
    private static ImageVector _hub;

    @NotNull
    public static final ImageVector getHub(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _hub;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Hub", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.4f, 18.2f);
        pathBuilder.curveTo(8.78f, 18.7f, 9.0f, 19.32f, 9.0f, 20.0f);
        pathBuilder.curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder.curveToRelative(0.44f, 0.0f, 0.85f, 0.09f, 1.23f, 0.26f);
        pathBuilder.lineToRelative(1.41f, -1.77f);
        pathBuilder.curveToRelative(-0.92f, -1.03f, -1.29f, -2.39f, -1.09f, -3.69f);
        pathBuilder.lineToRelative(-2.03f, -0.68f);
        pathBuilder.curveTo(4.98f, 11.95f, 4.06f, 12.5f, 3.0f, 12.5f);
        pathBuilder.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, 0.07f, 0.0f, 0.14f, -0.01f, 0.21f);
        pathBuilder.lineToRelative(2.03f, 0.68f);
        pathBuilder.curveToRelative(0.64f, -1.21f, 1.82f, -2.09f, 3.22f, -2.32f);
        pathBuilder.lineToRelative(0.0f, -2.16f);
        pathBuilder.curveTo(9.96f, 5.57f, 9.0f, 4.4f, 9.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, 1.4f, -0.96f, 2.57f, -2.25f, 2.91f);
        pathBuilder.verticalLineToRelative(2.16f);
        pathBuilder.curveToRelative(1.4f, 0.23f, 2.58f, 1.11f, 3.22f, 2.32f);
        pathBuilder.lineToRelative(2.03f, -0.68f);
        pathBuilder.curveTo(18.0f, 9.64f, 18.0f, 9.57f, 18.0f, 9.5f);
        pathBuilder.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f);
        pathBuilder.curveToRelative(-1.06f, 0.0f, -1.98f, -0.55f, -2.52f, -1.37f);
        pathBuilder.lineToRelative(-2.03f, 0.68f);
        pathBuilder.curveToRelative(0.2f, 1.29f, -0.16f, 2.65f, -1.09f, 3.69f);
        pathBuilder.lineToRelative(1.41f, 1.77f);
        pathBuilder.curveTo(17.15f, 17.09f, 17.56f, 17.0f, 18.0f, 17.0f);
        pathBuilder.curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder.curveToRelative(0.0f, -0.68f, 0.22f, -1.3f, 0.6f, -1.8f);
        pathBuilder.lineToRelative(-1.41f, -1.77f);
        pathBuilder.curveToRelative(-1.35f, 0.75f, -3.01f, 0.76f, -4.37f, 0.0f);
        pathBuilder.lineTo(8.4f, 18.2f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hub = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
