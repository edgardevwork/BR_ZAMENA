package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Transform.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class FlowKt__TransformKt$runningFold$1$1<T> implements FlowCollector {
    public final /* synthetic */ Ref.ObjectRef<R> $accumulator;
    public final /* synthetic */ Function3<R, T, Continuation<? super R>, Object> $operation;
    public final /* synthetic */ FlowCollector<R> $this_unsafeFlow;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__TransformKt$runningFold$1$1(Ref.ObjectRef<R> objectRef, Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3, FlowCollector<? super R> flowCollector) {
        this.$accumulator = objectRef;
        this.$operation = function3;
        this.$this_unsafeFlow = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        FlowKt__TransformKt$runningFold$1$1$emit$1 flowKt__TransformKt$runningFold$1$1$emit$1;
        FlowKt__TransformKt$runningFold$1$1<T> flowKt__TransformKt$runningFold$1$1;
        Ref.ObjectRef objectRef;
        if (continuation instanceof FlowKt__TransformKt$runningFold$1$1$emit$1) {
            flowKt__TransformKt$runningFold$1$1$emit$1 = (FlowKt__TransformKt$runningFold$1$1$emit$1) continuation;
            int i = flowKt__TransformKt$runningFold$1$1$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$runningFold$1$1$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__TransformKt$runningFold$1$1$emit$1 = new FlowKt__TransformKt$runningFold$1$1$emit$1(this, continuation);
            }
        }
        T t2 = (T) flowKt__TransformKt$runningFold$1$1$emit$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = flowKt__TransformKt$runningFold$1$1$emit$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(t2);
            Ref.ObjectRef objectRef2 = this.$accumulator;
            Function3<R, T, Continuation<? super R>, Object> function3 = this.$operation;
            T t3 = objectRef2.element;
            flowKt__TransformKt$runningFold$1$1$emit$1.L$0 = this;
            flowKt__TransformKt$runningFold$1$1$emit$1.L$1 = objectRef2;
            flowKt__TransformKt$runningFold$1$1$emit$1.label = 1;
            Object objInvoke = function3.invoke(t3, t, flowKt__TransformKt$runningFold$1$1$emit$1);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            flowKt__TransformKt$runningFold$1$1 = this;
            t2 = (T) objInvoke;
            objectRef = objectRef2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(t2);
                return Unit.INSTANCE;
            }
            objectRef = (Ref.ObjectRef) flowKt__TransformKt$runningFold$1$1$emit$1.L$1;
            flowKt__TransformKt$runningFold$1$1 = (FlowKt__TransformKt$runningFold$1$1) flowKt__TransformKt$runningFold$1$1$emit$1.L$0;
            ResultKt.throwOnFailure(t2);
        }
        objectRef.element = t2;
        FlowCollector<R> flowCollector = flowKt__TransformKt$runningFold$1$1.$this_unsafeFlow;
        T t4 = flowKt__TransformKt$runningFold$1$1.$accumulator.element;
        flowKt__TransformKt$runningFold$1$1$emit$1.L$0 = null;
        flowKt__TransformKt$runningFold$1$1$emit$1.L$1 = null;
        flowKt__TransformKt$runningFold$1$1$emit$1.label = 2;
        if (flowCollector.emit(t4, flowKt__TransformKt$runningFold$1$1$emit$1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
