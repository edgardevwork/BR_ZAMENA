package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.material3.tokens.SuggestionChipTokens;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Chip.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0013\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0014JN\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJN\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'J0\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u00162\b\b\u0002\u0010+\u001a\u00020\u00162\b\b\u0002\u0010,\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.J8\u0010(\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\b\u0002\u0010*\u001a\u00020\u00162\b\b\u0002\u0010+\u001a\u00020\u00162\b\b\u0002\u0010,\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0014JN\u00104\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b5\u0010\u001dJN\u00106\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b7\u0010'R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, m7105d2 = {"Landroidx/compose/material3/SuggestionChipDefaults;", "", "()V", "Height", "Landroidx/compose/ui/unit/Dp;", "getHeight-D9Ej5fM", "()F", "F", "IconSize", "getIconSize-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "defaultElevatedSuggestionChipColors", "Landroidx/compose/material3/ChipColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultElevatedSuggestionChipColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ChipColors;", "elevatedSuggestionChipColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ChipColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "labelColor", "iconContentColor", "disabledContainerColor", "disabledLabelColor", "disabledIconContentColor", "elevatedSuggestionChipColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipColors;", "elevatedSuggestionChipElevation", "Landroidx/compose/material3/ChipElevation;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "elevatedSuggestionChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;", "suggestionChipBorder", "Landroidx/compose/material3/ChipBorder;", "borderColor", "disabledBorderColor", "borderWidth", "suggestionChipBorder-d_3_b6Q", "(JJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipBorder;", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "suggestionChipBorder-h1eT-Ww", "(ZJJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "suggestionChipColors", "suggestionChipColors-5tl4gsc", "suggestionChipElevation", "suggestionChipElevation-aqJV_2Y", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class SuggestionChipDefaults {
    public static final int $stable = 0;
    private static final float Height;

    @NotNull
    public static final SuggestionChipDefaults INSTANCE = new SuggestionChipDefaults();
    private static final float IconSize;

    private SuggestionChipDefaults() {
    }

    static {
        SuggestionChipTokens suggestionChipTokens = SuggestionChipTokens.INSTANCE;
        Height = suggestionChipTokens.m10700getContainerHeightD9Ej5fM();
        IconSize = suggestionChipTokens.m10709getLeadingIconSizeD9Ej5fM();
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m9870getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m9871getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @Composable
    @NotNull
    public final ChipColors suggestionChipColors(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(1918570697);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1918570697, i, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:1649)");
        }
        ChipColors defaultSuggestionChipColors = ChipKt.getDefaultSuggestionChipColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSuggestionChipColors;
    }

    @Composable
    @NotNull
    /* renamed from: suggestionChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m9874suggestionChipColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1882647883);
        long jM11376getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j;
        long jM11376getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j2;
        long jM11376getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j3;
        long jM11376getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j4;
        long jM11376getUnspecified0d7_KjU5 = (i2 & 16) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j5;
        long jM11376getUnspecified0d7_KjU6 = (i2 & 32) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1882647883, i, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:1670)");
        }
        ChipColors defaultSuggestionChipColors = ChipKt.getDefaultSuggestionChipColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        Color.Companion companion = Color.INSTANCE;
        ChipColors chipColorsM9221copyFD3wquc = defaultSuggestionChipColors.m9221copyFD3wquc(jM11376getUnspecified0d7_KjU, jM11376getUnspecified0d7_KjU2, jM11376getUnspecified0d7_KjU3, companion.m11376getUnspecified0d7_KjU(), jM11376getUnspecified0d7_KjU4, jM11376getUnspecified0d7_KjU5, jM11376getUnspecified0d7_KjU6, companion.m11376getUnspecified0d7_KjU());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipColorsM9221copyFD3wquc;
    }

    @Composable
    @NotNull
    /* renamed from: suggestionChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m9875suggestionChipElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1929994057);
        float fM10707getFlatContainerElevationD9Ej5fM = (i2 & 1) != 0 ? SuggestionChipTokens.INSTANCE.m10707getFlatContainerElevationD9Ej5fM() : f;
        float f7 = (i2 & 2) != 0 ? fM10707getFlatContainerElevationD9Ej5fM : f2;
        float f8 = (i2 & 4) != 0 ? fM10707getFlatContainerElevationD9Ej5fM : f3;
        float f9 = (i2 & 8) != 0 ? fM10707getFlatContainerElevationD9Ej5fM : f4;
        float fM10701getDraggedContainerElevationD9Ej5fM = (i2 & 16) != 0 ? SuggestionChipTokens.INSTANCE.m10701getDraggedContainerElevationD9Ej5fM() : f5;
        float f10 = (i2 & 32) != 0 ? fM10707getFlatContainerElevationD9Ej5fM : f6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1929994057, i, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipElevation (Chip.kt:1700)");
        }
        ChipElevation chipElevation = new ChipElevation(fM10707getFlatContainerElevationD9Ej5fM, f7, f8, f9, fM10701getDraggedContainerElevationD9Ej5fM, f10, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipElevation;
    }

    @Composable
    @NotNull
    /* renamed from: suggestionChipBorder-h1eT-Ww, reason: not valid java name */
    public final BorderStroke m9873suggestionChipBorderh1eTWw(boolean z, long j, long j2, float f, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-637354809);
        long value = (i2 & 2) != 0 ? ColorSchemeKt.getValue(SuggestionChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6) : j;
        long jM11339copywmQWz5c$default = (i2 & 4) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(SuggestionChipTokens.INSTANCE.getFlatDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        float fM10708getFlatOutlineWidthD9Ej5fM = (i2 & 8) != 0 ? SuggestionChipTokens.INSTANCE.m10708getFlatOutlineWidthD9Ej5fM() : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-637354809, i, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:1724)");
        }
        if (!z) {
            value = jM11339copywmQWz5c$default;
        }
        BorderStroke borderStrokeM7798BorderStrokecXLIe8U = BorderStrokeKt.m7798BorderStrokecXLIe8U(fM10708getFlatOutlineWidthD9Ej5fM, value);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return borderStrokeM7798BorderStrokecXLIe8U;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Maintained for binary compatibility. Use the suggestChipBorder functions instead", replaceWith = @ReplaceWith(expression = "suggestionChipBorder(enabled, borderColor, disabledBorderColor, borderWidth)", imports = {}))
    @Composable
    @NotNull
    /* renamed from: suggestionChipBorder-d_3_b6Q, reason: not valid java name */
    public final ChipBorder m9872suggestionChipBorderd_3_b6Q(long j, long j2, float f, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(439283919);
        long value = (i2 & 1) != 0 ? ColorSchemeKt.getValue(SuggestionChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6) : j;
        long jM11339copywmQWz5c$default = (i2 & 2) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(SuggestionChipTokens.INSTANCE.getFlatDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        float fM10708getFlatOutlineWidthD9Ej5fM = (i2 & 4) != 0 ? SuggestionChipTokens.INSTANCE.m10708getFlatOutlineWidthD9Ej5fM() : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(439283919, i, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:1746)");
        }
        ChipBorder chipBorder = new ChipBorder(value, jM11339copywmQWz5c$default, fM10708getFlatOutlineWidthD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipBorder;
    }

    @Composable
    @NotNull
    public final ChipColors elevatedSuggestionChipColors(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(1671233087);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1671233087, i, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:1758)");
        }
        ChipColors defaultElevatedSuggestionChipColors$material3_release = getDefaultElevatedSuggestionChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultElevatedSuggestionChipColors$material3_release;
    }

    @Composable
    @NotNull
    /* renamed from: elevatedSuggestionChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m9868elevatedSuggestionChipColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1269423125);
        long jM11376getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j;
        long jM11376getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j2;
        long jM11376getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j3;
        long jM11376getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j4;
        long jM11376getUnspecified0d7_KjU5 = (i2 & 16) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j5;
        long jM11376getUnspecified0d7_KjU6 = (i2 & 32) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1269423125, i, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:1779)");
        }
        ChipColors defaultElevatedSuggestionChipColors$material3_release = getDefaultElevatedSuggestionChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        Color.Companion companion = Color.INSTANCE;
        ChipColors chipColorsM9221copyFD3wquc = defaultElevatedSuggestionChipColors$material3_release.m9221copyFD3wquc(jM11376getUnspecified0d7_KjU, jM11376getUnspecified0d7_KjU2, jM11376getUnspecified0d7_KjU3, companion.m11376getUnspecified0d7_KjU(), jM11376getUnspecified0d7_KjU4, jM11376getUnspecified0d7_KjU5, jM11376getUnspecified0d7_KjU6, companion.m11376getUnspecified0d7_KjU());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipColorsM9221copyFD3wquc;
    }

    @NotNull
    public final ChipColors getDefaultElevatedSuggestionChipColors$material3_release(@NotNull ColorScheme colorScheme) {
        ChipColors defaultElevatedSuggestionChipColorsCached = colorScheme.getDefaultElevatedSuggestionChipColorsCached();
        if (defaultElevatedSuggestionChipColorsCached != null) {
            return defaultElevatedSuggestionChipColorsCached;
        }
        SuggestionChipTokens suggestionChipTokens = SuggestionChipTokens.INSTANCE;
        long jFromToken = ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getElevatedContainerColor());
        long jFromToken2 = ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getLabelTextColor());
        long jFromToken3 = ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getLeadingIconColor());
        Color.Companion companion = Color.INSTANCE;
        ChipColors chipColors = new ChipColors(jFromToken, jFromToken2, jFromToken3, companion.m11376getUnspecified0d7_KjU(), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getElevatedDisabledContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getDisabledIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), companion.m11376getUnspecified0d7_KjU(), null);
        colorScheme.setDefaultElevatedSuggestionChipColorsCached$material3_release(chipColors);
        return chipColors;
    }

    @Composable
    @NotNull
    /* renamed from: elevatedSuggestionChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m9869elevatedSuggestionChipElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1118088467);
        float fM10702getElevatedContainerElevationD9Ej5fM = (i2 & 1) != 0 ? SuggestionChipTokens.INSTANCE.m10702getElevatedContainerElevationD9Ej5fM() : f;
        float fM10706getElevatedPressedContainerElevationD9Ej5fM = (i2 & 2) != 0 ? SuggestionChipTokens.INSTANCE.m10706getElevatedPressedContainerElevationD9Ej5fM() : f2;
        float fM10704getElevatedFocusContainerElevationD9Ej5fM = (i2 & 4) != 0 ? SuggestionChipTokens.INSTANCE.m10704getElevatedFocusContainerElevationD9Ej5fM() : f3;
        float fM10705getElevatedHoverContainerElevationD9Ej5fM = (i2 & 8) != 0 ? SuggestionChipTokens.INSTANCE.m10705getElevatedHoverContainerElevationD9Ej5fM() : f4;
        float fM10701getDraggedContainerElevationD9Ej5fM = (i2 & 16) != 0 ? SuggestionChipTokens.INSTANCE.m10701getDraggedContainerElevationD9Ej5fM() : f5;
        float fM10703getElevatedDisabledContainerElevationD9Ej5fM = (i2 & 32) != 0 ? SuggestionChipTokens.INSTANCE.m10703getElevatedDisabledContainerElevationD9Ej5fM() : f6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1118088467, i, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipElevation (Chip.kt:1831)");
        }
        ChipElevation chipElevation = new ChipElevation(fM10702getElevatedContainerElevationD9Ej5fM, fM10706getElevatedPressedContainerElevationD9Ej5fM, fM10704getElevatedFocusContainerElevationD9Ej5fM, fM10705getElevatedHoverContainerElevationD9Ej5fM, fM10701getDraggedContainerElevationD9Ej5fM, fM10703getElevatedDisabledContainerElevationD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipElevation;
    }

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(641188183);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(641188183, i, -1, "androidx.compose.material3.SuggestionChipDefaults.<get-shape> (Chip.kt:1841)");
        }
        Shape value = ShapesKt.getValue(SuggestionChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }
}
