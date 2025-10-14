package org.apache.http.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import org.apache.commons.lang3.ObjectUtils;

/* loaded from: classes7.dex */
public class VersionInfo {
    public static final String PROPERTY_MODULE = "info.module";
    public static final String PROPERTY_RELEASE = "info.release";
    public static final String PROPERTY_TIMESTAMP = "info.timestamp";
    public static final String UNAVAILABLE = "UNAVAILABLE";
    public static final String VERSION_PROPERTY_FILE = "version.properties";
    public final String infoClassloader;
    public final String infoModule;
    public final String infoPackage;
    public final String infoRelease;
    public final String infoTimestamp;

    public VersionInfo(String str, String str2, String str3, String str4, String str5) {
        Args.notNull(str, "Package identifier");
        this.infoPackage = str;
        this.infoModule = str2 == null ? UNAVAILABLE : str2;
        this.infoRelease = str3 == null ? UNAVAILABLE : str3;
        this.infoTimestamp = str4 == null ? UNAVAILABLE : str4;
        this.infoClassloader = str5 == null ? UNAVAILABLE : str5;
    }

    public final String getPackage() {
        return this.infoPackage;
    }

    public final String getModule() {
        return this.infoModule;
    }

    public final String getRelease() {
        return this.infoRelease;
    }

    public final String getTimestamp() {
        return this.infoTimestamp;
    }

    public final String getClassloader() {
        return this.infoClassloader;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.infoPackage.length() + 20 + this.infoModule.length() + this.infoRelease.length() + this.infoTimestamp.length() + this.infoClassloader.length());
        sb.append("VersionInfo(");
        sb.append(this.infoPackage);
        sb.append(':');
        sb.append(this.infoModule);
        if (!UNAVAILABLE.equals(this.infoRelease)) {
            sb.append(':');
            sb.append(this.infoRelease);
        }
        if (!UNAVAILABLE.equals(this.infoTimestamp)) {
            sb.append(':');
            sb.append(this.infoTimestamp);
        }
        sb.append(')');
        if (!UNAVAILABLE.equals(this.infoClassloader)) {
            sb.append(ObjectUtils.AT_SIGN);
            sb.append(this.infoClassloader);
        }
        return sb.toString();
    }

    public static VersionInfo[] loadVersionInfo(String[] strArr, ClassLoader classLoader) throws IOException {
        Args.notNull(strArr, "Package identifier array");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            VersionInfo versionInfoLoadVersionInfo = loadVersionInfo(str, classLoader);
            if (versionInfoLoadVersionInfo != null) {
                arrayList.add(versionInfoLoadVersionInfo);
            }
        }
        return (VersionInfo[]) arrayList.toArray(new VersionInfo[arrayList.size()]);
    }

    public static VersionInfo loadVersionInfo(String str, ClassLoader classLoader) throws IOException {
        Properties properties;
        InputStream resourceAsStream;
        Args.notNull(str, "Package identifier");
        if (classLoader == null) {
            classLoader = Thread.currentThread().getContextClassLoader();
        }
        try {
            resourceAsStream = classLoader.getResourceAsStream(str.replace('.', '/') + "/" + VERSION_PROPERTY_FILE);
        } catch (IOException unused) {
        }
        if (resourceAsStream != null) {
            try {
                properties = new Properties();
                properties.load(resourceAsStream);
                try {
                    resourceAsStream.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                resourceAsStream.close();
                throw th;
            }
        } else {
            properties = null;
        }
        if (properties != null) {
            return fromMap(str, properties, classLoader);
        }
        return null;
    }

    public static VersionInfo fromMap(String str, Map<?, ?> map, ClassLoader classLoader) {
        String str2;
        String str3;
        String str4;
        Args.notNull(str, "Package identifier");
        if (map != null) {
            String str5 = (String) map.get(PROPERTY_MODULE);
            if (str5 != null && str5.length() < 1) {
                str5 = null;
            }
            String str6 = (String) map.get(PROPERTY_RELEASE);
            if (str6 != null && (str6.length() < 1 || str6.equals("${pom.version}"))) {
                str6 = null;
            }
            String str7 = (String) map.get(PROPERTY_TIMESTAMP);
            str4 = (str7 == null || (str7.length() >= 1 && !str7.equals("${mvn.timestamp}"))) ? str7 : null;
            str2 = str5;
            str3 = str6;
        } else {
            str2 = null;
            str3 = null;
            str4 = null;
        }
        return new VersionInfo(str, str2, str3, str4, classLoader != null ? classLoader.toString() : null);
    }

    public static String getUserAgent(String str, String str2, Class<?> cls) throws IOException {
        VersionInfo versionInfoLoadVersionInfo = loadVersionInfo(str2, cls.getClassLoader());
        return String.format("%s/%s (Java/%s)", str, versionInfoLoadVersionInfo != null ? versionInfoLoadVersionInfo.getRelease() : UNAVAILABLE, System.getProperty("java.version"));
    }
}
