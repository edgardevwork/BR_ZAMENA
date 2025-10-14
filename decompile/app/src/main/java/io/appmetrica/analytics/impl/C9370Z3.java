package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* renamed from: io.appmetrica.analytics.impl.Z3 */
/* loaded from: classes6.dex */
public class C9370Z3 {

    /* renamed from: a */
    public final C9213Se f7616a;

    /* renamed from: b */
    public final CounterConfiguration f7617b;

    public C9370Z3(C9213Se c9213Se, CounterConfiguration counterConfiguration) {
        this.f7616a = c9213Se;
        this.f7617b = counterConfiguration;
    }

    @Nullable
    /* renamed from: a */
    public static C9370Z3 m5794a(@NonNull Context context, @NonNull Bundle bundle) {
        C9213Se c9213Se;
        String str = C9213Se.f7250c;
        if (bundle != null) {
            try {
                c9213Se = (C9213Se) bundle.getParcelable("PROCESS_CFG_OBJ");
            } catch (Throwable unused) {
            }
        } else {
            c9213Se = null;
        }
        CounterConfiguration counterConfigurationFromBundle = CounterConfiguration.fromBundle(bundle);
        if (counterConfigurationFromBundle == null || c9213Se == null || !context.getPackageName().equals(c9213Se.f7251a.getAsString("PROCESS_CFG_PACKAGE_NAME")) || c9213Se.f7251a.getAsInteger("PROCESS_CFG_SDK_API_LEVEL").intValue() != AppMetrica.getLibraryApiLevel()) {
            return null;
        }
        return new C9370Z3(c9213Se, counterConfigurationFromBundle);
    }

    @NonNull
    /* renamed from: b */
    public final CounterConfiguration m5796b() {
        return this.f7617b;
    }

    public final String toString() {
        return "ClientConfiguration{mProcessConfiguration=" + this.f7616a + ", mCounterConfiguration=" + this.f7617b + '}';
    }

    @NonNull
    /* renamed from: a */
    public final C9213Se m5795a() {
        return this.f7616a;
    }
}
