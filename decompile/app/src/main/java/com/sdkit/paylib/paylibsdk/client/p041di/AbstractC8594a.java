package com.sdkit.paylib.paylibsdk.client.p041di;

import com.sdkit.paylib.paylibdomain.impl.p028di.PaylibDomainDependencies;
import com.sdkit.paylib.payliblogging.impl.p030di.PaylibLoggingDependencies;
import com.sdkit.paylib.paylibnative.p033ui.p034di.PaylibNativePayMethodsDependencies;
import com.sdkit.paylib.paylibpayment.impl.p038di.PaylibPaymentDependencies;
import com.sdkit.paylib.paylibplatform.impl.p040di.PaylibPlatformDependencies;
import com.sdkit.paylib.paylibsdk.client.PaylibSdk;
import com.sdkit.paylib.paylibsdk.client.p041di.utils.InterfaceC8604b;
import com.sdkit.paylib.paylibsdk.client.p041di.utils.InterfaceC8605c;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibsdk.client.di.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8594a {

    /* renamed from: com.sdkit.paylib.paylibsdk.client.di.a$b */
    public static final class b {

        /* renamed from: a */
        public C8596c f5820a;

        /* renamed from: b */
        public InterfaceC8605c f5821b;

        /* renamed from: c */
        public PaylibDomainDependencies f5822c;

        /* renamed from: d */
        public PaylibLoggingDependencies f5823d;

        /* renamed from: e */
        public PaylibPaymentDependencies f5824e;

        /* renamed from: f */
        public PaylibPlatformDependencies f5825f;

        /* renamed from: g */
        public PaylibNativePayMethodsDependencies f5826g;

        public b() {
        }

        /* renamed from: a */
        public b m4668a(PaylibDomainDependencies paylibDomainDependencies) {
            this.f5822c = (PaylibDomainDependencies) Preconditions.checkNotNull(paylibDomainDependencies);
            return this;
        }

        /* renamed from: a */
        public b m4669a(PaylibLoggingDependencies paylibLoggingDependencies) {
            this.f5823d = (PaylibLoggingDependencies) Preconditions.checkNotNull(paylibLoggingDependencies);
            return this;
        }

        /* renamed from: a */
        public b m4670a(PaylibNativePayMethodsDependencies paylibNativePayMethodsDependencies) {
            this.f5826g = (PaylibNativePayMethodsDependencies) Preconditions.checkNotNull(paylibNativePayMethodsDependencies);
            return this;
        }

        /* renamed from: a */
        public b m4671a(PaylibPaymentDependencies paylibPaymentDependencies) {
            this.f5824e = (PaylibPaymentDependencies) Preconditions.checkNotNull(paylibPaymentDependencies);
            return this;
        }

        /* renamed from: a */
        public b m4672a(PaylibPlatformDependencies paylibPlatformDependencies) {
            this.f5825f = (PaylibPlatformDependencies) Preconditions.checkNotNull(paylibPlatformDependencies);
            return this;
        }

        /* renamed from: a */
        public b m4673a(InterfaceC8605c interfaceC8605c) {
            this.f5821b = (InterfaceC8605c) Preconditions.checkNotNull(interfaceC8605c);
            return this;
        }

        /* renamed from: a */
        public InterfaceC8595b m4674a() {
            if (this.f5820a == null) {
                this.f5820a = new C8596c();
            }
            Preconditions.checkBuilderRequirement(this.f5821b, InterfaceC8605c.class);
            Preconditions.checkBuilderRequirement(this.f5822c, PaylibDomainDependencies.class);
            Preconditions.checkBuilderRequirement(this.f5823d, PaylibLoggingDependencies.class);
            Preconditions.checkBuilderRequirement(this.f5824e, PaylibPaymentDependencies.class);
            Preconditions.checkBuilderRequirement(this.f5825f, PaylibPlatformDependencies.class);
            Preconditions.checkBuilderRequirement(this.f5826g, PaylibNativePayMethodsDependencies.class);
            return new c(this.f5820a, this.f5821b, this.f5822c, this.f5823d, this.f5824e, this.f5825f, this.f5826g);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibsdk.client.di.a$c */
    /* loaded from: classes8.dex */
    public static final class c implements InterfaceC8595b {

        /* renamed from: b */
        public final c f5827b;

        /* renamed from: c */
        public Provider f5828c;

        /* renamed from: d */
        public Provider f5829d;

        /* renamed from: e */
        public Provider f5830e;

        /* renamed from: f */
        public Provider f5831f;

        /* renamed from: g */
        public Provider f5832g;

        /* renamed from: h */
        public Provider f5833h;

        /* renamed from: i */
        public Provider f5834i;

        /* renamed from: j */
        public Provider f5835j;

        /* renamed from: k */
        public Provider f5836k;

        /* renamed from: l */
        public Provider f5837l;

        /* renamed from: m */
        public Provider f5838m;

        /* renamed from: n */
        public Provider f5839n;

        /* renamed from: com.sdkit.paylib.paylibsdk.client.di.a$c$a */
        public static final class a implements Provider {

            /* renamed from: a */
            public final InterfaceC8605c f5840a;

            public a(InterfaceC8605c interfaceC8605c) {
                this.f5840a = interfaceC8605c;
            }

            @Override // javax.inject.Provider
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public InterfaceC8604b get() {
                return this.f5840a.provide();
            }
        }

        public c(C8596c c8596c, InterfaceC8605c interfaceC8605c, PaylibDomainDependencies paylibDomainDependencies, PaylibLoggingDependencies paylibLoggingDependencies, PaylibPaymentDependencies paylibPaymentDependencies, PaylibPlatformDependencies paylibPlatformDependencies, PaylibNativePayMethodsDependencies paylibNativePayMethodsDependencies) {
            this.f5827b = this;
            m4676a(c8596c, interfaceC8605c, paylibDomainDependencies, paylibLoggingDependencies, paylibPaymentDependencies, paylibPlatformDependencies, paylibNativePayMethodsDependencies);
        }

        @Override // com.sdkit.paylib.paylibsdk.client.p041di.InterfaceC8595b
        /* renamed from: a */
        public PaylibSdk mo4675a() {
            return new PaylibSdk(DoubleCheck.lazy(this.f5829d), DoubleCheck.lazy(this.f5835j), DoubleCheck.lazy(this.f5837l), DoubleCheck.lazy(this.f5839n));
        }

        /* renamed from: a */
        public final void m4676a(C8596c c8596c, InterfaceC8605c interfaceC8605c, PaylibDomainDependencies paylibDomainDependencies, PaylibLoggingDependencies paylibLoggingDependencies, PaylibPaymentDependencies paylibPaymentDependencies, PaylibPlatformDependencies paylibPlatformDependencies, PaylibNativePayMethodsDependencies paylibNativePayMethodsDependencies) {
            Factory factoryCreate = InstanceFactory.create(paylibLoggingDependencies);
            this.f5828c = factoryCreate;
            this.f5829d = DoubleCheck.provider(C8598e.m4689a(c8596c, factoryCreate));
            this.f5830e = InstanceFactory.create(paylibPaymentDependencies);
            this.f5831f = new a(interfaceC8605c);
            Factory factoryCreate2 = InstanceFactory.create(paylibPlatformDependencies);
            this.f5832g = factoryCreate2;
            Provider provider = DoubleCheck.provider(C8602i.m4701a(c8596c, factoryCreate2));
            this.f5833h = provider;
            Provider provider2 = DoubleCheck.provider(C8600g.m4695a(c8596c, this.f5831f, this.f5829d, provider));
            this.f5834i = provider2;
            this.f5835j = DoubleCheck.provider(C8601h.m4698a(c8596c, this.f5830e, provider2, this.f5829d, this.f5833h));
            Factory factoryCreate3 = InstanceFactory.create(paylibDomainDependencies);
            this.f5836k = factoryCreate3;
            this.f5837l = DoubleCheck.provider(C8597d.m4686a(c8596c, factoryCreate3, this.f5829d, this.f5835j, this.f5833h));
            Factory factoryCreate4 = InstanceFactory.create(paylibNativePayMethodsDependencies);
            this.f5838m = factoryCreate4;
            this.f5839n = DoubleCheck.provider(C8599f.m4692a(c8596c, factoryCreate4, this.f5837l, this.f5829d, this.f5834i, this.f5835j, this.f5833h));
        }
    }

    /* renamed from: a */
    public static b m4667a() {
        return new b();
    }
}
