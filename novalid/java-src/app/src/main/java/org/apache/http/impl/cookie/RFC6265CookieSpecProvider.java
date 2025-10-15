package org.apache.http.impl.cookie;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.util.PublicSuffixMatcher;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.protocol.HttpContext;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes8.dex */
public class RFC6265CookieSpecProvider implements CookieSpecProvider {
    public final CompatibilityLevel compatibilityLevel;
    public volatile CookieSpec cookieSpec;
    public final PublicSuffixMatcher publicSuffixMatcher;

    public enum CompatibilityLevel {
        STRICT,
        RELAXED,
        IE_MEDIUM_SECURITY
    }

    public RFC6265CookieSpecProvider(CompatibilityLevel compatibilityLevel, PublicSuffixMatcher publicSuffixMatcher) {
        this.compatibilityLevel = compatibilityLevel == null ? CompatibilityLevel.RELAXED : compatibilityLevel;
        this.publicSuffixMatcher = publicSuffixMatcher;
    }

    public RFC6265CookieSpecProvider(PublicSuffixMatcher publicSuffixMatcher) {
        this(CompatibilityLevel.RELAXED, publicSuffixMatcher);
    }

    public RFC6265CookieSpecProvider() {
        this(CompatibilityLevel.RELAXED, null);
    }

    @Override // org.apache.http.cookie.CookieSpecProvider
    public CookieSpec create(HttpContext httpContext) {
        if (this.cookieSpec == null) {
            synchronized (this) {
                try {
                    if (this.cookieSpec == null) {
                        int i = C111462.f9936x14f07ea0[this.compatibilityLevel.ordinal()];
                        if (i == 1) {
                            this.cookieSpec = new RFC6265StrictSpec(new BasicPathHandler(), PublicSuffixDomainFilter.decorate(new BasicDomainHandler(), this.publicSuffixMatcher), new BasicMaxAgeHandler(), new BasicSecureHandler(), new BasicExpiresHandler(RFC6265StrictSpec.DATE_PATTERNS));
                        } else if (i == 2) {
                            this.cookieSpec = new RFC6265LaxSpec(new BasicPathHandler() { // from class: org.apache.http.impl.cookie.RFC6265CookieSpecProvider.1
                                @Override // org.apache.http.impl.cookie.BasicPathHandler, org.apache.http.cookie.CookieAttributeHandler
                                public void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
                                }
                            }, PublicSuffixDomainFilter.decorate(new BasicDomainHandler(), this.publicSuffixMatcher), new BasicMaxAgeHandler(), new BasicSecureHandler(), new BasicExpiresHandler(RFC6265StrictSpec.DATE_PATTERNS));
                        } else {
                            this.cookieSpec = new RFC6265LaxSpec(new BasicPathHandler(), PublicSuffixDomainFilter.decorate(new BasicDomainHandler(), this.publicSuffixMatcher), new LaxMaxAgeHandler(), new BasicSecureHandler(), new LaxExpiresHandler());
                        }
                    }
                } finally {
                }
            }
        }
        return this.cookieSpec;
    }

    /* renamed from: org.apache.http.impl.cookie.RFC6265CookieSpecProvider$2 */
    public static /* synthetic */ class C111462 {

        /* renamed from: $SwitchMap$org$apache$http$impl$cookie$RFC6265CookieSpecProvider$CompatibilityLevel */
        public static final /* synthetic */ int[] f9936x14f07ea0;

        static {
            int[] iArr = new int[CompatibilityLevel.values().length];
            f9936x14f07ea0 = iArr;
            try {
                iArr[CompatibilityLevel.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9936x14f07ea0[CompatibilityLevel.IE_MEDIUM_SECURITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
