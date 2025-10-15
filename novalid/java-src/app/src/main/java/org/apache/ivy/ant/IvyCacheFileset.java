package org.apache.ivy.ant;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.ivy.core.report.ArtifactDownloadReport;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.FileSet;

/* loaded from: classes5.dex */
public class IvyCacheFileset extends IvyCacheTask {
    public String setid;

    public String getSetid() {
        return this.setid;
    }

    public void setSetid(String str) {
        this.setid = str;
    }

    @Override // org.apache.ivy.ant.IvyPostResolveTask
    public void setUseOrigin(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("the cachefileset task does not support the useOrigin mode, since filesets require to have only one root directory. Please use the the cachepath task instead");
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    @Override // org.apache.ivy.ant.IvyTask
    public void doExecute() throws BuildException {
        prepareAndCheck();
        if (this.setid == null) {
            throw new BuildException("setid is required in ivy cachefileset");
        }
        try {
            List<ArtifactDownloadReport> artifactReports = getArtifactReports();
            if (artifactReports.isEmpty()) {
                EmptyFileSet emptyFileSet = new EmptyFileSet();
                emptyFileSet.setProject(getProject());
                getProject().addReference(this.setid, emptyFileSet);
                return;
            }
            File fileRequireCommonBaseDir = requireCommonBaseDir(artifactReports);
            FileSet fileSet = new FileSet();
            fileSet.setDir(fileRequireCommonBaseDir);
            fileSet.setProject(getProject());
            for (ArtifactDownloadReport artifactDownloadReport : artifactReports) {
                if (artifactDownloadReport.getLocalFile() != null) {
                    fileSet.createInclude().setName(getPath(fileRequireCommonBaseDir, artifactDownloadReport.getLocalFile()));
                }
            }
            getProject().addReference(this.setid, fileSet);
        } catch (Exception e) {
            throw new BuildException("impossible to build ivy cache fileset: " + e, e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    public File requireCommonBaseDir(List<ArtifactDownloadReport> list) throws BuildException {
        File absoluteFile = null;
        for (ArtifactDownloadReport artifactDownloadReport : list) {
            if (artifactDownloadReport.getLocalFile() != null) {
                if (absoluteFile == null) {
                    absoluteFile = artifactDownloadReport.getLocalFile().getParentFile().getAbsoluteFile();
                } else {
                    absoluteFile = getBaseDir(absoluteFile, artifactDownloadReport.getLocalFile());
                    if (absoluteFile == null) {
                        throw new BuildException("Cannot find a common base directory, from resolved artifacts, for generating a cache fileset");
                    }
                }
            }
        }
        if (absoluteFile != null) {
            return absoluteFile;
        }
        throw new BuildException("Cannot find a common base directory, from resolved artifacts, for generating a cache fileset");
    }

    public final String getPath(File file, File file2) {
        String absolutePath = file.getAbsolutePath();
        int length = absolutePath.length();
        if (!absolutePath.endsWith(File.separator)) {
            length++;
        }
        return file2.getAbsolutePath().substring(length);
    }

    public File getBaseDir(File file, File file2) {
        File file3 = null;
        if (file != null && file2 != null) {
            Iterator<File> it = getParents(file).iterator();
            Iterator<File> it2 = getParents(file2.getAbsoluteFile()).iterator();
            while (it.hasNext() && it2.hasNext()) {
                File next = it.next();
                if (!next.equals(it2.next())) {
                    break;
                }
                file3 = next;
            }
        }
        return file3;
    }

    public final LinkedList<File> getParents(File file) {
        LinkedList<File> linkedList = new LinkedList<>();
        while (file != null) {
            linkedList.addFirst(file);
            file = file.getParentFile();
        }
        return linkedList;
    }
}
