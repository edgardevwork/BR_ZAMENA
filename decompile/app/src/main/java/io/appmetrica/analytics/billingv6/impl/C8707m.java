package io.appmetrica.analytics.billingv6.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.billingv6.impl.m */
/* loaded from: classes7.dex */
public final class C8707m extends Lambda implements Function0 {

    /* renamed from: a */
    public final /* synthetic */ Map f6064a;

    /* renamed from: b */
    public final /* synthetic */ Map f6065b;

    /* renamed from: c */
    public final /* synthetic */ C8710p f6066c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8707m(LinkedHashMap linkedHashMap, Map map, C8710p c8710p) {
        super(0);
        this.f6064a = linkedHashMap;
        this.f6065b = map;
        this.f6066c = c8710p;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Map map = this.f6064a;
        Map map2 = this.f6065b;
        C8710p c8710p = this.f6066c;
        C8714t.m4893a(map, map2, c8710p.f6075d, c8710p.f6074c.getBillingInfoManager());
        return Unit.INSTANCE;
    }
}
