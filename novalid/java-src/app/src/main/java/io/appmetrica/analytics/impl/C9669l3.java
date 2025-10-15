package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* renamed from: io.appmetrica.analytics.impl.l3 */
/* loaded from: classes6.dex */
public final class C9669l3 implements IBinaryDataHelper {

    /* renamed from: a */
    public final IBinaryDataHelper f8540a;

    public C9669l3(IBinaryDataHelper iBinaryDataHelper) {
        this.f8540a = iBinaryDataHelper;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final byte[] get(String str) {
        return this.f8540a.get(str);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final void insert(String str, byte[] bArr) {
        this.f8540a.insert(str, bArr);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final void remove(String str) {
        this.f8540a.remove(str);
    }
}
