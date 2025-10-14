package ru.rustore.sdk.appupdate;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.reactive.single.SingleEmitter;

/* renamed from: ru.rustore.sdk.appupdate.q */
/* loaded from: classes8.dex */
public final class C11393q extends Lambda implements Function1<RuStoreException, Unit> {

    /* renamed from: a */
    public final /* synthetic */ SingleEmitter<Object> f10140a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11393q(SingleEmitter<Object> singleEmitter) {
        super(1);
        this.f10140a = singleEmitter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RuStoreException ruStoreException) {
        RuStoreException error = ruStoreException;
        Intrinsics.checkNotNullParameter(error, "error");
        this.f10140a.error(error);
        return Unit.INSTANCE;
    }
}
