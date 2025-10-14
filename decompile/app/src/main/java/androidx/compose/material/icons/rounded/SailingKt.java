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

/* compiled from: Sailing.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_sailing", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Sailing", "Landroidx/compose/material/icons/Icons$Rounded;", "getSailing", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSailing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sailing.kt\nandroidx/compose/material/icons/rounded/SailingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,92:1\n212#2,12:93\n233#2,18:106\n253#2:143\n174#3:105\n705#4,2:124\n717#4,2:126\n719#4,11:132\n72#5,4:128\n*S KotlinDebug\n*F\n+ 1 Sailing.kt\nandroidx/compose/material/icons/rounded/SailingKt\n*L\n29#1:93,12\n30#1:106,18\n30#1:143\n29#1:105\n30#1:124,2\n30#1:126,2\n30#1:132,11\n30#1:128,4\n*E\n"})
/* loaded from: classes4.dex */
public final class SailingKt {

    @Nullable
    private static ImageVector _sailing;

    @NotNull
    public static final ImageVector getSailing(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _sailing;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Sailing", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 13.0f);
        pathBuilder.verticalLineTo(3.59f);
        pathBuilder.curveToRelative(0.0f, -0.49f, -0.63f, -0.69f, -0.91f, -0.29f);
        pathBuilder.lineToRelative(-6.54f, 9.41f);
        pathBuilder.curveToRelative(-0.23f, 0.33f, 0.01f, 0.79f, 0.41f, 0.79f);
        pathBuilder.horizontalLineToRelative(6.54f);
        pathBuilder.curveTo(10.78f, 13.5f, 11.0f, 13.28f, 11.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.99f, 12.98f);
        pathBuilder.curveTo(20.72f, 7.07f, 15.9f, 2.32f, 13.4f, 1.23f);
        pathBuilder.curveToRelative(-0.37f, -0.16f, -0.77f, 0.2f, -0.67f, 0.59f);
        pathBuilder.curveToRelative(0.3f, 1.13f, 0.76f, 3.28f, 0.76f, 5.68f);
        pathBuilder.curveToRelative(0.0f, 2.44f, -0.49f, 4.39f, -0.78f, 5.35f);
        pathBuilder.curveToRelative(-0.1f, 0.32f, 0.14f, 0.65f, 0.48f, 0.65f);
        pathBuilder.horizontalLineToRelative(7.28f);
        pathBuilder.curveTo(20.76f, 13.5f, 21.0f, 13.26f, 20.99f, 12.98f);
        pathBuilder.close();
        pathBuilder.moveTo(20.62f, 15.0f);
        pathBuilder.horizontalLineTo(3.38f);
        pathBuilder.curveToRelative(-0.73f, 0.0f, -1.22f, 0.76f, -0.92f, 1.42f);
        pathBuilder.curveToRelative(0.43f, 0.92f, 1.07f, 1.71f, 1.86f, 2.31f);
        pathBuilder.curveToRelative(0.38f, -0.16f, 0.74f, -0.38f, 1.06f, -0.63f);
        pathBuilder.curveToRelative(0.35f, -0.29f, 0.87f, -0.29f, 1.23f, 0.0f);
        pathBuilder.curveTo(7.28f, 18.63f, 8.1f, 19.0f, 9.0f, 19.0f);
        pathBuilder.curveToRelative(0.9f, 0.0f, 1.72f, -0.37f, 2.39f, -0.91f);
        pathBuilder.curveToRelative(0.35f, -0.28f, 0.87f, -0.28f, 1.22f, 0.0f);
        pathBuilder.curveTo(13.28f, 18.63f, 14.1f, 19.0f, 15.0f, 19.0f);
        pathBuilder.curveToRelative(0.9f, 0.0f, 1.72f, -0.37f, 2.39f, -0.91f);
        pathBuilder.curveToRelative(0.35f, -0.29f, 0.87f, -0.28f, 1.23f, 0.0f);
        pathBuilder.curveToRelative(0.32f, 0.26f, 0.67f, 0.48f, 1.06f, 0.63f);
        pathBuilder.curveToRelative(0.79f, -0.6f, 1.43f, -1.39f, 1.86f, -2.31f);
        pathBuilder.curveTo(21.84f, 15.76f, 21.35f, 15.0f, 20.62f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 22.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.87f, 0.0f, -1.73f, -0.24f, -2.53f, -0.7f);
        pathBuilder.curveToRelative(-0.29f, -0.16f, -0.65f, -0.17f, -0.94f, 0.0f);
        pathBuilder.curveToRelative(-1.59f, 0.9f, -3.47f, 0.9f, -5.06f, 0.0f);
        pathBuilder.curveToRelative(-0.29f, -0.16f, -0.65f, -0.16f, -0.94f, 0.0f);
        pathBuilder.curveToRelative(-1.59f, 0.9f, -3.47f, 0.9f, -5.06f, 0.0f);
        pathBuilder.curveToRelative(-0.29f, -0.16f, -0.65f, -0.16f, -0.94f, 0.0f);
        pathBuilder.curveTo(4.73f, 20.76f, 3.87f, 21.0f, 3.0f, 21.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(1.15f, 0.0f, 2.3f, -0.31f, 3.33f, -0.94f);
        pathBuilder.curveToRelative(1.66f, 1.11f, 3.78f, 1.01f, 5.58f, 0.14f);
        pathBuilder.curveToRelative(1.91f, 1.05f, 4.17f, 1.07f, 6.09f, 0.05f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.95f, 0.5f, 1.97f, 0.75f, 3.0f, 0.75f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(21.55f, 23.0f, 22.0f, 22.55f, 22.0f, 22.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sailing = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
