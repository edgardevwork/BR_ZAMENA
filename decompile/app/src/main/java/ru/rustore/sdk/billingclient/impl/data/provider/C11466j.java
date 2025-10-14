package ru.rustore.sdk.billingclient.impl.data.provider;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import ru.p068vk.store.sdk.lib.payment.info.aidl.model.C11824a;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.provider.j */
/* loaded from: classes8.dex */
public final class C11466j extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: a */
    public final /* synthetic */ CancellableContinuation<C11824a> f10271a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11466j(CancellableContinuationImpl cancellableContinuationImpl) {
        super(1);
        this.f10271a = cancellableContinuationImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        Throwable error = th;
        Intrinsics.checkNotNullParameter(error, "error");
        if (this.f10271a.isActive()) {
            CancellableContinuation<C11824a> cancellableContinuation = this.f10271a;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m15699constructorimpl(ResultKt.createFailure(error)));
        }
        return Unit.INSTANCE;
    }
}
