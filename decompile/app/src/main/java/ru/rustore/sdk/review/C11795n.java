package ru.rustore.sdk.review;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.reactive.single.SingleEmitter;

/* renamed from: ru.rustore.sdk.review.n */
/* loaded from: classes8.dex */
public final class C11795n extends Lambda implements Function0<Unit> {

    /* renamed from: a */
    public final /* synthetic */ SingleEmitter<Unit> f11028a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11795n(SingleEmitter<Unit> singleEmitter) {
        super(0);
        this.f11028a = singleEmitter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SingleEmitter<Unit> singleEmitter = this.f11028a;
        Unit unit = Unit.INSTANCE;
        singleEmitter.success(unit);
        return unit;
    }
}
