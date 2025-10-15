package org.apache.ivy.ant;

import java.io.File;
import java.util.List;
import org.apache.ivy.core.report.ArtifactDownloadReport;
import org.apache.ivy.osgi.core.ManifestParser;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.Path;

/* loaded from: classes5.dex */
public class IvyCachePath extends IvyCacheTask {

    /* renamed from: id */
    public String f9951id;
    public boolean osgi = false;
    public String pathid;

    public String getPathid() {
        return this.pathid;
    }

    public void setPathid(String str) {
        this.pathid = str;
    }

    public void setOsgi(boolean z) {
        this.osgi = z;
    }

    @Deprecated
    public void setId(String str) {
        this.f9951id = str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    @Override // org.apache.ivy.ant.IvyTask
    public void doExecute() throws BuildException {
        prepareAndCheck();
        if (this.pathid == null) {
            String str = this.f9951id;
            if (str == null) {
                throw new BuildException("pathid is required in ivy classpath");
            }
            this.pathid = str;
            log("ID IS DEPRECATED, PLEASE USE PATHID INSTEAD", 1);
        }
        try {
            Path path = new Path(getProject());
            getProject().addReference(this.pathid, path);
            for (ArtifactDownloadReport artifactDownloadReport : getArtifactReports()) {
                File localFile = artifactDownloadReport.getLocalFile();
                if (artifactDownloadReport.getUnpackedLocalFile() != null) {
                    localFile = artifactDownloadReport.getUnpackedLocalFile();
                }
                addToPath(path, localFile);
            }
        } catch (Exception e) {
            throw new BuildException("impossible to build ivy path: " + e, e);
        }
    }

    public void addToPath(Path path, File file) throws Exception {
        if (!this.osgi || !file.isDirectory()) {
            path.createPathElement().setLocation(file);
            return;
        }
        File file2 = new File(file, "META-INF/MANIFEST.MF");
        if (!file2.exists()) {
            path.createPathElement().setLocation(file);
            return;
        }
        List<String> classpath = ManifestParser.parseManifest(file2).getClasspath();
        if (classpath == null) {
            path.createPathElement().setLocation(file);
            return;
        }
        for (String str : classpath) {
            if (str.equals(".")) {
                path.createPathElement().setLocation(file);
            } else {
                path.createPathElement().setLocation(new File(file, str));
            }
        }
    }
}
