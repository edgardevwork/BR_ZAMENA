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

/* compiled from: ContentCut.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_contentCut", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ContentCut", "Landroidx/compose/material/icons/Icons$Rounded;", "getContentCut", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nContentCut.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentCut.kt\nandroidx/compose/material/icons/rounded/ContentCutKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,83:1\n212#2,12:84\n233#2,18:97\n253#2:134\n174#3:96\n705#4,2:115\n717#4,2:117\n719#4,11:123\n72#5,4:119\n*S KotlinDebug\n*F\n+ 1 ContentCut.kt\nandroidx/compose/material/icons/rounded/ContentCutKt\n*L\n29#1:84,12\n30#1:97,18\n30#1:134\n29#1:96\n30#1:115,2\n30#1:117,2\n30#1:123,11\n30#1:119,4\n*E\n"})
/* loaded from: classes.dex */
public final class ContentCutKt {

    @Nullable
    private static ImageVector _contentCut;

    @NotNull
    public static final ImageVector getContentCut(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _contentCut;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ContentCut", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.64f, 7.64f);
        pathBuilder.curveToRelative(0.29f, -0.62f, 0.42f, -1.33f, 0.34f, -2.09f);
        pathBuilder.curveToRelative(-0.19f, -1.73f, -1.54f, -3.2f, -3.26f, -3.49f);
        pathBuilder.curveToRelative(-2.77f, -0.48f, -5.14f, 1.89f, -4.66f, 4.65f);
        pathBuilder.curveToRelative(0.3f, 1.72f, 1.76f, 3.07f, 3.49f, 3.26f);
        pathBuilder.curveToRelative(0.76f, 0.08f, 1.46f, -0.05f, 2.09f, -0.34f);
        pathBuilder.lineTo(10.0f, 12.0f);
        pathBuilder.lineToRelative(-2.36f, 2.36f);
        pathBuilder.curveToRelative(-0.62f, -0.29f, -1.33f, -0.42f, -2.09f, -0.34f);
        pathBuilder.curveToRelative(-1.73f, 0.19f, -3.2f, 1.54f, -3.49f, 3.26f);
        pathBuilder.curveToRelative(-0.48f, 2.77f, 1.89f, 5.13f, 4.65f, 4.65f);
        pathBuilder.curveToRelative(1.72f, -0.3f, 3.07f, -1.76f, 3.26f, -3.49f);
        pathBuilder.curveToRelative(0.08f, -0.76f, -0.05f, -1.46f, -0.34f, -2.09f);
        pathBuilder.lineTo(12.0f, 14.0f);
        pathBuilder.lineToRelative(7.59f, 7.59f);
        pathBuilder.curveToRelative(0.89f, 0.89f, 2.41f, 0.26f, 2.41f, -1.0f);
        pathBuilder.verticalLineToRelative(-0.01f);
        pathBuilder.curveToRelative(0.0f, -0.37f, -0.15f, -0.73f, -0.41f, -1.0f);
        pathBuilder.lineTo(9.64f, 7.64f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 8.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.89f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.89f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 20.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.89f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.89f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 12.5f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilder.close();
        pathBuilder.moveTo(19.59f, 2.41f);
        pathBuilder.lineTo(13.0f, 9.0f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.lineToRelative(6.59f, -6.59f);
        pathBuilder.curveToRelative(0.26f, -0.26f, 0.41f, -0.62f, 0.41f, -1.0f);
        pathBuilder.lineTo(22.0f, 3.4f);
        pathBuilder.curveToRelative(0.0f, -1.25f, -1.52f, -1.88f, -2.41f, -0.99f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contentCut = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
