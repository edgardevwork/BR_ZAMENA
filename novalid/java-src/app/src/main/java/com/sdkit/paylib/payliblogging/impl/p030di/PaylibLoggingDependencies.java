package com.sdkit.paylib.payliblogging.impl.p030di;

import com.sdkit.paylib.payliblogging.api.logging.ExternalPaylibLoggerFactory;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggingConfig;
import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m7105d2 = {"Lcom/sdkit/paylib/payliblogging/impl/di/PaylibLoggingDependencies;", "", "externalPaylibLoggerFactory", "Lcom/sdkit/paylib/payliblogging/api/logging/ExternalPaylibLoggerFactory;", "getExternalPaylibLoggerFactory", "()Lcom/sdkit/paylib/payliblogging/api/logging/ExternalPaylibLoggerFactory;", "paylibLoggingConfig", "Lcom/sdkit/paylib/payliblogging/api/logging/PaylibLoggingConfig;", "getPaylibLoggingConfig", "()Lcom/sdkit/paylib/payliblogging/api/logging/PaylibLoggingConfig;", "com-sdkit-assistant_paylib_logging"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public interface PaylibLoggingDependencies {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        public static ExternalPaylibLoggerFactory getExternalPaylibLoggerFactory(PaylibLoggingDependencies paylibLoggingDependencies) {
            return null;
        }

        public static PaylibLoggingConfig getPaylibLoggingConfig(PaylibLoggingDependencies paylibLoggingDependencies) {
            return null;
        }
    }

    ExternalPaylibLoggerFactory getExternalPaylibLoggerFactory();

    PaylibLoggingConfig getPaylibLoggingConfig();
}
