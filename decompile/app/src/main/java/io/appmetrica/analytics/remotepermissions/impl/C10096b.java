package io.appmetrica.analytics.remotepermissions.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.remotepermissions.impl.b */
/* loaded from: classes7.dex */
public final class C10096b implements Converter {

    /* renamed from: a */
    public final C10097c f9656a = new C10097c();

    @NotNull
    /* renamed from: a */
    public final byte[] m7063a(@NotNull C10095a c10095a) {
        return MessageNano.toByteArray(this.f9656a.fromModel(c10095a));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f9656a.fromModel((C10095a) obj));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C10095a toModel(@NotNull byte[] bArr) {
        return this.f9656a.toModel((C10100f) MessageNano.mergeFrom(new C10100f(), bArr));
    }
}
