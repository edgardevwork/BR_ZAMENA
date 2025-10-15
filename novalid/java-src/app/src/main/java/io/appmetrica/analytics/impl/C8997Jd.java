package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Jd */
/* loaded from: classes8.dex */
public final class C8997Jd extends ECommerceEvent {

    /* renamed from: d */
    public static final int f6821d = 6;

    /* renamed from: e */
    public static final int f6822e = 7;

    /* renamed from: a */
    public final int f6823a;

    /* renamed from: b */
    @NonNull
    public final C9045Ld f6824b;

    /* renamed from: c */
    public final InterfaceC9399a8 f6825c;

    public C8997Jd(int i, @NonNull ECommerceOrder eCommerceOrder) {
        this(i, new C9045Ld(eCommerceOrder), new C9021Kd());
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: a */
    public final InterfaceC9399a8 m5307a() {
        return this.f6825c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "order info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC9406af
    public final List<C9288Vh> toProto() {
        return (List) this.f6825c.fromModel(this);
    }

    public final String toString() {
        return "OrderInfoEvent{eventType=" + this.f6823a + ", order=" + this.f6824b + ", converter=" + this.f6825c + '}';
    }

    @VisibleForTesting
    public C8997Jd(int i, @NonNull C9045Ld c9045Ld, @NonNull InterfaceC9399a8 interfaceC9399a8) {
        this.f6823a = i;
        this.f6824b = c9045Ld;
        this.f6825c = interfaceC9399a8;
    }
}
