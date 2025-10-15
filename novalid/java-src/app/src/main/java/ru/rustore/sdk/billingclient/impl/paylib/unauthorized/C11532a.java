package ru.rustore.sdk.billingclient.impl.paylib.unauthorized;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.billingclient.impl.paylib.unauthorized.a */
/* loaded from: classes5.dex */
public final class C11532a {

    /* renamed from: a */
    public final String f10543a;

    /* renamed from: b */
    public final Context f10544b;

    public C11532a(String consoleApplicationId, Context context) {
        Intrinsics.checkNotNullParameter(consoleApplicationId, "consoleApplicationId");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10543a = consoleApplicationId;
        this.f10544b = context;
    }
}
