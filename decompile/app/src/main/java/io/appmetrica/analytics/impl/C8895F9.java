package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Map;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.F9 */
/* loaded from: classes7.dex */
public final class C8895F9 extends AbstractC9632jg {

    /* renamed from: b */
    public final C8920G9 f6579b;

    public C8895F9(@NotNull C9571h5 c9571h5, @NotNull TimeProvider timeProvider) {
        super(c9571h5);
        this.f6579b = new C8920G9(c9571h5, timeProvider);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9632jg
    /* renamed from: a */
    public final boolean mo5129a(@NotNull C9252U5 c9252u5) {
        long jOptLong;
        C8920G9 c8920g9 = this.f6579b;
        C10025z9 c10025z9 = c8920g9.f6658a.m6223t().f8451C;
        Long lValueOf = c10025z9 != null ? Long.valueOf(c10025z9.f9398a) : null;
        if (lValueOf != null) {
            C9964wn c9964wn = c8920g9.f6658a.f8249v;
            synchronized (c9964wn) {
                jOptLong = c9964wn.f9286a.m6979a().optLong("external_attribution_window_start", -1L);
            }
            if (jOptLong < 0) {
                jOptLong = c8920g9.f6659b.currentTimeMillis();
                c8920g9.f6658a.f8249v.m6938a(jOptLong);
            }
            if (c8920g9.f6659b.currentTimeMillis() - jOptLong <= lValueOf.longValue()) {
                C10000y9 c10000y9 = (C10000y9) MessageNano.mergeFrom(new C10000y9(), c9252u5.getValueBytes());
                int i = c10000y9.f9361a;
                String str = new String(c10000y9.f9362b, Charsets.UTF_8);
                if (this.f6579b.f6658a.f8230c.m6608j().get(Integer.valueOf(i)) != null) {
                    try {
                        if (!(!JsonUtils.isEqualTo(new JSONObject(str), new JSONObject(r10)))) {
                            this.f8444a.f8241n.info("Ignoring attribution of type `" + AbstractC8969I9.m5265a(i) + "` with value `" + str + "` since it is not new", new Object[0]);
                            return true;
                        }
                    } catch (Throwable unused) {
                    }
                }
                C8920G9 c8920g92 = this.f6579b;
                Map<Integer, String> mapM6608j = c8920g92.f6658a.f8230c.m6608j();
                mapM6608j.put(Integer.valueOf(i), str);
                c8920g92.f6658a.f8230c.m6596a(mapM6608j);
                this.f8444a.f8241n.info("Handling attribution of type `" + AbstractC8969I9.m5265a(i) + '`', new Object[0]);
                return false;
            }
        }
        this.f8444a.f8241n.info("Ignoring attribution since out of collecting interval", new Object[0]);
        return true;
    }
}
