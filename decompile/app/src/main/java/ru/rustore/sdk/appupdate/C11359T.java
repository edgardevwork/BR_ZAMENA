package ru.rustore.sdk.appupdate;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.core.tasks.OnCompletionListener;
import ru.rustore.sdk.core.tasks.Task;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;

/* renamed from: ru.rustore.sdk.appupdate.T */
/* loaded from: classes6.dex */
public final class C11359T {

    /* renamed from: ru.rustore.sdk.appupdate.T$a */
    /* loaded from: classes7.dex */
    public static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: a */
        public final /* synthetic */ Task<T>.TaskResultProvider f10062a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Task<T>.TaskResultProvider taskResultProvider) {
            super(1);
            this.f10062a = taskResultProvider;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            Throwable error = th;
            Intrinsics.checkNotNullParameter(error, "error");
            this.f10062a.setTaskErrorResult(error);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: ru.rustore.sdk.appupdate.T$b */
    /* loaded from: classes7.dex */
    public static final class b<T> extends Lambda implements Function1<T, Unit> {

        /* renamed from: a */
        public final /* synthetic */ Task<T>.TaskResultProvider f10063a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Task<T>.TaskResultProvider taskResultProvider) {
            super(1);
            this.f10063a = taskResultProvider;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            this.f10063a.setTaskSuccessResult(obj);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    /* renamed from: a */
    public static final <T> Task<T> m7428a(@NotNull Single<T> single) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Pair<Task<T>, Task<T>.TaskResultProvider> pairCreate = Task.INSTANCE.create();
        Task<T> taskComponent1 = pairCreate.component1();
        Task<T>.TaskResultProvider taskResultProviderComponent2 = pairCreate.component2();
        final Disposable disposableSubscribe = SingleSubscribeKt.subscribe(single, new a(taskResultProviderComponent2), new b(taskResultProviderComponent2));
        taskComponent1.addOnCompletionListener(new OnCompletionListener() { // from class: ru.rustore.sdk.appupdate.T$$ExternalSyntheticLambda0
            @Override // ru.rustore.sdk.core.tasks.OnCompletionListener
            public final void onComplete(Throwable th) {
                C11359T.m7429a(disposableSubscribe, th);
            }
        });
        return taskComponent1;
    }

    /* renamed from: a */
    public static final void m7429a(Disposable disposable, Throwable th) {
        Intrinsics.checkNotNullParameter(disposable, "$disposable");
        disposable.dispose();
    }
}
