package com.sdkit.paylib.paylibpayment.impl.domain.info;

import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.info.b */
/* loaded from: classes6.dex */
public final class C8507b implements InterfaceC8506a {

    /* renamed from: a */
    public final Context f4827a;

    /* renamed from: b */
    public final String f4828b;

    public C8507b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f4827a = context;
        this.f4828b = "ANDROID";
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.info.InterfaceC8506a
    public String getDeviceManufacturer() {
        return Build.MANUFACTURER;
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.info.InterfaceC8506a
    public String getDeviceModel() {
        return Build.MODEL;
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.info.InterfaceC8506a
    public String getDevicePlatformType() {
        return this.f4828b;
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.info.InterfaceC8506a
    public String getDevicePlatformVersion() {
        return Build.VERSION.RELEASE;
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.info.InterfaceC8506a
    public String getPackageName() {
        String packageName = this.f4827a.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        return packageName;
    }
}
