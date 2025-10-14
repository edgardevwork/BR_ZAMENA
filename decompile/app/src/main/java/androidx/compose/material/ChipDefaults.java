package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Chip.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JN\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 Jl\u0010!\u001a\u00020\"2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010#\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010$\u001a\u00020\u00192\b\b\u0002\u0010%\u001a\u00020\u00192\b\b\u0002\u0010&\u001a\u00020\u00192\b\b\u0002\u0010'\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010)JN\u0010*\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010 Jl\u0010,\u001a\u00020\"2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010#\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010$\u001a\u00020\u00192\b\b\u0002\u0010%\u001a\u00020\u00192\b\b\u0002\u0010&\u001a\u00020\u00192\b\b\u0002\u0010'\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010)R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0019\u0010\u000b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\tR\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u000e\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000f\u0010\tR\u0019\u0010\u0010\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0011\u0010\tR\u0011\u0010\u0012\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, m7105d2 = {"Landroidx/compose/material/ChipDefaults;", "", "()V", "ContentOpacity", "", "LeadingIconOpacity", "LeadingIconSize", "Landroidx/compose/ui/unit/Dp;", "getLeadingIconSize-D9Ej5fM", "()F", "F", "MinHeight", "getMinHeight-D9Ej5fM", "OutlinedBorderOpacity", "OutlinedBorderSize", "getOutlinedBorderSize-D9Ej5fM", "SelectedIconSize", "getSelectedIconSize-D9Ej5fM", "outlinedBorder", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "chipColors", "Landroidx/compose/material/ChipColors;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "contentColor", "leadingIconContentColor", "disabledBackgroundColor", "disabledContentColor", "disabledLeadingIconContentColor", "chipColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ChipColors;", "filterChipColors", "Landroidx/compose/material/SelectableChipColors;", "leadingIconColor", "disabledLeadingIconColor", "selectedBackgroundColor", "selectedContentColor", "selectedLeadingIconColor", "filterChipColors-J08w3-E", "(JJJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/SelectableChipColors;", "outlinedChipColors", "outlinedChipColors-5tl4gsc", "outlinedFilterChipColors", "outlinedFilterChipColors-J08w3-E", "material_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@ExperimentalMaterialApi
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,761:1\n154#2:762\n154#2:763\n154#2:764\n154#2:765\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipDefaults\n*L\n377#1:762\n572#1:763\n577#1:764\n582#1:765\n*E\n"})
/* loaded from: classes.dex */
public final class ChipDefaults {
    public static final int $stable = 0;
    public static final float ContentOpacity = 0.87f;
    public static final float LeadingIconOpacity = 0.54f;
    public static final float OutlinedBorderOpacity = 0.12f;

    @NotNull
    public static final ChipDefaults INSTANCE = new ChipDefaults();
    private static final float MinHeight = C2046Dp.m13666constructorimpl(32);
    private static final float OutlinedBorderSize = C2046Dp.m13666constructorimpl(1);
    private static final float LeadingIconSize = C2046Dp.m13666constructorimpl(20);
    private static final float SelectedIconSize = C2046Dp.m13666constructorimpl(18);

    private ChipDefaults() {
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m8832getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    @Composable
    @NotNull
    /* renamed from: chipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m8829chipColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, @Nullable Composer composer, int i, int i2) {
        long jM11385compositeOverOWjLjI;
        long jM11385compositeOverOWjLjI2;
        composer.startReplaceableGroup(1838505436);
        if ((i2 & 1) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            jM11385compositeOverOWjLjI = ColorKt.m11385compositeOverOWjLjI(Color.m11339copywmQWz5c$default(materialTheme.getColors(composer, 6).m8845getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m8850getSurface0d7_KjU());
        } else {
            jM11385compositeOverOWjLjI = j;
        }
        long jM11339copywmQWz5c$default = (i2 & 2) != 0 ? Color.m11339copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m8845getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jM11339copywmQWz5c$default2 = (i2 & 4) != 0 ? Color.m11339copywmQWz5c$default(jM11339copywmQWz5c$default, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        if ((i2 & 8) != 0) {
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            jM11385compositeOverOWjLjI2 = ColorKt.m11385compositeOverOWjLjI(Color.m11339copywmQWz5c$default(materialTheme2.getColors(composer, 6).m8845getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme2.getColors(composer, 6).m8850getSurface0d7_KjU());
        } else {
            jM11385compositeOverOWjLjI2 = j4;
        }
        long jM11339copywmQWz5c$default3 = (i2 & 16) != 0 ? Color.m11339copywmQWz5c$default(jM11339copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        long jM11339copywmQWz5c$default4 = (i2 & 32) != 0 ? Color.m11339copywmQWz5c$default(jM11339copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1838505436, i, -1, "androidx.compose.material.ChipDefaults.chipColors (Chip.kt:405)");
        }
        DefaultChipColors defaultChipColors = new DefaultChipColors(jM11385compositeOverOWjLjI, jM11339copywmQWz5c$default, jM11339copywmQWz5c$default2, jM11385compositeOverOWjLjI2, jM11339copywmQWz5c$default3, jM11339copywmQWz5c$default4, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultChipColors;
    }

    @Composable
    @NotNull
    /* renamed from: outlinedChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m8835outlinedChipColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1763922662);
        long jM8850getSurface0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m8850getSurface0d7_KjU() : j;
        long jM11339copywmQWz5c$default = (i2 & 2) != 0 ? Color.m11339copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m8845getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jM11339copywmQWz5c$default2 = (i2 & 4) != 0 ? Color.m11339copywmQWz5c$default(jM11339copywmQWz5c$default, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long j7 = (i2 & 8) != 0 ? jM8850getSurface0d7_KjU : j4;
        long jM11339copywmQWz5c$default3 = (i2 & 16) != 0 ? Color.m11339copywmQWz5c$default(jM11339copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        long jM11339copywmQWz5c$default4 = (i2 & 32) != 0 ? Color.m11339copywmQWz5c$default(jM11339copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1763922662, i, -1, "androidx.compose.material.ChipDefaults.outlinedChipColors (Chip.kt:437)");
        }
        ChipColors chipColorsM8829chipColors5tl4gsc = m8829chipColors5tl4gsc(jM8850getSurface0d7_KjU, jM11339copywmQWz5c$default, jM11339copywmQWz5c$default2, j7, jM11339copywmQWz5c$default3, jM11339copywmQWz5c$default4, composer, i & 4194302, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipColorsM8829chipColors5tl4gsc;
    }

    @Composable
    @NotNull
    /* renamed from: filterChipColors-J08w3-E, reason: not valid java name */
    public final SelectableChipColors m8830filterChipColorsJ08w3E(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, @Nullable Composer composer, int i, int i2) {
        long jM11385compositeOverOWjLjI;
        long jM11385compositeOverOWjLjI2;
        composer.startReplaceableGroup(830140629);
        if ((i2 & 1) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            jM11385compositeOverOWjLjI = ColorKt.m11385compositeOverOWjLjI(Color.m11339copywmQWz5c$default(materialTheme.getColors(composer, 6).m8845getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m8850getSurface0d7_KjU());
        } else {
            jM11385compositeOverOWjLjI = j;
        }
        long jM11339copywmQWz5c$default = (i2 & 2) != 0 ? Color.m11339copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m8845getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jM11339copywmQWz5c$default2 = (i2 & 4) != 0 ? Color.m11339copywmQWz5c$default(jM11339copywmQWz5c$default, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        if ((i2 & 8) != 0) {
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            jM11385compositeOverOWjLjI2 = ColorKt.m11385compositeOverOWjLjI(Color.m11339copywmQWz5c$default(materialTheme2.getColors(composer, 6).m8845getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme2.getColors(composer, 6).m8850getSurface0d7_KjU());
        } else {
            jM11385compositeOverOWjLjI2 = j4;
        }
        long jM11339copywmQWz5c$default3 = (i2 & 16) != 0 ? Color.m11339copywmQWz5c$default(jM11339copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        long jM11339copywmQWz5c$default4 = (i2 & 32) != 0 ? Color.m11339copywmQWz5c$default(jM11339copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long jM11385compositeOverOWjLjI3 = (i2 & 64) != 0 ? ColorKt.m11385compositeOverOWjLjI(Color.m11339copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m8845getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), jM11385compositeOverOWjLjI) : j7;
        long jM11385compositeOverOWjLjI4 = (i2 & 128) != 0 ? ColorKt.m11385compositeOverOWjLjI(Color.m11339copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m8845getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), jM11339copywmQWz5c$default) : j8;
        long jM11385compositeOverOWjLjI5 = (i2 & 256) != 0 ? ColorKt.m11385compositeOverOWjLjI(Color.m11339copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m8845getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), jM11339copywmQWz5c$default2) : j9;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(830140629, i, -1, "androidx.compose.material.ChipDefaults.filterChipColors (Chip.kt:485)");
        }
        DefaultSelectableChipColors defaultSelectableChipColors = new DefaultSelectableChipColors(jM11385compositeOverOWjLjI, jM11339copywmQWz5c$default, jM11339copywmQWz5c$default2, jM11385compositeOverOWjLjI2, jM11339copywmQWz5c$default3, jM11339copywmQWz5c$default4, jM11385compositeOverOWjLjI3, jM11385compositeOverOWjLjI4, jM11385compositeOverOWjLjI5, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSelectableChipColors;
    }

    @Composable
    @NotNull
    /* renamed from: outlinedFilterChipColors-J08w3-E, reason: not valid java name */
    public final SelectableChipColors m8836outlinedFilterChipColorsJ08w3E(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(346878099);
        long jM8850getSurface0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m8850getSurface0d7_KjU() : j;
        long jM11339copywmQWz5c$default = (i2 & 2) != 0 ? Color.m11339copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m8845getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jM11339copywmQWz5c$default2 = (i2 & 4) != 0 ? Color.m11339copywmQWz5c$default(jM11339copywmQWz5c$default, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long j10 = (i2 & 8) != 0 ? jM8850getSurface0d7_KjU : j4;
        long jM11339copywmQWz5c$default3 = (i2 & 16) != 0 ? Color.m11339copywmQWz5c$default(jM11339copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        long jM11339copywmQWz5c$default4 = (i2 & 32) != 0 ? Color.m11339copywmQWz5c$default(jM11339copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long jM11385compositeOverOWjLjI = (i2 & 64) != 0 ? ColorKt.m11385compositeOverOWjLjI(Color.m11339copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m8845getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), jM8850getSurface0d7_KjU) : j7;
        long jM11385compositeOverOWjLjI2 = (i2 & 128) != 0 ? ColorKt.m11385compositeOverOWjLjI(Color.m11339copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m8845getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), jM11339copywmQWz5c$default) : j8;
        long jM11385compositeOverOWjLjI3 = (i2 & 256) != 0 ? ColorKt.m11385compositeOverOWjLjI(Color.m11339copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m8845getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), jM11339copywmQWz5c$default2) : j9;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(346878099, i, -1, "androidx.compose.material.ChipDefaults.outlinedFilterChipColors (Chip.kt:532)");
        }
        DefaultSelectableChipColors defaultSelectableChipColors = new DefaultSelectableChipColors(jM8850getSurface0d7_KjU, jM11339copywmQWz5c$default, jM11339copywmQWz5c$default2, j10, jM11339copywmQWz5c$default3, jM11339copywmQWz5c$default4, jM11385compositeOverOWjLjI, jM11385compositeOverOWjLjI2, jM11385compositeOverOWjLjI3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSelectableChipColors;
    }

    @Composable
    @JvmName(name = "getOutlinedBorder")
    @NotNull
    public final BorderStroke getOutlinedBorder(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1650225597);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1650225597, i, -1, "androidx.compose.material.ChipDefaults.<get-outlinedBorder> (Chip.kt:549)");
        }
        BorderStroke borderStrokeM7798BorderStrokecXLIe8U = BorderStrokeKt.m7798BorderStrokecXLIe8U(OutlinedBorderSize, Color.m11339copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m8845getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return borderStrokeM7798BorderStrokecXLIe8U;
    }

    /* renamed from: getOutlinedBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m8833getOutlinedBorderSizeD9Ej5fM() {
        return OutlinedBorderSize;
    }

    /* renamed from: getLeadingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m8831getLeadingIconSizeD9Ej5fM() {
        return LeadingIconSize;
    }

    /* renamed from: getSelectedIconSize-D9Ej5fM, reason: not valid java name */
    public final float m8834getSelectedIconSizeD9Ej5fM() {
        return SelectedIconSize;
    }
}
