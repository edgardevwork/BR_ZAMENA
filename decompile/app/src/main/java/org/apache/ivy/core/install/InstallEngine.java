package org.apache.ivy.core.install;

import java.util.Arrays;
import java.util.Date;
import org.apache.ivy.core.cache.ArtifactOrigin;
import org.apache.ivy.core.module.descriptor.Configuration;
import org.apache.ivy.core.module.descriptor.DefaultDependencyDescriptor;
import org.apache.ivy.core.module.descriptor.DefaultModuleDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.report.ArtifactDownloadReport;
import org.apache.ivy.core.report.MetadataArtifactDownloadReport;
import org.apache.ivy.core.report.ResolveReport;
import org.apache.ivy.core.resolve.DownloadOptions;
import org.apache.ivy.core.resolve.IvyNode;
import org.apache.ivy.core.resolve.ResolveEngine;
import org.apache.ivy.core.resolve.ResolveOptions;
import org.apache.ivy.core.search.SearchEngine;
import org.apache.ivy.plugins.conflict.NoConflictManager;
import org.apache.ivy.plugins.matcher.ExactPatternMatcher;
import org.apache.ivy.plugins.matcher.MatcherHelper;
import org.apache.ivy.plugins.matcher.PatternMatcher;
import org.apache.ivy.plugins.resolver.DependencyResolver;
import org.apache.ivy.util.Message;

/* loaded from: classes7.dex */
public class InstallEngine {
    public ResolveEngine resolveEngine;
    public SearchEngine searchEngine;
    public InstallEngineSettings settings;

    public InstallEngine(InstallEngineSettings installEngineSettings, SearchEngine searchEngine, ResolveEngine resolveEngine) {
        this.settings = installEngineSettings;
        this.searchEngine = searchEngine;
        this.resolveEngine = resolveEngine;
    }

    public ResolveReport install(ModuleRevisionId moduleRevisionId, String str, String str2, InstallOptions installOptions) throws Throwable {
        boolean z;
        DependencyResolver dependencyResolver;
        String str3;
        DependencyResolver dependencyResolver2;
        boolean z2;
        DependencyResolver dependencyResolver3;
        int i;
        int i2;
        String[] strArr;
        DefaultModuleDescriptor defaultModuleDescriptor;
        String str4;
        DependencyResolver dependencyResolver4;
        String str5;
        String str6 = ".original";
        DependencyResolver resolver = this.settings.getResolver(str);
        DependencyResolver resolver2 = this.settings.getResolver(str2);
        if (resolver == null) {
            throw new IllegalArgumentException("unknown resolver " + str + ". Available resolvers are: " + this.settings.getResolverNames());
        }
        if (resolver2 == null) {
            throw new IllegalArgumentException("unknown resolver " + str2 + ". Available resolvers are: " + this.settings.getResolverNames());
        }
        PatternMatcher matcher = this.settings.getMatcher(installOptions.getMatcherName());
        if (matcher == null) {
            throw new IllegalArgumentException("unknown matcher " + installOptions.getMatcherName() + ". Available matchers are: " + this.settings.getMatcherNames());
        }
        Message.info(":: installing " + moduleRevisionId + " ::");
        DependencyResolver dictatorResolver = this.resolveEngine.getDictatorResolver();
        boolean zLogNotConvertedExclusionRule = this.settings.logNotConvertedExclusionRule();
        try {
            this.settings.setLogNotConvertedExclusionRule(true);
            this.resolveEngine.setDictatorResolver(resolver);
            DefaultModuleDescriptor defaultModuleDescriptor2 = new DefaultModuleDescriptor(ModuleRevisionId.newInstance("apache", "ivy-install", "1.0"), this.settings.getStatusManager().getDefaultStatus(), new Date());
            String defaultResolveId = ResolveOptions.getDefaultResolveId(defaultModuleDescriptor2);
            defaultModuleDescriptor2.addConfiguration(new Configuration("default"));
            defaultModuleDescriptor2.addConflictManager(new ModuleId("*", "*"), ExactPatternMatcher.INSTANCE, new NoConflictManager());
            String[] confs = installOptions.getConfs();
            int length = confs.length;
            int i3 = 0;
            while (i3 < length) {
                try {
                    String str7 = defaultResolveId;
                    String strTrim = confs[i3].trim();
                    if (MatcherHelper.isExact(matcher, moduleRevisionId)) {
                        i = i3;
                        i2 = length;
                        strArr = confs;
                        str4 = str6;
                        dependencyResolver4 = resolver2;
                        dependencyResolver3 = dictatorResolver;
                        str5 = str7;
                        DefaultModuleDescriptor defaultModuleDescriptor3 = defaultModuleDescriptor2;
                        z2 = zLogNotConvertedExclusionRule;
                        try {
                            DefaultDependencyDescriptor defaultDependencyDescriptor = new DefaultDependencyDescriptor(defaultModuleDescriptor2, moduleRevisionId, false, false, installOptions.isTransitive());
                            defaultDependencyDescriptor.addDependencyConfiguration("default", strTrim);
                            defaultModuleDescriptor = defaultModuleDescriptor3;
                            defaultModuleDescriptor.addDependency(defaultDependencyDescriptor);
                        } catch (Throwable th) {
                            th = th;
                            dependencyResolver = dependencyResolver3;
                            z = z2;
                            Message.sumupProblems();
                            this.resolveEngine.setDictatorResolver(dependencyResolver);
                            this.settings.setLogNotConvertedExclusionRule(z);
                            throw th;
                        }
                    } else {
                        i = i3;
                        i2 = length;
                        strArr = confs;
                        defaultModuleDescriptor = defaultModuleDescriptor2;
                        z2 = zLogNotConvertedExclusionRule;
                        str4 = str6;
                        dependencyResolver4 = resolver2;
                        dependencyResolver3 = dictatorResolver;
                        str5 = str7;
                        for (ModuleRevisionId moduleRevisionId2 : this.searchEngine.listModules(resolver, moduleRevisionId, matcher)) {
                            Message.info("\tfound " + moduleRevisionId2 + " to install: adding to the list");
                            DefaultDependencyDescriptor defaultDependencyDescriptor2 = new DefaultDependencyDescriptor(defaultModuleDescriptor, moduleRevisionId2, false, false, installOptions.isTransitive());
                            defaultDependencyDescriptor2.addDependencyConfiguration("default", strTrim);
                            defaultModuleDescriptor.addDependency(defaultDependencyDescriptor2);
                        }
                    }
                    defaultModuleDescriptor2 = defaultModuleDescriptor;
                    i3 = i + 1;
                    defaultResolveId = str5;
                    length = i2;
                    confs = strArr;
                    dictatorResolver = dependencyResolver3;
                    str6 = str4;
                    resolver2 = dependencyResolver4;
                    zLogNotConvertedExclusionRule = z2;
                } catch (Throwable th2) {
                    th = th2;
                    z2 = zLogNotConvertedExclusionRule;
                    dependencyResolver3 = dictatorResolver;
                }
            }
            DefaultModuleDescriptor defaultModuleDescriptor4 = defaultModuleDescriptor2;
            boolean z3 = zLogNotConvertedExclusionRule;
            String str8 = str6;
            DependencyResolver dependencyResolver5 = resolver2;
            DependencyResolver dependencyResolver6 = dictatorResolver;
            String str9 = defaultResolveId;
            ResolveReport resolveReport = new ResolveReport(defaultModuleDescriptor4, str9);
            Message.info(":: resolving dependencies ::");
            ResolveOptions validate = new ResolveOptions().setResolveId(str9).setConfs(new String[]{"default"}).setValidate(installOptions.isValidate());
            IvyNode[] dependencies = this.resolveEngine.getDependencies(defaultModuleDescriptor4, validate, resolveReport);
            resolveReport.setDependencies(Arrays.asList(dependencies), installOptions.getArtifactFilter());
            Message.info(":: downloading artifacts to cache ::");
            this.resolveEngine.downloadArtifacts(resolveReport, installOptions.getArtifactFilter(), new DownloadOptions());
            Message.info(":: installing in " + str2 + " ::");
            int length2 = dependencies.length;
            int i4 = 0;
            while (i4 < length2) {
                IvyNode ivyNode = dependencies[i4];
                ModuleDescriptor descriptor = ivyNode.getDescriptor();
                if (descriptor != null) {
                    ModuleRevisionId moduleRevisionId3 = descriptor.getModuleRevisionId();
                    Message.verbose("installing " + moduleRevisionId3);
                    try {
                        dependencyResolver2 = dependencyResolver5;
                        try {
                            dependencyResolver2.beginPublishTransaction(moduleRevisionId3, installOptions.isOverwrite());
                            for (ArtifactDownloadReport artifactDownloadReport : resolveReport.getArtifactsReports(moduleRevisionId3)) {
                                if (artifactDownloadReport.getLocalFile() != null) {
                                    dependencyResolver2.publish(artifactDownloadReport.getArtifact(), artifactDownloadReport.getLocalFile(), installOptions.isOverwrite());
                                }
                            }
                            MetadataArtifactDownloadReport report = ivyNode.getModuleRevision().getReport();
                            dependencyResolver2.publish(descriptor.getMetadataArtifact(), report.getLocalFile(), installOptions.isOverwrite());
                            if (!installOptions.isInstallOriginalMetadata() || report.getArtifactOrigin() == null || !report.getArtifactOrigin().isExists() || ArtifactOrigin.isUnknown(report.getArtifactOrigin()) || report.getArtifactOrigin().getArtifact() == null) {
                                str3 = str8;
                            } else {
                                str3 = str8;
                                if (report.getArtifactOrigin().getArtifact().getType().endsWith(str3)) {
                                    if (!report.getArtifactOrigin().getArtifact().getType().equals(descriptor.getMetadataArtifact().getType() + str3)) {
                                        dependencyResolver2.publish(report.getArtifactOrigin().getArtifact(), report.getOriginalLocalFile(), installOptions.isOverwrite());
                                    }
                                }
                            }
                            dependencyResolver2.commitPublishTransaction();
                        } catch (Throwable th3) {
                            th = th3;
                            dependencyResolver2.abortPublishTransaction();
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        dependencyResolver2 = dependencyResolver5;
                    }
                } else {
                    str3 = str8;
                    dependencyResolver2 = dependencyResolver5;
                }
                i4++;
                str8 = str3;
                dependencyResolver5 = dependencyResolver2;
            }
            Message.info(":: install resolution report ::");
            this.resolveEngine.outputReport(resolveReport, this.settings.getResolutionCacheManager(), validate);
            Message.sumupProblems();
            this.resolveEngine.setDictatorResolver(dependencyResolver6);
            this.settings.setLogNotConvertedExclusionRule(z3);
            return resolveReport;
        } catch (Throwable th5) {
            th = th5;
            z = zLogNotConvertedExclusionRule;
            dependencyResolver = dictatorResolver;
        }
    }
}
