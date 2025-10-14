package org.apache.ivy.plugins.repository.file;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.ivy.plugins.repository.AbstractRepository;
import org.apache.ivy.plugins.repository.RepositoryCopyProgressListener;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.util.Checks;
import org.apache.ivy.util.FileUtil;

/* loaded from: classes5.dex */
public class FileRepository extends AbstractRepository {
    public File baseDir;
    public boolean local;
    public RepositoryCopyProgressListener progress;

    public FileRepository() {
        this.progress = new RepositoryCopyProgressListener(this);
        this.local = true;
        this.baseDir = null;
    }

    public FileRepository(File file) {
        this.progress = new RepositoryCopyProgressListener(this);
        this.local = true;
        setBaseDir(file);
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public Resource getResource(String str) throws IOException {
        return new FileResource(this, getFile(str));
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public void get(String str, File file) throws IOException {
        File file2 = getFile(str);
        fireTransferInitiated(getResource(str), 5);
        copy(file2, file, true);
    }

    @Override // org.apache.ivy.plugins.repository.AbstractRepository
    public void put(File file, String str, boolean z) throws IOException {
        File file2 = getFile(str);
        fireTransferInitiated(getResource(str), 6);
        copy(file, file2, z);
    }

    public void move(File file, File file2) throws IOException {
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException("impossible to move '" + file + "' to '" + file2 + "'");
    }

    public void delete(File file) throws IOException {
        if (FileUtil.forceDelete(file)) {
            return;
        }
        throw new IOException("impossible to delete '" + file + "'");
    }

    public final void copy(File file, File file2, boolean z) throws IOException {
        try {
            try {
                getProgressListener().setTotalLength(Long.valueOf(file.length()));
                if (FileUtil.copy(file, file2, getProgressListener(), z)) {
                    getProgressListener().setTotalLength(null);
                    return;
                }
                if (z || !file2.exists()) {
                    throw new IOException("file copy not done from " + file + " to " + file2);
                }
                throw new IOException("file copy not done from " + file + " to " + file2 + ": destination already exists and overwrite is false");
            } catch (IOException e) {
                e = e;
                fireTransferError(e);
                throw e;
            } catch (RuntimeException e2) {
                e = e2;
                fireTransferError(e);
                throw e;
            }
        } catch (Throwable th) {
            getProgressListener().setTotalLength(null);
            throw th;
        }
    }

    public RepositoryCopyProgressListener getProgressListener() {
        return this.progress;
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public List<String> list(String str) throws IOException {
        String[] list;
        File file = getFile(str);
        if (!file.exists() || !file.isDirectory() || (list = file.list()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.length);
        for (String str2 : list) {
            arrayList.add(str + getFileSeparator() + str2);
        }
        return arrayList;
    }

    public File getFile(String str) {
        File file = this.baseDir;
        if (file == null) {
            return Checks.checkAbsolute(str, "source");
        }
        File fileResolveFile = FileUtil.resolveFile(file, str);
        if (FileUtil.isLeadingPath(this.baseDir, fileResolveFile)) {
            return fileResolveFile;
        }
        throw new IllegalArgumentException(str + " outside of repository root");
    }

    public boolean isLocal() {
        return this.local;
    }

    public void setLocal(boolean z) {
        this.local = z;
    }

    public File getBaseDir() {
        return this.baseDir;
    }

    public final void setBaseDir(File file) {
        Checks.checkAbsolute(file, "basedir");
        this.baseDir = file;
    }

    @Override // org.apache.ivy.plugins.repository.AbstractRepository, org.apache.ivy.plugins.repository.Repository
    public String standardize(String str) {
        File file = this.baseDir;
        if (file == null) {
            return FileUtil.normalize(str).getPath();
        }
        return FileUtil.resolveFile(file, str).getPath();
    }

    @Override // org.apache.ivy.plugins.repository.AbstractRepository, org.apache.ivy.plugins.repository.Repository
    public String getFileSeparator() {
        return File.separator;
    }
}
