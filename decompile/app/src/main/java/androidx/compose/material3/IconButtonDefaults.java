package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.FilledIconButtonTokens;
import androidx.compose.material3.tokens.FilledTonalIconButtonTokens;
import androidx.compose.material3.tokens.IconButtonTokens;
import androidx.compose.material3.tokens.OutlinedIconButtonTokens;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: IconButton.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015JN\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ:\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0015JN\u0010\u001e\u001a\u00020\u00172\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001bJ\r\u0010 \u001a\u00020\nH\u0007¢\u0006\u0002\u0010!J:\u0010 \u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0015JN\u0010#\u001a\u00020\u00172\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010\u001bJ\u0015\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0007¢\u0006\u0002\u0010)J:\u0010*\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010\u0015J\u001f\u0010,\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(2\u0006\u0010-\u001a\u00020(H\u0007¢\u0006\u0002\u0010.JN\u0010/\u001a\u00020\u00172\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010\u001bR\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\u00020\n*\u00020\u000b8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00061"}, m7105d2 = {"Landroidx/compose/material3/IconButtonDefaults;", "", "()V", "filledShape", "Landroidx/compose/ui/graphics/Shape;", "getFilledShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "outlinedShape", "getOutlinedShape", "defaultIconButtonColors", "Landroidx/compose/material3/IconButtonColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultIconButtonColors", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/IconButtonColors;", "filledIconButtonColors", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledContainerColor", "disabledContentColor", "filledIconButtonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/IconButtonColors;", "filledIconToggleButtonColors", "Landroidx/compose/material3/IconToggleButtonColors;", "checkedContainerColor", "checkedContentColor", "filledIconToggleButtonColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/IconToggleButtonColors;", "filledTonalIconButtonColors", "filledTonalIconButtonColors-ro_MJ88", "filledTonalIconToggleButtonColors", "filledTonalIconToggleButtonColors-5tl4gsc", "iconButtonColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/IconButtonColors;", "iconButtonColors-ro_MJ88", "iconToggleButtonColors", "iconToggleButtonColors-5tl4gsc", "outlinedIconButtonBorder", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "outlinedIconButtonColors", "outlinedIconButtonColors-ro_MJ88", "outlinedIconToggleButtonBorder", "checked", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "outlinedIconToggleButtonColors", "outlinedIconToggleButtonColors-5tl4gsc", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1001:1\n74#2:1002\n74#2:1003\n74#2:1004\n74#2:1005\n74#2:1006\n74#2:1007\n74#2:1008\n74#2:1009\n1116#3,6:1010\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonDefaults\n*L\n554#1:1002\n577#1:1003\n592#1:1004\n619#1:1005\n761#1:1006\n787#1:1007\n827#1:1008\n829#1:1009\n832#1:1010,6\n*E\n"})
/* loaded from: classes4.dex */
public final class IconButtonDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final IconButtonDefaults INSTANCE = new IconButtonDefaults();

    private IconButtonDefaults() {
    }

    @Composable
    @JvmName(name = "getFilledShape")
    @NotNull
    public final Shape getFilledShape(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(1265841879);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1265841879, i, -1, "androidx.compose.material3.IconButtonDefaults.<get-filledShape> (IconButton.kt:540)");
        }
        Shape value = ShapesKt.getValue(FilledIconButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @Composable
    @JvmName(name = "getOutlinedShape")
    @NotNull
    public final Shape getOutlinedShape(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(1327125527);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1327125527, i, -1, "androidx.compose.material3.IconButtonDefaults.<get-outlinedShape> (IconButton.kt:545)");
        }
        Shape value = ShapesKt.getValue(OutlinedIconButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @Composable
    @NotNull
    public final IconButtonColors iconButtonColors(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1519621781);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1519621781, i, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:551)");
        }
        IconButtonColors defaultIconButtonColors = getDefaultIconButtonColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i << 3) & 112);
        long jM11350unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m11350unboximpl();
        if (Color.m11341equalsimpl0(defaultIconButtonColors.getContentColor(), jM11350unboximpl)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return defaultIconButtonColors;
        }
        IconButtonColors iconButtonColorsM9482copyjRlVdoo = defaultIconButtonColors.m9482copyjRlVdoo((5 & 1) != 0 ? defaultIconButtonColors.containerColor : 0L, (5 & 2) != 0 ? defaultIconButtonColors.contentColor : jM11350unboximpl, (5 & 4) != 0 ? defaultIconButtonColors.disabledContainerColor : 0L, (5 & 8) != 0 ? defaultIconButtonColors.disabledContentColor : Color.m11339copywmQWz5c$default(jM11350unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconButtonColorsM9482copyjRlVdoo;
    }

    @Composable
    @NotNull
    /* renamed from: iconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m9491iconButtonColorsro_MJ88(long j, long j2, long j3, long j4, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(999008085);
        long jM11376getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j;
        long jM11350unboximpl = (i2 & 2) != 0 ? ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m11350unboximpl() : j2;
        long jM11376getUnspecified0d7_KjU2 = (i2 & 4) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j3;
        long jM11339copywmQWz5c$default = (i2 & 8) != 0 ? Color.m11339copywmQWz5c$default(jM11350unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(999008085, i, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:580)");
        }
        IconButtonColors iconButtonColorsM9482copyjRlVdoo = getDefaultIconButtonColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i >> 9) & 112).m9482copyjRlVdoo(jM11376getUnspecified0d7_KjU, jM11350unboximpl, jM11376getUnspecified0d7_KjU2, jM11339copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconButtonColorsM9482copyjRlVdoo;
    }

    @Composable
    @JvmName(name = "getDefaultIconButtonColors")
    @NotNull
    public final IconButtonColors getDefaultIconButtonColors(@NotNull ColorScheme colorScheme, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(1437915677);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1437915677, i, -1, "androidx.compose.material3.IconButtonDefaults.<get-defaultIconButtonColors> (IconButton.kt:589)");
        }
        IconButtonColors defaultIconButtonColorsCached = colorScheme.getDefaultIconButtonColorsCached();
        if (defaultIconButtonColorsCached == null) {
            long jM11350unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m11350unboximpl();
            Color.Companion companion = Color.INSTANCE;
            defaultIconButtonColorsCached = new IconButtonColors(companion.m11375getTransparent0d7_KjU(), jM11350unboximpl, companion.m11375getTransparent0d7_KjU(), Color.m11339copywmQWz5c$default(jM11350unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme.setDefaultIconButtonColorsCached$material3_release(defaultIconButtonColorsCached);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultIconButtonColorsCached;
    }

    @Composable
    @NotNull
    /* renamed from: iconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m9492iconToggleButtonColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-2020719549);
        long jM11375getTransparent0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m11375getTransparent0d7_KjU() : j;
        long jM11350unboximpl = (i2 & 2) != 0 ? ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m11350unboximpl() : j2;
        long jM11375getTransparent0d7_KjU2 = (i2 & 4) != 0 ? Color.INSTANCE.m11375getTransparent0d7_KjU() : j3;
        long jM11339copywmQWz5c$default = (i2 & 8) != 0 ? Color.m11339copywmQWz5c$default(jM11350unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        long jM11375getTransparent0d7_KjU3 = (i2 & 16) != 0 ? Color.INSTANCE.m11375getTransparent0d7_KjU() : j5;
        long value = (i2 & 32) != 0 ? ColorSchemeKt.getValue(IconButtonTokens.INSTANCE.getSelectedIconColor(), composer, 6) : j6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2020719549, i, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonColors (IconButton.kt:625)");
        }
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(jM11375getTransparent0d7_KjU, jM11350unboximpl, jM11375getTransparent0d7_KjU2, jM11339copywmQWz5c$default, jM11375getTransparent0d7_KjU3, value, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconToggleButtonColors;
    }

    @Composable
    @NotNull
    /* renamed from: filledIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m9487filledIconButtonColorsro_MJ88(long j, long j2, long j3, long j4, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-669858473);
        long value = (i2 & 1) != 0 ? ColorSchemeKt.getValue(FilledIconButtonTokens.INSTANCE.getContainerColor(), composer, 6) : j;
        long jM9292contentColorForek8zF_U = (i2 & 2) != 0 ? ColorSchemeKt.m9292contentColorForek8zF_U(value, composer, i & 14) : j2;
        long jM11339copywmQWz5c$default = (i2 & 4) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(FilledIconButtonTokens.INSTANCE.getDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long jM11339copywmQWz5c$default2 = (i2 & 8) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(FilledIconButtonTokens.INSTANCE.getDisabledColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-669858473, i, -1, "androidx.compose.material3.IconButtonDefaults.filledIconButtonColors (IconButton.kt:651)");
        }
        IconButtonColors iconButtonColors = new IconButtonColors(value, jM9292contentColorForek8zF_U, jM11339copywmQWz5c$default, jM11339copywmQWz5c$default2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconButtonColors;
    }

    @Composable
    @NotNull
    /* renamed from: filledIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m9488filledIconToggleButtonColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1887173701);
        long value = (i2 & 1) != 0 ? ColorSchemeKt.getValue(FilledIconButtonTokens.INSTANCE.getUnselectedContainerColor(), composer, 6) : j;
        long value2 = (i2 & 2) != 0 ? ColorSchemeKt.getValue(FilledIconButtonTokens.INSTANCE.getToggleUnselectedColor(), composer, 6) : j2;
        long jM11339copywmQWz5c$default = (i2 & 4) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(FilledIconButtonTokens.INSTANCE.getDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long jM11339copywmQWz5c$default2 = (i2 & 8) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(FilledIconButtonTokens.INSTANCE.getDisabledColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        long value3 = (i2 & 16) != 0 ? ColorSchemeKt.getValue(FilledIconButtonTokens.INSTANCE.getSelectedContainerColor(), composer, 6) : j5;
        long jM9292contentColorForek8zF_U = (i2 & 32) != 0 ? ColorSchemeKt.m9292contentColorForek8zF_U(value3, composer, (i >> 12) & 14) : j6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1887173701, i, -1, "androidx.compose.material3.IconButtonDefaults.filledIconToggleButtonColors (IconButton.kt:682)");
        }
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(value, value2, jM11339copywmQWz5c$default, jM11339copywmQWz5c$default2, value3, jM9292contentColorForek8zF_U, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconToggleButtonColors;
    }

    @Composable
    @NotNull
    /* renamed from: filledTonalIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m9489filledTonalIconButtonColorsro_MJ88(long j, long j2, long j3, long j4, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-18532843);
        long value = (i2 & 1) != 0 ? ColorSchemeKt.getValue(FilledTonalIconButtonTokens.INSTANCE.getContainerColor(), composer, 6) : j;
        long jM9292contentColorForek8zF_U = (i2 & 2) != 0 ? ColorSchemeKt.m9292contentColorForek8zF_U(value, composer, i & 14) : j2;
        long jM11339copywmQWz5c$default = (i2 & 4) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(FilledTonalIconButtonTokens.INSTANCE.getDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long jM11339copywmQWz5c$default2 = (i2 & 8) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(FilledTonalIconButtonTokens.INSTANCE.getDisabledColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-18532843, i, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconButtonColors (IconButton.kt:709)");
        }
        IconButtonColors iconButtonColors = new IconButtonColors(value, jM9292contentColorForek8zF_U, jM11339copywmQWz5c$default, jM11339copywmQWz5c$default2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconButtonColors;
    }

    @Composable
    @NotNull
    /* renamed from: filledTonalIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m9490filledTonalIconToggleButtonColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-19426557);
        long value = (i2 & 1) != 0 ? ColorSchemeKt.getValue(FilledTonalIconButtonTokens.INSTANCE.getUnselectedContainerColor(), composer, 6) : j;
        long jM9292contentColorForek8zF_U = (i2 & 2) != 0 ? ColorSchemeKt.m9292contentColorForek8zF_U(value, composer, i & 14) : j2;
        long jM11339copywmQWz5c$default = (i2 & 4) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(FilledTonalIconButtonTokens.INSTANCE.getDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long jM11339copywmQWz5c$default2 = (i2 & 8) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(FilledTonalIconButtonTokens.INSTANCE.getDisabledColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        long value2 = (i2 & 16) != 0 ? ColorSchemeKt.getValue(FilledTonalIconButtonTokens.INSTANCE.getSelectedContainerColor(), composer, 6) : j5;
        long value3 = (i2 & 32) != 0 ? ColorSchemeKt.getValue(FilledTonalIconButtonTokens.INSTANCE.getToggleSelectedColor(), composer, 6) : j6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-19426557, i, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconToggleButtonColors (IconButton.kt:739)");
        }
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(value, jM9292contentColorForek8zF_U, jM11339copywmQWz5c$default, jM11339copywmQWz5c$default2, value2, value3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconToggleButtonColors;
    }

    @Composable
    @NotNull
    /* renamed from: outlinedIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m9493outlinedIconButtonColorsro_MJ88(long j, long j2, long j3, long j4, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1030517545);
        long jM11375getTransparent0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m11375getTransparent0d7_KjU() : j;
        long jM11350unboximpl = (i2 & 2) != 0 ? ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m11350unboximpl() : j2;
        long jM11375getTransparent0d7_KjU2 = (i2 & 4) != 0 ? Color.INSTANCE.m11375getTransparent0d7_KjU() : j3;
        long jM11339copywmQWz5c$default = (i2 & 8) != 0 ? Color.m11339copywmQWz5c$default(jM11350unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1030517545, i, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonColors (IconButton.kt:765)");
        }
        IconButtonColors iconButtonColors = new IconButtonColors(jM11375getTransparent0d7_KjU, jM11350unboximpl, jM11375getTransparent0d7_KjU2, jM11339copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconButtonColors;
    }

    @Composable
    @NotNull
    /* renamed from: outlinedIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m9494outlinedIconToggleButtonColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(2130592709);
        long jM11375getTransparent0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m11375getTransparent0d7_KjU() : j;
        long jM11350unboximpl = (i2 & 2) != 0 ? ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m11350unboximpl() : j2;
        long jM11375getTransparent0d7_KjU2 = (i2 & 4) != 0 ? Color.INSTANCE.m11375getTransparent0d7_KjU() : j3;
        long jM11339copywmQWz5c$default = (i2 & 8) != 0 ? Color.m11339copywmQWz5c$default(jM11350unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        long value = (i2 & 16) != 0 ? ColorSchemeKt.getValue(OutlinedIconButtonTokens.INSTANCE.getSelectedContainerColor(), composer, 6) : j5;
        long jM9292contentColorForek8zF_U = (i2 & 32) != 0 ? ColorSchemeKt.m9292contentColorForek8zF_U(value, composer, (i >> 12) & 14) : j6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2130592709, i, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonColors (IconButton.kt:794)");
        }
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(jM11375getTransparent0d7_KjU, jM11350unboximpl, jM11375getTransparent0d7_KjU2, jM11339copywmQWz5c$default, value, jM9292contentColorForek8zF_U, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconToggleButtonColors;
    }

    @Composable
    @Nullable
    public final BorderStroke outlinedIconToggleButtonBorder(boolean z, boolean z2, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(1244729690);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1244729690, i, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonBorder (IconButton.kt:811)");
        }
        if (z2) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return null;
        }
        BorderStroke borderStrokeOutlinedIconButtonBorder = outlinedIconButtonBorder(z, composer, (i & 14) | ((i >> 3) & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return borderStrokeOutlinedIconButtonBorder;
    }

    @Composable
    @NotNull
    public final BorderStroke outlinedIconButtonBorder(boolean z, @Nullable Composer composer, int i) {
        long jM11339copywmQWz5c$default;
        composer.startReplaceableGroup(-511461558);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-511461558, i, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonBorder (IconButton.kt:824)");
        }
        if (z) {
            composer.startReplaceableGroup(1252616568);
            jM11339copywmQWz5c$default = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m11350unboximpl();
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1252616623);
            jM11339copywmQWz5c$default = Color.m11339copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m11350unboximpl(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            composer.endReplaceableGroup();
        }
        composer.startReplaceableGroup(1252616777);
        boolean zChanged = composer.changed(jM11339copywmQWz5c$default);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = BorderStrokeKt.m7798BorderStrokecXLIe8U(OutlinedIconButtonTokens.INSTANCE.m10560getUnselectedOutlineWidthD9Ej5fM(), jM11339copywmQWz5c$default);
            composer.updateRememberedValue(objRememberedValue);
        }
        BorderStroke borderStroke = (BorderStroke) objRememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return borderStroke;
    }
}
