package kotlin.collections;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SlidingWindow.kt */
@Metadata(m7104d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001aH\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u0006\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001aD\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u000e\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¨\u0006\u000f"}, m7105d2 = {"checkWindowSizeStep", "", "size", "", "step", "windowedIterator", "", "", ExifInterface.GPS_DIRECTION_TRUE, "iterator", "partialWindows", "", "reuseBuffer", "windowedSequence", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class SlidingWindowKt {
    public static final void checkWindowSizeStep(int i, int i2) {
        String str;
        if (i <= 0 || i2 <= 0) {
            if (i != i2) {
                str = "Both size " + i + " and step " + i2 + " must be greater than zero.";
            } else {
                str = "size " + i + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    @NotNull
    public static final <T> Sequence<List<T>> windowedSequence(@NotNull final Sequence<? extends T> sequence, final int i, final int i2, final boolean z, final boolean z2) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        checkWindowSizeStep(i, i2);
        return new Sequence<List<? extends T>>() { // from class: kotlin.collections.SlidingWindowKt$windowedSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<List<? extends T>> iterator() {
                return SlidingWindowKt.windowedIterator(sequence.iterator(), i, i2, z, z2);
            }
        };
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SlidingWindow.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/sequences/SequenceScope;", ""}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", m7120f = "SlidingWindow.kt", m7121i = {0, 0, 0, 2, 2, 3, 3}, m7122l = {34, 40, 49, 55, 58}, m7123m = "invokeSuspend", m7124n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, m7125s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
    /* renamed from: kotlin.collections.SlidingWindowKt$windowedIterator$1 */
    /* loaded from: classes8.dex */
    public static final class C105841<T> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super List<? extends T>>, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Iterator<T> $iterator;
        public final /* synthetic */ boolean $partialWindows;
        public final /* synthetic */ boolean $reuseBuffer;
        public final /* synthetic */ int $size;
        public final /* synthetic */ int $step;
        public int I$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C105841(int i, int i2, Iterator<? extends T> it, boolean z, boolean z2, Continuation<? super C105841> continuation) {
            super(2, continuation);
            this.$size = i;
            this.$step = i2;
            this.$iterator = it;
            this.$reuseBuffer = z;
            this.$partialWindows = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C105841 c105841 = new C105841(this.$size, this.$step, this.$iterator, this.$reuseBuffer, this.$partialWindows, continuation);
            c105841.L$0 = obj;
            return c105841;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SequenceScope<? super List<? extends T>> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C105841) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00d8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x014f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a2 -> B:16:0x0055). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0118 -> B:59:0x011b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0146 -> B:72:0x0149). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            RingBuffer ringBuffer;
            Iterator<T> it;
            SequenceScope sequenceScope;
            SequenceScope sequenceScope2;
            int i;
            ArrayList arrayList;
            Iterator<T> it2;
            int i2;
            RingBuffer ringBuffer2;
            SequenceScope sequenceScope3;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                SequenceScope sequenceScope4 = (SequenceScope) this.L$0;
                int iCoerceAtMost = RangesKt___RangesKt.coerceAtMost(this.$size, 1024);
                int i4 = this.$step - this.$size;
                if (i4 >= 0) {
                    sequenceScope2 = sequenceScope4;
                    i = 0;
                    arrayList = new ArrayList(iCoerceAtMost);
                    it2 = this.$iterator;
                    i2 = i4;
                    while (it2.hasNext()) {
                    }
                    if (!arrayList.isEmpty()) {
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 2;
                        if (sequenceScope2.yield(arrayList, this) == coroutine_suspended) {
                        }
                    }
                    return Unit.INSTANCE;
                }
                ringBuffer = new RingBuffer(iCoerceAtMost);
                it = this.$iterator;
                sequenceScope = sequenceScope4;
                while (it.hasNext()) {
                }
                if (this.$partialWindows) {
                }
                return Unit.INSTANCE;
            }
            if (i3 == 1) {
                i2 = this.I$0;
                it2 = (Iterator) this.L$2;
                arrayList = (ArrayList) this.L$1;
                sequenceScope2 = (SequenceScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                i = i2;
                if (this.$reuseBuffer) {
                    arrayList = new ArrayList(this.$size);
                } else {
                    arrayList.clear();
                }
                i2 = i;
                while (it2.hasNext()) {
                    T next = it2.next();
                    if (i > 0) {
                        i--;
                    } else {
                        arrayList.add(next);
                        if (arrayList.size() == this.$size) {
                            this.L$0 = sequenceScope2;
                            this.L$1 = arrayList;
                            this.L$2 = it2;
                            this.I$0 = i2;
                            this.label = 1;
                            if (sequenceScope2.yield(arrayList, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i = i2;
                            if (this.$reuseBuffer) {
                            }
                            i2 = i;
                            while (it2.hasNext()) {
                            }
                        }
                    }
                }
                if ((!arrayList.isEmpty()) && (this.$partialWindows || arrayList.size() == this.$size)) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                    if (sequenceScope2.yield(arrayList, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i3 != 2) {
                if (i3 == 3) {
                    it = (Iterator) this.L$2;
                    ringBuffer = (RingBuffer) this.L$1;
                    sequenceScope = (SequenceScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    ringBuffer.removeFirst(this.$step);
                    while (it.hasNext()) {
                        ringBuffer.add((RingBuffer) it.next());
                        if (ringBuffer.isFull()) {
                            int size = ringBuffer.size();
                            int i5 = this.$size;
                            if (size >= i5) {
                                RandomAccess arrayList2 = this.$reuseBuffer ? ringBuffer : new ArrayList(ringBuffer);
                                this.L$0 = sequenceScope;
                                this.L$1 = ringBuffer;
                                this.L$2 = it;
                                this.label = 3;
                                if (sequenceScope.yield(arrayList2, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                ringBuffer.removeFirst(this.$step);
                                while (it.hasNext()) {
                                }
                            } else {
                                ringBuffer = ringBuffer.expanded(i5);
                            }
                        }
                    }
                    if (this.$partialWindows) {
                        ringBuffer2 = ringBuffer;
                        sequenceScope3 = sequenceScope;
                        if (ringBuffer2.size() <= this.$step) {
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i3 == 4) {
                    ringBuffer2 = (RingBuffer) this.L$1;
                    sequenceScope3 = (SequenceScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    ringBuffer2.removeFirst(this.$step);
                    if (ringBuffer2.size() <= this.$step) {
                        RandomAccess arrayList3 = this.$reuseBuffer ? ringBuffer2 : new ArrayList(ringBuffer2);
                        this.L$0 = sequenceScope3;
                        this.L$1 = ringBuffer2;
                        this.L$2 = null;
                        this.label = 4;
                        if (sequenceScope3.yield(arrayList3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ringBuffer2.removeFirst(this.$step);
                        if (ringBuffer2.size() <= this.$step) {
                            if (!ringBuffer2.isEmpty()) {
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 5;
                                if (sequenceScope3.yield(ringBuffer2, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                } else if (i3 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final <T> Iterator<List<T>> windowedIterator(@NotNull Iterator<? extends T> iterator, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return !iterator.hasNext() ? EmptyIterator.INSTANCE : SequencesKt__SequenceBuilderKt.iterator(new C105841(i, i2, iterator, z2, z, null));
    }
}
