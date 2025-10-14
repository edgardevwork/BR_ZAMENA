package org.apache.ivy;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.ivy.core.deliver.DeliverOptions;
import org.apache.ivy.core.deliver.PublishingDependencyRevisionResolver;
import org.apache.ivy.core.install.InstallOptions;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.publish.PublishOptions;
import org.apache.ivy.core.report.ArtifactDownloadReport;
import org.apache.ivy.core.report.ResolveReport;
import org.apache.ivy.core.resolve.DownloadOptions;
import org.apache.ivy.core.resolve.IvyNode;
import org.apache.ivy.core.resolve.ResolveOptions;
import org.apache.ivy.core.resolve.ResolvedModuleRevision;
import org.apache.ivy.core.retrieve.RetrieveOptions;
import org.apache.ivy.core.search.ModuleEntry;
import org.apache.ivy.core.search.OrganisationEntry;
import org.apache.ivy.core.search.RevisionEntry;
import org.apache.ivy.core.sort.SilentNonMatchingVersionReporter;
import org.apache.ivy.core.sort.SortOptions;
import org.apache.ivy.plugins.matcher.PatternMatcher;
import org.apache.ivy.plugins.resolver.DependencyResolver;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.StringUtils;
import org.apache.ivy.util.filter.Filter;
import org.apache.ivy.util.filter.FilterHelper;

/* loaded from: classes7.dex */
public class Ivy14 {
    public Ivy ivy;

    public Ivy14() {
        this(Ivy.newInstance());
    }

    public Ivy14(Ivy ivy) {
        this.ivy = ivy;
    }

    public boolean check(URL url, String str) {
        return this.ivy.check(url, str);
    }

    public void configure(File file) throws IOException, ParseException {
        this.ivy.configure(file);
    }

    public void configure(URL url) throws IOException, ParseException {
        this.ivy.configure(url);
    }

    public void configureDefault() throws IOException, ParseException {
        this.ivy.configureDefault();
    }

    public void deliver(ModuleRevisionId moduleRevisionId, String str, File file, String str2, String str3, Date date, PublishingDependencyRevisionResolver publishingDependencyRevisionResolver, boolean z, boolean z2) throws IOException, ParseException {
        this.ivy.deliver(moduleRevisionId, str, str2, new DeliverOptions(str3, date, publishingDependencyRevisionResolver, z, z2, null));
    }

    public void deliver(ModuleRevisionId moduleRevisionId, String str, File file, String str2, String str3, Date date, PublishingDependencyRevisionResolver publishingDependencyRevisionResolver, boolean z) throws IOException, ParseException {
        deliver(moduleRevisionId, str, file, str2, str3, date, publishingDependencyRevisionResolver, z, true);
    }

    public Map<ArtifactDownloadReport, Set<String>> determineArtifactsToCopy(ModuleId moduleId, String[] strArr, File file, String str, String str2, Filter<Artifact> filter) throws IOException, ParseException {
        return this.ivy.getRetrieveEngine().determineArtifactsToCopy(new ModuleRevisionId(moduleId, Ivy.getWorkingRevision()), str, new RetrieveOptions().setConfs(strArr).setDestIvyPattern(str2).setArtifactFilter(filter));
    }

    public Map<ArtifactDownloadReport, Set<String>> determineArtifactsToCopy(ModuleId moduleId, String[] strArr, File file, String str, String str2) throws IOException, ParseException {
        return this.ivy.getRetrieveEngine().determineArtifactsToCopy(new ModuleRevisionId(moduleId, Ivy.getWorkingRevision()), str, new RetrieveOptions().setConfs(strArr).setDestIvyPattern(str2));
    }

    public ArtifactDownloadReport download(Artifact artifact, File file, boolean z) {
        Message.deprecated("using cache and useOrigin when calling download is not supported anymore");
        return this.ivy.getResolveEngine().download(artifact, new DownloadOptions());
    }

    public ResolvedModuleRevision findModule(ModuleRevisionId moduleRevisionId) {
        ResolveOptions resolveOptions = new ResolveOptions();
        resolveOptions.setValidate(false);
        return this.ivy.getResolveEngine().findModule(moduleRevisionId, resolveOptions);
    }

    public IvyNode[] getDependencies(ModuleDescriptor moduleDescriptor, String[] strArr, File file, Date date, ResolveReport resolveReport, boolean z, boolean z2) {
        return this.ivy.getResolveEngine().getDependencies(moduleDescriptor, newResolveOptions(strArr, null, file, date, z, false, z2, false, true, true, FilterHelper.NO_FILTER), resolveReport);
    }

    public IvyNode[] getDependencies(ModuleDescriptor moduleDescriptor, String[] strArr, File file, Date date, ResolveReport resolveReport, boolean z) {
        return this.ivy.getResolveEngine().getDependencies(moduleDescriptor, newResolveOptions(strArr, null, file, date, z, false, true, false, true, true, FilterHelper.NO_FILTER), resolveReport);
    }

    public IvyNode[] getDependencies(URL url, String[] strArr, File file, Date date, boolean z) throws IOException, ParseException {
        return this.ivy.getResolveEngine().getDependencies(url, newResolveOptions(strArr, null, file, date, z, false, true, false, true, true, FilterHelper.NO_FILTER));
    }

    public String getVariable(String str) {
        return this.ivy.getVariable(str);
    }

    public ResolveReport install(ModuleRevisionId moduleRevisionId, String str, String str2, boolean z, boolean z2, boolean z3, Filter<Artifact> filter, File file, String str3) throws IOException {
        return this.ivy.install(moduleRevisionId, str, str2, new InstallOptions().setTransitive(z).setValidate(z2).setOverwrite(z3).setArtifactFilter(filter).setMatcherName(str3));
    }

    public void interrupt() throws InterruptedException {
        this.ivy.interrupt();
    }

    public void interrupt(Thread thread) throws InterruptedException {
        this.ivy.interrupt(thread);
    }

    public boolean isInterrupted() {
        return this.ivy.isInterrupted();
    }

    public ModuleEntry[] listModuleEntries(OrganisationEntry organisationEntry) {
        return this.ivy.listModuleEntries(organisationEntry);
    }

    public ModuleId[] listModules(ModuleId moduleId, PatternMatcher patternMatcher) {
        return this.ivy.listModules(moduleId, patternMatcher);
    }

    public ModuleRevisionId[] listModules(ModuleRevisionId moduleRevisionId, PatternMatcher patternMatcher) {
        return this.ivy.listModules(moduleRevisionId, patternMatcher);
    }

    public String[] listModules(String str) {
        return this.ivy.listModules(str);
    }

    public OrganisationEntry[] listOrganisationEntries() {
        return this.ivy.listOrganisationEntries();
    }

    public String[] listOrganisations() {
        return this.ivy.listOrganisations();
    }

    public RevisionEntry[] listRevisionEntries(ModuleEntry moduleEntry) {
        return this.ivy.listRevisionEntries(moduleEntry);
    }

    public String[] listRevisions(String str, String str2) {
        return this.ivy.listRevisions(str, str2);
    }

    public String[] listTokenValues(String str, Map<String, Object> map) {
        return this.ivy.listTokenValues(str, map);
    }

    public Collection<Artifact> publish(ModuleDescriptor moduleDescriptor, DependencyResolver dependencyResolver, Collection<String> collection, String str, Artifact[] artifactArr, boolean z, String str2) throws IOException {
        return this.ivy.getPublishEngine().publish(moduleDescriptor, collection, dependencyResolver, new PublishOptions().setSrcIvyPattern(str).setExtraArtifacts(artifactArr).setOverwrite(z).setConfs(StringUtils.splitToArray(str2)));
    }

    public Collection<Artifact> publish(ModuleRevisionId moduleRevisionId, String str, File file, Collection<String> collection, String str2, String str3, String str4, Date date, Artifact[] artifactArr, boolean z, boolean z2, boolean z3, String str5) throws IOException {
        return this.ivy.publish(moduleRevisionId, collection, str2, new PublishOptions().setStatus(str4).setPubdate(date).setPubrevision(str).setSrcIvyPattern(str3).setExtraArtifacts(artifactArr).setUpdate(z3).setValidate(z).setOverwrite(z2).setConfs(StringUtils.splitToArray(str5)));
    }

    public Collection<Artifact> publish(ModuleRevisionId moduleRevisionId, String str, File file, String str2, String str3, String str4, boolean z, boolean z2) throws IOException {
        return this.ivy.publish(moduleRevisionId, Collections.singleton(str2), str3, new PublishOptions().setPubrevision(str).setSrcIvyPattern(str4).setValidate(z).setOverwrite(z2));
    }

    public Collection<Artifact> publish(ModuleRevisionId moduleRevisionId, String str, File file, String str2, String str3, String str4, boolean z) throws IOException {
        return this.ivy.publish(moduleRevisionId, Collections.singleton(str2), str3, new PublishOptions().setPubrevision(str).setSrcIvyPattern(str4).setValidate(z));
    }

    public Collection<Artifact> publish(ModuleRevisionId moduleRevisionId, String str, File file, String str2, String str3, String str4, String str5, Date date, Artifact[] artifactArr, boolean z, boolean z2, boolean z3, String str6) throws IOException {
        return this.ivy.publish(moduleRevisionId, Collections.singleton(str2), str3, new PublishOptions().setStatus(str5).setPubdate(date).setPubrevision(str).setSrcIvyPattern(str4).setExtraArtifacts(artifactArr).setUpdate(z3).setValidate(z).setOverwrite(z2).setConfs(StringUtils.splitToArray(str6)));
    }

    public ResolveReport resolve(File file) throws IOException, ParseException {
        return this.ivy.resolve(file);
    }

    public ResolveReport resolve(ModuleDescriptor moduleDescriptor, String[] strArr, File file, Date date, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Filter<Artifact> filter) throws IOException, ParseException {
        return this.ivy.resolve(moduleDescriptor, newResolveOptions(strArr, null, file, date, z, z2, z3, z4, z5, z6, filter));
    }

    public final ResolveOptions newResolveOptions(String[] strArr, String str, File file, Date date, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Filter<Artifact> filter) {
        if (z4) {
            this.ivy.getSettings().useDeprecatedUseOrigin();
        }
        return new ResolveOptions().setConfs(strArr).setRevision(str).setValidate(z).setUseCacheOnly(z2).setTransitive(z3).setDownload(z5).setOutputReport(z6).setArtifactFilter(filter);
    }

    public ResolveReport resolve(ModuleDescriptor moduleDescriptor, String[] strArr, File file, Date date, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Filter<Artifact> filter) throws IOException, ParseException {
        return this.ivy.resolve(moduleDescriptor, newResolveOptions(strArr, null, file, date, z, z2, z3, false, z4, z5, filter));
    }

    public ResolveReport resolve(ModuleDescriptor moduleDescriptor, String[] strArr, File file, Date date, boolean z, boolean z2, boolean z3, Filter<Artifact> filter) throws IOException, ParseException {
        return this.ivy.resolve(moduleDescriptor, newResolveOptions(strArr, null, file, date, z, z2, z3, false, true, true, filter));
    }

    public ResolveReport resolve(ModuleDescriptor moduleDescriptor, String[] strArr, File file, Date date, boolean z, boolean z2, Filter<Artifact> filter) throws IOException, ParseException {
        return this.ivy.resolve(moduleDescriptor, newResolveOptions(strArr, null, file, date, z, z2, true, false, true, true, filter));
    }

    public ResolveReport resolve(ModuleRevisionId moduleRevisionId, String[] strArr, boolean z, boolean z2, File file, Date date, boolean z3, boolean z4, boolean z5, Filter<Artifact> filter) throws IOException, ParseException {
        return this.ivy.resolve(moduleRevisionId, newResolveOptions(strArr, null, file, date, z3, z4, z, z5, true, true, filter), z2);
    }

    public ResolveReport resolve(ModuleRevisionId moduleRevisionId, String[] strArr, boolean z, boolean z2, File file, Date date, boolean z3, boolean z4, Filter<Artifact> filter) throws IOException, ParseException {
        return this.ivy.resolve(moduleRevisionId, newResolveOptions(strArr, null, file, date, z3, z4, z, false, true, true, filter), z2);
    }

    public ResolveReport resolve(ModuleRevisionId moduleRevisionId, String[] strArr) throws IOException, ParseException {
        Ivy ivy = this.ivy;
        return ivy.resolve(moduleRevisionId, newResolveOptions(strArr, null, ivy.getSettings().getDefaultCache(), null, true, false, true, false, true, true, FilterHelper.NO_FILTER), false);
    }

    public ResolveReport resolve(URL url, String str, String[] strArr, File file, Date date, boolean z, boolean z2, boolean z3, boolean z4, Filter<Artifact> filter) throws IOException, ParseException {
        return this.ivy.resolve(url, newResolveOptions(strArr, str, file, date, z, z2, z3, z4, true, true, filter));
    }

    public ResolveReport resolve(URL url, String str, String[] strArr, File file, Date date, boolean z, boolean z2, boolean z3, Filter<Artifact> filter) throws IOException, ParseException {
        return this.ivy.resolve(url, newResolveOptions(strArr, str, file, date, z, z2, z3, false, true, true, filter));
    }

    public ResolveReport resolve(URL url, String str, String[] strArr, File file, Date date, boolean z, boolean z2, Filter<Artifact> filter) throws IOException, ParseException {
        return this.ivy.resolve(url, newResolveOptions(strArr, str, file, date, z, z2, true, false, true, true, filter));
    }

    public ResolveReport resolve(URL url, String str, String[] strArr, File file, Date date, boolean z, boolean z2) throws IOException, ParseException {
        return this.ivy.resolve(url, newResolveOptions(strArr, str, file, date, z, z2, true, false, true, true, FilterHelper.NO_FILTER));
    }

    public ResolveReport resolve(URL url, String str, String[] strArr, File file, Date date, boolean z) throws IOException, ParseException {
        return this.ivy.resolve(url, newResolveOptions(strArr, str, file, date, z, false, true, false, true, true, FilterHelper.NO_FILTER));
    }

    public ResolveReport resolve(URL url) throws IOException, ParseException {
        return this.ivy.resolve(url);
    }

    public int retrieve(ModuleId moduleId, String[] strArr, File file, String str, String str2, Filter<Artifact> filter, boolean z, boolean z2, boolean z3) {
        try {
            return this.ivy.retrieve(new ModuleRevisionId(moduleId, Ivy.getWorkingRevision()), new RetrieveOptions().setConfs(strArr).setDestArtifactPattern(str).setDestIvyPattern(str2).setArtifactFilter(filter).setSync(z).setUseOrigin(z2).setMakeSymlinks(z3)).getNbrArtifactsCopied();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int retrieve(ModuleId moduleId, String[] strArr, File file, String str, String str2, Filter<Artifact> filter, boolean z, boolean z2) {
        try {
            return this.ivy.retrieve(new ModuleRevisionId(moduleId, Ivy.getWorkingRevision()), new RetrieveOptions().setConfs(strArr).setDestArtifactPattern(str).setDestIvyPattern(str2).setArtifactFilter(filter).setSync(z).setUseOrigin(z2)).getNbrArtifactsCopied();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int retrieve(ModuleId moduleId, String[] strArr, File file, String str, String str2, Filter<Artifact> filter) {
        try {
            return this.ivy.retrieve(new ModuleRevisionId(moduleId, Ivy.getWorkingRevision()), new RetrieveOptions().setConfs(strArr).setDestArtifactPattern(str).setDestIvyPattern(str2).setArtifactFilter(filter)).getNbrArtifactsCopied();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int retrieve(ModuleId moduleId, String[] strArr, File file, String str, String str2) {
        try {
            return this.ivy.retrieve(new ModuleRevisionId(moduleId, Ivy.getWorkingRevision()), new RetrieveOptions().setConfs(strArr).setDestArtifactPattern(str).setDestIvyPattern(str2)).getNbrArtifactsCopied();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int retrieve(ModuleId moduleId, String[] strArr, File file, String str) {
        try {
            return this.ivy.retrieve(new ModuleRevisionId(moduleId, Ivy.getWorkingRevision()), new RetrieveOptions().setConfs(strArr).setDestArtifactPattern(str)).getNbrArtifactsCopied();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void setVariable(String str, String str2) {
        this.ivy.setVariable(str, str2);
    }

    public List<ModuleDescriptor> sortModuleDescriptors(Collection<ModuleDescriptor> collection) {
        return this.ivy.sortModuleDescriptors(collection, new SortOptions().setNonMatchingVersionReporter(new SilentNonMatchingVersionReporter()));
    }

    public List<IvyNode> sortNodes(Collection<IvyNode> collection) {
        return this.ivy.sortNodes(collection, new SortOptions().setNonMatchingVersionReporter(new SilentNonMatchingVersionReporter()));
    }

    public String substitute(String str) {
        return this.ivy.substitute(str);
    }
}
