package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.connection.RealConnection;

/* renamed from: io.appmetrica.analytics.impl.Xj */
/* loaded from: classes6.dex */
public final class C9338Xj {

    /* renamed from: a */
    public final C9571h5 f7532a;

    /* renamed from: b */
    public final C9314Wj f7533b;

    /* renamed from: c */
    public final C9546g5 f7534c;

    /* renamed from: d */
    public final C9017K9 f7535d;

    /* renamed from: e */
    public final AbstractC9540g f7536e;

    /* renamed from: f */
    public final AbstractC9540g f7537f;

    /* renamed from: g */
    public C9003Jj f7538g;

    /* renamed from: h */
    public int f7539h = 0;

    public C9338Xj(C9571h5 c9571h5, C9314Wj c9314Wj, C9546g5 c9546g5, C9526fa c9526fa, C8938H2 c8938h2, C9017K9 c9017k9) {
        this.f7532a = c9571h5;
        this.f7534c = c9546g5;
        this.f7536e = c9526fa;
        this.f7537f = c8938h2;
        this.f7533b = c9314Wj;
        this.f7535d = c9017k9;
    }

    /* renamed from: a */
    public final synchronized long m5753a() {
        C9003Jj c9003Jj;
        c9003Jj = this.f7538g;
        return c9003Jj == null ? RealConnection.IDLE_CONNECTION_HEALTHY_NS : c9003Jj.f6833d - 1;
    }

    /* renamed from: b */
    public final synchronized C9003Jj m5756b(C9252U5 c9252u5) {
        try {
            if (this.f7539h == 0) {
                C9003Jj c9003JjM6155b = this.f7536e.m6155b();
                if (c9003JjM6155b != null) {
                    if (c9003JjM6155b.m5313a(c9252u5.f7317i)) {
                        this.f7538g = c9003JjM6155b;
                        this.f7539h = 3;
                    } else {
                        m5755a(c9003JjM6155b, c9252u5);
                    }
                }
                C9003Jj c9003JjM6155b2 = this.f7537f.m6155b();
                if (c9003JjM6155b2 != null) {
                    if (c9003JjM6155b2.m5313a(c9252u5.f7317i)) {
                        this.f7538g = c9003JjM6155b2;
                        this.f7539h = 2;
                    } else {
                        m5755a(c9003JjM6155b2, c9252u5);
                    }
                }
                this.f7538g = null;
                this.f7539h = 1;
            }
            if (this.f7539h != 1) {
                C9003Jj c9003Jj = this.f7538g;
                if (c9003Jj != null) {
                    if (!c9003Jj.m5313a(c9252u5.f7317i)) {
                        m5755a(c9003Jj, c9252u5);
                    }
                }
                this.f7539h = 1;
                this.f7538g = null;
            }
            int iM5299a = AbstractC8991J7.m5299a(this.f7539h);
            if (iM5299a == 1) {
                C9003Jj c9003Jj2 = this.f7538g;
                long j = c9252u5.f7317i;
                c9003Jj2.f6838i = j;
                C9411ak c9411ak = c9003Jj2.f6831b;
                c9411ak.m5865a(C9411ak.f7732d, Long.valueOf(j));
                c9411ak.m5867b();
                return this.f7538g;
            }
            if (iM5299a == 2) {
                return this.f7538g;
            }
            this.f7532a.f8241n.info("Start background session", new Object[0]);
            this.f7539h = 2;
            long j2 = c9252u5.f7317i;
            AbstractC9540g abstractC9540g = this.f7537f;
            C9027Kj c9027Kj = new C9027Kj(j2, c9252u5.f7318j);
            abstractC9540g.getClass();
            C9003Jj c9003JjM6152a = abstractC9540g.m6152a(c9027Kj);
            if (this.f7532a.f8249v.m6945c()) {
                C9546g5 c9546g5 = this.f7534c;
                c9546g5.f8164a.f8242o.m6308a(C9252U5.m5634a(c9252u5, this.f7535d), m5752a(c9003JjM6152a, c9252u5.f7317i));
            } else {
                int i = c9252u5.f7312d;
                EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
                if (i == 6145) {
                    C9546g5 c9546g52 = this.f7534c;
                    c9546g52.f8164a.f8242o.m6308a(c9252u5, m5752a(c9003JjM6152a, j2));
                    C9546g5 c9546g53 = this.f7534c;
                    c9546g53.f8164a.f8242o.m6308a(C9252U5.m5634a(c9252u5, this.f7535d), m5752a(c9003JjM6152a, j2));
                }
            }
            this.f7538g = c9003JjM6152a;
            return c9003JjM6152a;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public final synchronized void m5757c(C9252U5 c9252u5) {
        try {
            if (this.f7539h == 0) {
                C9003Jj c9003JjM6155b = this.f7536e.m6155b();
                if (c9003JjM6155b != null) {
                    if (c9003JjM6155b.m5313a(c9252u5.f7317i)) {
                        this.f7538g = c9003JjM6155b;
                        this.f7539h = 3;
                    } else {
                        m5755a(c9003JjM6155b, c9252u5);
                    }
                }
                C9003Jj c9003JjM6155b2 = this.f7537f.m6155b();
                if (c9003JjM6155b2 != null) {
                    if (c9003JjM6155b2.m5313a(c9252u5.f7317i)) {
                        this.f7538g = c9003JjM6155b2;
                        this.f7539h = 2;
                    } else {
                        m5755a(c9003JjM6155b2, c9252u5);
                    }
                }
                this.f7538g = null;
                this.f7539h = 1;
            }
            int iM5299a = AbstractC8991J7.m5299a(this.f7539h);
            if (iM5299a == 0) {
                this.f7538g = m5754a(c9252u5);
            } else if (iM5299a == 1) {
                m5755a(this.f7538g, c9252u5);
                this.f7538g = m5754a(c9252u5);
            } else if (iM5299a == 2) {
                C9003Jj c9003Jj = this.f7538g;
                if (c9003Jj != null) {
                    if (c9003Jj.m5313a(c9252u5.f7317i)) {
                        C9003Jj c9003Jj2 = this.f7538g;
                        long j = c9252u5.f7317i;
                        c9003Jj2.f6838i = j;
                        C9411ak c9411ak = c9003Jj2.f6831b;
                        c9411ak.m5865a(C9411ak.f7732d, Long.valueOf(j));
                        c9411ak.m5867b();
                    } else {
                        m5755a(c9003Jj, c9252u5);
                    }
                }
                this.f7538g = m5754a(c9252u5);
            }
        } finally {
        }
    }

    /* renamed from: a */
    public final C9003Jj m5754a(C9252U5 c9252u5) {
        this.f7532a.f8241n.info("Start foreground session", new Object[0]);
        long j = c9252u5.f7317i;
        AbstractC9540g abstractC9540g = this.f7536e;
        C9027Kj c9027Kj = new C9027Kj(j, c9252u5.f7318j);
        abstractC9540g.getClass();
        C9003Jj c9003JjM6152a = abstractC9540g.m6152a(c9027Kj);
        this.f7539h = 3;
        this.f7532a.f8244q.m6633b();
        C9546g5 c9546g5 = this.f7534c;
        c9546g5.f8164a.f8242o.m6308a(C9252U5.m5634a(c9252u5, this.f7535d), m5752a(c9003JjM6152a, j));
        return c9003JjM6152a;
    }

    /* renamed from: a */
    public final void m5755a(C9003Jj c9003Jj, C9252U5 c9252u5) {
        if (c9003Jj.f6836g && c9003Jj.f6833d > 0) {
            C9546g5 c9546g5 = this.f7534c;
            C9252U5 c9252u5M5635a = C9252U5.m5635a(c9252u5, EnumC9329Xa.EVENT_TYPE_ALIVE);
            C9386Zj c9386Zj = new C9386Zj();
            c9386Zj.f7652a = c9003Jj.f6833d;
            c9386Zj.f7655d = c9003Jj.f6832c.f6994a;
            long andIncrement = c9003Jj.f6835f.getAndIncrement();
            C9411ak c9411ak = c9003Jj.f6831b;
            c9411ak.m5865a(C9411ak.f7735g, Long.valueOf(c9003Jj.f6835f.get()));
            c9411ak.m5867b();
            c9386Zj.f7653b = andIncrement;
            c9386Zj.f7654c = TimeUnit.MILLISECONDS.toSeconds(Math.max(c9003Jj.f6838i - c9003Jj.f6834e, c9003Jj.f6839j));
            c9546g5.f8164a.f8242o.m6308a(c9252u5M5635a, c9386Zj);
            if (c9003Jj.f6836g) {
                c9003Jj.f6836g = false;
                C9411ak c9411ak2 = c9003Jj.f6831b;
                c9411ak2.m5865a(C9411ak.f7737i, Boolean.FALSE);
                c9411ak2.m5867b();
            }
        }
        PublicLogger publicLogger = this.f7532a.f8241n;
        int iOrdinal = c9003Jj.f6832c.f6994a.ordinal();
        if (iOrdinal == 0) {
            publicLogger.info("Finish foreground session", new Object[0]);
        } else if (iOrdinal == 1) {
            publicLogger.info("Finish background session", new Object[0]);
        }
        synchronized (c9003Jj) {
            C9411ak c9411ak3 = c9003Jj.f6831b;
            c9411ak3.getClass();
            c9411ak3.f7740c = new C9427bb();
            c9411ak3.m5867b();
            c9003Jj.f6837h = null;
        }
    }

    /* renamed from: a */
    public static C9386Zj m5752a(C9003Jj c9003Jj, long j) {
        C9386Zj c9386Zj = new C9386Zj();
        c9386Zj.f7652a = c9003Jj.f6833d;
        long andIncrement = c9003Jj.f6835f.getAndIncrement();
        C9411ak c9411ak = c9003Jj.f6831b;
        c9411ak.m5865a(C9411ak.f7735g, Long.valueOf(c9003Jj.f6835f.get()));
        c9411ak.m5867b();
        c9386Zj.f7653b = andIncrement;
        C9411ak c9411ak2 = c9003Jj.f6831b;
        long j2 = j - c9003Jj.f6834e;
        c9003Jj.f6839j = j2;
        c9411ak2.m5865a(C9411ak.f7733e, Long.valueOf(j2));
        c9386Zj.f7654c = TimeUnit.MILLISECONDS.toSeconds(c9003Jj.f6839j);
        c9386Zj.f7655d = c9003Jj.f6832c.f6994a;
        return c9386Zj;
    }
}
