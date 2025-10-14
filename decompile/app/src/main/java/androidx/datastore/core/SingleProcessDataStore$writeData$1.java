package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SingleProcessDataStore.kt */
@Metadata(m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
@DebugMetadata(m7119c = "androidx.datastore.core.SingleProcessDataStore", m7120f = "SingleProcessDataStore.kt", m7121i = {0, 0, 0}, m7122l = {426}, m7123m = "writeData$datastore_core", m7124n = {"this", "scratchFile", "stream"}, m7125s = {"L$0", "L$1", "L$4"})
/* loaded from: classes3.dex */
public final class SingleProcessDataStore$writeData$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$writeData$1(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super SingleProcessDataStore$writeData$1> continuation) {
        super(continuation);
        this.this$0 = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.writeData$datastore_core(null, this);
    }
}
