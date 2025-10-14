package org.apache.ivy.plugins.version;

import java.util.Comparator;
import org.apache.commons.compress.java.util.jar.Pack200;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.module.status.Status;
import org.apache.ivy.core.module.status.StatusManager;

/* loaded from: classes5.dex */
public class LatestVersionMatcher extends AbstractVersionMatcher {
    @Override // org.apache.ivy.plugins.version.VersionMatcher
    public boolean accept(ModuleRevisionId moduleRevisionId, ModuleRevisionId moduleRevisionId2) {
        return true;
    }

    public LatestVersionMatcher() {
        super(Pack200.Packer.LATEST);
    }

    @Override // org.apache.ivy.plugins.version.VersionMatcher
    public boolean isDynamic(ModuleRevisionId moduleRevisionId) {
        return moduleRevisionId.getRevision().startsWith("latest.");
    }

    @Override // org.apache.ivy.plugins.version.AbstractVersionMatcher, org.apache.ivy.plugins.version.VersionMatcher
    public boolean needModuleDescriptor(ModuleRevisionId moduleRevisionId, ModuleRevisionId moduleRevisionId2) {
        Status status = StatusManager.getCurrent().getStatuses().get(r4.size() - 1);
        return !("latest." + status.getName()).equals(moduleRevisionId.getRevision());
    }

    @Override // org.apache.ivy.plugins.version.AbstractVersionMatcher, org.apache.ivy.plugins.version.VersionMatcher
    public boolean accept(ModuleRevisionId moduleRevisionId, ModuleDescriptor moduleDescriptor) {
        boolean zEquals;
        String branch = moduleRevisionId.getBranch();
        String branch2 = moduleDescriptor.getModuleRevisionId().getBranch();
        if (branch == null) {
            zEquals = branch2 == null;
        } else {
            zEquals = branch.equals(branch2);
        }
        if (zEquals) {
            return StatusManager.getCurrent().getPriority(moduleRevisionId.getRevision().substring(7)) >= StatusManager.getCurrent().getPriority(moduleDescriptor.getStatus());
        }
        return false;
    }

    @Override // org.apache.ivy.plugins.version.AbstractVersionMatcher, org.apache.ivy.plugins.version.VersionMatcher
    public int compare(ModuleRevisionId moduleRevisionId, ModuleRevisionId moduleRevisionId2, Comparator<ModuleRevisionId> comparator) {
        return !needModuleDescriptor(moduleRevisionId, moduleRevisionId2) ? 1 : 0;
    }
}
