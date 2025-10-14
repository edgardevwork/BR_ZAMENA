package org.apache.ivy.plugins.resolver.packager;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.plugins.resolver.util.ResolvedResource;
import org.apache.ivy.util.CopyProgressListener;
import org.apache.ivy.util.FileUtil;
import org.apache.ivy.util.Message;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.DefaultLogger;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;

/* loaded from: classes6.dex */
public class PackagerCacheEntry {
    public boolean built;
    public final File dir;

    /* renamed from: mr */
    public final ModuleRevisionId f10001mr;
    public final boolean preserve;
    public final boolean quiet;
    public final File resourceCache;
    public final String resourceURL;
    public final boolean restricted;
    public final boolean validate;
    public final boolean verbose;

    public PackagerCacheEntry(ModuleRevisionId moduleRevisionId, File file, File file2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f10001mr = moduleRevisionId;
        this.dir = getSubdir(file, moduleRevisionId);
        this.resourceCache = file2;
        this.resourceURL = str;
        this.validate = z;
        this.preserve = z2;
        this.restricted = z3;
        this.verbose = z4;
        this.quiet = z5;
    }

    public synchronized void build(Resource resource, Map<String, String> map) throws IOException {
        int i;
        try {
            if (this.built) {
                throw new IllegalStateException("build in directory `" + this.dir + "' already completed");
            }
            if (this.dir.exists() && !cleanup()) {
                throw new IOException("can't remove directory `" + this.dir + "'");
            }
            if (!this.dir.mkdirs()) {
                throw new IOException("can't create directory `" + this.dir + "'");
            }
            saveFile("packager.xml", resource.openStream());
            saveFile("packager.xsl");
            saveFile("packager-1.0.xsd");
            saveFile("build.xml");
            Project project = new Project();
            project.init();
            project.setUserProperty("ant.file", new File(this.dir, "build.xml").getAbsolutePath());
            ProjectHelper.configureProject(project, new File(this.dir, "build.xml"));
            project.setBaseDir(this.dir);
            DefaultLogger defaultLogger = new DefaultLogger();
            if (this.verbose) {
                i = 3;
            } else {
                i = this.quiet ? 1 : 2;
            }
            defaultLogger.setMessageOutputLevel(i);
            defaultLogger.setOutputPrintStream(System.out);
            defaultLogger.setErrorPrintStream(System.err);
            project.addBuildListener(defaultLogger);
            project.setUserProperty("ivy.packager.organisation", "" + this.f10001mr.getModuleId().getOrganisation());
            project.setUserProperty("ivy.packager.module", "" + this.f10001mr.getModuleId().getName());
            project.setUserProperty("ivy.packager.revision", "" + this.f10001mr.getRevision());
            project.setUserProperty("ivy.packager.branch", "" + this.f10001mr.getBranch());
            if (this.resourceCache != null) {
                project.setUserProperty("ivy.packager.resourceCache", "" + this.resourceCache.getCanonicalPath());
            }
            if (this.resourceURL != null) {
                project.setUserProperty("ivy.packager.resourceURL", "" + getResourceURL());
            }
            if (this.validate) {
                project.setUserProperty("ivy.packager.validate", "true");
            }
            project.setUserProperty("ivy.packager.restricted", "" + this.restricted);
            project.setUserProperty("ivy.packager.quiet", String.valueOf(this.quiet));
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    project.setUserProperty(entry.getKey(), entry.getValue());
                }
            }
            Message.verbose("performing packager resolver build in " + this.dir);
            try {
                project.executeTarget("build");
                this.built = true;
            } catch (BuildException e) {
                Message.verbose("packager resolver build failed: " + e);
                throw e;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean isBuilt() {
        return this.built;
    }

    public ResolvedResource getBuiltArtifact(Artifact artifact) {
        if (!this.built) {
            throw new IllegalStateException("build in directory `" + this.dir + "' has not yet successfully completed");
        }
        return new ResolvedResource(new BuiltFileResource(this.dir, artifact), this.f10001mr.getRevision());
    }

    public synchronized boolean cleanup() {
        this.built = false;
        return FileUtil.forceDelete(this.dir);
    }

    public void saveFile(String str, InputStream inputStream) throws IOException {
        FileUtil.copy(inputStream, new File(this.dir, str), (CopyProgressListener) null);
    }

    public void saveFile(String str) throws IOException {
        InputStream resourceAsStream = getClass().getResourceAsStream(str);
        if (resourceAsStream == null) {
            throw new IOException("can't find resource `" + str + "'");
        }
        saveFile(str, resourceAsStream);
    }

    public void finalize() throws Throwable {
        try {
            if (!this.preserve) {
                cleanup();
            }
        } finally {
            super.finalize();
        }
    }

    public final String getResourceURL() {
        String strSubstitute = IvyPatternHelper.substitute(this.resourceURL, this.f10001mr.getOrganisation(), this.f10001mr.getName(), this.f10001mr.getRevision(), null, null, null, null, this.f10001mr.getQualifiedExtraAttributes(), null);
        int iLastIndexOf = strSubstitute.lastIndexOf(47);
        return iLastIndexOf != -1 ? strSubstitute.substring(0, iLastIndexOf + 1) : strSubstitute;
    }

    public static File getSubdir(File file, ModuleRevisionId moduleRevisionId) {
        StringBuilder sb = new StringBuilder();
        sb.append(moduleRevisionId.getOrganisation());
        char c = File.separatorChar;
        sb.append(c);
        sb.append(moduleRevisionId.getName());
        sb.append(c);
        sb.append(moduleRevisionId.getRevision());
        return new File(file, sb.toString());
    }
}
