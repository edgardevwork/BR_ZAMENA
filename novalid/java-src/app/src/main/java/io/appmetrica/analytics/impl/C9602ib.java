package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.io.File;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ib */
/* loaded from: classes8.dex */
public final class C9602ib implements Function, Consumer {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9527fb apply(@NonNull File file) throws IOException {
        String strM5242a = AbstractC8946Ha.m5242a(file);
        if (!TextUtils.isEmpty(strM5242a)) {
            try {
                return new C9527fb(strM5242a);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void consume(@NonNull File file) {
        try {
            file.delete();
        } catch (Throwable unused) {
        }
    }
}
