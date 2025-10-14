package io.appmetrica.analytics.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.A */
/* loaded from: classes7.dex */
public final class C8760A extends Lambda implements Function1 {

    /* renamed from: a */
    public final /* synthetic */ C9865t f6297a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8760A(C9865t c9865t) {
        super(1);
        this.f6297a = c9865t;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f6297a.f9069c = (byte[]) obj;
        return Unit.INSTANCE;
    }
}
