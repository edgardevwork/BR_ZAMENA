package ru.rustore.sdk.billingclient.impl.data.provider;

import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import ru.p068vk.store.sdk.lib.payment.info.aidl.model.C11824a;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.provider.i */
/* loaded from: classes8.dex */
public final class C11465i extends Lambda implements Function1<C11824a, Unit> {

    /* renamed from: a */
    public final /* synthetic */ CancellableContinuation<C11824a> f10270a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11465i(CancellableContinuationImpl cancellableContinuationImpl) {
        super(1);
        this.f10270a = cancellableContinuationImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C11824a c11824a) {
        C11824a payInfo = c11824a;
        Intrinsics.checkNotNullParameter(payInfo, "payInfo");
        if (this.f10270a.isActive()) {
            CancellableContinuation<C11824a> cancellableContinuation = this.f10270a;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m15699constructorimpl(payInfo));
        }
        return Unit.INSTANCE;
    }
}
