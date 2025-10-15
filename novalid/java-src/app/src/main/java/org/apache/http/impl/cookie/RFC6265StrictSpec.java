package org.apache.http.impl.cookie;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.CommonCookieAttributeHandler;

@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: classes5.dex */
public class RFC6265StrictSpec extends RFC6265CookieSpecBase {
    public static final String[] DATE_PATTERNS = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"};

    public RFC6265StrictSpec() {
        super(new BasicPathHandler(), new BasicDomainHandler(), new BasicMaxAgeHandler(), new BasicSecureHandler(), new BasicExpiresHandler(DATE_PATTERNS));
    }

    public RFC6265StrictSpec(CommonCookieAttributeHandler... commonCookieAttributeHandlerArr) {
        super(commonCookieAttributeHandlerArr);
    }

    public String toString() {
        return "rfc6265-strict";
    }
}
