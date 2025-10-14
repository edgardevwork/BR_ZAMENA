package org.apache.http.auth;

import java.io.Serializable;
import java.security.Principal;
import java.util.Locale;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes7.dex */
public class NTCredentials implements Credentials, Serializable {
    public static final long serialVersionUID = -7385699315228907265L;
    public final String password;
    public final NTUserPrincipal principal;
    public final String workstation;

    @Deprecated
    public NTCredentials(String str) {
        Args.notNull(str, "Username:password string");
        int iIndexOf = str.indexOf(58);
        if (iIndexOf >= 0) {
            String strSubstring = str.substring(0, iIndexOf);
            this.password = str.substring(iIndexOf + 1);
            str = strSubstring;
        } else {
            this.password = null;
        }
        int iIndexOf2 = str.indexOf(47);
        if (iIndexOf2 >= 0) {
            this.principal = new NTUserPrincipal(str.substring(0, iIndexOf2).toUpperCase(Locale.ROOT), str.substring(iIndexOf2 + 1));
        } else {
            this.principal = new NTUserPrincipal(null, str.substring(iIndexOf2 + 1));
        }
        this.workstation = null;
    }

    public NTCredentials(String str, String str2, String str3, String str4) {
        Args.notNull(str, "User name");
        this.principal = new NTUserPrincipal(str4, str);
        this.password = str2;
        if (str3 != null) {
            this.workstation = str3.toUpperCase(Locale.ROOT);
        } else {
            this.workstation = null;
        }
    }

    @Override // org.apache.http.auth.Credentials
    public Principal getUserPrincipal() {
        return this.principal;
    }

    public String getUserName() {
        return this.principal.getUsername();
    }

    @Override // org.apache.http.auth.Credentials
    public String getPassword() {
        return this.password;
    }

    public String getDomain() {
        return this.principal.getDomain();
    }

    public String getWorkstation() {
        return this.workstation;
    }

    public int hashCode() {
        return LangUtils.hashCode(LangUtils.hashCode(17, this.principal), this.workstation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NTCredentials)) {
            return false;
        }
        NTCredentials nTCredentials = (NTCredentials) obj;
        return LangUtils.equals(this.principal, nTCredentials.principal) && LangUtils.equals(this.workstation, nTCredentials.workstation);
    }

    public String toString() {
        return "[principal: " + this.principal + "][workstation: " + this.workstation + "]";
    }
}
