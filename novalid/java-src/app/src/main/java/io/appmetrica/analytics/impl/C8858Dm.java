package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ValidationException;

/* renamed from: io.appmetrica.analytics.impl.Dm */
/* loaded from: classes7.dex */
public class C8858Dm implements InterfaceC9839rn {

    /* renamed from: a */
    public final InterfaceC9839rn f6503a;

    public C8858Dm(@NonNull InterfaceC9839rn interfaceC9839rn) {
        this.f6503a = interfaceC9839rn;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9839rn
    /* renamed from: a */
    public final C9789pn mo5086a(@Nullable Object obj) {
        C9789pn c9789pnMo5086a = this.f6503a.mo5086a(obj);
        if (c9789pnMo5086a.f8908a) {
            return c9789pnMo5086a;
        }
        throw new ValidationException(c9789pnMo5086a.f8909b);
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: a */
    public final InterfaceC9839rn m5087a() {
        return this.f6503a;
    }
}
