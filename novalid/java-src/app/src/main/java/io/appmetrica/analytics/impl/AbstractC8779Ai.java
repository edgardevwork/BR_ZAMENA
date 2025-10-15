package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.Ai */
/* loaded from: classes7.dex */
public abstract class AbstractC8779Ai implements InterfaceC9920v4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC9920v4
    @NonNull
    /* renamed from: a */
    public abstract /* synthetic */ InterfaceC9895u4 mo4967a(@NonNull Context context, @NonNull C9721n5 c9721n5, @NonNull C9520f4 c9520f4, @NonNull C8865E4 c8865e4);

    @NonNull
    /* renamed from: a */
    public final InterfaceC9895u4 m4968a(@NonNull C9396a5 c9396a5, @NonNull C9721n5 c9721n5) {
        C9238Tf c9238Tf;
        synchronized (c9721n5) {
            c9238Tf = (C9238Tf) c9721n5.f8697a.get(c9396a5.toString());
        }
        return new C10034zi(c9238Tf);
    }
}
