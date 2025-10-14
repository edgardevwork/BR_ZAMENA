package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.xg */
/* loaded from: classes5.dex */
public final class C9982xg extends AbstractC9632jg {
    public C9982xg(@NotNull C9571h5 c9571h5) {
        super(c9571h5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9632jg
    /* renamed from: a */
    public final boolean mo5129a(@NotNull C9252U5 c9252u5) {
        C9003Jj c9003JjM6155b;
        C9386Zj c9386Zj;
        C9625j9 c9625j9 = this.f8444a.f8242o;
        C9338Xj c9338Xj = c9625j9.f8421c;
        if (c9338Xj.f7539h == 0) {
            c9003JjM6155b = c9338Xj.f7536e.m6155b();
            if (c9003JjM6155b != null && c9003JjM6155b.m5313a(c9252u5.f7317i) && (c9003JjM6155b = c9338Xj.f7537f.m6155b()) != null && c9003JjM6155b.m5313a(c9252u5.f7317i)) {
                c9003JjM6155b = null;
            }
        } else {
            c9003JjM6155b = c9338Xj.f7538g;
        }
        if (c9003JjM6155b != null) {
            c9386Zj = new C9386Zj();
            c9386Zj.f7652a = c9003JjM6155b.f6833d;
            long andIncrement = c9003JjM6155b.f6835f.getAndIncrement();
            C9411ak c9411ak = c9003JjM6155b.f6831b;
            c9411ak.m5865a(C9411ak.f7735g, Long.valueOf(c9003JjM6155b.f6835f.get()));
            c9411ak.m5867b();
            c9386Zj.f7653b = andIncrement;
            c9386Zj.f7654c = TimeUnit.MILLISECONDS.toSeconds(c9003JjM6155b.f6839j);
            c9386Zj.f7655d = c9003JjM6155b.f6832c.f6994a;
        } else {
            long j = c9252u5.f7318j;
            long jM5720a = c9338Xj.f7533b.m5720a();
            C9062M6 c9062m6 = c9338Xj.f7532a.f8233f;
            EnumC9436bk enumC9436bk = EnumC9436bk.BACKGROUND;
            c9062m6.m5394a(jM5720a, enumC9436bk, j);
            C9386Zj c9386Zj2 = new C9386Zj();
            c9386Zj2.f7652a = jM5720a;
            c9386Zj2.f7655d = enumC9436bk;
            c9386Zj2.f7653b = 0L;
            c9386Zj2.f7654c = 0L;
            c9386Zj = c9386Zj2;
        }
        c9625j9.m6308a(c9252u5, c9386Zj);
        return true;
    }
}
