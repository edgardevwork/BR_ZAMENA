package com.sdkit.paylib.paylibsdk.client.p041di.utils;

import com.sdkit.paylib.paylibdomain.api.config.PaylibDomainFeatureFlags;
import com.sdkit.paylib.paylibnative.api.config.PaylibNativeFeatureFlags;
import com.sdkit.paylib.paylibpayment.api.config.PayLibPaymentFeatureFlags;

/* renamed from: com.sdkit.paylib.paylibsdk.client.di.utils.f */
/* loaded from: classes5.dex */
public final class C8608f {

    /* renamed from: a */
    public final PaylibDomainFeatureFlags f5872a = new a();

    /* renamed from: b */
    public final PaylibNativeFeatureFlags f5873b = new b();

    /* renamed from: c */
    public final PayLibPaymentFeatureFlags f5874c = new c();

    /* renamed from: com.sdkit.paylib.paylibsdk.client.di.utils.f$a */
    /* loaded from: classes8.dex */
    public static final class a implements PaylibDomainFeatureFlags {

        /* renamed from: a */
        public final boolean f5875a = true;

        @Override // com.sdkit.paylib.paylibdomain.api.config.PaylibDomainFeatureFlags
        public boolean isCheckInvoiceExecutedStatusEnabled() {
            return this.f5875a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibsdk.client.di.utils.f$b */
    /* loaded from: classes8.dex */
    public static final class b implements PaylibNativeFeatureFlags {

        /* renamed from: b */
        public final boolean f5877b;

        /* renamed from: e */
        public final boolean f5880e;

        /* renamed from: a */
        public final boolean f5876a = true;

        /* renamed from: c */
        public final boolean f5878c = true;

        /* renamed from: d */
        public final boolean f5879d = true;

        /* renamed from: f */
        public final boolean f5881f = true;

        /* renamed from: g */
        public final boolean f5882g = true;

        /* renamed from: h */
        public final boolean f5883h = true;

        /* renamed from: i */
        public final boolean f5884i = true;

        @Override // com.sdkit.paylib.paylibnative.api.config.PaylibNativeFeatureFlags
        public Boolean getStartExpanded() {
            return PaylibNativeFeatureFlags.DefaultImpls.getStartExpanded(this);
        }

        @Override // com.sdkit.paylib.paylibnative.api.config.PaylibNativeFeatureFlags
        public Boolean getUseSheetHandle() {
            return Boolean.valueOf(this.f5884i);
        }

        @Override // com.sdkit.paylib.paylibnative.api.config.PaylibNativeFeatureFlags
        public Boolean isPaylibAddCardFlowWithProfileEnabled() {
            return Boolean.valueOf(this.f5877b);
        }

        @Override // com.sdkit.paylib.paylibnative.api.config.PaylibNativeFeatureFlags
        public Boolean isPaylibMobileEnabled() {
            return Boolean.valueOf(this.f5881f);
        }

        @Override // com.sdkit.paylib.paylibnative.api.config.PaylibNativeFeatureFlags
        public Boolean isPaylibSbpAllBanksEnabled() {
            return Boolean.valueOf(this.f5880e);
        }

        @Override // com.sdkit.paylib.paylibnative.api.config.PaylibNativeFeatureFlags
        public Boolean isPaylibSbpEnabled() {
            return Boolean.valueOf(this.f5879d);
        }

        @Override // com.sdkit.paylib.paylibnative.api.config.PaylibNativeFeatureFlags
        public Boolean isPaylibTPayEnabled() {
            return Boolean.valueOf(this.f5878c);
        }

        @Override // com.sdkit.paylib.paylibnative.api.config.PaylibNativeFeatureFlags
        public Boolean isPaylibUseSaveCardFlowEnabled() {
            return Boolean.valueOf(this.f5882g);
        }

        @Override // com.sdkit.paylib.paylibnative.api.config.PaylibNativeFeatureFlags
        public Boolean isSbolPayEnabled() {
            return Boolean.valueOf(this.f5876a);
        }

        @Override // com.sdkit.paylib.paylibnative.api.config.PaylibNativeFeatureFlags
        public Boolean isSbolPayInExecutedStatusAvailable() {
            return Boolean.valueOf(this.f5883h);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibsdk.client.di.utils.f$c */
    /* loaded from: classes8.dex */
    public static final class c implements PayLibPaymentFeatureFlags {

        /* renamed from: a */
        public final boolean f5885a = true;

        @Override // com.sdkit.paylib.paylibpayment.api.config.PayLibPaymentFeatureFlags
        public boolean isSslPinningEnabled() {
            return PayLibPaymentFeatureFlags.DefaultImpls.isSslPinningEnabled(this);
        }

        @Override // com.sdkit.paylib.paylibpayment.api.config.PayLibPaymentFeatureFlags
        public Boolean isTracingEnabled() {
            return Boolean.valueOf(this.f5885a);
        }

        @Override // com.sdkit.paylib.paylibpayment.api.config.PayLibPaymentFeatureFlags
        public boolean isUseChannelAndAuthConnector() {
            return PayLibPaymentFeatureFlags.DefaultImpls.isUseChannelAndAuthConnector(this);
        }
    }

    /* renamed from: a */
    public final PaylibDomainFeatureFlags m4710a() {
        return this.f5872a;
    }

    /* renamed from: b */
    public final PaylibNativeFeatureFlags m4711b() {
        return this.f5873b;
    }

    /* renamed from: c */
    public final PayLibPaymentFeatureFlags m4712c() {
        return this.f5874c;
    }
}
