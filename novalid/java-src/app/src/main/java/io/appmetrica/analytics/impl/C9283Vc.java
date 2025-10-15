package io.appmetrica.analytics.impl;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.Vc */
/* loaded from: classes6.dex */
public final class C9283Vc extends Lambda implements Function1 {

    /* renamed from: a */
    public final /* synthetic */ C9427bb f7356a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9283Vc(C9427bb c9427bb) {
        super(1);
        this.f7356a = c9427bb;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C8996Jc c8996Jc = (C8996Jc) ((Map.Entry) obj).getValue();
        return c8996Jc.f6819b.parse(this.f7356a);
    }
}
