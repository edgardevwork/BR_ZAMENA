package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.coreutils.impl.a */
/* loaded from: classes7.dex */
public final class C8718a extends Lambda implements Function0 {

    /* renamed from: a */
    public final /* synthetic */ Context f6134a;

    /* renamed from: b */
    public final /* synthetic */ ComponentName f6135b;

    /* renamed from: c */
    public final /* synthetic */ int f6136c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8718a(Context context, ComponentName componentName, int i) {
        super(0);
        this.f6134a = context;
        this.f6135b = componentName;
        this.f6136c = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f6134a.getPackageManager().getActivityInfo(this.f6135b, this.f6136c);
    }
}
