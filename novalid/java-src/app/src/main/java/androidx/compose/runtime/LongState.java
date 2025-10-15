package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: SnapshotLongState.kt */
@Stable
@Metadata(m7104d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0012\u0010\u0003\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0003"}, m7105d2 = {"Landroidx/compose/runtime/LongState;", "Landroidx/compose/runtime/State;", "", "longValue", "getLongValue", "()J", "value", "getValue", "()Ljava/lang/Long;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public interface LongState extends State<Long> {
    long getLongValue();

    static /* synthetic */ long access$getValue$jd(LongState longState) {
        return super.getValue().longValue();
    }

    /* compiled from: SnapshotLongState.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
        @Deprecated
        @NotNull
        public static Long getValue(@NotNull LongState longState) {
            return Long.valueOf(LongState.access$getValue$jd(longState));
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
    @NotNull
    default Long getValue() {
        return Long.valueOf(getLongValue());
    }
}
