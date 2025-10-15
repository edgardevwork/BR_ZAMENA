package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: io.appmetrica.analytics.impl.Uf */
/* loaded from: classes5.dex */
public final class C9262Uf implements InterfaceC9063M7 {

    /* renamed from: a */
    public final InterfaceC9596i5 f7334a;

    public C9262Uf(@NonNull InterfaceC9596i5 interfaceC9596i5) {
        this.f7334a = interfaceC9596i5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9063M7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C9238Tf mo5401a(@NonNull Context context, @NonNull C9396a5 c9396a5, @NonNull C8865E4 c8865e4) {
        return new C9238Tf(context, c9396a5, c8865e4, this.f7334a, new C9421b5(), C9052Lk.m5366a());
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: a */
    public final InterfaceC9596i5 m5676a() {
        return this.f7334a;
    }
}
