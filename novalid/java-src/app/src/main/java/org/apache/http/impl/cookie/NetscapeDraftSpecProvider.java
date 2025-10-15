package org.apache.http.impl.cookie;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.Obsolete;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.protocol.HttpContext;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Obsolete
/* loaded from: classes8.dex */
public class NetscapeDraftSpecProvider implements CookieSpecProvider {
    public volatile CookieSpec cookieSpec;
    public final String[] datepatterns;

    public NetscapeDraftSpecProvider(String[] strArr) {
        this.datepatterns = strArr;
    }

    public NetscapeDraftSpecProvider() {
        this(null);
    }

    @Override // org.apache.http.cookie.CookieSpecProvider
    public CookieSpec create(HttpContext httpContext) {
        if (this.cookieSpec == null) {
            synchronized (this) {
                try {
                    if (this.cookieSpec == null) {
                        this.cookieSpec = new NetscapeDraftSpec(this.datepatterns);
                    }
                } finally {
                }
            }
        }
        return this.cookieSpec;
    }
}
