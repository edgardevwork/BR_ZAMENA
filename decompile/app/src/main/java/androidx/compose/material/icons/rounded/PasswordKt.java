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

/* compiled from: Password.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_password", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Password", "Landroidx/compose/material/icons/Icons$Rounded;", "getPassword", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPassword.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Password.kt\nandroidx/compose/material/icons/rounded/PasswordKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,143:1\n212#2,12:144\n233#2,18:157\n253#2:194\n174#3:156\n705#4,2:175\n717#4,2:177\n719#4,11:183\n72#5,4:179\n*S KotlinDebug\n*F\n+ 1 Password.kt\nandroidx/compose/material/icons/rounded/PasswordKt\n*L\n29#1:144,12\n30#1:157,18\n30#1:194\n29#1:156\n30#1:175,2\n30#1:177,2\n30#1:183,11\n30#1:179,4\n*E\n"})
/* loaded from: classes.dex */
public final class PasswordKt {

    @Nullable
    private static ImageVector _password;

    @NotNull
    public static final ImageVector getPassword(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _password;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Password", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveTo(2.0f, 17.45f, 2.45f, 17.0f, 3.0f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(2.5f, 12.57f);
        pathBuilder.curveToRelative(0.36f, 0.21f, 0.82f, 0.08f, 1.03f, -0.28f);
        pathBuilder.lineTo(4.0f, 11.47f);
        pathBuilder.lineToRelative(0.48f, 0.83f);
        pathBuilder.curveToRelative(0.21f, 0.36f, 0.67f, 0.48f, 1.03f, 0.28f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.36f, -0.21f, 0.48f, -0.66f, 0.28f, -1.02f);
        pathBuilder.lineTo(5.3f, 10.72f);
        pathBuilder.horizontalLineToRelative(0.95f);
        pathBuilder.curveTo(6.66f, 10.72f, 7.0f, 10.38f, 7.0f, 9.97f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilder.horizontalLineTo(5.3f);
        pathBuilder.lineTo(5.77f, 8.4f);
        pathBuilder.curveTo(5.98f, 8.04f, 5.86f, 7.58f, 5.5f, 7.37f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(5.14f, 7.17f, 4.68f, 7.29f, 4.47f, 7.65f);
        pathBuilder.lineTo(4.0f, 8.47f);
        pathBuilder.lineTo(3.53f, 7.65f);
        pathBuilder.curveTo(3.32f, 7.29f, 2.86f, 7.17f, 2.5f, 7.37f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(2.14f, 7.58f, 2.02f, 8.04f, 2.23f, 8.4f);
        pathBuilder.lineTo(2.7f, 9.22f);
        pathBuilder.horizontalLineTo(1.75f);
        pathBuilder.curveTo(1.34f, 9.22f, 1.0f, 9.56f, 1.0f, 9.97f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilder.horizontalLineTo(2.7f);
        pathBuilder.lineToRelative(-0.48f, 0.83f);
        pathBuilder.curveTo(2.02f, 11.91f, 2.14f, 12.37f, 2.5f, 12.57f);
        pathBuilder.lineTo(2.5f, 12.57f);
        pathBuilder.close();
        pathBuilder.moveTo(10.5f, 12.57f);
        pathBuilder.lineTo(10.5f, 12.57f);
        pathBuilder.curveToRelative(0.36f, 0.21f, 0.82f, 0.08f, 1.03f, -0.28f);
        pathBuilder.lineTo(12.0f, 11.47f);
        pathBuilder.lineToRelative(0.48f, 0.83f);
        pathBuilder.curveToRelative(0.21f, 0.36f, 0.67f, 0.48f, 1.03f, 0.28f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.36f, -0.21f, 0.48f, -0.66f, 0.28f, -1.02f);
        pathBuilder.lineToRelative(-0.48f, -0.83f);
        pathBuilder.horizontalLineToRelative(0.95f);
        pathBuilder.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilder.horizontalLineTo(13.3f);
        pathBuilder.lineToRelative(0.47f, -0.82f);
        pathBuilder.curveToRelative(0.21f, -0.36f, 0.08f, -0.82f, -0.27f, -1.03f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.36f, -0.21f, -0.82f, -0.08f, -1.02f, 0.27f);
        pathBuilder.lineTo(12.0f, 8.47f);
        pathBuilder.lineToRelative(-0.47f, -0.82f);
        pathBuilder.curveToRelative(-0.21f, -0.36f, -0.67f, -0.48f, -1.02f, -0.27f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.36f, 0.21f, -0.48f, 0.67f, -0.27f, 1.03f);
        pathBuilder.lineToRelative(0.47f, 0.82f);
        pathBuilder.horizontalLineTo(9.75f);
        pathBuilder.curveTo(9.34f, 9.22f, 9.0f, 9.56f, 9.0f, 9.97f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilder.horizontalLineToRelative(0.95f);
        pathBuilder.lineToRelative(-0.48f, 0.83f);
        pathBuilder.curveTo(10.02f, 11.91f, 10.14f, 12.37f, 10.5f, 12.57f);
        pathBuilder.close();
        pathBuilder.moveTo(23.0f, 9.97f);
        pathBuilder.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilder.horizontalLineTo(21.3f);
        pathBuilder.lineToRelative(0.47f, -0.82f);
        pathBuilder.curveToRelative(0.21f, -0.36f, 0.08f, -0.82f, -0.27f, -1.03f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.36f, -0.21f, -0.82f, -0.08f, -1.02f, 0.27f);
        pathBuilder.lineTo(20.0f, 8.47f);
        pathBuilder.lineToRelative(-0.47f, -0.82f);
        pathBuilder.curveToRelative(-0.21f, -0.36f, -0.67f, -0.48f, -1.02f, -0.27f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.36f, 0.21f, -0.48f, 0.67f, -0.27f, 1.03f);
        pathBuilder.lineToRelative(0.47f, 0.82f);
        pathBuilder.horizontalLineToRelative(-0.95f);
        pathBuilder.curveTo(17.34f, 9.22f, 17.0f, 9.56f, 17.0f, 9.97f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilder.horizontalLineToRelative(0.95f);
        pathBuilder.lineToRelative(-0.48f, 0.83f);
        pathBuilder.curveToRelative(-0.21f, 0.36f, -0.08f, 0.82f, 0.28f, 1.02f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.36f, 0.21f, 0.82f, 0.08f, 1.03f, -0.28f);
        pathBuilder.lineTo(20.0f, 11.47f);
        pathBuilder.lineToRelative(0.48f, 0.83f);
        pathBuilder.curveToRelative(0.21f, 0.36f, 0.67f, 0.48f, 1.03f, 0.28f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.36f, -0.21f, 0.48f, -0.66f, 0.28f, -1.02f);
        pathBuilder.lineToRelative(-0.48f, -0.83f);
        pathBuilder.horizontalLineToRelative(0.95f);
        pathBuilder.curveTo(22.66f, 10.72f, 23.0f, 10.38f, 23.0f, 9.97f);
        pathBuilder.lineTo(23.0f, 9.97f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _password = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
