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

/* compiled from: EmergencyShare.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_emergencyShare", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EmergencyShare", "Landroidx/compose/material/icons/Icons$Rounded;", "getEmergencyShare", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nEmergencyShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmergencyShare.kt\nandroidx/compose/material/icons/rounded/EmergencyShareKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,70:1\n212#2,12:71\n233#2,18:84\n253#2:121\n174#3:83\n705#4,2:102\n717#4,2:104\n719#4,11:110\n72#5,4:106\n*S KotlinDebug\n*F\n+ 1 EmergencyShare.kt\nandroidx/compose/material/icons/rounded/EmergencyShareKt\n*L\n29#1:71,12\n30#1:84,18\n30#1:121\n29#1:83\n30#1:102,2\n30#1:104,2\n30#1:110,11\n30#1:106,4\n*E\n"})
/* loaded from: classes3.dex */
public final class EmergencyShareKt {

    @Nullable
    private static ImageVector _emergencyShare;

    @NotNull
    public static final ImageVector getEmergencyShare(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _emergencyShare;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.EmergencyShare", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 9.0f);
        pathBuilder.curveToRelative(-3.15f, 0.0f, -6.0f, 2.41f, -6.0f, 6.15f);
        pathBuilder.curveToRelative(0.0f, 2.35f, 1.78f, 5.11f, 5.34f, 8.27f);
        pathBuilder.curveToRelative(0.37f, 0.33f, 0.95f, 0.33f, 1.33f, 0.0f);
        pathBuilder.curveTo(16.22f, 20.25f, 18.0f, 17.5f, 18.0f, 15.15f);
        pathBuilder.curveTo(18.0f, 11.41f, 15.15f, 9.0f, 12.0f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 16.5f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(12.83f, 16.5f, 12.0f, 16.5f);
        pathBuilder.close();
        pathBuilder.moveTo(16.18f, 6.82f);
        pathBuilder.curveToRelative(-0.35f, 0.35f, -0.89f, 0.38f, -1.3f, 0.09f);
        pathBuilder.curveTo(14.07f, 6.34f, 13.07f, 6.0f, 12.0f, 6.0f);
        pathBuilder.reflectiveCurveTo(9.93f, 6.34f, 9.12f, 6.91f);
        pathBuilder.curveToRelative(-0.41f, 0.28f, -0.95f, 0.26f, -1.3f, -0.09f);
        pathBuilder.curveToRelative(-0.43f, -0.43f, -0.39f, -1.15f, 0.09f, -1.5f);
        pathBuilder.curveTo(9.06f, 4.49f, 10.48f, 4.0f, 12.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(2.94f, 0.49f, 4.09f, 1.32f);
        pathBuilder.curveTo(16.58f, 5.67f, 16.61f, 6.39f, 16.18f, 6.82f);
        pathBuilder.close();
        pathBuilder.moveTo(4.97f, 3.97f);
        pathBuilder.curveTo(4.55f, 3.54f, 4.59f, 2.85f, 5.05f, 2.47f);
        pathBuilder.curveTo(6.95f, 0.93f, 9.37f, 0.0f, 12.01f, 0.0f);
        pathBuilder.curveToRelative(2.64f, 0.0f, 5.06f, 0.93f, 6.95f, 2.48f);
        pathBuilder.curveToRelative(0.46f, 0.38f, 0.5f, 1.07f, 0.08f, 1.49f);
        pathBuilder.curveToRelative(-0.36f, 0.36f, -0.93f, 0.39f, -1.32f, 0.07f);
        pathBuilder.curveTo(16.16f, 2.77f, 14.17f, 2.0f, 12.01f, 2.0f);
        pathBuilder.curveTo(9.83f, 2.0f, 7.84f, 2.77f, 6.29f, 4.04f);
        pathBuilder.curveTo(5.9f, 4.36f, 5.33f, 4.32f, 4.97f, 3.97f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emergencyShare = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
