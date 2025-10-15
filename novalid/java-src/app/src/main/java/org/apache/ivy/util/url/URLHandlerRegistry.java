package org.apache.ivy.util.url;

import org.apache.ivy.util.Message;

/* loaded from: classes8.dex */
public final class URLHandlerRegistry {
    public static URLHandler defaultHandler = new BasicURLHandler();

    public static URLHandler getDefault() {
        return defaultHandler;
    }

    public static void setDefault(URLHandler uRLHandler) {
        defaultHandler = uRLHandler;
    }

    public static TimeoutConstrainedURLHandler getHttp() {
        try {
            return (TimeoutConstrainedURLHandler) Class.forName("org.apache.ivy.util.url.HttpClientHandler").getDeclaredField("DELETE_ON_EXIT_INSTANCE").get(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
            Message.verbose("Using JDK backed URL handler for HTTP interaction since the Apache HttpComponents HttpClient backed handler couldn't be created due to: " + e.getMessage());
            return new BasicURLHandler();
        }
    }
}
