package org.apache.ivy.plugins.repository.jar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import org.apache.ivy.core.settings.TimeoutConstraint;
import org.apache.ivy.plugins.repository.AbstractRepository;
import org.apache.ivy.plugins.repository.RepositoryCopyProgressListener;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.util.FileUtil;

/* loaded from: classes5.dex */
public class JarRepository extends AbstractRepository {
    public JarFile jarFile;
    public RepositoryCopyProgressListener progress;

    public JarRepository() {
        this.progress = new RepositoryCopyProgressListener(this);
    }

    public JarRepository(TimeoutConstraint timeoutConstraint) {
        super(timeoutConstraint);
        this.progress = new RepositoryCopyProgressListener(this);
    }

    public void setJarFile(JarFile jarFile) {
        this.jarFile = jarFile;
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public Resource getResource(String str) throws IOException {
        return new JarResource(this.jarFile, str);
    }

    public RepositoryCopyProgressListener getProgressListener() {
        return this.progress;
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public void get(String str, File file) throws IOException {
        fireTransferInitiated(getResource(str), 5);
        try {
            try {
                ZipEntry entry = this.jarFile.getEntry(str);
                if (entry == null) {
                    throw new FileNotFoundException();
                }
                getProgressListener().setTotalLength(Long.valueOf(entry.getSize()));
                FileUtil.copy(this.jarFile.getInputStream(entry), file, getProgressListener());
            } catch (IOException | RuntimeException e) {
                fireTransferError(e);
                throw e;
            }
        } finally {
            getProgressListener().setTotalLength(null);
        }
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public List<String> list(String str) throws IOException {
        ZipEntry entry = this.jarFile.getEntry(str);
        if (entry == null || !entry.isDirectory()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Enumeration<JarEntry> enumerationEntries = this.jarFile.entries();
        while (enumerationEntries.hasMoreElements()) {
            JarEntry jarEntryNextElement = enumerationEntries.nextElement();
            if (jarEntryNextElement.getName().startsWith(str) && jarEntryNextElement.getName().equals(entry.getName())) {
                arrayList.add(jarEntryNextElement.getName());
            }
        }
        return arrayList;
    }
}
