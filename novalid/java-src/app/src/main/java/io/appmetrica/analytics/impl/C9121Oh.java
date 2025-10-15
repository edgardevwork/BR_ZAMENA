package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.concurrent.TimeUnit;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.ScanBuild;

/* renamed from: io.appmetrica.analytics.impl.Oh */
/* loaded from: classes8.dex */
public final class C9121Oh extends C9688lm {

    /* renamed from: e */
    public final RunnableC9097Nh f7069e;

    /* renamed from: f */
    public final ICommonExecutor f7070f;

    public C9121Oh(@NonNull C9571h5 c9571h5, @NonNull InterfaceC9124Ok interfaceC9124Ok, @NonNull ICommonExecutor iCommonExecutor) {
        super(c9571h5, interfaceC9124Ok);
        this.f7069e = new RunnableC9097Nh(this);
        this.f7070f = iCommonExecutor;
    }

    @Override // io.appmetrica.analytics.impl.C9688lm
    /* renamed from: a */
    public final void mo5461a() {
        this.f7070f.remove(this.f7069e);
    }

    @Override // io.appmetrica.analytics.impl.C9688lm
    /* renamed from: f */
    public final void mo5462f() {
        this.f8604d.mo5467a();
        C8902Fg c8902Fg = (C8902Fg) ((C9571h5) this.f8601a).f8239l.m6880a();
        if (c8902Fg.f6607l.mo5003a(c8902Fg.f6606k)) {
            String str = c8902Fg.f6609n;
            if (TextUtils.isEmpty(str) || ScanBuild.XRAY_FATAL_FAIL_STATUS.equals(str)) {
                return;
            }
            try {
                NetworkTask networkTaskM6754a = C9829rd.m6754a((C9571h5) this.f8601a);
                C9676la.f8552C.getClass();
                NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTaskM6754a);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: g */
    public final void m5463g() {
        synchronized (this.f8602b) {
            try {
                if (!this.f8603c) {
                    this.f7070f.remove(this.f7069e);
                    m5464h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: h */
    public final void m5464h() {
        if (((C8902Fg) ((C9571h5) this.f8601a).f8239l.m6880a()).f6603h > 0) {
            this.f7070f.executeDelayed(this.f7069e, TimeUnit.SECONDS.toMillis(((C8902Fg) ((C9571h5) this.f8601a).f8239l.m6880a()).f6603h));
        }
    }
}
