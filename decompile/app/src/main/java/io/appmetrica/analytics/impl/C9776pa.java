package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.pa */
/* loaded from: classes6.dex */
public final class C9776pa extends C9751oa {
    public C9776pa(int i, int i2) {
        this(i, new C9801qa(i2));
    }

    /* renamed from: a */
    public final int m6634a(@Nullable String str) {
        return StringUtils.getUTF8Bytes(str).length;
    }

    @Override // io.appmetrica.analytics.impl.C9751oa
    /* renamed from: b */
    public final int mo5481b(@Nullable Object obj) {
        return StringUtils.getUTF8Bytes((String) obj).length;
    }

    @VisibleForTesting
    public C9776pa(int i, @NonNull C9801qa c9801qa) {
        super(i, c9801qa);
    }
}
