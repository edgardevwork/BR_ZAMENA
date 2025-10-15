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

/* compiled from: WbIncandescent.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_wbIncandescent", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WbIncandescent", "Landroidx/compose/material/icons/Icons$Rounded;", "getWbIncandescent", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nWbIncandescent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WbIncandescent.kt\nandroidx/compose/material/icons/rounded/WbIncandescentKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,95:1\n212#2,12:96\n233#2,18:109\n253#2:146\n174#3:108\n705#4,2:127\n717#4,2:129\n719#4,11:135\n72#5,4:131\n*S KotlinDebug\n*F\n+ 1 WbIncandescent.kt\nandroidx/compose/material/icons/rounded/WbIncandescentKt\n*L\n29#1:96,12\n30#1:109,18\n30#1:146\n29#1:108\n30#1:127,2\n30#1:129,2\n30#1:135,11\n30#1:131,4\n*E\n"})
/* loaded from: classes4.dex */
public final class WbIncandescentKt {

    @Nullable
    private static ImageVector _wbIncandescent;

    @NotNull
    public static final ImageVector getWbIncandescent(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _wbIncandescent;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WbIncandescent", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.25f, 19.79f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(0.39f, -0.39f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.38f, -1.02f, 0.0f, -1.4f);
        pathBuilder.lineToRelative(-0.01f, -0.01f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(-0.39f, 0.39f);
        pathBuilder.curveToRelative(-0.38f, 0.4f, -0.38f, 1.02f, 0.01f, 1.41f);
        pathBuilder.close();
        pathBuilder.moveTo(11.99f, 23.0f);
        pathBuilder.lineTo(12.0f, 23.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 0.99f, -0.44f, 0.99f, -0.99f);
        pathBuilder.verticalLineToRelative(-0.96f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.44f, -0.99f, -0.99f, -0.99f);
        pathBuilder.horizontalLineToRelative(-0.01f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -0.99f, 0.44f, -0.99f, 0.99f);
        pathBuilder.verticalLineToRelative(0.96f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.44f, 0.99f, 0.99f, 0.99f);
        pathBuilder.close();
        pathBuilder.moveTo(3.01f, 11.05f);
        pathBuilder.lineTo(1.99f, 11.05f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -0.99f, 0.44f, -0.99f, 0.99f);
        pathBuilder.verticalLineToRelative(0.01f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.44f, 0.99f, 0.99f, 0.99f);
        pathBuilder.lineTo(3.0f, 13.04f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 0.99f, -0.44f, 0.99f, -0.99f);
        pathBuilder.verticalLineToRelative(-0.01f);
        pathBuilder.curveToRelative(0.01f, -0.55f, -0.43f, -0.99f, -0.98f, -0.99f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 6.86f);
        pathBuilder.lineTo(15.0f, 3.05f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(3.81f);
        pathBuilder.curveToRelative(-2.04f, 1.18f, -3.32f, 3.52f, -2.93f, 6.13f);
        pathBuilder.curveToRelative(0.4f, 2.61f, 2.56f, 4.7f, 5.18f, 5.02f);
        pathBuilder.curveToRelative(3.64f, 0.44f, 6.75f, -2.4f, 6.75f, -5.95f);
        pathBuilder.curveToRelative(0.0f, -2.23f, -1.21f, -4.16f, -3.0f, -5.2f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 12.04f);
        pathBuilder.verticalLineToRelative(0.01f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.44f, 0.99f, 0.99f, 0.99f);
        pathBuilder.lineTo(22.0f, 13.04f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 0.99f, -0.44f, 0.99f, -0.99f);
        pathBuilder.verticalLineToRelative(-0.01f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.44f, -0.99f, -0.99f, -0.99f);
        pathBuilder.horizontalLineToRelative(-1.01f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -0.99f, 0.44f, -0.99f, 0.99f);
        pathBuilder.close();
        pathBuilder.moveTo(17.94f, 19.41f);
        pathBuilder.lineToRelative(0.39f, 0.39f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineToRelative(-0.39f, -0.39f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.38f, -1.4f, 0.0f);
        pathBuilder.curveToRelative(-0.4f, 0.4f, -0.4f, 1.02f, -0.01f, 1.41f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wbIncandescent = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
