package org.apache.ivy.plugins.resolver.packager;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.plugins.repository.Resource;

/* loaded from: classes5.dex */
public class BuiltFileResource implements Resource {
    public static final String BUILT_ARTIFACT_PATTERN = "artifacts/[type]s/[artifact].[ext]";
    public final File file;

    @Override // org.apache.ivy.plugins.repository.Resource
    public boolean isLocal() {
        return false;
    }

    public BuiltFileResource(File file) {
        this.file = file;
    }

    public BuiltFileResource(File file, Artifact artifact) {
        this(new File(file, IvyPatternHelper.substitute(BUILT_ARTIFACT_PATTERN, artifact)));
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public String getName() {
        return this.file.toURI().toString();
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public Resource clone(String str) {
        return new BuiltFileResource(new File(str));
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public long getLastModified() {
        return this.file.lastModified();
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public long getContentLength() {
        return this.file.length();
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public boolean exists() {
        return this.file.exists();
    }

    public String toString() {
        return getName();
    }

    public File getFile() {
        return this.file;
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public InputStream openStream() throws IOException {
        return new FileInputStream(this.file);
    }
}
