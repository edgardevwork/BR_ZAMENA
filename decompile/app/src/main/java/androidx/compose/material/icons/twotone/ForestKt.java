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

/* compiled from: Forest.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_forest", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Forest", "Landroidx/compose/material/icons/Icons$TwoTone;", "getForest", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nForest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Forest.kt\nandroidx/compose/material/icons/twotone/ForestKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,96:1\n212#2,12:97\n233#2,18:110\n253#2:147\n233#2,18:148\n253#2:185\n233#2,18:186\n253#2:223\n174#3:109\n705#4,2:128\n717#4,2:130\n719#4,11:136\n705#4,2:166\n717#4,2:168\n719#4,11:174\n705#4,2:204\n717#4,2:206\n719#4,11:212\n72#5,4:132\n72#5,4:170\n72#5,4:208\n*S KotlinDebug\n*F\n+ 1 Forest.kt\nandroidx/compose/material/icons/twotone/ForestKt\n*L\n29#1:97,12\n30#1:110,18\n30#1:147\n41#1:148,18\n41#1:185\n51#1:186,18\n51#1:223\n29#1:109\n30#1:128,2\n30#1:130,2\n30#1:136,11\n41#1:166,2\n41#1:168,2\n41#1:174,11\n51#1:204,2\n51#1:206,2\n51#1:212,11\n30#1:132,4\n41#1:170,4\n51#1:208,4\n*E\n"})
/* loaded from: classes2.dex */
public final class ForestKt {

    @Nullable
    private static ImageVector _forest;

    @NotNull
    public static final ImageVector getForest(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _forest;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Forest", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.48f, 10.0f);
        pathBuilder.lineToRelative(1.68f, 0.0f);
        pathBuilder.lineToRelative(-3.16f, -4.51f);
        pathBuilder.lineToRelative(-1.78f, 2.54f);
        pathBuilder.lineToRelative(2.78f, 3.97f);
        pathBuilder.lineToRelative(-1.86f, 0.0f);
        pathBuilder.lineToRelative(2.57f, 4.0f);
        pathBuilder.lineToRelative(3.63f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.16f, 10.0f);
        pathBuilder2.lineToRelative(-3.16f, -4.51f);
        pathBuilder2.lineToRelative(-3.16f, 4.51f);
        pathBuilder2.lineToRelative(1.68f, 0.0f);
        pathBuilder2.lineToRelative(-3.86f, 6.0f);
        pathBuilder2.lineToRelative(10.68f, 0.0f);
        pathBuilder2.lineToRelative(-3.86f, -6.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(20.14f, 12.0f);
        pathBuilder3.horizontalLineTo(22.0f);
        pathBuilder3.lineTo(15.0f, 2.0f);
        pathBuilder3.lineToRelative(-3.0f, 4.29f);
        pathBuilder3.lineTo(9.0f, 2.0f);
        pathBuilder3.lineTo(2.0f, 12.0f);
        pathBuilder3.horizontalLineToRelative(1.86f);
        pathBuilder3.lineTo(0.0f, 18.0f);
        pathBuilder3.horizontalLineToRelative(7.0f);
        pathBuilder3.verticalLineToRelative(4.0f);
        pathBuilder3.horizontalLineToRelative(4.0f);
        pathBuilder3.verticalLineToRelative(-4.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder3.verticalLineToRelative(4.0f);
        pathBuilder3.horizontalLineToRelative(4.0f);
        pathBuilder3.verticalLineToRelative(-4.0f);
        pathBuilder3.horizontalLineToRelative(7.0f);
        pathBuilder3.lineTo(20.14f, 12.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(3.66f, 16.0f);
        pathBuilder3.lineToRelative(3.86f, -6.0f);
        pathBuilder3.horizontalLineTo(5.84f);
        pathBuilder3.lineTo(9.0f, 5.49f);
        pathBuilder3.lineTo(12.16f, 10.0f);
        pathBuilder3.horizontalLineToRelative(-1.68f);
        pathBuilder3.lineToRelative(3.86f, 6.0f);
        pathBuilder3.horizontalLineTo(3.66f);
        pathBuilder3.close();
        pathBuilder3.moveTo(16.71f, 16.0f);
        pathBuilder3.lineToRelative(-2.57f, -4.0f);
        pathBuilder3.horizontalLineTo(16.0f);
        pathBuilder3.lineToRelative(-2.78f, -3.97f);
        pathBuilder3.lineTo(15.0f, 5.49f);
        pathBuilder3.lineTo(18.16f, 10.0f);
        pathBuilder3.horizontalLineToRelative(-1.68f);
        pathBuilder3.lineToRelative(3.86f, 6.0f);
        pathBuilder3.horizontalLineTo(16.71f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _forest = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
