package io.ktor.utils.p050io.internal;

import androidx.concurrent.futures.C2081xc40028dd;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AwaitingSlot.kt */
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\b\u0000\u0018\u00002\u00020\u0010B\u0007¢\u0006\u0004\b\u0001\u0010\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0002J!\u0010\f\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m7105d2 = {"Lio/ktor/utils/io/internal/AwaitingSlot;", SegmentConstantPool.INITSTRING, "()V", "", "cause", "", "cancel", "(Ljava/lang/Throwable;)V", "resume", "Lkotlin/Function0;", "", "sleepCondition", "sleep", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trySuspend", "ktor-io", ""}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class AwaitingSlot {
    public static final /* synthetic */ AtomicReferenceFieldUpdater suspension$FU = AtomicReferenceFieldUpdater.newUpdater(AwaitingSlot.class, Object.class, "suspension");

    @NotNull
    private volatile /* synthetic */ Object suspension = null;

    /* compiled from: AwaitingSlot.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.internal.AwaitingSlot", m7120f = "AwaitingSlot.kt", m7121i = {0}, m7122l = {24}, m7123m = "sleep", m7124n = {"this"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.utils.io.internal.AwaitingSlot$sleep$1 */
    /* loaded from: classes6.dex */
    public static final class C105011 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C105011(Continuation<? super C105011> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AwaitingSlot.this.sleep(null, this);
        }
    }

    /* compiled from: AwaitingSlot.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.internal.AwaitingSlot", m7120f = "AwaitingSlot.kt", m7121i = {0}, m7122l = {57}, m7123m = "trySuspend", m7124n = {"suspended"}, m7125s = {"I$0"})
    /* renamed from: io.ktor.utils.io.internal.AwaitingSlot$trySuspend$1 */
    /* loaded from: classes6.dex */
    public static final class C105021 extends ContinuationImpl {
        public int I$0;
        public int label;
        public /* synthetic */ Object result;

        public C105021(Continuation<? super C105021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AwaitingSlot.this.trySuspend(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sleep(@NotNull Function0<Boolean> function0, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C105011 c105011;
        AwaitingSlot awaitingSlot;
        if (continuation instanceof C105011) {
            c105011 = (C105011) continuation;
            int i = c105011.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105011.label = i - Integer.MIN_VALUE;
            } else {
                c105011 = new C105011(continuation);
            }
        }
        Object objTrySuspend = c105011.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c105011.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objTrySuspend);
            c105011.L$0 = this;
            c105011.label = 1;
            objTrySuspend = trySuspend(function0, c105011);
            if (objTrySuspend == coroutine_suspended) {
                return coroutine_suspended;
            }
            awaitingSlot = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            awaitingSlot = (AwaitingSlot) c105011.L$0;
            ResultKt.throwOnFailure(objTrySuspend);
        }
        if (((Boolean) objTrySuspend).booleanValue()) {
            return Unit.INSTANCE;
        }
        awaitingSlot.resume();
        return Unit.INSTANCE;
    }

    public final void resume() {
        CompletableJob completableJob = (CompletableJob) suspension$FU.getAndSet(this, null);
        if (completableJob != null) {
            completableJob.complete();
        }
    }

    public final void cancel(@Nullable Throwable cause) {
        CompletableJob completableJob = (CompletableJob) suspension$FU.getAndSet(this, null);
        if (completableJob == null) {
            return;
        }
        if (cause != null) {
            completableJob.completeExceptionally(cause);
        } else {
            completableJob.complete();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object trySuspend(Function0<Boolean> function0, Continuation<? super Boolean> continuation) throws Throwable {
        C105021 c105021;
        int i;
        if (continuation instanceof C105021) {
            c105021 = (C105021) continuation;
            int i2 = c105021.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c105021.label = i2 - Integer.MIN_VALUE;
            } else {
                c105021 = new C105021(continuation);
            }
        }
        Object obj = c105021.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c105021.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
            if (C2081xc40028dd.m347m(suspension$FU, this, null, completableJobJob$default) && function0.invoke().booleanValue()) {
                c105021.I$0 = 1;
                c105021.label = 1;
                if (completableJobJob$default.join(c105021) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = 1;
            } else {
                i = 0;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c105021.I$0;
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxBoolean(i != 0);
    }
}
