package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Composer.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, m7105d2 = {"Landroidx/compose/runtime/RememberObserverHolder;", "", "wrapped", "Landroidx/compose/runtime/RememberObserver;", "(Landroidx/compose/runtime/RememberObserver;)V", "getWrapped", "()Landroidx/compose/runtime/RememberObserver;", "setWrapped", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class RememberObserverHolder {
    public static final int $stable = 8;

    @NotNull
    private RememberObserver wrapped;

    public RememberObserverHolder(@NotNull RememberObserver rememberObserver) {
        this.wrapped = rememberObserver;
    }

    @NotNull
    public final RememberObserver getWrapped() {
        return this.wrapped;
    }

    public final void setWrapped(@NotNull RememberObserver rememberObserver) {
        this.wrapped = rememberObserver;
    }
}
