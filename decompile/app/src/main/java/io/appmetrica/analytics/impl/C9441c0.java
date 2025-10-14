package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.UUID;

/* renamed from: io.appmetrica.analytics.impl.c0 */
/* loaded from: classes8.dex */
public final class C9441c0 implements InterfaceC9839rn {
    @Override // io.appmetrica.analytics.impl.InterfaceC9839rn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9789pn mo5086a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return new C9789pn(this, false, "ApiKey is empty. Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
        try {
            UUID.fromString(str);
            return new C9789pn(this, true, "");
        } catch (Throwable unused) {
            return new C9789pn(this, false, "Invalid ApiKey=" + str + ". Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
    }
}
