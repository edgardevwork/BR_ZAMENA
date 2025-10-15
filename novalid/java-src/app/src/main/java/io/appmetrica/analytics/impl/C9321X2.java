package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.X2 */
/* loaded from: classes5.dex */
public final class C9321X2 implements InterfaceC10010yj {

    /* renamed from: a */
    public final ArrayList f7436a;

    /* renamed from: b */
    public Intent f7437b;

    /* renamed from: c */
    public final Context f7438c;

    /* renamed from: d */
    public final C9037L5 f7439d;

    public C9321X2(@NonNull Context context, @NonNull ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, 0);
    }

    @Nullable
    /* renamed from: a */
    public final synchronized Intent m5727a(@NonNull Consumer<Intent> consumer) {
        this.f7436a.add(consumer);
        return this.f7437b;
    }

    /* renamed from: b */
    public final void m5728b() {
        this.f7437b = null;
        C9037L5 c9037l5 = this.f7439d;
        Context context = this.f7438c;
        synchronized (c9037l5) {
            if (c9037l5.f6921b) {
                try {
                    context.unregisterReceiver(c9037l5.f6920a);
                    c9037l5.f6921b = false;
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC10010yj
    public final synchronized void onCreate() {
        Intent intentM5726a = m5726a();
        this.f7437b = intentM5726a;
        Iterator it = this.f7436a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(intentM5726a);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC10010yj
    public final synchronized void onDestroy() {
        this.f7437b = null;
        m5728b();
        Iterator it = this.f7436a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(null);
        }
    }

    public C9321X2(Context context, ICommonExecutor iCommonExecutor, int i) {
        this.f7436a = new ArrayList();
        this.f7437b = null;
        this.f7438c = context;
        this.f7439d = AbstractC9013K5.m5326a(new C8788B2(new C9297W2(this), iCommonExecutor));
    }

    /* renamed from: a */
    public final Intent m5726a() {
        Intent intentRegisterReceiver;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        C9037L5 c9037l5 = this.f7439d;
        Context context = this.f7438c;
        synchronized (c9037l5) {
            try {
                intentRegisterReceiver = context.registerReceiver(c9037l5.f6920a, intentFilter);
                try {
                    c9037l5.f6921b = true;
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                intentRegisterReceiver = null;
            }
        }
        return intentRegisterReceiver;
    }
}
