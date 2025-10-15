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

/* compiled from: AssistWalker.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_assistWalker", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AssistWalker", "Landroidx/compose/material/icons/Icons$Rounded;", "getAssistWalker", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAssistWalker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssistWalker.kt\nandroidx/compose/material/icons/rounded/AssistWalkerKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,89:1\n212#2,12:90\n233#2,18:103\n253#2:140\n233#2,18:141\n253#2:178\n174#3:102\n705#4,2:121\n717#4,2:123\n719#4,11:129\n705#4,2:159\n717#4,2:161\n719#4,11:167\n72#5,4:125\n72#5,4:163\n*S KotlinDebug\n*F\n+ 1 AssistWalker.kt\nandroidx/compose/material/icons/rounded/AssistWalkerKt\n*L\n29#1:90,12\n30#1:103,18\n30#1:140\n36#1:141,18\n36#1:178\n29#1:102\n30#1:121,2\n30#1:123,2\n30#1:129,11\n36#1:159,2\n36#1:161,2\n36#1:167,11\n30#1:125,4\n36#1:163,4\n*E\n"})
/* loaded from: classes4.dex */
public final class AssistWalkerKt {

    @Nullable
    private static ImageVector _assistWalker;

    @NotNull
    public static final ImageVector getAssistWalker(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _assistWalker;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AssistWalker", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.5f, 4.5f);
        pathBuilder.moveToRelative(-2.0f, 0.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(19.77f, 17.72f);
        pathBuilder2.lineToRelative(-0.64f, -6.37f);
        pathBuilder2.curveTo(19.06f, 10.58f, 18.41f, 10.0f, 17.64f, 10.0f);
        pathBuilder2.horizontalLineTo(16.0f);
        pathBuilder2.curveToRelative(-1.5f, -0.02f, -2.86f, -0.54f, -3.76f, -1.44f);
        pathBuilder2.lineToRelative(-2.0f, -1.98f);
        pathBuilder2.curveTo(10.08f, 6.42f, 9.62f, 6.0f, 8.83f, 6.0f);
        pathBuilder2.curveTo(8.32f, 6.0f, 7.81f, 6.2f, 7.42f, 6.59f);
        pathBuilder2.lineTo(4.08f, 9.91f);
        pathBuilder2.curveToRelative(-0.53f, 0.68f, -0.51f, 1.57f, -0.21f, 2.13f);
        pathBuilder2.lineToRelative(1.43f, 2.8f);
        pathBuilder2.lineTo(2.75f, 18.1f);
        pathBuilder2.curveToRelative(-0.34f, 0.43f, -0.26f, 1.06f, 0.17f, 1.4f);
        pathBuilder2.lineToRelative(0.0f, 0.0f);
        pathBuilder2.curveToRelative(0.44f, 0.34f, 1.07f, 0.26f, 1.41f, -0.17f);
        pathBuilder2.lineToRelative(2.56f, -3.29f);
        pathBuilder2.curveToRelative(0.33f, -0.42f, 0.47f, -0.95f, 0.41f, -1.48f);
        pathBuilder2.lineToRelative(-0.07f, -0.53f);
        pathBuilder2.lineTo(8.0f, 14.75f);
        pathBuilder2.verticalLineTo(19.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder2.verticalLineToRelative(-4.29f);
        pathBuilder2.curveToRelative(0.0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f);
        pathBuilder2.lineToRelative(-1.53f, -1.53f);
        pathBuilder2.lineToRelative(2.36f, -2.36f);
        pathBuilder2.curveToRelative(0.94f, 0.94f, 1.72f, 1.82f, 3.59f, 2.32f);
        pathBuilder2.lineToRelative(-0.75f, 7.46f);
        pathBuilder2.curveToRelative(-0.04f, 0.44f, 0.3f, 0.83f, 0.75f, 0.83f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.38f, 0.0f, 0.7f, -0.29f, 0.75f, -0.66f);
        pathBuilder2.lineToRelative(0.33f, -2.84f);
        pathBuilder2.horizontalLineToRelative(3.18f);
        pathBuilder2.lineToRelative(0.14f, 1.22f);
        pathBuilder2.curveToRelative(-0.44f, 0.26f, -0.73f, 0.74f, -0.73f, 1.28f);
        pathBuilder2.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilder2.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder2.curveTo(20.5f, 18.46f, 20.21f, 17.98f, 19.77f, 17.72f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.09f, 15.0f);
        pathBuilder2.lineToRelative(0.41f, -3.5f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.lineToRelative(0.41f, 3.5f);
        pathBuilder2.horizontalLineTo(15.09f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _assistWalker = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
