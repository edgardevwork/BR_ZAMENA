package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.fk */
/* loaded from: classes7.dex */
public final class C9536fk extends ECommerceEvent {

    /* renamed from: a */
    @NonNull
    public final C9333Xe f8133a;

    /* renamed from: b */
    @NonNull
    public final C9909ui f8134b;

    /* renamed from: c */
    public final InterfaceC9399a8 f8135c;

    public C9536fk(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommerceScreen eCommerceScreen) {
        this(new C9333Xe(eCommerceProduct), new C9909ui(eCommerceScreen), new C9561gk());
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: a */
    public final InterfaceC9399a8 m6129a() {
        return this.f8135c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown product card info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC9406af
    public final List<C9288Vh> toProto() {
        return (List) this.f8135c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductCardInfoEvent{product=" + this.f8133a + ", screen=" + this.f8134b + ", converter=" + this.f8135c + '}';
    }

    @VisibleForTesting
    public C9536fk(@NonNull C9333Xe c9333Xe, @NonNull C9909ui c9909ui, @NonNull InterfaceC9399a8 interfaceC9399a8) {
        this.f8133a = c9333Xe;
        this.f8134b = c9909ui;
        this.f8135c = interfaceC9399a8;
    }
}
