package org.apache.http.impl.cookie;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: classes8.dex */
public class BrowserCompatVersionAttributeHandler extends AbstractCookieAttributeHandler implements CommonCookieAttributeHandler {
    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void parse(SetCookie setCookie, String str) throws MalformedCookieException, NumberFormatException {
        int i;
        Args.notNull(setCookie, "Cookie");
        if (str == null) {
            throw new MalformedCookieException("Missing value for version attribute");
        }
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            i = 0;
        }
        setCookie.setVersion(i);
    }

    @Override // org.apache.http.cookie.CommonCookieAttributeHandler
    public String getAttributeName() {
        return "version";
    }
}
