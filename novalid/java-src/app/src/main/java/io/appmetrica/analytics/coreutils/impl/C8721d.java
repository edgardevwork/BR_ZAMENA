package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.coreutils.impl.d */
/* loaded from: classes7.dex */
public final class C8721d extends Lambda implements Function0 {

    /* renamed from: a */
    public final /* synthetic */ Context f6142a;

    /* renamed from: b */
    public final /* synthetic */ String f6143b;

    /* renamed from: c */
    public final /* synthetic */ int f6144c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8721d(Context context, String str, int i) {
        super(0);
        this.f6142a = context;
        this.f6143b = str;
        this.f6144c = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f6142a.getPackageManager().getPackageInfo(this.f6143b, this.f6144c);
    }
}
