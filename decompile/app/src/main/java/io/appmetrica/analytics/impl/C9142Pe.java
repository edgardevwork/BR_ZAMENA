package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.Pe */
/* loaded from: classes7.dex */
public final class C9142Pe extends C9751oa {
    public C9142Pe(int i) {
        super(i);
    }

    @Override // io.appmetrica.analytics.impl.C9751oa
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int mo5481b(@Nullable C9294W c9294w) {
        if (c9294w == null) {
            return 0;
        }
        return StringUtils.getUtf8BytesLength(c9294w.f7381b) + 12;
    }
}
