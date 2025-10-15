package com.sdkit.paylib.payliblogging.api.logging;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\"\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\"\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\"\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\"\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¨\u0006\f"}, m7105d2 = {"Lcom/sdkit/paylib/payliblogging/api/logging/ExternalPaylibLogger;", "", "d", "", "e", "", ThrowableDeserializer.PROP_NAME_MESSAGE, "Lkotlin/Function0;", "", "i", "v", "w", "com-sdkit-assistant_paylib_logging_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface ExternalPaylibLogger {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void d$default(ExternalPaylibLogger externalPaylibLogger, Throwable th, Function0 function0, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: d");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            externalPaylibLogger.mo1695d(th, function0);
        }

        public static /* synthetic */ void e$default(ExternalPaylibLogger externalPaylibLogger, Throwable th, Function0 function0, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            externalPaylibLogger.mo1696e(th, function0);
        }

        public static /* synthetic */ void i$default(ExternalPaylibLogger externalPaylibLogger, Throwable th, Function0 function0, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: i");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            externalPaylibLogger.mo1697i(th, function0);
        }

        public static /* synthetic */ void v$default(ExternalPaylibLogger externalPaylibLogger, Throwable th, Function0 function0, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: v");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            externalPaylibLogger.mo1698v(th, function0);
        }

        public static /* synthetic */ void w$default(ExternalPaylibLogger externalPaylibLogger, Throwable th, Function0 function0, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: w");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            externalPaylibLogger.mo1699w(th, function0);
        }
    }

    /* renamed from: d */
    void mo1695d(Throwable e, Function0<String> message);

    /* renamed from: e */
    void mo1696e(Throwable e, Function0<String> message);

    /* renamed from: i */
    void mo1697i(Throwable e, Function0<String> message);

    /* renamed from: v */
    void mo1698v(Throwable e, Function0<String> message);

    /* renamed from: w */
    void mo1699w(Throwable e, Function0<String> message);
}
