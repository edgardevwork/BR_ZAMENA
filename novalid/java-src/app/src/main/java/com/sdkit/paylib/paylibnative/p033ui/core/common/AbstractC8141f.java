package com.sdkit.paylib.paylibnative.p033ui.core.common;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* renamed from: com.sdkit.paylib.paylibnative.ui.core.common.f */
/* loaded from: classes5.dex */
public abstract class AbstractC8141f implements InterfaceC8140e {

    /* renamed from: a */
    public final InterfaceC8139d f1979a;

    /* renamed from: b */
    public final C8137b f1980b;

    /* renamed from: c */
    public final MutableStateFlow f1981c;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.core.common.f$a */
    /* loaded from: classes7.dex */
    public static final class a extends SuspendLambda implements Function1 {

        /* renamed from: a */
        public Object f1982a;

        /* renamed from: b */
        public int f1983b;

        public a(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Object invoke(Continuation continuation) {
            return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return AbstractC8141f.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1983b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC8139d interfaceC8139d = AbstractC8141f.this.f1979a;
                this.f1983b = 1;
                obj = interfaceC8139d.mo2031a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = this.f1982a;
                    ResultKt.throwOnFailure(obj);
                    return obj2;
                }
                ResultKt.throwOnFailure(obj);
            }
            MutableStateFlow mutableStateFlowM2034b = AbstractC8141f.this.m2034b();
            this.f1982a = obj;
            this.f1983b = 2;
            return mutableStateFlowM2034b.emit(obj, this) == coroutine_suspended ? coroutine_suspended : obj;
        }
    }

    public AbstractC8141f(InterfaceC8139d action, C8137b gmarktRequestWrapper) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(gmarktRequestWrapper, "gmarktRequestWrapper");
        this.f1979a = action;
        this.f1980b = gmarktRequestWrapper;
        this.f1981c = StateFlowKt.MutableStateFlow(null);
    }

    /* renamed from: b */
    public MutableStateFlow m2034b() {
        return this.f1981c;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.core.common.InterfaceC8140e
    /* renamed from: a */
    public Flow mo2032a() {
        return this.f1980b.m2025a(new a(null));
    }
}
