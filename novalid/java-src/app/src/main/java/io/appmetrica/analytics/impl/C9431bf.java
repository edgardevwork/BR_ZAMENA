package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.bf */
/* loaded from: classes8.dex */
public final class C9431bf implements InterfaceC9864sn, InterfaceC9949w8 {
    @Override // io.appmetrica.analytics.impl.InterfaceC9949w8
    /* renamed from: a */
    public final int mo5917a(@NonNull EnumC8894F8 enumC8894F8) {
        return 2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9864sn
    @NonNull
    /* renamed from: a */
    public final byte[] mo4930a(@NonNull C9016K8 c9016k8, @NonNull C8902Fg c8902Fg) {
        return TextUtils.isEmpty(c9016k8.f6862b) ? new byte[0] : Base64.decode(c9016k8.f6862b, 0);
    }
}
