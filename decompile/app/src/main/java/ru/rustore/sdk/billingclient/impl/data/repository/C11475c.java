package ru.rustore.sdk.billingclient.impl.data.repository;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.billingclient.impl.analytics.C11413i;
import ru.rustore.sdk.billingclient.impl.data.mapper.C11446a;
import ru.rustore.sdk.metrics.MetricsEvent;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.repository.c */
/* loaded from: classes8.dex */
public final class C11475c extends Lambda implements Function0<MetricsEvent> {

    /* renamed from: a */
    public final /* synthetic */ C11474b f10286a;

    /* renamed from: b */
    public final /* synthetic */ C11413i f10287b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11475c(C11474b c11474b, C11413i c11413i) {
        super(0);
        this.f10286a = c11474b;
        this.f10287b = c11413i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MetricsEvent invoke() {
        C11446a c11446a = this.f10286a.f10283c;
        C11413i model = this.f10287b;
        c11446a.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        return new MetricsEvent(model.f10177a, model.f10178b);
    }
}
