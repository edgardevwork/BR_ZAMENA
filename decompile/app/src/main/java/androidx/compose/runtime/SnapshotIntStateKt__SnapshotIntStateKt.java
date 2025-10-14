package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SnapshotIntState.kt */
@Metadata(m7104d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a#\u0010\u0004\u001a\u00020\u0003*\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0086\n\u001a+\u0010\n\u001a\u00020\u000b*\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n¨\u0006\f"}, m7105d2 = {"mutableIntStateOf", "Landroidx/compose/runtime/MutableIntState;", "value", "", "getValue", "Landroidx/compose/runtime/IntState;", "thisObj", "", "property", "Lkotlin/reflect/KProperty;", "setValue", "", "runtime_release"}, m7106k = 5, m7107mv = {1, 8, 0}, m7109xi = 48, m7110xs = "androidx/compose/runtime/SnapshotIntStateKt")
/* loaded from: classes.dex */
public final /* synthetic */ class SnapshotIntStateKt__SnapshotIntStateKt {
    @StateFactoryMarker
    @NotNull
    public static final MutableIntState mutableIntStateOf(int i) {
        return ActualAndroid_androidKt.createSnapshotMutableIntState(i);
    }

    public static final int getValue(@NotNull IntState intState, @Nullable Object obj, @NotNull KProperty<?> kProperty) {
        return intState.getIntValue();
    }

    public static final void setValue(@NotNull MutableIntState mutableIntState, @Nullable Object obj, @NotNull KProperty<?> kProperty, int i) {
        mutableIntState.setIntValue(i);
    }
}
