package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.coreutils.impl.i */
/* loaded from: classes7.dex */
public final class C8726i extends Lambda implements Function0 {

    /* renamed from: a */
    public final /* synthetic */ Context f6155a;

    /* renamed from: b */
    public final /* synthetic */ Intent f6156b;

    /* renamed from: c */
    public final /* synthetic */ int f6157c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8726i(Context context, Intent intent, int i) {
        super(0);
        this.f6155a = context;
        this.f6156b = intent;
        this.f6157c = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f6155a.getPackageManager().resolveService(this.f6156b, this.f6157c);
    }
}
