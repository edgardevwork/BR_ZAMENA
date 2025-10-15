package org.apache.ivy.core.resolve;

import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.plugins.conflict.ConflictManager;
import org.apache.ivy.plugins.report.ReportOutputter;
import org.apache.ivy.plugins.resolver.DependencyResolver;
import org.apache.ivy.plugins.resolver.ResolverSettings;

/* loaded from: classes8.dex */
public interface ResolveEngineSettings extends ResolverSettings {
    boolean debugConflictResolution();

    ConflictManager getConflictManager(ModuleId moduleId);

    ReportOutputter[] getReportOutputters();

    String getResolverName(ModuleRevisionId moduleRevisionId);

    boolean logModuleWhenFound();

    boolean logNotConvertedExclusionRule();

    boolean logResolvedRevision();

    void setDictatorResolver(DependencyResolver dependencyResolver);
}
