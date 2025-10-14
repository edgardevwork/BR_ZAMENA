package org.apache.ivy.ant;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.File;
import java.net.MalformedURLException;
import java.text.ParseException;
import org.apache.ivy.plugins.parser.p064m2.PomModuleDescriptorParser;
import org.apache.ivy.plugins.repository.url.URLResource;
import org.apache.tools.ant.BuildException;

/* loaded from: classes7.dex */
public class IvyConvertPom extends IvyTask {
    public File pomFile = null;
    public File ivyFile = null;

    public File getPomFile() {
        return this.pomFile;
    }

    public void setPomFile(File file) {
        this.pomFile = file;
    }

    public File getIvyFile() {
        return this.ivyFile;
    }

    public void setIvyFile(File file) {
        this.ivyFile = file;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    @Override // org.apache.ivy.ant.IvyTask
    public void doExecute() throws BuildException {
        try {
            if (this.pomFile == null) {
                throw new BuildException("source pom file is required for convertpom task");
            }
            if (this.ivyFile == null) {
                throw new BuildException("destination ivy file is required for convertpom task");
            }
            PomModuleDescriptorParser.getInstance().toIvyFile(FirebasePerfUrlConnection.openStream(this.pomFile.toURI().toURL()), new URLResource(this.pomFile.toURI().toURL()), getIvyFile(), PomModuleDescriptorParser.getInstance().parseDescriptor(getSettings(), this.pomFile.toURI().toURL(), false));
        } catch (MalformedURLException e) {
            throw new BuildException("unable to convert given pom file to url: " + this.pomFile + ": " + e, e);
        } catch (ParseException e2) {
            log(e2.getMessage(), 0);
            throw new BuildException("syntax errors in pom file " + this.pomFile + ": " + e2, e2);
        } catch (Exception e3) {
            throw new BuildException("impossible convert given pom file to ivy file: " + e3 + " from=" + this.pomFile + " to=" + this.ivyFile, e3);
        }
    }
}
