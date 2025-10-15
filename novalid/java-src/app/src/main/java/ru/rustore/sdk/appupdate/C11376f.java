package ru.rustore.sdk.appupdate;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.analytics.AnalyticsEventProvider;

/* renamed from: ru.rustore.sdk.appupdate.f */
/* loaded from: classes7.dex */
public final class C11376f extends Lambda implements Function0<Unit> {

    /* renamed from: a */
    public final /* synthetic */ C11374e f10106a;

    /* renamed from: b */
    public final /* synthetic */ C11382i f10107b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11376f(C11374e c11374e, C11382i c11382i) {
        super(0);
        this.f10106a = c11374e;
        this.f10107b = c11382i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C11374e c11374e = this.f10106a;
        AnalyticsEventProvider analyticsEventProvider = c11374e.f10084d;
        Context context = c11374e.f10085e;
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        analyticsEventProvider.postAnalyticsEvent(context, packageName, this.f10107b);
        return Unit.INSTANCE;
    }
}
