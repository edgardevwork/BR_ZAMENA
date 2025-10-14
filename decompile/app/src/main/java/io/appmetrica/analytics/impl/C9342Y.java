package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.Y */
/* loaded from: classes7.dex */
public final class C9342Y implements ProtobufConverter {

    /* renamed from: a */
    public final C9246U f7541a;

    /* renamed from: b */
    public final C9672l6 f7542b;

    public C9342Y() {
        this(new C9246U(new C9963wm()), new C9672l6());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9324X5 fromModel(@NonNull C9318X c9318x) {
        C9324X5 c9324x5 = new C9324X5();
        c9324x5.f7465a = this.f7541a.fromModel(c9318x.f7419a);
        String str = c9318x.f7420b;
        if (str != null) {
            c9324x5.f7466b = str;
        }
        c9324x5.f7467c = this.f7542b.m5268a(c9318x.f7421c);
        return c9324x5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C9342Y(C9246U c9246u, C9672l6 c9672l6) {
        this.f7541a = c9246u;
        this.f7542b = c9672l6;
    }

    @NonNull
    /* renamed from: a */
    public final C9318X m5762a(@NonNull C9324X5 c9324x5) {
        throw new UnsupportedOperationException();
    }
}
