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

/* compiled from: Settings.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_settings", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Settings", "Landroidx/compose/material/icons/Icons$Outlined;", "getSettings", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Settings.kt\nandroidx/compose/material/icons/outlined/SettingsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,145:1\n212#2,12:146\n233#2,18:159\n253#2:196\n174#3:158\n705#4,2:177\n717#4,2:179\n719#4,11:185\n72#5,4:181\n*S KotlinDebug\n*F\n+ 1 Settings.kt\nandroidx/compose/material/icons/outlined/SettingsKt\n*L\n29#1:146,12\n30#1:159,18\n30#1:196\n29#1:158\n30#1:177,2\n30#1:179,2\n30#1:185,11\n30#1:181,4\n*E\n"})
/* loaded from: classes3.dex */
public final class SettingsKt {

    @Nullable
    private static ImageVector _settings;

    @NotNull
    public static final ImageVector getSettings(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _settings;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Settings", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.43f, 12.98f);
        pathBuilder.curveToRelative(0.04f, -0.32f, 0.07f, -0.64f, 0.07f, -0.98f);
        pathBuilder.curveToRelative(0.0f, -0.34f, -0.03f, -0.66f, -0.07f, -0.98f);
        pathBuilder.lineToRelative(2.11f, -1.65f);
        pathBuilder.curveToRelative(0.19f, -0.15f, 0.24f, -0.42f, 0.12f, -0.64f);
        pathBuilder.lineToRelative(-2.0f, -3.46f);
        pathBuilder.curveToRelative(-0.09f, -0.16f, -0.26f, -0.25f, -0.44f, -0.25f);
        pathBuilder.curveToRelative(-0.06f, 0.0f, -0.12f, 0.01f, -0.17f, 0.03f);
        pathBuilder.lineToRelative(-2.49f, 1.0f);
        pathBuilder.curveToRelative(-0.52f, -0.4f, -1.08f, -0.73f, -1.69f, -0.98f);
        pathBuilder.lineToRelative(-0.38f, -2.65f);
        pathBuilder.curveTo(14.46f, 2.18f, 14.25f, 2.0f, 14.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(-0.25f, 0.0f, -0.46f, 0.18f, -0.49f, 0.42f);
        pathBuilder.lineToRelative(-0.38f, 2.65f);
        pathBuilder.curveToRelative(-0.61f, 0.25f, -1.17f, 0.59f, -1.69f, 0.98f);
        pathBuilder.lineToRelative(-2.49f, -1.0f);
        pathBuilder.curveToRelative(-0.06f, -0.02f, -0.12f, -0.03f, -0.18f, -0.03f);
        pathBuilder.curveToRelative(-0.17f, 0.0f, -0.34f, 0.09f, -0.43f, 0.25f);
        pathBuilder.lineToRelative(-2.0f, 3.46f);
        pathBuilder.curveToRelative(-0.13f, 0.22f, -0.07f, 0.49f, 0.12f, 0.64f);
        pathBuilder.lineToRelative(2.11f, 1.65f);
        pathBuilder.curveToRelative(-0.04f, 0.32f, -0.07f, 0.65f, -0.07f, 0.98f);
        pathBuilder.curveToRelative(0.0f, 0.33f, 0.03f, 0.66f, 0.07f, 0.98f);
        pathBuilder.lineToRelative(-2.11f, 1.65f);
        pathBuilder.curveToRelative(-0.19f, 0.15f, -0.24f, 0.42f, -0.12f, 0.64f);
        pathBuilder.lineToRelative(2.0f, 3.46f);
        pathBuilder.curveToRelative(0.09f, 0.16f, 0.26f, 0.25f, 0.44f, 0.25f);
        pathBuilder.curveToRelative(0.06f, 0.0f, 0.12f, -0.01f, 0.17f, -0.03f);
        pathBuilder.lineToRelative(2.49f, -1.0f);
        pathBuilder.curveToRelative(0.52f, 0.4f, 1.08f, 0.73f, 1.69f, 0.98f);
        pathBuilder.lineToRelative(0.38f, 2.65f);
        pathBuilder.curveToRelative(0.03f, 0.24f, 0.24f, 0.42f, 0.49f, 0.42f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.25f, 0.0f, 0.46f, -0.18f, 0.49f, -0.42f);
        pathBuilder.lineToRelative(0.38f, -2.65f);
        pathBuilder.curveToRelative(0.61f, -0.25f, 1.17f, -0.59f, 1.69f, -0.98f);
        pathBuilder.lineToRelative(2.49f, 1.0f);
        pathBuilder.curveToRelative(0.06f, 0.02f, 0.12f, 0.03f, 0.18f, 0.03f);
        pathBuilder.curveToRelative(0.17f, 0.0f, 0.34f, -0.09f, 0.43f, -0.25f);
        pathBuilder.lineToRelative(2.0f, -3.46f);
        pathBuilder.curveToRelative(0.12f, -0.22f, 0.07f, -0.49f, -0.12f, -0.64f);
        pathBuilder.lineToRelative(-2.11f, -1.65f);
        pathBuilder.close();
        pathBuilder.moveTo(17.45f, 11.27f);
        pathBuilder.curveToRelative(0.04f, 0.31f, 0.05f, 0.52f, 0.05f, 0.73f);
        pathBuilder.curveToRelative(0.0f, 0.21f, -0.02f, 0.43f, -0.05f, 0.73f);
        pathBuilder.lineToRelative(-0.14f, 1.13f);
        pathBuilder.lineToRelative(0.89f, 0.7f);
        pathBuilder.lineToRelative(1.08f, 0.84f);
        pathBuilder.lineToRelative(-0.7f, 1.21f);
        pathBuilder.lineToRelative(-1.27f, -0.51f);
        pathBuilder.lineToRelative(-1.04f, -0.42f);
        pathBuilder.lineToRelative(-0.9f, 0.68f);
        pathBuilder.curveToRelative(-0.43f, 0.32f, -0.84f, 0.56f, -1.25f, 0.73f);
        pathBuilder.lineToRelative(-1.06f, 0.43f);
        pathBuilder.lineToRelative(-0.16f, 1.13f);
        pathBuilder.lineToRelative(-0.2f, 1.35f);
        pathBuilder.horizontalLineToRelative(-1.4f);
        pathBuilder.lineToRelative(-0.19f, -1.35f);
        pathBuilder.lineToRelative(-0.16f, -1.13f);
        pathBuilder.lineToRelative(-1.06f, -0.43f);
        pathBuilder.curveToRelative(-0.43f, -0.18f, -0.83f, -0.41f, -1.23f, -0.71f);
        pathBuilder.lineToRelative(-0.91f, -0.7f);
        pathBuilder.lineToRelative(-1.06f, 0.43f);
        pathBuilder.lineToRelative(-1.27f, 0.51f);
        pathBuilder.lineToRelative(-0.7f, -1.21f);
        pathBuilder.lineToRelative(1.08f, -0.84f);
        pathBuilder.lineToRelative(0.89f, -0.7f);
        pathBuilder.lineToRelative(-0.14f, -1.13f);
        pathBuilder.curveToRelative(-0.03f, -0.31f, -0.05f, -0.54f, -0.05f, -0.74f);
        pathBuilder.reflectiveCurveToRelative(0.02f, -0.43f, 0.05f, -0.73f);
        pathBuilder.lineToRelative(0.14f, -1.13f);
        pathBuilder.lineToRelative(-0.89f, -0.7f);
        pathBuilder.lineToRelative(-1.08f, -0.84f);
        pathBuilder.lineToRelative(0.7f, -1.21f);
        pathBuilder.lineToRelative(1.27f, 0.51f);
        pathBuilder.lineToRelative(1.04f, 0.42f);
        pathBuilder.lineToRelative(0.9f, -0.68f);
        pathBuilder.curveToRelative(0.43f, -0.32f, 0.84f, -0.56f, 1.25f, -0.73f);
        pathBuilder.lineToRelative(1.06f, -0.43f);
        pathBuilder.lineToRelative(0.16f, -1.13f);
        pathBuilder.lineToRelative(0.2f, -1.35f);
        pathBuilder.horizontalLineToRelative(1.39f);
        pathBuilder.lineToRelative(0.19f, 1.35f);
        pathBuilder.lineToRelative(0.16f, 1.13f);
        pathBuilder.lineToRelative(1.06f, 0.43f);
        pathBuilder.curveToRelative(0.43f, 0.18f, 0.83f, 0.41f, 1.23f, 0.71f);
        pathBuilder.lineToRelative(0.91f, 0.7f);
        pathBuilder.lineToRelative(1.06f, -0.43f);
        pathBuilder.lineToRelative(1.27f, -0.51f);
        pathBuilder.lineToRelative(0.7f, 1.21f);
        pathBuilder.lineToRelative(-1.07f, 0.85f);
        pathBuilder.lineToRelative(-0.89f, 0.7f);
        pathBuilder.lineToRelative(0.14f, 1.13f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 8.0f);
        pathBuilder.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 14.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settings = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
