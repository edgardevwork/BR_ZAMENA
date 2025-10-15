package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.z3 */
/* loaded from: classes7.dex */
public final class C10019z3 extends ECommerceEvent {

    /* renamed from: d */
    public static final int f9383d = 4;

    /* renamed from: e */
    public static final int f9384e = 5;

    /* renamed from: a */
    public final int f9385a;

    /* renamed from: b */
    @NonNull
    public final C8814C3 f9386b;

    /* renamed from: c */
    public final InterfaceC9399a8 f9387c;

    public C10019z3(int i, @NonNull ECommerceCartItem eCommerceCartItem) {
        this(i, new C8814C3(eCommerceCartItem), new C8764A3());
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: a */
    public final InterfaceC9399a8 m7003a() {
        return this.f9387c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        int i = this.f9385a;
        return i != 4 ? i != 5 ? "unknown cart action info" : "remove cart item info" : "add cart item info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC9406af
    public final List<C9288Vh> toProto() {
        return (List) this.f9387c.fromModel(this);
    }

    @NonNull
    public final String toString() {
        return "CartActionInfoEvent{eventType=" + this.f9385a + ", cartItem=" + this.f9386b + ", converter=" + this.f9387c + '}';
    }

    @VisibleForTesting
    public C10019z3(int i, @NonNull C8814C3 c8814c3, @NonNull InterfaceC9399a8 interfaceC9399a8) {
        this.f9385a = i;
        this.f9386b = c8814c3;
        this.f9387c = interfaceC9399a8;
    }
}
