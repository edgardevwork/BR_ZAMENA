package ru.rustore.sdk.billingclient.impl.data.repository;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.billingclient.impl.data.model.C11454b;
import ru.rustore.sdk.billingclient.impl.domain.model.C11504a;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.repository.j */
/* loaded from: classes8.dex */
public final class C11482j extends Lambda implements Function1<C11454b, C11504a> {

    /* renamed from: a */
    public static final C11482j f10294a = new C11482j();

    public C11482j() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C11504a invoke(C11454b c11454b) {
        String value = c11454b.f10240a;
        Intrinsics.checkNotNullParameter(value, "dto");
        Intrinsics.checkNotNullParameter(value, "value");
        return new C11504a(value);
    }
}
