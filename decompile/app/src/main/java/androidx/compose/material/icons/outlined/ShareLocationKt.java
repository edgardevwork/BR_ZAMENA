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

/* compiled from: ShareLocation.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_shareLocation", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ShareLocation", "Landroidx/compose/material/icons/Icons$Outlined;", "getShareLocation", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nShareLocation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareLocation.kt\nandroidx/compose/material/icons/outlined/ShareLocationKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,91:1\n212#2,12:92\n233#2,18:105\n253#2:142\n233#2,18:143\n253#2:180\n233#2,18:181\n253#2:218\n233#2,18:219\n253#2:256\n233#2,18:257\n253#2:294\n233#2,18:295\n253#2:332\n174#3:104\n705#4,2:123\n717#4,2:125\n719#4,11:131\n705#4,2:161\n717#4,2:163\n719#4,11:169\n705#4,2:199\n717#4,2:201\n719#4,11:207\n705#4,2:237\n717#4,2:239\n719#4,11:245\n705#4,2:275\n717#4,2:277\n719#4,11:283\n705#4,2:313\n717#4,2:315\n719#4,11:321\n72#5,4:127\n72#5,4:165\n72#5,4:203\n72#5,4:241\n72#5,4:279\n72#5,4:317\n*S KotlinDebug\n*F\n+ 1 ShareLocation.kt\nandroidx/compose/material/icons/outlined/ShareLocationKt\n*L\n29#1:92,12\n30#1:105,18\n30#1:142\n38#1:143,18\n38#1:180\n48#1:181,18\n48#1:218\n56#1:219,18\n56#1:256\n64#1:257,18\n64#1:294\n72#1:295,18\n72#1:332\n29#1:104\n30#1:123,2\n30#1:125,2\n30#1:131,11\n38#1:161,2\n38#1:163,2\n38#1:169,11\n48#1:199,2\n48#1:201,2\n48#1:207,11\n56#1:237,2\n56#1:239,2\n56#1:245,11\n64#1:275,2\n64#1:277,2\n64#1:283,11\n72#1:313,2\n72#1:315,2\n72#1:321,11\n30#1:127,4\n38#1:165,4\n48#1:203,4\n56#1:241,4\n64#1:279,4\n72#1:317,4\n*E\n"})
/* loaded from: classes3.dex */
public final class ShareLocationKt {

    @Nullable
    private static ImageVector _shareLocation;

    @NotNull
    public static final ImageVector getShareLocation(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _shareLocation;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ShareLocation", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.02f, 19.93f);
        pathBuilder.verticalLineToRelative(2.02f);
        pathBuilder.curveToRelative(2.01f, -0.2f, 3.84f, -1.0f, 5.32f, -2.21f);
        pathBuilder.lineToRelative(-1.42f, -1.43f);
        pathBuilder.curveTo(15.81f, 19.17f, 14.48f, 19.75f, 13.02f, 19.93f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(4.03f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, -4.05f, 3.03f, -7.41f, 6.95f, -7.93f);
        pathBuilder2.verticalLineTo(2.05f);
        pathBuilder2.curveTo(5.95f, 2.58f, 2.03f, 6.84f, 2.03f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, 5.16f, 3.92f, 9.42f, 8.95f, 9.95f);
        pathBuilder2.verticalLineToRelative(-2.02f);
        pathBuilder2.curveTo(7.06f, 19.41f, 4.03f, 16.05f, 4.03f, 12.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(19.95f, 11.0f);
        pathBuilder3.horizontalLineToRelative(2.02f);
        pathBuilder3.curveToRelative(-0.2f, -2.01f, -1.0f, -3.84f, -2.21f, -5.32f);
        pathBuilder3.lineToRelative(-1.43f, 1.43f);
        pathBuilder3.curveTo(19.19f, 8.21f, 19.77f, 9.54f, 19.95f, 11.0f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(18.34f, 4.26f);
        pathBuilder4.curveToRelative(-1.48f, -1.21f, -3.32f, -2.01f, -5.32f, -2.21f);
        pathBuilder4.verticalLineToRelative(2.02f);
        pathBuilder4.curveToRelative(1.46f, 0.18f, 2.79f, 0.76f, 3.9f, 1.62f);
        pathBuilder4.lineTo(18.34f, 4.26f);
        pathBuilder4.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(18.33f, 16.9f);
        pathBuilder5.lineToRelative(1.43f, 1.42f);
        pathBuilder5.curveToRelative(1.21f, -1.48f, 2.01f, -3.31f, 2.21f, -5.32f);
        pathBuilder5.horizontalLineToRelative(-2.02f);
        pathBuilder5.curveTo(19.77f, 14.46f, 19.19f, 15.79f, 18.33f, 16.9f);
        pathBuilder5.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw5, iM11702getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType6 = VectorKt.getDefaultFillType();
        SolidColor solidColor6 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw6 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk86 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(16.0f, 11.1f);
        pathBuilder6.curveTo(16.0f, 8.61f, 14.1f, 7.0f, 12.0f, 7.0f);
        pathBuilder6.reflectiveCurveToRelative(-4.0f, 1.61f, -4.0f, 4.1f);
        pathBuilder6.curveToRelative(0.0f, 1.66f, 1.33f, 3.63f, 4.0f, 5.9f);
        pathBuilder6.curveTo(14.67f, 14.73f, 16.0f, 12.76f, 16.0f, 11.1f);
        pathBuilder6.close();
        pathBuilder6.moveTo(12.0f, 12.0f);
        pathBuilder6.curveToRelative(-0.59f, 0.0f, -1.07f, -0.48f, -1.07f, -1.07f);
        pathBuilder6.curveToRelative(0.0f, -0.59f, 0.48f, -1.07f, 1.07f, -1.07f);
        pathBuilder6.reflectiveCurveToRelative(1.07f, 0.48f, 1.07f, 1.07f);
        pathBuilder6.curveTo(13.07f, 11.52f, 12.59f, 12.0f, 12.0f, 12.0f);
        pathBuilder6.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder6.getNodes(), defaultFillType6, "", solidColor6, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw6, iM11702getBevelLxFBmk86, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shareLocation = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
