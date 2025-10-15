package com.sdkit.paylib.paylibplatform.impl.coroutines;

import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

/* renamed from: com.sdkit.paylib.paylibplatform.impl.coroutines.a */
/* loaded from: classes8.dex */
public final class C8589a implements CoroutineDispatchers {

    /* renamed from: a */
    public final Lazy f5788a = LazyKt__LazyJVMKt.lazy(new a());

    /* renamed from: com.sdkit.paylib.paylibplatform.impl.coroutines.a$a */
    /* loaded from: classes5.dex */
    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher invoke() {
            return C8589a.this.createSingleThreadDispatcher("sequentialWork");
        }
    }

    /* renamed from: a */
    public static final Thread m4656a(String threadName, Runnable runnable) {
        Intrinsics.checkNotNullParameter(threadName, "$threadName");
        return new Thread(runnable, threadName);
    }

    @Override // com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers
    public CoroutineDispatcher createSingleThreadDispatcher(final String threadName) {
        Intrinsics.checkNotNullParameter(threadName, "threadName");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.sdkit.paylib.paylibplatform.impl.coroutines.a$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return C8589a.m4656a(threadName, runnable);
            }
        });
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor …threadName)\n            }");
        return ExecutorsKt.from(executorServiceNewSingleThreadExecutor);
    }

    @Override // com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers
    public CoroutineDispatcher getDefault() {
        return CoroutineDispatchers.DefaultImpls.getDefault(this);
    }

    @Override // com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers
    public CoroutineDispatcher getIo() {
        return CoroutineDispatchers.DefaultImpls.getIo(this);
    }

    @Override // com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers
    public CoroutineDispatcher getSequentialWork() {
        return (CoroutineDispatcher) this.f5788a.getValue();
    }

    @Override // com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers
    public CoroutineDispatcher getUi() {
        return CoroutineDispatchers.DefaultImpls.getUi(this);
    }

    @Override // com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers
    public CoroutineDispatcher getUiImmediate() {
        return CoroutineDispatchers.DefaultImpls.getUiImmediate(this);
    }
}
