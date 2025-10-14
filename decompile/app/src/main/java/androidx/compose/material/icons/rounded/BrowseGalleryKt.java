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

/* compiled from: BrowseGallery.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_browseGallery", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BrowseGallery", "Landroidx/compose/material/icons/Icons$Rounded;", "getBrowseGallery", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBrowseGallery.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrowseGallery.kt\nandroidx/compose/material/icons/rounded/BrowseGalleryKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,70:1\n212#2,12:71\n233#2,18:84\n253#2:121\n233#2,18:122\n253#2:159\n174#3:83\n705#4,2:102\n717#4,2:104\n719#4,11:110\n705#4,2:140\n717#4,2:142\n719#4,11:148\n72#5,4:106\n72#5,4:144\n*S KotlinDebug\n*F\n+ 1 BrowseGallery.kt\nandroidx/compose/material/icons/rounded/BrowseGalleryKt\n*L\n29#1:71,12\n30#1:84,18\n30#1:121\n51#1:122,18\n51#1:159\n29#1:83\n30#1:102,2\n30#1:104,2\n30#1:110,11\n51#1:140,2\n51#1:142,2\n51#1:148,11\n30#1:106,4\n51#1:144,4\n*E\n"})
/* loaded from: classes3.dex */
public final class BrowseGalleryKt {

    @Nullable
    private static ImageVector _browseGallery;

    @NotNull
    public static final ImageVector getBrowseGallery(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _browseGallery;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BrowseGallery", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM11692getButtKaPHkGw = companion2.m11692getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM11702getBevelLxFBmk8 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 3.0f);
        pathBuilder.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(4.03f, 9.0f, 9.0f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(9.0f, -4.03f, 9.0f, -9.0f);
        pathBuilder.reflectiveCurveTo(13.97f, 3.0f, 9.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.09f, 15.5f);
        pathBuilder.lineTo(8.59f, 13.0f);
        pathBuilder.curveTo(8.21f, 12.62f, 8.0f, 12.12f, 8.0f, 11.59f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(3.59f);
        pathBuilder.lineToRelative(2.5f, 2.5f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(12.11f, 15.89f, 11.48f, 15.89f, 11.09f, 15.5f);
        pathBuilder.close();
        ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw2 = companion2.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk82 = companion3.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(17.99f, 5.08f);
        pathBuilder2.lineTo(17.99f, 5.08f);
        pathBuilder2.curveToRelative(0.0f, 0.37f, 0.21f, 0.69f, 0.53f, 0.88f);
        pathBuilder2.curveTo(20.6f, 7.17f, 22.0f, 9.42f, 22.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, 2.58f, -1.4f, 4.83f, -3.48f, 6.04f);
        pathBuilder2.curveToRelative(-0.32f, 0.19f, -0.53f, 0.51f, -0.53f, 0.88f);
        pathBuilder2.verticalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.0f, 0.77f, 0.84f, 1.25f, 1.51f, 0.86f);
        pathBuilder2.curveTo(22.18f, 18.22f, 24.0f, 15.32f, 24.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, -3.32f, -1.82f, -6.22f, -4.5f, -7.78f);
        pathBuilder2.curveTo(18.83f, 3.83f, 17.99f, 4.31f, 17.99f, 5.08f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw2, iM11702getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _browseGallery = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
