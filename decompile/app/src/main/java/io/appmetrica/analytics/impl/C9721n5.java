package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.n5 */
/* loaded from: classes5.dex */
public final class C9721n5 {

    /* renamed from: a */
    public final HashMap f8697a = new HashMap();

    /* renamed from: b */
    public final HashMap f8698b = new HashMap();

    /* renamed from: c */
    public final Context f8699c;

    public C9721n5(Context context) {
        this.f8699c = context.getApplicationContext();
    }

    /* renamed from: a */
    public final InterfaceC8871Ea m6496a(C9396a5 c9396a5, C8865E4 c8865e4, InterfaceC9063M7 interfaceC9063M7, HashMap map) {
        InterfaceC8871Ea interfaceC8871Ea = (InterfaceC8871Ea) map.get(c9396a5.toString());
        if (interfaceC8871Ea != null) {
            interfaceC8871Ea.mo5111a(c8865e4);
            return interfaceC8871Ea;
        }
        InterfaceC8871Ea interfaceC8871EaMo5401a = interfaceC9063M7.mo5401a(this.f8699c, c9396a5, c8865e4);
        map.put(c9396a5.toString(), interfaceC8871EaMo5401a);
        return interfaceC8871EaMo5401a;
    }
}
