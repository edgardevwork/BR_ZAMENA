package io.appmetrica.analytics.impl;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.internal.CounterConfiguration;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Zg */
/* loaded from: classes5.dex */
public class C9383Zg extends C9370Z3 {

    /* renamed from: c */
    protected C8794B8 f7643c;

    /* renamed from: d */
    protected C9070Me f7644d;

    /* renamed from: e */
    public boolean f7645e;

    /* renamed from: f */
    public String f7646f;

    public C9383Zg(@NonNull C9213Se c9213Se, @NonNull CounterConfiguration counterConfiguration) {
        this(c9213Se, counterConfiguration, null);
    }

    /* renamed from: a */
    public final void m5811a(C9936vk c9936vk) {
        this.f7643c = new C8794B8(c9936vk);
    }

    /* renamed from: c */
    public final Bundle m5812c() {
        Bundle bundle = new Bundle();
        this.f7617b.toBundle(bundle);
        C9213Se c9213Se = this.f7616a;
        synchronized (c9213Se) {
            bundle.putParcelable("PROCESS_CFG_OBJ", c9213Se);
        }
        return bundle;
    }

    @Nullable
    /* renamed from: d */
    public final String m5813d() {
        C8794B8 c8794b8 = this.f7643c;
        if (c8794b8.f6366a.isEmpty()) {
            return null;
        }
        return new JSONObject(c8794b8.f6366a).toString();
    }

    @Nullable
    /* renamed from: e */
    public final synchronized String m5814e() {
        return this.f7646f;
    }

    /* renamed from: f */
    public boolean mo5630f() {
        return this.f7645e;
    }

    public C9383Zg(@NonNull C9213Se c9213Se, @NonNull CounterConfiguration counterConfiguration, @Nullable String str) {
        super(c9213Se, counterConfiguration);
        this.f7645e = true;
        this.f7646f = str;
    }
}
