package org.apache.http.impl.auth;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.ietf.jgss.GSSException;
import org.ietf.jgss.Oid;

@Deprecated
/* loaded from: classes5.dex */
public class NegotiateScheme extends GGSSchemeBase {
    public static final String KERBEROS_OID = "1.2.840.113554.1.2.2";
    public static final String SPNEGO_OID = "1.3.6.1.5.5.2";
    public final Log log;
    public final SpnegoTokenGenerator spengoGenerator;

    @Override // org.apache.http.auth.AuthScheme
    public String getRealm() {
        return null;
    }

    @Override // org.apache.http.auth.AuthScheme
    public boolean isConnectionBased() {
        return true;
    }

    public NegotiateScheme(SpnegoTokenGenerator spnegoTokenGenerator, boolean z) {
        super(z);
        this.log = LogFactory.getLog(getClass());
        this.spengoGenerator = spnegoTokenGenerator;
    }

    public NegotiateScheme(SpnegoTokenGenerator spnegoTokenGenerator) {
        this(spnegoTokenGenerator, false);
    }

    public NegotiateScheme() {
        this(null, false);
    }

    @Override // org.apache.http.auth.AuthScheme
    public String getSchemeName() {
        return "Negotiate";
    }

    @Override // org.apache.http.impl.auth.GGSSchemeBase, org.apache.http.auth.AuthScheme
    public Header authenticate(Credentials credentials, HttpRequest httpRequest) throws AuthenticationException {
        return authenticate(credentials, httpRequest, null);
    }

    @Override // org.apache.http.impl.auth.GGSSchemeBase, org.apache.http.impl.auth.AuthSchemeBase, org.apache.http.auth.ContextAwareAuthScheme
    public Header authenticate(Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) throws AuthenticationException {
        return super.authenticate(credentials, httpRequest, httpContext);
    }

    @Override // org.apache.http.impl.auth.GGSSchemeBase
    public byte[] generateToken(byte[] bArr, String str) throws GSSException {
        return super.generateToken(bArr, str);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.ietf.jgss.GSSException */
    @Override // org.apache.http.impl.auth.GGSSchemeBase
    public byte[] generateToken(byte[] bArr, String str, Credentials credentials) throws GSSException {
        boolean z;
        SpnegoTokenGenerator spnegoTokenGenerator;
        try {
            bArr = generateGSSToken(bArr, new Oid("1.3.6.1.5.5.2"), str, credentials);
            z = false;
        } catch (GSSException e) {
            if (e.getMajor() == 2) {
                this.log.debug("GSSException BAD_MECH, retry with Kerberos MECH");
                z = true;
            } else {
                throw e;
            }
        }
        if (!z) {
            return bArr;
        }
        this.log.debug("Using Kerberos MECH 1.2.840.113554.1.2.2");
        byte[] bArrGenerateGSSToken = generateGSSToken(bArr, new Oid("1.2.840.113554.1.2.2"), str, credentials);
        if (bArrGenerateGSSToken == null || (spnegoTokenGenerator = this.spengoGenerator) == null) {
            return bArrGenerateGSSToken;
        }
        try {
            return spnegoTokenGenerator.generateSpnegoDERObject(bArrGenerateGSSToken);
        } catch (IOException e2) {
            this.log.error(e2.getMessage(), e2);
            return bArrGenerateGSSToken;
        }
    }

    @Override // org.apache.http.auth.AuthScheme
    public String getParameter(String str) {
        Args.notNull(str, "Parameter name");
        return null;
    }
}
