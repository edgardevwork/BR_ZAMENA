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

/* compiled from: Handshake.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_handshake", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Handshake", "Landroidx/compose/material/icons/Icons$Outlined;", "getHandshake", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHandshake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handshake.kt\nandroidx/compose/material/icons/outlined/HandshakeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,95:1\n212#2,12:96\n233#2,18:109\n253#2:146\n174#3:108\n705#4,2:127\n717#4,2:129\n719#4,11:135\n72#5,4:131\n*S KotlinDebug\n*F\n+ 1 Handshake.kt\nandroidx/compose/material/icons/outlined/HandshakeKt\n*L\n29#1:96,12\n30#1:109,18\n30#1:146\n29#1:108\n30#1:127,2\n30#1:129,2\n30#1:135,11\n30#1:131,4\n*E\n"})
/* loaded from: classes3.dex */
public final class HandshakeKt {

    @Nullable
    private static ImageVector _handshake;

    @NotNull
    public static final ImageVector getHandshake(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _handshake;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Handshake", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.22f, 19.85f);
        pathBuilder.curveToRelative(-0.18f, 0.18f, -0.5f, 0.21f, -0.71f, 0.0f);
        pathBuilder.curveToRelative(-0.18f, -0.18f, -0.21f, -0.5f, 0.0f, -0.71f);
        pathBuilder.lineToRelative(3.39f, -3.39f);
        pathBuilder.lineToRelative(-1.41f, -1.41f);
        pathBuilder.lineToRelative(-3.39f, 3.39f);
        pathBuilder.curveToRelative(-0.19f, 0.2f, -0.51f, 0.19f, -0.71f, 0.0f);
        pathBuilder.curveToRelative(-0.21f, -0.21f, -0.18f, -0.53f, 0.0f, -0.71f);
        pathBuilder.lineToRelative(3.39f, -3.39f);
        pathBuilder.lineToRelative(-1.41f, -1.41f);
        pathBuilder.lineToRelative(-3.39f, 3.39f);
        pathBuilder.curveToRelative(-0.18f, 0.18f, -0.5f, 0.21f, -0.71f, 0.0f);
        pathBuilder.curveToRelative(-0.19f, -0.19f, -0.19f, -0.51f, 0.0f, -0.71f);
        pathBuilder.lineToRelative(3.39f, -3.39f);
        pathBuilder.lineTo(9.24f, 10.1f);
        pathBuilder.lineToRelative(-3.39f, 3.39f);
        pathBuilder.curveToRelative(-0.18f, 0.18f, -0.5f, 0.21f, -0.71f, 0.0f);
        pathBuilder.curveToRelative(-0.19f, -0.2f, -0.19f, -0.51f, 0.0f, -0.71f);
        pathBuilder.lineTo(9.52f, 8.4f);
        pathBuilder.lineToRelative(1.87f, 1.86f);
        pathBuilder.curveToRelative(0.95f, 0.95f, 2.59f, 0.94f, 3.54f, 0.0f);
        pathBuilder.curveToRelative(0.98f, -0.98f, 0.98f, -2.56f, 0.0f, -3.54f);
        pathBuilder.lineToRelative(-1.86f, -1.86f);
        pathBuilder.lineToRelative(0.28f, -0.28f);
        pathBuilder.curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0.0f);
        pathBuilder.lineToRelative(4.24f, 4.24f);
        pathBuilder.curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilder.lineTo(12.22f, 19.85f);
        pathBuilder.close();
        pathBuilder.moveTo(21.83f, 13.07f);
        pathBuilder.curveToRelative(1.56f, -1.56f, 1.56f, -4.09f, 0.0f, -5.66f);
        pathBuilder.lineToRelative(-4.24f, -4.24f);
        pathBuilder.curveToRelative(-1.56f, -1.56f, -4.09f, -1.56f, -5.66f, 0.0f);
        pathBuilder.lineToRelative(-0.28f, 0.28f);
        pathBuilder.lineToRelative(-0.28f, -0.28f);
        pathBuilder.curveToRelative(-1.56f, -1.56f, -4.09f, -1.56f, -5.66f, 0.0f);
        pathBuilder.lineTo(2.17f, 6.71f);
        pathBuilder.curveToRelative(-1.42f, 1.42f, -1.55f, 3.63f, -0.4f, 5.19f);
        pathBuilder.lineToRelative(1.45f, -1.45f);
        pathBuilder.curveTo(2.83f, 9.7f, 2.96f, 8.75f, 3.59f, 8.12f);
        pathBuilder.lineToRelative(3.54f, -3.54f);
        pathBuilder.curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0.0f);
        pathBuilder.lineToRelative(3.56f, 3.56f);
        pathBuilder.curveToRelative(0.18f, 0.18f, 0.21f, 0.5f, 0.0f, 0.71f);
        pathBuilder.curveToRelative(-0.21f, 0.21f, -0.53f, 0.18f, -0.71f, 0.0f);
        pathBuilder.lineTo(9.52f, 5.57f);
        pathBuilder.lineToRelative(-5.8f, 5.79f);
        pathBuilder.curveToRelative(-0.98f, 0.97f, -0.98f, 2.56f, 0.0f, 3.54f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 0.89f, 0.63f, 1.42f, 0.7f);
        pathBuilder.curveToRelative(0.07f, 0.52f, 0.3f, 1.02f, 0.7f, 1.42f);
        pathBuilder.curveToRelative(0.4f, 0.4f, 0.9f, 0.63f, 1.42f, 0.7f);
        pathBuilder.curveToRelative(0.07f, 0.52f, 0.3f, 1.02f, 0.7f, 1.42f);
        pathBuilder.curveToRelative(0.4f, 0.4f, 0.9f, 0.63f, 1.42f, 0.7f);
        pathBuilder.curveToRelative(0.07f, 0.54f, 0.31f, 1.03f, 0.7f, 1.42f);
        pathBuilder.curveToRelative(0.47f, 0.47f, 1.1f, 0.73f, 1.77f, 0.73f);
        pathBuilder.curveToRelative(0.67f, 0.0f, 1.3f, -0.26f, 1.77f, -0.73f);
        pathBuilder.lineTo(21.83f, 13.07f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _handshake = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
