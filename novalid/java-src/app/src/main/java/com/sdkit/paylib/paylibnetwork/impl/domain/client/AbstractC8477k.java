package com.sdkit.paylib.paylibnetwork.impl.domain.client;

import com.sdkit.paylib.paylibnetwork.api.domain.client.WebClientConfig;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.client.k */
/* loaded from: classes6.dex */
public abstract class AbstractC8477k {
    /* renamed from: a */
    public static final boolean m3840a(WebClientConfig webClientConfig) {
        String str;
        Intrinsics.checkNotNullParameter(webClientConfig, "<this>");
        Map<String, String> extraParams = webClientConfig.getExtraParams();
        if (extraParams == null || (str = extraParams.get("disableSsl")) == null) {
            return false;
        }
        return Boolean.parseBoolean(str);
    }
}
