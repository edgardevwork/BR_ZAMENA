package org.apache.http.impl.cookie;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.util.PublicSuffixMatcher;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.protocol.HttpContext;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes8.dex */
public class DefaultCookieSpecProvider implements CookieSpecProvider {
    public final CompatibilityLevel compatibilityLevel;
    public volatile CookieSpec cookieSpec;
    public final String[] datepatterns;
    public final boolean oneHeader;
    public final PublicSuffixMatcher publicSuffixMatcher;

    public enum CompatibilityLevel {
        DEFAULT,
        IE_MEDIUM_SECURITY
    }

    public DefaultCookieSpecProvider(CompatibilityLevel compatibilityLevel, PublicSuffixMatcher publicSuffixMatcher, String[] strArr, boolean z) {
        this.compatibilityLevel = compatibilityLevel == null ? CompatibilityLevel.DEFAULT : compatibilityLevel;
        this.publicSuffixMatcher = publicSuffixMatcher;
        this.datepatterns = strArr;
        this.oneHeader = z;
    }

    public DefaultCookieSpecProvider(CompatibilityLevel compatibilityLevel, PublicSuffixMatcher publicSuffixMatcher) {
        this(compatibilityLevel, publicSuffixMatcher, null, false);
    }

    public DefaultCookieSpecProvider(PublicSuffixMatcher publicSuffixMatcher) {
        this(CompatibilityLevel.DEFAULT, publicSuffixMatcher, null, false);
    }

    public DefaultCookieSpecProvider() {
        this(CompatibilityLevel.DEFAULT, null, null, false);
    }

    @Override // org.apache.http.cookie.CookieSpecProvider
    public CookieSpec create(HttpContext httpContext) {
        if (this.cookieSpec == null) {
            synchronized (this) {
                try {
                    if (this.cookieSpec == null) {
                        RFC2965Spec rFC2965Spec = new RFC2965Spec(this.oneHeader, new RFC2965VersionAttributeHandler(), new BasicPathHandler(), PublicSuffixDomainFilter.decorate(new RFC2965DomainAttributeHandler(), this.publicSuffixMatcher), new RFC2965PortAttributeHandler(), new BasicMaxAgeHandler(), new BasicSecureHandler(), new BasicCommentHandler(), new RFC2965CommentUrlAttributeHandler(), new RFC2965DiscardAttributeHandler());
                        RFC2109Spec rFC2109Spec = new RFC2109Spec(this.oneHeader, new RFC2109VersionHandler(), new BasicPathHandler(), PublicSuffixDomainFilter.decorate(new RFC2109DomainHandler(), this.publicSuffixMatcher), new BasicMaxAgeHandler(), new BasicSecureHandler(), new BasicCommentHandler());
                        CommonCookieAttributeHandler commonCookieAttributeHandlerDecorate = PublicSuffixDomainFilter.decorate(new BasicDomainHandler(), this.publicSuffixMatcher);
                        BasicPathHandler basicPathHandler = this.compatibilityLevel == CompatibilityLevel.IE_MEDIUM_SECURITY ? new BasicPathHandler() { // from class: org.apache.http.impl.cookie.DefaultCookieSpecProvider.1
                            @Override // org.apache.http.impl.cookie.BasicPathHandler, org.apache.http.cookie.CookieAttributeHandler
                            public void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
                            }
                        } : new BasicPathHandler();
                        BasicSecureHandler basicSecureHandler = new BasicSecureHandler();
                        BasicCommentHandler basicCommentHandler = new BasicCommentHandler();
                        String[] strArr = this.datepatterns;
                        this.cookieSpec = new DefaultCookieSpec(rFC2965Spec, rFC2109Spec, new NetscapeDraftSpec(commonCookieAttributeHandlerDecorate, basicPathHandler, basicSecureHandler, basicCommentHandler, new BasicExpiresHandler(strArr != null ? (String[]) strArr.clone() : new String[]{NetscapeDraftSpec.EXPIRES_PATTERN})));
                    }
                } finally {
                }
            }
        }
        return this.cookieSpec;
    }
}
