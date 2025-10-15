package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsItem;
import io.appmetrica.analytics.StartupParamsItemStatus;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.Xk */
/* loaded from: classes6.dex */
public final class C9339Xk {

    /* renamed from: a */
    public final C9387Zk f7540a = new C9387Zk();

    /* renamed from: a */
    public final StartupParamsItem m5758a(IdentifiersResult identifiersResult) {
        String str = identifiersResult.f9419id;
        C9387Zk c9387Zk = this.f7540a;
        IdentifierStatus identifierStatus = identifiersResult.status;
        c9387Zk.getClass();
        int i = AbstractC9363Yk.f7607a[identifierStatus.ordinal()];
        return new StartupParamsItem(str, i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? StartupParamsItemStatus.UNKNOWN_ERROR : StartupParamsItemStatus.FEATURE_DISABLED : StartupParamsItemStatus.NETWORK_ERROR : StartupParamsItemStatus.INVALID_VALUE_FROM_PROVIDER : StartupParamsItemStatus.PROVIDER_UNAVAILABLE : StartupParamsItemStatus.OK, identifiersResult.errorExplanation);
    }
}
