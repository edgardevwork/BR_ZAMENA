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

/* compiled from: Contactless.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_contactless", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Contactless", "Landroidx/compose/material/icons/Icons$TwoTone;", "getContactless", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nContactless.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Contactless.kt\nandroidx/compose/material/icons/twotone/ContactlessKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,111:1\n212#2,12:112\n233#2,18:125\n253#2:162\n233#2,18:163\n253#2:200\n233#2,18:201\n253#2:238\n233#2,18:239\n253#2:276\n233#2,18:277\n253#2:314\n174#3:124\n705#4,2:143\n717#4,2:145\n719#4,11:151\n705#4,2:181\n717#4,2:183\n719#4,11:189\n705#4,2:219\n717#4,2:221\n719#4,11:227\n705#4,2:257\n717#4,2:259\n719#4,11:265\n705#4,2:295\n717#4,2:297\n719#4,11:303\n72#5,4:147\n72#5,4:185\n72#5,4:223\n72#5,4:261\n72#5,4:299\n*S KotlinDebug\n*F\n+ 1 Contactless.kt\nandroidx/compose/material/icons/twotone/ContactlessKt\n*L\n29#1:112,12\n30#1:125,18\n30#1:162\n62#1:163,18\n62#1:200\n76#1:201,18\n76#1:238\n86#1:239,18\n86#1:276\n96#1:277,18\n96#1:314\n29#1:124\n30#1:143,2\n30#1:145,2\n30#1:151,11\n62#1:181,2\n62#1:183,2\n62#1:189,11\n76#1:219,2\n76#1:221,2\n76#1:227,11\n86#1:257,2\n86#1:259,2\n86#1:265,11\n96#1:295,2\n96#1:297,2\n96#1:303,11\n30#1:147,4\n62#1:185,4\n76#1:223,4\n86#1:261,4\n96#1:299,4\n*E\n"})
/* loaded from: classes2.dex */
public final class ContactlessKt {

    @Nullable
    private static ImageVector _contactless;

    @NotNull
    public static final ImageVector getContactless(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _contactless;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Contactless", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(3.58f, 8.0f, 8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        pathBuilder.reflectiveCurveTo(16.42f, 4.0f, 12.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.46f, 14.45f);
        pathBuilder.lineTo(7.1f, 13.83f);
        pathBuilder.curveToRelative(0.28f, -0.61f, 0.41f, -1.24f, 0.4f, -1.86f);
        pathBuilder.curveToRelative(-0.01f, -0.63f, -0.14f, -1.24f, -0.4f, -1.8f);
        pathBuilder.lineToRelative(1.36f, -0.63f);
        pathBuilder.curveToRelative(0.35f, 0.75f, 0.53f, 1.56f, 0.54f, 2.4f);
        pathBuilder.curveTo(9.01f, 12.8f, 8.83f, 13.64f, 8.46f, 14.45f);
        pathBuilder.close();
        pathBuilder.moveTo(11.53f, 16.01f);
        pathBuilder.lineToRelative(-1.3f, -0.74f);
        pathBuilder.curveToRelative(0.52f, -0.92f, 0.78f, -1.98f, 0.78f, -3.15f);
        pathBuilder.curveToRelative(0.0f, -1.19f, -0.27f, -2.33f, -0.8f, -3.4f);
        pathBuilder.lineToRelative(1.34f, -0.67f);
        pathBuilder.curveToRelative(0.64f, 1.28f, 0.96f, 2.65f, 0.96f, 4.07f);
        pathBuilder.curveTo(12.51f, 13.55f, 12.18f, 14.86f, 11.53f, 16.01f);
        pathBuilder.close();
        pathBuilder.moveTo(14.67f, 17.33f);
        pathBuilder.lineToRelative(-1.35f, -0.66f);
        pathBuilder.curveToRelative(0.78f, -1.6f, 1.18f, -3.18f, 1.18f, -4.69f);
        pathBuilder.curveToRelative(0.0f, -1.51f, -0.4f, -3.07f, -1.18f, -4.64f);
        pathBuilder.lineToRelative(1.34f, -0.67f);
        pathBuilder.curveTo(15.56f, 8.45f, 16.0f, 10.23f, 16.0f, 11.98f);
        pathBuilder.curveTo(16.0f, 13.72f, 15.56f, 15.52f, 14.67f, 17.33f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 2.0f);
        pathBuilder2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder2.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder2.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 20.0f);
        pathBuilder2.curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        pathBuilder2.reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f);
        pathBuilder2.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        pathBuilder2.reflectiveCurveTo(16.42f, 20.0f, 12.0f, 20.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(7.1f, 10.18f);
        pathBuilder3.curveToRelative(0.26f, 0.56f, 0.39f, 1.16f, 0.4f, 1.8f);
        pathBuilder3.curveToRelative(0.01f, 0.63f, -0.13f, 1.25f, -0.4f, 1.86f);
        pathBuilder3.lineToRelative(1.37f, 0.62f);
        pathBuilder3.curveToRelative(0.37f, -0.81f, 0.55f, -1.65f, 0.54f, -2.5f);
        pathBuilder3.curveToRelative(-0.01f, -0.84f, -0.19f, -1.65f, -0.54f, -2.4f);
        pathBuilder3.lineTo(7.1f, 10.18f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(13.33f, 7.33f);
        pathBuilder4.curveToRelative(0.78f, 1.57f, 1.18f, 3.14f, 1.18f, 4.64f);
        pathBuilder4.curveToRelative(0.0f, 1.51f, -0.4f, 3.09f, -1.18f, 4.69f);
        pathBuilder4.lineToRelative(1.35f, 0.66f);
        pathBuilder4.curveToRelative(0.88f, -1.81f, 1.33f, -3.61f, 1.33f, -5.35f);
        pathBuilder4.curveToRelative(0.0f, -1.74f, -0.45f, -3.53f, -1.33f, -5.31f);
        pathBuilder4.lineTo(13.33f, 7.33f);
        pathBuilder4.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(10.2f, 8.72f);
        pathBuilder5.curveToRelative(0.53f, 1.07f, 0.8f, 2.21f, 0.8f, 3.4f);
        pathBuilder5.curveToRelative(0.0f, 1.17f, -0.26f, 2.23f, -0.78f, 3.15f);
        pathBuilder5.lineToRelative(1.3f, 0.74f);
        pathBuilder5.curveToRelative(0.65f, -1.15f, 0.98f, -2.45f, 0.98f, -3.89f);
        pathBuilder5.curveToRelative(0.0f, -1.42f, -0.32f, -2.79f, -0.96f, -4.07f);
        pathBuilder5.lineTo(10.2f, 8.72f);
        pathBuilder5.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw5, iM11702getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contactless = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
