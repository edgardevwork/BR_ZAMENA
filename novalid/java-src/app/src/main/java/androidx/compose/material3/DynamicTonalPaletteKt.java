package androidx.compose.material3;

import android.content.Context;
import android.os.Build;
import androidx.annotation.FloatRange;
import androidx.annotation.RequiresApi;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.graphics.colorspace.ColorSpaces;
import androidx.core.math.MathUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: DynamicTonalPalette.android.kt */
@Metadata(m7104d1 = {"\u0000,\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0001\u001a\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u001a\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0001\u001a\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u001a\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u001a\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0002\u001a \u0010\u0012\u001a\u00020\u0013*\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, m7105d2 = {"delinearized", "", "rgbComponent", "", "dynamicDarkColorScheme", "Landroidx/compose/material3/ColorScheme;", "context", "Landroid/content/Context;", "dynamicDarkColorScheme31", "tonalPalette", "Landroidx/compose/material3/TonalPalette;", "dynamicDarkColorScheme34", "dynamicLightColorScheme", "dynamicLightColorScheme31", "dynamicLightColorScheme34", "dynamicTonalPalette", "labInvf", "ft", "setLuminance", "Landroidx/compose/ui/graphics/Color;", "newLuminance", "setLuminance-DxMtmZc", "(JF)J", "material3_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@JvmName(name = "DynamicTonalPaletteKt")
/* loaded from: classes4.dex */
public final class DynamicTonalPaletteKt {
    private static final float labInvf(float f) {
        float f2 = f * f * f;
        return f2 > 0.008856452f ? f2 : ((116 * f) - 16) / 903.2963f;
    }

    @RequiresApi(31)
    @NotNull
    public static final TonalPalette dynamicTonalPalette(@NotNull Context context) {
        ColorResourceHelper colorResourceHelper = ColorResourceHelper.INSTANCE;
        return new TonalPalette(colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral1_0), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral1_10), m9438setLuminanceDxMtmZc(colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral1_600), 98.0f), m9438setLuminanceDxMtmZc(colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral1_600), 96.0f), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral1_50), m9438setLuminanceDxMtmZc(colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral1_600), 94.0f), m9438setLuminanceDxMtmZc(colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral1_600), 92.0f), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral1_100), m9438setLuminanceDxMtmZc(colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral1_600), 87.0f), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral1_200), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral1_300), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral1_400), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral1_500), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral1_600), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral1_700), m9438setLuminanceDxMtmZc(colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral1_600), 24.0f), m9438setLuminanceDxMtmZc(colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral1_600), 22.0f), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral1_800), m9438setLuminanceDxMtmZc(colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral1_600), 17.0f), m9438setLuminanceDxMtmZc(colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral1_600), 12.0f), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral1_900), m9438setLuminanceDxMtmZc(colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral1_600), 6.0f), m9438setLuminanceDxMtmZc(colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral1_600), 4.0f), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral1_1000), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral2_0), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral2_10), m9438setLuminanceDxMtmZc(colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral2_600), 98.0f), m9438setLuminanceDxMtmZc(colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral2_600), 96.0f), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral2_50), m9438setLuminanceDxMtmZc(colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral2_600), 94.0f), m9438setLuminanceDxMtmZc(colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral2_600), 92.0f), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral2_100), m9438setLuminanceDxMtmZc(colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral2_600), 87.0f), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral2_200), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral2_300), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral2_400), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral2_500), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral2_600), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral2_700), m9438setLuminanceDxMtmZc(colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral2_600), 24.0f), m9438setLuminanceDxMtmZc(colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral2_600), 22.0f), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral2_800), m9438setLuminanceDxMtmZc(colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral2_600), 17.0f), m9438setLuminanceDxMtmZc(colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral2_600), 12.0f), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral2_900), m9438setLuminanceDxMtmZc(colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral2_600), 6.0f), m9438setLuminanceDxMtmZc(colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral2_600), 4.0f), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_neutral2_1000), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent1_0), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent1_10), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent1_50), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent1_100), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent1_200), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent1_300), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent1_400), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent1_500), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent1_600), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent1_700), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent1_800), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent1_900), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent1_1000), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent2_0), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent2_10), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent2_50), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent2_100), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent2_200), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent2_300), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent2_400), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent2_500), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent2_600), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent2_700), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent2_800), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent2_900), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent2_1000), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent3_0), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent3_10), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent3_50), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent3_100), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent3_200), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent3_300), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent3_400), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent3_500), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent3_600), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent3_700), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent3_800), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent3_900), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_accent3_1000), null);
    }

    @RequiresApi(31)
    @NotNull
    public static final ColorScheme dynamicLightColorScheme(@NotNull Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            return dynamicLightColorScheme34(context);
        }
        return dynamicLightColorScheme31(dynamicTonalPalette(context));
    }

    @RequiresApi(31)
    @NotNull
    public static final ColorScheme dynamicDarkColorScheme(@NotNull Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            return dynamicDarkColorScheme34(context);
        }
        return dynamicDarkColorScheme31(dynamicTonalPalette(context));
    }

    /* renamed from: setLuminance-DxMtmZc, reason: not valid java name */
    public static final long m9438setLuminanceDxMtmZc(long j, @FloatRange(from = 0.0d, m9to = 100.0d) float f) {
        double d = f;
        if ((d < 1.0E-4d) | (d > 99.9999d)) {
            int iDelinearized = delinearized(100 * labInvf((f + 16) / 116));
            return ColorKt.Color$default(iDelinearized, iDelinearized, iDelinearized, 0, 8, null);
        }
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        long jM11337convertvNxB06k = Color.m11337convertvNxB06k(j, colorSpaces.getCieLab());
        return Color.m11337convertvNxB06k(ColorKt.Color$default(f, Color.m11332component2impl(jM11337convertvNxB06k), Color.m11333component3impl(jM11337convertvNxB06k), 0.0f, colorSpaces.getCieLab(), 8, null), colorSpaces.getSrgb());
    }

    private static final int delinearized(float f) {
        double d = f / 100;
        return MathUtils.clamp(MathKt__MathJVMKt.roundToInt((d <= 0.0031308d ? d * 12.92d : (Math.pow(d, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d), 0, 255);
    }

    @RequiresApi(31)
    @NotNull
    public static final ColorScheme dynamicLightColorScheme31(@NotNull TonalPalette tonalPalette) {
        long primary40 = tonalPalette.getPrimary40();
        long primary100 = tonalPalette.getPrimary100();
        long primary90 = tonalPalette.getPrimary90();
        long primary10 = tonalPalette.getPrimary10();
        long primary80 = tonalPalette.getPrimary80();
        long secondary40 = tonalPalette.getSecondary40();
        long secondary100 = tonalPalette.getSecondary100();
        long secondary90 = tonalPalette.getSecondary90();
        long secondary10 = tonalPalette.getSecondary10();
        long tertiary40 = tonalPalette.getTertiary40();
        long tertiary100 = tonalPalette.getTertiary100();
        long tertiary90 = tonalPalette.getTertiary90();
        long tertiary10 = tonalPalette.getTertiary10();
        long neutralVariant98 = tonalPalette.getNeutralVariant98();
        long neutralVariant10 = tonalPalette.getNeutralVariant10();
        long neutralVariant982 = tonalPalette.getNeutralVariant98();
        long neutralVariant102 = tonalPalette.getNeutralVariant10();
        long neutralVariant90 = tonalPalette.getNeutralVariant90();
        long neutralVariant30 = tonalPalette.getNeutralVariant30();
        long neutralVariant20 = tonalPalette.getNeutralVariant20();
        long neutralVariant95 = tonalPalette.getNeutralVariant95();
        long neutralVariant50 = tonalPalette.getNeutralVariant50();
        long neutralVariant80 = tonalPalette.getNeutralVariant80();
        long neutralVariant0 = tonalPalette.getNeutralVariant0();
        long neutralVariant983 = tonalPalette.getNeutralVariant98();
        long neutralVariant87 = tonalPalette.getNeutralVariant87();
        return ColorSchemeKt.m9298lightColorSchemeCXl9yA$default(primary40, primary100, primary90, primary10, primary80, secondary40, secondary100, secondary90, secondary10, tertiary40, tertiary100, tertiary90, tertiary10, neutralVariant98, neutralVariant10, neutralVariant982, neutralVariant102, neutralVariant90, neutralVariant30, tonalPalette.getPrimary40(), neutralVariant20, neutralVariant95, 0L, 0L, 0L, 0L, neutralVariant50, neutralVariant80, neutralVariant0, neutralVariant983, tonalPalette.getNeutralVariant94(), tonalPalette.getNeutralVariant92(), tonalPalette.getNeutralVariant90(), tonalPalette.getNeutralVariant96(), tonalPalette.getNeutralVariant100(), neutralVariant87, 62914560, 0, null);
    }

    @RequiresApi(34)
    @NotNull
    public static final ColorScheme dynamicLightColorScheme34(@NotNull Context context) {
        ColorResourceHelper colorResourceHelper = ColorResourceHelper.INSTANCE;
        long jM9249getColorWaAFU9c = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_primary_light);
        long jM9249getColorWaAFU9c2 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_on_primary_light);
        long jM9249getColorWaAFU9c3 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_primary_container_light);
        long jM9249getColorWaAFU9c4 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_on_primary_container_light);
        long jM9249getColorWaAFU9c5 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_primary_dark);
        long jM9249getColorWaAFU9c6 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_secondary_light);
        long jM9249getColorWaAFU9c7 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_on_secondary_light);
        long jM9249getColorWaAFU9c8 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_secondary_container_light);
        long jM9249getColorWaAFU9c9 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_on_secondary_container_light);
        long jM9249getColorWaAFU9c10 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_tertiary_light);
        long jM9249getColorWaAFU9c11 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_on_tertiary_light);
        long jM9249getColorWaAFU9c12 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_tertiary_container_light);
        long jM9249getColorWaAFU9c13 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_on_tertiary_container_light);
        long jM9249getColorWaAFU9c14 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_background_light);
        long jM9249getColorWaAFU9c15 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_on_background_light);
        long jM9249getColorWaAFU9c16 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_surface_light);
        long jM9249getColorWaAFU9c17 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_on_surface_light);
        long jM9249getColorWaAFU9c18 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_surface_variant_light);
        long jM9249getColorWaAFU9c19 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_on_surface_variant_light);
        long jM9249getColorWaAFU9c20 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_surface_dark);
        long jM9249getColorWaAFU9c21 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_on_surface_dark);
        long jM9249getColorWaAFU9c22 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_outline_light);
        long jM9249getColorWaAFU9c23 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_outline_variant_light);
        long jM9249getColorWaAFU9c24 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_surface_bright_light);
        long jM9249getColorWaAFU9c25 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_surface_dim_light);
        return ColorSchemeKt.m9298lightColorSchemeCXl9yA$default(jM9249getColorWaAFU9c, jM9249getColorWaAFU9c2, jM9249getColorWaAFU9c3, jM9249getColorWaAFU9c4, jM9249getColorWaAFU9c5, jM9249getColorWaAFU9c6, jM9249getColorWaAFU9c7, jM9249getColorWaAFU9c8, jM9249getColorWaAFU9c9, jM9249getColorWaAFU9c10, jM9249getColorWaAFU9c11, jM9249getColorWaAFU9c12, jM9249getColorWaAFU9c13, jM9249getColorWaAFU9c14, jM9249getColorWaAFU9c15, jM9249getColorWaAFU9c16, jM9249getColorWaAFU9c17, jM9249getColorWaAFU9c18, jM9249getColorWaAFU9c19, colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_primary_light), jM9249getColorWaAFU9c20, jM9249getColorWaAFU9c21, 0L, 0L, 0L, 0L, jM9249getColorWaAFU9c22, jM9249getColorWaAFU9c23, 0L, jM9249getColorWaAFU9c24, colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_surface_container_light), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_surface_container_high_light), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_surface_container_highest_light), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_surface_container_low_light), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_surface_container_lowest_light), jM9249getColorWaAFU9c25, 331350016, 0, null);
    }

    @RequiresApi(31)
    @NotNull
    public static final ColorScheme dynamicDarkColorScheme31(@NotNull TonalPalette tonalPalette) {
        long primary80 = tonalPalette.getPrimary80();
        long primary20 = tonalPalette.getPrimary20();
        long primary30 = tonalPalette.getPrimary30();
        long primary90 = tonalPalette.getPrimary90();
        long primary40 = tonalPalette.getPrimary40();
        long secondary80 = tonalPalette.getSecondary80();
        long secondary20 = tonalPalette.getSecondary20();
        long secondary30 = tonalPalette.getSecondary30();
        long secondary90 = tonalPalette.getSecondary90();
        long tertiary80 = tonalPalette.getTertiary80();
        long tertiary20 = tonalPalette.getTertiary20();
        long tertiary30 = tonalPalette.getTertiary30();
        long tertiary90 = tonalPalette.getTertiary90();
        long neutralVariant6 = tonalPalette.getNeutralVariant6();
        long neutralVariant90 = tonalPalette.getNeutralVariant90();
        long neutralVariant62 = tonalPalette.getNeutralVariant6();
        long neutralVariant902 = tonalPalette.getNeutralVariant90();
        long neutralVariant30 = tonalPalette.getNeutralVariant30();
        long neutralVariant80 = tonalPalette.getNeutralVariant80();
        long neutralVariant903 = tonalPalette.getNeutralVariant90();
        long neutralVariant20 = tonalPalette.getNeutralVariant20();
        long neutralVariant60 = tonalPalette.getNeutralVariant60();
        long neutralVariant302 = tonalPalette.getNeutralVariant30();
        long neutralVariant0 = tonalPalette.getNeutralVariant0();
        long neutralVariant24 = tonalPalette.getNeutralVariant24();
        long neutralVariant63 = tonalPalette.getNeutralVariant6();
        return ColorSchemeKt.m9294darkColorSchemeCXl9yA$default(primary80, primary20, primary30, primary90, primary40, secondary80, secondary20, secondary30, secondary90, tertiary80, tertiary20, tertiary30, tertiary90, neutralVariant6, neutralVariant90, neutralVariant62, neutralVariant902, neutralVariant30, neutralVariant80, tonalPalette.getPrimary80(), neutralVariant903, neutralVariant20, 0L, 0L, 0L, 0L, neutralVariant60, neutralVariant302, neutralVariant0, neutralVariant24, tonalPalette.getNeutralVariant12(), tonalPalette.getNeutralVariant17(), tonalPalette.getNeutralVariant22(), tonalPalette.getNeutralVariant10(), tonalPalette.getNeutralVariant4(), neutralVariant63, 62914560, 0, null);
    }

    @RequiresApi(34)
    @NotNull
    public static final ColorScheme dynamicDarkColorScheme34(@NotNull Context context) {
        ColorResourceHelper colorResourceHelper = ColorResourceHelper.INSTANCE;
        long jM9249getColorWaAFU9c = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_primary_dark);
        long jM9249getColorWaAFU9c2 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_on_primary_dark);
        long jM9249getColorWaAFU9c3 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_primary_container_dark);
        long jM9249getColorWaAFU9c4 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_on_primary_container_dark);
        long jM9249getColorWaAFU9c5 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_primary_light);
        long jM9249getColorWaAFU9c6 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_secondary_dark);
        long jM9249getColorWaAFU9c7 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_on_secondary_dark);
        long jM9249getColorWaAFU9c8 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_secondary_container_dark);
        long jM9249getColorWaAFU9c9 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_on_secondary_container_dark);
        long jM9249getColorWaAFU9c10 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_tertiary_dark);
        long jM9249getColorWaAFU9c11 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_on_tertiary_dark);
        long jM9249getColorWaAFU9c12 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_tertiary_container_dark);
        long jM9249getColorWaAFU9c13 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_on_tertiary_container_dark);
        long jM9249getColorWaAFU9c14 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_background_dark);
        long jM9249getColorWaAFU9c15 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_on_background_dark);
        long jM9249getColorWaAFU9c16 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_surface_dark);
        long jM9249getColorWaAFU9c17 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_on_surface_dark);
        long jM9249getColorWaAFU9c18 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_surface_variant_dark);
        long jM9249getColorWaAFU9c19 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_on_surface_variant_dark);
        long jM9249getColorWaAFU9c20 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_surface_light);
        long jM9249getColorWaAFU9c21 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_on_surface_light);
        long jM9249getColorWaAFU9c22 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_outline_dark);
        long jM9249getColorWaAFU9c23 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_outline_variant_dark);
        long jM9249getColorWaAFU9c24 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_surface_bright_dark);
        long jM9249getColorWaAFU9c25 = colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_surface_dim_dark);
        return ColorSchemeKt.m9294darkColorSchemeCXl9yA$default(jM9249getColorWaAFU9c, jM9249getColorWaAFU9c2, jM9249getColorWaAFU9c3, jM9249getColorWaAFU9c4, jM9249getColorWaAFU9c5, jM9249getColorWaAFU9c6, jM9249getColorWaAFU9c7, jM9249getColorWaAFU9c8, jM9249getColorWaAFU9c9, jM9249getColorWaAFU9c10, jM9249getColorWaAFU9c11, jM9249getColorWaAFU9c12, jM9249getColorWaAFU9c13, jM9249getColorWaAFU9c14, jM9249getColorWaAFU9c15, jM9249getColorWaAFU9c16, jM9249getColorWaAFU9c17, jM9249getColorWaAFU9c18, jM9249getColorWaAFU9c19, colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_primary_dark), jM9249getColorWaAFU9c20, jM9249getColorWaAFU9c21, 0L, 0L, 0L, 0L, jM9249getColorWaAFU9c22, jM9249getColorWaAFU9c23, 0L, jM9249getColorWaAFU9c24, colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_surface_container_dark), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_surface_container_high_dark), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_surface_container_highest_dark), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_surface_container_low_dark), colorResourceHelper.m9249getColorWaAFU9c(context, android.R.color.system_surface_container_lowest_dark), jM9249getColorWaAFU9c25, 331350016, 0, null);
    }
}
