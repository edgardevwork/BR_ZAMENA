package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.d5 */
/* loaded from: classes6.dex */
public abstract class AbstractC9471d5 {

    /* renamed from: a */
    public final C9571h5 f7893a;

    /* renamed from: b */
    public final String f7894b = "[ComponentMigrationToV113]";

    public AbstractC9471d5(C9571h5 c9571h5) {
        this.f7893a = c9571h5;
    }

    @NotNull
    /* renamed from: a */
    public final C9571h5 m6001a() {
        return this.f7893a;
    }

    @NotNull
    /* renamed from: b */
    public final String m6003b() {
        return this.f7894b;
    }

    /* renamed from: b */
    public abstract boolean mo6004b(int i);

    /* renamed from: c */
    public abstract void mo6005c();

    /* renamed from: a */
    public final void m6002a(int i) {
        if (mo6004b(i)) {
            mo6005c();
        }
    }
}
