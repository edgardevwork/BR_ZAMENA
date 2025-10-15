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

/* compiled from: Train.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_train", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Train", "Landroidx/compose/material/icons/Icons$TwoTone;", "getTrain", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTrain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Train.kt\nandroidx/compose/material/icons/twotone/TrainKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,118:1\n212#2,12:119\n233#2,18:132\n253#2:169\n233#2,18:170\n253#2:207\n233#2,18:208\n253#2:245\n233#2,18:246\n253#2:283\n174#3:131\n705#4,2:150\n717#4,2:152\n719#4,11:158\n705#4,2:188\n717#4,2:190\n719#4,11:196\n705#4,2:226\n717#4,2:228\n719#4,11:234\n705#4,2:264\n717#4,2:266\n719#4,11:272\n72#5,4:154\n72#5,4:192\n72#5,4:230\n72#5,4:268\n*S KotlinDebug\n*F\n+ 1 Train.kt\nandroidx/compose/material/icons/twotone/TrainKt\n*L\n29#1:119,12\n30#1:132,18\n30#1:169\n57#1:170,18\n57#1:207\n63#1:208,18\n63#1:245\n69#1:246,18\n69#1:283\n29#1:131\n30#1:150,2\n30#1:152,2\n30#1:158,11\n57#1:188,2\n57#1:190,2\n57#1:196,11\n63#1:226,2\n63#1:228,2\n63#1:234,11\n69#1:264,2\n69#1:266,2\n69#1:272,11\n30#1:154,4\n57#1:192,4\n63#1:230,4\n69#1:268,4\n*E\n"})
/* loaded from: classes2.dex */
public final class TrainKt {

    @Nullable
    private static ImageVector _train;

    @NotNull
    public static final ImageVector getTrain(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _train;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Train", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.curveToRelative(-3.51f, 0.0f, -4.96f, 0.48f, -5.57f, 1.0f);
        pathBuilder.horizontalLineToRelative(11.13f);
        pathBuilder.curveToRelative(-0.6f, -0.52f, -2.05f, -1.0f, -5.56f, -1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 15.5f);
        pathBuilder.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.lineTo(18.0f, 12.0f);
        pathBuilder.lineTo(6.0f, 12.0f);
        pathBuilder.verticalLineToRelative(3.5f);
        pathBuilder.close();
        pathBuilder.moveTo(15.5f, 13.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.close();
        pathBuilder.moveTo(8.5f, 13.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(9.33f, 16.0f, 8.5f, 16.0f);
        pathBuilder.reflectiveCurveTo(7.0f, 15.33f, 7.0f, 14.5f);
        pathBuilder.reflectiveCurveTo(7.67f, 13.0f, 8.5f, 13.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(8.5f, 14.5f);
        pathBuilder2.moveToRelative(-1.5f, 0.0f);
        pathBuilder2.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        pathBuilder2.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(15.5f, 14.5f);
        pathBuilder3.moveToRelative(-1.5f, 0.0f);
        pathBuilder3.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        pathBuilder3.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(12.0f, 2.0f);
        pathBuilder4.curveToRelative(-4.0f, 0.0f, -8.0f, 0.5f, -8.0f, 4.0f);
        pathBuilder4.verticalLineToRelative(9.5f);
        pathBuilder4.curveTo(4.0f, 17.43f, 5.57f, 19.0f, 7.5f, 19.0f);
        pathBuilder4.lineTo(6.0f, 20.5f);
        pathBuilder4.verticalLineToRelative(0.5f);
        pathBuilder4.horizontalLineToRelative(2.0f);
        pathBuilder4.lineToRelative(2.0f, -2.0f);
        pathBuilder4.horizontalLineToRelative(4.0f);
        pathBuilder4.lineToRelative(2.0f, 2.0f);
        pathBuilder4.horizontalLineToRelative(2.0f);
        pathBuilder4.verticalLineToRelative(-0.5f);
        pathBuilder4.lineTo(16.5f, 19.0f);
        pathBuilder4.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder4.lineTo(20.0f, 6.0f);
        pathBuilder4.curveToRelative(0.0f, -3.5f, -4.0f, -4.0f, -8.0f, -4.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(12.0f, 4.0f);
        pathBuilder4.curveToRelative(3.51f, 0.0f, 4.96f, 0.48f, 5.57f, 1.0f);
        pathBuilder4.lineTo(6.43f, 5.0f);
        pathBuilder4.curveToRelative(0.61f, -0.52f, 2.06f, -1.0f, 5.57f, -1.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(6.0f, 7.0f);
        pathBuilder4.horizontalLineToRelative(5.0f);
        pathBuilder4.verticalLineToRelative(3.0f);
        pathBuilder4.lineTo(6.0f, 10.0f);
        pathBuilder4.lineTo(6.0f, 7.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(18.0f, 15.5f);
        pathBuilder4.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder4.horizontalLineToRelative(-9.0f);
        pathBuilder4.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder4.lineTo(6.0f, 12.0f);
        pathBuilder4.horizontalLineToRelative(12.0f);
        pathBuilder4.verticalLineToRelative(3.5f);
        pathBuilder4.close();
        pathBuilder4.moveTo(18.0f, 10.0f);
        pathBuilder4.horizontalLineToRelative(-5.0f);
        pathBuilder4.lineTo(13.0f, 7.0f);
        pathBuilder4.horizontalLineToRelative(5.0f);
        pathBuilder4.verticalLineToRelative(3.0f);
        pathBuilder4.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _train = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
