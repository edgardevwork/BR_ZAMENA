package org.apache.ivy.plugins.repository.vfs;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.vfs2.FileContent;
import org.apache.commons.vfs2.FileObject;
import org.apache.commons.vfs2.FileSystemException;
import org.apache.commons.vfs2.FileSystemManager;
import org.apache.commons.vfs2.FileType;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.plugins.resolver.VfsResolver;
import org.apache.ivy.util.Message;

/* loaded from: classes5.dex */
public class VfsResource implements Resource {
    public transient long contentLength;
    public transient boolean exists;
    public FileSystemManager fsManager;
    public transient long lastModified;
    public transient FileObject resourceImpl;
    public String vfsURI;
    public transient FileContent content = null;
    public transient boolean init = false;

    public VfsResource(String str, FileSystemManager fileSystemManager) {
        this.vfsURI = str;
        this.fsManager = fileSystemManager;
    }

    private void init() {
        if (this.init) {
            return;
        }
        try {
            FileObject fileObjectResolveFile = this.fsManager.resolveFile(this.vfsURI);
            this.resourceImpl = fileObjectResolveFile;
            this.content = fileObjectResolveFile.getContent();
            this.exists = this.resourceImpl.exists();
            this.lastModified = this.content.getLastModifiedTime();
            this.contentLength = this.content.getSize();
        } catch (FileSystemException e) {
            Message.debug((Throwable) e);
            Message.verbose(e.getLocalizedMessage());
            this.exists = false;
            this.lastModified = 0L;
            this.contentLength = 0L;
        }
        this.init = true;
    }

    public List<String> getChildren() {
        init();
        ArrayList arrayList = new ArrayList();
        try {
            FileObject fileObject = this.resourceImpl;
            if (fileObject != null && fileObject.exists() && this.resourceImpl.getType() == FileType.FOLDER) {
                for (FileObject fileObject2 : this.resourceImpl.getChildren()) {
                    arrayList.add(normalize(fileObject2.getName().getURI()));
                }
            }
        } catch (IOException e) {
            Message.debug(e);
            Message.verbose(e.getLocalizedMessage());
        }
        return arrayList;
    }

    public FileContent getContent() {
        init();
        return this.content;
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public String getName() {
        return normalize(this.vfsURI);
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public Resource clone(String str) {
        return new VfsResource(str, this.fsManager);
    }

    public static String normalize(String str) {
        if (str == null) {
            return "";
        }
        return str.startsWith("file:////") ? str.replaceFirst("////", "///") : str;
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public long getLastModified() {
        init();
        return this.lastModified;
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public long getContentLength() {
        init();
        return this.contentLength;
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public boolean exists() {
        init();
        return this.exists;
    }

    public boolean physicallyExists() {
        init();
        try {
            return this.resourceImpl.exists();
        } catch (Exception e) {
            Message.verbose("Fail to check the existence of the resource " + getName(), e);
            return false;
        }
    }

    public String toString() {
        return VfsResolver.prepareForDisplay(getName());
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public boolean isLocal() {
        return getName().startsWith("file:");
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public InputStream openStream() throws IOException {
        return getContent().getInputStream();
    }
}
