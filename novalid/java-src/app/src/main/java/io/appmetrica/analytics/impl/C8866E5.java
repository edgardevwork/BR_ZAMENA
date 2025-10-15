package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.E5 */
/* loaded from: classes7.dex */
public final class C8866E5 implements InterfaceC8819C8, InterfaceC9136P8 {

    /* renamed from: a */
    public final C9062M6 f6525a;

    /* renamed from: b */
    public final Set f6526b;

    /* renamed from: c */
    public final AtomicLong f6527c;

    public C8866E5(@NotNull C9062M6 c9062m6) {
        this.f6525a = c9062m6;
        Set of = SetsKt__SetsKt.setOf((Object[]) new Integer[]{Integer.valueOf(EnumC9329Xa.EVENT_CLIENT_EXTERNAL_ATTRIBUTION.m5745a()), Integer.valueOf(EnumC9329Xa.EVENT_TYPE_APP_UPDATE.m5745a()), Integer.valueOf(EnumC9329Xa.EVENT_TYPE_FIRST_ACTIVATION.m5745a()), Integer.valueOf(EnumC9329Xa.EVENT_TYPE_INIT.m5745a()), Integer.valueOf(EnumC9329Xa.EVENT_TYPE_SEND_AD_REVENUE_EVENT.m5745a()), Integer.valueOf(EnumC9329Xa.EVENT_TYPE_SEND_ECOMMERCE_EVENT.m5745a()), Integer.valueOf(EnumC9329Xa.EVENT_TYPE_SEND_REFERRER.m5745a()), Integer.valueOf(EnumC9329Xa.EVENT_TYPE_SEND_REVENUE_EVENT.m5745a())});
        this.f6526b = of;
        this.f6527c = new AtomicLong(c9062m6.m5391a(of));
        c9062m6.m5397a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9136P8
    /* renamed from: a */
    public final void mo5099a() {
        this.f6527c.set(this.f6525a.m5391a(this.f6526b));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8819C8
    /* renamed from: b */
    public final boolean mo5021b() {
        return this.f6527c.get() > 0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9136P8
    /* renamed from: b */
    public final void mo5101b(@NotNull List<Integer> list) {
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f6526b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
        }
        this.f6527c.addAndGet(-i);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9136P8
    /* renamed from: a */
    public final void mo5100a(@NotNull List<Integer> list) {
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f6526b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
        }
        this.f6527c.addAndGet(i);
    }
}
