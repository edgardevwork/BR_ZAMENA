package com.sdkit.paylib.paylibnative.p033ui.core.common;

import com.sdkit.paylib.paylibdomain.api.entity.AsyncState;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.api.domain.entity.error.PaylibException;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* renamed from: com.sdkit.paylib.paylibnative.ui.core.common.b */
/* loaded from: classes8.dex */
public final class C8137b {

    /* renamed from: a */
    public final CoroutineDispatchers f1964a;

    /* renamed from: b */
    public final PaylibLogger f1965b;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.core.common.b$a */
    /* loaded from: classes6.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: a */
        public Object f1966a;

        /* renamed from: b */
        public Object f1967b;

        /* renamed from: c */
        public Object f1968c;

        /* renamed from: d */
        public /* synthetic */ Object f1969d;

        /* renamed from: f */
        public int f1971f;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f1969d = obj;
            this.f1971f |= Integer.MIN_VALUE;
            return C8137b.this.m2024a(null, null, this);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.core.common.b$b */
    /* loaded from: classes6.dex */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Exception f1972a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.f1972a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed! " + this.f1972a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.core.common.b$c */
    /* loaded from: classes7.dex */
    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f1973a;

        /* renamed from: b */
        public /* synthetic */ Object f1974b;

        /* renamed from: d */
        public final /* synthetic */ Function1 f1976d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f1976d = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((c) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = C8137b.this.new c(this.f1976d, continuation);
            cVar.f1974b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1973a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.f1974b;
                C8137b c8137b = C8137b.this;
                Function1 function1 = this.f1976d;
                this.f1973a = 1;
                if (c8137b.m2024a(flowCollector, function1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public C8137b(CoroutineDispatchers coroutineDispatchers, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f1964a = coroutineDispatchers;
        this.f1965b = loggerFactory.get("GmarktRequestWrapper");
    }

    /* renamed from: a */
    public final PaylibException m2023a(Exception exc) {
        return exc instanceof PaylibException ? (PaylibException) exc : new PaylibException(exc.getMessage(), null, exc);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(3:13|40|41)(2:14|15))(8:16|43|17|30|37|(1:39)|40|41))(1:21))(2:22|(1:24)(1:25))|45|26|(1:28)(6:29|30|37|(0)|40|41)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        r9 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2024a(FlowCollector flowCollector, Function1 function1, Continuation continuation) throws Exception {
        a aVar;
        C8137b c8137b;
        C8137b c8137b2;
        Object error;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.f1971f;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f1971f = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        }
        Object objInvoke = aVar.f1969d;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aVar.f1971f;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            AsyncState.Loading loading = AsyncState.Loading.INSTANCE;
            aVar.f1966a = this;
            aVar.f1967b = flowCollector;
            aVar.f1968c = function1;
            aVar.f1971f = 1;
            if (flowCollector.emit(loading, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            c8137b = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objInvoke);
                    return Unit.INSTANCE;
                }
                flowCollector = (FlowCollector) aVar.f1967b;
                c8137b2 = (C8137b) aVar.f1966a;
                try {
                    ResultKt.throwOnFailure(objInvoke);
                    error = new AsyncState.Content(objInvoke);
                } catch (Exception e) {
                    e = e;
                    if (!(e instanceof CancellationException)) {
                        throw e;
                    }
                    c8137b2.f1965b.mo1701e(e, new b(e));
                    error = new AsyncState.Error(c8137b2.m2023a(e));
                    aVar.f1966a = null;
                    aVar.f1967b = null;
                    aVar.f1968c = null;
                    aVar.f1971f = 3;
                    if (flowCollector.emit(error, aVar) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
                aVar.f1966a = null;
                aVar.f1967b = null;
                aVar.f1968c = null;
                aVar.f1971f = 3;
                if (flowCollector.emit(error, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            function1 = (Function1) aVar.f1968c;
            flowCollector = (FlowCollector) aVar.f1967b;
            c8137b = (C8137b) aVar.f1966a;
            ResultKt.throwOnFailure(objInvoke);
        }
        aVar.f1966a = c8137b;
        aVar.f1967b = flowCollector;
        aVar.f1968c = null;
        aVar.f1971f = 2;
        objInvoke = function1.invoke(aVar);
        if (objInvoke == coroutine_suspended) {
            return coroutine_suspended;
        }
        c8137b2 = c8137b;
        error = new AsyncState.Content(objInvoke);
        aVar.f1966a = null;
        aVar.f1967b = null;
        aVar.f1968c = null;
        aVar.f1971f = 3;
        if (flowCollector.emit(error, aVar) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* renamed from: a */
    public final Flow m2025a(Function1 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return FlowKt.flowOn(FlowKt.flow(new c(action, null)), this.f1964a.getIo());
    }
}
