package androidx.compose.material.icons.filled;

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

/* compiled from: SettingsApplications.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_settingsApplications", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SettingsApplications", "Landroidx/compose/material/icons/Icons$Filled;", "getSettingsApplications", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSettingsApplications.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsApplications.kt\nandroidx/compose/material/icons/filled/SettingsApplicationsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,93:1\n212#2,12:94\n233#2,18:107\n253#2:144\n174#3:106\n705#4,2:125\n717#4,2:127\n719#4,11:133\n72#5,4:129\n*S KotlinDebug\n*F\n+ 1 SettingsApplications.kt\nandroidx/compose/material/icons/filled/SettingsApplicationsKt\n*L\n29#1:94,12\n30#1:107,18\n30#1:144\n29#1:106\n30#1:125,2\n30#1:127,2\n30#1:133,11\n30#1:129,4\n*E\n"})
/* loaded from: classes.dex */
public final class SettingsApplicationsKt {

    @Nullable
    private static ImageVector _settingsApplications;

    @NotNull
    public static final ImageVector getSettingsApplications(@NotNull Icons.Filled filled) {
        ImageVector imageVector = _settingsApplications;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SettingsApplications", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 10.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 3.0f);
        pathBuilder.lineTo(5.0f, 3.0f);
        pathBuilder.curveToRelative(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.lineTo(21.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.89f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.25f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 0.23f, -0.02f, 0.46f, -0.05f, 0.68f);
        pathBuilder.lineToRelative(1.48f, 1.16f);
        pathBuilder.curveToRelative(0.13f, 0.11f, 0.17f, 0.3f, 0.08f, 0.45f);
        pathBuilder.lineToRelative(-1.4f, 2.42f);
        pathBuilder.curveToRelative(-0.09f, 0.15f, -0.27f, 0.21f, -0.43f, 0.15f);
        pathBuilder.lineToRelative(-1.74f, -0.7f);
        pathBuilder.curveToRelative(-0.36f, 0.28f, -0.76f, 0.51f, -1.18f, 0.69f);
        pathBuilder.lineToRelative(-0.26f, 1.85f);
        pathBuilder.curveToRelative(-0.03f, 0.17f, -0.18f, 0.3f, -0.35f, 0.3f);
        pathBuilder.horizontalLineToRelative(-2.8f);
        pathBuilder.curveToRelative(-0.17f, 0.0f, -0.32f, -0.13f, -0.35f, -0.29f);
        pathBuilder.lineToRelative(-0.26f, -1.85f);
        pathBuilder.curveToRelative(-0.43f, -0.18f, -0.82f, -0.41f, -1.18f, -0.69f);
        pathBuilder.lineToRelative(-1.74f, 0.7f);
        pathBuilder.curveToRelative(-0.16f, 0.06f, -0.34f, 0.0f, -0.43f, -0.15f);
        pathBuilder.lineToRelative(-1.4f, -2.42f);
        pathBuilder.curveToRelative(-0.09f, -0.15f, -0.05f, -0.34f, 0.08f, -0.45f);
        pathBuilder.lineToRelative(1.48f, -1.16f);
        pathBuilder.curveToRelative(-0.03f, -0.23f, -0.05f, -0.46f, -0.05f, -0.69f);
        pathBuilder.curveToRelative(0.0f, -0.23f, 0.02f, -0.46f, 0.05f, -0.68f);
        pathBuilder.lineToRelative(-1.48f, -1.16f);
        pathBuilder.curveToRelative(-0.13f, -0.11f, -0.17f, -0.3f, -0.08f, -0.45f);
        pathBuilder.lineToRelative(1.4f, -2.42f);
        pathBuilder.curveToRelative(0.09f, -0.15f, 0.27f, -0.21f, 0.43f, -0.15f);
        pathBuilder.lineToRelative(1.74f, 0.7f);
        pathBuilder.curveToRelative(0.36f, -0.28f, 0.76f, -0.51f, 1.18f, -0.69f);
        pathBuilder.lineToRelative(0.26f, -1.85f);
        pathBuilder.curveToRelative(0.03f, -0.17f, 0.18f, -0.3f, 0.35f, -0.3f);
        pathBuilder.horizontalLineToRelative(2.8f);
        pathBuilder.curveToRelative(0.17f, 0.0f, 0.32f, 0.13f, 0.35f, 0.29f);
        pathBuilder.lineToRelative(0.26f, 1.85f);
        pathBuilder.curveToRelative(0.43f, 0.18f, 0.82f, 0.41f, 1.18f, 0.69f);
        pathBuilder.lineToRelative(1.74f, -0.7f);
        pathBuilder.curveToRelative(0.16f, -0.06f, 0.34f, 0.0f, 0.43f, 0.15f);
        pathBuilder.lineToRelative(1.4f, 2.42f);
        pathBuilder.curveToRelative(0.09f, 0.15f, 0.05f, 0.34f, -0.08f, 0.45f);
        pathBuilder.lineToRelative(-1.48f, 1.16f);
        pathBuilder.curveToRelative(0.03f, 0.23f, 0.05f, 0.46f, 0.05f, 0.69f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsApplications = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
