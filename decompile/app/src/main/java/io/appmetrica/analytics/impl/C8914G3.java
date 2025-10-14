package io.appmetrica.analytics.impl;

import android.content.ComponentName;
import android.content.Context;
import io.appmetrica.analytics.internal.PreloadInfoContentProvider;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.G3 */
/* loaded from: classes7.dex */
public final class C8914G3 implements InterfaceC8767A6 {
    @Override // io.appmetrica.analytics.impl.InterfaceC8767A6
    /* renamed from: a */
    public final void mo4928a(@NotNull Context context) throws InterruptedException {
        CountDownLatch countDownLatch = AbstractC8941H5.f6702a;
        if (countDownLatch != null) {
            countDownLatch.await(1L, TimeUnit.SECONDS);
            try {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) PreloadInfoContentProvider.class), 2, 1);
                PreloadInfoContentProvider preloadInfoContentProvider = AbstractC8941H5.f6703b;
                if (preloadInfoContentProvider != null) {
                    preloadInfoContentProvider.disable();
                }
            } catch (Throwable unused) {
            }
            AbstractC8941H5.f6702a = null;
        }
    }
}
