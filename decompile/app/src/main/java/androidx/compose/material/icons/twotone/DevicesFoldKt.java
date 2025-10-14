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

/* compiled from: DevicesFold.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_devicesFold", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DevicesFold", "Landroidx/compose/material/icons/Icons$TwoTone;", "getDevicesFold", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDevicesFold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DevicesFold.kt\nandroidx/compose/material/icons/twotone/DevicesFoldKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,119:1\n212#2,12:120\n233#2,18:133\n253#2:170\n233#2,18:171\n253#2:208\n233#2,18:209\n253#2:246\n233#2,18:247\n253#2:284\n233#2,18:285\n253#2:322\n233#2,18:323\n253#2:360\n233#2,18:361\n253#2:398\n233#2,18:399\n253#2:436\n233#2,18:437\n253#2:474\n174#3:132\n705#4,2:151\n717#4,2:153\n719#4,11:159\n705#4,2:189\n717#4,2:191\n719#4,11:197\n705#4,2:227\n717#4,2:229\n719#4,11:235\n705#4,2:265\n717#4,2:267\n719#4,11:273\n705#4,2:303\n717#4,2:305\n719#4,11:311\n705#4,2:341\n717#4,2:343\n719#4,11:349\n705#4,2:379\n717#4,2:381\n719#4,11:387\n705#4,2:417\n717#4,2:419\n719#4,11:425\n705#4,2:455\n717#4,2:457\n719#4,11:463\n72#5,4:155\n72#5,4:193\n72#5,4:231\n72#5,4:269\n72#5,4:307\n72#5,4:345\n72#5,4:383\n72#5,4:421\n72#5,4:459\n*S KotlinDebug\n*F\n+ 1 DevicesFold.kt\nandroidx/compose/material/icons/twotone/DevicesFoldKt\n*L\n29#1:120,12\n30#1:133,18\n30#1:170\n37#1:171,18\n37#1:208\n65#1:209,18\n65#1:246\n72#1:247,18\n72#1:284\n79#1:285,18\n79#1:322\n86#1:323,18\n86#1:360\n93#1:361,18\n93#1:398\n100#1:399,18\n100#1:436\n107#1:437,18\n107#1:474\n29#1:132\n30#1:151,2\n30#1:153,2\n30#1:159,11\n37#1:189,2\n37#1:191,2\n37#1:197,11\n65#1:227,2\n65#1:229,2\n65#1:235,11\n72#1:265,2\n72#1:267,2\n72#1:273,11\n79#1:303,2\n79#1:305,2\n79#1:311,11\n86#1:341,2\n86#1:343,2\n86#1:349,11\n93#1:379,2\n93#1:381,2\n93#1:387,11\n100#1:417,2\n100#1:419,2\n100#1:425,11\n107#1:455,2\n107#1:457,2\n107#1:463,11\n30#1:155,4\n37#1:193,4\n65#1:231,4\n72#1:269,4\n79#1:307,4\n86#1:345,4\n93#1:383,4\n100#1:421,4\n107#1:459,4\n*E\n"})
/* loaded from: classes.dex */
public final class DevicesFoldKt {

    @Nullable
    private static ImageVector _devicesFold;

    @NotNull
    public static final ImageVector getDevicesFold(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _devicesFold;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.DevicesFold", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.0f, 3.0f);
        pathBuilder.lineToRelative(-3.0f, 1.29f);
        pathBuilder.lineToRelative(0.0f, 13.68f);
        pathBuilder.lineToRelative(3.0f, -1.29f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.0f, 3.0f);
        pathBuilder2.horizontalLineToRelative(-3.0f);
        pathBuilder2.curveToRelative(0.0f, -1.44f, -1.47f, -2.4f, -2.79f, -1.84f);
        pathBuilder2.lineToRelative(-3.0f, 1.29f);
        pathBuilder2.curveTo(10.48f, 2.76f, 10.0f, 3.49f, 10.0f, 4.29f);
        pathBuilder2.verticalLineTo(19.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.verticalLineTo(5.0f);
        pathBuilder2.curveTo(22.0f, 3.9f, 21.1f, 3.0f, 20.0f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 4.29f);
        pathBuilder2.lineTo(15.0f, 3.0f);
        pathBuilder2.verticalLineToRelative(13.68f);
        pathBuilder2.lineToRelative(-3.0f, 1.29f);
        pathBuilder2.verticalLineTo(4.29f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.0f, 19.0f);
        pathBuilder2.horizontalLineToRelative(-5.33f);
        pathBuilder2.lineToRelative(1.12f, -0.48f);
        pathBuilder2.curveTo(16.52f, 18.2f, 17.0f, 17.48f, 17.0f, 16.68f);
        pathBuilder2.verticalLineTo(5.0f);
        pathBuilder2.horizontalLineToRelative(3.0f);
        pathBuilder2.verticalLineTo(19.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(2.0f, 3.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder3.verticalLineToRelative(2.0f);
        pathBuilder3.horizontalLineToRelative(-2.0f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(2.0f, 19.0f);
        pathBuilder4.horizontalLineToRelative(2.0f);
        pathBuilder4.verticalLineToRelative(2.0f);
        pathBuilder4.horizontalLineToRelative(-2.0f);
        pathBuilder4.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(2.0f, 15.0f);
        pathBuilder5.horizontalLineToRelative(2.0f);
        pathBuilder5.verticalLineToRelative(2.0f);
        pathBuilder5.horizontalLineToRelative(-2.0f);
        pathBuilder5.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw5, iM11702getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType6 = VectorKt.getDefaultFillType();
        SolidColor solidColor6 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw6 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk86 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(2.0f, 11.0f);
        pathBuilder6.horizontalLineToRelative(2.0f);
        pathBuilder6.verticalLineToRelative(2.0f);
        pathBuilder6.horizontalLineToRelative(-2.0f);
        pathBuilder6.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder6.getNodes(), defaultFillType6, "", solidColor6, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw6, iM11702getBevelLxFBmk86, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType7 = VectorKt.getDefaultFillType();
        SolidColor solidColor7 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw7 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk87 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder7 = new PathBuilder();
        pathBuilder7.moveTo(2.0f, 7.0f);
        pathBuilder7.horizontalLineToRelative(2.0f);
        pathBuilder7.verticalLineToRelative(2.0f);
        pathBuilder7.horizontalLineToRelative(-2.0f);
        pathBuilder7.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder7.getNodes(), defaultFillType7, "", solidColor7, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw7, iM11702getBevelLxFBmk87, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType8 = VectorKt.getDefaultFillType();
        SolidColor solidColor8 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw8 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk88 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder8 = new PathBuilder();
        pathBuilder8.moveTo(6.0f, 3.0f);
        pathBuilder8.horizontalLineToRelative(2.0f);
        pathBuilder8.verticalLineToRelative(2.0f);
        pathBuilder8.horizontalLineToRelative(-2.0f);
        pathBuilder8.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder8.getNodes(), defaultFillType8, "", solidColor8, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw8, iM11702getBevelLxFBmk88, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType9 = VectorKt.getDefaultFillType();
        SolidColor solidColor9 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw9 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk89 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder9 = new PathBuilder();
        pathBuilder9.moveTo(6.0f, 19.0f);
        pathBuilder9.horizontalLineToRelative(2.0f);
        pathBuilder9.verticalLineToRelative(2.0f);
        pathBuilder9.horizontalLineToRelative(-2.0f);
        pathBuilder9.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder9.getNodes(), defaultFillType9, "", solidColor9, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw9, iM11702getBevelLxFBmk89, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _devicesFold = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
