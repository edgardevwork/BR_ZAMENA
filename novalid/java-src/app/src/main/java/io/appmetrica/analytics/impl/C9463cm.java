package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.cm */
/* loaded from: classes8.dex */
public final class C9463cm implements InterfaceC9864sn {
    @Override // io.appmetrica.analytics.impl.InterfaceC9864sn
    @NonNull
    /* renamed from: a */
    public final byte[] mo4930a(@NonNull C9016K8 c9016k8, @NonNull C8902Fg c8902Fg) {
        return !TextUtils.isEmpty(c9016k8.f6862b) ? StringUtils.getUTF8Bytes(c9016k8.f6862b) : new byte[0];
    }
}
