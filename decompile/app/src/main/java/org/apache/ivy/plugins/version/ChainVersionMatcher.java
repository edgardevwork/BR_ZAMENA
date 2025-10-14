package org.apache.ivy.plugins.version;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.plugins.IvySettingsAware;
import org.apache.ivy.util.Checks;

/* loaded from: classes5.dex */
public class ChainVersionMatcher extends AbstractVersionMatcher {
    public final List<VersionMatcher> matchers;

    public ChainVersionMatcher() {
        super("chain");
        this.matchers = new LinkedList();
    }

    public void add(VersionMatcher versionMatcher) {
        Checks.checkNotNull(versionMatcher, "matcher");
        this.matchers.add(0, versionMatcher);
        if (getSettings() == null || !(versionMatcher instanceof IvySettingsAware)) {
            return;
        }
        ((IvySettingsAware) versionMatcher).setSettings(getSettings());
    }

    @Override // org.apache.ivy.plugins.version.AbstractVersionMatcher, org.apache.ivy.plugins.IvySettingsAware
    public void setSettings(IvySettings ivySettings) {
        super.setSettings(ivySettings);
        for (VersionMatcher versionMatcher : this.matchers) {
            if (versionMatcher instanceof IvySettingsAware) {
                ((IvySettingsAware) versionMatcher).setSettings(ivySettings);
            }
        }
    }

    public List<VersionMatcher> getMatchers() {
        return Collections.unmodifiableList(this.matchers);
    }

    @Override // org.apache.ivy.plugins.version.VersionMatcher
    public boolean isDynamic(ModuleRevisionId moduleRevisionId) {
        Checks.checkNotNull(moduleRevisionId, "askedMrid");
        Iterator<VersionMatcher> it = this.matchers.iterator();
        while (it.hasNext()) {
            if (it.next().isDynamic(moduleRevisionId)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.ivy.plugins.version.AbstractVersionMatcher, org.apache.ivy.plugins.version.VersionMatcher
    public int compare(ModuleRevisionId moduleRevisionId, ModuleRevisionId moduleRevisionId2, Comparator<ModuleRevisionId> comparator) {
        Checks.checkNotNull(moduleRevisionId, "askedMrid");
        Checks.checkNotNull(moduleRevisionId2, "foundMrid");
        Checks.checkNotNull(comparator, "staticComparator");
        for (VersionMatcher versionMatcher : this.matchers) {
            if (versionMatcher.isDynamic(moduleRevisionId)) {
                return versionMatcher.compare(moduleRevisionId, moduleRevisionId2, comparator);
            }
        }
        throw new IllegalArgumentException("impossible to compare revisions: askedMrid is not dynamic: " + moduleRevisionId);
    }

    @Override // org.apache.ivy.plugins.version.VersionMatcher
    public boolean accept(ModuleRevisionId moduleRevisionId, ModuleRevisionId moduleRevisionId2) {
        Checks.checkNotNull(moduleRevisionId, "askedMrid");
        Checks.checkNotNull(moduleRevisionId2, "foundMrid");
        Iterator<VersionMatcher> it = this.matchers.iterator();
        while (it.hasNext()) {
            VersionMatcher next = it.next();
            if (!it.hasNext() || next.isDynamic(moduleRevisionId)) {
                return next.accept(moduleRevisionId, moduleRevisionId2);
            }
        }
        return false;
    }

    @Override // org.apache.ivy.plugins.version.AbstractVersionMatcher, org.apache.ivy.plugins.version.VersionMatcher
    public boolean needModuleDescriptor(ModuleRevisionId moduleRevisionId, ModuleRevisionId moduleRevisionId2) {
        Checks.checkNotNull(moduleRevisionId, "askedMrid");
        Checks.checkNotNull(moduleRevisionId2, "foundMrid");
        Iterator<VersionMatcher> it = this.matchers.iterator();
        while (it.hasNext()) {
            VersionMatcher next = it.next();
            if (!it.hasNext() || next.isDynamic(moduleRevisionId)) {
                return next.needModuleDescriptor(moduleRevisionId, moduleRevisionId2);
            }
        }
        return false;
    }

    @Override // org.apache.ivy.plugins.version.AbstractVersionMatcher, org.apache.ivy.plugins.version.VersionMatcher
    public boolean accept(ModuleRevisionId moduleRevisionId, ModuleDescriptor moduleDescriptor) {
        Checks.checkNotNull(moduleRevisionId, "askedMrid");
        Checks.checkNotNull(moduleDescriptor, "foundMD");
        Iterator<VersionMatcher> it = this.matchers.iterator();
        while (it.hasNext()) {
            VersionMatcher next = it.next();
            if (!it.hasNext() || next.isDynamic(moduleRevisionId)) {
                return next.accept(moduleRevisionId, moduleDescriptor);
            }
        }
        return false;
    }
}
