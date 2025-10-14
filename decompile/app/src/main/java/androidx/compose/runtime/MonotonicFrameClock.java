package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MonotonicFrameClock.kt */
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ7\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u0002H\u00070\tH¦@¢\u0006\u0002\u0010\u000eR\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, m7105d2 = {"Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/coroutines/CoroutineContext$Element;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "withFrameNanos", "R", "onFrame", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "frameTimeNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Key", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public interface MonotonicFrameClock extends CoroutineContext.Element {

    /* renamed from: Key, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Nullable
    <R> Object withFrameNanos(@NotNull Function1<? super Long, ? extends R> function1, @NotNull Continuation<? super R> continuation);

    /* compiled from: MonotonicFrameClock.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        public static <R> R fold(@NotNull MonotonicFrameClock monotonicFrameClock, R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.DefaultImpls.fold(monotonicFrameClock, r, function2);
        }

        @Nullable
        public static <E extends CoroutineContext.Element> E get(@NotNull MonotonicFrameClock monotonicFrameClock, @NotNull CoroutineContext.Key<E> key) {
            return (E) CoroutineContext.Element.DefaultImpls.get(monotonicFrameClock, key);
        }

        @NotNull
        public static CoroutineContext minusKey(@NotNull MonotonicFrameClock monotonicFrameClock, @NotNull CoroutineContext.Key<?> key) {
            return CoroutineContext.Element.DefaultImpls.minusKey(monotonicFrameClock, key);
        }

        @NotNull
        public static CoroutineContext plus(@NotNull MonotonicFrameClock monotonicFrameClock, @NotNull CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.plus(monotonicFrameClock, coroutineContext);
        }

        @Deprecated
        @NotNull
        public static CoroutineContext.Key<?> getKey(@NotNull MonotonicFrameClock monotonicFrameClock) {
            return MonotonicFrameClock.super.getKey();
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    default CoroutineContext.Key<?> getKey() {
        return INSTANCE;
    }

    /* compiled from: MonotonicFrameClock.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m7105d2 = {"Landroidx/compose/runtime/MonotonicFrameClock$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Landroidx/compose/runtime/MonotonicFrameClock;", "()V", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.runtime.MonotonicFrameClock$Key, reason: from kotlin metadata */
    /* loaded from: classes2.dex */
    public static final class Companion implements CoroutineContext.Key<MonotonicFrameClock> {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
