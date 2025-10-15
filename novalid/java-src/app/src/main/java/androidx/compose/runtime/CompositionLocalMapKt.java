package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandle;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CompositionLocalMap.kt */
@Metadata(m7104d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010\u0007\u001a \u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH\u0000\u001a%\u0010\r\u001a\u0002H\n\"\u0004\b\u0000\u0010\n*\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH\u0000¢\u0006\u0002\u0010\u000e\u001a=\u0010\u000f\u001a\u00020\u0001*\u00020\u00012.\u0010\u0010\u001a*\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00140\u0012\u0012\u0004\u0012\u00020\u00150\u0011H\u0080\b\u001a%\u0010\u0016\u001a\u0002H\n\"\u0004\b\u0000\u0010\n*\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH\u0000¢\u0006\u0002\u0010\u000e¨\u0006\u0017"}, m7105d2 = {"updateCompositionMap", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", SavedStateHandle.VALUES, "", "Landroidx/compose/runtime/ProvidedValue;", "parentScope", "previous", "([Landroidx/compose/runtime/ProvidedValue;Landroidx/compose/runtime/PersistentCompositionLocalMap;Landroidx/compose/runtime/PersistentCompositionLocalMap;)Landroidx/compose/runtime/PersistentCompositionLocalMap;", "contains", "", ExifInterface.GPS_DIRECTION_TRUE, "key", "Landroidx/compose/runtime/CompositionLocal;", "getValueOf", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "mutate", "mutator", "Lkotlin/Function1;", "", "", "Landroidx/compose/runtime/State;", "", "read", "runtime_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class CompositionLocalMapKt {
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.runtime.PersistentCompositionLocalMap] */
    @NotNull
    public static final PersistentCompositionLocalMap mutate(@NotNull PersistentCompositionLocalMap persistentCompositionLocalMap, @NotNull Function1<? super Map<CompositionLocal<Object>, State<Object>>, Unit> function1) {
        PersistentMap.Builder<CompositionLocal<Object>, State<? extends Object>> builderBuilder2 = persistentCompositionLocalMap.builder2();
        function1.invoke(builderBuilder2);
        return builderBuilder2.build2();
    }

    public static final <T> boolean contains(@NotNull PersistentCompositionLocalMap persistentCompositionLocalMap, @NotNull CompositionLocal<T> compositionLocal) {
        Intrinsics.checkNotNull(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        return persistentCompositionLocalMap.containsKey(compositionLocal);
    }

    public static final <T> T getValueOf(@NotNull PersistentCompositionLocalMap persistentCompositionLocalMap, @NotNull CompositionLocal<T> compositionLocal) {
        Intrinsics.checkNotNull(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        State<? extends Object> state = persistentCompositionLocalMap.get((Object) compositionLocal);
        if (state != null) {
            return (T) state.getValue();
        }
        return null;
    }

    public static final <T> T read(@NotNull PersistentCompositionLocalMap persistentCompositionLocalMap, @NotNull CompositionLocal<T> compositionLocal) {
        if (contains(persistentCompositionLocalMap, compositionLocal)) {
            return (T) getValueOf(persistentCompositionLocalMap, compositionLocal);
        }
        return compositionLocal.getDefaultValueHolder$runtime_release().getValue();
    }

    public static /* synthetic */ PersistentCompositionLocalMap updateCompositionMap$default(ProvidedValue[] providedValueArr, PersistentCompositionLocalMap persistentCompositionLocalMap, PersistentCompositionLocalMap persistentCompositionLocalMap2, int i, Object obj) {
        if ((i & 4) != 0) {
            persistentCompositionLocalMap2 = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();
        }
        return updateCompositionMap(providedValueArr, persistentCompositionLocalMap, persistentCompositionLocalMap2);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.runtime.PersistentCompositionLocalMap] */
    @NotNull
    public static final PersistentCompositionLocalMap updateCompositionMap(@NotNull ProvidedValue<?>[] providedValueArr, @NotNull PersistentCompositionLocalMap persistentCompositionLocalMap, @NotNull PersistentCompositionLocalMap persistentCompositionLocalMap2) {
        PersistentMap.Builder<CompositionLocal<Object>, State<? extends Object>> builderBuilder2 = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf().builder2();
        for (ProvidedValue<?> providedValue : providedValueArr) {
            CompositionLocal<?> compositionLocal = providedValue.getCompositionLocal();
            Intrinsics.checkNotNull(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            ProvidableCompositionLocal providableCompositionLocal = (ProvidableCompositionLocal) compositionLocal;
            if (providedValue.getCanOverride() || !contains(persistentCompositionLocalMap, providableCompositionLocal)) {
                builderBuilder2.put(providableCompositionLocal, providableCompositionLocal.updatedStateOf$runtime_release(providedValue.getValue(), (State) persistentCompositionLocalMap2.get((Object) providableCompositionLocal)));
            }
        }
        return builderBuilder2.build2();
    }
}
