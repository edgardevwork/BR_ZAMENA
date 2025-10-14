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

/* compiled from: SettingsSuggest.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_settingsSuggest", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SettingsSuggest", "Landroidx/compose/material/icons/Icons$Rounded;", "getSettingsSuggest", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSettingsSuggest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsSuggest.kt\nandroidx/compose/material/icons/rounded/SettingsSuggestKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,111:1\n212#2,12:112\n233#2,18:125\n253#2:162\n174#3:124\n705#4,2:143\n717#4,2:145\n719#4,11:151\n72#5,4:147\n*S KotlinDebug\n*F\n+ 1 SettingsSuggest.kt\nandroidx/compose/material/icons/rounded/SettingsSuggestKt\n*L\n29#1:112,12\n30#1:125,18\n30#1:162\n29#1:124\n30#1:143,2\n30#1:145,2\n30#1:151,11\n30#1:147,4\n*E\n"})
/* loaded from: classes4.dex */
public final class SettingsSuggestKt {

    @Nullable
    private static ImageVector _settingsSuggest;

    @NotNull
    public static final ImageVector getSettingsSuggest(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _settingsSuggest;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SettingsSuggest", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.04f, 7.99f);
        pathBuilder.lineToRelative(-0.63f, -1.4f);
        pathBuilder.lineToRelative(-1.4f, -0.63f);
        pathBuilder.curveToRelative(-0.39f, -0.18f, -0.39f, -0.73f, 0.0f, -0.91f);
        pathBuilder.lineToRelative(1.4f, -0.63f);
        pathBuilder.lineToRelative(0.63f, -1.4f);
        pathBuilder.curveToRelative(0.18f, -0.39f, 0.73f, -0.39f, 0.91f, 0.0f);
        pathBuilder.lineToRelative(0.63f, 1.4f);
        pathBuilder.lineToRelative(1.4f, 0.63f);
        pathBuilder.curveToRelative(0.39f, 0.18f, 0.39f, 0.73f, 0.0f, 0.91f);
        pathBuilder.lineToRelative(-1.4f, 0.63f);
        pathBuilder.lineToRelative(-0.63f, 1.4f);
        pathBuilder.curveTo(18.78f, 8.38f, 18.22f, 8.38f, 18.04f, 7.99f);
        pathBuilder.close();
        pathBuilder.moveTo(21.28f, 12.72f);
        pathBuilder.lineTo(20.96f, 12.0f);
        pathBuilder.curveToRelative(-0.18f, -0.39f, -0.73f, -0.39f, -0.91f, 0.0f);
        pathBuilder.lineToRelative(-0.32f, 0.72f);
        pathBuilder.lineTo(19.0f, 13.04f);
        pathBuilder.curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f);
        pathBuilder.lineToRelative(0.72f, 0.32f);
        pathBuilder.lineTo(20.04f, 15.0f);
        pathBuilder.curveToRelative(0.18f, 0.39f, 0.73f, 0.39f, 0.91f, 0.0f);
        pathBuilder.lineToRelative(0.32f, -0.72f);
        pathBuilder.lineTo(22.0f, 13.96f);
        pathBuilder.curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f);
        pathBuilder.lineTo(21.28f, 12.72f);
        pathBuilder.close();
        pathBuilder.moveTo(16.24f, 14.37f);
        pathBuilder.lineToRelative(1.23f, 0.93f);
        pathBuilder.curveToRelative(0.4f, 0.3f, 0.51f, 0.86f, 0.26f, 1.3f);
        pathBuilder.lineToRelative(-1.62f, 2.8f);
        pathBuilder.curveToRelative(-0.25f, 0.44f, -0.79f, 0.62f, -1.25f, 0.42f);
        pathBuilder.lineToRelative(-1.43f, -0.6f);
        pathBuilder.curveToRelative(-0.2f, 0.13f, -0.42f, 0.26f, -0.64f, 0.37f);
        pathBuilder.lineToRelative(-0.19f, 1.54f);
        pathBuilder.curveToRelative(-0.06f, 0.5f, -0.49f, 0.88f, -0.99f, 0.88f);
        pathBuilder.horizontalLineTo(8.38f);
        pathBuilder.curveToRelative(-0.5f, 0.0f, -0.93f, -0.38f, -0.99f, -0.88f);
        pathBuilder.lineTo(7.2f, 19.59f);
        pathBuilder.curveToRelative(-0.22f, -0.11f, -0.43f, -0.23f, -0.64f, -0.37f);
        pathBuilder.lineToRelative(-1.43f, 0.6f);
        pathBuilder.curveToRelative(-0.46f, 0.2f, -1.0f, 0.02f, -1.25f, -0.42f);
        pathBuilder.lineToRelative(-1.62f, -2.8f);
        pathBuilder.curveToRelative(-0.25f, -0.44f, -0.14f, -0.99f, 0.26f, -1.3f);
        pathBuilder.lineToRelative(1.23f, -0.93f);
        pathBuilder.curveTo(3.75f, 14.25f, 3.75f, 14.12f, 3.75f, 14.0f);
        pathBuilder.reflectiveCurveToRelative(0.0f, -0.25f, 0.01f, -0.37f);
        pathBuilder.lineTo(2.53f, 12.7f);
        pathBuilder.curveToRelative(-0.4f, -0.3f, -0.51f, -0.86f, -0.26f, -1.3f);
        pathBuilder.lineToRelative(1.62f, -2.8f);
        pathBuilder.curveToRelative(0.25f, -0.44f, 0.79f, -0.62f, 1.25f, -0.42f);
        pathBuilder.lineToRelative(1.43f, 0.6f);
        pathBuilder.curveToRelative(0.2f, -0.13f, 0.42f, -0.26f, 0.64f, -0.37f);
        pathBuilder.lineToRelative(0.19f, -1.54f);
        pathBuilder.curveTo(7.45f, 6.38f, 7.88f, 6.0f, 8.38f, 6.0f);
        pathBuilder.horizontalLineToRelative(3.23f);
        pathBuilder.curveToRelative(0.5f, 0.0f, 0.93f, 0.38f, 0.99f, 0.88f);
        pathBuilder.lineToRelative(0.19f, 1.54f);
        pathBuilder.curveToRelative(0.22f, 0.11f, 0.43f, 0.23f, 0.64f, 0.37f);
        pathBuilder.lineToRelative(1.43f, -0.6f);
        pathBuilder.curveToRelative(0.46f, -0.2f, 1.0f, -0.02f, 1.25f, 0.42f);
        pathBuilder.lineToRelative(1.62f, 2.8f);
        pathBuilder.curveToRelative(0.25f, 0.44f, 0.14f, 0.99f, -0.26f, 1.3f);
        pathBuilder.lineToRelative(-1.23f, 0.93f);
        pathBuilder.curveToRelative(0.01f, 0.12f, 0.01f, 0.24f, 0.01f, 0.37f);
        pathBuilder.reflectiveCurveTo(16.25f, 14.25f, 16.24f, 14.37f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 14.0f);
        pathBuilder.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(-3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveTo(13.0f, 15.66f, 13.0f, 14.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsSuggest = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
