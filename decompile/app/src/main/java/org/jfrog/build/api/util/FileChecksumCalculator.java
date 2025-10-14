package org.jfrog.build.api.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract class FileChecksumCalculator {
    public static final int BUFFER_SIZE = 32768;
    public static final String MD5_ALGORITHM = "MD5";
    public static final String SHA1_ALGORITHM = "SHA1";
    public static final String SHA256_ALGORITHM = "SHA-256";

    public static Map<String, String> calculateChecksums(File file, String... strArr) throws NoSuchAlgorithmException, IOException {
        if (file == null) {
            throw new IllegalArgumentException("Cannot read checksums of null file.");
        }
        if (!file.exists()) {
            throw new IllegalArgumentException("Cannot read checksums of non-existent file: " + file.getAbsolutePath());
        }
        if (!file.isFile()) {
            throw new IllegalArgumentException("Cannot read checksums of a folder: " + file.getAbsolutePath());
        }
        if (strArr == null) {
            throw new IllegalArgumentException("Checksum algorithms cannot be null.");
        }
        if (strArr.length == 0) {
            return new HashMap();
        }
        return calculate(file, strArr);
    }

    public static Map<String, String> calculate(File file, String... strArr) throws NoSuchAlgorithmException, IOException {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (String str : strArr) {
            map.put(str, MessageDigest.getInstance(str));
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[32768];
            for (int i = fileInputStream.read(bArr, 0, 32768); i >= 0; i = fileInputStream.read(bArr, 0, 32768)) {
                for (String str2 : strArr) {
                    ((MessageDigest) map.get(str2)).update(bArr, 0, i);
                }
            }
            fileInputStream.close();
            for (String str3 : strArr) {
                byte[] bArrDigest = ((MessageDigest) map.get(str3)).digest();
                StringBuilder sb = new StringBuilder();
                for (byte b : bArrDigest) {
                    String hexString = Integer.toHexString(b & 255);
                    if (hexString.length() == 1) {
                        sb.append("0");
                    }
                    sb.append(hexString);
                }
                map2.put(str3, sb.toString().trim());
            }
            return map2;
        } finally {
        }
    }
}
