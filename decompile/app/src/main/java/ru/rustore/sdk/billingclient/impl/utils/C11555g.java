package ru.rustore.sdk.billingclient.impl.utils;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import ru.rustore.sdk.core.util.CancellableContinuationExtKt;

/* renamed from: ru.rustore.sdk.billingclient.impl.utils.g */
/* loaded from: classes5.dex */
public final class C11555g extends Lambda implements Function1<Object, Unit> {

    /* renamed from: a */
    public final /* synthetic */ CancellableContinuation<Object> f10604a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11555g(CancellableContinuationImpl cancellableContinuationImpl) {
        super(1);
        this.f10604a = cancellableContinuationImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        CancellableContinuationExtKt.resumeIfActive(this.f10604a, obj);
        return Unit.INSTANCE;
    }
}
