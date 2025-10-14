package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: io.appmetrica.analytics.impl.Rf */
/* loaded from: classes6.dex */
public final class C9190Rf implements InterfaceC8835D {

    /* renamed from: a */
    public final String f7205a;

    /* renamed from: b */
    public final C9167Qf f7206b;

    public C9190Rf(@NonNull String str) {
        this(str, new C9167Qf());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8835D
    @NonNull
    /* renamed from: a */
    public final AdTrackingInfoResult mo5041a(@NonNull Context context) {
        return mo5042a(context, new C9879td());
    }

    /* renamed from: b */
    public final AdTrackingInfoResult m5525b(Context context) throws NoSuchMethodException, SecurityException {
        Method method = Class.forName("io.appmetrica.analytics.identifiers.internal.AdvIdentifiersProvider").getMethod("requestIdentifiers", Context.class, Bundle.class);
        Bundle bundle = new Bundle();
        bundle.putString("io.appmetrica.analytics.identifiers.extra.PROVIDER", this.f7205a);
        C9167Qf c9167Qf = this.f7206b;
        Object[] objArr = {context, bundle};
        AdTrackingInfo adTrackingInfo = null;
        Bundle bundle2 = (Bundle) method.invoke(null, objArr);
        c9167Qf.getClass();
        if (bundle2 == null) {
            return null;
        }
        Bundle bundle3 = bundle2.getBundle("io.appmetrica.analytics.identifiers.extra.TRACKING_INFO");
        if (bundle3 != null) {
            Object obj = AbstractC8816C5.f6427a.get(bundle3.getString("io.appmetrica.analytics.identifiers.extra.PROVIDER"));
            if (obj == null) {
                throw new IllegalArgumentException(("Provider " + bundle3.getString("io.appmetrica.analytics.identifiers.extra.PROVIDER") + " is invalid").toString());
            }
            adTrackingInfo = new AdTrackingInfo((AdTrackingInfo.Provider) obj, bundle3.getString("io.appmetrica.analytics.identifiers.extra.ID"), bundle3.containsKey("io.appmetrica.analytics.identifiers.extra.LIMITED") ? Boolean.valueOf(bundle3.getBoolean("io.appmetrica.analytics.identifiers.extra.LIMITED")) : null);
        }
        return new AdTrackingInfoResult(adTrackingInfo, IdentifierStatus.INSTANCE.from(bundle2.getString("io.appmetrica.analytics.identifiers.extra.STATUS")), bundle2.getString("io.appmetrica.analytics.identifiers.extra.ERROR_MESSAGE"));
    }

    public C9190Rf(String str, C9167Qf c9167Qf) {
        this.f7205a = str;
        this.f7206b = c9167Qf;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8835D
    @NonNull
    /* renamed from: a */
    public final AdTrackingInfoResult mo5042a(@NonNull Context context, @NonNull InterfaceC9360Yh interfaceC9360Yh) throws InterruptedException {
        AdTrackingInfoResult adTrackingInfoResult;
        AdTrackingInfoResult adTrackingInfoResult2;
        if (ReflectionUtils.detectClassExists("io.appmetrica.analytics.identifiers.internal.AdvIdentifiersProvider")) {
            C8982Im c8982Im = (C8982Im) interfaceC9360Yh;
            c8982Im.f6797c = 0;
            adTrackingInfoResult = null;
            while (c8982Im.m5282b()) {
                try {
                    return m5525b(context);
                } catch (InvocationTargetException e) {
                    String message = e.getTargetException() != null ? e.getTargetException().getMessage() : null;
                    adTrackingInfoResult2 = new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "exception while fetching " + this.f7205a + " adv_id: " + message);
                    adTrackingInfoResult = adTrackingInfoResult2;
                    try {
                        Thread.sleep(((C8982Im) interfaceC9360Yh).f6796b);
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    adTrackingInfoResult2 = new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "exception while fetching " + this.f7205a + " adv_id: " + th.getMessage());
                    adTrackingInfoResult = adTrackingInfoResult2;
                    Thread.sleep(((C8982Im) interfaceC9360Yh).f6796b);
                }
            }
        } else {
            adTrackingInfoResult = new AdTrackingInfoResult(null, IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, "Module io.appmetrica.analytics:analytics-identifiers does not exist");
        }
        return adTrackingInfoResult == null ? new AdTrackingInfoResult() : adTrackingInfoResult;
    }
}
