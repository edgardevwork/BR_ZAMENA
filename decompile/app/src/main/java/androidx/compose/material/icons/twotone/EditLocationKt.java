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

/* compiled from: EditLocation.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_editLocation", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EditLocation", "Landroidx/compose/material/icons/Icons$TwoTone;", "getEditLocation", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nEditLocation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditLocation.kt\nandroidx/compose/material/icons/twotone/EditLocationKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,98:1\n212#2,12:99\n233#2,18:112\n253#2:149\n233#2,18:150\n253#2:187\n233#2,18:188\n253#2:225\n174#3:111\n705#4,2:130\n717#4,2:132\n719#4,11:138\n705#4,2:168\n717#4,2:170\n719#4,11:176\n705#4,2:206\n717#4,2:208\n719#4,11:214\n72#5,4:134\n72#5,4:172\n72#5,4:210\n*S KotlinDebug\n*F\n+ 1 EditLocation.kt\nandroidx/compose/material/icons/twotone/EditLocationKt\n*L\n29#1:99,12\n30#1:112,18\n30#1:149\n48#1:150,18\n48#1:187\n85#1:188,18\n85#1:225\n29#1:111\n30#1:130,2\n30#1:132,2\n30#1:138,11\n48#1:168,2\n48#1:170,2\n48#1:176,11\n85#1:206,2\n85#1:208,2\n85#1:214,11\n30#1:134,4\n48#1:172,4\n85#1:210,4\n*E\n"})
/* loaded from: classes4.dex */
public final class EditLocationKt {

    @Nullable
    private static ImageVector _editLocation;

    @NotNull
    public static final ImageVector getEditLocation(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _editLocation;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.EditLocation", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.11f, 14.0f);
        pathBuilder.horizontalLineToRelative(-0.83f);
        pathBuilder.horizontalLineTo(10.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(8.74f);
        pathBuilder.verticalLineTo(7.91f);
        pathBuilder.lineToRelative(0.59f, -0.59f);
        pathBuilder.lineTo(11.91f, 4.0f);
        pathBuilder.curveTo(8.61f, 4.05f, 6.0f, 6.6f, 6.0f, 10.2f);
        pathBuilder.curveToRelative(0.0f, 2.34f, 1.95f, 5.44f, 6.0f, 9.14f);
        pathBuilder.curveToRelative(4.05f, -3.7f, 6.0f, -6.79f, 6.0f, -9.14f);
        pathBuilder.curveToRelative(0.0f, -0.03f, 0.0f, -0.06f, 0.0f, -0.08f);
        pathBuilder.lineToRelative(-3.3f, 3.3f);
        pathBuilder.lineTo(14.11f, 14.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(18.17f, 4.91f);
        pathBuilder2.lineTo(17.1f, 3.84f);
        pathBuilder2.lineToRelative(-5.55f, 5.55f);
        pathBuilder2.verticalLineToRelative(1.08f);
        pathBuilder2.horizontalLineToRelative(1.08f);
        pathBuilder2.lineTo(18.17f, 4.91f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.0f, 2.74f);
        pathBuilder2.lineToRelative(1.29f, -1.29f);
        pathBuilder2.curveToRelative(0.58f, -0.59f, 1.52f, -0.59f, 2.11f, -0.01f);
        pathBuilder2.curveToRelative(0.0f, 0.0f, 0.01f, 0.01f, 0.01f, 0.01f);
        pathBuilder2.lineToRelative(1.15f, 1.15f);
        pathBuilder2.curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0.0f, 2.12f);
        pathBuilder2.lineTo(19.88f, 5.4f);
        pathBuilder2.lineToRelative(-0.02f, 0.02f);
        pathBuilder2.lineTo(19.28f, 6.0f);
        pathBuilder2.lineToRelative(-6.0f, 6.0f);
        pathBuilder2.horizontalLineTo(10.0f);
        pathBuilder2.verticalLineTo(8.74f);
        pathBuilder2.lineTo(16.0f, 2.74f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.72f, 2.19f);
        pathBuilder2.lineToRelative(-0.55f, 0.55f);
        pathBuilder2.lineTo(11.9f, 4.01f);
        pathBuilder2.curveTo(8.6f, 4.06f, 6.0f, 6.61f, 6.0f, 10.21f);
        pathBuilder2.curveToRelative(0.0f, 2.34f, 1.95f, 5.44f, 6.0f, 9.14f);
        pathBuilder2.curveToRelative(4.05f, -3.7f, 6.0f, -6.79f, 6.0f, -9.14f);
        pathBuilder2.verticalLineToRelative(-0.1f);
        pathBuilder2.lineToRelative(1.8f, -1.8f);
        pathBuilder2.curveToRelative(0.13f, 0.6f, 0.2f, 1.24f, 0.2f, 1.9f);
        pathBuilder2.curveToRelative(0.0f, 3.32f, -2.67f, 7.25f, -8.0f, 11.8f);
        pathBuilder2.curveToRelative(-5.33f, -4.55f, -8.0f, -8.48f, -8.0f, -11.8f);
        pathBuilder2.curveToRelative(0.0f, -4.98f, 3.8f, -8.2f, 8.0f, -8.2f);
        pathBuilder2.curveTo(12.58f, 2.01f, 13.16f, 2.07f, 13.72f, 2.19f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(18.17f, 4.91f);
        pathBuilder3.lineToRelative(-1.07f, -1.07f);
        pathBuilder3.lineToRelative(-5.55f, 5.55f);
        pathBuilder3.lineToRelative(0.0f, 1.08f);
        pathBuilder3.lineToRelative(1.08f, 0.0f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editLocation = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
