package ru.rustore.sdk.appupdate;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.reactive.single.SingleEmitter;

/* renamed from: ru.rustore.sdk.appupdate.F */
/* loaded from: classes7.dex */
public final class C11345F extends Lambda implements Function0<Unit> {

    /* renamed from: a */
    public final /* synthetic */ SingleEmitter<Unit> f10034a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11345F(SingleEmitter<Unit> singleEmitter) {
        super(0);
        this.f10034a = singleEmitter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SingleEmitter<Unit> singleEmitter = this.f10034a;
        Unit unit = Unit.INSTANCE;
        singleEmitter.success(unit);
        return unit;
    }
}
