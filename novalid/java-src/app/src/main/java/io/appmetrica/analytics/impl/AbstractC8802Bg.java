package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.Bg */
/* loaded from: classes7.dex */
public abstract class AbstractC8802Bg implements InterfaceC8827Cg {

    /* renamed from: a */
    @NonNull
    protected final DataSendingRestrictionController f6380a;

    public AbstractC8802Bg(@NonNull DataSendingRestrictionController dataSendingRestrictionController) {
        this.f6380a = dataSendingRestrictionController;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8827Cg
    /* renamed from: a */
    public boolean mo5003a(@Nullable Boolean bool) {
        return ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
