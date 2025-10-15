package io.appmetrica.analytics.impl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: io.appmetrica.analytics.impl.yi */
/* loaded from: classes8.dex */
public abstract class AbstractC10009yi {
    /* renamed from: a */
    public static byte[] m6997a(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.reset();
        messageDigest.update(str.getBytes("UTF-8"));
        return messageDigest.digest();
    }
}
