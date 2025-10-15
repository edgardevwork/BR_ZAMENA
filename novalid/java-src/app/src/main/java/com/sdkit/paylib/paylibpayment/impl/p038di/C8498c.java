package com.sdkit.paylib.paylibpayment.impl.p038di;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.api.domain.PaylibTokenProvider;
import com.sdkit.paylib.paylibpayment.impl.dependencies.C8494b;
import com.sdkit.paylib.paylibpayment.impl.dependencies.InterfaceC8493a;
import com.sdkit.paylib.paylibpayment.impl.domain.config.C8505b;
import com.sdkit.paylib.paylibpayment.impl.domain.config.InterfaceC8504a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8543n;
import com.sdkit.paylib.paylibpayment.impl.domain.network.json.C8557b;
import com.sdkit.paylib.paylibpayment.impl.domain.network.json.InterfaceC8556a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.di.c */
/* loaded from: classes7.dex */
public final class C8498c {

    /* renamed from: a */
    public static final C8498c f4820a = new C8498c();

    /* renamed from: a */
    public final InterfaceC8493a m3924a(PaylibPaymentDependencies paylibPaymentDependencies) {
        Intrinsics.checkNotNullParameter(paylibPaymentDependencies, "paylibPaymentDependencies");
        return new C8494b(paylibPaymentDependencies);
    }

    /* renamed from: a */
    public final InterfaceC8504a m3925a(InterfaceC8493a internalDependenciesProvider) {
        Intrinsics.checkNotNullParameter(internalDependenciesProvider, "internalDependenciesProvider");
        return new C8505b(internalDependenciesProvider.provide().getConfigProvider());
    }

    /* renamed from: a */
    public final C8543n m3926a(PaylibTokenProvider tokenProvider, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        return new C8543n(tokenProvider, loggerFactory);
    }

    /* renamed from: a */
    public final InterfaceC8556a m3927a() {
        return new C8557b();
    }
}
