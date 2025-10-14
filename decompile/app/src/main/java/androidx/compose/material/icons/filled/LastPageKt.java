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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LastPage.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7105d2 = {"_lastPage", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LastPage", "Landroidx/compose/material/icons/Icons$Filled;", "getLastPage$annotations", "(Landroidx/compose/material/icons/Icons$Filled;)V", "getLastPage", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLastPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LastPage.kt\nandroidx/compose/material/icons/filled/LastPageKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,55:1\n212#2,12:56\n233#2,18:69\n253#2:106\n174#3:68\n705#4,2:87\n717#4,2:89\n719#4,11:95\n72#5,4:91\n*S KotlinDebug\n*F\n+ 1 LastPage.kt\nandroidx/compose/material/icons/filled/LastPageKt\n*L\n35#1:56,12\n36#1:69,18\n36#1:106\n35#1:68\n36#1:87,2\n36#1:89,2\n36#1:95,11\n36#1:91,4\n*E\n"})
/* loaded from: classes2.dex */
public final class LastPageKt {

    @Nullable
    private static ImageVector _lastPage;

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.Filled.LastPage", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.Filled.LastPage", imports = {"androidx.compose.material.icons.automirrored.filled.LastPage"}))
    public static /* synthetic */ void getLastPage$annotations(Icons.Filled filled) {
    }

    @NotNull
    public static final ImageVector getLastPage(@NotNull Icons.Filled filled) {
        ImageVector imageVector = _lastPage;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.LastPage", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.59f, 7.41f);
        pathBuilder.lineTo(10.18f, 12.0f);
        pathBuilder.lineToRelative(-4.59f, 4.59f);
        pathBuilder.lineTo(7.0f, 18.0f);
        pathBuilder.lineToRelative(6.0f, -6.0f);
        pathBuilder.lineToRelative(-6.0f, -6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _lastPage = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
