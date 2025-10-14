package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.K7 */
/* loaded from: classes8.dex */
public final class C9015K7 {

    /* renamed from: a */
    public final boolean f6857a;

    /* renamed from: b */
    public DeferredDeeplinkListener f6858b;

    /* renamed from: c */
    public DeferredDeeplinkParametersListener f6859c;

    /* renamed from: d */
    public C8967I7 f6860d;

    public C9015K7(boolean z) {
        this.f6857a = z;
    }

    /* renamed from: a */
    public final void m5328a(int i) {
        C8967I7 c8967i7 = this.f6860d;
        String str = c8967i7 == null ? null : c8967i7.f6773c;
        DeferredDeeplinkListener deferredDeeplinkListener = this.f6858b;
        if (deferredDeeplinkListener != null) {
            if (i == 0) {
                throw null;
            }
            int i2 = i - 1;
            deferredDeeplinkListener.onError(i2 != 0 ? i2 != 1 ? i2 != 2 ? DeferredDeeplinkListener.Error.UNKNOWN : DeferredDeeplinkListener.Error.NO_REFERRER : DeferredDeeplinkListener.Error.PARSE_ERROR : DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH, (String) WrapUtils.getOrDefault(str, ""));
            this.f6858b = null;
        }
        DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f6859c;
        if (deferredDeeplinkParametersListener != null) {
            if (i == 0) {
                throw null;
            }
            int i3 = i - 1;
            deferredDeeplinkParametersListener.onError(i3 != 0 ? i3 != 1 ? i3 != 2 ? DeferredDeeplinkParametersListener.Error.UNKNOWN : DeferredDeeplinkParametersListener.Error.NO_REFERRER : DeferredDeeplinkParametersListener.Error.PARSE_ERROR : DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH, (String) WrapUtils.getOrDefault(str, ""));
            this.f6859c = null;
        }
    }

    /* renamed from: a */
    public final void m5327a() {
        C8967I7 c8967i7 = this.f6860d;
        if (c8967i7 != null) {
            String str = c8967i7.f6772b;
            if (str != null) {
                DeferredDeeplinkListener deferredDeeplinkListener = this.f6858b;
                if (deferredDeeplinkListener != null) {
                    deferredDeeplinkListener.onDeeplinkLoaded(str);
                    this.f6858b = null;
                }
                if (!AbstractC9664kn.m6345a(this.f6860d.f6771a)) {
                    Map<String, String> map = this.f6860d.f6771a;
                    DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f6859c;
                    if (deferredDeeplinkParametersListener != null) {
                        deferredDeeplinkParametersListener.onParametersLoaded(map);
                        this.f6859c = null;
                        return;
                    }
                    return;
                }
                String str2 = this.f6860d.f6773c;
                DeferredDeeplinkParametersListener deferredDeeplinkParametersListener2 = this.f6859c;
                if (deferredDeeplinkParametersListener2 != null) {
                    deferredDeeplinkParametersListener2.onError(DeferredDeeplinkParametersListener.Error.PARSE_ERROR, (String) WrapUtils.getOrDefault(str2, ""));
                    this.f6859c = null;
                    return;
                }
                return;
            }
            if (c8967i7.f6773c != null) {
                m5328a(2);
            } else {
                m5328a(3);
            }
        }
    }
}
