package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.f3 */
/* loaded from: classes8.dex */
public final class C9519f3 implements BillingInfoStorage {

    /* renamed from: a */
    public final ProtobufStateStorage f8050a;

    /* renamed from: b */
    public C9843s2 f8051b;

    public C9519f3(@NonNull Context context) {
        this(C9268Ul.m5684a(C9843s2.class).m5697a(context));
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    @NonNull
    public final List<BillingInfo> getBillingInfo() {
        return this.f8051b.f9032a;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final boolean isFirstInappCheckOccurred() {
        return this.f8051b.f9033b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final void saveInfo(@NonNull List<BillingInfo> list, boolean z) {
        for (BillingInfo billingInfo : list) {
        }
        C9843s2 c9843s2 = new C9843s2(list, z);
        this.f8051b = c9843s2;
        this.f8050a.save(c9843s2);
    }

    public C9519f3(ProtobufStateStorage protobufStateStorage) {
        this.f8050a = protobufStateStorage;
        this.f8051b = (C9843s2) protobufStateStorage.read();
    }
}
