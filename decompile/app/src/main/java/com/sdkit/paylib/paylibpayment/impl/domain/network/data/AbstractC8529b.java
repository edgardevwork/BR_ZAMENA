package com.sdkit.paylib.paylibpayment.impl.domain.network.data;

import com.sdkit.paylib.paylibpayment.api.config.BackendUrlProvider;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaylibContext;
import com.sdkit.paylib.paylibutils.lib.C8610b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.b */
/* loaded from: classes8.dex */
public abstract class AbstractC8529b {
    /* renamed from: a */
    public static final String m4000a(BackendUrlProvider backendUrlProvider, PaylibContext context) {
        String baseUrl;
        Intrinsics.checkNotNullParameter(context, "context");
        if (backendUrlProvider == null || (baseUrl = backendUrlProvider.baseUrl(context)) == null) {
            baseUrl = backendUrlProvider != null ? backendUrlProvider.getBaseUrl() : null;
        }
        if (baseUrl != null && !StringsKt__StringsJVMKt.isBlank(baseUrl)) {
            return baseUrl;
        }
        return "https://smartmarket.online." + C8610b.f5886a.m4714a() + "bank.ru/";
    }
}
