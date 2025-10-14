package ru.rustore.sdk.billingclient.impl.domain.usecase;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import ru.rustore.sdk.billingclient.impl.data.repository.C11481i;
import ru.rustore.sdk.core.exception.RuStoreException;

/* renamed from: ru.rustore.sdk.billingclient.impl.domain.usecase.g */
/* loaded from: classes5.dex */
public final class C11520g extends Lambda implements Function0<String> {

    /* renamed from: a */
    public final /* synthetic */ C11523j f10517a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11520g(C11523j c11523j) {
        super(0);
        this.f10517a = c11523j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String str;
        C11481i c11481i = this.f10517a.f10520a;
        synchronized (c11481i) {
            str = c11481i.f10293a;
        }
        if (str == null || StringsKt__StringsJVMKt.isBlank(str)) {
            throw new RuStoreException("Invalid product id");
        }
        return str;
    }
}
