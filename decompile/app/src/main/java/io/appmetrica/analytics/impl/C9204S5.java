package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.S5 */
/* loaded from: classes5.dex */
public class C9204S5 extends BaseRequestConfig {

    /* renamed from: a */
    public String f7231a;

    /* renamed from: b */
    public String f7232b;

    /* renamed from: c */
    public C9637jl f7233c;

    /* renamed from: b */
    public final String m5546b() {
        return this.f7232b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public String toString() {
        return "CoreRequestConfig{mAppDebuggable='" + this.f7231a + "', mAppSystem='" + this.f7232b + "', startupState=" + this.f7233c + '}';
    }

    @NonNull
    /* renamed from: a */
    public final String m5545a() {
        return this.f7231a;
    }
}
