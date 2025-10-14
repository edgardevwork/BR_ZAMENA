package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.df */
/* loaded from: classes8.dex */
public final class C9481df implements InterfaceC9864sn {
    @Override // io.appmetrica.analytics.impl.InterfaceC9864sn
    /* renamed from: a */
    public final byte[] mo4930a(C9016K8 c9016k8, C8902Fg c8902Fg) {
        if (!TextUtils.isEmpty(c9016k8.f6862b)) {
            try {
                byte[] bArrDecode = Base64.decode(c9016k8.f6862b, 0);
                C8901Ff c8901Ff = (bArrDecode == null || bArrDecode.length == 0) ? null : new C8901Ff(bArrDecode);
                C9681lf c9681lf = new C9681lf();
                String str = c8901Ff.f6595a;
                c9681lf.f8587a = str == null ? new byte[0] : str.getBytes();
                c9681lf.f8589c = c8901Ff.f6596b;
                c9681lf.f8588b = c8901Ff.f6597c;
                int iOrdinal = c8901Ff.f6598d.ordinal();
                int i = 1;
                if (iOrdinal != 1) {
                    i = 2;
                    if (iOrdinal != 2) {
                        i = 0;
                    }
                }
                c9681lf.f8590d = i;
                return MessageNano.toByteArray(c9681lf);
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }
}
