package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.UnsupportedEncodingException;

/* renamed from: io.appmetrica.analytics.impl.Yl */
/* loaded from: classes7.dex */
public final class C9364Yl extends AbstractC9273V2 {
    public C9364Yl(int i, @NonNull String str) {
        this(i, str, PublicLogger.getAnonymousInstance());
    }

    @VisibleForTesting(otherwise = 3)
    /* renamed from: b */
    public final int m5788b() {
        return this.f7349a;
    }

    public C9364Yl(int i, @NonNull String str, @NonNull PublicLogger publicLogger) {
        super(i, str, publicLogger);
    }

    @NonNull
    @VisibleForTesting(otherwise = 3)
    /* renamed from: a */
    public final String m5786a() {
        return this.f7350b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9030Km
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String mo5338a(@Nullable String str) throws UnsupportedEncodingException {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            int i = this.f7349a;
            if (length <= i) {
                return str;
            }
            String str2 = new String(bytes, 0, i, "UTF-8");
            try {
                this.f7351c.warning("\"%s\" %s exceeded limit of %d bytes", this.f7350b, str, Integer.valueOf(this.f7349a));
            } catch (UnsupportedEncodingException unused) {
            }
            return str2;
        } catch (UnsupportedEncodingException unused2) {
            return str;
        }
    }
}
