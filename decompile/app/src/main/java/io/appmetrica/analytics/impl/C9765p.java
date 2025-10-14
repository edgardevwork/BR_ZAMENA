package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.p */
/* loaded from: classes6.dex */
public final class C9765p extends AbstractC8793B7 {

    /* renamed from: a */
    public Application f8863a;

    /* renamed from: b */
    public volatile EnumC9740o f8864b = EnumC9740o.f8795d;

    /* renamed from: c */
    public final C9726na f8865c = new C9726na(true);

    @AnyThread
    /* renamed from: a */
    public final synchronized void m6615a(@NonNull Context context) {
        if (this.f8863a == null) {
            try {
                this.f8863a = (Application) context.getApplicationContext();
            } catch (Throwable unused) {
            }
        }
        m6617b();
    }

    /* renamed from: b */
    public final synchronized void m6617b() {
        EnumC9740o enumC9740o = this.f8864b;
        EnumC9740o enumC9740o2 = EnumC9740o.f8793b;
        if (enumC9740o != enumC9740o2 && !this.f8865c.f8720a.isEmpty()) {
            if (this.f8863a == null) {
                this.f8864b = EnumC9740o.f8794c;
            } else {
                this.f8864b = enumC9740o2;
                this.f8863a.registerActivityLifecycleCallbacks(this);
            }
        }
    }

    /* renamed from: c */
    public final synchronized void m6619c() {
        if (this.f8864b == EnumC9740o.f8793b && this.f8865c.f8720a.isEmpty()) {
            this.f8864b = EnumC9740o.f8795d;
            Application application = this.f8863a;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        m6613a(activity, EnumC9690m.CREATED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull Activity activity) {
        m6613a(activity, EnumC9690m.DESTROYED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityPaused(@NonNull Activity activity) {
        m6613a(activity, EnumC9690m.PAUSED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityResumed(@NonNull Activity activity) {
        m6613a(activity, EnumC9690m.RESUMED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity) {
        m6613a(activity, EnumC9690m.STARTED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity) {
        m6613a(activity, EnumC9690m.STOPPED);
    }

    @AnyThread
    /* renamed from: a */
    public final synchronized void m6614a(@NonNull Application application) {
        try {
            if (this.f8863a == null) {
                this.f8863a = application;
            }
            m6617b();
        } catch (Throwable th) {
            throw th;
        }
    }

    @AnyThread
    /* renamed from: b */
    public final synchronized void m6618b(@NonNull InterfaceC9715n interfaceC9715n, EnumC9690m... enumC9690mArr) {
        if (enumC9690mArr != null) {
            try {
                if (enumC9690mArr.length == 0) {
                    enumC9690mArr = EnumC9690m.values();
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            enumC9690mArr = EnumC9690m.values();
        }
        for (EnumC9690m enumC9690m : enumC9690mArr) {
            C9726na c9726na = this.f8865c;
            Collection collection = (Collection) c9726na.f8720a.get(enumC9690m);
            if (collection != null && collection.remove(interfaceC9715n)) {
                if (collection.isEmpty() && c9726na.f8721b) {
                    c9726na.f8720a.remove(enumC9690m);
                }
                new ArrayList(collection);
            }
        }
        m6619c();
    }

    @NonNull
    @AnyThread
    /* renamed from: a */
    public final EnumC9740o m6612a() {
        return this.f8864b;
    }

    /* renamed from: a */
    public final void m6613a(Activity activity, EnumC9690m enumC9690m) {
        Collection collection;
        synchronized (this) {
            collection = (Collection) this.f8865c.f8720a.get(enumC9690m);
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((InterfaceC9715n) it.next()).mo5297a(activity, enumC9690m);
            }
        }
    }

    @AnyThread
    /* renamed from: a */
    public final synchronized void m6616a(@NonNull InterfaceC9715n interfaceC9715n, @Nullable EnumC9690m... enumC9690mArr) {
        if (enumC9690mArr != null) {
            try {
                if (enumC9690mArr.length == 0) {
                    enumC9690mArr = EnumC9690m.values();
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            enumC9690mArr = EnumC9690m.values();
        }
        for (EnumC9690m enumC9690m : enumC9690mArr) {
            this.f8865c.m6504a(enumC9690m, interfaceC9715n);
        }
        m6617b();
    }
}
