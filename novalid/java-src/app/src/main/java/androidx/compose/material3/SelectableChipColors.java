package androidx.compose.material3;

import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Chip.kt */
@Immutable
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J%\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0092\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J%\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J%\u0010!\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010 J%\u0010#\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010 R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\f\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\n\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\r\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u000e\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u000f\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, m7105d2 = {"Landroidx/compose/material3/SelectableChipColors;", "", "containerColor", "Landroidx/compose/ui/graphics/Color;", "labelColor", "leadingIconColor", "trailingIconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "(JJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "Landroidx/compose/runtime/State;", "enabled", "", "selected", "containerColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "copy", "copy-daRQuJA", "(JJJJJJJJJJJJJ)Landroidx/compose/material3/SelectableChipColors;", "equals", "other", "hashCode", "", "labelColor-WaAFU9c$material3_release", "(ZZ)J", "leadingIconContentColor", "leadingIconContentColor-WaAFU9c$material3_release", "trailingIconContentColor", "trailingIconContentColor-WaAFU9c$material3_release", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/SelectableChipColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2741:1\n658#2:2742\n646#2:2743\n658#2:2744\n646#2:2745\n658#2:2746\n646#2:2747\n658#2:2748\n646#2:2749\n658#2:2750\n646#2:2751\n658#2:2752\n646#2:2753\n658#2:2754\n646#2:2755\n658#2:2756\n646#2:2757\n658#2:2758\n646#2:2759\n658#2:2760\n646#2:2761\n658#2:2762\n646#2:2763\n658#2:2764\n646#2:2765\n658#2:2766\n646#2:2767\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/SelectableChipColors\n*L\n2545#1:2742\n2545#1:2743\n2546#1:2744\n2546#1:2745\n2547#1:2746\n2547#1:2747\n2548#1:2748\n2548#1:2749\n2549#1:2750\n2549#1:2751\n2550#1:2752\n2550#1:2753\n2551#1:2754\n2551#1:2755\n2552#1:2756\n2552#1:2757\n2553#1:2758\n2553#1:2759\n2554#1:2760\n2554#1:2761\n2555#1:2762\n2555#1:2763\n2556#1:2764\n2556#1:2765\n2557#1:2766\n2557#1:2767\n*E\n"})
/* loaded from: classes2.dex */
public final class SelectableChipColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long disabledContainerColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledSelectedContainerColor;
    private final long disabledTrailingIconColor;
    private final long labelColor;
    private final long leadingIconColor;
    private final long selectedContainerColor;
    private final long selectedLabelColor;
    private final long selectedLeadingIconColor;
    private final long selectedTrailingIconColor;
    private final long trailingIconColor;

    public /* synthetic */ SelectableChipColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13);
    }

    private SelectableChipColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.containerColor = j;
        this.labelColor = j2;
        this.leadingIconColor = j3;
        this.trailingIconColor = j4;
        this.disabledContainerColor = j5;
        this.disabledLabelColor = j6;
        this.disabledLeadingIconColor = j7;
        this.disabledTrailingIconColor = j8;
        this.selectedContainerColor = j9;
        this.disabledSelectedContainerColor = j10;
        this.selectedLabelColor = j11;
        this.selectedLeadingIconColor = j12;
        this.selectedTrailingIconColor = j13;
    }

    @Composable
    @NotNull
    public final State<Color> containerColor$material3_release(boolean z, boolean z2, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-2126903408);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2126903408, i, -1, "androidx.compose.material3.SelectableChipColors.containerColor (Chip.kt:2566)");
        }
        if (!z) {
            j = z2 ? this.disabledSelectedContainerColor : this.disabledContainerColor;
        } else if (!z2) {
            j = this.containerColor;
        } else {
            j = this.selectedContainerColor;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m11330boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    /* renamed from: labelColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m9729labelColorWaAFU9c$material3_release(boolean enabled, boolean selected) {
        if (!enabled) {
            return this.disabledLabelColor;
        }
        if (!selected) {
            return this.labelColor;
        }
        return this.selectedLabelColor;
    }

    /* renamed from: leadingIconContentColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m9730leadingIconContentColorWaAFU9c$material3_release(boolean enabled, boolean selected) {
        if (!enabled) {
            return this.disabledLeadingIconColor;
        }
        if (!selected) {
            return this.leadingIconColor;
        }
        return this.selectedLeadingIconColor;
    }

    /* renamed from: trailingIconContentColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m9731trailingIconContentColorWaAFU9c$material3_release(boolean enabled, boolean selected) {
        if (!enabled) {
            return this.disabledTrailingIconColor;
        }
        if (!selected) {
            return this.trailingIconColor;
        }
        return this.selectedTrailingIconColor;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof SelectableChipColors)) {
            return false;
        }
        SelectableChipColors selectableChipColors = (SelectableChipColors) other;
        return Color.m11341equalsimpl0(this.containerColor, selectableChipColors.containerColor) && Color.m11341equalsimpl0(this.labelColor, selectableChipColors.labelColor) && Color.m11341equalsimpl0(this.leadingIconColor, selectableChipColors.leadingIconColor) && Color.m11341equalsimpl0(this.trailingIconColor, selectableChipColors.trailingIconColor) && Color.m11341equalsimpl0(this.disabledContainerColor, selectableChipColors.disabledContainerColor) && Color.m11341equalsimpl0(this.disabledLabelColor, selectableChipColors.disabledLabelColor) && Color.m11341equalsimpl0(this.disabledLeadingIconColor, selectableChipColors.disabledLeadingIconColor) && Color.m11341equalsimpl0(this.disabledTrailingIconColor, selectableChipColors.disabledTrailingIconColor) && Color.m11341equalsimpl0(this.selectedContainerColor, selectableChipColors.selectedContainerColor) && Color.m11341equalsimpl0(this.disabledSelectedContainerColor, selectableChipColors.disabledSelectedContainerColor) && Color.m11341equalsimpl0(this.selectedLabelColor, selectableChipColors.selectedLabelColor) && Color.m11341equalsimpl0(this.selectedLeadingIconColor, selectableChipColors.selectedLeadingIconColor) && Color.m11341equalsimpl0(this.selectedTrailingIconColor, selectableChipColors.selectedTrailingIconColor);
    }

    public int hashCode() {
        return (((((((((((((((((((((((Color.m11347hashCodeimpl(this.containerColor) * 31) + Color.m11347hashCodeimpl(this.labelColor)) * 31) + Color.m11347hashCodeimpl(this.leadingIconColor)) * 31) + Color.m11347hashCodeimpl(this.trailingIconColor)) * 31) + Color.m11347hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m11347hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m11347hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m11347hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m11347hashCodeimpl(this.selectedContainerColor)) * 31) + Color.m11347hashCodeimpl(this.disabledSelectedContainerColor)) * 31) + Color.m11347hashCodeimpl(this.selectedLabelColor)) * 31) + Color.m11347hashCodeimpl(this.selectedLeadingIconColor)) * 31) + Color.m11347hashCodeimpl(this.selectedTrailingIconColor);
    }

    @NotNull
    /* renamed from: copy-daRQuJA, reason: not valid java name */
    public final SelectableChipColors m9728copydaRQuJA(long containerColor, long labelColor, long leadingIconColor, long trailingIconColor, long disabledContainerColor, long disabledLabelColor, long disabledLeadingIconColor, long disabledTrailingIconColor, long selectedContainerColor, long disabledSelectedContainerColor, long selectedLabelColor, long selectedLeadingIconColor, long selectedTrailingIconColor) {
        Color.Companion companion = Color.INSTANCE;
        return new SelectableChipColors(containerColor != companion.m11376getUnspecified0d7_KjU() ? containerColor : this.containerColor, labelColor != companion.m11376getUnspecified0d7_KjU() ? labelColor : this.labelColor, leadingIconColor != companion.m11376getUnspecified0d7_KjU() ? leadingIconColor : this.leadingIconColor, trailingIconColor != companion.m11376getUnspecified0d7_KjU() ? trailingIconColor : this.trailingIconColor, disabledContainerColor != companion.m11376getUnspecified0d7_KjU() ? disabledContainerColor : this.disabledContainerColor, disabledLabelColor != companion.m11376getUnspecified0d7_KjU() ? disabledLabelColor : this.disabledLabelColor, disabledLeadingIconColor != companion.m11376getUnspecified0d7_KjU() ? disabledLeadingIconColor : this.disabledLeadingIconColor, disabledTrailingIconColor != companion.m11376getUnspecified0d7_KjU() ? disabledTrailingIconColor : this.disabledTrailingIconColor, selectedContainerColor != companion.m11376getUnspecified0d7_KjU() ? selectedContainerColor : this.selectedContainerColor, disabledSelectedContainerColor != companion.m11376getUnspecified0d7_KjU() ? disabledSelectedContainerColor : this.disabledSelectedContainerColor, selectedLabelColor != companion.m11376getUnspecified0d7_KjU() ? selectedLabelColor : this.selectedLabelColor, selectedLeadingIconColor != companion.m11376getUnspecified0d7_KjU() ? selectedLeadingIconColor : this.selectedLeadingIconColor, selectedTrailingIconColor != companion.m11376getUnspecified0d7_KjU() ? selectedTrailingIconColor : this.selectedTrailingIconColor, null);
    }
}
