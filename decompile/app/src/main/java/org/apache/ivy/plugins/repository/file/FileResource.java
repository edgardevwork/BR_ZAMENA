package org.apache.ivy.plugins.repository.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.ivy.plugins.repository.Resource;

/* loaded from: classes5.dex */
public class FileResource implements Resource {
    public File file;
    public FileRepository repository;

    public FileResource(FileRepository fileRepository, File file) {
        this.repository = fileRepository;
        this.file = file;
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public String getName() {
        return this.file.getPath();
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public Resource clone(String str) {
        FileRepository fileRepository = this.repository;
        return new FileResource(fileRepository, fileRepository.getFile(str));
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

    public FileRepository getRepository() {
        return this.repository;
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public boolean isLocal() {
        return this.repository.isLocal();
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public InputStream openStream() throws IOException {
        return new FileInputStream(this.file);
    }
}
