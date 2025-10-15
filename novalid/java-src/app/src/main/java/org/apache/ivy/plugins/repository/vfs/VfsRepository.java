package org.apache.ivy.plugins.repository.vfs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.vfs2.FileContent;
import org.apache.commons.vfs2.FileObject;
import org.apache.commons.vfs2.FileSystemException;
import org.apache.commons.vfs2.FileSystemManager;
import org.apache.commons.vfs2.FileType;
import org.apache.commons.vfs2.impl.StandardFileSystemManager;
import org.apache.ivy.core.settings.TimeoutConstraint;
import org.apache.ivy.plugins.repository.AbstractRepository;
import org.apache.ivy.plugins.repository.RepositoryCopyProgressListener;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.util.CopyProgressListener;
import org.apache.ivy.util.FileUtil;
import org.apache.ivy.util.Message;

/* loaded from: classes5.dex */
public class VfsRepository extends AbstractRepository {
    public static final String IVY_VFS_CONFIG = "ivy_vfs.xml";
    public StandardFileSystemManager manager;
    public final CopyProgressListener progress;

    public VfsRepository() {
        this.manager = null;
        this.progress = new RepositoryCopyProgressListener(this);
    }

    public VfsRepository(TimeoutConstraint timeoutConstraint) {
        super(timeoutConstraint);
        this.manager = null;
        this.progress = new RepositoryCopyProgressListener(this);
    }

    public final FileSystemManager getVFSManager() throws IOException {
        synchronized (this) {
            try {
                if (this.manager == null) {
                    this.manager = createVFSManager();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.manager;
    }

    /* renamed from: org.apache.ivy.plugins.repository.vfs.VfsRepository$1 */
    /* loaded from: classes6.dex */
    public class C112491 extends StandardFileSystemManager {
        public void configurePlugins() throws FileSystemException {
        }

        public C112491() {
        }
    }

    public final StandardFileSystemManager createVFSManager() throws IOException {
        try {
            C112491 c112491 = new StandardFileSystemManager() { // from class: org.apache.ivy.plugins.repository.vfs.VfsRepository.1
                public void configurePlugins() throws FileSystemException {
                }

                public C112491() {
                }
            };
            c112491.setConfiguration(getClass().getResource(IVY_VFS_CONFIG));
            c112491.init();
            Message.verbose("Available VFS schemes...");
            String[] schemes = c112491.getSchemes();
            Arrays.sort(schemes);
            for (String str : schemes) {
                Message.verbose("VFS Supported Scheme: " + str);
            }
            return c112491;
        } catch (FileSystemException e) {
            Message.error("Unable to initialize VFS repository manager!");
            Message.error(e.getLocalizedMessage());
            throw new IOException(e.getLocalizedMessage(), e);
        }
    }

    public void finalize() {
        StandardFileSystemManager standardFileSystemManager = this.manager;
        if (standardFileSystemManager != null) {
            standardFileSystemManager.close();
            this.manager = null;
        }
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public Resource getResource(String str) throws IOException {
        return new VfsResource(str, getVFSManager());
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public void get(String str, File file) throws Exception {
        VfsResource vfsResource = new VfsResource(str, getVFSManager());
        fireTransferInitiated(vfsResource, 5);
        try {
            FileContent content = vfsResource.getContent();
            if (content == null) {
                throw new IllegalArgumentException("invalid vfs uri " + str + ": no content found");
            }
            FileUtil.copy(content.getInputStream(), file, this.progress);
        } catch (IOException e) {
            e = e;
            fireTransferError(e);
            throw e;
        } catch (RuntimeException e2) {
            e = e2;
            fireTransferError(e);
            throw e;
        }
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public List<String> list(String str) throws IOException {
        ArrayList arrayList = new ArrayList();
        Message.debug("list called for URI" + str);
        FileObject fileObjectResolveFile = getVFSManager().resolveFile(str);
        Message.debug("resourceImpl=" + fileObjectResolveFile.toString());
        Message.debug("resourceImpl.exists()" + fileObjectResolveFile.exists());
        Message.debug("resourceImpl.getType()" + fileObjectResolveFile.getType());
        Message.debug("FileType.FOLDER" + FileType.FOLDER);
        if (fileObjectResolveFile.exists() && fileObjectResolveFile.getType() == FileType.FOLDER) {
            List<FileObject> listAsList = Arrays.asList(fileObjectResolveFile.getChildren());
            for (FileObject fileObject : listAsList) {
                Message.debug("child " + listAsList.indexOf(fileObject) + fileObject.getName().getURI());
                arrayList.add(VfsResource.normalize(fileObject.getName().getURI()));
            }
        }
        return arrayList;
    }

    @Override // org.apache.ivy.plugins.repository.AbstractRepository
    public void put(File file, String str, boolean z) throws IOException {
        VfsResource vfsResource = new VfsResource(str, getVFSManager());
        fireTransferInitiated(vfsResource, 6);
        if (vfsResource.physicallyExists() && !z) {
            throw new IOException("Cannot copy. Destination file: " + vfsResource.getName() + " exists and overwrite not set.");
        }
        if (vfsResource.getContent() == null) {
            throw new IllegalArgumentException("invalid vfs uri " + str + " to put data to: resource has no content");
        }
        FileUtil.copy(new FileInputStream(file), vfsResource.getContent().getOutputStream(), this.progress);
    }
}
