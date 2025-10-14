package ru.rustore.sdk.billingclient.impl.logger;

import com.sdkit.paylib.payliblogging.api.logging.ExternalPaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.ExternalPaylibLoggerFactory;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.provider.logger.ExternalPaymentLoggerFactory;

/* renamed from: ru.rustore.sdk.billingclient.impl.logger.b */
/* loaded from: classes7.dex */
public final class C11531b implements ExternalPaylibLoggerFactory {

    /* renamed from: a */
    public final ExternalPaymentLoggerFactory f10542a;

    public C11531b(ExternalPaymentLoggerFactory externalPaymentLoggerFactory) {
        Intrinsics.checkNotNullParameter(externalPaymentLoggerFactory, "externalPaymentLoggerFactory");
        this.f10542a = externalPaymentLoggerFactory;
    }

    @Override // com.sdkit.paylib.payliblogging.api.logging.ExternalPaylibLoggerFactory
    public final ExternalPaylibLogger create(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new C11530a(this.f10542a.create(tag));
    }
}
