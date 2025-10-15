package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.qa */
/* loaded from: classes7.dex */
public final class C9801qa extends AbstractC9010K2 {
    public C9801qa(int i) {
        super(i);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9010K2, io.appmetrica.analytics.impl.InterfaceC9826ra
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9054Lm mo5318a(@Nullable String str) {
        int length = 0;
        if (str != null) {
            int length2 = str.length();
            int i = this.f6853a;
            if (length2 > i) {
                String strSubstring = str.substring(0, i);
                length = str.getBytes().length - strSubstring.getBytes().length;
                str = strSubstring;
            }
        }
        return new C9054Lm(str, new C9844s3(length));
    }
}
