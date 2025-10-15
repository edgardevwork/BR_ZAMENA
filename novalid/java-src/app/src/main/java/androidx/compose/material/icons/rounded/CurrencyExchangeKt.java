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

/* compiled from: CurrencyExchange.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_currencyExchange", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CurrencyExchange", "Landroidx/compose/material/icons/Icons$Rounded;", "getCurrencyExchange", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCurrencyExchange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurrencyExchange.kt\nandroidx/compose/material/icons/rounded/CurrencyExchangeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,97:1\n212#2,12:98\n233#2,18:111\n253#2:148\n174#3:110\n705#4,2:129\n717#4,2:131\n719#4,11:137\n72#5,4:133\n*S KotlinDebug\n*F\n+ 1 CurrencyExchange.kt\nandroidx/compose/material/icons/rounded/CurrencyExchangeKt\n*L\n29#1:98,12\n30#1:111,18\n30#1:148\n29#1:110\n30#1:129,2\n30#1:131,2\n30#1:137,11\n30#1:133,4\n*E\n"})
/* loaded from: classes.dex */
public final class CurrencyExchangeKt {

    @Nullable
    private static ImageVector _currencyExchange;

    @NotNull
    public static final ImageVector getCurrencyExchange(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _currencyExchange;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CurrencyExchange", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 23.0f);
        pathBuilder.curveToRelative(5.7f, 0.0f, 10.39f, -4.34f, 10.95f, -9.9f);
        pathBuilder.curveToRelative(0.06f, -0.59f, -0.41f, -1.1f, -1.0f, -1.1f);
        pathBuilder.curveToRelative(-0.51f, 0.0f, -0.94f, 0.38f, -0.99f, 0.88f);
        pathBuilder.curveTo(20.52f, 17.44f, 16.67f, 21.0f, 12.0f, 21.0f);
        pathBuilder.curveToRelative(-3.12f, 0.0f, -5.87f, -1.59f, -7.48f, -4.0f);
        pathBuilder.lineTo(6.0f, 17.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.lineToRelative(0.0f, -1.67f);
        pathBuilder.curveTo(4.99f, 21.15f, 8.28f, 23.0f, 12.0f, 23.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 1.0f);
        pathBuilder.curveTo(6.3f, 1.0f, 1.61f, 5.34f, 1.05f, 10.9f);
        pathBuilder.curveTo(1.0f, 11.49f, 1.46f, 12.0f, 2.05f, 12.0f);
        pathBuilder.curveToRelative(0.51f, 0.0f, 0.94f, -0.38f, 0.99f, -0.88f);
        pathBuilder.curveTo(3.48f, 6.56f, 7.33f, 3.0f, 12.0f, 3.0f);
        pathBuilder.curveToRelative(3.12f, 0.0f, 5.87f, 1.59f, 7.48f, 4.0f);
        pathBuilder.lineTo(18.0f, 7.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.lineToRelative(0.0f, 1.67f);
        pathBuilder.curveTo(19.01f, 2.85f, 15.72f, 1.0f, 12.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.12f, 5.88f);
        pathBuilder.curveTo(11.12f, 5.39f, 11.52f, 5.0f, 12.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(0.88f, 0.39f, 0.88f, 0.88f);
        pathBuilder.lineToRelative(0.0f, 0.37f);
        pathBuilder.curveToRelative(1.07f, 0.19f, 1.75f, 0.76f, 2.16f, 1.3f);
        pathBuilder.curveToRelative(0.34f, 0.44f, 0.16f, 1.08f, -0.36f, 1.3f);
        pathBuilder.curveTo(14.32f, 9.0f, 13.9f, 8.88f, 13.66f, 8.57f);
        pathBuilder.curveToRelative(-0.28f, -0.38f, -0.78f, -0.77f, -1.6f, -0.77f);
        pathBuilder.curveToRelative(-0.7f, 0.0f, -1.81f, 0.37f, -1.81f, 1.39f);
        pathBuilder.curveToRelative(0.0f, 0.95f, 0.86f, 1.31f, 2.64f, 1.9f);
        pathBuilder.curveToRelative(2.4f, 0.83f, 3.01f, 2.05f, 3.01f, 3.45f);
        pathBuilder.curveToRelative(0.0f, 2.62f, -2.5f, 3.13f, -3.02f, 3.22f);
        pathBuilder.lineToRelative(0.0f, 0.37f);
        pathBuilder.curveToRelative(0.0f, 0.48f, -0.39f, 0.88f, -0.88f, 0.88f);
        pathBuilder.reflectiveCurveToRelative(-0.88f, -0.39f, -0.88f, -0.88f);
        pathBuilder.lineToRelative(0.0f, -0.42f);
        pathBuilder.curveToRelative(-0.63f, -0.15f, -1.93f, -0.61f, -2.69f, -2.1f);
        pathBuilder.curveToRelative(-0.23f, -0.44f, 0.03f, -1.02f, 0.49f, -1.2f);
        pathBuilder.curveToRelative(0.41f, -0.16f, 0.9f, -0.01f, 1.11f, 0.38f);
        pathBuilder.curveToRelative(0.32f, 0.61f, 0.95f, 1.37f, 2.12f, 1.37f);
        pathBuilder.curveToRelative(0.93f, 0.0f, 1.98f, -0.48f, 1.98f, -1.61f);
        pathBuilder.curveToRelative(0.0f, -0.96f, -0.7f, -1.46f, -2.28f, -2.03f);
        pathBuilder.curveToRelative(-1.1f, -0.39f, -3.35f, -1.03f, -3.35f, -3.31f);
        pathBuilder.curveToRelative(0.0f, -0.1f, 0.01f, -2.4f, 2.62f, -2.96f);
        pathBuilder.lineTo(11.12f, 5.88f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _currencyExchange = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
