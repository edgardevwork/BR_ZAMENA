package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManagerHelperForR;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.coreutils.impl.c */
/* loaded from: classes7.dex */
public final class C8720c extends Lambda implements Function0 {

    /* renamed from: a */
    public final /* synthetic */ Context f6140a;

    /* renamed from: b */
    public final /* synthetic */ String f6141b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8720c(Context context, String str) {
        super(0);
        this.f6140a = context;
        this.f6141b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        PackageManager packageManager = this.f6140a.getPackageManager();
        return AndroidUtils.isApiAchieved(30) ? SafePackageManagerHelperForR.extractPackageInstaller(packageManager, this.f6141b) : packageManager.getInstallerPackageName(this.f6141b);
    }
}
