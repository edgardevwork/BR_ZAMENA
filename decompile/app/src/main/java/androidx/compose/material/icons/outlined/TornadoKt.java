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

/* compiled from: Tornado.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_tornado", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Tornado", "Landroidx/compose/material/icons/Icons$Outlined;", "getTornado", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTornado.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tornado.kt\nandroidx/compose/material/icons/outlined/TornadoKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,59:1\n212#2,12:60\n233#2,18:73\n253#2:110\n174#3:72\n705#4,2:91\n717#4,2:93\n719#4,11:99\n72#5,4:95\n*S KotlinDebug\n*F\n+ 1 Tornado.kt\nandroidx/compose/material/icons/outlined/TornadoKt\n*L\n29#1:60,12\n30#1:73,18\n30#1:110\n29#1:72\n30#1:91,2\n30#1:93,2\n30#1:99,11\n30#1:95,4\n*E\n"})
/* loaded from: classes2.dex */
public final class TornadoKt {

    @Nullable
    private static ImageVector _tornado;

    @NotNull
    public static final ImageVector getTornado(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _tornado;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Tornado", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(23.0f, 3.0f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.lineToRelative(11.0f, 19.0f);
        pathBuilder.lineTo(23.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.53f, 5.0f);
        pathBuilder.lineToRelative(-1.74f, 3.0f);
        pathBuilder.horizontalLineTo(6.21f);
        pathBuilder.lineTo(4.47f, 5.0f);
        pathBuilder.horizontalLineTo(19.53f);
        pathBuilder.close();
        pathBuilder.moveTo(10.26f, 15.0f);
        pathBuilder.horizontalLineToRelative(3.48f);
        pathBuilder.lineTo(12.0f, 18.01f);
        pathBuilder.lineTo(10.26f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.9f, 13.0f);
        pathBuilder.horizontalLineTo(9.1f);
        pathBuilder.lineToRelative(-1.74f, -3.0f);
        pathBuilder.horizontalLineToRelative(9.27f);
        pathBuilder.lineTo(14.9f, 13.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tornado = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
