package com.sdkit.paylib.payliblogging.impl.logging;

import com.sdkit.paylib.payliblogging.api.logging.ExternalPaylibLoggerFactory;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggingConfig;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.payliblogging.impl.logging.a */
/* loaded from: classes5.dex */
public final class C8078a implements PaylibLoggerFactory {

    /* renamed from: a */
    public final ExternalPaylibLoggerFactory f1575a;

    /* renamed from: b */
    public final PaylibLoggingConfig f1576b;

    public C8078a(ExternalPaylibLoggerFactory externalPaylibLoggerFactory, PaylibLoggingConfig paylibLoggingConfig) {
        this.f1575a = externalPaylibLoggerFactory;
        this.f1576b = paylibLoggingConfig;
    }

    @Override // com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory
    public PaylibLogger get(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        PaylibLoggingConfig paylibLoggingConfig = this.f1576b;
        ExternalPaylibLoggerFactory externalPaylibLoggerFactory = this.f1575a;
        return new C8080c(paylibLoggingConfig, externalPaylibLoggerFactory != null ? externalPaylibLoggerFactory.create(tag) : null);
    }
}
