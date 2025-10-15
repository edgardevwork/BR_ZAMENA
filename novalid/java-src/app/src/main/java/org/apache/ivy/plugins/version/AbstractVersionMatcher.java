package org.apache.ivy.plugins.version;

import java.util.Comparator;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.plugins.IvySettingsAware;
import org.apache.ivy.util.Checks;

/* loaded from: classes5.dex */
public abstract class AbstractVersionMatcher implements VersionMatcher, IvySettingsAware {
    public String name;
    public IvySettings settings;

    @Override // org.apache.ivy.plugins.version.VersionMatcher
    public int compare(ModuleRevisionId moduleRevisionId, ModuleRevisionId moduleRevisionId2, Comparator<ModuleRevisionId> comparator) {
        return 0;
    }

    @Override // org.apache.ivy.plugins.version.VersionMatcher
    public boolean needModuleDescriptor(ModuleRevisionId moduleRevisionId, ModuleRevisionId moduleRevisionId2) {
        return false;
    }

    public AbstractVersionMatcher() {
    }

    public AbstractVersionMatcher(String str) {
        this.name = str;
    }

    @Override // org.apache.ivy.plugins.version.VersionMatcher
    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    @Override // org.apache.ivy.plugins.version.VersionMatcher
    public boolean accept(ModuleRevisionId moduleRevisionId, ModuleDescriptor moduleDescriptor) {
        return accept(moduleRevisionId, moduleDescriptor.getResolvedModuleRevisionId());
    }

    public String toString() {
        return getName();
    }

    public IvySettings getSettings() {
        return this.settings;
    }

    @Override // org.apache.ivy.plugins.IvySettingsAware
    public void setSettings(IvySettings ivySettings) {
        Checks.checkNotNull(ivySettings, "settings");
        this.settings = ivySettings;
    }
}
