package org.apache.http.conn.ssl;

import com.blackhub.bronline.game.gui.craft.CraftKeys;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import javax.naming.InvalidNameException;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.ldap.LdapName;
import javax.naming.ldap.Rdn;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.util.DnsUtils;
import org.apache.http.conn.util.DomainType;
import org.apache.http.conn.util.InetAddressUtils;
import org.apache.http.conn.util.PublicSuffixMatcher;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes6.dex */
public final class DefaultHostnameVerifier implements HostnameVerifier {
    public final Log log;
    public final PublicSuffixMatcher publicSuffixMatcher;

    public enum HostNameType {
        IPv4(7),
        IPv6(7),
        DNS(2);

        public final int subjectType;

        HostNameType(int i) {
            this.subjectType = i;
        }
    }

    public DefaultHostnameVerifier(PublicSuffixMatcher publicSuffixMatcher) {
        this.log = LogFactory.getLog(DefaultHostnameVerifier.class);
        this.publicSuffixMatcher = publicSuffixMatcher;
    }

    public DefaultHostnameVerifier() {
        this(null);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) throws CertificateParsingException {
        try {
            verify(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            return true;
        } catch (SSLException e) {
            if (this.log.isDebugEnabled()) {
                this.log.debug(e.getMessage(), e);
            }
            return false;
        }
    }

    public void verify(String str, X509Certificate x509Certificate) throws SSLException, CertificateParsingException {
        HostNameType hostNameTypeDetermineHostFormat = determineHostFormat(str);
        List<SubjectName> subjectAltNames = getSubjectAltNames(x509Certificate);
        if (subjectAltNames != null && !subjectAltNames.isEmpty()) {
            int i = C111201.f9923xdc99fdb1[hostNameTypeDetermineHostFormat.ordinal()];
            if (i == 1) {
                matchIPAddress(str, subjectAltNames);
                return;
            } else if (i == 2) {
                matchIPv6Address(str, subjectAltNames);
                return;
            } else {
                matchDNSName(str, subjectAltNames, this.publicSuffixMatcher);
                return;
            }
        }
        String strExtractCN = extractCN(x509Certificate.getSubjectX500Principal().getName("RFC2253"));
        if (strExtractCN == null) {
            throw new SSLException("Certificate subject for <" + str + "> doesn't contain a common name and does not have alternative names");
        }
        matchCN(str, strExtractCN, this.publicSuffixMatcher);
    }

    /* renamed from: org.apache.http.conn.ssl.DefaultHostnameVerifier$1 */
    public static /* synthetic */ class C111201 {

        /* renamed from: $SwitchMap$org$apache$http$conn$ssl$DefaultHostnameVerifier$HostNameType */
        public static final /* synthetic */ int[] f9923xdc99fdb1;

        static {
            int[] iArr = new int[HostNameType.values().length];
            f9923xdc99fdb1 = iArr;
            try {
                iArr[HostNameType.IPv4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9923xdc99fdb1[HostNameType.IPv6.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static void matchIPAddress(String str, List<SubjectName> list) throws SSLException {
        for (int i = 0; i < list.size(); i++) {
            SubjectName subjectName = list.get(i);
            if (subjectName.getType() == 7 && str.equals(subjectName.getValue())) {
                return;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + list);
    }

    public static void matchIPv6Address(String str, List<SubjectName> list) throws SSLException {
        String strNormaliseAddress = normaliseAddress(str);
        for (int i = 0; i < list.size(); i++) {
            SubjectName subjectName = list.get(i);
            if (subjectName.getType() == 7 && strNormaliseAddress.equals(normaliseAddress(subjectName.getValue()))) {
                return;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + list);
    }

    public static void matchDNSName(String str, List<SubjectName> list, PublicSuffixMatcher publicSuffixMatcher) throws SSLException {
        String strNormalize = DnsUtils.normalize(str);
        for (int i = 0; i < list.size(); i++) {
            SubjectName subjectName = list.get(i);
            if (subjectName.getType() == 2 && matchIdentityStrict(strNormalize, DnsUtils.normalize(subjectName.getValue()), publicSuffixMatcher)) {
                return;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + list);
    }

    public static void matchCN(String str, String str2, PublicSuffixMatcher publicSuffixMatcher) throws SSLException {
        if (matchIdentityStrict(DnsUtils.normalize(str), DnsUtils.normalize(str2), publicSuffixMatcher)) {
            return;
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match common name of the certificate subject: " + str2);
    }

    public static boolean matchDomainRoot(String str, String str2) {
        if (str2 != null && str.endsWith(str2)) {
            return str.length() == str2.length() || str.charAt((str.length() - str2.length()) - 1) == '.';
        }
        return false;
    }

    public static boolean matchIdentity(String str, String str2, PublicSuffixMatcher publicSuffixMatcher, DomainType domainType, boolean z) {
        if (publicSuffixMatcher != null && str.contains(".") && !matchDomainRoot(str, publicSuffixMatcher.getDomainRoot(str2, domainType))) {
            return false;
        }
        int iIndexOf = str2.indexOf(42);
        if (iIndexOf != -1) {
            String strSubstring = str2.substring(0, iIndexOf);
            String strSubstring2 = str2.substring(iIndexOf + 1);
            if (!strSubstring.isEmpty() && !str.startsWith(strSubstring)) {
                return false;
            }
            if (strSubstring2.isEmpty() || str.endsWith(strSubstring2)) {
                return (z && str.substring(strSubstring.length(), str.length() - strSubstring2.length()).contains(".")) ? false : true;
            }
            return false;
        }
        return str.equalsIgnoreCase(str2);
    }

    public static boolean matchIdentity(String str, String str2, PublicSuffixMatcher publicSuffixMatcher) {
        return matchIdentity(str, str2, publicSuffixMatcher, null, false);
    }

    public static boolean matchIdentity(String str, String str2) {
        return matchIdentity(str, str2, null, null, false);
    }

    public static boolean matchIdentityStrict(String str, String str2, PublicSuffixMatcher publicSuffixMatcher) {
        return matchIdentity(str, str2, publicSuffixMatcher, null, true);
    }

    public static boolean matchIdentityStrict(String str, String str2) {
        return matchIdentity(str, str2, null, null, true);
    }

    public static boolean matchIdentity(String str, String str2, PublicSuffixMatcher publicSuffixMatcher, DomainType domainType) {
        return matchIdentity(str, str2, publicSuffixMatcher, domainType, false);
    }

    public static boolean matchIdentityStrict(String str, String str2, PublicSuffixMatcher publicSuffixMatcher, DomainType domainType) {
        return matchIdentity(str, str2, publicSuffixMatcher, domainType, true);
    }

    public static String extractCN(String str) throws SSLException {
        if (str == null) {
            return null;
        }
        try {
            List rdns = new LdapName(str).getRdns();
            for (int size = rdns.size() - 1; size >= 0; size--) {
                Attribute attribute = ((Rdn) rdns.get(size)).toAttributes().get(CraftKeys.NEW_ITEMS_ARRAY_KEY);
                if (attribute != null) {
                    try {
                        Object obj = attribute.get();
                        if (obj != null) {
                            return obj.toString();
                        }
                        continue;
                    } catch (NoSuchElementException | NamingException unused) {
                        continue;
                    }
                }
            }
            return null;
        } catch (InvalidNameException unused2) {
            throw new SSLException(str + " is not a valid X500 distinguished name");
        }
    }

    public static HostNameType determineHostFormat(String str) {
        if (InetAddressUtils.isIPv4Address(str)) {
            return HostNameType.IPv4;
        }
        if (str.startsWith("[") && str.endsWith("]")) {
            str = str.substring(1, str.length() - 1);
        }
        if (InetAddressUtils.isIPv6Address(str)) {
            return HostNameType.IPv6;
        }
        return HostNameType.DNS;
    }

    public static List<SubjectName> getSubjectAltNames(X509Certificate x509Certificate) throws CertificateParsingException {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                Integer num = list.size() >= 2 ? (Integer) list.get(0) : null;
                if (num != null && (num.intValue() == 2 || num.intValue() == 7)) {
                    Object obj = list.get(1);
                    if (obj instanceof String) {
                        arrayList.add(new SubjectName((String) obj, num.intValue()));
                    } else {
                        boolean z = obj instanceof byte[];
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    public static String normaliseAddress(String str) {
        if (str == null) {
            return str;
        }
        try {
            return InetAddress.getByName(str).getHostAddress();
        } catch (UnknownHostException unused) {
            return str;
        }
    }
}
