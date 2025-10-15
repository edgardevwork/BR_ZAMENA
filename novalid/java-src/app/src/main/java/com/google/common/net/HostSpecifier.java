package com.google.common.net;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.net.InetAddress;
import java.text.ParseException;
import javax.annotation.CheckForNull;

@J2ktIncompatible
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes8.dex */
public final class HostSpecifier {
    public final String canonicalForm;

    public HostSpecifier(String canonicalForm) {
        this.canonicalForm = canonicalForm;
    }

    public static HostSpecifier fromValid(String specifier) throws NumberFormatException {
        InetAddress inetAddressForString;
        HostAndPort hostAndPortFromString = HostAndPort.fromString(specifier);
        Preconditions.checkArgument(!hostAndPortFromString.hasPort());
        String host = hostAndPortFromString.getHost();
        try {
            inetAddressForString = InetAddresses.forString(host);
        } catch (IllegalArgumentException unused) {
            inetAddressForString = null;
        }
        if (inetAddressForString != null) {
            return new HostSpecifier(InetAddresses.toUriString(inetAddressForString));
        }
        InternetDomainName internetDomainNameFrom = InternetDomainName.from(host);
        if (internetDomainNameFrom.hasPublicSuffix()) {
            return new HostSpecifier(internetDomainNameFrom.toString());
        }
        throw new IllegalArgumentException("Domain name does not have a recognized public suffix: " + host);
    }

    @CanIgnoreReturnValue
    public static HostSpecifier from(String specifier) throws ParseException {
        try {
            return fromValid(specifier);
        } catch (IllegalArgumentException e) {
            ParseException parseException = new ParseException("Invalid host specifier: " + specifier, 0);
            parseException.initCause(e);
            throw parseException;
        }
    }

    public static boolean isValid(String specifier) {
        try {
            fromValid(specifier);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public boolean equals(@CheckForNull Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof HostSpecifier) {
            return this.canonicalForm.equals(((HostSpecifier) other).canonicalForm);
        }
        return false;
    }

    public int hashCode() {
        return this.canonicalForm.hashCode();
    }

    public String toString() {
        return this.canonicalForm;
    }
}
