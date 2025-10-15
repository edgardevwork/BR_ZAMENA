package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashSet;

/* renamed from: io.appmetrica.analytics.impl.j2 */
/* loaded from: classes8.dex */
public final class C9618j2 extends AbstractC9632jg {

    /* renamed from: b */
    public final C9964wn f8390b;

    /* renamed from: c */
    public final C9735nj f8391c;

    public C9618j2(@NonNull C9571h5 c9571h5) {
        this(c9571h5, c9571h5.m6224u(), C9735nj.m6556c());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9632jg
    /* renamed from: a */
    public final boolean mo5129a(@NonNull C9252U5 c9252u5) {
        C9571h5 c9571h5 = this.f8444a;
        if (!this.f8390b.m6945c() && !this.f8390b.m6946d()) {
            if (((C8902Fg) c9571h5.f8239l.m6880a()).f6601f) {
                this.f8391c.m6560b();
            }
            C8992J8 c8992j8 = this.f8444a.f8240m;
            if (c8992j8.f6816c == null) {
                c8992j8.m5300a();
            }
            C9040L8 c9040l8 = c8992j8.f6816c;
            c9040l8.getClass();
            c9040l8.f6928b = new HashSet();
            c9040l8.f6930d = 0;
            C9040L8 c9040l82 = c8992j8.f6816c;
            c9040l82.f6927a = true;
            C9112O8 c9112o8 = c8992j8.f6815b;
            IBinaryDataHelper iBinaryDataHelper = c9112o8.f7053c;
            C9088N8 c9088n8 = c9112o8.f7052b;
            c9112o8.f7051a.getClass();
            C9825r9 c9825r9M5402a = C9064M8.m5402a(c9040l82);
            c9088n8.getClass();
            iBinaryDataHelper.insert("event_hashes", MessageNano.toByteArray(c9825r9M5402a));
        }
        return false;
    }

    public C9618j2(C9571h5 c9571h5, C9964wn c9964wn, C9735nj c9735nj) {
        super(c9571h5);
        this.f8390b = c9964wn;
        this.f8391c = c9735nj;
    }
}
