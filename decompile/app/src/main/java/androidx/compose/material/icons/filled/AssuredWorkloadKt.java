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

/* compiled from: AssuredWorkload.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_assuredWorkload", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AssuredWorkload", "Landroidx/compose/material/icons/Icons$Filled;", "getAssuredWorkload", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAssuredWorkload.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssuredWorkload.kt\nandroidx/compose/material/icons/filled/AssuredWorkloadKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,90:1\n212#2,12:91\n233#2,18:104\n253#2:141\n233#2,18:142\n253#2:179\n233#2,18:180\n253#2:217\n233#2,18:218\n253#2:255\n233#2,18:256\n253#2:293\n233#2,18:294\n253#2:331\n174#3:103\n705#4,2:122\n717#4,2:124\n719#4,11:130\n705#4,2:160\n717#4,2:162\n719#4,11:168\n705#4,2:198\n717#4,2:200\n719#4,11:206\n705#4,2:236\n717#4,2:238\n719#4,11:244\n705#4,2:274\n717#4,2:276\n719#4,11:282\n705#4,2:312\n717#4,2:314\n719#4,11:320\n72#5,4:126\n72#5,4:164\n72#5,4:202\n72#5,4:240\n72#5,4:278\n72#5,4:316\n*S KotlinDebug\n*F\n+ 1 AssuredWorkload.kt\nandroidx/compose/material/icons/filled/AssuredWorkloadKt\n*L\n29#1:91,12\n30#1:104,18\n30#1:141\n37#1:142,18\n37#1:179\n44#1:180,18\n44#1:217\n52#1:218,18\n52#1:255\n60#1:256,18\n60#1:293\n67#1:294,18\n67#1:331\n29#1:103\n30#1:122,2\n30#1:124,2\n30#1:130,11\n37#1:160,2\n37#1:162,2\n37#1:168,11\n44#1:198,2\n44#1:200,2\n44#1:206,11\n52#1:236,2\n52#1:238,2\n52#1:244,11\n60#1:274,2\n60#1:276,2\n60#1:282,11\n67#1:312,2\n67#1:314,2\n67#1:320,11\n30#1:126,4\n37#1:164,4\n44#1:202,4\n52#1:240,4\n60#1:278,4\n67#1:316,4\n*E\n"})
/* loaded from: classes2.dex */
public final class AssuredWorkloadKt {

    @Nullable
    private static ImageVector _assuredWorkload;

    @NotNull
    public static final ImageVector getAssuredWorkload(@NotNull Icons.Filled filled) {
        ImageVector imageVector = _assuredWorkload;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AssuredWorkload", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 10.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(11.0f, 10.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(7.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(22.0f, 6.0f);
        pathBuilder3.lineToRelative(-10.0f, -5.0f);
        pathBuilder3.lineToRelative(-10.0f, 5.0f);
        pathBuilder3.lineToRelative(0.0f, 2.0f);
        pathBuilder3.lineToRelative(20.0f, 0.0f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(2.0f, 19.0f);
        pathBuilder4.verticalLineToRelative(2.0f);
        pathBuilder4.horizontalLineToRelative(12.4f);
        pathBuilder4.curveToRelative(-0.21f, -0.64f, -0.32f, -1.31f, -0.36f, -2.0f);
        pathBuilder4.horizontalLineTo(2.0f);
        pathBuilder4.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(19.0f, 12.26f);
        pathBuilder5.lineToRelative(0.0f, -2.26f);
        pathBuilder5.lineToRelative(-2.0f, 0.0f);
        pathBuilder5.lineToRelative(0.0f, 3.26f);
        pathBuilder5.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw5, iM11702getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType6 = VectorKt.getDefaultFillType();
        SolidColor solidColor6 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw6 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk86 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(20.0f, 14.0f);
        pathBuilder6.lineToRelative(-4.0f, 2.0f);
        pathBuilder6.verticalLineToRelative(2.55f);
        pathBuilder6.curveToRelative(0.0f, 2.52f, 1.71f, 4.88f, 4.0f, 5.45f);
        pathBuilder6.curveToRelative(2.29f, -0.57f, 4.0f, -2.93f, 4.0f, -5.45f);
        pathBuilder6.verticalLineTo(16.0f);
        pathBuilder6.lineTo(20.0f, 14.0f);
        pathBuilder6.close();
        pathBuilder6.moveTo(19.28f, 21.0f);
        pathBuilder6.lineToRelative(-2.03f, -2.03f);
        pathBuilder6.lineToRelative(1.06f, -1.06f);
        pathBuilder6.lineToRelative(0.97f, 0.97f);
        pathBuilder6.lineToRelative(2.41f, -2.38f);
        pathBuilder6.lineToRelative(1.06f, 1.06f);
        pathBuilder6.lineTo(19.28f, 21.0f);
        pathBuilder6.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder6.getNodes(), defaultFillType6, "", solidColor6, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw6, iM11702getBevelLxFBmk86, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _assuredWorkload = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
