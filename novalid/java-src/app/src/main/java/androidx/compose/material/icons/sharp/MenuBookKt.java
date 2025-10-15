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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MenuBook.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7105d2 = {"_menuBook", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MenuBook", "Landroidx/compose/material/icons/Icons$Sharp;", "getMenuBook$annotations", "(Landroidx/compose/material/icons/Icons$Sharp;)V", "getMenuBook", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMenuBook.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuBook.kt\nandroidx/compose/material/icons/sharp/MenuBookKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,95:1\n212#2,12:96\n233#2,18:109\n253#2:146\n233#2,18:147\n253#2:184\n233#2,18:185\n253#2:222\n233#2,18:223\n253#2:260\n174#3:108\n705#4,2:127\n717#4,2:129\n719#4,11:135\n705#4,2:165\n717#4,2:167\n719#4,11:173\n705#4,2:203\n717#4,2:205\n719#4,11:211\n705#4,2:241\n717#4,2:243\n719#4,11:249\n72#5,4:131\n72#5,4:169\n72#5,4:207\n72#5,4:245\n*S KotlinDebug\n*F\n+ 1 MenuBook.kt\nandroidx/compose/material/icons/sharp/MenuBookKt\n*L\n35#1:96,12\n36#1:109,18\n36#1:146\n60#1:147,18\n60#1:184\n70#1:185,18\n70#1:222\n80#1:223,18\n80#1:260\n35#1:108\n36#1:127,2\n36#1:129,2\n36#1:135,11\n60#1:165,2\n60#1:167,2\n60#1:173,11\n70#1:203,2\n70#1:205,2\n70#1:211,11\n80#1:241,2\n80#1:243,2\n80#1:249,11\n36#1:131,4\n60#1:169,4\n70#1:207,4\n80#1:245,4\n*E\n"})
/* loaded from: classes4.dex */
public final class MenuBookKt {

    @Nullable
    private static ImageVector _menuBook;

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.Sharp.MenuBook", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.Sharp.MenuBook", imports = {"androidx.compose.material.icons.automirrored.sharp.MenuBook"}))
    public static /* synthetic */ void getMenuBook$annotations(Icons.Sharp sharp) {
    }

    @NotNull
    public static final ImageVector getMenuBook(@NotNull Icons.Sharp sharp) {
        ImageVector imageVector = _menuBook;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.MenuBook", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 5.0f);
        pathBuilder.curveToRelative(-1.11f, -0.35f, -2.33f, -0.5f, -3.5f, -0.5f);
        pathBuilder.curveToRelative(-1.95f, 0.0f, -4.05f, 0.4f, -5.5f, 1.5f);
        pathBuilder.curveToRelative(-1.45f, -1.1f, -3.55f, -1.5f, -5.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(2.45f, 4.9f, 1.0f, 6.0f);
        pathBuilder.verticalLineToRelative(15.5f);
        pathBuilder.curveTo(2.45f, 20.4f, 4.55f, 20.0f, 6.5f, 20.0f);
        pathBuilder.reflectiveCurveToRelative(4.05f, 0.4f, 5.5f, 1.5f);
        pathBuilder.curveToRelative(1.45f, -1.1f, 3.55f, -1.5f, 5.5f, -1.5f);
        pathBuilder.curveToRelative(1.17f, 0.0f, 2.39f, 0.15f, 3.5f, 0.5f);
        pathBuilder.curveToRelative(0.75f, 0.25f, 1.4f, 0.55f, 2.0f, 1.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.curveTo(22.4f, 5.55f, 21.75f, 5.25f, 21.0f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 18.5f);
        pathBuilder.curveToRelative(-1.1f, -0.35f, -2.3f, -0.5f, -3.5f, -0.5f);
        pathBuilder.curveToRelative(-1.7f, 0.0f, -4.15f, 0.65f, -5.5f, 1.5f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.curveToRelative(1.35f, -0.85f, 3.8f, -1.5f, 5.5f, -1.5f);
        pathBuilder.curveToRelative(1.2f, 0.0f, 2.4f, 0.15f, 3.5f, 0.5f);
        pathBuilder.verticalLineTo(18.5f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(17.5f, 10.5f);
        pathBuilder2.curveToRelative(0.88f, 0.0f, 1.73f, 0.09f, 2.5f, 0.26f);
        pathBuilder2.verticalLineTo(9.24f);
        pathBuilder2.curveTo(19.21f, 9.09f, 18.36f, 9.0f, 17.5f, 9.0f);
        pathBuilder2.curveToRelative(-1.7f, 0.0f, -3.24f, 0.29f, -4.5f, 0.83f);
        pathBuilder2.verticalLineToRelative(1.66f);
        pathBuilder2.curveTo(14.13f, 10.85f, 15.7f, 10.5f, 17.5f, 10.5f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(13.0f, 12.49f);
        pathBuilder3.verticalLineToRelative(1.66f);
        pathBuilder3.curveToRelative(1.13f, -0.64f, 2.7f, -0.99f, 4.5f, -0.99f);
        pathBuilder3.curveToRelative(0.88f, 0.0f, 1.73f, 0.09f, 2.5f, 0.26f);
        pathBuilder3.verticalLineTo(11.9f);
        pathBuilder3.curveToRelative(-0.79f, -0.15f, -1.64f, -0.24f, -2.5f, -0.24f);
        pathBuilder3.curveTo(15.8f, 11.66f, 14.26f, 11.96f, 13.0f, 12.49f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(17.5f, 14.33f);
        pathBuilder4.curveToRelative(-1.7f, 0.0f, -3.24f, 0.29f, -4.5f, 0.83f);
        pathBuilder4.verticalLineToRelative(1.66f);
        pathBuilder4.curveToRelative(1.13f, -0.64f, 2.7f, -0.99f, 4.5f, -0.99f);
        pathBuilder4.curveToRelative(0.88f, 0.0f, 1.73f, 0.09f, 2.5f, 0.26f);
        pathBuilder4.verticalLineToRelative(-1.52f);
        pathBuilder4.curveTo(19.21f, 14.41f, 18.36f, 14.33f, 17.5f, 14.33f);
        pathBuilder4.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _menuBook = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
