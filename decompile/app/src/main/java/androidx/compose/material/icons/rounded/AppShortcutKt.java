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

/* compiled from: AppShortcut.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_appShortcut", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AppShortcut", "Landroidx/compose/material/icons/Icons$Rounded;", "getAppShortcut", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAppShortcut.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppShortcut.kt\nandroidx/compose/material/icons/rounded/AppShortcutKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,103:1\n212#2,12:104\n233#2,18:117\n253#2:154\n233#2,18:155\n253#2:192\n233#2,18:193\n253#2:230\n233#2,18:231\n253#2:268\n174#3:116\n705#4,2:135\n717#4,2:137\n719#4,11:143\n705#4,2:173\n717#4,2:175\n719#4,11:181\n705#4,2:211\n717#4,2:213\n719#4,11:219\n705#4,2:249\n717#4,2:251\n719#4,11:257\n72#5,4:139\n72#5,4:177\n72#5,4:215\n72#5,4:253\n*S KotlinDebug\n*F\n+ 1 AppShortcut.kt\nandroidx/compose/material/icons/rounded/AppShortcutKt\n*L\n29#1:104,12\n30#1:117,18\n30#1:154\n50#1:155,18\n50#1:192\n66#1:193,18\n66#1:230\n82#1:231,18\n82#1:268\n29#1:116\n30#1:135,2\n30#1:137,2\n30#1:143,11\n50#1:173,2\n50#1:175,2\n50#1:181,11\n66#1:211,2\n66#1:213,2\n66#1:219,11\n82#1:249,2\n82#1:251,2\n82#1:257,11\n30#1:139,4\n50#1:177,4\n66#1:215,4\n82#1:253,4\n*E\n"})
/* loaded from: classes4.dex */
public final class AppShortcutKt {

    @Nullable
    private static ImageVector _appShortcut;

    @NotNull
    public static final ImageVector getAppShortcut(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _appShortcut;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AppShortcut", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 18.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.curveTo(5.9f, 1.0f, 5.0f, 1.9f, 5.0f, 3.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.38f, 9.62f);
        pathBuilder2.lineToRelative(0.4f, 0.87f);
        pathBuilder2.curveToRelative(0.09f, 0.2f, 0.37f, 0.2f, 0.46f, 0.0f);
        pathBuilder2.lineToRelative(0.4f, -0.87f);
        pathBuilder2.lineToRelative(0.87f, -0.4f);
        pathBuilder2.curveToRelative(0.2f, -0.09f, 0.2f, -0.37f, 0.0f, -0.46f);
        pathBuilder2.lineToRelative(-0.87f, -0.4f);
        pathBuilder2.lineToRelative(-0.4f, -0.87f);
        pathBuilder2.curveToRelative(-0.09f, -0.2f, -0.37f, -0.2f, -0.46f, 0.0f);
        pathBuilder2.lineToRelative(-0.4f, 0.87f);
        pathBuilder2.lineToRelative(-0.87f, 0.4f);
        pathBuilder2.curveToRelative(-0.2f, 0.09f, -0.2f, 0.37f, 0.0f, 0.46f);
        pathBuilder2.lineTo(20.38f, 9.62f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(15.54f, 9.0f);
        pathBuilder3.lineToRelative(-0.79f, 1.75f);
        pathBuilder3.lineTo(13.0f, 11.54f);
        pathBuilder3.curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f);
        pathBuilder3.lineToRelative(1.75f, 0.79f);
        pathBuilder3.lineTo(15.54f, 15.0f);
        pathBuilder3.curveToRelative(0.18f, 0.39f, 0.73f, 0.39f, 0.91f, 0.0f);
        pathBuilder3.lineToRelative(0.79f, -1.75f);
        pathBuilder3.lineTo(19.0f, 12.46f);
        pathBuilder3.curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f);
        pathBuilder3.lineToRelative(-1.75f, -0.79f);
        pathBuilder3.lineTo(16.46f, 9.0f);
        pathBuilder3.curveTo(16.28f, 8.61f, 15.72f, 8.61f, 15.54f, 9.0f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(20.77f, 13.5f);
        pathBuilder4.lineToRelative(-0.4f, 0.87f);
        pathBuilder4.lineToRelative(-0.87f, 0.4f);
        pathBuilder4.curveToRelative(-0.2f, 0.09f, -0.2f, 0.37f, 0.0f, 0.46f);
        pathBuilder4.lineToRelative(0.87f, 0.4f);
        pathBuilder4.lineToRelative(0.4f, 0.87f);
        pathBuilder4.curveToRelative(0.09f, 0.2f, 0.37f, 0.2f, 0.46f, 0.0f);
        pathBuilder4.lineToRelative(0.4f, -0.87f);
        pathBuilder4.lineToRelative(0.87f, -0.4f);
        pathBuilder4.curveToRelative(0.2f, -0.09f, 0.2f, -0.37f, 0.0f, -0.46f);
        pathBuilder4.lineToRelative(-0.87f, -0.4f);
        pathBuilder4.lineToRelative(-0.4f, -0.87f);
        pathBuilder4.curveTo(21.14f, 13.31f, 20.86f, 13.31f, 20.77f, 13.5f);
        pathBuilder4.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _appShortcut = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
