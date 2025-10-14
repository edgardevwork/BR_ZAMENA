package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.coreutils.impl.b */
/* loaded from: classes7.dex */
public final class C8719b extends Lambda implements Function0 {

    /* renamed from: a */
    public final /* synthetic */ Context f6137a;

    /* renamed from: b */
    public final /* synthetic */ String f6138b;

    /* renamed from: c */
    public final /* synthetic */ int f6139c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8719b(Context context, String str, int i) {
        super(0);
        this.f6137a = context;
        this.f6138b = str;
        this.f6139c = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f6137a.getPackageManager().getApplicationInfo(this.f6138b, this.f6139c);
    }
}
