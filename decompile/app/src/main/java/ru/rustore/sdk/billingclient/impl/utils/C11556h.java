package ru.rustore.sdk.billingclient.impl.utils;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuationImpl;
import ru.rustore.sdk.core.tasks.OnCompletionListener;
import ru.rustore.sdk.core.tasks.Task;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;

/* renamed from: ru.rustore.sdk.billingclient.impl.utils.h */
/* loaded from: classes7.dex */
public final class C11556h {

    /* renamed from: ru.rustore.sdk.billingclient.impl.utils.h$a */
    /* loaded from: classes5.dex */
    public static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: a */
        public final /* synthetic */ Task<T>.TaskResultProvider f10605a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Task<T>.TaskResultProvider taskResultProvider) {
            super(1);
            this.f10605a = taskResultProvider;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            Throwable error = th;
            Intrinsics.checkNotNullParameter(error, "error");
            this.f10605a.setTaskErrorResult(error);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.utils.h$b */
    /* loaded from: classes5.dex */
    public static final class b<T> extends Lambda implements Function1<T, Unit> {

        /* renamed from: a */
        public final /* synthetic */ Task<T>.TaskResultProvider f10606a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Task<T>.TaskResultProvider taskResultProvider) {
            super(1);
            this.f10606a = taskResultProvider;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            this.f10606a.setTaskSuccessResult(obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final Object m7480a(Single single, ContinuationImpl continuationImpl) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuationImpl), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new C11553e(SingleSubscribeKt.subscribe(single, new C11554f(cancellableContinuationImpl), new C11555g(cancellableContinuationImpl))));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return result;
    }

    /* renamed from: a */
    public static final <T> Task<T> m7481a(Single<T> single) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Pair<Task<T>, Task<T>.TaskResultProvider> pairCreate = Task.INSTANCE.create();
        Task<T> taskComponent1 = pairCreate.component1();
        Task<T>.TaskResultProvider taskResultProviderComponent2 = pairCreate.component2();
        final Disposable disposableSubscribe = SingleSubscribeKt.subscribe(single, new a(taskResultProviderComponent2), new b(taskResultProviderComponent2));
        taskComponent1.addOnCompletionListener(new OnCompletionListener() { // from class: ru.rustore.sdk.billingclient.impl.utils.h$$ExternalSyntheticLambda0
            @Override // ru.rustore.sdk.core.tasks.OnCompletionListener
            public final void onComplete(Throwable th) {
                C11556h.m7482a(disposableSubscribe, th);
            }
        });
        return taskComponent1;
    }

    /* renamed from: a */
    public static final void m7482a(Disposable disposable, Throwable th) {
        Intrinsics.checkNotNullParameter(disposable, "$disposable");
        disposable.dispose();
    }
}
