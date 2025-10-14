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

/* compiled from: LeakRemove.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_leakRemove", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LeakRemove", "Landroidx/compose/material/icons/Icons$Rounded;", "getLeakRemove", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLeakRemove.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LeakRemove.kt\nandroidx/compose/material/icons/rounded/LeakRemoveKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,91:1\n212#2,12:92\n233#2,18:105\n253#2:142\n174#3:104\n705#4,2:123\n717#4,2:125\n719#4,11:131\n72#5,4:127\n*S KotlinDebug\n*F\n+ 1 LeakRemove.kt\nandroidx/compose/material/icons/rounded/LeakRemoveKt\n*L\n29#1:92,12\n30#1:105,18\n30#1:142\n29#1:104\n30#1:123,2\n30#1:125,2\n30#1:131,11\n30#1:127,4\n*E\n"})
/* loaded from: classes3.dex */
public final class LeakRemoveKt {

    @Nullable
    private static ImageVector _leakRemove;

    @NotNull
    public static final ImageVector getLeakRemove(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _leakRemove;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LeakRemove", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.12f, 12.04f);
        pathBuilder.curveToRelative(0.5f, -0.05f, 0.88f, -0.48f, 0.88f, -0.99f);
        pathBuilder.curveToRelative(0.0f, -0.59f, -0.51f, -1.06f, -1.1f, -1.0f);
        pathBuilder.curveToRelative(-1.5f, 0.15f, -2.9f, 0.61f, -4.16f, 1.3f);
        pathBuilder.lineToRelative(1.48f, 1.48f);
        pathBuilder.curveToRelative(0.9f, -0.41f, 1.87f, -0.69f, 2.9f, -0.79f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 15.09f);
        pathBuilder.curveToRelative(0.0f, -0.61f, -0.54f, -1.09f, -1.14f, -1.0f);
        pathBuilder.curveToRelative(-0.38f, 0.06f, -0.75f, 0.16f, -1.11f, 0.28f);
        pathBuilder.lineToRelative(1.62f, 1.62f);
        pathBuilder.curveToRelative(0.37f, -0.15f, 0.63f, -0.49f, 0.63f, -0.9f);
        pathBuilder.close();
        pathBuilder.moveTo(13.97f, 4.14f);
        pathBuilder.curveToRelative(0.06f, -0.59f, -0.4f, -1.11f, -1.0f, -1.11f);
        pathBuilder.curveToRelative(-0.5f, 0.0f, -0.94f, 0.37f, -0.99f, 0.87f);
        pathBuilder.curveToRelative(-0.1f, 1.03f, -0.38f, 2.01f, -0.79f, 2.91f);
        pathBuilder.lineToRelative(1.48f, 1.48f);
        pathBuilder.curveToRelative(0.69f, -1.26f, 1.15f, -2.66f, 1.3f, -4.15f);
        pathBuilder.close();
        pathBuilder.moveTo(9.93f, 4.16f);
        pathBuilder.curveToRelative(0.1f, -0.6f, -0.39f, -1.14f, -1.0f, -1.14f);
        pathBuilder.curveToRelative(-0.41f, 0.0f, -0.75f, 0.26f, -0.9f, 0.62f);
        pathBuilder.lineToRelative(1.62f, 1.62f);
        pathBuilder.curveToRelative(0.13f, -0.35f, 0.22f, -0.72f, 0.28f, -1.1f);
        pathBuilder.close();
        pathBuilder.moveTo(20.44f, 18.88f);
        pathBuilder.lineTo(5.12f, 3.56f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(2.15f, 2.15f);
        pathBuilder.curveToRelative(-0.59f, 0.41f, -1.26f, 0.7f, -1.99f, 0.82f);
        pathBuilder.curveToRelative(-0.48f, 0.1f, -0.84f, 0.5f, -0.84f, 1.0f);
        pathBuilder.curveToRelative(0.0f, 0.61f, 0.54f, 1.09f, 1.14f, 1.0f);
        pathBuilder.curveToRelative(1.17f, -0.19f, 2.23f, -0.68f, 3.13f, -1.37f);
        pathBuilder.lineTo(8.73f, 10.0f);
        pathBuilder.curveToRelative(-1.34f, 1.1f, -3.0f, 1.82f, -4.81f, 1.99f);
        pathBuilder.curveToRelative(-0.5f, 0.05f, -0.88f, 0.48f, -0.88f, 0.99f);
        pathBuilder.curveToRelative(0.0f, 0.59f, 0.51f, 1.06f, 1.1f, 1.0f);
        pathBuilder.curveToRelative(2.28f, -0.23f, 4.36f, -1.15f, 6.01f, -2.56f);
        pathBuilder.lineToRelative(2.48f, 2.48f);
        pathBuilder.curveToRelative(-1.4f, 1.65f, -2.33f, 3.72f, -2.56f, 6.0f);
        pathBuilder.curveToRelative(-0.06f, 0.59f, 0.4f, 1.11f, 1.0f, 1.11f);
        pathBuilder.curveToRelative(0.5f, 0.0f, 0.94f, -0.37f, 0.99f, -0.87f);
        pathBuilder.curveToRelative(0.18f, -1.82f, 0.9f, -3.48f, 1.99f, -4.82f);
        pathBuilder.lineToRelative(1.43f, 1.43f);
        pathBuilder.curveToRelative(-0.69f, 0.9f, -1.18f, 1.96f, -1.37f, 3.13f);
        pathBuilder.curveToRelative(-0.1f, 0.6f, 0.39f, 1.14f, 1.0f, 1.14f);
        pathBuilder.curveToRelative(0.49f, 0.0f, 0.9f, -0.36f, 0.98f, -0.85f);
        pathBuilder.curveToRelative(0.12f, -0.73f, 0.42f, -1.4f, 0.82f, -1.99f);
        pathBuilder.lineToRelative(2.13f, 2.13f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.curveToRelative(0.38f, -0.41f, 0.38f, -1.04f, -0.01f, -1.43f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _leakRemove = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
