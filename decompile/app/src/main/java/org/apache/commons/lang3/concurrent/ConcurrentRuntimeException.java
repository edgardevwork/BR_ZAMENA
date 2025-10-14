package org.apache.commons.lang3.concurrent;

/* loaded from: classes7.dex */
public class ConcurrentRuntimeException extends RuntimeException {
    public static final long serialVersionUID = -6582182735562919670L;

    public ConcurrentRuntimeException() {
    }

    public ConcurrentRuntimeException(Throwable th) {
        super(ConcurrentUtils.checkedException(th));
    }

    public ConcurrentRuntimeException(String str, Throwable th) {
        super(str, ConcurrentUtils.checkedException(th));
    }
}
