package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.coreutils.impl.e */
/* loaded from: classes7.dex */
public final class C8722e extends Lambda implements Function0 {

    /* renamed from: a */
    public final /* synthetic */ Context f6145a;

    /* renamed from: b */
    public final /* synthetic */ ComponentName f6146b;

    /* renamed from: c */
    public final /* synthetic */ int f6147c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8722e(Context context, ComponentName componentName, int i) {
        super(0);
        this.f6145a = context;
        this.f6146b = componentName;
        this.f6147c = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f6145a.getPackageManager().getServiceInfo(this.f6146b, this.f6147c);
    }
}
