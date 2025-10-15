package org.apache.ivy.core;

import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes7.dex */
public class NormalRelativeUrlResolver extends RelativeUrlResolver {
    @Override // org.apache.ivy.core.RelativeUrlResolver
    public URL getURL(URL url, String str) throws MalformedURLException {
        return new URL(url, str);
    }
}
