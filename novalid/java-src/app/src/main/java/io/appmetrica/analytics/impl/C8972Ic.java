package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Ic */
/* loaded from: classes8.dex */
public final class C8972Ic extends AbstractC9034L2 {

    /* renamed from: b */
    public final String f6776b;

    public C8972Ic(@NotNull String str, @NotNull InterfaceC10011yk interfaceC10011yk) {
        super(interfaceC10011yk);
        this.f6776b = str;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9034L2
    @NotNull
    /* renamed from: a */
    public final String mo5267a(@NotNull String str) {
        return str + '-' + this.f6776b;
    }
}
