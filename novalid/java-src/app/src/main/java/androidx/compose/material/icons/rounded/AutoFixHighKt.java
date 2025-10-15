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

/* compiled from: AutoFixHigh.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_autoFixHigh", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AutoFixHigh", "Landroidx/compose/material/icons/Icons$Rounded;", "getAutoFixHigh", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAutoFixHigh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoFixHigh.kt\nandroidx/compose/material/icons/rounded/AutoFixHighKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,101:1\n212#2,12:102\n233#2,18:115\n253#2:152\n233#2,18:153\n253#2:190\n233#2,18:191\n253#2:228\n233#2,18:229\n253#2:266\n174#3:114\n705#4,2:133\n717#4,2:135\n719#4,11:141\n705#4,2:171\n717#4,2:173\n719#4,11:179\n705#4,2:209\n717#4,2:211\n719#4,11:217\n705#4,2:247\n717#4,2:249\n719#4,11:255\n72#5,4:137\n72#5,4:175\n72#5,4:213\n72#5,4:251\n*S KotlinDebug\n*F\n+ 1 AutoFixHigh.kt\nandroidx/compose/material/icons/rounded/AutoFixHighKt\n*L\n29#1:102,12\n30#1:115,18\n30#1:152\n46#1:153,18\n46#1:190\n62#1:191,18\n62#1:228\n78#1:229,18\n78#1:266\n29#1:114\n30#1:133,2\n30#1:135,2\n30#1:141,11\n46#1:171,2\n46#1:173,2\n46#1:179,11\n62#1:209,2\n62#1:211,2\n62#1:217,11\n78#1:247,2\n78#1:249,2\n78#1:255,11\n30#1:137,4\n46#1:175,4\n62#1:213,4\n78#1:251,4\n*E\n"})
/* loaded from: classes2.dex */
public final class AutoFixHighKt {

    @Nullable
    private static ImageVector _autoFixHigh;

    @NotNull
    public static final ImageVector getAutoFixHigh(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _autoFixHigh;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AutoFixHigh", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.45f, 6.0f);
        pathBuilder.lineToRelative(0.49f, -1.06f);
        pathBuilder.lineTo(22.0f, 4.45f);
        pathBuilder.curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f);
        pathBuilder.lineToRelative(-1.06f, -0.49f);
        pathBuilder.lineTo(20.45f, 2.0f);
        pathBuilder.curveToRelative(-0.18f, -0.39f, -0.73f, -0.39f, -0.91f, 0.0f);
        pathBuilder.lineToRelative(-0.49f, 1.06f);
        pathBuilder.lineTo(18.0f, 3.55f);
        pathBuilder.curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f);
        pathBuilder.lineToRelative(1.06f, 0.49f);
        pathBuilder.lineTo(19.55f, 6.0f);
        pathBuilder.curveTo(19.72f, 6.39f, 20.28f, 6.39f, 20.45f, 6.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(8.95f, 6.0f);
        pathBuilder2.lineToRelative(0.49f, -1.06f);
        pathBuilder2.lineToRelative(1.06f, -0.49f);
        pathBuilder2.curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f);
        pathBuilder2.lineTo(9.44f, 3.06f);
        pathBuilder2.lineTo(8.95f, 2.0f);
        pathBuilder2.curveTo(8.78f, 1.61f, 8.22f, 1.61f, 8.05f, 2.0f);
        pathBuilder2.lineTo(7.56f, 3.06f);
        pathBuilder2.lineTo(6.5f, 3.55f);
        pathBuilder2.curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f);
        pathBuilder2.lineToRelative(1.06f, 0.49f);
        pathBuilder2.lineTo(8.05f, 6.0f);
        pathBuilder2.curveTo(8.22f, 6.39f, 8.78f, 6.39f, 8.95f, 6.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(19.55f, 13.5f);
        pathBuilder3.lineToRelative(-0.49f, 1.06f);
        pathBuilder3.lineTo(18.0f, 15.05f);
        pathBuilder3.curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f);
        pathBuilder3.lineToRelative(1.06f, 0.49f);
        pathBuilder3.lineToRelative(0.49f, 1.06f);
        pathBuilder3.curveToRelative(0.18f, 0.39f, 0.73f, 0.39f, 0.91f, 0.0f);
        pathBuilder3.lineToRelative(0.49f, -1.06f);
        pathBuilder3.lineTo(22.0f, 15.95f);
        pathBuilder3.curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f);
        pathBuilder3.lineToRelative(-1.06f, -0.49f);
        pathBuilder3.lineToRelative(-0.49f, -1.06f);
        pathBuilder3.curveTo(20.28f, 13.11f, 19.72f, 13.11f, 19.55f, 13.5f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(17.71f, 9.12f);
        pathBuilder4.lineToRelative(-2.83f, -2.83f);
        pathBuilder4.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder4.lineTo(2.29f, 17.46f);
        pathBuilder4.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder4.lineToRelative(2.83f, 2.83f);
        pathBuilder4.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder4.lineToRelative(11.17f, -11.17f);
        pathBuilder4.curveTo(18.1f, 10.15f, 18.1f, 9.51f, 17.71f, 9.12f);
        pathBuilder4.close();
        pathBuilder4.moveTo(14.21f, 11.21f);
        pathBuilder4.lineToRelative(-1.41f, -1.41f);
        pathBuilder4.lineToRelative(1.38f, -1.38f);
        pathBuilder4.lineToRelative(1.41f, 1.41f);
        pathBuilder4.lineTo(14.21f, 11.21f);
        pathBuilder4.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoFixHigh = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
