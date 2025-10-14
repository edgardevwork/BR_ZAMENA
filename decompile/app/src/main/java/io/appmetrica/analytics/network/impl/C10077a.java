package io.appmetrica.analytics.network.impl;

import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.network.impl.a */
/* loaded from: classes6.dex */
public final class C10077a extends Lambda implements Function0 {

    /* renamed from: a */
    public final /* synthetic */ HttpsURLConnection f9527a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10077a(HttpsURLConnection httpsURLConnection) {
        super(0);
        this.f9527a = httpsURLConnection;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f9527a.getInputStream();
    }
}
