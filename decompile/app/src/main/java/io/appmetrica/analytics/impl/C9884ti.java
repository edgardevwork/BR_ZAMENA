package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.ti */
/* loaded from: classes6.dex */
public final class C9884ti implements InterfaceC9640k {

    /* renamed from: a */
    public C9730ne f9124a;

    /* renamed from: b */
    public ScreenInfo f9125b;

    /* renamed from: c */
    public boolean f9126c;

    /* renamed from: d */
    public boolean f9127d;

    /* renamed from: e */
    public final C9859si f9128e = new C9859si();

    /* renamed from: f */
    public WeakReference f9129f = new WeakReference(null);

    @WorkerThread
    /* renamed from: a */
    public final synchronized void m6828a(@NotNull Activity activity) {
        try {
            this.f9129f = new WeakReference(activity);
            if (!this.f9127d) {
                if (this.f9124a == null) {
                    this.f9124a = new C9730ne(C9398a7.m5836a(activity).m5838a());
                }
                C9730ne c9730ne = this.f9124a;
                Intrinsics.checkNotNull(c9730ne);
                this.f9125b = c9730ne.m6548p();
                if (this.f9124a == null) {
                    this.f9124a = new C9730ne(C9398a7.m5836a(activity).m5838a());
                }
                C9730ne c9730ne2 = this.f9124a;
                Intrinsics.checkNotNull(c9730ne2);
                this.f9126c = c9730ne2.m6552t();
                this.f9127d = true;
            }
            if (this.f9125b == null) {
                m6830b(activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public final void m6830b(Context context) {
        if (context != null) {
            this.f9128e.getClass();
            ScreenInfo screenInfoM6801a = C9859si.m6801a(context);
            if (screenInfoM6801a == null || Intrinsics.areEqual(screenInfoM6801a, this.f9125b)) {
                return;
            }
            this.f9125b = screenInfoM6801a;
            if (this.f9124a == null) {
                this.f9124a = new C9730ne(C9398a7.m5836a(context).m5838a());
            }
            C9730ne c9730ne = this.f9124a;
            Intrinsics.checkNotNull(c9730ne);
            c9730ne.m6516a(this.f9125b);
        }
    }

    @WorkerThread
    @Nullable
    /* renamed from: a */
    public final synchronized ScreenInfo m6827a(@NotNull Context context) {
        try {
            if (!this.f9127d) {
                if (this.f9124a == null) {
                    this.f9124a = new C9730ne(C9398a7.m5836a(context).m5838a());
                }
                C9730ne c9730ne = this.f9124a;
                Intrinsics.checkNotNull(c9730ne);
                this.f9125b = c9730ne.m6548p();
                if (this.f9124a == null) {
                    this.f9124a = new C9730ne(C9398a7.m5836a(context).m5838a());
                }
                C9730ne c9730ne2 = this.f9124a;
                Intrinsics.checkNotNull(c9730ne2);
                this.f9126c = c9730ne2.m6552t();
                this.f9127d = true;
            }
            m6830b((Context) this.f9129f.get());
            if (this.f9125b == null) {
                if (AndroidUtils.isApiAchieved(30)) {
                    if (!this.f9126c) {
                        m6830b(context);
                        this.f9126c = true;
                        if (this.f9124a == null) {
                            this.f9124a = new C9730ne(C9398a7.m5836a(context).m5838a());
                        }
                        C9730ne c9730ne3 = this.f9124a;
                        Intrinsics.checkNotNull(c9730ne3);
                        c9730ne3.m6554v();
                    }
                } else {
                    m6830b(context);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f9125b;
    }

    @VisibleForTesting
    /* renamed from: a */
    public final void m6829a(@NotNull C9730ne c9730ne) {
        this.f9124a = c9730ne;
    }
}
