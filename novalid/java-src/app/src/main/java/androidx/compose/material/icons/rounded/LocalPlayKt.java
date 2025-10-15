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

/* compiled from: LocalPlay.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_localPlay", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LocalPlay", "Landroidx/compose/material/icons/Icons$Rounded;", "getLocalPlay", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLocalPlay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalPlay.kt\nandroidx/compose/material/icons/rounded/LocalPlayKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,74:1\n212#2,12:75\n233#2,18:88\n253#2:125\n174#3:87\n705#4,2:106\n717#4,2:108\n719#4,11:114\n72#5,4:110\n*S KotlinDebug\n*F\n+ 1 LocalPlay.kt\nandroidx/compose/material/icons/rounded/LocalPlayKt\n*L\n29#1:75,12\n30#1:88,18\n30#1:125\n29#1:87\n30#1:106,2\n30#1:108,2\n30#1:114,11\n30#1:110,4\n*E\n"})
/* loaded from: classes2.dex */
public final class LocalPlayKt {

    @Nullable
    private static ImageVector _localPlay;

    @NotNull
    public static final ImageVector getLocalPlay(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _localPlay;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LocalPlay", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -0.76f, 0.43f, -1.42f, 1.06f, -1.76f);
        pathBuilder.curveToRelative(0.6f, -0.33f, 0.94f, -1.01f, 0.94f, -1.7f);
        pathBuilder.lineTo(22.0f, 6.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.lineTo(4.0f, 4.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -1.99f, 0.89f, -1.99f, 1.99f);
        pathBuilder.verticalLineToRelative(2.55f);
        pathBuilder.curveToRelative(0.0f, 0.69f, 0.33f, 1.37f, 0.94f, 1.69f);
        pathBuilder.curveTo(3.58f, 10.58f, 4.0f, 11.24f, 4.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(-0.43f, 1.43f, -1.06f, 1.76f);
        pathBuilder.curveToRelative(-0.6f, 0.33f, -0.94f, 1.01f, -0.94f, 1.7f);
        pathBuilder.verticalLineToRelative(2.25f);
        pathBuilder.curveTo(2.0f, 19.1f, 2.9f, 20.0f, 4.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-2.54f);
        pathBuilder.curveToRelative(0.0f, -0.69f, -0.34f, -1.37f, -0.94f, -1.7f);
        pathBuilder.curveToRelative(-0.63f, -0.34f, -1.06f, -1.0f, -1.06f, -1.76f);
        pathBuilder.close();
        pathBuilder.moveTo(14.5f, 16.1f);
        pathBuilder.lineTo(12.0f, 14.5f);
        pathBuilder.lineToRelative(-2.5f, 1.61f);
        pathBuilder.curveToRelative(-0.38f, 0.24f, -0.87f, -0.11f, -0.75f, -0.55f);
        pathBuilder.lineToRelative(0.75f, -2.88f);
        pathBuilder.lineToRelative(-2.3f, -1.88f);
        pathBuilder.curveToRelative(-0.35f, -0.29f, -0.17f, -0.86f, 0.29f, -0.89f);
        pathBuilder.lineToRelative(2.96f, -0.17f);
        pathBuilder.lineToRelative(1.08f, -2.75f);
        pathBuilder.curveToRelative(0.17f, -0.42f, 0.77f, -0.42f, 0.93f, 0.0f);
        pathBuilder.lineToRelative(1.08f, 2.76f);
        pathBuilder.lineToRelative(2.96f, 0.17f);
        pathBuilder.curveToRelative(0.45f, 0.03f, 0.64f, 0.6f, 0.29f, 0.89f);
        pathBuilder.lineToRelative(-2.3f, 1.88f);
        pathBuilder.lineToRelative(0.76f, 2.86f);
        pathBuilder.curveToRelative(0.12f, 0.45f, -0.37f, 0.8f, -0.75f, 0.55f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localPlay = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
