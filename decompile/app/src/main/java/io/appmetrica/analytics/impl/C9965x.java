package io.appmetrica.analytics.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.x */
/* loaded from: classes6.dex */
public final class C9965x extends Lambda implements Function1 {

    /* renamed from: a */
    public final /* synthetic */ C9865t f9287a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9965x(C9865t c9865t) {
        super(1);
        this.f9287a = c9865t;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f9287a.f9072f = (byte[]) obj;
        return Unit.INSTANCE;
    }
}
