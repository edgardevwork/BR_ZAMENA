package androidx.compose.material.icons.outlined;

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

/* compiled from: NewReleases.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_newReleases", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NewReleases", "Landroidx/compose/material/icons/Icons$Outlined;", "getNewReleases", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nNewReleases.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewReleases.kt\nandroidx/compose/material/icons/outlined/NewReleasesKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,91:1\n212#2,12:92\n233#2,18:105\n253#2:142\n174#3:104\n705#4,2:123\n717#4,2:125\n719#4,11:131\n72#5,4:127\n*S KotlinDebug\n*F\n+ 1 NewReleases.kt\nandroidx/compose/material/icons/outlined/NewReleasesKt\n*L\n29#1:92,12\n30#1:105,18\n30#1:142\n29#1:104\n30#1:123,2\n30#1:125,2\n30#1:131,11\n30#1:127,4\n*E\n"})
/* loaded from: classes3.dex */
public final class NewReleasesKt {

    @Nullable
    private static ImageVector _newReleases;

    @NotNull
    public static final ImageVector getNewReleases(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _newReleases;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NewReleases", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(23.0f, 12.0f);
        pathBuilder.lineToRelative(-2.44f, -2.78f);
        pathBuilder.lineToRelative(0.34f, -3.68f);
        pathBuilder.lineToRelative(-3.61f, -0.82f);
        pathBuilder.lineToRelative(-1.89f, -3.18f);
        pathBuilder.lineTo(12.0f, 3.0f);
        pathBuilder.lineTo(8.6f, 1.54f);
        pathBuilder.lineTo(6.71f, 4.72f);
        pathBuilder.lineToRelative(-3.61f, 0.81f);
        pathBuilder.lineToRelative(0.34f, 3.68f);
        pathBuilder.lineTo(1.0f, 12.0f);
        pathBuilder.lineToRelative(2.44f, 2.78f);
        pathBuilder.lineToRelative(-0.34f, 3.69f);
        pathBuilder.lineToRelative(3.61f, 0.82f);
        pathBuilder.lineToRelative(1.89f, 3.18f);
        pathBuilder.lineTo(12.0f, 21.0f);
        pathBuilder.lineToRelative(3.4f, 1.46f);
        pathBuilder.lineToRelative(1.89f, -3.18f);
        pathBuilder.lineToRelative(3.61f, -0.82f);
        pathBuilder.lineToRelative(-0.34f, -3.68f);
        pathBuilder.lineTo(23.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.49f, 14.11f);
        pathBuilder.lineToRelative(0.26f, 2.79f);
        pathBuilder.lineToRelative(-2.74f, 0.62f);
        pathBuilder.lineToRelative(-1.43f, 2.41f);
        pathBuilder.lineTo(12.0f, 18.82f);
        pathBuilder.lineToRelative(-2.58f, 1.11f);
        pathBuilder.lineToRelative(-1.43f, -2.41f);
        pathBuilder.lineToRelative(-2.74f, -0.62f);
        pathBuilder.lineToRelative(0.26f, -2.8f);
        pathBuilder.lineTo(3.66f, 12.0f);
        pathBuilder.lineToRelative(1.85f, -2.12f);
        pathBuilder.lineToRelative(-0.26f, -2.78f);
        pathBuilder.lineToRelative(2.74f, -0.61f);
        pathBuilder.lineToRelative(1.43f, -2.41f);
        pathBuilder.lineTo(12.0f, 5.18f);
        pathBuilder.lineToRelative(2.58f, -1.11f);
        pathBuilder.lineToRelative(1.43f, 2.41f);
        pathBuilder.lineToRelative(2.74f, 0.62f);
        pathBuilder.lineToRelative(-0.26f, 2.79f);
        pathBuilder.lineTo(20.34f, 12.0f);
        pathBuilder.lineToRelative(-1.85f, 2.11f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 15.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _newReleases = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
