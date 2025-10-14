package org.apache.ivy.plugins.resolver.util;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.ivy.plugins.parser.p064m2.PomReader;

/* loaded from: classes5.dex */
public class FileURLLister implements URLLister {
    public File basedir;

    public FileURLLister() {
        this(null);
    }

    public FileURLLister(File file) {
        this.basedir = file;
    }

    @Override // org.apache.ivy.plugins.resolver.util.URLLister
    public boolean accept(String str) {
        return str.startsWith(PomReader.PomProfileElement.FILE);
    }

    @Override // org.apache.ivy.plugins.resolver.util.URLLister
    public List<URL> listAll(URL url) throws IOException {
        String path;
        try {
            path = new File(new URI(url.toExternalForm())).getPath();
        } catch (URISyntaxException unused) {
            path = url.getPath();
        }
        File file = this.basedir == null ? new File(path) : new File(this.basedir, path);
        if (file.exists() && file.isDirectory()) {
            String[] list = file.list();
            ArrayList arrayList = new ArrayList(list.length);
            if (!url.getPath().endsWith("/")) {
                url = new URL(url.toExternalForm() + "/");
            }
            for (String str : list) {
                arrayList.add(new URL(url, str));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public String toString() {
        return "file lister";
    }
}
