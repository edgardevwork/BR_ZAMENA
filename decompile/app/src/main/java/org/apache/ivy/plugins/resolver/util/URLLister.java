package org.apache.ivy.plugins.resolver.util;

import java.io.IOException;
import java.net.URL;
import java.util.List;

/* loaded from: classes6.dex */
public interface URLLister {
    boolean accept(String str);

    List<URL> listAll(URL url) throws IOException;
}
