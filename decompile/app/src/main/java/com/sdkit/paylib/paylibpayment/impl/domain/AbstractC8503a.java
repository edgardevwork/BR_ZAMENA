package com.sdkit.paylib.paylibpayment.impl.domain;

import com.sdkit.paylib.paylibpayment.impl.domain.info.InterfaceC8511f;
import com.sdkit.paylib.paylibpayment.impl.domain.network.model.C8558a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.a */
/* loaded from: classes7.dex */
public abstract class AbstractC8503a {
    /* renamed from: a */
    public static final C8558a m3941a(InterfaceC8511f interfaceC8511f) {
        Intrinsics.checkNotNullParameter(interfaceC8511f, "<this>");
        return new C8558a(interfaceC8511f.getDevicePlatformType(), interfaceC8511f.getDevicePlatformVersion(), interfaceC8511f.getDeviceModel(), interfaceC8511f.getDeviceManufacturer(), interfaceC8511f.mo3953a(), interfaceC8511f.getSurface(), interfaceC8511f.getSurfaceVersion(), interfaceC8511f.getChannel(), interfaceC8511f.getAuthConnector());
    }
}
