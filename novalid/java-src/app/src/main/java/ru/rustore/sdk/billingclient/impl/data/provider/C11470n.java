package ru.rustore.sdk.billingclient.impl.data.provider;

import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.provider.n */
/* loaded from: classes8.dex */
public final class C11470n extends Lambda implements Function1<String, Unit> {

    /* renamed from: a */
    public final /* synthetic */ CancellableContinuation<String> f10278a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11470n(CancellableContinuationImpl cancellableContinuationImpl) {
        super(1);
        this.f10278a = cancellableContinuationImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String token = str;
        Intrinsics.checkNotNullParameter(token, "token");
        if (this.f10278a.isActive()) {
            CancellableContinuation<String> cancellableContinuation = this.f10278a;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m15699constructorimpl(token));
        }
        return Unit.INSTANCE;
    }
}
