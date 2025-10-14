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

/* compiled from: AutoAwesome.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_autoAwesome", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AutoAwesome", "Landroidx/compose/material/icons/Icons$Rounded;", "getAutoAwesome", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAutoAwesome.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoAwesome.kt\nandroidx/compose/material/icons/rounded/AutoAwesomeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,79:1\n212#2,12:80\n233#2,18:93\n253#2:130\n174#3:92\n705#4,2:111\n717#4,2:113\n719#4,11:119\n72#5,4:115\n*S KotlinDebug\n*F\n+ 1 AutoAwesome.kt\nandroidx/compose/material/icons/rounded/AutoAwesomeKt\n*L\n29#1:80,12\n30#1:93,18\n30#1:130\n29#1:92\n30#1:111,2\n30#1:113,2\n30#1:119,11\n30#1:115,4\n*E\n"})
/* loaded from: classes2.dex */
public final class AutoAwesomeKt {

    @Nullable
    private static ImageVector _autoAwesome;

    @NotNull
    public static final ImageVector getAutoAwesome(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _autoAwesome;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AutoAwesome", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.46f, 8.0f);
        pathBuilder.lineToRelative(0.79f, -1.75f);
        pathBuilder.lineTo(22.0f, 5.46f);
        pathBuilder.curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f);
        pathBuilder.lineToRelative(-1.75f, -0.79f);
        pathBuilder.lineTo(19.46f, 2.0f);
        pathBuilder.curveToRelative(-0.18f, -0.39f, -0.73f, -0.39f, -0.91f, 0.0f);
        pathBuilder.lineToRelative(-0.79f, 1.75f);
        pathBuilder.lineTo(16.0f, 4.54f);
        pathBuilder.curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f);
        pathBuilder.lineToRelative(1.75f, 0.79f);
        pathBuilder.lineTo(18.54f, 8.0f);
        pathBuilder.curveTo(18.72f, 8.39f, 19.28f, 8.39f, 19.46f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.5f, 9.5f);
        pathBuilder.lineTo(9.91f, 6.0f);
        pathBuilder.curveTo(9.56f, 5.22f, 8.44f, 5.22f, 8.09f, 6.0f);
        pathBuilder.lineTo(6.5f, 9.5f);
        pathBuilder.lineTo(3.0f, 11.09f);
        pathBuilder.curveToRelative(-0.78f, 0.36f, -0.78f, 1.47f, 0.0f, 1.82f);
        pathBuilder.lineToRelative(3.5f, 1.59f);
        pathBuilder.lineTo(8.09f, 18.0f);
        pathBuilder.curveToRelative(0.36f, 0.78f, 1.47f, 0.78f, 1.82f, 0.0f);
        pathBuilder.lineToRelative(1.59f, -3.5f);
        pathBuilder.lineToRelative(3.5f, -1.59f);
        pathBuilder.curveToRelative(0.78f, -0.36f, 0.78f, -1.47f, 0.0f, -1.82f);
        pathBuilder.lineTo(11.5f, 9.5f);
        pathBuilder.close();
        pathBuilder.moveTo(18.54f, 16.0f);
        pathBuilder.lineToRelative(-0.79f, 1.75f);
        pathBuilder.lineTo(16.0f, 18.54f);
        pathBuilder.curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f);
        pathBuilder.lineToRelative(1.75f, 0.79f);
        pathBuilder.lineTo(18.54f, 22.0f);
        pathBuilder.curveToRelative(0.18f, 0.39f, 0.73f, 0.39f, 0.91f, 0.0f);
        pathBuilder.lineToRelative(0.79f, -1.75f);
        pathBuilder.lineTo(22.0f, 19.46f);
        pathBuilder.curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f);
        pathBuilder.lineToRelative(-1.75f, -0.79f);
        pathBuilder.lineTo(19.46f, 16.0f);
        pathBuilder.curveTo(19.28f, 15.61f, 18.72f, 15.61f, 18.54f, 16.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoAwesome = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
