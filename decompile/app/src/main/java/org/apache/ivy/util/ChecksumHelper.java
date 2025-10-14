package org.apache.ivy.util;

import com.google.common.base.Ascii;
import io.ktor.util.date.GMTDateParser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* loaded from: classes8.dex */
public final class ChecksumHelper {
    public static final int BUFFER_SIZE = 2048;
    public static final char[] CHARS;
    public static final Map<String, String> algorithms;

    static {
        HashMap map = new HashMap();
        algorithms = map;
        map.put("md5", "MD5");
        map.put("sha1", MessageDigestAlgorithms.SHA_1);
        if (isAlgorithmSupportedInJRE("SHA-256")) {
            map.put("SHA-256", "SHA-256");
        }
        if (isAlgorithmSupportedInJRE(MessageDigestAlgorithms.SHA_512)) {
            map.put(MessageDigestAlgorithms.SHA_512, MessageDigestAlgorithms.SHA_512);
        }
        if (isAlgorithmSupportedInJRE(MessageDigestAlgorithms.SHA_384)) {
            map.put(MessageDigestAlgorithms.SHA_384, MessageDigestAlgorithms.SHA_384);
        }
        CHARS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', GMTDateParser.DAY_OF_MONTH, 'e', 'f'};
    }

    public static boolean isAlgorithmSupportedInJRE(String str) throws NoSuchAlgorithmException {
        if (str == null) {
            return false;
        }
        try {
            MessageDigest.getInstance(str);
            return true;
        } catch (NoSuchAlgorithmException unused) {
            return false;
        }
    }

    public static void check(File file, File file2, String str) throws IOException {
        String lowerCase = FileUtil.readEntirely(new BufferedReader(new FileReader(file2))).trim().toLowerCase(Locale.US);
        if (lowerCase.indexOf(32) > -1 && (lowerCase.startsWith("md") || lowerCase.startsWith("sha"))) {
            lowerCase = lowerCase.substring(lowerCase.lastIndexOf(32) + 1);
        } else {
            int iIndexOf = lowerCase.indexOf(32);
            if (iIndexOf != -1) {
                String strSubstring = lowerCase.substring(0, iIndexOf);
                if (strSubstring.endsWith(io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER)) {
                    StringBuilder sb = new StringBuilder();
                    for (char c : lowerCase.substring(iIndexOf + 1).toCharArray()) {
                        if (!Character.isWhitespace(c)) {
                            sb.append(c);
                        }
                    }
                    lowerCase = sb.toString();
                } else {
                    lowerCase = strSubstring;
                }
            }
        }
        String lowerCase2 = computeAsString(file, str).trim().toLowerCase(Locale.US);
        if (lowerCase.equals(lowerCase2)) {
            return;
        }
        throw new IOException("invalid " + str + ": expected=" + lowerCase + " computed=" + lowerCase2);
    }

    public static String computeAsString(File file, String str) throws IOException {
        return byteArrayToHexString(compute(file, str));
    }

    public static byte[] compute(File file, String str) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            MessageDigest messageDigest = getMessageDigest(str);
            messageDigest.reset();
            byte[] bArr = new byte[2048];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i != -1) {
                    messageDigest.update(bArr, 0, i);
                } else {
                    byte[] bArrDigest = messageDigest.digest();
                    fileInputStream.close();
                    return bArrDigest;
                }
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static boolean isKnownAlgorithm(String str) {
        return algorithms.containsKey(str);
    }

    public static MessageDigest getMessageDigest(String str) {
        String str2 = algorithms.get(str);
        if (str2 == null) {
            throw new IllegalArgumentException("unknown algorithm " + str);
        }
        try {
            return MessageDigest.getInstance(str2);
        } catch (NoSuchAlgorithmException unused) {
            throw new IllegalArgumentException("unknown algorithm " + str);
        }
    }

    public static String byteArrayToHexString(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            byte b2 = (byte) (((byte) (((byte) (b & 240)) >>> 4)) & Ascii.f786SI);
            char[] cArr = CHARS;
            sb.append(cArr[b2]);
            sb.append(cArr[(byte) (b & Ascii.f786SI)]);
        }
        return sb.toString();
    }
}
