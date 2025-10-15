package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.am */
/* loaded from: classes7.dex */
public final class C9413am extends AbstractC9273V2 {
    public C9413am(int i, @NonNull String str) {
        this(i, str, PublicLogger.getAnonymousInstance());
    }

    @VisibleForTesting(otherwise = 3)
    /* renamed from: b */
    public final int m5889b() {
        return this.f7349a;
    }

    public C9413am(int i, @NonNull String str, @NonNull PublicLogger publicLogger) {
        super(i, str, publicLogger);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9030Km
    @Nullable
    /* renamed from: a */
    public final String mo5338a(@Nullable String str) {
        if (str != null) {
            int length = str.length();
            int i = this.f7349a;
            if (length > i) {
                String strSubstring = str.substring(0, i);
                this.f7351c.warning("\"%s\" %s size exceeded limit of %d characters", this.f7350b, str, Integer.valueOf(this.f7349a));
                return strSubstring;
            }
        }
        return str;
    }

    @NonNull
    @VisibleForTesting(otherwise = 3)
    /* renamed from: a */
    public final String m5887a() {
        return this.f7350b;
    }
}
