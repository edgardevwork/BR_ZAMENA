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

/* compiled from: Pin.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_pin", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Pin", "Landroidx/compose/material/icons/Icons$Outlined;", "getPin", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pin.kt\nandroidx/compose/material/icons/outlined/PinKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,106:1\n212#2,12:107\n233#2,18:120\n253#2:157\n233#2,18:158\n253#2:195\n233#2,18:196\n253#2:233\n233#2,18:234\n253#2:271\n174#3:119\n705#4,2:138\n717#4,2:140\n719#4,11:146\n705#4,2:176\n717#4,2:178\n719#4,11:184\n705#4,2:214\n717#4,2:216\n719#4,11:222\n705#4,2:252\n717#4,2:254\n719#4,11:260\n72#5,4:142\n72#5,4:180\n72#5,4:218\n72#5,4:256\n*S KotlinDebug\n*F\n+ 1 Pin.kt\nandroidx/compose/material/icons/outlined/PinKt\n*L\n29#1:107,12\n30#1:120,18\n30#1:157\n48#1:158,18\n48#1:195\n58#1:196,18\n58#1:233\n77#1:234,18\n77#1:271\n29#1:119\n30#1:138,2\n30#1:140,2\n30#1:146,11\n48#1:176,2\n48#1:178,2\n48#1:184,11\n58#1:214,2\n58#1:216,2\n58#1:222,11\n77#1:252,2\n77#1:254,2\n77#1:260,11\n30#1:142,4\n48#1:180,4\n58#1:218,4\n77#1:256,4\n*E\n"})
/* loaded from: classes4.dex */
public final class PinKt {

    @Nullable
    private static ImageVector _pin;

    @NotNull
    public static final ImageVector getPin(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _pin;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Pin", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 4.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 18.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(6.49f, 10.5f);
        pathBuilder2.lineToRelative(0.0f, 4.5f);
        pathBuilder2.lineToRelative(1.15f, 0.0f);
        pathBuilder2.lineToRelative(0.0f, -6.0f);
        pathBuilder2.lineToRelative(-0.87f, 0.0f);
        pathBuilder2.lineToRelative(-1.76f, 1.27f);
        pathBuilder2.lineToRelative(0.58f, 0.89f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(11.47f, 10.05f);
        pathBuilder3.curveToRelative(0.5f, 0.0f, 0.81f, 0.32f, 0.81f, 0.72f);
        pathBuilder3.curveToRelative(0.0f, 0.37f, -0.14f, 0.64f, -0.54f, 1.06f);
        pathBuilder3.curveToRelative(-0.36f, 0.38f, -1.06f, 1.08f, -2.13f, 2.15f);
        pathBuilder3.verticalLineTo(15.0f);
        pathBuilder3.horizontalLineToRelative(3.89f);
        pathBuilder3.verticalLineToRelative(-0.99f);
        pathBuilder3.horizontalLineToRelative(-2.37f);
        pathBuilder3.lineToRelative(-0.03f, -0.05f);
        pathBuilder3.curveToRelative(0.68f, -0.68f, 1.15f, -1.14f, 1.4f, -1.39f);
        pathBuilder3.curveToRelative(0.61f, -0.6f, 0.92f, -1.22f, 0.92f, -1.86f);
        pathBuilder3.curveToRelative(0.0f, -0.24f, -0.05f, -1.04f, -0.91f, -1.48f);
        pathBuilder3.curveTo(12.04f, 9.0f, 11.25f, 8.87f, 10.56f, 9.2f);
        pathBuilder3.curveToRelative(-0.82f, 0.39f, -0.99f, 1.13f, -1.0f, 1.15f);
        pathBuilder3.lineToRelative(1.01f, 0.42f);
        pathBuilder3.curveTo(10.67f, 10.44f, 10.95f, 10.05f, 11.47f, 10.05f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(16.99f, 13.94f);
        pathBuilder4.curveToRelative(-0.83f, 0.0f, -0.99f, -0.76f, -1.02f, -0.86f);
        pathBuilder4.lineToRelative(-1.03f, 0.41f);
        pathBuilder4.curveToRelative(0.45f, 1.59f, 2.01f, 1.51f, 2.05f, 1.51f);
        pathBuilder4.curveToRelative(1.2f, 0.0f, 1.68f, -0.72f, 1.76f, -0.85f);
        pathBuilder4.curveToRelative(0.32f, -0.49f, 0.36f, -1.24f, -0.01f, -1.76f);
        pathBuilder4.curveToRelative(-0.17f, -0.24f, -0.4f, -0.41f, -0.68f, -0.52f);
        pathBuilder4.verticalLineTo(11.8f);
        pathBuilder4.curveToRelative(0.2f, -0.1f, 0.37f, -0.26f, 0.52f, -0.48f);
        pathBuilder4.curveToRelative(0.26f, -0.41f, 0.31f, -1.07f, -0.02f, -1.57f);
        pathBuilder4.curveTo(18.48f, 9.64f, 18.03f, 9.0f, 16.94f, 9.0f);
        pathBuilder4.curveToRelative(-1.26f, 0.0f, -1.74f, 0.9f, -1.85f, 1.24f);
        pathBuilder4.lineToRelative(0.99f, 0.41f);
        pathBuilder4.curveToRelative(0.11f, -0.32f, 0.35f, -0.64f, 0.85f, -0.64f);
        pathBuilder4.curveToRelative(0.44f, 0.0f, 0.75f, 0.26f, 0.75f, 0.65f);
        pathBuilder4.curveToRelative(0.0f, 0.58f, -0.55f, 0.72f, -0.88f, 0.72f);
        pathBuilder4.horizontalLineToRelative(-0.46f);
        pathBuilder4.verticalLineToRelative(1.0f);
        pathBuilder4.horizontalLineToRelative(0.5f);
        pathBuilder4.curveToRelative(0.56f, 0.0f, 1.04f, 0.24f, 1.04f, 0.79f);
        pathBuilder4.curveTo(17.88f, 13.66f, 17.4f, 13.94f, 16.99f, 13.94f);
        pathBuilder4.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pin = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
