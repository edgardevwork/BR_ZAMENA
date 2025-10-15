package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.jk */
/* loaded from: classes7.dex */
public final class C9636jk extends ECommerceEvent {

    /* renamed from: a */
    @NonNull
    public final C9909ui f8447a;

    /* renamed from: b */
    public final InterfaceC9399a8 f8448b;

    public C9636jk(@NonNull ECommerceScreen eCommerceScreen) {
        this(new C9909ui(eCommerceScreen), new C9661kk());
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: a */
    public final InterfaceC9399a8 m6312a() {
        return this.f8448b;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown screen info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC9406af
    public final List<C9288Vh> toProto() {
        return (List) this.f8448b.fromModel(this);
    }

    public final String toString() {
        return "ShownScreenInfoEvent{screen=" + this.f8447a + ", converter=" + this.f8448b + '}';
    }

    @VisibleForTesting
    public C9636jk(@NonNull C9909ui c9909ui, @NonNull InterfaceC9399a8 interfaceC9399a8) {
        this.f8447a = c9909ui;
        this.f8448b = interfaceC9399a8;
    }
}
