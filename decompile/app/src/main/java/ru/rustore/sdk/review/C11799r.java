package ru.rustore.sdk.review;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.reactive.single.SingleEmitter;
import ru.rustore.sdk.review.model.ReviewInfo;

/* renamed from: ru.rustore.sdk.review.r */
/* loaded from: classes8.dex */
public final class C11799r extends Lambda implements Function1<ReviewInfo, Unit> {

    /* renamed from: a */
    public final /* synthetic */ SingleEmitter<ReviewInfo> f11033a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11799r(SingleEmitter<ReviewInfo> singleEmitter) {
        super(1);
        this.f11033a = singleEmitter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ReviewInfo reviewInfo) {
        ReviewInfo reviewInfo2 = reviewInfo;
        Intrinsics.checkNotNullParameter(reviewInfo2, "reviewInfo");
        this.f11033a.success(reviewInfo2);
        return Unit.INSTANCE;
    }
}
