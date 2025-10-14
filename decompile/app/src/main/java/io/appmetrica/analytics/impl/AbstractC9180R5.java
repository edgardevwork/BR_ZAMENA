package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.R5 */
/* loaded from: classes8.dex */
public abstract class AbstractC9180R5 extends BaseRequestConfig.ComponentLoader {

    /* renamed from: a */
    public final SafePackageManager f7198a;

    public AbstractC9180R5(@NonNull Context context, @NonNull String str) {
        this(context, str, new SafePackageManager());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C9204S5 load(@NonNull C9157Q5 c9157q5) {
        C9204S5 c9204s5 = (C9204S5) super.load((AbstractC9180R5) c9157q5);
        String packageName = getContext().getPackageName();
        ApplicationInfo applicationInfo = this.f7198a.getApplicationInfo(getContext(), getPackageName(), 0);
        if (applicationInfo != null) {
            int i = applicationInfo.flags;
            c9204s5.f7231a = (i & 2) != 0 ? "1" : "0";
            c9204s5.f7232b = (i & 1) == 0 ? "0" : "1";
        } else if (TextUtils.equals(packageName, getPackageName())) {
            c9204s5.f7231a = (getContext().getApplicationInfo().flags & 2) != 0 ? "1" : "0";
            c9204s5.f7232b = (getContext().getApplicationInfo().flags & 1) == 0 ? "0" : "1";
        } else {
            c9204s5.f7231a = "0";
            c9204s5.f7232b = "0";
        }
        C9637jl c9637jl = c9157q5.f7143a;
        c9204s5.f7233c = c9637jl;
        c9204s5.setRetryPolicyConfig(c9637jl.f8471t);
        return c9204s5;
    }

    public AbstractC9180R5(@NonNull Context context, @NonNull String str, @NonNull SafePackageManager safePackageManager) {
        super(context, str);
        this.f7198a = safePackageManager;
    }
}
