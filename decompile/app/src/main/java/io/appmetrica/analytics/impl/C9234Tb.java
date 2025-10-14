package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.Tb */
/* loaded from: classes5.dex */
public final class C9234Tb implements InterfaceC9920v4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC9920v4
    @NonNull
    /* renamed from: b */
    public final C8988J4 mo4967a(@NonNull Context context, @NonNull C9721n5 c9721n5, @NonNull C9520f4 c9520f4, @NonNull C8865E4 c8865e4) {
        C9060M4 c9060m4;
        C9012K4 c9012k4 = new C9012K4(c9520f4.f8053b);
        C9084N4 c9084n4 = new C9084N4();
        synchronized (c9721n5) {
            c9060m4 = (C9060M4) c9721n5.m6496a(c9012k4, c8865e4, c9084n4, c9721n5.f8698b);
        }
        return new C8988J4(context, c9060m4, c8865e4);
    }
}
