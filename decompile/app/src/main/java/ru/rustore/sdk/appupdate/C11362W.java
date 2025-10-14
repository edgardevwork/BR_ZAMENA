package ru.rustore.sdk.appupdate;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.reactive.single.SingleEmitter;

/* renamed from: ru.rustore.sdk.appupdate.W */
/* loaded from: classes7.dex */
public final class C11362W extends Lambda implements Function1<SingleEmitter<Integer>, Unit> {
    public C11362W() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SingleEmitter<Integer> singleEmitter) {
        SingleEmitter<Integer> emitter = singleEmitter;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        emitter.error(new RuStoreException("update not available"));
        return Unit.INSTANCE;
    }
}
