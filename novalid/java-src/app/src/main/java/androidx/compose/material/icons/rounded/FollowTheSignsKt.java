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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FollowTheSigns.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7105d2 = {"_followTheSigns", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FollowTheSigns", "Landroidx/compose/material/icons/Icons$Rounded;", "getFollowTheSigns$annotations", "(Landroidx/compose/material/icons/Icons$Rounded;)V", "getFollowTheSigns", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFollowTheSigns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FollowTheSigns.kt\nandroidx/compose/material/icons/rounded/FollowTheSignsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,108:1\n212#2,12:109\n233#2,18:122\n253#2:159\n174#3:121\n705#4,2:140\n717#4,2:142\n719#4,11:148\n72#5,4:144\n*S KotlinDebug\n*F\n+ 1 FollowTheSigns.kt\nandroidx/compose/material/icons/rounded/FollowTheSignsKt\n*L\n35#1:109,12\n36#1:122,18\n36#1:159\n35#1:121\n36#1:140,2\n36#1:142,2\n36#1:148,11\n36#1:144,4\n*E\n"})
/* loaded from: classes4.dex */
public final class FollowTheSignsKt {

    @Nullable
    private static ImageVector _followTheSigns;

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.Rounded.FollowTheSigns", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.Rounded.FollowTheSigns", imports = {"androidx.compose.material.icons.automirrored.rounded.FollowTheSigns"}))
    public static /* synthetic */ void getFollowTheSigns$annotations(Icons.Rounded rounded) {
    }

    @NotNull
    public static final ImageVector getFollowTheSigns(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _followTheSigns;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FollowTheSigns", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.5f, 5.5f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(8.4f, 5.5f, 9.5f, 5.5f);
        pathBuilder.close();
        pathBuilder.moveTo(5.75f, 8.9f);
        pathBuilder.lineTo(3.23f, 21.81f);
        pathBuilder.curveTo(3.11f, 22.43f, 3.58f, 23.0f, 4.21f, 23.0f);
        pathBuilder.horizontalLineTo(4.3f);
        pathBuilder.curveToRelative(0.47f, 0.0f, 0.88f, -0.33f, 0.98f, -0.79f);
        pathBuilder.lineTo(6.85f, 15.0f);
        pathBuilder.lineTo(9.0f, 17.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-6.14f);
        pathBuilder.curveToRelative(0.0f, -0.27f, -0.11f, -0.52f, -0.29f, -0.71f);
        pathBuilder.lineTo(8.95f, 13.4f);
        pathBuilder.lineToRelative(0.6f, -3.0f);
        pathBuilder.curveToRelative(1.07f, 1.32f, 2.58f, 2.23f, 4.31f, 2.51f);
        pathBuilder.curveToRelative(0.6f, 0.1f, 1.14f, -0.39f, 1.14f, -1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, -0.49f, -0.36f, -0.9f, -0.84f, -0.98f);
        pathBuilder.curveToRelative(-1.49f, -0.25f, -2.75f, -1.15f, -3.51f, -2.38f);
        pathBuilder.lineTo(9.7f, 6.95f);
        pathBuilder.curveTo(9.35f, 6.35f, 8.7f, 6.0f, 8.0f, 6.0f);
        pathBuilder.curveTo(7.75f, 6.0f, 7.5f, 6.05f, 7.25f, 6.15f);
        pathBuilder.lineToRelative(-4.63f, 1.9f);
        pathBuilder.curveTo(2.25f, 8.2f, 2.0f, 8.57f, 2.0f, 8.97f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineTo(9.65f);
        pathBuilder.lineTo(5.75f, 8.9f);
        pathBuilder.moveTo(21.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(-7.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(2.75f);
        pathBuilder.verticalLineToRelative(13.25f);
        pathBuilder.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilder.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.horizontalLineTo(21.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.curveTo(22.0f, 2.45f, 21.55f, 2.0f, 21.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.15f, 5.85f);
        pathBuilder.lineToRelative(-1.28f, 1.29f);
        pathBuilder.curveToRelative(-0.31f, 0.32f, -0.85f, 0.09f, -0.85f, -0.35f);
        pathBuilder.verticalLineTo(6.25f);
        pathBuilder.horizontalLineToRelative(-2.76f);
        pathBuilder.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilder.reflectiveCurveToRelative(0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilder.horizontalLineToRelative(2.76f);
        pathBuilder.verticalLineTo(4.21f);
        pathBuilder.curveToRelative(0.0f, -0.45f, 0.54f, -0.67f, 0.85f, -0.35f);
        pathBuilder.lineToRelative(1.28f, 1.29f);
        pathBuilder.curveTo(20.34f, 5.34f, 20.34f, 5.66f, 20.15f, 5.85f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _followTheSigns = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
