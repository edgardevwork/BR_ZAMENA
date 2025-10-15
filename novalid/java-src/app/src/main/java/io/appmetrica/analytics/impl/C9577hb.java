package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.hb */
/* loaded from: classes8.dex */
public final class C9577hb implements Converter {

    /* renamed from: a */
    public final C10003yc f8264a;

    public C9577hb() {
        this(new C10003yc(new C9174Qm()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(@NonNull C9150Pm c9150Pm) {
        return MessageNano.toByteArray((MessageNano) this.f8264a.f9365a.fromModel(c9150Pm));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C9577hb(C10003yc c10003yc) {
        this.f8264a = c10003yc;
    }

    @NonNull
    /* renamed from: a */
    public final C9150Pm m6243a(@NonNull byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
