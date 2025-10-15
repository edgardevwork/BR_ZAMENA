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

/* compiled from: StarBorderPurple500.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_starBorderPurple500", "Landroidx/compose/ui/graphics/vector/ImageVector;", "StarBorderPurple500", "Landroidx/compose/material/icons/Icons$Rounded;", "getStarBorderPurple500", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nStarBorderPurple500.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StarBorderPurple500.kt\nandroidx/compose/material/icons/rounded/StarBorderPurple500Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,65:1\n212#2,12:66\n233#2,18:79\n253#2:116\n174#3:78\n705#4,2:97\n717#4,2:99\n719#4,11:105\n72#5,4:101\n*S KotlinDebug\n*F\n+ 1 StarBorderPurple500.kt\nandroidx/compose/material/icons/rounded/StarBorderPurple500Kt\n*L\n29#1:66,12\n30#1:79,18\n30#1:116\n29#1:78\n30#1:97,2\n30#1:99,2\n30#1:105,11\n30#1:101,4\n*E\n"})
/* loaded from: classes3.dex */
public final class StarBorderPurple500Kt {

    @Nullable
    private static ImageVector _starBorderPurple500;

    @NotNull
    public static final ImageVector getStarBorderPurple500(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _starBorderPurple500;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.StarBorderPurple500", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 8.89f);
        pathBuilder.lineTo(12.94f, 12.0f);
        pathBuilder.horizontalLineToRelative(2.82f);
        pathBuilder.lineToRelative(-2.27f, 1.62f);
        pathBuilder.lineToRelative(0.93f, 3.01f);
        pathBuilder.lineTo(12.0f, 14.79f);
        pathBuilder.lineToRelative(-2.42f, 1.84f);
        pathBuilder.lineToRelative(0.93f, -3.01f);
        pathBuilder.lineTo(8.24f, 12.0f);
        pathBuilder.horizontalLineToRelative(2.82f);
        pathBuilder.lineTo(12.0f, 8.89f);
        pathBuilder.moveTo(9.58f, 10.0f);
        pathBuilder.horizontalLineTo(5.12f);
        pathBuilder.curveToRelative(-0.97f, 0.0f, -1.37f, 1.25f, -0.58f, 1.81f);
        pathBuilder.lineToRelative(3.64f, 2.6f);
        pathBuilder.lineToRelative(-1.43f, 4.61f);
        pathBuilder.curveToRelative(-0.29f, 0.93f, 0.79f, 1.68f, 1.56f, 1.09f);
        pathBuilder.lineTo(12.0f, 17.31f);
        pathBuilder.lineToRelative(3.69f, 2.81f);
        pathBuilder.curveToRelative(0.77f, 0.59f, 1.85f, -0.16f, 1.56f, -1.09f);
        pathBuilder.lineToRelative(-1.43f, -4.61f);
        pathBuilder.lineToRelative(3.64f, -2.6f);
        pathBuilder.curveToRelative(0.79f, -0.57f, 0.39f, -1.81f, -0.58f, -1.81f);
        pathBuilder.horizontalLineToRelative(-4.46f);
        pathBuilder.lineToRelative(-1.47f, -4.84f);
        pathBuilder.curveToRelative(-0.29f, -0.95f, -1.63f, -0.95f, -1.91f, 0.0f);
        pathBuilder.lineTo(9.58f, 10.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _starBorderPurple500 = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
