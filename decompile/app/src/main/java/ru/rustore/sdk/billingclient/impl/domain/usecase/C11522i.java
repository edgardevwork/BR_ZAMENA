package ru.rustore.sdk.billingclient.impl.domain.usecase;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.billingclient.impl.domain.model.UnauthorizedProductType;

/* renamed from: ru.rustore.sdk.billingclient.impl.domain.usecase.i */
/* loaded from: classes5.dex */
public final class C11522i extends Lambda implements Function1<Throwable, UnauthorizedProductType> {

    /* renamed from: a */
    public static final C11522i f10519a = new C11522i();

    public C11522i() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final UnauthorizedProductType invoke(Throwable th) {
        Throwable it = th;
        Intrinsics.checkNotNullParameter(it, "it");
        return UnauthorizedProductType.UNKNOWN;
    }
}
