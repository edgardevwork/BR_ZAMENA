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

/* compiled from: Storefront.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_storefront", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Storefront", "Landroidx/compose/material/icons/Icons$TwoTone;", "getStorefront", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nStorefront.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Storefront.kt\nandroidx/compose/material/icons/twotone/StorefrontKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,138:1\n212#2,12:139\n233#2,18:152\n253#2:189\n233#2,18:190\n253#2:227\n233#2,18:228\n253#2:265\n233#2,18:266\n253#2:303\n233#2,18:304\n253#2:341\n174#3:151\n705#4,2:170\n717#4,2:172\n719#4,11:178\n705#4,2:208\n717#4,2:210\n719#4,11:216\n705#4,2:246\n717#4,2:248\n719#4,11:254\n705#4,2:284\n717#4,2:286\n719#4,11:292\n705#4,2:322\n717#4,2:324\n719#4,11:330\n72#5,4:174\n72#5,4:212\n72#5,4:250\n72#5,4:288\n72#5,4:326\n*S KotlinDebug\n*F\n+ 1 Storefront.kt\nandroidx/compose/material/icons/twotone/StorefrontKt\n*L\n29#1:139,12\n30#1:152,18\n30#1:189\n40#1:190,18\n40#1:227\n50#1:228,18\n50#1:265\n60#1:266,18\n60#1:303\n70#1:304,18\n70#1:341\n29#1:151\n30#1:170,2\n30#1:172,2\n30#1:178,11\n40#1:208,2\n40#1:210,2\n40#1:216,11\n50#1:246,2\n50#1:248,2\n50#1:254,11\n60#1:284,2\n60#1:286,2\n60#1:292,11\n70#1:322,2\n70#1:324,2\n70#1:330,11\n30#1:174,4\n40#1:212,4\n50#1:250,4\n60#1:288,4\n70#1:326,4\n*E\n"})
/* loaded from: classes.dex */
public final class StorefrontKt {

    @Nullable
    private static ImageVector _storefront;

    @NotNull
    public static final ImageVector getStorefront(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _storefront;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Storefront", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.44f, 9.86f);
        pathBuilder.lineTo(7.02f, 5.0f);
        pathBuilder.horizontalLineTo(5.05f);
        pathBuilder.lineTo(4.04f, 9.36f);
        pathBuilder.curveToRelative(-0.1f, 0.42f, -0.01f, 0.84f, 0.25f, 1.17f);
        pathBuilder.curveTo(4.43f, 10.71f, 4.73f, 11.0f, 5.23f, 11.0f);
        pathBuilder.curveTo(5.84f, 11.0f, 6.36f, 10.51f, 6.44f, 9.86f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(9.71f, 11.0f);
        pathBuilder2.curveTo(10.45f, 11.0f, 11.0f, 10.41f, 11.0f, 9.69f);
        pathBuilder2.verticalLineTo(5.0f);
        pathBuilder2.horizontalLineTo(9.04f);
        pathBuilder2.lineTo(8.49f, 9.52f);
        pathBuilder2.curveToRelative(-0.05f, 0.39f, 0.07f, 0.78f, 0.33f, 1.07f);
        pathBuilder2.curveTo(9.05f, 10.85f, 9.37f, 11.0f, 9.71f, 11.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(14.22f, 11.0f);
        pathBuilder3.curveToRelative(0.41f, 0.0f, 0.72f, -0.15f, 0.96f, -0.41f);
        pathBuilder3.curveToRelative(0.25f, -0.29f, 0.37f, -0.68f, 0.33f, -1.07f);
        pathBuilder3.lineTo(14.96f, 5.0f);
        pathBuilder3.horizontalLineTo(13.0f);
        pathBuilder3.verticalLineToRelative(4.69f);
        pathBuilder3.curveTo(13.0f, 10.41f, 13.55f, 11.0f, 14.22f, 11.0f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(18.91f, 4.99f);
        pathBuilder4.lineTo(16.98f, 5.0f);
        pathBuilder4.lineToRelative(0.58f, 4.86f);
        pathBuilder4.curveToRelative(0.08f, 0.65f, 0.6f, 1.14f, 1.21f, 1.14f);
        pathBuilder4.curveToRelative(0.49f, 0.0f, 0.8f, -0.29f, 0.93f, -0.47f);
        pathBuilder4.curveToRelative(0.26f, -0.33f, 0.35f, -0.76f, 0.25f, -1.17f);
        pathBuilder4.lineTo(18.91f, 4.99f);
        pathBuilder4.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(21.9f, 8.89f);
        pathBuilder5.lineToRelative(-1.05f, -4.37f);
        pathBuilder5.curveToRelative(-0.22f, -0.9f, -1.0f, -1.52f, -1.91f, -1.52f);
        pathBuilder5.horizontalLineTo(5.05f);
        pathBuilder5.curveTo(4.15f, 3.0f, 3.36f, 3.63f, 3.15f, 4.52f);
        pathBuilder5.lineTo(2.1f, 8.89f);
        pathBuilder5.curveToRelative(-0.24f, 1.02f, -0.02f, 2.06f, 0.62f, 2.88f);
        pathBuilder5.curveTo(2.8f, 11.88f, 2.91f, 11.96f, 3.0f, 12.06f);
        pathBuilder5.verticalLineTo(19.0f);
        pathBuilder5.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder5.horizontalLineToRelative(14.0f);
        pathBuilder5.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder5.verticalLineToRelative(-6.94f);
        pathBuilder5.curveToRelative(0.09f, -0.09f, 0.2f, -0.18f, 0.28f, -0.28f);
        pathBuilder5.curveTo(21.92f, 10.96f, 22.15f, 9.91f, 21.9f, 8.89f);
        pathBuilder5.close();
        pathBuilder5.moveTo(13.0f, 5.0f);
        pathBuilder5.horizontalLineToRelative(1.96f);
        pathBuilder5.lineToRelative(0.54f, 4.52f);
        pathBuilder5.curveToRelative(0.05f, 0.39f, -0.07f, 0.78f, -0.33f, 1.07f);
        pathBuilder5.curveTo(14.95f, 10.85f, 14.63f, 11.0f, 14.22f, 11.0f);
        pathBuilder5.curveTo(13.55f, 11.0f, 13.0f, 10.41f, 13.0f, 9.69f);
        pathBuilder5.verticalLineTo(5.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(8.49f, 9.52f);
        pathBuilder5.lineTo(9.04f, 5.0f);
        pathBuilder5.horizontalLineTo(11.0f);
        pathBuilder5.verticalLineToRelative(4.69f);
        pathBuilder5.curveTo(11.0f, 10.41f, 10.45f, 11.0f, 9.71f, 11.0f);
        pathBuilder5.curveToRelative(-0.34f, 0.0f, -0.65f, -0.15f, -0.89f, -0.41f);
        pathBuilder5.curveTo(8.57f, 10.3f, 8.45f, 9.91f, 8.49f, 9.52f);
        pathBuilder5.close();
        pathBuilder5.moveTo(4.29f, 10.53f);
        pathBuilder5.curveToRelative(-0.26f, -0.33f, -0.35f, -0.76f, -0.25f, -1.17f);
        pathBuilder5.lineTo(5.05f, 5.0f);
        pathBuilder5.horizontalLineToRelative(1.97f);
        pathBuilder5.lineTo(6.44f, 9.86f);
        pathBuilder5.curveTo(6.36f, 10.51f, 5.84f, 11.0f, 5.23f, 11.0f);
        pathBuilder5.curveTo(4.73f, 11.0f, 4.43f, 10.71f, 4.29f, 10.53f);
        pathBuilder5.close();
        pathBuilder5.moveTo(19.0f, 19.0f);
        pathBuilder5.horizontalLineTo(5.0f);
        pathBuilder5.verticalLineToRelative(-6.03f);
        pathBuilder5.curveTo(5.08f, 12.98f, 5.15f, 13.0f, 5.23f, 13.0f);
        pathBuilder5.curveToRelative(0.87f, 0.0f, 1.66f, -0.36f, 2.24f, -0.95f);
        pathBuilder5.curveToRelative(0.6f, 0.6f, 1.4f, 0.95f, 2.31f, 0.95f);
        pathBuilder5.curveToRelative(0.87f, 0.0f, 1.65f, -0.36f, 2.23f, -0.93f);
        pathBuilder5.curveToRelative(0.59f, 0.57f, 1.39f, 0.93f, 2.29f, 0.93f);
        pathBuilder5.curveToRelative(0.84f, 0.0f, 1.64f, -0.35f, 2.24f, -0.95f);
        pathBuilder5.curveToRelative(0.58f, 0.59f, 1.37f, 0.95f, 2.24f, 0.95f);
        pathBuilder5.curveToRelative(0.08f, 0.0f, 0.15f, -0.02f, 0.23f, -0.03f);
        pathBuilder5.verticalLineTo(19.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(19.71f, 10.53f);
        pathBuilder5.curveTo(19.57f, 10.71f, 19.27f, 11.0f, 18.77f, 11.0f);
        pathBuilder5.curveToRelative(-0.61f, 0.0f, -1.14f, -0.49f, -1.21f, -1.14f);
        pathBuilder5.lineTo(16.98f, 5.0f);
        pathBuilder5.lineToRelative(1.93f, -0.01f);
        pathBuilder5.lineToRelative(1.05f, 4.37f);
        pathBuilder5.curveTo(20.06f, 9.78f, 19.97f, 10.21f, 19.71f, 10.53f);
        pathBuilder5.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw5, iM11702getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _storefront = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
