package ru.rustore.sdk.billingclient.presentation;

import com.sdkit.paylib.paylibnative.api.entity.PaylibNativeTheme;
import com.sdkit.paylib.paylibsdk.client.domain.PaylibSdkConfig;
import kotlin.Lazy;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11519f;
import ru.rustore.sdk.billingclient.impl.p067di.C11497a;
import ru.rustore.sdk.billingclient.provider.BillingClientThemeProvider;

/* renamed from: ru.rustore.sdk.billingclient.presentation.a */
/* loaded from: classes7.dex */
public final class C11557a implements PaylibSdkConfig {

    /* renamed from: a */
    public final BillingClientThemeProvider f10607a;

    /* renamed from: b */
    public final C11519f f10608b;

    /* renamed from: ru.rustore.sdk.billingclient.presentation.a$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10609a;

        static {
            int[] iArr = new int[BillingClientTheme.values().length];
            try {
                iArr[BillingClientTheme.Light.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BillingClientTheme.Dark.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f10609a = iArr;
        }
    }

    public C11557a(BillingClientThemeProvider billingClientThemeProvider) {
        this.f10607a = billingClientThemeProvider;
        Lazy<C11497a> lazy = C11497a.f10328u0;
        this.f10608b = (C11519f) C11497a.C11965b.m7463a().f10349U.getValue();
    }

    @Override // com.sdkit.paylib.paylibsdk.client.domain.PaylibSdkConfig
    public final PaylibNativeTheme getTheme() {
        BillingClientThemeProvider billingClientThemeProvider = this.f10607a;
        BillingClientTheme billingClientThemeProvide = billingClientThemeProvider != null ? billingClientThemeProvider.provide() : null;
        int i = billingClientThemeProvide == null ? -1 : a.f10609a[billingClientThemeProvide.ordinal()];
        if (i == 1) {
            return PaylibNativeTheme.LIGHT;
        }
        if (i != 2) {
            return null;
        }
        return PaylibNativeTheme.NIGHT_BLUE;
    }

    @Override // com.sdkit.paylib.paylibsdk.client.domain.PaylibSdkConfig
    public final boolean isSandbox() {
        return this.f10608b.m7469a();
    }

    @Override // com.sdkit.paylib.paylibsdk.client.domain.PaylibSdkConfig
    public final boolean useThemeIcon() {
        return true;
    }
}
