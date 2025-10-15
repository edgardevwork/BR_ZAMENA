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

/* compiled from: CellTower.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_cellTower", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CellTower", "Landroidx/compose/material/icons/Icons$Rounded;", "getCellTower", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCellTower.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CellTower.kt\nandroidx/compose/material/icons/rounded/CellTowerKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,115:1\n212#2,12:116\n233#2,18:129\n253#2:166\n233#2,18:167\n253#2:204\n233#2,18:205\n253#2:242\n233#2,18:243\n253#2:280\n233#2,18:281\n253#2:318\n174#3:128\n705#4,2:147\n717#4,2:149\n719#4,11:155\n705#4,2:185\n717#4,2:187\n719#4,11:193\n705#4,2:223\n717#4,2:225\n719#4,11:231\n705#4,2:261\n717#4,2:263\n719#4,11:269\n705#4,2:299\n717#4,2:301\n719#4,11:307\n72#5,4:151\n72#5,4:189\n72#5,4:227\n72#5,4:265\n72#5,4:303\n*S KotlinDebug\n*F\n+ 1 CellTower.kt\nandroidx/compose/material/icons/rounded/CellTowerKt\n*L\n29#1:116,12\n30#1:129,18\n30#1:166\n44#1:167,18\n44#1:204\n58#1:205,18\n58#1:242\n72#1:243,18\n72#1:280\n86#1:281,18\n86#1:318\n29#1:128\n30#1:147,2\n30#1:149,2\n30#1:155,11\n44#1:185,2\n44#1:187,2\n44#1:193,11\n58#1:223,2\n58#1:225,2\n58#1:231,11\n72#1:261,2\n72#1:263,2\n72#1:269,11\n86#1:299,2\n86#1:301,2\n86#1:307,11\n30#1:151,4\n44#1:189,4\n58#1:227,4\n72#1:265,4\n86#1:303,4\n*E\n"})
/* loaded from: classes3.dex */
public final class CellTowerKt {

    @Nullable
    private static ImageVector _cellTower;

    @NotNull
    public static final ImageVector getCellTower(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _cellTower;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CellTower", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.9f, 14.1f);
        pathBuilder.lineToRelative(0.09f, -0.09f);
        pathBuilder.curveToRelative(0.27f, -0.27f, 0.32f, -0.71f, 0.08f, -1.01f);
        pathBuilder.curveTo(7.36f, 12.09f, 7.0f, 11.01f, 7.0f, 10.0f);
        pathBuilder.curveToRelative(0.0f, -1.08f, 0.35f, -2.16f, 1.04f, -3.01f);
        pathBuilder.curveToRelative(0.25f, -0.3f, 0.21f, -0.75f, -0.07f, -1.02f);
        pathBuilder.lineTo(7.9f, 5.9f);
        pathBuilder.curveTo(7.56f, 5.56f, 7.0f, 5.6f, 6.7f, 5.98f);
        pathBuilder.curveTo(5.79f, 7.16f, 5.3f, 8.58f, 5.3f, 10.0f);
        pathBuilder.curveToRelative(0.0f, 1.42f, 0.49f, 2.84f, 1.4f, 4.02f);
        pathBuilder.curveTo(7.0f, 14.4f, 7.56f, 14.44f, 7.9f, 14.1f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(18.51f, 3.49f);
        pathBuilder2.lineToRelative(-0.08f, 0.08f);
        pathBuilder2.curveToRelative(-0.3f, 0.3f, -0.29f, 0.76f, -0.03f, 1.08f);
        pathBuilder2.curveToRelative(1.26f, 1.53f, 1.9f, 3.48f, 1.9f, 5.35f);
        pathBuilder2.curveToRelative(0.0f, 1.87f, -0.63f, 3.81f, -1.9f, 5.35f);
        pathBuilder2.curveToRelative(-0.28f, 0.33f, -0.23f, 0.83f, 0.08f, 1.14f);
        pathBuilder2.verticalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.35f, 0.35f, 0.93f, 0.31f, 1.24f, -0.07f);
        pathBuilder2.curveTo(21.29f, 14.54f, 22.0f, 12.31f, 22.0f, 10.0f);
        pathBuilder2.curveToRelative(0.0f, -2.32f, -0.79f, -4.55f, -2.31f, -6.43f);
        pathBuilder2.curveTo(19.39f, 3.2f, 18.84f, 3.16f, 18.51f, 3.49f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(5.57f, 3.57f);
        pathBuilder3.lineTo(5.49f, 3.49f);
        pathBuilder3.curveTo(5.16f, 3.16f, 4.61f, 3.2f, 4.31f, 3.57f);
        pathBuilder3.curveTo(2.79f, 5.45f, 2.0f, 7.68f, 2.0f, 10.0f);
        pathBuilder3.curveToRelative(0.0f, 2.32f, 0.79f, 4.55f, 2.31f, 6.43f);
        pathBuilder3.curveToRelative(0.3f, 0.37f, 0.85f, 0.42f, 1.18f, 0.08f);
        pathBuilder3.lineToRelative(0.08f, -0.08f);
        pathBuilder3.curveToRelative(0.3f, -0.3f, 0.29f, -0.76f, 0.03f, -1.08f);
        pathBuilder3.curveTo(4.33f, 13.81f, 3.7f, 11.87f, 3.7f, 10.0f);
        pathBuilder3.curveToRelative(0.0f, -1.87f, 0.63f, -3.81f, 1.9f, -5.35f);
        pathBuilder3.curveTo(5.86f, 4.33f, 5.87f, 3.87f, 5.57f, 3.57f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(16.07f, 14.07f);
        pathBuilder4.curveToRelative(0.36f, 0.36f, 0.95f, 0.32f, 1.26f, -0.09f);
        pathBuilder4.curveToRelative(0.9f, -1.18f, 1.37f, -2.58f, 1.37f, -3.98f);
        pathBuilder4.curveToRelative(-0.08f, -1.41f, -0.51f, -2.83f, -1.4f, -4.01f);
        pathBuilder4.curveToRelative(-0.29f, -0.39f, -0.86f, -0.43f, -1.2f, -0.09f);
        pathBuilder4.lineToRelative(-0.08f, 0.08f);
        pathBuilder4.curveToRelative(-0.27f, 0.27f, -0.32f, 0.71f, -0.08f, 1.01f);
        pathBuilder4.curveTo(16.64f, 7.91f, 17.0f, 8.99f, 17.0f, 10.0f);
        pathBuilder4.curveToRelative(0.0f, 1.07f, -0.34f, 2.13f, -1.01f, 2.98f);
        pathBuilder4.curveTo(15.73f, 13.3f, 15.77f, 13.77f, 16.07f, 14.07f);
        pathBuilder4.lineTo(16.07f, 14.07f);
        pathBuilder4.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(14.5f, 10.0f);
        pathBuilder5.curveToRelative(0.0f, -1.6f, -1.51f, -2.85f, -3.18f, -2.41f);
        pathBuilder5.curveToRelative(-0.8f, 0.21f, -1.46f, 0.85f, -1.7f, 1.65f);
        pathBuilder5.curveToRelative(-0.32f, 1.06f, 0.06f, 2.04f, 0.76f, 2.64f);
        pathBuilder5.lineToRelative(-2.96f, 8.87f);
        pathBuilder5.curveTo(7.21f, 21.37f, 7.67f, 22.0f, 8.32f, 22.0f);
        pathBuilder5.horizontalLineToRelative(0.0f);
        pathBuilder5.curveToRelative(0.41f, 0.0f, 0.77f, -0.26f, 0.9f, -0.65f);
        pathBuilder5.lineTo(9.67f, 20.0f);
        pathBuilder5.horizontalLineToRelative(4.67f);
        pathBuilder5.lineToRelative(0.45f, 1.35f);
        pathBuilder5.curveToRelative(0.13f, 0.39f, 0.49f, 0.65f, 0.9f, 0.65f);
        pathBuilder5.horizontalLineToRelative(0.0f);
        pathBuilder5.curveToRelative(0.65f, 0.0f, 1.1f, -0.63f, 0.9f, -1.25f);
        pathBuilder5.lineToRelative(-2.96f, -8.87f);
        pathBuilder5.curveTo(14.16f, 11.42f, 14.5f, 10.76f, 14.5f, 10.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(10.33f, 18.0f);
        pathBuilder5.lineTo(12.0f, 13.0f);
        pathBuilder5.lineToRelative(1.67f, 5.0f);
        pathBuilder5.horizontalLineTo(10.33f);
        pathBuilder5.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw5, iM11702getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cellTower = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
