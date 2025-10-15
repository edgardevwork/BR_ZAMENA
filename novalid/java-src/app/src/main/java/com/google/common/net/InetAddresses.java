package com.google.common.net;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.CharMatcher;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.hash.Hashing;
import com.google.common.p024io.ByteStreams;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import javax.annotation.CheckForNull;
import kotlin.UShort;

@J2ktIncompatible
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes8.dex */
public final class InetAddresses {
    public static final char IPV4_DELIMITER = '.';
    public static final int IPV4_PART_COUNT = 4;
    public static final char IPV6_DELIMITER = ':';
    public static final int IPV6_PART_COUNT = 8;
    public static final CharMatcher IPV4_DELIMITER_MATCHER = CharMatcher.m1141is('.');
    public static final CharMatcher IPV6_DELIMITER_MATCHER = CharMatcher.m1141is(':');
    public static final Inet4Address LOOPBACK4 = (Inet4Address) forString("127.0.0.1");
    public static final Inet4Address ANY4 = (Inet4Address) forString("0.0.0.0");

    public static Inet4Address getInet4Address(byte[] bytes) {
        Preconditions.checkArgument(bytes.length == 4, "Byte array has invalid length for an IPv4 address: %s != 4.", bytes.length);
        return (Inet4Address) bytesToInetAddress(bytes);
    }

    @CanIgnoreReturnValue
    public static InetAddress forString(String ipString) {
        byte[] bArrIpStringToBytes = ipStringToBytes(ipString);
        if (bArrIpStringToBytes == null) {
            throw formatIllegalArgumentException("'%s' is not an IP string literal.", ipString);
        }
        return bytesToInetAddress(bArrIpStringToBytes);
    }

    public static boolean isInetAddress(String ipString) {
        return ipStringToBytes(ipString) != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
    
        if (r3 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        if (r2 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
    
        r9 = convertDottedQuadToHex(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003a, code lost:
    
        if (r9 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        if (r1 == (-1)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        r9 = r9.substring(0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        return textToNumericFormatV6(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:
    
        if (r2 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
    
        if (r1 == (-1)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0051, code lost:
    
        return textToNumericFormatV4(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0052, code lost:
    
        return null;
     */
    @CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] ipStringToBytes(String ipStringParam) {
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (i >= ipStringParam.length()) {
                i = -1;
                break;
            }
            char cCharAt = ipStringParam.charAt(i);
            if (cCharAt == '.') {
                z = true;
            } else if (cCharAt == ':') {
                if (z) {
                    return null;
                }
                z2 = true;
            } else {
                if (cCharAt == '%') {
                    break;
                }
                if (Character.digit(cCharAt, 16) == -1) {
                    return null;
                }
            }
            i++;
        }
    }

    @CheckForNull
    public static byte[] textToNumericFormatV4(String ipString) {
        if (IPV4_DELIMITER_MATCHER.countIn(ipString) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int iIndexOf = ipString.indexOf(46, i);
            if (iIndexOf == -1) {
                iIndexOf = ipString.length();
            }
            try {
                bArr[i2] = parseOctet(ipString, i, iIndexOf);
                i = iIndexOf + 1;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }

    @CheckForNull
    public static byte[] textToNumericFormatV6(String ipString) {
        int iCountIn = IPV6_DELIMITER_MATCHER.countIn(ipString);
        if (iCountIn >= 2 && iCountIn <= 8) {
            int i = 1;
            int i2 = iCountIn + 1;
            int i3 = 8 - i2;
            boolean z = false;
            for (int i4 = 0; i4 < ipString.length() - 1; i4++) {
                if (ipString.charAt(i4) == ':' && ipString.charAt(i4 + 1) == ':') {
                    if (z) {
                        return null;
                    }
                    int i5 = i3 + 1;
                    if (i4 == 0) {
                        i5 = i3 + 2;
                    }
                    if (i4 == ipString.length() - 2) {
                        i5++;
                    }
                    i3 = i5;
                    z = true;
                }
            }
            if (ipString.charAt(0) == ':' && ipString.charAt(1) != ':') {
                return null;
            }
            if (ipString.charAt(ipString.length() - 1) == ':' && ipString.charAt(ipString.length() - 2) != ':') {
                return null;
            }
            if (z && i3 <= 0) {
                return null;
            }
            if (!z && i2 != 8) {
                return null;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            try {
                if (ipString.charAt(0) != ':') {
                    i = 0;
                }
                while (i < ipString.length()) {
                    int iIndexOf = ipString.indexOf(58, i);
                    if (iIndexOf == -1) {
                        iIndexOf = ipString.length();
                    }
                    if (ipString.charAt(i) == ':') {
                        for (int i6 = 0; i6 < i3; i6++) {
                            byteBufferAllocate.putShort((short) 0);
                        }
                    } else {
                        byteBufferAllocate.putShort(parseHextet(ipString, i, iIndexOf));
                    }
                    i = iIndexOf + 1;
                }
                return byteBufferAllocate.array();
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    @CheckForNull
    public static String convertDottedQuadToHex(String ipString) {
        int iLastIndexOf = ipString.lastIndexOf(58) + 1;
        String strSubstring = ipString.substring(0, iLastIndexOf);
        byte[] bArrTextToNumericFormatV4 = textToNumericFormatV4(ipString.substring(iLastIndexOf));
        if (bArrTextToNumericFormatV4 == null) {
            return null;
        }
        return strSubstring + Integer.toHexString(((bArrTextToNumericFormatV4[0] & 255) << 8) | (bArrTextToNumericFormatV4[1] & 255)) + StringUtils.PROCESS_POSTFIX_DELIMITER + Integer.toHexString((bArrTextToNumericFormatV4[3] & 255) | ((bArrTextToNumericFormatV4[2] & 255) << 8));
    }

    public static byte parseOctet(String ipString, int start, int end) {
        int i = end - start;
        if (i <= 0 || i > 3) {
            throw new NumberFormatException();
        }
        if (i > 1 && ipString.charAt(start) == '0') {
            throw new NumberFormatException();
        }
        int i2 = 0;
        while (start < end) {
            int i3 = i2 * 10;
            int iDigit = Character.digit(ipString.charAt(start), 10);
            if (iDigit < 0) {
                throw new NumberFormatException();
            }
            i2 = i3 + iDigit;
            start++;
        }
        if (i2 <= 255) {
            return (byte) i2;
        }
        throw new NumberFormatException();
    }

    public static short parseHextet(String ipString, int start, int end) {
        int i = end - start;
        if (i <= 0 || i > 4) {
            throw new NumberFormatException();
        }
        int iDigit = 0;
        while (start < end) {
            iDigit = (iDigit << 4) | Character.digit(ipString.charAt(start), 16);
            start++;
        }
        return (short) iDigit;
    }

    public static InetAddress bytesToInetAddress(byte[] addr) {
        try {
            return InetAddress.getByAddress(addr);
        } catch (UnknownHostException e) {
            throw new AssertionError(e);
        }
    }

    public static String toAddrString(InetAddress ip) {
        Preconditions.checkNotNull(ip);
        if (ip instanceof Inet4Address) {
            return ip.getHostAddress();
        }
        Preconditions.checkArgument(ip instanceof Inet6Address);
        byte[] address = ip.getAddress();
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            int i2 = i * 2;
            iArr[i] = Ints.fromBytes((byte) 0, (byte) 0, address[i2], address[i2 + 1]);
        }
        compressLongestRunOfZeroes(iArr);
        return hextetsToIPv6String(iArr);
    }

    public static void compressLongestRunOfZeroes(int[] hextets) {
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < hextets.length + 1; i4++) {
            if (i4 >= hextets.length || hextets[i4] != 0) {
                if (i3 >= 0) {
                    int i5 = i4 - i3;
                    if (i5 > i) {
                        i2 = i3;
                        i = i5;
                    }
                    i3 = -1;
                }
            } else if (i3 < 0) {
                i3 = i4;
            }
        }
        if (i >= 2) {
            Arrays.fill(hextets, i2, i + i2, -1);
        }
    }

    public static String hextetsToIPv6String(int[] hextets) {
        StringBuilder sb = new StringBuilder(39);
        int i = 0;
        boolean z = false;
        while (i < hextets.length) {
            boolean z2 = hextets[i] >= 0;
            if (z2) {
                if (z) {
                    sb.append(':');
                }
                sb.append(Integer.toHexString(hextets[i]));
            } else if (i == 0 || z) {
                sb.append("::");
            }
            i++;
            z = z2;
        }
        return sb.toString();
    }

    public static String toUriString(InetAddress ip) {
        if (ip instanceof Inet6Address) {
            return "[" + toAddrString(ip) + "]";
        }
        return toAddrString(ip);
    }

    public static InetAddress forUriString(String hostAddr) {
        InetAddress inetAddressForUriStringNoThrow = forUriStringNoThrow(hostAddr);
        if (inetAddressForUriStringNoThrow != null) {
            return inetAddressForUriStringNoThrow;
        }
        throw formatIllegalArgumentException("Not a valid URI IP literal: '%s'", hostAddr);
    }

    @CheckForNull
    public static InetAddress forUriStringNoThrow(String hostAddr) {
        int i;
        Preconditions.checkNotNull(hostAddr);
        if (hostAddr.startsWith("[") && hostAddr.endsWith("]")) {
            hostAddr = hostAddr.substring(1, hostAddr.length() - 1);
            i = 16;
        } else {
            i = 4;
        }
        byte[] bArrIpStringToBytes = ipStringToBytes(hostAddr);
        if (bArrIpStringToBytes == null || bArrIpStringToBytes.length != i) {
            return null;
        }
        return bytesToInetAddress(bArrIpStringToBytes);
    }

    public static boolean isUriInetAddress(String ipString) {
        return forUriStringNoThrow(ipString) != null;
    }

    public static boolean isCompatIPv4Address(Inet6Address ip) {
        byte b;
        if (!ip.isIPv4CompatibleAddress()) {
            return false;
        }
        byte[] address = ip.getAddress();
        return (address[12] == 0 && address[13] == 0 && address[14] == 0 && ((b = address[15]) == 0 || b == 1)) ? false : true;
    }

    public static Inet4Address getCompatIPv4Address(Inet6Address ip) {
        Preconditions.checkArgument(isCompatIPv4Address(ip), "Address '%s' is not IPv4-compatible.", toAddrString(ip));
        return getInet4Address(Arrays.copyOfRange(ip.getAddress(), 12, 16));
    }

    public static boolean is6to4Address(Inet6Address ip) {
        byte[] address = ip.getAddress();
        return address[0] == 32 && address[1] == 2;
    }

    public static Inet4Address get6to4IPv4Address(Inet6Address ip) {
        Preconditions.checkArgument(is6to4Address(ip), "Address '%s' is not a 6to4 address.", toAddrString(ip));
        return getInet4Address(Arrays.copyOfRange(ip.getAddress(), 2, 6));
    }

    public static final class TeredoInfo {
        public final Inet4Address client;
        public final int flags;
        public final int port;
        public final Inet4Address server;

        public TeredoInfo(@CheckForNull Inet4Address server, @CheckForNull Inet4Address client, int port, int flags) {
            boolean z = false;
            Preconditions.checkArgument(port >= 0 && port <= 65535, "port '%s' is out of range (0 <= port <= 0xffff)", port);
            if (flags >= 0 && flags <= 65535) {
                z = true;
            }
            Preconditions.checkArgument(z, "flags '%s' is out of range (0 <= flags <= 0xffff)", flags);
            this.server = (Inet4Address) MoreObjects.firstNonNull(server, InetAddresses.ANY4);
            this.client = (Inet4Address) MoreObjects.firstNonNull(client, InetAddresses.ANY4);
            this.port = port;
            this.flags = flags;
        }

        public Inet4Address getServer() {
            return this.server;
        }

        public Inet4Address getClient() {
            return this.client;
        }

        public int getPort() {
            return this.port;
        }

        public int getFlags() {
            return this.flags;
        }
    }

    public static boolean isTeredoAddress(Inet6Address ip) {
        byte[] address = ip.getAddress();
        return address[0] == 32 && address[1] == 1 && address[2] == 0 && address[3] == 0;
    }

    public static TeredoInfo getTeredoInfo(Inet6Address ip) {
        Preconditions.checkArgument(isTeredoAddress(ip), "Address '%s' is not a Teredo address.", toAddrString(ip));
        byte[] address = ip.getAddress();
        Inet4Address inet4Address = getInet4Address(Arrays.copyOfRange(address, 4, 8));
        int i = ByteStreams.newDataInput(address, 8).readShort() & UShort.MAX_VALUE;
        int i2 = 65535 & (~ByteStreams.newDataInput(address, 10).readShort());
        byte[] bArrCopyOfRange = Arrays.copyOfRange(address, 12, 16);
        for (int i3 = 0; i3 < bArrCopyOfRange.length; i3++) {
            bArrCopyOfRange[i3] = (byte) (~bArrCopyOfRange[i3]);
        }
        return new TeredoInfo(inet4Address, getInet4Address(bArrCopyOfRange), i2, i);
    }

    public static boolean isIsatapAddress(Inet6Address ip) {
        if (isTeredoAddress(ip)) {
            return false;
        }
        byte[] address = ip.getAddress();
        return (address[8] | 3) == 3 && address[9] == 0 && address[10] == 94 && address[11] == -2;
    }

    public static Inet4Address getIsatapIPv4Address(Inet6Address ip) {
        Preconditions.checkArgument(isIsatapAddress(ip), "Address '%s' is not an ISATAP address.", toAddrString(ip));
        return getInet4Address(Arrays.copyOfRange(ip.getAddress(), 12, 16));
    }

    public static boolean hasEmbeddedIPv4ClientAddress(Inet6Address ip) {
        return isCompatIPv4Address(ip) || is6to4Address(ip) || isTeredoAddress(ip);
    }

    public static Inet4Address getEmbeddedIPv4ClientAddress(Inet6Address ip) {
        if (isCompatIPv4Address(ip)) {
            return getCompatIPv4Address(ip);
        }
        if (is6to4Address(ip)) {
            return get6to4IPv4Address(ip);
        }
        if (isTeredoAddress(ip)) {
            return getTeredoInfo(ip).getClient();
        }
        throw formatIllegalArgumentException("'%s' has no embedded IPv4 address.", toAddrString(ip));
    }

    public static boolean isMappedIPv4Address(String ipString) {
        byte[] bArrIpStringToBytes = ipStringToBytes(ipString);
        if (bArrIpStringToBytes == null || bArrIpStringToBytes.length != 16) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= 10) {
                for (int i2 = 10; i2 < 12; i2++) {
                    if (bArrIpStringToBytes[i2] != -1) {
                        return false;
                    }
                }
                return true;
            }
            if (bArrIpStringToBytes[i] != 0) {
                return false;
            }
            i++;
        }
    }

    public static Inet4Address getCoercedIPv4Address(InetAddress ip) {
        boolean z;
        long jHashCode;
        if (ip instanceof Inet4Address) {
            return (Inet4Address) ip;
        }
        byte[] address = ip.getAddress();
        int i = 0;
        while (true) {
            if (i >= 15) {
                z = true;
                break;
            }
            if (address[i] != 0) {
                z = false;
                break;
            }
            i++;
        }
        if (z && address[15] == 1) {
            return LOOPBACK4;
        }
        if (z && address[15] == 0) {
            return ANY4;
        }
        Inet6Address inet6Address = (Inet6Address) ip;
        if (hasEmbeddedIPv4ClientAddress(inet6Address)) {
            jHashCode = getEmbeddedIPv4ClientAddress(inet6Address).hashCode();
        } else {
            jHashCode = ByteBuffer.wrap(inet6Address.getAddress(), 0, 8).getLong();
        }
        int iAsInt = Hashing.murmur3_32_fixed().hashLong(jHashCode).asInt() | (-536870912);
        if (iAsInt == -1) {
            iAsInt = -2;
        }
        return getInet4Address(Ints.toByteArray(iAsInt));
    }

    public static int coerceToInteger(InetAddress ip) {
        return ByteStreams.newDataInput(getCoercedIPv4Address(ip).getAddress()).readInt();
    }

    public static BigInteger toBigInteger(InetAddress address) {
        return new BigInteger(1, address.getAddress());
    }

    public static Inet4Address fromInteger(int address) {
        return getInet4Address(Ints.toByteArray(address));
    }

    public static Inet4Address fromIPv4BigInteger(BigInteger address) {
        return (Inet4Address) fromBigInteger(address, false);
    }

    public static Inet6Address fromIPv6BigInteger(BigInteger address) {
        return (Inet6Address) fromBigInteger(address, true);
    }

    public static InetAddress fromBigInteger(BigInteger address, boolean isIpv6) {
        Preconditions.checkArgument(address.signum() >= 0, "BigInteger must be greater than or equal to 0");
        int i = isIpv6 ? 16 : 4;
        byte[] byteArray = address.toByteArray();
        byte[] bArr = new byte[i];
        int iMax = Math.max(0, byteArray.length - i);
        int length = byteArray.length - iMax;
        int i2 = i - length;
        for (int i3 = 0; i3 < iMax; i3++) {
            if (byteArray[i3] != 0) {
                throw formatIllegalArgumentException("BigInteger cannot be converted to InetAddress because it has more than %d bytes: %s", Integer.valueOf(i), address);
            }
        }
        System.arraycopy(byteArray, iMax, bArr, i2, length);
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e) {
            throw new AssertionError(e);
        }
    }

    public static InetAddress fromLittleEndianByteArray(byte[] addr) throws UnknownHostException {
        byte[] bArr = new byte[addr.length];
        for (int i = 0; i < addr.length; i++) {
            bArr[i] = addr[(addr.length - i) - 1];
        }
        return InetAddress.getByAddress(bArr);
    }

    public static InetAddress decrement(InetAddress address) {
        byte[] address2 = address.getAddress();
        int length = address2.length - 1;
        while (length >= 0 && address2[length] == 0) {
            address2[length] = -1;
            length--;
        }
        Preconditions.checkArgument(length >= 0, "Decrementing %s would wrap.", address);
        address2[length] = (byte) (address2[length] - 1);
        return bytesToInetAddress(address2);
    }

    public static InetAddress increment(InetAddress address) {
        byte[] address2 = address.getAddress();
        int length = address2.length - 1;
        while (true) {
            if (length < 0 || address2[length] != -1) {
                break;
            }
            address2[length] = 0;
            length--;
        }
        Preconditions.checkArgument(length >= 0, "Incrementing %s would wrap.", address);
        address2[length] = (byte) (address2[length] + 1);
        return bytesToInetAddress(address2);
    }

    public static boolean isMaximum(InetAddress address) {
        for (byte b : address.getAddress()) {
            if (b != -1) {
                return false;
            }
        }
        return true;
    }

    public static IllegalArgumentException formatIllegalArgumentException(String format, Object... args) {
        return new IllegalArgumentException(String.format(Locale.ROOT, format, args));
    }
}
