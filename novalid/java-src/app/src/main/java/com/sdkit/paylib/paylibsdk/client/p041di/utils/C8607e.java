package com.sdkit.paylib.paylibsdk.client.p041di.utils;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggingConfig;
import com.sdkit.paylib.paylibnative.api.entity.PaylibNativeTheme;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeConfigProvider;
import com.sdkit.paylib.paylibsdk.client.domain.PaylibSdkConfig;

/* renamed from: com.sdkit.paylib.paylibsdk.client.di.utils.e */
/* loaded from: classes5.dex */
public final class C8607e {

    /* renamed from: a */
    public final PaylibSdkConfig f5869a;

    /* renamed from: com.sdkit.paylib.paylibsdk.client.di.utils.e$a */
    /* loaded from: classes8.dex */
    public static final class a implements PaylibLoggingConfig {

        /* renamed from: a */
        public final /* synthetic */ PaylibSdkConfig f5870a;

        public a(PaylibSdkConfig paylibSdkConfig) {
            this.f5870a = paylibSdkConfig;
        }

        @Override // com.sdkit.paylib.payliblogging.api.logging.PaylibLoggingConfig
        public boolean isSandbox() {
            return this.f5870a.isSandbox();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibsdk.client.di.utils.e$b */
    /* loaded from: classes8.dex */
    public static final class b implements PaylibNativeConfigProvider {

        /* renamed from: a */
        public final /* synthetic */ PaylibSdkConfig f5871a;

        public b(PaylibSdkConfig paylibSdkConfig) {
            this.f5871a = paylibSdkConfig;
        }

        @Override // com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeConfigProvider
        public PaylibNativeTheme getTheme() {
            return this.f5871a.getTheme();
        }

        @Override // com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeConfigProvider
        public boolean isSandbox() {
            return this.f5871a.isSandbox();
        }

        @Override // com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeConfigProvider
        public boolean useThemeIcon() {
            return this.f5871a.useThemeIcon();
        }
    }

    public C8607e(PaylibSdkConfig paylibSdkConfig) {
        this.f5869a = paylibSdkConfig;
    }

    /* renamed from: a */
    public final PaylibLoggingConfig m4708a() {
        PaylibSdkConfig paylibSdkConfig = this.f5869a;
        if (paylibSdkConfig != null) {
            return new a(paylibSdkConfig);
        }
        return null;
    }

    /* renamed from: b */
    public final PaylibNativeConfigProvider m4709b() {
        PaylibSdkConfig paylibSdkConfig = this.f5869a;
        if (paylibSdkConfig != null) {
            return new b(paylibSdkConfig);
        }
        return null;
    }
}
