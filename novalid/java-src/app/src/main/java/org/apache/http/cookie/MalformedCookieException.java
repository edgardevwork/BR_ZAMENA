package org.apache.http.cookie;

import org.apache.http.ProtocolException;

/* loaded from: classes6.dex */
public class MalformedCookieException extends ProtocolException {
    public static final long serialVersionUID = -6695462944287282185L;

    public MalformedCookieException() {
    }

    public MalformedCookieException(String str) {
        super(str);
    }

    public MalformedCookieException(String str, Throwable th) {
        super(str, th);
    }
}
