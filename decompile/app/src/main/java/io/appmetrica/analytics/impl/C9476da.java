package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.da */
/* loaded from: classes7.dex */
public final class C9476da implements ProtobufConverter {

    /* renamed from: a */
    public final AbstractC8973Id f7950a;

    public C9476da() {
        this(new C9315Wk());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9962wl fromModel(@NonNull C8765A4 c8765a4) {
        C9962wl c9962wl = new C9962wl();
        c9962wl.f9280b = c8765a4.f6312b;
        c9962wl.f9279a = c8765a4.f6311a;
        c9962wl.f9281c = c8765a4.f6313c;
        c9962wl.f9282d = c8765a4.f6314d;
        c9962wl.f9283e = c8765a4.f6315e;
        c9962wl.f9284f = this.f7950a.m5268a(c8765a4.f6316f);
        return c9962wl;
    }

    public C9476da(C9315Wk c9315Wk) {
        this.f7950a = c9315Wk;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C8765A4 toModel(@NonNull C9962wl c9962wl) {
        C9995y4 c9995y4 = new C9995y4();
        c9995y4.f9343d = c9962wl.f9282d;
        c9995y4.f9342c = c9962wl.f9281c;
        c9995y4.f9341b = c9962wl.f9280b;
        c9995y4.f9340a = c9962wl.f9279a;
        c9995y4.f9344e = c9962wl.f9283e;
        c9995y4.f9345f = this.f7950a.m5269a(c9962wl.f9284f);
        return new C8765A4(c9995y4);
    }
}
