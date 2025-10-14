package androidx.compose.material.icons.filled;

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

/* compiled from: Fastfood.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_fastfood", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Fastfood", "Landroidx/compose/material/icons/Icons$Filled;", "getFastfood", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFastfood.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Fastfood.kt\nandroidx/compose/material/icons/filled/FastfoodKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,68:1\n212#2,12:69\n233#2,18:82\n253#2:119\n174#3:81\n705#4,2:100\n717#4,2:102\n719#4,11:108\n72#5,4:104\n*S KotlinDebug\n*F\n+ 1 Fastfood.kt\nandroidx/compose/material/icons/filled/FastfoodKt\n*L\n29#1:69,12\n30#1:82,18\n30#1:119\n29#1:81\n30#1:100,2\n30#1:102,2\n30#1:108,11\n30#1:104,4\n*E\n"})
/* loaded from: classes3.dex */
public final class FastfoodKt {

    @Nullable
    private static ImageVector _fastfood;

    @NotNull
    public static final ImageVector getFastfood(@NotNull Icons.Filled filled) {
        ImageVector imageVector = _fastfood;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Fastfood", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.06f, 22.99f);
        pathBuilder.horizontalLineToRelative(1.66f);
        pathBuilder.curveToRelative(0.84f, 0.0f, 1.53f, -0.64f, 1.63f, -1.46f);
        pathBuilder.lineTo(23.0f, 5.05f);
        pathBuilder.horizontalLineToRelative(-5.0f);
        pathBuilder.lineTo(18.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(-1.97f);
        pathBuilder.verticalLineToRelative(4.05f);
        pathBuilder.horizontalLineToRelative(-4.97f);
        pathBuilder.lineToRelative(0.3f, 2.34f);
        pathBuilder.curveToRelative(1.71f, 0.47f, 3.31f, 1.32f, 4.27f, 2.26f);
        pathBuilder.curveToRelative(1.44f, 1.42f, 2.43f, 2.89f, 2.43f, 5.29f);
        pathBuilder.verticalLineToRelative(8.05f);
        pathBuilder.close();
        pathBuilder.moveTo(1.0f, 21.99f);
        pathBuilder.lineTo(1.0f, 21.0f);
        pathBuilder.horizontalLineToRelative(15.03f);
        pathBuilder.verticalLineToRelative(0.99f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.01f, 1.0f);
        pathBuilder.lineTo(2.01f, 22.99f);
        pathBuilder.curveToRelative(-0.56f, 0.0f, -1.01f, -0.45f, -1.01f, -1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.03f, 14.99f);
        pathBuilder.curveToRelative(0.0f, -8.0f, -15.03f, -8.0f, -15.03f, 0.0f);
        pathBuilder.horizontalLineToRelative(15.03f);
        pathBuilder.close();
        pathBuilder.moveTo(1.02f, 17.0f);
        pathBuilder.horizontalLineToRelative(15.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-15.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fastfood = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
