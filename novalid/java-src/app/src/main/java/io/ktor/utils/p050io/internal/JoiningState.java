package io.ktor.utils.p050io.internal;

import androidx.concurrent.futures.C2081xc40028dd;
import io.ktor.utils.p050io.ByteBufferChannel;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ByteBufferChannelInternals.kt */
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\b\u0000\u0018\u00002\u00020\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m7105d2 = {"Lio/ktor/utils/io/internal/JoiningState;", "Lio/ktor/utils/io/ByteBufferChannel;", "delegatedTo", "", "delegateClose", SegmentConstantPool.INITSTRING, "(Lio/ktor/utils/io/ByteBufferChannel;Z)V", "", "awaitClose", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "complete", "()V", "Lkotlinx/coroutines/Job;", "getCloseWaitJob", "()Lkotlinx/coroutines/Job;", "closeWaitJob", "Z", "getDelegateClose", "()Z", "Lio/ktor/utils/io/ByteBufferChannel;", "getDelegatedTo", "()Lio/ktor/utils/io/ByteBufferChannel;", "ktor-io", ""}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class JoiningState {
    public static final /* synthetic */ AtomicReferenceFieldUpdater _closeWaitJob$FU = AtomicReferenceFieldUpdater.newUpdater(JoiningState.class, Object.class, "_closeWaitJob");

    @NotNull
    private volatile /* synthetic */ Object _closeWaitJob;

    @NotNull
    private volatile /* synthetic */ int closed;
    public final boolean delegateClose;

    @NotNull
    public final ByteBufferChannel delegatedTo;

    public JoiningState(@NotNull ByteBufferChannel delegatedTo, boolean z) {
        Intrinsics.checkNotNullParameter(delegatedTo, "delegatedTo");
        this.delegatedTo = delegatedTo;
        this.delegateClose = z;
        this._closeWaitJob = null;
        this.closed = 0;
    }

    public final boolean getDelegateClose() {
        return this.delegateClose;
    }

    @NotNull
    public final ByteBufferChannel getDelegatedTo() {
        return this.delegatedTo;
    }

    public final Job getCloseWaitJob() {
        CompletableJob completableJobJob$default;
        do {
            Job job = (Job) this._closeWaitJob;
            if (job != null) {
                return job;
            }
            completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        } while (!C2081xc40028dd.m347m(_closeWaitJob$FU, this, null, completableJobJob$default));
        if (this.closed == 1) {
            Job.DefaultImpls.cancel$default((Job) completableJobJob$default, (CancellationException) null, 1, (Object) null);
        }
        return completableJobJob$default;
    }

    public final void complete() {
        this.closed = 1;
        Job job = (Job) _closeWaitJob$FU.getAndSet(this, null);
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    @Nullable
    public final Object awaitClose(@NotNull Continuation<? super Unit> continuation) {
        Object objJoin;
        return (this.closed != 1 && (objJoin = getCloseWaitJob().join(continuation)) == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? objJoin : Unit.INSTANCE;
    }
}
