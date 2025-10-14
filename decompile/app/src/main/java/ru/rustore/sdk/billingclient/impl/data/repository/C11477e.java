package ru.rustore.sdk.billingclient.impl.data.repository;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.analytics.AnalyticsEventProvider;
import ru.rustore.sdk.billingclient.impl.analytics.C11413i;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.repository.e */
/* loaded from: classes8.dex */
public final class C11477e extends Lambda implements Function0<Unit> {

    /* renamed from: a */
    public final /* synthetic */ C11474b f10289a;

    /* renamed from: b */
    public final /* synthetic */ C11413i f10290b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11477e(C11474b c11474b, C11413i c11413i) {
        super(0);
        this.f10289a = c11474b;
        this.f10290b = c11413i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C11474b c11474b = this.f10289a;
        AnalyticsEventProvider analyticsEventProvider = c11474b.f10281a;
        Context context = c11474b.f10284d;
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        analyticsEventProvider.postAnalyticsEvent(context, packageName, this.f10290b);
        return Unit.INSTANCE;
    }
}
