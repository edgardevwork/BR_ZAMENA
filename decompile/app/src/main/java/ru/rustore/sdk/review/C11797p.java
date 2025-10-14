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

/* renamed from: ru.rustore.sdk.review.p */
/* loaded from: classes8.dex */
public final class C11797p extends Lambda implements Function1<SingleEmitter<Unit>, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C11805x f11030a;

    /* renamed from: b */
    public final /* synthetic */ ReviewInfo f11031b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11797p(C11805x c11805x, ReviewInfo reviewInfo) {
        super(1);
        this.f11030a = c11805x;
        this.f11031b = reviewInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SingleEmitter<Unit> singleEmitter) {
        Object objM15699constructorimpl;
        SingleEmitter<Unit> emitter = singleEmitter;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        C11805x c11805x = this.f11030a;
        ReviewInfo reviewInfo = this.f11031b;
        try {
            Result.Companion companion = Result.INSTANCE;
            Context context = c11805x.f11042a;
            String applicationId = c11805x.f11043b;
            Intrinsics.checkNotNullExpressionValue(applicationId, "applicationId");
            C11805x.m7559a(c11805x, c11805x.f11042a, new C11794m(emitter), new ServiceConnectionC11782a(context, reviewInfo, applicationId, new C11795n(emitter), new C11796o(emitter)));
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
