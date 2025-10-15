package org.apache.ivy.ant;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.ivy.core.module.descriptor.Configuration;
import org.apache.ivy.core.module.descriptor.DefaultModuleDescriptor;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.report.ResolveReport;
import org.apache.ivy.core.resolve.IvyNode;
import org.apache.ivy.core.resolve.ResolveOptions;
import org.apache.ivy.util.StringUtils;
import org.apache.tools.ant.BuildException;

/* loaded from: classes8.dex */
public class IvyDependencyUpdateChecker extends IvyPostResolveTask {
    public String revisionToCheck = "latest.integration";
    public boolean download = false;
    public boolean checkIfChanged = false;
    public boolean showTransitive = false;

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    @Override // org.apache.ivy.ant.IvyTask
    public void doExecute() throws BuildException {
        prepareAndCheck();
        ModuleDescriptor moduleDescriptor = getResolvedReport().getModuleDescriptor();
        DefaultModuleDescriptor defaultModuleDescriptor = new DefaultModuleDescriptor(moduleDescriptor.getModuleRevisionId(), moduleDescriptor.getStatus(), moduleDescriptor.getPublicationDate());
        for (Configuration configuration : moduleDescriptor.getConfigurations()) {
            defaultModuleDescriptor.addConfiguration(configuration);
        }
        for (DependencyDescriptor dependencyDescriptor : moduleDescriptor.getDependencies()) {
            defaultModuleDescriptor.addDependency(dependencyDescriptor.clone(ModuleRevisionId.newInstance(dependencyDescriptor.getDependencyRevisionId(), this.revisionToCheck)));
        }
        ResolveOptions resolveOptions = new ResolveOptions();
        resolveOptions.setDownload(isDownload());
        resolveOptions.setLog(getLog());
        resolveOptions.setConfs(StringUtils.splitToArray(getConf()));
        resolveOptions.setCheckIfChanged(this.checkIfChanged);
        try {
            ResolveReport resolveReportResolve = getIvyInstance().getResolveEngine().resolve(defaultModuleDescriptor, resolveOptions);
            displayDependencyUpdates(getResolvedReport(), resolveReportResolve);
            if (this.showTransitive) {
                displayNewDependencyOnLatest(getResolvedReport(), resolveReportResolve);
                displayMissingDependencyOnLatest(getResolvedReport(), resolveReportResolve);
            }
        } catch (IOException | ParseException e) {
            throw new BuildException("impossible to resolve dependencies:\n\t" + e, e);
        }
    }

    public final void displayDependencyUpdates(ResolveReport resolveReport, ResolveReport resolveReport2) {
        log("Dependencies updates available :");
        boolean z = false;
        for (IvyNode ivyNode : resolveReport2.getDependencies()) {
            for (IvyNode ivyNode2 : resolveReport.getDependencies()) {
                if (ivyNode2.getModuleId().equals(ivyNode.getModuleId()) && !ivyNode2.getResolvedId().getRevision().equals(ivyNode.getResolvedId().getRevision())) {
                    boolean z2 = ivyNode.getDependencyDescriptor(ivyNode.getRoot()) == null;
                    if (!z2 || this.showTransitive) {
                        log(String.format("\t%s#%s%s\t%s -> %s", ivyNode2.getResolvedId().getOrganisation(), ivyNode2.getResolvedId().getName(), z2 ? " (transitive)" : "", ivyNode2.getResolvedId().getRevision(), ivyNode.getResolvedId().getRevision()));
                        z = true;
                    }
                }
            }
        }
        if (z) {
            return;
        }
        log("\tAll dependencies are up to date");
    }

    public final void displayMissingDependencyOnLatest(ResolveReport resolveReport, ResolveReport resolveReport2) {
        ArrayList arrayList = new ArrayList();
        for (IvyNode ivyNode : resolveReport.getDependencies()) {
            Iterator<IvyNode> it = resolveReport2.getDependencies().iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (ivyNode.getModuleId().equals(it.next().getModuleId())) {
                    z = true;
                }
            }
            if (!z) {
                arrayList.add(ivyNode.getId());
            }
        }
        if (arrayList.size() > 0) {
            log("List of missing dependency on latest resolve :");
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                log("\t" + ((ModuleRevisionId) it2.next()).toString());
            }
        }
    }

    public final void displayNewDependencyOnLatest(ResolveReport resolveReport, ResolveReport resolveReport2) {
        ArrayList arrayList = new ArrayList();
        for (IvyNode ivyNode : resolveReport2.getDependencies()) {
            Iterator<IvyNode> it = resolveReport.getDependencies().iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (it.next().getModuleId().equals(ivyNode.getModuleId())) {
                    z = true;
                }
            }
            if (!z) {
                arrayList.add(ivyNode.getId());
            }
        }
        if (arrayList.size() > 0) {
            log("List of new dependency on latest resolve :");
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                log("\t" + ((ModuleRevisionId) it2.next()).toString());
            }
        }
    }

    public String getRevisionToCheck() {
        return this.revisionToCheck;
    }

    public void setRevisionToCheck(String str) {
        this.revisionToCheck = str;
    }

    public boolean isDownload() {
        return this.download;
    }

    public void setDownload(boolean z) {
        this.download = z;
    }

    public boolean isShowTransitive() {
        return this.showTransitive;
    }

    public void setShowTransitive(boolean z) {
        this.showTransitive = z;
    }

    public boolean isCheckIfChanged() {
        return this.checkIfChanged;
    }

    public void setCheckIfChanged(boolean z) {
        this.checkIfChanged = z;
    }
}
