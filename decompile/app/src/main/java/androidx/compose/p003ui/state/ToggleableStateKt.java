package androidx.compose.p003ui.state;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ToggleableState.kt */
@Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m7105d2 = {"ToggleableState", "Landroidx/compose/ui/state/ToggleableState;", "value", "", "ui_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class ToggleableStateKt {
    @NotNull
    public static final ToggleableState ToggleableState(boolean z) {
        return z ? ToggleableState.On : ToggleableState.Off;
    }
}
