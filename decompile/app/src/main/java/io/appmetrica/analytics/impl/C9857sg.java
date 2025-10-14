package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.sg */
/* loaded from: classes6.dex */
public final class C9857sg extends AbstractC9632jg {

    /* renamed from: b */
    public final C8992J8 f9048b;

    public C9857sg(@NonNull C9571h5 c9571h5) {
        this(c9571h5, c9571h5.m6212i());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9632jg
    /* renamed from: a */
    public final boolean mo5129a(@NonNull C9252U5 c9252u5) {
        EnumC9426ba enumC9426ba;
        if (!TextUtils.isEmpty(c9252u5.getName())) {
            C8992J8 c8992j8 = this.f9048b;
            String name = c9252u5.getName();
            if (c8992j8.f6816c == null) {
                c8992j8.m5300a();
            }
            int iHashCode = name.hashCode();
            if (c8992j8.f6816c.f6928b.contains(Integer.valueOf(iHashCode))) {
                enumC9426ba = EnumC9426ba.NON_FIRST_OCCURENCE;
            } else {
                C9040L8 c9040l8 = c8992j8.f6816c;
                EnumC9426ba enumC9426ba2 = c9040l8.f6927a ? EnumC9426ba.FIRST_OCCURRENCE : EnumC9426ba.UNKNOWN;
                if (c9040l8.f6930d < 1000) {
                    c9040l8.f6928b.add(Integer.valueOf(iHashCode));
                    c9040l8.f6930d++;
                } else {
                    c9040l8.f6927a = false;
                }
                C9112O8 c9112o8 = c8992j8.f6815b;
                C9040L8 c9040l82 = c8992j8.f6816c;
                IBinaryDataHelper iBinaryDataHelper = c9112o8.f7053c;
                C9088N8 c9088n8 = c9112o8.f7052b;
                c9112o8.f7051a.getClass();
                C9825r9 c9825r9M5402a = C9064M8.m5402a(c9040l82);
                c9088n8.getClass();
                iBinaryDataHelper.insert("event_hashes", MessageNano.toByteArray(c9825r9M5402a));
                enumC9426ba = enumC9426ba2;
            }
            c9252u5.f7319k = enumC9426ba;
        }
        return false;
    }

    public C9857sg(C9571h5 c9571h5, C8992J8 c8992j8) {
        super(c9571h5);
        this.f9048b = c8992j8;
    }
}
