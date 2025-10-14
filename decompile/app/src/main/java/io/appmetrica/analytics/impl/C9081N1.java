package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.N1 */
/* loaded from: classes8.dex */
public final class C9081N1 {

    /* renamed from: a */
    public final C9726na f7006a = new C9726na();

    /* renamed from: b */
    public final LinkedHashMap f7007b = new LinkedHashMap();

    /* renamed from: c */
    public final LinkedHashMap f7008c = new LinkedHashMap();

    /* renamed from: a */
    public final void m5415a() {
    }

    /* renamed from: a */
    public final void m5416a(@NotNull Intent intent, int i) {
    }

    /* renamed from: a */
    public final void m5417a(@NotNull Intent intent, int i, int i2) {
    }

    /* renamed from: a */
    public final void m5418a(@NotNull Configuration configuration) {
    }

    /* renamed from: b */
    public final void m5420b() {
    }

    /* renamed from: c */
    public final void m5423c(@Nullable Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f7006a.m6504a(action, Integer.valueOf(m5411a(intent)));
            }
            for (Map.Entry entry : this.f7007b.entrySet()) {
                InterfaceC9057M1 interfaceC9057M1 = (InterfaceC9057M1) entry.getKey();
                if (((InterfaceC9033L1) entry.getValue()).mo5340a(intent)) {
                    interfaceC9057M1.mo5123a(intent);
                }
            }
        }
    }

    /* renamed from: d */
    public final void m5425d(@Nullable Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                C9726na c9726na = this.f7006a;
                Integer numValueOf = Integer.valueOf(m5411a(intent));
                Collection collection = (Collection) c9726na.f8720a.get(action);
                if (collection != null && collection.remove(numValueOf)) {
                    if (collection.isEmpty() && c9726na.f8721b) {
                        c9726na.f8720a.remove(action);
                    }
                    new ArrayList(collection);
                }
            }
            for (Map.Entry entry : this.f7008c.entrySet()) {
                InterfaceC9057M1 interfaceC9057M1 = (InterfaceC9057M1) entry.getKey();
                if (((InterfaceC9033L1) entry.getValue()).mo5340a(intent)) {
                    interfaceC9057M1.mo5123a(intent);
                }
            }
        }
    }

    /* renamed from: b */
    public final void m5421b(@Nullable Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f7006a.m6504a(action, Integer.valueOf(m5411a(intent)));
            }
            for (Map.Entry entry : this.f7007b.entrySet()) {
                InterfaceC9057M1 interfaceC9057M1 = (InterfaceC9057M1) entry.getKey();
                if (((InterfaceC9033L1) entry.getValue()).mo5340a(intent)) {
                    interfaceC9057M1.mo5123a(intent);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m5419a(@NotNull InterfaceC9057M1 interfaceC9057M1) {
        this.f7008c.put(interfaceC9057M1, new InterfaceC9033L1() { // from class: io.appmetrica.analytics.impl.N1$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.impl.InterfaceC9033L1
            /* renamed from: a */
            public final boolean mo5340a(Intent intent) {
                return C9081N1.m5412a(this.f$0, intent);
            }
        });
    }

    /* renamed from: a */
    public static final boolean m5412a(C9081N1 c9081n1, Intent intent) {
        Collection collection;
        c9081n1.getClass();
        return Intrinsics.areEqual("io.appmetrica.analytics.IAppMetricaService", intent.getAction()) && ((collection = (Collection) c9081n1.f7006a.f8720a.get("io.appmetrica.analytics.IAppMetricaService")) == null || collection.size() == 0);
    }

    /* renamed from: a */
    public static int m5411a(Intent intent) {
        Uri data = intent.getData();
        if (data != null && Intrinsics.areEqual(data.getPath(), "/client")) {
            try {
                String queryParameter = data.getQueryParameter("pid");
                Intrinsics.checkNotNull(queryParameter);
                return Integer.parseInt(queryParameter);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    /* renamed from: c */
    public final void m5424c(@NotNull InterfaceC9057M1 interfaceC9057M1) {
        this.f7007b.put(interfaceC9057M1, new InterfaceC9033L1() { // from class: io.appmetrica.analytics.impl.N1$$ExternalSyntheticLambda1
            @Override // io.appmetrica.analytics.impl.InterfaceC9033L1
            /* renamed from: a */
            public final boolean mo5340a(Intent intent) {
                return C9081N1.m5414c(this.f$0, intent);
            }
        });
    }

    /* renamed from: c */
    public static final boolean m5414c(C9081N1 c9081n1, Intent intent) {
        c9081n1.getClass();
        return Intrinsics.areEqual("io.appmetrica.analytics.IAppMetricaService", intent.getAction());
    }

    /* renamed from: b */
    public final void m5422b(@NotNull InterfaceC9057M1 interfaceC9057M1) {
        this.f7007b.put(interfaceC9057M1, new InterfaceC9033L1() { // from class: io.appmetrica.analytics.impl.N1$$ExternalSyntheticLambda2
            @Override // io.appmetrica.analytics.impl.InterfaceC9033L1
            /* renamed from: a */
            public final boolean mo5340a(Intent intent) {
                return C9081N1.m5413b(this.f$0, intent);
            }
        });
    }

    /* renamed from: b */
    public static final boolean m5413b(C9081N1 c9081n1, Intent intent) {
        Collection collection;
        c9081n1.getClass();
        return Intrinsics.areEqual("io.appmetrica.analytics.IAppMetricaService", intent.getAction()) && (collection = (Collection) c9081n1.f7006a.f8720a.get("io.appmetrica.analytics.IAppMetricaService")) != null && collection.size() == 1;
    }
}
