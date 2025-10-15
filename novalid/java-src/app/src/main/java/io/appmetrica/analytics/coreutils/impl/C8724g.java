package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.coreutils.impl.g */
/* loaded from: classes7.dex */
public final class C8724g extends Lambda implements Function0 {

    /* renamed from: a */
    public final /* synthetic */ Context f6150a;

    /* renamed from: b */
    public final /* synthetic */ Intent f6151b;

    /* renamed from: c */
    public final /* synthetic */ int f6152c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8724g(Context context, Intent intent, int i) {
        super(0);
        this.f6150a = context;
        this.f6151b = intent;
        this.f6152c = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f6150a.getPackageManager().resolveActivity(this.f6151b, this.f6152c);
    }
}
