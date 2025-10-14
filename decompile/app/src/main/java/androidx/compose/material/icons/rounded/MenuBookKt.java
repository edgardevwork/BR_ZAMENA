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

/* compiled from: MenuBook.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7105d2 = {"_menuBook", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MenuBook", "Landroidx/compose/material/icons/Icons$Rounded;", "getMenuBook$annotations", "(Landroidx/compose/material/icons/Icons$Rounded;)V", "getMenuBook", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMenuBook.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuBook.kt\nandroidx/compose/material/icons/rounded/MenuBookKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,103:1\n212#2,12:104\n233#2,18:117\n253#2:154\n233#2,18:155\n253#2:192\n233#2,18:193\n253#2:230\n233#2,18:231\n253#2:268\n174#3:116\n705#4,2:135\n717#4,2:137\n719#4,11:143\n705#4,2:173\n717#4,2:175\n719#4,11:181\n705#4,2:211\n717#4,2:213\n719#4,11:219\n705#4,2:249\n717#4,2:251\n719#4,11:257\n72#5,4:139\n72#5,4:177\n72#5,4:215\n72#5,4:253\n*S KotlinDebug\n*F\n+ 1 MenuBook.kt\nandroidx/compose/material/icons/rounded/MenuBookKt\n*L\n35#1:104,12\n36#1:117,18\n36#1:154\n65#1:155,18\n65#1:192\n76#1:193,18\n76#1:230\n87#1:231,18\n87#1:268\n35#1:116\n36#1:135,2\n36#1:137,2\n36#1:143,11\n65#1:173,2\n65#1:175,2\n65#1:181,11\n76#1:211,2\n76#1:213,2\n76#1:219,11\n87#1:249,2\n87#1:251,2\n87#1:257,11\n36#1:139,4\n65#1:177,4\n76#1:215,4\n87#1:253,4\n*E\n"})
/* loaded from: classes2.dex */
public final class MenuBookKt {

    @Nullable
    private static ImageVector _menuBook;

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.Rounded.MenuBook", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.Rounded.MenuBook", imports = {"androidx.compose.material.icons.automirrored.rounded.MenuBook"}))
    public static /* synthetic */ void getMenuBook$annotations(Icons.Rounded rounded) {
    }

    @NotNull
    public static final ImageVector getMenuBook(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _menuBook;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MenuBook", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.5f, 4.5f);
        pathBuilder.curveToRelative(-1.95f, 0.0f, -4.05f, 0.4f, -5.5f, 1.5f);
        pathBuilder.curveToRelative(-1.45f, -1.1f, -3.55f, -1.5f, -5.5f, -1.5f);
        pathBuilder.curveToRelative(-1.45f, 0.0f, -2.99f, 0.22f, -4.28f, 0.79f);
        pathBuilder.curveTo(1.49f, 5.62f, 1.0f, 6.33f, 1.0f, 7.14f);
        pathBuilder.lineToRelative(0.0f, 11.28f);
        pathBuilder.curveToRelative(0.0f, 1.3f, 1.22f, 2.26f, 2.48f, 1.94f);
        pathBuilder.curveTo(4.46f, 20.11f, 5.5f, 20.0f, 6.5f, 20.0f);
        pathBuilder.curveToRelative(1.56f, 0.0f, 3.22f, 0.26f, 4.56f, 0.92f);
        pathBuilder.curveToRelative(0.6f, 0.3f, 1.28f, 0.3f, 1.87f, 0.0f);
        pathBuilder.curveToRelative(1.34f, -0.67f, 3.0f, -0.92f, 4.56f, -0.92f);
        pathBuilder.curveToRelative(1.0f, 0.0f, 2.04f, 0.11f, 3.02f, 0.36f);
        pathBuilder.curveToRelative(1.26f, 0.33f, 2.48f, -0.63f, 2.48f, -1.94f);
        pathBuilder.lineToRelative(0.0f, -11.28f);
        pathBuilder.curveToRelative(0.0f, -0.81f, -0.49f, -1.52f, -1.22f, -1.85f);
        pathBuilder.curveTo(20.49f, 4.72f, 18.95f, 4.5f, 17.5f, 4.5f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 17.23f);
        pathBuilder.curveToRelative(0.0f, 0.63f, -0.58f, 1.09f, -1.2f, 0.98f);
        pathBuilder.curveToRelative(-0.75f, -0.14f, -1.53f, -0.2f, -2.3f, -0.2f);
        pathBuilder.curveToRelative(-1.7f, 0.0f, -4.15f, 0.65f, -5.5f, 1.5f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.curveToRelative(1.35f, -0.85f, 3.8f, -1.5f, 5.5f, -1.5f);
        pathBuilder.curveToRelative(0.92f, 0.0f, 1.83f, 0.09f, 2.7f, 0.28f);
        pathBuilder.curveToRelative(0.46f, 0.1f, 0.8f, 0.51f, 0.8f, 0.98f);
        pathBuilder.verticalLineTo(17.23f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(13.98f, 11.01f);
        pathBuilder2.curveToRelative(-0.32f, 0.0f, -0.61f, -0.2f, -0.71f, -0.52f);
        pathBuilder2.curveToRelative(-0.13f, -0.39f, 0.09f, -0.82f, 0.48f, -0.94f);
        pathBuilder2.curveToRelative(1.54f, -0.5f, 3.53f, -0.66f, 5.36f, -0.45f);
        pathBuilder2.curveToRelative(0.41f, 0.05f, 0.71f, 0.42f, 0.66f, 0.83f);
        pathBuilder2.curveToRelative(-0.05f, 0.41f, -0.42f, 0.71f, -0.83f, 0.66f);
        pathBuilder2.curveToRelative(-1.62f, -0.19f, -3.39f, -0.04f, -4.73f, 0.39f);
        pathBuilder2.curveTo(14.13f, 10.99f, 14.05f, 11.01f, 13.98f, 11.01f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(13.98f, 13.67f);
        pathBuilder3.curveToRelative(-0.32f, 0.0f, -0.61f, -0.2f, -0.71f, -0.52f);
        pathBuilder3.curveToRelative(-0.13f, -0.39f, 0.09f, -0.82f, 0.48f, -0.94f);
        pathBuilder3.curveToRelative(1.53f, -0.5f, 3.53f, -0.66f, 5.36f, -0.45f);
        pathBuilder3.curveToRelative(0.41f, 0.05f, 0.71f, 0.42f, 0.66f, 0.83f);
        pathBuilder3.curveToRelative(-0.05f, 0.41f, -0.42f, 0.71f, -0.83f, 0.66f);
        pathBuilder3.curveToRelative(-1.62f, -0.19f, -3.39f, -0.04f, -4.73f, 0.39f);
        pathBuilder3.curveTo(14.13f, 13.66f, 14.05f, 13.67f, 13.98f, 13.67f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(13.98f, 16.33f);
        pathBuilder4.curveToRelative(-0.32f, 0.0f, -0.61f, -0.2f, -0.71f, -0.52f);
        pathBuilder4.curveToRelative(-0.13f, -0.39f, 0.09f, -0.82f, 0.48f, -0.94f);
        pathBuilder4.curveToRelative(1.53f, -0.5f, 3.53f, -0.66f, 5.36f, -0.45f);
        pathBuilder4.curveToRelative(0.41f, 0.05f, 0.71f, 0.42f, 0.66f, 0.83f);
        pathBuilder4.curveToRelative(-0.05f, 0.41f, -0.42f, 0.7f, -0.83f, 0.66f);
        pathBuilder4.curveToRelative(-1.62f, -0.19f, -3.39f, -0.04f, -4.73f, 0.39f);
        pathBuilder4.curveTo(14.13f, 16.32f, 14.05f, 16.33f, 13.98f, 16.33f);
        pathBuilder4.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _menuBook = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
