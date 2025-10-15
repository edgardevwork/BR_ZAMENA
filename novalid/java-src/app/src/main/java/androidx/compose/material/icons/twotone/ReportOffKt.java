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

/* compiled from: ReportOff.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_reportOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ReportOff", "Landroidx/compose/material/icons/Icons$TwoTone;", "getReportOff", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nReportOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportOff.kt\nandroidx/compose/material/icons/twotone/ReportOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,110:1\n212#2,12:111\n233#2,18:124\n253#2:161\n233#2,18:162\n253#2:199\n233#2,18:200\n253#2:237\n233#2,18:238\n253#2:275\n174#3:123\n705#4,2:142\n717#4,2:144\n719#4,11:150\n705#4,2:180\n717#4,2:182\n719#4,11:188\n705#4,2:218\n717#4,2:220\n719#4,11:226\n705#4,2:256\n717#4,2:258\n719#4,11:264\n72#5,4:146\n72#5,4:184\n72#5,4:222\n72#5,4:260\n*S KotlinDebug\n*F\n+ 1 ReportOff.kt\nandroidx/compose/material/icons/twotone/ReportOffKt\n*L\n29#1:111,12\n30#1:124,18\n30#1:161\n57#1:162,18\n57#1:199\n72#1:200,18\n72#1:237\n78#1:238,18\n78#1:275\n29#1:123\n30#1:142,2\n30#1:144,2\n30#1:150,11\n57#1:180,2\n57#1:182,2\n57#1:188,11\n72#1:218,2\n72#1:220,2\n72#1:226,11\n78#1:256,2\n78#1:258,2\n78#1:264,11\n30#1:146,4\n57#1:184,4\n72#1:222,4\n78#1:260,4\n*E\n"})
/* loaded from: classes4.dex */
public final class ReportOffKt {

    @Nullable
    private static ImageVector _reportOff;

    @NotNull
    public static final ImageVector getReportOff(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _reportOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ReportOff", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 9.1f);
        pathBuilder.lineTo(14.9f, 5.0f);
        pathBuilder.horizontalLineTo(9.1f);
        pathBuilder.lineToRelative(-0.22f, 0.22f);
        pathBuilder.lineTo(11.0f, 7.33f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.33f);
        pathBuilder.lineToRelative(5.78f, 5.79f);
        pathBuilder.lineToRelative(0.22f, -0.22f);
        pathBuilder.close();
        pathBuilder.moveTo(6.05f, 8.04f);
        pathBuilder.lineTo(5.0f, 9.1f);
        pathBuilder.verticalLineToRelative(5.8f);
        pathBuilder.lineTo(9.1f, 19.0f);
        pathBuilder.horizontalLineToRelative(5.8f);
        pathBuilder.lineToRelative(1.05f, -1.05f);
        pathBuilder.lineToRelative(-9.9f, -9.91f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 16.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(9.1f, 5.0f);
        pathBuilder2.horizontalLineToRelative(5.8f);
        pathBuilder2.lineTo(19.0f, 9.1f);
        pathBuilder2.verticalLineToRelative(5.8f);
        pathBuilder2.lineToRelative(-0.22f, 0.22f);
        pathBuilder2.lineToRelative(1.42f, 1.41f);
        pathBuilder2.lineToRelative(0.8f, -0.8f);
        pathBuilder2.verticalLineTo(8.27f);
        pathBuilder2.lineTo(15.73f, 3.0f);
        pathBuilder2.horizontalLineTo(8.27f);
        pathBuilder2.lineToRelative(-0.8f, 0.8f);
        pathBuilder2.lineToRelative(1.41f, 1.42f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(12.0f, 16.0f);
        pathBuilder3.moveToRelative(-1.0f, 0.0f);
        pathBuilder3.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilder3.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw4 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk84 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(13.0f, 7.0f);
        pathBuilder4.horizontalLineToRelative(-2.0f);
        pathBuilder4.verticalLineToRelative(0.33f);
        pathBuilder4.lineToRelative(2.0f, 2.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(2.41f, 1.58f);
        pathBuilder4.lineTo(1.0f, 2.99f);
        pathBuilder4.lineToRelative(3.64f, 3.64f);
        pathBuilder4.lineTo(3.0f, 8.27f);
        pathBuilder4.verticalLineToRelative(7.46f);
        pathBuilder4.lineTo(8.27f, 21.0f);
        pathBuilder4.horizontalLineToRelative(7.46f);
        pathBuilder4.lineToRelative(1.64f, -1.64f);
        pathBuilder4.lineTo(21.01f, 23.0f);
        pathBuilder4.lineToRelative(1.41f, -1.41f);
        pathBuilder4.lineTo(2.41f, 1.58f);
        pathBuilder4.close();
        pathBuilder4.moveTo(14.9f, 19.0f);
        pathBuilder4.horizontalLineTo(9.1f);
        pathBuilder4.lineTo(5.0f, 14.9f);
        pathBuilder4.verticalLineTo(9.1f);
        pathBuilder4.lineToRelative(1.05f, -1.05f);
        pathBuilder4.lineToRelative(9.9f, 9.9f);
        pathBuilder4.lineTo(14.9f, 19.0f);
        pathBuilder4.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw4, iM11702getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _reportOff = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
