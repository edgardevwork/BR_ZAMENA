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

/* compiled from: AppSettingsAlt.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_appSettingsAlt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AppSettingsAlt", "Landroidx/compose/material/icons/Icons$Rounded;", "getAppSettingsAlt", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAppSettingsAlt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSettingsAlt.kt\nandroidx/compose/material/icons/rounded/AppSettingsAltKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,101:1\n212#2,12:102\n233#2,18:115\n253#2:152\n174#3:114\n705#4,2:133\n717#4,2:135\n719#4,11:141\n72#5,4:137\n*S KotlinDebug\n*F\n+ 1 AppSettingsAlt.kt\nandroidx/compose/material/icons/rounded/AppSettingsAltKt\n*L\n29#1:102,12\n30#1:115,18\n30#1:152\n29#1:114\n30#1:133,2\n30#1:135,2\n30#1:141,11\n30#1:137,4\n*E\n"})
/* loaded from: classes4.dex */
public final class AppSettingsAltKt {

    @Nullable
    private static ImageVector _appSettingsAlt;

    @NotNull
    public static final ImageVector getAppSettingsAlt(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _appSettingsAlt;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AppSettingsAlt", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 18.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.lineTo(7.0f, 1.01f);
        pathBuilder.curveTo(5.9f, 1.01f, 5.0f, 1.9f, 5.0f, 3.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -0.13f, -0.02f, -0.26f, -0.04f, -0.39f);
        pathBuilder.lineToRelative(0.64f, -0.48f);
        pathBuilder.curveToRelative(0.2f, -0.15f, 0.26f, -0.44f, 0.13f, -0.66f);
        pathBuilder.lineToRelative(-0.57f, -0.96f);
        pathBuilder.curveToRelative(-0.13f, -0.21f, -0.39f, -0.3f, -0.62f, -0.2f);
        pathBuilder.lineToRelative(-0.72f, 0.3f);
        pathBuilder.curveToRelative(-0.2f, -0.15f, -0.42f, -0.29f, -0.65f, -0.39f);
        pathBuilder.lineToRelative(-0.1f, -0.77f);
        pathBuilder.curveToRelative(-0.03f, -0.25f, -0.24f, -0.43f, -0.49f, -0.44f);
        pathBuilder.lineToRelative(-1.12f, -0.02f);
        pathBuilder.curveToRelative(-0.26f, 0.0f, -0.47f, 0.18f, -0.5f, 0.44f);
        pathBuilder.lineToRelative(-0.1f, 0.79f);
        pathBuilder.curveToRelative(-0.24f, 0.1f, -0.45f, 0.23f, -0.65f, 0.39f);
        pathBuilder.lineToRelative(-0.72f, -0.3f);
        pathBuilder.curveToRelative(-0.23f, -0.1f, -0.5f, -0.01f, -0.62f, 0.2f);
        pathBuilder.lineToRelative(-0.57f, 0.96f);
        pathBuilder.curveToRelative(-0.13f, 0.22f, -0.08f, 0.5f, 0.13f, 0.66f);
        pathBuilder.lineToRelative(0.64f, 0.48f);
        pathBuilder.curveTo(15.02f, 11.74f, 15.0f, 11.87f, 15.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 0.13f, 0.02f, 0.25f, 0.04f, 0.37f);
        pathBuilder.lineToRelative(-0.64f, 0.49f);
        pathBuilder.curveToRelative(-0.2f, 0.15f, -0.26f, 0.43f, -0.13f, 0.65f);
        pathBuilder.lineToRelative(0.56f, 0.97f);
        pathBuilder.curveToRelative(0.13f, 0.22f, 0.39f, 0.31f, 0.63f, 0.21f);
        pathBuilder.lineToRelative(0.73f, -0.31f);
        pathBuilder.curveToRelative(0.2f, 0.16f, 0.42f, 0.3f, 0.67f, 0.4f);
        pathBuilder.lineToRelative(0.1f, 0.77f);
        pathBuilder.curveToRelative(0.03f, 0.25f, 0.24f, 0.44f, 0.5f, 0.44f);
        pathBuilder.horizontalLineToRelative(1.12f);
        pathBuilder.curveToRelative(0.25f, 0.0f, 0.46f, -0.19f, 0.5f, -0.44f);
        pathBuilder.lineToRelative(0.1f, -0.77f);
        pathBuilder.curveToRelative(0.24f, -0.1f, 0.46f, -0.24f, 0.67f, -0.4f);
        pathBuilder.lineToRelative(0.73f, 0.31f);
        pathBuilder.curveToRelative(0.23f, 0.1f, 0.5f, 0.01f, 0.63f, -0.21f);
        pathBuilder.lineToRelative(0.56f, -0.97f);
        pathBuilder.curveToRelative(0.13f, -0.22f, 0.07f, -0.5f, -0.13f, -0.65f);
        pathBuilder.lineToRelative(-0.64f, -0.49f);
        pathBuilder.curveTo(20.98f, 12.25f, 21.0f, 12.13f, 21.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 13.5f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(18.83f, 13.5f, 18.0f, 13.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _appSettingsAlt = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
