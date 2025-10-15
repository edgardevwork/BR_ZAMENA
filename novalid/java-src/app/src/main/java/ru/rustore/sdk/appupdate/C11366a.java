package ru.rustore.sdk.appupdate;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.analytics.AnalyticsEventProvider;

/* renamed from: ru.rustore.sdk.appupdate.a */
/* loaded from: classes7.dex */
public final class C11366a extends Lambda implements Function0<Unit> {

    /* renamed from: a */
    public final /* synthetic */ C11374e f10071a;

    /* renamed from: b */
    public final /* synthetic */ C11382i f10072b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11366a(C11374e c11374e, C11382i c11382i) {
        super(0);
        this.f10071a = c11374e;
        this.f10072b = c11382i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C11374e c11374e = this.f10071a;
        AnalyticsEventProvider analyticsEventProvider = c11374e.f10084d;
        Context context = c11374e.f10085e;
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        analyticsEventProvider.postAnalyticsEvent(context, packageName, this.f10072b);
        return Unit.INSTANCE;
    }
}
