package org.apache.ivy.util.url;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.apache.ivy.util.Credentials;
import org.apache.ivy.util.Message;

/* loaded from: classes8.dex */
public final class CredentialsStore {
    public static final Map<String, Credentials> KEYRING = new HashMap();
    public static final Set<String> SECURED_HOSTS = new HashSet();
    public static final CredentialsStore INSTANCE = new CredentialsStore();

    public void addCredentials(String str, String str2, String str3, String str4) {
        if (str3 == null) {
            return;
        }
        Credentials credentials = new Credentials(str, str2, str3, str4);
        Message.debug("credentials added: " + credentials);
        KEYRING.put(credentials.getKey(), credentials);
        SECURED_HOSTS.add(str2);
    }

    public Credentials getCredentials(String str, String str2) {
        String strBuildKey = Credentials.buildKey(str, str2);
        Message.debug("try to get credentials for: " + strBuildKey);
        return KEYRING.get(strBuildKey);
    }

    public boolean hasCredentials(String str) {
        return SECURED_HOSTS.contains(str);
    }
}
