package com.thoughtworks.xstream;

import com.thoughtworks.xstream.core.BaseException;

/* loaded from: classes8.dex */
public class XStreamException extends BaseException {
    public XStreamException() {
        this("", null);
    }

    public XStreamException(String str) {
        this(str, null);
    }

    public XStreamException(Throwable th) {
        this("", th);
    }

    public XStreamException(String str, Throwable th) {
        super(str, th);
    }
}
