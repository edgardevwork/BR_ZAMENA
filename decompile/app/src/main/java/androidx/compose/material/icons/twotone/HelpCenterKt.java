package androidx.compose.material.icons.twotone;

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

/* compiled from: HelpCenter.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7105d2 = {"_helpCenter", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HelpCenter", "Landroidx/compose/material/icons/Icons$TwoTone;", "getHelpCenter$annotations", "(Landroidx/compose/material/icons/Icons$TwoTone;)V", "getHelpCenter", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHelpCenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelpCenter.kt\nandroidx/compose/material/icons/twotone/HelpCenterKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,105:1\n212#2,12:106\n233#2,18:119\n253#2:156\n233#2,18:157\n253#2:194\n174#3:118\n705#4,2:137\n717#4,2:139\n719#4,11:145\n705#4,2:175\n717#4,2:177\n719#4,11:183\n72#5,4:141\n72#5,4:179\n*S KotlinDebug\n*F\n+ 1 HelpCenter.kt\nandroidx/compose/material/icons/twotone/HelpCenterKt\n*L\n35#1:106,12\n36#1:119,18\n36#1:156\n63#1:157,18\n63#1:194\n35#1:118\n36#1:137,2\n36#1:139,2\n36#1:145,11\n63#1:175,2\n63#1:177,2\n63#1:183,11\n36#1:141,4\n63#1:179,4\n*E\n"})
/* loaded from: classes3.dex */
public final class HelpCenterKt {

    @Nullable
    private static ImageVector _helpCenter;

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.TwoTone.HelpCenter", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.TwoTone.HelpCenter", imports = {"androidx.compose.material.icons.automirrored.twotone.HelpCenter"}))
    public static /* synthetic */ void getHelpCenter$annotations(Icons.TwoTone twoTone) {
    }

    @NotNull
    public static final ImageVector getHelpCenter(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _helpCenter;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.HelpCenter", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 5.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.01f, 18.0f);
        pathBuilder.curveToRelative(-0.7f, 0.0f, -1.26f, -0.56f, -1.26f, -1.26f);
        pathBuilder.curveToRelative(0.0f, -0.71f, 0.56f, -1.25f, 1.26f, -1.25f);
        pathBuilder.curveToRelative(0.71f, 0.0f, 1.25f, 0.54f, 1.25f, 1.25f);
        pathBuilder.curveTo(13.25f, 17.43f, 12.72f, 18.0f, 12.01f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.02f, 10.6f);
        pathBuilder.curveToRelative(-0.76f, 1.11f, -1.48f, 1.46f, -1.87f, 2.17f);
        pathBuilder.curveToRelative(-0.16f, 0.29f, -0.22f, 0.48f, -0.22f, 1.41f);
        pathBuilder.horizontalLineToRelative(-1.82f);
        pathBuilder.curveToRelative(0.0f, -0.49f, -0.08f, -1.29f, 0.31f, -1.98f);
        pathBuilder.curveToRelative(0.49f, -0.87f, 1.42f, -1.39f, 1.96f, -2.16f);
        pathBuilder.curveToRelative(0.57f, -0.81f, 0.25f, -2.33f, -1.37f, -2.33f);
        pathBuilder.curveToRelative(-1.06f, 0.0f, -1.58f, 0.8f, -1.8f, 1.48f);
        pathBuilder.lineTo(8.56f, 8.49f);
        pathBuilder.curveTo(9.01f, 7.15f, 10.22f, 6.0f, 11.99f, 6.0f);
        pathBuilder.curveToRelative(1.48f, 0.0f, 2.49f, 0.67f, 3.01f, 1.52f);
        pathBuilder.curveTo(15.44f, 8.24f, 15.7f, 9.59f, 15.02f, 10.6f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(13.25f, 16.74f);
        pathBuilder2.curveToRelative(0.0f, 0.69f, -0.53f, 1.26f, -1.25f, 1.26f);
        pathBuilder2.curveToRelative(-0.7f, 0.0f, -1.26f, -0.56f, -1.26f, -1.26f);
        pathBuilder2.curveToRelative(0.0f, -0.71f, 0.56f, -1.25f, 1.26f, -1.25f);
        pathBuilder2.curveTo(12.71f, 15.49f, 13.25f, 16.04f, 13.25f, 16.74f);
        pathBuilder2.close();
        pathBuilder2.moveTo(11.99f, 6.0f);
        pathBuilder2.curveToRelative(-1.77f, 0.0f, -2.98f, 1.15f, -3.43f, 2.49f);
        pathBuilder2.lineToRelative(1.64f, 0.69f);
        pathBuilder2.curveToRelative(0.22f, -0.67f, 0.74f, -1.48f, 1.8f, -1.48f);
        pathBuilder2.curveToRelative(1.62f, 0.0f, 1.94f, 1.52f, 1.37f, 2.33f);
        pathBuilder2.curveToRelative(-0.54f, 0.77f, -1.47f, 1.29f, -1.96f, 2.16f);
        pathBuilder2.curveToRelative(-0.39f, 0.69f, -0.31f, 1.49f, -0.31f, 1.98f);
        pathBuilder2.horizontalLineToRelative(1.82f);
        pathBuilder2.curveToRelative(0.0f, -0.93f, 0.07f, -1.12f, 0.22f, -1.41f);
        pathBuilder2.curveToRelative(0.39f, -0.72f, 1.11f, -1.06f, 1.87f, -2.17f);
        pathBuilder2.curveToRelative(0.68f, -1.0f, 0.42f, -2.36f, -0.02f, -3.08f);
        pathBuilder2.curveTo(14.48f, 6.67f, 13.47f, 6.0f, 11.99f, 6.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 5.0f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.verticalLineToRelative(14.0f);
        pathBuilder2.horizontalLineToRelative(14.0f);
        pathBuilder2.verticalLineTo(5.0f);
        pathBuilder2.moveTo(19.0f, 3.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(14.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder2.verticalLineTo(5.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder2.horizontalLineTo(19.0f);
        pathBuilder2.lineTo(19.0f, 3.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _helpCenter = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
