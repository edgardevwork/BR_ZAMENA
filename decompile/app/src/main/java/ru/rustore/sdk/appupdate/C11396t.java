package ru.rustore.sdk.appupdate;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.reactive.single.SingleEmitter;

/* renamed from: ru.rustore.sdk.appupdate.t */
/* loaded from: classes8.dex */
public final class C11396t extends Lambda implements Function1<RuStoreException, Unit> {

    /* renamed from: a */
    public final /* synthetic */ SingleEmitter<Unit> f10147a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11396t(SingleEmitter<Unit> singleEmitter) {
        super(1);
        this.f10147a = singleEmitter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RuStoreException ruStoreException) {
        RuStoreException error = ruStoreException;
        Intrinsics.checkNotNullParameter(error, "error");
        this.f10147a.error(error);
        return Unit.INSTANCE;
    }
}
