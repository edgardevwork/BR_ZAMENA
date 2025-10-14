package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.s1 */
/* loaded from: classes7.dex */
public interface InterfaceC9842s1 {
    /* renamed from: a */
    /* synthetic */ void mo5043a(Intent intent);

    /* renamed from: a */
    /* synthetic */ void mo5044a(Intent intent, int i);

    /* renamed from: a */
    /* synthetic */ void mo5045a(Intent intent, int i, int i2);

    /* renamed from: a */
    void mo5046a(@NonNull InterfaceC9817r1 interfaceC9817r1);

    /* renamed from: b */
    /* synthetic */ void mo5047b(Intent intent);

    /* renamed from: c */
    /* synthetic */ void mo5048c(Intent intent);

    /* synthetic */ void onConfigurationChanged(Configuration configuration);

    /* synthetic */ void onCreate();

    /* synthetic */ void onDestroy();

    void pauseUserSession(@NonNull Bundle bundle);

    void reportData(int i, Bundle bundle);

    void resumeUserSession(@NonNull Bundle bundle);
}
