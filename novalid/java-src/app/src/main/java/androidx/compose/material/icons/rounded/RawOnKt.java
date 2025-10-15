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

/* compiled from: RawOn.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_rawOn", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RawOn", "Landroidx/compose/material/icons/Icons$Rounded;", "getRawOn", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nRawOn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RawOn.kt\nandroidx/compose/material/icons/rounded/RawOnKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,112:1\n212#2,12:113\n233#2,18:126\n253#2:163\n233#2,18:164\n253#2:201\n233#2,18:202\n253#2:239\n174#3:125\n705#4,2:144\n717#4,2:146\n719#4,11:152\n705#4,2:182\n717#4,2:184\n719#4,11:190\n705#4,2:220\n717#4,2:222\n719#4,11:228\n72#5,4:148\n72#5,4:186\n72#5,4:224\n*S KotlinDebug\n*F\n+ 1 RawOn.kt\nandroidx/compose/material/icons/rounded/RawOnKt\n*L\n29#1:113,12\n30#1:126,18\n30#1:163\n56#1:164,18\n56#1:201\n80#1:202,18\n80#1:239\n29#1:125\n30#1:144,2\n30#1:146,2\n30#1:152,11\n56#1:182,2\n56#1:184,2\n56#1:190,11\n80#1:220,2\n80#1:222,2\n80#1:228,11\n30#1:148,4\n56#1:186,4\n80#1:224,4\n*E\n"})
/* loaded from: classes2.dex */
public final class RawOnKt {

    @Nullable
    private static ImageVector _rawOn;

    @NotNull
    public static final ImageVector getRawOn(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _rawOn;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RawOn", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.5f, 9.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(4.31f);
        pathBuilder.curveTo(3.0f, 14.69f, 3.31f, 15.0f, 3.69f, 15.0f);
        pathBuilder.horizontalLineToRelative(0.11f);
        pathBuilder.curveToRelative(0.38f, 0.0f, 0.69f, -0.31f, 0.69f, -0.69f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder.horizontalLineToRelative(1.1f);
        pathBuilder.lineToRelative(0.72f, 1.59f);
        pathBuilder.curveTo(6.43f, 14.84f, 6.68f, 15.0f, 6.95f, 15.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.5f, 0.0f, 0.83f, -0.51f, 0.64f, -0.97f);
        pathBuilder.lineTo(7.1f, 12.9f);
        pathBuilder.curveTo(7.6f, 12.6f, 8.0f, 12.1f, 8.0f, 11.5f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.curveTo(8.0f, 9.68f, 7.32f, 9.0f, 6.5f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.5f, 11.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(11.5f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(11.5f, 9.0f);
        pathBuilder2.curveToRelative(-0.73f, 0.0f, -1.37f, 0.5f, -1.55f, 1.21f);
        pathBuilder2.lineTo(8.98f, 14.1f);
        pathBuilder2.curveTo(8.86f, 14.56f, 9.21f, 15.0f, 9.68f, 15.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.33f, 0.0f, 0.62f, -0.23f, 0.7f, -0.55f);
        pathBuilder2.lineToRelative(0.24f, -0.95f);
        pathBuilder2.horizontalLineToRelative(1.75f);
        pathBuilder2.lineToRelative(0.23f, 0.95f);
        pathBuilder2.curveToRelative(0.08f, 0.32f, 0.37f, 0.55f, 0.71f, 0.55f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.47f, 0.0f, 0.82f, -0.44f, 0.71f, -0.9f);
        pathBuilder2.lineToRelative(-0.97f, -3.88f);
        pathBuilder2.curveTo(12.87f, 9.5f, 12.23f, 9.0f, 11.5f, 9.0f);
        pathBuilder2.lineTo(11.5f, 9.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(11.0f, 12.0f);
        pathBuilder2.lineToRelative(0.25f, -1.0f);
        pathBuilder2.horizontalLineToRelative(0.5f);
        pathBuilder2.lineTo(12.0f, 12.0f);
        pathBuilder2.horizontalLineTo(11.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(19.84f, 9.55f);
        pathBuilder3.lineTo(19.24f, 12.0f);
        pathBuilder3.lineToRelative(-0.56f, -2.26f);
        pathBuilder3.curveTo(18.58f, 9.3f, 18.19f, 9.0f, 17.74f, 9.0f);
        pathBuilder3.lineToRelative(0.0f, 0.0f);
        pathBuilder3.curveToRelative(-0.45f, 0.0f, -0.84f, 0.3f, -0.94f, 0.74f);
        pathBuilder3.lineTo(16.24f, 12.0f);
        pathBuilder3.lineToRelative(-0.6f, -2.45f);
        pathBuilder3.curveTo(15.56f, 9.23f, 15.27f, 9.0f, 14.93f, 9.0f);
        pathBuilder3.horizontalLineToRelative(0.0f);
        pathBuilder3.curveToRelative(-0.47f, 0.0f, -0.82f, 0.44f, -0.71f, 0.9f);
        pathBuilder3.lineToRelative(1.09f, 4.38f);
        pathBuilder3.curveTo(15.43f, 14.7f, 15.81f, 15.0f, 16.24f, 15.0f);
        pathBuilder3.lineToRelative(0.0f, 0.0f);
        pathBuilder3.curveToRelative(0.43f, 0.0f, 0.81f, -0.3f, 0.92f, -0.72f);
        pathBuilder3.lineToRelative(0.58f, -2.32f);
        pathBuilder3.lineToRelative(0.58f, 2.32f);
        pathBuilder3.curveTo(18.43f, 14.7f, 18.81f, 15.0f, 19.24f, 15.0f);
        pathBuilder3.lineToRelative(0.0f, 0.0f);
        pathBuilder3.curveToRelative(0.43f, 0.0f, 0.81f, -0.3f, 0.92f, -0.72f);
        pathBuilder3.lineToRelative(1.09f, -4.38f);
        pathBuilder3.curveTo(21.37f, 9.44f, 21.02f, 9.0f, 20.55f, 9.0f);
        pathBuilder3.horizontalLineToRelative(0.0f);
        pathBuilder3.curveTo(20.21f, 9.0f, 19.92f, 9.23f, 19.84f, 9.55f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rawOn = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
