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

/* compiled from: PowerSettingsNew.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_powerSettingsNew", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PowerSettingsNew", "Landroidx/compose/material/icons/Icons$Rounded;", "getPowerSettingsNew", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPowerSettingsNew.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PowerSettingsNew.kt\nandroidx/compose/material/icons/rounded/PowerSettingsNewKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,59:1\n212#2,12:60\n233#2,18:73\n253#2:110\n174#3:72\n705#4,2:91\n717#4,2:93\n719#4,11:99\n72#5,4:95\n*S KotlinDebug\n*F\n+ 1 PowerSettingsNew.kt\nandroidx/compose/material/icons/rounded/PowerSettingsNewKt\n*L\n29#1:60,12\n30#1:73,18\n30#1:110\n29#1:72\n30#1:91,2\n30#1:93,2\n30#1:99,11\n30#1:95,4\n*E\n"})
/* loaded from: classes3.dex */
public final class PowerSettingsNewKt {

    @Nullable
    private static ImageVector _powerSettingsNew;

    @NotNull
    public static final ImageVector getPowerSettingsNew(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _powerSettingsNew;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PowerSettingsNew", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 3.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.lineTo(13.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.14f, 5.86f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.38f, 1.0f, -0.01f, 1.39f);
        pathBuilder.curveToRelative(1.13f, 1.2f, 1.83f, 2.8f, 1.87f, 4.57f);
        pathBuilder.curveToRelative(0.09f, 3.83f, -3.08f, 7.13f, -6.91f, 7.17f);
        pathBuilder.curveTo(8.18f, 19.05f, 5.0f, 15.9f, 5.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.84f, 0.71f, -3.51f, 1.87f, -4.76f);
        pathBuilder.curveToRelative(0.37f, -0.39f, 0.37f, -1.0f, -0.01f, -1.38f);
        pathBuilder.curveToRelative(-0.4f, -0.4f, -1.05f, -0.39f, -1.43f, 0.02f);
        pathBuilder.curveTo(3.98f, 7.42f, 3.07f, 9.47f, 3.0f, 11.74f);
        pathBuilder.curveToRelative(-0.14f, 4.88f, 3.83f, 9.1f, 8.71f, 9.25f);
        pathBuilder.curveToRelative(5.1f, 0.16f, 9.29f, -3.93f, 9.29f, -9.0f);
        pathBuilder.curveToRelative(0.0f, -2.37f, -0.92f, -4.51f, -2.42f, -6.11f);
        pathBuilder.curveToRelative(-0.38f, -0.41f, -1.04f, -0.42f, -1.44f, -0.02f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _powerSettingsNew = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
