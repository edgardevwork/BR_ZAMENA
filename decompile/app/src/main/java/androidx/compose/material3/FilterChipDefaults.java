package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.FilterChipTokens;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Chip.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0015\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0016J\u008a\u0001\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u00182\b\b\u0002\u0010\u001f\u001a\u00020\u00182\b\b\u0002\u0010 \u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\u00182\b\b\u0002\u0010\"\u001a\u00020\u00182\b\b\u0002\u0010#\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%JN\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b.\u0010/J^\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002032\b\b\u0002\u00105\u001a\u00020\u00182\b\b\u0002\u00106\u001a\u00020\u00182\b\b\u0002\u00107\u001a\u00020\u00182\b\b\u0002\u00108\u001a\u00020\u00182\b\b\u0002\u00109\u001a\u00020\u00042\b\b\u0002\u0010:\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0016J\u008a\u0001\u0010=\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u00182\b\b\u0002\u0010\u001f\u001a\u00020\u00182\b\b\u0002\u0010 \u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\u00182\b\b\u0002\u0010\"\u001a\u00020\u00182\b\b\u0002\u0010#\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b>\u0010%JN\u0010?\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010/R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u00020\u000f*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, m7105d2 = {"Landroidx/compose/material3/FilterChipDefaults;", "", "()V", "Height", "Landroidx/compose/ui/unit/Dp;", "getHeight-D9Ej5fM", "()F", "F", "IconSize", "getIconSize-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "defaultElevatedFilterChipColors", "Landroidx/compose/material3/SelectableChipColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultElevatedFilterChipColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SelectableChipColors;", "defaultFilterChipColors", "getDefaultFilterChipColors$material3_release", "elevatedFilterChipColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SelectableChipColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "labelColor", "iconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "elevatedFilterChipColors-XqyqHi0", "(JJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SelectableChipColors;", "elevatedFilterChipElevation", "Landroidx/compose/material3/SelectableChipElevation;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "elevatedFilterChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SelectableChipElevation;", "filterChipBorder", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "selected", "borderColor", "selectedBorderColor", "disabledBorderColor", "disabledSelectedBorderColor", "borderWidth", "selectedBorderWidth", "filterChipBorder-_7El2pE", "(ZZJJJJFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "filterChipColors", "filterChipColors-XqyqHi0", "filterChipElevation", "filterChipElevation-aqJV_2Y", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class FilterChipDefaults {
    public static final int $stable = 0;
    private static final float Height;

    @NotNull
    public static final FilterChipDefaults INSTANCE = new FilterChipDefaults();
    private static final float IconSize;

    private FilterChipDefaults() {
    }

    static {
        FilterChipTokens filterChipTokens = FilterChipTokens.INSTANCE;
        Height = filterChipTokens.m10473getContainerHeightD9Ej5fM();
        IconSize = filterChipTokens.m10489getIconSizeD9Ej5fM();
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m9464getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m9465getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @Composable
    @NotNull
    public final SelectableChipColors filterChipColors(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1743772077);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1743772077, i, -1, "androidx.compose.material3.FilterChipDefaults.filterChipColors (Chip.kt:1197)");
        }
        SelectableChipColors defaultFilterChipColors$material3_release = getDefaultFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultFilterChipColors$material3_release;
    }

    @Composable
    @NotNull
    /* renamed from: filterChipColors-XqyqHi0, reason: not valid java name */
    public final SelectableChipColors m9462filterChipColorsXqyqHi0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, @Nullable Composer composer, int i, int i2, int i3) {
        composer.startReplaceableGroup(-1831479801);
        long jM11376getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j;
        long jM11376getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j2;
        long jM11376getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j3;
        long jM11376getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j4;
        long jM11376getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j5;
        long jM11376getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j6;
        long jM11376getUnspecified0d7_KjU7 = (i3 & 64) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j7;
        long jM11376getUnspecified0d7_KjU8 = (i3 & 128) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j8;
        long jM11376getUnspecified0d7_KjU9 = (i3 & 256) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j9;
        long jM11376getUnspecified0d7_KjU10 = (i3 & 512) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j10;
        long jM11376getUnspecified0d7_KjU11 = (i3 & 1024) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j11;
        long jM11376getUnspecified0d7_KjU12 = (i3 & 2048) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j12;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1831479801, i, i2, "androidx.compose.material3.FilterChipDefaults.filterChipColors (Chip.kt:1231)");
        }
        SelectableChipColors selectableChipColorsM9728copydaRQuJA = getDefaultFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m9728copydaRQuJA(jM11376getUnspecified0d7_KjU, jM11376getUnspecified0d7_KjU2, jM11376getUnspecified0d7_KjU3, jM11376getUnspecified0d7_KjU3, jM11376getUnspecified0d7_KjU4, jM11376getUnspecified0d7_KjU5, jM11376getUnspecified0d7_KjU6, jM11376getUnspecified0d7_KjU7, jM11376getUnspecified0d7_KjU8, jM11376getUnspecified0d7_KjU9, jM11376getUnspecified0d7_KjU10, jM11376getUnspecified0d7_KjU11, jM11376getUnspecified0d7_KjU12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipColorsM9728copydaRQuJA;
    }

    @NotNull
    public final SelectableChipColors getDefaultFilterChipColors$material3_release(@NotNull ColorScheme colorScheme) {
        SelectableChipColors defaultFilterChipColorsCached = colorScheme.getDefaultFilterChipColorsCached();
        if (defaultFilterChipColorsCached != null) {
            return defaultFilterChipColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        long jM11375getTransparent0d7_KjU = companion.m11375getTransparent0d7_KjU();
        FilterChipTokens filterChipTokens = FilterChipTokens.INSTANCE;
        SelectableChipColors selectableChipColors = new SelectableChipColors(jM11375getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getLeadingIconUnselectedColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getLeadingIconUnselectedColor()), companion.m11375getTransparent0d7_KjU(), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getFlatSelectedContainerColor()), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getFlatDisabledSelectedContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLeadingIconColor()), null);
        colorScheme.setDefaultFilterChipColorsCached$material3_release(selectableChipColors);
        return selectableChipColors;
    }

    @Composable
    @NotNull
    /* renamed from: filterChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m9463filterChipElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-757972185);
        float fM10480getFlatContainerElevationD9Ej5fM = (i2 & 1) != 0 ? FilterChipTokens.INSTANCE.m10480getFlatContainerElevationD9Ej5fM() : f;
        float fM10484getFlatSelectedPressedContainerElevationD9Ej5fM = (i2 & 2) != 0 ? FilterChipTokens.INSTANCE.m10484getFlatSelectedPressedContainerElevationD9Ej5fM() : f2;
        float fM10481getFlatSelectedFocusContainerElevationD9Ej5fM = (i2 & 4) != 0 ? FilterChipTokens.INSTANCE.m10481getFlatSelectedFocusContainerElevationD9Ej5fM() : f3;
        float fM10482getFlatSelectedHoverContainerElevationD9Ej5fM = (i2 & 8) != 0 ? FilterChipTokens.INSTANCE.m10482getFlatSelectedHoverContainerElevationD9Ej5fM() : f4;
        float fM10474getDraggedContainerElevationD9Ej5fM = (i2 & 16) != 0 ? FilterChipTokens.INSTANCE.m10474getDraggedContainerElevationD9Ej5fM() : f5;
        float f7 = (i2 & 32) != 0 ? fM10480getFlatContainerElevationD9Ej5fM : f6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-757972185, i, -1, "androidx.compose.material3.FilterChipDefaults.filterChipElevation (Chip.kt:1294)");
        }
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(fM10480getFlatContainerElevationD9Ej5fM, fM10484getFlatSelectedPressedContainerElevationD9Ej5fM, fM10481getFlatSelectedFocusContainerElevationD9Ej5fM, fM10482getFlatSelectedHoverContainerElevationD9Ej5fM, fM10474getDraggedContainerElevationD9Ej5fM, f7, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipElevation;
    }

    @Composable
    @NotNull
    /* renamed from: filterChipBorder-_7El2pE, reason: not valid java name */
    public final BorderStroke m9461filterChipBorder_7El2pE(boolean z, boolean z2, long j, long j2, long j3, long j4, float f, float f2, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1138342447);
        long value = (i2 & 4) != 0 ? ColorSchemeKt.getValue(FilterChipTokens.INSTANCE.getFlatUnselectedOutlineColor(), composer, 6) : j;
        long jM11375getTransparent0d7_KjU = (i2 & 8) != 0 ? Color.INSTANCE.m11375getTransparent0d7_KjU() : j2;
        long jM11339copywmQWz5c$default = (i2 & 16) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(FilterChipTokens.INSTANCE.getFlatDisabledUnselectedOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long jM11375getTransparent0d7_KjU2 = (i2 & 32) != 0 ? Color.INSTANCE.m11375getTransparent0d7_KjU() : j4;
        float fM10487getFlatUnselectedOutlineWidthD9Ej5fM = (i2 & 64) != 0 ? FilterChipTokens.INSTANCE.m10487getFlatUnselectedOutlineWidthD9Ej5fM() : f;
        float fM10483getFlatSelectedOutlineWidthD9Ej5fM = (i2 & 128) != 0 ? FilterChipTokens.INSTANCE.m10483getFlatSelectedOutlineWidthD9Ej5fM() : f2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1138342447, i, -1, "androidx.compose.material3.FilterChipDefaults.filterChipBorder (Chip.kt:1331)");
        }
        if (!z) {
            value = z2 ? jM11375getTransparent0d7_KjU2 : jM11339copywmQWz5c$default;
        } else if (z2) {
            value = jM11375getTransparent0d7_KjU;
        }
        if (z2) {
            fM10487getFlatUnselectedOutlineWidthD9Ej5fM = fM10483getFlatSelectedOutlineWidthD9Ej5fM;
        }
        BorderStroke borderStrokeM7798BorderStrokecXLIe8U = BorderStrokeKt.m7798BorderStrokecXLIe8U(fM10487getFlatUnselectedOutlineWidthD9Ej5fM, value);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return borderStrokeM7798BorderStrokecXLIe8U;
    }

    @Composable
    @NotNull
    public final SelectableChipColors elevatedFilterChipColors(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(1082953289);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1082953289, i, -1, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipColors (Chip.kt:1345)");
        }
        SelectableChipColors defaultElevatedFilterChipColors$material3_release = getDefaultElevatedFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultElevatedFilterChipColors$material3_release;
    }

    @Composable
    @NotNull
    /* renamed from: elevatedFilterChipColors-XqyqHi0, reason: not valid java name */
    public final SelectableChipColors m9459elevatedFilterChipColorsXqyqHi0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, @Nullable Composer composer, int i, int i2, int i3) {
        composer.startReplaceableGroup(-915841711);
        long jM11376getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j;
        long jM11376getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j2;
        long jM11376getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j3;
        long jM11376getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j4;
        long jM11376getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j5;
        long jM11376getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j6;
        long jM11376getUnspecified0d7_KjU7 = (i3 & 64) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j7;
        long jM11376getUnspecified0d7_KjU8 = (i3 & 128) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j8;
        long jM11376getUnspecified0d7_KjU9 = (i3 & 256) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j9;
        long jM11376getUnspecified0d7_KjU10 = (i3 & 512) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j10;
        long jM11376getUnspecified0d7_KjU11 = (i3 & 1024) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j11;
        long jM11376getUnspecified0d7_KjU12 = (i3 & 2048) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j12;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-915841711, i, i2, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipColors (Chip.kt:1379)");
        }
        SelectableChipColors selectableChipColorsM9728copydaRQuJA = getDefaultElevatedFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m9728copydaRQuJA(jM11376getUnspecified0d7_KjU, jM11376getUnspecified0d7_KjU2, jM11376getUnspecified0d7_KjU3, jM11376getUnspecified0d7_KjU3, jM11376getUnspecified0d7_KjU4, jM11376getUnspecified0d7_KjU5, jM11376getUnspecified0d7_KjU6, jM11376getUnspecified0d7_KjU7, jM11376getUnspecified0d7_KjU8, jM11376getUnspecified0d7_KjU9, jM11376getUnspecified0d7_KjU10, jM11376getUnspecified0d7_KjU11, jM11376getUnspecified0d7_KjU12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipColorsM9728copydaRQuJA;
    }

    @NotNull
    public final SelectableChipColors getDefaultElevatedFilterChipColors$material3_release(@NotNull ColorScheme colorScheme) {
        SelectableChipColors defaultElevatedFilterChipColorsCached = colorScheme.getDefaultElevatedFilterChipColorsCached();
        if (defaultElevatedFilterChipColorsCached != null) {
            return defaultElevatedFilterChipColorsCached;
        }
        FilterChipTokens filterChipTokens = FilterChipTokens.INSTANCE;
        SelectableChipColors selectableChipColors = new SelectableChipColors(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getElevatedUnselectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getLeadingIconUnselectedColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getLeadingIconUnselectedColor()), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getElevatedDisabledContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getElevatedSelectedContainerColor()), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getElevatedDisabledContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLeadingIconColor()), null);
        colorScheme.setDefaultElevatedFilterChipColorsCached$material3_release(selectableChipColors);
        return selectableChipColors;
    }

    @Composable
    @NotNull
    /* renamed from: elevatedFilterChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m9460elevatedFilterChipElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(684803697);
        float fM10475getElevatedContainerElevationD9Ej5fM = (i2 & 1) != 0 ? FilterChipTokens.INSTANCE.m10475getElevatedContainerElevationD9Ej5fM() : f;
        float fM10479getElevatedPressedContainerElevationD9Ej5fM = (i2 & 2) != 0 ? FilterChipTokens.INSTANCE.m10479getElevatedPressedContainerElevationD9Ej5fM() : f2;
        float fM10477getElevatedFocusContainerElevationD9Ej5fM = (i2 & 4) != 0 ? FilterChipTokens.INSTANCE.m10477getElevatedFocusContainerElevationD9Ej5fM() : f3;
        float fM10478getElevatedHoverContainerElevationD9Ej5fM = (i2 & 8) != 0 ? FilterChipTokens.INSTANCE.m10478getElevatedHoverContainerElevationD9Ej5fM() : f4;
        float fM10474getDraggedContainerElevationD9Ej5fM = (i2 & 16) != 0 ? FilterChipTokens.INSTANCE.m10474getDraggedContainerElevationD9Ej5fM() : f5;
        float fM10476getElevatedDisabledContainerElevationD9Ej5fM = (i2 & 32) != 0 ? FilterChipTokens.INSTANCE.m10476getElevatedDisabledContainerElevationD9Ej5fM() : f6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(684803697, i, -1, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipElevation (Chip.kt:1442)");
        }
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(fM10475getElevatedContainerElevationD9Ej5fM, fM10479getElevatedPressedContainerElevationD9Ej5fM, fM10477getElevatedFocusContainerElevationD9Ej5fM, fM10478getElevatedHoverContainerElevationD9Ej5fM, fM10474getDraggedContainerElevationD9Ej5fM, fM10476getElevatedDisabledContainerElevationD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipElevation;
    }

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1598643637);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1598643637, i, -1, "androidx.compose.material3.FilterChipDefaults.<get-shape> (Chip.kt:1452)");
        }
        Shape value = ShapesKt.getValue(FilterChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }
}
