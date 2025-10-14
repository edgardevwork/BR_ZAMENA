package androidx.compose.material.icons.automirrored.twotone;

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

/* compiled from: FormatAlignLeft.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_formatAlignLeft", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FormatAlignLeft", "Landroidx/compose/material/icons/Icons$AutoMirrored$TwoTone;", "getFormatAlignLeft", "(Landroidx/compose/material/icons/Icons$AutoMirrored$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFormatAlignLeft.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormatAlignLeft.kt\nandroidx/compose/material/icons/automirrored/twotone/FormatAlignLeftKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,63:1\n223#2:64\n216#2,3:65\n219#2,4:69\n233#2,18:73\n253#2:110\n174#3:68\n705#4,2:91\n717#4,2:93\n719#4,11:99\n72#5,4:95\n*S KotlinDebug\n*F\n+ 1 FormatAlignLeft.kt\nandroidx/compose/material/icons/automirrored/twotone/FormatAlignLeftKt\n*L\n29#1:64\n29#1:65,3\n29#1:69,4\n31#1:73,18\n31#1:110\n29#1:68\n31#1:91,2\n31#1:93,2\n31#1:99,11\n31#1:95,4\n*E\n"})
/* loaded from: classes4.dex */
public final class FormatAlignLeftKt {

    @Nullable
    private static ImageVector _formatAlignLeft;

    @NotNull
    public static final ImageVector getFormatAlignLeft(@NotNull Icons.AutoMirrored.TwoTone twoTone) {
        ImageVector imageVector = _formatAlignLeft;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.TwoTone.FormatAlignLeft", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(3.0f, 21.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(3.0f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(3.0f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 15.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(3.0f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(3.0f, 13.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatAlignLeft = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
