package com.thoughtworks.xstream.p042io;

import com.thoughtworks.xstream.XStreamException;

/* loaded from: classes6.dex */
public class StreamException extends XStreamException {
    public StreamException(Throwable th) {
        super(th);
    }

    public StreamException(String str) {
        super(str);
    }

    public StreamException(String str, Throwable th) {
        super(str, th);
    }
}
