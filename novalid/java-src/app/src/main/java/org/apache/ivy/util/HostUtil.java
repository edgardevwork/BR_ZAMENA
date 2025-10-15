package org.apache.ivy.util;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* loaded from: classes8.dex */
public final class HostUtil {
    public static String localHostName;

    public static String getLocalHostName() {
        if (localHostName == null) {
            try {
                localHostName = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException unused) {
                localHostName = "localhost";
            }
        }
        return localHostName;
    }
}
