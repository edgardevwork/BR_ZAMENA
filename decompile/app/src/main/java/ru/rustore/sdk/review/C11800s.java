package ru.rustore.sdk.review;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.reactive.single.SingleEmitter;
import ru.rustore.sdk.review.model.ReviewInfo;

/* renamed from: ru.rustore.sdk.review.s */
/* loaded from: classes8.dex */
public final class C11800s extends Lambda implements Function1<RuStoreException, Unit> {

    /* renamed from: a */
    public final /* synthetic */ SingleEmitter<ReviewInfo> f11034a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11800s(SingleEmitter<ReviewInfo> singleEmitter) {
        super(1);
        this.f11034a = singleEmitter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RuStoreException ruStoreException) {
        RuStoreException error = ruStoreException;
        Intrinsics.checkNotNullParameter(error, "error");
        this.f11034a.error(error);
        return Unit.INSTANCE;
    }
}
