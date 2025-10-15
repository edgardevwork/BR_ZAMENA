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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NoAdultContent.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_noAdultContent", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoAdultContent", "Landroidx/compose/material/icons/Icons$Rounded;", "getNoAdultContent", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nNoAdultContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoAdultContent.kt\nandroidx/compose/material/icons/rounded/NoAdultContentKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,102:1\n212#2,12:103\n233#2,18:116\n253#2:153\n233#2,18:154\n253#2:191\n233#2,18:192\n253#2:229\n233#2,18:230\n253#2:267\n174#3:115\n705#4,2:134\n717#4,2:136\n719#4,11:142\n705#4,2:172\n717#4,2:174\n719#4,11:180\n705#4,2:210\n717#4,2:212\n719#4,11:218\n705#4,2:248\n717#4,2:250\n719#4,11:256\n72#5,4:138\n72#5,4:176\n72#5,4:214\n72#5,4:252\n*S KotlinDebug\n*F\n+ 1 NoAdultContent.kt\nandroidx/compose/material/icons/rounded/NoAdultContentKt\n*L\n29#1:103,12\n30#1:116,18\n30#1:153\n52#1:154,18\n52#1:191\n67#1:192,18\n67#1:229\n82#1:230,18\n82#1:267\n29#1:115\n30#1:134,2\n30#1:136,2\n30#1:142,11\n52#1:172,2\n52#1:174,2\n52#1:180,11\n67#1:210,2\n67#1:212,2\n67#1:218,11\n82#1:248,2\n82#1:250,2\n82#1:256,11\n30#1:138,4\n52#1:176,4\n67#1:214,4\n82#1:252,4\n*E\n"})
/* loaded from: classes4.dex */
public final class NoAdultContentKt {

    @Nullable
    private static ImageVector _noAdultContent;

    @NotNull
    public static final ImageVector getNoAdultContent(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _noAdultContent;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NoAdultContent", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.85f, 0.63f, -3.54f, 1.69f, -4.9f);
        pathBuilder.lineTo(7.59f, 9.0f);
        pathBuilder.horizontalLineToRelative(2.83f);
        pathBuilder.lineTo(7.1f, 5.69f);
        pathBuilder.curveTo(8.46f, 4.63f, 10.15f, 4.0f, 12.0f, 4.0f);
        pathBuilder.curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, 1.85f, -0.63f, 3.54f, -1.69f, 4.9f);
        pathBuilder.lineToRelative(-1.9f, -1.9f);
        pathBuilder.horizontalLineToRelative(-2.83f);
        pathBuilder.lineToRelative(3.31f, 3.31f);
        pathBuilder.curveTo(15.54f, 19.37f, 13.85f, 20.0f, 12.0f, 20.0f);
        pathBuilder.curveTo(7.59f, 20.0f, 4.0f, 16.41f, 4.0f, 12.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(14.25f, 14.0f);
        pathBuilder2.lineToRelative(-1.5f, -2.0f);
        pathBuilder2.lineToRelative(1.5f, -2.0f);
        pathBuilder2.lineToRelative(-1.5f, 0.0f);
        pathBuilder2.lineToRelative(-0.75f, 1.0f);
        pathBuilder2.lineToRelative(-0.75f, -1.0f);
        pathBuilder2.lineToRelative(-1.5f, 0.0f);
        pathBuilder2.lineToRelative(1.5f, 2.0f);
        pathBuilder2.lineToRelative(-1.5f, 2.0f);
        pathBuilder2.lineToRelative(1.5f, 0.0f);
        pathBuilder2.lineToRelative(0.75f, -1.0f);
        pathBuilder2.lineToRelative(0.75f, 1.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(8.0f, 10.0f);
        pathBuilder3.lineToRelative(-0.75f, 1.0f);
        pathBuilder3.lineToRelative(-0.75f, -1.0f);
        pathBuilder3.lineToRelative(-1.5f, 0.0f);
        pathBuilder3.lineToRelative(1.5f, 2.0f);
        pathBuilder3.lineToRelative(-1.5f, 2.0f);
        pathBuilder3.lineToRelative(1.5f, 0.0f);
        pathBuilder3.lineToRelative(0.75f, -1.0f);
        pathBuilder3.lineToRelative(0.75f, 1.0f);
        pathBuilder3.lineToRelative(1.5f, 0.0f);
        pathBuilder3.lineToRelative(-1.5f, -2.0f);
        pathBuilder3.lineToRelative(1.5f, -2.0f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(16.0f, 14.0f);
        pathBuilder4.lineToRelative(0.75f, -1.0f);
        pathBuilder4.lineToRelative(0.75f, 1.0f);
        pathBuilder4.lineToRelative(1.5f, 0.0f);
        pathBuilder4.lineToRelative(-1.5f, -2.0f);
        pathBuilder4.lineToRelative(1.5f, -2.0f);
        pathBuilder4.lineToRelative(-1.5f, 0.0f);
        pathBuilder4.lineToRelative(-0.75f, 1.0f);
        pathBuilder4.lineToRelative(-0.75f, -1.0f);
        pathBuilder4.lineToRelative(-1.5f, 0.0f);
        pathBuilder4.lineToRelative(1.5f, 2.0f);
        pathBuilder4.lineToRelative(-1.5f, 2.0f);
        pathBuilder4.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noAdultContent = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
