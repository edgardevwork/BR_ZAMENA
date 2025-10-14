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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MergeType.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7105d2 = {"_mergeType", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MergeType", "Landroidx/compose/material/icons/Icons$TwoTone;", "getMergeType$annotations", "(Landroidx/compose/material/icons/Icons$TwoTone;)V", "getMergeType", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMergeType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MergeType.kt\nandroidx/compose/material/icons/twotone/MergeTypeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,58:1\n212#2,12:59\n233#2,18:72\n253#2:109\n174#3:71\n705#4,2:90\n717#4,2:92\n719#4,11:98\n72#5,4:94\n*S KotlinDebug\n*F\n+ 1 MergeType.kt\nandroidx/compose/material/icons/twotone/MergeTypeKt\n*L\n35#1:59,12\n36#1:72,18\n36#1:109\n35#1:71\n36#1:90,2\n36#1:92,2\n36#1:98,11\n36#1:94,4\n*E\n"})
/* loaded from: classes4.dex */
public final class MergeTypeKt {

    @Nullable
    private static ImageVector _mergeType;

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.TwoTone.MergeType", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.TwoTone.MergeType", imports = {"androidx.compose.material.icons.automirrored.twotone.MergeType"}))
    public static /* synthetic */ void getMergeType$annotations(Icons.TwoTone twoTone) {
    }

    @NotNull
    public static final ImageVector getMergeType(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _mergeType;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.MergeType", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.59f, 19.0f);
        pathBuilder.lineTo(7.0f, 20.41f);
        pathBuilder.lineToRelative(6.0f, -6.0f);
        pathBuilder.lineTo(13.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(3.5f);
        pathBuilder.lineTo(12.0f, 3.5f);
        pathBuilder.lineTo(7.5f, 8.0f);
        pathBuilder.lineTo(11.0f, 8.0f);
        pathBuilder.verticalLineToRelative(5.59f);
        pathBuilder.close();
        pathBuilder.moveTo(16.997f, 20.41f);
        pathBuilder.lineToRelative(-3.408f, -3.407f);
        pathBuilder.lineToRelative(1.4f, -1.407f);
        pathBuilder.lineToRelative(3.41f, 3.408f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mergeType = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
