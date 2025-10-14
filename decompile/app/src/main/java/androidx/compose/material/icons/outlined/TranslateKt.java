package androidx.compose.material.icons.outlined;

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

/* compiled from: Translate.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_translate", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Translate", "Landroidx/compose/material/icons/Icons$Outlined;", "getTranslate", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTranslate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Translate.kt\nandroidx/compose/material/icons/outlined/TranslateKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,75:1\n212#2,12:76\n233#2,18:89\n253#2:126\n174#3:88\n705#4,2:107\n717#4,2:109\n719#4,11:115\n72#5,4:111\n*S KotlinDebug\n*F\n+ 1 Translate.kt\nandroidx/compose/material/icons/outlined/TranslateKt\n*L\n29#1:76,12\n30#1:89,18\n30#1:126\n29#1:88\n30#1:107,2\n30#1:109,2\n30#1:115,11\n30#1:111,4\n*E\n"})
/* loaded from: classes2.dex */
public final class TranslateKt {

    @Nullable
    private static ImageVector _translate;

    @NotNull
    public static final ImageVector getTranslate(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _translate;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Translate", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.87f, 15.07f);
        pathBuilder.lineToRelative(-2.54f, -2.51f);
        pathBuilder.lineToRelative(0.03f, -0.03f);
        pathBuilder.curveToRelative(1.74f, -1.94f, 2.98f, -4.17f, 3.71f, -6.53f);
        pathBuilder.lineTo(17.0f, 6.0f);
        pathBuilder.lineTo(17.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(-7.0f);
        pathBuilder.lineTo(10.0f, 2.0f);
        pathBuilder.lineTo(8.0f, 2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(1.0f, 4.0f);
        pathBuilder.verticalLineToRelative(1.99f);
        pathBuilder.horizontalLineToRelative(11.17f);
        pathBuilder.curveTo(11.5f, 7.92f, 10.44f, 9.75f, 9.0f, 11.35f);
        pathBuilder.curveTo(8.07f, 10.32f, 7.3f, 9.19f, 6.69f, 8.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.73f, 1.63f, 1.73f, 3.17f, 2.98f, 4.56f);
        pathBuilder.lineToRelative(-5.09f, 5.02f);
        pathBuilder.lineTo(4.0f, 19.0f);
        pathBuilder.lineToRelative(5.0f, -5.0f);
        pathBuilder.lineToRelative(3.11f, 3.11f);
        pathBuilder.lineToRelative(0.76f, -2.04f);
        pathBuilder.close();
        pathBuilder.moveTo(18.5f, 10.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.lineTo(12.0f, 22.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineToRelative(1.12f, -3.0f);
        pathBuilder.horizontalLineToRelative(4.75f);
        pathBuilder.lineTo(21.0f, 22.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineToRelative(-4.5f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.88f, 17.0f);
        pathBuilder.lineToRelative(1.62f, -4.33f);
        pathBuilder.lineTo(19.12f, 17.0f);
        pathBuilder.horizontalLineToRelative(-3.24f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _translate = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
