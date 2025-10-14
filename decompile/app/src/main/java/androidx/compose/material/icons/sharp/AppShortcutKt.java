package androidx.compose.material.icons.sharp;

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
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_appShortcut", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AppShortcut", "Landroidx/compose/material/icons/Icons$Sharp;", "getAppShortcut", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAppShortcut.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppShortcut.kt\nandroidx/compose/material/icons/sharp/AppShortcutKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,84:1\n212#2,12:85\n233#2,18:98\n253#2:135\n233#2,18:136\n253#2:173\n233#2,18:174\n253#2:211\n233#2,18:212\n253#2:249\n174#3:97\n705#4,2:116\n717#4,2:118\n719#4,11:124\n705#4,2:154\n717#4,2:156\n719#4,11:162\n705#4,2:192\n717#4,2:194\n719#4,11:200\n705#4,2:230\n717#4,2:232\n719#4,11:238\n72#5,4:120\n72#5,4:158\n72#5,4:196\n72#5,4:234\n*S KotlinDebug\n*F\n+ 1 AppShortcut.kt\nandroidx/compose/material/icons/sharp/AppShortcutKt\n*L\n29#1:85,12\n30#1:98,18\n30#1:135\n46#1:136,18\n46#1:173\n57#1:174,18\n57#1:211\n68#1:212,18\n68#1:249\n29#1:97\n30#1:116,2\n30#1:118,2\n30#1:124,11\n46#1:154,2\n46#1:156,2\n46#1:162,11\n57#1:192,2\n57#1:194,2\n57#1:200,11\n68#1:230,2\n68#1:232,2\n68#1:238,11\n30#1:120,4\n46#1:158,4\n57#1:196,4\n68#1:234,4\n*E\n"})
/* loaded from: classes.dex */
public final class AppShortcutKt {

    @Nullable
    private static ImageVector _appShortcut;

    @NotNull
    public static final ImageVector getAppShortcut(@NotNull Icons.Sharp sharp) {
        ImageVector imageVector = _appShortcut;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AppShortcut", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 18.0f);
        pathBuilder.lineToRelative(-10.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, -12.0f);
        pathBuilder.lineToRelative(10.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 1.0f);
        pathBuilder.lineToRelative(2.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, -6.0f);
        pathBuilder.lineToRelative(-14.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 22.0f);
        pathBuilder.lineToRelative(14.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, -6.0f);
        pathBuilder.lineToRelative(-2.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.38f, 9.62f);
        pathBuilder2.lineToRelative(0.62f, 1.38f);
        pathBuilder2.lineToRelative(0.62f, -1.38f);
        pathBuilder2.lineToRelative(1.38f, -0.62f);
        pathBuilder2.lineToRelative(-1.38f, -0.62f);
        pathBuilder2.lineToRelative(-0.62f, -1.38f);
        pathBuilder2.lineToRelative(-0.62f, 1.38f);
        pathBuilder2.lineToRelative(-1.38f, 0.62f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(16.0f, 8.0f);
        pathBuilder3.lineToRelative(-1.25f, 2.75f);
        pathBuilder3.lineToRelative(-2.75f, 1.25f);
        pathBuilder3.lineToRelative(2.75f, 1.25f);
        pathBuilder3.lineToRelative(1.25f, 2.75f);
        pathBuilder3.lineToRelative(1.25f, -2.75f);
        pathBuilder3.lineToRelative(2.75f, -1.25f);
        pathBuilder3.lineToRelative(-2.75f, -1.25f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(21.0f, 13.0f);
        pathBuilder4.lineToRelative(-0.62f, 1.38f);
        pathBuilder4.lineToRelative(-1.38f, 0.62f);
        pathBuilder4.lineToRelative(1.38f, 0.62f);
        pathBuilder4.lineToRelative(0.62f, 1.38f);
        pathBuilder4.lineToRelative(0.62f, -1.38f);
        pathBuilder4.lineToRelative(1.38f, -0.62f);
        pathBuilder4.lineToRelative(-1.38f, -0.62f);
        pathBuilder4.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _appShortcut = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
