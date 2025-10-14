package com.sdkit.paylib.paylibpayment.impl.domain.network.data.okhttp;

import com.sdkit.paylib.paylibnetwork.api.domain.client.WebClientConfig;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.okhttp.c */
/* loaded from: classes8.dex */
public final class C8547c {
    /* renamed from: a */
    public final WebClientConfig m4101a(boolean z) {
        return new WebClientConfig(z ? MapsKt__MapsJVMKt.mapOf(TuplesKt.m7112to("disableSsl", "true")) : null);
    }
}
