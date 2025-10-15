package io.appmetrica.analytics.identifiers.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.identifiers.impl.C8739a;
import io.appmetrica.analytics.identifiers.impl.C8741c;
import io.appmetrica.analytics.identifiers.impl.C8742d;
import io.appmetrica.analytics.identifiers.impl.InterfaceC8740b;

@Keep
/* loaded from: classes6.dex */
public class AdvIdentifiersProvider {
    private static final C8742d retriever = new C8742d();

    public static Bundle requestIdentifiers(@NonNull Context context, @NonNull Bundle bundle) {
        C8741c c8741cMo4914a;
        InterfaceC8740b interfaceC8740b = (InterfaceC8740b) retriever.f6280a.get(bundle.getString("io.appmetrica.analytics.identifiers.extra.PROVIDER"));
        if (interfaceC8740b == null || (c8741cMo4914a = interfaceC8740b.mo4914a(context)) == null) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        C8739a c8739a = c8741cMo4914a.f6278b;
        if (c8739a != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("io.appmetrica.analytics.identifiers.extra.PROVIDER", c8739a.f6274a);
            bundle3.putString("io.appmetrica.analytics.identifiers.extra.ID", c8739a.f6275b);
            Boolean bool = c8739a.f6276c;
            if (bool != null) {
                bundle3.putBoolean("io.appmetrica.analytics.identifiers.extra.LIMITED", bool.booleanValue());
            }
            bundle2.putBundle("io.appmetrica.analytics.identifiers.extra.TRACKING_INFO", bundle3);
        }
        bundle2.putString("io.appmetrica.analytics.identifiers.extra.STATUS", c8741cMo4914a.f6277a.getValue());
        bundle2.putString("io.appmetrica.analytics.identifiers.extra.ERROR_MESSAGE", c8741cMo4914a.f6279c);
        return bundle2;
    }
}
