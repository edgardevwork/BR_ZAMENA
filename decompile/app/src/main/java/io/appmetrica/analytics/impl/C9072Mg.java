package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Mg */
/* loaded from: classes6.dex */
public final class C9072Mg implements InterfaceC9763om {

    /* renamed from: a */
    public final /* synthetic */ C9600i9 f6992a;

    /* renamed from: b */
    public final /* synthetic */ C9144Pg f6993b;

    public C9072Mg(C9144Pg c9144Pg, C9600i9 c9600i9) {
        this.f6993b = c9144Pg;
        this.f6992a = c9600i9;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9763om
    /* renamed from: a */
    public final void mo5405a(Object obj) {
        List list = (List) obj;
        C9600i9 c9600i9 = this.f6992a;
        if (AbstractC9664kn.m6344a((Collection) list)) {
            return;
        }
        c9600i9.f8358d = new C9550g9[list.size()];
        for (int i = 0; i < list.size(); i++) {
            C9711mk c9711mk = (C9711mk) list.get(i);
            C9550g9[] c9550g9Arr = c9600i9.f8358d;
            Map map = AbstractC9531ff.f8126a;
            C9550g9 c9550g9 = new C9550g9();
            Integer num = c9711mk.f8656a;
            if (num != null) {
                c9550g9.f8185a = num.intValue();
            }
            Integer num2 = c9711mk.f8657b;
            if (num2 != null) {
                c9550g9.f8186b = num2.intValue();
            }
            if (!TextUtils.isEmpty(c9711mk.f8659d)) {
                c9550g9.f8187c = c9711mk.f8659d;
            }
            c9550g9.f8188d = c9711mk.f8658c;
            c9550g9Arr[i] = c9550g9;
            this.f6993b.f7100g += CodedOutputByteBufferNano.computeMessageSizeNoTag(c9600i9.f8358d[i]);
            this.f6993b.f7100g += CodedOutputByteBufferNano.computeTagSize(10);
        }
    }
}
