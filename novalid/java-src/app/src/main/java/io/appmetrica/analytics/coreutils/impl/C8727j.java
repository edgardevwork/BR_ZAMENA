package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.coreutils.impl.j */
/* loaded from: classes7.dex */
public final class C8727j extends Lambda implements Function0 {

    /* renamed from: a */
    public final /* synthetic */ Context f6158a;

    /* renamed from: b */
    public final /* synthetic */ ComponentName f6159b;

    /* renamed from: c */
    public final /* synthetic */ int f6160c;

    /* renamed from: d */
    public final /* synthetic */ int f6161d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8727j(Context context, ComponentName componentName, int i, int i2) {
        super(0);
        this.f6158a = context;
        this.f6159b = componentName;
        this.f6160c = i;
        this.f6161d = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f6158a.getPackageManager().setComponentEnabledSetting(this.f6159b, this.f6160c, this.f6161d);
        return Unit.INSTANCE;
    }
}
