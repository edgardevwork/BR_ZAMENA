package io.ktor.utils.p050io.jvm.javaio;

import androidx.concurrent.futures.C2081xc40028dd;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.EventLoopKt;
import kotlinx.coroutines.Job;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Blocking.kt */
@Metadata(m7104d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\"\u0018\u00002\u00020\u0010B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007H¤@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0084Hø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u000bJ\r\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001fR\u0016\u0010!\u001a\u0004\u0018\u00010 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010\u001e\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00058\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b'\u0010(R$\u0010\u001d\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00058\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\b)\u0010(R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010*\u001a\u0004\b+\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, m7105d2 = {"Lio/ktor/utils/io/jvm/javaio/BlockingAdapter;", "Lkotlinx/coroutines/Job;", "parent", SegmentConstantPool.INITSTRING, "(Lkotlinx/coroutines/Job;)V", "", "rc", "", "finish", "(I)V", "loop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/Thread;", "thread", "parkingLoop", "(Ljava/lang/Thread;)V", "", "rendezvous", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/Continuation;", "ucont", "rendezvousBlock", "shutdown", "()V", "jobToken", "submitAndAwait", "(Ljava/lang/Object;)I", "", "buffer", TypedValues.CycleType.S_WAVE_OFFSET, CacheFileMetadataIndex.COLUMN_LENGTH, "([BII)I", "Lkotlinx/coroutines/DisposableHandle;", "disposable", "Lkotlinx/coroutines/DisposableHandle;", "end", "Lkotlin/coroutines/Continuation;", "<set-?>", "I", "getLength", "()I", "getOffset", "Lkotlinx/coroutines/Job;", "getParent", "()Lkotlinx/coroutines/Job;", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBlocking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Blocking.kt\nio/ktor/utils/io/jvm/javaio/BlockingAdapter\n+ 2 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n*L\n1#1,316:1\n164#2,4:317\n164#2,4:321\n*S KotlinDebug\n*F\n+ 1 Blocking.kt\nio/ktor/utils/io/jvm/javaio/BlockingAdapter\n*L\n209#1:317,4\n285#1:321,4\n*E\n"})
/* loaded from: classes5.dex */
public abstract class BlockingAdapter {
    public static final /* synthetic */ AtomicReferenceFieldUpdater state$FU = AtomicReferenceFieldUpdater.newUpdater(BlockingAdapter.class, Object.class, "state");

    @Nullable
    public final DisposableHandle disposable;

    @NotNull
    public final Continuation<Unit> end;
    public int length;
    public int offset;

    @Nullable
    public final Job parent;

    @NotNull
    volatile /* synthetic */ int result;

    @NotNull
    volatile /* synthetic */ Object state;

    public BlockingAdapter() {
        this(null, 1, null);
    }

    public static /* synthetic */ void getState$annotations() {
    }

    @Nullable
    public abstract Object loop(@NotNull Continuation<? super Unit> continuation);

    public BlockingAdapter(@Nullable Job job) {
        this.parent = job;
        Continuation<Unit> continuation = new Continuation<Unit>() { // from class: io.ktor.utils.io.jvm.javaio.BlockingAdapter$end$1

            @NotNull
            public final CoroutineContext context;

            {
                this.context = this.this$0.getParent() != null ? UnsafeBlockingTrampoline.INSTANCE.plus(this.this$0.getParent()) : UnsafeBlockingTrampoline.INSTANCE;
            }

            @Override // kotlin.coroutines.Continuation
            @NotNull
            public CoroutineContext getContext() {
                return this.context;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.Continuation
            public void resumeWith(@NotNull Object result) {
                Object obj;
                boolean z;
                Throwable thM15702exceptionOrNullimpl;
                Job parent;
                Object objM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(result);
                if (objM15702exceptionOrNullimpl == null) {
                    objM15702exceptionOrNullimpl = Unit.INSTANCE;
                }
                BlockingAdapter blockingAdapter = this.this$0;
                do {
                    obj = blockingAdapter.state;
                    z = obj instanceof Thread;
                    if (!(z ? true : obj instanceof Continuation ? true : Intrinsics.areEqual(obj, this))) {
                        return;
                    }
                } while (!C2081xc40028dd.m347m(BlockingAdapter.state$FU, blockingAdapter, obj, objM15702exceptionOrNullimpl));
                if (z) {
                    PollersKt.getParkingImpl().unpark(obj);
                } else if ((obj instanceof Continuation) && (thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(result)) != null) {
                    Result.Companion companion = Result.INSTANCE;
                    ((Continuation) obj).resumeWith(Result.m15699constructorimpl(ResultKt.createFailure(thM15702exceptionOrNullimpl)));
                }
                if (Result.m15705isFailureimpl(result) && !(Result.m15702exceptionOrNullimpl(result) instanceof CancellationException) && (parent = this.this$0.getParent()) != null) {
                    Job.DefaultImpls.cancel$default(parent, (CancellationException) null, 1, (Object) null);
                }
                DisposableHandle disposableHandle = this.this$0.disposable;
                if (disposableHandle != null) {
                    disposableHandle.dispose();
                }
            }
        };
        this.end = continuation;
        this.state = this;
        this.result = 0;
        this.disposable = job != null ? job.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: io.ktor.utils.io.jvm.javaio.BlockingAdapter$disposable$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
                if (th != null) {
                    Continuation continuation2 = this.this$0.end;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m15699constructorimpl(ResultKt.createFailure(th)));
                }
            }
        }) : null;
        ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(new BlockingAdapter$block$1(this, null), 1)).invoke(continuation);
        if (this.state == this) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public /* synthetic */ BlockingAdapter(Job job, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : job);
    }

    @Nullable
    public final Job getParent() {
        return this.parent;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getLength() {
        return this.length;
    }

    public final void shutdown() {
        DisposableHandle disposableHandle = this.disposable;
        if (disposableHandle != null) {
            disposableHandle.dispose();
        }
        Continuation<Unit> continuation = this.end;
        Result.Companion companion = Result.INSTANCE;
        continuation.resumeWith(Result.m15699constructorimpl(ResultKt.createFailure(new CancellationException("Stream closed"))));
    }

    public final int submitAndAwait(@NotNull byte[] buffer, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.offset = i;
        this.length = i2;
        return submitAndAwait(buffer);
    }

    public final int submitAndAwait(@NotNull Object jobToken) throws Throwable {
        Object obj;
        Object noWhenBranchMatchedException;
        Intrinsics.checkNotNullParameter(jobToken, "jobToken");
        Thread thread = Thread.currentThread();
        Continuation continuation = null;
        do {
            obj = this.state;
            if (obj instanceof Continuation) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any>");
                continuation = (Continuation) obj;
                noWhenBranchMatchedException = thread;
            } else {
                if (obj instanceof Unit) {
                    return this.result;
                }
                if (obj instanceof Throwable) {
                    throw ((Throwable) obj);
                }
                if (obj instanceof Thread) {
                    throw new IllegalStateException("There is already thread owning adapter");
                }
                if (Intrinsics.areEqual(obj, this)) {
                    throw new IllegalStateException("Not yet started");
                }
                noWhenBranchMatchedException = new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNullExpressionValue(noWhenBranchMatchedException, "when (value) {\n         …Exception()\n            }");
        } while (!C2081xc40028dd.m347m(state$FU, this, obj, noWhenBranchMatchedException));
        Intrinsics.checkNotNull(continuation);
        Result.Companion companion = Result.INSTANCE;
        continuation.resumeWith(Result.m15699constructorimpl(jobToken));
        Intrinsics.checkNotNullExpressionValue(thread, "thread");
        parkingLoop(thread);
        Object obj2 = this.state;
        if (obj2 instanceof Throwable) {
            throw ((Throwable) obj2);
        }
        return this.result;
    }

    public final void parkingLoop(Thread thread) {
        if (this.state != thread) {
            return;
        }
        if (!PollersKt.isParkingAllowed()) {
            BlockingKt.getADAPTER_LOGGER().warn("Blocking network thread detected. \nIt can possible lead to a performance decline or even a deadlock.\nPlease make sure you're using blocking IO primitives like InputStream and OutputStream only in \nthe context of Dispatchers.IO:\n```\nwithContext(Dispatchers.IO) {\n    myInputStream.read()\n}\n```");
        }
        while (true) {
            long jProcessNextEventInCurrentThread = EventLoopKt.processNextEventInCurrentThread();
            if (this.state != thread) {
                return;
            }
            if (jProcessNextEventInCurrentThread > 0) {
                PollersKt.getParkingImpl().park(jProcessNextEventInCurrentThread);
            }
        }
    }

    @Nullable
    public final Object rendezvous(int i, @NotNull Continuation<Object> continuation) {
        this.result = i;
        Object objRendezvousBlock = rendezvousBlock(continuation);
        if (objRendezvousBlock == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objRendezvousBlock;
    }

    public final Object rendezvous$$forInline(int i, Continuation<Object> continuation) {
        this.result = i;
        InlineMarker.mark(0);
        Object objRendezvousBlock = rendezvousBlock(continuation);
        if (objRendezvousBlock == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        InlineMarker.mark(1);
        return objRendezvousBlock;
    }

    public final void finish(int rc) {
        this.result = rc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object rendezvousBlock(Continuation<Object> ucont) {
        Object obj;
        Continuation continuationIntercepted;
        Object obj2 = null;
        while (true) {
            Object obj3 = this.state;
            if (obj3 instanceof Thread) {
                continuationIntercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(ucont);
                obj = obj3;
            } else {
                if (!Intrinsics.areEqual(obj3, this)) {
                    throw new IllegalStateException("Already suspended or in finished state");
                }
                obj = obj2;
                continuationIntercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(ucont);
            }
            if (C2081xc40028dd.m347m(state$FU, this, obj3, continuationIntercepted)) {
                if (obj != null) {
                    PollersKt.getParkingImpl().unpark(obj);
                }
                return IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            }
            obj2 = obj;
        }
    }
}
