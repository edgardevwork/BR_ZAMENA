package androidx.compose.material3;

import androidx.annotation.FloatRange;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.HorizontalAlignmentLine;
import androidx.compose.p003ui.layout.Measured;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;

/* compiled from: SegmentedButton.kt */
@Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0097\u0001J!\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0097\u0001J\u0015\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0097\u0001J\r\u0010\u0010\u001a\u00020\u0006*\u00020\u0006H\u0097\u0001J!\u0010\u0011\u001a\u00020\u0006*\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0097\u0001¨\u0006\u0015"}, m7105d2 = {"Landroidx/compose/material3/SingleChoiceSegmentedButtonScopeWrapper;", "Landroidx/compose/material3/SingleChoiceSegmentedButtonRowScope;", "Landroidx/compose/foundation/layout/RowScope;", PomReader.SCOPE, "(Landroidx/compose/foundation/layout/RowScope;)V", "align", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment$Vertical;", "alignBy", "alignmentLineBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "alignmentLine", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "alignByBaseline", "weight", "", "fill", "", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class SingleChoiceSegmentedButtonScopeWrapper implements SingleChoiceSegmentedButtonRowScope, RowScope {
    public final /* synthetic */ RowScope $$delegate_0;

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier align(@NotNull Modifier modifier, @NotNull Alignment.Vertical vertical) {
        return this.$$delegate_0.align(modifier, vertical);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier alignBy(@NotNull Modifier modifier, @NotNull HorizontalAlignmentLine horizontalAlignmentLine) {
        return this.$$delegate_0.alignBy(modifier, horizontalAlignmentLine);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier alignBy(@NotNull Modifier modifier, @NotNull Function1<? super Measured, Integer> function1) {
        return this.$$delegate_0.alignBy(modifier, function1);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier alignByBaseline(@NotNull Modifier modifier) {
        return this.$$delegate_0.alignByBaseline(modifier);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier weight(@NotNull Modifier modifier, @FloatRange(from = 0.0d, fromInclusive = false) float f, boolean z) {
        return this.$$delegate_0.weight(modifier, f, z);
    }

    public SingleChoiceSegmentedButtonScopeWrapper(@NotNull RowScope rowScope) {
        this.$$delegate_0 = rowScope;
    }
}
