package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtilsTiramisu;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.coreutils.impl.h */
/* loaded from: classes7.dex */
public final class C8725h extends Lambda implements Function0 {

    /* renamed from: a */
    public final /* synthetic */ Context f6153a;

    /* renamed from: b */
    public final /* synthetic */ String f6154b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8725h(Context context, String str) {
        super(0);
        this.f6153a = context;
        this.f6154b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        PackageManager packageManager = this.f6153a.getPackageManager();
        return AndroidUtils.isApiAchieved(33) ? PackageManagerUtilsTiramisu.INSTANCE.resolveContentProvider(packageManager, this.f6154b) : packageManager.resolveContentProvider(this.f6154b, 128);
    }
}
