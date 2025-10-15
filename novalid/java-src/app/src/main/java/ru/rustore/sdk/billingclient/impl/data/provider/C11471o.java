package ru.rustore.sdk.billingclient.impl.data.provider;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.provider.o */
/* loaded from: classes8.dex */
public final class C11471o extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: a */
    public final /* synthetic */ CancellableContinuation<String> f10279a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11471o(CancellableContinuationImpl cancellableContinuationImpl) {
        super(1);
        this.f10279a = cancellableContinuationImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        Throwable error = th;
        Intrinsics.checkNotNullParameter(error, "error");
        if (this.f10279a.isActive()) {
            CancellableContinuation<String> cancellableContinuation = this.f10279a;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m15699constructorimpl(ResultKt.createFailure(error)));
        }
        return Unit.INSTANCE;
    }
}
