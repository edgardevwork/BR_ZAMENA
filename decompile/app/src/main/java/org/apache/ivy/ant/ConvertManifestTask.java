package org.apache.ivy.ant;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.jar.Manifest;
import org.apache.ivy.osgi.core.BundleInfoAdapter;
import org.apache.ivy.osgi.core.ExecutionEnvironmentProfileProvider;
import org.apache.ivy.osgi.core.ManifestParser;
import org.apache.ivy.osgi.core.OSGiManifestParser;
import org.apache.ivy.plugins.parser.xml.XmlModuleDescriptorWriter;
import org.apache.tools.ant.BuildException;

/* loaded from: classes7.dex */
public class ConvertManifestTask extends IvyTask {
    public ExecutionEnvironmentProfileProvider profileProvider;
    public File manifest = null;
    public File ivyFile = null;

    public void setProfileProvider(ExecutionEnvironmentProfileProvider executionEnvironmentProfileProvider) {
        this.profileProvider = executionEnvironmentProfileProvider;
    }

    public void setManifest(File file) {
        this.manifest = file;
    }

    public void setIvyFile(File file) {
        this.ivyFile = file;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    @Override // org.apache.ivy.ant.IvyTask
    public void doExecute() throws BundleInfoAdapter.ProfileNotFoundException, BuildException {
        if (this.ivyFile == null) {
            throw new BuildException("destination ivy file is required for convertmanifest task");
        }
        if (this.manifest == null) {
            throw new BuildException("source manifest file is required for convertmanifest task");
        }
        if (this.profileProvider == null) {
            try {
                this.profileProvider = new ExecutionEnvironmentProfileProvider();
            } catch (IOException e) {
                throw new BuildException("Enable to load the default environment profiles", e);
            }
        }
        try {
            Manifest manifest = new Manifest(new FileInputStream(this.manifest));
            try {
                try {
                    XmlModuleDescriptorWriter.write(BundleInfoAdapter.toModuleDescriptor(OSGiManifestParser.getInstance(), null, ManifestParser.parseManifest(manifest), manifest, this.profileProvider), this.ivyFile);
                } catch (IOException e2) {
                    throw new BuildException("The ivyFile '" + this.ivyFile + "' could not be written", e2);
                }
            } catch (ParseException e3) {
                throw new BuildException("Incorrect manifest file '" + this.manifest + "'", e3);
            }
        } catch (FileNotFoundException e4) {
            throw new BuildException("the manifest file '" + this.manifest + "' was not found", e4);
        } catch (IOException e5) {
            throw new BuildException("the manifest file '" + this.manifest + "' could not be read", e5);
        }
    }
}
