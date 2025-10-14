package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.pi */
/* loaded from: classes6.dex */
public final class C9784pi extends AbstractC9632jg {
    public C9784pi(@NotNull C9571h5 c9571h5) {
        super(c9571h5);
        c9571h5.mo5024b().m5826a();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0038  */
    @Override // io.appmetrica.analytics.impl.AbstractC9632jg
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo5129a(@NotNull C9252U5 c9252u5) {
        Object objRemove;
        for (Map.Entry entry : c9252u5.f7324p.entrySet()) {
            C9147Pj c9147Pj = this.f8444a.f8250w;
            String str = (String) entry.getKey();
            byte[] bArr = (byte[]) entry.getValue();
            if (bArr != null) {
                c9147Pj.getClass();
                objRemove = bArr.length == 0 ? c9147Pj.f7123b.remove(str) : c9147Pj.f7123b.put(str, bArr);
            }
            C9242Tj c9242Tj = c9147Pj.f7122a;
            Map<String, byte[]> map = c9147Pj.f7123b;
            IBinaryDataHelper iBinaryDataHelper = c9242Tj.f7300d;
            String str2 = c9242Tj.f7297a;
            C9218Sj c9218Sj = c9242Tj.f7299c;
            C9171Qj c9171QjFromModel = c9242Tj.f7298b.fromModel(map);
            c9218Sj.getClass();
            iBinaryDataHelper.insert(str2, MessageNano.toByteArray(c9171QjFromModel));
        }
        return true;
    }
}
