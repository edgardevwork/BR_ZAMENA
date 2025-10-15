package com.sdkit.paylib.paylibnative.p033ui.config;

import com.sdkit.paylib.paylibdomain.api.deeplink.DeeplinkHandler;
import com.sdkit.paylib.paylibnative.api.analytics.CustomPaylibAnalytics;
import com.sdkit.paylib.paylibnative.api.config.PaylibNativeFeatureFlags;
import com.sdkit.paylib.paylibnative.api.deviceauth.DeviceAuthDelegate;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeConfigProvider;
import com.sdkit.paylib.paylibpayment.api.config.InternalConfigProvider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.config.e */
/* loaded from: classes8.dex */
public interface InterfaceC8134e {
    /* renamed from: a */
    AbstractC8130a mo2018a();

    /* renamed from: b */
    CustomPaylibAnalytics mo2019b();

    InternalConfigProvider getConfigProvider();

    DeeplinkHandler getDeeplinkHandler();

    DeviceAuthDelegate getDeviceAuthDelegate();

    PaylibNativeFeatureFlags getFeatureFlags();

    PaylibNativeConfigProvider getPaylibNativeConfigProvider();
}
