package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlinx.coroutines.DebugStringsKt;
import org.apache.commons.lang3.ObjectUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Atomic.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0001H&J\b\u0010\t\u001a\u00020\nH\u0016R\u0018\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m7105d2 = {"Lkotlinx/coroutines/internal/OpDescriptor;", "", "()V", "atomicOp", "Lkotlinx/coroutines/internal/AtomicOp;", "getAtomicOp", "()Lkotlinx/coroutines/internal/AtomicOp;", "perform", "affected", "toString", "", "kotlinx-coroutines-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public abstract class OpDescriptor {
    @Nullable
    public abstract AtomicOp<?> getAtomicOp();

    @Nullable
    public abstract Object perform(@Nullable Object affected);

    @NotNull
    public String toString() {
        return DebugStringsKt.getClassSimpleName(this) + ObjectUtils.AT_SIGN + DebugStringsKt.getHexAddress(this);
    }
}
