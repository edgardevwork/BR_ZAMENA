package org.apache.ivy.util.url;

import java.lang.reflect.Field;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import org.apache.ivy.util.Credentials;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.StringUtils;

/* loaded from: classes8.dex */
public final class IvyAuthenticator extends Authenticator {
    public static boolean securityWarningLogged;
    public Authenticator original;

    public IvyAuthenticator(Authenticator authenticator) {
        this.original = authenticator;
    }

    public static void install() {
        Authenticator currentAuthenticator = getCurrentAuthenticator();
        if (currentAuthenticator instanceof IvyAuthenticator) {
            return;
        }
        try {
            Authenticator.setDefault(new IvyAuthenticator(currentAuthenticator));
        } catch (SecurityException unused) {
            if (securityWarningLogged) {
                return;
            }
            securityWarningLogged = true;
            Message.warn("Not enough permissions to set the IvyAuthenticator. HTTP(S) authentication will be disabled!");
        }
    }

    @Override // java.net.Authenticator
    public PasswordAuthentication getPasswordAuthentication() {
        Authenticator authenticator;
        PasswordAuthentication passwordAuthentication = null;
        if (isProxyAuthentication()) {
            String property = System.getProperty("http.proxyUser");
            if (!StringUtils.isNullOrEmpty(property)) {
                String property2 = System.getProperty("http.proxyPassword", "");
                Message.debug("authenticating to proxy server with username [" + property + "]");
                passwordAuthentication = new PasswordAuthentication(property, property2.toCharArray());
            }
        } else {
            Credentials credentials = CredentialsStore.INSTANCE.getCredentials(getRequestingPrompt(), getRequestingHost());
            Message.debug("authentication: k='" + Credentials.buildKey(getRequestingPrompt(), getRequestingHost()) + "' c='" + credentials + "'");
            if (credentials != null) {
                passwordAuthentication = new PasswordAuthentication(credentials.getUserName(), (credentials.getPasswd() != null ? credentials.getPasswd() : "").toCharArray());
            }
        }
        if (passwordAuthentication == null && (authenticator = this.original) != null) {
            Authenticator.setDefault(authenticator);
            try {
                passwordAuthentication = Authenticator.requestPasswordAuthentication(getRequestingHost(), getRequestingSite(), getRequestingPort(), getRequestingProtocol(), getRequestingPrompt(), getRequestingScheme(), getRequestingURL(), getRequestorType());
            } finally {
                Authenticator.setDefault(this);
            }
        }
        return passwordAuthentication;
    }

    public static Authenticator getCurrentAuthenticator() {
        return getJavaVersion() < 9 ? getTheAuthenticator() : getDefaultAuthenticator();
    }

    public final boolean isProxyAuthentication() {
        return Authenticator.RequestorType.PROXY.equals(getRequestorType());
    }

    public static Authenticator getDefaultAuthenticator() {
        try {
            return (Authenticator) Authenticator.class.getDeclaredMethod("getDefault", null).invoke(null, null);
        } catch (Throwable th) {
            handleReflectionException(th);
            return null;
        }
    }

    public static Authenticator getTheAuthenticator() {
        try {
            Field declaredField = Authenticator.class.getDeclaredField("theAuthenticator");
            declaredField.setAccessible(true);
            return (Authenticator) declaredField.get(null);
        } catch (Throwable th) {
            handleReflectionException(th);
            return null;
        }
    }

    public static void handleReflectionException(Throwable th) {
        Message.debug("Error occurred while getting the original authenticator: " + th.getMessage());
    }

    public static int getJavaVersion() throws NumberFormatException {
        String[] strArrSplit = System.getProperty("java.specification.version").split("\\.");
        int i = Integer.parseInt(strArrSplit[0]);
        return i == 1 ? Integer.parseInt(strArrSplit[1]) : i;
    }
}
