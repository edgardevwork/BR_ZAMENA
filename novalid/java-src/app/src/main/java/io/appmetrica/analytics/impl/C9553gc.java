package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.BillingType;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import java.lang.reflect.Field;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.text.StringsKt__StringsJVMKt;

/* renamed from: io.appmetrica.analytics.impl.gc */
/* loaded from: classes8.dex */
public final class C9553gc extends C9696m5 {

    /* renamed from: m */
    public final C9985xj f8195m;

    public C9553gc(@NonNull Context context, @NonNull C9396a5 c9396a5, @NonNull C8840D4 c8840d4, @NonNull AbstractC9521f5 abstractC9521f5, @NonNull C9637jl c9637jl, @NonNull InterfaceC8827Cg interfaceC8827Cg, @NonNull ICommonExecutor iCommonExecutor, int i, @NonNull C9985xj c9985xj, @NonNull C8772Ab c8772Ab) {
        super(context, c9396a5, c8840d4, abstractC9521f5, c9637jl, interfaceC8827Cg, iCommonExecutor, i, c8772Ab);
        this.f8195m = c9985xj;
    }

    @NonNull
    /* renamed from: a */
    public final C9619j3 m6182a(@NonNull C9528fc c9528fc) {
        String str;
        Field field;
        Context context = this.f8625c;
        IHandlerExecutor iHandlerExecutorM6966a = this.f8195m.m6966a();
        Executor executorM6971f = this.f8195m.m6971f();
        try {
            Class<?> clsFindClass = ReflectionUtils.findClass("com.android.billingclient.BuildConfig");
            str = (String) ((clsFindClass == null || (field = clsFindClass.getField("VERSION_NAME")) == null) ? null : field.get(null));
        } catch (Throwable unused) {
            str = null;
        }
        BillingType billingType = (str == null || StringsKt__StringsJVMKt.isBlank(str) || StringsKt__StringsJVMKt.startsWith$default(str, "2.", false, 2, null) || StringsKt__StringsJVMKt.startsWith$default(str, "3.", false, 2, null) || StringsKt__StringsJVMKt.startsWith$default(str, "4.", false, 2, null)) ? BillingType.NONE : (!StringsKt__StringsJVMKt.startsWith$default(str, "5.", false, 2, null) && StringsKt__StringsJVMKt.startsWith$default(str, "6.", false, 2, null)) ? BillingType.LIBRARY_V6 : BillingType.LIBRARY_V6;
        return new C9619j3(context, iHandlerExecutorM6966a, executorM6971f, billingType, new C9519f3(C9268Ul.m5684a(C9843s2.class).m5697a(this.f8625c)), new C9494e3(c9528fc, C9676la.m6362h().m6384u().m6970e()));
    }

    @NonNull
    /* renamed from: b */
    public final C8951Hf m6183b(@NonNull C9528fc c9528fc) {
        C8924Gd c8924Gd = new C8924Gd(c9528fc);
        Objects.requireNonNull(c9528fc);
        return new C8951Hf(c8924Gd, new C9503ec(c9528fc), c9528fc);
    }
}
