package com.thoughtworks.xstream.core;

/* loaded from: classes8.dex */
public abstract class BaseException extends RuntimeException {
    public BaseException(String str) {
        super(str);
    }

    public BaseException(String str, Throwable th) {
        super(str, th);
    }
}
