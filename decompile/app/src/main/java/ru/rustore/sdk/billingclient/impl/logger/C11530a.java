package ru.rustore.sdk.billingclient.impl.logger;

import com.sdkit.paylib.payliblogging.api.logging.ExternalPaylibLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.provider.logger.ExternalPaymentLogger;

/* renamed from: ru.rustore.sdk.billingclient.impl.logger.a */
/* loaded from: classes7.dex */
public final class C11530a implements ExternalPaylibLogger {

    /* renamed from: a */
    public final ExternalPaymentLogger f10541a;

    public C11530a(ExternalPaymentLogger externalPaymentLogger) {
        Intrinsics.checkNotNullParameter(externalPaymentLogger, "externalPaymentLogger");
        this.f10541a = externalPaymentLogger;
    }

    @Override // com.sdkit.paylib.payliblogging.api.logging.ExternalPaylibLogger
    /* renamed from: d */
    public final void mo1695d(Throwable th, Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f10541a.mo967d(th, message);
    }

    @Override // com.sdkit.paylib.payliblogging.api.logging.ExternalPaylibLogger
    /* renamed from: e */
    public final void mo1696e(Throwable th, Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f10541a.mo968e(th, message);
    }

    @Override // com.sdkit.paylib.payliblogging.api.logging.ExternalPaylibLogger
    /* renamed from: i */
    public final void mo1697i(Throwable th, Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f10541a.mo969i(th, message);
    }

    @Override // com.sdkit.paylib.payliblogging.api.logging.ExternalPaylibLogger
    /* renamed from: v */
    public final void mo1698v(Throwable th, Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f10541a.mo970v(th, message);
    }

    @Override // com.sdkit.paylib.payliblogging.api.logging.ExternalPaylibLogger
    /* renamed from: w */
    public final void mo1699w(Throwable th, Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f10541a.mo971w(th, message);
    }
}
