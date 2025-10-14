package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.hk */
/* loaded from: classes7.dex */
public final class C9586hk extends ECommerceEvent {

    /* renamed from: a */
    @NonNull
    public final C9333Xe f8287a;

    /* renamed from: b */
    @Nullable
    public final C9143Pf f8288b;

    /* renamed from: c */
    public final InterfaceC9399a8 f8289c;

    public C9586hk(@NonNull ECommerceProduct eCommerceProduct, @Nullable ECommerceReferrer eCommerceReferrer) {
        this(new C9333Xe(eCommerceProduct), eCommerceReferrer == null ? null : new C9143Pf(eCommerceReferrer), new C9611ik());
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: a */
    public final InterfaceC9399a8 m6259a() {
        return this.f8289c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown product details info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC9406af
    public final List<C9288Vh> toProto() {
        return (List) this.f8289c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductDetailInfoEvent{product=" + this.f8287a + ", referrer=" + this.f8288b + ", converter=" + this.f8289c + '}';
    }

    @VisibleForTesting
    public C9586hk(@NonNull C9333Xe c9333Xe, @Nullable C9143Pf c9143Pf, @NonNull InterfaceC9399a8 interfaceC9399a8) {
        this.f8287a = c9333Xe;
        this.f8288b = c9143Pf;
        this.f8289c = interfaceC9399a8;
    }
}
