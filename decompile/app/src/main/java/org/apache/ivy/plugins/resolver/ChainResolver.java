package org.apache.ivy.plugins.resolver;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.ivy.core.cache.ArtifactOrigin;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.report.ArtifactDownloadReport;
import org.apache.ivy.core.report.DownloadReport;
import org.apache.ivy.core.report.DownloadStatus;
import org.apache.ivy.core.resolve.DownloadOptions;
import org.apache.ivy.core.resolve.ResolveData;
import org.apache.ivy.core.resolve.ResolvedModuleRevision;
import org.apache.ivy.plugins.latest.ArtifactInfo;
import org.apache.ivy.plugins.latest.LatestStrategy;
import org.apache.ivy.plugins.resolver.util.HasLatestStrategy;
import org.apache.ivy.plugins.resolver.util.ResolvedResource;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.StringUtils;

/* loaded from: classes5.dex */
public class ChainResolver extends AbstractResolver {
    public boolean dual;
    public boolean returnFirst = false;
    public List<DependencyResolver> chain = new ArrayList();

    public static class ResolvedModuleRevisionArtifactInfo implements ArtifactInfo {
        public ResolvedModuleRevision rmr;

        public ResolvedModuleRevisionArtifactInfo(ResolvedModuleRevision resolvedModuleRevision) {
            this.rmr = resolvedModuleRevision;
        }

        @Override // org.apache.ivy.plugins.latest.ArtifactInfo
        public String getRevision() {
            return this.rmr.getId().getRevision();
        }

        @Override // org.apache.ivy.plugins.latest.ArtifactInfo
        public long getLastModified() {
            return this.rmr.getPublicationDate().getTime();
        }
    }

    public void add(DependencyResolver dependencyResolver) {
        this.chain.add(dependencyResolver);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008f A[DONT_GENERATE, PHI: r7
  0x008f: PHI (r7v4 org.apache.ivy.core.resolve.ResolvedModuleRevision) = (r7v2 org.apache.ivy.core.resolve.ResolvedModuleRevision), (r7v7 org.apache.ivy.core.resolve.ResolvedModuleRevision) binds: [B:28:0x00b7, B:22:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ResolvedModuleRevision getDependency(DependencyDescriptor dependencyDescriptor, ResolveData resolveData) throws ParseException {
        ResolvedModuleRevision resolvedModuleRevisionFindModuleInCache;
        ResolvedModuleRevision dependency;
        Exception e;
        ResolveData resolveData2 = new ResolveData(resolveData, doValidate(resolveData));
        ArrayList<Exception> arrayList = new ArrayList();
        ResolvedModuleRevision currentResolvedModuleRevision = resolveData2.getCurrentResolvedModuleRevision();
        if (currentResolvedModuleRevision == null) {
            Message.verbose(getName() + ": Checking cache for: " + dependencyDescriptor);
            resolvedModuleRevisionFindModuleInCache = findModuleInCache(dependencyDescriptor, resolveData2, true);
            if (resolvedModuleRevisionFindModuleInCache != null) {
                Message.verbose(getName() + ": module revision found in cache: " + resolvedModuleRevisionFindModuleInCache.getId());
                resolvedModuleRevisionFindModuleInCache = forcedRevision(resolvedModuleRevisionFindModuleInCache);
            }
        } else {
            resolvedModuleRevisionFindModuleInCache = currentResolvedModuleRevision;
        }
        Iterator<DependencyResolver> it = this.chain.iterator();
        while (it.hasNext()) {
            DependencyResolver next = it.next();
            LatestStrategy latestIfRequired = setLatestIfRequired(next, getLatestStrategy());
            try {
                try {
                    resolveData2.setCurrentResolvedModuleRevision(resolvedModuleRevisionFindModuleInCache);
                    dependency = next.getDependency(dependencyDescriptor, resolveData2);
                    if (dependency != resolvedModuleRevisionFindModuleInCache) {
                        try {
                            if (isReturnFirst()) {
                                dependency = forcedRevision(dependency);
                            }
                        } catch (Exception e2) {
                            e = e2;
                            Message.verbose("problem occurred while resolving " + dependencyDescriptor + " with " + next, e);
                            arrayList.add(e);
                            if (latestIfRequired != null) {
                            }
                            resolvedModuleRevisionFindModuleInCache = dependency;
                            checkInterrupted();
                        }
                    }
                } catch (Exception e3) {
                    dependency = resolvedModuleRevisionFindModuleInCache;
                    e = e3;
                }
                resolvedModuleRevisionFindModuleInCache = dependency;
                checkInterrupted();
            } finally {
                if (latestIfRequired != null) {
                    setLatest(next, latestIfRequired);
                }
            }
        }
        if (resolvedModuleRevisionFindModuleInCache != null || arrayList.isEmpty()) {
            return currentResolvedModuleRevision == resolvedModuleRevisionFindModuleInCache ? currentResolvedModuleRevision : resolvedRevision(resolvedModuleRevisionFindModuleInCache);
        }
        if (arrayList.size() == 1) {
            Exception exc = (Exception) arrayList.get(0);
            if (exc instanceof RuntimeException) {
                throw ((RuntimeException) exc);
            }
            if (exc instanceof ParseException) {
                throw ((ParseException) exc);
            }
            throw new RuntimeException(exc.toString(), exc);
        }
        StringBuilder sb = new StringBuilder();
        for (Exception exc2 : arrayList) {
            sb.append("\t");
            sb.append(StringUtils.getErrorMessage(exc2));
            sb.append(org.apache.commons.lang3.StringUtils.f9903LF);
        }
        sb.setLength(sb.length() - 1);
        throw new RuntimeException("several problems occurred while resolving " + dependencyDescriptor + ":\n" + ((Object) sb));
    }

    public final ResolvedModuleRevision resolvedRevision(ResolvedModuleRevision resolvedModuleRevision) {
        return (!isDual() || resolvedModuleRevision == null) ? resolvedModuleRevision : new ResolvedModuleRevision(resolvedModuleRevision.getResolver(), this, resolvedModuleRevision.getDescriptor(), resolvedModuleRevision.getReport(), resolvedModuleRevision.isForce());
    }

    public final ResolvedModuleRevision forcedRevision(ResolvedModuleRevision resolvedModuleRevision) {
        if (resolvedModuleRevision == null) {
            return null;
        }
        return new ResolvedModuleRevision(resolvedModuleRevision.getResolver(), resolvedModuleRevision.getArtifactResolver(), resolvedModuleRevision.getDescriptor(), resolvedModuleRevision.getReport(), true);
    }

    public final LatestStrategy setLatestIfRequired(DependencyResolver dependencyResolver, LatestStrategy latestStrategy) {
        String latestStrategyName = getLatestStrategyName(dependencyResolver);
        if (latestStrategyName == null || "default".equals(latestStrategyName)) {
            return null;
        }
        LatestStrategy latest = getLatest(dependencyResolver);
        setLatest(dependencyResolver, latestStrategy);
        return latest;
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public ResolvedResource findIvyFileRef(DependencyDescriptor dependencyDescriptor, ResolveData resolveData) {
        Iterator<DependencyResolver> it = this.chain.iterator();
        while (it.hasNext()) {
            ResolvedResource resolvedResourceFindIvyFileRef = it.next().findIvyFileRef(dependencyDescriptor, resolveData);
            if (resolvedResourceFindIvyFileRef != null) {
                return resolvedResourceFindIvyFileRef;
            }
        }
        return null;
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public Map<String, String>[] listTokenValues(String[] strArr, Map<String, Object> map) {
        HashSet hashSet = new HashSet();
        Iterator<DependencyResolver> it = this.chain.iterator();
        while (it.hasNext()) {
            hashSet.addAll(Arrays.asList(it.next().listTokenValues(strArr, new HashMap(map))));
        }
        return (Map[]) hashSet.toArray(new Map[hashSet.size()]);
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public void reportFailure() {
        Iterator<DependencyResolver> it = this.chain.iterator();
        while (it.hasNext()) {
            it.next().reportFailure();
        }
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public void reportFailure(Artifact artifact) {
        Iterator<DependencyResolver> it = this.chain.iterator();
        while (it.hasNext()) {
            it.next().reportFailure(artifact);
        }
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public DownloadReport download(Artifact[] artifactArr, DownloadOptions downloadOptions) {
        ArrayList arrayList = new ArrayList(Arrays.asList(artifactArr));
        DownloadReport downloadReport = new DownloadReport();
        for (DependencyResolver dependencyResolver : this.chain) {
            if (arrayList.isEmpty()) {
                break;
            }
            for (ArtifactDownloadReport artifactDownloadReport : dependencyResolver.download((Artifact[]) arrayList.toArray(new Artifact[arrayList.size()]), downloadOptions).getArtifactsReports()) {
                if (artifactDownloadReport.getDownloadStatus() != DownloadStatus.FAILED) {
                    arrayList.remove(artifactDownloadReport.getArtifact());
                    downloadReport.addArtifactReport(artifactDownloadReport);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ArtifactDownloadReport artifactDownloadReport2 = new ArtifactDownloadReport((Artifact) it.next());
            artifactDownloadReport2.setDownloadStatus(DownloadStatus.FAILED);
            downloadReport.addArtifactReport(artifactDownloadReport2);
        }
        return downloadReport;
    }

    public List<DependencyResolver> getResolvers() {
        return this.chain;
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public void publish(Artifact artifact, File file, boolean z) throws IOException {
        getFirstResolver().publish(artifact, file, z);
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public void abortPublishTransaction() throws IOException {
        getFirstResolver().abortPublishTransaction();
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public void beginPublishTransaction(ModuleRevisionId moduleRevisionId, boolean z) throws IOException {
        getFirstResolver().beginPublishTransaction(moduleRevisionId, z);
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public void commitPublishTransaction() throws IOException {
        getFirstResolver().commitPublishTransaction();
    }

    public final DependencyResolver getFirstResolver() {
        if (this.chain.isEmpty()) {
            throw new IllegalStateException("invalid chain resolver with no sub resolver");
        }
        return this.chain.get(0);
    }

    public boolean isReturnFirst() {
        return this.returnFirst;
    }

    public void setReturnFirst(boolean z) {
        this.returnFirst = z;
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public void dumpSettings() {
        Message.verbose("\t" + getName() + " [chain] " + this.chain);
        StringBuilder sb = new StringBuilder();
        sb.append("\t\treturn first: ");
        sb.append(isReturnFirst());
        Message.debug(sb.toString());
        Message.debug("\t\tdual: " + isDual());
        Iterator<DependencyResolver> it = this.chain.iterator();
        while (it.hasNext()) {
            Message.debug("\t\t-> " + it.next().getName());
        }
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public boolean exists(Artifact artifact) {
        Iterator<DependencyResolver> it = this.chain.iterator();
        while (it.hasNext()) {
            if (it.next().exists(artifact)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public ArtifactOrigin locate(Artifact artifact) {
        Iterator<DependencyResolver> it = this.chain.iterator();
        while (it.hasNext()) {
            ArtifactOrigin artifactOriginLocate = it.next().locate(artifact);
            if (!ArtifactOrigin.isUnknown(artifactOriginLocate)) {
                return artifactOriginLocate;
            }
        }
        return ArtifactOrigin.unknown(artifact);
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public ArtifactDownloadReport download(ArtifactOrigin artifactOrigin, DownloadOptions downloadOptions) {
        Iterator<DependencyResolver> it = this.chain.iterator();
        while (it.hasNext()) {
            ArtifactDownloadReport artifactDownloadReportDownload = it.next().download(artifactOrigin, downloadOptions);
            if (artifactDownloadReportDownload.getDownloadStatus() != DownloadStatus.FAILED) {
                return artifactDownloadReportDownload;
            }
        }
        ArtifactDownloadReport artifactDownloadReport = new ArtifactDownloadReport(artifactOrigin.getArtifact());
        artifactDownloadReport.setDownloadStatus(DownloadStatus.FAILED);
        return artifactDownloadReport;
    }

    public static void setLatest(DependencyResolver dependencyResolver, LatestStrategy latestStrategy) {
        if (dependencyResolver instanceof HasLatestStrategy) {
            ((HasLatestStrategy) dependencyResolver).setLatestStrategy(latestStrategy);
        }
    }

    public static LatestStrategy getLatest(DependencyResolver dependencyResolver) {
        if (dependencyResolver instanceof HasLatestStrategy) {
            return ((HasLatestStrategy) dependencyResolver).getLatestStrategy();
        }
        return null;
    }

    public static String getLatestStrategyName(DependencyResolver dependencyResolver) {
        if (dependencyResolver instanceof HasLatestStrategy) {
            return ((HasLatestStrategy) dependencyResolver).getLatest();
        }
        return null;
    }

    public void setDual(boolean z) {
        this.dual = z;
    }

    public boolean isDual() {
        return this.dual;
    }
}
