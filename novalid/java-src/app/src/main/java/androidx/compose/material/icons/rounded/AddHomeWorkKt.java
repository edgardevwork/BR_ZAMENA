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

/* compiled from: AddHomeWork.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_addHomeWork", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AddHomeWork", "Landroidx/compose/material/icons/Icons$Rounded;", "getAddHomeWork", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAddHomeWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddHomeWork.kt\nandroidx/compose/material/icons/rounded/AddHomeWorkKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,95:1\n212#2,12:96\n233#2,18:109\n253#2:146\n233#2,18:147\n253#2:184\n233#2,18:185\n253#2:222\n174#3:108\n705#4,2:127\n717#4,2:129\n719#4,11:135\n705#4,2:165\n717#4,2:167\n719#4,11:173\n705#4,2:203\n717#4,2:205\n719#4,11:211\n72#5,4:131\n72#5,4:169\n72#5,4:207\n*S KotlinDebug\n*F\n+ 1 AddHomeWork.kt\nandroidx/compose/material/icons/rounded/AddHomeWorkKt\n*L\n29#1:96,12\n30#1:109,18\n30#1:146\n48#1:147,18\n48#1:184\n68#1:185,18\n68#1:222\n29#1:108\n30#1:127,2\n30#1:129,2\n30#1:135,11\n48#1:165,2\n48#1:167,2\n48#1:173,11\n68#1:203,2\n68#1:205,2\n68#1:211,11\n30#1:131,4\n48#1:169,4\n68#1:207,4\n*E\n"})
/* loaded from: classes.dex */
public final class AddHomeWorkKt {

    @Nullable
    private static ImageVector _addHomeWork;

    @NotNull
    public static final ImageVector getAddHomeWork(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _addHomeWork;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AddHomeWork", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.96f, 11.7f);
        pathBuilder.curveToRelative(-0.09f, -0.52f, -0.36f, -0.99f, -0.8f, -1.3f);
        pathBuilder.lineToRelative(-5.0f, -3.57f);
        pathBuilder.curveToRelative(-0.7f, -0.5f, -1.63f, -0.5f, -2.32f, 0.0f);
        pathBuilder.lineToRelative(-5.0f, 3.57f);
        pathBuilder.curveTo(1.31f, 10.78f, 1.0f, 11.38f, 1.0f, 12.03f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(1.68f);
        pathBuilder.curveTo(11.25f, 20.09f, 11.0f, 19.08f, 11.0f, 18.0f);
        pathBuilder.curveTo(11.0f, 15.22f, 12.62f, 12.83f, 14.96f, 11.7f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(23.0f, 13.11f);
        pathBuilder2.verticalLineTo(4.97f);
        pathBuilder2.curveTo(23.0f, 3.88f, 22.12f, 3.0f, 21.03f, 3.0f);
        pathBuilder2.horizontalLineToRelative(-9.06f);
        pathBuilder2.curveTo(10.88f, 3.0f, 10.0f, 3.88f, 10.0f, 4.97f);
        pathBuilder2.lineToRelative(0.02f, 0.05f);
        pathBuilder2.curveToRelative(0.1f, 0.06f, 0.21f, 0.11f, 0.3f, 0.18f);
        pathBuilder2.lineToRelative(5.0f, 3.57f);
        pathBuilder2.curveToRelative(0.79f, 0.56f, 1.34f, 1.4f, 1.56f, 2.32f);
        pathBuilder2.curveTo(17.25f, 11.04f, 17.62f, 11.0f, 18.0f, 11.0f);
        pathBuilder2.curveTo(19.96f, 11.0f, 21.73f, 11.81f, 23.0f, 13.11f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.0f, 7.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.verticalLineTo(7.0f);
        pathBuilder2.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw3 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk83 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(23.0f, 18.0f);
        pathBuilder3.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        pathBuilder3.reflectiveCurveToRelative(-5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilder3.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder3.reflectiveCurveTo(23.0f, 20.76f, 23.0f, 18.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(17.5f, 21.0f);
        pathBuilder3.verticalLineToRelative(-2.5f);
        pathBuilder3.horizontalLineTo(15.0f);
        pathBuilder3.verticalLineToRelative(-1.0f);
        pathBuilder3.horizontalLineToRelative(2.5f);
        pathBuilder3.verticalLineTo(15.0f);
        pathBuilder3.horizontalLineToRelative(1.0f);
        pathBuilder3.verticalLineToRelative(2.5f);
        pathBuilder3.horizontalLineTo(21.0f);
        pathBuilder3.verticalLineToRelative(1.0f);
        pathBuilder3.horizontalLineToRelative(-2.5f);
        pathBuilder3.verticalLineTo(21.0f);
        pathBuilder3.horizontalLineTo(17.5f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw3, iM11702getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addHomeWork = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
