package ru.rustore.sdk.billingclient.impl.utils;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11430h;
import ru.rustore.sdk.reactive.single.SingleEmitter;

/* renamed from: ru.rustore.sdk.billingclient.impl.utils.d */
/* loaded from: classes5.dex */
public final class C11552d extends Lambda implements Function1<SingleEmitter<Object>, Unit> {

    /* renamed from: a */
    public final /* synthetic */ Function1<Continuation<Object>, Object> f10601a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11552d(C11430h c11430h) {
        super(1);
        this.f10601a = c11430h;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SingleEmitter<Object> singleEmitter) {
        Object objM15699constructorimpl;
        SingleEmitter<Object> emitter = singleEmitter;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        Function1<Continuation<Object>, Object> function1 = this.f10601a;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM15699constructorimpl = Result.m15699constructorimpl(BuildersKt__BuildersKt.runBlocking$default(null, new C11551c(function1, null), 1, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m15706isSuccessimpl(objM15699constructorimpl)) {
            emitter.success(objM15699constructorimpl);
        }
        Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM15699constructorimpl);
        if (thM15702exceptionOrNullimpl != null) {
            emitter.error(thM15702exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
