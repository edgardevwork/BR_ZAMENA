package com.fasterxml.jackson.core;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class JacksonException extends IOException {
    public static final long serialVersionUID = 123;

    public abstract JsonLocation getLocation();

    public abstract String getOriginalMessage();

    public abstract Object getProcessor();

    public JacksonException(String str) {
        super(str);
    }

    public JacksonException(Throwable th) {
        super(th);
    }

    public JacksonException(String str, Throwable th) {
        super(str, th);
    }
}
