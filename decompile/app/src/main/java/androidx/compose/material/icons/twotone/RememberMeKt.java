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

/* compiled from: RememberMe.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_rememberMe", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RememberMe", "Landroidx/compose/material/icons/Icons$TwoTone;", "getRememberMe", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nRememberMe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberMe.kt\nandroidx/compose/material/icons/twotone/RememberMeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,116:1\n212#2,12:117\n233#2,18:130\n253#2:167\n233#2,18:168\n253#2:205\n233#2,18:206\n253#2:243\n233#2,18:244\n253#2:281\n233#2,18:282\n253#2:319\n233#2,18:320\n253#2:357\n174#3:129\n705#4,2:148\n717#4,2:150\n719#4,11:156\n705#4,2:186\n717#4,2:188\n719#4,11:194\n705#4,2:224\n717#4,2:226\n719#4,11:232\n705#4,2:262\n717#4,2:264\n719#4,11:270\n705#4,2:300\n717#4,2:302\n719#4,11:308\n705#4,2:338\n717#4,2:340\n719#4,11:346\n72#5,4:152\n72#5,4:190\n72#5,4:228\n72#5,4:266\n72#5,4:304\n72#5,4:342\n*S KotlinDebug\n*F\n+ 1 RememberMe.kt\nandroidx/compose/material/icons/twotone/RememberMeKt\n*L\n29#1:117,12\n30#1:130,18\n30#1:167\n37#1:168,18\n37#1:205\n46#1:206,18\n46#1:243\n52#1:244,18\n52#1:281\n59#1:282,18\n59#1:319\n97#1:320,18\n97#1:357\n29#1:129\n30#1:148,2\n30#1:150,2\n30#1:156,11\n37#1:186,2\n37#1:188,2\n37#1:194,11\n46#1:224,2\n46#1:226,2\n46#1:232,11\n52#1:262,2\n52#1:264,2\n52#1:270,11\n59#1:300,2\n59#1:302,2\n59#1:308,11\n97#1:338,2\n97#1:340,2\n97#1:346,11\n30#1:152,4\n37#1:190,4\n46#1:228,4\n52#1:266,4\n59#1:304,4\n97#1:342,4\n*E\n"})
/* loaded from: classes4.dex */
public final class RememberMeKt {

    @Nullable
    private static ImageVector _rememberMe;

    @NotNull
    public static final ImageVector getRememberMe(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _rememberMe;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.RememberMe", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(-10.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(7.0f, 17.52f);
        pathBuilder2.verticalLineTo(18.0f);
        pathBuilder2.horizontalLineToRelative(10.0f);
        pathBuilder2.verticalLineToRelative(-0.48f);
        pathBuilder2.curveTo(15.53f, 16.53f, 13.78f, 16.0f, 12.0f, 16.0f);
        pathBuilder2.reflectiveCurveTo(8.47f, 16.53f, 7.0f, 17.52f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(12.0f, 10.0f);
        pathBuilder3.moveToRelative(-1.0f, 0.0f);
        pathBuilder3.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilder3.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(7.0f, 3.0f);
        pathBuilder4.horizontalLineToRelative(10.0f);
        pathBuilder4.verticalLineToRelative(1.0f);
        pathBuilder4.horizontalLineToRelative(-10.0f);
        pathBuilder4.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(17.0f, 1.0f);
        pathBuilder5.horizontalLineTo(7.0f);
        pathBuilder5.curveTo(5.9f, 1.0f, 5.0f, 1.9f, 5.0f, 3.0f);
        pathBuilder5.verticalLineToRelative(18.0f);
        pathBuilder5.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder5.horizontalLineToRelative(10.0f);
        pathBuilder5.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder5.verticalLineTo(3.0f);
        pathBuilder5.curveTo(19.0f, 1.9f, 18.1f, 1.0f, 17.0f, 1.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(17.0f, 21.0f);
        pathBuilder5.horizontalLineTo(7.0f);
        pathBuilder5.verticalLineToRelative(-1.0f);
        pathBuilder5.horizontalLineToRelative(10.0f);
        pathBuilder5.verticalLineTo(21.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(17.0f, 18.0f);
        pathBuilder5.horizontalLineTo(7.0f);
        pathBuilder5.verticalLineToRelative(-0.48f);
        pathBuilder5.curveTo(8.47f, 16.53f, 10.22f, 16.0f, 12.0f, 16.0f);
        pathBuilder5.reflectiveCurveToRelative(3.53f, 0.53f, 5.0f, 1.52f);
        pathBuilder5.verticalLineTo(18.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(17.0f, 15.21f);
        pathBuilder5.curveTo(15.5f, 14.44f, 13.8f, 14.0f, 12.0f, 14.0f);
        pathBuilder5.reflectiveCurveToRelative(-3.5f, 0.44f, -5.0f, 1.21f);
        pathBuilder5.verticalLineTo(6.0f);
        pathBuilder5.horizontalLineToRelative(10.0f);
        pathBuilder5.verticalLineTo(15.21f);
        pathBuilder5.close();
        pathBuilder5.moveTo(17.0f, 4.0f);
        pathBuilder5.horizontalLineTo(7.0f);
        pathBuilder5.verticalLineTo(3.0f);
        pathBuilder5.horizontalLineToRelative(10.0f);
        pathBuilder5.verticalLineTo(4.0f);
        pathBuilder5.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw5, iM11702getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType6 = VectorKt.getDefaultFillType();
        SolidColor solidColor6 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw6 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk86 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(12.0f, 13.0f);
        pathBuilder6.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder6.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder6.reflectiveCurveToRelative(-3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilder6.reflectiveCurveTo(10.34f, 13.0f, 12.0f, 13.0f);
        pathBuilder6.close();
        pathBuilder6.moveTo(12.0f, 9.0f);
        pathBuilder6.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder6.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder6.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder6.reflectiveCurveTo(11.45f, 9.0f, 12.0f, 9.0f);
        pathBuilder6.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder6.getNodes(), defaultFillType6, "", solidColor6, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw6, iM11702getBevelLxFBmk86, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rememberMe = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
