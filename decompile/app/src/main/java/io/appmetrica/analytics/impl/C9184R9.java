package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.R9 */
/* loaded from: classes5.dex */
public final class C9184R9 {

    /* renamed from: a */
    public final C9339Xk f7200a = new C9339Xk();

    /* renamed from: b */
    public C9232T9 f7201b = new C9232T9();

    /* renamed from: a */
    public final synchronized void m5521a(C9232T9 c9232t9) {
        this.f7201b = c9232t9;
    }

    /* renamed from: a */
    public final synchronized void m5522a(List list, HashMap map) {
        Boolean bool;
        String str;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual((String) it.next(), "appmetrica_lib_ssl_enabled") && (bool = this.f7201b.f7285a) != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    C9232T9 c9232t9 = this.f7201b;
                    IdentifierStatus identifierStatus = c9232t9.f7286b;
                    String str2 = c9232t9.f7287c;
                    if (zBooleanValue) {
                        str = "true";
                    } else {
                        if (zBooleanValue) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "false";
                    }
                    map.put("appmetrica_lib_ssl_enabled", this.f7200a.m5758a(new IdentifiersResult(str, identifierStatus, str2)));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
