package androidx.compose.material.icons.sharp;

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
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"_currencyExchange", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CurrencyExchange", "Landroidx/compose/material/icons/Icons$Sharp;", "getCurrencyExchange", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCurrencyExchange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurrencyExchange.kt\nandroidx/compose/material/icons/sharp/CurrencyExchangeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,85:1\n212#2,12:86\n233#2,18:99\n253#2:136\n174#3:98\n705#4,2:117\n717#4,2:119\n719#4,11:125\n72#5,4:121\n*S KotlinDebug\n*F\n+ 1 CurrencyExchange.kt\nandroidx/compose/material/icons/sharp/CurrencyExchangeKt\n*L\n29#1:86,12\n30#1:99,18\n30#1:136\n29#1:98\n30#1:117,2\n30#1:119,2\n30#1:125,11\n30#1:121,4\n*E\n"})
/* loaded from: classes3.dex */
public final class CurrencyExchangeKt {

    @Nullable
    private static ImageVector _currencyExchange;

    @NotNull
    public static final ImageVector getCurrencyExchange(@NotNull Icons.Sharp sharp) {
        ImageVector imageVector = _currencyExchange;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.CurrencyExchange", C2046Dp.m13666constructorimpl(24.0f), C2046Dp.m13666constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
        int iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
        int iM11702getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11702getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.89f, 11.1f);
        pathBuilder.curveToRelative(-1.78f, -0.59f, -2.64f, -0.96f, -2.64f, -1.9f);
        pathBuilder.curveToRelative(0.0f, -1.02f, 1.11f, -1.39f, 1.81f, -1.39f);
        pathBuilder.curveToRelative(1.31f, 0.0f, 1.79f, 0.99f, 1.9f, 1.34f);
        pathBuilder.lineToRelative(1.58f, -0.67f);
        pathBuilder.curveTo(15.39f, 8.03f, 14.72f, 6.56f, 13.0f, 6.24f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(1.26f);
        pathBuilder.curveTo(8.52f, 6.82f, 8.51f, 9.12f, 8.51f, 9.22f);
        pathBuilder.curveToRelative(0.0f, 2.27f, 2.25f, 2.91f, 3.35f, 3.31f);
        pathBuilder.curveToRelative(1.58f, 0.56f, 2.28f, 1.07f, 2.28f, 2.03f);
        pathBuilder.curveToRelative(0.0f, 1.13f, -1.05f, 1.61f, -1.98f, 1.61f);
        pathBuilder.curveToRelative(-1.82f, 0.0f, -2.34f, -1.87f, -2.4f, -2.09f);
        pathBuilder.lineTo(8.1f, 14.75f);
        pathBuilder.curveToRelative(0.63f, 2.19f, 2.28f, 2.78f, 2.9f, 2.96f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-1.24f);
        pathBuilder.curveToRelative(0.4f, -0.09f, 2.9f, -0.59f, 2.9f, -3.22f);
        pathBuilder.curveTo(15.9f, 13.15f, 15.29f, 11.93f, 12.89f, 11.1f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 21.0f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineToRelative(-2.48f, 0.0f);
        pathBuilder.curveToRelative(1.61f, 2.41f, 4.36f, 4.0f, 7.48f, 4.0f);
        pathBuilder.curveToRelative(4.97f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, 6.08f, -4.92f, 11.0f, -11.0f, 11.0f);
        pathBuilder.curveToRelative(-3.72f, 0.0f, -7.01f, -1.85f, -9.0f, -4.67f);
        pathBuilder.lineTo(3.0f, 21.0f);
        pathBuilder.close();
        pathBuilder.moveTo(1.0f, 12.0f);
        pathBuilder.curveTo(1.0f, 5.92f, 5.92f, 1.0f, 12.0f, 1.0f);
        pathBuilder.curveToRelative(3.72f, 0.0f, 7.01f, 1.85f, 9.0f, 4.67f);
        pathBuilder.lineTo(21.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(-6.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.lineToRelative(2.48f, 0.0f);
        pathBuilder.curveTo(17.87f, 4.59f, 15.12f, 3.0f, 12.0f, 3.0f);
        pathBuilder.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11973addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11692getButtKaPHkGw, iM11702getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _currencyExchange = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
