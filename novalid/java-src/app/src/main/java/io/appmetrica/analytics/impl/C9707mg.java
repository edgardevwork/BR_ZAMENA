package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.UnsupportedEncodingException;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.mg */
/* loaded from: classes6.dex */
public final class C9707mg implements Function {

    /* renamed from: a */
    public final /* synthetic */ C10016z0 f8652a;

    public C9707mg(C10016z0 c10016z0) {
        this.f8652a = c10016z0;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    public final Object apply(Object obj) throws UnsupportedEncodingException {
        String str = (String) obj;
        C10016z0 c10016z0 = this.f8652a;
        String str2 = c10016z0.f9376c;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(c10016z0.f9379f.f6298a);
        Set set = AbstractC9875t9.f9105a;
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        Bundle bundle = new Bundle();
        bundle.putString("payload_crash_id", str2);
        C9445c4 c9445c4 = new C9445c4("", "", 5898, 0, orCreatePublicLogger);
        if (str != null) {
            c9445c4.m5943f(str);
        }
        c9445c4.f7321m = bundle;
        c9445c4.f7311c = this.f8652a.f9379f.f6303f;
        return c9445c4;
    }
}
