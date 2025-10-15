package org.apache.http.auth;

import org.apache.http.ProtocolException;

/* loaded from: classes6.dex */
public class MalformedChallengeException extends ProtocolException {
    public static final long serialVersionUID = 814586927989932284L;

    public MalformedChallengeException() {
    }

    public MalformedChallengeException(String str) {
        super(str);
    }

    public MalformedChallengeException(String str, Throwable th) {
        super(str, th);
    }
}
