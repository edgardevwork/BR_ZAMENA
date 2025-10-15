package io.ktor.util.cio;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlinx.coroutines.sync.SemaphoreKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Semaphore.kt */
@Deprecated(level = DeprecationLevel.ERROR, message = "Ktor Semaphore is deprecated and will be removed in ktor 2.0.0. Consider using kotlinx.coroutines Semaphore instead.", replaceWith = @ReplaceWith(expression = "Semaphore", imports = {"kotlinx.coroutines.sync.Semaphore"}))
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\b\u0010\r\u001a\u00020\nH\u0007J\u0006\u0010\u000e\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m7105d2 = {"Lio/ktor/util/cio/Semaphore;", "", "limit", "", "(I)V", "delegate", "Lkotlinx/coroutines/sync/Semaphore;", "getLimit", "()I", "acquire", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enter", "leave", "release", "ktor-utils"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class Semaphore {

    @NotNull
    public final kotlinx.coroutines.sync.Semaphore delegate;
    public final int limit;

    public Semaphore(int i) {
        this.limit = i;
        this.delegate = SemaphoreKt.Semaphore$default(i, 0, 2, null);
    }

    public final int getLimit() {
        return this.limit;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Ktor Semaphore is deprecated and will be removed in ktor 2.0.0. Consider using kotlinx.coroutines Semaphore instead.", replaceWith = @ReplaceWith(expression = "acquire()", imports = {"kotlinx.coroutines.sync.Semaphore"}))
    @Nullable
    public final Object enter(@NotNull Continuation<? super Unit> continuation) {
        Object objAcquire = this.delegate.acquire(continuation);
        return objAcquire == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAcquire : Unit.INSTANCE;
    }

    @Nullable
    public final Object acquire(@NotNull Continuation<? super Unit> continuation) {
        Object objAcquire = this.delegate.acquire(continuation);
        return objAcquire == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAcquire : Unit.INSTANCE;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Ktor Semaphore is deprecated and will be removed in ktor 2.0.0. Consider using kotlinx.coroutines Semaphore instead.", replaceWith = @ReplaceWith(expression = "release()", imports = {"kotlinx.coroutines.sync.Semaphore"}))
    public final void leave() {
        this.delegate.release();
    }

    public final void release() {
        this.delegate.release();
    }
}
