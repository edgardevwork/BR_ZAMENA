package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.p048io.Base64Utils;

/* renamed from: io.appmetrica.analytics.impl.Om */
/* loaded from: classes6.dex */
public final class C9126Om implements InterfaceC9864sn {

    /* renamed from: a */
    public final C8869E8 f7072a;

    public C9126Om() {
        this(new C8869E8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9864sn
    @NonNull
    /* renamed from: a */
    public final byte[] mo4930a(@NonNull C9016K8 c9016k8, @NonNull C8902Fg c8902Fg) {
        byte[] bArrDecompressBase64GzipAsBytes = new byte[0];
        try {
            bArrDecompressBase64GzipAsBytes = Base64Utils.decompressBase64GzipAsBytes(c9016k8.f6862b);
        } catch (Throwable unused) {
        }
        byte[] bArrMo5057a = ((InterfaceC8844D8) this.f7072a.f6538a.m6635a(c9016k8.f6875o)).mo5057a(bArrDecompressBase64GzipAsBytes);
        return bArrMo5057a == null ? new byte[0] : bArrMo5057a;
    }

    public C9126Om(C8869E8 c8869e8) {
        this.f7072a = c8869e8;
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: a */
    public final C8869E8 m5471a() {
        return this.f7072a;
    }
}
