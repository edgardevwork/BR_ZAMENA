package ru.rustore.sdk.appupdate;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.reactive.single.SingleEmitter;

/* renamed from: ru.rustore.sdk.appupdate.s */
/* loaded from: classes8.dex */
public final class C11395s extends Lambda implements Function0<Unit> {

    /* renamed from: a */
    public final /* synthetic */ SingleEmitter<Unit> f10146a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11395s(SingleEmitter<Unit> singleEmitter) {
        super(0);
        this.f10146a = singleEmitter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SingleEmitter<Unit> singleEmitter = this.f10146a;
        Unit unit = Unit.INSTANCE;
        singleEmitter.success(unit);
        return unit;
    }
}
