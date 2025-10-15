package androidx.compose.material;

import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Chip.kt */
@Immutable
@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ#\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0002\u0010\u0012J#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0002\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\n\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u000b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, m7105d2 = {"Landroidx/compose/material/DefaultSelectableChipColors;", "Landroidx/compose/material/SelectableChipColors;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "contentColor", "leadingIconColor", "disabledBackgroundColor", "disabledContentColor", "disabledLeadingIconColor", "selectedBackgroundColor", "selectedContentColor", "selectedLeadingIconColor", "(JJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "Landroidx/compose/runtime/State;", "enabled", "", "selected", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "equals", "other", "", "hashCode", "", "material_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@ExperimentalMaterialApi
/* loaded from: classes3.dex */
public final class DefaultSelectableChipColors implements SelectableChipColors {
    public final long backgroundColor;
    public final long contentColor;
    public final long disabledBackgroundColor;
    public final long disabledContentColor;
    public final long disabledLeadingIconColor;
    public final long leadingIconColor;
    public final long selectedBackgroundColor;
    public final long selectedContentColor;
    public final long selectedLeadingIconColor;

    public /* synthetic */ DefaultSelectableChipColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9);
    }

    public DefaultSelectableChipColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.backgroundColor = j;
        this.contentColor = j2;
        this.leadingIconColor = j3;
        this.disabledBackgroundColor = j4;
        this.disabledContentColor = j5;
        this.disabledLeadingIconColor = j6;
        this.selectedBackgroundColor = j7;
        this.selectedContentColor = j8;
        this.selectedLeadingIconColor = j9;
    }

    @Override // androidx.compose.material.SelectableChipColors
    @Composable
    @NotNull
    public State<Color> backgroundColor(boolean z, boolean z2, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-403836585);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-403836585, i, -1, "androidx.compose.material.DefaultSelectableChipColors.backgroundColor (Chip.kt:661)");
        }
        if (!z) {
            j = this.disabledBackgroundColor;
        } else if (!z2) {
            j = this.backgroundColor;
        } else {
            j = this.selectedBackgroundColor;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m11330boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.SelectableChipColors
    @Composable
    @NotNull
    public State<Color> contentColor(boolean z, boolean z2, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(2025240134);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2025240134, i, -1, "androidx.compose.material.DefaultSelectableChipColors.contentColor (Chip.kt:671)");
        }
        if (!z) {
            j = this.disabledContentColor;
        } else if (!z2) {
            j = this.contentColor;
        } else {
            j = this.selectedContentColor;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m11330boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.SelectableChipColors
    @Composable
    @NotNull
    public State<Color> leadingIconColor(boolean z, boolean z2, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(189838188);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(189838188, i, -1, "androidx.compose.material.DefaultSelectableChipColors.leadingIconColor (Chip.kt:681)");
        }
        if (!z) {
            j = this.disabledLeadingIconColor;
        } else if (!z2) {
            j = this.leadingIconColor;
        } else {
            j = this.selectedLeadingIconColor;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m11330boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || DefaultSelectableChipColors.class != other.getClass()) {
            return false;
        }
        DefaultSelectableChipColors defaultSelectableChipColors = (DefaultSelectableChipColors) other;
        return Color.m11341equalsimpl0(this.backgroundColor, defaultSelectableChipColors.backgroundColor) && Color.m11341equalsimpl0(this.contentColor, defaultSelectableChipColors.contentColor) && Color.m11341equalsimpl0(this.leadingIconColor, defaultSelectableChipColors.leadingIconColor) && Color.m11341equalsimpl0(this.disabledBackgroundColor, defaultSelectableChipColors.disabledBackgroundColor) && Color.m11341equalsimpl0(this.disabledContentColor, defaultSelectableChipColors.disabledContentColor) && Color.m11341equalsimpl0(this.disabledLeadingIconColor, defaultSelectableChipColors.disabledLeadingIconColor) && Color.m11341equalsimpl0(this.selectedBackgroundColor, defaultSelectableChipColors.selectedBackgroundColor) && Color.m11341equalsimpl0(this.selectedContentColor, defaultSelectableChipColors.selectedContentColor) && Color.m11341equalsimpl0(this.selectedLeadingIconColor, defaultSelectableChipColors.selectedLeadingIconColor);
    }

    public int hashCode() {
        return (((((((((((((((Color.m11347hashCodeimpl(this.backgroundColor) * 31) + Color.m11347hashCodeimpl(this.contentColor)) * 31) + Color.m11347hashCodeimpl(this.leadingIconColor)) * 31) + Color.m11347hashCodeimpl(this.disabledBackgroundColor)) * 31) + Color.m11347hashCodeimpl(this.disabledContentColor)) * 31) + Color.m11347hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m11347hashCodeimpl(this.selectedBackgroundColor)) * 31) + Color.m11347hashCodeimpl(this.selectedContentColor)) * 31) + Color.m11347hashCodeimpl(this.selectedLeadingIconColor);
    }
}
