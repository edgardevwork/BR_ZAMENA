package ru.rustore.sdk.billingclient.impl.utils;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.reactive.core.Disposable;

/* renamed from: ru.rustore.sdk.billingclient.impl.utils.e */
/* loaded from: classes5.dex */
public final class C11553e extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: a */
    public final /* synthetic */ Disposable f10602a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11553e(Disposable disposable) {
        super(1);
        this.f10602a = disposable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        this.f10602a.dispose();
        return Unit.INSTANCE;
    }
}
