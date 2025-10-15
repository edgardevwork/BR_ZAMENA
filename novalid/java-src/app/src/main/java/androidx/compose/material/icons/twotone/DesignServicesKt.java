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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DesignServices.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_designServices", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DesignServices", "Landroidx/compose/material/icons/Icons$TwoTone;", "getDesignServices", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDesignServices.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DesignServices.kt\nandroidx/compose/material/icons/twotone/DesignServicesKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,132:1\n212#2,12:133\n233#2,18:146\n253#2:183\n233#2,18:184\n253#2:221\n233#2,18:222\n253#2:259\n233#2,18:260\n253#2:297\n233#2,18:298\n253#2:335\n174#3:145\n705#4,2:164\n717#4,2:166\n719#4,11:172\n705#4,2:202\n717#4,2:204\n719#4,11:210\n705#4,2:240\n717#4,2:242\n719#4,11:248\n705#4,2:278\n717#4,2:280\n719#4,11:286\n705#4,2:316\n717#4,2:318\n719#4,11:324\n72#5,4:168\n72#5,4:206\n72#5,4:244\n72#5,4:282\n72#5,4:320\n*S KotlinDebug\n*F\n+ 1 DesignServices.kt\nandroidx/compose/material/icons/twotone/DesignServicesKt\n*L\n29#1:133,12\n30#1:146,18\n30#1:183\n39#1:184,18\n39#1:221\n51#1:222,18\n51#1:259\n62#1:260,18\n62#1:297\n69#1:298,18\n69#1:335\n29#1:145\n30#1:164,2\n30#1:166,2\n30#1:172,11\n39#1:202,2\n39#1:204,2\n39#1:210,11\n51#1:240,2\n51#1:242,2\n51#1:248,11\n62#1:278,2\n62#1:280,2\n62#1:286,11\n69#1:316,2\n69#1:318,2\n69#1:324,11\n30#1:168,4\n39#1:206,4\n51#1:244,4\n62#1:282,4\n69#1:320,4\n*E\n"})
/* loaded from: classes.dex */
public final class DesignServicesKt {

    @Nullable
    private static ImageVector _designServices;

    @NotNull
    public static final ImageVector getDesignServices(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _designServices;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.DesignServices", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.91f, 9.28f);
        pathBuilder.lineToRelative(-1.3f, -1.3f);
        pathBuilder.lineToRelative(-9.61f, 9.61f);
        pathBuilder.lineToRelative(0.0f, 1.41f);
        pathBuilder.lineToRelative(1.41f, 0.0f);
        pathBuilder.lineToRelative(9.61f, -9.61f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(10.83f, 8.93f);
        pathBuilder2.lineToRelative(-1.2f, -1.2f);
        pathBuilder2.lineToRelative(-1.19f, 1.19f);
        pathBuilder2.lineToRelative(-1.42f, -1.42f);
        pathBuilder2.lineToRelative(1.19f, -1.18f);
        pathBuilder2.lineToRelative(-1.27f, -1.28f);
        pathBuilder2.lineToRelative(0.0f, 0.0f);
        pathBuilder2.lineToRelative(-1.9f, 1.9f);
        pathBuilder2.lineToRelative(3.89f, 3.89f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(16.27f, 14.38f);
        pathBuilder3.lineToRelative(-1.2f, -1.21f);
        pathBuilder3.lineToRelative(-1.9f, 1.9f);
        pathBuilder3.lineToRelative(3.89f, 3.89f);
        pathBuilder3.lineToRelative(1.9f, -1.9f);
        pathBuilder3.lineToRelative(-1.27f, -1.27f);
        pathBuilder3.lineToRelative(-1.19f, 1.19f);
        pathBuilder3.lineToRelative(-1.42f, -1.41f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(16.021f, 6.558f);
        pathBuilder4.lineToRelative(1.414f, -1.414f);
        pathBuilder4.lineToRelative(1.414f, 1.414f);
        pathBuilder4.lineToRelative(-1.414f, 1.414f);
        pathBuilder4.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(20.97f, 5.86f);
        pathBuilder5.lineToRelative(-2.83f, -2.83f);
        pathBuilder5.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder5.lineToRelative(-4.49f, 4.49f);
        pathBuilder5.lineTo(8.35f, 3.63f);
        pathBuilder5.curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        pathBuilder5.lineToRelative(-1.9f, 1.9f);
        pathBuilder5.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilder5.lineToRelative(3.89f, 3.89f);
        pathBuilder5.lineTo(3.0f, 16.76f);
        pathBuilder5.verticalLineTo(21.0f);
        pathBuilder5.horizontalLineToRelative(4.24f);
        pathBuilder5.lineToRelative(4.52f, -4.52f);
        pathBuilder5.lineToRelative(3.89f, 3.89f);
        pathBuilder5.curveToRelative(0.95f, 0.95f, 2.23f, 0.6f, 2.83f, 0.0f);
        pathBuilder5.lineToRelative(1.9f, -1.9f);
        pathBuilder5.curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        pathBuilder5.lineToRelative(-3.89f, -3.89f);
        pathBuilder5.lineToRelative(4.49f, -4.49f);
        pathBuilder5.curveTo(21.36f, 6.88f, 21.36f, 6.25f, 20.97f, 5.86f);
        pathBuilder5.close();
        pathBuilder5.moveTo(5.04f, 6.94f);
        pathBuilder5.lineToRelative(1.89f, -1.9f);
        pathBuilder5.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder5.lineToRelative(1.27f, 1.27f);
        pathBuilder5.lineTo(7.02f, 7.5f);
        pathBuilder5.lineToRelative(1.41f, 1.41f);
        pathBuilder5.lineToRelative(1.19f, -1.19f);
        pathBuilder5.lineToRelative(1.2f, 1.2f);
        pathBuilder5.lineToRelative(-1.9f, 1.9f);
        pathBuilder5.lineTo(5.04f, 6.94f);
        pathBuilder5.close();
        pathBuilder5.moveTo(6.41f, 19.0f);
        pathBuilder5.horizontalLineTo(5.0f);
        pathBuilder5.verticalLineToRelative(-1.41f);
        pathBuilder5.lineToRelative(9.61f, -9.61f);
        pathBuilder5.lineToRelative(1.3f, 1.3f);
        pathBuilder5.lineToRelative(0.11f, 0.11f);
        pathBuilder5.lineTo(6.41f, 19.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(16.5f, 16.98f);
        pathBuilder5.lineToRelative(1.19f, -1.19f);
        pathBuilder5.lineToRelative(1.27f, 1.27f);
        pathBuilder5.lineToRelative(-1.9f, 1.9f);
        pathBuilder5.lineToRelative(-3.89f, -3.89f);
        pathBuilder5.lineToRelative(1.9f, -1.9f);
        pathBuilder5.lineToRelative(1.2f, 1.2f);
        pathBuilder5.lineToRelative(-1.19f, 1.19f);
        pathBuilder5.lineTo(16.5f, 16.98f);
        pathBuilder5.close();
        pathBuilder5.moveTo(17.44f, 7.98f);
        pathBuilder5.lineToRelative(-1.41f, -1.41f);
        pathBuilder5.lineToRelative(1.41f, -1.41f);
        pathBuilder5.lineToRelative(1.41f, 1.41f);
        pathBuilder5.lineTo(17.44f, 7.98f);
        pathBuilder5.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw5, iM11702getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _designServices = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
