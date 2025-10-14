package ru.rustore.sdk.metrics.internal;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.metrics.internal.Y */
/* loaded from: classes8.dex */
public final class C11606Y {

    /* renamed from: a */
    public final SharedPreferences f10661a;

    public C11606Y(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10661a = context.getSharedPreferences("metrics_sdk_sp", 0);
    }
}
