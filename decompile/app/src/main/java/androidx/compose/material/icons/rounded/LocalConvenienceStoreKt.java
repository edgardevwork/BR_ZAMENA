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

/* compiled from: LocalConvenienceStore.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_localConvenienceStore", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LocalConvenienceStore", "Landroidx/compose/material/icons/Icons$Rounded;", "getLocalConvenienceStore", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLocalConvenienceStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalConvenienceStore.kt\nandroidx/compose/material/icons/rounded/LocalConvenienceStoreKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,120:1\n212#2,12:121\n233#2,18:134\n253#2:171\n174#3:133\n705#4,2:152\n717#4,2:154\n719#4,11:160\n72#5,4:156\n*S KotlinDebug\n*F\n+ 1 LocalConvenienceStore.kt\nandroidx/compose/material/icons/rounded/LocalConvenienceStoreKt\n*L\n29#1:121,12\n30#1:134,18\n30#1:171\n29#1:133\n30#1:152,2\n30#1:154,2\n30#1:160,11\n30#1:156,4\n*E\n"})
/* loaded from: classes3.dex */
public final class LocalConvenienceStoreKt {

    @Nullable
    private static ImageVector _localConvenienceStore;

    @NotNull
    public static final ImageVector getLocalConvenienceStore(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _localConvenienceStore;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LocalConvenienceStore", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.9f, 7.89f);
        pathBuilder.lineToRelative(-1.05f, -3.37f);
        pathBuilder.curveToRelative(-0.22f, -0.9f, -1.0f, -1.52f, -1.91f, -1.52f);
        pathBuilder.horizontalLineTo(5.05f);
        pathBuilder.curveToRelative(-0.9f, 0.0f, -1.69f, 0.63f, -1.9f, 1.52f);
        pathBuilder.lineTo(2.1f, 7.89f);
        pathBuilder.curveTo(1.64f, 9.86f, 2.95f, 11.0f, 3.0f, 11.06f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-7.94f);
        pathBuilder.curveTo(22.12f, 9.94f, 22.09f, 8.65f, 21.9f, 7.89f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(1.96f);
        pathBuilder.lineToRelative(0.54f, 3.52f);
        pathBuilder.curveTo(15.59f, 9.23f, 15.11f, 10.0f, 14.22f, 10.0f);
        pathBuilder.curveTo(13.55f, 10.0f, 13.0f, 9.41f, 13.0f, 8.69f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.44f, 8.86f);
        pathBuilder.curveTo(6.36f, 9.51f, 5.84f, 10.0f, 5.23f, 10.0f);
        pathBuilder.curveTo(4.3f, 10.0f, 3.88f, 9.03f, 4.04f, 8.36f);
        pathBuilder.lineTo(5.05f, 5.0f);
        pathBuilder.horizontalLineToRelative(1.97f);
        pathBuilder.lineTo(6.44f, 8.86f);
        pathBuilder.close();
        pathBuilder.moveTo(10.5f, 16.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveTo(8.22f, 18.0f, 8.0f, 17.78f, 8.0f, 17.5f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveTo(8.0f, 15.22f, 8.22f, 15.0f, 8.5f, 15.0f);
        pathBuilder.horizontalLineTo(10.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineTo(8.5f);
        pathBuilder.curveTo(8.22f, 14.0f, 8.0f, 13.78f, 8.0f, 13.5f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveTo(8.0f, 13.22f, 8.22f, 13.0f, 8.5f, 13.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveTo(11.0f, 15.78f, 10.78f, 16.0f, 10.5f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 8.69f);
        pathBuilder.curveTo(11.0f, 9.41f, 10.45f, 10.0f, 9.71f, 10.0f);
        pathBuilder.curveToRelative(-0.75f, 0.0f, -1.3f, -0.7f, -1.22f, -1.48f);
        pathBuilder.lineTo(9.04f, 5.0f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.verticalLineTo(8.69f);
        pathBuilder.close();
        pathBuilder.moveTo(15.5f, 18.0f);
        pathBuilder.lineTo(15.5f, 18.0f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.verticalLineTo(16.0f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.verticalLineTo(15.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineToRelative(-1.5f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.curveTo(16.0f, 17.78f, 15.78f, 18.0f, 15.5f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.77f, 10.0f);
        pathBuilder.curveToRelative(-0.61f, 0.0f, -1.14f, -0.49f, -1.21f, -1.14f);
        pathBuilder.lineTo(16.98f, 5.0f);
        pathBuilder.lineToRelative(1.93f, -0.01f);
        pathBuilder.lineToRelative(1.05f, 3.37f);
        pathBuilder.curveTo(20.12f, 9.03f, 19.71f, 10.0f, 18.77f, 10.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localConvenienceStore = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
