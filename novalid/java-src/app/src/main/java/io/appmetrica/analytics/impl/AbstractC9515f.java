package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.f */
/* loaded from: classes8.dex */
public abstract class AbstractC9515f implements InterfaceC9895u4 {

    /* renamed from: a */
    public final Context f8040a;

    /* renamed from: b */
    public final C9238Tf f8041b;

    public AbstractC9515f(@NonNull Context context, @NonNull C9238Tf c9238Tf) {
        this.f8040a = context.getApplicationContext();
        this.f8041b = c9238Tf;
        c9238Tf.m5618a(this);
        C9676la.m6362h().m6374k().mo5114b(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9895u4
    /* renamed from: a */
    public final void mo5290a(@NonNull C9252U5 c9252u5, @NonNull C8865E4 c8865e4) {
        mo5571b(c9252u5, c8865e4);
    }

    @NonNull
    /* renamed from: b */
    public final C9238Tf m6075b() {
        return this.f8041b;
    }

    /* renamed from: b */
    public abstract void mo5571b(@NonNull C9252U5 c9252u5, @NonNull C8865E4 c8865e4);

    @NonNull
    /* renamed from: c */
    public final Context m6076c() {
        return this.f8040a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9895u4
    /* renamed from: a */
    public final void mo5289a() {
        this.f8041b.m5620b(this);
        C9676la.f8552C.m6373j().mo5112a(this);
    }
}
