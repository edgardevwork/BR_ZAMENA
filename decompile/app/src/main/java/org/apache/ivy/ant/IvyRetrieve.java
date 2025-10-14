package org.apache.ivy.ant;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.apache.ivy.core.LogOptions;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.retrieve.RetrieveOptions;
import org.apache.ivy.core.retrieve.RetrieveReport;
import org.apache.ivy.util.StringUtils;
import org.apache.ivy.util.filter.Filter;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.FileSet;
import org.apache.tools.ant.types.Mapper;
import org.apache.tools.ant.types.Path;
import org.apache.tools.ant.util.FileNameMapper;

/* loaded from: classes8.dex */
public class IvyRetrieve extends IvyPostResolveTask {
    public static final Collection<String> OVERWRITEMODE_VALUES = Arrays.asList(RetrieveOptions.OVERWRITEMODE_ALWAYS, RetrieveOptions.OVERWRITEMODE_NEVER, RetrieveOptions.OVERWRITEMODE_NEWER, RetrieveOptions.OVERWRITEMODE_DIFFERENT);
    public String pattern;
    public String ivypattern = null;
    public boolean sync = false;
    public boolean symlink = false;
    public boolean symlinkmass = false;
    public String overwriteMode = RetrieveOptions.OVERWRITEMODE_NEWER;
    public String pathId = null;
    public String setId = null;
    public Mapper mapper = null;

    public String getPattern() {
        return this.pattern;
    }

    public void setPattern(String str) {
        this.pattern = str;
    }

    public String getPathId() {
        return this.pathId;
    }

    public void setPathId(String str) {
        this.pathId = str;
    }

    public String getSetId() {
        return this.setId;
    }

    public void setSetId(String str) {
        this.setId = str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    @Override // org.apache.ivy.ant.IvyTask
    public void doExecute() throws BuildException {
        FileSet emptyFileSet;
        prepareAndCheck();
        if (!getAllowedLogOptions().contains(getLog())) {
            throw new BuildException("invalid option for 'log': " + getLog() + ". Available options are " + getAllowedLogOptions());
        }
        this.pattern = getProperty(this.pattern, getSettings(), "ivy.retrieve.pattern");
        try {
            Filter<Artifact> artifactFilter = getArtifactFilter();
            RetrieveOptions retrieveOptions = (RetrieveOptions) new RetrieveOptions().setLog(getLog());
            retrieveOptions.setConfs(StringUtils.splitToArray(getConf())).setDestArtifactPattern(this.pattern).setDestIvyPattern(this.ivypattern).setArtifactFilter(artifactFilter).setSync(this.sync).setOverwriteMode(getOverwriteMode()).setUseOrigin(isUseOrigin()).setMakeSymlinks(this.symlink).setResolveId(getResolveId()).setMapper(this.mapper == null ? null : new MapperAdapter(this.mapper));
            boolean z = this.symlinkmass;
            if (z) {
                retrieveOptions.setMakeSymlinksInMass(z);
            }
            RetrieveReport retrieveReportRetrieve = getIvyInstance().retrieve(getResolvedMrid(), retrieveOptions);
            int nbrArtifactsCopied = retrieveReportRetrieve.getNbrArtifactsCopied();
            boolean z2 = nbrArtifactsCopied > 0;
            getProject().setProperty("ivy.nb.targets.copied", String.valueOf(nbrArtifactsCopied));
            getProject().setProperty("ivy.targets.copied", String.valueOf(z2));
            if (getPathId() != null) {
                Path path = new Path(getProject());
                getProject().addReference(getPathId(), path);
                Iterator<File> it = retrieveReportRetrieve.getRetrievedFiles().iterator();
                while (it.hasNext()) {
                    path.createPathElement().setLocation(it.next());
                }
            }
            if (getSetId() != null) {
                Collection<File> retrievedFiles = retrieveReportRetrieve.getRetrievedFiles();
                if (retrievedFiles.isEmpty()) {
                    emptyFileSet = new EmptyFileSet();
                    emptyFileSet.setProject(getProject());
                } else {
                    FileSet fileSet = new FileSet();
                    fileSet.setProject(getProject());
                    fileSet.setDir(retrieveReportRetrieve.getRetrieveRoot());
                    Iterator<File> it2 = retrievedFiles.iterator();
                    while (it2.hasNext()) {
                        fileSet.createInclude().setName(getPath(retrieveReportRetrieve.getRetrieveRoot(), it2.next()));
                    }
                    emptyFileSet = fileSet;
                }
                getProject().addReference(getSetId(), emptyFileSet);
            }
        } catch (Exception e) {
            throw new BuildException("impossible to ivy retrieve: " + e, e);
        }
    }

    public Collection<String> getAllowedLogOptions() {
        return Arrays.asList("default", LogOptions.LOG_DOWNLOAD_ONLY, LogOptions.LOG_QUIET);
    }

    public String getIvypattern() {
        return this.ivypattern;
    }

    public void setIvypattern(String str) {
        this.ivypattern = str;
    }

    public boolean isSync() {
        return this.sync;
    }

    public void setSync(boolean z) {
        this.sync = z;
    }

    public void setSymlink(boolean z) {
        this.symlink = z;
    }

    @Deprecated
    public void setSymlinkmass(boolean z) {
        this.symlinkmass = z;
    }

    public void setOverwriteMode(String str) {
        Collection<String> collection = OVERWRITEMODE_VALUES;
        if (!collection.contains(str)) {
            throw new IllegalArgumentException("invalid overwriteMode value '" + str + "'. Valid values are " + collection);
        }
        this.overwriteMode = str;
    }

    public String getOverwriteMode() {
        return this.overwriteMode;
    }

    public void addMapper(Mapper mapper) {
        if (this.mapper != null) {
            throw new IllegalArgumentException("Cannot define more than one mapper");
        }
        this.mapper = mapper;
    }

    public void add(FileNameMapper fileNameMapper) {
        Mapper mapper = new Mapper(getProject());
        mapper.add(fileNameMapper);
        addMapper(mapper);
    }

    private String getPath(File file, File file2) {
        String absolutePath = file.getAbsolutePath();
        int length = absolutePath.length();
        if (!absolutePath.endsWith(File.separator)) {
            length++;
        }
        return file2.getAbsolutePath().substring(length);
    }
}
