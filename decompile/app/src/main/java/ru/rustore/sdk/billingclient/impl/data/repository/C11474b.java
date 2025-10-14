package ru.rustore.sdk.billingclient.impl.data.repository;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.analytics.AnalyticsEventProvider;
import ru.rustore.sdk.billingclient.impl.analytics.C11413i;
import ru.rustore.sdk.billingclient.impl.data.mapper.C11446a;
import ru.rustore.sdk.metrics.MetricsClient;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleFlatMapKt;
import ru.rustore.sdk.reactive.single.SingleOnErrorReturnKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.repository.b */
/* loaded from: classes5.dex */
public final class C11474b {

    /* renamed from: a */
    public final AnalyticsEventProvider f10281a;

    /* renamed from: b */
    public final MetricsClient f10282b;

    /* renamed from: c */
    public final C11446a f10283c;

    /* renamed from: d */
    public final Context f10284d;

    /* renamed from: ru.rustore.sdk.billingclient.impl.data.repository.b$a */
    /* loaded from: classes8.dex */
    public static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: a */
        public static final a f10285a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            Throwable it = th;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public C11474b(AnalyticsEventProvider analyticsEventProvider, MetricsClient metricsClient, C11446a mapper, Context context) {
        Intrinsics.checkNotNullParameter(analyticsEventProvider, "analyticsEventProvider");
        Intrinsics.checkNotNullParameter(metricsClient, "metricsClient");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10281a = analyticsEventProvider;
        this.f10282b = metricsClient;
        this.f10283c = mapper;
        this.f10284d = context;
    }

    /* renamed from: a */
    public final Single<Unit> m7454a(C11413i event, boolean z) {
        Intrinsics.checkNotNullParameter(event, "event");
        return SingleOnErrorReturnKt.onErrorReturn(SingleSubscribeOnKt.subscribeOn(z ? SingleFlatMapKt.flatMap(Single.INSTANCE.from(new C11475c(this, event)), new C11476d(this)) : Single.INSTANCE.from(new C11477e(this, event)), Dispatchers.INSTANCE.getIo()), a.f10285a);
    }
}
