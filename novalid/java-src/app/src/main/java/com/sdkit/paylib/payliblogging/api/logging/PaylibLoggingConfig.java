package com.sdkit.paylib.payliblogging.api.logging;

import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m7105d2 = {"Lcom/sdkit/paylib/payliblogging/api/logging/PaylibLoggingConfig;", "", "isSandbox", "", "com-sdkit-assistant_paylib_logging_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public interface PaylibLoggingConfig {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static boolean isSandbox(PaylibLoggingConfig paylibLoggingConfig) {
            return false;
        }
    }

    boolean isSandbox();
}
