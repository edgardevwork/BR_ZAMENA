package com.sdkit.paylib.paylibsdk.client.p041di.utils;

import com.sdkit.paylib.paylibpayment.api.config.InternalConfigProvider;

/* renamed from: com.sdkit.paylib.paylibsdk.client.di.utils.a */
/* loaded from: classes8.dex */
public final class C8603a implements InternalConfigProvider {
    @Override // com.sdkit.paylib.paylibpayment.api.config.InternalConfigProvider
    public String provide() {
        return "{\"is_light_mode_enabled\":true,\"long_polling_params\":\"15,30,2\"}";
    }
}
