package org.apache.http.impl.cookie;

import java.util.Date;
import java.util.regex.Pattern;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;
import org.apache.http.util.TextUtils;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes8.dex */
public class LaxMaxAgeHandler extends AbstractCookieAttributeHandler implements CommonCookieAttributeHandler {
    public static final Pattern MAX_AGE_PATTERN = Pattern.compile("^\\-?[0-9]+$");

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void parse(SetCookie setCookie, String str) throws MalformedCookieException, NumberFormatException {
        Args.notNull(setCookie, "Cookie");
        if (!TextUtils.isBlank(str) && MAX_AGE_PATTERN.matcher(str).matches()) {
            try {
                int i = Integer.parseInt(str);
                setCookie.setExpiryDate(i >= 0 ? new Date(System.currentTimeMillis() + (i * 1000)) : new Date(Long.MIN_VALUE));
            } catch (NumberFormatException unused) {
            }
        }
    }

    @Override // org.apache.http.cookie.CommonCookieAttributeHandler
    public String getAttributeName() {
        return "max-age";
    }
}
