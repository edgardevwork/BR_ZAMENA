package org.apache.ivy.util;

/* loaded from: classes8.dex */
public class Credentials {
    public String host;
    public String passwd;
    public String realm;
    public String userName;

    public Credentials(String str, String str2, String str3, String str4) {
        this.realm = str;
        this.host = str2;
        this.userName = str3;
        this.passwd = str4;
    }

    public String getHost() {
        return this.host;
    }

    public String getPasswd() {
        return this.passwd;
    }

    public String getRealm() {
        return this.realm;
    }

    public String getUserName() {
        return this.userName;
    }

    public static String buildKey(String str, String str2) {
        if (StringUtils.isNullOrEmpty(str)) {
            return str2;
        }
        return str + "@" + str2;
    }

    public String toString() {
        return getKey() + " " + getUserName() + "/" + getPasswdAsStars();
    }

    public final String getPasswdAsStars() {
        String str = this.passwd;
        if (str == null) {
            return null;
        }
        return StringUtils.repeat("*", str.length());
    }

    public boolean equals(Object obj) {
        return (obj instanceof Credentials) && getKey().equals(((Credentials) obj).getKey());
    }

    public int hashCode() {
        return getKey().hashCode();
    }

    public String getKey() {
        return buildKey(this.realm, this.host);
    }
}
