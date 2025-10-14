package androidx.compose.material.icons.filled;

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

/* compiled from: TempleBuddhist.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_templeBuddhist", "Landroidx/compose/ui/graphics/vector/ImageVector;", "TempleBuddhist", "Landroidx/compose/material/icons/Icons$Filled;", "getTempleBuddhist", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTempleBuddhist.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TempleBuddhist.kt\nandroidx/compose/material/icons/filled/TempleBuddhistKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,74:1\n212#2,12:75\n233#2,18:88\n253#2:125\n233#2,18:126\n253#2:163\n233#2,18:164\n253#2:201\n174#3:87\n705#4,2:106\n717#4,2:108\n719#4,11:114\n705#4,2:144\n717#4,2:146\n719#4,11:152\n705#4,2:182\n717#4,2:184\n719#4,11:190\n72#5,4:110\n72#5,4:148\n72#5,4:186\n*S KotlinDebug\n*F\n+ 1 TempleBuddhist.kt\nandroidx/compose/material/icons/filled/TempleBuddhistKt\n*L\n29#1:75,12\n30#1:88,18\n30#1:125\n49#1:126,18\n49#1:163\n63#1:164,18\n63#1:201\n29#1:87\n30#1:106,2\n30#1:108,2\n30#1:114,11\n49#1:144,2\n49#1:146,2\n49#1:152,11\n63#1:182,2\n63#1:184,2\n63#1:190,11\n30#1:110,4\n49#1:148,4\n63#1:186,4\n*E\n"})
/* loaded from: classes4.dex */
public final class TempleBuddhistKt {

    @Nullable
    private static ImageVector _templeBuddhist;

    @NotNull
    public static final ImageVector getTempleBuddhist(@NotNull Icons.Filled filled) {
        ImageVector imageVector = _templeBuddhist;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.TempleBuddhist", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 9.02f);
        pathBuilder.curveToRelative(0.0f, 1.09f, -0.89f, 1.98f, -1.98f, 1.98f);
        pathBuilder.horizontalLineTo(4.98f);
        pathBuilder.curveTo(3.89f, 11.0f, 3.0f, 10.11f, 3.0f, 9.02f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.curveToRelative(0.0f, 1.86f, 1.28f, 3.4f, 3.0f, 3.84f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(-9.14f);
        pathBuilder.curveToRelative(0.55f, -0.14f, 3.0f, -1.04f, 3.0f, -3.86f);
        pathBuilder.lineTo(21.0f, 9.02f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(6.0f, 8.86f);
        pathBuilder2.verticalLineTo(10.0f);
        pathBuilder2.horizontalLineToRelative(12.0f);
        pathBuilder2.verticalLineTo(8.86f);
        pathBuilder2.curveToRelative(0.55f, -0.14f, 3.0f, -1.04f, 3.0f, -3.86f);
        pathBuilder2.lineToRelative(-2.0f, 0.02f);
        pathBuilder2.curveTo(19.0f, 6.11f, 18.11f, 7.0f, 17.02f, 7.0f);
        pathBuilder2.horizontalLineTo(6.98f);
        pathBuilder2.curveTo(5.89f, 7.0f, 5.0f, 6.11f, 5.0f, 5.02f);
        pathBuilder2.horizontalLineTo(3.0f);
        pathBuilder2.curveTo(3.0f, 6.87f, 4.28f, 8.42f, 6.0f, 8.86f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(12.0f, 1.0f);
        pathBuilder3.lineToRelative(-3.75f, 5.0f);
        pathBuilder3.lineToRelative(7.5f, 0.0f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _templeBuddhist = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
