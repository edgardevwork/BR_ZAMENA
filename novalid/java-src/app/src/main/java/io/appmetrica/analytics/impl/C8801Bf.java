package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.Bf */
/* loaded from: classes7.dex */
public final class C8801Bf implements InterfaceC9931vf {

    /* renamed from: a */
    public final boolean f6374a;

    /* renamed from: b */
    public final C9145Ph f6375b;

    /* renamed from: c */
    public final C9730ne f6376c;

    /* renamed from: d */
    public final C9015K7 f6377d;

    /* renamed from: e */
    public final C8999Jf f6378e;

    /* renamed from: f */
    public final Handler f6379f;

    public C8801Bf(C9145Ph c9145Ph, C9730ne c9730ne, @NonNull Handler handler) {
        this(c9145Ph, c9730ne, handler, c9730ne.m6551s());
    }

    /* renamed from: a */
    public final void m4999a() {
        if (this.f6374a) {
            return;
        }
        C9145Ph c9145Ph = this.f6375b;
        ResultReceiverC9047Lf resultReceiverC9047Lf = new ResultReceiverC9047Lf(this.f6379f, this);
        c9145Ph.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver", resultReceiverC9047Lf);
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = AbstractC9875t9.f9105a;
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        C9445c4 c9445c4 = new C9445c4("", "", 4098, 0, anonymousInstance);
        c9445c4.f7321m = bundle;
        C9251U4 c9251u4 = c9145Ph.f7115a;
        c9145Ph.m5493a(C9145Ph.m5490a(c9445c4, c9251u4), c9251u4, 1, null);
    }

    public C8801Bf(C9145Ph c9145Ph, C9730ne c9730ne, Handler handler, boolean z) {
        this(c9145Ph, c9730ne, handler, z, new C9015K7(z), new C8999Jf());
    }

    public C8801Bf(C9145Ph c9145Ph, C9730ne c9730ne, Handler handler, boolean z, C9015K7 c9015k7, C8999Jf c8999Jf) {
        this.f6375b = c9145Ph;
        this.f6376c = c9730ne;
        this.f6374a = z;
        this.f6377d = c9015k7;
        this.f6378e = c8999Jf;
        this.f6379f = handler;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9931vf
    /* renamed from: a */
    public final void mo5002a(@Nullable C8901Ff c8901Ff) {
        String str = c8901Ff == null ? null : c8901Ff.f6595a;
        if (!this.f6374a) {
            synchronized (this) {
                C9015K7 c9015k7 = this.f6377d;
                this.f6378e.getClass();
                c9015k7.f6860d = C8999Jf.m5310a(str);
                c9015k7.m5327a();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void m5001a(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            C9015K7 c9015k7 = this.f6377d;
            c9015k7.f6859c = deferredDeeplinkParametersListener;
            if (c9015k7.f6857a) {
                c9015k7.m5328a(1);
            } else {
                c9015k7.m5327a();
            }
            this.f6376c.m6553u();
        } catch (Throwable th) {
            this.f6376c.m6553u();
            throw th;
        }
    }

    /* renamed from: a */
    public final synchronized void m5000a(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        try {
            C9015K7 c9015k7 = this.f6377d;
            c9015k7.f6858b = deferredDeeplinkListener;
            if (c9015k7.f6857a) {
                c9015k7.m5328a(1);
            } else {
                c9015k7.m5327a();
            }
            this.f6376c.m6553u();
        } catch (Throwable th) {
            this.f6376c.m6553u();
            throw th;
        }
    }
}
