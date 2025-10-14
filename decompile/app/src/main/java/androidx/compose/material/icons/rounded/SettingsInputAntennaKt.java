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

/* compiled from: SettingsInputAntenna.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_settingsInputAntenna", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SettingsInputAntenna", "Landroidx/compose/material/icons/Icons$Rounded;", "getSettingsInputAntenna", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSettingsInputAntenna.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsInputAntenna.kt\nandroidx/compose/material/icons/rounded/SettingsInputAntennaKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,73:1\n212#2,12:74\n233#2,18:87\n253#2:124\n174#3:86\n705#4,2:105\n717#4,2:107\n719#4,11:113\n72#5,4:109\n*S KotlinDebug\n*F\n+ 1 SettingsInputAntenna.kt\nandroidx/compose/material/icons/rounded/SettingsInputAntennaKt\n*L\n29#1:74,12\n30#1:87,18\n30#1:124\n29#1:86\n30#1:105,2\n30#1:107,2\n30#1:113,11\n30#1:109,4\n*E\n"})
/* loaded from: classes4.dex */
public final class SettingsInputAntennaKt {

    @Nullable
    private static ImageVector _settingsInputAntenna;

    @NotNull
    public static final ImageVector getSettingsInputAntenna(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _settingsInputAntenna;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SettingsInputAntenna", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 5.0f);
        pathBuilder.curveToRelative(-3.48f, 0.0f, -6.37f, 2.54f, -6.91f, 5.87f);
        pathBuilder.curveToRelative(-0.1f, 0.59f, 0.39f, 1.13f, 1.0f, 1.13f);
        pathBuilder.curveToRelative(0.49f, 0.0f, 0.9f, -0.36f, 0.98f, -0.85f);
        pathBuilder.curveTo(7.48f, 8.79f, 9.53f, 7.0f, 12.0f, 7.0f);
        pathBuilder.reflectiveCurveToRelative(4.52f, 1.79f, 4.93f, 4.15f);
        pathBuilder.curveToRelative(0.08f, 0.49f, 0.49f, 0.85f, 0.98f, 0.85f);
        pathBuilder.curveToRelative(0.61f, 0.0f, 1.09f, -0.54f, 0.99f, -1.13f);
        pathBuilder.curveTo(18.37f, 7.54f, 15.48f, 5.0f, 12.0f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 14.29f);
        pathBuilder.curveToRelative(1.07f, -0.48f, 1.76f, -1.66f, 1.41f, -2.99f);
        pathBuilder.curveToRelative(-0.22f, -0.81f, -0.87f, -1.47f, -1.68f, -1.7f);
        pathBuilder.curveTo(11.04f, 9.12f, 9.5f, 10.38f, 9.5f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.02f, 0.62f, 1.9f, 1.5f, 2.29f);
        pathBuilder.verticalLineToRelative(3.3f);
        pathBuilder.lineToRelative(-2.71f, 2.7f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(2.3f, -2.3f);
        pathBuilder.lineToRelative(2.3f, 2.3f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.reflectiveCurveToRelative(0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineTo(13.0f, 17.59f);
        pathBuilder.verticalLineTo(14.29f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 1.0f);
        pathBuilder.curveTo(6.3f, 1.0f, 1.61f, 5.34f, 1.05f, 10.9f);
        pathBuilder.curveTo(1.0f, 11.49f, 1.46f, 12.0f, 2.05f, 12.0f);
        pathBuilder.curveToRelative(0.51f, 0.0f, 0.94f, -0.38f, 0.99f, -0.88f);
        pathBuilder.curveTo(3.48f, 6.56f, 7.33f, 3.0f, 12.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(8.52f, 3.56f, 8.96f, 8.12f);
        pathBuilder.curveToRelative(0.05f, 0.5f, 0.48f, 0.88f, 0.99f, 0.88f);
        pathBuilder.curveToRelative(0.59f, 0.0f, 1.06f, -0.51f, 1.0f, -1.1f);
        pathBuilder.curveTo(22.39f, 5.34f, 17.7f, 1.0f, 12.0f, 1.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsInputAntenna = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
