package com.sdkit.paylib.paylibnative.p033ui.common.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* renamed from: com.sdkit.paylib.paylibnative.ui.common.viewmodel.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8129a extends ViewModel {

    /* renamed from: a */
    public final MutableStateFlow f1942a = StateFlowKt.MutableStateFlow(mo1999a());

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.viewmodel.a$a */
    /* loaded from: classes7.dex */
    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f1943a;

        /* renamed from: b */
        public /* synthetic */ Object f1944b;

        /* renamed from: c */
        public final /* synthetic */ Function2 f1945c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f1945c = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(Object obj, Continuation continuation) {
            return ((a) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f1945c, continuation);
            aVar.f1944b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1943a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Object obj2 = this.f1944b;
                Function2 function2 = this.f1945c;
                this.f1943a = 1;
                if (function2.invoke(obj2, this) == coroutine_suspended) {
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

    /* renamed from: a */
    public abstract Object mo1999a();

    /* renamed from: a */
    public final void m2000a(Function1 reducer) {
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        MutableStateFlow mutableStateFlow = this.f1942a;
        mutableStateFlow.setValue(reducer.invoke(mutableStateFlow.getValue()));
    }

    /* renamed from: b */
    public final MutableStateFlow m2002b() {
        return this.f1942a;
    }

    /* renamed from: c */
    public final StateFlow m2003c() {
        return FlowKt.asStateFlow(this.f1942a);
    }

    /* renamed from: a */
    public final void m2001a(Flow flow, Function2 action) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        FlowKt.launchIn(FlowKt.onEach(flow, new a(action, null)), ViewModelKt.getViewModelScope(this));
    }
}
