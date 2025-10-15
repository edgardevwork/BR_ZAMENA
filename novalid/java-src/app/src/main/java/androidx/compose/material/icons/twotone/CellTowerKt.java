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

/* compiled from: CellTower.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_cellTower", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CellTower", "Landroidx/compose/material/icons/Icons$TwoTone;", "getCellTower", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCellTower.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CellTower.kt\nandroidx/compose/material/icons/twotone/CellTowerKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,95:1\n212#2,12:96\n233#2,18:109\n253#2:146\n233#2,18:147\n253#2:184\n233#2,18:185\n253#2:222\n233#2,18:223\n253#2:260\n233#2,18:261\n253#2:298\n174#3:108\n705#4,2:127\n717#4,2:129\n719#4,11:135\n705#4,2:165\n717#4,2:167\n719#4,11:173\n705#4,2:203\n717#4,2:205\n719#4,11:211\n705#4,2:241\n717#4,2:243\n719#4,11:249\n705#4,2:279\n717#4,2:281\n719#4,11:287\n72#5,4:131\n72#5,4:169\n72#5,4:207\n72#5,4:245\n72#5,4:283\n*S KotlinDebug\n*F\n+ 1 CellTower.kt\nandroidx/compose/material/icons/twotone/CellTowerKt\n*L\n29#1:96,12\n30#1:109,18\n30#1:146\n40#1:147,18\n40#1:184\n50#1:185,18\n50#1:222\n60#1:223,18\n60#1:260\n70#1:261,18\n70#1:298\n29#1:108\n30#1:127,2\n30#1:129,2\n30#1:135,11\n40#1:165,2\n40#1:167,2\n40#1:173,11\n50#1:203,2\n50#1:205,2\n50#1:211,11\n60#1:241,2\n60#1:243,2\n60#1:249,11\n70#1:279,2\n70#1:281,2\n70#1:287,11\n30#1:131,4\n40#1:169,4\n50#1:207,4\n60#1:245,4\n70#1:283,4\n*E\n"})
/* loaded from: classes3.dex */
public final class CellTowerKt {

    @Nullable
    private static ImageVector _cellTower;

    @NotNull
    public static final ImageVector getCellTower(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _cellTower;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CellTower", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.3f, 14.7f);
        pathBuilder.lineToRelative(1.2f, -1.2f);
        pathBuilder.curveToRelative(-1.0f, -1.0f, -1.5f, -2.3f, -1.5f, -3.5f);
        pathBuilder.curveToRelative(0.0f, -1.3f, 0.5f, -2.6f, 1.5f, -3.5f);
        pathBuilder.lineTo(7.3f, 5.3f);
        pathBuilder.curveToRelative(-1.3f, 1.3f, -2.0f, 3.0f, -2.0f, 4.7f);
        pathBuilder.reflectiveCurveTo(6.0f, 13.4f, 7.3f, 14.7f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(19.1f, 2.9f);
        pathBuilder2.lineToRelative(-1.2f, 1.2f);
        pathBuilder2.curveToRelative(1.6f, 1.6f, 2.4f, 3.8f, 2.4f, 5.9f);
        pathBuilder2.curveToRelative(0.0f, 2.1f, -0.8f, 4.3f, -2.4f, 5.9f);
        pathBuilder2.lineToRelative(1.2f, 1.2f);
        pathBuilder2.curveToRelative(2.0f, -2.0f, 2.9f, -4.5f, 2.9f, -7.1f);
        pathBuilder2.curveTo(22.0f, 7.4f, 21.0f, 4.9f, 19.1f, 2.9f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(6.1f, 4.1f);
        pathBuilder3.lineTo(4.9f, 2.9f);
        pathBuilder3.curveTo(3.0f, 4.9f, 2.0f, 7.4f, 2.0f, 10.0f);
        pathBuilder3.curveToRelative(0.0f, 2.6f, 1.0f, 5.1f, 2.9f, 7.1f);
        pathBuilder3.lineToRelative(1.2f, -1.2f);
        pathBuilder3.curveToRelative(-1.6f, -1.6f, -2.4f, -3.8f, -2.4f, -5.9f);
        pathBuilder3.curveTo(3.7f, 7.9f, 4.5f, 5.7f, 6.1f, 4.1f);
        pathBuilder3.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(16.7f, 14.7f);
        pathBuilder4.curveToRelative(1.3f, -1.3f, 2.0f, -3.0f, 2.0f, -4.7f);
        pathBuilder4.curveToRelative(-0.1f, -1.7f, -0.7f, -3.4f, -2.0f, -4.7f);
        pathBuilder4.lineToRelative(-1.2f, 1.2f);
        pathBuilder4.curveToRelative(1.0f, 1.0f, 1.5f, 2.3f, 1.5f, 3.5f);
        pathBuilder4.curveToRelative(0.0f, 1.3f, -0.5f, 2.6f, -1.5f, 3.5f);
        pathBuilder4.lineTo(16.7f, 14.7f);
        pathBuilder4.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw5 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk85 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(14.5f, 10.0f);
        pathBuilder5.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        pathBuilder5.reflectiveCurveTo(9.5f, 8.62f, 9.5f, 10.0f);
        pathBuilder5.curveToRelative(0.0f, 0.76f, 0.34f, 1.42f, 0.87f, 1.88f);
        pathBuilder5.lineTo(7.0f, 22.0f);
        pathBuilder5.horizontalLineToRelative(2.0f);
        pathBuilder5.lineToRelative(0.67f, -2.0f);
        pathBuilder5.horizontalLineToRelative(4.67f);
        pathBuilder5.lineTo(15.0f, 22.0f);
        pathBuilder5.horizontalLineToRelative(2.0f);
        pathBuilder5.lineToRelative(-3.37f, -10.12f);
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
