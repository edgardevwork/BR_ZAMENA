package com.sdkit.paylib.payliblogging.impl.p030di;

import com.sdkit.paylib.payliblogging.api.logging.ExternalPaylibLoggerFactory;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggingConfig;
import com.sdkit.paylib.payliblogging.impl.logging.C8079b;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.payliblogging.impl.di.a */
/* loaded from: classes8.dex */
public abstract class AbstractC8076a {

    /* renamed from: com.sdkit.paylib.payliblogging.impl.di.a$b */
    public static final class b {

        /* renamed from: a */
        public PaylibLoggingDependencies f1565a;

        public b() {
        }

        /* renamed from: a */
        public b m1706a(PaylibLoggingDependencies paylibLoggingDependencies) {
            this.f1565a = (PaylibLoggingDependencies) Preconditions.checkNotNull(paylibLoggingDependencies);
            return this;
        }

        /* renamed from: a */
        public InterfaceC8077b m1707a() {
            Preconditions.checkBuilderRequirement(this.f1565a, PaylibLoggingDependencies.class);
            return new c(this.f1565a);
        }
    }

    /* renamed from: com.sdkit.paylib.payliblogging.impl.di.a$c */
    /* loaded from: classes5.dex */
    public static final class c implements InterfaceC8077b {

        /* renamed from: b */
        public final c f1566b;

        /* renamed from: c */
        public Provider f1567c;

        /* renamed from: d */
        public Provider f1568d;

        /* renamed from: e */
        public Provider f1569e;

        /* renamed from: f */
        public Provider f1570f;

        /* renamed from: com.sdkit.paylib.payliblogging.impl.di.a$c$a */
        public static final class a implements Provider {

            /* renamed from: a */
            public final PaylibLoggingDependencies f1571a;

            public a(PaylibLoggingDependencies paylibLoggingDependencies) {
                this.f1571a = paylibLoggingDependencies;
            }

            @Override // javax.inject.Provider
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ExternalPaylibLoggerFactory get() {
                return this.f1571a.getExternalPaylibLoggerFactory();
            }
        }

        /* renamed from: com.sdkit.paylib.payliblogging.impl.di.a$c$b */
        public static final class b implements Provider {

            /* renamed from: a */
            public final PaylibLoggingDependencies f1572a;

            public b(PaylibLoggingDependencies paylibLoggingDependencies) {
                this.f1572a = paylibLoggingDependencies;
            }

            @Override // javax.inject.Provider
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public PaylibLoggingConfig get() {
                return this.f1572a.getPaylibLoggingConfig();
            }
        }

        public c(PaylibLoggingDependencies paylibLoggingDependencies) {
            this.f1566b = this;
            m1708a(paylibLoggingDependencies);
        }

        /* renamed from: a */
        public final void m1708a(PaylibLoggingDependencies paylibLoggingDependencies) {
            this.f1567c = new a(paylibLoggingDependencies);
            b bVar = new b(paylibLoggingDependencies);
            this.f1568d = bVar;
            C8079b c8079bM1713a = C8079b.m1713a(this.f1567c, bVar);
            this.f1569e = c8079bM1713a;
            this.f1570f = DoubleCheck.provider(c8079bM1713a);
        }

        @Override // com.sdkit.paylib.payliblogging.api.p029di.PaylibLoggingTools
        public PaylibLoggerFactory getLoggerFactory() {
            return (PaylibLoggerFactory) this.f1570f.get();
        }
    }

    /* renamed from: a */
    public static b m1705a() {
        return new b();
    }
}
