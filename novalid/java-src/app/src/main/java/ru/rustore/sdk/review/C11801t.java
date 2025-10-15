package ru.rustore.sdk.review;

import android.content.Context;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.reactive.single.SingleEmitter;
import ru.rustore.sdk.review.model.ReviewInfo;

/* renamed from: ru.rustore.sdk.review.t */
/* loaded from: classes8.dex */
public final class C11801t extends Lambda implements Function1<SingleEmitter<ReviewInfo>, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C11805x f11035a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11801t(C11805x c11805x) {
        super(1);
        this.f11035a = c11805x;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SingleEmitter<ReviewInfo> singleEmitter) {
        Object objM15699constructorimpl;
        SingleEmitter<ReviewInfo> emitter = singleEmitter;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        C11805x c11805x = this.f11035a;
        try {
            Result.Companion companion = Result.INSTANCE;
            Context context = c11805x.f11042a;
            String applicationId = c11805x.f11043b;
            Intrinsics.checkNotNullExpressionValue(applicationId, "applicationId");
            C11805x.m7559a(c11805x, c11805x.f11042a, new C11798q(emitter), new ServiceConnectionC11786e(context, applicationId, new C11799r(emitter), new C11800s(emitter)));
            objM15699constructorimpl = Result.m15699constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM15699constructorimpl);
        if (thM15702exceptionOrNullimpl != null) {
            emitter.error(thM15702exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
