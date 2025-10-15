package ru.rustore.sdk.billingclient.impl.utils;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import ru.rustore.sdk.core.util.CancellableContinuationExtKt;

/* renamed from: ru.rustore.sdk.billingclient.impl.utils.f */
/* loaded from: classes5.dex */
public final class C11554f extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: a */
    public final /* synthetic */ CancellableContinuation<Object> f10603a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11554f(CancellableContinuationImpl cancellableContinuationImpl) {
        super(1);
        this.f10603a = cancellableContinuationImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        Throwable error = th;
        Intrinsics.checkNotNullParameter(error, "error");
        CancellableContinuationExtKt.resumeWithExceptionIfActive(this.f10603a, error);
        return Unit.INSTANCE;
    }
}
