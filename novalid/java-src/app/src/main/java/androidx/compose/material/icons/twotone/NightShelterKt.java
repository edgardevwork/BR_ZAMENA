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

/* compiled from: NightShelter.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_nightShelter", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NightShelter", "Landroidx/compose/material/icons/Icons$TwoTone;", "getNightShelter", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nNightShelter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NightShelter.kt\nandroidx/compose/material/icons/twotone/NightShelterKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,101:1\n212#2,12:102\n233#2,18:115\n253#2:152\n233#2,18:153\n253#2:190\n174#3:114\n705#4,2:133\n717#4,2:135\n719#4,11:141\n705#4,2:171\n717#4,2:173\n719#4,11:179\n72#5,4:137\n72#5,4:175\n*S KotlinDebug\n*F\n+ 1 NightShelter.kt\nandroidx/compose/material/icons/twotone/NightShelterKt\n*L\n29#1:102,12\n30#1:115,18\n30#1:152\n59#1:153,18\n59#1:190\n29#1:114\n30#1:133,2\n30#1:135,2\n30#1:141,11\n59#1:171,2\n59#1:173,2\n59#1:179,11\n30#1:137,4\n59#1:175,4\n*E\n"})
/* loaded from: classes3.dex */
public final class NightShelterKt {

    @Nullable
    private static ImageVector _nightShelter;

    @NotNull
    public static final ImageVector getNightShelter(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _nightShelter;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.NightShelter", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 5.5f);
        pathBuilder.lineToRelative(6.0f, 4.5f);
        pathBuilder.verticalLineToRelative(9.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineToRelative(-9.0f);
        pathBuilder.lineTo(12.0f, 5.5f);
        pathBuilder.moveTo(15.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(-3.5f);
        pathBuilder.verticalLineToRelative(3.5f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineToRelative(-1.5f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.curveTo(17.0f, 12.9f, 16.1f, 12.0f, 15.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.75f, 12.5f);
        pathBuilder.curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f);
        pathBuilder.curveTo(8.5f, 14.44f, 9.06f, 15.0f, 9.75f, 15.0f);
        pathBuilder.reflectiveCurveTo(11.0f, 14.44f, 11.0f, 13.75f);
        pathBuilder.curveTo(11.0f, 13.06f, 10.44f, 12.5f, 9.75f, 12.5f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 5.5f);
        pathBuilder2.lineToRelative(6.0f, 4.5f);
        pathBuilder2.verticalLineToRelative(9.0f);
        pathBuilder2.horizontalLineTo(6.0f);
        pathBuilder2.verticalLineToRelative(-9.0f);
        pathBuilder2.lineTo(12.0f, 5.5f);
        pathBuilder2.moveTo(12.0f, 3.0f);
        pathBuilder2.lineTo(4.0f, 9.0f);
        pathBuilder2.verticalLineToRelative(12.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.verticalLineTo(9.0f);
        pathBuilder2.lineTo(12.0f, 3.0f);
        pathBuilder2.lineTo(12.0f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.0f, 12.0f);
        pathBuilder2.horizontalLineToRelative(-3.5f);
        pathBuilder2.verticalLineToRelative(3.5f);
        pathBuilder2.horizontalLineTo(8.0f);
        pathBuilder2.verticalLineTo(11.0f);
        pathBuilder2.horizontalLineTo(7.0f);
        pathBuilder2.verticalLineToRelative(7.0f);
        pathBuilder2.horizontalLineToRelative(1.0f);
        pathBuilder2.verticalLineToRelative(-1.5f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.verticalLineTo(18.0f);
        pathBuilder2.horizontalLineToRelative(1.0f);
        pathBuilder2.verticalLineToRelative(-4.0f);
        pathBuilder2.curveTo(17.0f, 12.9f, 16.1f, 12.0f, 15.0f, 12.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(9.75f, 12.5f);
        pathBuilder2.curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f);
        pathBuilder2.curveTo(8.5f, 14.44f, 9.06f, 15.0f, 9.75f, 15.0f);
        pathBuilder2.reflectiveCurveTo(11.0f, 14.44f, 11.0f, 13.75f);
        pathBuilder2.curveTo(11.0f, 13.06f, 10.44f, 12.5f, 9.75f, 12.5f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nightShelter = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
