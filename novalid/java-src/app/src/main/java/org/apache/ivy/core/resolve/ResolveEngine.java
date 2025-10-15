package org.apache.ivy.core.resolve;

import com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventKeys;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import org.apache.ivy.Ivy;
import org.apache.ivy.core.IvyContext;
import org.apache.ivy.core.LogOptions;
import org.apache.ivy.core.cache.ArtifactOrigin;
import org.apache.ivy.core.cache.DefaultResolutionCacheManager;
import org.apache.ivy.core.cache.ResolutionCacheManager;
import org.apache.ivy.core.event.EventManager;
import org.apache.ivy.core.event.download.PrepareDownloadEvent;
import org.apache.ivy.core.event.resolve.EndResolveEvent;
import org.apache.ivy.core.event.resolve.StartResolveEvent;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.Configuration;
import org.apache.ivy.core.module.descriptor.DefaultDependencyDescriptor;
import org.apache.ivy.core.module.descriptor.DefaultModuleDescriptor;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.report.ArtifactDownloadReport;
import org.apache.ivy.core.report.ConfigurationResolveReport;
import org.apache.ivy.core.report.DownloadReport;
import org.apache.ivy.core.report.DownloadStatus;
import org.apache.ivy.core.report.ResolveReport;
import org.apache.ivy.core.resolve.IvyNodeCallers;
import org.apache.ivy.core.resolve.IvyNodeEviction;
import org.apache.ivy.core.sort.SortEngine;
import org.apache.ivy.core.sort.SortOptions;
import org.apache.ivy.plugins.conflict.ConflictManager;
import org.apache.ivy.plugins.parser.ModuleDescriptorParser;
import org.apache.ivy.plugins.parser.ModuleDescriptorParserRegistry;
import org.apache.ivy.plugins.repository.url.URLResource;
import org.apache.ivy.plugins.resolver.DependencyResolver;
import org.apache.ivy.plugins.version.VersionMatcher;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.filter.Filter;

/* loaded from: classes5.dex */
public class ResolveEngine {
    public DependencyResolver dictatorResolver;
    public EventManager eventManager;
    public ResolveEngineSettings settings;
    public SortEngine sortEngine;

    public ResolveEngine(ResolveEngineSettings resolveEngineSettings, EventManager eventManager, SortEngine sortEngine) {
        this.settings = resolveEngineSettings;
        this.eventManager = eventManager;
        this.sortEngine = sortEngine;
    }

    public DependencyResolver getDictatorResolver() {
        return this.dictatorResolver;
    }

    public void setDictatorResolver(DependencyResolver dependencyResolver) {
        this.dictatorResolver = dependencyResolver;
    }

    public ResolveReport resolve(File file) throws IOException, ParseException {
        return resolve(file.toURI().toURL());
    }

    public ResolveReport resolve(URL url) throws IOException, ParseException {
        return resolve(url, new ResolveOptions());
    }

    public ResolveReport resolve(ModuleRevisionId moduleRevisionId, ResolveOptions resolveOptions, boolean z) throws IOException, ParseException {
        DefaultModuleDescriptor defaultModuleDescriptorNewCallerInstance;
        ResolveOptions resolveOptions2 = new ResolveOptions(resolveOptions);
        if (resolveOptions.useSpecialConfs()) {
            ResolvedModuleRevision resolvedModuleRevisionFindModule = findModule(moduleRevisionId, new ResolveOptions(resolveOptions));
            if (resolvedModuleRevisionFindModule == null) {
                Message.verbose("module not found " + moduleRevisionId);
                resolveOptions2.setLog(LogOptions.LOG_DOWNLOAD_ONLY);
                defaultModuleDescriptorNewCallerInstance = DefaultModuleDescriptor.newCallerInstance(moduleRevisionId, new String[]{"default"}, resolveOptions.isTransitive(), z);
            } else {
                defaultModuleDescriptorNewCallerInstance = DefaultModuleDescriptor.newCallerInstance(ModuleRevisionId.newInstance(moduleRevisionId, resolvedModuleRevisionFindModule.getId().getRevision()), resolveOptions.getConfs(resolvedModuleRevisionFindModule.getDescriptor()), resolveOptions.isTransitive(), z);
            }
        } else {
            defaultModuleDescriptorNewCallerInstance = DefaultModuleDescriptor.newCallerInstance(moduleRevisionId, resolveOptions.getConfs(), resolveOptions.isTransitive(), z);
        }
        return resolve(defaultModuleDescriptorNewCallerInstance, resolveOptions2);
    }

    public ResolveReport resolve(URL url, ResolveOptions resolveOptions) throws IOException, ParseException {
        ModuleDescriptorParser parser = ModuleDescriptorParserRegistry.getInstance().getParser(new URLResource(url));
        Message.verbose("using " + parser + " to parse " + url);
        ModuleDescriptor descriptor = parser.parseDescriptor(this.settings, url, resolveOptions.isValidate());
        String revision = resolveOptions.getRevision();
        if (revision == null && descriptor.getResolvedModuleRevisionId().getRevision() == null) {
            revision = Ivy.getWorkingRevision();
        }
        if (revision != null) {
            descriptor.setResolvedModuleRevisionId(ModuleRevisionId.newInstance(descriptor.getModuleRevisionId(), revision));
        }
        return resolve(descriptor, resolveOptions);
    }

    /* JADX WARN: Removed duplicated region for block: B:225:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x02b7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ResolveReport resolve(ModuleDescriptor moduleDescriptor, ResolveOptions resolveOptions) throws Throwable {
        DependencyResolver dependencyResolver;
        IvyContext ivyContext;
        DependencyResolver dependencyResolver2;
        IvyContext ivyContext2;
        IvyContext ivyContext3;
        String[] strArr;
        int i;
        IvyNode ivyNode;
        HashMap map;
        IvyNode[] ivyNodeArr;
        HashMap map2;
        ModuleRevisionId moduleRevisionId;
        ModuleRevisionId moduleRevisionId2;
        String[] strArr2;
        int i2;
        DependencyResolver dictatorResolver = getDictatorResolver();
        IvyContext context = IvyContext.getContext();
        try {
            String[] confs = resolveOptions.getConfs(moduleDescriptor);
            resolveOptions.setConfs(confs);
            if (resolveOptions.getResolveId() == null) {
                resolveOptions.setResolveId(ResolveOptions.getDefaultResolveId(moduleDescriptor));
            }
            this.eventManager.fireIvyEvent(new StartResolveEvent(moduleDescriptor, confs));
            long jCurrentTimeMillis = System.currentTimeMillis();
            if ("default".equals(resolveOptions.getLog())) {
                StringBuilder sb = new StringBuilder();
                sb.append(":: resolving dependencies :: ");
                sb.append(moduleDescriptor.getResolvedModuleRevisionId());
                sb.append(resolveOptions.isTransitive() ? "" : " [not transitive]");
                Message.info(sb.toString());
                Message.info("\tconfs: " + Arrays.asList(confs));
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(":: resolving dependencies :: ");
                sb2.append(moduleDescriptor.getResolvedModuleRevisionId());
                sb2.append(resolveOptions.isTransitive() ? "" : " [not transitive]");
                Message.verbose(sb2.toString());
                Message.verbose("\tconfs: " + Arrays.asList(confs));
            }
            Message.verbose("\tvalidate = " + resolveOptions.isValidate());
            Message.verbose("\trefresh = " + resolveOptions.isRefresh());
            ResolveReport resolveReport = new ResolveReport(moduleDescriptor, resolveOptions.getResolveId());
            context.setResolveData(new ResolveData(this, resolveOptions));
            IvyNode[] dependencies = getDependencies(moduleDescriptor, resolveOptions, resolveReport);
            resolveReport.setDependencies(Arrays.asList(dependencies), resolveOptions.getArtifactFilter());
            if (resolveOptions.getCheckIfChanged()) {
                resolveReport.checkIfChanged();
            }
            ResolutionCacheManager resolutionCacheManager = this.settings.getResolutionCacheManager();
            resolutionCacheManager.saveResolvedModuleDescriptor(moduleDescriptor);
            File resolvedIvyPropertiesInCache = resolutionCacheManager.getResolvedIvyPropertiesInCache(moduleDescriptor.getResolvedModuleRevisionId());
            if (resolutionCacheManager instanceof DefaultResolutionCacheManager) {
                ((DefaultResolutionCacheManager) resolutionCacheManager).assertInsideCache(resolvedIvyPropertiesInCache);
            }
            Properties properties = new Properties();
            if (dependencies.length > 0) {
                try {
                    HashMap map3 = new HashMap();
                    int length = dependencies.length;
                    dependencyResolver2 = dictatorResolver;
                    int i3 = 0;
                    while (i3 < length) {
                        try {
                            IvyNode ivyNode2 = dependencies[i3];
                            if (ivyNode2.getModuleRevision() == null || !ivyNode2.getModuleRevision().isForce()) {
                                ivyContext2 = context;
                                i2 = length;
                            } else {
                                i2 = length;
                                ivyContext2 = context;
                                try {
                                    map3.put(ivyNode2.getModuleId(), ivyNode2.getResolvedId());
                                } catch (RuntimeException e) {
                                    e = e;
                                    dependencyResolver = dependencyResolver2;
                                    ivyContext = ivyContext2;
                                    try {
                                        Message.debug(e);
                                        Message.error(e.getMessage());
                                        Message.sumupProblems();
                                        throw e;
                                    } catch (Throwable th) {
                                        th = th;
                                        ivyContext.setResolveData(null);
                                        setDictatorResolver(dependencyResolver);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    dependencyResolver = dependencyResolver2;
                                    ivyContext = ivyContext2;
                                    ivyContext.setResolveData(null);
                                    setDictatorResolver(dependencyResolver);
                                    throw th;
                                }
                            }
                            i3++;
                            length = i2;
                            context = ivyContext2;
                        } catch (RuntimeException e2) {
                            e = e2;
                            ivyContext2 = context;
                            dependencyResolver = dependencyResolver2;
                            ivyContext = ivyContext2;
                            Message.debug(e);
                            Message.error(e.getMessage());
                            Message.sumupProblems();
                            throw e;
                        } catch (Throwable th3) {
                            th = th3;
                            ivyContext2 = context;
                            dependencyResolver = dependencyResolver2;
                            ivyContext = ivyContext2;
                            ivyContext.setResolveData(null);
                            setDictatorResolver(dependencyResolver);
                            throw th;
                        }
                    }
                    ivyContext3 = context;
                    IvyNode root = dependencies[0].getRoot();
                    HashMap map4 = new HashMap();
                    int length2 = dependencies.length;
                    int i4 = 0;
                    while (i4 < length2) {
                        int i5 = length2;
                        IvyNode ivyNode3 = dependencies[i4];
                        if (ivyNode3.hasProblem() || ivyNode3.getDependencyDescriptor(root) == null) {
                            strArr2 = confs;
                        } else {
                            strArr2 = confs;
                            map4.put(ivyNode3.getModuleId(), ivyNode3);
                        }
                        i4++;
                        length2 = i5;
                        confs = strArr2;
                    }
                    strArr = confs;
                    int length3 = dependencies.length;
                    int i6 = 0;
                    while (i6 < length3) {
                        IvyNode ivyNode4 = dependencies[i6];
                        if (ivyNode4.hasProblem() || ivyNode4.isCompletelyEvicted()) {
                            i = length3;
                        } else {
                            DependencyDescriptor dependencyDescriptor = ivyNode4.getDependencyDescriptor(root);
                            if (dependencyDescriptor == null) {
                                i = length3;
                                IvyNode ivyNode5 = (IvyNode) map4.get(ivyNode4.getModuleId());
                                if (ivyNode5 != null) {
                                    dependencyDescriptor = ivyNode5.getDependencyDescriptor(root);
                                }
                            } else {
                                i = length3;
                            }
                            if (dependencyDescriptor != null) {
                                ModuleRevisionId resolvedId = ivyNode4.getResolvedId();
                                ModuleDescriptor descriptor = ivyNode4.getDescriptor();
                                ivyNode = root;
                                ModuleRevisionId dependencyRevisionId = dependencyDescriptor.getDependencyRevisionId();
                                map = map4;
                                ModuleRevisionId moduleRevisionId3 = (ModuleRevisionId) map3.get(ivyNode4.getModuleId());
                                if (ivyNode4.getModuleRevision() == null || !ivyNode4.getModuleRevision().isForce() || resolvedId.equals(dependencyRevisionId)) {
                                    moduleRevisionId = resolvedId;
                                } else {
                                    moduleRevisionId = resolvedId;
                                    if (!this.settings.getVersionMatcher().isDynamic(dependencyRevisionId)) {
                                        moduleRevisionId2 = dependencyRevisionId;
                                        descriptor = null;
                                    }
                                    if (moduleRevisionId2 != null) {
                                        throw new NullPointerException("getResolvedId() is null for " + ivyNode4.toString());
                                    }
                                    if (dependencyRevisionId == null) {
                                        throw new NullPointerException("getDependencyRevisionId() is null for " + dependencyDescriptor.toString());
                                    }
                                    String revision = moduleRevisionId2.getRevision();
                                    String revision2 = moduleRevisionId3 == null ? revision : moduleRevisionId3.getRevision();
                                    String status = descriptor == null ? "?" : descriptor.getStatus();
                                    ivyNodeArr = dependencies;
                                    map2 = map3;
                                    String str = status;
                                    Message.debug("storing dependency " + moduleRevisionId2 + " in props");
                                    properties.put(dependencyRevisionId.encodeToString(), revision + " " + str + " " + revision2 + " " + moduleRevisionId2.getBranch());
                                }
                                moduleRevisionId2 = moduleRevisionId;
                                if (moduleRevisionId2 != null) {
                                }
                            }
                            i6++;
                            length3 = i;
                            dependencies = ivyNodeArr;
                            root = ivyNode;
                            map4 = map;
                            map3 = map2;
                        }
                        ivyNode = root;
                        map = map4;
                        ivyNodeArr = dependencies;
                        map2 = map3;
                        i6++;
                        length3 = i;
                        dependencies = ivyNodeArr;
                        root = ivyNode;
                        map4 = map;
                        map3 = map2;
                    }
                } catch (RuntimeException e3) {
                    e = e3;
                    dependencyResolver2 = dictatorResolver;
                } catch (Throwable th4) {
                    th = th4;
                    dependencyResolver2 = dictatorResolver;
                }
            } else {
                dependencyResolver2 = dictatorResolver;
                ivyContext3 = context;
                strArr = confs;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(resolvedIvyPropertiesInCache);
            properties.store(fileOutputStream, moduleDescriptor.getResolvedModuleRevisionId() + " resolved revisions");
            fileOutputStream.close();
            Message.verbose("\tresolved ivy file produced in cache");
            resolveReport.setResolveTime(System.currentTimeMillis() - jCurrentTimeMillis);
            if (resolveOptions.isDownload()) {
                Message.verbose(":: downloading artifacts ::");
                DownloadOptions downloadOptions = new DownloadOptions();
                downloadOptions.setLog(resolveOptions.getLog());
                downloadArtifacts(resolveReport, resolveOptions.getArtifactFilter(), downloadOptions);
            }
            if (resolveOptions.isOutputReport()) {
                outputReport(resolveReport, resolutionCacheManager, resolveOptions);
            }
            Message.verbose("\tresolve done (" + resolveReport.getResolveTime() + "ms resolve - " + resolveReport.getDownloadTime() + "ms download)");
            Message.sumupProblems();
            this.eventManager.fireIvyEvent(new EndResolveEvent(moduleDescriptor, strArr, resolveReport));
            ivyContext3.setResolveData(null);
            setDictatorResolver(dependencyResolver2);
            return resolveReport;
        } catch (RuntimeException e4) {
            e = e4;
            dependencyResolver = dictatorResolver;
            ivyContext = context;
        } catch (Throwable th5) {
            th = th5;
            dependencyResolver = dictatorResolver;
            ivyContext = context;
        }
    }

    public void outputReport(ResolveReport resolveReport, ResolutionCacheManager resolutionCacheManager, ResolveOptions resolveOptions) throws IOException {
        if ("default".equals(resolveOptions.getLog())) {
            Message.info(":: resolution report :: resolve " + resolveReport.getResolveTime() + "ms :: artifacts dl " + resolveReport.getDownloadTime() + UpgradeObjectEventKeys.EVENT_TOP_LIST_SERVER_ID_PLAYER_KEY);
        } else {
            Message.verbose(":: resolution report :: resolve " + resolveReport.getResolveTime() + "ms :: artifacts dl " + resolveReport.getDownloadTime() + UpgradeObjectEventKeys.EVENT_TOP_LIST_SERVER_ID_PLAYER_KEY);
        }
        resolveReport.setProblemMessages(Message.getProblems());
        resolveReport.output(this.settings.getReportOutputters(), resolutionCacheManager, resolveOptions);
    }

    public void downloadArtifacts(ResolveReport resolveReport, Filter<Artifact> filter, DownloadOptions downloadOptions) {
        Iterator<IvyNode> it;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.eventManager.fireIvyEvent(new PrepareDownloadEvent((Artifact[]) resolveReport.getArtifacts().toArray(new Artifact[resolveReport.getArtifacts().size()])));
        Iterator<IvyNode> it2 = resolveReport.getDependencies().iterator();
        long size = 0;
        while (it2.hasNext()) {
            IvyNode next = it2.next();
            checkInterrupted();
            if (next.isCompletelyEvicted() || next.hasProblem() || next.getModuleRevision() == null) {
                it = it2;
            } else {
                DependencyResolver artifactResolver = next.getModuleRevision().getArtifactResolver();
                DownloadReport downloadReportDownload = artifactResolver.download(next.getSelectedArtifacts(filter), downloadOptions);
                ArtifactDownloadReport[] artifactsReports = downloadReportDownload.getArtifactsReports();
                int length = artifactsReports.length;
                int i = 0;
                while (i < length) {
                    ArtifactDownloadReport artifactDownloadReport = artifactsReports[i];
                    Iterator<IvyNode> it3 = it2;
                    if (artifactDownloadReport.getDownloadStatus() == DownloadStatus.FAILED) {
                        if (artifactDownloadReport.getArtifact().getExtraAttribute("ivy:merged") != null) {
                            Message.warn("\tmerged artifact not found: " + artifactDownloadReport.getArtifact() + ". It was required in " + artifactDownloadReport.getArtifact().getExtraAttribute("ivy:merged"));
                        } else {
                            Message.warn("\t" + artifactDownloadReport);
                            artifactResolver.reportFailure(artifactDownloadReport.getArtifact());
                        }
                    } else if (artifactDownloadReport.getDownloadStatus() == DownloadStatus.SUCCESSFUL) {
                        size += artifactDownloadReport.getSize();
                    }
                    i++;
                    it2 = it3;
                }
                it = it2;
                for (String str : next.getRootModuleConfigurations()) {
                    if (next.isEvicted(str) || next.isBlacklisted(str)) {
                        resolveReport.getConfigurationReport(str).addDependency(next);
                    } else {
                        resolveReport.getConfigurationReport(str).addDependency(next, downloadReportDownload);
                    }
                }
            }
            it2 = it;
        }
        resolveReport.setDownloadTime(System.currentTimeMillis() - jCurrentTimeMillis);
        resolveReport.setDownloadSize(size);
    }

    public ArtifactDownloadReport download(Artifact artifact, DownloadOptions downloadOptions) {
        return this.settings.getResolver(artifact.getModuleRevisionId()).download(new Artifact[]{artifact}, downloadOptions).getArtifactReport(artifact);
    }

    public ArtifactOrigin locate(Artifact artifact) {
        return this.settings.getResolver(artifact.getModuleRevisionId()).locate(artifact);
    }

    public ArtifactDownloadReport download(ArtifactOrigin artifactOrigin, DownloadOptions downloadOptions) {
        return this.settings.getResolver(artifactOrigin.getArtifact().getModuleRevisionId()).download(artifactOrigin, downloadOptions);
    }

    public IvyNode[] getDependencies(URL url, ResolveOptions resolveOptions) throws IOException, ParseException {
        return getDependencies(ModuleDescriptorParserRegistry.getInstance().parseDescriptor(this.settings, url, resolveOptions.isValidate()), resolveOptions, null);
    }

    public IvyNode[] getDependencies(ModuleDescriptor moduleDescriptor, ResolveOptions resolveOptions, ResolveReport resolveReport) {
        String str;
        int i;
        int i2;
        IvyNode ivyNode;
        ResolveData resolveData;
        ConfigurationResolveReport configurationReport;
        if (moduleDescriptor == null) {
            throw new NullPointerException("module descriptor must not be null");
        }
        String[] confs = resolveOptions.getConfs(moduleDescriptor);
        ArrayList arrayList = new ArrayList();
        for (String str2 : confs) {
            if (str2 == null) {
                throw new NullPointerException("null conf not allowed: confs where: " + Arrays.asList(confs));
            }
            if (moduleDescriptor.getConfiguration(str2) == null) {
                arrayList.add(" '" + str2 + "' ");
            }
        }
        if (!arrayList.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("requested configuration");
            sb.append(arrayList.size() > 1 ? "s" : "");
            sb.append(" not found in ");
            sb.append(moduleDescriptor.getModuleRevisionId());
            sb.append(": ");
            sb.append(arrayList);
            throw new IllegalArgumentException(sb.toString());
        }
        IvyContext ivyContextPushNewCopyContext = IvyContext.pushNewCopyContext();
        try {
            resolveOptions.setConfs(confs);
            Date date = new Date();
            ResolveData resolveData2 = ivyContextPushNewCopyContext.getResolveData();
            if (resolveData2 == null) {
                resolveData2 = new ResolveData(this, resolveOptions);
                ivyContextPushNewCopyContext.setResolveData(resolveData2);
            }
            ResolveData resolveData3 = resolveData2;
            IvyNode ivyNode2 = new IvyNode(resolveData3, moduleDescriptor);
            int length = confs.length;
            int i3 = 0;
            while (i3 < length) {
                String str3 = confs[i3];
                Message.verbose("resolving dependencies for configuration '" + str3 + "'");
                if (resolveReport != null) {
                    configurationReport = resolveReport.getConfigurationReport(str3);
                    if (configurationReport == null) {
                        i = i3;
                        i2 = length;
                        ivyNode = ivyNode2;
                        resolveData = resolveData3;
                        configurationReport = new ConfigurationResolveReport(this, moduleDescriptor, str3, date, resolveOptions);
                        str = str3;
                        resolveReport.addReport(str, configurationReport);
                    } else {
                        str = str3;
                        i = i3;
                        i2 = length;
                        ivyNode = ivyNode2;
                        resolveData = resolveData3;
                    }
                } else {
                    str = str3;
                    i = i3;
                    i2 = length;
                    ivyNode = ivyNode2;
                    resolveData = resolveData3;
                    configurationReport = null;
                }
                resolveData.setReport(configurationReport);
                VisitNode visitNode = new VisitNode(resolveData, ivyNode, null, str, null);
                visitNode.setRequestedConf(str);
                IvyNode ivyNode3 = ivyNode;
                ivyNode3.updateConfsToFetch(Collections.singleton(str));
                boolean z = false;
                while (!z) {
                    try {
                        fetchDependencies(visitNode, str, new HashSet(), false);
                        z = true;
                    } catch (RestartResolveProcess e) {
                        Message.verbose("====================================================");
                        Message.verbose("=           RESTARTING RESOLVE PROCESS");
                        Message.verbose("= " + e.getMessage());
                        Message.verbose("====================================================");
                    }
                }
                Iterator<IvyNode> it = resolveData.getNodes().iterator();
                while (it.hasNext()) {
                    it.next().clean();
                }
                ivyNode2 = ivyNode3;
                resolveData3 = resolveData;
                length = i2;
                i3 = i + 1;
            }
            ResolveData resolveData4 = resolveData3;
            Collection<IvyNode> nodes = resolveData4.getNodes();
            LinkedHashSet linkedHashSet = new LinkedHashSet(nodes.size());
            for (IvyNode ivyNode4 : nodes) {
                if (ivyNode4 != null && !ivyNode4.isRoot() && !ivyNode4.isCompletelyBlacklisted()) {
                    linkedHashSet.add(ivyNode4);
                }
            }
            List<IvyNode> listSortNodes = this.sortEngine.sortNodes(linkedHashSet, SortOptions.SILENT);
            Collections.reverse(listSortNodes);
            handleTransitiveEviction(moduleDescriptor, confs, resolveData4, listSortNodes);
            IvyNode[] ivyNodeArr = (IvyNode[]) linkedHashSet.toArray(new IvyNode[linkedHashSet.size()]);
            IvyContext.popContext();
            return ivyNodeArr;
        } catch (Throwable th) {
            IvyContext.popContext();
            throw th;
        }
    }

    public final void handleTransitiveEviction(ModuleDescriptor moduleDescriptor, String[] strArr, ResolveData resolveData, List<IvyNode> list) {
        for (IvyNode ivyNode : list) {
            if (!ivyNode.isCompletelyEvicted()) {
                for (String str : strArr) {
                    IvyNodeCallers.Caller[] callers = ivyNode.getCallers(str);
                    if (this.settings.debugConflictResolution()) {
                        Message.debug("checking if " + ivyNode.getId() + " is transitively evicted in " + str);
                    }
                    boolean z = callers.length > 0;
                    for (IvyNodeCallers.Caller caller : callers) {
                        if (!caller.getModuleRevisionId().equals(moduleDescriptor.getModuleRevisionId())) {
                            IvyNode node = resolveData.getNode(caller.getModuleRevisionId());
                            if (node == null) {
                                Message.warn("ivy internal error: no node found for " + caller.getModuleRevisionId() + ": looked in " + resolveData.getNodeIds() + " and root module id was " + moduleDescriptor.getModuleRevisionId());
                            } else if (node.isEvicted(str)) {
                                if (this.settings.debugConflictResolution()) {
                                    Message.debug("caller " + node.getId() + " of " + ivyNode.getId() + " is evicted");
                                }
                            }
                        }
                        z = false;
                        break;
                    }
                    if (z) {
                        Message.verbose("all callers are evicted for " + ivyNode + ": evicting too");
                        ivyNode.markEvicted(str, null, null, null);
                    } else if (this.settings.debugConflictResolution()) {
                        Message.debug(ivyNode.getId() + " isn't transitively evicted, at least one caller was not evicted");
                    }
                }
            }
        }
    }

    public final void fetchDependencies(VisitNode visitNode, String str, Set<String> set, boolean z) {
        checkInterrupted();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (visitNode.getParent() != null) {
            Message.verbose("== resolving dependencies " + visitNode.getParent().getId() + "->" + visitNode.getId() + " [" + visitNode.getParentConf() + "->" + str + "]");
        } else {
            Message.verbose("== resolving dependencies for " + visitNode.getId() + " [" + str + "]");
        }
        ResolveData data = visitNode.getNode().getData();
        VisitNode currentVisitNode = data.getCurrentVisitNode();
        data.setCurrentVisitNode(visitNode);
        DependencyDescriptor dependencyDescriptor = visitNode.getDependencyDescriptor();
        VersionMatcher versionMatcher = visitNode.getNode().getData().getSettings().getVersionMatcher();
        if (dependencyDescriptor != null && (visitNode.getRoot() != visitNode.getParent() || !versionMatcher.isDynamic(dependencyDescriptor.getDependencyRevisionId()))) {
            resolveConflict(visitNode, str);
        }
        int i = 0;
        if (visitNode.loadData(str, z)) {
            resolveConflict(visitNode, str);
            if (!visitNode.isEvicted() && !visitNode.isCircular()) {
                String[] realConfs = visitNode.getRealConfs(str);
                int length = realConfs.length;
                while (i < length) {
                    doFetchDependencies(visitNode, realConfs[i], set);
                    i++;
                }
            }
        } else if (!visitNode.hasProblem() && !visitNode.isEvicted() && !visitNode.isCircular()) {
            String[] realConfs2 = visitNode.getRealConfs(str);
            int length2 = realConfs2.length;
            while (i < length2) {
                doFetchDependencies(visitNode, realConfs2[i], set);
                i++;
            }
        }
        if (visitNode.isEvicted()) {
            IvyNodeEviction.EvictionData evictedData = visitNode.getEvictedData();
            if (evictedData.getSelected() != null) {
                for (IvyNode ivyNode : evictedData.getSelected()) {
                    if (!ivyNode.isLoaded()) {
                        ivyNode.updateConfsToFetch(Collections.singleton(str));
                    } else {
                        fetchDependencies(visitNode.gotoNode(ivyNode), str, set, true);
                    }
                }
            }
        }
        if (this.settings.debugConflictResolution()) {
            Message.debug(visitNode.getId() + " => dependencies resolved in " + str + " (" + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms)");
        }
        data.setCurrentVisitNode(currentVisitNode);
    }

    public final void doFetchDependencies(VisitNode visitNode, String str, Set<String> set) {
        boolean z;
        Configuration configuration = visitNode.getConfiguration(str);
        if (configuration == null) {
            if (visitNode.isConfRequiredByMergedUsageOnly(str)) {
                return;
            }
            Message.warn("configuration not found '" + str + "' in " + visitNode.getResolvedId() + ": ignoring");
            if (visitNode.getParent() != null) {
                Message.warn("it was required from " + visitNode.getParent().getResolvedId());
                return;
            }
            return;
        }
        if (visitNode.getRequestedConf() == null) {
            visitNode.setRequestedConf(str);
            z = true;
        } else {
            z = false;
        }
        String[] strArr = configuration.getExtends();
        if (strArr.length > 0) {
            visitNode.updateConfsToFetch(Arrays.asList(strArr));
        }
        for (String str2 : strArr) {
            fetchDependencies(visitNode, str2, set, false);
        }
        if (!isDependenciesFetched(visitNode.getNode(), str, set) && visitNode.isTransitive()) {
            for (VisitNode visitNode2 : visitNode.getDependencies(str)) {
                visitNode2.useRealNode();
                for (String str3 : visitNode2.getRequiredConfigurations(visitNode, str)) {
                    fetchDependencies(visitNode2, str3, set, true);
                }
                if (!visitNode2.isEvicted() && !visitNode2.hasProblem()) {
                    for (String str4 : visitNode2.getConfsToFetch()) {
                        fetchDependencies(visitNode2, str4, set, false);
                    }
                }
            }
            markDependenciesFetched(visitNode.getNode(), str, set);
        }
        if (z) {
            visitNode.setRequestedConf(null);
        }
    }

    public final boolean isDependenciesFetched(IvyNode ivyNode, String str, Set<String> set) {
        return set.contains(getDependenciesFetchedKey(ivyNode, str));
    }

    public final void markDependenciesFetched(IvyNode ivyNode, String str, Set<String> set) {
        set.add(getDependenciesFetchedKey(ivyNode, str));
    }

    public final String getDependenciesFetchedKey(IvyNode ivyNode, String str) {
        ModuleRevisionId resolvedId = ivyNode.getResolvedId();
        return resolvedId.getOrganisation() + "|" + resolvedId.getName() + "|" + resolvedId.getRevision() + "|" + str;
    }

    public final void resolveConflict(VisitNode visitNode, String str) {
        resolveConflict(visitNode, visitNode.getParent(), str, Collections.emptySet());
    }

    public final boolean resolveConflict(VisitNode visitNode, VisitNode visitNode2, String str, Collection<IvyNode> collection) {
        boolean zResolveConflict = true;
        if (visitNode2 != null && visitNode != visitNode2) {
            if (checkConflictSolvedEvicted(visitNode, visitNode2)) {
                return true;
            }
            boolean zDebugConflictResolution = this.settings.debugConflictResolution();
            if (checkConflictSolvedSelected(visitNode, visitNode2)) {
                if (!resolveConflict(visitNode, visitNode2.getParent(), str, collection)) {
                    return false;
                }
                IvyNodeEviction.EvictionData evictionDataInRoot = visitNode.getEvictionDataInRoot(visitNode.getRootModuleConf(), visitNode2);
                if (evictionDataInRoot != null) {
                    if (zDebugConflictResolution) {
                        Message.debug(visitNode + " was previously evicted in root module conf " + visitNode.getRootModuleConf());
                    }
                    visitNode.markEvicted(evictionDataInRoot);
                    if (zDebugConflictResolution) {
                        Message.debug("evicting " + visitNode + " by " + evictionDataInRoot);
                    }
                }
                return true;
            }
            Set<IvyNode> resolvedNodes = visitNode2.getNode().getResolvedNodes(visitNode.getModuleId(), visitNode.getRootModuleConf());
            resolvedNodes.addAll(visitNode2.getNode().getPendingConflicts(visitNode.getRootModuleConf(), visitNode.getModuleId()));
            Collection<IvyNode> collectionComputeConflicts = computeConflicts(visitNode, visitNode2, str, collection, resolvedNodes);
            ConflictManager conflictManager = null;
            for (VisitNode visitNode3 : visitNode2.getPath()) {
                ModuleDescriptor descriptor = visitNode3.getNode().getDescriptor();
                if (descriptor == null) {
                    throw new IllegalStateException("impossible to get conflict manager when data has not been loaded. IvyNode = " + visitNode3.getNode());
                }
                conflictManager = descriptor.getConflictManager(visitNode.getModuleId());
                if (conflictManager != null) {
                    break;
                }
            }
            if (conflictManager == null) {
                conflictManager = this.settings.getConflictManager(visitNode.getModuleId());
            }
            Collection<IvyNode> collectionResolveConflicts = resolveConflicts(visitNode, visitNode2, collectionComputeConflicts, conflictManager);
            if (collectionResolveConflicts == null) {
                if (zDebugConflictResolution) {
                    Message.debug("impossible to resolve conflicts for " + visitNode + " in " + visitNode2 + " yet");
                    StringBuilder sb = new StringBuilder();
                    sb.append("setting all nodes as pending conflicts for later conflict resolution: ");
                    sb.append(collectionComputeConflicts);
                    Message.debug(sb.toString());
                }
                visitNode2.getNode().setPendingConflicts(visitNode.getModuleId(), visitNode.getRootModuleConf(), collectionComputeConflicts);
                return false;
            }
            if (zDebugConflictResolution) {
                Message.debug("selected revisions for " + visitNode + " in " + visitNode2 + ": " + collectionResolveConflicts);
            }
            if (collectionResolveConflicts.contains(visitNode.getNode())) {
                resolvedNodes.removeAll(collectionResolveConflicts);
                for (IvyNode ivyNode : resolvedNodes) {
                    ivyNode.markEvicted(visitNode.getRootModuleConf(), visitNode2.getNode(), conflictManager, collectionResolveConflicts);
                    if (zDebugConflictResolution) {
                        Message.debug("evicting " + ivyNode + " by " + ivyNode.getEvictedData(visitNode.getRootModuleConf()));
                    }
                }
                visitNode2.getNode().setResolvedNodes(visitNode.getModuleId(), visitNode.getRootModuleConf(), collectionResolveConflicts);
                HashSet hashSet = new HashSet(visitNode2.getNode().getEvictedNodes(visitNode.getModuleId(), visitNode.getRootModuleConf()));
                hashSet.removeAll(collectionResolveConflicts);
                hashSet.addAll(resolvedNodes);
                visitNode2.getNode().setEvictedNodes(visitNode.getModuleId(), visitNode.getRootModuleConf(), hashSet);
                visitNode2.getNode().setPendingConflicts(visitNode.getModuleId(), visitNode.getRootModuleConf(), Collections.emptySet());
                return resolveConflict(visitNode, visitNode2.getParent(), str, resolvedNodes);
            }
            if (collectionResolveConflicts.isEmpty() && zDebugConflictResolution) {
                Message.verbose("conflict manager '" + conflictManager + "' evicted all revisions among " + collectionComputeConflicts);
            }
            HashSet hashSet2 = new HashSet(visitNode2.getNode().getEvictedNodes(visitNode.getModuleId(), visitNode.getRootModuleConf()));
            collection.removeAll(collectionResolveConflicts);
            hashSet2.removeAll(collectionResolveConflicts);
            hashSet2.addAll(collection);
            hashSet2.add(visitNode.getNode());
            visitNode2.getNode().setEvictedNodes(visitNode.getModuleId(), visitNode.getRootModuleConf(), hashSet2);
            visitNode2.getNode().setPendingConflicts(visitNode.getModuleId(), visitNode.getRootModuleConf(), Collections.emptySet());
            visitNode.markEvicted(visitNode2, conflictManager, collectionResolveConflicts);
            if (zDebugConflictResolution) {
                Message.debug("evicting " + visitNode + " by " + visitNode.getEvictedData());
            }
            Set<IvyNode> resolvedNodes2 = visitNode2.getNode().getResolvedNodes(visitNode.getModuleId(), visitNode.getRootModuleConf());
            if (!resolvedNodes2.equals(collectionResolveConflicts)) {
                visitNode2.getNode().setResolvedNodes(visitNode.getModuleId(), visitNode.getRootModuleConf(), collectionResolveConflicts);
                for (IvyNode ivyNode2 : collectionResolveConflicts) {
                    if (!resolvedNodes2.contains(ivyNode2)) {
                        zResolveConflict = resolveConflict(visitNode.gotoNode(ivyNode2), visitNode2.getParent(), str, collection) & zResolveConflict;
                    }
                }
            }
        }
        return zResolveConflict;
    }

    public final Collection<IvyNode> resolveConflicts(VisitNode visitNode, VisitNode visitNode2, Collection<IvyNode> collection, ConflictManager conflictManager) {
        if (visitNode.getParent() != visitNode2 && conflictManager == this.settings.getConflictManager(visitNode.getModuleId()) && visitNode.getParent().getNode().getResolvedNodes(visitNode.getModuleId(), visitNode.getRootModuleConf()).equals(collection)) {
            if (this.settings.debugConflictResolution()) {
                Message.debug("no new conflicting revisions for " + visitNode + " in " + visitNode2 + ": " + collection);
            }
            return collection;
        }
        if (this.settings.debugConflictResolution()) {
            Message.debug("found conflicting revisions for " + visitNode + " in " + visitNode2 + ": " + collection);
        }
        return conflictManager.resolveConflicts(visitNode2.getNode(), collection);
    }

    public final Collection<IvyNode> computeConflicts(VisitNode visitNode, VisitNode visitNode2, String str, Collection<IvyNode> collection, Collection<IvyNode> collection2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(visitNode.getNode());
        if (collection2.removeAll(collection) || (collection2.isEmpty() && !visitNode.getParent().getNode().equals(visitNode2.getNode()))) {
            ResolveData resolveData = IvyContext.getContext().getResolveData();
            VisitNode currentVisitNode = resolveData.getCurrentVisitNode();
            resolveData.setCurrentVisitNode(visitNode2);
            try {
                for (IvyNode ivyNode : visitNode2.getNode().getDependencies(visitNode.getRootModuleConf(), visitNode2.getNode().getConfigurations(visitNode.getRootModuleConf()), visitNode2.getRequestedConf())) {
                    if (ivyNode.getModuleId().equals(visitNode.getModuleId())) {
                        linkedHashSet.add(ivyNode);
                    }
                    linkedHashSet.addAll(ivyNode.getResolvedNodes(visitNode.getModuleId(), visitNode.getRootModuleConf()));
                }
                resolveData.setCurrentVisitNode(currentVisitNode);
            } catch (Throwable th) {
                resolveData.setCurrentVisitNode(currentVisitNode);
                throw th;
            }
        } else if (collection2.isEmpty()) {
            VisitNode parent = visitNode.getParent();
            for (IvyNode ivyNode2 : parent.getNode().getDependencies(visitNode.getRootModuleConf(), parent.getNode().getConfigurations(visitNode.getRootModuleConf()), parent.getRequestedConf())) {
                if (ivyNode2.getModuleId().equals(visitNode.getModuleId())) {
                    linkedHashSet.add(ivyNode2);
                }
            }
        } else {
            linkedHashSet.addAll(collection2);
        }
        return linkedHashSet;
    }

    public final boolean checkConflictSolvedSelected(VisitNode visitNode, VisitNode visitNode2) {
        if (!visitNode2.getResolvedRevisions(visitNode.getModuleId()).contains(visitNode.getResolvedId())) {
            return false;
        }
        if (!this.settings.debugConflictResolution()) {
            return true;
        }
        Message.debug("conflict resolution already done for " + visitNode + " in " + visitNode2);
        return true;
    }

    public final boolean checkConflictSolvedEvicted(VisitNode visitNode, VisitNode visitNode2) {
        if (!visitNode2.getEvictedRevisions(visitNode.getModuleId()).contains(visitNode.getResolvedId())) {
            return false;
        }
        if (!this.settings.debugConflictResolution()) {
            return true;
        }
        Message.debug("conflict resolution already done for " + visitNode + " in " + visitNode2);
        return true;
    }

    public ResolvedModuleRevision findModule(ModuleRevisionId moduleRevisionId, ResolveOptions resolveOptions) {
        DependencyResolver resolver = this.settings.getResolver(moduleRevisionId);
        if (resolver == null) {
            throw new IllegalStateException("no resolver found for " + moduleRevisionId.getModuleId());
        }
        DefaultModuleDescriptor defaultModuleDescriptorNewCallerInstance = DefaultModuleDescriptor.newCallerInstance(moduleRevisionId, new String[]{"*"}, false, false);
        if (resolveOptions.getResolveId() == null) {
            resolveOptions.setResolveId(ResolveOptions.getDefaultResolveId(defaultModuleDescriptorNewCallerInstance));
        }
        try {
            return resolver.getDependency(new DefaultDependencyDescriptor(moduleRevisionId, true), new ResolveData(this, resolveOptions, new ConfigurationResolveReport(this, defaultModuleDescriptorNewCallerInstance, "default", null, resolveOptions)));
        } catch (ParseException e) {
            throw new RuntimeException("problem while parsing repository module descriptor for " + moduleRevisionId + ": " + e, e);
        }
    }

    public DependencyDescriptor mediate(DependencyDescriptor dependencyDescriptor, ResolveOptions resolveOptions) {
        String resolveMode;
        if (dependencyDescriptor == null) {
            return null;
        }
        if (resolveOptions.getResolveMode() == null) {
            resolveMode = this.settings.getResolveMode(dependencyDescriptor.getDependencyId());
        } else {
            resolveMode = resolveOptions.getResolveMode();
        }
        return (!ResolveOptions.RESOLVEMODE_DYNAMIC.equals(resolveMode) || dependencyDescriptor.getDynamicConstraintDependencyRevisionId().equals(dependencyDescriptor.getDependencyRevisionId())) ? dependencyDescriptor : dependencyDescriptor.clone(ModuleRevisionId.newInstance(dependencyDescriptor.getDynamicConstraintDependencyRevisionId(), dependencyDescriptor.getDynamicConstraintDependencyRevisionId().getRevision()));
    }

    public EventManager getEventManager() {
        return this.eventManager;
    }

    public ResolveEngineSettings getSettings() {
        return this.settings;
    }

    public SortEngine getSortEngine() {
        return this.sortEngine;
    }

    public final void checkInterrupted() {
        IvyContext.getContext().getIvy().checkInterrupted();
    }
}
