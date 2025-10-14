package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.O2 */
/* loaded from: classes5.dex */
public abstract class AbstractC9106O2 {

    /* renamed from: a */
    public final AbstractC9237Te f7046a;

    /* renamed from: b */
    public final InterfaceC8821Ca f7047b;

    public AbstractC9106O2(AbstractC9237Te abstractC9237Te, InterfaceC8821Ca interfaceC8821Ca) {
        this.f7046a = abstractC9237Te;
        this.f7047b = interfaceC8821Ca;
    }

    /* renamed from: a */
    public final boolean m5446a(@NonNull C9252U5 c9252u5, @NonNull InterfaceC9082N2 interfaceC9082N2) {
        Iterator it = ((C9255U8) this.f7046a.mo5519a(c9252u5.f7312d)).f7325a.iterator();
        while (it.hasNext()) {
            if (interfaceC9082N2.mo5358a(it.next(), c9252u5)) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting(otherwise = 5)
    /* renamed from: b */
    public final AbstractC9237Te m5447b() {
        return this.f7046a;
    }

    /* renamed from: a */
    public final InterfaceC8821Ca m5445a() {
        return this.f7047b;
    }
}
