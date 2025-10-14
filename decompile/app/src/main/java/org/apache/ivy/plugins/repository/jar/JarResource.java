package org.apache.ivy.plugins.repository.jar;

import java.io.IOException;
import java.io.InputStream;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import org.apache.ivy.plugins.repository.Resource;

/* loaded from: classes5.dex */
public class JarResource implements Resource {
    public ZipEntry entry;
    public final JarFile jarFile;
    public final String path;

    @Override // org.apache.ivy.plugins.repository.Resource
    public boolean isLocal() {
        return false;
    }

    public JarResource(JarFile jarFile, String str) {
        this.jarFile = jarFile;
        this.path = str;
        this.entry = jarFile.getEntry(str);
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public String getName() {
        return this.path;
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public long getLastModified() {
        return this.entry.getTime();
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public long getContentLength() {
        return this.entry.getSize();
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public boolean exists() {
        return this.entry != null;
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public Resource clone(String str) {
        return new JarResource(this.jarFile, str);
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public InputStream openStream() throws IOException {
        return this.jarFile.getInputStream(this.entry);
    }

    public String toString() {
        return this.jarFile.getName() + "!" + getName();
    }
}
