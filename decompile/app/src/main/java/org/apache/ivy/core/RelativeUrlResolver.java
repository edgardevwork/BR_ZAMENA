package org.apache.ivy.core;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes7.dex */
public abstract class RelativeUrlResolver {
    public abstract URL getURL(URL url, String str) throws MalformedURLException;

    public URL getURL(URL url, String str, String str2) throws MalformedURLException {
        if (str == null) {
            if (str2 != null) {
                return getURL(url, str2);
            }
            return null;
        }
        File file = new File(str);
        if (file.isAbsolute()) {
            return file.toURI().toURL();
        }
        return getURL(url, str);
    }
}
