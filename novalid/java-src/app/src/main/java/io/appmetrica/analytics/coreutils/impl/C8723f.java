package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.coreutils.impl.f */
/* loaded from: classes7.dex */
public final class C8723f extends Lambda implements Function0 {

    /* renamed from: a */
    public final /* synthetic */ Context f6148a;

    /* renamed from: b */
    public final /* synthetic */ String f6149b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8723f(Context context, String str) {
        super(0);
        this.f6148a = context;
        this.f6149b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(this.f6148a.getPackageManager().hasSystemFeature(this.f6149b));
    }
}
