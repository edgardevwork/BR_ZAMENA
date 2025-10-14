package org.apache.ivy.ant;

import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.ivy.Ivy;
import org.apache.ivy.util.Message;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.DirectoryScanner;
import org.apache.tools.ant.types.FileSet;

/* loaded from: classes7.dex */
public class IvyCheck extends IvyTask {
    public File file = null;
    public final List<FileSet> filesets = new ArrayList();
    public String resolvername;

    public File getFile() {
        return this.file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void addFileset(FileSet fileSet) {
        this.filesets.add(fileSet);
    }

    public String getResolvername() {
        return this.resolvername;
    }

    public void setResolvername(String str) {
        this.resolvername = str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    @Override // org.apache.ivy.ant.IvyTask
    public void doExecute() throws BuildException {
        try {
            Ivy ivyInstance = getIvyInstance();
            File file = this.file;
            if (file != null && ivyInstance.check(file.toURI().toURL(), this.resolvername)) {
                Message.verbose("checked " + this.file + ": OK");
            }
            for (FileSet fileSet : this.filesets) {
                DirectoryScanner directoryScanner = fileSet.getDirectoryScanner(getProject());
                File dir = fileSet.getDir(getProject());
                for (String str : directoryScanner.getIncludedFiles()) {
                    File file2 = new File(dir, str);
                    if (ivyInstance.check(file2.toURI().toURL(), this.resolvername)) {
                        Message.verbose("checked " + file2 + ": OK");
                    }
                }
            }
        } catch (MalformedURLException e) {
            throw new BuildException("impossible to convert a file to an url! " + e, e);
        }
    }
}
