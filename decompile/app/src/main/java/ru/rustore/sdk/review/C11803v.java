package ru.rustore.sdk.review;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.review.model.ReviewInfo;

/* renamed from: ru.rustore.sdk.review.v */
/* loaded from: classes8.dex */
public final class C11803v extends Lambda implements Function1<Unit, Single<Unit>> {

    /* renamed from: a */
    public final /* synthetic */ C11805x f11038a;

    /* renamed from: b */
    public final /* synthetic */ ReviewInfo f11039b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11803v(C11805x c11805x, ReviewInfo reviewInfo) {
        super(1);
        this.f11038a = c11805x;
        this.f11039b = reviewInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Single<Unit> invoke(Unit unit) {
        Unit it = unit;
        Intrinsics.checkNotNullParameter(it, "it");
        C11805x c11805x = this.f11038a;
        ReviewInfo reviewInfo = this.f11039b;
        c11805x.getClass();
        return Single.INSTANCE.create(new C11802u(c11805x, reviewInfo));
    }
}
