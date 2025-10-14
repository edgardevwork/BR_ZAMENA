package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.A8 */
/* loaded from: classes7.dex */
public final class C8769A8 implements InterfaceC9864sn {

    /* renamed from: a */
    public final C8869E8 f6320a;

    public C8769A8() {
        this(new C8869E8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9864sn
    @NonNull
    /* renamed from: a */
    public final byte[] mo4930a(@NonNull C9016K8 c9016k8, @NonNull C8902Fg c8902Fg) {
        String str = c9016k8.f6862b;
        return ((InterfaceC8844D8) this.f6320a.f6538a.m6635a(c9016k8.f6875o)).mo5057a(str != null ? StringUtils.getUTF8Bytes(str) : new byte[0]);
    }

    public C8769A8(C8869E8 c8869e8) {
        this.f6320a = c8869e8;
    }
}
