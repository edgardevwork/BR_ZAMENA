package org.apache.ivy.plugins.resolver;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.cache.ArtifactOrigin;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.DefaultArtifact;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.report.DownloadReport;
import org.apache.ivy.core.resolve.DownloadOptions;
import org.apache.ivy.core.resolve.ResolveData;
import org.apache.ivy.core.resolve.ResolvedModuleRevision;
import org.apache.ivy.core.search.ModuleEntry;
import org.apache.ivy.core.search.OrganisationEntry;
import org.apache.ivy.core.search.RevisionEntry;
import org.apache.ivy.plugins.matcher.PatternMatcher;
import org.apache.ivy.plugins.repository.Repository;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.plugins.resolver.util.ResolvedResource;
import org.apache.ivy.plugins.version.MavenTimedSnapshotVersionMatcher;
import org.apache.ivy.util.ContextualSAXHandler;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.XMLHelper;
import org.jfrog.build.client.Version;
import org.xml.sax.SAXException;
import org.xml.sax.ext.LexicalHandler;

/* loaded from: classes8.dex */
public class IBiblioResolver extends URLResolver {
    public static final String DEFAULT_M2_ROOT = "https://repo1.maven.org/maven2/";

    @Deprecated
    public static final String DEFAULT_PATTERN = "[module]/[type]s/[artifact]-[revision].[ext]";

    @Deprecated
    public static final String DEFAULT_ROOT = "https://www.ibiblio.org/maven/";
    public static final String M2_PATTERN = "[organisation]/[module]/[revision]/[artifact]-[revision](-[classifier]).[ext]";
    public static final String M2_PER_MODULE_PATTERN = "[revision]/[artifact]-[revision](-[classifier]).[ext]";
    public String root = null;
    public String pattern = null;
    public boolean usepoms = true;
    public boolean useMavenMetadata = true;

    public IBiblioResolver() {
        setChangingMatcher(PatternMatcher.REGEXP);
        setChangingPattern(".*-SNAPSHOT");
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractPatternsBasedResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public ResolvedResource findIvyFileRef(DependencyDescriptor dependencyDescriptor, ResolveData resolveData) {
        ResolvedResource resolvedResourceFindSnapshotDescriptor;
        if (!isM2compatible() || !isUsepoms()) {
            return null;
        }
        ModuleRevisionId moduleRevisionIdConvertM2IdForResourceSearch = convertM2IdForResourceSearch(dependencyDescriptor.getDependencyRevisionId());
        MavenTimedSnapshotVersionMatcher.MavenSnapshotRevision mavenSnapshotRevisionComputeIfSnapshot = MavenTimedSnapshotVersionMatcher.computeIfSnapshot(dependencyDescriptor.getDependencyRevisionId().getRevision());
        return (mavenSnapshotRevisionComputeIfSnapshot == null || (resolvedResourceFindSnapshotDescriptor = findSnapshotDescriptor(dependencyDescriptor, resolveData, moduleRevisionIdConvertM2IdForResourceSearch, mavenSnapshotRevisionComputeIfSnapshot)) == null) ? findResourceUsingPatterns(moduleRevisionIdConvertM2IdForResourceSearch, getIvyPatterns(), DefaultArtifact.newPomArtifact(moduleRevisionIdConvertM2IdForResourceSearch, resolveData.getDate()), getRMDParser(dependencyDescriptor, resolveData), resolveData.getDate()) : resolvedResourceFindSnapshotDescriptor;
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractPatternsBasedResolver, org.apache.ivy.plugins.resolver.BasicResolver
    public ResolvedResource findArtifactRef(Artifact artifact, Date date) {
        ResolvedResource resolvedResourceFindSnapshotArtifact;
        ensureConfigured(getSettings());
        ModuleRevisionId moduleRevisionId = artifact.getModuleRevisionId();
        if (isM2compatible()) {
            moduleRevisionId = convertM2IdForResourceSearch(moduleRevisionId);
        }
        ModuleRevisionId moduleRevisionId2 = moduleRevisionId;
        MavenTimedSnapshotVersionMatcher.MavenSnapshotRevision mavenSnapshotRevisionComputeIfSnapshot = MavenTimedSnapshotVersionMatcher.computeIfSnapshot(artifact.getId().getRevision());
        return (mavenSnapshotRevisionComputeIfSnapshot == null || (resolvedResourceFindSnapshotArtifact = findSnapshotArtifact(artifact, date, moduleRevisionId2, mavenSnapshotRevisionComputeIfSnapshot)) == null) ? findResourceUsingPatterns(moduleRevisionId2, getArtifactPatterns(), artifact, getDefaultRMDParser(artifact.getModuleRevisionId().getModuleId()), date) : resolvedResourceFindSnapshotArtifact;
    }

    public final ResolvedResource findSnapshotArtifact(Artifact artifact, Date date, ModuleRevisionId moduleRevisionId, MavenTimedSnapshotVersionMatcher.MavenSnapshotRevision mavenSnapshotRevision) throws IOException {
        String strReplaceFirst;
        if (!isM2compatible()) {
            return null;
        }
        if (mavenSnapshotRevision.isTimestampedSnapshot()) {
            Message.debug(moduleRevisionId + " has been identified as a (Maven) timestamped snapshot revision");
            String str = mavenSnapshotRevision.getBaseRevision() + MavenTimedSnapshotVersionMatcher.SNAPSHOT_SUFFIX;
            strReplaceFirst = getWholePattern().replaceFirst("/\\[revision\\]", "/" + str);
        } else {
            String strFindTimestampedSnapshotVersion = findTimestampedSnapshotVersion(moduleRevisionId);
            if (strFindTimestampedSnapshotVersion == null) {
                return null;
            }
            Message.verbose(moduleRevisionId + " has been identified as a snapshot revision which has a timestamped snapshot revision " + strFindTimestampedSnapshotVersion);
            strReplaceFirst = getWholePattern().replaceFirst("\\-\\[revision\\]", "-" + strFindTimestampedSnapshotVersion);
        }
        return findResourceUsingPattern(moduleRevisionId, strReplaceFirst, artifact, getDefaultRMDParser(artifact.getModuleRevisionId().getModuleId()), date);
    }

    public final ResolvedResource findSnapshotDescriptor(DependencyDescriptor dependencyDescriptor, ResolveData resolveData, ModuleRevisionId moduleRevisionId, MavenTimedSnapshotVersionMatcher.MavenSnapshotRevision mavenSnapshotRevision) throws IOException {
        String strReplaceFirst;
        if (!isM2compatible()) {
            return null;
        }
        if (mavenSnapshotRevision.isTimestampedSnapshot()) {
            Message.debug(moduleRevisionId + " has been identified as a (Maven) timestamped snapshot revision");
            String str = mavenSnapshotRevision.getBaseRevision() + MavenTimedSnapshotVersionMatcher.SNAPSHOT_SUFFIX;
            strReplaceFirst = getWholePattern().replaceFirst("/\\[revision\\]", "/" + str);
        } else {
            String strFindTimestampedSnapshotVersion = findTimestampedSnapshotVersion(moduleRevisionId);
            if (strFindTimestampedSnapshotVersion == null) {
                return null;
            }
            Message.verbose(moduleRevisionId + " has been identified as a snapshot revision which has a timestamped snapshot revision " + strFindTimestampedSnapshotVersion);
            strReplaceFirst = getWholePattern().replaceFirst("\\-\\[revision\\]", "-" + strFindTimestampedSnapshotVersion);
        }
        return findResourceUsingPattern(moduleRevisionId, strReplaceFirst, DefaultArtifact.newPomArtifact(moduleRevisionId, resolveData.getDate()), getRMDParser(dependencyDescriptor, resolveData), resolveData.getDate());
    }

    public final String findTimestampedSnapshotVersion(ModuleRevisionId moduleRevisionId) throws IOException {
        Resource resource;
        if (!isM2compatible() || !shouldUseMavenMetadata(getWholePattern())) {
            return null;
        }
        try {
            resource = getRepository().getResource(IvyPatternHelper.substitute(this.root + "[organisation]/[module]/[revision]/maven-metadata.xml", moduleRevisionId));
        } catch (IOException e) {
            e = e;
            Message.debug("impossible to access maven metadata file, ignored", e);
            return null;
        } catch (ParserConfigurationException e2) {
            e = e2;
            Message.debug("impossible to access maven metadata file, ignored", e);
            return null;
        } catch (SAXException e3) {
            e = e3;
            Message.debug("impossible to access maven metadata file, ignored", e);
            return null;
        }
        if (!resource.exists()) {
            Message.verbose("\tmaven-metadata not available for: " + moduleRevisionId);
            return null;
        }
        InputStream inputStreamOpenStream = resource.openStream();
        try {
            final StringBuilder sb = new StringBuilder();
            final StringBuilder sb2 = new StringBuilder();
            XMLHelper.parse(inputStreamOpenStream, (URL) null, new ContextualSAXHandler() { // from class: org.apache.ivy.plugins.resolver.IBiblioResolver.1
                @Override // org.apache.ivy.util.ContextualSAXHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
                public void endElement(String str, String str2, String str3) throws SAXException {
                    if ("metadata/versioning/snapshot/timestamp".equals(getContext())) {
                        sb.append(getText());
                    }
                    if ("metadata/versioning/snapshot/buildNumber".equals(getContext())) {
                        sb2.append(getText());
                    }
                    super.endElement(str, str2, str3);
                }
            }, (LexicalHandler) null);
            if (sb.length() <= 0) {
                if (inputStreamOpenStream != null) {
                    inputStreamOpenStream.close();
                }
                return null;
            }
            String str = moduleRevisionId.getRevision().substring(0, r7.length() - 8) + sb.toString() + "-" + sb2.toString();
            if (inputStreamOpenStream != null) {
                inputStreamOpenStream.close();
            }
            return str;
        } catch (Throwable th) {
            if (inputStreamOpenStream != null) {
                try {
                    inputStreamOpenStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractPatternsBasedResolver
    public void setM2compatible(boolean z) {
        super.setM2compatible(z);
        if (z) {
            if (this.root == null) {
                this.root = DEFAULT_M2_ROOT;
            }
            if (this.pattern == null) {
                this.pattern = "[organisation]/[module]/[revision]/[artifact]-[revision](-[classifier]).[ext]";
            }
            updateWholePattern();
        }
    }

    public void ensureConfigured(ResolverSettings resolverSettings) {
        if (resolverSettings != null) {
            String str = this.root;
            if (str == null || this.pattern == null) {
                if (str == null) {
                    String variable = resolverSettings.getVariable("ivy.ibiblio.default.artifact.root");
                    if (variable != null) {
                        this.root = variable;
                    } else {
                        resolverSettings.configureRepositories(true);
                        this.root = resolverSettings.getVariable("ivy.ibiblio.default.artifact.root");
                    }
                }
                if (this.pattern == null) {
                    String variable2 = resolverSettings.getVariable("ivy.ibiblio.default.artifact.pattern");
                    if (variable2 != null) {
                        this.pattern = variable2;
                    } else {
                        resolverSettings.configureRepositories(false);
                        this.pattern = resolverSettings.getVariable("ivy.ibiblio.default.artifact.pattern");
                    }
                }
                updateWholePattern();
            }
        }
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractPatternsBasedResolver
    public String getModuleDescriptorExtension() {
        return "pom";
    }

    public final String getWholePattern() {
        return this.root + this.pattern;
    }

    public String getPattern() {
        return this.pattern;
    }

    public void setPattern(String str) {
        if (str == null) {
            throw new NullPointerException("pattern must not be null");
        }
        this.pattern = str;
        ensureConfigured(getSettings());
        updateWholePattern();
    }

    public String getRoot() {
        return this.root;
    }

    public void setRoot(String str) {
        if (str == null) {
            throw new NullPointerException("root must not be null");
        }
        if (!str.endsWith("/")) {
            this.root = str + "/";
        } else {
            this.root = str;
        }
        ensureConfigured(getSettings());
        updateWholePattern();
    }

    public final void updateWholePattern() {
        if (isM2compatible() && isUsepoms()) {
            setIvyPatterns(Collections.singletonList(getWholePattern()));
        } else {
            setIvyPatterns(Collections.emptyList());
        }
        setArtifactPatterns(Collections.singletonList(getWholePattern()));
    }

    public void publish(Artifact artifact, File file) {
        throw new UnsupportedOperationException("publish not supported by IBiblioResolver");
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver, org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public String[] listTokenValues(String str, Map<String, String> map) {
        if (IvyPatternHelper.ORGANISATION_KEY.equals(str)) {
            return new String[0];
        }
        if ("module".equals(str) && !isM2compatible()) {
            return new String[0];
        }
        ensureConfigured(getSettings());
        return super.listTokenValues(str, map);
    }

    @Override // org.apache.ivy.plugins.resolver.RepositoryResolver, org.apache.ivy.plugins.resolver.AbstractPatternsBasedResolver
    public String[] listTokenValues(String str, String str2) throws Throwable {
        if (IvyPatternHelper.ORGANISATION_KEY.equals(str2)) {
            return new String[0];
        }
        if ("module".equals(str2) && !isM2compatible()) {
            return new String[0];
        }
        ensureConfigured(getSettings());
        if (IvyPatternHelper.REVISION_KEY.equals(str2) && shouldUseMavenMetadata(getWholePattern())) {
            String strSubstituteTokens = IvyPatternHelper.substituteTokens("[revision]/[artifact]-[revision](-[classifier]).[ext]", Collections.singletonMap(IvyPatternHelper.EXT_KEY, "pom"));
            if (str.endsWith(strSubstituteTokens)) {
                List<String> listListRevisionsWithMavenMetadata = listRevisionsWithMavenMetadata(getRepository(), str.substring(0, str.lastIndexOf(strSubstituteTokens)) + "maven-metadata.xml");
                if (listListRevisionsWithMavenMetadata != null) {
                    return (String[]) listListRevisionsWithMavenMetadata.toArray(new String[listListRevisionsWithMavenMetadata.size()]);
                }
            } else {
                return new String[0];
            }
        }
        return super.listTokenValues(str, str2);
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver, org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public OrganisationEntry[] listOrganisations() {
        return new OrganisationEntry[0];
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver, org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public ModuleEntry[] listModules(OrganisationEntry organisationEntry) {
        if (isM2compatible()) {
            ensureConfigured(getSettings());
            return super.listModules(organisationEntry);
        }
        return new ModuleEntry[0];
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver, org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public RevisionEntry[] listRevisions(ModuleEntry moduleEntry) {
        ensureConfigured(getSettings());
        return super.listRevisions(moduleEntry);
    }

    @Override // org.apache.ivy.plugins.resolver.RepositoryResolver
    public ResolvedResource[] listResources(Repository repository, ModuleRevisionId moduleRevisionId, String str, Artifact artifact) {
        String strFindTimestampedSnapshotVersion;
        if (shouldUseMavenMetadata(str)) {
            List<String> listListRevisionsWithMavenMetadata = listRevisionsWithMavenMetadata(repository, moduleRevisionId.getModuleId().getAttributes());
            if (listListRevisionsWithMavenMetadata != null) {
                Message.debug("\tfound revs: " + listListRevisionsWithMavenMetadata);
                ArrayList arrayList = new ArrayList();
                for (String str2 : listListRevisionsWithMavenMetadata) {
                    ModuleRevisionId moduleRevisionIdNewInstance = ModuleRevisionId.newInstance(moduleRevisionId, str2);
                    try {
                        Resource resource = repository.getResource(IvyPatternHelper.substitute((!str2.endsWith(Version.SNAPSHOT_SUFFIX) || (strFindTimestampedSnapshotVersion = findTimestampedSnapshotVersion(moduleRevisionIdNewInstance)) == null) ? str : str.replaceFirst("\\-\\[revision\\]", "-" + strFindTimestampedSnapshotVersion), moduleRevisionIdNewInstance, artifact));
                        if (resource != null) {
                            arrayList.add(new ResolvedResource(resource, str2));
                        }
                    } catch (IOException e) {
                        Message.warn("impossible to get resource from name listed by maven-metadata.xml:" + arrayList, e);
                    }
                }
                return (ResolvedResource[]) arrayList.toArray(new ResolvedResource[arrayList.size()]);
            }
            return super.listResources(repository, moduleRevisionId, str, artifact);
        }
        return super.listResources(repository, moduleRevisionId, str, artifact);
    }

    public final List<String> listRevisionsWithMavenMetadata(Repository repository, Map<String, String> map) {
        return listRevisionsWithMavenMetadata(repository, IvyPatternHelper.substituteTokens(this.root + "[organisation]/[module]/maven-metadata.xml", map));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<String> listRevisionsWithMavenMetadata(Repository repository, String str) throws Throwable {
        InputStream inputStreamOpenStream;
        final ArrayList arrayList;
        InputStream inputStream = null;
        try {
            try {
                Resource resource = repository.getResource(str);
                if (resource.exists()) {
                    Message.verbose("\tlisting revisions from maven-metadata: " + resource);
                    arrayList = new ArrayList();
                    inputStreamOpenStream = resource.openStream();
                    try {
                        XMLHelper.parse(inputStreamOpenStream, (URL) null, new ContextualSAXHandler() { // from class: org.apache.ivy.plugins.resolver.IBiblioResolver.2
                            @Override // org.apache.ivy.util.ContextualSAXHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
                            public void endElement(String str2, String str3, String str4) throws SAXException {
                                if ("metadata/versioning/versions/version".equals(getContext())) {
                                    arrayList.add(getText().trim());
                                }
                                super.endElement(str2, str3, str4);
                            }
                        }, (LexicalHandler) null);
                        inputStream = inputStreamOpenStream;
                    } catch (IOException e) {
                        e = e;
                        Message.verbose("impossible to access maven metadata file, ignored", e);
                        if (inputStreamOpenStream == null) {
                            return null;
                        }
                        try {
                            inputStreamOpenStream.close();
                            return null;
                        } catch (IOException unused) {
                            return null;
                        }
                    } catch (ParserConfigurationException e2) {
                        e = e2;
                        Message.verbose("impossible to parse maven metadata file, ignored", e);
                        if (inputStreamOpenStream == null) {
                            return null;
                        }
                        inputStreamOpenStream.close();
                        return null;
                    } catch (SAXException e3) {
                        e = e3;
                        Message.verbose("impossible to parse maven metadata file, ignored", e);
                        if (inputStreamOpenStream == null) {
                        }
                        inputStreamOpenStream.close();
                        return null;
                    }
                } else {
                    Message.verbose("\tmaven-metadata not available: " + resource);
                    arrayList = null;
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                return arrayList;
            } catch (IOException e4) {
                e = e4;
                inputStreamOpenStream = null;
            } catch (ParserConfigurationException e5) {
                e = e5;
                inputStreamOpenStream = null;
                Message.verbose("impossible to parse maven metadata file, ignored", e);
                if (inputStreamOpenStream == null) {
                }
                inputStreamOpenStream.close();
                return null;
            } catch (SAXException e6) {
                e = e6;
                inputStreamOpenStream = null;
                Message.verbose("impossible to parse maven metadata file, ignored", e);
                if (inputStreamOpenStream == null) {
                }
                inputStreamOpenStream.close();
                return null;
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = repository;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    @Override // org.apache.ivy.plugins.resolver.RepositoryResolver, org.apache.ivy.plugins.resolver.AbstractPatternsBasedResolver
    public void findTokenValues(Collection<String> collection, List<String> list, Map<String, String> map, String str) {
        List<String> listListRevisionsWithMavenMetadata;
        if (IvyPatternHelper.REVISION_KEY.equals(str) && shouldUseMavenMetadata(getWholePattern()) && (listListRevisionsWithMavenMetadata = listRevisionsWithMavenMetadata(getRepository(), map)) != null) {
            collection.addAll(filterNames(listListRevisionsWithMavenMetadata));
        } else {
            super.findTokenValues(collection, list, map, str);
        }
    }

    public final boolean shouldUseMavenMetadata(String str) {
        return isUseMavenMetadata() && isM2compatible() && str.endsWith("[organisation]/[module]/[revision]/[artifact]-[revision](-[classifier]).[ext]");
    }

    @Override // org.apache.ivy.plugins.resolver.URLResolver, org.apache.ivy.plugins.resolver.RepositoryResolver, org.apache.ivy.plugins.resolver.AbstractResolver
    public String getTypeName() {
        return "ibiblio";
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public ResolvedModuleRevision getDependency(DependencyDescriptor dependencyDescriptor, ResolveData resolveData) throws ParseException {
        ensureConfigured(resolveData.getSettings());
        return super.getDependency(dependencyDescriptor, resolveData);
    }

    @Override // org.apache.ivy.plugins.resolver.RepositoryResolver, org.apache.ivy.plugins.resolver.BasicResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public DownloadReport download(Artifact[] artifactArr, DownloadOptions downloadOptions) {
        ensureConfigured(getSettings());
        return super.download(artifactArr, downloadOptions);
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver, org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public boolean exists(Artifact artifact) {
        ensureConfigured(getSettings());
        return super.exists(artifact);
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver, org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public ArtifactOrigin locate(Artifact artifact) {
        ensureConfigured(getSettings());
        return super.locate(artifact);
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractPatternsBasedResolver
    public List<String> getArtifactPatterns() {
        ensureConfigured(getSettings());
        return super.getArtifactPatterns();
    }

    public boolean isUsepoms() {
        return this.usepoms;
    }

    public void setUsepoms(boolean z) {
        this.usepoms = z;
        updateWholePattern();
    }

    public boolean isUseMavenMetadata() {
        return this.useMavenMetadata;
    }

    public void setUseMavenMetadata(boolean z) {
        this.useMavenMetadata = z;
    }

    @Override // org.apache.ivy.plugins.resolver.RepositoryResolver, org.apache.ivy.plugins.resolver.AbstractPatternsBasedResolver, org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public void dumpSettings() {
        ensureConfigured(getSettings());
        super.dumpSettings();
        Message.debug("\t\troot: " + getRoot());
        Message.debug("\t\tpattern: " + getPattern());
        Message.debug("\t\tusepoms: " + this.usepoms);
        Message.debug("\t\tuseMavenMetadata: " + this.useMavenMetadata);
    }
}
